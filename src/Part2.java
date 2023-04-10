public class Part2
{
    public static void main(String[] args)
    {
        Integer A = 5;
        Double B = 3.7;
        Boolean C = true;
        Character D = 'A' ;
        int var =0;

        System.out.println(A.intValue());
        System.out.println(B.doubleValue());
        System.out.println(C.booleanValue());
        System.out.println(D.charValue());
        A = Integer.valueOf(9);
        System.out.println(A.intValue());
        var = A.parseInt("+20");
        System.out.println(var);
        String hight = A.toString()+'m';
        System.out.println(hight);
        System.out.println(A.compareTo(10));
        System.out.println(A.compareTo(9));
        System.out.println(A.compareTo(8));
        System.out.println(hight.compareTo("15m"));
        System.out.println(("9"+"9").compareTo(A.toString()+A.toString()));
    }
}
