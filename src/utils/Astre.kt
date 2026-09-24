package utils

sealed class Astre(val nom: String, val type: String){

    class Etoile(val couleur: String, val temperatureKelvin: Int, nom: String, type: String, ) : Astre(nom, type)

    class Planete(val diametreKm: Double, val nombreSatellites: Int, nom: String, type: String, ) : Astre(nom, type)

    class Comete(val periodeAnnees: Double,nom: String, type: String, ) : Astre(nom, type)

    class SatelliteNaturel(val planeteHote: String, nom: String, type: String, ) : Astre(nom, type)
}
fun afficherMessage(a:Astre) {
    when(a) {
        is Astre.Etoile -> println("Cette étoile se nomme ${a.nom} et est de type ${a.type}. \nElle est de couleur ${a.couleur} et a une température de ${a.temperatureKelvin}")
        is Astre.Planete -> println("Cette planete se nomme ${a.nom} et est de type ${a.type}. \nElle est de diametre ${a.diametreKm} et possede ${a.nombreSatellites} satellites naturel")
        is Astre.Comete -> println("Cette comete se nomme ${a.nom} et est de type ${a.type}. \nElle a vécu pendant ${a.periodeAnnees}")
        is Astre.SatelliteNaturel -> println("Ce satellite se nomme ${a.nom} et est de type ${a.type}. \nIl tourne autour de ${a.planeteHote}")
    }
}