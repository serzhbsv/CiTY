import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class e extends ay implements j {
   public XChatMidlet a;
   public Vector d;
   public bd a;
   public Vector c;
   public Vector b;
   public Hashtable a;
   public Hashtable c;
   public int[] a;
   public int[] d;
   public int[] b;
   public int[] c;
   public int j;
   public int b;
   public int f;
   public Hashtable b;
   public z a;
   public z b;
   private String a;

   public e(XChatMidlet var1) {
      super(var1);
      this.a = var1;
      this.a = new z("/link.png");
      this.b = new z("/bold.png");
   }

   public void a(Vector var1, Displayable var2) {
      this.a = "Справка временно недоступна, извините за неудобства.";
      this.c = new Vector();
      this.b = new Vector();
      this.a = new Hashtable();
      this.c = new Hashtable();
      this.d = var1;
      this.a = this.a;
      this.f = this.getHeight();
      this.b = this.getWidth();
      this.b = new Hashtable();
      Enumeration var3 = var1.elements();
      StringBuffer var4 = new StringBuffer();
      if (var1.size() > 0) {
         String var5 = (String)var3.nextElement();
         var3.nextElement();
         int var6 = 0;

         while(true) {
            Vector var13;
            while(var3.hasMoreElements()) {
               Object var7 = var3.nextElement();
               if (var7 instanceof String) {
                  var4.append((String)var7 + "\n");
               } else {
                  int var10;
                  if (var7 instanceof Vector) {
                     var13 = (Vector)var7;
                     if (var13.elementAt(0) instanceof Boolean) {
                        this.a = (String)var13.elementAt(1);
                     } else {
                        int var14;
                        Vector var15;
                        if (var13.elementAt(0) instanceof Integer) {
                           switch((Integer)var13.elementAt(0)) {
                           case 0:
                              var14 = bh.a(var4.toString(), this.a, this.b - 4, true).size();
                              var4.append((String)var13.elementAt(1) + "\n");
                              var10 = bh.a(var4.toString(), this.a, this.b - 4, true).size() - 1;
                              var15 = new Vector();
                              var15.addElement(new Integer(var14));
                              var15.addElement(new Integer(var10));
                              this.c.addElement(var15);
                              this.a.put(new Integer(var6), var13.elementAt(2));
                              this.c.put(new Integer(var6++), var13.elementAt(1));
                              break;
                           case 1:
                              var14 = bh.a(var4.toString(), this.b, this.b - 4, true).size();
                              var4.append((String)var13.elementAt(1) + "\n");
                              var10 = bh.a(var4.toString(), this.b, this.b - 4, true).size() - 1;
                              var15 = new Vector();
                              var15.addElement(new Integer(var14));
                              var15.addElement(new Integer(var10));
                              this.b.addElement(var15);
                           }
                        } else {
                           var14 = bh.a(var4.toString(), this.a, this.b - 4, true).size();
                           var4.append((String)var13.elementAt(0) + "\n");
                           var10 = bh.a(var4.toString(), this.a, this.b - 4, true).size() - 1;
                           var15 = new Vector();
                           var15.addElement(new Integer(var14));
                           var15.addElement(new Integer(var10));
                           this.c.addElement(var15);
                           this.a.put(new Integer(var6), var13.elementAt(1));
                           this.c.put(new Integer(var6++), var13.elementAt(0));
                        }
                     }
                  } else if (var7 instanceof byte[]) {
                     byte[] var8 = (byte[])var7;
                     Image var9 = Image.createImage(var8, 0, var8.length);
                     int var10000 = var9.getHeight();
                     z var10001 = this.a.a;
                     var10 = var10000 / 9 + 2;
                     var4.append("\n¢\n¢");
                     int var11 = bh.a(var4.toString(), this.a.a, this.b, true).size() - 1;
                     this.b.put(new Integer(var11), var9);

                     while(var10-- > 0) {
                        var4.append("\n¢");
                     }
                  }
               }
            }

            this.a = new int[this.c.size()];
            this.d = new int[this.c.size()];
            this.b = new int[this.b.size()];
            this.c = new int[this.b.size()];

            int var12;
            for(var12 = 0; var12 < this.c.size(); ++var12) {
               var13 = (Vector)this.c.elementAt(var12);
               this.d[var12] = (Integer)var13.elementAt(1);
               this.a[var12] = (Integer)var13.elementAt(0);
            }

            for(var12 = 0; var12 < this.b.size(); ++var12) {
               var13 = (Vector)this.b.elementAt(var12);
               this.c[var12] = (Integer)var13.elementAt(1);
               this.b[var12] = (Integer)var13.elementAt(0);
            }

            super.a(var5, var4.toString(), 1, (ai)null, true);
            break;
         }
      }

      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.E);
      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.Z);
      this.addCommand(XChatMidlet.aN);
      this.setCommandListener(this.a);
      if (var1.size() <= 0) {
         this.a.a((Displayable)this, true);
      }

   }

   public void a(int var1, int var2, int var3, Graphics var4, z var5) {
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;
      if (var1 >= super.a.e && var1 <= super.a.e + super.p) {
         int var9;
         for(var9 = 0; var9 < this.a.length; ++var9) {
            if (var1 >= this.a[var9] && var1 <= this.d[var9]) {
               var6 = true;
               var8 = var9;
               break;
            }
         }

         if (!var6) {
            for(var9 = 0; var9 < this.b.length; ++var9) {
               if (var1 >= this.b[var9] && var1 <= this.c[var9]) {
                  var7 = true;
                  break;
               }
            }
         }

         if (var6) {
            this.a.a(super.a[var1], var2, var3, var4);
            if (var8 == this.j) {
               var4.setColor(245);
               var4.drawLine(var2, var3 + 9, var2 + var5.a(super.a[var1]), var3 + 9);
            }
         } else if (var7) {
            this.b.a(super.a[var1], var2, var3, var4);
         } else {
            this.a.a.a(super.a[var1], var2, var3, var4);
         }

         if (this.b.containsKey(new Integer(var1))) {
            var4.drawImage((Image)this.b.get(new Integer(var1)), this.b / 2, var3, 17);
         }
      }

   }

   public void keyPressed(int var1) {
      int var2 = this.getGameAction(var1);
      switch(var2) {
      case 1:
         if (this.j > 0 && super.a.e <= this.a[this.j - 1]) {
            --this.j;
         } else {
            super.keyPressed(var1);
         }
         break;
      case 6:
         if (this.j < this.a.length - 1 && super.a.e + super.p > this.d[this.j + 1]) {
            ++this.j;
         } else {
            super.keyPressed(var1);
         }
         break;
      case 8:
         String var3 = (String)this.a.get(new Integer(this.j));
         this.a(var3);
      }

      super.b = true;
   }

   public void a(String var1) {
      if (var1 != null) {
         Vector var2 = new Vector();
         var2.addElement(var1);
         var2.addElement(new Integer(this.j));
         this.a.a("Надо немного подождать...", "Загружается ссылка", this);
         aw.a.a(new a((byte)100, var2));
      }

   }

   public String a() {
      return this.a;
   }
}
