import utils.Conteneur
import utils.Fraction
import utils.Livre
import utils.MaterielInformatique
import utils.caisseBoisson
import utils.ObjetMessier
import utils.PerimetreCercle
import utils.bibliotheque
import utils.Astre
import utils.CentreControleMaritime
import utils.afficherMessage

import kotlin.math.abs
import utils.calculerPuissance
import utils.calculerTension
import utils.photo
import utils.formaterImmatriculation
import utils.Conteneur2
import utils.SondeSpatiale
import utils.TypeEtoile
import utils.estBrillant
import utils.estProche
import utils.planete
import utils.toPlaneteJson
import utils.volume
import java.time.LocalDateTime

/*
fun main(){
    val age:  String?
    println("donnez votre age")
    age = readlnOrNull()
    val resultat = age?: "18"
    println("vous avez $resultat")
}
 */
/*
fun main(){
    println("entrez votre nombre : ")
    val num = readlnOrNull()?.toIntOrNull()
    if(num != null) {
        println(if(num < 0) -num else num)
    }
}
 */
/*
fun main(){
    println("entrez votre âge")
    val age = readlnOrNull()?.toIntOrNull()
    if(age != null) {
        val reponse = when {
            age < 0 ->"invalide"
            age in 0..12 -> "Enfants"
            age in   13..17 -> "vous êtes un adolescent"
            age in 18..64 -> "Adulte "
            age > 65 ->"vieux"
            else -> "> 100 ... Impossible"
        }
        println(reponse)
    }
}
 */
/*
fun main(){
    println("Montant avant remise")
    val montant: Int? = readlnOrNull()?.toIntOrNull()
    if(montant != null){
        val remise = when{
            montant < 2000  ->  0
            montant <= 5000 ->  1
            else ->  2
        }
        println(montant)
        println("votre remise est de ${remise} %")
        println("montant après remise ${montant -(montant * (remise /100f))}")
    } else{
        println("vous ne pouvez pas  calculer votre remise")
    }
}
 */
/*
fun main(){
    var somme = 1
    var compteur = 0
    do{
        println("Note ? (-1 pour sortir)")
        val note: Int? = readlnOrNull()?.toIntOrNull()
        if (note != null && note != -1) {
            somme += note
            compteur ++

        }else{
            println("vous ne pouvez pas faire ça !!")
        }
    }while(note != -1)
    println("compteur : ${compteur}")
    println("somme :  ${somme}")
    println("moyenne : ${somme / compteur}")
}
 */
/*
fun main(){
        println("donnez un mot : ")
        val mot: String? = readlnOrNull()
        println("combien de répition ?")
        val repition = readlnOrNull()?.toIntOrNull()
        if (repition != null && mot != null) {
            repeat(repition) {
                println(mot)
            }
        } else {
            println(mot)
        }
    }

}
*/

/*
    val andromede = ObjetMessier(31, "Andromede", "galaxie")
    andromede.magnitudeApparente = 3.4
    println(andromede)

    val a = Fraction(1, 2) // dénomitateur à 1 par défaut
    val b = Fraction(1,3)
    println("a+b (surcharge de la méthode associée plus) : ${a+b}") // a+b retourne un objet Fraction, et appel méthode toString implicite
    println("a-b (surcharge de la méthode associée plus) : ${a-b}")
    println("a*b (surcharge de la méthode associée plus) : ${a*b}")
    println("a/b (surcharge de la méthode associée plus) : ${-a}")
     val informatique: MaterielInformatique = MaterielInformatique("Server", "assembly")
    val caisse: caisseBoisson = caisseBoisson("boisson", 12.0)
    val unConteneur= Conteneur(caisse, 2.0)
    unConteneur.ajouterPoids(15.0)
    println(unConteneur)
 */

fun main() {
    val bibliotheque = bibliotheque()

    println("quel bg ce mec !")

    val livre1 = Livre("Le Petit Prince", 56, "Gallimard", "1943", "Un conte poétique et philosophique ...", "1950")
    val photo1 = photo(1920, 1080, true, "Coucher de soleil", "Jean Dupont", "Studio Lumière", "2022")

    bibliotheque.ajouterDocument(photo1)
    bibliotheque.ajouterDocument(livre1)

    bibliotheque.afficherTout()

    val unAstre = Astre.Planete(12742.0, 1, "Terre", "Planete")
    afficherMessage(unAstre)

    val valeur = ""
    val valeur2 = "siorabelais-22008A"
    println(valeur.formaterImmatriculation())
    println(valeur2.formaterImmatriculation())
    val res = Conteneur2(10.0, 2.0, 2.0)
    println(res.volume())
    println("/////////////////////////////")
    val terre = planete("TERRE", -3.99, 149.6, LocalDateTime.parse("2000-01-01T00:00"))
    println("brillant ? " + terre.estBrillant())
    println(terre.toPlaneteJson())
    println("proche du soleil ? " + terre.estProche() + "\n")
    val neptune = planete("NEPTUNE", 7.78, 4504.3, LocalDateTime.parse("1846-09-23T00:00"))
    println("brillant ? " + neptune.estBrillant())
    println(neptune.toPlaneteJson())
    println("proche du soleil ? " + neptune.estProche())

    CentreControleMaritime.emettreAlerte("[alerte n°1] tempête de force 9 sur la zone iroise")
    CentreControleMaritime.emettreAlerte("[alerte n°2] brouillard dense dans l'estuaire")
    CentreControleMaritime.afficherBilan()
    println("/////////////////////////////////////////////////////")

    val configuration = "Voyager 1:Héliocentrique:600"
    val sonde = SondeSpatiale.depuisChaine(configuration)
    println("Sonde initialisée avec succès :  $sonde")
    println("Nom : ${sonde.nom} | orbite : ${sonde.orbite} | Autonomie : ${sonde.autonomieMois} mois ")

    println("/////////////////////////////////////////////////////")

    val etoileObservee: TypeEtoile = TypeEtoile.O
     println("Classification : ${etoileObservee.nom}")
    println("Couleur dominante : ${etoileObservee.couleur}")
    print("Caractéristique thermique : ")
  // Grâce au mot-clé "sealed", le "when" est exhaustif et n'a pas besoin de "else"
  when (etoileObservee) {
    is TypeEtoile.O -> etoileObservee.decrireTemperature()
    is TypeEtoile.G -> etoileObservee.decrireTemperature()
    is TypeEtoile.M -> etoileObservee.decrireTemperature()
  }
    println("/////////////////////////////////////////////////////")

    fun calculer(x: Int, y: Int, operation: (x: Int, y: Int) -> Int) = operation(x, y)
    println(calculer(2, 4, { x : Int, y : Int ->
    println("Addition des deux paramètres")
    x + y}) )
    println(calculer(2, 4, { x : Int, y : Int ->
    println("Multiplication des deux paramètres")
    x * y}))

    println("//////////////////////////////////////////////////")

    // 1. Une lambda qui prend un Int et retourne son double
  val doubler: (Int) -> Int = { x -> x * 2 }
  println(doubler(5))     // attendu : 10

// 2. Une lambda qui prend deux Int et retourne leur somme
// TODO : écrire la lambda ici
    val additionner: (Int, Int) -> Int = { x: Int, y : Int -> x + y}
  println(additionner(3, 4)) // attendu : 7

// 3. Une lambda sans paramètre qui retourne "Bonjour"
// TODO : écrire la lambda ici
    val saluer: (String) -> String = {nom : String -> nom }
  println(saluer("bonjour")) // attendu : Bonjour

    println("/////////////////////////////////////////")

    fun calculer(x: Double, f: (Double) -> Double): Double {
      return f(x)
    }
    println(calculer(3.5) {x -> x * x })
    println(calculer(2.0) { x -> x * x * x})
    println(calculer(4.0) { x -> 1/x})
    println(calculer(7.2) { x -> - x})
    println(calculer(-6.5) { x -> if (x > 0.0) x else x * -1 })
    println("/////////////////////////////////////////")
    fun repeter(fois: Int, action: (Int) -> Unit) {
        for(i in 1..fois){
            action(i)
        }
    }
    repeter(3) { i -> println("Tour n° $i")}
   println("/////////////////////////////////////////")

    fun integer(a : Double, b : Double, n: Int, f: (Double) -> Double): Double {
        var somme = 0.0
        for (i in 1 .. n){
         val x = a + (i - 0.5) * (b - a) / n
          somme += f(x)
        }
        return somme * (b - a) / n
    }
   println(integer(0.0, 1.0, 1000) { x -> x*x })

}


