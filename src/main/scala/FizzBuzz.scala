object FizzBuzz {
  def getResult(n: Int): String = {
    if (n % 15 == 0) "fizzbuzz"
    else if (n % 3 == 0) "fizz"
    else if (n % 5 == 0) "buzz"
    else n.toString
  }
}
