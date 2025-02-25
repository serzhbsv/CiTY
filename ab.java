import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class ab extends bb implements CommandListener {
   public Vector a;

   public void commandAction(Command var1, Displayable var2) {
      if (var1 == XChatMidlet.av) {
         super.a.a(super.a, false);
      } else if (var1 == XChatMidlet.U) {
         if (super.a != null) {
            super.a.a(super.a, false);
            CommandListener var3 = ((ay)super.a).a;
            var3.commandAction(this.a(), super.a);
         } else {
            super.a.commandAction(this.a(), var2);
         }
      }

   }

   public ab(XChatMidlet var1, Vector var2) {
      super(var1, "Меню", 3);
      this.setCommandListener(this);
      this.a = var2;
   }

   public void b(Displayable var1) {
      this.b();
      Enumeration var2 = this.a.elements();

      while(var2.hasMoreElements()) {
         Command var3 = (Command)var2.nextElement();
         this.a(var3.getLabel(), -1);
      }

      super.addCommand(XChatMidlet.U);
      super.addCommand(XChatMidlet.av);
      super.g();
   }

   public Command a() {
      return (Command)this.a.elementAt(this.a());
   }
}
