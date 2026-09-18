package utils

class photo(val resolutionHorizontal: Int, val resolutionVertical: Int, val estCouleur: Boolean,
            override val titre: String, override val auteur: String, override val editeur: String, override val dateParution: String) : idDocument{
    override fun afficherDetail()  {
        println("Livre : ${titre}, auteur  : ${auteur}, editeur : ${editeur}, dateParution : ${dateParution}, " +
                "résolution H : ${resolutionHorizontal}, resolution v H : ${resolutionVertical} ")
    }


}