fun main() {
    print("Insira a temperatura da sua cidade ")
    val temperatura = readln().toInt()
    when {
        temperatura < 19 -> println("O clima é frio")
        temperatura >= 19 && temperatura <= 24 -> println("O clima é agradável")
        temperatura >= 23 && temperatura <= 35 -> println("O clima é quente")
        temperatura >= 35 -> println("O clima é muito quente")
        else -> println("Clima não identificado")

    }
}