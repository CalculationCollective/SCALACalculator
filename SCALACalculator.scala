import scala.io.StdIn

object Main {
    def main(args: Array[String]): Unit = {
        print("Enter the first number: ")
        val num1: Float = StdIn.readFloat()

        print("\nChoose between:\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n: ")
        val calculationType: String = StdIn.readLine()

        print("\nEnter the second number: ")
        val num2: Float = StdIn.readFloat()

        println(s"You entered: $num1")

        calculationType match {
            case "1" => println(num1 + num2)
            case "2" => println(num1 - num2)
            case "3" => println(num1 * num2)
            case "4" => println(num1 / num2)
            case _ => println(s"$calculationType is not a valid function.")
        }
    }
}