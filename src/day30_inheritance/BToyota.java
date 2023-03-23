package day30_inheritance;

public class BToyota extends Araba {

    String marka = "Toyota";
    String aku = "Inci akü";
    String lastik = "Lassa";


    public void motor(){
        System.out.println("Toyota'lar çevreci motorlar kullanır");
    }

    public void guvenlik(){
        System.out.println("Toyota'lar extra guvenlik");
    }

}
