open class Banque{
    fun creerCompte(numero : Int, soldeInitial: Double){
            println("le compte a ete cree et le nombre de compt $numero et leur sold est $soldeInitial")
        }
    }

class CompteBancaire(var numeroCompte: String, var solde: Double): Banque(){
    fun Deposer(montant: Double){
        println("Deposer $montant deposit $solde")
    }
    fun Retirer(montant: Double){
        println("Retirer $montant retirer $solde")
    }
 }
fun main(){
    var banque = Banque()
    banque.creerCompte(12, 700.0)
    println()
    var compte = CompteBancaire("22",10.0)
    compte.Deposer(200.0)
    println()
    compte.Retirer(200.0)
    println()
}