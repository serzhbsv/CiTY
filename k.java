import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class k extends d implements CommandListener, j {
   private TextField a;
   private TextField b;
   private ChoiceGroup b;
   private ChoiceGroup a;
   private ChoiceGroup d;
   private ChoiceGroup c;
   public XChatMidlet a;
   public int a;

   public k(XChatMidlet var1, int var2) {
      super("");
      this.a = var2;
      this.a = var1;
      this.setCommandListener(this);
      this.a = new TextField("Возраст от (лет)", "", 3, 2);
      this.b = new TextField("До (лет)", "", 3, 2);
      this.b = new ChoiceGroup("Ищу", 2, ar.e, (Image[])null);
      this.a = new ChoiceGroup("Время", 2, ar.g, (Image[])null);
      this.d = new ChoiceGroup("Ищу", 2, ar.e, (Image[])null);
   }

   public void a(Displayable var1) {
      this.setTitle(this.a == 1 ? "Искать встречи" : "Назначить встречу");
      Calendar var2 = Calendar.getInstance();
      String[] var3 = new String[7];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         int var5 = var2.get(5);
         int var6 = var2.get(2) + 1;
         String var7 = var5 < 10 ? "0" + var5 : "" + var5;
         String var8 = var6 < 10 ? "0" + var6 : "" + var6;
         var3[var4] = var7 + "/" + var8 + "/" + var2.get(1);
         var2.setTime(new Date(var2.getTime().getTime() + 86400000L));
      }

      this.c = new ChoiceGroup("Для чего", 2, ar.f, (Image[])null);
      this.d = new ChoiceGroup("Дата", 2, var3, (Image[])null);
      this.d.setSelectedIndex(0, true);
      this.d.setSelectedIndex(1, true);
      if (this.a == 1) {
         this.append(this.a);
         this.append(this.b);
      }

      this.append(this.b);
      this.append(this.a);
      this.append(this.d);
      this.append(this.c);
      this.addCommand(XChatMidlet.l);
      if (this.a == 1) {
         this.addCommand(XChatMidlet.I);
      }

      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.av);
      if (this.a != 1 && this.a.a.c != null) {
         this.a(this.a.a.c);
      }

      this.a.a((Displayable)this, true);
   }

   public Vector a(boolean var1) {
      Vector var2 = new Vector();
      short var3 = -1;
      short var4 = -1;

      try {
         var3 = Short.parseShort(this.a.getString());
      } catch (Exception var11) {
      }

      try {
         var4 = Short.parseShort(this.b.getString());
      } catch (Exception var10) {
      }

      var2.addElement(new Short(var3));
      var2.addElement(new Short(var4));
      boolean[] var5 = new boolean[2];
      this.b.getSelectedFlags(var5);
      Byte var6 = new Byte((byte)(var5[0] && var5[1] || !var5[0] && !var5[1] ? 2 : (var5[0] ? 0 : 1)));
      var2.addElement(var6);
      String var7 = w.a(this.a, ar.g);
      var2.addElement(var7);
      var5 = new boolean[7];
      this.d.getSelectedFlags(var5);
      String var8 = "";

      for(int var9 = 0; var9 < var5.length; ++var9) {
         var2.addElement(new Boolean(var5[var9]));
         if (var5[var9]) {
            var8 = var8 + this.d.getString(var9);
         }
      }

      String var12 = w.a(this.c, ar.f);
      var2.addElement(var12);
      if (var1) {
         this.a.a.c = new Vector();
         this.a.a.c.addElement(var6);
         this.a.a.c.addElement(var8);
         this.a.a.c.addElement(var7);
         this.a.a.c.addElement(var12);
      }

      return var2;
   }

   public void a(Vector var1) {
      Enumeration var2 = var1.elements();
      byte var3 = (Byte)var2.nextElement();
      boolean[] var4 = new boolean[]{var3 == 2 || var3 == 0, var3 == 2 || var3 == 1};
      this.b.setSelectedFlags(var4);
      String var5 = (String)var2.nextElement();

      for(int var6 = 0; var6 < 7; ++var6) {
         if (var5.indexOf(this.d.getString(var6)) != -1) {
            this.d.setSelectedIndex(var6, true);
         } else {
            this.d.setSelectedIndex(var6, false);
         }
      }

      w.a(this.a, (String)var2.nextElement(), ar.g);
      w.a(this.c, (String)var2.nextElement(), ar.f);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == XChatMidlet.I) {
         if (this.a()) {
            this.a.a("Надо немного подождать...", "Сейчас, сейчас! Загружаю имена жителей...", this);
            this.a.a.a(this.a(false));
         }
      } else if (var1 == XChatMidlet.av) {
         aw.a(var2, var1);
      } else if (var1 == XChatMidlet.l) {
         if (this.a == 1) {
            k var3 = new k(this.a, 2);
            var3.a(super.a);
         } else if (this.a()) {
            this.a.a("Встреча добавлена", super.a, false);
            this.a.a.d(this.a(true));
         } else {
            this.a.a("Встреча отменена", super.a, false);
            this.a.a.d(this.a(true));
         }
      } else {
         this.a.commandAction(var1, var2);
      }

   }

   public boolean a() {
      boolean[] var1 = new boolean[7];
      this.d.getSelectedFlags(var1);
      boolean var2 = false;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if (var1[var3]) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public String a() {
      return "Здесь ты можешь назначить встречу жителю CiTY в реальности. Чтобы искать встречи - выбирай 'Искать', ну а чтобы назначить свою встречу - выбирай 'Назначить'. Ты можешь назначить встречу в определённый день, твои встречи удаляются автоматически после того, как пройдёт указанная дата встречи.";
   }
}
