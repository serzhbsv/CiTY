import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public class f extends ac {
   public String u;
   private String l;
   public String o;
   public String t;
   public String e;
   public String d;
   public String j;
   public long a;
   public String z;
   public String r;
   public String B;
   public String q;
   public String i;
   public String p;
   public String m;
   public String k;
   public String f;
   public String x;
   public String w;
   public String a;
   public String s;
   public String h;
   public String C;
   public String v;
   public int b;
   public int c;
   public int e;
   public long c;
   public int a;
   public String A;
   public String y;
   public boolean a;
   public boolean e;
   public boolean c;
   public Vector a;
   public byte a;
   public boolean g;
   public String g;
   public String b;
   public Hashtable b = new Hashtable();
   public Hashtable c = new Hashtable();
   public Vector b = new Vector();
   public Hashtable a;
   public bd a;
   public r a;
   private static Random a;

   public f() {
      super.n = "";
      this.l = "";
      this.o = "@";
      this.t = "";
      this.e = "";
      this.d = "";
      this.a = "";
      this.s = "";
      this.h = "";
      this.C = "";
      this.v = "";
      a = new Random(System.currentTimeMillis());
   }

   public String a() {
      return this.l;
   }

   public void a(String var1) {
      this.l = var1;
   }

   public void b(String var1) {
      super.c = "";
      this.l = b(var1);
   }

   public static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int[] var2 = new int[var1.length * 3];
      String var3 = "";

      int var4;
      int var5;
      for(var4 = 0; var4 < var1.length; ++var4) {
         var5 = var4 * 3;
         var2[var5] = var1[var4];
         byte var6 = (byte)(a((int)3) + 1);
         var2[var5 + 1] = (byte)(var6 << 4);
         byte var7 = (byte)(a((int)14) + 1);
         var2[var5 + 1] += var7;
         boolean var8 = false;
         int var13;
         switch(var6) {
         case 1:
            var13 = var1[var4] + var7;
            var2[var5] = var13;
            var2[var5 + 2] = a((int)1103);
            break;
         case 2:
            var13 = var1[var4] - var7;
            var2[var5] = var13;
            var2[var5 + 2] = a((int)1103);
            break;
         case 3:
            var13 = var1[var4] * var7;
            var2[var5 + 2] = a((int)1103);
            var2[var5] = var13;
            break;
         case 4:
            var13 = var1[var4] / var7;
            int var9 = var1[var4] - var13 * var7;
            var2[var5] = var13;
            var2[var5 + 2] = var9;
            break;
         default:
            var2[var5 + 2] = a((int)1103);
         }
      }

      for(var4 = 0; var4 < var2.length; ++var4) {
         var3 = var3 + a(var2[var4]);
      }

      String var10 = var3;
      var3 = "";

      for(var5 = 0; var5 < var10.length(); ++var5) {
         char var11 = var10.charAt(var5);
         char var12 = (char)(1103 - var11);
         var3 = var3 + var12;
      }

      var10 = var3;
      var3 = "";

      for(var5 = 0; var5 < var10.length(); ++var5) {
         var3 = var3 + var10.charAt(var10.length() - 1 - var5);
      }

      return var3;
   }

   private static int a(int var0) {
      return (a.nextInt() & Integer.MAX_VALUE) % var0;
   }

   private static String a(int var0) {
      byte var1 = 17;
      int[] var2 = new int[4];
      var2[0] = var0 / (var1 * var1 * var1);
      var2[1] = (var0 - var2[0] * var1 * var1 * var1) / (var1 * var1);
      var2[2] = (var0 - (var2[0] * var1 * var1 * var1 + var2[1] * var1 * var1)) / var1;
      var2[3] = var0 - (var2[0] * var1 * var1 * var1 + var2[1] * var1 * var1 + var2[2] * var1);
      String var3 = "";

      for(int var4 = 0; var4 < var2.length; ++var4) {
         switch(var2[var4]) {
         case 0:
            var3 = var3 + "A";
            break;
         case 1:
            var3 = var3 + "B";
            break;
         case 2:
            var3 = var3 + "C";
            break;
         case 3:
            var3 = var3 + "D";
            break;
         case 4:
            var3 = var3 + "E";
            break;
         case 5:
            var3 = var3 + "F";
            break;
         case 6:
            var3 = var3 + "G";
            break;
         case 7:
            var3 = var3 + "H";
            break;
         case 8:
            var3 = var3 + "I";
            break;
         case 9:
            var3 = var3 + "J";
            break;
         case 10:
            var3 = var3 + "K";
            break;
         case 11:
            var3 = var3 + "L";
            break;
         case 12:
            var3 = var3 + "M";
            break;
         case 13:
            var3 = var3 + "N";
            break;
         case 14:
            var3 = var3 + "O";
            break;
         case 15:
            var3 = var3 + "P";
            break;
         case 16:
            var3 = var3 + "Q";
         }
      }

      return var3;
   }

   public static String a(String var0) {
      String var1 = "";
      String var2 = var0;
      var0 = "";

      int var3;
      for(var3 = 0; var3 < var2.length(); ++var3) {
         var0 = var0 + var2.charAt(var2.length() - 1 - var3);
      }

      var2 = var0;
      var0 = "";

      for(var3 = 0; var3 < var2.length(); ++var3) {
         char var4 = var2.charAt(var3);
         char var5 = (char)(1103 - var4);
         var0 = var0 + var5;
      }

      int[] var9 = a(var0);

      for(int var10 = 0; var10 < var9.length / 3; ++var10) {
         int var11 = var10 * 3;
         byte var6 = (byte)(var9[var11 + 1] >> 4);
         byte var7 = (byte)(var9[var11 + 1] & 15);
         boolean var8 = false;
         switch(var6) {
         case 1:
            var9[var11] -= var7;
            break;
         case 2:
            var9[var11] += var7;
            break;
         case 3:
            var9[var11] /= var7;
            break;
         case 4:
            var9[var11] *= var7;
            var9[var11] += var9[var11 + 2];
         }

         var1 = var1 + (char)var9[var11];
      }

      return var1;
   }

   private static int[] a(String var0) {
      int[] var1 = new int[var0.length() / 4];
      byte var2 = 17;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         int var4 = var3 * 4;
         var1[var3] = a(var0.charAt(var4)) * var2 * var2 * var2 + a(var0.charAt(var4 + 1)) * var2 * var2 + a(var0.charAt(var4 + 2)) * var2 + a(var0.charAt(var4 + 3));
      }

      return var1;
   }

   private static int a(char var0) {
      byte var1 = 0;
      switch(var0) {
      case 'A':
         var1 = 0;
         break;
      case 'B':
         var1 = 1;
         break;
      case 'C':
         var1 = 2;
         break;
      case 'D':
         var1 = 3;
         break;
      case 'E':
         var1 = 4;
         break;
      case 'F':
         var1 = 5;
         break;
      case 'G':
         var1 = 6;
         break;
      case 'H':
         var1 = 7;
         break;
      case 'I':
         var1 = 8;
         break;
      case 'J':
         var1 = 9;
         break;
      case 'K':
         var1 = 10;
         break;
      case 'L':
         var1 = 11;
         break;
      case 'M':
         var1 = 12;
         break;
      case 'N':
         var1 = 13;
         break;
      case 'O':
         var1 = 14;
         break;
      case 'P':
         var1 = 15;
         break;
      case 'Q':
         var1 = 16;
      }

      return var1;
   }

   public int a(Vector var1) {
      int var2 = super.a(var1);
      int var3 = var1.size();
      if (var3 > var2) {
         this.u = (String)var1.elementAt(var2++);
         this.a = (Byte)var1.elementAt(var2++);
         this.z = (String)var1.elementAt(var2++);
         this.r = (String)var1.elementAt(var2++);
         this.B = (String)var1.elementAt(var2++);
         this.q = (String)var1.elementAt(var2++);
         this.i = (String)var1.elementAt(var2++);
         this.p = (String)var1.elementAt(var2++);
         this.m = (String)var1.elementAt(var2++);
         this.w = (String)var1.elementAt(var2++);
         this.k = (String)var1.elementAt(var2++);
         this.f = (String)var1.elementAt(var2++);
         this.x = (String)var1.elementAt(var2++);
         this.g = (String)var1.elementAt(var2++);
         this.b = (String)var1.elementAt(var2++);
         this.a = (Long)var1.elementAt(var2++);
         this.g = (Boolean)var1.elementAt(var2++);
         this.e = (Boolean)var1.elementAt(var2++);
         this.a = (Boolean)var1.elementAt(var2++);
         this.c = (Boolean)var1.elementAt(var2++);
         super.f = (Boolean)var1.elementAt(var2++);
         this.b = (Integer)var1.elementAt(var2++);
         this.c = (Integer)var1.elementAt(var2++);
         this.e = (Integer)var1.elementAt(var2++);
         this.c = (Long)var1.elementAt(var2++);
         this.a = (Integer)var1.elementAt(var2++);
         this.A = (String)var1.elementAt(var2++);
         int var4 = (Integer)var1.elementAt(var2++);
         Hashtable var5 = new Hashtable();

         int var6;
         ac var7;
         for(var6 = 0; var6 < var4; ++var6) {
            var7 = new ac();
            var7.a((Vector)var1.elementAt(var2++));
            var5.put(new Long(var7.b), var7);
         }

         this.b = var5;
         var4 = (Integer)var1.elementAt(var2++);
         var5 = new Hashtable();

         for(var6 = 0; var6 < var4; ++var6) {
            var7 = new ac();
            var7.a((Vector)var1.elementAt(var2++));
            var5.put(new Long(var7.b), var7);
         }

         this.c = var5;
         this.b = new Vector();
         Object var11 = var1.elementAt(var2++);
         if (var11 != null) {
            this.a = new bd();
            this.a.a((Vector)var11);
         } else {
            this.a = null;
         }

         Object var12 = var1.elementAt(var2++);
         if (var12 != null) {
            this.a = new r();
            this.a.a((Vector)var12);
         } else {
            this.a = null;
         }

         this.a = new Hashtable();
         var4 = (Integer)var1.elementAt(var2++);

         for(int var9 = 0; var9 < var4; ++var9) {
            Vector var8 = (Vector)var1.elementAt(var2++);
            if (var8.elementAt(0) instanceof String) {
               this.a.put((String)var8.elementAt(0), (String)var8.elementAt(1));
            } else {
               r var10 = new r();
               var10.a(var8);
               this.a.put(new Long((long)var10.d), var10);
            }
         }

         super.b = (Boolean)var1.elementAt(var2++);
         if (var2 < var1.size() && var1.elementAt(var2) instanceof Integer) {
            super.d = (Integer)var1.elementAt(var2++);
         } else {
            ++var2;
         }

         this.y = (String)var1.elementAt(var2++);
         this.t = (String)var1.elementAt(var2++);
         this.e = (String)var1.elementAt(var2++);
         this.d = (String)var1.elementAt(var2++);
      }

      return var2;
   }

   public void a(Vector var1) {
      byte var2 = 0;
      int var7 = var2 + 1;
      long var3 = (long)(Integer)var1.elementAt(var2);
      this.b = new Vector();

      for(int var5 = 0; (long)var5 < var3; ++var5) {
         s var6 = s.a((Vector)var1.elementAt(var7++));
         this.b.addElement(var6);
      }

   }

   public Vector a(boolean var1) {
      Vector var2 = super.a(var1);
      if (var1) {
         var2.addElement(this.u);
         var2.addElement(this.o);
         var2.addElement(this.j);
         var2.addElement(this.a);
         var2.addElement(this.s);
         var2.addElement(this.h);
         var2.addElement(b(this.C));
         var2.addElement(b(this.v));
         var2.addElement(new Byte(this.a));
         var2.addElement(this.z);
         var2.addElement(this.r);
         var2.addElement(this.B);
         var2.addElement(this.q);
         var2.addElement(this.i);
         var2.addElement(this.p);
         var2.addElement(this.m);
         var2.addElement(this.w);
         var2.addElement(this.k);
         var2.addElement(this.f);
         var2.addElement(this.x);
         var2.addElement(this.g);
         var2.addElement(this.b);
         var2.addElement(new Long(this.a));
         var2.addElement(new Boolean(this.g));
         var2.addElement(new Boolean(this.e));
         var2.addElement(new Boolean(this.a));
         var2.addElement(new Boolean(this.c));
         var2.addElement(new Boolean(super.f));
         var2.addElement(new Integer(this.b.size()));
         Enumeration var3 = this.b.elements();

         while(var3.hasMoreElements()) {
            var2.addElement(((ac)var3.nextElement()).a(false));
         }

         var2.addElement(new Integer(this.c.size()));
         var3 = this.c.elements();

         while(var3.hasMoreElements()) {
            var2.addElement(((ac)var3.nextElement()).a(false));
         }

         if (this.a == null) {
            var2.addElement((Object)null);
         } else {
            var2.addElement(this.a.a(false));
         }

         if (this.a == null) {
            var2.addElement((Object)null);
         } else {
            var2.addElement(this.a.a(false));
         }

         if (this.a == null) {
            var2.addElement(new Integer(0));
         } else {
            var2.addElement(new Integer(this.a.size()));
            var3 = this.a.elements();

            while(var3.hasMoreElements()) {
               r var4 = (r)var3.nextElement();
               var2.addElement(var4.a(false));
            }
         }

         var2.addElement(this.y);
      }

      return var2;
   }
}
