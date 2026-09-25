package utils

sealed class TypeEtoile(val nom: String, val couleur: String){
    object O:  TypeEtoile("Supergéante Bleue","Bleu" ){
        fun decrireTemperature(){
            println("Température extrême : > 30 000 °C")
        }
    }
    object G: TypeEtoile("Naine Jaune","jaune"){
        fun decrireTemperature(){
            println("Température modérée : ~ 5 500 °C")
        }
    }
    object M: TypeEtoile("Naine rouge","rouge"){
        fun decrireTemperature(){
            println("Température basse : < 3 700 °C ")
        }
    }
}