package ArraysAndObject

//Añade un atributo nuevo a la clase que sea needHelp que sera true cuando isApproved
// e isProgressing sean false. Este atributo se debe autocalcular al iniciar la clase
// o cambiar el valor de isApproved o isProgressing a false e imprime todos los
// alumnos suspendidos de cada clase que necesitan ayuda


fun exercise_4(ClassObj:Class) {

    val allAlumns = ClassObj.matemathics + ClassObj.history + ClassObj.english


    println("Los alumnos suspendidos que necesitan ayuda son:")
    for (alumn in allAlumns.filter { !it.isApproved && !it.isProgressing && it.needHelp }) {
        println("${alumn.name} ${alumn.lastName}")
    }
}

fun main() {
    val classObj = Exercise1()
    printAlumn(classObj)
    exercise_3(classObj)
    exercise_4(classObj)
    }