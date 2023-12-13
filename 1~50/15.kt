class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = n 
        
        while(num > 1){
            if(n%num==1) answer = num
            num--
        }
        
        return answer
    }
}
