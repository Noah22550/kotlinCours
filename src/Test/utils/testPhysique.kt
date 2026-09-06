package Test.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import utils.dureeSurTerre
import utils.longueurSurTerre
import utils.vitesseRepereTerre

class TestRelativite {

    @Test
    fun `test dureeSurTerre avec vitesse valide`() {
        val resultat = dureeSurTerre(60.0, 299000.0)
        assertEquals(825.7444, resultat, 0.001) // 0.001  = précision requise
    }
    @Test
    fun `testLongueurSurTerre`() {
        val res = longueurSurTerre(100.0, 299000.0)
        assertEquals(7.2661, res, 0.001)
    }
    @Test
    fun `testvitesseRepereTerre`() {
        val res = vitesseRepereTerre(150000.0, 150000.0)
        assertEquals(239933.5359, res, 0.001)
    }

}