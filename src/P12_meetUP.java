import java.util.Arrays;

public class P12_meetUP {
    public static void main(String[] args) {
        /*
         * Verilen bir Array'in elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari
         * yazdıran bir java programi yazin
         */


        int [] arr={1,3,5,14,56,12,2,78,135,11,6,23,58,42,25,36};

        int toplam=0, ortalama=0;


        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("toplam = " + toplam);

        ortalama=toplam/ arr.length;
        System.out.println("ortalama = " + ortalama);

        Arrays.sort(arr);

        Arrays.toString(arr);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(" "+arr[i]);
            }
        }








    }
}
