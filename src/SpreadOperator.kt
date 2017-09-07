import org.junit.Assert
import org.junit.Test

class SpreadOperator {
    @Test
    fun passingArrayAsPartOfVarargsWithSpreadOperator() {
        val array = intArrayOf(1, 2, 3)

        Assert.assertArrayEquals(intArrayOf(0, 1, 2, 3, 4), intArrayOf(0, *array, 4))
    }

    @Test
    fun passingArrayWithSpreadOperator() {
        val argument = foo(strings = *arrayOf("a", "b", "c"))

        Assert.assertArrayEquals(arrayOf("a", "b", "c"), argument)
    }

    @Test
    fun passingArrayToVarargsParameterWithoutSpreadOperator() {
        val array = arrayOf("a", "b", "c")
        // val argument = foo(array) // compilation error: Type mismatch: inferred type is Array<String> but String was expected
    }

    private fun foo(vararg strings: String): Array<out String> = strings
}