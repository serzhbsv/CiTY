import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class az extends d {
   public TextField a;
   public TextField b;
   private XChatMidlet a;
   public long a = 0L;

   public az(XChatMidlet var1) {
      super("Сообщение");
      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.P);
      this.setCommandListener(var1);
      this.a = var1;
      this.a = new TextField("Тема:", "", 255, 0);
      this.b = new TextField("Текст сообщения:", "", 255, 0);
      this.append(this.a);
      this.append(this.b);
   }

   public String a() {
      return this.a.getString();
   }

   public String b() {
      return this.b.getString();
   }

   public void a(Displayable var1, long var2) {
      this.a = var2;
      this.a.a((Displayable)this, true);
   }
}
