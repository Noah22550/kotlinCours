package utils

class Conteneur2(val longueurMetres: Double, val largeurMetres: Double, val hauteurMetres: Double){

}

fun Conteneur2.volume() :Double{
    var valeur =  this.hauteurMetres * this.longueurMetres * this.largeurMetres
    return valeur
}