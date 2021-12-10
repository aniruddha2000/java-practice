public class StringIndexException {
    public static void main(String[] args) {
        try {
            String s = "Hey there! how you doing?";
            int ch = s.charAt(s.length() + 2);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
