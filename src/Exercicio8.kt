fun main() {
    var x : Int
    var y : Int

    print("Por favor informe um valor que vai considera 'x'")
    x = readln().toInt()

    print("Por favor informe um valor que vai considera 'y'")
    y = readln().toInt()

    var trocaNumeros : Int = x
    x = y
    y = trocaNumeros

    println("O valor de x é : $x")
    println("O valor de y é : $y")



}