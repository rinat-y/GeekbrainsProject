public class Theme2 {
    // 1.
    /*public static void main(String[] args) {
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array [i] == 0)
                array [i] = 1;
            else array [i] = 0;
        }

        for (int a : array) {
            System.out.print("[" + a + "]");

        }
    }*/

    // 2.
    /*public static void main(String[] args) {
        int [] array = new int[8];
        int data = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = data;
            data += 3;
        }
        for (int a : array) {
            System.out.print("[" + a + "]");
        }
    }*/

    //3.
    /*public static void main(String[] args) {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 6) array [i] = array [i] * 2;
        }
        for (int a : array) {
            System.out.print("[" + a + "]");
        }
    }*/

    //4.
    /*public static void main(String[] args) {
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j)
                    array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print("[" + array[i][j] + "] ");
            }
            System.out.println();
        }
    }*/

    //5.
    /*public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, -3, -9, -81};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array [i];
            if (array[i] < min)
                min = array [i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }*/

    //6.
    /*public static void main(String[] args) {
        int[] a = {1,1,1,2,1};
        int[] b = {2,1,1,2,1};
        int[] c = {10,10};
        int[] d = {6,1,1,1,1,1,1};
        int[] e = {1,1,1,1,1,1,6};
        System.out.println(checkBalance(a));
        System.out.println(checkBalance(b));
        System.out.println(checkBalance(c));
        System.out.println(checkBalance(d));
        System.out.println(checkBalance(e));

    }
    public static boolean checkBalance (int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        boolean answer = false;

        for(int i = 0; i < array.length; i++){
            sumLeft += array[i];
            for(int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight)
                answer = true;
            sumRight = 0;
        }
        return answer;
    }*/

}
