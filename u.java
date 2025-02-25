import javax.microedition.lcdui.Graphics;
import xchat.XChatMidlet;

public class u {
   public int a = 1;
   public int d;
   public int b;
   public int c;
   public int e;
   public av a;
   public boolean a;

   public void a(int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (this.e > var1) {
         this.e = var1;
      }

      this.c = var1;
   }

   public void b() {
      if (this.e - this.a < 0) {
         this.e = 0;
      } else {
         this.e -= this.a;
      }

   }

   public void a() {
      if (this.e + this.a > this.c) {
         this.e = this.c;
      } else {
         this.e += this.a;
      }

   }

   public u(boolean var1) {
      if (this.a = var1) {
         this.a = XChatMidlet.c;
      } else {
         this.a = XChatMidlet.e;
      }

      this.d = 8;
   }

   public void a(Graphics var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         if (this.a) {
            var4 -= 5;
            var1.setColor(10790052);
            var1.fillRect(var2, var3, 6, 6);
            var2 += 5;
         } else {
            var4 -= 5;
            var3 += 5;
         }
      }

      var4 -= this.a ? 16 : 16;
      int var6 = 0;
      if (this.c - this.b != 0) {
         var6 = this.e * (var4 - (this.a ? 8 : 8)) / (this.c - this.b);
      }

      int var7;
      int var8;
      if (this.a) {
         this.a.a(0, var2, var3, var1);
         var7 = var2 + 8;

         for(var8 = var7 + var4; var7 < var8; var7 += 8) {
            this.a.a(3, var7, var3, var1);
         }

         this.a.a(2, var8, var3, var1);
         this.a.a(1, var2 + 8 + var6, var3, var1);
      } else {
         this.a.a(0, var2, var3, var1);
         var7 = var3 + 8;

         for(var8 = var7 + var4; var7 < var8; var7 += 8) {
            this.a.a(3, var2, var7, var1);
         }

         this.a.a(2, var2, var8, var1);
         this.a.a(1, var2, var3 + 8 + var6, var1);
      }

   }
}
