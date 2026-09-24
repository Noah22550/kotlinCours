package utils
import utils.CorpsCeleste
import java.time.LocalDateTime

class planete(override val nom: String, override val magnitude: Double, val distanceSoleil:  Double, val dateDecouverte: LocalDateTime):CorpsCeleste{

}
 fun planete.toPlaneteJson(){

 }