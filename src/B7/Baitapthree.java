package B7;

import java.util.Scanner;

public class Baitapthree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời nhập chiều dài chữ nhật:");
        int chieuDai=scanner.nextInt();
        System.out.println("Mời nhập chiều rộng chữ nhật");
        int chieuRong=scanner.nextInt();
        int chuVi=(chieuDai+chieuRong)*2;
        int dienTich=(chieuDai*chieuRong);
        System.out.println("Chu vi hình chữ nhật là:"+chuVi);

        System.out.println("Diện tích hình chữ nhật là:"+dienTich);
    }
}
