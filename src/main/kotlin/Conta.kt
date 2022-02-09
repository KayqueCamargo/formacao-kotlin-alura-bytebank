class Conta(private val titular: String, private val numero: Int) {

    private var saldo = 0.0

    fun depositar(valor: Double){

        println()
        println("Depositando na Conta $titular o valor de $valor")
        if(valor > 0 ){
            println("Saldo Anterior: $saldo")
            this.saldo += valor
            println("Saldo Atualizado: $saldo")
        }else{
            println("Não é possivel depositar um valor Negativo: $valor")
        }
    }

    fun sacar(valor: Double){
        println()
        println("Sacando na Conta $titular, valor de $valor")

        if(saldo >= valor){
            println("Saldo Anterior: $saldo")
            saldo -= valor
            println("Saldo Atualizado: $saldo")
        }else{
            println("Saldo insuficiente: $saldo")
        }
    }

    fun transferir(contaDestino:Conta, valor: Double){

        println()
        println("Transferindo da ${this.titular} para ${contaDestino.titular} o valor de $valor")

        if(this.saldo >= valor){

            this.saldo -= valor
            contaDestino.saldo += valor

            println("Saldo Atualizado: ${this.saldo}")

        }else{
            println("Saldo insuficiente: ${this.saldo}")
        }

    }

    fun verificaSaldo() {
        println()
        println("Saldo da Conta $titular")
        println("Saldo ${this.saldo}")
    }
}