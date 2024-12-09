package Array

//Crea una función que dado un conjunto de enteros devuelva
// el número de veces que se repite un número dado

fun numbers3 (array: List<Int>) {


    println("introduce el numero que quieres que se repita")
    val input = readLine()

    val numberInput = input?.toIntOrNull()

    if (numberInput != null) {
        var count = 0

        for (numcount in array) {
            if (numcount == numberInput) {
                count++
            }
        }
        println("el numero $numberInput se repite $count veces")
    } else {
        println("introduce un numero válido")
    }


}


fun main(){
    val array= listOf(1,2,3,4,5,5,2,3,1)

    numbers3(array)
}
