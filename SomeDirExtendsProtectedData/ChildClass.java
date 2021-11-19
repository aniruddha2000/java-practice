package SomeDirExtendsProtectedData;
import SomeDirWithProtectedData.ParentClass;


class ChildClass extends ParentClass {
    public void displayProtectedData() {
        // ParentClass data = new ParentClass();
        // System.out.println(data.className);
        // data.protectedString();
        ChildClass child = new ChildClass();
        child.protectedString();
    }

    public void displayPrivateData() {
        ChildClass child = new ChildClass();
        child.accessPrivateData();
        System.out.println("Through public method");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayProtectedData();
        child.displayPrivateData();
    }
}
