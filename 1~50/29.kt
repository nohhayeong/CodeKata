class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        var minValue = arr[0]
        
        for(i in arr){
            if(i < minValue) minValue = i
        }
        
        answer.remove(minValue)
        if(answer.size == 0) answer.add(-1)
        
        return answer.toIntArray()
    }
}
