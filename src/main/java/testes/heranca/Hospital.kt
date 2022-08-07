package heranca.testes.heranca

class Hospital: IHospital {
    private val anestesista = Anestesista(this)

    override fun marcarDataEntradaPaciente() {
        print("data entrada do paciente foi dia 12/08/2022")
    }

    override fun marcarMedicacoesPaciente(medicacoes: List<String>): List<String> {
        return anestesista.medicamentosLista
    }

    fun marcarLiberacaoPaciente(isLiberado: Boolean) {
        if (isLiberado) {
            print("voce esta liberado. Boa recuperação")
        } else {
            print("voce não está liberado. Precisará ficar mais uma semana aqui")
        }
    }
}