public class t {
   private long b;
   private long a;
   public int a;

   public t(int var1) {
      this.a = var1;
   }

   public void a() {
      this.b = System.currentTimeMillis();
      this.a = 0L;
   }

   public int a() {
      long var1 = System.currentTimeMillis();
      if (var1 > this.b) {
         if (var1 + this.a > this.b) {
            long var3 = var1 + this.a - this.b;
            this.b = var1;
            this.a = var3 % (long)this.a;
            return (int)(var3 / (long)this.a);
         }

         this.a += var1 - this.b;
      }

      return 0;
   }
}
