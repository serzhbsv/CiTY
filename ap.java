import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class ap implements Runnable {
   public XChatMidlet a;
   public boolean a;
   public Thread a;

   public ap(XChatMidlet var1) {
      this.a = var1;
   }

   public void a() {
      this.a = new Thread(this);
      this.a = true;
      this.a.start();
   }

   public void run() {
      while(this.a) {
         try {
            XChatMidlet var10000;
            for(int var1 = 0; var1 < 10; ++var1) {
               Thread.sleep(100L);
               if (!this.a) {
                  return;
               }

               var10000 = this.a;
               Displayable var2 = XChatMidlet.b;
               if (var2 != null && var2 instanceof ay && ((ay)var2).b) {
                  break;
               }
            }

            if (!this.a) {
               return;
            }

            var10000 = this.a;
            Displayable var4 = XChatMidlet.b;
            if (var4 instanceof ae || var4 instanceof aa) {
               Thread.sleep(400L);
            }

            if (var4 != null && var4 instanceof ay) {
               ay var5 = (ay)var4;
               if (var5.f && var5.isShown()) {
                  ((ay)var4).i();
               }
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }
}
