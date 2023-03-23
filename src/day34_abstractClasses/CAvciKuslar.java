package day34_abstractClasses;

public class CAvciKuslar extends BKuslar {

    public void hareket(){
        System.out.println("ucarlar");
    }

    public void beslenme(){
        System.out.println("et yerler");
    }

    @Override
    public void omur() {
        System.out.println("Avcı Kuslar Ortalama 10 yıl Yasar");
    }

    public void pence(){
        System.out.println("pencelidir");
    }

    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        AHayvan baykus = new CAvciKuslar();
        baykus.hareket();
        baykus.solunum();
        baykus.omur();
    }
}
