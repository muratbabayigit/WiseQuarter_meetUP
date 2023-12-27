import java.util.Scanner;

public class P07_meetUP {
    public static void main(String[] args) {

        /*
        Kullanıcıdan gün ismini girmesini isteyen ve girdiği günü kontrol edip,
        Pazartesi,salı, çarşamba, perşembe ve cuma ise Haftaiçi-İyi çalışmalar
        Cumartesi veya Pazar ise Haftasonu- İyi tatiller yazdıran kod diesini yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bugün günlerden hangi gün?: ");
        String giris=scan.next();
        String gun=giris.toLowerCase();
        if(gun.equals("cumartesi")||gun.equals("pazar")){// Bu || operatörü veya anlamı taşır. İki koşuldan birinin doğru olması yeterlidir.
            System.out.println("Hafta Sonu - İyi Tatiller"); // sayısal verilerle işlem yapılırken == oprtatörü,
                                                            // bu operatörün sağının soluna eşit olduğun ifade eder.
                                                            // String(metinsel) ifadelerde ise eşitlik için gun.equals(giris) ifadesi
                                                            //giriş verisinin gün verisine eşit olduğunu ifade eder
        }else if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("çarşamba")||gun.equals("perşembe")||gun.equals("cuma")){
            System.out.println("Hafta İçi - İyi çalışmalar");
        }else{
            System.out.println("yanlış giriş yaptınız.");
        }

    }
}
