fun main() {
    val dog = Dog("happy")

    dog.bark()
    dog.eat()

    println(dog.age)
    dog.age = 20
    println(dog.age)
}

interface Bark {
    fun bark()
}

interface Tmp{
    fun hi()
}

abstract class Animal(
    private val name: String? = ""
): Bark {
    fun eat() {
        println("$name: starting to eat")
    }
}

class Dog(
    private val name: String? = null,
    var age: Int? = 0
): Animal(name), Tmp {

    override fun bark() {
        println("$name: bark")
    }

    override fun hi() {
        println("Hi~")
    }
}