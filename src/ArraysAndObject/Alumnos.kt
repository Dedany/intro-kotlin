package ArraysAndObject

class Alumnos(
    val name: String,
    val lastName: String,

    var isApproved: Boolean = false,
    var isProgressing: Boolean = false,
    var needHelp: Boolean =false

)
{
    init {
        needHelp= !isApproved&&!isProgressing
    }
}


