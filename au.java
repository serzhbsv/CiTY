import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import xchat.XChatMidlet;

public class au extends y {
   public Image b;

   public au(XChatMidlet var1) {
      super(var1);
      this.addCommand(XChatMidlet.av);
   }

   public void b(Graphics var1) {
      int var2 = super.v;
      int var3 = super.k;
      var1.setColor(2464283);
      var1.setClip(0, 0, var2, var3);
      var1.fillRect(0, 0, var2, var3);
      var1.drawImage(this.b, var2 / 2, var3 / 2, 3);
   }

   public void a(Image var1, String var2, int var3, int var4, Displayable var5) {
      this.b = var1;
      if (var3 > 0) {
         this.addCommand(XChatMidlet.a);
      }

      if (var3 < var4 - 1) {
         this.addCommand(XChatMidlet.y);
      }

      super.a(var2 + (var4 > 1 ? " (" + (var3 + 1) + "из" + var4 + ")" : ""));
   }
}
