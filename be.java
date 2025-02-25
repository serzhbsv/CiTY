import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class be extends y {
   public int B;
   public int u;
   public String[] a;
   public int[] a;
   private String[] b;
   private String a;
   private Object a;
   private Image b;
   private Image c;
   private aj a;
   public int x;
   public int A;
   public int z;
   public int o;

   public void a(byte[] var1) {
      try {
         this.c = Image.createImage(var1, 0, var1.length);
      } catch (Exception var3) {
      }

   }

   public void a(String var1, Vector var2, Vector var3) {
      z var4 = super.a.a;
      int var5 = super.v - super.a.d * 3 / 2;
      this.o = this.a == null ? 0 : (this.a instanceof Image ? this.b.getHeight() : this.a.a.b);
      this.z = this.a == null ? 0 : (this.a instanceof Image ? this.b.getWidth() : this.a.a.c);
      z var10000 = super.a.a;
      boolean var6 = true;
      Vector var7;
      if (var1 == null) {
         this.b = null;
      } else {
         var7 = bh.a(var1, super.a.a, var5 - this.z, true);
         this.b = new String[var7.size()];

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            this.b[var8] = (String)var7.elementAt(var8);
         }
      }

      Vector var17 = new Vector();
      Vector var9 = new Vector();
      var7 = bh.a(this.a, super.a.a, var5, true);

      int var10;
      for(var10 = 0; var10 < var7.size(); ++var10) {
         var17.addElement(var7.elementAt(var10));
         var9.addElement(new Integer(0));
      }

      for(var10 = 0; var10 < var2.size(); ++var10) {
         String var11 = (String)var2.elementAt(var10);
         if (var3 != null) {
            var11 = var11 + ": ";
            Object var12 = var3.elementAt(var10);
            if (var12 instanceof String) {
               String var13 = (String)var12;
               var13 = var13.length() == 0 ? "-" : var13;
               boolean var14 = false;
               if (var4.a(var11) > var5 / 2) {
                  var17.addElement(var11);
                  var9.addElement(new Integer(0));
                  var14 = true;
               } else {
                  var9.addElement(new Integer(var5 / 2 - var4.a(var11)));
               }

               if (var4.a(var13) > var5 / 2) {
                  if (!var14) {
                     var17.addElement(var11);
                  }

                  if (var4.a(var13) > var5) {
                     Vector var15 = bh.a(var13, var4, var5, false);

                     for(int var16 = 0; var16 < var15.size(); ++var16) {
                        var17.addElement((String)var15.elementAt(var16));
                        var9.addElement(new Integer(0));
                     }
                  } else {
                     var17.addElement(var13);
                     var9.addElement(new Integer(var5 - var4.a(var13)));
                  }
               } else if (var14) {
                  var17.addElement(var13);
                  var9.addElement(new Integer(var5 / 2));
               } else {
                  var17.addElement(var11 + var13);
               }
            }
         } else {
            var17.addElement(var11);
            var9.addElement(new Integer(var5 / 2 - var4.a(var11) / 2));
         }
      }

      this.a = new String[var17.size()];
      this.a = new int[var9.size()];
      this.u = 0;
      if (var1 != null) {
         this.u = this.b.length * 9;
      }

      this.x = 0;
      if (this.u < this.o) {
         this.u = this.o;
         if (this.b != null && this.b.length == 1) {
            if (this.o == 0) {
               this.x = 0;
            } else {
               this.x = this.o / 2 - 9 / 2;
            }
         }
      }

      this.A = this.u;

      for(var10 = 0; var10 < var17.size(); ++var10) {
         this.a[var10] = (String)var17.elementAt(var10);
         this.a[var10] = (Integer)var9.elementAt(var10);
         this.u += 9;
      }

      if (this.u > super.k) {
         super.n = super.a.d * 3 / 2;
      } else {
         super.n = super.a.d / 2;
      }

   }

   public void b(Graphics var1) {
      var1.setClip(0, 0, super.v, super.k);
      var1.setColor(super.j);
      var1.fillRect(0, 0, super.v, super.k);
      z var2 = super.a.a;
      if (this.u > super.k) {
         super.a.b = 0;
         super.a.c = this.u - super.k;
         this.B = super.a.e;
         super.a.a(var1, 0, 0, super.k, false);
      }

      int var3 = 0;
      if (this.c != null) {
         var1.drawImage(this.c, (super.v - this.c.getWidth()) / 2, 0, -this.B);
         var3 += this.c.getHeight();
      }

      if (this.a != null) {
         if (this.a instanceof Image) {
            var1.drawImage(this.b, this.b == null ? (super.b - this.b.getWidth()) / 2 : super.n, -this.B + var3, 0);
         } else {
            this.a.a.a(this.a.a, this.b == null ? (super.b - this.z) / 2 : super.n, -this.B + var3, var1);
         }
      }

      int var4 = this.x + var3;
      int var5 = this.a == null ? super.n : this.z + super.n + 2;
      int var6;
      if (this.b != null) {
         for(var6 = 0; var6 < this.b.length; ++var6) {
            if (var4 + 9 > this.B && var4 < this.B + super.k) {
               var2.a(this.b[var6], var5, var4 - this.B, var1);
            }

            var4 += 9;
         }
      }

      var4 = this.A + var3;

      for(var6 = 0; var6 < this.a.length; ++var6) {
         if (var4 + 9 > this.B && var4 < this.B + super.k) {
            var2.a(this.a[var6], this.a[var6] + super.n, var4 - this.B, var1);
         }

         var4 += 9;
      }

   }

   public be(XChatMidlet var1) {
      super(var1);
      z var10001 = var1.a;
      super.a.a = 9;
      super.j = 12632256;
   }

   public void a(Object var1, String var2, String var3, Vector var4, Vector var5, String var6, Displayable var7) {
      this.a = var1;
      if (var1 != null) {
         if (var1 instanceof Image) {
            this.b = (Image)var1;
         } else {
            this.a = (aj)var1;
         }
      }

      this.a = null;
      this.B = 0;
      this.a = var3;
      this.a = var1;
      this.a(var2, var4, var5);
      super.a(var6);
   }
}
