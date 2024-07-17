package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Yogesh");
        String s2 = new String("Yogesh");
        // 2 , in Heap area
        String s3 = s1;
        // 2 , Heap area s3-> s1 -> Yogesh
    }
}
