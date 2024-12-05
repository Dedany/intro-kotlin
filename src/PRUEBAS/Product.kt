package PRUEBAS;

class Product(
    /**Attributes **/
    val id: Int,
    var name: String,
    var quantity: Float,
    var image: String,
    var description: String,
    var price: Float,


    ) {


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
}




