open class Animal(val name: String, var age: Int) {
  open fun makeSound() {
    println("The animal makes a sound")
  }
}


class Dog(name: String, age: Int, var breed: String): Animal(name, age) {
  override fun makeSound() {
    println("The do barks")
  }

  fun fetch() {
    println("The dog fetches a ball")
  }
}

class Cat(name: String, age: Int, var color: String): Animal(name, age) {
  override fun makeSound() {
    println("The cat meows")
  }

  fun sleep() {
    println("The cat sleeps")
  }
}

data class Person(val name: String, var age: Int) {
  fun greed() {
    println("Hello, my name is $name and I'm $age years old")
  }
}

fun main() {
  val dog = Dog("Buddy", 3, "Labrador")
  val cat = Cat("Whiskers", 5, "Orange")
  val person = Person("Alice", 25)

  dog.makeSound()
  dog.fetch()

  cat.makeSound()
  cat.sleep()

  person.greed()

  val dog2 = Dog( "Buddy" , 3 , "Labrador" ) 
  val cat2 = Cat( "Whiskers" , 5 , "Black" )
  
  println(dog == dog2)
  println(cat == cat2)
  
  val person2 = Person( "Alice" , 25 ) 
  println(person == person2)
}
