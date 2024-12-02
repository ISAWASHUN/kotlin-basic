// Good Code
@JvmInline
value class UserId(val id: String)

@JvmInline
value class ProductId(val id: String)

fun getUserById(userId: UserId): String {
  return "User with ID: ${userId.id}"
}

fun getProductById(productId: ProductId): String {
  return "Product with ID: ${productId.id}"
}

val userId = UserId("user123")
val productId = ProductId("product456")
println(getUserById(userId))
println(getProductById(productId))
