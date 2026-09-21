interface Vehicule
open class VehiculeBase : Vehicule{}
class Voiture(var capaciteChargement: Int) : VehiculeBase(){
    fun charger(){
        println("type de Vehicule est voiture")
    }
}
class camion (var nombrePortes : Int ) : VehiculeBase(){
    fun klaxonner(){
        println("Type de Klaxonner")
    }
}
fun main(){
    var vecB = VehiculeBase()
    var voi = Voiture(100)
    voi.charger()
    var cam = camion(5)
    cam.klaxonner()
}