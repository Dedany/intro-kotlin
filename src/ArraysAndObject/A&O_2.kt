package ArraysAndObject


//Imprime por consola todos los alumnos cuyo nombre contiene "a" en cada una de las clases

fun exercise_2(ClassObj: Class) {
    val allAlumns = ClassObj.matemathics + ClassObj.history + ClassObj.english

    println("Lista de todos los alumnos cuyo nombre contiene la a")
    for (alumns in allAlumns.filter { it.name.contains('a', ignoreCase = true) }) {
        println("${alumns.name} ${alumns.lastName}")
    }
}

fun main() {
    val classobject = Exercise1()

    exercise_2(classobject)
}