//Crea una función que calcule el porcentaje de victorias de un equipo de futbol
// según los partidos que ha jugado y los que ha ganado

fun ejercicio5 (){

        val a= 5f
        val b= 3f

        val division = if (b != 0f) a / b else null

        println(division?: "error: no se puede dividir por cero")
}