package day26_LocalTimeVarArgs;

import java.util.Arrays;

public class C04_VarArgs {
    public static void main(String[] args) {
        topla(1);
        topla(1,2);
        topla(1,2,3);
        topla(1,2,3,4);
        topla(1,2,3,4,5);
        topla(1,2,3,4,5,6);

    }

    public static void topla(int... a) {
        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each: a
             ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);
    }

    /*

        Java'da bir metotu çağırabilmek için metotun parametrelerine uygun parametreleri atamalıyız

        Orneğin 2 int parametre varsa
        sadece 2 int parametre girerek metot call yapabiliriz

        Java aynı data türüne sahip olmak şartıyla varargs yöntemiyle
        Bir metotta ... yazarak istenildiği kadar parametre ile metot oluşturabilmemizi sağlıyor

        Varargs yöntemi ARRAY altyapısını kullanarak işlem yapıyor. Bu durumda parametre sayısı esnek tutuluyor



     */
}
