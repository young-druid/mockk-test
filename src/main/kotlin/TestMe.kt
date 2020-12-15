class TestMe(private val testI: TestInterface) {
    fun someTest() = testI.testMe()
}