// Good Code
interface Animal {
  fun makeSound(): String
}

class Dog: Animal {
  override fun makeSound() = "Bark"
}

class Cat: Animal {
  override fun makeSound() = "Meow"
}

fun printAnimalSound(animal: Animal) {
  println(animal.makeSound())
}

fun main() {
  val dog: Animal = Dog()
  val cat: Animal = Cat()
  printAnimalSound(dog)
  printAnimalSound(cat)
}

//Bad Code
fun printAnimalSound(animalType: String) {
  if (animalType == "Dog") {
    println("Bark")
  } else if (animalType == "Cat") {
    println("Meow")
  } else {
    println("Unknown animal")
  }
}

fun main() {
  printAnimalSound("Dog")
  printAnimalSound("Cat")
}
