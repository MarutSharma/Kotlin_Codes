fun main() {
    val guestsPerFaimly = listOf(2, 4, 1, 3, 6, 4)
    var totalGuest = 0
    var index = 0
    while (index < guestsPerFaimly.size) {
        totalGuest += guestsPerFaimly[index]
        index++
    }
    println("total Guest Count:$totalGuest")
}