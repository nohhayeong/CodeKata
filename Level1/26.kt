class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum: Int = 0
        
        for((idx, i) in absolutes.withIndex()){
            when(signs[idx]){
                true -> sum += i
                false -> sum -= i
            }
        }
        return sum
    }
}
