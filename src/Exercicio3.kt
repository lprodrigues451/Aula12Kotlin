fun main() {
    var numero : Int

    println("Por favor Digite um número ")
    numero = readln().toInt()

    if(numero % 5 == 0){
        println("O número digitado e multiplo de 5")
    } else {
        println("Não e multiplo de 5")
    }
}