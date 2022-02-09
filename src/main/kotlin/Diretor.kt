class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario (nome = nome, cpf = cpf, salario = salario) {

}
