object demo {

  def getProductList(): List[String] = {
    var product = List[String]()
    var input = ""

    println("Enter product names:(type 'done' to finish):")

    while (input != "done") {
      input = scala.io.StdIn.readLine()
      if (input != "" && input != "done") {
        product = product :+ input
      }
    }
    product
  }

  def printProductList(product: List[String]): Unit = {

    for ((product, index) <- product.zipWithIndex) {
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(product: List[String]):Int={
    product.size
  }

    def main(args: Array[String]): Unit = {
      val productList = getProductList()

      println("\nProduct List:")
      printProductList(productList)
      print("Total Products:")
      print(getTotalProducts(productList))


    }

}



