// VALUES are immutable constants.
val hello: String = "Hola!"

// VARIABLES are mutable
var helloThere: String = hello
helloThere = hello + " There!"
println(helloThere)

val immutableHelloThere = hello + " There"
println(immutableHelloThere)

// Data Types

val numberOne: Int = 1
val truthL: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.1459265
val piSinglePrecision: Float = 3.13159265f
val bigNumber: Long = 123455678
val smallNumber: Byte = 127