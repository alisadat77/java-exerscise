package p6;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float s = (float) ((a+b+c)/2.0);
        if (a+b>c & a+c>b & b+c>a)
            System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        else
            System.out.println("No");
    }
}
