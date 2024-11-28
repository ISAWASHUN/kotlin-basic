// //Good code
// class Stack<T> {
//   private val elements = mutableListOf<T>()

//   //要素にスタックを追加
//   fun push(item: T) {
//     elements.add(item)
//   }

//   //スタックから要素の取り消し
//   fun pop(): T? {
//     if (elements.isEmpty()) return null
//     return elements.removeAt(elements.size - 1)
//   }

  //スタックがからかどうかの確認
  // fun isEmpty(): Boolean =  elements.isEmpty()

  //スタックの現在のサイズを確認
  // fun size(): Int = elements.size
// }

// //使用例
// fun main() {
//   val intStack = Stack<Int>()
//   intStack.push(1)
//   intStack.push(2)
//   println(intStack.pop())
//   val stringStack = Stack<String>()
//   stringStack.push("Hello")
//   stringStack.push("World")
//   println(stringStack.pop())
// }

//Bad Code
class BadStack {
  private val elements = mutableListOf<Any>()

  fun push(item: Any) {
    elements.add(item)
  }

  fun pop(): Any? {
    if (elements.isEmpty()) return null
    return elements.removeAt(elements.size - 1)
  }


  fun isEmpty(): Boolean =  elements.isEmpty()

  fun size(): Int = elements.size
}

fun main() {
  val stack = BadStack()
  stack.push(1)
  stack.push("Hello")
  val item = stack.pop() as? String
  println(item)
}
