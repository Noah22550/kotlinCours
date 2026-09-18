package utils

data class MaterielInformatique(val designation: String,val assembleur: String) {
    override fun toString(): String {
        return (" designation -> ${designation} assembleur -> ${assembleur} ")
    }
}

data class caisseBoisson(val appellation: String, val volumeLitres: Double){
        override fun toString(): String {
        return ("appellation -> ${appellation} volumeLitres -> ${volumeLitres} ")
    }
}

class Conteneur<T>(val contenu:T, val  poidsInitial :  Double){

    init{
        require(poidsInitial >= 0.0){"le poids ne peux pas être inférieur a zéro"}
    }
    var poids = poidsInitial
        private set(valeur){
            if (valeur > 0){
                field = valeur
            }
        }
    fun ajouterPoids(quantite: Double){
        if(poids <= 0){
            poids = poidsInitial + quantite
        } else{
            throw Exception("le poids doit être supérieur a zéro")
        }

    }

    override fun toString(): String {
        return ("état initial   : " + contenu.toString() + "Poids : ${poids}")
    }
}