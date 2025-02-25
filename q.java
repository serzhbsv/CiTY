import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class q implements Runnable {
   private XChatMidlet a;
   public static Displayable a;
   public static f a;

   public void run() {
      if (!aw.a.b) {
         try {
            XChatMidlet var10001 = this.a;
            this.a.a.a((String)XChatMidlet.a, 5001);
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

      try {
         while(aw.a.a && !aw.a.a()) {
            Thread.sleep(1000L);
         }
      } catch (Exception var3) {
      }

      if (aw.a.b) {
         w var1 = (w)a;
         if (var1.e != w.c && var1.e != w.d) {
            if (this.a.a.a == null && var1.e != w.h) {
               this.a.a.c(a);
            } else {
               this.a.a.b(a);
            }
         } else {
            this.a.a.a(a);
         }
      } else {
         this.a.a();
      }

   }

   public q(XChatMidlet var1) {
      this.a = var1;
   }

   public void a(Displayable var1, f var2) {
      this.a.a();
      this.a.a("Надо немного подождать...", "Соединение с сервером", var1);
      a = var1;
      a = var2;
      Thread var3 = new Thread(this);
      var3.start();
   }
}
