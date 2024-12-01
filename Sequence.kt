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

// Bad Code
fun processNumbers(numbers: List<Int>): List<Int> {
  val evenNumbers = ArraList<Int>()
  for (number in numbers) {
    if (number % 2 == 0) {
      evenNumbers.add(number)
    }
  }

  val result = ArrayList<Int>()
  for (evenNumber in evenNumbers) {
    result.add(evenNumber * 2)
  }

  return result
}

fun main() {
  val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
  val result = processNumbers(numbers)
  println("結果：$result")
}
