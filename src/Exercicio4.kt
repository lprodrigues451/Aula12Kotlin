fun main() {
    var clima: Double

    print("Por favor Digite a temperatura  ")
    clima = readln().toDouble()

    if (clima <= 18) {
        println("O Clima está frio")
    } else if (clima >= 19 && clima <= 23) {
        println("O clima está agradável")
    } else if (clima >= 24 && clima <= 35){
        println("O clima está quente")
    } else {
        println("O clima está muito quente")
    }

}