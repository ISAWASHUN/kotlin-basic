inline fun <T> meausreTime(block: () -> T): T {
  val start = System.nanoTime()
  val result = block()
  val end = System.nanoTime()

  println("Execution time: ${end - start} ns")
  return result
}

fun main() {
  val result = meausreTime {
    (1..1000).sum()
  }
  println("Result: $result")
}

// fun <T> meausreTime(block: () -> T): T {
//   val start = System.nanoTime()
//   val result = block()
//   val end = System.nanoTime()
//   println("Execution time: ${end - start} ns")
//   return result
// }

// fun main() {
//   val result = meausreTime { 
//     (1..1000).sum()
//    }
//    println("Result: $result")
// }
