package utils

open class bibliotheque( val catalogue: ArrayList<idDocument> = ArrayList()) {

    fun ajouterDocument(doc: idDocument){
        catalogue.add(doc)
    }
    fun afficherTout()  {
        for( doc in catalogue){
            doc.afficherDetail()
        }
    }
}