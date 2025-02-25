import java.util.Hashtable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import xchat.XChatMidlet;

public class y extends ay implements ai {
   public Hashtable a;
   public XChatMidlet a;
   public t a;
   private int t;
   private int q;
   public static av a;
   public int l;
   public int j;
   public static ac a;
   public boolean e = false;

   public void addCommand(Command var1) {
      if (this.a == null) {
         this.a = new Hashtable();
      }

      super.addCommand(var1);
   }

   public void removeCommand(Command var1) {
      super.removeCommand(var1);
   }

   public void a(Graphics var1) {
      var1.setClip(0, super.k, super.b, super.r);

      for(int var2 = 0; var2 < super.b; var2 += super.b.b) {
         super.b.a(3, var2, super.k, var1);
      }

      if (!(this instanceof ab) && !(this instanceof au)) {
         if (this.a.a.b && (!(this instanceof aa) || this instanceof aa && ((aa)this).a != 8)) {
            if (this.q % 2 == 0 || this.t != 0) {
               a.a(1, 0, super.f - 8, var1);
            }
         } else if (this.a.a.a.size() != 0) {
            if (this.q % 2 == 0) {
               a.a(5, 0, super.f - 8, var1);
            }
         } else if (this.a.a.b.size() != 0) {
            if (this.q % 2 == 0) {
               a.a(4, 0, super.f - 8, var1);
            }
         } else if (this.l != -1) {
            a.a(this.l, 0, super.f - 8, var1);
         }
      } else if (this.l != -1) {
         a.a(this.l, 0, super.f - 8, var1);
      }

      super.a.a(var1);
      int var3 = this.a.a();
      this.q += var3;
      if (this.q > 8) {
         this.q = 0;
         ++this.t;
         if (this.t > 1) {
            this.t = 0;
         }
      }

   }

   public y(XChatMidlet var1) {
      super(var1);
      super.y = super.f - super.r;
      this.a = var1;
      this.a = new t(200);
      if (a == null) {
         a = new av("/icons.png", 21, 8, 8);
      }

      super.r = 10;
      super.b = this.getWidth();
      super.f = this.getHeight();
      super.g = 23;
      super.w = super.b - super.g - 10;
      super.k = super.f - super.r;
      super.v = super.b;
      this.setCommandListener(var1);
   }

   public void b(int var1) {
   }

   public void a(int var1) {
   }

   public void keyPressed(int var1) {
      boolean var2 = false;
      int var3;
      switch(var1) {
      case 35:
      case 42:
         var3 = 9;
         break;
      case 53:
         var3 = 8;
         break;
      default:
         var3 = this.getGameAction(var1);
      }

      switch(var3) {
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
         this.e = true;
      default:
         this.b(var3);
         if (this.e) {
            this.a((Displayable)this);
            this.e = false;
         }

         super.keyPressed(var1);
      }
   }

   public void keyReleased(int var1) {
      super.keyReleased(var1);
      boolean var2 = false;
      int var3;
      switch(var1) {
      case 35:
      case 42:
         var3 = 9;
         break;
      case 53:
         var3 = 8;
         break;
      default:
         var3 = this.getGameAction(var1);
      }

      this.a(var3);
   }

   public void a(Displayable var1) {
      if (this instanceof ab) {
         this.commandAction(XChatMidlet.U, var1);
      } else if (this.a.a.a.size() != 0) {
         a = (ac)this.a.a.a.elementAt(0);
         this.a.a.a.removeElementAt(0);
         ay var2 = new ay(this.a);
         var2.a("Вопрос", a.n + " приглашает тебя в свою комнату. Принять приглашение?", 4, this, true);
      } else if (this.a.a.b.size() != 0) {
         p var5 = (p)this.a.a.b.elementAt(0);
         this.a.a.b.removeElementAt(0);
         a = var5.a;
         ay var3 = new ay(this.a);
         String var4 = null;
         if (var5.a == 2) {
            var4 = "В чат твоей комнаты зашёл житель " + a.n;
         } else if (var5.a == 1) {
            var4 = "Житель '" + a.n + " подключился к CiTY!";
         } else if (var5.a == 3) {
            var4 = "Житель '" + a.n + "' принял твоё приглашение";
         } else if (var5.a == 4) {
            var4 = "Житель '" + a.n + "' отклонил твоё приглашение";
         }

         var3.a("Информация", var4, 2, (ai)null, true);
         var3.setCommandListener(this.a);
         var3.addCommand(XChatMidlet.D);
      } else if (var1 instanceof am) {
         if (((aq)var1).b instanceof aa) {
            ((aa)((aq)var1).b).commandAction(XChatMidlet.U, var1);
         } else {
            this.a.commandAction(XChatMidlet.U, var1);
         }
      } else if (!(var1 instanceof ax) && !(var1 instanceof h)) {
         if (var1 instanceof l) {
            this.a.commandAction(XChatMidlet.aA, var1);
         } else if (var1 instanceof v) {
            this.a.commandAction(XChatMidlet.ak, var1);
         } else if (var1 instanceof aa) {
            if (((aa)var1).a == 8) {
               ((aa)var1).commandAction(XChatMidlet.ae, var1);
            } else if (((aa)var1).a != 5 && ((aa)var1).a != 7 && ((aa)var1).a != 6 && ((aa)var1).a != 19 && ((aa)var1).a != 1 && ((aa)var1).a != 22) {
               ((aa)var1).commandAction(XChatMidlet.U, var1);
            } else {
               ((aa)var1).commandAction(XChatMidlet.D, var1);
            }
         } else if (super.a != null) {
            super.a.commandAction(XChatMidlet.U, var1);
         }
      } else {
         this.a.commandAction(XChatMidlet.H, var1);
      }

   }

   public void a(String var1) {
      this.b(var1);
      this.a.a();
      if (!this.a.b) {
         XChatMidlet var10000;
         if (this instanceof aa) {
            var10000 = this.a;
            if (XChatMidlet.b instanceof aa) {
               XChatMidlet var10003 = this.a;
               this.a.a((Displayable)this, ((aa)this).z >= ((aa)XChatMidlet.b).z);
               return;
            }
         }

         if (this instanceof aa) {
            var10000 = this.a;
            if (XChatMidlet.b instanceof ae) {
               this.a.a((Displayable)this, true);
               return;
            }
         }

         if (this instanceof as) {
            var10000 = this.a;
            if (XChatMidlet.b instanceof ax) {
               this.a.a((Displayable)this, true);
               return;
            }
         }

         this.a.a((Displayable)this, this instanceof h);
      }

   }

   public void b(String var1) {
      super.a.a(var1, super.g, super.k + 2, super.w, this.a.a);
   }

   public void h() {
      this.a.a("Надо немного подождать...", "Загружается карта", this);
      this.a.e = true;
      this.a.a.h(a.b);
   }

   public void j() {
      this.a.a((Displayable)this, true);
      this.a.a.a(a.b);
   }
}
