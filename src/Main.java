public class Main
{
    public static void main(String[] args)
    {
        int N=5,M=5;
        int[][] Array1 = new int[N][M];
        initializeArray1(Array1,5,5);
        ArrayOutput(Array1,5,5);
        System.out.println();
        initializeArray2(Array1,5,5);
        ArrayOutput(Array1,5,5);
        System.out.println();
        initializeArray3(Array1,5,5);
        ArrayOutput(Array1,5,5);
        System.out.println();
        initializeArray4(Array1,5,5);
        ArrayOutput(Array1,5,5);
        System.out.println();
        initializeArray5(Array1,5,5);
        ArrayOutput(Array1,5,5);
    }
    public static void initializeArray1(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                Arr[N][M]=5;
            }
        }
    }
    public static void initializeArray2(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                Arr[N][M]=M;
            }
        }
    }
    public static void initializeArray3(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                Arr[N][M]=N*5+M;
            }
        }
    }
    public static void initializeArray4(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                Arr[N][M]=(N+1)*5-1-M;
            }
        }
    }
    public static void initializeArray5(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                Arr[N][M]=24 - N*5 - M;
            }
        }
    }
    public static void ArrayOutput(int[][] Arr, int N, int M)
    {
        for (N = 0; N < 5; N++)
        {
            for ( M = 0; M < 5; M++)
            {
                if (M==4)
                {
                    System.out.println(Arr[N][M]);

                }
                else
                {
                    System.out.print(Arr[N][M] + " ");

                }
            }
        }
    }
}