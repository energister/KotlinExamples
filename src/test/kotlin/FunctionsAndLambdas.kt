/* extension function */
fun String.print() {  // extension function for the String type
    val d = this // function receiver i.e. object of the String type
    val c = get(0)  // call to the receiver. 'this' is omitted
}

private fun extensionFunctionInvocation() {
    "def".print()
}


/*
* A lambda expression or an anonymous function is a "function literal",
 * i.e. a function that is not declared, but passed immediately as an expression.
* */

/* lambda expressions */
val lambdaExpression = { s: String ->
    s.length
}
val sum1 = { x: Int, y: Int -> x + y }
val sum2: (Int, Int) -> Int = { x, y -> x + y }  // this is equivalent to the sum1

fun lambdaInvocation() {
    val length = lambdaExpression("foo")
}



/* anonymous functions */

val anonymousFunction = fun(x: Int, y: Int) = x + y

val anonymous2 = fun(x: Int, y: Int): Int {  // full syntax
    return x + y
}

// parameter types can be omitted if they can be inferred from context
val result = intArrayOf(1).filter(fun(item) = item > 0)


/* see Function Literals with Receiver */

val funLit = fun String.() {  // anonymous function with the receiver object of String type
    val d = this // funLit's receiver i.e. object of the String type
    val c = get(0)  // this is call to String::get
}

fun functionLiteralWithReceiverInvocation() {
    "abc".funLit()
}