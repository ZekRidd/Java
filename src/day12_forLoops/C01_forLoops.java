package day12_forLoops;

public class C01_forLoops {
    public static void main(String[] args) {
        int bas = 20;
        int bit = 40;

        int toplam = 0;

        for (int i=bas; i<=bit; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }
}
