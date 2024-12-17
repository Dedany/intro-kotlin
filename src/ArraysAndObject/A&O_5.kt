package ArraysAndObject

//Obten un array nuevo de alumnos suspendidos de todas las clases

fun exercise_5(ClassObj: Class): List<Alumnos> {
    val allAlumnos = ClassObj.matemathics + ClassObj.history + ClassObj.english

    return allAlumnos.filter { !it.isApproved }
}

fun main(){
    val classObj = Exercise1()
    printAlumn(classObj)
    exercise_3(classObj)

    val suspendedAlumnos = exercise_5(classObj)
    println("Lista de alumnos suspensos:")
    for (alumn in suspendedAlumnos) {
        println("${alumn.name} ${alumn.lastName}")
    }
}