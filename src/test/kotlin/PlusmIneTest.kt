import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class PlusmIneTest {
    val userListInterface = mutableListOf("José", "Raimundo", "Mamacita")

    //give
    @Test
    fun insertUserInList() {
        //when
        userListInterface.add("Murillo")
    }

    @Test
    fun searchNameUser() {
        assertContains(userListInterface, "Murillo")
    }
}