import java.lang.Math;

class Solution {
    public boolean isPowerOfFour(int n) {
    if (n == 1)
    {
        return true;
    }
    if ((Math.log(n)/Math.log(4))%1 == 0)
    {
        return true;
    }    
    else
    {
        return false;
    }
    }
}
