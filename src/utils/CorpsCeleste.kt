package utils

interface CorpsCeleste{
    val nom:  String
    val magnitude: Double
}

fun CorpsCeleste.estBrillant(): Boolean{
    if(magnitude < 1.5 ){
        return true
    }
    return false
}