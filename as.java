import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import xchat.XChatMidlet;

public class as extends bb implements CommandListener, j {
   private XChatMidlet a;
   public Vector c;
   public int z;
   public long b;
   public ac b;

   public String a() {
      return "В твоем почтовом ящике находятся присланные тебе письма. Выбери сообщение чтобы прочесть его и написать ответ.";
   }

   public as(XChatMidlet var1) {
      super(var1, "Письма", 3);
      super.c = XChatMidlet.d;
      this.z = 0;
      this.a = var1;
      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.D);
      this.addCommand(XChatMidlet.ae);
      this.addCommand(XChatMidlet.aI);
      this.addCommand(XChatMidlet.w);
      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.B);
      this.addCommand(XChatMidlet.ab);
   }

   public void a(Vector var1, Displayable var2, boolean var3) {
      this.c = var1;
      this.b = System.currentTimeMillis();
      this.a.a.b = false;
      this.a(var3);
   }

   public void k() {
      if (!this.isShown()) {
         this.b = 0L;
      } else if (System.currentTimeMillis() - this.b > 10000L) {
         this.b = System.currentTimeMillis();
         this.c = this.a.a.a.b;
         this.a(false);
         super.b = true;
      }

      super.k();
   }

   public void a(boolean var1) {
      if (this.c.size() == 0) {
         ay var2 = new ay(this.a);
         var2.a("Внимание", "У тебя нет писем.\nПопроси кого-нибудь прислать тебе письмо ;)", 2, (ai)null, true);
      } else {
         int var7 = this.a();
         s var3 = this.a();
         this.b();
         Enumeration var4 = this.c.elements();

         for(int var5 = 0; var4.hasMoreElements(); ++var5) {
            s var6 = (s)var4.nextElement();
            this.a((var6.a ? "" : "*") + var6.a.n + " [" + var6.b + "]", var6.a.b);
            if (var3 != null && var6.a == var3.a) {
               var7 = var5;
            }
         }

         if (var7 >= this.b()) {
            --var7;
         }

         if (var7 >= 0) {
            this.a(var7, true);
         }

         if (var1) {
            super.g();
            this.setCommandListener(this);
         }
      }

   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == XChatMidlet.av) {
         aw.a(var2, var1);
      } else if (var2 instanceof Alert) {
         this.a.a((Displayable)this, true);
      } else {
         ag var3;
         s var4;
         if (var1 == XChatMidlet.ab) {
            this.b = this.a().a;
            if (this.b.b == this.a.a.a.b) {
               this.a.a((String)"Нельзя отправить письмо самому себе.", (Displayable)this, true);
               return;
            }

            var3 = new ag(this.a, false);
            var4 = this.a();
            String var5;
            if (var4.a.startsWith("Present: ")) {
               var5 = "";
            } else {
               var5 = var4.a;
            }

            var3.a(this, ">" + var4.a.n + "\n" + var5 + "\n>" + this.a.a.a.n + "\n");
         } else if (var1 == XChatMidlet.B) {
            this.b = this.a().a;
            if (this.b.b == this.a.a.a.b) {
               this.a.a((String)"Нельзя отправить письмо самому себе.", (Displayable)this, true);
               return;
            }

            var3 = new ag(this.a, false);
            var4 = this.a();
            var3.a(this, "");
         } else if (var1 == XChatMidlet.D) {
            this.a.a((ac)this.a().a, (Displayable)this);
         } else {
            s var6;
            if (var1 != XChatMidlet.ae && var1 != XChatMidlet.U && var1 != List.SELECT_COMMAND) {
               if (var1 == XChatMidlet.aI) {
                  var6 = (s)this.c.elementAt(this.a());
                  this.a.a.b(var6.a, true);
                  this.c.removeElement(var6);
                  this.a(false);
               } else if (var1 == XChatMidlet.w) {
                  this.a.a.e();
                  aw.a((Displayable)this, (Command)var1);
               } else {
                  this.a.commandAction(var1, var2);
               }
            } else {
               this.b = this.a().a;
               var6 = (s)this.c.elementAt(this.a());
               if (var6.a.startsWith("Present: ")) {
                  var6.a = true;
                  this.a(false);
                  this.a.a.a(var6.a);
                  this.a.a((Command)XChatMidlet.J, (Displayable)this);
               } else {
                  ay var7 = new ay(this.a);
                  var7.a(var6.a.n + " " + var6.b, var6.a, 1, (ai)null, true);
                  var7.addCommand(XChatMidlet.av);
                  var7.addCommand(XChatMidlet.B);
                  var7.addCommand(XChatMidlet.ab);
                  var7.setCommandListener(this);
                  var6.a = true;
                  this.a(false);
                  this.a.a.a(var6.a);
               }
            }
         }
      }

   }

   public s a() {
      return (s)this.c.elementAt(this.a());
   }
}
