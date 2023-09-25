fun main() {

    // mutable list
    val userList = mutableListOf<User>()
    userList.add(User("a", 1))
    userList.add(User("b", 2))
    userList.add(User("c", 3))

    // immutable list
    val list = listOf<User>(
        User("a", 1)
    )

    for (ele in userList) {
        println(ele)
    }

    // userList.forEach { it -> println(it) }
    userList.forEach { println(it) }

    userList.forEachIndexed { index, user -> println("index: $index, user: $user") }

    for ((index, ele) in userList.withIndex()) { println("index: $index, user: $ele") }
}


class User(
    var name: String,
    var age: Int
)