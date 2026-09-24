package utils

fun String?.formaterImmatriculation(): String {
    if(this.isNullOrBlank()){
        return "INCONNU"
    }
    return this.trim().uppercase()
}