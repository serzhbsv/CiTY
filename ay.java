import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class ay extends aw implements CommandListener {
   public boolean d;
   public Vector a;
   public XChatMidlet a;
   public bc a;
   public u a;
   public int f;
   public int b;
   public int w;
   public int g;
   public int v;
   public int k;
   public int n;
   public int c;
   public int r;
   public int h;
   private ai b;
   public av b;
   private int s;
   private int d;
   public boolean b;
   public boolean a;
   public String[] a;
   public static Image a;
   public static Graphics a;
   public boolean c;
   public int a = 0;
   public int y = 0;
   public int p;
   public boolean i;
   public boolean g;
   public CommandListener a;
   public ai a;
   public boolean f;
   public t b = new t(350);
   public int e;
   public int m = 1000;
   public int i = 600;

   public void addCommand(Command var1) {
      super.addCommand(var1);
   }

   public void removeCommand(Command var1) {
      super.removeCommand(var1);
   }

   public void paint(Graphics var1) {
      if (a != null) {
         synchronized(a) {
            var1.drawImage(a, 0, 0, 0);
         }
      } else {
         if (this.b) {
            this.b(var1);
         }

         if (this.a) {
            this.a(var1);
         }
      }

   }

   public void b(Graphics var1) {
      var1.setClip(this.n, this.c, this.v, this.k);
      var1.setColor(16777215);
      var1.fillRect(this.n, this.c, this.v, this.k);
      int var2 = 2;
      if (this.a.length > this.p) {
         var2 += this.a.d;
         this.a.a(var1, 0, this.c, this.k, false);
      } else {
         this.a.c = 0;
      }

      int var3 = this.c;

      for(int var4 = this.a.e; var4 < this.a.length; ++var4) {
         this.a(var4, var2, var3, var1, this.a.a);
         z var10001 = this.a.a;
         var3 += 9;
      }

   }

   public void a(int var1, int var2, int var3, Graphics var4, z var5) {
      var5.a(this.a[var1], var2, var3, var4);
   }

   public void a(Graphics var1) {
      var1.setClip(this.a, this.y, this.b, this.r);

      for(int var2 = this.b - this.h; var2 >= -this.h; var2 -= this.h) {
         this.b.a(this.s, var2, this.y, var1);
      }

      if (this.d != 1) {
         this.b.a(this.s, this.a, this.y, var1);
      } else {
         this.b.a(this.s, -9, this.y, var1);
      }

      this.a.a(var1);
   }

   public ay(XChatMidlet var1) {
      this.a = var1;
      this.d = 1;
      this.a = new bc();
      this.a = new u(false);
      this.d = false;
      this.b = XChatMidlet.a;
      this.r = 10;
      this.h = 36;
      this.b = this.getWidth();
      this.f = this.getHeight();
      this.k = this.f - this.r;
      if (a == null) {
         a = Image.createImage(this.b, this.f);
         a = a.getGraphics();
      }

      int var10001 = this.f - this.r;
      z var10002 = var1.a;
      this.p = var10001 / 9;
      this.a.b = 0;
      this.a.c = 0;
      this.a.e = 0;
      this.setCommandListener(var1);
   }

   public void keyReleased(int var1) {
      int var2 = this.getGameAction(var1);
      switch(var2) {
      case 1:
      case 6:
         this.d();
      default:
      }
   }

   public void d() {
      this.b.a = 1000;
      this.b.a();
      this.i = false;
      this.g = false;
      this.e = 1;
   }

   public void keyPressed(int var1) {
      boolean var2 = false;
      int var3;
      switch(var1) {
      case 35:
      case 42:
         var3 = 9;
         break;
      case 53:
         var3 = 8;
         break;
      default:
         var3 = this.getGameAction(var1);
      }

      switch(var3) {
      case 1:
         this.b.a();
         this.a.b();
         this.b.a = this.m;
         this.b = true;
         this.i = true;
         this.g = false;
         break;
      case 6:
         this.b.a();
         this.a.a();
         this.b.a = this.m;
         this.i = false;
         this.g = true;
         this.b = true;
      }

      switch(this.d) {
      default:
         if (var3 == 8) {
            this.commandAction(XChatMidlet.aX, this);
         }
      case 1:
      }
   }

   public boolean isShown() {
      boolean var1;
      if (super.isShown()) {
         XChatMidlet var10000 = this.a;
         if (XChatMidlet.b == this) {
            var1 = true;
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public void a(String var1, String var2, int var3, ai var4, boolean var5) {
      this.d = var3;
      this.b = var4;
      this.a.e = 0;
      this.g = 11;
      switch(var3) {
      case 1:
         this.g = 2;
         this.s = 0;
         break;
      case 2:
         this.addCommand(XChatMidlet.Y);
         this.s = 0;
         break;
      case 3:
         this.addCommand(XChatMidlet.Y);
         this.s = 1;
         break;
      case 4:
         this.addCommand(XChatMidlet.aX);
         this.addCommand(XChatMidlet.q);
         this.s = 2;
         break;
      case 5:
         this.addCommand(XChatMidlet.av);
         this.s = 1;
      }

      this.w = this.b - this.g;
      this.k = this.f - this.r;
      this.v = this.b;
      this.n = 0;
      this.c = this.r;
      this.a.a(var1, this.g, 0, this.w, this.a.a);
      Vector var6 = bh.a(var2, this.a.a, this.v - 4, true);
      this.a = new String[var6.size()];

      for(int var7 = 0; var7 < this.a.length; ++var7) {
         this.a[var7] = (String)var6.elementAt(var7);
      }

      this.a.c = this.a.length - this.p;
      this.setCommandListener(this);
      if (var5) {
         this.a.a((Displayable)this, !(this instanceof ae) && !(XChatMidlet.b instanceof i));
      } else {
         this.a.a((Displayable)this, false);
      }

   }

   public void setCommandListener(CommandListener var1) {
      this.a = var1;
      super.setCommandListener(var1);
   }

   public void a(ai var1) {
      this.a = var1;
   }

   public void e() {
   }

   public void c() {
      this.e();
      this.d();
      if (a != null) {
         synchronized(a) {
            this.a(a);
            this.b(a);
         }

         this.b = true;
         this.a = true;
      } else {
         this.b = true;
         this.a = true;
      }

      this.f = true;
   }

   public void k() {
   }

   private void f() {
      if (this.i || this.g) {
         int var1 = this.b.a();
         if (var1 != 0) {
            if (this.b.a == this.m) {
               this.b.a = this.i;
            }

            this.b.a = this.b.a * 2 / 3;

            for(int var2 = 0; var2 < var1 * this.e; ++var2) {
               if (this.i) {
                  this.a.b();
               } else if (this.g) {
                  this.a.a();
               }
            }

            this.b = true;
         }
      }

   }

   public void i() {
      if (this.f) {
         if (!this.d) {
            if (this.isShown()) {
               this.f();
               this.k();
               this.a.a();
               if (this.a.a != this.a.e) {
                  this.a = true;
               }

               if (!this.f) {
                  return;
               }

               if (a != null) {
                  if (this.b) {
                     synchronized(a) {
                        this.c = true;
                        this.b(a);
                        this.c = false;
                     }
                  }

                  if (!this.f) {
                     return;
                  }

                  if (this.a) {
                     synchronized(a) {
                        this.c = true;
                        this.a(a);
                        this.c = false;
                     }
                  }

                  if (!this.f) {
                     return;
                  }

                  if (!this.f) {
                     return;
                  }

                  if (this.a) {
                     this.repaint(this.a, this.y, this.b, this.r);
                  }

                  if (!this.f) {
                     return;
                  }

                  if (this.b || this.a()) {
                     this.repaint();
                  }

                  if (!this.f) {
                     return;
                  }

                  if (this.a || this.b || this.a()) {
                     this.a = false;
                     this.b = false;
                     this.serviceRepaints();
                  }

                  if (!this.f) {
                     return;
                  }
               } else if (this.b || this.a) {
                  this.repaint();
                  this.a = false;
                  this.b = false;
               }
            }

         }
      }
   }

   public boolean a() {
      return false;
   }

   public void a() {
      this.f = false;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (this.b == null) {
         this.a.commandAction(var1, var2);
      } else if (var1 == XChatMidlet.q) {
         this.b.j();
      } else if (var1 == XChatMidlet.aX) {
         this.b.h();
      } else {
         this.a.commandAction(var1, var2);
      }

   }
}
