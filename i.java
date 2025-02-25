import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class i extends d {
   public XChatMidlet a;
   public TextField a;
   public String a;
   public long a;
   public long b;
   public int a;

   public i(XChatMidlet var1, Displayable var2, Vector var3) {
      super("");
      this.a = var1;
      this.a = 0L;
      this.b = 0L;
      this.a = (String)var3.elementAt(0);
      String var4 = "\nЕсть: " + this.a;
      this.append(var4);
      this.a = Integer.parseInt((String)var3.elementAt(1));
      String var5 = "\n Стоимость подарка: " + (String)var3.elementAt(1) + " R" + ". При отправке с Вашего кошелька будет списана соответствующая сумма.";
      this.append(var5);
      this.append("\n");
      if (var3.elementAt(2) != null) {
         try {
            byte[] var6 = (byte[])var3.elementAt(2);
            Image var7 = Image.createImage(var6, 0, var6.length);
            this.append(var7);
         } catch (IllegalArgumentException var8) {
            var8.printStackTrace();
         }
      }

      if (var3.size() > 3) {
         this.a = (Long)var3.elementAt(3);
         this.b = (Long)var3.elementAt(4);
      }

      this.a = new TextField("Комментарии", "", 255, 0);
      this.append(this.a);
      this.addCommand(XChatMidlet.aQ);
      if (this.b == var1.a.a.b) {
         this.addCommand(XChatMidlet.al);
      } else {
         this.addCommand(XChatMidlet.z);
      }

      this.addCommand(XChatMidlet.av);
      this.setCommandListener(var1);
   }
}
