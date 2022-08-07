package heranca.testes.heranca

class Anestesista(private val hospital: Hospital) : Medico() {
    val medicamentosLista = mutableListOf<String>()
    var isLiberadoPaciente = false

    override fun realizarCirurgia() {
        if (medicamentosLista.isEmpty()) {
            print("ainda nao podemos fazer cirurgia no paciente. Sem medicamentos")
        } else {
            print("preparando cirurgia do paciente")
            isLiberadoPaciente = true
        }
    }

    override fun medicarPaciente() {
        medicamentosLista.add("Ritalina LA")
        medicamentosLista.add("Venvance")
        medicamentosLista.add("Dipirona")
        hospital.marcarMedicacoesPaciente(medicamentosLista)
    }

    override fun darAltaParaPaciente() {
        if (isLiberadoPaciente) {
            hospital.marcarLiberacaoPaciente(true)
        }
    }
}