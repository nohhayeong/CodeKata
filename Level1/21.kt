class Solution {
    fun solution(x: Int): Boolean {
        var num = x
        var sum = 0
        
        while(num!=0){
            sum += num%10
            num/=10
        }
        
        return x%sum==0        
    }
}
