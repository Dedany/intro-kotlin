package Array

//Crea una función que dado un conjunto de enteros devuelva
// el número de veces que se repite un número dado
//1.introduzco el main , dejo registrado los numeros
//2.fun numbers3 (introduzco el array como una función)
//3. creo un print ln para introducir el numero a comprobar, mediante la constante input
//4. tengo que hacer el parseo de String a Int y que no sea nulable
//5. condiciona , Sí el numero parseado es disntinto de null , es un valor ,
// se almacena en la variable count
//6. creamos un bucle for en el array , para que lo recorra
// y si el identificador es igual al numero que se encuentra en el array,
// la variable count aumenta de valor
//7.imprimo por pantalla el numero que he introducido en su momento ,
// y sale el número de veces que está dentro del array


fun numbers3 (array: List<Int>) {


    println("introduce un número ")
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
    val numbers= listOf(1,2,3,4,5,5,2,3,1,23,50,50)

    numbers3(numbers)
}
