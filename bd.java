import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class bd extends r {
   public String f;
   public String c;
   public String e;
   public String d;
   public long b;
   public long a;
   public int c;
   public int b;
   public int e;
   public boolean b;
   public boolean a;
   public byte c;
   public Hashtable a = new Hashtable();
   public byte[] a;

   public Vector a(boolean var1) {
      Vector var2 = super.a(var1);
      if (var1) {
         var2.addElement(new Integer(this.c));
         var2.addElement(this.f);
         var2.addElement(this.d);
         var2.addElement(this.e);
         var2.addElement(this.c);
         var2.addElement(new Boolean(super.c));
         var2.addElement(new Byte(this.c));
         int var3 = this.a.size();
         var2.addElement(new Integer(var3));
         Enumeration var4 = this.a.elements();

         while(var4.hasMoreElements()) {
            var2.addElement(((ac)var4.nextElement()).a(true));
         }
      }

      return var2;
   }

   public int a(Vector var1) {
      int var2 = super.a(var1);
      if (var1.size() > var2) {
         this.c = (Integer)var1.elementAt(var2++);
         this.a = (Long)var1.elementAt(var2++);
         this.f = (String)var1.elementAt(var2++);
         this.d = (String)var1.elementAt(var2++);
         this.e = (String)var1.elementAt(var2++);
         this.c = (String)var1.elementAt(var2++);
         super.c = (Boolean)var1.elementAt(var2++);
         this.c = (Byte)var1.elementAt(var2++);
         this.b = (Boolean)var1.elementAt(var2++);
         this.a = (Boolean)var1.elementAt(var2++);
         this.a.clear();
         int var3 = (Integer)var1.elementAt(var2++);

         for(int var4 = 0; var4 < var3; ++var4) {
            ac var5 = new ac();
            var5.a((Vector)var1.elementAt(var2++));
            this.a.put(new Long(var5.b), var5);
         }

         this.b = (Integer)var1.elementAt(var2++);
         this.e = (Integer)var1.elementAt(var2++);
         if (var2 < var1.size()) {
            this.a = (byte[])var1.elementAt(var2++);
         }
      }

      return var2;
   }

   public void a(bd var1) {
      super.d = var1.d;
      super.g = var1.g;
      super.a = var1.a;
      this.f = var1.f;
      super.c = var1.c;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      super.b = var1.b;
      super.a = var1.a;
      this.b = var1.b;
   }
}
