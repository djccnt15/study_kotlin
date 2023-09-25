fun main() {
    val map = mapOf<String, Any>(
        Pair("key1", "value1"),
        "key2" to "value2"
    )

    val mutableMap = mutableMapOf<String, Any>(
        Pair("key1", "value1"),
        "key2" to "value2"
    )
    mutableMap.put(key = "key3", value = "value3")
    mutableMap["key4"] = "value4"
    val value1 = mutableMap.get(key = "key3")
    val value2 = mutableMap["key4"]

    val hashMap = hashMapOf<String, Any>()
}