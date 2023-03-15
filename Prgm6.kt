fun main() {
    print("Enter a string: ")
    val str = readLine()!!
    print("Enter a character to find its frequency: ")
    val ch = readLine()!![0]
    val frequency = str.filter { it == ch }.count()
    println("The frequency of '$ch' in '$str' is $frequency")
}
