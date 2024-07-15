object demo {

    // Recursive function to compute the Fibonacci number at position n
    def fibonacci(n: Int): Int = {
      if (n <= 1) n
      else fibonacci(n - 1) + fibonacci(n - 2)
    }

    // Recursive function to print the first n Fibonacci numbers
    def printFibonacci(n: Int, current: Int = 0): Unit = {
      if (current < n) {
        println(fibonacci(current))
        printFibonacci(n, current + 1)
      }
    }

    def main(args: Array[String]): Unit = {
      
      print("Enter the number : ")
      val n = scala.io.StdIn.readInt()
     
      if (n <= 0) {
        println("Please enter a positive integer greater than 0.")
      } else {
        println(s"First $n Fibonacci numbers:")
        printFibonacci(n)
      }
    }


}