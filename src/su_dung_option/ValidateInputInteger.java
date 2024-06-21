package su_dung_option;

import java.util.Optional;
import java.util.Scanner;

public class ValidateInputInteger {
    public static void main(String[] args) {
        int number = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("nhap vao 1 so nguyen: ");
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Phai nhap vao la so");
//                e.printStackTrace();
            }
        }
        System.out.println(number);
    }
}
