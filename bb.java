import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import xchat.XChatMidlet;

public class bb extends y {
   public long a;
   public boolean h = true;
   public Vector b;
   public int o;
   public int p;
   public z a;
   public bc b;
   public av c;
   public int u;
   public String b;
   public int x;

   public void k() {
      if (!super.b) {
         if (System.currentTimeMillis() - this.a > 5000L) {
            super.b = true;
            this.a = System.currentTimeMillis();
         }
      } else {
         this.a = System.currentTimeMillis();
      }

      super.b = true;
   }

   public void a(int var1, ba var2) {
   }

   public void b(Graphics var1) {
      super.a.a(this.b.size() - 1);
      if (!this.h) {
         u var10000 = super.a;
         var10000.c -= this.p;
         if (super.a.c < 0) {
            super.a.c = 0;
         }
      }

      var1.setClip(0, 0, super.v, super.k);
      var1.setColor(super.j);
      var1.fillRect(0, 0, super.v, super.k);
      int var10 = super.v - super.a.d;
      int var3 = super.a.d;
      int var4 = 0;
      this.o = super.a.e;
      int var5 = this.o;
      if (this.h) {
         if (this.o < this.p) {
            var5 = 0;
         } else {
            var5 = this.o - this.p + 1;
         }
      }

      for(int var6 = 0; var6 < this.p + 1 && var5 < this.b.size(); ++var6) {
         ba var7 = (ba)this.b.elementAt(var5);
         this.a(var5, var7);
         int var8 = 0;
         if (var7.c != -1) {
            this.c.a(var7.c, var3, var4, var1);
            var8 += this.c.b;
         }

         if (var7.b != -1) {
            this.c.a(var7.b, var3 + var8, var4, var1);
            var8 += this.c.b;
         }

         if (var7.a != -1) {
            this.c.a(var7.a, var3 + var8, var4, var1);
            var8 += this.c.b;
         }

         int var9 = var3 + 1 + var8;
         if (this.h && var5 == super.a.e) {
            ++var9;
            if (var7.a != this.b.a) {
               this.b.a(var7.a, var9, var4, super.v - var9, super.a.a);
            } else {
               this.b.a();
            }

            this.b.a(var1);
            var1.setClip(0, 0, super.v, super.k);
            var1.setColor(0);
            var9 -= 2;
            int var10003 = super.v - var9 - 1;
            z var10004 = super.a.a;
            var1.drawRect(var9, var4, var10003, 9);
         } else {
            super.a.a.a(var7.a, var9, var4, var1);
         }

         var4 += this.x;
         ++var5;
      }

      super.a.b = 0;
      if (this.h) {
         super.a.c = this.b.size() - 1;
      } else {
         super.a.c = this.b.size() - this.p;
         if (super.a.c < 0) {
            super.a.c = 0;
         }
      }

      super.a.a(var1, 0, 0, super.k, false);
      this.k();
   }

   public int b() {
      return this.b.size();
   }

   public void b() {
      this.b = new Vector();
      super.b = true;
   }

   public bb(XChatMidlet var1, String var2, int var3) {
      super(var1);
      super.j = 14737632;
      this.c = null;
      this.c(var2);
      this.b = new Vector();
      this.b = new bc();
   }

   public void a(int var1, boolean var2) {
      super.a.e = var1;
      super.b = true;
   }

   public int a() {
      return super.a.e;
   }

   public ba a() {
      return (ba)this.b.elementAt(this.a());
   }

   public void a(String var1, int var2, boolean var3) {
      ba var4 = new ba();
      var4.a = var1;
      var4.c = var2;
      if (var3) {
         this.b.insertElementAt(var4, 0);
         this.u = 0;
      } else {
         this.b.addElement(var4);
         this.u = this.b.size() - 1;
      }

      super.a.c = this.b.size() - 1;
      super.b = true;
      this.repaint();
   }

   public void a(String var1, int var2) {
      this.a(var1, var2, false);
   }

   public void a(String var1, int var2, int var3, int var4) {
      this.a(var1, var2, false);
      ((ba)this.b.elementAt(this.u)).b = var3;
      ((ba)this.b.elementAt(this.u)).a = var4;
   }

   public void g() {
      this.a = super.a.a;
      this.o = 0;
      if (this.c != null) {
         this.x = this.c.c;
      } else {
         z var10001 = this.a;
         this.x = 9;
      }

      this.p = super.k / this.x;
      super.l = 2;
      super.a.c = this.b.size() - 1;
      super.a(this.b);
   }

   public void c(String var1) {
      this.b = var1;
   }
}
