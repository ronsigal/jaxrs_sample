package org.jboss.resteasy.test.grpc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//import org.jboss.test.resteasy.CC1_Server;

@Path("p")
public class CC1 {

//   private CC1_Server server;

   @Path("m1")
   @GET
   public String m1(CC2 cc2) {
      return "x";
   }

   String m2(String s) {
      return "x";
   }

   @Path("m3")
   @GET
   public String m3(CC4 cc4) {
      return "x";
   }

   @Path("m4")
   @GET
   public boolean m4(int i) {
      return true;
   }

   @Path("m5")
   @GET
   public String m5() {
      return "m5";
   }

   @Path("m6")
   @GET
   public CC4 m6(CC2 cc2) {
      CC5 cc5 = new CC5(cc2.j);
      System.out.println("cc2.s: " + cc2.s + ", cc5.k: " + cc5.k);
      return new CC4(cc2.s, cc5);
   }

//   @Path("start")
//   @GET
//   public void start() {
//      try {
//         server = new CC1_Server();
//         server.start();
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
//
//   @Path("stop")
//   @GET
//   public void stop() {
//      if (server != null) {
//         try {
//            server.stop();
//         } catch (InterruptedException e) {
//            e.printStackTrace();
//         }
//      }
//   }
}
