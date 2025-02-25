import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class z {
   public Image a;
   private int a = 0;
   private static final int[][] a = new int[][]{{2, 131076, 393222, 786436, 1048581, 1376262, 1769474, 1900547, 2097155, 2293766, 2686982, 3080194, 3211268, 3473410, 3604483, 3801093, 4128771, 4325381, 4653061, 4980741, 5308421, 5636101, 5963780, 6225925, 6553605, 6881282, 7012354, 7143428, 7405573, 7733252, 7995397, 8323077, 8650757, 8978437, 9306117, 9633797, 9961477, 10289157, 10616837, 10944517, 11272194, 11403268, 11665413, 11993092, 12255238, 12648453, 12976133, 13303813, 13631493, 13959173, 14286853, 14614532, 14876677, 15204357, 15532038, 15925253, 16252933, 16580613, 16908291, 17104899, 17301507, 17498116, 17760262, 18153475, 18350084, 18612226, 18743300, 19005445, 19333125, 19660805, 19988485, 20316164, 20578310, 20971525, 21299206, 21692421, 22020101, 22347781, 22675461, 23003141, 23330822, 23724037, 24051717, 24379397, 24707077, 25034757, 25362436, 25624581, 25952262, 26345477, 26673158, 27066373, 27394054, 27787271, 28246022, 28639239, 29097989, 29425669, 29753351, 30212101, 30539781}, {3, 196614, 589830, 983045, 1310725, 1703943, 2162691, 2359300, 2621444, 2883591, 3342343, 3801091, 3997701, 4325379, 4521988, 4784134, 5177348, 5439494, 5832710, 6225926, 6619142, 7012358, 7405574, 7798789, 8126470, 8519683, 8716291, 8912901, 9240582, 9633797, 9961478, 10354694, 10747910, 11141126, 11534342, 11927558, 12320768, 12713990, 13107206, 13500422, 13893638, 14286851, 14483461, 14811142, 15204357, 15532039, 15990790, 16384006, 16777222, 17170438, 17563654, 17956869, 18284550, 18677766, 19070984, 19595270, 19988486, 20381702, 20774916, 21037060, 21299204, 21561349, 21889031, 22347780, 22609925, 22937603, 23134213, 23461894, 23855110, 24248326, 24641542, 25034757, 25362439, 25821190, 26214408, 26738694, 27131910, 27525126, 27918342, 28311558, 28704776, 29229062, 29622278, 30015494, 30408710, 30801926, 31195141, 31522822, 31916039, 32374790, 32768006, 33161222, 33554440, 34078729, 34668551, 35127304, 35651590, 36044806, 36438024, 36962310, 37355526}};

   public z(String var1) {
      this.a = aw.a(var1);
      if (var1 == "/bold.png") {
         this.a = 1;
      }

   }

   public int a(char var1, int var2, int var3, Graphics var4) {
      int var5 = -1;
      if (var1 >= '!' && var1 <= '`') {
         var5 = var1 - 33;
      } else if (var1 >= 'a' && var1 <= 'z') {
         var5 = var1 - 65;
      } else if (var1 >= 1040 && var1 <= 1071) {
         var5 = var1 - 972;
      } else if (var1 >= 1072 && var1 <= 1103) {
         var5 = var1 - 1004;
      } else if (var1 >= '{' && var1 <= '~') {
         var5 = var1 - 59;
      } else if (var1 == 1025 || var1 == 1105) {
         var5 = 100;
      }

      if (var5 != -1) {
         int var6 = 0;
         int var7 = a[this.a][var5];
         int var8 = var7 >> 16;
         int var9 = var7 & 255;
         int var10 = var5 / 20;
         if (var10 != 0) {
            var6 = 9 * var10;
            var8 -= a[this.a][20 * var10] >> 16;
         }

         if (var4 != null) {
            int var11 = var4.getClipX();
            int var12 = var4.getClipY();
            int var13 = var4.getClipWidth();
            int var14 = var4.getClipHeight();
            int var15 = var2;
            int var16 = var3;
            int var17 = var9;
            int var18 = 9;
            if (var2 >= var11 + var13 || var2 + var9 < var11 || var3 >= var12 + var14 || var3 + var18 < var12) {
               return var9;
            }

            if (var2 < var11) {
               var17 = var9 - (var11 - var2);
               var15 = var11;
            }

            if (var3 < var12) {
               var18 -= var12 - var3;
               var16 = var12;
            }

            if (var15 + var17 > var11 + var13) {
               var17 = var11 + var13 - var15;
            }

            if (var16 + var18 > var12 + var14) {
               var18 = var12 + var14 - var16;
            }

            var4.setClip(var15, var16, var17, var18);
            var4.drawImage(this.a, var2 - var8, var3 - var6, 0);
            var4.setClip(var11, var12, var13, var14);
         }

         return var9;
      } else {
         return 4;
      }
   }

   public int a(String var1, int var2, int var3, Graphics var4) {
      return this.a(var1, var2, var3, 0, var1.length(), var4);
   }

   private int a(String var1, int var2, int var3, int var4, int var5, Graphics var6) {
      char[] var7 = var1.toCharArray();
      int var8 = var2;
      int var9 = var4 + var5;

      for(int var10 = var4; var10 < var9; ++var10) {
         var8 += this.a(var7[var10], var8, var3, var6);
      }

      return var8 - var2;
   }

   public int a(String var1) {
      return this.a(var1, 0, 0, (Graphics)null);
   }

   public int a(String var1, int var2, int var3) {
      return this.a(var1, 0, 0, var2, var3, (Graphics)null);
   }
}
