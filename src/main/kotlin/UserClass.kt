class UserClass(
    var name: String? = null,
    var age: Int? = null
) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}