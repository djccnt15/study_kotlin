fun main() {

    // mutable list
    val userList = mutableListOf<UserClass>()
    userList.add(UserClass("a", 1))
    userList.add(UserClass("b", 2))
    userList.add(UserClass("c", 3))

    // immutable list
    val list = listOf<UserClass>(
        UserClass("a", 1)
    )
    val list2 = listOf(
        UserClass("a", 1)
    )

    for (ele in userList) {
        println(ele)
    }

    // userList.forEach { it -> println(it) }
    userList.forEach { println(it) }

    userList.forEachIndexed { index, user -> println("index: $index, user: $user") }

    for ((index, ele) in userList.withIndex()) { println("index: $index, user: $ele") }
}