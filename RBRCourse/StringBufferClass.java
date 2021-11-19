package RBRCourse;

public class StringBufferClass {
    private void timeAnalysis() {
        StringBuffer strBuffer = new StringBuffer("Java");
        long stime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strBuffer.append("java");
        }
        System.out.println("Time taken for the execution: " + (System.currentTimeMillis() - stime) + "ms");

        String str = new String("Java");
        stime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str = str.concat("Java");
        }
        System.out.println("Time taken for the execution: " + (System.currentTimeMillis() - stime) + "ms");

    }

    public static void main(String[] args) {
        // // New String Buffer capacity is 16 by default
        // StringBuffer sb = new StringBuffer("Net");
        // // System.out.println(sb.capacity());
        // sb.append("flix");
        // sb.append(false);
        // sb.delete(7, 12);
        // System.out.println(sb);
        // StringBuffer sb2 = new StringBuffer();
        // sb2.insert(0, "Ani");
        // sb2.insert(3, "ruddha");
        // System.out.println(sb2);
        // System.out.println(sb2.reverse());
        // // New string buffer with size 10
        // StringBuffer sb3 = new StringBuffer("Equinix");
        // // sb3.append("Equinix");
        // System.out.println(sb3.capacity());

        // StringBuffer sb4 = new StringBuffer();

        StringBufferClass strbuffer = new StringBufferClass();
        strbuffer.timeAnalysis();
    }
}
