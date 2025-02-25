import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class w extends d implements ad, ai, CommandListener, j {
   private XChatMidlet a;
   public int e;
   private TextField a;
   private TextField j;
   private TextField e;
   private TextField k;
   private TextField b;
   private TextField d;
   private TextField i;
   private TextField f;
   private TextField g;
   private TextField h;
   private TextField l;
   private TextField c;
   private ChoiceGroup b;
   private ChoiceGroup a;
   public static int f = 1;
   public static int g = 2;
   public static int h = 3;
   public static int a = 4;
   public static int c = 5;
   public static int d = 6;
   private boolean b = false;
   public boolean a;
   public f a;
   public int b;

   public String a() {
      if (this.e == h) {
         return "Укажи свой псевдоним и пароль и выбери 'Вход'.\nЕсли ты ещё не зарегистрирован, выбери 'Регистрация'. Если забыл пароль - жми 'Восстановление пароля'";
      } else if (this.a) {
         return "Регистрация под новым псевдонимом.\nВыбери себе уникальный псевдоним и пароль! Не забудь указать свой пол, дату рождения, заполнить контрольные вопросы - и жми 'Далее'. Прим.: Длина пароля от 6 до 26 символов. Контрольные вопросы нужны для восстановления пароля в случае его утраты.";
      } else {
         return this.e == d ? "Для восстановления пароля ответь на контрольные вопросы, которые ты указал при регистрации. Это даст тебе возможность сменить утраченный пароль на новый" : "Регистрация под новым псевдонимом.\nВыбери себе уникальный псевдоним и пароль! Не забудь указать свой пол, дату рождения, заполнить контрольные вопросы - и жми 'Далее'. Прим.: Длина пароля от 6 до 26 символов. Контрольные вопросы нужны для восстановления пароля в случае его утраты.";
      }
   }

   public w(XChatMidlet var1, int var2) {
      super("Мой паспорт");
      this.e = var2;
      this.a = var1;
      this.a();
   }

   public w(XChatMidlet var1, int var2, Vector var3) {
      super("Восстановить пароль");
      this.e = var2;
      this.a = var1;
      this.a = new f();
      this.a.n = (String)var3.elementAt(0);
      this.a.s = (String)var3.elementAt(1);
      this.a.h = (String)var3.elementAt(2);
      this.a();
   }

   public boolean c() {
      return this.b.isSelected(0);
   }

   public long a(Item var1) {
      String var2 = "/";
      if (var1 instanceof TextField && var1.getLabel().indexOf("Дата рождения в формате: ДД/ММ/ГГГГ") >= 0) {
         String var3 = ((TextField)var1).getString();
         if (var3.length() > 10) {
            return 0L;
         }

         int var4 = var3.indexOf(var2);
         if (var4 == -1) {
            var4 = var3.indexOf(".");
            var2 = ".";
         }

         if (var4 > 0) {
            try {
               int var5 = Integer.parseInt(var3.substring(0, var4));
               int var6 = var4;
               var4 = var3.indexOf(var2, var4 + 1);
               if (var4 > 0) {
                  int var7 = Integer.parseInt(var3.substring(var6 + 1, var4)) - 1;
                  int var8 = Integer.parseInt(var3.substring(var4 + 1, var3.length()));
                  Calendar var9 = Calendar.getInstance();
                  Date var10 = new Date(System.currentTimeMillis());
                  var9.setTime(var10);
                  if (var5 > 0 && var5 <= 31 && var7 >= 0 && var7 < 12 && var8 > 1910 && var8 < var9.get(1)) {
                     var9.set(5, var5);
                     var9.set(2, var7);
                     var9.set(1, var8);

                     try {
                        return var9.getTime().getTime();
                     } catch (Exception var12) {
                        return 0L;
                     }
                  }

                  return 0L;
               }
            } catch (NumberFormatException var13) {
               return 0L;
            }
         }
      }

      return 0L;
   }

   public void a() {
      if (this.e == h) {
         this.setTitle("Вход");
      } else if (this.e == a) {
         this.e = f;
         this.a = true;
      }

      this.a = new TextField("Псевдоним*", "", 25, 0);
      this.j = new TextField("Пароль*", "", 25, 65536);
      this.a.setString("");
      if (this.e == h) {
         f var1 = this.a.a();
         if (var1 != null) {
            this.a.setString(var1.n);
            if (var1.n.length() > 25) {
               var1.n = var1.n.substring(0, 25);
            }

            if (var1.a() != null && var1.a().trim().length() != 0) {
               this.j.setString(f.a(var1.a()));
            }
         } else {
            this.a.setString("");
         }

         this.b = new ChoiceGroup("", 2, new String[]{"запомнить пароль"}, (Image[])null);
         this.b.setSelectedIndex(0, true);
      }

      this.i = new TextField("Дата рождения в формате: ДД/ММ/ГГГГ", "", 10, 0);
      this.e = new TextField("Пароль еще раз*", "", 15, 65536);
      this.k = new TextField("E-mail", "@", 255, 1);
      this.d = new TextField("Телефон", "", 255, 0);
      this.b = new TextField("Имя", "", 255, 0);
      this.f = new TextField("Фамилия", "", 255, 0);
      this.g = new TextField("Контрольный вопрос 1", "", 255, 0);
      this.h = new TextField("Контрольный вопрос 2", "", 255, 0);
      if (this.e == d) {
         this.l = new TextField(this.a.s, "", 255, 0);
         this.c = new TextField(this.a.h, "", 255, 0);
      } else {
         this.l = new TextField("Ответ 1", "", 255, 0);
         this.c = new TextField("Ответ 2", "", 255, 0);
      }

      this.a = new ChoiceGroup("Пол", this.e == g ? 2 : 1);
      this.a.append("Мужской", (Image)null);
      this.a.append("Женский", (Image)null);
      if (this.e == d) {
         this.append("Пожалуйста, ответь на контрольные вопросы");
         this.append(this.l);
         this.append(this.c);
         this.append(this.j);
         this.append(this.e);
      }

      if (this.a || this.e == h) {
         this.append(this.a);
         this.append(this.j);
         if (this.e == h) {
            this.append(this.b);
            this.append("Укажи свой псевдоним и пароль и выбери 'Вход'.\nЕсли ты ещё не зарегистрирован, выбери 'Регистрация'. Если забыл пароль - жми 'Восстановление пароля'");
            this.addCommand(XChatMidlet.aU);
            this.addCommand(XChatMidlet.aL);
            this.addCommand(XChatMidlet.aP);
            this.setCommandListener(this.a);
         } else {
            this.append(this.e);
            this.append(this.b);
            this.append(this.f);
            this.append(this.a);
            this.append(this.i);
            this.append(this.k);
            this.append(this.g);
            this.append(this.l);
            this.append(this.h);
            this.append(this.c);
            this.append("Регистрация под новым псевдонимом.\nВыбери себе уникальный псевдоним и пароль! Не забудь указать свой пол, дату рождения, заполнить контрольные вопросы - и жми 'Далее'. Прим.: Длина пароля от 6 до 26 символов. Контрольные вопросы нужны для восстановления пароля в случае его утраты.");
            this.removeCommand(XChatMidlet.af);
            this.removeCommand(XChatMidlet.x);
         }
      }

      if (this.e == d) {
         this.addCommand(XChatMidlet.av);
         this.addCommand(XChatMidlet.Y);
      }

      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.aE);
      this.setCommandListener(this);
   }

   public String a(String var1) {
      if (var1 == null) {
         return "";
      } else {
         return var1.length() > 255 ? var1.substring(0, 254) : var1;
      }
   }

   public void commandAction(Command var1, Displayable var2) {
      if (this.e == f && this.a.a.a != null && this.b == 0 && this.a.a.a.a == 0) {
         this.a.a.a.b = 4;
         this.b = 4;
      }

      if (var1 == XChatMidlet.av) {
         if (this.e == d) {
            this.a.a((Displayable)(new w(this.a, h)), false);
         } else if (var2 != this) {
            this.a.a((Displayable)this, false);
            System.gc();
         } else if (super.a == null) {
            this.a.commandAction(var1, this);
         } else {
            this.a.a(super.a, false);
         }
      }

      if (var1 == XChatMidlet.aP) {
         this.b = true;
         if (this.b()) {
            this.e = c;
            f var3 = ((w)var2).a();
            this.a.a((Displayable)this, (f)var3);
         }
      } else if (var1 != XChatMidlet.aL && var1 != XChatMidlet.g) {
         if (var1 == XChatMidlet.Y && this.e == d && this.b()) {
            this.a.C = this.l.getString();
            this.a.v = this.c.getString();
            this.a.b(this.j.getString());
            this.a.a((Displayable)this, (f)this.a);
         } else {
            this.a.commandAction(var1, this);
         }
      } else if (this.e == f) {
         long var6 = this.a((Item)this.i);
         if (var6 == 0L) {
            ay var8 = new ay(this.a);
            var8.a("Внимание", "Проверь правильность даты рождения! Дата должна быть в формате ДД/ММ/ГГГГ", 3, (ai)null, true);
            return;
         }

         if (this.b()) {
            f var5 = ((w)var2).a();
            this.a.c = var5.a();
            var5.a = var6;
            this.a.a((Displayable)this, (f)var5);
         }
      } else {
         w var7 = new w(this.a, a);
         var7.a(true, (f)null, true);
      }

   }

   public void a(boolean var1, f var2, boolean var3) {
      this.a = var2;
      this.a = var1;
      if (var1) {
         this.setTitle("Регистрация");
         this.addCommand(XChatMidlet.g);
         this.addCommand(XChatMidlet.aO);
         this.removeCommand(XChatMidlet.av);
         this.removeCommand(XChatMidlet.ax);
         this.removeCommand(XChatMidlet.b);
         this.removeCommand(XChatMidlet.L);
         this.removeCommand(XChatMidlet.ap);
         this.removeCommand(XChatMidlet.aY);
         this.a = new f();
      } else {
         this.setTitle("Мой паспорт");
         this.addCommand(XChatMidlet.av);
         this.addCommand(XChatMidlet.aY);
         this.addCommand(XChatMidlet.aM);
         this.removeCommand(XChatMidlet.aL);
         this.removeCommand(XChatMidlet.aU);
         this.a(var2);
      }

      if (var3) {
         this.a.a((Displayable)this, true);
      }

   }

   public void a(f var1) {
      this.a.setString(var1.n == null ? "" : var1.n);
      this.j.setString("");
      this.e.setString("");
      this.k.setString(this.a(var1.o));
      this.b.setString(this.a(var1.u));
      this.d.setString(this.a(var1.j));
      this.a.setSelectedIndex(var1.a, true);
   }

   public static void a(ChoiceGroup var0, String var1, String[] var2) {
      for(int var3 = 0; var3 < var2.length; ++var3) {
         var0.setSelectedIndex(var3, var1.indexOf(var2[var3]) != -1);
      }

   }

   public void a(int var1) {
      this.b = (byte)var1;
      this.removeCommand(XChatMidlet.af);
      this.removeCommand(XChatMidlet.aS);
      this.addCommand(XChatMidlet.x);
      this.removeCommand(XChatMidlet.af);
      this.a.a((Displayable)this, true);
   }

   public void a(Displayable var1, Command var2) {
      this.a.a((Displayable)this, true);
   }

   public f a() {
      return this.a(this.a);
   }

   public f a(f var1) {
      if (var1 == null) {
         var1 = new f();
      }

      if (this.e != d) {
         var1.n = this.a.getString().trim();
      }

      if (this.e != c) {
         var1.b(this.j.getString());
      }

      if (this.e == f) {
         var1.o = this.k.getString().trim();
         var1.u = this.b.getString().trim();
         var1.a = this.f.getString().trim();
         var1.s = this.g.getString().trim();
         var1.h = this.h.getString().trim();
         var1.C = this.l.getString().trim();
         var1.v = this.c.getString().trim();
         var1.a = (byte)this.a.getSelectedIndex();
      }

      return var1;
   }

   public static String a(ChoiceGroup var0, String[] var1) {
      String var2 = "";
      boolean[] var3 = new boolean[var1.length];
      var0.getSelectedFlags(var3);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var3[var4]) {
            var2 = var2 + var1[var4] + ", ";
         }
      }

      if (var2.length() != 0) {
         var2 = var2.substring(0, var2.length() - 2) + "";
      }

      return var2;
   }

   public boolean a() {
      f var1 = new f();
      if (var1.n.compareTo(this.a.n) != 0) {
         return true;
      } else if (this.j.getString().length() != 0) {
         return true;
      } else if (this.e.getString().length() != 0) {
         return true;
      } else if (var1.o.compareTo(this.a.o) != 0) {
         return true;
      } else if (var1.u.compareTo(this.a.u) != 0) {
         return true;
      } else if (var1.j.compareTo(this.a.j) != 0) {
         return true;
      } else if (var1.a != this.a.a) {
         return true;
      } else if (var1.a != this.a.a) {
         return true;
      } else if (var1.z.compareTo(this.a.z) != 0) {
         return true;
      } else if (var1.k.compareTo(this.a.k) != 0) {
         return true;
      } else if (var1.g != this.a.g) {
         return true;
      } else if (var1.e != this.a.e) {
         return true;
      } else if (var1.a != this.a.a) {
         return true;
      } else if (var1.c != this.a.c) {
         return true;
      } else {
         return var1.b != this.a.b;
      }
   }

   public boolean b() {
      if ((this.a.getString().trim().length() < 3 || a(this.a.getString())) && this.e != d) {
         this.a.a((String)"Укажите логин длиной не менее трех символов. Логин может состоять только из букв латинского алфавита, цифр, содержать знаки '-', '_' или '.'", (Displayable)this, true);
         return false;
      } else if (this.b) {
         this.b = false;
         return true;
      } else if (this.e == d) {
         if (this.l.getString().trim().length() != 0 && this.c.getString().trim().length() != 0) {
            if (this.j.getString().length() < 6 && this.e.getString().length() < 6 || this.j.getString().length() > 26 && this.e.getString().length() > 26) {
               this.a.a((String)"Придумай другой пароль. Минимальная длина пароля 6 символов, максимальная - 26.", (Displayable)this, true);
               return false;
            } else if (!this.j.getString().equals(this.e.getString())) {
               this.a.a((String)"Пароли не совпадают.\nУкажи пароль заново.", (Displayable)this, true);
               return false;
            } else {
               return true;
            }
         } else {
            this.a.a((String)"Пожалуйста, ответь на контрольные вопросы", (Displayable)this, true);
            return false;
         }
      } else if (this.a && this.j.getString().length() == 0) {
         this.a.a((String)"Укажите пароль", (Displayable)this, true);
         return false;
      } else if (this.a && (this.j.getString().length() < 6 || this.j.getString().length() > 26)) {
         this.a.a((String)"Придумай другой пароль. Минимальная длина пароля 6 символов, максимальная - 26.", (Displayable)this, true);
         return false;
      } else if (this.k.getString().indexOf(64) != -1 && this.k.getString().indexOf(46) != -1 && !this.k.getString().startsWith("@") && !b(this.k.getString())) {
         if (this.j.getString().length() == this.e.getString().length() && this.e.getString().regionMatches(false, 0, this.j.getString(), 0, this.e.getString().length())) {
            if (this.g.getString().length() != 0 && this.g.getString().trim().length() != 0 && this.h.getString().length() != 0 && this.h.getString().trim().length() != 0 && this.l.getString().length() != 0 && this.l.getString().trim().length() != 0 && this.c.getString().length() != 0 && this.c.getString().trim().length() != 0) {
               return true;
            } else {
               this.a.a((String)"Пожалуйста, укажи информацию для восстановления пароля", (Displayable)this, true);
               return false;
            }
         } else {
            this.a.a((String)"Пароли не совпадают.\nУкажи пароль заново.", (Displayable)this, true);
            return false;
         }
      } else {
         this.a.a((String)"Недопустимый e-mail. Пожалуйста, введите другой.", (Displayable)this, true);
         return false;
      }
   }

   private static boolean a(char var0) {
      return "0123456789abcdefghijklmnopqrstuvwxyz-_.".indexOf(String.valueOf(var0).toLowerCase()) != -1;
   }

   public static boolean a(String var0) {
      for(int var1 = 0; var1 < var0.length(); ++var1) {
         if (!a(var0.charAt(var1))) {
            return true;
         }
      }

      return false;
   }

   public static boolean b(String var0) {
      boolean var1 = false;
      char[] var2 = var0.toCharArray();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] < '!' || var2[var3] > '}') {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public void h() {
      this.a.commandAction(XChatMidlet.aY, this);
   }

   public void j() {
      v var1 = new v(this.a);
      var1.b();
   }
}
