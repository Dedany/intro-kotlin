package String

/*Comprueba que 2 textos son iguales independientemente de si son mayusculas o no

Ejemplo:
"Hola" "hola" -> true
"MAR", "SDW") -> false*/

fun Exercise6() {


    println("introduce un texto")
    val text = readLine() ?: ""

    println("introduce otro")
    val text2 = readLine() ?: ""

    val iguales=text.equals(text2, ignoreCase = true)

    println("son iguales $iguales")
    




}