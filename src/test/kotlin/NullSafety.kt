class A

private fun initializeObjectVariableWithNull() {
    // val a: A = null  // compilation error: Null can not be a value of a non-null type A
    val a: A? = null
}