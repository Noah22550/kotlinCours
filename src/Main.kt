import utils.Livre
import utils.bibliotheque
import utils.Astre
import utils.CentreControleMaritime
import utils.afficherMessage

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
import kotlin.math.pow
import kotlin.math.round

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
const val UA_EN_MILLIONS_KM = 149.6
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
    println(calculer(2, 4, { x: Int, y: Int ->
        println("Addition des deux paramètres")
        x + y
    }))
    println(calculer(2, 4, { x: Int, y: Int ->
        println("Multiplication des deux paramètres")
        x * y
    }))

    println("//////////////////////////////////////////////////")

    // 1. Une lambda qui prend un Int et retourne son double
    val doubler: (Int) -> Int = { x -> x * 2 }
    println(doubler(5))     // attendu : 10

// 2. Une lambda qui prend deux Int et retourne leur somme
// TODO : écrire la lambda ici
    val additionner: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(additionner(3, 4)) // attendu : 7

// 3. Une lambda sans paramètre qui retourne "Bonjour"
// TODO : écrire la lambda ici
    val saluer: (String) -> String = { nom: String -> nom }
    println(saluer("bonjour")) // attendu : Bonjour

    println("/////////////////////////////////////////")

    fun calculer(x: Double, f: (Double) -> Double): Double {
        return f(x)
    }
    println(calculer(3.5) { x -> x * x })
    println(calculer(2.0) { x -> x * x * x })
    println(calculer(4.0) { x -> 1 / x })
    println(calculer(7.2) { x -> -x })
    println(calculer(-6.5) { x -> if (x > 0.0) x else x * -1 })
    println("/////////////////////////////////////////")
    fun repeter(fois: Int, action: (Int) -> Unit) {
        for (i in 1..fois) {
            action(i)
        }
    }
    repeter(3) { i -> println("Tour n° $i") }
    println("/////////////////////////////////////////")

    fun integer(a: Double, b: Double, n: Int, f: (Double) -> Double): Double {
        var somme = 0.0
        for (i in 1..n) {
            val x = a + (i - 0.5) * (b - a) / n
            somme += f(x)
        }
        return somme * (b - a) / n
    }
    println(integer(0.0, 1.0, 100000000) { x -> x * x })


    println("/////////////////////////////////////////")

    fun calculerVAN(fluxFutur: Double, taux: Double, annees: Int, change: (Double) -> Double): Double {
        var res = 1.0
        for (i in 1..annees) {
            res *= (1 + taux)
        }
        return change(fluxFutur / res)
    }
    println()
    println("VAN brute, sans transformation :" + calculerVAN(1000.0, 0.07, 10, { x -> x }))
    println("VAN brute, sans transformation  arrondi  :" + round(calculerVAN(1000.0, 0.07, 10, { x -> x })))
    println("VAN  avec marge de sécurité de 5% :" + calculerVAN(1000.0, 0.07, 10, { x -> x * 0.95 }))
    println(
        "VAN brute, estimée en Dollars (1EUR=1.08 USD), avec risque de change de 2% :" + calculerVAN(
            1000.0,
            0.07,
            10,
            { x -> x * (1.08) * 0.98 })
    )
    println("/////////////////////13.6.6Composer des fonctions///////////////////////////////////////////////////////")

    fun appliquerDeuxFois(x: Double, f: (Double) -> Double): Double {
        return f(f(x))
    }

    fun composer(x: Double, f: (Double) -> Double, g: (Double) -> Double): Double {
        return g(f(x))
    }
    println(appliquerDeuxFois(5.0, { x -> x + 10 }))
    println(appliquerDeuxFois(3.0, { x -> x * 2.0 }))
    println(composer(4.0, { x -> x + 1 }, { x -> x * 2 }))
    println("////////////////////////////////////////////////////////////////////////////")

    fun transformer(liste: List<Int>, operation: (Int) -> Int): List<Int> {
        var nouvListe: List<Int> = listOf()
        for (i in liste) {
            nouvListe += operation(i)
        }
        return nouvListe
    }

    val liste = listOf(1, 2, 3, 4)

    println(transformer(liste) { x -> x + x })

    println("////////////////////////////////////////////////////////////////////////////")


    fun List<Int>.transformer2(operation: (Int) -> Int) = this.map { operation(it) }
    println(liste.transformer2 { it * 2 })

    println("////////////////////////////////////////////////////////////////////////////")

    data class Observation(
        val objet: String,
        val temperatureK: Int,
        val typeSpectral: String,
        val estValide: Boolean
    )

    val fluxDonnees = listOf(
        Observation("Etoile-A", 5500, "G", true),
        Observation("Etoile-B", 3000, "M", false), // Donnée invalide
        Observation("Etoile-C", 12000, "B", true),
        Observation("Etoile-D", 4500, "K", true),
        Observation("Etoile-E", 25000, "O", true)
    )
    val tri = fluxDonnees.filter { it.temperatureK > 5000 }
    println(
        "analyse standard : ${tri[0].objet} en cours " + "\n" +
                "Priorité Haute : ${tri[1].objet} détectée " + "\n" +
                "Priorité Haute : ${tri[2].objet} détectée " + "\n"
    )
    println("////////////////////////////////////////////////////////////////////////////")

    data class Livre(val titre: String, val estEmprunte: Boolean)

    val bibliotheque2 = listOf(
        Livre("Le Petit Prince", true),
        Livre("1984", false),
        Livre("La guerre des mouches", true),
        Livre("Fondation", false)
    )
    bibliotheque2.filter { it.estEmprunte }
        .sortedBy { it.titre }
        .forEach { println(" le livre ' ${it.titre} ' est emprunté") }

    println("////////////////////////////////////////////////////////////////////////////")

    val indices = (0..4)
    indices.forEach { x -> println(1 / Math.pow(2.0, x.toDouble())) }

    data class Exoplanete(val nom: String, val distanceAl: Int, val estHabitable: Boolean)


    val catalogue = listOf(
        Exoplanete("Proxima Centauri b", 4, true),
        Exoplanete("Kepler-452b", 1400, true),
        Exoplanete("WASP-17b", 1300, false),
        Exoplanete("TRAPPIST-1e", 39, true),
        Exoplanete("HD 189733b", 64, false)
    )
    val cat = catalogue.filter { it.estHabitable }
        .sortedBy { it.distanceAl }
        .map { it.nom + " (${it.distanceAl} AL)" }
        .joinToString(separator = " / ", prefix = "Catalogue des mondes habitables : ", postfix = ".")
    println(cat)
    println("////////////////////////////////////////////////////////////////////////////")

    data class CorpsCeleste(val nom: String, val distanceUA: Double)

    val catalogueSpatial = listOf(
        CorpsCeleste("Mercure", 0.39),
        CorpsCeleste("Venus", 0.72),
        CorpsCeleste("Terre", 1.0),
        CorpsCeleste("Mars", 1.52),
        CorpsCeleste("Jupiter", 5.2),
        CorpsCeleste("Saturne", 9.5),
        CorpsCeleste("Uranus", 19.2),
        CorpsCeleste("Neptune", 30.1),
        CorpsCeleste("Pluton", 39.5),
        CorpsCeleste("Eris", 67.7),
        CorpsCeleste("Sedna", 480.0)
    )
    catalogueSpatial.filter { it.distanceUA > 30 }
                    .forEach { println("Objet lointain : ${it.nom} à ${(it.distanceUA * UA_EN_MILLIONS_KM).toInt() } millions de km" ) }


    data class Candidat(val nom: String, val prenom: String, val moyenneG:  Double, val certifP:  Double)

    val lesCandidats = listOf(
    Candidat("Dupont", "Pierre", 11.0, 12.0), // OK, moyenne générale : 11, pro : 12
    Candidat("Durant", "Jean", 8.5, 11.0), // rattrapage OK
    Candidat("Jaouen", "Yann", 7.0, 8.0), // recalé
    Candidat("Le Flem", "Paul", 7.5, 15.0), // recalé
    Candidat("Ropartz", "Guy", 15.0, 17.0), // OK
    Candidat("Cras", "Jean", 9.0, 14.0), // rattrapage OK
    Candidat("Ravel", "Marcel", 9.5, 10.0), // recalé, moyenne<10
  )
    fun List<Candidat>.getListCandidatsRepeches() = lesCandidats.filter{it.moyenneG >  8 && it.moyenneG < 10 && it.certifP > 10 && it.certifP <= 20 }
                                                                .map{" \n ${it.nom} ${it.prenom} : ${it.moyenneG} - ${it.certifP}"}
                                                                .joinToString ()

  println("Liste des candidats repéchés :\n${lesCandidats.getListCandidatsRepeches()}")

    val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1)
    while (true) {
      yield(a + b)
      val tmp = a + b
      a = b
      b = tmp
    }
  }
  println("Première consommation : Les 10 premiers nombres de Fibonacci :")
  fibonacciSeq.take(10).forEach { print("$it - ") } // Prend les 10 premiers et les affiche
  println("\nDeuxième consommation : Le 15ème nombre de Fibonacci :")
  // Note : prendre un élément spécifique implique de calculer tous les précédents
  println(fibonacciSeq.drop(14).first())




    val puissanceSeq  = sequence {
        var  a = 2
        var b = 1
        yield(1)
        while (true) {
            yield( a * b )
            a *= 2
        }
    }
      puissanceSeq.take(10).forEach { print("$it - " ) }

    val SyracuseSeq = sequence {
        var a = 12
        while (a != 1) {
            yield(a)
                if(a %  2 == 0) {
                    a /= 2
                }else {
                    a = a * 3 + 1
                }
        }
    }
      SyracuseSeq.take(10).forEach { print("  $it - ") }
}

