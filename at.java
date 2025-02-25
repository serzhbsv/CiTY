import com.siemens.mp.io.File;
import java.io.EOFException;

public class at implements Runnable {
   public c a;
   public String a;

   public at(c var1, String var2) {
      this.a = var1;
      this.a = var2;
   }

   public void run() {
      try {
         byte[] var1 = new byte[512];
         File var2 = new File();
         int var3 = var2.open(this.a);
         if (var3 < 0) {
            throw new Exception("cannot open file");
         }

         int var4 = var2.length(var3);
         if (var4 > 150000) {
            this.a.a.a("Ошибка загрузки картинки.\nМаксимальный размер файла 150 кбайт.");
            return;
         }

         aw.a.b(new a((byte)42, (Object)null), true);

         for(int var5 = var4; var5 > 0; this.a.a.a.a[this.a.a.a.a.length - 2] = "Загружено: " + String.valueOf(var4 - var5) + " " + "из" + " " + var4) {
            int var6 = 0;

            try {
               var6 = var2.read(var3, var1, 0, 512);
            } catch (EOFException var12) {
               var12.printStackTrace();
            }

            if (var6 <= 0) {
               this.a.a.a("Ошибка загрузки картинки.\nНеверный формат файла.");
               return;
            }

            var5 -= var6;
            byte[] var7 = new byte[var6];

            int var8;
            for(var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1[var8];
            }

            aw.a.b(new a((byte)39, var7), true);

            for(var8 = 1; var8 > 0; Thread.sleep(50L)) {
               synchronized(aw.a.a) {
                  var8 = aw.a.a.size();
               }
            }
         }

         aw.a.b(new a((byte)43, (Object)null), true);
         var2.close(var3);
      } catch (Exception var13) {
         var13.printStackTrace();
      }

   }

   public void a() {
      Thread var1 = new Thread(this);
      var1.start();
   }
}
