package day30_inheritance;

public class CToyotaCorolla extends BToyota {

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit = "Corolla, dizel, benzinli ve elektrikli olabilir";

    public void motor(){
        System.out.println("Corolla araçlar TR motoru kullanır");
    }

    public void uretimYeri(){
        System.out.println("Corolla araçlar TR'de üretilir");
    }
    public static void main(String[] args) {


        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Lassa 205-55-15
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.yakit); // Corolla, dizel, benzinli ve elektrikli olabilir
        corolla.motor(); // Corolla araçlar TR motoru kullanır
        corolla.uretimYeri(); // Corolla araçlar TR'de üretilir
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.aku); // Inci akü
        corolla.guvenlik(); // Toyota'lar extra guvenlik - Toyota Class'ından gelir
        System.out.println(corolla.vites); // Tüm arabaların vitesi olur - Araba class'ından geliyor


    }
}
