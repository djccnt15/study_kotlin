fun main() {
    val user = ExamUser(name = "asdf")

    baseMethod(user)
}

fun baseMethod(examUser: ExamUser?) {
//    examUser?.let {
//        if (it.name.isNotNullOrBlank()) {
//            println(it.name)
//        }
//    }

    if (examUser.isNotNull() && examUser?.name.isNotNullOrBlank()) {
        println(examUser?.name)
    }
}

data class ExamUser(
    var name: String ?= null
)

fun String?.isNotNullOrBlank(): Boolean {  // 확장 함수, Extension Method
    return !this.isNullOrBlank()
}

fun Any?.isNotNull() : Boolean {
    return this != null
}