import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class bc {
   public t a;
   public int e;
   public int a;
   public int d;
   public int c;
   public int b;
   public z a;
   public int f;
   public String a;

   public void a(String var1) {
      this.a = var1;
      this.f = this.a.a(var1);
      this.e = this.b;
   }

   public void a(String var1, int var2, int var3, int var4, z var5) {
      this.d = var2;
      this.c = var3;
      this.b = var4;
      this.a = var5;
      this.a = -1;
      this.a(var1);
   }

   public void a(Graphics var1) {
      if (this.f < this.b) {
         this.a.a(this.a, this.d, this.c, var1);
      } else {
         if (this.e >= this.f + this.b) {
            if (this.f > this.b) {
               this.e = this.e - this.f - this.b / 2;
            } else {
               this.e = 0;
            }
         }

         int var2 = var1.getClipX();
         int var3 = var1.getClipY();
         int var4 = var1.getClipWidth();
         int var5 = var1.getClipHeight();
         z var10004 = this.a;
         var1.clipRect(this.d, this.c, this.b, 9);
         if (this.a != null) {
            this.a.a(this.a, this.d + this.b - this.e, this.c, var1);
            if (this.f > this.b) {
               int var6 = this.e - this.f - this.b / 2;
               if (var6 > 0) {
                  this.a.a(this.a, this.d + this.b - var6, this.c, var1);
               }
            }
         }
      }

   }

   public void a() {
      this.a = this.e;
      this.e += this.a.a();
   }

   public bc() {
      Random var1 = new Random();
      this.a = new t(100 + var1.nextInt() % 50);
      this.b();
   }

   public void b() {
      this.a = "";
      this.e = -1;
      this.a.a();
   }
}
