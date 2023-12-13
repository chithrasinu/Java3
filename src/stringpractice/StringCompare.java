package stringpractice;

public class StringCompare {
    public static void main(String args[]) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));


            String A1="PerScholas";
            String A2="PerScholas";
            String A3=new String("PerScholas");
            String A4="Teksystem";
       boolean result = A1.equals(A2);

            System.out.println(result);//true
            System.out.println(A1.equals(A3));//true
            System.out.println(A1.equals(A4));//false

        }
}