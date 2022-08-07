import aula.abstracaoEncapsulamento.Carro
import org.junit.Test
import kotlin.test.assertEquals

class CarroTest {
    private val carro = Carro()

    @Test
    fun `quando adiciona motor no carro`() {
        assertEquals(4, carro.mudarMarcha(4))
    }

    @Test
    fun `quando aumenta motor`() {
        assertEquals(2, carro.mudarMotor(1))
    }
}