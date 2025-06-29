package leetCodes

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class MainLeetCodesTest {

    private val leetCodes = SolutionsLeetCodes()

    @Test
    fun `should return a longest palindromic string`() {
        val str = "cbbd"
        val expected = "bb"

        val result = leetCodes.longestPalindrome(str)

        assertEquals(expected, result)
    }

    @Test
    fun `scenery one should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(10, 20, 22, 30,2, 5, 7, 15)
        val target = 29

        val expected = intArrayOf(2, 6)

        val result = leetCodes.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery two should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(2,10,5,3)
        val target = 13

        val expected = intArrayOf(1,3)

        val result = leetCodes.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery three should return the indices of two number where the result is target with array unsorted`() {
        val nums = intArrayOf(4,3,1,10,17, 7)
        val target = 17

        val expected = intArrayOf(3, 5)

        val result = leetCodes.twoSumUnsorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery one should return the indices of two number where the result is target with array sorted`() {
        val nums = intArrayOf(2, 5, 7, 15)
        val target = 9

        val expected = intArrayOf(0,2)

        val result = leetCodes.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery two should return the indices of two number where the result is target with array sorted`() {
        val nums = intArrayOf(2,3,5,10)
        val target = 13

        val expected = intArrayOf(1,3)

        val result = leetCodes.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `scenery three should return the indices of two number where the result is target  with array sorted`() {
        val nums = intArrayOf(2,3,4)
        val target = 7

        val expected = intArrayOf(1,2)

        val result = leetCodes.twoSumSorted(nums, target)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return a sequence of fibonacci`(){
        val n = 19

        val result = leetCodes.fibonacciSequence(n)

        val expected = intArrayOf(0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181)

        assertArrayEquals(expected, result)
    }

    // 70. Climbing Stairs, case one
    @Test
    fun `should return steps for climb to top, case one`(){
        val stairs = 3

        val result = leetCodes.climbStairs(stairs)

        val expected = 3

        assertEquals(expected, result)
    }

    // 70. Climbing Stairs, case two
    @Test
    fun `should return steps for climb to top, case two`(){
        val stairs = 2

        val result = leetCodes.climbStairs(stairs)

        val expected = 2

        assertEquals(expected, result)
    }

    // 70. Climbing Stairs, case three
    @Test
    fun `should return steps for climb to top, case three`(){
        val stairs = 6

        val result = leetCodes.climbStairs(stairs)

        val expected = 13

        assertEquals(expected, result)
    }

    // 509. Fibonacci Number
    @Test
    fun `should return fibonacci f(n)`() {
        val n = 2

        val result = leetCodes.fib(n)

        val expected = 1

        assertEquals(expected, result)
    }

    // 509. Fibonacci Number case two
    @Test
    fun `should return fibonacci f(n), case two`() {
        val n = 4

        val result = leetCodes.fib(n)

        val expected = 3

        assertEquals(expected, result)
    }

    // 509. Fibonacci Number case three
    @Test
    fun `should return fibonacci f(n), case three`() {
        val n = 8

        val result = leetCodes.fib(n)

        val expected = 21

        assertEquals(expected, result)
    }
}