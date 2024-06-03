package B6;

import java.util.Scanner;

public class Baitaptwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rate=23000;
        System.out.println("Mời bạn nhập giá USD:");
        int usd= scanner.nextInt();
        System.out.println("Giá USD:"+usd);

        System.out.println("Giá VND:"+(usd*rate));

    }
}
