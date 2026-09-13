package utils

import kotlin.text.uppercase

class ObjetMessier(val numero: Int, val nom: String, typeInitial: String){
    init{
        require(numero in 1..110){"Le numero doit être compris entre 1 et 110"}
    }
    var magnitudeApparente: Double = 0.0
        set(valeur) {
            if (valeur > 30.0) {
                field = 30.0
            } else { field = valeur }
        }

    var type: String = typeInitial
        get() = field.uppercase()

    val estVisibleAOeilNu: Boolean
        get() = magnitudeApparente < 6.0
}