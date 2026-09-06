package Test.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import utils.dureeSurTerre

class TestRelativite {

    @Test
    fun `test dureeSurTerre avec vitesse valide`() {
        val resultat = dureeSurTerre(60.0, 299000.0)
        assertEquals(825.7444, resultat, 0.001) // 0.001  = précision requise
    }
}