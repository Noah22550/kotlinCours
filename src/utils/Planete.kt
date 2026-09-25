package utils
import utils.CorpsCeleste
import java.time.LocalDateTime

class planete(override val nom: String, override val magnitude: Double, val distanceSoleil:  Double, val dateDecouverte: LocalDateTime):CorpsCeleste{

}
 fun planete.toPlaneteJson():  String {
  return "JSON : {\n'nom' : $nom, \n 'magnitude' : $magnitude,\n 'distance' : $distanceSoleil, \n 'date' : $dateDecouverte}"
 }

fun planete.estProche(): Boolean{
  if (distanceSoleil < 150 ){
   return true
  }
   return false
}