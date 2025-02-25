import java.util.Vector;

public class r {
   public int d;
   public int g;
   public String a;
   public String b;
   public byte b;
   public short a;
   public short b;
   public int a;
   public int f;
   public int h;
   public boolean c;
   public byte a;
   public ac a;

   public int a(Vector var1) {
      byte var2 = 0;
      if (var1 == null) {
         return 0;
      } else {
         int var3 = var2 + 1;
         this.d = (Integer)var1.elementAt(var2);
         this.g = (Integer)var1.elementAt(var3++);
         this.a = (String)var1.elementAt(var3++);
         this.b = (String)var1.elementAt(var3++);
         this.a = (Short)var1.elementAt(var3++);
         this.b = (Short)var1.elementAt(var3++);
         this.b = (Byte)var1.elementAt(var3++);
         if (var3 < var1.size()) {
            this.a = new ac();
            this.a.a((Vector)var1.elementAt(var3++));
            this.a = (Integer)var1.elementAt(var3++);
            this.f = (Integer)var1.elementAt(var3++);
            this.c = (Boolean)var1.elementAt(var3++);
            this.h = (Integer)var1.elementAt(var3++);
            this.a = (Byte)var1.elementAt(var3++);
         }

         return var3;
      }
   }

   public Vector a(boolean var1) {
      Vector var2 = new Vector();
      var2.addElement(new Integer(this.d));
      var2.addElement(new Integer(this.g));
      var2.addElement(this.a);
      var2.addElement(this.b);
      var2.addElement(new Short(this.a));
      var2.addElement(new Short(this.b));
      var2.addElement(new Byte(this.b));
      if (this.a == null) {
         var2.addElement((Object)null);
      } else {
         var2.addElement(this.a.a(false));
      }

      var2.addElement(new Integer(this.a));
      var2.addElement(new Integer(this.f));
      return var2;
   }
}
