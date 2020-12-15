import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestMeTest {

    private val testI = mockk<TestInterface>()

    private val toTest = TestMe(testI)

    @Test
    fun `some test`() {
        every { testI.testMe() } returns "test"
        val result = toTest.someTest()
        assertEquals("test", result)
        verify(exactly = 1) { testI.testMe() }
    }
}