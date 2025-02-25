import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import xchat.XChatMidlet;

public class aa extends bb implements CommandListener, j {
   public Byte a;
   public static byte a = 2;
   public static byte b = 1;
   public static byte e = 3;
   public static byte c = 4;
   public static byte d = 5;
   private Vector a;
   public Vector c;
   public int z;
   private String a;
   private String c = "";
   public boolean k;
   public long b;
   public aq a;
   public Displayable b;
   public boolean j = false;

   public String a() {
      return this.a;
   }

   public aa(XChatMidlet var1, Vector var2, Displayable var3) {
      super(var1, (String)var2.elementAt(2), 1);
      this.b = var3;
      super.b = (String)var2.elementAt(2);
      this.a = (Byte)var2.elementAt(3);
      this.z = var2.size() > 6 ? (Integer)var2.elementAt(6) : 0;
      if (var2.size() > 4) {
         this.c = (String)var2.elementAt(4);
         super.j = (Integer)var2.elementAt(5);
      }

      this.c = new Vector();
      this.c = (Vector)var2.elementAt(0);
      var1.c = var3;
      if (this.a != 11 && this.a != 12) {
         super.c = XChatMidlet.d;
      } else {
         super.c = null;
         var1.a = false;
      }

      this.k = false;
      if (this.a == 15) {
         this.b = (Long)var2.elementAt(7);
      }

      if (this.a == 14) {
         Vector var4 = null;
         Vector var5 = new Vector();
         var1.a = true;

         int var7;
         for(var7 = 0; var7 < ((Vector)var2.elementAt(0)).size(); ++var7) {
            var4 = (Vector)((Vector)var2.elementAt(0)).elementAt(var7);
            bd var6 = new bd();
            var6.a(var4);
            var5.addElement(var6);
         }

         var7 = (Integer)var4.elementAt(1);
         this.a = new aq(var1);
         this.a.j = (Integer)var2.elementAt(5);
         this.a((Vector)((Vector)var2.elementAt(1)), this.a);
         this.a.setCommandListener(this);
         this.a.b((Displayable)this);
         this.a.a(var5, var7, var7 == 0 ? 1 : 2);
         var1.a = this.a;
         if (this.a == 16) {
            super.h = false;
         } else {
            super.h = true;
         }
      } else {
         this.a((Vector)var2.elementAt(0));
         this.a((Vector)((Vector)var2.elementAt(1)), this);
      }

      this.setCommandListener(this);
   }

   public void n() {
      if (this.c.size() == 0) {
         super.a.a((Displayable)this, true);
         if (this.a == 15) {
            ay var1 = new ay(super.a);
            if (this.z == 1) {
               if (super.a instanceof l && ((l)super.a).a.a.b != 1L) {
                  var1.a("Вопрос", "В дневнике нет сообщений. Хочешь создать новую тему?", 4, (ai)null, true);
               } else {
                  var1.a("Вопрос", "В форуме нет сообщений. Хочешь создать новую тему?", 4, (ai)null, true);
               }
            } else if (this.z == 2) {
               var1.a("Внимание", "В дневнике нет сообщений. Новые темы может создавать только владелец дневника", 2, (ai)null, true);
            } else if (this.z == 3) {
               var1.a("Внимание", "В дневнике нет сообщений. Новые темы могут создавать только друзья владельца  дневника", 2, (ai)null, true);
            } else if (this.z == 4) {
               var1.a("Вопрос", "Владелец запретил тебе создавать новые темы.", 2, (ai)null, true);
            }

            var1.setCommandListener(this);
         } else {
            this.a((String)this.c, (Displayable)null);
         }
      } else {
         this.g();
      }

   }

   public void a(Vector var1) {
      boolean var2 = false;
      Vector var4 = null;
      this.c = var1;
      Enumeration var6 = var1.elements();

      while(var6.hasMoreElements()) {
         var4 = (Vector)var6.nextElement();
         if (var4.size() > 3) {
            if (var4.elementAt(3) instanceof Byte) {
               byte var5 = (Byte)var4.elementAt(3);
               if (var4.size() > 5) {
                  byte var7 = -1;
                  if ((Integer)var4.elementAt(5) > 0) {
                     var7 = 13;
                  } else if ((Boolean)var4.elementAt(4)) {
                     var7 = 14;
                  }

                  this.a((String)var4.elementAt(1), (Boolean)var4.elementAt(2) ? var5 : 12, var7, -1);
               } else if (this.a == 16) {
                  super.h = false;
                  this.a(var5, (String)var4.elementAt(1));
               } else {
                  this.a((String)var4.elementAt(1), var5, false);
               }
            } else {
               super.c = null;
               this.a((String)var4.elementAt(1), -1);
            }
         } else {
            super.c = null;
            this.a((String)var4.elementAt(1), -1);
         }
      }

   }

   public void a(int var1, String var2) {
      Vector var3 = bh.a(var2, super.a.a, super.b - 12 - super.a.d, false);
      int var4 = var3.size();

      for(int var5 = var4 - 1; var5 >= 0; --var5) {
         if (super.b.size() == 100) {
            super.b.removeElementAt(super.b.size() - 1);
         }

         this.a((String)var3.elementAt(var5), var5 == 0 ? var1 : -1, true);
         if (super.o != 0) {
            ++super.o;
         }
      }

      super.b = true;
   }

   public ac a() {
      f var1 = new f();
      Vector var2 = (Vector)this.c.elementAt(this.a());
      var1.b = (Long)var2.elementAt(0);
      var1.n = (String)var2.elementAt(1);
      var1.b = (Byte)var2.elementAt(3);
      if (var2.size() > 6 && var2.elementAt(6) instanceof Boolean) {
         var1.b = (Boolean)var2.elementAt(6);
      }

      return var1;
   }

   public void a(Vector var1, Displayable var2) {
      this.a = var1;
      Enumeration var3 = var1.elements();

      for(short var4 = 0; var4 < var1.size(); ++var4) {
         Vector var5 = (Vector)var1.elementAt(var4);
         byte var6 = (Byte)var5.elementAt(0);
         if (var6 == 89) {
            var2.addCommand(new Command((String)var5.elementAt(1), 2, 25));
         } else if (var6 != 100 && var6 != 105 && var6 != 107 && var6 != 106) {
            var2.addCommand(new Command((String)var5.elementAt(1), 1, 0));
         } else {
            var2.addCommand(new Command((String)var5.elementAt(1), 2, 25));
         }

         if (var6 == 90) {
            this.a = (String)var5.elementAt(2);
         }
      }

   }

   public void g() {
      super.g();
   }

   public int a() {
      return super.a.e / super.a.a;
   }

   public void d(int var1) {
      super.a.e = super.a.a * var1;
   }

   public void commandAction(Command var1, Displayable var2) {
      Enumeration var3 = this.a.elements();
      if (var1 == XChatMidlet.aT) {
         super.a.commandAction(var1, var2);
      } else if (var1 == XChatMidlet.aX && var2 instanceof ay) {
         ay var12 = (ay)var2;
         super.a.commandAction(XChatMidlet.H, this);
      } else {
         XChatMidlet var10001;
         if (var1 == XChatMidlet.Y) {
            var10001 = super.a;
            super.a.commandAction(XChatMidlet.av, this);
         }

         if (var1 == XChatMidlet.q && (var2 instanceof ag || var2 instanceof ay)) {
            super.a.a(super.a, false);
         } else {
            while(var3.hasMoreElements()) {
               Vector var7;
               if (var1 == XChatMidlet.z && var2 instanceof ag) {
                  aw.l();
                  ag var11 = (ag)var2;
                  var7 = this.a();
                  super.a.a.b((long)((int)(Long)var7.elementAt(0)), var11.getString());
                  this.a(super.a.a.a.b, super.a.a.a.n + "\n" + var11.getString());
                  return;
               }

               Vector var6 = (Vector)var3.nextElement();
               if (var1.getLabel().equals((String)var6.elementAt(1))) {
                  byte var5 = (Byte)var6.elementAt(0);
                  if (this.a == 14 && var5 == 88 && this.a != null) {
                     this.a.b();
                     this.a.n();
                  }

                  if (var5 == 89) {
                     var10001 = super.a;
                     super.a.commandAction(XChatMidlet.av, this);
                     return;
                  }

                  if ((var5 == 105 || var5 == 106) && super.a.a) {
                     if (super.a.a != null) {
                        super.a.a((Displayable)super.a.a, true);
                        return;
                     }
                  } else {
                     if (var5 == 100) {
                        System.gc();
                        var10001 = super.a;
                        super.a.commandAction(XChatMidlet.N, this);
                        return;
                     }

                     if (var5 == 9) {
                        System.gc();
                        var10001 = super.a;
                        super.a.commandAction(XChatMidlet.o, this);
                        return;
                     }

                     if (var5 == 113) {
                        var10001 = super.a;
                        super.a.a((Command)XChatMidlet.G, (Displayable)this);
                        return;
                     }

                     if (var5 == 90) {
                        System.gc();
                        var10001 = super.a;
                        super.a.commandAction(XChatMidlet.aM, this);
                        return;
                     }

                     if (var5 == 34) {
                        var10001 = super.a;
                        super.a.commandAction(XChatMidlet.aQ, this);
                        return;
                     }

                     if (var5 == 32) {
                        System.gc();
                        var10001 = super.a;
                        super.a.a((Command)XChatMidlet.t, (Displayable)this);
                     } else if (var5 == 31) {
                        System.gc();
                        var10001 = super.a;
                        super.a.a((Command)XChatMidlet.V, (Displayable)this);
                     } else if (var5 == 57) {
                        System.gc();
                        if ((Byte)var6.elementAt(3) != 2) {
                           var10001 = super.a;
                           super.a.commandAction(XChatMidlet.T, this);
                        }
                     } else {
                        if (var5 == 91) {
                           var10001 = super.a;
                           super.a.commandAction(XChatMidlet.Z, this);
                           return;
                        }

                        Long var8;
                        if (var5 == 49) {
                           var7 = (Vector)this.c.elementAt(this.a());
                           var8 = (Long)var7.elementAt(0);
                           if (super.a.a.a.b.containsKey(var8)) {
                              super.a.a.a.b.remove(var8);
                           }

                           this.a(var5);
                        } else if (var5 == 50) {
                           var7 = (Vector)this.c.elementAt(this.a());
                           var8 = (Long)var7.elementAt(0);
                           if (super.a.a.a.c.containsKey(var8)) {
                              super.a.a.a.c.remove(var8);
                           }

                           this.a(var5);
                        } else {
                           if (var5 != 88 || this.a != 17) {
                              if (var5 == 92) {
                                 System.gc();
                                 var10001 = super.a;
                                 super.a.commandAction(XChatMidlet.at, this);
                                 return;
                              }

                              if (var5 == 78) {
                                 System.gc();
                                 var10001 = super.a;
                                 super.a.commandAction(XChatMidlet.aZ, this);
                                 return;
                              }

                              if (var5 == 96) {
                                 ag var13 = new ag(super.a, false);
                                 var13.setTitle("Сказать");
                                 var13.a(this, "");
                                 return;
                              }

                              if (var5 == 47) {
                                 var7 = this.a();
                                 if (super.a.a.a.a.size() >= 20) {
                                    this.a((String)"Нельзя иметь больше 20 избранных комнат.", (Displayable)null);
                                    return;
                                 }

                                 this.b = this;
                                 if (!super.a.a.a.a.containsKey(var7.elementAt(0))) {
                                    super.a.a.a.a.put(var7.elementAt(0), new Byte((byte)0));
                                    boolean var15 = false;
                                    int var16;
                                    if (this.a == 2) {
                                       var16 = (Integer)var7.elementAt(0);
                                    } else {
                                       var16 = (int)(Long)var7.elementAt(0);
                                    }

                                    if (var16 > 0) {
                                       super.a.a.d((long)var16);
                                       this.a((String)"Комната добавлена в 'Избранное'", (Displayable)null);
                                    } else {
                                       this.a((String)"В избранное можно добавить только комнату", (Displayable)null);
                                    }

                                    return;
                                 }

                                 this.a((String)"Эта комната уже находится в избранном", (Displayable)null);
                                 return;
                              }

                              this.a(var5);
                              break;
                           }

                           var7 = (Vector)this.c.elementAt(this.a());
                           if (super.a instanceof e) {
                              var7.addElement(new Long(super.a.a.a.b));
                           } else if (super.a.a != null) {
                              var7.addElement(new Long(super.a.a.a.b));
                           } else if (super.a.a != null) {
                              var7.addElement(new Long(super.a.a.a.b));
                           } else {
                              long var9;
                              aa var14;
                              if (super.a instanceof aa) {
                                 var14 = (aa)super.a;
                                 if (var14.a == 8) {
                                    var9 = (Long)var14.a().elementAt(2);
                                    var7.addElement(new Long(var9));
                                 } else {
                                    var7.addElement(new Long(super.a.a.a.b));
                                 }
                              } else if (super.a instanceof ay) {
                                 var14 = (aa)((ay)super.a).a;
                                 if (var14.a == 8) {
                                    var9 = (Long)var14.a().elementAt(2);
                                    var7.addElement(new Long(var9));
                                 }
                              } else {
                                 var7.addElement(new Long(super.a.a.a.b));
                              }
                           }

                           this.c.setElementAt(var7, this.a());
                           this.a(var5);
                        }
                     }
                  }

                  if ((Byte)var6.elementAt(3) == a) {
                     if (this.a == 14) {
                        super.a.a("Надо немного подождать...", (String)var6.elementAt(2), this.a);
                     } else {
                        System.out.println("back");
                        super.a.a("Надо немного подождать...", (String)var6.elementAt(2), this);
                     }
                     break;
                  } else if ((Byte)var6.elementAt(3) == b) {
                     this.a((String)((String)var6.elementAt(2)), (Displayable)null);
                     break;
                  } else if ((Byte)var6.elementAt(3) == e) {
                     var10001 = super.a;
                     super.a.commandAction(XChatMidlet.av, this);
                     break;
                  } else if ((Byte)var6.elementAt(3) == c) {
                     this.m();
                     if (var6.elementAt(2) != null) {
                        this.a((String)((String)var6.elementAt(2)), this);
                     }
                     break;
                  } else if ((Byte)var6.elementAt(3) == d) {
                     super.a.a("Надо немного подождать...", (String)var6.elementAt(2), super.a);
                     break;
                  }
               }
            }

         }
      }
   }

   public void a(byte var1) {
      Vector var2 = new Vector();
      var2.addElement(new Byte(var1));
      var2.addElement(this.a);
      var2.addElement(this.c.elementAt(this.a()));
      var2.addElement(new Integer(this.z));
      if (this.a == 13 || this.a == 12) {
         var2.addElement(new Boolean(super.a.a));
      }

      aw.a.a(new a((byte)89, var2));
      if (var1 == 40) {
         XChatMidlet.a.a("Надо немного подождать...", "Сейчас, подожди - загружаю список тем", super.a);
         Vector var3 = new Vector();
         var3.addElement(new Long(this.b));
         var3.addElement(new Long((long)this.z));
         var3.addElement(new Byte((byte)1));
         aw.a.a(new a((byte)60, var3));
      } else if (var1 == 48) {
         XChatMidlet.a.a("Надо немного подождать...", "Сейчас быстренько загружаю комнаты..", super.a);
         XChatMidlet.a.a.c();
      } else if (var1 == 88) {
         super.a.a("Надо немного подождать...", "Передача данных", this);
      }

   }

   public void m() {
      this.c.removeElementAt(this.a());
      if (this.c.size() == 0) {
         if (this.z == 0) {
            XChatMidlet var10001 = super.a;
            super.a.a((Command)XChatMidlet.av, (Displayable)this);
         } else {
            this.a((byte)63);
            super.a.a("Надо немного подождать...", "Передача данных", this);
         }
      } else {
         this.b();
         this.a(this.c);
      }

   }

   public void a(String var1, Displayable var2) {
      ay var3 = new ay(super.a);
      if (var2 != null) {
         var3.a("Внимание", var1, 2, (ai)null, true);
      } else if (this.b == null) {
         var3.a("Внимание", var1, 2, (ai)null, true);
      } else {
         var3.a("Внимание", var1, 2, (ai)null, true);
      }

   }

   public Vector a() {
      return (Vector)this.c.elementAt(this.a());
   }

   public void k() {
      if (!this.k) {
         super.k();
      }
   }
}
