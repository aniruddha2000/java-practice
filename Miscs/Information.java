public class Information {
    public static void main(String[] args) {
        String java_class_path = System.getProperty("java.class.path");
        String java_home = System.getProperty("java.home");
        String java_vendor = System.getProperty("java.vendor");
        String java_vendor_url = System.getProperty("java.vendor.url");
        String java_version = System.getProperty("java.version");
        String os_arch = System.getProperty("os.arch");
        String os_name = System.getProperty("os.name");
        String os_version = System.getProperty("os.version");
        String user_dir = System.getProperty("user.dir");
        String user_home = System.getProperty("user.home");
        String user_name = System.getProperty("user.name");

        System.out.println("Hello howtodojo|");
        System.out.println("Java Class Path :" + java_class_path);
        System.out.println("Java Home :" + java_home);
        System.out.println("Java Vendor :" + java_vendor);
        System.out.println("Java Vendor URL :" + java_vendor_url);
        System.out.println("Java Version :" + java_version);
        System.out.println("OS Architecture :" + os_arch);
        System.out.println("OS Name :" + os_name);
        System.out.println("OS Version :" + os_version);
        System.out.println("User Dir :" + user_dir);
        System.out.println("User Home :" + user_home);
        System.out.println("User Name :" + user_name);
    }

}
