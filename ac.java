import java.util.Vector;

public class ac {
   public String n;
   public long b;
   public byte b;
   public boolean d;
   public String c;
   public boolean f;
   public int f;
   public boolean b;
   public int d;

   public int a(Vector var1) {
      byte var2 = 0;
      if (var1 == null) {
         return 0;
      } else {
         int var3 = var2 + 1;
         this.b = (Long)var1.elementAt(var2);
         this.n = (String)var1.elementAt(var3++);
         this.d = (Boolean)var1.elementAt(var3++);
         this.b = (Byte)var1.elementAt(var3++);
         this.f = (Boolean)var1.elementAt(var3++);
         this.f = (Integer)var1.elementAt(var3++);
         return var3;
      }
   }

   public Vector a(boolean var1) {
      Vector var2 = new Vector();
      var2.addElement(new Long(this.b));
      var2.addElement(this.n);
      var2.addElement(new Boolean(this.d));
      var2.addElement(new Byte(this.b));
      return var2;
   }
}
