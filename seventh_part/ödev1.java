package patikajava.recursive;

public class ödev1 {
    public static int Maksimum = 100;
    public static int i = 0, j = 0, k = 0;

    static void toplu_matris(int str1, int stn1, int A[][],
                                  int str2, int stn2, int B[][],
                                  int C[][]){

        // If all rows traversed
        if (i >= str1)
            return;

        // If i < row1
        if (j < stn2)
        {
            if (k <stn1)
            {
                C[i][j] += A[i][k] * B[k][j];
                k++;

               toplu_matris(str1, stn1, A, str2, stn2, B, C);
            }

            k = 0;
            j++;
            toplu_matris(str1,stn1,A,str2,stn2,B,C);
        }

        j = 0;
        i++;
        toplu_matris(str1, stn1, A, str2, stn2, B, C);
    }


    static void matrix(int str1, int stn1, int A[][],
                               int str2, int stn2, int B[][]) {
        if (str2 != stn1) {
            System.out.println("\n");
            return;
        }

        int C[][] = new int[Maksimum][Maksimum];

        toplu_matris(str1, stn1, A, str2, stn2, B, C);


        for (int i = 0; i < str1; i++) {
            for (int j = 0; j < stn2; j++)
                System.out.print(C[i][j] + " ");

            System.out.println();
        }


    }



    public static void main(String[] args) {
        int str1 = 3, stn1 = 3, str2 = 3, stn2 = 3;
        int A[][] = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int B[][] = { {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1} };

        matrix(str1, stn1, A, str2, stn2, B);

    }
}
