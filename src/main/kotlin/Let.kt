import java.time.LocalDateTime
import kotlin.streams.toList

fun main() {

//    val now: LocalDateTime? = null
    val now: LocalDateTime? = LocalDateTime.now()

    val kst = now?.let { localDateTime: LocalDateTime ->
        println("let scope $localDateTime")
        ""
    }?: LocalDateTime.now()

    println("result $kst")

    UserDto(name = "asdf").let {
        logic(it)
    }

    val userDtoList = listOf(UserDto("asdf"), UserDto("qwer"))

    val responseList = userDtoList.stream()
        .map { it ->
            UserResponse(
                userName = it.name
            )
        }.toList()

    println(responseList)
}

fun logic(userDto: UserDto?): UserResponse? {
    val response = userDto?.let {userDto ->
        println("dto $userDto")

        UserEntity(
            name = userDto.name
        )  // 마지막 줄이 자동으로 반환됨
    }?.let {
        println("entity $it")

        UserResponse(
            userName = it.name
        )  // 마지막 줄이 자동으로 반환됨
    }
    return response
}