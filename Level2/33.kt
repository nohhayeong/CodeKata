//약수의 개수와 덧셈

class Solution {
    fun solution(left: Int, right: Int): Int {
        var sum = 0
        
        for(num in left..right){
            if(isEven(num)) sum += num
            else sum -= num
        }
        return sum
    }
    
    fun isEven(num:Int): Boolean {
        var divisor = 0
        
        for(i in 1..num){
            if(num%i==0) divisor++
        }
        
        return if(divisor%2==0) true
        else false
    }
}
