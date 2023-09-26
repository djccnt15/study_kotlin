fun main() {
    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunc(a)
    callFunc(b)
    callFunc(c)
    callFunc(d)
}


// Elvis Operation
fun callFunc(i: Int?) {
    // 변수? -> null 값이 올 수 있음
    // 변수?. -> 변수가 null이 아닐 때
    // 변수?: -> 변수가 null일 때
    i?.let {
        println(it)
    } ?: run {
        println("null")
    }

    val temp = if (i == null) "null" else i
    println(temp)

    val temp1 = i ?: "null"
    println(temp1)
}