package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_ArrayListSorular {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
                liste olarak dondurecek bir method olusturun.
         */

        System.out.println(kullaniciyaListOlusturma());

    }

        public static List<String> kullaniciyaListOlusturma(){

            List<String> isimler = new ArrayList<>();

            String girilenIsim="";

            Scanner scan = new Scanner(System.in);

            do {

                System.out.println("Listeye eklemek için bir isim giriniz" +
                        "\nBitirmek için Q'ya basın");
                girilenIsim=scan.nextLine();

                if(!girilenIsim.equalsIgnoreCase("q")) {
                    isimler.add(girilenIsim);
                }

            } while(!girilenIsim.equalsIgnoreCase("Q"));

            return isimler;
        }
    }

