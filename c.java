import com.siemens.mp.io.File;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import xchat.XChatMidlet;

public class c extends bb implements CommandListener, j {
   public String a;
   public Displayable a;

   public String a() {
      return "Выбери картинку для загрузки на сервер. Максимальный допустимый размер загружаемой картинки 150 Кбайт.\n";
   }

   public c(XChatMidlet var1) {
      super(var1, "Жители", 3);
      super.a = var1;
      this.addCommand(XChatMidlet.U);
      this.addCommand(XChatMidlet.aM);
      this.addCommand(XChatMidlet.av);
      super.c = new av("/browser.png", 10, 10, 2);
      this.setCommandListener(this);
   }

   public void b(Displayable var1) {
      this.a = var1;
      this.a = null;
      this.c("Выбери фото");
      if (this.a("a:\\", (String)null)) {
         super.g();
      }

   }

   public boolean a(String var1, String var2) {
      boolean var3 = false;

      try {
         String[] var4 = File.list(var1);
         if (var4.length == 0) {
            var3 = true;
         } else {
            this.b();
            this.a = var1;
            this.c(this.a);
            int var5 = 0;
            if (!var1.equals("a:\\")) {
               ++var5;
               this.a("..\\", 0);
            }

            for(int var6 = 0; var6 < var4.length; ++var5) {
               String var7 = var4[var6];
               this.a(var7, File.isDirectory(var1 + var7) ? 0 : 1);
               if (var2 != null && var7.equals(var2)) {
                  this.a(var5, true);
               }

               ++var6;
            }

            if (var2 == null) {
               this.a(0, true);
            }
         }
      } catch (Exception var8) {
         var3 = true;
      }

      if (var3) {
         ay var9 = new ay(super.a);
         var9.a("Внимание", "Файлы не найдены\nКаталог пуст...", 3, (ai)null, true);
      }

      return !var3;
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 != XChatMidlet.U && var1 != List.SELECT_COMMAND) {
         if (var1 == XChatMidlet.av) {
            aw.a(this.a, var1);
         } else {
            super.a.commandAction(var1, var2);
         }
      } else {
         String var3 = this.a().a;

         try {
            if (var3 == "..\\") {
               int var4 = this.a.substring(0, this.a.length() - 2).lastIndexOf(92);
               this.a(this.a.substring(0, var4 + 1), this.a.substring(var4 + 1, this.a.length() - 1));
               super.b = true;
            } else if (File.isDirectory(this.a + var3)) {
               this.a(this.a + var3 + '\\', (String)null);
               super.b = true;
               super.a = true;
            } else {
               super.a.a("Надо немного подождать...", "Загружаю картинку\n.\n.\n.", this.a);
               at var6 = new at(this, this.a + var3);
               var6.a();
            }
         } catch (Exception var5) {
         }
      }

   }
}
