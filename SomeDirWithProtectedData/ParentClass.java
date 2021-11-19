package SomeDirWithProtectedData;


public class ParentClass {
    public String className = "Parent Class";
    private String privateData = "Private data";

    protected void protectedString() {
        System.out.println("This is a protected method");
    }

    public void accessPrivateData() {
        System.out.println(privateData);
    }
}
