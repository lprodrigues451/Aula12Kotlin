fun main() {
    println("Digite uma opção: ")
    val opcao = readln().toInt()

    when(opcao){
        1 -> println("Cadastro de usuario")
        2 ->  println("Calcula imposto")
        3 -> println("Sair")
        else -> {
            println("Opção inválida")
        }
    }
}