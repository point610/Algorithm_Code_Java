package CodeTop.HW2.HW345;

class Solution {
    public String reverseVowels(String s) {

        char[] list = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !is(list[left])) {
                left++;
            }
            while (left < right && !is(list[right])) {
                right--;
            }
            swap(list, left, right);
            left++;
            right--;
        }
        return new String(list);
    }

    private boolean is(char one) {
        return
                one == 'a' || one == 'e' || one == 'i' || one == 'o' || one == 'u' ||
                        one == 'A' || one == 'E' || one == 'I' || one == 'O' || one == 'U';
    }

    private void swap(char[] list, int one, int two) {
        char temp = list[one];
        list[one] = list[two];
        list[two] = temp;
    }
}

public class HW345 {
    public static void main(String[] args) {

    }
}
