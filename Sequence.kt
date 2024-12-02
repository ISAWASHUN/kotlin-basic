// Good Code
fun processNumbers(numbers: List<Int>): List<Int> {
  return numbers.asSequence()
  .filter { it % 2 == 0 }
  .map {it * 2}
  .toList()
}

fun main() {
  val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
  val result = processNumbers(numbers)
  println("結果：$result")
}
