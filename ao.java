import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import xchat.XChatMidlet;

public class ao extends aw implements CommandListener {
   public XChatMidlet a;
   public av a;
   public int b;
   public int a;
   public ad a;

   public ao(XChatMidlet var1) {
      this.a = var1;
      this.addCommand(XChatMidlet.r);
      this.addCommand(XChatMidlet.F);
      this.addCommand(XChatMidlet.U);
      this.addCommand(XChatMidlet.av);
      this.setCommandListener(this);
   }

   public void paint(Graphics var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      var1.setColor(2464283);
      var1.setClip(0, 0, var2, var3);
      var1.fillRect(0, 0, var2, var3);
      var1.drawImage(this.a.a(this.b, false), var2 / 2, var3 / 2, 3);
   }

   public void a(av var1, int var2, int var3, ad var4, Displayable var5, Display var6) {
      this.a = var2;
      this.a = var1;
      this.a = var4;
      this.b = var3;
      this.a.a((Displayable)this, true);
   }

   public void keyPressed(int var1) {
      int var2 = this.getGameAction(var1);
      switch(var2) {
      case 1:
      case 5:
         this.b();
         break;
      case 2:
      case 6:
         this.a();
      case 3:
      case 4:
      case 7:
      default:
         break;
      case 8:
         this.c();
      }

   }

   private void b() {
      ++this.b;
      if (this.b == this.a) {
         this.b = 0;
      }

      this.repaint();
   }

   private void a() {
      --this.b;
      if (this.b < 0) {
         this.b = this.a - 1;
      }

      this.repaint();
   }

   private void c() {
      this.a.a(this.b);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == XChatMidlet.av) {
         this.a.a(var2, var1);
      } else if (var1 == XChatMidlet.r) {
         this.b();
      } else if (var1 == XChatMidlet.F) {
         this.a();
      } else if (var1 == XChatMidlet.U) {
         this.c();
      } else {
         this.a.commandAction(var1, var2);
      }

   }
}
