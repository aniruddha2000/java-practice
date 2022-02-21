package Package_Protected.xyzpackage;

import Package_Protected.abcpackage.Addition;

class Test extends Addition {
   public static void main(String args[]) {
      Test obj = new Test();
      System.out.println(obj.addTwoNumbers(23, 22));
   }
}
