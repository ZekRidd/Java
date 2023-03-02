package day11_StringManipulations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Anil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Herhangi bir cumle yaziniz?");
        String cumle = scanner.nextLine();
        System.out.println("aradiginiz kelime?");
        String kelime = scanner.next();
        String liste = "";
        int number = 0;
        boolean flag;
        boolean flag1 = true;
        int indexNumberOfWord = 0;
        int overallNumber = 0;
        while (flag1) {
            for (int i = 0; i < cumle.length(); i++) {
                int numberA = i;
                flag = true;
                while (flag) {
                    if (indexNumberOfWord == kelime.length()) {
                        indexNumberOfWord = 0;
                    }
                    if (cumle.charAt(numberA) == kelime.charAt(indexNumberOfWord)) {
                        if (indexNumberOfWord < kelime.length()) {
                            System.out.println("cumlede " + (++number) + ". aramada " + " 1 tane " + kelime.charAt(indexNumberOfWord)
                                    + " .harfi " + "\n\tindex numarasi : " + i);
                            overallNumber++;
                            liste += cumle.charAt(i);
                        } else {
                            flag = false;
                        }
                        indexNumberOfWord++;
                    } else {
                        flag = false;
                    }
                }
            }
            flag1 = false;
        }
        System.out.println((overallNumber / kelime.length()) + " tane " + kelime + " bulundu");
        List<String> array = List.of(liste);
        List<String> array2 = new ArrayList<>(array);
        System.out.println(array2);


    }

}
