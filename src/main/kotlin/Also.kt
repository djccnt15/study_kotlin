fun main() {

    val userDto = UserDto(
        name = "asdf"
    ).also { dto: UserDto ->
        println(dto)

        UserDto(
            "qwer"
        )
    }  // 받았던 객체를 그대로 반환함

    println("result: $userDto")
}