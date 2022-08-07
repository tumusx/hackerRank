package heranca.aprendizado.semana1

class Conta {
    private var contaVO: ContaVO? = ContaVO()


    fun depositarDinheiro(quantidadeDepositado: Int) {
        contaVO?.dinheiroDisponivel = contaVO?.dinheiroDisponivel?.plus(quantidadeDepositado)!!
    }

    fun cadastrarTitular(idadeUsuario: Int, nomeUsuario: String): Boolean {
        if (idadeUsuario >= 18) {
            contaVO?.idadeTitular = idadeUsuario
            contaVO?.nomeTitular = nomeUsuario
            contaVO?.cpfTitular = "64156456454"
            return true
        } else {
            println("ainda nao pode cadastrar sendo menor de idade")
        }
        return false
    }

    fun acessarDadosDaConta(): String {
        return "${contaVO?.nomeTitular}, ${contaVO?.cpfTitular}, ${contaVO?.idadeTitular}, ${contaVO?.dinheiroDisponivel}"
    }

    fun deletarMinhaConta(): Boolean {
        if (contaVO?.cpfTitular?.isNotEmpty() == true) {
            contaVO = null
            println("Conta deletada$contaVO")
        }
        return false
    }
}


fun main() {
    val contaUser = Conta()
    contaUser.cadastrarTitular(18, "Murillo")
    contaUser.depositarDinheiro(15153)
    contaUser.depositarDinheiro(15153)
    println(contaUser.acessarDadosDaConta())
    contaUser.deletarMinhaConta()
    println(contaUser.acessarDadosDaConta())
}