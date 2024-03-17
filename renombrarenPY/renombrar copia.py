import os
import re


def renombrar_archivos():

    directorio_actual = os.getcwd()

    archivos = [
        archivo
        for archivo in os.listdir(directorio_actual)
        if any(char.isdigit() for char in archivo)
    ]

    if not archivos:
        print("No hay archivos con un número en el nombre en la carpeta actual.")
        return


    for i, archivo in enumerate(archivos, start=1):

        match = re.search(r"\b(\d+)", archivo, re.IGNORECASE | re.UNICODE)

        if match:
            numero = match.group(1).zfill(3)

            contenido_previo = archivo.split(match.group(0))[0].strip()
            nuevo_nombre = (
                f"{numero}-{contenido_previo}.{archivo.split('.')[-1].strip()}"
            )

            nuevo_nombre = re.sub(
                r"video.*\.mp4", ".mp4", nuevo_nombre, flags=re.IGNORECASE
            )

            ruta_archivo = os.path.join(directorio_actual, archivo)
            ruta_nuevo_archivo = os.path.join(directorio_actual, nuevo_nombre)

            try:
                os.rename(ruta_archivo, ruta_nuevo_archivo)
                print(f"Archivo renombrado: {ruta_archivo} -> {ruta_nuevo_archivo}")
            except Exception as e:
                print(f"Error al intentar renombrar el archivo {archivo}: {e}")



renombrar_archivos()
