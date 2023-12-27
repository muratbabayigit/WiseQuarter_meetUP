import java.util.Scanner;

public class P09_meetUP {
    public static void main(String[] args) {
        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor
        !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı
        ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

        todo  :  Koşul kısmı
 			eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarakAA,
 			80(80dahil)   ile 90 arasında ise BA,
 			70(70 dahil)   ile 80 arasında ise BB,
 			60(60dahil) ile 70 arasında ise CB,
 			50(50 dahil) ile 60 arasında ise CC,
 			40(40 dahil) ile 50 arasında ise DC,
 			30(30 dahil) ile 40 arasında ise DD,
 			30 'dan düşük ise FF  gelmeli.

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("1.Vize Notunuz: ");
        double vizeNotu1= scan.nextDouble();
        System.out.print("2.Vize Notu: ");
        double vizeNotu2= scan.nextDouble();
        double vizeOrt=(vizeNotu1+vizeNotu2)/2;
        System.out.print("Vize Notu yüzdesini giriniz(%40 ise 0,40 giriniz): ");
        double vizeYuzde= scan.nextDouble();
        double vizekatkisi=vizeOrt*vizeYuzde;
        System.out.print("Final Notunuz: ");
        double finalNotu= scan.nextDouble();
        System.out.print("Final Notu yüzdesini giriniz(%40 ise 0,40 giriniz): ");
        double finalYuzde= scan.nextDouble();//(1-vizeYuzde)
        double finalKatkisi=finalNotu*finalYuzde;
        double yilSonuNotu=finalKatkisi+vizekatkisi;

        System.out.println("yilSonuNotu = " + yilSonuNotu);
        /*
        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarakAA,
 			80(80dahil)   ile 90 arasında ise BA,
 			70(70 dahil)   ile 80 arasında ise BB,
 			60(60dahil) ile 70 arasında ise CB,
 			50(50 dahil) ile 60 arasında ise CC,
 			40(40 dahil) ile 50 arasında ise DC,
 			30(30 dahil) ile 40 arasında ise DD,
 			30 'dan düşük ise FF  gelmeli.
         */
        if (yilSonuNotu>=90 && yilSonuNotu<=100){
            System.out.println("\nYıl Sonu Notunuz: "+yilSonuNotu+"\nHarf Karşılığı: AA");
        }else if (yilSonuNotu>=80 && yilSonuNotu<90) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: BA");
        } else if (yilSonuNotu>=70 && yilSonuNotu<80) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: BB");
        } else if (yilSonuNotu>=60 && yilSonuNotu<70) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: CB");
        } else if (yilSonuNotu>=50 && yilSonuNotu<60) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: CC");
        } else if (yilSonuNotu>=40 && yilSonuNotu<50) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: DC");
        } else if (yilSonuNotu>=30 && yilSonuNotu<40) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: DD");
        } else if ( yilSonuNotu<30) {
            System.out.println("\nYıl Sonu Notunuz: " + yilSonuNotu + "\nHarf Karşılığı: FF");
        }else{
            System.out.println("Girdiğiniz değerlerle hesaplama yapılamaz");
        }

    }
}
