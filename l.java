import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class l extends be implements j {
   public bd a;
   public int C;
   public boolean h;

   public String a() {
      if (XChatMidlet.a == 2) {
         return this.a.d == 2051 ? "Описание здания. Ты можешь перейти в чат здания. Выбери 'Комнаты', чтобы просмотреть комнаты этого здания.Чтобы скачать мелодию для своего телефона выбери пункт 'Мелодии'" : "Описание здания. Ты можешь перейти в чат здания. Выбери 'Комнаты', чтобы просмотреть комнаты этого здания.";
      } else {
         return "Описание комнаты. Перейди в чат комнаты, чтобы пообщаться с находящимися в нем жителями. ";
      }
   }

   public l(XChatMidlet var1) {
      super(var1);
      XChatMidlet.c((Displayable)this);
   }

   public void a(bd var1, int var2) {
      super.a.a = this;
      boolean var3 = false;
      if (var1.a.b != 1L && var2 == 3) {
         var3 = true;
         this.addCommand(XChatMidlet.W);
      } else {
         this.addCommand(XChatMidlet.d);
      }

      this.addCommand(XChatMidlet.av);
      if (var2 == -2) {
         this.removeCommand(XChatMidlet.aS);
      }

      if (super.a.a.a.a != null && var1.d == super.a.a.a.a.d) {
         this.removeCommand(XChatMidlet.L);
         this.addCommand(XChatMidlet.ah);
         this.addCommand(XChatMidlet.c);
      } else {
         this.removeCommand(XChatMidlet.L);
      }

      super.l = 3;
      this.C = var2;
      this.a = var1;
      if (var2 == 2) {
         this.removeCommand(XChatMidlet.as);
         if ((super.a.a.a.a == null || super.a.a.a.a.g != var1.d) && var1.a) {
            this.addCommand(XChatMidlet.as);
         }

         this.addCommand(XChatMidlet.aa);
         this.h = true;
      } else {
         this.addCommand(XChatMidlet.aA);
         this.h = false;
      }

      Vector var4 = new Vector();
      if (var2 == 3) {
         if (var1.a.b == super.a.a.a.b) {
            var4.addElement("Моя комната");
            this.removeCommand(XChatMidlet.av);
            this.addCommand(XChatMidlet.S);
            this.addCommand(XChatMidlet.N);
            this.removeCommand(XChatMidlet.L);
            this.removeCommand(XChatMidlet.ay);
         } else {
            this.addCommand(XChatMidlet.ay);
            if (!var1.c) {
               this.addCommand(XChatMidlet.aN);
            }

            var4.addElement("Владелец: " + var1.a.n);
         }

         var4.addElement(var1.c);
         if (var1.a.f > 0) {
            this.addCommand(XChatMidlet.k);
            var4.addElement("Фотогалерея: " + var1.a.f + " фото");
         } else if (var1.a > 0) {
            this.addCommand(XChatMidlet.k);
            var4.addElement("Фотогалерея: " + var1.a + " фото");
         }
      } else {
         this.removeCommand(XChatMidlet.ay);
         this.addCommand(XChatMidlet.av);
      }

      if (var1.a > 0) {
         this.addCommand(XChatMidlet.R);
      }

      av var5;
      if (!this.h && var1.a == 0) {
         var5 = XChatMidlet.b;
      } else {
         this.removeCommand(XChatMidlet.ay);
         this.removeCommand(XChatMidlet.aA);
         this.removeCommand(XChatMidlet.d);
         this.removeCommand(XChatMidlet.W);
         if (var1.a == 0) {
            var4.addElement("Нет комнат");
         } else {
            var4.addElement("Комнат:" + var1.a);
         }

         var4.addElement("В комнатах никого нет.");
         var5 = null;
      }

      if (var1.f == 0) {
         var4.addElement("В чате никого нет.");
      } else {
         var4.addElement("Жителей в чате:" + var1.f);
      }

      if (!this.h) {
         if (var1.h > 0) {
            var4.addElement((var3 ? "Тем в дневнике:" : "Тем в форуме:") + var1.h);
         } else {
            var4.addElement(var3 ? "Дневник пуст" : "Форум пуст");
         }
      }

      if (var2 == 2) {
         if (var1.b != 0) {
            this.addCommand(XChatMidlet.aq);
         }

         if (var1.e != 0) {
            this.addCommand(XChatMidlet.au);
         }

         var4.addElement("Всего жителей:" + var1.b);
         var4.addElement("Жителей в сети:" + var1.e);
      }

      Image var6 = var5 == null ? null : var5.a(var2 == 3 ? var1.a.b : var1.b, false);
      var5 = null;
      var4.addElement("Рейтинг: " + var1.a);
      this.a(var1.a);
      super.a(var6, var1.b + var1.a, var1.f, var4, (Vector)null, var1.b + var1.a, Display.getDisplay(super.a).getCurrent());
   }
}
