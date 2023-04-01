package day38_exceptions_garbageCollector;

public class C03_Iterator {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,1,11};

        for (int each:arr
             ) {
            System.out.print(each + " ");
        }

        System.out.println("");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }

        // Index kullanmadan tüm elementleri 3 artırıp kaydedin

    }
}
