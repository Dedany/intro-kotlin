package ArraysAndObject

import java.util.*
import kotlin.collections.ArrayList


//Crea las clases necesarias para definir clases y alumnos y añade. Crea 1 array con
// 2 clases con 10 alumnos cada una con valores de ejemplo


fun Exercise1(): Class {

    val matemathicsAlumnos = ArrayList<Alumnos>()
    val historyAlumnos = ArrayList<Alumnos>()
    val englishAlumnos = ArrayList<Alumnos>()


    println("introduce el número de alumnos para cada materia")

    val totalAlumns = readLine()?.toIntOrNull() ?: 0


    for (i in 1..totalAlumns) {
        println("Nombre del alumno: $i")
        val name = readLine() ?: "Nombre"

        println("Apellido del alumno: $i")
        val lastname = readLine() ?: "Apellido"

        println("a que clase va? matemáticas,historia o inglés $i ? ")
        val classAlumn = readLine()?.trim()?.lowercase(Locale.getDefault()) ?: "por definir"

        val alumn = Alumnos(name, lastname)

        when (classAlumn) {
            "matemáticas" -> matemathicsAlumnos.add(alumn)
            "historia" -> historyAlumnos.add(alumn)
            "inglés" -> englishAlumnos.add(alumn)
            else -> println("materia no válida, revisa los acentos ")
        }
    }
    return Class(matemathicsAlumnos, historyAlumnos, englishAlumnos)

}

fun printAlumn(classObj: Class) {
    println("Lista de Matemáticas")
    for (alumn in classObj.matemathics) {
        println("Nombre:  ${alumn.name} , Apellido: ${alumn.lastName}")
    }
    println("Lista de Historia")
        for (alumn in classObj.history){
            println("Nombre:  ${alumn.name} , Apellido: ${alumn.lastName}")
    }

    println("Lista de Inglés")
        for (alumn in classObj.english){
            println("Nombre:  ${alumn.name} , Apellido: ${alumn.lastName}")

    }
}


fun main() {
    val classObj = Exercise1()
    printAlumn(classObj)
}
