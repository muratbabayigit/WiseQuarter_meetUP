import java.util.Arrays;

public class P11_meetUP {
/*
Bize verilen ve int değerler içeren bir array'in
her bir elemanını 3 arttırarak yeni bir array oluşturan
ve bu array'i bize döndüren bir uyg. yazınız
 */

    public static void main(String[] args) {


    int [] arr={1,3,7,56,123,197,227};
      System.out.println("Array'in İlk Hali: "+ Arrays.toString(arr));
    int [] yeniArr=new int[arr.length];

    
    //Bu kısımda her bir elemana ulaşmak için java'da döngülerden yararlanırız.
        // Eğer sabit aralıklı bir döngü olacaksa for döngüsü kullanılır
        // Eğer döngü sabit değilse while döngüsü kullanılır

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i]+3;
            
        }
        arr=yeniArr;
        System.out.println("Array'in ham hali:" +Arrays.toString(arr));
        System.out.println("Array'in Son Hali: "+Arrays.toString(yeniArr));




    }

}
