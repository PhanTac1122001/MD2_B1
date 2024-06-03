package B3;

import java.util.Scanner;

public class PraticeThree {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is: "+area);
    }
}
