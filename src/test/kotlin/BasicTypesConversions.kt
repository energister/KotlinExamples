import org.junit.Assert.assertEquals
import org.junit.Test

class BasicTypesConversions {
    @Test
    fun explicitConversionSmallerTypeIntoBiggerType() {
        val b: Byte = 1
        var i: Int = b.toInt()
        assertEquals(1, i)
    }

    @Test
    fun explicitConversionBiggerTypeIntoSmallerType() {
        val d = 5.6
        val i = d.toInt();
        assertEquals(5, i)
    }

    @Test
    fun explicitConversionCharToInt() {
        assertEquals(53, '5'.toInt())
    }
}