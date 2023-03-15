fun main() {
    print("Enter first floating-point number: ")
    val num1 = readLine()!!.toFloat()
    print("Enter second floating-point number: ")
    val num2 = readLine()!!.toFloat()
    val result = num1 * num2
    println("The product of $num1 and $num2 is $result")
}
