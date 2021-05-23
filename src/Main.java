import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        int count = in.nextInt();

        int max, min, i=2;
        System.out.print("1. sayıyı giriniz: ");
        int y = in.nextInt();
        max =y;
        min =y;
        while (i<=count){
            System.out.print(i+". sayıyı giriniz: ");
            int x = in.nextInt();
            if (x>max){
                max = x;
            } else if (x<min){
                min =x;
            }
            i++;
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
