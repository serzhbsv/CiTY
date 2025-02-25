import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class o extends d implements CommandListener, j {
   private XChatMidlet a;
   public TextField c;
   public TextField d;
   public TextField b;
   public ChoiceGroup a;
   public ChoiceGroup b;
   public TextField e;
   public TextField a;
   public TextField f;
   public ChoiceGroup c;
   public boolean a;

   public String a() {
      return this.a ? "Укажите критерии поиска интересующих Вас комнат и выберите 'Искать'" : "Настройки комнаты. Ты можешь указывать название, тематику и описание своей комнаты. Только не забудь выбрать пункт 'Сохранить'!";
   }

   public o(XChatMidlet var1, boolean var2) {
      super("Твоя комната");
      this.a = var2;
      this.a = var1;
      if (var2) {
         this.setTitle("Искать комнаты");
      }

      this.d = new TextField("Название", "", 25, 0);
      this.c = new TextField("Тема", "", 50, 0);
      this.f = new TextField("Ключевое слово", "", 100, 0);
      this.b = new TextField("Описание", "", 100, 0);
      this.a = new ChoiceGroup("Доступ", 2, new String[]{"Закрытая комната"}, (Image[])null);
      this.b = new ChoiceGroup("", 2, new String[]{"Все могут создавать новые темы", "Друзья могут создавать новые темы"}, (Image[])null);
      this.e = new TextField("Приветствие", "", 50, 0);
      this.a = new TextField("Прощание", "", 50, 0);
      if (var2) {
         this.append(this.f);
         this.c = new ChoiceGroup("", 2, new String[]{"С фотогалереей"}, (Image[])null);
         this.append(this.c);
         this.append("Укажите критерии поиска интересующих Вас комнат и выберите 'Искать'");
      } else {
         this.append(this.d);
         this.append(this.c);
         this.append(this.b);
         this.append(this.a);
         this.append(this.b);
         this.append(this.e);
         this.append(this.a);
         this.append("Настройки комнаты. Ты можешь указывать название, тематику и описание своей комнаты. Только не забудь выбрать пункт 'Сохранить'!");
         this.addCommand(XChatMidlet.aH);
      }

      if (var2) {
         this.addCommand(XChatMidlet.I);
      } else {
         this.addCommand(XChatMidlet.aY);
      }

      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.aM);
      this.setCommandListener(this);
   }

   public void a(f var1, Displayable var2) {
      if (this.a) {
         this.a.a((Displayable)this, true);
      } else {
         bd var3 = var1.a;
         if (var3 == null) {
            ay var4 = new ay(this.a);
            var4.a("Внимание", "У тебя нет своей комнаты!\nНаправляйся в Жилой квартал и выбери 'Снять комнату' в меню.", 2, (ai)null, true);
         } else {
            this.d.setString(var3.a);
            boolean var5 = false;
            if (var3.c != null) {
               this.c.setString(var3.c);
            } else {
               this.c.setString("");
            }

            this.b.setString(var3.f);
            this.a.setSelectedFlags(new boolean[]{var3.c});
            if (var3.c > 1) {
               this.b.setSelectedIndex(0, true);
            }

            this.b.setSelectedIndex(1, var3.c > 0);
            this.e.setString(var3.e);
            this.a.setString(var3.d);
            this.a.a((Displayable)this, true);
         }
      }

   }

   public bd a() {
      bd var1 = new bd();
      var1.a = this.d.getString();
      var1.f = this.b.getString();
      boolean[] var2 = new boolean[1];
      this.a.getSelectedFlags(var2);
      if (this.b.isSelected(0)) {
         var1.c = 2;
      } else if (this.b.isSelected(1)) {
         var1.c = 1;
      } else {
         var1.c = 0;
      }

      var1.c = var2[0];
      var1.c = this.c.getString();
      var1.e = this.e.getString();
      var1.d = this.a.getString();
      return var1;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == XChatMidlet.av) {
         aw.a(var2, var1);
      } else if (var1 == XChatMidlet.aY) {
         this.a.a("Надо немного подождать...", "Отправляю данные на сервер", super.a);
         XChatMidlet.a = 3;
         this.a.a.a(this.a());
      } else if (var1 != XChatMidlet.af) {
         if (var1 == XChatMidlet.I) {
            if (this.f.getString().length() != 0) {
               this.a.a("Надо немного подождать...", "Идёт поиск комнат", var2);
               boolean[] var3 = new boolean[1];
               this.c.getSelectedFlags(var3);
               this.a.a.a(this.f.getString(), var3[0], 0);
            } else {
               this.a.a((String)"Укажи ключевое слово для поиска", (Displayable)this, true);
            }
         } else {
            this.a.commandAction(var1, var2);
         }
      }

   }
}
