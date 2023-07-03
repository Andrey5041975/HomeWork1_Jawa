package Lesson5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesso5HomeWork {

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{5, 6, 7};

        int[][] a3 = new int[][] {
            {1,2,3},
            {4} };

        int[] a1_2 = new int[]{2, 3, 1};
        int[] a2_2 = new int[]{4, 5, 3, 2};

        System.out.println("Первый массив" + Arrays.toString(a1));
        System.out.println("Второй массив" + Arrays.toString(a2));
        System.out.println("Слияние массивов " +Arrays.toString(concat(a1, a2)));
        System.out.println(("Слияние массивов IntStream" + Arrays.toString( concat_easy(a1,a2))));


        System.out.println();
        System.out.println(Arrays.toString(a3));
        System.out.println("Уплощение массивов" + Arrays.toString(flatten(a3)));

        System.out.println(Arrays.toString(findDuplicates(a1_2, a2_2)));

        System.out.println("Первый массив" + Arrays.toString(a1_2));
        System.out.println("Второй массив" + Arrays.toString(a2_2));
        System.out.println(Arrays.toString(findUnique(a1_2, a2_2)));
    }

    public static int[] concat(int[] a, int[] b) {
        int allLength = a.length + b.length;
        int[] c = new int[allLength];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = a.length; j < allLength; j++) {
            c[j] = b[j - a.length];
        }

        return c;
    }

    public static int[] concat_easy(int[] a, int[] b)
    {
        int full_length = a.length + b.length;
        int[] c = new int[full_length];

        return c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }

// к сожалению с уплощением что-то не то - надо дорабатывать
    public static int [] flatten(int [] [] a)
    {
       // int fulLength = a.length;
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[1].length; j++)
                c[i] = a[i][j];
        }
        return c;
    }


    public static int[] findDuplicates(int[] a, int[] b) {
        int[] c = new int[a.length];

//        if (a.length > b.length)  { int[] c = new int[b.length]; }
//        else  {int[] c = new int[a.length];}

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = a[i];
                }
            }
        }
        return c;
    }
// с уникальными тоже еще не все в порядке
    public static int [] findUnique(int [] a, int [] b)
    {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < b.length; i++) {
            boolean isUniq = true;
            boolean[] isUnique = new boolean[a.length];
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j])
                {
                    isUnique[j] = false;
                    isUniq = isUniq && isUnique[j];
                }
                else isUnique[j] = true;
                }
            if (isUniq) { c[i] = b[i]; }

            System.out.println(Arrays.toString(isUnique));
        }



        return c ;
    }

}
