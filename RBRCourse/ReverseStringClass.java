package RBRCourse;

public class ReverseStringClass {
    private String reverse(String str) {
        char arr[] = new char[str.length()];
        for (int i = str.length()-1, j = 0; i >= 0 ; i--, j++) {
            arr[j] = str.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseStringClass obj = new ReverseStringClass();
        System.out.println(obj.reverse("Aniruddha"));
    }
}
