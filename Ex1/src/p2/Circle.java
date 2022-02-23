package p2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        float a = (float) (Math.PI * (number*number));
        float b = (float) ((2*Math.PI) * number);
        System.out.println("Area " + '=' + a);
        System.out.println("Perimeter "+ '=' + b);
    }
}
