package javaslang.pattern_matching

object FizzBuzz {
    def main(args: Array[String]) {
        1.to(100).map {
            case number if isDivisibleByThreeAndFive(number) => "FizzBuzz"
            case number if isDivisibleByThree(number) => "Fizz"
            case number if isDivisibleByFive(number) => "Buzz"
            case number => number.toString
        }.foreach(println)
    }

    def isDivisibleByThree(number: Int): Boolean = number % 3 == 0
    def isDivisibleByFive(number: Int): Boolean = number % 5 == 0
    def isDivisibleByThreeAndFive(number: Int): Boolean = isDivisibleByThree(number) && isDivisibleByFive(number)
}
