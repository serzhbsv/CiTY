package xchat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;

public class XChatMidlet extends MIDlet implements CommandListener {
   public Object a;
   public boolean a = true;
   public boolean d = false;
   public static final Command l = new Command("Назначить", 1, 5);
   public static final Command c = new Command("Кто входил?", 1, 4);
   public static final Command y = new Command("след.", 1, 3);
   public static final Command a = new Command("пред.", 1, 4);
   public static final Command aT = new Command("Меню", 1, 2);
   public static final Command ai = new Command("К Жителю", 1, 3);
   public static final Command N = new Command("Назад", 2, 28);
   public static final Command E = new Command("В начало", 2, 28);
   public static final Command aE = new Command("Выход", 7, 31);
   public static final Command aL = new Command("Регистрация", 1, 4);
   public static final Command g = new Command("Далее", 1, 3);
   public static final Command aP = new Command("Восстановить пароль", 1, 6);
   public static final Command az = new Command("Поднять анкету", 1, 7);
   public static final Command aC = new Command("Поднять рейтинг", 1, 7);
   public static final Command aU = new Command("Вход", 1, 3);
   public static final Command aO = new Command("Вход", 1, 5);
   public static final Command aM = new Command("Помощь", 1, 19);
   public static final Command U = new Command("Выбрать", 1, 4);
   public static final Command i = new Command("Ещё раз", 1, 7);
   public static final Command av = new Command("Назад", 2, 27);
   public static final Command ao = new Command("Назад", 1, 27);
   public static final Command j = new Command("В город", 1, 6);
   public static final Command u = new Command("К комнатам", 2, 20);
   public static final Command Q = new Command("В город", 2, 20);
   public static final Command aV = new Command("Кто здесь?", 1, 4);
   public static final Command H = new Command("Сказать", 1, 1);
   public static final Command z = new Command("Отправить", 4, 6);
   public static final Command al = new Command("Купить", 4, 6);
   public static final Command D = new Command("Паспорт", 1, 5);
   public static final Command S = new Command("Мой паспорт", 1, 9);
   public static final Command b = new Command("Враги", 1, 17);
   public static final Command ax = new Command("Друзья", 1, 16);
   public static final Command L = new Command("Моя комната", 1, 15);
   public static final Command ac = new Command("Загрузить фото", 1, 4);
   public static final Command p = new Command("Моё фото", 1, 4);
   public static final Command aY = new Command("Сохранить", 1, 5);
   public static final Command aI = new Command("Удалить", 1, 7);
   public static final Command t = new Command("Сделать врагом", 1, 9);
   public static final Command V = new Command("Сделать другом", 1, 8);
   public static final Command o = new Command("Письмо", 1, 7);
   public static final Command Z = new Command("Тех. поддержка", 1, 21);
   public static final Command ap = new Command("Письма", 1, 2);
   public static final Command w = new Command("Удалить всё", 1, 6);
   public static final Command aX = new Command("Да", 1, 3);
   public static final Command Y = new Command("OK", 4, 3);
   public static final Command q = new Command("Нет", 3, 4);
   public static final Command ae = new Command("Читать", 1, 4);
   public static final Command as = new Command("Снять комнату", 1, 13);
   public static final Command R = new Command("Комнаты", 1, 14);
   public static final Command aK = new Command("Комнаты", 1, 4);
   public static final Command aa = new Command("Чат здания", 1, 3);
   public static final Command O = new Command("Общий чат", 1, 3);
   public static final Command aA = new Command("Чат комнаты", 1, 1);
   public static final Command ak = new Command("Искать жителей", 1, 11);
   public static final Command aB = new Command("Кто онлайн?", 1, 4);
   public static final Command aG = new Command("Кто онлайн?", 1, 4);
   public static final Command ag = new Command("Встречи", 1, 11);
   public static final Command ad = new Command("Искать комнаты", 1, 12);
   public static final Command I = new Command("Искать", 1, 4);
   public static final Command af = new Command("Аватар", 1, 3);
   public static final Command x = new Command("Аватар", 1, 4);
   public static final Command aw = new Command("Пригласить", 1, 10);
   public static final Command k = new Command("Фотогалерея", 1, 4);
   public static final Command r = new Command("Следующая", 1, 24);
   public static final Command F = new Command("Предыдущая", 1, 24);
   public static final Command X = new Command("Комната", 1, 4);
   public static final Command ah = new Command("Настройки", 1, 10);
   public static final Command ay = new Command("Владелец", 1, 5);
   public static final Command B = new Command("Ответить", 1, 7);
   public static final Command ab = new Command("С цитатой", 1, 8);
   public static final Command aH = new Command("Фотогалерея", 1, 5);
   public static final Command aS = new Command("Избранное", 1, 5);
   public static final Command aN = new Command("В Избранное", 1, 8);
   public static final Command h = new Command("Удалить", 1, 4);
   public static final Command aD = new Command("TOP парней", 1, 8);
   public static final Command e = new Command("TOP девушек", 1, 7);
   public static final Command f = new Command("TOP комнат", 1, 9);
   public static final Command ar = new Command("TOP чатов", 1, 10);
   public static final Command d = new Command("Форум", 1, 6);
   public static final Command W = new Command("Дневник", 1, 6);
   public static final Command T = new Command("Новая тема", 1, 3);
   public static final Command P = new Command("Отправить", 1, 3);
   public static final Command n = new Command("Ответить", 1, 3);
   public static final Command aq = new Command("Жители", 1, 10);
   public static final Command au = new Command("Жители онлайн", 1, 9);
   public static final Command K = new Command("Новости", 1, 14);
   public static final Command am = new Command("История", 1, 8);
   public static final Command M = new Command("sms-викторина", 1, 12);
   public static final Command v = new Command("Стоимость услуг", 1, 14);
   public static final Command aJ = new Command("МЕГАФОН", 1, 2);
   public static final Command s = new Command("БИЛАЙН", 1, 2);
   public static final Command aj = new Command("МТС", 1, 2);
   public static final Command aQ = new Command("Кошелек", 1, 7);
   public static final Command at = new Command("В Лидеры", 1, 5);
   public static final Command aZ = new Command("Ставка", 1, 2);
   public static final Command an = new Command("Лидеры", 1, 6);
   public static final Command aF = new Command("Подарок", 1, 2);
   public static final Command aR = new Command("Подарок", 1, 2);
   public static final Command J = new Command("Подарок", 1, 2);
   public static final Command m = new Command("Стать лидером", 1, 2);
   public static final Command A = new Command("Стать лидером", 1, 2);
   public static final Command G = new Command("Отправить SMS", 1, 2);
   public static final Command aW = new Command("Лучшие", 1, 8);
   public static final Command C = new Command("Операторы", 1, 22);
   public .ae a;
   public .as a = new .as(this);
   public .ax a;
   public .h a;
   public .g a;
   public static Display a;
   public static XChatMidlet a = null;
   public static Displayable b;
   public Vector a;
   public .ah a;
   public boolean g;
   public Displayable c;
   public static .av b;
   public static .av d;
   public static .av a;
   public static .av c;
   public static .av e;
   public static Image a;
   public .z a;
   public .ap a;
   public String c;
   public boolean c;
   public boolean e;
   public boolean f = false;
   public boolean b;
   public static String a;
   public Displayable a;
   public static XChatMidlet b;
   public static String b = "";
   public static int a;
   public .aq a;

   public void a(Displayable var1, boolean var2) {
      Displayable var3;
      if (var2) {
         var3 = Display.getDisplay(this).getCurrent();
         if (var3 instanceof .ae) {
            .aw.a((Displayable)var1, (Displayable)this.c);
         } else {
            .aw.a((Displayable)var1, (Displayable)var3);
         }
      }

      try {
         var3 = b;
         if (var3 != var1) {
            b = null;
         }

         if (var3 != var1 && var3 != null && var3 instanceof .ay) {
            ((.ay)var3).a();
         }

         if (var3 != var1) {
            if (var1 instanceof .ay) {
               if (var1 instanceof .aa && ((.aa)var1).a == 14) {
                  var1 = ((.aa)var1).a;
               } else {
                  ((.ay)var1).a = true;
                  ((.ay)var1).b = true;
                  ((.ay)var1).c();
               }
            }

            a.setCurrent((Displayable)var1);
            b = (Displayable)var1;
         }

         if (var1 instanceof .ay) {
            if (var3 == var1) {
               ((.ay)var1).a = true;
               ((.ay)var1).b = true;
            } else {
               ((.ay)var1).c();
            }

            ((.ay)var1).a = true;
            ((.ay)var1).b = true;
            ((.ay)var1).repaint();
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public void a(String var1, String var2, Displayable var3) {
      this.c = var3;
      this.a = new .ae(this);
      this.a.a(var1, var2, var3);
   }

   public Displayable a() {
      Displayable var1 = null;
      if (this.a != null) {
         this.a.a();
         this.a = null;
      }

      var1 = this.c;
      return var1;
   }

   public XChatMidlet() {
      a = this;
   }

   private void g() {
      b = new .av("/user.png", 26, 26, 12);
      a = .aw.a("/start.png");
      d = new .av("/usersmall.png", 12, 12, 12);
      a = new .av("/dlg.png", 45, 10, 4);
      e = new .av("/scrollv.png", 6, 8, 4);
      c = new .av("/scrollh.png", 8, 6, 4);
   }

   public void startApp() {
      if (this.f) {
         this.f = false;
      } else {
         b = this;
         this.a = new .ap(this);
         this.a.a();
         a = Display.getDisplay(this);
         this.a = null;
         if ((a = this.getAppProperty("addr")) == null) {
            a = "213.59.0.204";
         }

         this.g();
         this.a = new .z("/basic.png");
         this.a = new .ah(this);
         this.a = new .ax(this);
         this.a = new Vector(10);
         this.c = false;
         String var2 = this.getAppProperty("login");
         a = 1;
         .f var1;
         if (var2 != null) {
            var1 = new .f();
            var1.n = var2;
            var1.b(this.getAppProperty("pwd"));
            this.g = false;
         } else {
            var1 = this.a();
         }

         if (!this.g) {
            this.a(var1 != null ? .w.h : .w.a);
         } else {
            this.a((Displayable)(new .w(this, .w.h)), (.f)var1);
         }

      }
   }

   public void a(Displayable var1, .f var2) {
      .q var3 = new .q(this);
      var3.a(var1, var2);
   }

   private void a(int var1) {
      .w var2 = new .w(this, var1);
      if (var1 == .w.a) {
         var2.a(true, (.f)null, true);
      } else {
         this.a((Displayable)var2, false);
      }

   }

   public void a() {
      if (this.a.a == null) {
         .w var1 = new .w(this, .w.h);
         this.a((Displayable)var1, true);
      } else {
         .v var2 = new .v(this);
         var2.b();
         this.c = var2;
      }

   }

   public void commandAction(Command var1, Displayable var2) {
      if (!this.c) {
         this.c = true;
         this.a(var1, var2);
      }
   }

   public void a(Command var1, Displayable var2) {
      this.d = false;

      try {
         .ay var3;
         if (var1 == aT) {
            var3 = (.ay)var2;
            .ab var4 = new .ab(this, var3.a);
            var4.b(var2);
         }

         if (var1 == aE) {
            var3 = new .ay(this);
            var3.addCommand(aX);
            var3.addCommand(q);
            var3.a(new .ai(this) {
               private final XChatMidlet a;

               public {
                  this.a = var1;
               }

               public void h() {
                  this.a.destroyApp(false);
                  this.a.notifyDestroyed();
               }

               public void j() {
                  this.a.a();
               }
            });
            var3.a("Вопрос", "Ты уверен, что хочешь покинуть CiTY?", 1, var3.a, true);
         } else if (var1 == aM) {
            this.b(var2);
         } else if (var1 == aH) {
            this.a("Сожалею, но твой телефон не поддерживает загрузку фото. Однако выход есть - ты можешь загрузить фото в свой паспорт на интернет-сайте CiTY по адресу http://city1.ru", var2, true);
         } else if (var1 == c) {
            this.a("Надо немного подождать...", "Сейчас, сейчас! Загружаю имена жителей...", var2);
            this.a.d();
         } else if (var1 == K) {
            this.a("Надо немного подождать...", "Немного терпения… Загружаю новости", var2);
            this.a.f();
         } else if (var1 == aW) {
            this.a("Надо немного подождать...", "Передача данных", var2);
            this.a.a();
         } else {
            .l var10;
            if (var1 == k) {
               this.a("Надо немного подождать...", "Загружается фото", var2);
               if (var2 instanceof .h) {
                  this.a.f(((.h)var2).a.b);
               } else {
                  var10 = (.l)var2;
                  if (var10.a.a > 0) {
                     this.a.j((long)var10.a.d);
                  } else {
                     this.a.f(var10.a.a.b);
                  }
               }
            } else if (var1 != y && var1 != a) {
               if (var1 != aD && var1 != e) {
                  if (var1 != f && var1 != ar) {
                     if (var1 == p) {
                        this.a("Надо немного подождать...", "Загружается фото", var2);
                        this.a.b(this.a.a.b);
                     } else if (var1 != N && var1 != E) {
                        if (var1 != aU && var1 != aO) {
                           if (var1 == i) {
                              this.a(.q.a, .q.a);
                           } else if (var1 == aY) {
                              if (((.w)var2).b()) {
                                 this.a.d(((.w)var2).a());
                                 .v var17 = new .v(this);
                                 var17.b();
                                 this.a((String)"Паспорт сохранен.\nВыберите 'ОК' для продолжения.", (Displayable)var17, false);
                              }
                           } else {
                              .bd var23;
                              if (var1 == aN) {
                                 if (var2 instanceof .e) {
                                    .e var20 = (.e)var2;
                                    if (this.a.a.a.size() >= 20) {
                                       this.a("Нельзя иметь больше 20 избранных комнат.", var2, true);
                                    } else {
                                       this.a.a((String)var20.d.elementAt(1), (String)var20.d.elementAt(0));
                                       this.a("Комната добавлена в 'Избранное'", var2, false);
                                    }
                                 } else if (var2 instanceof .l) {
                                    var23 = ((.l)var2).a;
                                    if (var23 == null) {
                                       this.a("В избранное можно добавить только комнату", var2, true);
                                    } else if (this.a.a.a.size() >= 20) {
                                       this.a("Нельзя иметь больше 20 избранных комнат.", var2, true);
                                    } else if (!this.a.a.a.containsKey(new Long((long)var23.d))) {
                                       this.a.d((long)var23.d);
                                       this.a("Комната добавлена в 'Избранное'", var2, false);
                                    }
                                 }
                              } else if (var1 == aS) {
                                 this.a("Надо немного подождать...", "Сейчас быстренько загружаю комнаты..", b);
                                 this.a.c();
                              } else {
                                 Vector var14;
                                 Vector var24;
                                 if (var1 != List.SELECT_COMMAND && var1 != U) {
                                    if (var1 == ag) {
                                       if (var2 instanceof .v) {
                                          .k var25 = new .k(this, 1);
                                          var25.a(var2);
                                       }
                                    } else {
                                       Vector var5;
                                       .aa var15;
                                       .ag var27;
                                       if (var1 == ab) {
                                          if (var2 instanceof .ay) {
                                             var27 = new .ag(this, false);
                                             if (((.ay)var2).a instanceof .aa) {
                                                var15 = (.aa)((.ay)var2).a;
                                                var5 = var15.a();
                                                if (var5 == null) {
                                                   var15.d(0);
                                                   var5 = var15.a();
                                                }

                                                String var6 = "";

                                                short var7;
                                                for(var7 = 0; var7 < ((.ay)var2).a.length - 1; ++var7) {
                                                   var6 = var6 + ((.ay)var2).a[var7] + "\n";
                                                }

                                                var6 = var6 + ((.ay)var2).a[var7];
                                                if (((String)var5.elementAt(1)).startsWith("Present: ")) {
                                                   var6 = "";
                                                } else {
                                                   var6 = ">" + (String)var5.elementAt(4) + "\n" + var6 + "\n>" + this.a.a.n + "\n";
                                                }

                                                var27.a(var15, var6);
                                             }
                                          }
                                       } else if (var1 == B) {
                                          if (var2 instanceof .ay) {
                                             var27 = new .ag(this, false);
                                             if (((.ay)var2).a instanceof .aa) {
                                                var15 = (.aa)((.ay)var2).a;
                                                var27.a(var15, "");
                                             }
                                          }
                                       } else if (var1 != av && var1 != u && var1 != Q && var1 != j) {
                                          .az var37;
                                          if (var1 != T && var1 != o && var1 != Z && var1 != H && var1 != n) {
                                             if (var1 == P) {
                                                var37 = (.az)var2;
                                                if (var37.b().length() != 0 && var37.a().length() != 0) {
                                                   var14 = new Vector();
                                                   var14.addElement(new Byte((byte)57));
                                                   var14.addElement(new Byte((byte)15));
                                                   var14.addElement(new Long(var37.a));
                                                   var14.addElement(var37.a());
                                                   var14.addElement(var37.b());
                                                   var14.addElement(new Boolean(true));
                                                   .aw.a.a(new .a((byte)89, var14));
                                                   this.a("Надо немного подождать...", "создаю для тебя новую тему...", var37.a);
                                                   .r var18 = new .r();
                                                   var18.d = (int)var37.a;
                                                } else {
                                                   this.a("Введи тему и текст сообщения", var2, false);
                                                }
                                             } else {
                                                Object var39;
                                                if (var1 != z && var1 != al) {
                                                   if (var1 == aV) {
                                                      this.a(var2);
                                                   } else {
                                                      .aa var41;
                                                      if (var1 == Y) {
                                                         if (var2 instanceof .ay) {
                                                            if (((.ay)var2).a instanceof .aa) {
                                                               var41 = (.aa)((.ay)var2).a;
                                                               if (var41.a == 5) {
                                                                  this.a((Command)an, (Displayable)(new .v(this)));
                                                               } else if (var41.a == 14) {
                                                                  this.a((Displayable)var41.a, true);
                                                               } else if (var41.c.size() > 0) {
                                                                  .aw.a(var2, var1);
                                                               } else {
                                                                  this.a(var41.a, false);
                                                               }
                                                            } else {
                                                               .aw.a(var2, var1);
                                                            }
                                                         }
                                                      } else if (var1 == D) {
                                                         if (var2 instanceof .ay) {
                                                            this.a(.y.a, ((.ay)var2).a);
                                                         }
                                                      } else if (var1 == ay) {
                                                         var23 = null;
                                                         if (var2 instanceof .l) {
                                                            var23 = ((.l)var2).a;
                                                         }

                                                         this.a(var23.a, var2);
                                                      } else if (var1 != aq && var1 != au) {
                                                         if (var1 == am) {
                                                            this.a("Надо немного подождать...", "Передача данных", var2);
                                                            var24 = new Vector();
                                                            var24.addElement(new Byte((byte)37));
                                                            var24.addElement(new Byte((byte)0));
                                                            .aw.a.a(new .a((byte)89, var24));
                                                         } else if (var1 != M && var1 != v) {
                                                            if (var1 == C) {
                                                               this.a("Надо немного подождать...", "Передача данных", var2);
                                                               var24 = new Vector();
                                                               var24.addElement(new Byte((byte)34));
                                                               var24.addElement(new Byte((byte)3));
                                                               .aw.a.a(new .a((byte)89, var24));
                                                            } else {
                                                               .h var43;
                                                               if (var1 == G) {
                                                                  .ag var26;
                                                                  if (var2 instanceof .h) {
                                                                     var43 = (.h)var2;
                                                                     if (var43.a.b) {
                                                                        var26 = new .ag(this, "SMS Стоимость 1 SMS=" + .an.e + " R", 8196, true);
                                                                        var26.a = ((.h)var2).a.b;
                                                                        var26.a(var2, "");
                                                                     } else {
                                                                        this.a("Житель заблокировал приём входящих SMS или не зарегистрировал номер своего телефона в CiTY", b, false);
                                                                     }
                                                                  } else if (var2 instanceof .aa) {
                                                                     var41 = (.aa)var2;
                                                                     if (var41.a().b == this.a.a.b) {
                                                                        this.a("Нельзя отправить письмо самому себе.", b, false);
                                                                     } else if (var41.a().b) {
                                                                        var26 = new .ag(this, "SMS Стоимость 1 SMS=" + .an.e + " R", 8196, true);
                                                                        var26.a = var41.a().b;
                                                                        var26.a(var2, "");
                                                                     } else {
                                                                        this.a("Житель заблокировал приём входящих SMS или не зарегистрировал номер своего телефона в CiTY", b, false);
                                                                     }
                                                                  } else {
                                                                     var27 = (.ag)((.ay)var2).a;
                                                                     this.a.a(var27.a, var27.getString());
                                                                     this.a(var27.a, true);
                                                                  }
                                                               } else if (var1 == t) {
                                                                  var39 = null;
                                                                  if (var2 instanceof .h) {
                                                                     var39 = ((.h)var2).a;
                                                                  } else if (var2 instanceof .aa) {
                                                                     var39 = ((.aa)var2).a();
                                                                  }

                                                                  if (((.ac)var39).b == this.a.a.b) {
                                                                     this.a("Нельзя сделать себя врагом.", var2, true);
                                                                  } else if (!this.a.a.c.containsKey(new Long(((.ac)var39).b)) && this.a.a.b != ((.ac)var39).b) {
                                                                     if (this.a.a.c.size() >= 20) {
                                                                        this.a("У тебя не может быть больше 20 врагов.", var2, true);
                                                                     } else {
                                                                        this.a.a.c.put(new Long(((.ac)var39).b), var39);
                                                                        this.a.a.b.remove(new Long(((.ac)var39).b));
                                                                        this.a.e(((.ac)var39).b);
                                                                        if (!(var2 instanceof .aa) || ((.aa)var2).a != 6) {
                                                                           this.a("Житель стал твоим врагом.\nТеперь он не сможет отправлять тебе письма и приглашения.", b, false);
                                                                        }
                                                                     }
                                                                  } else if (this.a.a.c.containsKey(new Long(((.ac)var39).b))) {
                                                                     this.a("Житель уже является твоим врагом", b, false);
                                                                  }
                                                               } else if (var1 == V) {
                                                                  var39 = null;
                                                                  if (var2 instanceof .aa) {
                                                                     var39 = ((.aa)var2).a();
                                                                  } else if (var2 instanceof .h) {
                                                                     var39 = ((.h)var2).a;
                                                                  }

                                                                  if (((.ac)var39).b == this.a.a.b) {
                                                                     this.a("Нельзя сделать себя другом.", var2, true);
                                                                  } else if (!this.a.a.b.containsKey(new Long(((.ac)var39).b)) && this.a.a.b != ((.ac)var39).b) {
                                                                     this.a.a.b.put(new Long(((.ac)var39).b), var39);
                                                                     this.a.a.c.remove(new Long(((.ac)var39).b));
                                                                     this.a.c(((.ac)var39).b);
                                                                     if (!(var2 instanceof .aa) || ((.aa)var2).a != 7) {
                                                                        this.a("Житель стал твоим другом.\nЕму отправлено уведомление.", b, false);
                                                                     }
                                                                  } else if (this.a.a.b.containsKey(new Long(((.ac)var39).b))) {
                                                                     this.a("Житель уже является твоим другом", b, false);
                                                                  }
                                                               } else if (var1 == aw) {
                                                                  if (this.a.a.a == null) {
                                                                     this.a("\nТы не можешь приглашать жителей. \nУ тебя нет своей комнаты!\nНаправляйся в Жилой квартал и выбери 'Снять комнату' в меню.", var2, true);
                                                                  } else {
                                                                     .f var44 = null;
                                                                     if (var2 instanceof .h) {
                                                                        var44 = ((.h)var2).a;
                                                                     }

                                                                     if (var44.b == this.a.a.b) {
                                                                        this.a("Самого себя вообще-то пригласить нельзя. Да и как ты это себе представляешь?", var2, true);
                                                                     } else if (var44.d) {
                                                                        this.a.i(var44.b);
                                                                     } else {
                                                                        this.a("Невозможно пригласить жителя, потому что его сейчас нет в CiTY.", var2, true);
                                                                     }
                                                                  }
                                                               } else if (var1 == S) {
                                                                  var24 = new Vector();
                                                                  this.a("Надо немного подождать...", "Загрузка данных", var2);
                                                                  var24.addElement(new Byte((byte)118));
                                                                  .aw.a.a(new .a((byte)89, var24));
                                                               } else if (var1 != ax && var1 != b) {
                                                                  .o var45;
                                                                  if (var1 == ah) {
                                                                     var45 = new .o(this, false);
                                                                     var45.a(this.a.a, var2);
                                                                  } else if (var1 == L) {
                                                                     if (this.a.a.a == null) {
                                                                        this.a("У тебя нет своей комнаты!\nНаправляйся в Жилой квартал и выбери 'Снять комнату' в меню.", var2, false);
                                                                     } else {
                                                                        this.a(this.a.a.a.d, var2, 3, true);
                                                                     }
                                                                  } else if (var1 == ap) {
                                                                     .as var46 = new .as(this);
                                                                     var46.a(this.a.a.b, var2, true);
                                                                  } else if (var1 != aB && var1 != aG) {
                                                                     if (var1 == ak) {
                                                                        this.a("Надо немного подождать...", "Загружается форма поиска.", var2);
                                                                        var24 = new Vector();
                                                                        var24.addElement(new Byte((byte)15));
                                                                        .aw.a.a(new .a((byte)120, var24));
                                                                     } else if (var1 == ad) {
                                                                        var45 = new .o(this, true);
                                                                        var45.a((.f)null, var2);
                                                                     } else if (var1 != af && var1 != x) {
                                                                        if (var1 == ai) {
                                                                           if (var2 instanceof .h) {
                                                                              var43 = (.h)var2;
                                                                              this.a(var43.a.a.d, var43, 3, false);
                                                                           }
                                                                        } else if (var1 == X) {
                                                                           if (var2 instanceof .h) {
                                                                              var43 = (.h)var2;
                                                                              this.a(var43.a.a.d, var43, 3, false);
                                                                           }
                                                                        } else if (var1 != aa && var1 != aA && var1 != O) {
                                                                           if (var1 == as) {
                                                                              this.a("Надо немного подождать...", "Подождите, пожалуйста.", var2);
                                                                              if (var2 instanceof .l) {
                                                                                 this.a.d(((.l)var2).a.d);
                                                                              }
                                                                           } else if (var1 != R && var1 != aK) {
                                                                              if (var1 == ac) {
                                                                                 .aw.a(this, var2);
                                                                              } else if (var1 == aC) {
                                                                                 if (this.a.a.c < (long).an.b) {
                                                                                    this.a("Увы, для этого в твоём кошельке недостаточно реалов...", var2, true);
                                                                                 } else {
                                                                                    var3 = new .ay(this);
                                                                                    var3.a(new .ai(this, var3) {
                                                                                       private final .ay a;
                                                                                       private final XChatMidlet a;

                                                                                       public {
                                                                                          this.a = var1;
                                                                                          this.a = var2;
                                                                                       }

                                                                                       public void h() {
                                                                                          Vector var1 = new Vector();
                                                                                          var1.addElement(new Byte((byte)125));
                                                                                          var1.addElement(new Integer(.an.a));
                                                                                          var1.addElement(new Integer(.an.b));
                                                                                          .aw.a.a(new .a((byte)89, var1));
                                                                                          .f var10000 = this.a.a.a;
                                                                                          var10000.c -= (long).an.b;
                                                                                          this.a.a("Надо немного подождать...", "Передача данных", this.a.a);
                                                                                       }

                                                                                       public void j() {
                                                                                          this.a.a(this.a.a, false);
                                                                                       }
                                                                                    });
                                                                                    .aw.a((Displayable)var3, (Displayable)var2);
                                                                                    var3.a(this.a.a.n + "- Платный рейтинг", "Купить " + .an.a + " едениц рейтинга за " + .an.b + " реалов.\nВы согласны?" + "(В твоём кошельке: " + this.a.a.c + " реалов)" + '\n' + "Увеличивает значение твоего рейтинга. Это дороже чем поднять анкету, но такой рейтинг снижается медленно", 4, var3.a, true);
                                                                                 }
                                                                              } else if (var1 == az) {
                                                                                 var3 = new .ay(this);
                                                                                 if (this.a.a.c < (long).an.c) {
                                                                                    this.a("Увы, для этого в твоём кошельке недостаточно реалов...", var2, true);
                                                                                 } else {
                                                                                    var3.a(new .ai(this, var3) {
                                                                                       private final .ay a;
                                                                                       private final XChatMidlet a;

                                                                                       public {
                                                                                          this.a = var1;
                                                                                          this.a = var2;
                                                                                       }

                                                                                       public void h() {
                                                                                          this.a.a("Надо немного подождать...", "Передача данных", this.a.a);
                                                                                          .aw.a.a(new .a((byte)22, new Long(this.a.a.a.b)));
                                                                                       }

                                                                                       public void j() {
                                                                                          this.a.a(this.a.a, false);
                                                                                       }
                                                                                    });
                                                                                    .aw.a((Displayable)var3, (Displayable)var2);
                                                                                    var3.a(this.a.a.n + "- Подняться", "Поднятие рейтинга анкеты стоит " + .an.c + " реалов.\nВы согласны?" + "(В твоём кошельке: " + this.a.a.c + " реалов)", 4, var3.a, true);
                                                                                 }
                                                                              } else if (var1 != d && var1 != W) {
                                                                                 if (var1 == A) {
                                                                                    this.a("Надо немного подождать...", "!!!", b);
                                                                                    .aw.a.a(new .a((byte)91, new Long(this.a.a.b)));
                                                                                 } else if (var1 == aJ) {
                                                                                    var3 = new .ay(this);
                                                                                    var3.a("МЕГАФОН", "Вариант 1:\n___\nПункт настройки: Мегафон\nОписание: Megafon GPRS Internet\nСоединяет с: The Internet\nТочка доступа: internet.msk\nИмя пользователя: gdata\nПароль: gdata\nПервичный DNS: 10.22.10.20\nВторичный DNS: 10.22.10.21\nАдрес IP: Остается пустым\n___\nВариант 2:\n___\nСоздаем новую точку доступа:\nНазвание: Любое\nКанал данных: GPRS\nИмя точки доступа: internet.msk\nИмя пользователя: gdata\nЗапрос пароля: нет\nПароль: gdata\nАутентификация: Обычная\nIP адрес шлюза: 0.0.0.0\nДалее в 'Функциях' открываем 'Доп.параметры'\nIp адрес телефона: Динамический\nПервичный DNS: 10.22.10.20\nВторичный DNS: 10.22.10.21", 2, (.ai)null, true);
                                                                                 } else if (var1 == s) {
                                                                                    var3 = new .ay(this);
                                                                                    var3.a("БИЛАЙН", "Вариант 1:\n___\nПункт настройки: Билайн\nОписание: Beeline GPRS Internet\nСоединяет с: The Internet\nТочка доступа: internet.beeline.ru\nИмя пользователя: beeline\nПароль: beeline\nПервичный DNS: 217.118.66.243\nВторичный DNS: 217.118.66.244\nАдрес IP: Остается пустым\n___\nВариант 2:\n___\nСоздаем новую точку доступа:\nНазвание: Любое\nКанал данных: GPRS\nИмя точки доступа: internet.beeline.ru\nИмя пользователя: Beeline\nЗапрос пароля: нет\nПароль: Beeline\nАутентификация: Обычная\nIP адрес шлюза: 0.0.0.0\nДалее в 'Функциях' открываем 'Доп.параметры'\nIp адрес телефона: Динамический\nПервичный DNS: 217.118.66.243\nВторичный DNS: 217.118.66.244", 2, (.ai)null, true);
                                                                                 } else if (var1 == aj) {
                                                                                    var3 = new .ay(this);
                                                                                    var3.a("МТС", "Вариант 1:\n___\nПункт настройки: МТС\nОписание: MTS GPRS Internet\nСоединяет с: The Internet\nТочка доступа: internet.mts.ru\nИмя пользователя: mts\nПароль: mts\nПервичный DNS: 213.87.0.1\nВторичный DNS: 213.87.1.1\nАдрес IP: Остается пустым\n___\nВариант 2:\n___\nСоздаем новую точку доступа:\nНазвание: Любое\nКанал данных: GPRS\nИмя точки доступа: internet.mts.ru\nИмя пользователя: mts\nЗапрос пароля: нет\nПароль: mts\nАутентификация: Обычная\nIP адрес шлюза: 0.0.0.0\nДалее в 'Функциях' открываем 'Доп.параметры'\nIp адрес телефона: Динамический\nПервичный DNS: 213.87.0.1\nВторичный DNS: 213.87.1.1", 2, (.ai)null, true);
                                                                                 } else if (var1 == aQ) {
                                                                                    this.a("Надо немного подождать...", "Передача данных", b);
                                                                                    var24 = new Vector();
                                                                                    var24.addElement(new Byte((byte)34));
                                                                                    var24.addElement(new Byte((byte)0));
                                                                                    .aw.a.a(new .a((byte)89, var24));
                                                                                 } else {
                                                                                    String var35;
                                                                                    if (var1 == at) {
                                                                                       if (var2 instanceof .ay && !(var2 instanceof .aa) && ((.ay)var2).a != null) {
                                                                                          var2 = ((.ay)var2).a;
                                                                                       }

                                                                                       var3 = new .ay(this);
                                                                                       var3.addCommand(av);
                                                                                       var3.addCommand(aZ);
                                                                                       var35 = this.a.a.a == 0 ? "Ты не учавствуешь в 'Гонке лидеров'. Чтобы сделать ставку на себя - выбери 'Ставка'. Стоимость ставки -" + .an.d + ' ' + " R" : "На тебя в 'Гонке Лидеров' сделано " + this.a.a.a + " ставок. Чтобы добавить ставку - выбери 'Ставка'. Стоимость ставки - " + .an.d + ' ' + " R";
                                                                                       var3.a("Я Лидер", var35, 1, (.ai)null, true);
                                                                                       var3.setCommandListener(this);
                                                                                    } else if (var1 == aZ) {
                                                                                       if (this.a.a.c < (long).an.d) {
                                                                                          (new .ay(this)).a("Внимание", "Увы, для этого в твоём кошельке недостаточно реалов...", 5, (.ai)null, true);
                                                                                       } else {
                                                                                          var3 = new .ay(this);
                                                                                          this.a = var2;
                                                                                          var35 = this.a instanceof .aa ? ((.aa)this.a).a().n : this.a.a.n;
                                                                                          var3.a(new .ai(this) {
                                                                                             private final XChatMidlet a;

                                                                                             public {
                                                                                                this.a = var1;
                                                                                             }

                                                                                             public void h() {
                                                                                                .f var10000;
                                                                                                Long var1;
                                                                                                .ag var2;
                                                                                                .ay var4;
                                                                                                if (this.a.a instanceof .aa) {
                                                                                                   var1 = new Long(((.aa)this.a.a).a().b);
                                                                                                   if (this.a.a.a.b == var1) {
                                                                                                      var2 = new .ag(XChatMidlet.a, "Приветствие лидера", 40, false);
                                                                                                      var2.a(true);
                                                                                                      var2.a((Displayable)this.a.a, this.a.a.a.y);
                                                                                                   } else {
                                                                                                      .aw.a.a(new .a((byte)83, var1));
                                                                                                      var4 = new .ay(XChatMidlet.b);
                                                                                                      var4.a("Внимание", "Ставка принята", 2, (.ai)null, true);
                                                                                                      var10000 = this.a.a.a;
                                                                                                      var10000.c -= (long).an.d;
                                                                                                   }
                                                                                                } else if (this.a.a instanceof .ay) {
                                                                                                   if (((.ay)this.a.a).a instanceof .aa) {
                                                                                                      var1 = new Long(((.aa)((.ay)this.a.a).a).a().b);
                                                                                                      if (this.a.a.a.b == var1) {
                                                                                                         var2 = new .ag(XChatMidlet.a, "Приветствие лидера", 40, false);
                                                                                                         var2.a(true);
                                                                                                         var2.a((Displayable)this.a.a, this.a.a.a.y);
                                                                                                      } else {
                                                                                                         .aw.a.a(new .a((byte)83, var1));
                                                                                                         var4 = new .ay(XChatMidlet.b);
                                                                                                         var4.a("Внимание", "Ставка принята", 2, (.ai)null, true);
                                                                                                         var10000 = this.a.a.a;
                                                                                                         var10000.c -= (long).an.d;
                                                                                                      }
                                                                                                   } else {
                                                                                                      this.a.a((Displayable)this.a.a, false);
                                                                                                      .ag var3 = new .ag(XChatMidlet.a, "Приветствие лидера", 40, false);
                                                                                                      var3.a(true);
                                                                                                      var3.a((Displayable)this.a.a, this.a.a.a.y);
                                                                                                   }
                                                                                                }

                                                                                             }

                                                                                             public void j() {
                                                                                                this.a.a(((.ay)this.a.a).a, false);
                                                                                             }
                                                                                          });
                                                                                          .aw.a((Displayable)var3, (Displayable)var2);
                                                                                          this.a = var3;
                                                                                          var3.a(var35 + "- Ставка", "Ставка на жителя " + var35 + ".\nСтоимость одной ставки - " + .an.d + " реалов.\nВы согласны?" + "(В твоём кошельке: " + this.a.a.c + " реалов)", 4, var3.a, true);
                                                                                       }
                                                                                    } else if (var1 == an) {
                                                                                       var24 = new Vector();
                                                                                       var24.addElement(new Byte((byte)77));
                                                                                       boolean var36 = false;
                                                                                       if (b instanceof .aa) {
                                                                                          var24.addElement(new Integer(((.aa)b).z));
                                                                                       } else {
                                                                                          var24.addElement(new Integer(0));
                                                                                       }

                                                                                       this.a("Надо немного подождать...", "Загружаются имена лидеров", b);
                                                                                       .aw.a.a(new .a((byte)89, var24));
                                                                                    } else if (var1 == aR) {
                                                                                       this.a("Надо немного подождать...", "Загружается список подарков", b);
                                                                                       var24 = new Vector();
                                                                                       var24.addElement(new Byte((byte)80));
                                                                                       if (var2 instanceof .h) {
                                                                                       }

                                                                                       .aw.a.a(new .a((byte)89, var24));
                                                                                    } else if (var1 == J) {
                                                                                       String var48 = "";
                                                                                       if (var2 instanceof .as) {
                                                                                          var48 = ((.s)((.as)var2).c.elementAt(((.as)var2).a())).a;
                                                                                       } else if (var2 instanceof .bb) {
                                                                                          var48 = ((.bb)var2).a().a;
                                                                                       }

                                                                                       this.a("Надо немного подождать...", "Загружается подарок", b);
                                                                                       .aw.a.a(new .a((byte)87, var48));
                                                                                    }
                                                                                 }
                                                                              } else if (var2 instanceof .l) {
                                                                                 var10 = (.l)var2;
                                                                                 this.a((.r)var10.a, (Displayable)var2);
                                                                              } else if (var2 instanceof .h) {
                                                                                 var43 = (.h)var2;
                                                                                 this.a((.r)var43.a.a, (Displayable)var2);
                                                                              }
                                                                           } else {
                                                                              this.a(((.l)var2).a.d, 3, this.a);
                                                                           }
                                                                        } else if (var2 instanceof .l) {
                                                                           this.a(((.l)var2).a, ((.l)var2).C);
                                                                           this.a.a = var2;
                                                                        } else if (var2 instanceof .am) {
                                                                        }
                                                                     } else {
                                                                        .m var47 = (.m)var2;
                                                                        .ao var32 = new .ao(this);
                                                                        .av var42 = b;
                                                                        if (var42 == null) {
                                                                           var42 = d;
                                                                        }

                                                                        var32.a(var42, 12, var47.b, var47, var47, a);
                                                                     }
                                                                  } else {
                                                                     this.a("Надо немного подождать...", "Ищем жителей", var2);
                                                                     this.a.c(0);
                                                                  }
                                                               } else {
                                                                  this.a("Надо немного подождать...", var1 == ax ? "Немного терпения… загружаю имена друзей" : "Спокойствие, только спокойствие…. Сейчас загружу имена твоих любимых врагов...", b);
                                                                  var24 = new Vector();
                                                                  var24.addElement(new Byte((byte)(var1 == ax ? 93 : 94)));
                                                                  var24.addElement(new Byte((byte)-1));
                                                                  var24.addElement(new Long(this.a.a.b));
                                                                  this.a.c(var24);
                                                               }
                                                            }
                                                         } else {
                                                            this.a("Надо немного подождать...", "Передача данных", var2);
                                                            var24 = new Vector();
                                                            var24.addElement(new Byte((byte)34));
                                                            var24.addElement(new Byte((byte)(var1 == M ? 1 : 2)));
                                                            .aw.a.a(new .a((byte)89, var24));
                                                         }
                                                      } else {
                                                         var10 = (.l)var2;
                                                         this.a("Надо немного подождать...", "Сейчас, сейчас! Загружаю имена жителей...", var2);
                                                         this.a.a((long)var10.a.d, 0, var1 == au);
                                                      }
                                                   }
                                                } else {
                                                   .f var10000;
                                                   long var22;
                                                   if (var2 instanceof .ag) {
                                                      var27 = (.ag)var2;
                                                      if (var27.getString().length() == 0) {
                                                         this.a("Введи текст сообщения", var2, false);
                                                      } else {
                                                         Displayable var19 = var27.a;
                                                         if (var19 instanceof .ax && !var27.c) {
                                                            .ax var40 = (.ax)var27.a;
                                                            this.a((Displayable)var40, false);
                                                            this.a.a(var40.a.d, var27.getString());
                                                            var40.a(this.a.a.b, this.a.a.n + ": " + var27.getString());
                                                         } else if (var27.b) {
                                                            var22 = 0L;
                                                            if (var19 instanceof .h) {
                                                               var22 = ((.h)var19).a.b;
                                                            } else if (var19 instanceof .aa) {
                                                               var22 = (Long)((.aa)var19).a().elementAt(0);
                                                            }

                                                            this.a(var22, var27.getString(), var27);
                                                         } else if (var27.a()) {
                                                            var5 = new Vector();
                                                            var5.addElement(new Long(this.a.a.b));
                                                            var5.addElement(var27.getString());
                                                            .aw.a.a(new .a((byte)83, var5));
                                                            ++this.a.a.a;
                                                            this.a.a.y = var27.getString();
                                                            .ay var30 = new .ay(b);
                                                            var30.a("Внимание", "Ставка принята", 2, (.ai)null, false);
                                                            var10000 = this.a.a;
                                                            var10000.c -= (long).an.d;
                                                         } else {
                                                            .aa var31;
                                                            if (var19 instanceof .aa) {
                                                               var31 = (.aa)var19;
                                                               this.a(var31, var27.getString(), var27.c);
                                                               this.a((Displayable)var19, false);
                                                            } else if (var19 instanceof .h) {
                                                               .h var34 = (.h)var19;
                                                               this.a.c(var34.a.b, var27.getString());
                                                               this.a((Displayable)var19, false);
                                                            } else if (var19 instanceof .ay && !(var19 instanceof .as)) {
                                                               if (((.ay)var19).a instanceof .aa) {
                                                                  var31 = (.aa)((.ay)var19).a;
                                                                  this.a(var31, var27.getString(), var27.c);
                                                                  this.a((Displayable)var19, false);
                                                               } else {
                                                                  .as var38;
                                                                  if (((.ay)var19).a instanceof .as) {
                                                                     var38 = (.as)((.ay)var19).a;
                                                                     this.a.c(var38.b.b, var27.getString());
                                                                     this.a((Displayable)var38, false);
                                                                  } else if (var27.c) {
                                                                     this.a.c(1L, var27.getString());
                                                                     this.a((Displayable)var19, false);
                                                                  } else if (var19 instanceof .as) {
                                                                     var38 = (.as)var19;
                                                                     this.a.c(var38.b.b, var27.getString());
                                                                     this.a((Displayable)var19, false);
                                                                  }
                                                               }
                                                            } else {
                                                               var22 = 0L;
                                                               if (var27.c) {
                                                                  var22 = 1L;
                                                               } else if (var19 instanceof .as) {
                                                                  .as var28 = (.as)var19;
                                                                  var22 = var28.b.b;
                                                               }

                                                               this.a.c(var22, var27.getString());
                                                               this.a((Displayable)var19, false);
                                                            }
                                                         }
                                                      }
                                                   } else if (var2 instanceof .i) {
                                                      var39 = var2;
                                                      .h var21 = null;
                                                      var22 = 0L;
                                                      if (((.i)var2).a instanceof .aa) {
                                                         .aa var29 = (.aa)((.i)var2).a;
                                                         if (var29.a instanceof .l) {
                                                            var39 = (.l)var29.a;
                                                            var22 = this.a.a.b;
                                                         } else if (var29.a instanceof .h) {
                                                            var39 = this.a;
                                                            var22 = ((.h)var39).a.b;
                                                         } else if (var29.a instanceof .e) {
                                                            var39 = (.e)var29.a;
                                                            var22 = this.a.a.b;
                                                         } else {
                                                            .aa var8;
                                                            if (var29.a instanceof .aa) {
                                                               var8 = (.aa)var29.a;
                                                               if (var8.a == 8) {
                                                                  var22 = (Long)var8.a().elementAt(2);
                                                               } else {
                                                                  var22 = this.a.a.b;
                                                               }

                                                               var39 = var8;
                                                            } else if (var29.a instanceof .ay) {
                                                               var8 = (.aa)((.ay)var29.a).a;
                                                               if (var8.a == 8) {
                                                                  var39 = var8;
                                                                  var22 = (Long)var8.a().elementAt(2);
                                                               }
                                                            }
                                                         }
                                                      } else if (((.i)var2).a instanceof .h) {
                                                         var21 = this.a;
                                                         var22 = ((.h)var21).a.b;
                                                      }

                                                      if ((long)((.i)var2).a > this.a.a.c) {
                                                         this.a((String)"Увы, для этого в твоём кошельке недостаточно реалов...", (Displayable)var21, true);
                                                      } else {
                                                         if (((.i)var2).b != 0L) {
                                                            .i var33 = (.i)var2;
                                                            var22 = var33.b;
                                                            this.a.a(var22, var33.a, var33.a.getString());
                                                         } else {
                                                            this.a.c(var22, "Present: " + ((.i)var2).a + "#" + ((.i)var2).a + " - " + ((.i)var2).a.getString());
                                                         }

                                                         this.a((String)"Подарок отправлен", (Displayable)var39, false);
                                                         var10000 = this.a.a;
                                                         var10000.c -= (long)((.i)var2).a;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             if (var1 == Z) {
                                                var27 = new .ag(this, true);
                                                var27.a(var2, "");
                                             }

                                             if (var1 == o) {
                                                if (var2 instanceof .aa) {
                                                   if (((.aa)var2).a().b == this.a.a.b) {
                                                      this.a("Нельзя отправить письмо самому себе.", var2, true);
                                                   } else {
                                                      var27 = new .ag(this, var1 != o);
                                                      var27.a(var2, "");
                                                   }
                                                } else if (var2 instanceof .h) {
                                                   if (((.h)var2).a.b == this.a.a.b) {
                                                      this.a("Нельзя отправить письмо самому себе.", var2, true);
                                                   } else if (((.h)var2).a.c.containsKey(new Long(this.a.a.b))) {
                                                      this.a("Ты не можешь отправить письмо. Житель считает тебя своим врагом.", var2, true);
                                                   } else {
                                                      var27 = new .ag(this, var1 != o);
                                                      var27.a(var2, "");
                                                   }
                                                } else {
                                                   var27 = new .ag(this, var1 != o);
                                                   var27.a(var2, "");
                                                }
                                             } else if (var2 instanceof .aa) {
                                                if (((.aa)var2).a == 15) {
                                                   var37 = new .az(this);
                                                   var37.a(var2, ((.aa)var2).b);
                                                }
                                             } else if (var2 instanceof .ax) {
                                                var27 = new .ag(this, false);
                                                var27.setTitle("Сказать");
                                                var27.a(var2, "");
                                             }
                                          }
                                       } else {
                                          .aw.a(var2, var1);
                                       }
                                    }
                                 } else if (var2 instanceof .aa) {
                                    var24 = ((.aa)var2).a();
                                    var14 = new Vector();
                                    var14.addElement((Long)var24.elementAt(0));
                                    var14.addElement(new Long((long)((.aa)var2).z));
                                    .aw.a.a(new .a((byte)56, var14));
                                 }
                              }
                           }
                        } else {
                           .w var16 = (.w)var2;
                           if (var16.e == .w.h) {
                              .w var13 = (.w)var2;
                              this.a(var13.a(), var13.c());
                              this.a((Displayable)var13, (.f)var13.a());
                           } else {
                              this.a((Displayable)(new .w(this, .w.h)), false);
                           }
                        }
                     } else {
                        this.a();
                     }
                  } else {
                     this.a("Надо немного подождать...", var1 == ar ? "Пара секунд терпения… загружаю чаты" : "Сейчас быстренько загружаю комнаты..", var2);
                     this.a.a(var1 == ar);
                  }
               } else {
                  this.a("Надо немного подождать...", "Сейчас, сейчас! Загружаю имена жителей...", var2);
                  byte var12 = 2;
                  if (var1 == aD) {
                     var12 = 0;
                  } else if (var1 == e) {
                     var12 = 1;
                  }

                  this.a.a(var12);
               }
            } else {
               .au var11 = (.au)var2;
               this.a("Надо немного подождать...", "Загружается фото", var11.a);
               .aw.l();
               this.a.b(var1 == y);
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      this.c = false;
   }

   private void a(long var1, String var3, Displayable var4) {
      .ay var5 = new .ay(this);
      int var6 = var3.length() / 160;
      if (var3.length() % 160 > 0) {
         ++var6;
      }

      String var7 = "Твоё письмо эквивалентно " + var6 + " SMS " + "Стоимость=" + var6 * .an.e + " R";
      if (.an.b) {
         var5.addCommand(G);
      }

      if (this.a.a.c >= (long)(var6 * .an.e)) {
         var5.addCommand(av);
         var5.a("Кошелек", var7, 2, (.ai)null, true);
         var5.removeCommand(Y);
      } else {
         var5.removeCommand(G);
         var5.addCommand(av);
         var5.a("Кошелек", "Увы, для этого в твоём кошельке недостаточно реалов...", 2, (.ai)null, true);
         var5.removeCommand(Y);
      }

   }

   private void a(Displayable var1) {
      Vector var2 = new Vector();
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      .bd var5 = ((.ax)var1).a;
      Vector var6 = new Vector();
      var6.addElement(new Byte((byte)89));
      var6.addElement("Назад");
      var6.addElement((Object)null);
      var6.addElement(new Byte((byte)0));
      var3.addElement(var6);
      int var7 = 0;

      for(Enumeration var8 = var5.a.elements(); var8.hasMoreElements(); ++var7) {
         .ac var9 = (.ac)var8.nextElement();
         if (var9.b == this.a.a.b) {
            --var7;
         } else {
            var4.addElement(var9.a(false));
         }
      }

      var6 = new Vector();
      var6.addElement(new Byte((byte)8));
      var6.addElement("Паспорт");
      var6.addElement("Загружается паспорт");
      var6.addElement(new Byte((byte)5));
      var3.addElement(var6);
      .aw.l();
      var6 = new Vector();
      var6.addElement(new Byte((byte)31));
      var6.addElement("Сделать другом");
      var6.addElement("Житель стал твоим другом.\nЕму отправлено уведомление.");
      var6.addElement(new Byte((byte)1));
      var3.addElement(var6);
      var6 = new Vector();
      var6.addElement(new Byte((byte)9));
      var6.addElement("Письмо");
      var6.addElement((Object)null);
      var6.addElement(new Byte((byte)0));
      var3.addElement(var6);
      if (this.a.a.a != null && var5.d == this.a.a.a.d) {
         var6 = new Vector();
         var6.addElement(new Byte((byte)73));
         var6.addElement("Выкинуть");
         var6.addElement((Object)null);
         var6.addElement(new Byte((byte)4));
         var3.addElement(var6);
      }

      var6 = new Vector();
      var6.addElement(new Byte((byte)32));
      var6.addElement("Сделать врагом");
      var6.addElement("Житель стал твоим врагом.\nТеперь он не сможет отправлять тебе письма и приглашения.");
      var6.addElement(new Byte((byte)1));
      var3.addElement(var6);
      var6 = new Vector();
      var6.addElement(new Byte((byte)90));
      var6.addElement("Помощь");
      var6.addElement("Список жителей. Ты можешь посмотреть информацию о жителей, сделать его другом или врагом, отправить письмо.");
      var6.addElement(new Byte((byte)1));
      var3.addElement(var6);
      var2.addElement(var4);
      var2.addElement(var3);
      var2.addElement("Кто здесь?(" + var7 + ")");
      var2.addElement(new Byte((byte)19));
      var2.addElement("В чате никого нет.");
      var2.addElement(new Integer(14737632));
      var2.addElement(new Integer(0));
      .aw.l();
      .aa var10 = new .aa(this, var2, var1);
      this.c = var1;
      var10.n();
   }

   public void a(String var1, boolean var2) {
      .ay var3 = new .ay(this);
      var3.addCommand(av);
      if (var2) {
         var3.addCommand(M);
         var3.addCommand(v);
         var3.addCommand(C);
         var3.addCommand(Z);
      }

      var3.a("Кошелек", var1, 2, (.ai)null, true);
      var3.removeCommand(Y);
   }

   private void a(.aa var1, String var2, boolean var3) {
      long var4 = 0L;
      Vector var6 = var1.a();
      if (var3) {
         var4 = 1L;
      } else {
         if (var1.a == 16) {
            var1.a(this.a.a.b, this.a.a.n + "\n" + var2);
            this.a.b((long)((int)(Long)var6.elementAt(0)), var2);
            return;
         }

         if (var1.a == 8) {
            var4 = (Long)var6.elementAt(2);
         } else {
            var4 = (Long)var6.elementAt(0);
         }
      }

      this.a.c(var4, var2);
   }

   public void a(int var1, int var2, boolean var3) {
      Vector var4 = new Vector();
      String var5 = "";
      if (var3) {
         var4.addElement(new Byte((byte)103));
         var4.addElement(new Byte((byte)14));
         var5 = "Загружается карта";
      } else {
         var4.addElement(new Byte((byte)17));
         var4.addElement(new Byte((byte)13));
         var5 = "Загружается список объектов";
      }

      if (var2 >= 2) {
         var5 = "Сейчас быстренько загружаю комнаты..";
      }

      var4.addElement(new Integer(var1));
      var4.addElement(new Integer(var2));
      var4.addElement(new Integer(0));
      this.a("Надо немного подождать...", var5, b);
      .aw.a.a(new .a((byte)89, var4));
   }

   public void a(.r var1, Displayable var2) {
      this.a("Надо немного подождать...", "Сейчас, подожди - загружаю список тем", var2);
      this.a.a((.r)var1, 0);
   }

   public void a(int var1, Displayable var2, int var3, boolean var4) {
      this.e = var4;
      if (var3 == -2 || var3 == -3) {
         var3 = 3;
      }

      this.a("Надо немного подождать...", var3 != 3 ? "Загружается карта" : "Сейчас быстренько загружаю комнату..", var2);
      a = var3;
      this.a.e(var1);
   }

   public void a(.bd var1) {
      this.a.a = var1;
      if (b instanceof .ae) {
         this.a.m();
         this.a.a = this.a();
         this.a.a(var1, a);
      }

   }

   public void b() {
      this.a((String)"Владелец выкинул тебя из чата.", (Displayable)null, false);
   }

   public void a(.bd var1, boolean var2) {
      .l var3 = new .l(this);
      if (!var2) {
         Displayable var4 = this.a();
         this.c = var4;
         var3.a = var4;
      } else if (this.a.a instanceof .l) {
         var3.a = ((.l)this.a.a).a;
      }

      a = var1.c;
      var3.a(var1, a);
   }

   public void a(.ac var1, Displayable var2) {
      this.a("Надо немного подождать...", "Загружаю паспорт жителя", var2);
      this.a.g(var1.b);
   }

   public void a(.f var1, Displayable var2) {
      this.a = new .h(this);
      this.a.a(var1, var2);
   }

   public void a(String var1, Displayable var2, boolean var3) {
      .ay var4 = new .ay(this);
      if (b instanceof .i) {
         .aw.a((Displayable)var4, (Displayable)((.i)var2).a);
      }

      var4.a("Внимание", var1, var3 ? 3 : 2, (.ai)null, true);
      if (var2 == null) {
         .aw.a((Displayable)var4, (Displayable)null);
      }

   }

   public void destroyApp(boolean var1) {
      try {
         .aw.a.a(true);
      } catch (Exception var3) {
      }

   }

   public void pauseApp() {
      this.f = true;
   }

   public void a(.bd var1, int var2) {
      a = var2;
      boolean var3 = false;
      if (this.a.a == null || this.a.a.d != var1.d) {
         this.a.a = null;
         this.a.b();
         var3 = true;
      }

      this.a.a(var1, var2);
      this.a.a(var1.d, var3);
   }

   public void f() {
      Displayable var1 = b;
      if (var1 instanceof .as) {
         .as var2 = (.as)var1;
         var2.a(var2.a() + 1, true);
         var2.a(true);
      }

   }

   public void a(.ac var1) {
      this.b = false;
   }

   public void b(int var1) {
      .aw.a.a(true);
      Displayable var2 = this.a();
      String var3 = null;
      .ay var4 = new .ay(this);
      switch(var1) {
      case -6:
         var3 = "Истекли попытки авторизации, пользователь временно заблокирован. Повторите попытку позже";
         break;
      case 7:
         var3 = "Логин или пароль указаны неверно.\nЕсли ты ещё не зарегистрирован, выбери 'Регистрация', \nПодробная информация на http://wap.city1.ru/, http://city1.ru/.";
         break;
      case 44:
         var3 = "Версия клиента устарела. \nСкачайте новую версию (выберите 'Переустановить' в меню Вашего телефона) с http://wap.city1.ru/.";
         break;
      case 45:
         var3 = "Период действия услуги истёк.\nПополни свой баланс.\nПодробная информация на http://city1.ru/, http://wap.city1.ru/.";
         break;
      default:
         var3 = "Ошибка базы данных.";
      }

      var4.a("Упс! Произошла ошибка авторизации", var3, 3, (.ai)null, true);
   }

   public void f(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.z = (Integer)var1.elementAt(6);
      var3.n();
   }

   public void a(.f var1) {
      this.b = true;
      var1.a(this.c);
      this.a(var1, true);
      a = 1;
   }

   public void c(int var1) {
      .aw.a.a(true);
      Displayable var2 = this.a();
      String var3;
      switch(var1) {
      case 26:
         var3 = "Выбранный логин уже существует.\nПридумай другой логин.";
         break;
      case 27:
         var3 = "Введенный e-mail уже зарегистрирован. Пожалуйста, введите другой.";
         break;
      case 32:
         var3 = "Нельзя использовать для логина русские символы.";
         break;
      case 44:
         var3 = "Версия клиента устарела. \nСкачайте новую версию (выберите 'Переустановить' в меню Вашего телефона) с http://wap.city1.ru/.";
         break;
      case 45:
         var3 = "Период действия услуги истёк.\nПополни свой баланс.\nПодробная информация на http://city1.ru/, http://wap.city1.ru/.";
         break;
      case 46:
         var3 = "Пробная подписка не поддерживается.\nПодробная информация на http://city1.ru/, http://wap.city1.ru/.";
         break;
      case 60:
         var3 = "Недопустимый e-mail. Пожалуйста, введите другой.";
         break;
      default:
         var3 = "Ошибка базы данных.";
      }

      this.a("Ошибка регистрации\n" + var3, var2, true);
   }

   public void d(int var1) {
      .aw.a.a(true);
      Displayable var2 = this.a();
      String var3;
      switch(var1) {
      case -5:
         var3 = "При регистрации данного логина не была введена информация для восстановления пароля. Обратитесь в службу технической поддержки CiTY";
         break;
      case -4:
         var3 = "Не указан логин пользователя";
         break;
      case -3:
         var3 = "Пароль был успешно изменен";
         break;
      case -2:
         var3 = "Неверные ответы на контрольные вопросы";
         break;
      case -1:
         var3 = "Указанный логин не существует";
         break;
      case 44:
         var3 = "Версия клиента устарела. \nСкачайте новую версию (выберите 'Переустановить' в меню Вашего телефона) с http://wap.city1.ru/.";
         break;
      case 45:
         var3 = "Период действия услуги истёк.\nПополни свой баланс.\nПодробная информация на http://city1.ru/, http://wap.city1.ru/.";
         break;
      default:
         var3 = "Ошибка базы данных.";
      }

      if (var1 != -3) {
         this.a("Ошибка восстановления пароля\n" + var3, var2, true);
      } else {
         .w var4 = new .w(this, .w.h);
         this.a((String)("Поздравляем\n" + var3), (Displayable)var4, false);
      }

   }

   public .f a() {
      this.g = false;

      try {
         .f var1 = new .f();
         byte[] var2 = .aw.a("XChatMidlet 1.0");
         ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
         DataInputStream var4 = new DataInputStream(var3);
         var1.n = var4.readUTF();
         var1.a(var4.readUTF());
         this.g = false;
         var4.close();
         return var1;
      } catch (Exception var5) {
         return null;
      }
   }

   public void a(.f var1, boolean var2) {
      .aw.d("XChatMidlet 1.0");

      try {
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);
         var4.writeUTF(var1.n);
         var4.writeUTF(var1.a());
         var4.writeBoolean(var2);
         byte[] var5 = var3.toByteArray();
         .aw.a("XChatMidlet 1.0", var5);
      } catch (Exception var6) {
      }

   }

   public void a(long var1, int var3, int var4, String var5) {
      if (this.a.a != null && this.a.a.d == var4) {
         this.a.a(var3, var5);
      }

   }

   public void b(String var1) {
      Displayable var2 = this.a();
      long var3 = System.currentTimeMillis();

      while(System.currentTimeMillis() < var3 + 2000L) {
      }

      .aw.l();
      if (var2 == null) {
         var2 = b;
      }

      .ay var5 = new .ay(this);
      var5.a("Новости", var1, 2, (.ai)null, true);
   }

   public void h() {
      a = 1;
      this.a();
      .ay var1 = new .ay(this);
      var1.a("Ошибка", this.a.a ? "Обрыв связи. Попробовать соединиться ещё раз?" : "Не можешь войти в 'CiTY'?\n___\nУбедись, что твой телефон подключен к услуге GPRS-Internet. Для этого позвони в абонентскую службу своего оператора.\n___\nЕсли услуга подключена, а 'CiTY' не запускается, проверь настройки соединения GPRS-Internet.\n___\nТы можешь сделать это самостоятельно или воспользоваться помощью оператора абонентской службы, который пришлет тебе автоматические настройки.\n___\nЧтобы увидеть параметры для самостоятельной настройки, выбери соответствующего оператора в меню.", 3, (.ai)null, true);
      var1.removeCommand(aX);
      var1.removeCommand(Y);
      var1.removeCommand(q);
      if (!this.a.a) {
         var1.addCommand(aJ);
         var1.addCommand(s);
         var1.addCommand(aj);
      }

      var1.addCommand(i);
      var1.addCommand(aE);
      var1.setCommandListener(this);
   }

   public void b(Vector var1, boolean var2) {
      Displayable var3 = this.a();
      .aa var4 = new .aa(this, var1, var3);
      var4.n();
   }

   public void a(int var1, .r var2) {
      if (this.a.a.a.d == var1) {
         Displayable var3 = this.a();
         this.a(var3, true);
      }

   }

   public void e() {
      .o var1 = new .o(this, false);
      Displayable var2 = this.a();
      var1.a(this.a.a, var2);
   }

   public void a(Vector var1, boolean var2) {
      Displayable var3 = this.a();
      if (var1.isEmpty()) {
         .ay var5 = new .ay(this);
         var5.a = b;
         var5.a("Лидеры", "Сейчас в CiTY нет лидеров.\nЧтобы принять участие в Гонке лидеров - выбери 'В лидеры'.", 2, (.ai)null, true);
         var5.addCommand(at);
      } else {
         .aa var4 = new .aa(this, var1, var3);
         var4.g();
      }

   }

   public void d(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.n();
   }

   public void h(Vector var1) {
      .ay var2 = new .ay(this);
      Displayable var3 = this.c;
      if (var3 == null) {
         var3 = b;
      }

      var2.a((String)var1.elementAt(0), (String)var1.elementAt(1), 2, (.ai)null, true);
   }

   public void g(Vector var1) {
      .ay var2 = new .ay(this);
      Displayable var3 = this.a();
      Vector var4 = (Vector)var1.elementAt(0);
      if (var1.size() > 3) {
         if ((Byte)var1.elementAt(3) == 10) {
            .ag var5 = new .ag(b, false);
            var5.a(var3, (String)var4.elementAt(0));
         }
      } else {
         this.a.a = (Long)var4.elementAt(1);
         var2.a((String)var1.elementAt(2), (String)var4.elementAt(0), 1, (.ai)null, true);
         var2.addCommand(av);
         if (this.a.a != this.a.a.b) {
            var2.addCommand(B);
            if (.an.a) {
               var2.addCommand(aR);
            }

            var2.addCommand(ab);
         }

         var2.setCommandListener(this);
      }

   }

   public void c(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.g();
   }

   public void d() {
      this.a();
      this.a.a(System.getProperty("microedition.platform"));
      .v var1 = new .v(this);
      var1.b();
      if (this.b) {
         this.commandAction(S, var1);
      }

   }

   public void b(Displayable var1) {
      String var2 = "Справка временно недоступна, извините за неудобства.";
      if (var1 instanceof .j) {
         var2 = ((.j)var1).a();
      }

      .ay var3 = new .ay(this);
      var3.a("Помощь", var2, 2, (.ai)null, true);
   }

   public void c() {
      Displayable var1 = this.a();
      if (var1 instanceof .w) {
         ((.w)var1).addCommand(p);
      }

      this.a("Картинка загружена.\nНе забудь сообщить об этом друзьям и знакомым ;).", var1, false);
   }

   public void a(String var1) {
      Displayable var2 = this.a();
      this.a(var1, var2, false);
   }

   public void e(Vector var1) {
      byte[] var2 = (byte[])var1.elementAt(0);
      String var3 = (String)var1.elementAt(1);
      int var4 = (Integer)var1.elementAt(2);
      int var5 = (Integer)var1.elementAt(3);
      .aw.l();
      Image var6 = null;

      try {
         var6 = Image.createImage(var2, 0, var2.length);
      } catch (Exception var9) {
      }

      if (var6 == null) {
         Displayable var7 = this.a();
         this.a("Ошибка загрузки картинки.\nНеверный формат файла.", var7, true);
      } else {
         .au var10 = new .au(this);
         Displayable var8 = this.a();
         var10.a(var6, var3, var4, var5, var8);
      }

   }

   public void k(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.n();
   }

   public void b(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.n();
   }

   public void a(Vector var1) {
      .bd var2 = new .bd();
      Displayable var3 = this.a();
      if (var1.size() < 2) {
         .ay var4 = new .ay(this);
         var4.a("Комната", "У тебя нет своей комнаты!\nНаправляйся в Жилой квартал и выбери 'Снять комнату' в меню.", 2, (.ai)null, true);
      } else {
         var2.a(var1);
         this.a(var2, false);
      }

   }

   public static void c(Displayable var0) {
      if (var0 instanceof .v) {
         var0.addCommand(b);
         var0.addCommand(ax);
         var0.addCommand(ag);
         var0.addCommand(ad);
         var0.addCommand(aS);
         var0.addCommand(S);
         var0.addCommand(aW);
         var0.addCommand(aB);
         var0.addCommand(K);
         var0.addCommand(ap);
         var0.addCommand(ak);
         var0.addCommand(aE);
      }

      if (var0 instanceof .v || var0 instanceof .ax) {
         var0.addCommand(ap);
      }

      var0.addCommand(Z);
      var0.addCommand(aM);
      if (!(var0 instanceof .l) && !(var0 instanceof .ax)) {
         var0.addCommand(L);
      }

   }

   public void c(Vector var1, boolean var2) {
      if ((Byte)var1.elementAt(3) == 11) {
         var1.setElementAt(this.a((Vector)var1.elementAt(0)), 0);
      }

      .aa var3 = new .aa(this, var1, this.c);
      var3.z = (Integer)var1.elementAt(6);
      if (!var2) {
         var3.n();
      }

   }

   public Vector a(Vector var1) {
      String var2;
      Vector var5;
      int var6;
      for(var6 = 0; var6 < var1.size(); ++var6) {
         for(int var7 = 0; var7 < var6; ++var7) {
            var2 = (String)((Vector)var1.elementAt(var6)).elementAt(1);
            String var3 = (String)((Vector)var1.elementAt(var7)).elementAt(1);
            if (var2.compareTo(var3) < 0) {
               var5 = (Vector)var1.elementAt(var7);
               var1.setElementAt((Vector)var1.elementAt(var6), var7);
               var1.setElementAt(var5, var6);
            }
         }
      }

      for(var6 = 0; var6 < var1.size(); ++var6) {
         var2 = (String)((Vector)var1.elementAt(var6)).elementAt(1);
         if (var2.compareTo("Москва") == 0) {
            var5 = (Vector)var1.elementAt(var6);
            var1.removeElementAt(var6);
            var1.insertElementAt(var5, 0);
         }

         if (var2.compareTo("Санкт-Петербург") == 0) {
            var5 = (Vector)var1.elementAt(var6);
            var1.removeElementAt(var6);
            var1.insertElementAt(var5, 1);
         }
      }

      return var1;
   }

   public void j(Vector var1) {
      Displayable var2 = this.a();
      .aa var3 = new .aa(this, var1, var2);
      var3.z = (Integer)var1.elementAt(6);
      var3.n();
   }

   public void c(String var1) {
      .ay var2 = new .ay(this);
      var2.addCommand(av);
      var2.addCommand(e);
      var2.addCommand(aD);
      var2.addCommand(f);
      var2.addCommand(ar);
      var2.a("Лучшие", var1, 2, (.ai)null, true);
      var2.removeCommand(Y);
   }

   public void i(Vector var1) {
      this.a.a.a(var1);
   }
}
