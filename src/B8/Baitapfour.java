package B8;

import java.util.Scanner;

public class Baitapfour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập số:");
        int a=scanner.nextInt();
        int binhPhuong=a*a;
        int lapPhuong=a*a*a;
        System.out.println("Bình Phương:"+binhPhuong);
        System.out.println("Lập Phương:"+lapPhuong);
    }
}
