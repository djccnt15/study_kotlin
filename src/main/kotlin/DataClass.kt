fun main() {
    val user = UserClass(null, 10)
    println(user)

    val user2 = UserClass()
    user2.name = "dj"
    user2.age = 10
    println(user2)

    val userData = UserDataClass()
    userData.name = "a"
    userData.age = 1
    println(userData)

    val userData2 = userData.copy(name = "b")  // named arguments
    println(userData2)
}