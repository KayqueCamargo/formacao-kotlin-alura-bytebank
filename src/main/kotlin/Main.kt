fun main() {
    println("Bem vindo ao Bytebank")

    var funcionario1 = Funcionario(
        nome = "Funcionario01",
        cpf = "000.000.000-11",
        salario = 16000.00
    )

    println("Nome: ${funcionario1.nome}")
    println("CPF: ${funcionario1.cpf}")
    println("Salário: ${funcionario1.salario}")
    println("Bonificação: ${funcionario1.bonificacao()}")

    var gerente = Gerente(
        nome = "Gerente01",
        cpf = "000.000.000-22",
        salario = 16000.00,
        senha = "senha"
    )

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao()}")
}

fun testaConta(){

    var contaKayque = Conta(titular = "Kayque", numero = 1)
    var contaMona = Conta(numero = 2, titular = "Mona")

    contaKayque.depositar( 15000000.00)
    contaMona.depositar(20000000.00)

    contaKayque.sacar(10000000000000000.00)
    contaMona.sacar(1000000.00)

    contaKayque.transferir(contaDestino = contaMona, valor = 0.1)
    contaKayque.transferir(contaDestino = contaMona, valor = 10000000000000000.1)

    contaKayque.verificaSaldo()
    contaMona.verificaSaldo()
}



