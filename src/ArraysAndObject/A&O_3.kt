package ArraysAndObject

import java.util.*

//Añade un atributo nuevo a la clase que sea isApproved y otra que sea isProgressing
// e imprime todos los alumnos suspendidos que no esten progresando de cada clase

fun  exercise_3(ClassObj:Class) {

    println("introduce si el alumno está aprobado")
    val allAlumnos = ClassObj.matemathics + ClassObj.history + ClassObj.english

    for (alumn in allAlumnos) {
        println("el alumno ${alumn.name} ${alumn.lastName} está aprobando? S/N")
        val isApproved = readLine()?.trim()?.lowercase() == "s"
        alumn.isApproved = isApproved


        println("¿Está progresando ${alumn.name} ${alumn.lastName}? (sí/no)")
        val isProgressing = readLine()?.trim()?.lowercase() == "s"
        alumn.isProgressing = isProgressing

    }

    println("los alumnos suspendidos que no progresan son: ")
    for (alumn in allAlumnos.filter { !it.isApproved && !it.isProgressing })
        println("${alumn.name} ${alumn.lastName}")
}

fun main() {
    val classObj = Exercise1()
    exercise_3(classObj)
}