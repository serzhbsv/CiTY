import java.util.Vector;

public class bh {
   public static Vector a(String var0, z var1, int var2, boolean var3) {
      Vector var4;
      int var5;
      for(var4 = new Vector(); (var5 = var0.indexOf(10)) != -1; var0 = var0.substring(var5 + 1, var0.length())) {
         a(var4, var0.substring(0, var5), var1, var2, var3);
      }

      a(var4, var0, var1, var2, var3);
      return var4;
   }

   public static Vector a(Vector var0, String var1, z var2, int var3, boolean var4) {
      var1 = var1.trim();
      int var5 = 0;
      int var6 = var1.length();
      int var7 = var1.length();

      Vector var8;
      for(var8 = var0; var5 < var6; var6 = var1.length()) {
         int var9 = var5;
         int var10 = var6;
         boolean var11 = true;

         while(var11 && var2.a(var1, var5, var6 - var5) > var3 || !var11) {
            if (Math.abs(var9 - var10) <= 1) {
               var6 = var9;
               break;
            }

            var6 += (var11 ? -1 : 1) * (var10 - var9) / 2;
            var11 = var2.a(var1, var5, var6 - var5) > var3;
            if (var11) {
               var10 = var6;
            } else {
               var9 = var6;
            }
         }

         boolean var12 = false;

         int var13;
         for(var13 = var6 - 1; var1.charAt(var13) != '\n' && var13 > var5; --var13) {
         }

         if (var13 != var5) {
            var6 = var13;
            var12 = true;
         }

         if (!var12 && var4 && var6 != var1.length()) {
            int var14;
            for(var14 = var6 - 1; var1.charAt(var14) != ' ' && var14 > var5; --var14) {
            }

            if (var14 != var5) {
               var6 = var14;
            }
         }

         while(var1.charAt(var5) == ' ' || var1.charAt(var5) == '\n') {
            ++var5;
         }

         if (var5 < var6) {
            var8.addElement(var1.substring(var5, var6));
         }

         var5 = var6;
      }

      return var8;
   }
}
