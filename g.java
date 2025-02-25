import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class g extends d implements CommandListener, ItemStateListener {
   public XChatMidlet a;
   public String a;
   public Vector a;
   public Vector b;

   public g(XChatMidlet var1, Displayable var2, Vector var3) {
      super("");
      this.a = var1;
      this.setItemStateListener(this);
      this.a = (String)var3.elementAt(0);
      Vector var4 = (Vector)var3.elementAt(1);
      Enumeration var5 = var4.elements();

      while(true) {
         while(var5.hasMoreElements()) {
            Object var6 = var5.nextElement();
            if (var6 instanceof String) {
               String var14 = var6.toString();
               this.append(var14);
            } else if (!(var6 instanceof Vector)) {
               if (var6 instanceof byte[]) {
                  try {
                     byte[] var13 = (byte[])var6;
                     Image var16 = Image.createImage(var13, 0, var13.length);
                     this.append(var16);
                  } catch (IllegalArgumentException var11) {
                     var11.printStackTrace();
                  }
               }
            } else {
               Vector var7 = (Vector)var6;
               if (var7.elementAt(1) instanceof String) {
                  TextField var15 = new TextField(var7.elementAt(0).toString(), var7.elementAt(1).toString(), 32, 0);
                  this.append(var15);
               } else if (var7.elementAt(1) instanceof Vector) {
                  ChoiceGroup var8 = new ChoiceGroup(var7.elementAt(0).toString(), 1);
                  Vector var9 = (Vector)var7.elementAt(1);
                  if (var9.size() > 5) {
                     var8.append(var9.elementAt(0).toString(), (Image)null);
                     var8.append(var9.elementAt(1).toString(), (Image)null);
                     var8.append("Другие...", (Image)null);
                     if (this.a == null) {
                        this.a = new Vector();
                        this.b = new Vector();
                     }

                     this.a.addElement(var8);
                     this.b.addElement(var9);
                  } else {
                     Enumeration var10 = var9.elements();

                     while(var10.hasMoreElements()) {
                        var8.append(var10.nextElement().toString(), (Image)null);
                     }
                  }

                  this.append(var8);
               }
            }
         }

         this.addCommand(XChatMidlet.av);
         Vector var12 = (Vector)var3.elementAt(2);
         var5 = var12.elements();

         while(var5.hasMoreElements()) {
            this.addCommand(new Command((String)var5.nextElement(), 1, 0));
         }

         this.setCommandListener(this);
         var1.a((Displayable)this, true);
         return;
      }
   }

   public void a(ChoiceGroup var1) {
      while(var1.size() > 0) {
         var1.delete(0);
      }

   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals("Искать")) {
         this.a.a("Надо немного подождать...", "Выполняется поиск", this);
         Vector var3 = new Vector();
         var3.addElement(this.a);

         for(int var4 = 0; var4 < this.size(); ++var4) {
            Item var5 = this.get(var4);
            if (var5 instanceof TextField) {
               var3.addElement(((TextField)var5).getString());
            } else if (var5 instanceof ChoiceGroup) {
               ChoiceGroup var6 = (ChoiceGroup)var5;
               var3.addElement(var6.getString(var6.getSelectedIndex()));
            }
         }

         aw.a.a(new a((byte)81, var3));
      } else if (var1.getLabel().equals("Назад")) {
         this.a.commandAction(XChatMidlet.av, this);
      }

   }

   public void itemStateChanged(Item var1) {
      if (var1 instanceof ChoiceGroup) {
         ChoiceGroup var2 = (ChoiceGroup)var1;
         if (var2.getString(var2.getSelectedIndex()).equals("Другие...")) {
            this.a(var2);
            Vector var3 = (Vector)this.b.elementAt(this.a.indexOf(var2));
            Enumeration var4 = var3.elements();

            while(var4.hasMoreElements()) {
               var2.append(var4.nextElement().toString(), (Image)null);
            }
         }
      }

   }
}
