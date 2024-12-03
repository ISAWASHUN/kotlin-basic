

import java.io.FileNotFoundException//Good Code
fun readFileContent(filePath: String): Result<String> = runCatching {
  File(filePath).readText()
}.onFailure { exception ->
  println("ファイルの読み込みに失敗しました: ${exception.message}")
}


fun main() {
  val result = readFileContent("example.txt")
  result.fold(
    onSuccess { content ->
      println("ファイルの内容: $content")
     },
    onFailure { exception -> 
      println("エラーが発生しました: ${exception.message}")
     }
  )
}

// Bad Code
// 悪い例: try-catchを使用した冗長な実装
fun readFileContent(filePath: String): String {
  try {
    val file = File(filePath)
    return file.readText()
  } catch (e: FileNotFoundException) {
    println("ファイルが見つかりませんでした: ${e.message}")
    throw e
  } catch(e: IOException) {
    println("ファイルの読み込みエラー: ${e.message}")
    throw e
  } catch(e: Exception) {
    println("予期せぬエラー: ${e.message}")
    throw e
  }
}

fun main() {
  try {
    val content = readFileContent("example.txt")
    println("ファイルの内容: $content")
  } catch(e: Exception) {
    println("エラーが発生しました: ${e.message}")
  }
}
