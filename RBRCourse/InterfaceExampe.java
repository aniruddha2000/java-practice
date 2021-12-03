interface MyInterface {
    void company();
}

class Google implements MyInterface {
    public void company() {
        System.out.println("Google");
    }
}

class Netflix implements MyInterface {
    public void company() {
        System.out.println("Netflix");
    }
    public void name() {
        System.out.println("I pay 150k to the SDE1");
    }
}

public class InterfaceExampe {
    public static void main(String[] args) {
        MyInterface obj = new Google();
        obj.company();
        obj = new Netflix();
        obj.company();
        Netflix obj2 = new Netflix();
        obj2.name();
    }
}
