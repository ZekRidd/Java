package day28_deneme;

import day28_AccessModifier_encapsulation.C03_EncapsuleDatas;

public class EncapsulationUses {
    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatas.getIsim()); // Yıldız Pazarlama

        C03_EncapsuleDatas obj = new C03_EncapsuleDatas();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println(obj.toplamSatis); // 600

    }
}

/*

C03_EncapsuleDatas class'ındaki isim variable'nın değeri görünsün
Ama değiştirelemesin

Satiş tutarına ise değer girilebilsin ama sonradan girilen değerler değiştirelemesin

Eğer bir variable için read veya write özellklerinin birbirinden ayrılması isteniyorsa
öncelikle access modifier ile hiçkimsenin ulaşmamasını sağlarız

private yaparak kimsenin ulaşamayacağını garantiye aldıktan sonra

READ yetkisi vermek istediklerimiz için getter() metotu
WRITE yetkisi vermek istediklerimiz için setter() metotu oluşturmalıyız.
 */