import java.util.Scanner;

public class minmaxhesaplama{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int max = 0, min = 0;
        System.out.print("Girmek istediğiniz sayı adedini yazınız: ");
        n = input.nextInt();
        for (int k = 1; k <= n; k++) {
            System.out.print(k + ".sayıyı girin");
            int number = input.nextInt();
            if (number > max) {
                max=number;


            }
            if (number < max) {
                min=number;

            }


        }
        System.out.println("en bğyğk sayı: " + max);
        System.out.print("en küçük sayı: " + min);
    }























        }




















//www.patika.dev



































































