package heranca

import heranca.aula.heranca.Anestesista
import heranca.aula.heranca.Ginecologista

fun main(){
    val anestesista = Anestesista()
    val ginecologista = Ginecologista()

    anestesista.operar()
    ginecologista.operar()
}