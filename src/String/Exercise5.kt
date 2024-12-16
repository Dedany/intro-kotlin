/*Crea una función que dada una frase compruebe que los 2
 primeros caracteres son iguales que los 2 últimos

Ejemplo:
"este es el texto" -> false
package String*/

fun Exercise5() {

    println("Introduce una frase")
    val text = readLine() ?: ""

    if (text.length >= 2){
    val count = text.substring(0, 2)
    val count2 = text.substring(text.length - 2)

    val result = count == count2
    println("los 2 primeros y los 2 ultimos son = $result")
}else{
    println("no vale")
    }




}