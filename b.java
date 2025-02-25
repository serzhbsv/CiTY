import java.util.Enumeration;
import java.util.Vector;

public class b implements Runnable {
   public n a;
   public boolean a;
   public Thread a;

   public b(n var1) {
      this.a = var1;
   }

   public void b() {
      this.a = true;
      this.a = new Thread(this);
      this.a.start();
   }

   public void a() {
      this.a = false;
   }

   public void run() {
      Enumeration var1 = null;

      try {
         while(this.a) {
            Thread.sleep(100L);

            try {
               boolean var2 = false;
               Vector var3 = new Vector();
               int var10;
               synchronized(this.a.a) {
                  var10 = this.a.a.size();
                  if (var10 != 0) {
                     Enumeration var5 = this.a.a.elements();

                     while(var5.hasMoreElements()) {
                        var3.addElement(var5.nextElement());
                     }

                     var1 = var3.elements();
                  }
               }

               if (var10 != 0) {
                  while(var1.hasMoreElements()) {
                     a var4 = (a)var1.nextElement();
                     if (!this.a) {
                        break;
                     }

                     this.a.a(var4, true);
                     if (!this.a) {
                        break;
                     }
                  }
               }
            } catch (Exception var8) {
            }
         }
      } catch (InterruptedException var9) {
      }

   }
}
