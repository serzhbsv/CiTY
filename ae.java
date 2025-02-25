import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class ae extends ay {
   public Displayable b;
   public String[] b;
   public int j;

   public void a(String var1, String var2, Displayable var3) {
      this.b = var3;
      this.j = 0;
      super.a(var1, var2, 1, (ai)null, true);
      boolean var4 = false;
      byte var5 = 3;
      this.b = new String[var5];

      for(int var6 = 0; var6 < var5; ++var6) {
         this.b[var6] = super.a[super.a.length - 1];

         for(int var7 = 0; var7 <= var6; ++var7) {
            this.b[var6] = this.b[var6] + ".";
         }
      }

      this.setCommandListener(super.a);
   }

   public void a() {
      this.b = null;
      super.a();
   }

   public void k() {
      if (++this.j >= this.b.length) {
         this.j = 0;
      }

      super.a[super.a.length - 1] = this.b[this.j];
      super.b = true;
   }

   public ae(XChatMidlet var1) {
      super(var1);
      this.addCommand(XChatMidlet.av);
   }
}
