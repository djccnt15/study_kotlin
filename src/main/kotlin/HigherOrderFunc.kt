import java.util.function.Predicate

fun main() {

    val numberList = listOf<Int>(1, 2, 3, 4, 5)

    val pred = object: Predicate<Int> {
        override fun test(v: Int): Boolean {
            return v % 2 == 0
        }
    }

    val pred2 = Predicate<Int> { v -> v % 2 == 0 }

    numberList.filter { it -> it % 2 == 0 }
    numberList.filter { it % 2 == 0 }
    numberList.stream().filter(pred)

    val add = { x: Int, y: Int -> x + y }
    println(add.invoke(2, 3))
    println(add(2, 3))

    val _add = fun(x: Int, y: Int): Int {
        return x + y
    }

    lambda(2, 3, _add)
}


fun lambda(x: Int, y: Int, method: (Int, Int) -> Int) {
    println(method(x, y))
}