import Numbers.*
import String.*

fun main() {


    // 1. Tipos de datos
    // Enteros
    val integer: Int = 291
    val long: Long = 100000000000L

    //Flotantes
    val float: Float = 3.14f
    val double: Double = 3.1415926500054343

    //Booleanos
    var isFavorite: Boolean = true
    println("isFavorite: " + isFavorite)
    isFavorite = false

    // Caracteres (Char)
    val characterr: Char = 'k'

    // Cadenas (Los famosos Strings)
    val regards: String = "Hola mundo"

    // Imprimir por terminal
    println("Entero: " + integer)
    println("isFavorite: " + isFavorite)
    println("regards: " + regards)

    // 2. Bucles
    // For(y sus derivados), While, DoWhile
    for (i in 0..5 step 2) {
        println("Value for i: " + i)
    }

    var valueA = 3
    val valueB = 5
    while (valueA < valueB) {
        valueA++
        valueA.inc()
        valueA = valueA + 1
        valueA += 1
        println("Hola soy pepe.")
    }

    do {
        valueA++
    } while (valueA < valueB)

    // 3. When (Cases) <- Switch
    var day = 5
    when (day) {
        1 -> println("Hoy es Lunes")
        2 -> println("Hoy es Martes")
        3 -> println("Hoy es Miercoles")
        4 -> println("Hoy es jueves")
        5 -> println("Hoy es VIIIIIIERNES!!!!!")
        6 -> println("Hoy es sabado de fiesta!!!!!")
        7 -> println("Hoy es Domingo de mimir...")
        else -> {
            println("No has ingresado un día válido")
        }
    }

    println("__________________________________________________________")


    println("EJERCICIOS RESUELTOS")

//llamamos a las funciones de los ejercicios


    println("primer ejercicio , suma de 3+5")
    suma2()

    println("-------------")

    println("segundo ejercicio , multiplicación de 3X5")
    ejercicio2()

    println("-------------")

    println("tercer ejercicio , division de 3:5")
    ejercicio3()


    println("-------------")

    println("cuarto ejercicio , divide y devuelve la parte entera de la división 0")
    ejercicio4()


    println("-------------")

    println("quinto ejercicio , porcentaje partidos")
    ejercicio5()



    println("-------------")

    println("quinto ejercicio , porcentaje")
    ejercicio5()

    println("-------------")

    println("sexto ejercicio , el valor mayor")
    ejercicio6()

    println("-------------")

    println("septimo ejercicio , profundidad piscina")
    ejercicio7()

    println("-------------")

    println("octavo ejercicio , numero primo")
    ejercicio8()


//EXERCISES STRING

    println("-------------")
    println("-------------")
    println("-------------")
    println("EXERCISES STRING")

    println("Exercise1")
    println(Exercise1())
    println("-------------")

    println("Exercise2")
    println(Exercise2())
    println("-------------")

    println("Exercise3")
    println(Exercise3("ala", 'a'))


    println("Resultado: ${Exercise4()}")


    Exercise5()

    Exercise6()

}



