

import java.time.Period

//Good code
infix fun Int.days(direction: TimeDirection): Period {
  return Period.ofDays(this * direction.multiplier)
}

enum class TimeDirection(val multiplier: Int) {
  AGO(-1),
  FORM_NOW(1)
}

// val period = 5 days AGO
println("${period.days}日前")

//Bad Code
fun daysAgo(days: Int): Period {
  return Period.ofDays(-days)
}

fun daysFromNow(days: Int): Period {
  return Period.ofDays(days)
}

val period = daysAgo(5)
println(period.days.toString() + "日前")
