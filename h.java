import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class h extends be implements j {
   private static Calendar a = Calendar.getInstance();
   public f a;

   public String a() {
      return "Информация о жителе. Ты можешь отправить жителю сообщение, сделать его врагом или другом, просмотреть его фото, если имеется.";
   }

   public h(XChatMidlet var1) {
      super(var1);
      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.av);
   }

   public void a(f var1, Displayable var2) {
      if (an.a) {
         this.addCommand(XChatMidlet.aR);
      }

      super.a.a.a = var1.b;
      super.l = 0;
      super.j = 8956450;
      if (an.b && var1.b != super.a.a.a.b) {
         this.addCommand(XChatMidlet.G);
      }

      this.a = var1;
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      av var5 = XChatMidlet.b;
      if (var5 == null) {
         var5 = XChatMidlet.d;
      }

      Image var6 = var5.a(var1.b, false);
      String var7 = var1.n;
      String var8 = var1.u;
      var3.addElement("Прописка");
      var4.addElement(var1.w == null ? "Странник" : var1.w);
      var3.addElement(var1.a == 0 ? "Зарегистрирован" : "Зарегистрирована");
      var4.addElement(var1.g);
      var3.addElement(var1.a == 0 ? "Заходил" : "Заходила");
      var4.addElement(var1.b);
      var3.addElement("Пол");
      var4.addElement(var1.a == 0 ? "Мужской" : "Женский");
      var3.addElement("Номер ICQ");
      var4.addElement(var1.t);
      var3.addElement("Семейное положение");
      var4.addElement(var1.e != null && !var1.e.equals("") && !var1.e.equals("single") ? "Женат / Замужем" : "Холост / Не замужем");
      var3.addElement("Дети");
      var4.addElement(var1.d != null && !var1.d.equals("") && !var1.d.equals("no") ? "Есть" : "Нет");
      var3.addElement("Фотогалерея");
      var4.addElement(var1.f == 0 ? "Нет" : var1.f + " фото");
      var3.addElement("Комната");
      if (var1.a != null) {
         if (var1.a.c) {
            var4.addElement("Скрытая");
         } else {
            var4.addElement("Есть");
            var3.addElement("Записи в дневнике");
            if (var1.a.h == 0) {
               var4.addElement("Нет");
            } else {
               var4.addElement(String.valueOf(var1.a.h));
               this.addCommand(XChatMidlet.W);
            }
         }
      } else {
         var4.addElement("Нет");
      }

      var3.addElement("В поиске");
      var4.addElement(var1.x);
      var3.addElement("Хочет");
      var4.addElement(var1.f);
      var3.addElement("Род занятий");
      var4.addElement(var1.z);
      var3.addElement("Интересы");
      var4.addElement(var1.k);
      var3.addElement("Финансовое положение");
      var4.addElement(var1.B);
      var3.addElement("Рост");
      var4.addElement(var1.q);
      var3.addElement("Вес");
      var4.addElement(var1.i);
      var3.addElement("Цвет волос");
      var4.addElement(var1.m);
      var3.addElement("Вредные привычки");
      var4.addElement(var1.p);
      var3.addElement("Автопортрет");
      var4.addElement(var1.r);
      a.setTime(new Date(var1.a));
      String var9 = a.get(5) + "/" + (a.get(2) + 1) + "/" + a.get(1);
      var3.addElement("Дата рождения");
      var4.addElement(var9);
      var3.addElement("Статус");
      String var10;
      if (var1.d) {
         var10 = "В CiTY";
         if (var1.a != null) {
            var10 = var10 + " (" + var1.a.b + var1.a.a + ")";
         }
      } else {
         var10 = "Отключён";
      }

      var4.addElement(var10);
      var3.addElement("Рейтинг");
      var4.addElement(String.valueOf(var1.b));
      if (var1.b) {
         var3.addElement("Жителю можно отправить SMS");
         var4.addElement("Да");
      }

      if (var1.a != null) {
         var3.addElement(" ");
         var4.addElement(" ");
         var3.addElement("Встречи");
         var4.addElement(" ");
         var3.addElement("Жду");
         byte var11 = (Byte)var1.a.elementAt(0);
         String var12 = "";
         if (var11 == 2) {
            var12 = ar.e[0] + "," + ar.e[1] + ".";
         } else if (var11 == 0) {
            var12 = ar.e[0] + ".";
         } else {
            var12 = ar.e[1] + ".";
         }

         var4.addElement(var12);
         var3.addElement("Время");
         var4.addElement((String)var1.a.elementAt(2));
         var3.addElement("Для чего");
         var4.addElement((String)var1.a.elementAt(3));
         var3.addElement("Дата");
         var4.addElement((String)var1.a.elementAt(1));
      }

      if (var1.b != super.a.a.a.b) {
         this.addCommand(XChatMidlet.V);
         this.addCommand(XChatMidlet.t);
         this.addCommand(XChatMidlet.o);
         if (super.a.a.a.a != null) {
            this.addCommand(XChatMidlet.aw);
         } else {
            this.removeCommand(XChatMidlet.aw);
         }
      }

      if (super.a.a.a.b.containsKey(new Long(var1.b))) {
         var3.addElement("Друг");
         var4.addElement("Да");
         this.removeCommand(XChatMidlet.V);
      }

      if (super.a.a.a.c.containsKey(new Long(var1.b))) {
         var3.addElement("Враг");
         var4.addElement("Да");
         this.removeCommand(XChatMidlet.t);
      }

      if (var1.f != 0 || var1.a != null && var1.a.a != 0 && !var1.a.c) {
         this.addCommand(XChatMidlet.k);
      }

      if (var1.a == null || var1.a.c && var1.b != super.a.a.a.b) {
         this.removeCommand(XChatMidlet.X);
      } else {
         this.addCommand(XChatMidlet.X);
      }

      if (var1.A != null && !var1.A.equals("")) {
         if (var1.a == 0) {
            var3.addElement("Был лидером");
            var4.addElement(var1.A);
         } else if (var1.a == 1) {
            var3.addElement("Была лидером");
            var4.addElement(var1.A);
         }
      }

      super.a(var6, var7, "", var3, var4, "ФИО: " + (var8.length() == 0 ? "-" : var8), var2);
   }
}
