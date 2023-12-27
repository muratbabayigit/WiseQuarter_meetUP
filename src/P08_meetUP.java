import java.util.Scanner;

public class P08_meetUP {
    public static void main(String[] args) {
        /*
        Alışverişte alınan ürünün fiyatını ve adedini alıp,
        müşteri kartı varsa %10 indirim yapıp, yoksa
        indirimsiz olarak fiyatı veren bir kod dizesi yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Aldğınız ürün fiyatını ve adedini sıraya giriniz");
        System.out.print("Ürün Fiyatı: ");
        double fiyat= scan.nextDouble();
        System.out.print("Satın alınan adet: ");
        int adet= scan.nextInt();
        double tutar=fiyat*adet;
        System.out.println("Müşteri kartınız var mı? (E/H)");
        String giris= scan.next();
        String kart=giris.toLowerCase();

        if (kart.equals("e")){
            tutar=tutar*(0.90);
            System.out.println("Alışveriş Tutarı: "+tutar);
        }else{
            System.out.println("Alışveriş Tutarı: "+tutar);
        }
    }
}
