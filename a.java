import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

public class a {
   public Object a;
   public byte a;

   public a() {
      this.a = 1;
   }

   public a(byte var1) {
      this.a = var1;
      this.a = null;
   }

   public a(byte var1, Object var2) {
      this(var1);
      this.a = var2;
   }

   public static a a(DataInputStream var0) throws IOException {
      a var1 = new a();
      var1.a = var0.readByte();
      var1.a = a(var0);
      return var1;
   }

   public static Object a(DataInputStream var0) throws IOException {
      byte var1 = var0.readByte();
      int var4;
      switch(var1) {
      case 0:
      case 1:
      default:
         return null;
      case 2:
         return new Byte(var0.readByte());
      case 3:
         int var2 = var0.readInt();
         byte[] var3 = new byte[var2];

         for(var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var0.readByte();
         }

         return var3;
      case 4:
         return new Integer(var0.readInt());
      case 5:
         try {
            String var8 = var0.readUTF();
            return var8;
         } catch (Exception var7) {
            var7.printStackTrace();
            return "";
         }
      case 6:
         var4 = var0.readInt();
         Vector var5 = new Vector();

         for(int var6 = 0; var6 < var4; ++var6) {
            var5.addElement(a(var0));
         }

         return var5;
      case 7:
         return new Boolean(var0.readBoolean());
      case 8:
         return new Long(var0.readLong());
      case 9:
         return new Short(var0.readShort());
      }
   }

   public static void a(a var0, DataOutputStream var1) throws IOException {
      var1.writeByte(var0.a);
      a(var0.a, var1);
   }

   public static void a(Object var0, DataOutputStream var1) throws IOException {
      if (var0 == null) {
         var1.writeByte(0);
      } else {
         int var3;
         if (var0 instanceof byte[]) {
            var1.writeByte(3);
            byte[] var2 = (byte[])var0;
            var1.writeInt(var2.length);

            for(var3 = 0; var3 < var2.length; ++var3) {
               var1.writeByte(var2[var3]);
            }
         } else if (var0 instanceof Byte) {
            var1.writeByte(2);
            Byte var4 = (Byte)var0;
            var1.writeByte(var4);
         } else if (var0 instanceof Integer) {
            var1.writeByte(4);
            Integer var5 = (Integer)var0;
            var1.writeInt(var5);
         } else if (var0 instanceof Short) {
            var1.writeByte(9);
            Short var6 = (Short)var0;
            var1.writeShort(var6);
         } else if (var0 instanceof Long) {
            var1.writeByte(8);
            Long var7 = (Long)var0;
            var1.writeLong(var7);
         } else if (var0 instanceof String) {
            var1.writeByte(5);
            String var8 = (String)var0;
            var1.writeUTF(var8);
         } else if (var0 instanceof Boolean) {
            var1.writeByte(7);
            Boolean var9 = (Boolean)var0;
            var1.writeBoolean(var9);
         } else if (var0 instanceof Vector) {
            var1.writeByte(6);
            Vector var10 = (Vector)var0;
            var1.writeInt(var10.size());

            for(var3 = 0; var3 < var10.size(); ++var3) {
               a(var10.elementAt(var3), var1);
            }
         } else {
            var1.writeByte(1);
         }
      }

   }
}
