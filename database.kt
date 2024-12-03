// Good Code
interface UserRepository {
  fun getUser(id: Int): User
  fun saveUser(user: User)
}

// interfaceの実装
class SQLUserRepository: UserRepository {
  override fun getUser(id: Int): User {
    // SQLデータベースからユーザーを取得する実装
    return User(id, "John Doe")
  }

  override fun saveUser(user: User) {
    //SQLデーターベースにユーザーを保存する実装
    println("ユーザー${user.name}を保存しました")
  }
}

// User操作を扱うクラス
class UserService(private val userRepository: UserRepository) {
  fun processUser(id: Int) {
    val user = userRepository.getUser(id)
    userRepository.saveUser(user)
  }
}

//使用例
fun main() {
  val userRepository = SQLUserRepository()
  val userService = UserService(userRepository)
  userService.processUser(1)
}

// Bad Code
class UserDatabase {
  fun getUser(id: Int): User {
    //SQLデータベースからユーザーを取得する実装
    return User(id, "John Doe")
  }

  fun saveUser(user: User) {
    //SQL データベースにユーザーを保存する実装
    println("ユーザー${user.name}を保存しました")
  }
}

class UserService {
  private val userDatabase = UserDatabase()
  fun processUser(id: Int) {
    val user = userDatabase.getUser(id)
    userDatabase.saveUser(user)
  }
}

fun main() {
  val userService = UserService()
  userService.processUser(1)
}
