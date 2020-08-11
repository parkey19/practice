
fun main(args: Array<String>) {
    println("hello")
    var a: Int = 1000
    var b: Int? = 1000
    print(a === b) //true 타입비교
    print(" ")
    print(a == b) //false 값 비교

    println("------")

    val array: Array<String> = arrayOf("kotlin", "java")

    println(array[0])
    println(array.size)
    println(array.get(1))

    val sentence: String = """
        hahaha
        hahahah
        hoho
    """.trimIndent()
    println(sentence)
    println("----")
}



