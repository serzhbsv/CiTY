import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class av {
   public Image a;
   public int b;
   public int c;
   public int a;
   public int d;

   public av(String var1, int var2, int var3, int var4) {
      this.d = var4;
      this.a = aw.a(var1);
      this.b = var2;
      this.c = var3;
      this.a = this.a.getWidth() / var2;
   }

   public void a(int var1, int var2, int var3, Graphics var4) {
      int var5 = var1 % this.a * this.b;
      int var6 = var1 / this.a * this.c;
      int var7 = var4.getClipX();
      int var8 = var4.getClipY();
      int var9 = var4.getClipWidth();
      int var10 = var4.getClipHeight();
      int var11 = var2;
      int var12 = var3;
      int var13 = this.b;
      int var14 = this.c;
      if (var2 < var7 + var9 && var2 + var13 >= var7 && var3 < var8 + var10 && var3 + var14 >= var8) {
         if (var2 < var7) {
            var13 -= var7 - var2;
            var11 = var7;
         }

         if (var3 < var8) {
            var14 -= var8 - var3;
            var12 = var8;
         }

         if (var11 + var13 > var7 + var9) {
            var13 = var7 + var9 - var11;
         }

         if (var12 + var14 > var8 + var10) {
            var14 = var8 + var10 - var12;
         }

         var4.setClip(var11, var12, var13, var14);
         var4.drawImage(this.a, var2 - var5, var3 - var6, 20);
         var4.setClip(var7, var8, var9, var10);
      }
   }

   public Image a(int var1, boolean var2) {
      Image var3 = Image.createImage(this.b, this.c);
      this.a(var1, 0, 0, var3.getGraphics());
      return var3;
   }
}
