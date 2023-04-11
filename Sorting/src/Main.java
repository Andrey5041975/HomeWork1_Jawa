import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrNotSort = {10, 200, 50, 130, 1521, 654, 9006, 1000500, 655, 3};
        int i, k, f;
       System.out.println("Unsorted array");
        for (i = 0; i < arrNotSort.length; i++) {
            System.out.print(arrNotSort[i] + "; ");
        }

         public static void sortingOfArray(0b101, 7);





        //public static void sortingOfArray(arrNotSort)

        //сортировка пузырьком (bubble sorting)
        for (k = 0; k < arrNotSort.length; k++) {
            for (i = 0; i < arrNotSort.length - 1; i++) {
                int first, second;
                if (arrNotSort[i] > arrNotSort[i + 1]) {
                    second = arrNotSort[i];
                    arrNotSort[i] = arrNotSort[i + 1];
                    arrNotSort[i + 1] = second;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted array: ");
        for (i = 0; i < arrNotSort.length; i++) {

            System.out.print(arrNotSort[i] + "; ");

        }

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Введем массив из 10 целых чисел");
        for (i = 0; i < 10; i++) {
            arrNotSort[i] = scan.nextInt();
        }
        for (i = 0; i < 10; i++) {
            System.out.print(arrNotSort[i] + "; ");
        }


        //sortingOfArray
       //System.out.println(arrNotSort[0] + "good");

       // sortingOfArray (arrNotSort ){ arrNotSort[0] = 5;        }


    }
    public static void sortingOfArray(int k, int i){
        System.out.println("vyvod "  + i + k);
    }

}