//Crea una función que dado 2 números enteros (dividendo y divisor) los divida
// y devuelva el resultado solo si el divisor no es 0 en caso contrario devuelve nulo

fun ejercicio3() {

    val a= 5f
    val b= 3f

    val division = if (b != 0f) a / b else null

    println(division?: "error: no se puede dividir por cero")





}