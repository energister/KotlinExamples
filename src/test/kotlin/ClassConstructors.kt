package i_introduction

open class A (i: Int, val l: Long) {
    constructor(j: String) : this(7, 5)
}

fun main(args: Array<String>) {
    // class might be instantiated by the primary of one of the secondary constructors
    val a1 = A("")
    val a2 = A(5, 6)

    // a.i // is not a property
    a1.l // is a property inferred from the primary constructor
}

class B : A("")  // primary constructor of descendant instantiates A through it's secondary constructor