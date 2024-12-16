package String

//Crea una función que dado un texto devuelva 2 veces las 2 primeras letras.
// Ejemplo "swift" devuelve "swsw"


fun Exercise4(): String {

    println("introduce un texto: ")
    val text = readLine() ?:""

    if (text.length >= 2){

        val letters= text.substring(0, 2)
        return letters + letters
    }
    else{
        return "El texto tiene 2 caracteres"
    }



}