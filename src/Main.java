import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,total = 0;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.print("Bir Çift Sayı Giriniz: ");
            n = inp.nextInt();
            if(n%4==0){
                total+=n;
            }
        }
        while (n%2!=1);
        System.out.println("Toplam: " + total);

    }
}