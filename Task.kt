data class Task(val name: String, var isCompleted: Boolean = false)

fun main() {
  val tasks = mutableListOf<Task>()

  fun addTask(name: String) {
    tasks.add(Task(name))
    println("Task added: $name")
  }

  fun completeTask(index: Int) {
    if (index in tasks.indices) {
      tasks[index].isCompleted = true
      println("Task completed: ${tasks[index].name}")
    } else {
      println("Invalid task index")
    }
  }

  fun printTasks() {
    if (tasks.isEmpty()) {
      println("No tasks found")
    } else {
      tasks.forEachIndexed { 
        index, task -> val status = if (task.isCompleted) "Completed" else "Pending"
        println("${index + 1}. ${task.name} - $status")
       }
    }
  }

  fun printCompletedTasks() {
    val completedTasks = tasks.filter {it.isCompleted}
    if (completedTasks.isEmpty()) {
      println("No completed tasks found")
    } else {
      println("Completed Tasks:")
      completedTasks.forEach { println("-${it.name}") }
    }
  }

  fun countPendingTasks(): Int {
    return tasks.count {!it.isCompleted}
  }

  addTask("Buy groceries")
  addTask("Finish project report")
  addTask("Call Mom")

  printTasks()
  completeTask(1)
  printTasks()
  printCompletedTasks()

  val pendingTasksCount = countPendingTasks()
  println("Pending tasks count: $pendingTasksCount")
}
