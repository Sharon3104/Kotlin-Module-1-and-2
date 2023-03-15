fun main() {

    val stateCityMap = hashMapOf(
        "New York" to "New York City",
        "California" to "Los Angeles",
        "Texas" to "Houston",
        "Florida" to "Miami",
        "Illinois" to "Chicago"
    )
    for ((state, city) in stateCityMap) {
        println("$city is in $state")
    }
}
