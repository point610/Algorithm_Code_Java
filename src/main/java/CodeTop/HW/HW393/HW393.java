package CodeTop.HW.HW393;

/**
 * @ClassName HW393
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 18:54
 * @Version 1.0
 */
class Solution {
    private boolean isone(int one) {
        return (one >> 7) == 0;
    }

    private boolean istwo(int one, int two) {
        return ((one >> 5)) == 6 && ((two >> 6)) == 2;
    }

    private boolean isthree(int one, int two, int three) {
        return ((one >> 4)) == 14 && ((two >> 6)) == 2 && ((three >> 6)) == 2;
    }

    private boolean isfour(int one, int two, int three, int four) {
        return ((one >> 3)) == 30 && ((two >> 6)) == 2 && ((three >> 6)) == 2 && ((four >> 6)) == 2;
    }

    private boolean one(int one) {
        return (one >> 7) == 0;
    }

    private boolean two(int one) {
        return (one >> 5) == 6;
    }

    private boolean three(int one) {
        return (one >> 4) == 14;
    }

    private boolean four(int one) {
        return (one >> 3) == 30;
    }


    public boolean validUtf8(int[] data) {
        int size = data.length;

        int index = 0;
        while (index < size) {
            if (one(data[index])) {
                index++;
            } else if (two(data[index])) {
                if (index + 1 < size) {
                    if (istwo(data[index], data[index + 1])) {
                        index += 2;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (three(data[index])) {
                if (index + 2 < size) {
                    if (isthree(data[index], data[index + 1], data[index + 2])) {
                        index += 3;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (four(data[index])) {
                if (index + 3 < size) {
                    if (isfour(data[index], data[index + 1], data[index + 2], data[index + 3])) {
                        index += 4;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

public class HW393 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validUtf8(new int[]{255}));
        System.out.println(solution.validUtf8(new int[]{235, 140, 4}));
        System.out.println(solution.validUtf8(new int[]{197, 130, 1}));
    }
}
