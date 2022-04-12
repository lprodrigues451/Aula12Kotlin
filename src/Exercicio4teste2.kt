fun main() {
    println("Informe a Temperatura em graus Célsius")
    val temp = readln().toDouble()
    tempCelsius(temp)
}
fun tempCelsius(temperatura: Double){
    when(temperatura){
        in -0.0 .. 18.0 -> println("O clima está Frio")
        in 19.0 .. 23.0 -> println("O clima é agradável")
        in 24.0 .. 35.0 -> println("O clima é quente")
        else -> println("O clima está muito quente")

    }
}