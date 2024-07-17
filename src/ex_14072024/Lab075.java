package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("yogesh");
        String s2 = new String("yogesh");
        String s3 = new String("yogesh");

        System.out.println(s1 == s2); // chk for ref
        System.out.println(s2 == s3); // chk for ref
        System.out.println(s2 .equals(s3)); // chk for content

    }
}
