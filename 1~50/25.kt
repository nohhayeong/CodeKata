class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = ArrayList<Int>()
        
        for(i in arr){
            if(i % divisor == 0) answer.add(i)
        }
        answer.sort()
        
        if (answer.count() == 0) answer.add(-1)
        
        return answer.toIntArray()
    }
}
