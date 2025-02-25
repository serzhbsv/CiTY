import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class v extends be implements j {
   public static Vector b;
   public static boolean h = false;

   public String a() {
      return "Выбери \n'Искать людей' и укажи критерии поиска, чтобы найти себе друзей. Используй меню для доступа к другим функциям, таким как просмотр списка жителей находящихся в CiTY в данный момент, поиск лучших жителей, лучших комнат, просмотр списка друзей и врагов, личному почтовому ящику и т.п.";
   }

   public v(XChatMidlet var1) {
      super(var1);
      h = true;
      XChatMidlet.c((Displayable)this);
      this.addCommand(XChatMidlet.az);
      this.addCommand(XChatMidlet.aC);
      this.addCommand(XChatMidlet.j);
      this.addCommand(XChatMidlet.an);
      this.addCommand(XChatMidlet.aQ);
      var1.c = this;
   }

   public void k() {
      if (h) {
         this.b();
         h = false;
      }

      super.k();
   }

   public void b() {
      super.j = 16777215;
      String var1 = "";
      Image var2 = XChatMidlet.a;
      Vector var3 = new Vector();
      super.l = 6;
      if (b == null) {
         var2 = XChatMidlet.a;
         var1 = "Добро пожаловать в виртуальный мир CiTY! Здесь перед тобой открыты дороги к Общению, Знакомствам и Развлечениям!" + ' ' + "У тебя в кошельке" + super.a.a.a.c + ' ' + " R" + '!';
         int var4 = super.a.a.a.b;
         var3.addElement(super.a.a.a.n + (var4 > 0 ? " (" + (new Integer(var4)).toString() + ")" : " "));
         var3.addElement("Прописка:");
         var3.addElement(super.a.a.a.w == null ? "Странник" : super.a.a.a.w);
      } else {
         if (b.elementAt(0) instanceof byte[]) {
            byte[] var5 = (byte[])b.elementAt(0);
            var2 = Image.createImage(var5, 0, var5.length);
         }

         var1 = (String)b.elementAt(1);
         var3 = (Vector)b.elementAt(2);
         z var10001 = super.a.a;
         super.a.a = 9;
      }

      super.a(var2, (String)null, "", var3, (Vector)null, var1, super.a);
   }
}
