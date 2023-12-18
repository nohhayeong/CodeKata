class Solution {
    fun solution(seoul: Array<String>): String {
        var idx = 0
        
        for((i, str) in seoul.withIndex()){
            if(str == "Kim"){
                idx = i
                break
            }
        }
        
        return "김서방은 ${idx}에 있다"
    }
}
