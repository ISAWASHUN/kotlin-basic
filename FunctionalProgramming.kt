//Good Code
fun add(a: Int, b: Int): Int {
  return a + b
}

val result = add(3,5)
println(result)

//Bad Code
var globalSum = 0
fun add(a: Int, b: Int) {
  globalSum = a + b
}

add(3,5)
println(globalSum)
