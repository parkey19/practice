import test.pkg.add

fun main(args: Array<String>) {
//    println(add(1,2))

    val ints = listOf(0, 1, 2, 3)
    println("---------------- 1인 경우만 리턴 후 나머지 수행 - anonymous function")
    ints.forEach(fun(it: Int) {
        //  1인 경우만 리턴 후 나머지 수행 - 명시적
        if (it == 1) return
        println(it)
    })
    println("---------------- 1인 경우만 리턴 후 나머지 수행 - 명시적 레이블")
    ints.forEach lable@ {
        //  1인 경우만 리턴 후 나머지 수행 - 명시적
        if (it ==  1) return@lable
        println(it)
    }
    println("---------------- 1인 경우만 리턴 후 나머지 수행 - 암시적 레이블")
    ints.forEach {
        //  1인 경우만 리턴 후 나머지 수행 - 암시적
        if (it ==  1) return@forEach
        println(it)
    }

    println("---------------- 람다 안에서 리턴하면 foreach 종료")

    ints.forEach {
        // 람다 안에서 리턴하면 foreach 종료
        if (it ==  1) return
        println(it)
    }




}