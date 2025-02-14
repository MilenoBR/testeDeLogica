fun main() {
    val nomeHeroi = "Mileno"
    val xp = 8003

    val nivel = when {
        xp < 1000 -> "Ferro"
        xp in 1001..2000 -> "Bronze"
        xp in 2001..5000 -> "Prata"
        xp in 5001..7000 -> "Ouro"
        xp in 7001..8000 -> "Platina"
        xp in 8001..9000 -> "Ascendente"
        xp in 9001..10000 -> "Imortal"
        else -> "Radiante"
    }

    println("O Herói $nomeHeroi está no nível $nivel")
}