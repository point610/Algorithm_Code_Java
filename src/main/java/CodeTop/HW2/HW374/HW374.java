//package CodeTop.HW2.HW374;
//
//import LeetCode.Easy.LeetCode374.GuessGame;
//
///**
// * Forward declaration of guess API.
// *
// * @param num your guess
// * @return -1 if num is higher than the picked number
// * 1 if num is lower than the picked number
// * otherwise return 0
// * int guess(int num);
// */
//
//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//
//        int left = 0;
//        int right = n;
//        while (left <= right) {
//            long mid = left + (right - left) / 2;
//            int temp = guess((int) mid);
//            if (temp == 0) {
//                return (int) mid;
//            } else if (temp == 1) {
//                left = (int) (mid + 1);
//            } else if (temp == -1) {
//                right = (int) (mid - 1);
//            }
//        }
//        return -1;
//    }
//}
//
//public class HW374 {
//}
