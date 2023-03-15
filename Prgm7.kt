fun main() {
    print("Enter the first number: ")
    val num1 = readLine()!!.toInt()
    print("Enter the second number: ")
    val num2 = readLine()!!.toInt()
    val max = { a: Int, b: Int -> if (a > b) a else b }(num1, num2)
    println("The maximum of $num1 and $num2 is $max")
}
