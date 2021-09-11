package org.jboss.resteasy.test.grpc;

public class CC2 extends CC3 {

   int j;

   public CC2(String s, int j) {
      super(s);
      this.j = j;
   }
   
   public CC2() {}
   
   public boolean equals(Object other) {
      if (!CC2.class.equals(other.getClass())) {
         return false;
      }
      CC2 cc2 = (CC2) other;
      return cc2.s.equals(s) && cc2.j == j;
   }
}
