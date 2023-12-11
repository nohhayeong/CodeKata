class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0.0
        var count = 0
        
        for(i in numbers){
            sum += i
            count++
        }
        return sum/count
    }
}
