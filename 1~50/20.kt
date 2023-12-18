class Solution {
    fun solution(n: Long): Long {
        var num:Long = n
        var numList = arrayListOf<Long>()
        var answer = ""
        
        while(num!=0L){
            numList.add(num%10)
            num/=10
        }
        
        numList.sortDescending()
        
        for(i in numList){
            answer += "$i"
        }
        
        return answer.toLong()
    }
}
