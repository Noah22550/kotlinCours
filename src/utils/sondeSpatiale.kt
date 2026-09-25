package utils

data class SondeSpatiale(val nom: String, val orbite: String, val autonomieMois: Int){

    companion object {
        fun depuisChaine(ligneConfig: String): SondeSpatiale {
            val partie = ligneConfig.split(":")
            return SondeSpatiale(partie[0], partie[1], partie[2].toInt())
        }
    }
}