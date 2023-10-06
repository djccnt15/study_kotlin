fun main() {

    val userDto = UserDto("").run {
        name = "asdf"
        "empty"
    }

    println("result $userDto")

    val x = 10
    val sum = run {
        val x = 2
        val y = 3
        x + y
    }

    println(sum)
}