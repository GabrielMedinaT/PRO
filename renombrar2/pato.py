import os

elPato = [
    "patito",
    "patete",
    "patillo",
    "patazo",
    "paton",
    "patico",
    "patuco",
    "patote",
    "patín",
    "patalón",
    "patalete",
    "patanegra",
    "patuleco",
    "patuleta",
    "patiquín",
    "patifuso",
    "patiblanco",
    "patiamarillo",
    "patirojo",
    "pativerde",
    "patiazul",
    "patigris",
    "patianaranjado",
    "patimorado",
    "patirrosado",
    "patilila",
    "patidorado",
    "paticeleste",
    "patiblanco",
    "patinegro",
    "patimarrón",
    "patipúrpura",
    "paticarmesí",
    "patianil",
    "patiescarlata",
    "patiancho",
    "patirrayado",
    "pativariado",
    "patisalmonado",
    "patiburdeo",
    "patifucsia",
    "patimagenta",
    "patiocre",
    "patibronce",
    "patiplata",
    "patioro",
    "patiemerald",
    "patidiamante",
    "patiámbar",
    "patiburbuja",
    "patilente",
    "patieléctrico",
    "patiradioactivo",
    "patiluminiscente",
    "patifosforescente",
    "patiincandescente",
    "patitransparente",
    "patirreflectante",
    "patinebuloso",
    "patigravitacional",
]


def renombrar_archivos():
    # Obtener el directorio actual donde se encuentra el script
    directorio_actual = os.getcwd()

    # Obtener la lista de archivos en el directorio actual
    archivos = os.listdir(directorio_actual)

    if not archivos:
        print("No hay archivos en la carpeta actual.")
        return

    try:
        # Crear un archivo de texto para almacenar la información de renombrado
        with open("informe_renombrado.txt", "w") as informe:
            # Renombrar todos los archivos
            for archivo in archivos:
                # Construir el nuevo nombre con "pato" y la extensión original
                nuevo_nombre = f"pato.{archivo.split('.')[-1]}"
                contador = 1

                # Verificar si ya existe un archivo con el nuevo nombre y agregar un sufijo numerado
                while os.path.exists(os.path.join(directorio_actual, nuevo_nombre)):
                    nuevo_nombre = f"{elPato[contador]}.{archivo.split('.')[-1]}"
                    contador += 1

                ruta_archivo = os.path.join(directorio_actual, archivo)
                nueva_ruta_archivo = os.path.join(directorio_actual, nuevo_nombre)

                os.rename(ruta_archivo, nueva_ruta_archivo)
                informe.write(f"{archivo} -> {nuevo_nombre}\n")
                print(f"Archivo renombrado: {ruta_archivo} -> {nueva_ruta_archivo}")

    except Exception as e:
        print(f"Error al intentar renombrar los archivos: {e}")


# Llamar a la función para renombrar los archivos
renombrar_archivos()
