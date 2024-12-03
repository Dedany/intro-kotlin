package Numbers//Crea una función que dado 2 números enteros los divida y devuelva la parte entera
// de la división. Si el divisor es 0 devuelve nulo


class ejercicio4 {

init {
    val a = 5
    val b = 3

    val division = if (b != 0) a / b else null

    println(division ?: "error: no se puede dividir por cero")
}
}