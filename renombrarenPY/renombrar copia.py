import os
import re


def renombrar_archivos():
    # Obtener el directorio actual donde se encuentra el script
    directorio_actual = os.getcwd()

    # Obtener la lista de archivos en el directorio actual que contienen un número en el nombre
    archivos = [
        archivo
        for archivo in os.listdir(directorio_actual)
        if any(char.isdigit() for char in archivo)
    ]

    if not archivos:
        print("No hay archivos con un número en el nombre en la carpeta actual.")
        return

    # Renombrar los archivos con el número al principio y eliminar contenido desde "video" hasta ".mp4"
    for i, archivo in enumerate(archivos, start=1):
        # Utilizar expresión regular para encontrar el número en el nombre del archivo
        match = re.search(r"\b(\d+)", archivo, re.IGNORECASE | re.UNICODE)

        if match:
            numero = match.group(1).zfill(3)

            # Construir el nuevo nombre conservando solo el contenido antes del número
            contenido_previo = archivo.split(match.group(0))[0].strip()
            nuevo_nombre = (
                f"{numero}-{contenido_previo}.{archivo.split('.')[-1].strip()}"
            )

            # Eliminar desde "video" hasta ".mp4" del nuevo nombre
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


# Llamar a la función para renombrar los archivos
renombrar_archivos()
