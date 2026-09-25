package utils

object CentreControleMaritime {
    private var alerte = 0

    fun emettreAlerte(message: String){
        println(message.uppercase())
        alerte += 1
    }
    fun afficherBilan(){
        println("Bilan : Le centre a diffusé un total de " + alerte + " alerte(s)")
    }

}