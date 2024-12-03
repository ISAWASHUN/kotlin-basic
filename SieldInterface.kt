// Good Code
sealed interface Shape

data class Circle(val radius: Double): Shape
data class Rectangle(val width: Double, val height: Double): Shape

fun describeShape(shape: Shape): String = when (shape) {
  is Circle -> "Circle with radius ${shape.radius}"
  is Rectangle -> "Rectangle with width ${shape.width} and height ${shape.height}"
}

// Bad Code

interface Shape

data class Circle(val radius: Double): Shape
data class Rectangle(val width: Double, val height: Double): Shape
data class Triangle(val base: Double, val height: Double): Shape

fun describeShape(shape: Shape): String = when (shape) {
  is Circle -> "Circle with radius ${shape.radius}"
  is Rectangle -> "Rectangle with width ${shape.width} and height ${shape.height}"
  is Triangle -> "Triangle with base ${shape.base} and height ${shape.height}"
}

