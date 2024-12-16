package Numbers//Crea una función para calcular los X primeros números primos

fun ejercicio8() {
    var contador = 0
    var numero = 2

    while (contador < 5) { // Calcula los primeros 10 números primos
        var primo = true

        for (i in 2 until numero) {
            if (numero % i == 0) {
                primo = false
                break
            }
        }

        if (primo) {
            println("El número $numero es primo.")
            contador++
        }

        numero++
    }
}
