import com.siemens.mp.game.Vibrator;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import xchat.XChatMidlet;

public class aw extends Canvas implements Runnable {
   public Displayable a;
   public static n a;

   public static void a(Displayable var0, Command var1) {
      Displayable var2 = null;
      if (var0 instanceof ae) {
         var2 = XChatMidlet.a.c;
      } else if (var0 instanceof aw) {
         var2 = ((aw)var0).a;
      } else if (var0 instanceof d) {
         var2 = ((d)var0).a;
      }

      if (var2 == null && var1 != XChatMidlet.j) {
         XChatMidlet.a.a();
      } else if (var0 instanceof v && var1 == XChatMidlet.j) {
         XChatMidlet.a.a(2, 1, XChatMidlet.a.a);
      } else if (var0 instanceof ae) {
         Displayable var3 = XChatMidlet.a.a();
         if (var3 == null) {
            XChatMidlet.a.a();
         } else {
            XChatMidlet.a.a(var3, false);
         }

         XChatMidlet.a.d = true;
      } else if (var0 instanceof l) {
         if (var2 == null) {
            if (XChatMidlet.a.c == null) {
               XChatMidlet.a.a();
            } else {
               XChatMidlet.a.a(XChatMidlet.a.c, false);
            }
         } else {
            XChatMidlet.a.a(var2, false);
         }
      } else {
         v var5;
         if (var0 instanceof aa) {
            if (var2 == null) {
               var5 = new v(XChatMidlet.a);
               var5.b();
            } else if (var2 instanceof v) {
               var5 = new v(XChatMidlet.a);
               var5.b();
               XChatMidlet.a.c = var2;
            } else {
               XChatMidlet.a.a(var2, false);
            }
         } else {
            w var6;
            if (var0 instanceof ay && ((aw)var0).a instanceof w) {
               var6 = (w)((aw)var0).a;
               if (var6.e == w.d) {
                  XChatMidlet.a.a((Displayable)(new w(XChatMidlet.a, w.h)), false);
               } else {
                  XChatMidlet.a.a(var2, false);
               }
            } else if (var0 instanceof w) {
               var6 = (w)var0;
               if (var6.e == w.f && var6.a()) {
                  ay var8 = new ay(XChatMidlet.a);
                  var8.a("Вопрос", "Паспортные данные изменены. \nСохранить?", 4, var6, true);
               } else {
                  v var4 = new v(XChatMidlet.a);
                  var4.b();
               }
            } else if (var0 instanceof ax) {
               ax var7 = (ax)var0;
               if (var7.a == null) {
                  XChatMidlet.a.a(var7.a, true);
               } else {
                  XChatMidlet.a.a(var2, false);
               }

               XChatMidlet.a.a.b(var7.a.d);
            } else if (var1 == XChatMidlet.j) {
               XChatMidlet.a.a(0, 0, XChatMidlet.a.a);
            } else if (var0 instanceof m) {
               if (((m)var0).a == null) {
                  var5 = new v(XChatMidlet.a);
                  var5.b();
               } else {
                  XChatMidlet.a.a(var2, false);
               }
            } else {
               XChatMidlet.a.a(var2, false);
            }
         }
      }

      System.gc();
   }

   public static void a(Displayable var0, Displayable var1) {
      byte var2 = 10;
      if (var0 instanceof aw) {
         ((aw)var0).a = var1;
      } else if (var0 instanceof d) {
         ((d)var0).a = var1;
      } else if (var0 instanceof ag) {
         ((ag)var0).a = var1;
         return;
      }

      Displayable var3 = var0;
      Displayable var4 = var0;

      int var5;
      for(var5 = 0; var3 != null; ++var5) {
         if (var3 instanceof aw) {
            if (((aw)var3).a == var3) {
               break;
            }

            if (((aw)var3).a instanceof aw) {
               var3 = ((aw)var3).a;
            } else if (((aw)var3).a instanceof d) {
               var3 = ((aw)var3).a;
            } else {
               var3 = null;
            }
         } else if (var3 instanceof d) {
            if (((d)var3).a == var3) {
               break;
            }

            if (((d)var3).a instanceof d) {
               var3 = ((d)var3).a;
            } else if (((d)var3).a instanceof aw) {
               var3 = ((d)var3).a;
            } else {
               var3 = null;
            }
         }
      }

      if (var5 > var2) {
         for(int var6 = 0; var6 < var2; ++var6) {
            if (var3 instanceof aw) {
               var4 = ((aw)var4).a;
            } else if (var3 instanceof d) {
               var4 = ((d)var4).a;
            }
         }

         if (var3 instanceof aw) {
            ((aw)var4).a = var3;
         } else if (var3 instanceof d) {
            ((d)var4).a = var3;
         }
      }

   }

   public static void d(String var0) {
      try {
         RecordStore.deleteRecordStore(var0);
      } catch (Exception var2) {
      }

   }

   public static byte[] a(String var0) {
      RecordStore var1 = null;

      try {
         var1 = RecordStore.openRecordStore(var0, true);
         RecordEnumeration var2 = var1.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
         byte[] var3 = var2.nextRecord();
         var2.destroy();
         var1.closeRecordStore();
         return var3;
      } catch (Exception var5) {
         try {
            var1.closeRecordStore();
         } catch (Exception var4) {
         }

         return null;
      }
   }

   public static void a(String var0, byte[] var1) {
      RecordStore var2 = null;

      try {
         var2 = RecordStore.openRecordStore(var0, true);
         var2.addRecord(var1, 0, var1.length);
         var2.closeRecordStore();
      } catch (Exception var6) {
         try {
            var2.closeRecordStore();
         } catch (Exception var5) {
         }
      }

   }

   public static void l() {
      System.gc();
   }

   public static Image a(String var0) {
      try {
         Image var1 = null;
         if (var1 == null) {
            var1 = Image.createImage(var0);
         }

         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   public static n a(x var0) {
      return new n(var0);
   }

   public void paint(Graphics var1) {
   }

   public void run() {
   }

   public static void c(int var0) {
   }

   public static void a(int var0, int var1) {
      Vibrator.triggerVibrator(var1);
   }

   public static void a(XChatMidlet var0, Displayable var1) {
      c var2 = new c(var0);
      var2.b(var1);
   }
}
