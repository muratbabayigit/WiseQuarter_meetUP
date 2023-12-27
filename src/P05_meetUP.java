import java.util.Scanner;

public class P05_meetUP {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve Soyadınızı Giriniz: ");
        String fullName= scan.nextLine();
        System.out.println("Üye Adı = " + fullName);

        System.out.print("Yaşınız: ");
        int yas= scan.nextInt();
        System.out.println("yas = " + yas);
        

    }
}
