package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; //SCP
        String name1 = "The Testing Academy"; //SCP

        String name2= new String("The Testing Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the ref
//        System.out.println(name .equals(name1)); // Chk for the content

        System.out.println(name1 == name2); // chk for ref
        System.out.println(name1 .equals(name2)); // chk for content

    }
}
