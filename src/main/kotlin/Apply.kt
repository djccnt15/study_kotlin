fun main() {
    // 확장 함수 람다

    val userDto = UserDto().apply {
        this.name = "asdf"
        name = "asdf"
    }  // 생성자 패턴

    println(userDto)
}