import random
import matplotlib.pyplot as plt

def obtener_numeros_usuario():
    loteria_usuario = []
    num_gan_usuario = []

    for i in range(6):
        while True:
            try:
                loteria = int(input(f"Indique el numero {i + 1} de su combinación: "))
                if 1 <= loteria <= 49:
                    if loteria not in num_gan_usuario:
                        num_gan_usuario.append(loteria)
                        loteria_usuario.append(loteria)
                        break
                    else:
                        print(f"El numero introducido está repetido. Vuelva a introducir el número {i + 1} de su combinación")
                else:
                    print(f"El numero introducido está fuera de rango (desde el 1 al 49). Vuelva a introducir el número {i + 1} de su combinación")
            except ValueError:
                print("Entrada inválida. Por favor ingrese un número entero.")

    return loteria_usuario, num_gan_usuario

def main():
    loteria_usuario, num_gan_usuario = obtener_numeros_usuario()

    contador = 0
    num_gan = []

    while True:
        contador += 1
        num_gan.clear()

        for i in range(6):
            numero = random.randint(1, 49)

            if numero not in num_gan:
                num_gan.append(numero)
            else:
                i -= 1

        if all(numero in num_gan_usuario for numero in num_gan):
            break

    print(f"Los numeros escogidos han sido {num_gan_usuario}")
    print(f"La loteria ha sido {num_gan}")
    print(f"El numero de intentos ha sido {contador}")

    # Crear el gráfico
    plt.figure(figsize=(10, 6))
    plt.plot(loteria_usuario, label='Números del Usuario', marker='o', color='blue')
    plt.plot(num_gan, label='Números Ganadores', marker='x', color='red')
    plt.xlabel('Intentos')
    plt.ylabel('Números')
    plt.title('Lotería')
    plt.legend()
    plt.show()

if __name__ == "__main__":
    main()
