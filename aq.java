import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class aq extends y implements am, j {
   public boolean j;
   public boolean l = false;
   public Displayable b;
   public r a;
   public int H;
   private Vector b;
   public int G;
   public int x;
   public int o;
   public int D;
   public u b;
   public u c;
   public t c = new t(300);
   public int u;
   public byte b;
   public byte a;
   public byte d = 1;
   public byte c = 1;
   public long a = 0L;
   public boolean k = false;
   public boolean h = false;
   public int E = 0;
   public static av c;
   public Image c;
   public static Image b;
   public static Image d;
   public int z;
   public int C;
   public int B;
   public int F;
   private int A;

   public boolean a() {
      return true;
   }

   public String a() {
      return XChatMidlet.a == 1 ? "Карта страны. Здесь Вы можете перемещаться между доступными городами. Выберите город из предложенных для посещения. Также из меню Вы можете прописаться в выбранном городе. Можно перейти к списку городов вместо карты." : "Карта города. Здесь ты можешь путешествовать по зданиям CITY, и заходить внутрь: в каждом здании - свои чаты и форумы. Каждое здание - это своя тусовка и тематика общения!";
   }

   public void b(Graphics var1) {
      var1.setClip(0, 0, super.v, super.k);
      var1.setColor(super.j);
      var1.fillRect(0, 0, super.v, super.k);
      this.d(var1);
   }

   private void d(Graphics var1) {
      if (this.k) {
         this.d += this.b;
         if (this.d > 50) {
            this.d = 50;
         }

         if (this.d < -50) {
            this.d = -50;
         }

         this.G += (this.b < 0 ? -1 : 1) * Math.abs(this.d) / 5;
         this.c += this.a;
         if (this.c > 50) {
            this.c = 50;
         }

         if (this.c < -50) {
            this.c = -50;
         }

         this.x += (this.a < 0 ? -1 : 1) * Math.abs(this.c) / 5;
         if (this.x <= 10) {
            this.x = this.c.getHeight() - 10;
         } else if (this.x >= this.c.getHeight() - 10) {
            this.x = 10;
         }

         if (this.h) {
            this.h = false;
            this.d = 1;
            this.c = 1;
            this.b = 0;
            this.a = 0;
         }
      }

      int var2 = this.c.getWidth() - super.v / 2;
      if (this.G < super.v / 2) {
         this.o = this.G - super.v / 2;
      }

      if (this.G < 30) {
         this.G = 30;
      }

      if (this.G > this.c.getWidth() - 20) {
         this.G = this.c.getWidth() - 20;
      }

      if (this.G >= var2) {
         this.o = super.v / 2 - (this.c.getWidth() - this.G);
      }

      if (this.G < super.v / 2) {
         this.o = this.G - super.v / 2;
      }

      int var3 = -(this.G - super.v / 2);
      int var4 = -(this.x - super.k / 2);
      if (var4 > 0) {
         this.D = -var4;
         var4 = 0;
      } else if (var4 < -(this.c.getHeight() - super.k)) {
         if (this.c.getHeight() < super.k) {
            this.D = -(this.c.getHeight() - super.k) - var4 - (super.k - this.c.getHeight());
            var4 = 0;
         } else {
            this.D = -(this.c.getHeight() - super.k) - var4;
            var4 = -(this.c.getHeight() - super.k);
         }
      }

      var2 -= super.v >> 1;
      if (var3 > 0) {
         var3 = 0;
      } else if (var3 <= -var2) {
         var3 = -var2;
      }

      var1.drawImage(this.c, var3, var4, 20);
      this.b.e = this.G - this.z;
      this.b.a(var1, 0, 0, super.v, true);
      this.c.e = this.x - this.C;
      this.c.a(var1, 0, 0, super.k, true);
   }

   public void paint(Graphics var1) {
      super.paint(var1);
      this.c(var1);
      if (this.k) {
         super.b = true;
      }

   }

   public void c(Graphics var1) {
      this.u += this.c.a();
      if (this.u >= 4) {
         this.u = 0;
      }

      if (this.o > super.v / 2 - 15) {
         this.o = super.v / 2 - 15;
      }

      c.a(this.u, this.o - 23 + super.v / 2, this.D - 15 + super.k / 2, var1);
   }

   private void g() {
   }

   public void b(int var1) {
      this.a = System.currentTimeMillis();
      switch(var1) {
      case 1:
         this.a = -20;
         this.k = true;
         this.l = false;
         break;
      case 2:
         this.b = -20;
         this.k = true;
         this.l = false;
         super.b = true;
      case 3:
      case 4:
      case 7:
      default:
         break;
      case 5:
         this.b = 20;
         this.k = true;
         this.l = false;
         super.b = true;
         break;
      case 6:
         this.a = 20;
         this.k = true;
         this.l = false;
         break;
      case 8:
         super.e = true;
         this.a = 0;
         this.b = 0;
         this.b();
         this.n();
      }

      super.b = true;
   }

   public void a(int var1) {
      if (this.a + 1200L < System.currentTimeMillis()) {
         this.k = true;
         this.h = true;
         this.a = (byte)(this.a * 10);
         this.b = (byte)(this.b * 10);
         super.b = true;
      } else {
         this.h = false;
         switch(var1) {
         case 1:
            this.c = 1;
            this.a = 0;
            break;
         case 2:
            this.d = 1;
            this.b = 0;
         case 3:
         case 4:
         case 7:
         default:
            break;
         case 5:
            this.d = 1;
            this.b = 0;
            break;
         case 6:
            this.c = 1;
            this.a = 0;
            break;
         case 8:
            this.c = 1;
            this.a = 0;
            this.d = 1;
            this.b = 0;
         }

         this.k = false;
         this.b();
      }
   }

   public void b(Displayable var1) {
      this.b = var1;
   }

   public void b() {
      int var1 = Integer.MAX_VALUE;
      r var2 = null;

      for(int var4 = 0; var4 < this.b.size(); ++var4) {
         r var3 = (r)this.b.elementAt(var4);
         int var5 = this.G - var3.a;
         int var6 = this.x - var3.b;
         int var7 = var5 * var5 + var6 * var6;
         if (var7 < var1) {
            var2 = var3;
            var1 = var7;
            this.E = var4;
         }
      }

      this.a = var2;
      super.a.a(this.a.b + this.a.a);
   }

   public void n() {
      this.G = this.a.a;
      this.x = this.a.b;
      if (this.b instanceof aa) {
         ((aa)this.b).d(this.E);
      }

      super.d = true;
      synchronized(ay.a) {
         super.c = true;
         this.b(ay.a);
         super.c = false;
      }

      this.repaint();
      this.serviceRepaints();

      try {
         Thread.sleep(100L);
      } catch (Exception var3) {
      }

      super.d = false;
      super.b = true;
   }

   public aq(XChatMidlet var1) {
      super(var1);
      this.c.a();
      this.b = new u(true);
      this.c = new u(false);
      this.a = new r();
   }

   public void m() {
      if (c == null) {
         c = new av("/cursor.png", 47, 30, 4);
      }

      this.c = null;
      System.gc();

      try {
         if (this.j && b == null) {
            b = Image.createImage("/map_city.png");
         }

         if (this.H == 2) {
            if (this.j) {
               this.c = b;
            } else {
               this.c = Image.createImage("/map_city.png");
            }
         } else if (this.j) {
            this.c = d;
         }
      } catch (Exception var2) {
      }

      System.gc();
   }

   public void a(Vector var1, int var2, int var3) {
      aw.l();
      this.A = var2;
      this.H = var3;
      this.m();
      this.b = var1;
      if (var3 == 1) {
         this.g();
      }

      if (var3 == 1) {
         this.removeCommand(XChatMidlet.av);
      } else if (var3 == 2) {
      }

      this.o();
      this.G = this.a.a;
      this.x = this.a.b;
      super.l = 2;
      super.a(this.a.b + this.a.a);
      this.setCommandListener((aa)this.b);
      aw.c(1000);
   }

   private void o() {
      this.o = 0;
      this.D = 0;
      this.z = Integer.MAX_VALUE;
      this.C = Integer.MAX_VALUE;
      this.B = Integer.MIN_VALUE;
      this.F = Integer.MIN_VALUE;
      int var1 = Integer.MAX_VALUE;
      boolean var2 = false;
      r var3 = null;

      int var4;
      r var5;
      for(var4 = 0; var4 < this.b.size(); ++var4) {
         var5 = (r)this.b.elementAt(var4);
         if (var5.a.equals("Москва") || var5.a.startsWith("Информ-центр")) {
            var3 = var5;
            this.a = var5;
            if (this.b instanceof aa) {
               ((aa)this.b).d(var4);
            }
         }

         if (var5.a > this.B) {
            this.B = var5.a;
         }

         if (var5.b > this.F) {
            this.F = var5.b;
         }

         if (var5.a < this.z) {
            this.z = var5.a;
         }

         if (var5.b < this.C) {
            this.C = var5.b;
         }

         int var6 = var5.a * var5.a + var5.b * var5.b;
         if (var6 < var1) {
            var1 = var6;
            this.a = var5;
         }
      }

      for(var4 = 0; var4 < this.b.size(); ++var4) {
         var5 = (r)this.b.elementAt(var4);
         if (super.a.a.a.w != null && var5.a.equals(super.a.a.a.w)) {
            this.a = var5;
            var2 = true;
            if (this.b instanceof aa) {
               ((aa)this.b).d(var4);
            }
            break;
         }
      }

      if (!var2 && var3 != null) {
         this.a = var3;
      }

      this.b.b = 0;
      this.b.c = this.B - this.z - 5;
      this.c.b = 0;
      this.c.c = this.F - this.C;
   }
}
