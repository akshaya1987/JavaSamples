package samples;

public class JavaPractice {
    public static void main(String[] args) {
        String s1 = "This is a good book";
        String s2 = new String("Core Java an integrated approach");
        char[] arr = {'a', 'k', 's', 'h', 'a', 'y','a'};
        String s3 = new String(arr);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s3.concat(" ").concat(s1));
        System.out.println(s3 + " "+ s1);
        boolean x = s3.startsWith("A");
        System.out.println(x);


    }
}