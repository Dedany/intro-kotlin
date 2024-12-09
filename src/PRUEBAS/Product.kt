package PRUEBAS;

class Product(
    /**Attributes **/
    val id: Int,
    var name: String,
    var quantity: Float,
    var image: String,
    var description: String,
    var price: Float,


    ) : ProductUseCase{

    }




    fun recalculateTotalAmount() {

    }
    companion object{
        var discounPercent: Float = 3f
        val reference= "EL NOMBRE QUE TOQUE"
        fun sumaDosNumeros(valueA: Int,valueB: Int) = valueA+valueB
    }
}


fun main() {


    val Product = Product(
        id = 1,
        name = "Air Frier",
        quantity = 3f,
        image = "lo que sea",
        description = "descripcion",
        price = 99f
    )

    Product.recalculateTotalAmount()

    Product.name= "nuevo nombre"
    Product.discounPercent
    Product.sumaDosNumeros(2,3)
}




