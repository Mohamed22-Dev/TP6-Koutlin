data class Produit(var nom : String, var prix : Double,
                   var quantity : Int, var description : String){

}
fun main() {
    var produit1 = Produit("laptoup", 5000.0, 1, "hp")
    println(produit1.toString())
    println(produit1)
    val produit2 = produit1.copy(prix = 70000.0)
    println(produit2)
    if println(produit1.equals(produit2)) {
        println("les deux produit sont identiques")
        else
        println("les deux produits sont différents")
    }
}