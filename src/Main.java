import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sayırları  küçükten büyüğe sıralamak için aşağıya 3 farklı sayı giriniz.!");
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayınızı Giriniz :");
        a = input.nextInt();
        System.out.print("2. Sayınızı Giriniz :");
        b = input.nextInt();
        System.out.print("3. Sayınızı Giriniz :");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                    System.out.print("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c){
                System.out.println("b < a < c");
            }else{
                System.out.println("b < c < a");
            }
            
        }else {
            if ( a < b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }
    }
}