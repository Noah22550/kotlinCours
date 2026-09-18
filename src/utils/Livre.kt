package utils

data class Livre(val quatriemeDecouverture: String, val nombreDePage: Int,
            override val titre: String, override val auteur: String, override val editeur: String, override val dateParution: String) : idDocument {
    override fun afficherDetail() {
        println("Livre : ${titre}, auteur  : ${auteur}, editeur : ${editeur}, dateParution : ${dateParution}" +
                "4 eme de couverture : ${quatriemeDecouverture}, nombre de pages : ${nombreDePage} ")
    }

}