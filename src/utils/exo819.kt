package utils

data class MaterielInformatique(val designation: String,val assembleur: String) {

}

data class caisseBoisson(val appellation: String, val volumeLitres: String){

}

class Conteneur<T>(val contenu:T, val  poidsInitial :  Double){

    init{
        require(poidsInitial >= 0.0){"le poids ne peux pas être inférieur a zéro"}
    }
    var poids = poidsInitial
        get() = field
        private set(valeur){
            if (valeur > 0){
                field = 0.0
            }
        }
    fun ajouterPoids(quantite: Double){
        if(poids > 0){
            poids = poidsInitial + quantite
        } else{
            throw Exception("le poids doit être supérieur a zéro")
        }

    }

    override fun toString(): String {
        return ("état initial   : conteneur -> ${contenu} poids total -> ${poids} ")
    }
}