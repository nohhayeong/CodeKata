class Solution {
    fun solution(arr: IntArray): Double {
        var sum = 0.0
        for(i in arr){
            sum += i
        }
        return sum/arr.count()
    }
}
