//방법1
class Solution {
    fun solution(s: String): Int {
        return if(s[0]=='-') -1 * s.substring(1).toInt()
        else if(s[0]=='+') s.substring(1).toInt()
        else s.toInt()
    }
}

//방법2
class Solution {
    fun solution(s: String): Int = s.toInt()
}
