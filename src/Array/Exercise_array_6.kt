package Array

//Crea una función que dado un conjunto de Int devuelva el primer
// número entre 1 y 1000000 que no se encuentre dentro del array

fun Exercise6() {

    println("introduce los numeros separados por un espacio")
    val inputNumber = readLine() ?: ""
    val array = inputNumber.split(" ")
        .mapNotNull { it.toIntOrNull() }

    for (i in 1..1000000) {

        if (!array.contains(i)) {
            println("falta el numero : $i")
            return
        }
    }
    println("están todos")
}



fun main() {
    Exercise6()
}

