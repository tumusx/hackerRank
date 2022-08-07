package heranca.testes.heranca

interface IHospital {

    fun marcarDataEntradaPaciente()

    fun marcarMedicacoesPaciente(medicacoes: List<String>) : List<String>

}