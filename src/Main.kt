import kotlin.math.abs
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
fun main(){
    println("donnez un mot : ")
    val mot:  String? = readlnOrNull()
    println("combien de répition ?")
    val repition = readlnOrNull()?.toIntOrNull()
    if(repition != null && mot != null) {
        repeat(repition) {
            println(mot)
        }
        }else{
            println(mot)
    }

}