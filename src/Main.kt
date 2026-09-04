fun main(){
    val age:  String?
    println("donnez votre age")
    age = readlnOrNull()
    val resultat = age?: "18"
    println("vous avez $resultat")
}