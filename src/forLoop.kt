fun main(args: Array<String>) {
    val myData = Mydata()
    myData.iterator()
    for (data in myData) {
        println(data)
    }

}

class MyIt {
    val data = listOf(1,2,3,4,5)
    var idx = 0
    operator fun hasNext() : Boolean {
        return data.size >idx
    }
    operator fun next() : Int {
        return data[idx++]
    }
}

class Mydata {
    operator fun iterator() : MyIt {
        return MyIt()
    }
}