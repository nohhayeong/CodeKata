class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = ArrayList<Long>(n)
        
        for(i in 1..n){
            answer.add(x.toLong()*i)
        }
        
        return answer.toLongArray()
    }
}
