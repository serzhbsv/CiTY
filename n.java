import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;

public class n implements Runnable {
   public x a;
   public long a;
   public DataInputStream a;
   public DataOutputStream a;
   public boolean b;
   public long b;
   public String a;
   public int a;
   public Vector a;
   private Connection a;
   public boolean a;
   public b a;
   public boolean c;

   public n(x var1) {
      this.a = var1;
      this.b = false;
      this.a = new Vector();
   }

   public boolean a() {
      return this.a != 0L;
   }

   public void a(String var1, int var2) throws IOException {
      this.b = 0L;
      this.a = 0L;
      this.b = false;
      this.a = var1;
      this.a = var2;
      this.a = true;
      Thread var3 = new Thread(this);
      var3.start();
   }

   public void b(a var1) {
      if (!this.b && this.a) {
         try {
            this.a.close();
         } catch (Exception var6) {
         }

         try {
            this.a.close();
         } catch (Exception var5) {
         }

         try {
            this.a.close();
         } catch (Exception var4) {
         }

         try {
            Thread.sleep(1000L);
         } catch (Exception var3) {
         }

         if (this.b == 0L) {
            this.b = System.currentTimeMillis();
         }

         if (System.currentTimeMillis() - this.b > 15000L) {
            this.b = false;
            this.a = false;
            this.a.g();
         }
      }

   }

   public void run() {
      this.c = false;
      this.a.removeAllElements();

      while(this.a) {
         String var1 = "socket://" + this.a + ":" + this.a;

         try {
            this.a = Connector.open(var1);
            this.a = ((InputConnection)this.a).openDataInputStream();
            this.a = ((OutputConnection)this.a).openDataOutputStream();
            if (this.a != 0L) {
               this.a(new a((byte)3, new Long(this.a)), true);
            }

            this.a = new b(this);
            this.a.b();

            a var2;
            while((var2 = a.a(this.a)) != null) {
               if (var2.a == 0) {
                  this.a = 0L;
                  this.a = false;
                  this.b = false;
                  this.a.g();
                  break;
               }

               if (!this.b) {
                  if (var2.a == 3) {
                     if (this.a != 0L) {
                        this.b = true;
                     } else {
                        this.a = (Long)var2.a;
                        this.b = true;
                     }
                  }
               } else {
                  this.a.a(var2);
               }
            }
         } catch (EOFException var8) {
         } catch (Exception var9) {
            try {
               this.a.close();
            } catch (Exception var7) {
            }

            try {
               this.a.close();
            } catch (Exception var6) {
            }

            try {
               this.a.close();
            } catch (Exception var5) {
            }

            this.a = null;
            if (this.a) {
               this.b = false;
               this.b((a)null);
            }
         }

         try {
            this.a.a();
            this.a = null;
         } catch (Exception var4) {
         }
      }

   }

   public void a(boolean var1) {
      this.a = false;
      if (this.b) {
         this.b = false;
      }

      try {
         this.a.close();
      } catch (Exception var5) {
      }

      try {
         this.a.close();
      } catch (Exception var4) {
      }

      try {
         this.a.close();
      } catch (Exception var3) {
      }

   }

   public void a(a var1) {
      this.b(var1, true);
   }

   public void b(a var1, boolean var2) {
      synchronized(this.a) {
         this.a.addElement(var1);
      }
   }

   public synchronized void a(a var1, boolean var2) {
      try {
         if (this.c) {
            this.c = false;
            throw new IOException();
         }

         a.a(var1, this.a);
         synchronized(this.a) {
            this.a.removeElement(var1);
         }

         if (var2) {
            this.a.flush();
         }
      } catch (IOException var6) {
         this.a.a();
         this.b = false;
         this.b((a)null);
      }

   }
}
