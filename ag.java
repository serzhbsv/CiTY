import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class ag extends TextBox implements ItemStateListener {
   public XChatMidlet a;
   public Displayable a;
   public boolean c;
   public boolean b;
   public long a;
   private boolean a = false;

   public ag(XChatMidlet var1, boolean var2) {
      super("Письмо", "", 1024, 0);
      this.c = var2;
      this.b = false;
      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.z);
      this.setCommandListener(var1);
      this.a = var1;
   }

   public ag(XChatMidlet var1, String var2, int var3, boolean var4) {
      super(var2, "", var3, 0);
      this.c = false;
      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.z);
      this.setCommandListener(var1);
      this.b = var4;
      this.a = var1;
   }

   public void itemStateChanged(Item var1) {
      if (var1 instanceof TextField) {
         TextField var2 = (TextField)var1;
         var2.setLabel(var2.getLabel() + " |" + var2.getString() + "|");
      }

   }

   public void a(Displayable var1, String var2) {
      this.a = var1;
      this.setString("");
      this.a.a((Displayable)this, false);
      if (var2.length() > 974) {
         var2 = var2.substring(var2.length() - 974, var2.length() - 1);
      }

      this.insert(var2, 0);
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.a;
   }
}
