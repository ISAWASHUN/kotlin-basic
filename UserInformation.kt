// data class User(val id: Int, var name: String, var age: Int?, var email: String?)

// fun main() {
//   val users = mutableListOf<User>()

//   fun addUser(id: Int, name: String, age: Int? = null, email: String? = null) {
//     users.add(User(id, name, age, email))
//     println("User added: $name")
//   }

//   fun findUserById(id: Int): User? {
//     return users.find { it.id == id }
//   }

//   fun updateUserEmail(id: Int, email: String) {
//     val user = findUserById(id)
//     user?.let { 
//       it.email = email
//       println("Email updated for user: ${it.name}")
//      } ?: run {
//       println("User not found with id: $id")
//      }
//   }

//   fun printUser(user: User?) {
//     user?.let { 
//       println("User: ${it.name}")
//       println("Age: ${it.age ?: "N/A"}")
//       println("Email: ${it.email?: "N/A"}")
//       } ?: run {
//         println("User not found")
//       }
//   }

//   try {
//     addUser(1, "John Doe", 30, "john@example.com")
//     addUser(2, "Jane Smith", 25)
//     addUser(3, "Mike Johnson")

//     val user = findUserById(2)
//     printUser(user)

//     updateUserEmail(2, "jane@example.com")

//     printUser(findUserById(1))
//   } catch (e: Exception) {
//     println("An error occurred: ${e.message}")
//   }
// }
