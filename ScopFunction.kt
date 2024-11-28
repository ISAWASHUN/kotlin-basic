// Good Code
data class User(var name: String, var age: Int)

fun main() {
    val user = User("Alice", 25)
    user.apply { 
        name = "Bob"  
        age = 30
    }

    user.let { 
        println("User's name is ${it.name} and age is ${it.age}")
    }
}

//Bad Code
data class User(var name: String, var age: Int)

fun main() {
  val user = User("Alice", 25)
  user.name = "Bob"
  user.age = 30

  if (user != null) {
    println("User's name is ${user.name} and age is ${user.age}")
  }
}
