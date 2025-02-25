import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class ax extends bb implements j {
   public XChatMidlet a;
   public bd a;
   public int z;
   public Displayable a;
   public av d;
   public boolean k;
   public boolean j;

   public String a() {
      return "Окно чата. Ты можешь просмотреть список жителей, находящихся в этом чате.\nВыбери 'Сказать', чтобы оставить своё сообщение. Последние сообщения отображаются сверху.";
   }

   public ax(XChatMidlet var1) {
      super(var1, "", 0);
      this.a = var1;
   }

   public void m() {
      super.b = new Vector();
   }

   public void a(int var1, String var2) {
      Vector var3 = bh.a(var2, this.a.a, super.b - 12 - super.a.d, false);
      int var4 = var3.size();

      for(int var5 = var4 - 1; var5 >= 0; --var5) {
         if (super.b.size() == 100) {
            super.b.removeElementAt(super.b.size() - 1);
         }

         this.a((String)var3.elementAt(var5), var5 == 0 ? var1 : -1, true);
         if (super.o != 0) {
            ++super.o;
         }
      }

      super.b = true;
   }

   public void a(bd var1, int var2) {
      XChatMidlet var10000 = this.a;
      XChatMidlet.c((Displayable)this);
      this.addCommand(XChatMidlet.av);
      this.addCommand(XChatMidlet.H);
      this.addCommand(XChatMidlet.aV);
      this.addCommand(XChatMidlet.aG);
      this.addCommand(XChatMidlet.ap);
      if (var1 == this.a.a.a.a) {
         this.addCommand(XChatMidlet.ah);
         this.removeCommand(XChatMidlet.L);
      } else if (this.a.a.a.a != null) {
         this.addCommand(XChatMidlet.L);
      }

      super.a = this.a.a;
      this.z = var2;
      super.h = false;
      XChatMidlet var10001 = this.a;
      this.d = XChatMidlet.d;
      super.c = this.d;
      this.j = false;
      this.k = false;
      this.a = var1;
      this.c("Чат | " + var1.b + var1.a);
      super.g();
      super.l = 0;
      if (super.b.size() != 0) {
         if (this.a.a.a.a == 0) {
            this.a(this.a.a.a.b, "Ты зашёл в чат");
         } else {
            this.a(this.a.a.a.b, "Ты зашла в чат");
         }
      }

   }
}
