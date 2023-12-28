import java.util.Arrays;

public class P13_meetUP {
    public static void main(String[] args) {

        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $2 $24 £32 $7 £40 $23 £2 £65 $134 £4 ";
         */

        String str = "$1 $2 $24 £32 $7 £40 $23 £2 £65 $134 £4 $128 £10";
        String arr[]= str.split(" "); //split metodu ile tüm elemanlnarı bir özelliğe göre birbirinden ayırıp
                                            // oluşturlan array'e eleman olarak ekleyen bir kod

        System.out.println(Arrays.toString(arr));
        int dolarToplam=0;
        int sterlinToplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarToplam+=Integer.parseInt(arr[i].replace("$",""));
            }else{
                sterlinToplam+=Integer.parseInt(arr[i].replace("£",""));
            }
        }

        System.out.println("dolarToplam = " + dolarToplam+"$");
        System.out.println("sterlinToplam = " + sterlinToplam+"£");









    }
}
