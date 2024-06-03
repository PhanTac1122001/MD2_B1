package B10;

import java.util.Scanner;

public class Baitapsix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời nhập điểm toán:");
        float toan=Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập điểm Anh:");
        float anh=Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập điểm Văn:");
        float van=Float.parseFloat(scanner.nextLine());

        float trungBinh= (toan+van+anh)/3;
        System.out.printf("Điểm trung bình: %f",trungBinh);
    }
}
