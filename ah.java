import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class ah implements x {
   public int b;
   public int a;
   public f a;
   public Hashtable a;
   public bd a;
   public XChatMidlet a;
   public long a = 0L;
   public boolean b;
   public Vector b;
   public Vector a;
   public boolean a = false;
   public Vector c = null;
   public String a;

   public void a(String var1, int var2) throws IOException {
      aw.a.a(var1, var2);
   }

   public ah(XChatMidlet var1) {
      aw.a = aw.a((x)this);
      this.a = var1;
      this.a = null;
      this.a = new Hashtable();
      this.a = new bd();
      this.a = new Vector();
      this.b = new Vector();
   }

   public void a(long var1, int var3, boolean var4) {
      Vector var5 = new Vector();
      var5.addElement(new Byte((byte)112));
      var5.addElement(new Long(var1));
      var5.addElement(new Boolean(var4));
      aw.a.a(new a((byte)89, var5));
   }

   public void a(r var1, int var2) {
      Vector var3 = new Vector();
      var3.addElement(new Long((long)var1.d));
      var3.addElement(new Long((long)var2));
      var3.addElement(new Byte((byte)1));
      aw.a.a(new a((byte)60, var3));
   }

   public void b(long var1, String var3) {
      Vector var4 = new Vector();
      var4.addElement(new Long(var1));
      var4.addElement(var3);
      aw.a.a(new a((byte)63, var4));
   }

   public void b(f var1) {
      Vector var2 = var1.a(true);
      String var3 = this.a();
      var2.addElement(new Integer(18));
      var2.addElement(var3);
      var2.addElement(var1.a());
      aw.a.a(new a((byte)125, var2));
   }

   public void c(f var1) {
      Vector var2 = var1.a(true);
      var2.addElement(new Integer(18));
      var2.addElement(this.a());
      var2.addElement(var1.a());
      aw.a.a(new a((byte)127, var2));
   }

   public void a(f var1) {
      Vector var2 = var1.a(true);
      var2.addElement(new Integer(18));
      var2.addElement(this.a());
      if (var1.C.length() != 0 && var1.C.length() != 0 && var1.a().length() != 0) {
         var2.addElement(var1.a());
      } else {
         var2.addElement("getQuestions");
      }

      aw.a.a(new a((byte)126, var2));
   }

   public String a() {
      String var1 = "";
      StringBuffer var3 = new StringBuffer();

      try {
         InputStream var4 = this.getClass().getResourceAsStream("/city1.ru.txt");

         int var2;
         while((var2 = var4.read()) > 0) {
            var3.append((char)var2);
         }

         var1 = new String(var3);
         if (var1.equals("en")) {
            aw.a.a(new a((byte)110, new Byte((byte)1)));
         }
      } catch (Exception var5) {
         System.out.println(var5);
      }

      return var1;
   }

   public void d() {
      Vector var1 = new Vector();
      var1.addElement(new Byte((byte)70));
      aw.a.a(new a((byte)89, var1));
   }

   public void a(int var1, boolean var2) {
      Vector var3 = new Vector();
      var3.addElement(new Integer(var1));
      var3.addElement(new Boolean(var2));
      aw.a.a(new a((byte)10, var3));
   }

   public void b(int var1) {
      aw.a.a(new a((byte)11, new Integer(var1)));
   }

   public void a(int var1, String var2) {
      var2 = var2.trim();
      if (var2.length() != 0) {
         var2 = this.a.n + ": " + var2;
         Vector var3 = new Vector(2);
         var3.addElement(new Integer(var1));
         var3.addElement(var2);
         aw.a.a(new a((byte)9, var3));
      }

   }

   public void a(int var1) {
      this.b();
      aw.a.a(new a((byte)15, new Integer(var1)));
   }

   public void b(int var1, boolean var2) {
      aw.a.a(new a((byte)16, new Integer(var1)));
      if (var2) {
         for(int var3 = 0; var3 < this.a.b.size(); ++var3) {
            if (((s)this.a.b.elementAt(var3)).a == var1) {
               this.a.b.removeElementAt(var3);
               break;
            }
         }

         this.b();
      }

   }

   public void e() {
      Enumeration var1 = this.a.b.elements();

      while(var1.hasMoreElements()) {
         s var2 = (s)var1.nextElement();
         this.b(var2.a, false);
      }

      this.a.b.removeAllElements();
      this.b();
      aw.a.a(new a((byte)95, (Object)null));
   }

   public void c(long var1, String var3) {
      Vector var4 = new Vector(2);
      var4.addElement(new Long(var1));
      var4.addElement(var3);
      aw.a.a(new a((byte)14, var4));
   }

   public void d(f var1) {
      Vector var2 = var1.a(true);
      var2.addElement(var1.a());
      aw.a.a(new a((byte)13, var2));
   }

   public void d(int var1) {
      aw.a.a(new a((byte)18, new Integer(var1)));
   }

   public void a(bd var1) {
      aw.a.a(new a((byte)19, var1.a(true)));
   }

   public void c(int var1) {
      Vector var2 = new Vector();
      var2.addElement(new Integer(var1));
      Vector var3 = new Vector();
      var3.addElement(new Byte((byte)15));
      var3.addElement(var2);
      aw.a.a(new a((byte)89, var3));
   }

   public void a(String var1, boolean var2, int var3) {
      Vector var4 = new Vector();
      Vector var5 = new Vector();
      var4.addElement(var1);
      var4.addElement(new Boolean(var2));
      var4.addElement(new Integer(var3));
      var5.addElement(new Byte((byte)16));
      var5.addElement(var4);
      aw.a.a(new a((byte)89, var5));
   }

   public void a(Vector var1) {
      Vector var2 = new Vector();
      var2.addElement(new Byte((byte)71));
      var2.addElement(var1);
      aw.a.a(new a((byte)89, var2));
   }

   public void d(Vector var1) {
      aw.a.a(new a((byte)77, var1));
   }

   public void a(a var1) {
      if (this.a.d) {
         this.a.d = false;
      } else {
         try {
            ac var2;
            int var3;
            Vector var7;
            switch(var1.a) {
            case 4:
               aw.a.b(new a((byte)4, (Object)null), true);
            case 5:
            case 7:
            case 12:
            case 16:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 30:
            case 31:
            case 35:
            case 36:
            case 37:
            case 39:
            case 42:
            case 47:
            case 48:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case 61:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 82:
            case 83:
            case 85:
            case 86:
            case 87:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
            case 99:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            default:
               break;
            case 6:
               if (var1.a instanceof Vector) {
                  this.a = new f();
                  this.a.a((Vector)((Vector)var1.a).firstElement());
                  this.a.a((Vector)((Vector)var1.a).elementAt(1));
                  this.b();
                  if (((Vector)var1.a).size() > 2) {
                     v.b = (Vector)((Vector)var1.a).elementAt(2);
                  }

                  this.a.a((ac)this.a);
               } else {
                  this.a.b(7);
               }
               break;
            case 8:
               if (var1.a instanceof Vector) {
                  this.a = new f();
                  this.a.a((Vector)((Vector)var1.a).firstElement());
                  if (((Vector)var1.a).lastElement() instanceof Boolean && (Boolean)((Vector)var1.a).lastElement()) {
                     this.b = true;
                  }

                  this.a.a(this.a);
               } else {
                  this.a.c((Integer)var1.a);
               }
               break;
            case 9:
               aw.c(2000);
               long var4 = (Long)((Vector)var1.a).firstElement();
               int var10 = (Integer)((Vector)var1.a).elementAt(1);
               var3 = (Integer)((Vector)var1.a).elementAt(2);
               String var6 = (String)((Vector)var1.a).lastElement();
               this.a.a(var4, var10, var3, var6);
               break;
            case 10:
               var3 = (Integer)((Vector)var1.a).firstElement();
               var2 = new ac();
               var2.a((Vector)((Vector)var1.a).elementAt(1));
               if (this.a.d == var3) {
                  this.a.a.put(new Long(var2.b), var2);
               }

               if (this.a.a != null && this.a.b != var2.b && this.a.a.d == var3) {
                  p var28 = new p();
                  var28.a = var2;
                  var28.a = 2;
                  this.a(var28);
               }
               break;
            case 11:
               var3 = (Integer)((Vector)var1.a).firstElement();
               var2 = new ac();
               var2.a((Vector)((Vector)var1.a).lastElement());
               if (this.a.d == var3) {
                  this.a.a.remove(new Long(var2.b));
               }
               break;
            case 13:
            case 50:
               this.a.c((Vector)var1.a);
               break;
            case 14:
               aw.c(2000);
               aw.a(0, 500);
               this.b = true;
               ac var13 = new ac();
               var13.a((Vector)((Vector)var1.a).firstElement());
               s var14 = s.a((Vector)((Vector)var1.a).lastElement());
               var14.a = var13;
               if (this.a.b == null) {
                  this.a.b = new Vector();
               }

               this.a.b.insertElementAt(var14, 0);
               int var15 = this.a.b.size();
               if (var15 > 20) {
                  this.a.b.removeElementAt(var15 - 1);
               }

               this.a.f();
               break;
            case 15:
               this.a.g((Vector)var1.a);
               break;
            case 18:
               this.a.a((Vector)var1.a);
               this.a.e();
               break;
            case 19:
               aw.c(2000);
               bd var11 = new bd();
               var11.a((Vector)var1.a);
               int var12 = var11.d;
               if (this.a.a != null && this.a.a.d == var12) {
                  this.a.a.a(var11);
               }

               this.a = var11;
               this.a.a(var12, var11);
               break;
            case 26:
               aw.a.a(false);
               this.a.h();
               break;
            case 27:
               aw.c(2000);
               aw.a(0, 2000);
               ac var16 = new ac();
               var16.a((Vector)((Vector)var1.a).elementAt(0));
               this.a(var16);
               break;
            case 28:
               this.a(var1.a, true);
               break;
            case 29:
               this.a(var1.a, false);
               break;
            case 32:
               p var17 = new p();
               var17.a = var1.a == 31 ? 3 : 4;
               var17.a = new ac();
               var17.a.a((Vector)var1.a);
               this.a(var17);
               break;
            case 33:
               this.a = new bd();
               this.a.a((Vector)var1.a);
               if (this.a.a != null && this.a.a.d == this.a.d) {
                  this.a.a = this.a;
               }

               this.a.a(this.a, false);
               break;
            case 34:
               f var9 = new f();
               var9.a((Vector)var1.a);
               this.a.a(var9, Display.getDisplay(this.a).getCurrent());
               break;
            case 38:
               this.b((Vector)var1.a);
               break;
            case 40:
               this.a.a("Ошибка загрузки картинки.\nНеверный формат файла.");
               break;
            case 41:
               this.a.e((Vector)var1.a);
               break;
            case 43:
               this.a.f = true;
               this.a.c();
               break;
            case 44:
            case 45:
            case 46:
               this.a.c(var1.a);
               break;
            case 51:
               this.a.a((Vector)var1.a, false);
               break;
            case 56:
               this.a = new bd();
               this.a.a((Vector)var1.a);
               if (this.a.a != null && this.a.a.d == this.a.d) {
                  this.a.a = this.a;
               }

               this.a.a(this.a);
               break;
            case 60:
            case 62:
               this.a.f((Vector)var1.a);
               break;
            case 78:
               this.a.b();
               break;
            case 79:
               this.a.b((String)var1.a);
               break;
            case 80:
               var7 = (Vector)var1.a;
               Displayable var19 = this.a.a();
               this.a.a = new g(this.a, var19, var7);
               break;
            case 81:
               var7 = (Vector)var1.a;
               ay var20 = new ay(this.a);
               Enumeration var8 = ((Vector)var7.elementAt(0)).elements();
               StringBuffer var21 = new StringBuffer();

               while(var8.hasMoreElements()) {
                  Object var29 = var8.nextElement();
                  if (var29 instanceof String) {
                     var21.append(var29.toString());
                  }
               }

               var20.a("Результаты поиска", new String(var21), 2, (ai)null, true);
               break;
            case 84:
               Displayable var22 = this.a.a();
               var7 = (Vector)var1.a;
               if (var7.size() > 2) {
                  i var30 = new i(this.a, var22, var7);
                  this.a.a((Displayable)var30, true);
               } else {
                  new be(this.a);
                  byte[] var31 = (byte[])var7.elementAt(1);
                  Image var25 = Image.createImage(var31, 0, var31.length);
                  au var26 = new au(this.a);
                  var26.a(var25, var7.elementAt(0).toString(), 0, 0, var22);
               }
               break;
            case 89:
               var7 = (Vector)var1.a;
               byte var18 = (Byte)var7.firstElement();
               this.a(var18, (Vector)var7.elementAt(1));
               break;
            case 95:
               this.a.i((Vector)var1.a);
               break;
            case 100:
               Vector var23 = (Vector)var1.a;
               e var24 = new e(this.a);
               var24.a(var23, this.a.a());
               break;
            case 125:
               if (var1.a instanceof Vector) {
                  this.a = new f();
                  this.a.a((Vector)((Vector)var1.a).firstElement());
                  this.a.a((Vector)((Vector)var1.a).elementAt(1));
                  this.b();
                  if (((Vector)var1.a).size() > 2) {
                     v.b = (Vector)((Vector)var1.a).elementAt(2);
                  }

                  this.a.a((ac)this.a);
               } else {
                  this.a.b((Integer)var1.a);
               }
               break;
            case 126:
               if (var1.a instanceof Vector) {
                  this.a.a((Displayable)(new w(this.a, w.d, (Vector)var1.a)), false);
               } else {
                  this.a.d((Integer)var1.a);
               }
            }
         } catch (Exception var27) {
            var27.printStackTrace();
         }

      }
   }

   private void a(byte var1, Vector var2) {
      if (var1 == 56) {
         this.a.b(var2, false);
      } else if (var1 == 103) {
         this.a.a = true;
         aw.l();
         this.a.c(var2, true);
      } else if (var1 == 17) {
         if (!(Boolean)var2.elementAt(7)) {
            this.a.a = false;
         }

         this.a.c(var2, false);
      } else if (var1 == 99) {
         this.a.a(var2);
      } else if (var1 == 39) {
         v.h = true;
         v.b = var2;
      } else {
         aa var3;
         if (var1 == 37) {
            var3 = new aa(this.a, var2, this.a.a());
            var3.z = (Integer)var2.elementAt(6);
            var3.g();
         } else if (var1 == 51) {
            this.a.a(var2, false);
         } else if (var1 == 45) {
            this.a.c(var2);
         } else {
            Displayable var6;
            if (var1 == 36) {
               var6 = this.a.a();
               if (var6 == null) {
                  var6 = this.a.a;
               }

               ay var4 = new ay(this.a);
               var4.a((String)var2.elementAt(0), (String)var2.elementAt(1), (Integer)var2.elementAt(2), (ai)null, true);
            } else if (var1 == 92) {
               this.a.h(var2);
            } else if (var1 == 98) {
               this.a.b(var2);
            } else if (var1 == 93) {
               this.a.k(var2);
            } else if (var1 == 94) {
               this.a.k(var2);
            } else if (var1 != 95) {
               if (var1 == 10) {
                  this.a.g(var2);
               } else if (var1 == 55) {
                  this.a.f(var2);
               } else if (var1 == 15) {
                  this.a.d(var2);
               } else if (var1 == 81) {
                  this.a.j(var2);
               } else if (var1 == 77) {
                  this.a.a(var2, true);
               } else if (var1 == 111) {
                  var6 = this.a.a();
                  i var7 = new i(this.a, this.a.a, var2);
                  this.a.a((Displayable)var7, true);
               } else if (var1 == 16) {
                  var3 = new aa(this.a, var2, this.a.a());
                  var3.z = (Integer)var2.elementAt(6);
                  var3.n();
               } else if (var1 == 34) {
                  this.a.a((String)var2.elementAt(0), (Byte)var2.elementAt(2) == 1);
                  this.a.c = (long)(Integer)var2.elementAt(1);
               } else if (var1 == 122) {
                  this.a.c((String)var2.elementAt(0));
               } else if (var1 == 70) {
                  var3 = new aa(this.a, var2, this.a.a());
                  var3.g();
               } else if (var1 != 59 && var1 != 60) {
                  m var8;
                  if (var1 != 118 && var1 != 119 && var1 != 18) {
                     if (var1 == 123) {
                        var6 = this.a.a();
                        if (var6 == null) {
                           var8 = new m(this.a, var2, this.a.c);
                        } else {
                           var8 = new m(this.a, var2, var6);
                        }

                        this.a.a((Displayable)var8, true);
                     }
                  } else {
                     var6 = this.a.a();
                     if (var6 == null) {
                        var8 = new m(this.a, var2, this.a.c);
                     } else {
                        var8 = new m(this.a, var2, var6);
                     }

                     this.a.a((Displayable)var8, true);
                     if (this.a.b) {
                        ay var5 = new ay(this.a);
                        var5.a("Поздравляем", "Теперь ты житель CiTY! Ты можешь бродить по зданиям и комнатам, чатиться и заводить друзей!\n \nТы можешь занять комнату в Жилом квартале и пригласить туда других жителей. \nТы можешь воспользоваться мгновенной почтовой службой CiTY...\nЧтобы окунуться в CiTY, жми 'ОК'.", 2, (ai)null, true);
                        this.a.b = false;
                     }
                  }
               } else {
                  var3 = new aa(this.a, var2, this.a.a());
                  var3.n();
               }
            }
         }
      }

   }

   public void b(Vector var1) {
      this.a = true;
      byte var2 = 0;
      int var4 = var2 + 1;
      this.b = (Integer)var1.elementAt(var2);
      this.a = (Integer)var1.elementAt(var4++);
      Vector var3 = (Vector)var1.elementAt(var4++);
      if (var3 != null) {
         this.a.a = new bd();
         this.a.a.a(var3);
      }

      this.a = (String)var1.elementAt(var4++);
      this.c = (Vector)var1.elementAt(var4++);
      an.d = (Integer)var1.elementAt(var4++);
      an.a = (Boolean)var1.elementAt(var4++);
      an.b = (Boolean)var1.elementAt(var4++);
      an.c = (Integer)var1.elementAt(var4++);
      this.a.d();
   }

   public void a(Object var1, boolean var2) {
      long var3 = 0L;
      if (var1 instanceof Long) {
         var3 = (Long)var1;
      } else if (var1 instanceof Vector) {
         var3 = (Long)((Vector)var1).elementAt(0);
      }

      if (var3 != this.a.b) {
         if (var2) {
            ++this.a;
         } else {
            --this.a;
         }

         if (this.a <= 0) {
            this.a = 1;
         }
      }

      f var5 = new f();
      var5.b = var3;
      if (this.a != null) {
         this.a(this.a.a, var5, var2);
      }

      XChatMidlet var10000 = this.a;
      if (XChatMidlet.b instanceof aa) {
         var10000 = this.a;
         aa var6 = (aa)XChatMidlet.b;
         if (var6.a == 7 || var6.a == 6 || var6.a == 3 || var6.a == 5 || var6.a == 19 || var6.a == 1) {
            for(int var8 = 0; var8 < var6.c.size(); ++var8) {
               Vector var7 = (Vector)var6.c.elementAt(var8);
               if ((Long)var7.elementAt(0) == var3) {
                  var7.setElementAt(var2 ? ((Vector)var1).elementAt(1) : new Byte((byte)0), 3);
                  var7.setElementAt(new Boolean(var2), 2);
                  var6.c.setElementAt(var7, var8);
                  var6.b();
                  var6.a(var6.c);
                  break;
               }
            }
         }
      }

      if (var5.b != 1L && var2 && this.a.b.containsKey(new Long(var5.b))) {
         p var9 = new p();
         var9.a = (ac)this.a.b.get(new Long(var5.b));
         var9.a = 1;
         this.a(var9);
      }

   }

   public void a(p var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         p var4 = (p)this.b.elementAt(var3);
         if (var4.a == var1.a && var4.a == var1.a) {
            var2 = true;
            break;
         }
      }

      if (!var2) {
         this.b.insertElementAt(var1, 0);
      }

   }

   public void a(Hashtable var1, ac var2, boolean var3) {
      if (var1 != null) {
         ac var4 = (ac)var1.get(new Long(var2.b));
         if (var4 != null) {
            var4.d = var3;
         }
      }

   }

   public void g() {
      this.a.h();
   }

   public void a(ac var1) {
      this.a.insertElementAt(var1, 0);
   }

   public void e(int var1) {
      if (this.a.a != null && var1 == this.a.a.d) {
         this.a = this.a.a;
         this.a.a(this.a.a, false);
      } else if (this.a != null && var1 == this.a.d) {
         this.a.a(this.a, false);
      } else {
         aw.a.a(new a((byte)33, new Integer(var1)));
      }

   }

   public void a(byte var1) {
      Vector var2 = new Vector();
      var2.addElement(new Byte((byte)46));
      var2.addElement(new Byte(var1));
      aw.a.a(new a((byte)89, var2));
   }

   public void a(boolean var1) {
      Vector var2 = new Vector();
      var2.addElement(new Byte((byte)45));
      var2.addElement(new Boolean(var1));
      aw.a.a(new a((byte)89, var2));
   }

   public void g(long var1) {
      aw.a.a(new a((byte)34, new Long(var1)));
   }

   public void a(String var1) {
      aw.a.a(new a((byte)47, var1));
      aw.a.a(new a((byte)74));
   }

   public void f(long var1) {
      aw.a.a(new a((byte)73, new Long(var1)));
   }

   public void j(long var1) {
      aw.a.a(new a((byte)72, new Long(var1)));
   }

   public void b(boolean var1) {
      aw.a.a(new a((byte)(var1 ? 70 : 71)));
   }

   public void b(long var1) {
      aw.a.a(new a((byte)49, new Long(var1)));
   }

   public void i(long var1) {
      aw.a.a(new a((byte)27, new Long(var1)));
   }

   public void h(long var1) {
      aw.a.a(new a((byte)31, new Long(var1)));
   }

   public void a(long var1) {
      aw.a.a(new a((byte)32, new Long(var1)));
   }

   public void c(long var1) {
      aw.a.a(new a((byte)36, new Long(var1)));
   }

   public void e(long var1) {
      aw.a.a(new a((byte)37, new Long(var1)));
   }

   public void f() {
      aw.a.a(new a((byte)79));
   }

   public void d(long var1) {
      aw.a.a(new a((byte)52, new Long(var1)));
   }

   public void a(String var1, String var2) {
      Vector var3 = new Vector();
      var3.addElement(new Byte((byte)52));
      var3.addElement(var1);
      var3.addElement(var2);
      aw.a.a(new a((byte)89, var3));
   }

   public void b() {
      this.b = false;

      for(int var1 = 0; var1 < this.a.b.size(); ++var1) {
         if (!((s)this.a.b.elementAt(var1)).a) {
            this.b = true;
            break;
         }
      }

   }

   public void c(Vector var1) {
      aw.a.a(new a((byte)89, var1));
   }

   public void c() {
      Vector var1 = new Vector();
      var1.addElement(new Byte((byte)98));
      aw.a.a(new a((byte)89, var1));
   }

   public void a(long var1, long var3, String var5) {
      Vector var6 = new Vector();
      var6.addElement(new Byte((byte)79));
      var6.addElement(new Long(var1));
      var6.addElement(new Long(var3));
      var6.addElement(var5);
      aw.a.a(new a((byte)89, var6));
   }

   public void a(long var1, String var3) {
      Vector var4 = new Vector(3);
      var4.addElement(new Byte((byte)113));
      var4.addElement(new Long(var1));
      var4.addElement(var3);
      aw.a.a(new a((byte)89, var4));
   }

   public void a() {
      Vector var1 = new Vector(1);
      var1.addElement(new Byte((byte)122));
      aw.a.a(new a((byte)89, var1));
   }
}
