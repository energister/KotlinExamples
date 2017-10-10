import org.junit.Assert.assertEquals
import org.junit.Test

class TemplateSignEscapingInStrings {
    @Test
    fun templateInRawString() {
        val price = """${'$'}9.99"""

        assertEquals("$9.99", price)
    }

    @Test
    fun templateSignInRawString() {
        val price = """$9.99"""

        assertEquals("$9.99", price)
    }

    @Test
    fun templateSignWithLettersInRawString() {
        val price = """${'$'}abc"""

        assertEquals("\$abc", price)
    }
}
