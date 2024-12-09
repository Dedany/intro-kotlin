package Array
//Crea una función que dado un conjunto de enteros los ordene
// de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

fun numbers4(array: List<Int>) {
    var number = array.toMutableList()


    for (i in 0 until number.size - 1) {
        for (j in i + 1 until number.size) {
            if (number[i] < number[j]) {
                val change = number[i]
                number[i] = number[j]
                number[j] = change
            }
        }


    }
    println("Array ordenado $number")


}

fun main() {


    val numbers = listOf(10, 22, 13, 4)

    numbers4(numbers)


}



