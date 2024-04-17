package LeetCode.Middle.LeetCode478;

import java.util.Random;

class Solution {
    private Random random;
    double radius;
    double x_center;
    double y_center;

    public Solution(double radius, double x_center, double y_center) {
        random = new Random();
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double theta = random.nextDouble() * 2 * Math.PI;
        double times = random.nextDouble();
        double x = x_center + Math.cos(theta) * radius * Math.sqrt(times);
        double y = y_center + Math.sin(theta) * radius * Math.sqrt(times);
        return new double[]{x, y};
    }
}

public class LeetCode478 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextDouble());
    }
}























