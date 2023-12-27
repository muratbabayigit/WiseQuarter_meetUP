import java.util.Scanner;

public class P06_meetUP {
    /*
    Kullanıcıdan üçgenin kenar uzunluklarını alan ve eşkenar üçgen ise
    eşkenar üçgen yazdıran, değilse eşkenar üçgen değil yazdıran bir app yazınız
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgeninizin kenar uzunluklarını giriniz");
        System.out.print("Kenar1: ");
        double kenar1= scan.nextDouble();
        System.out.print("Kenar2: ");
        double kenar2= scan.nextDouble();
        System.out.print("Kenar3: ");
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){ //&& ile bağlanan iki farklı koşulun her ikisinin de doğru olması gerekir
            System.out.println("Üçgeniniz bir eşkenar üçgendir.");
        }else{
            System.out.println("Üçgeniniz bir eşkenar üçgen değildir.");
        }
    }
}
