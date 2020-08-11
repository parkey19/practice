
fun main(args: Array<String>) {


    println(whenTest(10))
    println(whenElseExclude(false))
}

fun whenTest(x: Int): String {
    return when (x) {
        100 -> "A"
        90 -> "B"
        80 -> "C"
        else -> "F"
    }
}

fun whenElseExclude(x: Boolean): String {
    return when (x) {
        true -> "O"
        false -> "땡"
    }
}