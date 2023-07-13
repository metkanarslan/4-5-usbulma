import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,sayac=0;
        System.out.print("Sayi Giriniz : ");
        n=inp.nextInt();
        for(int i=1,j=1; i<=n; i*=4,j*=5) {
            System.out.println("4'ün "+sayac+". kuvveti: "+i);
            if(j<=n) {
                System.out.println("5'in " + sayac + ". kuvveti: " + j);
            }
            sayac++;
        }

    }

}
