import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import xchat.XChatMidlet;

public class m extends d implements CommandListener, ItemStateListener, j, ad {
   private byte a;
   private Vector a;
   public XChatMidlet a;
   public boolean a;
   public Item[] a;
   public String a;
   public byte b;

   public m(XChatMidlet var1, Vector var2, Displayable var3) {
      super("");
      this.a = (Byte)var2.elementAt(3);
      if (this.a == 20) {
         this.b = (Byte)var2.elementAt(4);
      }

      this.a((Vector)var2.elementAt(0));
      this.a = true;
      if (this.a == 21) {
         this.b();
      }

      this.a((Vector)((Vector)var2.elementAt(1)), (Displayable)this);
      this.setCommandListener(this);
      this.setItemStateListener(this);
      this.a = var1;
      super.setTitle((String)var2.elementAt(2));
   }

   public void a(Vector var1) {
      this.a = new Item[var1.size()];
      int var2 = 0;

      for(Enumeration var3 = var1.elements(); var3.hasMoreElements(); ++var2) {
         Object var4 = var3.nextElement();
         if (var4 instanceof String) {
            this.append((String)var4);
            this.a[var2] = new StringItem("", "");
         } else if (var4 instanceof byte[]) {
            byte[] var12 = (byte[])var4;
            Image var13 = Image.createImage(var12, 0, var12.length);
            this.append(var13);
            this.a[var2] = new StringItem("", "");
         } else if (var4 instanceof Vector) {
            Vector var5 = (Vector)var4;
            String var6;
            if ((Byte)var5.elementAt(0) == 1) {
               var6 = (String)var5.elementAt(1);
               TextField var15 = new TextField(var6, (String)var5.elementAt(2), 32, 0);
               this.a[var2] = new TextField(var6, (String)var5.elementAt(2), 32, 0);
               this.append(var15);
            } else if ((Byte)var5.elementAt(0) != 2) {
               if ((Byte)var5.elementAt(0) == 3) {
                  var6 = (String)var5.elementAt(1);
                  long var14 = (Long)var5.elementAt(2);
                  DateField var18 = new DateField(var6, 1);
                  var18.setDate(new Date(var14));
                  this.append(var18);
               }
            } else {
               var6 = (String)var5.elementAt(1);
               byte var7 = (Byte)var5.elementAt(2);
               ChoiceGroup var8 = new ChoiceGroup(var6, var7);
               this.a[var2] = new ChoiceGroup(var6, var7);

               for(int var9 = 4; var9 < var5.size(); ++var9) {
                  var8.append((String)var5.elementAt(var9), (Image)null);
                  ((ChoiceGroup)this.a[var2]).append((String)var5.elementAt(var9), (Image)null);
               }

               if (var5.elementAt(3) instanceof byte[]) {
                  byte[] var16 = (byte[])var5.elementAt(3);
                  boolean[] var10 = new boolean[var16.length];

                  for(short var11 = 0; var11 < var16.length; ++var11) {
                     if (var16[var11] > 0) {
                        var10[var11] = true;
                     } else {
                        var10[var11] = false;
                     }
                  }

                  var8.setSelectedFlags(var10);
                  ((ChoiceGroup)this.a[var2]).setSelectedFlags(var10);
               } else {
                  byte var17 = (Byte)var5.elementAt(3);
                  if (var7 == 1) {
                     var8.setSelectedIndex(var17, true);
                     ((ChoiceGroup)this.a[var2]).setSelectedIndex(var17, true);
                  } else {
                     var8.setSelectedIndex(0, var17 > 0);
                     ((ChoiceGroup)this.a[var2]).setSelectedIndex(0, var17 > 0);
                  }
               }

               this.append(var8);
            }
         }
      }

   }

   public void a(Vector var1, Displayable var2) {
      this.a = var1;
      Enumeration var3 = var1.elements();

      for(short var4 = 0; var4 < var1.size(); ++var4) {
         Vector var5 = (Vector)var1.elementAt(var4);
         byte var6 = (Byte)var5.elementAt(0);
         if (var6 == 89) {
            var2.addCommand(new Command((String)var5.elementAt(1), 2, 25));
         } else if (var6 == 91) {
            var2.addCommand(XChatMidlet.Z);
         } else {
            var2.addCommand(new Command((String)var5.elementAt(1), 1, 0));
         }

         if (var6 == 90) {
            this.a = (String)var5.elementAt(2);
         }
      }

   }

   public void commandAction(Command var1, Displayable var2) {
      Enumeration var3 = this.a.elements();
      if (var1 == XChatMidlet.aT) {
         this.a.commandAction(var1, var2);
      } else {
         XChatMidlet var10001;
         String var5;
         Vector var6;
         if (var1 == XChatMidlet.aY && this.a == 20) {
            if (this.b()) {
               this.a = true;
               var6 = this.b();
               this.a((byte)117, var6);
               var5 = "Паспорт сохранен.\nВыберите 'ОК' для продолжения.";
               var10001 = this.a;
               this.a.commandAction(XChatMidlet.av, this);
            } else {
               var5 = "Неверно указана дата рождения. Убедись, что указанная дата соответствует формату ДД/ММ/ГГГГ. Пример верной даты: 10/03/1980.";
               ay var8 = new ay(this.a);
               var8.a("Внимание", var5, 2, (ai)null, true);
            }
         } else if (var1 == XChatMidlet.av) {
            var10001 = this.a;
            this.a.commandAction(XChatMidlet.av, this);
         } else if (var1 == XChatMidlet.Z) {
            var10001 = this.a;
            this.a.commandAction(XChatMidlet.Z, this);
         } else {
            while(var3.hasMoreElements()) {
               var6 = (Vector)var3.nextElement();
               if (var1.getLabel().equals((String)var6.elementAt(1))) {
                  byte var4 = (Byte)var6.elementAt(0);
                  ay var9;
                  if (var4 == 89) {
                     if (this.a == 20 && !this.a && this.a()) {
                        var9 = new ay(this.a);
                        var9.a(new ai(this) {
                           private final m a;

                           public {
                              this.a = var1;
                           }

                           public void h() {
                              this.a.commandAction(XChatMidlet.aY, (Displayable)null);
                           }

                           public void j() {
                              this.a.commandAction(XChatMidlet.av, (Displayable)null);
                           }
                        });
                        var9.a("Вопрос", "Паспортные данные изменены. \nСохранить?", 4, var9.a, true);
                        return;
                     }

                     var10001 = this.a;
                     this.a.commandAction(XChatMidlet.av, this);
                     return;
                  }

                  if (var4 == 114) {
                     System.gc();
                     var10001 = this.a;
                     this.a.commandAction(XChatMidlet.af, this);
                     return;
                  }

                  if (var4 == 90) {
                     var10001 = this.a;
                     this.a.commandAction(XChatMidlet.aM, this);
                     return;
                  }

                  if (var4 == 117 && this.a == 20) {
                     this.commandAction(XChatMidlet.aY, this);
                     return;
                  }

                  if (var4 == 116) {
                     var10001 = this.a;
                     this.a.commandAction(XChatMidlet.ac, this);
                     return;
                  }

                  Vector var7;
                  if (var4 == 117 && this.a == 24) {
                     if (this.c()) {
                        var7 = this.b();
                        this.a((byte)117, var7);
                        var5 = "Паспорт сохранен.\nВыберите 'ОК' для продолжения.";
                        var10001 = this.a;
                        this.a.commandAction(XChatMidlet.av, this);
                        return;
                     }

                     return;
                  }

                  if ((Byte)var6.elementAt(3) != 0) {
                     var5 = "";
                     if (this.a == 20) {
                        if (this.b()) {
                           this.a = true;
                           var7 = this.b();
                           this.a((Byte)var6.elementAt(0), var7);
                           var5 = "Паспорт сохранен.\nВыберите 'ОК' для продолжения.";
                        } else {
                           var5 = "Неверно указана дата рождения. Убедись, что указанная дата соответствует формату ДД/ММ/ГГГГ. Пример верной даты: 10/03/1980.";
                        }

                        var9 = new ay(this.a);
                        var9.a("Внимание", var5, 2, (ai)null, true);
                     } else {
                        var7 = this.b();
                        this.a((Byte)var6.elementAt(0), var7);
                     }
                  }

                  if ((Byte)var6.elementAt(3) == 2) {
                     this.a.a("Надо немного подождать...", "Загрузка данных", this);
                  } else if ((Byte)var6.elementAt(3) == 5) {
                     this.a.a("Надо немного подождать...", (String)var6.elementAt(2), this);
                  } else if ((Byte)var6.elementAt(3) == 3) {
                     this.a.a("Надо немного подождать...", (String)var6.elementAt(2), super.a);
                  }
                  break;
               }
            }

         }
      }
   }

   public Vector b() {
      Vector var1 = new Vector();
      if (this.a != 20 && this.a != 24) {
         if (this.a == 1) {
            this.a();
         }
      } else {
         var1.addElement(new Byte(this.b));
      }

      for(int var2 = 0; var2 < this.size(); ++var2) {
         Item var3 = this.get(var2);
         Vector var5;
         if (var3 instanceof TextField) {
            TextField var4 = (TextField)var3;
            if (var4.getString().trim().compareTo("") != 0) {
               var5 = new Vector();
               var5.addElement(var4.getLabel());
               var5.addElement(var4.getString().trim());
               var1.addElement(var5);
            }
         }

         if (var3 instanceof DateField) {
            DateField var9 = (DateField)var3;
            var5 = new Vector();
            var5.addElement(var9.getLabel().trim());
            var5.addElement(new Long(var9.getDate().getTime()));
            var1.addElement(var5);
         } else if (var3 instanceof ChoiceGroup) {
            ChoiceGroup var8 = (ChoiceGroup)var3;
            String var10 = "";
            Vector var6 = new Vector();
            if (var8.size() == 1) {
               var6.addElement(var8.getString(0).trim());
               var6.addElement(new Boolean(var8.isSelected(0)));
               var1.addElement(var6);
            } else {
               for(int var7 = 0; var7 < var8.size(); ++var7) {
                  if (var8.isSelected(var7)) {
                     var10 = var10 + var8.getString(var7).trim() + ",";
                  }
               }

               var6.addElement(var8.getLabel().trim());
               var6.addElement(var10);
               var1.addElement(var6);
            }
         }
      }

      return var1;
   }

   public void a(byte var1, Vector var2) {
      Vector var3 = new Vector();
      var3.addElement(new Byte(var1));
      var3.addElement(new Byte(this.a));
      var3.addElement(var2);
      System.gc();
      aw.a.a(new a((byte)120, var3));
   }

   public void itemStateChanged(Item var1) {
      this.a = false;
   }

   public String a() {
      return this.a;
   }

   public void a(int var1) {
      this.b = (byte)var1;
      this.a.a.a.b = this.b;
      this.a = false;
      this.a.a((Displayable)this, false);
   }

   public void a(Displayable var1, Command var2) {
      aw.a(var1, var2);
   }

   public Vector a() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.size(); ++var2) {
         Item var3 = this.get(var2);
         Vector var5;
         if (var3 instanceof TextField) {
            TextField var4 = (TextField)var3;
            if (var4.getString().trim().compareTo("") != 0) {
               var5 = new Vector();
               var5.addElement(var4.getLabel());
               var5.addElement(var4.getString().trim());
               var1.addElement(var5);
            }
         }

         if (var3 instanceof DateField) {
            DateField var9 = (DateField)var3;
            var5 = new Vector();
            var5.addElement(var9.getLabel());
            var5.addElement(new Long(var9.getDate().getTime()));
            var1.addElement(var5);
         } else if (var3 instanceof ChoiceGroup) {
            ChoiceGroup var8 = (ChoiceGroup)var3;
            String var10 = "";
            Vector var6 = new Vector();
            if (var8.size() == 1) {
               if (var8.isSelected(0)) {
                  var6.addElement(var8.getString(0).trim());
               }

               var1.addElement(var6);
            } else {
               for(int var7 = 0; var7 < var8.size(); ++var7) {
                  if (var8.isSelected(var7)) {
                     var10 = var10 + var8.getString(var7).trim() + ",";
                  }
               }

               if (var10 != "") {
                  var6.addElement(var8.getLabel().trim());
                  var6.addElement(var10);
                  var1.addElement(var6);
               }
            }
         }
      }

      return var1;
   }

   public void a() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);
         a.a(new a((byte)1, this.a()), var2);
         byte[] var3 = var1.toByteArray();
         aw.d("searchprofileform");
         aw.a("searchprofileform", var3);
      } catch (Exception var4) {
      }

   }

   public void b() {
      try {
         new ac();
         byte[] var2 = aw.a("searchprofileform");
         ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
         DataInputStream var4 = new DataInputStream(var3);
         a var5 = a.a(var4);
         Vector var6 = (Vector)var5.a;
         Enumeration var7 = var6.elements();

         label44:
         while(var7.hasMoreElements()) {
            Vector var8 = (Vector)var7.nextElement();
            String var9 = (String)var8.elementAt(0);

            for(int var10 = 0; var10 < this.size(); ++var10) {
               Item var11 = this.get(var10);
               if (var11.getLabel().compareTo(var9) == 0) {
                  if (var11 instanceof TextField) {
                     ((TextField)var11).setString((String)var8.elementAt(1));
                     break;
                  }

                  if (var11 instanceof ChoiceGroup) {
                     ChoiceGroup var12 = (ChoiceGroup)var11;
                     int var13 = 0;

                     while(true) {
                        if (var13 >= var12.size()) {
                           continue label44;
                        }

                        int var14 = ((String)var8.elementAt(1)).indexOf(var12.getString(var13));
                        if (var14 > -1) {
                           var12.setSelectedIndex(var13, true);
                        }

                        ++var13;
                     }
                  }
               }
            }
         }
      } catch (Exception var15) {
      }

   }

   public boolean b() {
      for(int var1 = 0; var1 < this.size(); ++var1) {
         Item var2 = this.get(var1);
         if (var2 instanceof TextField && var2.getLabel().indexOf("Дата рождения") >= 0) {
            String var3 = ((TextField)var2).getString();
            if (var3.length() > 10) {
               return false;
            }

            int var4 = var3.indexOf("/");
            if (var4 > 0) {
               try {
                  int var5 = Integer.parseInt(var3.substring(0, var4));
                  int var6 = var4;
                  var4 = var3.indexOf("/", var4 + 1);
                  if (var4 > 0) {
                     int var7 = Integer.parseInt(var3.substring(var6 + 1, var4));
                     int var8 = Integer.parseInt(var3.substring(var4 + 1, var3.length()));
                     Calendar var9 = Calendar.getInstance();
                     Date var10 = new Date(System.currentTimeMillis());
                     var9.setTime(var10);
                     if (var5 > 0 && var5 <= 31 && var7 > 0 && var7 <= 12 && var8 > 1910 && var8 < var9.get(1)) {
                        return true;
                     }

                     return false;
                  }
               } catch (NumberFormatException var11) {
                  return false;
               }
            }
            break;
         }
      }

      return true;
   }

   public boolean c() {
      String var1 = "";
      String var2 = "";

      for(int var3 = 0; var3 < this.size(); ++var3) {
         Item var4 = this.get(var3);
         if (var4 instanceof TextField) {
            TextField var5 = (TextField)var4;
            if (var5.getLabel().compareTo("Введите новый пароль:") == 0) {
               var1 = var5.getString();
            }

            if (var5.getLabel().compareTo("Повторите новый пароль:") == 0) {
               var2 = var5.getString();
            }
         }
      }

      ay var6;
      if (var1.length() < 6) {
         var6 = new ay(this.a);
         var6.a("Внимание", "Длина пароля должна быть не менее 6 символов.", 2, (ai)null, true);
         return false;
      } else if (var1.length() > 0 && var1.compareTo(var2) != 0) {
         var6 = new ay(this.a);
         var6.a("Внимание", "Пароли не совпадают.\nУкажи пароль заново.", 2, (ai)null, true);
         return false;
      } else {
         return true;
      }
   }

   public boolean a() {
      if (!this.a) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.size(); ++var1) {
            Item var2 = this.get(var1);
            if (var2.getLabel() == this.a[var1].getLabel()) {
               if (var2 instanceof TextField) {
                  TextField var6 = (TextField)var2;
                  if (var6.getString().trim().compareTo(((TextField)this.a[var1]).getString().trim()) != 0) {
                     return true;
                  }
               } else if (var2 instanceof ChoiceGroup) {
                  ChoiceGroup var3 = (ChoiceGroup)var2;
                  String var4 = "";
                  if (var3.size() == 1) {
                     if (var3.isSelected(0) != ((ChoiceGroup)this.a[var1]).isSelected(0)) {
                        return true;
                     }
                  } else {
                     for(int var5 = 0; var5 < var3.size(); ++var5) {
                        if (var3.isSelected(var5) != ((ChoiceGroup)this.a[var1]).isSelected(var5)) {
                           return true;
                        }
                     }
                  }
               }
            }
         }

         return false;
      }
   }
}
