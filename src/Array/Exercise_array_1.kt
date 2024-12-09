package Array

//Crea una función que dado un array de números inserte un número en una posición
// designada. Devuelve el nuevo array o nil en caso de que no sea posible

fun insertNum(array: List<Int>, number: Int, index: Int): List<Int>? {

    if (index < 0 || index > array.size) {
        return null
    }


    val newArray = array.toMutableList()
    newArray.add(index, number)
    return newArray


}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    println("estos son los valores $numbers")

    print("introduce el numero que quieres introducir")
    val numberInput = readLine()?.toIntOrNull()

        if (numberInput == null) {
            println("no funciona , cambia de número")
            return
        }
    print("introduce la posición a insertar el número")
    val indexInput = readLine()?.toIntOrNull()

        if (indexInput == null) {
            println("introduce una posición adecuada")
            return
        }

    val updateArray = insertNum(numbers, numberInput,indexInput)

    if (updateArray != null) {
        println("El array está actualizado a $updateArray")
    }  else{
println("No se puede insertar el array en la posición adecuada")
        }
    }




