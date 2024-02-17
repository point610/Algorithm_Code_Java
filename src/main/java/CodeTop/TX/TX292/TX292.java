package CodeTop.TX.TX292;

class Solution {
    public boolean canWinNim(int n) {
        //自己先手，若为4，则对手获胜
        return n % 4 != 0;
    }
}

public class TX292 {
}
