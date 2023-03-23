package day31_inheritance;

public class Hemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler min 10000 TL maaş alır");
    }

    public void ozelSigorta(){
        System.out.println("Hemsireler aylık 300 Tl özel sigorta yapılır");
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire = new Hemsire();
        hemsire.method();
    }
    public void method(){

        Hemsire hemsire = new Hemsire();
        System.out.println(hemsire.unvan); // Hemsire yazdırır
        System.out.println(this.unvan); // Bu class'da yer alan unvanı getirir // Hemsire yazdırır
        System.out.println(super.unvan); // Parent class'daki ünvanı arar, ilk bulduğunu yazdırır
        System.out.println(this.sgkNo); // // Bu class'da yok ama extends olduğu için parents class'ı da kontrol eder, bu önce içinde bulunduğu class'a bakar
        System.out.println(super.sgkNo); // Direk parents class'a gider arar, ilk bulduğu parent class'dakini getirir
        this.standartMaas(); // 10000
        this.fazlaMesai(3); // 600
        this.fazlaMesai(4); // 800
        this.ozelSigorta(); // 300tl
        super.ozelSigorta(); // Özel sigorta...
    }
}
