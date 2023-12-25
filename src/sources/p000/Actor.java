package p000;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

/* renamed from: b */
/* loaded from: b.class */
public final class Actor extends Game {

    /* renamed from: a */
    public long f11a;

    public Actor(MIDlet mIDlet, int i) {
        super(mIDlet, i);
    }

    /* renamed from: f */
    private void m279f(boolean z) {
        int i = 0;
        for (int length = ((Game) this).f264e.length - 1; length >= 0 && i < this.f112af; length--) {
            if (((Game) this).f264e[length][24] == 1) {
                i++;
                int i2 = ((Game) this).f264e[length][1];
                if (z == (i2 == 45 || i2 == 26 || i2 == 53 || i2 == 10 || (i2 == 88 && ((Game) this).f264e[length][4] == 127))) {
                    ((Game) this).Object_Info = ((Game) this).f264e[length];
                    m281e(((Game) this).Object_Info[1]);
                }
            }
        }
    }

    /* renamed from: ab */
    private void m357ab() {
        if (Game.f174g < Game.f171c) {
            Game.GFX_Painter.translate((Game.f171c - Game.f174g) >> 1, 0);
        }
        Game.GFX_Painter.setClip(0, Game.f13i, Game.f174g, Game.f175h);
        Background_Renderer.m388a(Game.GFX_Painter, Game.Camera_Pos[0], Game.Camera_Pos[1], true);
        Level_UpdateTiles(Game.GFX_Painter, this.Game_ZoneID == 1 || this.Game_ZoneID == 5);
        m279f(false);
        m249M();
        if (!Game.f75j) {
            m15w();
        }
        m11y();
        m194a(Game.GFX_Painter, this.Game_ZoneID == 1 || this.Game_ZoneID == 5);
        m279f(true);
        if (Game.f75j) {
            m15w();
        }
        if (Game.f174g < Game.f171c) {
            Game.GFX_Painter.translate(-((Game.f171c - Game.f174g) >> 1), 0);
        }
        m51l();
        Game.GFX_Painter.setClip(0, 0, Game.f171c, Game.GFX_MenuHeight);
    }

    /* renamed from: ac */
    private void m356ac() {
        Graphics graphics;
        Image image;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        switch (this.f121ai) {
            case 1:
                m265D();
                break;
            case 2:
                if (((Game) this).f267q || this.f262p) {
                    Game.UI_DrawBorderLines(0, 0, Game.f171c, Game.GFX_MenuHeight);
                    Game.m263E();
                    Game.f217z = true;
                    Game.f219B = true;
                    Game.f218A = true;
                    ((Game) this).f267q = false;
                } else if (((Game) this).f226j % 10 == 0) {
                    Game.UI_DrawBorderLines(0, 0, Game.GFX_MenuWidth, Game.f13i);
                    Game.UI_DrawBorderLines(0, Game.f13i + Game.f175h, Game.GFX_MenuWidth, Game.f13i);
                    m113c(true);
                    m129b(true);
                }
                m357ab();
                ((Game) this).f226j++;
                break;
            case 3:
                m261F();
                Game.GFX_Painter.setColor(0);
                Game.GFX_Painter.fillRect(0, Game.f13i, Game.GFX_MenuWidth, Game.f175h);
                ((Game) this).f43m = (Game.GFX_MenuWidth + Game.f183a[Game.f211x[this.f277al]][2]) >> 1;
                int[] iArr = {82, 100, 108, 116, 100, 84};
                Game.m195a(Game.GFX_Painter, Game.GFX_HUDArray[10], Game.f183a[10][0], Game.f183a[10][1], Game.f183a[10][2], Game.f183a[10][3], Game.f179a[0], (((Game) this).f43m - Game.f183a[10][2]) - 1, iArr[0], 20, false);
                if (this.f277al == 6) {
                    graphics = Game.GFX_Painter;
                    image = Game.GFX_HUDArray[10];
                    i = Game.f183a[3][0];
                    i2 = Game.f183a[3][1];
                    i3 = Game.f183a[3][2];
                    i4 = Game.f183a[3][3];
                    i5 = Game.f179a[0];
                    i6 = ((Game) this).f43m - 48;
                    i7 = iArr[1];
                    i8 = 20;
                } else {
                    Game.m195a(Game.GFX_Painter, Game.GFX_HUDArray[10], Game.f183a[4 + this.f278am][0], Game.f183a[4 + this.f278am][1], Game.f183a[4 + this.f278am][2], Game.f183a[4 + this.f278am][3], Game.f179a[0], (((Game) this).f43m - Game.f183a[10][2]) + 25, iArr[2], 20, false);
                    Game.m195a(Game.GFX_Painter, Game.GFX_HUDArray[10], Game.f183a[8][0], Game.f183a[8][1], Game.f183a[8][2], Game.f183a[8][3], Game.f179a[0], (((Game) this).f43m - Game.f183a[10][2]) + 1, iArr[3], 20, false);
                    graphics = Game.GFX_Painter;
                    image = Game.GFX_HUDArray[10];
                    i = Game.f183a[3][0];
                    i2 = Game.f183a[3][1];
                    i3 = Game.f183a[3][2];
                    i4 = Game.f183a[3][3];
                    i5 = Game.f179a[0];
                    i6 = ((Game) this).f43m - (Game.f183a[10][2] >> 1);
                    i7 = iArr[4];
                    i8 = 24;
                }
                Game.m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                Game.m195a(Game.GFX_Painter, Game.GFX_HUDArray[10], Game.f183a[Game.f211x[this.f277al]][0], Game.f183a[Game.f211x[this.f277al]][1], Game.f183a[Game.f211x[this.f277al]][2], Game.f183a[Game.f211x[this.f277al]][3], Game.f179a[0], ((Game) this).f43m, iArr[5], 24, false);
                Game.GFX_Painter.drawImage(Game.GFX_HUDArray[4], Game.GFX_MenuWidth - 10, Game.f12f + (Game.f173e >> 1), 20);
                Game.GFX_Painter.drawImage(Game.GFX_HUDArray[5], 10, Game.f12f + (Game.f173e >> 1), 24);
                break;
            case 4:
                m261F();
                Game.m263E();
                ((Game) this).f267q = false;
                Game.f219B = true;
                Game.GFX_Painter.setColor(0);
                Game.GFX_Painter.fillRect(0, Game.f13i, Game.GFX_MenuWidth, Game.f175h);
                break;
            case 6:
                ((Game) this).f225a[0] = "";
                m261F();
                ((Game) this).f226j++;
                m243S();
                break;
            case 7:
                ((Game) this).f226j++;
                m241U();
                break;
            case 8:
                m239W();
                break;
            case 9:
                m237Y();
                break;
            case 10:
            case 11:
                Game.UI_DrawBorderLines(0, 0, Game.f171c, Game.GFX_MenuHeight);
                m357ab();
                Game.GFX_Painter.setColor(0);
                for (int i9 = 0; i9 < Game.f175h; i9 += 2) {
                    Game.GFX_Painter.fillRect(0, i9 + Game.f13i, Game.GFX_MenuWidth, 1);
                }
                if (this.f121ai == 11) {
                    m196a(((Game) this).Text_Main[85], false);
                    m197a(((Game) this).Text_Main[24], 2, 0, this.f289an == 0);
                    m197a(((Game) this).Text_Main[25], 2, 1, this.f289an == 1);
                } else {
                    m196a(((Game) this).Text_Main[60], false);
                    m197a(((Game) this).Text_Main[70], 2, 0, this.f289an == 0);
                    m197a(((Game) this).Text_Main[71], 2, 1, this.f289an == 1);
                }
                ((Game) this).f267q = true;
                break;
        }
        if (this.f121ai == 4 || this.f121ai == 2) {
            m355ad();
        }
        if (((Game) this).f291y) {
            Game.m263E();
            ((Game) this).f291y = false;
        }
        if (this.f121ai != 2 || ((Game) this).f226j % 5 == 0) {
            m56k();
        }
    }

    /* renamed from: ad */
    private void m355ad() {
        if (((Game) this).f134w) {
            Game.GFX_Painter.setColor(0);
            for (int i = 0; i < 10; i++) {
                int i2 = 24 - ((this.f133ap - i) * 4);
                int i3 = i2;
                if (i2 >= 0) {
                    if (i3 > 24) {
                        i3 = 24;
                    }
                    Game.GFX_Painter.fillRect((i * 24) + (24 - i3), 0, i3, 240);
                }
            }
            if (22 < this.f133ap) {
                this.f133ap = 0;
                ((Game) this).f134w = false;
            }
            this.f133ap++;
        }
        m253J();
        if (((Game) this).f135x) {
            Game.GFX_Painter.setColor(0);
            for (int i4 = 0; i4 < 10; i4++) {
                if (this.f133ap - i4 > 0) {
                    int i5 = (this.f133ap - i4) << 2;
                    int i6 = i5;
                    if (i5 > 24) {
                        i6 = 24;
                    }
                    Game.GFX_Painter.fillRect(i4 * 24, Game.f12f, i6, Game.f173e);
                }
            }
            if (22 < this.f133ap) {
                this.f133ap = 0;
                ((Game) this).f135x = false;
            }
            this.f133ap++;
        }
        if (((Game) this).f228a) {
            m200a(((Game) this).Text_Main[49], Game.GFX_MenuWidth >> 1, ((Game.f13i + Game.f175h) - Game.f169a) - 2, 16777215, 658170);
        }
    }

    @Override // p000.Game
    public final void paint(Graphics graphics) {
        try {
            Game.GFX_Painter = graphics;
            m356ac();
            if (((Game) this).f316G) {
                Font font = graphics.getFont();
                if (((Game) this).Cheats_Active[1]) {
                    int i = ((Game) this).f323B[this.f324aD];
                    String stringBuffer = new StringBuffer().append(i != 0 ? String.valueOf(1000 / i) : "??").append(" fps").toString();
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, font.stringWidth("XXXXXX"), Game.f169a);
                    graphics.setColor(16777215);
                    graphics.drawString(stringBuffer, 0, 0, 20);
                }
                if (((Game) this).Cheats_Active[3]) {
                    String stringBuffer2 = new StringBuffer().append(Integer.toHexString(Game.Camera_Pos[0]).toUpperCase()).append(", ").append(Integer.toHexString(Game.Camera_Pos[1]).toUpperCase()).toString();
                    int stringWidth = font.stringWidth(stringBuffer2);
                    graphics.setColor(0);
                    graphics.fillRect(Game.GFX_MenuWidth - stringWidth, 0, stringWidth, Game.f169a);
                    graphics.setColor(16777215);
                    graphics.drawString(stringBuffer2, Game.GFX_MenuWidth, 0, 24);
                }
            }
            Game.GFX_Painter = null;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ae */
    private void m354ae() {
        boolean[] zArr;
        int[] iArr;
        char c;
        ((Game) this).f256G = 0;
        int i = 0;
        for (int i2 = 0; i2 < ((Game) this).f264e.length && i < this.f112af; i2++) {
            if (((Game) this).f264e[i2][24] == 1) {
                i++;
                ((Game) this).Object_Info = ((Game) this).f264e[i2];
                m352ag();
                if (((Game) this).Object_Info[1] != 17 || ((Game) this).Object_Info[4] != 55) {
                    if (((Game) this).Object_Info[0] > 0 || ((Game) this).Object_Info[21] != 0) {
                        if (((Game) this).f113c[((Game) this).Object_Info[20]] || ((Game) this).Object_Info[1] >= 120 || ((Game) this).Object_Info[1] == 42 || ((Game) this).Object_Info[1] == 43 || ((Game) this).Object_Info[1] == 36) {
                            if (m188a(((Game) this).Object_Info) && ((Game) this).Object_Info[21] == 0 && ((Game) this).Object_Info[1] < 120 && ((Game) this).Object_Info[1] != 42 && ((Game) this).Object_Info[1] != 43 && ((Game) this).Object_Info[1] != 36) {
                                ((Game) this).f113c[((Game) this).Object_Info[20]] = false;
                                zArr = ((Game) this).f113c;
                                iArr = ((Game) this).Object_Info;
                                c = 22;
                            }
                        }
                        m142b(i2);
                    } else {
                        ((Game) this).f114d[((Game) this).Object_Info[20]] = true;
                        zArr = ((Game) this).f113c;
                        iArr = ((Game) this).Object_Info;
                        c = 20;
                    }
                    zArr[iArr[c]] = false;
                    m142b(i2);
                }
            }
        }
        this.f112af += ((Game) this).f256G;
    }

    /* renamed from: af */
    private void m353af() throws Exception {
        Actor actor;
        boolean z;
        Actor actor2;
        int i;
        if (m232a()) {
            m97e();
            return;
        }
        switch (this.f121ai) {
            case 1:
                m267C();
                break;
            case 2:
                ((Game) this).Player_PrevRings = ((Game) this).Player_Rings;
                if (this.f262p) {
                    ((Game) this).f131v = true;
                    this.f132ao = 10;
                    Game.f81o = true;
                }
                Game.f184b[0] = Game.Player_RoughXPos();
                Game.f184b[1] = Game.Player_RoughYPos() - 1;
                this.f305as = 0;
                this.f306at = 0;
                ((Game) this).f147F = false;
                ((Game) this).f304E = false;
                ((Game) this).f141D = false;
                m29r();
                if (!Game.f75j) {
                    m9z();
                    m354ae();
                }
                if (Game.f75j) {
                    m251K();
                } else {
                    m250L();
                }
                if (((Game) this).f141D) {
                    Player_Hurt();
                }
                m13x();
                m271A();
                ((Game) this).Player_InvincTime--;
                ((Game) this).Player_SpeedShoeTime--;
                if (((Game) this).Player_InvincTime == 0) {
                    m90e(false);
                }
                if (((Game) this).Player_SpeedShoeTime <= 0) {
                    this.Player_TopSpeed = 1536;
                    this.Player_Acceleration = 12;
                }
                m23t();
                m257H();
                ((Game) this).f227k++;
                if (((Game) this).f227k % 55 == 0 && !Game.f81o) {
                    ((Game) this).f59x = (((Game) this).f59x + 1) % 60;
                    if (((Game) this).f59x == 0) {
                        if (((Game) this).f60y == 9) {
                            ((Game) this).f59x = 59;
                            Player_Kill();
                        } else {
                            ((Game) this).f60y++;
                        }
                    }
                }
                if (Game.f80n) {
                    ((Game) this).f59x = 0;
                    ((Game) this).f60y = 0;
                }
                if (!Game.f68d && ((Game) this).Player_Rings >= 100 && ((Game) this).Player_PrevRings < 100) {
                    ((Game) this).Music_MainPlayer.Music_Play(7, 1, false);
                    this.Player_Lives++;
                }
                if (!Game.f68d && ((Game) this).Player_Rings >= 200 && ((Game) this).Player_PrevRings < 200) {
                    ((Game) this).Music_MainPlayer.Music_Play(7, 1, false);
                    this.Player_Lives++;
                }
                if (!Game.f68d && ((Game) this).Player_Rings >= 300 && ((Game) this).Player_PrevRings < 300) {
                    ((Game) this).Music_MainPlayer.Music_Play(7, 1, false);
                    this.Player_Lives++;
                    break;
                }
                break;
            case 3:
                if (((Game) this).Input_Array[0]) {
                    this.Game_ZoneID = Game.f212f[this.f277al][this.f278am];
                    this.Game_ActID = Game.f213g[this.f277al][this.f278am];
                    this.Player_Lives = 3;
                    if (((Game) this).f316G) {
                        actor2 = this;
                        i = this.f318ay;
                    } else {
                        actor2 = this;
                        i = 0;
                    }
                    ((Game) actor2).Player_Emeralds = i;
                    ((Game) this).Player_Score = 0;
                    ((Game) this).f268r = true;
                    m35p();
                } else if (((Game) this).Input_Array[4]) {
                    m97e();
                    this.f278am = (this.f278am + 1) % 3;
                    if (this.f278am == 0) {
                        actor = this;
                        z = true;
                        actor.m192a(z);
                    }
                } else if (((Game) this).Input_Array[3]) {
                    m97e();
                    this.f278am = (this.f278am + 2) % 3;
                    if (this.f278am == 2) {
                        actor = this;
                        z = false;
                        actor.m192a(z);
                    }
                }
                if (this.f277al == 6) {
                    this.f278am = 0;
                    break;
                }
                break;
            case 6:
                ((Game) this).f227k++;
                m244R();
                break;
            case 7:
                m242T();
                break;
            case 8:
                m240V();
                break;
            case 9:
                if (((Game) this).f159I && System.currentTimeMillis() - this.f11a > 250) {
                    this.f11a = System.currentTimeMillis();
                    m238X();
                    break;
                }
                break;
            case 10:
                this.f307au = 0;
                ((Game) this).f35b = (byte) ((((Game) this).f35b + 1) % 24);
                if (((Game) this).Input_Array[0]) {
                    Record_Save_Settings();
                    if (this.f289an == 0) {
                        this.f121ai = 2;
                        ((Game) this).f267q = true;
                        ((Game) this).f131v = true;
                        this.f132ao = 10;
                        ((Game) this).f291y = true;
                        Game.f219B = true;
                        m90e(false);
                        m79g();
                    } else {
                        this.f121ai = 11;
                    }
                } else if (((Game) this).Input_Array[1] || ((Game) this).Input_Array[2]) {
                    this.f289an = (this.f289an + 1) & 1;
                }
                m97e();
                break;
            case 11:
                this.f307au = 0;
                ((Game) this).f35b = (byte) ((((Game) this).f35b + 1) % 24);
                if (!((Game) this).Input_Array[0]) {
                    if (!((Game) this).Input_Array[1]) {
                        if (((Game) this).Input_Array[2]) {
                            m97e();
                            this.f289an = (this.f289an + 1) & 1;
                            break;
                        }
                    } else {
                        m97e();
                        this.f289an = (this.f289an + 1) & 1;
                        break;
                    }
                } else if (this.f289an != 0) {
                    m97e();
                    this.f121ai = 10;
                    ((Game) this).f131v = true;
                    this.f132ao = 10;
                    ((Game) this).f291y = true;
                    break;
                } else {
                    m106d(3);
                    break;
                }
                break;
        }
        m255I();
    }

    @Override // p000.Game, java.lang.Runnable
    public final void run() {
        try {
            ((Game) this).f155b = System.currentTimeMillis();
            m86f();
            int i = 0;
            while (true) {
                ((Game) this).f156c = System.currentTimeMillis();
                m353af();
                this.f320aA++;
                ((Game) this).f157d = this.f320aA * 18;
                ((Game) this).f158e = System.currentTimeMillis() - ((Game) this).f155b;
                if (this.f322aC < ((Game) this).f157d - ((Game) this).f158e || i > 7) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i = 0;
                    m61j();
                    repaint();
                    serviceRepaints();
                    this.f321aB++;
                    int[] iArr = ((Game) this).f323B;
                    int i2 = this.f324aD;
                    this.f324aD = i2 + 1;
                    iArr[i2] = (int) (System.currentTimeMillis() - currentTimeMillis);
                    if (this.f324aD == ((Game) this).f323B.length) {
                        this.f324aD = 0;
                    }
                    this.f322aC = 0;
                    for (int i3 = 0; i3 < ((Game) this).f323B.length; i3++) {
                        this.f322aC += ((Game) this).f323B[i3];
                    }
                    this.f322aC /= ((Game) this).f323B.length;
                    Thread.yield();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - ((Game) this).f156c < 18) {
                        try {
                            Thread.sleep(18 - (currentTimeMillis2 - ((Game) this).f156c));
                        } catch (Exception unused) {
                        }
                    }
                    ((Game) this).f159I = true;
                } else {
                    i++;
                    ((Game) this).f159I = false;
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: ag */
    private void m352ag() {
        try {
            switch (((Game) this).Object_Info[1]) {
                case 0:
                case 1:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    if (((Game) this).Object_Info[5] != 0 || m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 8, -1)) {
                        m350ai();
                        return;
                    }
                    return;
                case 2:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16)) {
                        m330bC();
                        return;
                    }
                    return;
                case 3:
                    m349aj();
                    return;
                case 4:
                    m347al();
                    return;
                case 5:
                    m348ak();
                    return;
                case 6:
                    m346am();
                    return;
                case 7:
                    m345an();
                    return;
                case 8:
                    m344ao();
                    return;
                case 9:
                    m343ap();
                    return;
                case 10:
                    m342aq();
                    return;
                case 11:
                    m341ar();
                    return;
                case 12:
                    return;
                case 13:
                    m339at();
                    return;
                case 14:
                    m338au();
                    return;
                case 15:
                    m337av();
                    return;
                case 16:
                    m336aw();
                    return;
                case 17:
                    m335ax();
                    return;
                case 18:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 32)) {
                        m334ay();
                        return;
                    }
                    return;
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 50:
                case 51:
                case 52:
                case 53:
                case 72:
                case 73:
                case 74:
                case 76:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 87:
                case 88:
                case 91:
                case 92:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                default:
                    return;
                case 20:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, -1)) {
                        m333az();
                        return;
                    }
                    return;
                case 27:
                    m383aA();
                    return;
                case 36:
                    m382aB();
                    return;
                case 37:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 8, 32)) {
                        m381aC();
                        return;
                    }
                    return;
                case 38:
                    return;
                case 39:
                    m329bD();
                    return;
                case 40:
                    m328bE();
                    return;
                case 41:
                    m327bF();
                    return;
                case 42:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16)) {
                        m380aD();
                        return;
                    }
                    return;
                case 43:
                    if (((Game) this).Object_Info[4] >= 10 || !m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16)) {
                        return;
                    }
                    m380aD();
                    return;
                case 44:
                    m379aE();
                    return;
                case 45:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 32, 32)) {
                        m378aF();
                        return;
                    }
                    return;
                case 46:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 32, 32)) {
                        m377aG();
                        return;
                    }
                    return;
                case 47:
                    if (((Game) this).Player_Emeralds < 6) {
                        m43n();
                        return;
                    }
                    return;
                case 48:
                    m376aH();
                    return;
                case 49:
                    m326bG();
                    return;
                case 54:
                    m340as();
                    return;
                case 55:
                    m375aI();
                    return;
                case 56:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 32, 32)) {
                        m374aJ();
                        return;
                    }
                    return;
                case 57:
                    m325bH();
                    return;
                case 58:
                    if (m385a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 24, 24)) {
                        m373aK();
                        return;
                    }
                    return;
                case 59:
                    m372aL();
                    return;
                case 60:
                    m371aM();
                    return;
                case 61:
                    return;
                case 62:
                    m370aN();
                    return;
                case 70:
                    m324bI();
                    return;
                case 71:
                    m323bJ();
                    return;
                case 75:
                    m369aO();
                    return;
                case 77:
                    m368aP();
                    return;
                case 78:
                    m322bK();
                    return;
                case 79:
                    m367aQ();
                    return;
                case 86:
                    m321bL();
                    return;
                case 89:
                    return;
                case 90:
                    m366aR();
                    return;
                case 93:
                    m319bN();
                    return;
                case 120:
                    m246P();
                    return;
                case 130:
                    m245Q();
                    return;
                case 140:
                    m109d();
                    return;
                case 150:
                    m125c();
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m281e(int i) {
        try {
            switch (i) {
                case 0:
                case 1:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    m365aS();
                    return;
                case 2:
                    m318bO();
                    return;
                case 3:
                    m364aT();
                    return;
                case 4:
                    m362aV();
                    return;
                case 5:
                    m363aU();
                    return;
                case 6:
                    m361aW();
                    return;
                case 7:
                    m360aX();
                    return;
                case 8:
                    m359aY();
                    return;
                case 9:
                    m358aZ();
                    return;
                case 10:
                    m311ba();
                    return;
                case 11:
                    m310bb();
                    return;
                case 12:
                    return;
                case 13:
                    m308bd();
                    return;
                case 14:
                    m307be();
                    return;
                case 15:
                    m306bf();
                    return;
                case 16:
                    m305bg();
                    return;
                case 17:
                    m304bh();
                    return;
                case 18:
                    m303bi();
                    return;
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 52:
                case 53:
                case 72:
                case 73:
                case 74:
                case 76:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                case 88:
                case 91:
                case 92:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 121:
                case 122:
                case 123:
                case 124:
                case 126:
                case 127:
                case 128:
                case 129:
                case 131:
                case 132:
                case 133:
                case 134:
                case 136:
                case 137:
                case 138:
                case 139:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                default:
                    return;
                case 20:
                    m302bj();
                    return;
                case 27:
                    m301bk();
                    return;
                case 36:
                    m300bl();
                    return;
                case 37:
                    m299bm();
                    return;
                case 38:
                    m317bP();
                    return;
                case 39:
                case 41:
                case 50:
                case 51:
                case 57:
                case 70:
                case 71:
                case 78:
                case 81:
                case 86:
                case 87:
                    m280f(i);
                    return;
                case 40:
                    m316bQ();
                    return;
                case 42:
                case 43:
                    m297bo();
                    return;
                case 44:
                    m296bp();
                    return;
                case 45:
                    m295bq();
                    return;
                case 46:
                    m294br();
                    return;
                case 47:
                    if (((Game) this).Player_Emeralds < 6) {
                        m47m();
                        return;
                    }
                    return;
                case 48:
                    return;
                case 49:
                    m314bS();
                    return;
                case 54:
                    m309bc();
                    return;
                case 55:
                    m293bs();
                    return;
                case 56:
                    m292bt();
                    return;
                case 58:
                    m291bu();
                    return;
                case 59:
                    m290bv();
                    return;
                case 60:
                    m289bw();
                    return;
                case 61:
                    m315bR();
                    return;
                case 62:
                    m288bx();
                    return;
                case 75:
                    m287by();
                    return;
                case 77:
                    m286bz();
                    return;
                case 79:
                    m332bA();
                    return;
                case 89:
                    return;
                case 90:
                    m331bB();
                    return;
                case 93:
                    m312bU();
                    return;
                case 120:
                case 125:
                case 130:
                case 135:
                case 140:
                    m351ah();
                    return;
                case 150:
                    m278g(false);
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ah */
    private void m351ah() {
        m282d(((Game) this).Object_Info);
        if (this.Game_ZoneID == 4) {
            m278g(true);
        }
    }

    /* renamed from: g */
    private void m278g(boolean z) {
        short s;
        short s2;
        for (int i = 0; i < 10; i++) {
            if (((Game) this).f258a[i][2] == 0) {
                if (((Game) this).f258a[i][3] == 0) {
                    s = ((Game) this).f258a[i][0];
                    s2 = ((Game) this).f258a[i][1];
                } else {
                    s = (this.f94S + ((Game) this).f96U) / 100;
                    s2 = ((((Game) this).f95T + ((Game) this).f97V) / 100) + 24;
                }
                short s3 = s2;
                if (!z || Math.abs(((Game) this).f258a[i][0] - ((this.f94S + ((Game) this).f96U) / 100)) <= 32) {
                    Game.m133b(102, 0, 0, 32, 32, 0, s + this.Boss_XPos, s3 + this.Boss_YPos);
                }
            }
        }
    }

    /* renamed from: c */
    private void m285c(int i, int i2, int i3, int i4, int i5) {
        m384a(i, i2, i3, i4, Game.f117a[i][i5]);
    }

    /* renamed from: a */
    private static void m384a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = iArr[4];
        int i7 = iArr[5];
        switch (i4) {
            case 1:
                i5 = Game.f179a[4];
                i6 = -i6;
                break;
            case 2:
                i5 = Game.f179a[6];
                i7 = -i7;
                break;
            case 3:
                i5 = Game.f179a[2];
                i6 = -i6;
                i7 = -i7;
                break;
            default:
                i5 = 0;
                break;
        }
        Game.m214a(i, iArr[0], iArr[1], iArr[2], iArr[3], i5, i2 + ((i6 * 4) / 4), i3 + ((i7 * 4) / 4), 3);
    }

    /* renamed from: d */
    private void m283d(int i, int i2, int i3, int i4, int i5) {
        Actor actor;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        switch (i) {
            case 0:
                if (i5 != 0) {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 2;
                    break;
                } else {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 1;
                    break;
                }
            case 1:
                if (i5 != 0) {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 4;
                    break;
                } else {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 3;
                    break;
                }
            case 2:
                if (i5 != 0) {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 6;
                    break;
                } else {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 1;
                    break;
                }
            case 3:
                actor = this;
                i6 = 120;
                i7 = i2;
                i8 = i3;
                i9 = i4;
                i10 = 6;
                break;
            case 4:
                actor = this;
                i6 = 120;
                i7 = i2;
                i8 = i3;
                i9 = i4;
                i10 = 7;
                break;
            case 5:
                if (i5 != 0) {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 22;
                    break;
                } else {
                    actor = this;
                    i6 = 120;
                    i7 = i2;
                    i8 = i3;
                    i9 = i4;
                    i10 = 21;
                    break;
                }
            case 6:
                actor = this;
                i6 = 120;
                i7 = i2;
                i8 = i3;
                i9 = i4;
                i10 = 0;
                break;
            default:
                return;
        }
        actor.m285c(i6, i7, i8, i9, i10);
    }

    /* renamed from: d */
    private void m284d(int i, int i2, int i3, int i4) {
        int i5 = Game.f117a[120][15][4];
        int i6 = Game.f117a[120][15][5];
        int i7 = this.f92Q;
        int i8 = ((Game) this).f90O / 100;
        if (i3 == 1) {
            i5 = -i5;
        }
        while (i8 < 0) {
            i8 += 360;
        }
        int Math_CalcSine = 180 + ((Game.Math_CalcSine(i8) * 90) / 100);
        if (i7 > 16) {
            m285c(120, i, i2, i3, 15 + ((((Game) this).f226j >> 2) & 1));
        }
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = (i9 + 1) * 16;
            int Math_CalcSine2 = i + ((Game.Math_CalcSine(Math_CalcSine) * i10) / 100) + i5;
            int Math_CalcCosine = i2 + ((Game.Math_CalcCosine(Math_CalcSine) * i10) / 100) + i6;
            if (i7 > 16 + i10) {
                m285c(120, Math_CalcSine2, Math_CalcCosine, 0, 17);
            }
            if (i4 == 2 && Math.abs(i7 - (16 + i10)) < 4) {
                m216a(1, Math_CalcSine2, Math_CalcCosine, 0, 0, 0, 0);
            }
        }
        int Math_CalcSine3 = i + i5 + ((Game.Math_CalcSine(Math_CalcSine) * i7) / 100);
        int Math_CalcCosine2 = i2 + i6 + ((Game.Math_CalcCosine(Math_CalcSine) * i7) / 100);
        if (i4 != 2) {
            m285c(121, Math_CalcSine3, Math_CalcCosine2, 0, 0);
            return;
        }
        int Math_CalcSine4 = i + i5 + ((Game.Math_CalcSine(Math_CalcSine) * 96) / 100);
        int Math_CalcCosine3 = i2 + i6 + ((Game.Math_CalcCosine(Math_CalcSine) * 96) / 100);
        m285c(121, Math_CalcSine4, Math_CalcCosine3, 0, 0);
        if ((((Game) this).f226j & 7) == 4) {
            m216a(1, (Math_CalcSine4 + Game.m123c(48)) - 24, (Math_CalcCosine3 + Game.m123c(48)) - 24, 0, 0, 0, 0);
        }
    }

    /* renamed from: i */
    private void m277i(int i, int i2, int i3) {
        m285c(120, i, i2, i3, 19);
    }

    /* renamed from: j */
    private void m276j(int i, int i2, int i3) {
        m285c(120, i, i2, i3, 19);
    }

    /* renamed from: k */
    private void m275k(int i, int i2, int i3) {
        m285c(120, i, ((i2 + 8) - 32) + this.f92Q, i3, 20);
    }

    /* renamed from: l */
    private void m274l(int i, int i2, int i3) {
        switch (((Game) this).f86K) {
            case 0:
                m284d(i, i2, i3, 0);
                return;
            case 1:
                return;
            case 2:
                m277i(i, i2, i3);
                return;
            case 3:
                m276j(i, i2, i3);
                return;
            case 4:
                m275k(i, i2, i3);
                return;
            case 5:
            default:
                return;
        }
    }

    /* renamed from: m */
    private void m273m(int i, int i2, int i3) {
        switch (((Game) this).f86K) {
            case 0:
                m284d(i, i2, i3, 2);
                return;
            case 1:
                return;
            case 2:
                m277i(i, i2, i3);
                return;
            case 3:
                m276j(i, i2, i3);
                return;
            case 4:
                m275k(i, i2, i3);
                return;
            case 5:
            default:
                return;
        }
    }

    /* renamed from: d */
    private void m282d(int[] iArr) {
        Actor actor;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = (((Game) this).f226j >> 3) & 1;
        int i9 = (((Game) this).f226j >> 2) & 1;
        int i10 = (((Game) this).f226j >> 1) & 1;
        int i11 = ((Game) this).f226j & 1;
        if (((Game) this).f87L < 2) {
            return;
        }
        m112c(iArr);
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = ((Game) this).f88M;
        int i15 = ((Game) this).f89N;
        int i16 = ((((Game) this).f226j & 1) != 0 || ((Game) this).f102aa <= 0) ? 0 : 1;
        switch (i14) {
            case 0:
                m274l(i12, i13, i15);
                m283d(this.f104ac, i12, i13, i15, i9);
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i5 = 8;
                i6 = i16;
                i7 = i5 + i6;
                break;
            case 1:
                m274l(i12, i13, i15);
                m283d(1, i12, i13, i15, i9);
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i7 = 8;
                break;
            case 2:
                m274l(i12, i13, i15);
                m283d(this.f104ac, i12, i13, i15, i9);
                m285c(120, i12, i13, i15, 11 + i11);
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i5 = 8;
                i6 = i16;
                i7 = i5 + i6;
                break;
            case 3:
                m273m(i12, i13, i15);
                m283d(2, i12, i13, i15, i8);
                m285c(120, i12, i13, i15, 8);
                if (i9 != 0) {
                    m216a(1, (i12 + Game.m123c(32)) - 16, ((i13 + Game.m123c(32)) - 16) - 8, 0, 0, 0, 0);
                    return;
                }
                return;
            case 4:
                m285c(120, i12, i13, i15, 7);
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i7 = 8;
                break;
            case 5:
                m283d(0, i12, i13, i15, i9);
                m285c(120, i12, i13, i15, 8);
                if (i10 == 1) {
                    m285c(120, i12, i13, i15, 18);
                }
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i5 = 13;
                i6 = i9;
                i7 = i5 + i6;
                break;
            case 6:
                m283d(0, i12, i13, i15, i9);
                m285c(120, i12, i13, i15, 8);
                if (i10 != 0) {
                    m285c(120, i12, i13, i15, 18);
                }
                actor = this;
                i = 120;
                i2 = i12;
                i3 = i13;
                i4 = i15;
                i5 = 11;
                i6 = i11;
                i7 = i5 + i6;
                break;
            case 7:
            default:
                return;
        }
        actor.m285c(i, i2, i3, i4, i7);
    }

    /* renamed from: a */
    private static boolean m385a(int i, int i2, int i3, int i4) {
        if (i3 == -1 || (0 <= (i - Game.f214y[0]) + i3 && Game.GFX_MenuWidth >= (i - Game.f214y[0]) - i3)) {
            if (i4 != -1) {
                return 0 <= (i2 - Game.f214y[1]) + i4 && 240 >= (i2 - Game.f214y[1]) - i4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ai */
    private void m350ai() {
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (Game.m135b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 8, 8) <= 0 ? !(((Game) this).Object_Info[12] == 0 || Game.m135b(((Game) this).Object_Info[2], ((Game) this).Object_Info[12], ((Game) this).Object_Info[6], ((Game) this).Object_Info[12], 8, 8) < 0 || ((Game) this).Object_Info[5] != 0 || ((Game) this).Object_Info[0] == -1) : !(((Game) this).Object_Info[5] != 0 || ((Game) this).Object_Info[0] == -1)) {
            ((Game) this).Object_Info[5] = 1;
            ((Game) this).Object_Info[10] = ((Game) this).f227k;
            ((Game) this).Player_Rings++;
        }
        if (((Game) this).Object_Info[5] != 1 || ((Game) this).f227k - ((Game) this).Object_Info[10] < 20) {
            return;
        }
        ((Game) this).Object_Info[0] = -1;
        ((Game) this).Object_Info[5] = 0;
    }

    /* renamed from: aj */
    private void m349aj() {
        int i;
        int Math_CalcSine = Game.Math_CalcSine(((Game) this).f226j * 3) * 87;
        int Math_CalcSine2 = Game.Math_CalcSine(((Game) this).Object_Info[6] * 3) * 87;
        ((Game) this).Object_Info[6] = ((Game) this).f226j;
        int i2 = ((Game) this).Object_Info[4] + 1;
        if (((Game) this).Object_Info[4] == 5 || ((Game) this).Object_Info[19] == 1) {
            Math_CalcSine = -Math_CalcSine;
            Math_CalcSine2 = -Math_CalcSine2;
        }
        int i3 = 24;
        int i4 = 8;
        if (this.Game_ZoneID == 3) {
            i3 = 44;
            i4 = 24;
            i = (i2 << 4) + 8;
        } else if (this.Game_ZoneID == 5) {
            i3 = 24;
            i4 = 24;
            i = (i2 << 4) - 24;
        } else {
            i = (i2 << 4) - 8;
        }
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * i) / 100), ((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine / 100)) * i) / 100), ((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine2 / 100)) * i) / 100), ((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine2 / 100)) * i) / 100), i3, i4);
        if (this.Game_ZoneID != 3 && this.Game_ZoneID != 5) {
            if (Actor_CheckPlayerCollide != 0) {
                Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * i) / 100), ((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine / 100)) * i) / 100) + 5, ((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine2 / 100)) * i) / 100), ((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine2 / 100)) * i) / 100) + 5, i3, i4);
            }
            if (Actor_CheckPlayerCollide == 0) {
                Game.Player_Info[1] = ((((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine / 100)) * i) / 100)) - i4) << 8;
                int[] iArr = Game.Player_Info;
                iArr[0] = iArr[0] + ((((Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * i) - (Game.Math_CalcSine(180 + (Math_CalcSine2 / 100)) * i)) << 8) / 100);
                m140b(((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * i) / 100), i3);
                m230a(((Game) this).Object_Info[22]);
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: ak */
    private void m348ak() {
        Actor actor;
        int i = 0;
        boolean z = false;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        int i2 = ((Game) this).f227k - ((Game) this).Object_Info[14];
        ((Game) this).Object_Info[14] = ((Game) this).f227k;
        int i3 = 99;
        int i4 = 0;
        while (true) {
            if (i4 >= 12) {
                break;
            }
            int Actor_CheckCollision = Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 12, Game.f184b[0], Game.f184b[1] - 12, 4, 12, (((Game) this).Object_Info[2] - 96) + (i4 << 4), ((Game) this).Object_Info[3] + ((Game) this).Object_Info[10], (((Game) this).Object_Info[6] - 96) + (i4 << 4), ((Game) this).Object_Info[7] + ((Game) this).Object_Info[10], 8, 8);
            i = Actor_CheckCollision;
            if (Actor_CheckCollision < 0 || i == 3) {
                i4++;
            } else {
                z = true;
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 8) << 8;
                if (Math.abs(Game.Player_RoughXPos() - (((Game) this).Object_Info[2] - 8)) < 999) {
                    i3 = i4;
                    Math.abs(Game.Player_RoughXPos() - ((Game) this).Object_Info[2]);
                }
            }
        }
        if (i3 != 99) {
            Game.Player_Info[1] = ((((Game) this).Object_Info[3] - 8) + ((Game) this).Object_Info[10]) << 8;
            m140b(((Game) this).Object_Info[2], 96);
            m230a(((Game) this).Object_Info[22]);
            ((Game) this).Object_Info[5] = i3;
            int i5 = i3 <= 6 ? i3 : 6 - (i3 % 6);
            int[] iArr = ((Game) this).Object_Info;
            iArr[10] = iArr[10] + i2;
            if (((Game) this).Object_Info[10] >= i5 * 2) {
                ((Game) this).Object_Info[10] = i5 * 2;
            }
            if (i3 == 0 || i3 == 11) {
                actor = this;
                ((Game) actor).Object_Info[10] = 0;
            }
        } else {
            int[] iArr2 = ((Game) this).Object_Info;
            iArr2[10] = iArr2[10] - i2;
            if (((Game) this).Object_Info[10] <= 0) {
                actor = this;
                ((Game) actor).Object_Info[10] = 0;
            }
        }
        if (z) {
            i = 0;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: al */
    private void m347al() {
        for (int i = 0; i < 12; i++) {
            if (((((Game) this).f226j / 10) + (12 - i)) % 7 == 2 && Game.Actor_CheckPlayerCollide((((Game) this).Object_Info[2] - 96) + (i << 4), ((Game) this).Object_Info[3], (((Game) this).Object_Info[2] - 96) + (i << 4), ((Game) this).Object_Info[3], 8, 12) >= 0) {
                Player_Hurt();
                return;
            }
        }
    }

    /* renamed from: am */
    private void m346am() {
        int i = 0;
        int i2 = -1;
        int i3 = -99;
        int i4 = 999;
        boolean z = false;
        if (((Game) this).Object_Info[4] != 0) {
            z = true;
        }
        int i5 = ((Game) this).Object_Info[2];
        if (((Game) this).Object_Info[5] == 0) {
            int length = !z ? Game.f189e.length : -Game.f189e.length;
            int Actor_CheckCollision = Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 12, Game.f184b[0], Game.f184b[1] - 12, 2, 12, ((Game) this).Object_Info[2] - length, (((Game) this).Object_Info[3] - Game.f189e[0]) + 8, ((Game) this).Object_Info[2] - length, (((Game) this).Object_Info[3] - Game.f189e[0]) + 8, 8, 8);
            i2 = Actor_CheckCollision;
            if (Actor_CheckCollision >= 0) {
                Game.Player_Info[1] = (((((Game) this).Object_Info[3] - Game.f189e[0]) + 8) - 8) << 8;
            }
        }
        if (((Game) this).Object_Info[5] != 0) {
            int i6 = 0;
            while (true) {
                if (i6 >= 36) {
                    break;
                } else if (((((Game) this).f227k / 2) - ((Game) this).Object_Info[10]) - ((i6 << 1) + i6) < 0) {
                    i = (i6 / 6) << 3;
                    break;
                } else {
                    if (i6 == 29) {
                        ((Game) this).Object_Info[5] = 2;
                    }
                    i6++;
                }
            }
            if (i >= 48) {
                ((Game) this).Object_Info[5] = 2;
            }
            i5 = ((Game) this).Object_Info[4] != 0 ? ((Game) this).Object_Info[2] - i : ((Game) this).Object_Info[2] + i;
        }
        if (((Game) this).Object_Info[5] != 2) {
            int length2 = Game.f189e.length;
            if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 128, 128) >= 0) {
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        break;
                    }
                    int i8 = !z ? i7 : (length2 - i7) - 1;
                    if ((!z && i <= i7) || (z && length2 - i >= i7)) {
                        if (Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 12, Game.f184b[0], Game.f184b[1] - 12, 2, 12, (((Game) this).Object_Info[2] - length2) + (i7 << 1), ((Game) this).Object_Info[3] - Game.f189e[i8], (((Game) this).Object_Info[2] - length2) + (i7 << 1), ((Game) this).Object_Info[3] - Game.f189e[i8], 1, 1) == 0 && i4 > Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length2) + (i7 << 1)))) {
                            i4 = Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length2) + (i7 << 1)));
                            i3 = i8;
                        }
                        if (i3 != -99 && 8 > Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length2) + (i7 << 1))) && Game.Player_RoughYPos() - (((Game) this).Object_Info[3] - Game.f189e[i8]) > 0 && Game.Player_RoughYPos() - (((Game) this).Object_Info[3] - Game.f189e[i8]) <= 64 && i4 > Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length2) + (i7 << 1)))) {
                            i4 = Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length2) + (i7 << 1)));
                            i3 = i8;
                            break;
                        }
                    }
                    i7++;
                }
            }
            i2 = -1;
            if (i4 != 999) {
                ((Game) this).Object_Info[17] = i3;
                Game.Player_Info[1] = ((((Game) this).Object_Info[3] - Game.f189e[i3]) - 1) << 8;
                if (((Game) this).Object_Info[5] == 0) {
                    ((Game) this).Object_Info[10] = ((Game) this).f227k / 2;
                }
                ((Game) this).Object_Info[5] = 1;
                m140b(i5, !z ? i : length2 - i);
                m230a(((Game) this).Object_Info[22]);
                i2 = 0;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i2 != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
        if (((p000.Game) r13).Object_Info[4] == 42) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020a, code lost:
        if (((p000.Game) r13).Input_Array[4] != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023f, code lost:
        if (((p000.Game) r13).Input_Array[3] != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0242, code lost:
        m26s();
     */
    /* renamed from: an */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m345an() {
        int i;
        int Math_CalcSine;
        int Math_CalcSine2;
        int[] iArr;
        char c;
        int i2;
        int i3 = -1;
        m223a(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
        char c2 = ((Game) this).Object_Info[4] == 21 ? (char) 2 : ((Game) this).Object_Info[4] == 1 ? (char) 0 : (char) 1;
        ((Game) this).Object_Info[17] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[18] = ((Game) this).Object_Info[3];
        if (c2 != 2 && ((Game) this).Object_Info[4] != 32) {
            int[] iArr2 = ((Game) this).Object_Info;
            iArr2[5] = iArr2[5] + 1;
            int i4 = 32;
            if (((Game) this).Object_Info[4] == 35) {
                i = 32;
            } else if (((Game) this).Object_Info[4] == 1) {
                i = 16;
            } else if (((Game) this).Object_Info[4] == 41) {
                i = 16;
            } else {
                if (((Game) this).Object_Info[4] != 34) {
                    if (((Game) this).Object_Info[4] == 43) {
                        i = 32;
                    } else if (((Game) this).Object_Info[4] == 33) {
                        i = 16;
                    }
                }
                i = 24;
            }
            i4 = i;
            if (((Game) this).Object_Info[4] == 3) {
                Math_CalcSine = ((Game) this).Object_Info[18] >> 8;
            } else if (((Game) this).Object_Info[4] != 7) {
                if (((Game) this).Object_Info[4] == 1) {
                    Math_CalcSine2 = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * i4) / 100) - i4;
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    i2 = ((Game) this).Object_Info[9] + 8;
                    iArr[c] = i2 + Math_CalcSine2;
                } else {
                    Math_CalcSine = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * i4) / 100) - i4;
                }
            }
            Math_CalcSine2 = Math_CalcSine;
            iArr = ((Game) this).Object_Info;
            c = 3;
            i2 = ((Game) this).Object_Info[9];
            iArr[c] = i2 + Math_CalcSine2;
        }
        if (c2 == 2) {
            ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9];
        }
        if (c2 == 2 && ((Game) this).Object_Info[13] != 0) {
            ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + 15;
            if (((Game) this).Object_Info[16] == 0) {
                ((Game) this).Object_Info[16] = 1;
            }
        }
        ((Game) this).Object_Info[13] = 0;
        int i5 = 999;
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[17], ((Game) this).Object_Info[18], ((Game) this).f260f[c2], Game.f206d[c2][0]);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - ((Game) this).f260f[c2]) - 12) << 8;
                Game.Player_Info[10] = 0;
                i3 = -99;
            } else if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + ((Game) this).f260f[c2]) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                i3 = -99;
            }
        }
        int length = Game.f206d[c2].length;
        int i6 = Game.f206d[c2][0];
        if (c2 == 2) {
            i6 = 96;
        }
        if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[17], ((Game) this).Object_Info[18], length, i6) >= 0) {
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 12, Game.f184b[0], Game.f184b[1] - 12, 2, 13, (((Game) this).Object_Info[2] - length) + (i7 << 1), ((Game) this).Object_Info[3] - Game.f206d[c2][i7], (((Game) this).Object_Info[17] - length) + (i7 << 1), ((Game) this).Object_Info[18] - Game.f206d[c2][i7], 1, 1) == 0 && i5 > Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length) + (i7 << 1)))) {
                    i5 = Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length) + (i7 << 1)));
                    i3 = i7;
                }
                if (i3 != -99 && 8 >= Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length) + (i7 << 1))) && Game.Player_RoughYPos() - (((Game) this).Object_Info[3] - Game.f206d[c2][i7]) >= -1 && Game.Player_RoughYPos() - (((Game) this).Object_Info[3] - Game.f206d[c2][i7]) <= 64 && i5 > Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length) + (i7 << 1)))) {
                    i5 = Math.abs(Game.Player_RoughXPos() - ((((Game) this).Object_Info[2] - length) + (i7 << 1)));
                    i3 = i7;
                    break;
                }
                i7++;
            }
        }
        boolean z = true;
        if (i5 != 999) {
            Game.Player_Info[1] = ((((Game) this).Object_Info[3] - Game.f206d[c2][i3]) + 4) << 8;
            m140b(((Game) this).Object_Info[2], Game.f206d[c2].length);
            m230a(((Game) this).Object_Info[22]);
            z = false;
            if (c2 == 2) {
                ((Game) this).Object_Info[13] = 1;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && z) {
            ((Game) this).f115s = false;
        }
        if (((Game) this).Object_Info[16] != 0) {
            int[] iArr3 = ((Game) this).Object_Info;
            iArr3[16] = iArr3[16] + 1;
            if (((Game) this).Object_Info[16] == 60) {
                ((Game) this).Object_Info[15] = ((Game) this).f226j - 1;
            }
            if (((Game) this).Object_Info[16] >= 60) {
                for (int i8 = 0; i8 < 8; i8++) {
                    int i9 = ((Game) this).f226j - ((Game) this).Object_Info[15];
                    int i10 = i9;
                    int i11 = i9 - 1;
                    int i12 = i11;
                    if (i11 < 0) {
                        i12 = 0;
                    }
                    if ((i8 << 3) < i10) {
                        int i13 = i8 << 3;
                        i10 = i13;
                        i12 = i13;
                    }
                    if (Game.Actor_CheckPlayerCollide((((Game) this).Object_Info[2] + (i10 << 1)) - 56, ((Game) this).Object_Info[3] - Game.f206d[c2][i10], (((Game) this).Object_Info[17] + (i12 << 1)) - 56, ((Game) this).Object_Info[18] - Game.f206d[c2][i12], 6, 6) >= 0) {
                        Player_Hurt();
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* renamed from: ao */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m344ao() {
        int i;
        int i2;
        int[] iArr;
        char c;
        int i3;
        int[] iArr2;
        char c2;
        int i4;
        int[][] m225a;
        int i5;
        int i6 = 56;
        m120c(((Game) this).Object_Info[8], ((Game) this).Object_Info[9]);
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[4] == 128) {
            if (((Game) this).Object_Info[18] == 0) {
                ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + 112;
            }
            ((Game) this).Object_Info[18] = 1;
            if (((Game) this).f269e[128] || ((Game) this).f269e[129]) {
                if (((Game) this).Object_Info[3] > ((Game) this).Object_Info[9]) {
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 3;
                    i4 = iArr2[3] - 1;
                    iArr2[c2] = i4;
                }
                m225a = m225a(10, 0);
                for (i5 = 0; i5 < m225a.length; i5++) {
                    if ((((Game) this).Object_Info[2] - 56) - (m225a[i5][2] - 16) <= 32 && (((Game) this).Object_Info[2] - 56) - (m225a[i5][2] - 16) >= -112 && ((Game) this).f269e[128] && ((Game) this).Object_Info[3] < ((Game) this).Object_Info[9] + 16) {
                        ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + 16;
                    }
                }
            } else {
                if (((Game) this).Object_Info[3] < ((Game) this).Object_Info[9] + 112) {
                    int[] iArr3 = ((Game) this).Object_Info;
                    iArr3[3] = iArr3[3] + 2;
                    if (((Game) this).Object_Info[3] > ((Game) this).Object_Info[9] + 112) {
                        iArr2 = ((Game) this).Object_Info;
                        c2 = 3;
                        i4 = ((Game) this).Object_Info[9] + 112;
                        iArr2[c2] = i4;
                    }
                }
                m225a = m225a(10, 0);
                while (i5 < m225a.length) {
                }
            }
        } else {
            int i7 = 160;
            if (((Game) this).Object_Info[4] == 17) {
                i6 = 48;
            } else {
                if (((Game) this).Object_Info[4] == 2) {
                    i2 = 56;
                } else if (((Game) this).Object_Info[4] == 35) {
                    i6 = 16;
                    i = 120;
                    i7 = i;
                } else {
                    i2 = ((Game) this).Object_Info[4] == 18 ? 48 : 48;
                }
                i6 = i2;
                i = 80;
                i7 = i;
            }
            if (((Game) this).Object_Info[5] != 0) {
                if (((Game) this).Object_Info[5] < 60) {
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                    i3 = iArr[5] + 1;
                } else if (((Game) this).Object_Info[3] > ((Game) this).Object_Info[9]) {
                    int[] iArr4 = ((Game) this).Object_Info;
                    iArr4[3] = iArr4[3] - 1;
                    if (((Game) this).Object_Info[3] == ((Game) this).Object_Info[9]) {
                        iArr = ((Game) this).Object_Info;
                        c = 5;
                        i3 = 0;
                    }
                }
                iArr[c] = i3;
            } else if (((Game) this).Object_Info[3] < ((Game) this).Object_Info[9] + i7) {
                int[] iArr5 = ((Game) this).Object_Info;
                iArr5[3] = iArr5[3] + 4;
                if (((Game) this).Object_Info[3] >= ((Game) this).Object_Info[9] + i7) {
                    ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + i7;
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                    i3 = 1;
                    iArr[c] = i3;
                }
            }
        }
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[7], i6, 12);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 0) {
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 12) << 8;
                m140b(((Game) this).Object_Info[2], i6);
                m230a(((Game) this).Object_Info[22]);
                if (((Game) this).Object_Info[3] - 24 < ((Game) this).Object_Info[9]) {
                    m269B();
                }
            } else if (Actor_CheckPlayerCollide == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i6) - 12) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[4]) {
                    m26s();
                }
            } else if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i6) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[3]) {
                    m26s();
                }
            } else if (Actor_CheckPlayerCollide == 3) {
                m269B();
                Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 12) + 12) + 12) + 1) << 8;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
        if (((Game) this).Object_Info[4] == 35 || Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 32, ((Game) this).Object_Info[2], ((Game) this).Object_Info[7] + 32, 40, 14) < 0) {
            return;
        }
        Player_Hurt();
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034e  */
    /* renamed from: ap */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m343ap() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int[] iArr3;
        char c3;
        int[] iArr4;
        char c4;
        int i2;
        int[] iArr5;
        char c5;
        int i3;
        Actor actor;
        int[] iArr6;
        char c6;
        int i4;
        int i5 = 20;
        int i6 = 14;
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        ((Game) this).Object_Info[15] = ((Game) this).Object_Info[2];
        int i7 = ((Game) this).Object_Info[4];
        if (i7 == 64) {
            i5 = 64;
        } else if (i7 == 16) {
            i5 = 16;
            i6 = 19;
        }
        if (i7 == 48) {
            i5 = 30;
        } else {
            if (i7 == 18) {
                i5 = 14;
                i6 = 20;
                int[] iArr7 = ((Game) this).Object_Info;
                iArr7[6] = iArr7[6] + 1;
                ((Game) this).Object_Info[5] = ((Game) this).Object_Info[6];
                if (((Game) this).Object_Info[6] < 60) {
                    iArr5 = ((Game) this).Object_Info;
                    c5 = 5;
                } else {
                    if (((Game) this).Object_Info[6] < 68) {
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 5;
                        i3 = ((Game) this).Object_Info[6] - 60;
                    } else if (((Game) this).Object_Info[6] < 128) {
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 5;
                        i3 = 8;
                    } else if (((Game) this).Object_Info[6] < 136) {
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 5;
                        i3 = 136 - ((Game) this).Object_Info[6];
                    } else {
                        ((Game) this).Object_Info[5] = 0;
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 6;
                    }
                    iArr5[c5] = i3;
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 2;
                    iArr3 = ((Game) this).Object_Info;
                    c3 = '\b';
                }
                i3 = 0;
                iArr5[c5] = i3;
                iArr2 = ((Game) this).Object_Info;
                c2 = 2;
                iArr3 = ((Game) this).Object_Info;
                c3 = '\b';
            } else if (i7 == 32) {
                i5 = 8;
                i6 = 18;
            } else if (i7 == 82) {
                i5 = 20;
                i6 = 6;
                int[] iArr8 = ((Game) this).Object_Info;
                iArr8[6] = iArr8[6] + 1;
                ((Game) this).Object_Info[5] = ((Game) this).Object_Info[6];
                if (((Game) this).Object_Info[6] < 60) {
                    iArr4 = ((Game) this).Object_Info;
                    c4 = 5;
                } else {
                    if (((Game) this).Object_Info[6] < 68) {
                        iArr4 = ((Game) this).Object_Info;
                        c4 = 5;
                        i2 = ((Game) this).Object_Info[6] - 60;
                    } else if (((Game) this).Object_Info[6] < 128) {
                        iArr4 = ((Game) this).Object_Info;
                        c4 = 5;
                        i2 = 8;
                    } else if (((Game) this).Object_Info[6] < 136) {
                        iArr4 = ((Game) this).Object_Info;
                        c4 = 5;
                        i2 = 136 - ((Game) this).Object_Info[6];
                    } else {
                        ((Game) this).Object_Info[5] = 0;
                        iArr4 = ((Game) this).Object_Info;
                        c4 = 6;
                    }
                    iArr4[c4] = i2;
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 2;
                    iArr3 = ((Game) this).Object_Info;
                    c3 = '\b';
                }
                i2 = 0;
                iArr4[c4] = i2;
                iArr2 = ((Game) this).Object_Info;
                c2 = 2;
                iArr3 = ((Game) this).Object_Info;
                c3 = '\b';
            } else if (i7 == 1) {
                i5 = 20;
                int[] iArr9 = ((Game) this).Object_Info;
                iArr9[6] = iArr9[6] + 1;
                ((Game) this).Object_Info[5] = ((Game) this).Object_Info[6];
                if (((Game) this).Object_Info[6] < 60) {
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                } else {
                    if (((Game) this).Object_Info[6] < 68) {
                        iArr = ((Game) this).Object_Info;
                        c = 5;
                        i = ((Game) this).Object_Info[6] - 60;
                    } else if (((Game) this).Object_Info[6] < 128) {
                        iArr = ((Game) this).Object_Info;
                        c = 5;
                        i = 8;
                    } else if (((Game) this).Object_Info[6] < 136) {
                        iArr = ((Game) this).Object_Info;
                        c = 5;
                        i = 136 - ((Game) this).Object_Info[6];
                    } else {
                        ((Game) this).Object_Info[5] = 0;
                        iArr = ((Game) this).Object_Info;
                        c = 6;
                    }
                    iArr[c] = i;
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 3;
                    iArr3 = ((Game) this).Object_Info;
                    c3 = '\t';
                }
                i = 0;
                iArr[c] = i;
                iArr2 = ((Game) this).Object_Info;
                c2 = 3;
                iArr3 = ((Game) this).Object_Info;
                c3 = '\t';
            }
            iArr2[c2] = (iArr3[c3] - (((Game) this).Object_Info[5] << 2)) + 32;
        }
        boolean z = false;
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[15], ((Game) this).Object_Info[7], i5, i6);
        if (Actor_CheckPlayerCollide >= 0) {
            if (((Game) this).Object_Info[4] == 82 || ((Game) this).Object_Info[4] == 18 || ((Game) this).Object_Info[4] == 16) {
                if (Actor_CheckPlayerCollide == 1 || Actor_CheckPlayerCollide == 2) {
                    actor = this;
                    actor.Player_Hurt();
                    z = true;
                }
                if (Actor_CheckPlayerCollide != 0) {
                    Game.Player_Info[1] = (((Game) this).Object_Info[3] - i6) << 8;
                    m140b(((Game) this).Object_Info[2], i5);
                    m230a(((Game) this).Object_Info[22]);
                    if (m226a(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 32)) {
                        if (Game.Player_Info[12] == 0) {
                            iArr6 = Game.Player_Info;
                            c6 = 0;
                            i4 = ((((Game) this).Object_Info[2] - i5) - 12) << 8;
                        } else {
                            iArr6 = Game.Player_Info;
                            c6 = 0;
                            i4 = (((((Game) this).Object_Info[2] + i5) + 12) + 1) << 8;
                        }
                        iArr6[c6] = i4;
                    }
                } else if (Actor_CheckPlayerCollide == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i5) - 12) << 8;
                    Game.Player_Info[10] = 0;
                    if (!z && ((Game) this).Input_Array[4]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i5) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (z && ((Game) this).Input_Array[3]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 3) {
                    Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + i6) + 12) + 12) + 1) << 8;
                    if (Game.Player_Info[5] < 0) {
                        Game.Player_Info[5] = 0;
                    }
                    if (this.Game_ZoneID == 0) {
                        iArr6 = Game.Player_Info;
                        c6 = 1;
                        i4 = iArr6[1] + 4096;
                        iArr6[c6] = i4;
                    }
                }
            } else {
                if ((Actor_CheckPlayerCollide == 0 && ((Game) this).Object_Info[19] == 0) || (Actor_CheckPlayerCollide == 3 && ((Game) this).Object_Info[19] != 0)) {
                    actor = this;
                    actor.Player_Hurt();
                    z = true;
                }
                if (Actor_CheckPlayerCollide != 0) {
                }
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e1  */
    /* renamed from: aq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m342aq() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int Actor_CheckPlayerCollide;
        int[] iArr2;
        char c2;
        int i3;
        int[][] m225a;
        int i4;
        int[][] m225a2;
        int i5;
        int i6 = -1;
        boolean z = false;
        ((Game) this).Object_Info[15] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[16] = ((Game) this).Object_Info[3];
        int i7 = ((Game) this).Object_Info[4] == 129 ? 64 : 16;
        int i8 = ((Game) this).Object_Info[2];
        if (((Game) this).Object_Info[5] != 0 && ((Game) this).Object_Info[10] == 0) {
            int[] iArr3 = ((Game) this).Object_Info;
            iArr3[3] = iArr3[3] + 2;
            if (m139b((((Game) this).Object_Info[2] - i7) + 1, ((Game) this).Object_Info[3] + 16) || m139b((((Game) this).Object_Info[2] + i7) - 1, ((Game) this).Object_Info[3] + 16)) {
                ((Game) this).Object_Info[5] = 0;
                if (((Game) this).Object_Info[4] == 0) {
                    ((Game) this).Object_Info[6] = 1;
                }
            }
        }
        int i9 = 0;
        while (true) {
            if (i9 >= 4) {
                break;
            }
            if (((Game) this).Object_Info[8] == Game.f190g[i9] && ((Game) this).Object_Info[9] == Game.f191h[i9]) {
                i6 = i9;
                break;
            }
            i9++;
        }
        if (((Game) this).Object_Info[5] == 0 && i6 != -1 && ((Game) this).Object_Info[10] == 0 && Math.abs(((Game) this).Object_Info[2] - Game.f192i[i6]) <= 16 && Math.abs(((Game) this).Object_Info[3] - Game.f193j[i6]) <= 16) {
            ((Game) this).Object_Info[10] = 1;
        }
        if (((Game) this).Object_Info[17] == 0 && ((Game) this).Object_Info[10] > 0 && ((Game) this).Object_Info[3] < Game.f193j[i6]) {
            int[] iArr4 = ((Game) this).Object_Info;
            iArr4[3] = iArr4[3] + 2;
            if (((Game) this).Object_Info[3] > Game.f193j[i6]) {
                ((Game) this).Object_Info[3] = Game.f193j[i6];
            }
        }
        if (((Game) this).Object_Info[17] == 0) {
            if (((Game) this).Object_Info[10] < 1 || ((Game) this).Object_Info[10] >= 15) {
                if (((Game) this).Object_Info[10] != 15) {
                    if (((Game) this).Object_Info[10] >= 16) {
                        int[] iArr5 = ((Game) this).Object_Info;
                        iArr5[10] = iArr5[10] + 1;
                        if (((Game) this).Object_Info[10] >= 46 && ((Game) this).Object_Info[10] - 48 <= 96 && ((Game) this).Object_Info[10] % 2 == 0) {
                            iArr = ((Game) this).Object_Info;
                            c = 3;
                            i = iArr[3];
                            i2 = 1;
                        }
                    }
                    ((Game) this).Object_Info[17] = 0;
                    if (((Game) this).Object_Info[4] != 129 && this.Game_ZoneID == 2) {
                        if (this.Game_ZoneID == 2 && this.Game_ActID == 0 && ((Game) this).Object_Info[4] == 0) {
                            m225a = m225a(8, 128);
                            for (i4 = 0; i4 < m225a.length; i4++) {
                                if ((m225a[i4][2] - 56) - (((Game) this).Object_Info[2] - 16) <= 32 && (m225a[i4][2] - 56) - (((Game) this).Object_Info[2] - 16) >= -112) {
                                    ((Game) this).Object_Info[3] = m225a[i4][3] - 28;
                                }
                            }
                            m225a2 = m225a(15, 128);
                            ((Game) this).f269e[129] = false;
                            for (i5 = 0; i5 < m225a2.length; i5++) {
                                if ((m225a2[i5][2] - 8) - (((Game) this).Object_Info[2] - 16) <= 32 && (m225a2[i5][2] - 8) - (((Game) this).Object_Info[2] - 16) >= -32 && (m225a2[i5][3] - 8) - (((Game) this).Object_Info[3] - 16) <= 32 && (m225a2[i5][3] - 8) - (((Game) this).Object_Info[3] - 16) >= -32) {
                                    ((Game) this).f269e[129] = true;
                                    ((Game) this).f261b[129] = true;
                                }
                            }
                        }
                        if (((Game) this).Object_Info[4] != 0) {
                            int[][] m225a3 = m225a(9, 16);
                            for (int i10 = 0; i10 < m225a3.length; i10++) {
                                if ((m225a3[i10][2] - 20) - (((Game) this).Object_Info[2] - 16) <= 32 && (m225a3[i10][2] - 20) - (((Game) this).Object_Info[2] - 16) >= -40 && (m225a3[i10][3] - 20) - (((Game) this).Object_Info[3] - 16) <= 32 && (m225a3[i10][3] - 20) - (((Game) this).Object_Info[3] - 16) >= -40 && ((Game) this).Object_Info[10] == 15) {
                                    ((Game) this).Object_Info[10] = 16;
                                }
                            }
                        }
                        if (((Game) this).Object_Info[4] == 2) {
                            int[][] m225a4 = m225a(77, 16);
                            int i11 = 0;
                            while (true) {
                                if (i11 >= m225a4.length) {
                                    break;
                                }
                                if (((m225a4[i11][2] - 20) - 64) - (((Game) this).Object_Info[2] - 16) <= 32 && ((m225a4[i11][2] - 20) - 64) - (((Game) this).Object_Info[2] - 16) >= -112 && (((m225a4[i11][3] - 48) + 16) - 16) - (((Game) this).Object_Info[3] - 16) <= 32 && (((m225a4[i11][3] - 48) + 16) - 16) - (((Game) this).Object_Info[3] - 16) >= -32 && m225a4[i11][5] > 1 && m225a4[i11][5] / 4 < 26) {
                                    ((Game) this).Object_Info[3] = ((m225a4[i11][3] - 48) + 16) - 16;
                                    ((Game) this).Object_Info[18] = (m225a4[i11][2] - 10) + 16;
                                    ((Game) this).Object_Info[17] = 1;
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    int i12 = i8 - ((Game) this).Object_Info[2];
                    Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[15], ((Game) this).Object_Info[16], i7, 16);
                    if (Actor_CheckPlayerCollide >= 0) {
                        if (Actor_CheckPlayerCollide == 0) {
                            int Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 16, ((Game) this).Object_Info[15], ((Game) this).Object_Info[16] - 16, i7, 2);
                            if (Actor_CheckPlayerCollide2 == 1) {
                                if (((((Game) this).Input_Array[4] && ((Game) this).Object_Info[5] == 0) || ((Game) this).Object_Info[4] == 129 || ((Game) this).Object_Info[4] == 0) && ((Game) this).Object_Info[10] == 0) {
                                    int[] iArr6 = ((Game) this).Object_Info;
                                    iArr6[2] = iArr6[2] + 1;
                                    if (m139b(((Game) this).Object_Info[2] + i7, ((Game) this).Object_Info[3] - 16)) {
                                        iArr2 = ((Game) this).Object_Info;
                                        c2 = 2;
                                        i3 = iArr2[2] - 1;
                                        iArr2[c2] = i3;
                                    }
                                }
                                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 16) << 8;
                                m140b(((Game) this).Object_Info[2], i7);
                                m230a(((Game) this).Object_Info[22]);
                                z = true;
                                int[] iArr7 = Game.Player_Info;
                                iArr7[0] = iArr7[0] - (i12 << 8);
                            } else {
                                if (Actor_CheckPlayerCollide2 == 2 && (((((Game) this).Input_Array[3] && ((Game) this).Object_Info[5] == 0) || ((Game) this).Object_Info[4] == 129 || ((Game) this).Object_Info[4] == 0) && ((Game) this).Object_Info[10] == 0)) {
                                    int[] iArr8 = ((Game) this).Object_Info;
                                    iArr8[2] = iArr8[2] - 1;
                                    if (m139b(((Game) this).Object_Info[2] - i7, ((Game) this).Object_Info[3] - 16)) {
                                        iArr2 = ((Game) this).Object_Info;
                                        c2 = 2;
                                        i3 = iArr2[2] + 1;
                                        iArr2[c2] = i3;
                                    }
                                }
                                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 16) << 8;
                                m140b(((Game) this).Object_Info[2], i7);
                                m230a(((Game) this).Object_Info[22]);
                                z = true;
                                int[] iArr72 = Game.Player_Info;
                                iArr72[0] = iArr72[0] - (i12 << 8);
                            }
                        }
                        if (Actor_CheckPlayerCollide == 1) {
                            if (((Game) this).Input_Array[4] && (((Game) this).Object_Info[5] == 0 || ((Game) this).Object_Info[4] == 129 || ((Game) this).Object_Info[4] == 0)) {
                                if (((Game) this).Object_Info[10] == 0) {
                                    int[] iArr9 = ((Game) this).Object_Info;
                                    iArr9[2] = iArr9[2] + 1;
                                    ((Game) this).Object_Info[7] = 1;
                                    if (m139b(((Game) this).Object_Info[2] + i7, (((Game) this).Object_Info[3] + 16) - 1)) {
                                        int[] iArr10 = ((Game) this).Object_Info;
                                        iArr10[2] = iArr10[2] - 1;
                                    }
                                    if (((Game) this).Object_Info[4] == 129 && ((Game) this).Object_Info[2] > ((Game) this).Object_Info[8] + 64) {
                                        ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] + 64;
                                    }
                                }
                                m26s();
                            }
                            Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i7) - 12) << 8;
                            Game.Player_Info[10] = 0;
                        }
                        if (Actor_CheckPlayerCollide == 2) {
                            if (((Game) this).Input_Array[3] && (((Game) this).Object_Info[5] == 0 || ((Game) this).Object_Info[4] == 129 || ((Game) this).Object_Info[4] == 0)) {
                                if (((Game) this).Object_Info[10] == 0) {
                                    int[] iArr11 = ((Game) this).Object_Info;
                                    iArr11[2] = iArr11[2] - 1;
                                    ((Game) this).Object_Info[7] = -1;
                                    if (m139b(((Game) this).Object_Info[2] - i7, (((Game) this).Object_Info[3] + 16) - 1)) {
                                        int[] iArr12 = ((Game) this).Object_Info;
                                        iArr12[2] = iArr12[2] + 1;
                                    }
                                }
                                m26s();
                            }
                            Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i7) + 12) + 1) << 8;
                            Game.Player_Info[10] = 0;
                        }
                        if (Actor_CheckPlayerCollide == 3) {
                            Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 16) + 12) + 12) + 1) << 8;
                            m269B();
                        }
                    }
                    if (!m139b((((Game) this).Object_Info[2] - i7) + 1, ((Game) this).Object_Info[3] + 16) && !m139b((((Game) this).Object_Info[2] + i7) - 1, ((Game) this).Object_Info[3] + 16)) {
                        int[] iArr13 = ((Game) this).Object_Info;
                        iArr13[5] = iArr13[5] + 1;
                    }
                    if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
                        ((Game) this).f115s = false;
                    }
                    if (z) {
                        m82f(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
                        return;
                    } else {
                        m103d(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
                        return;
                    }
                }
                iArr = ((Game) this).Object_Info;
                c = 2;
                i = iArr[2];
                i2 = Game.f194k[i6];
            } else {
                iArr = ((Game) this).Object_Info;
                c = '\n';
                i = iArr[10];
                i2 = 1;
            }
        } else if (Game.f194k[i6] >= 0) {
            ((Game) this).Object_Info[17] = 0;
            if (((Game) this).Object_Info[4] != 129) {
                if (this.Game_ZoneID == 2) {
                    m225a = m225a(8, 128);
                    while (i4 < m225a.length) {
                    }
                    m225a2 = m225a(15, 128);
                    ((Game) this).f269e[129] = false;
                    while (i5 < m225a2.length) {
                    }
                }
                if (((Game) this).Object_Info[4] != 0) {
                }
                if (((Game) this).Object_Info[4] == 2) {
                }
            }
            int i122 = i8 - ((Game) this).Object_Info[2];
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[15], ((Game) this).Object_Info[16], i7, 16);
            if (Actor_CheckPlayerCollide >= 0) {
            }
            if (!m139b((((Game) this).Object_Info[2] - i7) + 1, ((Game) this).Object_Info[3] + 16)) {
                int[] iArr132 = ((Game) this).Object_Info;
                iArr132[5] = iArr132[5] + 1;
            }
            if (((Game) this).f115s) {
                ((Game) this).f115s = false;
            }
            if (z) {
            }
        } else {
            ((Game) this).Object_Info[17] = 0;
            if (((Game) this).Object_Info[4] != 129) {
            }
            int i1222 = i8 - ((Game) this).Object_Info[2];
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[15], ((Game) this).Object_Info[16], i7, 16);
            if (Actor_CheckPlayerCollide >= 0) {
            }
            if (!m139b((((Game) this).Object_Info[2] - i7) + 1, ((Game) this).Object_Info[3] + 16)) {
            }
            if (((Game) this).f115s) {
            }
            if (z) {
            }
        }
        iArr[c] = i + i2;
        ((Game) this).Object_Info[17] = 0;
        if (((Game) this).Object_Info[4] != 129) {
        }
        int i12222 = i8 - ((Game) this).Object_Info[2];
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[15], ((Game) this).Object_Info[16], i7, 16);
        if (Actor_CheckPlayerCollide >= 0) {
        }
        if (!m139b((((Game) this).Object_Info[2] - i7) + 1, ((Game) this).Object_Info[3] + 16)) {
        }
        if (((Game) this).f115s) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ee, code lost:
        if (((p000.Game) r7).Input_Array[4] != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021c, code lost:
        if (((p000.Game) r7).Input_Array[3] != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0287, code lost:
        if (((p000.Game) r7).Input_Array[4] != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b0, code lost:
        if (((p000.Game) r7).Input_Array[3] != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02b3, code lost:
        m26s();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ar */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m341ar() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int Math_CalcSine;
        int Actor_CheckPlayerCollide;
        m138b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
        if (((Game) this).Object_Info[4] != 2 && ((Game) this).Object_Info[4] != 10) {
            if (((Game) this).Object_Info[4] == 1) {
                ((Game) this).Object_Info[3] = (((Game) this).Object_Info[9] + ((Game.Math_CalcSine(((Game) this).Object_Info[5]) << 3) / 100)) - 8;
                iArr = ((Game) this).Object_Info;
                c = 5;
                Math_CalcSine = iArr[5];
                i = Math_CalcSine + 6;
            }
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16);
            if (Actor_CheckPlayerCollide >= 0) {
            }
            if (((Game) this).f115s) {
                return;
            }
            return;
        } else if (((Game) this).Object_Info[5] != 2) {
            if (((Game) this).Object_Info[5] == 1) {
                int[] iArr3 = ((Game) this).Object_Info;
                iArr3[10] = iArr3[10] + 1;
                int[] iArr4 = ((Game) this).Object_Info;
                iArr4[3] = iArr4[3] + ((Game) this).Object_Info[10];
                if (m139b((((Game) this).Object_Info[2] - 16) + 1, ((Game) this).Object_Info[3] + 16) || m139b((((Game) this).Object_Info[2] + 16) - 1, ((Game) this).Object_Info[3] + 16)) {
                    if ((((Game) this).Object_Info[8] == 4016 && ((Game) this).Object_Info[9] == 1296) || (((Game) this).Object_Info[8] == 3920 && ((Game) this).Object_Info[9] == 1328)) {
                        iArr2 = ((Game) this).Object_Info;
                        c2 = 5;
                        i2 = 0;
                    } else {
                        iArr2 = ((Game) this).Object_Info;
                        c2 = 5;
                        i2 = 2;
                    }
                    iArr2[c2] = i2;
                    int[] iArr5 = ((Game) this).Object_Info;
                    iArr5[3] = iArr5[3] - ((((Game) this).Object_Info[3] + 16) % 16);
                    iArr = ((Game) this).Object_Info;
                    c = 11;
                    i = ((Game) this).Object_Info[3];
                }
            } else if (((Game) this).Object_Info[3] < Game.Player_RoughYPos() && ((Game) this).Object_Info[2] - 100 < Game.Player_RoughXPos()) {
                ((Game) this).Object_Info[10] = 1;
                iArr = ((Game) this).Object_Info;
                c = 5;
                i = 1;
            }
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16);
            if (Actor_CheckPlayerCollide >= 0) {
                if (Actor_CheckPlayerCollide == 0) {
                    Game.Player_Info[1] = (((Game) this).Object_Info[3] - 16) << 8;
                    m140b(((Game) this).Object_Info[2], 16);
                    m230a(((Game) this).Object_Info[22]);
                } else if (Actor_CheckPlayerCollide == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 16) - 12) << 8;
                    Game.Player_Info[10] = 0;
                } else if (Actor_CheckPlayerCollide == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 16) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                } else if (Actor_CheckPlayerCollide == 3) {
                    Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 16) + 12) + 12) + 1) << 8;
                    m269B();
                } else if (Actor_CheckPlayerCollide == 4 && this.f116ag != ((Game) this).Object_Info[20]) {
                    if (Game.Player_RoughXPos() < ((Game) this).Object_Info[2]) {
                        Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 16) - 12) << 8;
                        Game.Player_Info[10] = 0;
                    } else {
                        Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 16) + 12) + 1) << 8;
                        Game.Player_Info[10] = 0;
                    }
                }
            }
            if (((Game) this).f115s || this.f116ag != ((Game) this).Object_Info[20] || Actor_CheckPlayerCollide == 0) {
                return;
            }
            ((Game) this).f115s = false;
            return;
        } else {
            iArr = ((Game) this).Object_Info;
            c = 3;
            Math_CalcSine = ((Game) this).Object_Info[11] + ((Game.Math_CalcSine(((Game) this).f227k) * 6) / 100);
            i = Math_CalcSine + 6;
        }
        iArr[c] = i;
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16);
        if (Actor_CheckPlayerCollide >= 0) {
        }
        if (((Game) this).f115s) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e5  */
    /* renamed from: as */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m340as() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int i3;
        int i4;
        int[] iArr3;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int Actor_CheckPlayerCollide;
        int[] iArr4;
        char c4;
        int i9;
        int i10;
        int i11;
        int i12 = 48;
        int i13 = 16;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        if (((Game) this).Object_Info[4] != 57) {
            i11 = ((Game) this).Object_Info[4] == 40 ? 32 : 32;
            ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
            ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
            if (((Game) this).Object_Info[4] != 7 || ((Game) this).Object_Info[4] == 4) {
                i12 = 16;
                i13 = 8;
                if (((Game) this).Object_Info[10] != 1) {
                    int i16 = ((Game) this).Object_Info[2];
                    int[] iArr5 = ((Game) this).Object_Info;
                    iArr5[2] = iArr5[2] + 1;
                    if (((Game) this).Object_Info[4] == 7) {
                        if (m139b(((Game) this).Object_Info[2] + 16, ((((Game) this).Object_Info[3] + 8) - 1) - 16)) {
                            iArr = ((Game) this).Object_Info;
                            c = 2;
                            i = iArr[2] - 1;
                            iArr[c] = i;
                            ((Game) this).Object_Info[10] = 2;
                        }
                        i15 = i16 - ((Game) this).Object_Info[2];
                    } else {
                        if (Math.abs(((Game) this).Object_Info[2] - ((Game) this).Object_Info[8]) >= 96) {
                            iArr = ((Game) this).Object_Info;
                            c = 2;
                            i = ((Game) this).Object_Info[8] + 96;
                            iArr[c] = i;
                            ((Game) this).Object_Info[10] = 2;
                        }
                        i15 = i16 - ((Game) this).Object_Info[2];
                    }
                } else if (((Game) this).Object_Info[10] == 2) {
                    int[] iArr6 = ((Game) this).Object_Info;
                    iArr6[3] = iArr6[3] + 5;
                    if (m139b((((Game) this).Object_Info[2] - 16) + 1, ((Game) this).Object_Info[3] + 8) || m139b((((Game) this).Object_Info[2] + 16) - 1, ((Game) this).Object_Info[3] + 8)) {
                        ((Game) this).Object_Info[5] = 0;
                        int[] iArr7 = ((Game) this).Object_Info;
                        iArr7[3] = iArr7[3] - ((((Game) this).Object_Info[3] + 8) % 16);
                        ((Game) this).Object_Info[10] = 3;
                    }
                }
            }
            if (((Game) this).Object_Info[4] != 1) {
                i12 = 16;
                i13 = 16;
                int i17 = ((Game) this).Object_Info[2];
                if (((Game) this).f227k % 384 <= 144) {
                    iArr4 = ((Game) this).Object_Info;
                    c4 = 2;
                    i9 = ((Game) this).Object_Info[8];
                    i10 = (((Game) this).f227k % 384) / 3;
                } else {
                    if (((Game) this).f227k % 384 > 240) {
                        iArr4 = ((Game) this).Object_Info;
                        c4 = 2;
                        i9 = ((Game) this).Object_Info[8];
                        i10 = 48 - (((((Game) this).f227k % 384) / 3) - 80);
                    }
                    i15 = i17 - ((Game) this).Object_Info[2];
                }
                iArr4[c4] = i9 - i10;
                i15 = i17 - ((Game) this).Object_Info[2];
            } else if (((Game) this).Object_Info[4] == 2) {
                i12 = 16;
                i13 = 16;
                ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + 9;
                if (((Game) this).Object_Info[10] != 0) {
                    int i18 = ((Game) this).Object_Info[2];
                    int[] iArr8 = ((Game) this).Object_Info;
                    iArr8[2] = iArr8[2] + 1;
                    if (m139b(((Game) this).Object_Info[2] + 16, ((((Game) this).Object_Info[3] + 16) - 1) - 16)) {
                        int[] iArr9 = ((Game) this).Object_Info;
                        iArr9[2] = iArr9[2] - 1;
                    }
                    i15 = i18 - ((Game) this).Object_Info[2];
                }
            } else if (((Game) this).Object_Info[4] == 65) {
                int i19 = ((Game) this).Object_Info[2];
                ((Game) this).Object_Info[2] = ((((Game) this).Object_Info[8] + ((Game.Math_CalcSine(((Game) this).f227k) * 48) / 100)) - 32) - 48;
                ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + 8;
                i14 = 32;
                i12 = 47;
                i15 = i19 - ((Game) this).Object_Info[2];
            } else if (((Game) this).Object_Info[4] == 57) {
                if (((Game) this).Object_Info[10] != 0) {
                    int[] iArr10 = ((Game) this).Object_Info;
                    iArr10[10] = iArr10[10] + 1;
                }
                if (((Game) this).Object_Info[10] > 5) {
                    int i20 = ((Game) this).Object_Info[2];
                    if (((Game) this).Object_Info[19] == 0) {
                        if (((Game) this).f227k - ((Game) this).Object_Info[11] <= 32) {
                            iArr3 = ((Game) this).Object_Info;
                            c3 = 2;
                            i7 = ((Game) this).Object_Info[8] + ((((Game) this).f227k - ((Game) this).Object_Info[11]) << 2);
                        } else {
                            if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 500 && ((Game) this).f227k - ((Game) this).Object_Info[11] < 532) {
                                iArr3 = ((Game) this).Object_Info;
                                c3 = 2;
                                i7 = ((Game) this).Object_Info[8] + (128 - (((((Game) this).f227k - ((Game) this).Object_Info[11]) - 500) << 2));
                            }
                            if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 532) {
                                ((Game) this).Object_Info[10] = 0;
                                ((Game) this).Object_Info[11] = 0;
                                ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8];
                            }
                            i15 = i20 - ((Game) this).Object_Info[2];
                        }
                        iArr3[c3] = i7;
                        if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 532) {
                        }
                        i15 = i20 - ((Game) this).Object_Info[2];
                    } else {
                        if (((Game) this).f227k - ((Game) this).Object_Info[11] <= 32) {
                            iArr3 = ((Game) this).Object_Info;
                            c3 = 2;
                            i5 = ((Game) this).Object_Info[8];
                            i6 = (((Game) this).f227k - ((Game) this).Object_Info[11]) << 2;
                        } else {
                            if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 500 && ((Game) this).f227k - ((Game) this).Object_Info[11] < 532) {
                                iArr3 = ((Game) this).Object_Info;
                                c3 = 2;
                                i5 = ((Game) this).Object_Info[8];
                                i6 = 128 - (((((Game) this).f227k - ((Game) this).Object_Info[11]) - 500) << 2);
                            }
                            if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 532) {
                            }
                            i15 = i20 - ((Game) this).Object_Info[2];
                        }
                        i7 = i5 - i6;
                        iArr3[c3] = i7;
                        if (((Game) this).f227k - ((Game) this).Object_Info[11] >= 532) {
                        }
                        i15 = i20 - ((Game) this).Object_Info[2];
                    }
                } else {
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 2;
                    i4 = ((Game) this).Object_Info[8];
                    iArr2[c2] = i4;
                }
            } else if (((Game) this).Object_Info[4] == 40) {
                if ((((Game) this).f227k >> 1) % 256 < 128) {
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 3;
                    i2 = ((Game) this).Object_Info[9];
                    i3 = (((Game) this).f227k >> 1) % 256;
                } else {
                    iArr2 = ((Game) this).Object_Info;
                    c2 = 3;
                    i2 = ((Game) this).Object_Info[9];
                    i3 = 128 - (((((Game) this).f227k >>> 1) % 256) - 128);
                }
                i4 = i2 - i3;
                iArr2[c2] = i4;
            }
            i8 = -1;
            if ((((Game) this).Object_Info[4] != 7 && ((Game) this).Object_Info[4] != 4) || ((Game) this).Object_Info[5] != 0) {
                Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] + i14, ((Game) this).Object_Info[3] + 0, ((Game) this).Object_Info[6] + i14, ((Game) this).Object_Info[7] + 0, i12, i13);
                i8 = Actor_CheckPlayerCollide;
                if (Actor_CheckPlayerCollide >= 0 && i8 == 0) {
                    Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i13) + 0) << 8;
                    if (((Game) this).Object_Info[4] != 2 || ((Game) this).Object_Info[4] == 1 || ((Game) this).Object_Info[4] == 65) {
                        if (((Game) this).Object_Info[10] == 0) {
                            ((Game) this).Object_Info[10] = 1;
                            ((Game) this).Object_Info[11] = ((Game) this).f227k;
                        }
                        int[] iArr11 = Game.Player_Info;
                        iArr11[0] = iArr11[0] - (i15 << 8);
                    }
                    if (((Game) this).Object_Info[4] == 57) {
                        if ((((Game) this).Object_Info[2] + i14) - i12 <= Game.Player_RoughXPos() && Game.Player_RoughXPos() <= ((Game) this).Object_Info[2] + i14 + i12 && ((Game) this).Object_Info[10] == 0) {
                            ((Game) this).Object_Info[10] = 1;
                            ((Game) this).Object_Info[11] = ((Game) this).f227k;
                        }
                        int[] iArr12 = Game.Player_Info;
                        iArr12[0] = iArr12[0] - (i15 << 8);
                    }
                    if (((Game) this).Object_Info[4] != 7 || ((Game) this).Object_Info[4] == 4) {
                        if (((Game) this).Object_Info[5] == 1 && ((Game) this).Object_Info[10] == 0) {
                            ((Game) this).Object_Info[10] = 1;
                        }
                        int[] iArr13 = Game.Player_Info;
                        iArr13[0] = iArr13[0] - (i15 << 8);
                    }
                    m140b(((Game) this).Object_Info[2] + i14, i12);
                    m230a(((Game) this).Object_Info[22]);
                    z = true;
                }
            }
            if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i8 != 0) {
                ((Game) this).f115s = false;
            }
            if (z) {
                m118c(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
                return;
            } else {
                m92e(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[4]);
                return;
            }
        }
        i11 = 63;
        i12 = i11;
        i13 = 8;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[4] != 7) {
        }
        i12 = 16;
        i13 = 8;
        if (((Game) this).Object_Info[10] != 1) {
        }
        if (((Game) this).Object_Info[4] != 1) {
        }
        i8 = -1;
        if (((Game) this).Object_Info[4] != 7) {
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] + i14, ((Game) this).Object_Info[3] + 0, ((Game) this).Object_Info[6] + i14, ((Game) this).Object_Info[7] + 0, i12, i13);
            i8 = Actor_CheckPlayerCollide;
            if (Actor_CheckPlayerCollide >= 0) {
                Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i13) + 0) << 8;
                if (((Game) this).Object_Info[4] != 2) {
                }
                if (((Game) this).Object_Info[10] == 0) {
                }
                int[] iArr112 = Game.Player_Info;
                iArr112[0] = iArr112[0] - (i15 << 8);
                if (((Game) this).Object_Info[4] == 57) {
                }
                if (((Game) this).Object_Info[4] != 7) {
                }
                if (((Game) this).Object_Info[5] == 1) {
                    ((Game) this).Object_Info[10] = 1;
                }
                int[] iArr132 = Game.Player_Info;
                iArr132[0] = iArr132[0] - (i15 << 8);
                m140b(((Game) this).Object_Info[2] + i14, i12);
                m230a(((Game) this).Object_Info[22]);
                z = true;
            }
            if (((Game) this).f115s) {
                ((Game) this).f115s = false;
            }
            if (z) {
            }
        }
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] + i14, ((Game) this).Object_Info[3] + 0, ((Game) this).Object_Info[6] + i14, ((Game) this).Object_Info[7] + 0, i12, i13);
        i8 = Actor_CheckPlayerCollide;
        if (Actor_CheckPlayerCollide >= 0) {
        }
        if (((Game) this).f115s) {
        }
        if (z) {
        }
    }

    /* renamed from: at */
    private void m339at() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int Actor_CheckPlayerCollide;
        int i3 = ((Game) this).Object_Info[2];
        if (((Game) this).Object_Info[5] == 0) {
            if (((Game) this).Object_Info[2] + 160 < Game.Player_RoughXPos() && Math.abs((((Game) this).Object_Info[3] - Game.Player_RoughYPos()) + 12) < 43) {
                iArr = ((Game) this).Object_Info;
                c = 5;
                i = iArr[5];
                i2 = 1;
            }
            if (((Game) this).Object_Info[2] + 96 > Game.Player_RoughXPos() && Math.abs((((Game) this).Object_Info[3] - Game.Player_RoughYPos()) + 12) < 43) {
                Player_Hurt();
                if (((Game) this).Object_Info[5] > 0 && Game.Player_RoughXPos() + 300 < ((Game) this).Object_Info[2]) {
                    ((Game) this).Object_Info[2] = Game.Player_RoughXPos() + 300;
                }
            }
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] - 96, ((Game) this).Object_Info[3], i3 - 96, ((Game) this).Object_Info[3], 120, 32);
            if (Actor_CheckPlayerCollide >= 0 || Actor_CheckPlayerCollide == 0 || Actor_CheckPlayerCollide == 1) {
                return;
            }
            if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = ((((((Game) this).Object_Info[2] + 120) - 96) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                return;
            } else if (Actor_CheckPlayerCollide == 3) {
                Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 32) + 12) + 12) + 1) << 8;
                Game.Player_Info[5] = 0;
                m269B();
                return;
            } else {
                return;
            }
        }
        int[] iArr2 = ((Game) this).Object_Info;
        iArr2[5] = iArr2[5] + 2;
        if (((Game) this).Object_Info[5] > 1152) {
            ((Game) this).Object_Info[5] = 1152;
        }
        iArr = ((Game) this).Object_Info;
        c = 2;
        i = ((Game) this).Object_Info[5];
        i2 = ((Game) this).Object_Info[8];
        iArr[c] = i + i2;
        if (((Game) this).Object_Info[2] + 96 > Game.Player_RoughXPos()) {
            Player_Hurt();
            if (((Game) this).Object_Info[5] > 0) {
                ((Game) this).Object_Info[2] = Game.Player_RoughXPos() + 300;
            }
        }
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2] - 96, ((Game) this).Object_Info[3], i3 - 96, ((Game) this).Object_Info[3], 120, 32);
        if (Actor_CheckPlayerCollide >= 0) {
        }
    }

    /* renamed from: au */
    private void m338au() {
        int[] iArr;
        char c;
        int i;
        ((Game) this).Object_Info[5] = (((Game) this).f227k / 2) % 180;
        if (((Game) this).Object_Info[5] == 0) {
            ((Game) this).Object_Info[10] = 0;
        }
        ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8];
        ((Game) this).Object_Info[3] = (((Game) this).Object_Info[9] - 356) + (((Game) this).Object_Info[5] << 3);
        if (Math.abs(Game.Player_RoughXPos() - ((Game) this).Object_Info[2]) < 44 && (((Game) this).Object_Info[3] >= ((Game) this).Object_Info[9] ? !(((Game) this).Object_Info[3] - 240 >= Game.Player_RoughYPos() || ((Game) this).Object_Info[9] <= Game.Player_RoughYPos() - 12) : !(((Game) this).Object_Info[3] - 240 >= Game.Player_RoughYPos() || ((Game) this).Object_Info[3] <= Game.Player_RoughYPos() - 12))) {
            Player_Hurt();
        }
        if (((Game) this).Object_Info[10] != 0) {
            iArr = ((Game) this).Object_Info;
            c = '\n';
            i = iArr[10] + 1;
        } else if (((Game) this).Object_Info[3] <= ((Game) this).Object_Info[9]) {
            return;
        } else {
            iArr = ((Game) this).Object_Info;
            c = '\n';
            i = 1;
        }
        iArr[c] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
        if (((p000.Game) r7).Input_Array[4] != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
        if (((p000.Game) r7).Input_Array[3] != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
        m26s();
     */
    /* renamed from: av */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m337av() {
        int i = 7;
        if (((Game) this).f269e[((Game) this).Object_Info[4]]) {
            i = 0;
        }
        ((Game) this).f269e[((Game) this).Object_Info[4]] = false;
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 14, i);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 0) {
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - i) << 8;
                ((Game) this).f269e[((Game) this).Object_Info[4]] = true;
                ((Game) this).f261b[((Game) this).Object_Info[4]] = true;
                m140b(((Game) this).Object_Info[2], 14);
                m230a(((Game) this).Object_Info[22]);
            } else if (Actor_CheckPlayerCollide == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 14) - 12) << 8;
                Game.Player_Info[10] = 0;
            } else if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 14) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: aw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m336aw() {
        int i;
        int i2;
        Actor actor;
        int[] iArr;
        char c;
        int i3;
        int i4;
        int i5;
        int Actor_CheckPlayerCollide;
        int Actor_CheckPlayerCollide2;
        int i6 = 8;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[11] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14];
        if (this.Game_ZoneID == 4) {
            i6 = 16;
        }
        if (((Game) this).Object_Info[4] == 5) {
            ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
            i7 = ((Game) this).Object_Info[5];
            i = 64;
        } else {
            if (((Game) this).Object_Info[4] == 1) {
                ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                i7 = ((Game) this).Object_Info[5];
                i = -64;
            }
            if (((Game) this).Object_Info[4] != 12) {
                ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                i7 = ((Game) this).Object_Info[5];
                i2 = 48;
            } else if (((Game) this).Object_Info[4] == 11) {
                ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                i7 = ((Game) this).Object_Info[5];
                i2 = -48;
            } else if (((Game) this).Object_Info[4] == 6) {
                ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                i7 = ((Game) this).Object_Info[5];
                i2 = 64;
            } else if (((Game) this).Object_Info[4] == 2) {
                ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                i7 = ((Game) this).Object_Info[5];
                i2 = -64;
            } else {
                if (((Game) this).Object_Info[4] == 16) {
                    ((Game) this).Object_Info[5] = ((((Game) this).f227k * 15) / 10) % 360;
                    i7 = ((Game) this).Object_Info[5];
                    i2 = -32;
                }
                if (((Game) this).Object_Info[4] != 7) {
                    if (((Game) this).Object_Info[4] == 3 && ((Game) this).Object_Info[5] != 0) {
                        int[] iArr2 = ((Game) this).Object_Info;
                        iArr2[5] = iArr2[5] + 1;
                        if (((Game) this).Object_Info[5] > 40) {
                            int[] iArr3 = ((Game) this).Object_Info;
                            iArr3[6] = iArr3[6] + 80;
                            int[] iArr4 = ((Game) this).Object_Info;
                            iArr4[18] = iArr4[18] + ((Game) this).Object_Info[6];
                        }
                        actor = this;
                    }
                    if (((Game) this).Object_Info[4] == 3) {
                        if (((Game) this).Object_Info[4] != 7) {
                            ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + ((Game.Math_CalcSine(i7) * i9) / 100);
                            int Math_CalcSine = (Game.Math_CalcSine(i7) * i8) / 100;
                            iArr = ((Game) this).Object_Info;
                            c = 2;
                            i3 = ((Game) this).Object_Info[8];
                            i4 = Math_CalcSine;
                        }
                        ((Game) this).Object_Info[14] = 0;
                        if (((Game) this).Object_Info[13] != 0) {
                            ((Game) this).Object_Info[14] = 4;
                        }
                        ((Game) this).Object_Info[13] = 0;
                        i5 = i10 - ((Game) this).Object_Info[2];
                        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14] + 32, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] + 32, 32, 8);
                        if (Actor_CheckPlayerCollide >= 0 && Actor_CheckPlayerCollide == 0) {
                            Game.Player_Info[0] = (Game.Player_RoughXPos() - i5) << 8;
                            Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i6) + ((Game) this).Object_Info[14]) << 8;
                            if (((Game) this).Object_Info[4] == 3 && i7 == 0) {
                                ((Game) this).Object_Info[5] = 1;
                            }
                            m140b(((Game) this).Object_Info[2], 32);
                            m230a(((Game) this).Object_Info[22]);
                            ((Game) this).Object_Info[13] = 1;
                        }
                        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
                            ((Game) this).f115s = false;
                        }
                        Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], (((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]) - 4, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] - 4, 32, 4);
                        if (Actor_CheckPlayerCollide2 >= 0 && Actor_CheckPlayerCollide2 != 3) {
                            Game.Player_Info[0] = (Game.Player_RoughXPos() - i5) << 8;
                            Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i6) + ((Game) this).Object_Info[14]) << 8;
                            if (((Game) this).Object_Info[4] == 3 && i7 == 0) {
                                ((Game) this).Object_Info[5] = 1;
                            }
                            m140b(((Game) this).Object_Info[2], 32);
                            m230a(((Game) this).Object_Info[22]);
                            ((Game) this).Object_Info[13] = 1;
                        }
                        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide2 != 0) {
                            ((Game) this).f115s = false;
                            return;
                        }
                        return;
                    }
                    int i11 = ((Game) this).Object_Info[18] >> 8;
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    i3 = ((Game) this).Object_Info[9];
                    i4 = i11;
                    iArr[c] = i3 + i4;
                    ((Game) this).Object_Info[14] = 0;
                    if (((Game) this).Object_Info[13] != 0) {
                    }
                    ((Game) this).Object_Info[13] = 0;
                    i5 = i10 - ((Game) this).Object_Info[2];
                    Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14] + 32, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] + 32, 32, 8);
                    if (Actor_CheckPlayerCollide >= 0) {
                        Game.Player_Info[0] = (Game.Player_RoughXPos() - i5) << 8;
                        Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i6) + ((Game) this).Object_Info[14]) << 8;
                        if (((Game) this).Object_Info[4] == 3) {
                            ((Game) this).Object_Info[5] = 1;
                        }
                        m140b(((Game) this).Object_Info[2], 32);
                        m230a(((Game) this).Object_Info[22]);
                        ((Game) this).Object_Info[13] = 1;
                    }
                    if (((Game) this).f115s) {
                        ((Game) this).f115s = false;
                    }
                    Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], (((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]) - 4, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] - 4, 32, 4);
                    if (Actor_CheckPlayerCollide2 >= 0) {
                        Game.Player_Info[0] = (Game.Player_RoughXPos() - i5) << 8;
                        Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i6) + ((Game) this).Object_Info[14]) << 8;
                        if (((Game) this).Object_Info[4] == 3) {
                            ((Game) this).Object_Info[5] = 1;
                        }
                        m140b(((Game) this).Object_Info[2], 32);
                        m230a(((Game) this).Object_Info[22]);
                        ((Game) this).Object_Info[13] = 1;
                    }
                    if (((Game) this).f115s) {
                        return;
                    }
                    return;
                }
                if (((Game) this).f269e[128] && ((Game) this).Object_Info[5] <= 0) {
                    int[] iArr5 = ((Game) this).Object_Info;
                    iArr5[5] = iArr5[5] + 1;
                }
                if (((Game) this).Object_Info[5] > 0) {
                    int[] iArr6 = ((Game) this).Object_Info;
                    iArr6[5] = iArr6[5] + 1;
                    if (((Game) this).Object_Info[5] > 90) {
                        int[] iArr7 = ((Game) this).Object_Info;
                        iArr7[3] = iArr7[3] - 2;
                        if (((Game) this).Object_Info[3] < 368) {
                            ((Game) this).Object_Info[3] = 368;
                        }
                    }
                }
                actor = this;
                i7 = ((Game) actor).Object_Info[5];
                if (((Game) this).Object_Info[4] == 3) {
                }
                iArr[c] = i3 + i4;
                ((Game) this).Object_Info[14] = 0;
                if (((Game) this).Object_Info[13] != 0) {
                }
                ((Game) this).Object_Info[13] = 0;
                i5 = i10 - ((Game) this).Object_Info[2];
                Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14] + 32, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] + 32, 32, 8);
                if (Actor_CheckPlayerCollide >= 0) {
                }
                if (((Game) this).f115s) {
                }
                Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], (((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]) - 4, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] - 4, 32, 4);
                if (Actor_CheckPlayerCollide2 >= 0) {
                }
                if (((Game) this).f115s) {
                }
            }
            i9 = i2;
            if (((Game) this).Object_Info[4] != 7) {
            }
            i7 = ((Game) actor).Object_Info[5];
            if (((Game) this).Object_Info[4] == 3) {
            }
            iArr[c] = i3 + i4;
            ((Game) this).Object_Info[14] = 0;
            if (((Game) this).Object_Info[13] != 0) {
            }
            ((Game) this).Object_Info[13] = 0;
            i5 = i10 - ((Game) this).Object_Info[2];
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14] + 32, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] + 32, 32, 8);
            if (Actor_CheckPlayerCollide >= 0) {
            }
            if (((Game) this).f115s) {
            }
            Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], (((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]) - 4, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] - 4, 32, 4);
            if (Actor_CheckPlayerCollide2 >= 0) {
            }
            if (((Game) this).f115s) {
            }
        }
        i8 = i;
        if (((Game) this).Object_Info[4] != 12) {
        }
        i9 = i2;
        if (((Game) this).Object_Info[4] != 7) {
        }
        i7 = ((Game) actor).Object_Info[5];
        if (((Game) this).Object_Info[4] == 3) {
        }
        iArr[c] = i3 + i4;
        ((Game) this).Object_Info[14] = 0;
        if (((Game) this).Object_Info[13] != 0) {
        }
        ((Game) this).Object_Info[13] = 0;
        i5 = i10 - ((Game) this).Object_Info[2];
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14] + 32, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] + 32, 32, 8);
        if (Actor_CheckPlayerCollide >= 0) {
        }
        if (((Game) this).f115s) {
        }
        Actor_CheckPlayerCollide2 = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], (((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]) - 4, ((Game) this).Object_Info[11], ((Game) this).Object_Info[7] - 4, 32, 4);
        if (Actor_CheckPlayerCollide2 >= 0) {
        }
        if (((Game) this).f115s) {
        }
    }

    /* renamed from: ax */
    private void m335ax() {
        m370aN();
    }

    /* renamed from: ay */
    private void m334ay() {
        int[] iArr;
        char c;
        int i;
        int i2 = -1;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        for (int i3 = 0; i3 < 2; i3++) {
            if (((Game) this).Object_Info[10 + i3] != 1) {
                int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide((((Game) this).Object_Info[2] - 8) + (i3 << 4), ((Game) this).Object_Info[3], (((Game) this).Object_Info[6] - 8) + (i3 << 4), ((Game) this).Object_Info[7], 8, 32);
                i2 = Actor_CheckPlayerCollide;
                if (Actor_CheckPlayerCollide >= 0) {
                    int i4 = i2 == 1 ? 1 : -1;
                    if (i2 == 1 || i2 == 2) {
                        if (Math.abs(Game.Player_Info[10]) < 300 || Game.f72g || !Game.f74i) {
                            Game.Player_Info[10] = 0;
                        } else {
                            int[] iArr2 = Game.Player_Info;
                            iArr2[10] = iArr2[10] - (10 * i4);
                            ((Game) this).Object_Info[10 + i3] = 1;
                            int i5 = 0;
                            int i6 = 24;
                            if (this.Game_ZoneID == 0) {
                                i5 = ((Game) this).Object_Info[4];
                                i6 = 26;
                            }
                            m134b(i6, (((Game) this).Object_Info[2] - 8) + (i3 << 4), (((Game) this).Object_Info[3] - 16) - 16, (30 * i4) + 360, 400, i5);
                            m134b(i6, (((Game) this).Object_Info[2] - 8) + (i3 << 4), ((((Game) this).Object_Info[3] - 16) - 16) + 16, (60 * i4) + 360, 400, i5);
                            m134b(i6, (((Game) this).Object_Info[2] - 8) + (i3 << 4), ((((Game) this).Object_Info[3] - 16) - 16) + 32, (40 * i4) + 360, 400, i5);
                            m134b(i6, (((Game) this).Object_Info[2] - 8) + (i3 << 4), ((((Game) this).Object_Info[3] - 16) - 16) + 48, (50 * i4) + 360, 400, i5);
                        }
                        if (Game.Player_Info[10] == 0) {
                            if (i4 == 1) {
                                iArr = Game.Player_Info;
                                c = 0;
                                i = (((Game) this).Object_Info[2] - 8) - 12;
                            } else {
                                iArr = Game.Player_Info;
                                c = 0;
                                i = ((Game) this).Object_Info[2] + 8 + 12 + 1;
                            }
                            iArr[c] = ((i - 8) + (i3 << 4)) << 8;
                            if (i4 == 1) {
                                if (((Game) this).Input_Array[4]) {
                                    m26s();
                                }
                            } else if (((Game) this).Input_Array[3]) {
                                m26s();
                            }
                        }
                    } else if (i2 == 3) {
                        Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 32) + 12) + 12) + 1) << 8;
                        m269B();
                    }
                }
            }
        }
        if (((Game) this).Object_Info[10] == 1 && ((Game) this).Object_Info[11] == 1) {
            ((Game) this).Object_Info[0] = 0;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i2 != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: az */
    private void m333az() {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        ((Game) this).Object_Info[10] = ((Game) this).f227k;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        for (int i3 = 0; i3 < 8; i3++) {
            if (((Game) this).Object_Info[15] != 0) {
                int i4 = (((Game) this).f227k - ((Game) this).Object_Info[16]) - Game.f196m[i3];
                i = i4;
                if (i4 < 0) {
                    i = 0;
                }
            }
            int i5 = Game.f195l[i3];
            int Actor_CheckCollision = i != 0 ? -1 : Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - 12, Game.f184b[0], Game.f184b[1] - 12, 12, 12, ((Game) this).Object_Info[2] + ((((i5 % 4) << 4) - 16) - 8), ((Game) this).Object_Info[3] + ((i5 >> 2) << 4), ((Game) this).Object_Info[6] + ((((i5 % 4) << 4) - 16) - 8), ((Game) this).Object_Info[7] + ((i5 >> 2) << 4), 8, 8);
            i2 = Actor_CheckCollision;
            if (Actor_CheckCollision >= 0) {
                if (i2 == 0) {
                    z = true;
                    Game.Player_Info[1] = ((((Game) this).Object_Info[3] + (((i5 >> 2) << 4) + (i * 5))) - 8) << 8;
                    m140b(((Game) this).Object_Info[2] + ((((i5 % 4) << 4) - 16) - 8), 8);
                    m230a(((Game) this).Object_Info[22]);
                    if (((Game) this).Object_Info[15] == 0) {
                        ((Game) this).Object_Info[16] = ((Game) this).f227k;
                    }
                    ((Game) this).Object_Info[15] = 1;
                } else if (i2 == 1) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + ((((i5 % 4) << 4) - 16) - 8)) - 8) - 12) << 8;
                    Game.Player_Info[10] = 0;
                    if (!((Game) this).Input_Array[4]) {
                    }
                    m26s();
                } else if (i2 == 2) {
                    Game.Player_Info[0] = ((((((Game) this).Object_Info[2] + ((((i5 % 4) << 4) - 16) - 8)) + 8) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (!((Game) this).Input_Array[3]) {
                    }
                    m26s();
                }
            }
        }
        if (z) {
            i2 = 0;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i2 != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aA */
    private void m383aA() {
        Actor actor;
        int i;
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 14, 14);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 0) {
                if (Game.f74i) {
                    ((Game) this).Object_Info[0] = 0;
                    Game.f72g = true;
                    Game.f68d = false;
                    Game.f74i = true;
                    Game.Player_Info[5] = -1280;
                    if (this.f314aw == 0) {
                        actor = this;
                        i = 100;
                    } else if (this.f314aw == 100) {
                        actor = this;
                        i = 200;
                    } else if (this.f314aw == 200) {
                        actor = this;
                        i = 500;
                    } else {
                        if (this.f314aw == 500) {
                            actor = this;
                            i = 1000;
                        }
                        Score_Add(this.f314aw, true);
                        m69h(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], this.f314aw);
                        m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 330, 400, 0);
                        m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 300, 400, 1);
                        m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 390, 400, 2);
                        m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 420, 400, 3);
                        Game.Player_Info[1] = (((Game) this).Object_Info[3] - 14) << 8;
                    }
                    actor.f314aw = i;
                    Score_Add(this.f314aw, true);
                    m69h(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], this.f314aw);
                    m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 330, 400, 0);
                    m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 300, 400, 1);
                    m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 390, 400, 2);
                    m134b(22, ((Game) this).Object_Info[2] - 8, ((Game) this).Object_Info[3] - 16, 420, 400, 3);
                    Game.Player_Info[1] = (((Game) this).Object_Info[3] - 14) << 8;
                } else {
                    Game.Player_Info[1] = (((Game) this).Object_Info[3] - 14) << 8;
                    if (Game.f51p != 0) {
                        Game.Player_Info[0] = (Game.Player_RoughXPos() + ((Game.Math_CalcSine(Game.f51p + 90) * 24) / 100)) << 8;
                        Game.f51p = 0;
                    }
                    m140b(((Game) this).Object_Info[2], 14);
                    m230a(((Game) this).Object_Info[22]);
                }
            } else if (Actor_CheckPlayerCollide == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 14) - 12) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[4]) {
                    m26s();
                }
            } else if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 14) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[3]) {
                    m26s();
                }
            } else if (Actor_CheckPlayerCollide == 3) {
                Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 14) + 12) + 12) + 1) << 8;
                m269B();
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aB */
    private void m382aB() {
        if (((Game) this).Object_Info[5] == 0 && ((Game) this).f63B == ((Game) this).Object_Info[2] && ((Game) this).f64C == ((Game) this).Object_Info[3]) {
            ((Game) this).Object_Info[5] = 32;
        }
        if (((Game) this).Object_Info[5] > 0) {
            int[] iArr = ((Game) this).Object_Info;
            iArr[5] = iArr[5] + 1;
            if (((Game) this).Object_Info[5] > 32) {
                ((Game) this).Object_Info[5] = 32;
            }
        }
        if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 12, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 12, 8, 32) < 0 || ((Game) this).Object_Info[5] != 0) {
            return;
        }
        ((Game) this).Object_Info[5] = 1;
        ((Game) this).f63B = Game.Player_RoughXPos();
        ((Game) this).f64C = Game.Player_RoughYPos();
        ((Game) this).f65D = ((Game) this).f59x;
        ((Game) this).f66E = ((Game) this).f60y;
    }

    /* renamed from: aC */
    private void m381aC() {
        if (((Game) this).Object_Info[4] < 16) {
            int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 8, 32);
            if (Actor_CheckPlayerCollide >= 0) {
                if (Actor_CheckPlayerCollide == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 8) - 12) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[4]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 8) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[3]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 3) {
                    Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 32) + 12) + 12) + 1) << 8;
                    m269B();
                }
            }
            if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
                ((Game) this).f115s = false;
            }
        }
    }

    /* renamed from: aD */
    private void m380aD() {
        int[] iArr;
        char c;
        int Player_RoughXPos;
        int i;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[12] == 1) {
            int i2 = (((Game) this).f226j - ((Game) this).Object_Info[14]) * 4;
            ((Game) this).Object_Info[14] = ((Game) this).f226j;
            if (i2 > 0) {
                int i3 = i2;
                while (true) {
                    if (i3 >= 0) {
                        if (((Game) this).Object_Info[3] < ((Game) this).Object_Info[7] + 1000) {
                            int[] iArr2 = ((Game) this).Object_Info;
                            iArr2[3] = iArr2[3] + 2;
                        }
                        if (m139b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 16) && ((Game) this).Object_Info[3] > ((Game) this).Object_Info[7] - 1000) {
                            int[] iArr3 = ((Game) this).Object_Info;
                            iArr3[3] = iArr3[3] - 2;
                            ((Game) this).Object_Info[12] = 0;
                            break;
                        }
                        if (((Game) this).Object_Info[3] < 0) {
                            ((Game) this).Object_Info[3] = 0;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
            }
        }
        if (((Game) this).Object_Info[4] == 0) {
            return;
        }
        int m135b = Game.m135b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 16, 16);
        if (((Game) this).Object_Info[5] != 0) {
            ((Game) this).Object_Info[7] = (((Game) this).f226j - ((Game) this).Object_Info[13]) * 2;
            if (((Game) this).Object_Info[7] > 60) {
                ((Game) this).Object_Info[7] = 60;
            }
        }
        if (m135b >= 0) {
            if ((Game.f74i && m135b != 3) || (!Game.f72g && Game.f74i && m135b == 3)) {
                Game.Player_Info[5] = -768;
                m216a(1, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 0, 0, 0, 0);
                ((Game) this).Object_Info[5] = ((Game) this).Object_Info[4];
                ((Game) this).Object_Info[13] = ((Game) this).f226j;
                PowerUp_Apply(((Game) this).Object_Info[4]);
                iArr = ((Game) this).Object_Info;
                c = 4;
                i = 0;
            } else if (m135b == 0) {
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 16) << 8;
                m140b(((Game) this).Object_Info[2], 16);
                m230a(((Game) this).Object_Info[22]);
            } else if (m135b == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 16) - 12) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[4]) {
                    m26s();
                }
            } else if (m135b == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 16) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                if (((Game) this).Input_Array[3]) {
                    m26s();
                }
            } else if (m135b == 3) {
                Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 16) + 12) + 12) + 1) << 8;
                if (Game.Player_Info[5] < 0) {
                    int[] iArr4 = Game.Player_Info;
                    iArr4[5] = iArr4[5] * (-1);
                }
                if (((Game) this).Object_Info[12] == 0) {
                    int[] iArr5 = ((Game) this).Object_Info;
                    iArr5[3] = iArr5[3] - 5;
                    ((Game) this).Object_Info[14] = ((Game) this).f226j;
                }
                ((Game) this).Object_Info[12] = 1;
                if (!Game.f72g) {
                    if (Game.Player_RoughXPos() < ((Game) this).Object_Info[2]) {
                        iArr = Game.Player_Info;
                        c = 0;
                        Player_RoughXPos = Game.Player_RoughXPos() - 5;
                    } else {
                        iArr = Game.Player_Info;
                        c = 0;
                        Player_RoughXPos = Game.Player_RoughXPos() + 5;
                    }
                    i = Player_RoughXPos << 8;
                }
            }
            iArr[c] = i;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && m135b != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aE */
    private void m379aE() {
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[5] == 1) {
            int[] iArr = ((Game) this).Object_Info;
            iArr[10] = iArr[10] + 1;
            if (((Game) this).Object_Info[10] > 129) {
                ((Game) this).Object_Info[10] = 129;
                ((Game) this).Object_Info[5] = 2;
                m39o();
            }
        } else if (((Game) this).Object_Info[5] != 0 || Game.Player_RoughXPos() <= ((Game) this).Object_Info[2] - 3 || ((Game) this).Object_Info[3] + 48 <= Game.Player_RoughYPos()) {
        } else {
            ((Game) this).Object_Info[5] = 1;
            ((Game) this).Object_Info[10] = 0;
            this.f262p = true;
        }
    }

    /* renamed from: aF */
    private void m378aF() {
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[5] == 0) { // Check if the hidden bonus has been collected.
            if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 12, 12) >= 0) { // Check if Sonic has collided with this object.
                ((Game) this).Object_Info[5] = 1; // Set bonus as collected.
                ((Game) this).Object_Info[11] = 0;
                Score_Add(Game.Score_HiddenBonuses[((Game) this).Object_Info[4]], true); // Apply score bonus.
            }
        } else if (((Game) this).Object_Info[5] == 1) {
            int[] iArr = ((Game) this).Object_Info;
            iArr[11] = iArr[11] + 1;
            if (((Game) this).Object_Info[11] > 120) {
                ((Game) this).Object_Info[5] = 2;
            }
        }
    }

    /* renamed from: aG */
    private void m377aG() {
        m378aF();
    }

    /* renamed from: aH */
    private void m376aH() {
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16);
        if (Actor_CheckPlayerCollide >= 0 && Actor_CheckPlayerCollide != 0) {
            if (Actor_CheckPlayerCollide == 1) {
                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 16) - 12) << 8;
                Game.Player_Info[10] = 0;
            } else if (Actor_CheckPlayerCollide == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 16) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
            } else if (Actor_CheckPlayerCollide == 3) {
                Game.Player_Info[1] = ((((((Game) this).Object_Info[3] + 16) + 12) + 12) + 1) << 8;
                m269B();
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aI */
    private void m375aI() {
        int i = 32;
        int i2 = 28;
        int i3 = 4;
        if (((Game) this).Object_Info[4] == 1) {
            i = 12;
            i2 = 8;
            i3 = 0;
        }
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        int Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + i3, ((Game) this).Object_Info[6], ((Game) this).Object_Info[7] + i3, i, i2);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 0) {
                Game.Player_Info[1] = ((((Game) this).Object_Info[3] - i2) + i3) << 8;
                m140b(((Game) this).Object_Info[2], i);
                m230a(((Game) this).Object_Info[22]);
                if (((Game) this).Object_Info[4] == 1 && ((Game) this).Object_Info[5] == 0) {
                    this.f262p = true;
                    ((Game) this).Object_Info[5] = 1;
                    int[] iArr = ((Game) this).Object_Info;
                    iArr[3] = iArr[3] + 8;
                    ((Game) this).Object_Info[10] = ((Game) this).f227k;
                    ((Game) this).f142c = (byte) 2;
                }
            } else if (!((Game) this).f298C) {
                if (Actor_CheckPlayerCollide == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i) - 12) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[4]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[3]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 3) {
                    Game.Player_Info[1] = (((((((Game) this).Object_Info[3] + i2) + 12) + 12) + 1) + i3) << 8;
                }
            }
        }
        if (((Game) this).Object_Info[5] == 1) {
            if ((((Game) this).f227k - ((Game) this).Object_Info[10]) % 20 == 0 && Game.f198o.length > (((Game) this).f227k - ((Game) this).Object_Info[10]) / 20) {
                m216a(1, ((Game) this).Object_Info[8] + Game.f198o[(((Game) this).f227k - ((Game) this).Object_Info[10]) / 20], ((Game) this).Object_Info[9] + Game.f199p[(((Game) this).f227k - ((Game) this).Object_Info[10]) / 20], 0, 0, 0, 0);
            }
            if (((Game) this).f227k - ((Game) this).Object_Info[10] > 100) {
                ((Game) this).Object_Info[5] = 2;
                ((Game) this).Object_Info[10] = ((Game) this).f227k;
                m75g(((Game) this).Object_Info[8] + 4, ((Game) this).Object_Info[9] + 27 + 16, this.Game_ZoneID);
            }
        } else if (((Game) this).Object_Info[5] == 2 && ((Game) this).f227k - ((Game) this).Object_Info[10] > 180) {
            m39o();
            int[] iArr2 = ((Game) this).Object_Info;
            iArr2[5] = iArr2[5] + 1;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aJ */
    private void m374aJ() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        if (Game.m115c(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 8, 8) >= 0) {
            int abs = Math.abs(Game.Player_RoughXPos() - ((Game) this).Object_Info[2]);
            int abs2 = Math.abs((Game.Player_RoughYPos() - 12) - ((Game) this).Object_Info[3]);
            if (((Game) this).Object_Info[10] < 10) {
                m69h(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 10);
                Score_Add(10, true);
                int[] iArr3 = ((Game) this).Object_Info;
                iArr3[10] = iArr3[10] + 1;
            }
            if (Game.Player_RoughXPos() - ((Game) this).Object_Info[2] > 0) {
                iArr = Game.Player_Info;
                c = 3;
                i = 1792;
            } else {
                iArr = Game.Player_Info;
                c = 3;
                i = -1792;
            }
            iArr[c] = (i * abs) / (abs + abs2);
            if ((Game.Player_RoughYPos() - 12) - ((Game) this).Object_Info[3] > 0) {
                iArr2 = Game.Player_Info;
                c2 = 5;
                i2 = 2048;
            } else {
                iArr2 = Game.Player_Info;
                c2 = 5;
                i2 = -2048;
            }
            iArr2[c2] = (i2 * abs2) / (abs + abs2);
            if (!Game.f72g) {
                Game.Player_Info[3] = (Game.Player_Info[3] * 80) / 100;
                int[] iArr4 = Game.Player_Info;
                iArr4[5] = iArr4[5] - 1024;
            }
            Game.Player_Info[10] = 0;
            Game.Player_Info[13] = 0;
            Game.Player_Info[14] = 0;
            Game.f72g = true;
            Game.f68d = false;
            Game.f73h = true;
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aK */
    private void m373aK() {
        int[] iArr;
        char c;
        int i;
        int m115c = Game.m115c(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 16, 16);
        if (m115c >= 0) {
            if (m115c == 0) {
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - 16) << 8;
                m140b(((Game) this).Object_Info[2], 16);
                m230a(((Game) this).Object_Info[22]);
            } else {
                if (m115c == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 16) - 12) << 8;
                    if (((Game) this).Input_Array[4]) {
                        m26s();
                    }
                    Game.Player_Info[10] = 0;
                    Game.Player_Info[13] = 0;
                    iArr = Game.Player_Info;
                    c = 14;
                    i = 0;
                } else if (m115c == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 16) + 12) + 1) << 8;
                    if (((Game) this).Input_Array[3]) {
                        m26s();
                    }
                    Game.Player_Info[10] = 0;
                    Game.Player_Info[13] = 0;
                    iArr = Game.Player_Info;
                    c = 14;
                    i = 0;
                } else if (m115c == 3) {
                    iArr = Game.Player_Info;
                    c = 1;
                    i = ((((((Game) this).Object_Info[3] + 16) + 12) + 12) + 1) << 8;
                }
                iArr[c] = i;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && m115c != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aL */
    private void m372aL() {
        int i;
        int i2;
        int[] iArr;
        char c;
        int i3;
        int i4;
        int[] iArr2;
        char c2;
        int i5;
        int i6;
        int i7 = ((Game) this).f226j;
        int i8 = 4;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[19] == 1) {
            i7 += 45;
        } else {
            if (((Game) this).Object_Info[19] == 2) {
                i = i7;
                i2 = 135;
            } else if (((Game) this).Object_Info[19] == 3) {
                i = i7;
                i2 = 180;
            }
            i7 = i + i2;
        }
        if (((Game) this).Object_Info[4] == 195 || ((Game) this).Object_Info[4] == 179) {
            i8 = 2;
        }
        if (((Game) this).Object_Info[4] != 243 && ((Game) this).Object_Info[4] != 195 && ((Game) this).Object_Info[4] != 227 && ((Game) this).Object_Info[4] != 179) {
            int i9 = ((Game) this).f226j;
            if (((Game) this).Object_Info[4] == 2) {
                if (((Game) this).Object_Info[19] != 0) {
                    if ((i9 % 96) * 2 < 96) {
                        iArr = ((Game) this).Object_Info;
                        c = 3;
                        i3 = (((Game) this).Object_Info[9] - (96 - (((i9 % 96) * 2) - 96))) + 64;
                    } else {
                        iArr = ((Game) this).Object_Info;
                        c = 3;
                        i3 = (((Game) this).Object_Info[9] - ((i9 % 96) * 2)) + 64;
                    }
                } else if ((i9 % 96) * 2 < 96) {
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    i5 = ((Game) this).Object_Info[9];
                    i6 = (i9 % 96) * 2;
                    i3 = i5 - i6;
                } else {
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    iArr2 = ((Game) this).Object_Info;
                    c2 = '\t';
                    i5 = iArr2[c2];
                    i6 = 96 - (((i9 % 96) * 2) - 96);
                    i3 = i5 - i6;
                }
            } else if (((Game) this).Object_Info[4] == 1) {
                if ((i9 % 96) * 2 < 96) {
                    iArr = ((Game) this).Object_Info;
                    c = 2;
                    i5 = ((Game) this).Object_Info[8];
                    i6 = (i9 % 96) * 2;
                    i3 = i5 - i6;
                } else {
                    iArr = ((Game) this).Object_Info;
                    c = 2;
                    iArr2 = ((Game) this).Object_Info;
                    c2 = '\b';
                    i5 = iArr2[c2];
                    i6 = 96 - (((i9 % 96) * 2) - 96);
                    i3 = i5 - i6;
                }
            }
            i4 = 12;
            if (!Game.f74i && !Game.f76k) {
                i4 = 20;
            }
            if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 16, 16) < 0 && (Math.abs(((Game) this).Object_Info[2] - Game.Player_RoughXPos()) >= 28 || Math.abs(((Game) this).Object_Info[3] - (Game.Player_RoughYPos() - i4)) >= i4 + 16)) {
                return;
            }
            Player_Hurt();
        }
        m272n(((360 / i8) - (i7 % (360 / i8))) * i8, 16, 17);
        ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] + ((((Game) this).Object_Info[16] * 80) / 10000);
        iArr = ((Game) this).Object_Info;
        c = 3;
        i3 = ((Game) this).Object_Info[9] + ((((Game) this).Object_Info[17] * 80) / 10000);
        iArr[c] = i3;
        i4 = 12;
        if (!Game.f74i) {
            i4 = 20;
        }
        if (Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 16, 16) < 0) {
            return;
        }
        Player_Hurt();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ac  */
    /* renamed from: aM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m371aM() {
        int i;
        int i2;
        Actor actor;
        int i3;
        int i4;
        int Player_RoughXPos;
        int Player_RoughYPos;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = 12;
        if (!Game.f74i && !Game.f76k) {
            i17 = 20;
        }
        if (((Game) this).Object_Info[18] == 0) {
            ((Game) this).Object_Info[5] = ((Game) this).f226j;
            ((Game) this).Object_Info[18] = 1;
        }
        int i18 = ((Game) this).f226j - ((Game) this).Object_Info[5];
        int i19 = i18 - 1;
        if (((Game) this).Object_Info[4] == 213 || ((Game) this).Object_Info[4] == 181 || ((Game) this).Object_Info[4] == 197 || ((Game) this).Object_Info[4] == 101 || ((Game) this).Object_Info[4] == 69 || ((Game) this).Object_Info[4] == 53) {
            i = 5;
        } else if (((Game) this).Object_Info[4] == 212 || ((Game) this).Object_Info[4] == 196 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 68 || ((Game) this).Object_Info[4] == 52) {
            i = 4;
        } else if (((Game) this).Object_Info[4] == 38) {
            i = 6;
        } else {
            if (((Game) this).Object_Info[4] == 195) {
                i = 3;
            }
            if (((Game) this).Object_Info[4] != 181 || ((Game) this).Object_Info[4] == 101) {
                i2 = 12;
            } else if (((Game) this).Object_Info[4] == 196 || ((Game) this).Object_Info[4] == 197 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 195) {
                i2 = 10;
            } else if (((Game) this).Object_Info[4] == 213 || ((Game) this).Object_Info[4] == 212 || ((Game) this).Object_Info[4] == 69 || ((Game) this).Object_Info[4] == 68) {
                i2 = 8;
            } else if (((Game) this).Object_Info[4] != 52 && ((Game) this).Object_Info[4] != 53) {
                if (((Game) this).Object_Info[4] == 38) {
                    i2 = 4;
                }
                if (((Game) this).Object_Info[4] != 69 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 101 || ((Game) this).Object_Info[4] == 38 || ((Game) this).Object_Info[4] == 68 || ((Game) this).Object_Info[4] == 52 || ((Game) this).Object_Info[4] == 53) {
                    m272n(360 - ((((360 / i16) - (i18 % (360 / i16))) * i16) % 360), 16, 17);
                    actor = this;
                    i3 = 360 - ((((360 / i16) - (i19 % (360 / i16))) * i16) % 360);
                } else {
                    m272n(((360 / i16) - (i18 % (360 / i16))) * i16, 16, 17);
                    actor = this;
                    i3 = ((360 / i16) - (i19 % (360 / i16))) * i16;
                }
                actor.m272n(i3, 14, 15);
                if (((Game) this).Object_Info[4] != 84 || ((Game) this).Object_Info[19] == 1) {
                    m272n((i18 % (360 / i16)) * i16, 16, 17);
                    m272n((i19 % (360 / i16)) * i16, 14, 15);
                }
                int i20 = 16;
                int i21 = 16;
                if (this.Game_ZoneID == 4) {
                    i20 = 8;
                    i21 = 8;
                }
                for (i4 = 1; i4 < i15; i4++) {
                    if (this.Game_ZoneID == 4) {
                        i20 = 8;
                        i21 = 8;
                        if (Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - i17, Game.f184b[0], Game.f184b[1] - i17, 12, i17, ((Game) this).Object_Info[2] + ((i4 * (((Game) this).Object_Info[16] * 16)) / 10000), ((Game) this).Object_Info[3] + ((i4 * (((Game) this).Object_Info[17] * 16)) / 10000), ((Game) this).Object_Info[2] + ((i4 * (((Game) this).Object_Info[14] * 16)) / 10000), ((Game) this).Object_Info[3] + ((i4 * (((Game) this).Object_Info[15] * 16)) / 10000), 6, 6) >= 0) {
                            Player_Hurt();
                        }
                    }
                }
                if (this.Game_ZoneID == 4) {
                    Player_RoughXPos = Game.Player_RoughXPos();
                    Player_RoughYPos = Game.Player_RoughYPos() - i17;
                    i5 = Game.f184b[0];
                    i6 = Game.f184b[1] - i17;
                    i7 = 12;
                    i8 = i17;
                    i9 = ((Game) this).Object_Info[2] + ((i15 * (((Game) this).Object_Info[16] * (i20 << 1))) / 10000);
                    i10 = ((Game) this).Object_Info[3] + ((i15 * (((Game) this).Object_Info[17] * (i20 << 1))) / 10000);
                    i11 = ((Game) this).Object_Info[2] + ((i15 * (((Game) this).Object_Info[14] * (i20 << 1))) / 10000);
                    i12 = ((Game) this).Object_Info[3] + ((i15 * (((Game) this).Object_Info[15] * (i20 << 1))) / 10000);
                    i13 = i20 - 2;
                    i14 = i21 - 2;
                } else {
                    Player_RoughXPos = Game.Player_RoughXPos();
                    Player_RoughYPos = Game.Player_RoughYPos() - i17;
                    i5 = Game.f184b[0];
                    i6 = Game.f184b[1] - i17;
                    i7 = 12;
                    i8 = i17;
                    i9 = ((Game) this).Object_Info[2] + ((i15 * (((Game) this).Object_Info[16] * i20)) / 10000);
                    i10 = ((Game) this).Object_Info[3] + ((i15 * (((Game) this).Object_Info[17] * i20)) / 10000);
                    i11 = ((Game) this).Object_Info[2] + ((i15 * (((Game) this).Object_Info[14] * i20)) / 10000);
                    i12 = ((Game) this).Object_Info[3] + ((i15 * (((Game) this).Object_Info[15] * i20)) / 10000);
                    i13 = 6;
                    i14 = 6;
                }
                if (Game.Actor_CheckCollision(Player_RoughXPos, Player_RoughYPos, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14) >= 0) {
                    Player_Hurt();
                    return;
                }
                return;
            } else {
                i2 = 6;
            }
            i16 = i2;
            if (((Game) this).Object_Info[4] != 69) {
            }
            m272n(360 - ((((360 / i16) - (i18 % (360 / i16))) * i16) % 360), 16, 17);
            actor = this;
            i3 = 360 - ((((360 / i16) - (i19 % (360 / i16))) * i16) % 360);
            actor.m272n(i3, 14, 15);
            if (((Game) this).Object_Info[4] != 84) {
            }
            m272n((i18 % (360 / i16)) * i16, 16, 17);
            m272n((i19 % (360 / i16)) * i16, 14, 15);
            int i202 = 16;
            int i212 = 16;
            if (this.Game_ZoneID == 4) {
            }
            while (i4 < i15) {
            }
            if (this.Game_ZoneID == 4) {
            }
            if (Game.Actor_CheckCollision(Player_RoughXPos, Player_RoughYPos, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14) >= 0) {
            }
        }
        i15 = i;
        if (((Game) this).Object_Info[4] != 181) {
        }
        i2 = 12;
        i16 = i2;
        if (((Game) this).Object_Info[4] != 69) {
        }
        m272n(360 - ((((360 / i16) - (i18 % (360 / i16))) * i16) % 360), 16, 17);
        actor = this;
        i3 = 360 - ((((360 / i16) - (i19 % (360 / i16))) * i16) % 360);
        actor.m272n(i3, 14, 15);
        if (((Game) this).Object_Info[4] != 84) {
        }
        m272n((i18 % (360 / i16)) * i16, 16, 17);
        m272n((i19 % (360 / i16)) * i16, 14, 15);
        int i2022 = 16;
        int i2122 = 16;
        if (this.Game_ZoneID == 4) {
        }
        while (i4 < i15) {
        }
        if (this.Game_ZoneID == 4) {
        }
        if (Game.Actor_CheckCollision(Player_RoughXPos, Player_RoughYPos, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14) >= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x0a6f, code lost:
        if (((p000.Game) r13).Input_Array[4] != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0a97, code lost:
        if (((p000.Game) r13).Input_Array[3] != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0a9a, code lost:
        m26s();
     */
    /* renamed from: aN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m370aN() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        boolean z;
        int[] iArr3;
        char c3;
        int i3;
        int[] iArr4;
        char c4;
        int Math_CalcSine;
        int[] iArr5;
        char c5;
        int Math_CalcSine2;
        int[] iArr6;
        char c6;
        int i4;
        int[] iArr7;
        char c7;
        int i5;
        int i6;
        int i7;
        int[] iArr8;
        char c8;
        int i8;
        int i9;
        int[] iArr9;
        char c9;
        int i10;
        int i11 = 16;
        int i12 = 16;
        int i13 = 0;
        boolean z2 = false;
        boolean z3 = false;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[4] == 248 && this.Game_ActID == 2) {
            i12 = 16;
            if (Math.abs(Game.Player_RoughXPos() - ((Game) this).Object_Info[8]) <= 64 && Math.abs((Game.Player_RoughYPos() + 12) - ((((Game) this).Object_Info[9] - 32) + 8)) <= 32) {
                ((Game) this).f261b[((Game) this).Object_Info[4] - 240] = true;
            }
            if (Math.abs(Game.Player_RoughXPos() - ((Game) this).Object_Info[8]) <= 64 && Math.abs((Game.Player_RoughYPos() + 12) - (((Game) this).Object_Info[9] + 48)) <= 32) {
                ((Game) this).f261b[((Game) this).Object_Info[4] - 240] = false;
            }
            if (!((Game) this).f261b[((Game) this).Object_Info[4] - 240] || ((Game) this).Object_Info[3] <= this.f270ah) {
                ((Game) this).Object_Info[18] = 1;
                iArr9 = ((Game) this).Object_Info;
                c9 = 5;
                i10 = 0;
            } else {
                ((Game) this).Object_Info[18] = 1;
                iArr9 = ((Game) this).Object_Info;
                c9 = 5;
                i10 = 128;
            }
            iArr9[c9] = i10;
            ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] + 128) - ((Game) this).Object_Info[5];
            i11 = 64 - 1;
        } else if (((Game) this).Object_Info[4] != 241 || !((Game) this).f261b[128] || this.Game_ZoneID != 1 || this.Game_ActID != 3) {
            if (((Game) this).Object_Info[4] >= 240) {
                i12 = 16;
                if (((Game) this).Object_Info[19] == 0) {
                    if (((Game) this).f261b[((Game) this).Object_Info[4] - 240] && ((Game) this).Object_Info[18] == 0) {
                        ((Game) this).Object_Info[18] = 1;
                        ((Game) this).Object_Info[5] = 128;
                        ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] + 128) - ((Game) this).Object_Info[5];
                    }
                    ((Game) this).Object_Info[18] = 1;
                    if (((Game) this).Object_Info[5] != 0) {
                        int[] iArr10 = ((Game) this).Object_Info;
                        iArr10[5] = iArr10[5] + 1;
                        if (((Game) this).Object_Info[5] > 128) {
                            ((Game) this).Object_Info[5] = 128;
                        }
                        iArr7 = ((Game) this).Object_Info;
                        c7 = 2;
                        i7 = (((Game) this).Object_Info[8] + 128) - ((Game) this).Object_Info[5];
                    } else if (((Game) this).f261b[((Game) this).Object_Info[4] - 240]) {
                        iArr7 = ((Game) this).Object_Info;
                        c7 = 5;
                        i7 = 1;
                    } else {
                        iArr7 = ((Game) this).Object_Info;
                        c7 = 2;
                        i5 = ((Game) this).Object_Info[8];
                        i6 = 128;
                        i7 = i5 + i6;
                    }
                    iArr7[c7] = i7;
                    i11 = 64 - 1;
                } else {
                    if (((Game) this).f261b[((Game) this).Object_Info[4] - 240] && ((Game) this).Object_Info[18] == 0) {
                        ((Game) this).Object_Info[18] = 1;
                        ((Game) this).Object_Info[5] = 128;
                        ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] + ((Game) this).Object_Info[5];
                    }
                    ((Game) this).Object_Info[18] = 1;
                    if (((Game) this).Object_Info[5] == 0) {
                        if (((Game) this).f261b[((Game) this).Object_Info[4] - 240]) {
                            iArr7 = ((Game) this).Object_Info;
                            c7 = 5;
                            i7 = 1;
                        } else {
                            iArr7 = ((Game) this).Object_Info;
                            c7 = 2;
                            i7 = ((Game) this).Object_Info[8];
                        }
                        iArr7[c7] = i7;
                        i11 = 64 - 1;
                    } else {
                        int[] iArr11 = ((Game) this).Object_Info;
                        iArr11[5] = iArr11[5] + 1;
                        if (((Game) this).Object_Info[5] > 128) {
                            ((Game) this).Object_Info[5] = 128;
                        }
                        iArr7 = ((Game) this).Object_Info;
                        c7 = 2;
                        i5 = ((Game) this).Object_Info[8];
                        i6 = ((Game) this).Object_Info[5];
                        i7 = i5 + i6;
                        iArr7[c7] = i7;
                        i11 = 64 - 1;
                    }
                }
            } else if (((Game) this).Object_Info[4] != 229 || this.Game_ZoneID != 1 || this.Game_ActID != 0) {
                if (((Game) this).Object_Info[4] >= 224) {
                    i12 = 32;
                    if (((Game) this).f261b[((Game) this).Object_Info[4] - 224] && ((Game) this).Object_Info[18] == 0) {
                        ((Game) this).Object_Info[18] = 1;
                        ((Game) this).Object_Info[5] = 64;
                        ((Game) this).Object_Info[3] = (((Game) this).Object_Info[9] + 64) - ((Game) this).Object_Info[5];
                    }
                    ((Game) this).Object_Info[18] = 1;
                    if (((Game) this).Object_Info[5] != 0) {
                        int[] iArr12 = ((Game) this).Object_Info;
                        iArr12[5] = iArr12[5] + 1;
                        if (((Game) this).Object_Info[5] > 64) {
                            ((Game) this).Object_Info[5] = 64;
                        }
                        iArr6 = ((Game) this).Object_Info;
                        c6 = 3;
                        i4 = (((Game) this).Object_Info[9] + 64) - ((Game) this).Object_Info[5];
                    } else if (((Game) this).f261b[((Game) this).Object_Info[4] - 224]) {
                        iArr6 = ((Game) this).Object_Info;
                        c6 = 5;
                        i4 = 1;
                    } else {
                        iArr6 = ((Game) this).Object_Info;
                        c6 = 3;
                        i4 = ((Game) this).Object_Info[9] + 64;
                    }
                    iArr6[c6] = i4;
                    i11 = 8 - 1;
                } else if (((Game) this).Object_Info[4] == 19) {
                    i11 = 32;
                    i12 = 32;
                    int[] iArr13 = ((Game) this).Object_Info;
                    iArr13[5] = iArr13[5] + 1;
                    int i14 = (((Game) this).f227k % 360 <= 90 || ((Game) this).f227k % 360 >= 270) ? 32 : 33;
                    if (((Game) this).Object_Info[19] == 0) {
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 3;
                        Math_CalcSine2 = ((Game) this).Object_Info[9] + ((Game.Math_CalcSine(((Game) this).f227k) * i14) / 100);
                    } else {
                        iArr5 = ((Game) this).Object_Info;
                        c5 = 3;
                        Math_CalcSine2 = ((Game) this).Object_Info[9] - ((Game.Math_CalcSine(((Game) this).f227k) * i14) / 100);
                    }
                    iArr5[c5] = Math_CalcSine2 - i14;
                    z3 = true;
                } else if (((Game) this).Object_Info[4] >= 0 && ((Game) this).Object_Info[4] <= 2) {
                    i11 = 16;
                    i12 = 16;
                    int i15 = ((Game) this).Object_Info[2];
                    if (((Game) this).Object_Info[4] != 0) {
                        int[] iArr14 = ((Game) this).Object_Info;
                        iArr14[5] = iArr14[5] + 1;
                        int i16 = 32 * ((Game) this).Object_Info[4];
                        if (((Game) this).Object_Info[19] == 0) {
                            iArr4 = ((Game) this).Object_Info;
                            c4 = 2;
                            Math_CalcSine = ((Game) this).Object_Info[8] + ((Game.Math_CalcSine(((Game) this).f227k) * i16) / 100);
                        } else {
                            iArr4 = ((Game) this).Object_Info;
                            c4 = 2;
                            Math_CalcSine = ((Game) this).Object_Info[8] - ((Game.Math_CalcSine(((Game) this).f227k) * i16) / 100);
                        }
                        iArr4[c4] = Math_CalcSine - i16;
                    }
                    i13 = i15 - ((Game) this).Object_Info[2];
                    z2 = true;
                } else if (((Game) this).Object_Info[4] <= 91 && ((Game) this).Object_Info[4] >= 88) {
                    i11 = 16;
                    i12 = 16;
                    int i17 = ((Game) this).Object_Info[2];
                    int i18 = (32 * ((((Game) this).Object_Info[4] - 88) + 1)) - 16;
                    if (((Game) this).f227k % 720 >= 180) {
                        if (((Game) this).f227k % 720 < 360) {
                            if (((Game) this).Object_Info[19] == 0) {
                                ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] - ((Game.Math_CalcSine(270 - ((((Game) this).f227k % 720) - 180)) * i18) / 100);
                                iArr3 = ((Game) this).Object_Info;
                                c3 = 3;
                                i3 = (((Game) this).Object_Info[9] - 16) + (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            } else {
                                ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] + ((Game.Math_CalcSine(270 - ((((Game) this).f227k % 720) - 180)) * i18) / 100);
                                iArr3 = ((Game) this).Object_Info;
                                c3 = 3;
                                i3 = (((Game) this).Object_Info[9] + 16) - (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            }
                            iArr3[c3] = i3;
                            z = true;
                        } else if (((Game) this).f227k % 720 < 540) {
                            if (((Game) this).Object_Info[19] == 0) {
                                ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + ((Game.Math_CalcSine(90 + ((((Game) this).f227k % 720) - 360)) * i18) / 100);
                                ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] + 16) - (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            } else {
                                ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] - ((Game.Math_CalcSine(90 + ((((Game) this).f227k % 720) - 360)) * i18) / 100);
                                ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] - 16) + (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            }
                        } else if (((Game) this).f227k % 720 < 720) {
                            if (((Game) this).Object_Info[19] == 0) {
                                ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] + ((Game.Math_CalcSine(270 - ((((Game) this).f227k % 720) - 540)) * i18) / 100);
                                iArr2 = ((Game) this).Object_Info;
                                c2 = 3;
                                i2 = (((Game) this).Object_Info[9] + 16) - (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            } else {
                                ((Game) this).Object_Info[2] = ((Game) this).Object_Info[8] - ((Game.Math_CalcSine(270 - ((((Game) this).f227k % 720) - 540)) * i18) / 100);
                                iArr2 = ((Game) this).Object_Info;
                                c2 = 3;
                                i2 = (((Game) this).Object_Info[9] - 16) + (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                            }
                            iArr2[c2] = i2;
                            z = true;
                        }
                        z2 = z;
                    } else if (((Game) this).Object_Info[19] == 0) {
                        ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] - ((Game.Math_CalcSine(90 + (((Game) this).f227k % 720)) * i18) / 100);
                        ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] - 16) + (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                    } else {
                        ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9] + ((Game.Math_CalcSine(90 + (((Game) this).f227k % 720)) * i18) / 100);
                        ((Game) this).Object_Info[2] = (((Game) this).Object_Info[8] + 16) - (32 * ((((Game) this).Object_Info[4] - 88) + 1));
                    }
                    i13 = i17 - ((Game) this).Object_Info[2];
                } else if (((Game) this).Object_Info[4] == 160) {
                    i11 = 16;
                    i12 = 32;
                    if (((Game) this).f261b[0] && ((Game) this).Object_Info[18] == 0) {
                        ((Game) this).Object_Info[18] = 1;
                        ((Game) this).Object_Info[3] = ((Game) this).Object_Info[9];
                    }
                    ((Game) this).Object_Info[18] = 1;
                    if (((Game) this).f261b[0]) {
                        int[] iArr15 = ((Game) this).Object_Info;
                        iArr15[3] = iArr15[3] - 1;
                        if (((Game) this).Object_Info[3] < ((Game) this).Object_Info[9]) {
                            iArr = ((Game) this).Object_Info;
                            c = 3;
                            i = ((Game) this).Object_Info[9];
                        }
                    } else if (this.Game_ActID == 0) {
                        iArr = ((Game) this).Object_Info;
                        c = 3;
                        i = 688;
                    } else {
                        iArr = ((Game) this).Object_Info;
                        c = 3;
                        i = ((Game) this).Object_Info[9] + 64;
                    }
                    iArr[c] = i;
                } else if (((Game) this).Object_Info[4] == 55) {
                    i11 = 32;
                    i12 = 25;
                    if (((Game) this).f261b[((Game) this).Object_Info[4] - 40] && ((Game) this).Object_Info[18] == 0) {
                        ((Game) this).Object_Info[18] = 1;
                        ((Game) this).Object_Info[2] = 7992;
                    }
                    ((Game) this).Object_Info[18] = 1;
                    if ((((Game) this).Object_Info[8] != 7992 || ((Game) this).Object_Info[9] != 1353) && ((Game) this).f261b[((Game) this).Object_Info[4] - 40]) {
                        int[] iArr16 = ((Game) this).Object_Info;
                        iArr16[2] = iArr16[2] + 1;
                        if (((Game) this).Object_Info[2] > 7992) {
                            iArr = ((Game) this).Object_Info;
                            c = 2;
                            i = 7992;
                            iArr[c] = i;
                        }
                    }
                }
            }
        }
        int i19 = 12;
        if (!Game.f74i && !Game.f76k) {
            i19 = 16;
        }
        int i20 = -1;
        if (((Game) this).Object_Info[4] != 55 || ((Game) this).Object_Info[8] != 7992 || ((Game) this).Object_Info[9] != 1353) {
            int Actor_CheckCollision = Game.Actor_CheckCollision(Game.Player_RoughXPos(), Game.Player_RoughYPos() - i19, Game.f184b[0], Game.f184b[1] - i19, 12, i19, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], i11, i12);
            i20 = Actor_CheckCollision;
            if (Actor_CheckCollision >= 0) {
                if (i20 == 0) {
                    Game.Player_Info[1] = (((Game) this).Object_Info[3] - i12) << 8;
                    m140b(((Game) this).Object_Info[2], i11);
                    m230a(((Game) this).Object_Info[22]);
                    int[] iArr17 = Game.Player_Info;
                    iArr17[0] = iArr17[0] - (i13 << 8);
                } else if (i20 == 1) {
                    if (!Game.f70e || ((Game) this).Object_Info[4] != 227) {
                        Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i11) - 12) << 8;
                        Game.Player_Info[10] = 0;
                        if (((Game) this).Input_Array[4]) {
                            m26s();
                        }
                    }
                } else if (i20 == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i11) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[3]) {
                        m26s();
                    }
                } else {
                    if (i20 == 3) {
                        iArr8 = Game.Player_Info;
                        c8 = 1;
                        i8 = ((Game) this).Object_Info[3] + i12 + i19 + i19;
                        i9 = 1;
                    } else if (i20 == 4) {
                        if (z2) {
                            if (((Game) this).Object_Info[2] <= Game.Player_RoughXPos()) {
                                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i11) + 12) + 1) << 8;
                                Game.Player_Info[10] = 0;
                            } else if (!Game.f70e || ((Game) this).Object_Info[4] != 227) {
                                Game.Player_Info[0] = ((((Game) this).Object_Info[2] - i11) - 12) << 8;
                                Game.Player_Info[10] = 0;
                            }
                        }
                        if (z3) {
                            if (((Game) this).Object_Info[3] > Game.Player_RoughYPos() - i19) {
                                Game.Player_Info[1] = (((Game) this).Object_Info[3] - i12) << 8;
                                m140b(((Game) this).Object_Info[2], i11);
                                m230a(((Game) this).Object_Info[22]);
                                int[] iArr18 = Game.Player_Info;
                                iArr18[0] = iArr18[0] - (i13 << 8);
                                i20 = 0;
                            } else {
                                iArr8 = Game.Player_Info;
                                c8 = 1;
                                i8 = ((Game) this).Object_Info[3] + i12 + i19 + i19 + 1;
                                i9 = 8;
                            }
                        }
                    }
                    iArr8[c8] = (i8 + i9) << 8;
                    m269B();
                }
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && i20 != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: aO */
    private void m369aO() {
        Actor actor;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = ((Game) this).Object_Info[4] / 16;
        if (((Game) this).Object_Info[18] == 0) {
            ((Game) this).Object_Info[10] = ((Game) this).f227k;
            ((Game) this).Object_Info[18] = 1;
        }
        if ((((Game) this).f227k - ((Game) this).Object_Info[10]) % (i9 * 50) != 0 || ((Game) this).Object_Info[2] - Game.f214y[0] < -16 || ((Game) this).Object_Info[2] - Game.f214y[0] > 256 || ((Game) this).Object_Info[3] - Game.f214y[1] < -16 || ((Game) this).Object_Info[3] - Game.f214y[1] > 184) {
            return;
        }
        if (((Game) this).Object_Info[4] == 48 || ((Game) this).Object_Info[4] == 66 || ((Game) this).Object_Info[4] == 65 || ((Game) this).Object_Info[4] == 49 || ((Game) this).Object_Info[4] == 80 || ((Game) this).Object_Info[4] == 64 || ((Game) this).Object_Info[4] == 81) {
            if (((Game) this).Object_Info[4] == 48) {
                i8 = 96;
            }
            if (((Game) this).Object_Info[4] == 49) {
                i8 = 128;
            }
            if (((Game) this).Object_Info[4] == 64) {
                i8 = 96;
            }
            if (((Game) this).Object_Info[4] == 65) {
                i8 = 128;
            }
            if (((Game) this).Object_Info[4] == 66) {
                i8 = 196;
            }
            if (((Game) this).Object_Info[4] == 80) {
                i8 = 72;
            }
            if (((Game) this).Object_Info[4] == 81) {
                i8 = 136;
            }
            actor = this;
            i = 20;
            i2 = ((Game) this).Object_Info[2];
            i3 = ((Game) this).Object_Info[3];
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = i8;
        } else {
            if (((Game) this).Object_Info[4] == 53 || ((Game) this).Object_Info[4] == 37 || ((Game) this).Object_Info[4] == 69) {
                actor = this;
                i = 16;
                i2 = ((Game) this).Object_Info[2];
                i3 = ((Game) this).Object_Info[3];
                i4 = 0;
                i5 = 200;
            } else {
                if (((Game) this).Object_Info[4] == 55 || ((Game) this).Object_Info[4] == 71 || ((Game) this).Object_Info[4] == 23) {
                    actor = this;
                    i = 16;
                    i2 = ((Game) this).Object_Info[2];
                    i3 = ((Game) this).Object_Info[3];
                    i4 = 200;
                } else if (((Game) this).Object_Info[4] != 54) {
                    return;
                } else {
                    actor = this;
                    i = 16;
                    i2 = ((Game) this).Object_Info[2];
                    i3 = ((Game) this).Object_Info[3];
                    i4 = -200;
                }
                i5 = 0;
            }
            i6 = 0;
            i7 = 0;
        }
        actor.m216a(i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: aP */
    private void m368aP() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.Game_ActID == 2) {
            i4 = 1;
        }
        if (((Game) this).Object_Info[4] == 16) {
            int[][] m225a = m225a(10, 2);
            int i5 = 0;
            while (true) {
                if (i5 >= m225a.length) {
                    break;
                } else if (Math.abs(((((Game) this).Object_Info[2] + 32) - (64 * i4)) - m225a[i5][2]) < 2) {
                    if (((Game) this).Object_Info[5] == 0) {
                        ((Game) this).Object_Info[5] = 1;
                        ((Game) this).Object_Info[10] = ((Game) this).f227k;
                    }
                    ((Game) this).Object_Info[7] = m225a[i5][20];
                } else {
                    i5++;
                }
            }
            if (((Game) this).Object_Info[7] > 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= m225a.length) {
                        break;
                    } else if (m225a[i6][20] == ((Game) this).Object_Info[7]) {
                        ((Game) this).Object_Info[6] = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (((Game) this).Object_Info[10] != 0) {
                ((Game) this).Object_Info[5] = ((Game) this).f227k - ((Game) this).Object_Info[10];
            }
            if (((Game) this).Object_Info[5] > 0 && ((Game) this).Object_Info[7] > 0) {
                if (((Game) this).Object_Info[5] / 4 > 44) {
                    ((Game) this).Object_Info[5] = 0;
                    ((Game) this).Object_Info[6] = 0;
                    ((Game) this).Object_Info[7] = 0;
                    iArr = ((Game) this).Object_Info;
                    c = '\n';
                    i3 = 0;
                } else {
                    if (((Game) this).Object_Info[5] / 4 > 26) {
                        iArr = ((Game) this).Object_Info;
                        c = 3;
                        i = ((Game) this).Object_Info[9];
                        i2 = 160 - ((((Game) this).Object_Info[5] - 104) * 2);
                    } else {
                        if (((Game) this).Object_Info[5] / 4 > 6) {
                            iArr = ((Game) this).Object_Info;
                            c = 3;
                            i = ((Game) this).Object_Info[9];
                            i2 = (((Game) this).Object_Info[5] - 24) * 2;
                        }
                        int[] iArr2 = ((Game) this).Object_Info;
                        iArr2[5] = iArr2[5] + 1;
                    }
                    i3 = i - i2;
                }
                iArr[c] = i3;
                int[] iArr22 = ((Game) this).Object_Info;
                iArr22[5] = iArr22[5] + 1;
            }
            if (((Game) this).Object_Info[4] != 16 || ((Game) this).Object_Info[5] / 4 <= 0 || (((Game) this).Object_Info[2] - 20) - 32 > Game.Player_RoughXPos() || ((((Game) this).Object_Info[2] - 20) - 32) + 112 < Game.Player_RoughXPos() || ((Game) this).Object_Info[3] > Game.Player_RoughYPos() || ((Game) this).Object_Info[9] < Game.Player_RoughYPos()) {
                return;
            }
            Player_Hurt();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01d9  */
    /* renamed from: aQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m367aQ() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int[] iArr2;
        char c2;
        int i3;
        int Actor_CheckPlayerCollide;
        Actor actor;
        int i4 = 72;
        int i5 = 0;
        if (((Game) this).Object_Info[6] == 0 && ((Game) this).Object_Info[7] == 0) {
            ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
            ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3];
        }
        if (((Game) this).Object_Info[4] == 1) {
            ((Game) this).Object_Info[5] = ((Game) this).f227k;
            i2 = ((((Game.Math_CalcSine(((Game) this).Object_Info[5]) * 16) / 100) - 16) << 1) + 2;
        } else if (((Game) this).Object_Info[4] == 2) {
            ((Game) this).Object_Info[5] = ((Game) this).f227k;
            i2 = ((((Game.Math_CalcSine(((Game) this).Object_Info[5]) * (-16)) / 100) - 16) << 1) + 2;
        } else if (((Game) this).Object_Info[4] != 20) {
            if (((Game) this).Object_Info[4] == 4) {
                i4 = 56;
                if (((Game) this).f269e[0] || ((Game) this).Object_Info[5] != 0) {
                    if (((Game) this).f269e[0] && ((Game) this).Object_Info[5] == 0) {
                        ((Game) this).Object_Info[10] = ((Game) this).f227k;
                    }
                    ((Game) this).Object_Info[5] = ((Game) this).f227k - (((Game) this).Object_Info[10] - 1);
                    if (((Game) this).Object_Info[5] > 72) {
                        ((Game) this).Object_Info[5] = 72;
                    }
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    i = (((Game) this).Object_Info[9] - 160) + (((Game) this).Object_Info[5] * 2);
                } else {
                    iArr = ((Game) this).Object_Info;
                    c = 3;
                    i = ((Game) this).Object_Info[9] - 160;
                }
                iArr[c] = i;
                i2 = 16;
            }
            Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + i5, ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 32, i4);
            if (Actor_CheckPlayerCollide >= 0) {
                if (Actor_CheckPlayerCollide == 0) {
                    Game.Player_Info[1] = ((((Game) this).Object_Info[3] + i5) - i4) << 8;
                    m140b(((Game) this).Object_Info[2], 32);
                    m230a(((Game) this).Object_Info[22]);
                } else if (Actor_CheckPlayerCollide == 1) {
                    Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 32) - 12) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[4]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 2) {
                    Game.Player_Info[0] = (((((Game) this).Object_Info[2] + 32) + 12) + 1) << 8;
                    Game.Player_Info[10] = 0;
                    if (((Game) this).Input_Array[3]) {
                        m26s();
                    }
                } else if (Actor_CheckPlayerCollide == 3) {
                    Game.Player_Info[1] = (((((((Game) this).Object_Info[3] + i5) + i4) + 12) + 12) + 1) << 8;
                    if (((Game) this).Object_Info[4] == 1 && (((Game) this).Object_Info[5] % 360 < 90 || ((Game) this).Object_Info[5] % 360 > 270)) {
                        actor = this;
                    } else if ((((Game) this).Object_Info[4] == 2 && ((Game) this).Object_Info[5] % 360 < 270 && ((Game) this).Object_Info[5] % 360 > 90) || (((Game) this).Object_Info[4] != 1 && ((Game) this).Object_Info[4] != 2)) {
                        actor = this;
                    }
                    actor.m269B();
                }
            }
            if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && Actor_CheckPlayerCollide != 0) {
                ((Game) this).f115s = false;
            }
            ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3] + i5;
            ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
        } else {
            i4 = 56;
            if (((Game) this).Object_Info[5] != 0) {
                ((Game) this).Object_Info[5] = ((Game) this).f227k - (((Game) this).Object_Info[10] - 1);
                if (((Game) this).Object_Info[5] > 72) {
                    ((Game) this).Object_Info[5] = 72;
                }
                iArr2 = ((Game) this).Object_Info;
                c2 = 3;
                i3 = (((Game) this).Object_Info[9] - 160) + (((Game) this).Object_Info[5] * 2);
            } else if (((Game) this).f269e[1]) {
                ((Game) this).Object_Info[5] = 1;
                iArr2 = ((Game) this).Object_Info;
                c2 = '\n';
                i3 = ((Game) this).f227k;
            } else {
                iArr2 = ((Game) this).Object_Info;
                c2 = 3;
                i3 = ((Game) this).Object_Info[9] - 160;
            }
            iArr2[c2] = i3;
            i2 = 16;
        }
        i5 = i2;
        Actor_CheckPlayerCollide = Game.Actor_CheckPlayerCollide(((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + i5, ((Game) this).Object_Info[6], ((Game) this).Object_Info[7], 32, i4);
        if (Actor_CheckPlayerCollide >= 0) {
        }
        if (((Game) this).f115s) {
            ((Game) this).f115s = false;
        }
        ((Game) this).Object_Info[7] = ((Game) this).Object_Info[3] + i5;
        ((Game) this).Object_Info[6] = ((Game) this).Object_Info[2];
    }

    /* renamed from: aR */
    private void m366aR() {
        m336aw();
    }

    /* renamed from: aS */
    private void m365aS() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr2;
        char c2;
        char c3 = 0;
        int i11 = ((((Game) this).f226j >> 2) % 4) * 16;
        if ((((Game) this).f226j >> 2) % 4 == 3) {
            c3 = 4;
            i11 = 16;
        }
        if (((Game) this).Object_Info[5] == 0) {
            i = 0;
            i2 = 0;
            i3 = i11;
            i4 = 16;
            i5 = 16;
            iArr = Game.f179a;
            c = c3;
        } else {
            i = 0;
            i2 = 16;
            i3 = (((((Game) this).f227k - ((Game) this).Object_Info[10]) / 5) % 4) * 16;
            i4 = 16;
            i5 = 16;
            iArr = Game.f179a;
            c = 0;
        }
        Game.m133b(i, i2, i3, i4, i5, iArr[c], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
        if (((Game) this).Object_Info[11] == 1) {
            if (((Game) this).Object_Info[5] == 0) {
                i6 = 0;
                i7 = 0;
                i8 = i11;
                i9 = 16;
                i10 = 16;
                iArr2 = Game.f179a;
                c2 = c3;
            } else {
                i6 = 0;
                i7 = 16;
                i8 = (((((Game) this).f227k - ((Game) this).Object_Info[10]) / 5) % 4) * 16;
                i9 = 16;
                i10 = 16;
                iArr2 = Game.f179a;
                c2 = 0;
            }
            Game.m133b(i6, i7, i8, i9, i10, iArr2[c2], ((Game) this).Object_Info[2], ((Game) this).Object_Info[12]);
        }
    }

    /* renamed from: aT */
    private void m364aT() {
        int i;
        int i2;
        int i3;
        int Math_CalcSine = Game.Math_CalcSine(((Game) this).f226j * 3) * 87;
        int i4 = ((Game) this).Object_Info[4] + 1;
        if (((Game) this).Object_Info[4] == 5 || ((Game) this).Object_Info[19] == 1) {
            Math_CalcSine = -Math_CalcSine;
        }
        for (int i5 = 1; i5 < i4; i5++) {
            if (this.Game_ZoneID != 3) {
                if (this.Game_ZoneID != 5) {
                    i = 3;
                    i2 = 16;
                    i3 = 32;
                } else {
                    i = 3;
                    i2 = 0;
                    i3 = 96;
                }
                Game.m133b(i, i2, i3, 16, 16, Game.f179a[0], ((Game) this).Object_Info[2] + ((i5 * (Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * 16)) / 100), ((Game) this).Object_Info[3] + ((i5 * (Game.Math_CalcCosine(180 + (Math_CalcSine / 100)) * 16)) / 100));
            }
        }
        if (this.Game_ZoneID != 3 && this.Game_ZoneID != 5) {
            Game.m133b(3, 16, 16, 16, 16, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
        }
        if (this.Game_ZoneID == 3 || this.Game_ZoneID == 5) {
            return;
        }
        int i6 = (i4 * 16) - 8;
        Game.m133b(3, 0, 0, 48, 16, Game.f179a[0], ((Game) this).Object_Info[2] + ((Game.Math_CalcSine(180 + (Math_CalcSine / 100)) * i6) / 100), ((Game) this).Object_Info[3] + ((Game.Math_CalcCosine(180 + (Math_CalcSine / 100)) * i6) / 100));
    }

    /* renamed from: aU */
    private void m363aU() {
        if (Game.GFX_GameArray[5] == null) {
            return;
        }
        int height = Game.GFX_GameArray[5].getHeight();
        int width = Game.GFX_GameArray[5].getWidth() / 3;
        for (int i = 0; i < 12; i++) {
            int abs = ((Game) this).Object_Info[10] - Math.abs(((Game) this).Object_Info[5] - i);
            int i2 = abs;
            if (abs < 0) {
                i2 = 0;
            }
            if (i == 0 || i == 11) {
                i2 = 0;
            }
            Game.m133b(5, width * 2, 0, width, height, Game.f179a[0], (((Game) this).Object_Info[2] - 96) + (i * 16), ((Game) this).Object_Info[3] + i2);
        }
    }

    /* renamed from: aV */
    private void m362aV() {
        int[] iArr = {-4, 4};
        for (int i = 0; i < 12; i++) {
            int i2 = ((((Game) this).f226j / 10) + (12 - i)) % 7;
            Game.m133b(4, 0, i2 * 24, 16, 24, Game.f179a[0], (((Game) this).Object_Info[2] - 96) + (i * 16), ((Game) this).Object_Info[3] + iArr[i2 / 4]);
        }
    }

    /* renamed from: aW */
    private void m361aW() {
        int i = Game.f179a[0];
        if (((Game) this).Object_Info[4] != 0) {
            i = Game.f179a[4];
        }
        int i2 = ((Game) this).Object_Info[5] != 0 ? (((Game) this).f227k / 2) - ((Game) this).Object_Info[10] : 0;
        for (int i3 = 0; i3 < 36; i3++) {
            int i4 = i2 - (i3 * 3);
            Game.m133b(6, (i3 / 6) * 16, 96 - (((i3 % 6) + 1) * 16), 16, 16, i, (((Game) this).Object_Info[2] + (((Game) this).Object_Info[4] != 0 ? (96 - ((i3 / 6) * 16)) - 16 : (i3 / 6) * 16)) - 40, (((((Game) this).Object_Info[3] + 96) - (((i3 % 6) + 1) * 16)) - 48) + (i4 < 0 ? 0 : i4 * (i2 / 6)) + 0);
        }
    }

    /* renamed from: aX */
    private void m360aX() {
        char c = ((Game) this).Object_Info[4] == 21 ? (char) 2 : ((Game) this).Object_Info[4] == 1 ? (char) 0 : (char) 1;
        char c2 = c;
        if (c != 2) {
            if (c2 == 0) {
                Game.m214a(7, 0, 96, 128, 80, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 16, 3);
                return;
            }
            for (int i = 0; i < 4; i++) {
                Game.m214a(7, 0, 0, 16, 96, Game.f179a[0], (((Game) this).Object_Info[2] + (i * 16)) - 32, ((Game) this).Object_Info[3] - 48, 20);
            }
            return;
        }
        Game.m214a(7, 16, 0, 128, 96, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 16, 3);
        if (((Game) this).Object_Info[16] >= 60) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = ((Game) this).f226j - ((Game) this).Object_Info[15];
                if ((i2 << 3) < i3) {
                    i3 = i2 << 3;
                }
                Game.m214a(101, 0, ((((Game) this).f226j + (i2 << 1)) % 4) * 32, 24, 32, Game.f179a[0], (((Game) this).Object_Info[2] + (i3 << 1)) - 56, ((Game) this).Object_Info[3] - Game.f206d[c2][i3], 3);
            }
        }
    }

    /* renamed from: aY */
    private void m359aY() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = Game.f179a[0];
        int i10 = (((Game) this).Object_Info[3] - ((Game) this).Object_Info[9]) % 16;
        for (int i11 = 0; i11 <= (((Game) this).Object_Info[3] - ((Game) this).Object_Info[9]) / 16; i11++) {
            int i12 = (((Game) this).Object_Info[9] - 24) + (i11 * 16) + i10;
            if (i11 == 0) {
                int max = Math.max(Game.m107d(((((Game) this).Object_Info[9] - 24) - Game.Camera_Pos[1]) + 4), 0);
                Game.GFX_Painter.clipRect(0, Game.f13i + max, Game.f174g, Game.f175h - max);
            }
            Game.m133b(94, 0, 8, 32, 16, i9, ((Game) this).Object_Info[8], i12);
            if (i11 == 0) {
                Game.GFX_Painter.setClip(0, Game.f13i, Game.f174g, Game.f175h);
            }
        }
        Game.m133b(94, 0, 0, 32, 8, i9, ((Game) this).Object_Info[8], ((Game) this).Object_Info[9] - 24);
        Game.m133b(94, 0, 24, 32, 8, i9, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 16);
        if (((Game) this).Object_Info[4] == 128 || ((Game) this).Object_Info[4] == 2) {
            i = 8;
            i2 = 0;
            i3 = 0;
            i4 = 112;
            i5 = 56;
            i6 = i9;
            i7 = ((Game) this).Object_Info[2];
            i8 = ((Game) this).Object_Info[3] + 16;
        } else {
            if (((Game) this).Object_Info[4] == 35) {
                i = 95;
                i2 = 0;
                i3 = 0;
                i4 = 32;
                i5 = 24;
                i6 = i9;
                i7 = ((Game) this).Object_Info[2];
            } else if (((Game) this).Object_Info[4] != 17 && ((Game) this).Object_Info[4] != 18) {
                return;
            } else {
                Game.m133b(8, 0, 24, 112, 32, i9, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 28);
                Game.m133b(8, 0, 0, 48, 24, i9, ((Game) this).Object_Info[2] - 24, ((Game) this).Object_Info[3]);
                i = 8;
                i2 = 64;
                i3 = 0;
                i4 = 48;
                i5 = 24;
                i6 = i9;
                i7 = ((Game) this).Object_Info[2] + 24;
            }
            i8 = ((Game) this).Object_Info[3];
        }
        Game.m133b(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: aZ */
    private void m358aZ() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (Game.GFX_GameArray[9] == null) {
            return;
        }
        char c = ((Game) this).Object_Info[19] == 2 ? (char) 2 : (char) 0;
        int width = Game.GFX_GameArray[9].getWidth();
        int i9 = width / 5;
        int height = Game.GFX_GameArray[9].getHeight();
        if (((Game) this).Object_Info[4] == 48) {
            for (int i10 = 0; i10 < 3; i10++) {
                Game.m133b(9, 0, 0, i9, height, Game.f179a[c], (((Game) this).Object_Info[2] - 24) + (i10 * 24), ((Game) this).Object_Info[3]);
            }
        } else if (((Game) this).Object_Info[4] == 64) {
            if (this.Game_ZoneID == 1 && this.Game_ActID == 0 && ((Game) this).Object_Info[4] == 64 && ((Game) this).Object_Info[19] != 0) {
                return;
            }
            for (int i11 = 0; i11 < 6; i11++) {
                Game.m133b(9, height >> 1, 0, i9, height, Game.f179a[c], (((Game) this).Object_Info[2] - 60) + (i11 * 24), ((Game) this).Object_Info[3]);
            }
        } else {
            if (((Game) this).Object_Info[4] == 18 || ((Game) this).Object_Info[4] == 16) {
                i = 9;
                i2 = 0;
                i3 = 0;
                i4 = width;
                i5 = height;
                i6 = Game.f179a[((Game) this).Object_Info[19] == 0 ? (char) 3 : (char) 1];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((Game) this).Object_Info[3];
            } else if (((Game) this).Object_Info[4] == 82) {
                if (((Game) this).Object_Info[19] == 0) {
                    i = 9;
                    i2 = height >> 1;
                    i3 = 0;
                    i4 = i9;
                    i5 = height;
                    i6 = Game.f179a[7];
                    i7 = ((Game) this).Object_Info[2];
                    i8 = ((Game) this).Object_Info[3];
                } else {
                    i = 9;
                    i2 = height >> 1;
                    i3 = 0;
                    i4 = i9;
                    i5 = height;
                    i6 = Game.f179a[1];
                    i7 = ((Game) this).Object_Info[2];
                    i8 = ((Game) this).Object_Info[3];
                }
            } else if (((Game) this).Object_Info[4] == 32) {
                i = 9;
                i2 = height >> 1;
                i3 = 0;
                i4 = i9;
                i5 = height;
                i6 = Game.f179a[c];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((Game) this).Object_Info[3];
            } else {
                i = 9;
                i2 = 0;
                i3 = 0;
                i4 = width;
                i5 = height;
                i6 = Game.f179a[c];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((Game) this).Object_Info[3] - 4;
            }
            Game.m133b(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: ba */
    private void m311ba() {
        if (((Game) this).Object_Info[4] != 129) {
            Game.m133b(54, 0, 0, Game.GFX_GameArray[54].getWidth(), Game.GFX_GameArray[54].getHeight(), Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
            return;
        }
        for (int i = 0; i < 4; i++) {
            Game.m220a(54, 0, (((Game) this).Object_Info[2] - 62) + (31 * i), ((Game) this).Object_Info[3] - 16, 20);
        }
    }

    /* renamed from: bb */
    private void m310bb() {
        Game.m133b(11, 0, 0, Game.GFX_GameArray[11].getWidth(), Game.GFX_GameArray[11].getHeight(), Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
    }

    /* renamed from: bc */
    private void m309bc() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (((Game) this).Object_Info[4] == 2 || ((Game) this).Object_Info[4] == 1) {
            Game.m133b(54, 0, 0, 31, 32, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
            if (((Game) this).Object_Info[4] == 2) {
                m221a((((Game) this).Object_Info[2] >> 4) - 1, (((Game) this).Object_Info[3] >> 4) - 1, 4, 4);
            }
        } else if (((Game) this).Object_Info[4] == 65) {
            for (int i9 = 0; i9 < 3; i9++) {
                Game.m133b(54, 0, 0, 31, 32, Game.f179a[0], ((Game) this).Object_Info[2] + (i9 << 5), ((Game) this).Object_Info[3]);
            }
        } else {
            if (((Game) this).Object_Info[4] == 57) {
                for (int i10 = 1; i10 < 15; i10++) {
                    Game.m133b(12, 0, 24, 8, 24, Game.f179a[0], (((Game) this).Object_Info[2] - 64) + (i10 << 3), ((Game) this).Object_Info[3] - 8);
                }
                Game.m133b(12, 0, 0, 8, 24, Game.f179a[0], ((Game) this).Object_Info[2] - 64, ((Game) this).Object_Info[3] - 8);
                i = 12;
                i2 = 0;
                i3 = 0;
                i4 = 8;
                i5 = 24;
                i6 = Game.f179a[4];
                i7 = ((Game) this).Object_Info[2] + 56;
                i8 = ((Game) this).Object_Info[3] - 8;
            } else if (((Game) this).Object_Info[4] == 40) {
                for (int i11 = 0; i11 < 8; i11++) {
                    Game.m133b(12, 8, (i11 % 2) * 24, 8, 24, Game.f179a[0], (((Game) this).Object_Info[2] - 32) + (i11 << 3), ((Game) this).Object_Info[3] - 8);
                }
                return;
            } else if (!(((Game) this).Object_Info[4] == 7 || ((Game) this).Object_Info[4] == 4) || ((Game) this).Object_Info[5] == 0) {
                return;
            } else {
                i = 12;
                i2 = 0;
                i3 = 0;
                i4 = 32;
                i5 = 16;
                i6 = Game.f179a[4];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((Game) this).Object_Info[3];
            }
            Game.m133b(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: bd */
    private void m308bd() {
        for (int i = 0; i < 2; i++) {
            Game.m133b(13, 0, ((((Game) this).f226j + i) % 3) * 32, 32, 32, Game.f179a[0], ((Game) this).Object_Info[2] + (i * 32) + 48, (((Game) this).Object_Info[3] + (i * 32)) - 16);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = (((Game) this).Object_Info[2] - Game.Camera_Pos[0]) + ((i2 >> 1) * 32) + 16;
            for (int i4 = 0; i4 < (i3 / 32) + 2; i4++) {
                Game.m133b(99, 0, ((((Game) this).f226j + i2) % 3) * 16, 32, 16, Game.f179a[0], ((((Game) this).Object_Info[2] + ((i2 >> 1) * 32)) + 16) - (i4 * 32), (((Game) this).Object_Info[3] + (i2 * 16)) - 24);
            }
        }
    }

    /* renamed from: be */
    private void m307be() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((Game) this).Object_Info[5] / 4;
        int i7 = i6;
        if (i6 != 0 && ((Game) this).Object_Info[3] - 32 < ((Game) this).Object_Info[9]) {
            Game.m114c(98, 0, 32 * (((Game) this).f226j % 2), 64, 32, Game.f179a[0], ((Game) this).Object_Info[2] - 32, ((Game) this).Object_Info[3] - 32);
        }
        if (i7 > 6) {
            i7 = 6;
        }
        int i8 = 1;
        while (i8 < i7) {
            if (((Game) this).Object_Info[3] - (i8 * 32) < ((Game) this).Object_Info[9]) {
                i = 14;
                i2 = 0;
                i3 = 32 * (i8 % 2);
                i4 = 64;
                i5 = 32;
            } else if ((((Game) this).Object_Info[3] - (i8 * 32)) - 32 < ((Game) this).Object_Info[9]) {
                i = 14;
                i2 = 0;
                i3 = 32 * (i8 % 2);
                i4 = 64;
                i5 = 24;
            } else {
                i8++;
            }
            Game.m114c(i, i2, i3, i4, i5, Game.f179a[0], ((Game) this).Object_Info[2] - 32, (((Game) this).Object_Info[3] - (i8 * 32)) - 32);
            i8++;
        }
        if (((Game) this).Object_Info[5] / 4 != 0 && (((Game) this).Object_Info[3] - (i8 * 32)) - 32 < ((Game) this).Object_Info[9]) {
            Game.m114c(98, 0, 64 + (32 * (((Game) this).f226j % 2)), 64, 32, Game.f179a[0], ((Game) this).Object_Info[2] - 32, (((Game) this).Object_Info[3] - (i8 * 32)) - 32);
        }
        if (((Game) this).Object_Info[10] <= 0 || Game.f200q.length <= ((Game) this).Object_Info[10] / 3) {
            return;
        }
        Game.m214a(77, 0, 32 * Game.f200q[((Game) this).Object_Info[10] / 3], 112, 32, Game.f179a[0], ((Game) this).Object_Info[8], ((Game) this).Object_Info[9], 17);
    }

    /* renamed from: bf */
    private void m306bf() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int width = Game.GFX_GameArray[15].getWidth();
        Game.GFX_GameArray[15].getHeight();
        if (((Game) this).f269e[((Game) this).Object_Info[4]]) {
            i = 15;
            i2 = 0;
            i3 = 16;
            i4 = width;
            i5 = 8;
            i6 = Game.f179a[0];
            i7 = ((Game) this).Object_Info[2];
            i8 = ((Game) this).Object_Info[3];
            i9 = 1;
        } else {
            i = 15;
            i2 = 0;
            i3 = 0;
            i4 = width;
            i5 = 11;
            i6 = Game.f179a[0];
            i7 = ((Game) this).Object_Info[2];
            i8 = ((Game) this).Object_Info[3];
            i9 = 3;
        }
        Game.m133b(i, i2, i3, i4, i5, i6, i7, i8 - i9);
        Game.m133b(15, 0, 11, width, 5, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 5);
    }

    /* renamed from: bg */
    private void m305bg() {
        if (this.Game_ZoneID != 3) {
            if (((Game) this).Object_Info[4] != 16) {
                Game.m133b(16, 0, 0, 64, 32, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + ((Game) this).Object_Info[14]);
                return;
            }
            Game.m133b(16, 0, 32, 64, 48, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 8 + ((Game) this).Object_Info[14]);
            for (int i = 5; i >= 0; i--) {
                Game.m133b(16, 0, 64, 64, 16, 0, ((Game) this).Object_Info[2], (((((Game) this).Object_Info[3] + 8) + 48) - 16) + (16 * i) + ((Game) this).Object_Info[14]);
            }
        }
    }

    /* renamed from: bh */
    private void m304bh() {
        m288bx();
    }

    /* renamed from: bi */
    private void m303bi() {
        int i = ((Game) this).Object_Info[4] == 0 ? 0 : 1;
        if (((Game) this).Object_Info[10] != 1) {
            for (int i2 = 0; i2 < 4; i2++) {
                Game.m114c(18, i * 16, 0, 16, 16, 0, ((Game) this).Object_Info[2] - 16, ((((Game) this).Object_Info[3] - 16) - 16) + (i2 * 16));
            }
        }
        int i3 = ((Game) this).Object_Info[4] == 2 ? 2 : 1;
        if (((Game) this).Object_Info[11] != 1) {
            for (int i4 = 0; i4 < 4; i4++) {
                Game.m114c(18, i3 * 16, 0, 16, 16, 0, ((Game) this).Object_Info[2], ((((Game) this).Object_Info[3] - 16) - 16) + (i4 * 16));
            }
        }
    }

    /* renamed from: bj */
    private void m302bj() {
        int i = 0;
        if (((Game) this).Object_Info[5] < 129) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = Game.f195l[i2];
                if (Game.f195l[i2] % 4 >= 2) {
                    i3 -= 2;
                }
                if (((Game) this).Object_Info[15] != 0) {
                    int i4 = (((Game) this).f227k - ((Game) this).Object_Info[16]) - Game.f196m[i2];
                    i = i4;
                    if (i4 < 0) {
                        i = 0;
                    }
                }
                int width = Game.GFX_GameArray[27].getWidth() / 4;
                Game.m133b(27, (i3 % 4) * width, (i3 / 4) * width, width, width, 0, ((((Game) this).Object_Info[2] + ((Game.f195l[i2] % 4) * 16)) - 16) - 8, ((Game) this).Object_Info[3] + ((Game.f195l[i2] / 4) * 16) + (i * (i / 5)));
            }
        }
    }

    /* renamed from: bk */
    private void m301bk() {
        Game.m133b(27, 0, 0, 32, 32, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
    }

    /* renamed from: bl */
    private void m300bl() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int Math_CalcSine;
        int Math_CalcCosine;
        if (((Game) this).f286t || ((Game) this).f287u) {
            return;
        }
        if (((Game) this).Object_Info[5] == 0) {
            i = 36;
            i2 = 0;
            i3 = 16;
            i4 = 16;
            i5 = 16;
            i6 = Game.f179a[4];
            Math_CalcSine = ((Game) this).Object_Info[2];
            Math_CalcCosine = ((Game) this).Object_Info[3] - 32;
        } else {
            i = 36;
            i2 = 0;
            i3 = 0;
            i4 = 16;
            i5 = 16;
            i6 = Game.f179a[4];
            Math_CalcSine = ((Game) this).Object_Info[2] - ((Game.Math_CalcSine((90 * ((Game) this).Object_Info[5]) / 4) * 8) / 100);
            Math_CalcCosine = (((Game) this).Object_Info[3] - 24) + ((Game.Math_CalcCosine((90 * ((Game) this).Object_Info[5]) / 4) * 8) / 100);
        }
        Game.m133b(i, i2, i3, i4, i5, i6, Math_CalcSine, Math_CalcCosine - 4);
        Game.m133b(36, 0, 32, 16, 48, Game.f179a[4], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 4);
    }

    /* renamed from: bm */
    private void m299bm() {
        int i;
        int i2 = 0;
        if (((Game) this).Object_Info[4] == 1) {
            i = 1;
        } else if (((Game) this).Object_Info[4] == 2) {
            i = 2;
        } else if (((Game) this).Object_Info[4] == 16) {
            i = 3;
        } else if (((Game) this).Object_Info[4] != 17) {
            if (((Game) this).Object_Info[4] == 18) {
                i = 5;
            }
            Game.m133b(37, i2 * 16, 0, 16, 64, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
        } else {
            i = 4;
        }
        i2 = i;
        Game.m133b(37, i2 * 16, 0, 16, 64, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
    }

    /* renamed from: bn */
    private void m298bn() {
        int i;
        int i2 = 32;
        if (Game.GFX_GameArray[42] == null) {
            return;
        }
        int width = Game.GFX_GameArray[42].getWidth();
        int i3 = 0;
        if (((Game) this).Object_Info[4] >= 7) {
            return;
        }
        if (Game.f201r[((Game) this).Object_Info[4]] == 8) {
            i2 = 16;
            i3 = 8;
        }
        if (((Game) this).Object_Info[5] != 0 && ((Game) this).Object_Info[7] < 60) {
            if (((Game) this).Object_Info[5] >= 7) {
                return;
            }
            int i4 = ((Game) this).Object_Info[7];
            int i5 = i4;
            if (i4 >= 48) {
                i5 = 48;
            }
            Game.m133b(42, 8, (Game.f201r[((Game) this).Object_Info[5]] * i2) + 7, 16, 14, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - i5);
        }
        if (Game.f201r[((Game) this).Object_Info[4]] != 8) {
            i = ((Game) this).f226j % 2 == 0 ? Game.f201r[((Game) this).Object_Info[4]] * i2 : (((((Game) this).f226j % 6) / 2) + 5) * i2;
        } else {
            i = 256;
            i2 = 16;
        }
        Game.m133b(42, 0, i, width, i2, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + i3);
    }

    /* renamed from: bo */
    private void m297bo() {
        m298bn();
    }

    /* renamed from: bp */
    private void m296bp() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (((Game) this).Object_Info[10] / 3 > 22) {
            i4 = 48;
        }
        if (((Game) this).Object_Info[5] != 2) {
            i = 44;
            i2 = 0;
            i3 = i4 + (((((Game) this).Object_Info[10] / 3) % 4) * 48);
        } else {
            i = 44;
            i2 = 0;
            i3 = 192;
        }
        Game.m133b(i, i2, i3, 48, 48, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] + 10);
        if (((Game) this).Object_Info[5] == 1) {
            Game.m133b(0, 16, ((((Game) this).Object_Info[10] / 4) % 4) * 16, 16, 16, Game.f202s[(((Game) this).Object_Info[10] / 2) % 4], (((Game) this).Object_Info[2] + Game.f203t[(((Game) this).Object_Info[10] / 4) % 10]) - 32, ((((Game) this).Object_Info[3] + 10) + Game.f204u[(((Game) this).Object_Info[10] / 4) % 10]) - 32);
        }
    }

    /* renamed from: bq */
    private void m295bq() {
        int width = Game.GFX_GameArray[45].getWidth();
        int i = (((Game) this).Object_Info[4] == 0 || ((Game) this).Object_Info[4] == 3) ? 0 : ((Game) this).Object_Info[4] == 1 ? 48 : 24;
        if (((Game) this).Object_Info[5] == 1) {
            Game.m133b(45, 0, i, width, 24, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
        }
    }

    /* renamed from: br */
    private void m294br() {
        m295bq();
    }

    /* renamed from: bs */
    private void m293bs() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (((Game) this).Object_Info[4] == 1) {
            if (((Game) this).Object_Info[5] < 2) {
                Game.m133b(55, (((Game) this).f226j % 2) * 24, 96, 24, 16, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
                i = 55;
                i2 = 0;
                i3 = 0;
                i4 = 64;
                i5 = 64;
                i6 = Game.f179a[0];
                i7 = ((Game) this).Object_Info[8];
                i8 = ((Game) this).Object_Info[9];
            } else {
                i = 55;
                i2 = 0;
                i3 = 64;
                i4 = 64;
                i5 = 32;
                i6 = Game.f179a[0];
                i7 = ((Game) this).Object_Info[8];
                i8 = ((Game) this).Object_Info[9] + 16;
            }
            Game.m133b(i, i2, i3, i4, i5, i6, i7, i8 + 37);
        }
    }

    /* renamed from: bt */
    private void m292bt() {
        Game.m133b(56, 0, 32, 32, 32, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
    }

    /* renamed from: bu */
    private void m291bu() {
        Game.m220a(58, 0, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 3);
    }

    /* renamed from: bv */
    private void m290bv() {
        Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 60, 0, Game.f179a[0]);
    }

    /* renamed from: n */
    private void m272n(int i, int i2, int i3) {
        if (i < 0) {
            i += 360;
        }
        if (360 >= i) {
            i -= (i / 360) * 360;
        }
        if (i <= 90) {
            ((Game) this).Object_Info[i2] = Game.Sine_ResultTable[90 - i];
            ((Game) this).Object_Info[i3] = Game.Sine_ResultTable[i];
        }
        if (i > 90 && i <= 180) {
            ((Game) this).Object_Info[i2] = -Game.Sine_ResultTable[90 - (180 - i)];
            ((Game) this).Object_Info[i3] = Game.Sine_ResultTable[180 - i];
        }
        if (i > 180 && i <= 270) {
            ((Game) this).Object_Info[i2] = -Game.Sine_ResultTable[90 - (i - 180)];
            ((Game) this).Object_Info[i3] = -Game.Sine_ResultTable[i - 180];
        }
        if (i <= 270 || i >= 360) {
            return;
        }
        ((Game) this).Object_Info[i2] = Game.Sine_ResultTable[90 - (360 - i)];
        ((Game) this).Object_Info[i3] = -Game.Sine_ResultTable[360 - i];
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ad  */
    /* renamed from: bw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m289bw() {
        int i;
        int i2;
        Actor actor;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        int i10 = ((Game) this).f226j - ((Game) this).Object_Info[5];
        if (((Game) this).Object_Info[4] == 213 || ((Game) this).Object_Info[4] == 181 || ((Game) this).Object_Info[4] == 197 || ((Game) this).Object_Info[4] == 101 || ((Game) this).Object_Info[4] == 69 || ((Game) this).Object_Info[4] == 53) {
            i = 5;
        } else if (((Game) this).Object_Info[4] == 212 || ((Game) this).Object_Info[4] == 196 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 68 || ((Game) this).Object_Info[4] == 52) {
            i = 4;
        } else if (((Game) this).Object_Info[4] != 38) {
            if (((Game) this).Object_Info[4] == 195) {
                i = 3;
            }
            if (((Game) this).Object_Info[4] != 181 || ((Game) this).Object_Info[4] == 101) {
                i2 = 12;
            } else if (((Game) this).Object_Info[4] == 196 || ((Game) this).Object_Info[4] == 197 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 195) {
                i2 = 10;
            } else if (((Game) this).Object_Info[4] == 213 || ((Game) this).Object_Info[4] == 212 || ((Game) this).Object_Info[4] == 69 || ((Game) this).Object_Info[4] == 68) {
                i2 = 8;
            } else if (((Game) this).Object_Info[4] != 52 && ((Game) this).Object_Info[4] != 53) {
                if (((Game) this).Object_Info[4] == 38) {
                    i2 = 4;
                }
                if (((Game) this).Object_Info[4] != 69 || ((Game) this).Object_Info[4] == 84 || ((Game) this).Object_Info[4] == 101 || ((Game) this).Object_Info[4] == 38 || ((Game) this).Object_Info[4] == 68 || ((Game) this).Object_Info[4] == 52 || ((Game) this).Object_Info[4] == 53) {
                    actor = this;
                    i3 = 360 - ((((360 / i9) - (i10 % (360 / i9))) * i9) % 360);
                } else {
                    actor = this;
                    i3 = ((360 / i9) - (i10 % (360 / i9))) * i9;
                }
                actor.m272n(i3, 16, 17);
                if (((Game) this).Object_Info[4] != 84 || ((Game) this).Object_Info[19] == 1) {
                    m272n((i10 % (360 / i9)) * i9, 16, 17);
                }
                if (this.Game_ZoneID != 4) {
                    int i11 = 1;
                    while (i11 < i8) {
                        Game.m136b(((Game) this).Object_Info[2] + ((i11 * (((Game) this).Object_Info[16] * 16)) / 10000), ((Game) this).Object_Info[3] + ((i11 * (((Game) this).Object_Info[17] * 16)) / 10000), 60, 2, Game.f179a[0]);
                        i11++;
                    }
                    Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 60, 4, Game.f179a[0]);
                    i4 = ((Game) this).Object_Info[2] + ((i11 * (((Game) this).Object_Info[16] * 16)) / 10000);
                    i5 = ((Game) this).Object_Info[3] + ((i11 * (((Game) this).Object_Info[17] * 16)) / 10000);
                    i6 = 60;
                    i7 = 3;
                } else {
                    int i12 = 1;
                    while (i12 < i8) {
                        Game.m136b(((Game) this).Object_Info[2] + ((i12 * (((Game) this).Object_Info[16] * 16)) / 10000), ((Game) this).Object_Info[3] + ((i12 * (((Game) this).Object_Info[17] * 16)) / 10000), 60, 1, Game.f179a[0]);
                        i12++;
                    }
                    Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 60, 1, Game.f179a[0]);
                    i4 = ((Game) this).Object_Info[2] + ((i12 * (((Game) this).Object_Info[16] * 16)) / 10000);
                    i5 = ((Game) this).Object_Info[3] + ((i12 * (((Game) this).Object_Info[17] * 16)) / 10000);
                    i6 = 60;
                    i7 = 1;
                }
                Game.m136b(i4, i5, i6, i7, Game.f179a[0]);
            } else {
                i2 = 6;
            }
            i9 = i2;
            if (((Game) this).Object_Info[4] != 69) {
            }
            actor = this;
            i3 = 360 - ((((360 / i9) - (i10 % (360 / i9))) * i9) % 360);
            actor.m272n(i3, 16, 17);
            if (((Game) this).Object_Info[4] != 84) {
            }
            m272n((i10 % (360 / i9)) * i9, 16, 17);
            if (this.Game_ZoneID != 4) {
            }
            Game.m136b(i4, i5, i6, i7, Game.f179a[0]);
        } else {
            i = 6;
        }
        i8 = i;
        if (((Game) this).Object_Info[4] != 181) {
        }
        i2 = 12;
        i9 = i2;
        if (((Game) this).Object_Info[4] != 69) {
        }
        actor = this;
        i3 = 360 - ((((360 / i9) - (i10 % (360 / i9))) * i9) % 360);
        actor.m272n(i3, 16, 17);
        if (((Game) this).Object_Info[4] != 84) {
        }
        m272n((i10 % (360 / i9)) * i9, 16, 17);
        if (this.Game_ZoneID != 4) {
        }
        Game.m136b(i4, i5, i6, i7, Game.f179a[0]);
    }

    /* renamed from: bx */
    private void m288bx() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((Game) this).Object_Info[2];
        int i7 = ((Game) this).Object_Info[3];
        if (((Game) this).Object_Info[4] >= 240) {
            for (int i8 = 0; i8 < 4; i8++) {
                Game.m220a(107, 0, (i6 - 48) + (i8 * 32), i7, 3);
            }
            return;
        }
        if (((Game) this).Object_Info[4] < 224) {
            if (((Game) this).Object_Info[4] <= 2) {
                i = 17;
                i4 = 0;
                i3 = i6 - 16;
                i2 = i7 - 16;
                i5 = 20;
            } else if (((Game) this).Object_Info[4] == 19) {
                Game.m220a(17, 0, i6 - 32, i7 - 32, 20);
                Game.m220a(17, 0, i6, i7 - 32, 20);
                Game.m220a(17, 0, i6 - 32, i7, 20);
                i = 17;
                i4 = 0;
                i3 = i6;
                i2 = i7;
                i5 = 20;
            } else if (((Game) this).Object_Info[4] <= 91 && ((Game) this).Object_Info[4] >= 88) {
                i = 21;
                i4 = 0;
                i3 = i6;
                i2 = i7;
                i5 = 3;
            } else if (((Game) this).Object_Info[4] == 160) {
                Game.m220a(17, 0, i6, i7 - 16, 3);
                i = 17;
                i4 = 0;
                i3 = i6;
                i2 = i7 + 16;
                i5 = 3;
            } else if (((Game) this).Object_Info[4] != 55) {
                return;
            } else {
                if (((Game) this).Object_Info[8] == 7992 && ((Game) this).Object_Info[9] == 1353) {
                    return;
                }
            }
            Game.m220a(i, i4, i3, i2, i5);
        }
        i = 107;
        i4 = 0;
        i3 = i6;
        i2 = i7;
        i5 = 3;
        Game.m220a(i, i4, i3, i2, i5);
    }

    /* renamed from: by */
    private void m287by() {
        byte b = 0;
        int i = -25;
        if (this.Game_ZoneID == 3) {
            if (((Game) this).Object_Info[4] == 54) {
                b = 4;
                i = 25;
            }
            Game.m133b(75, 0, 0, 16, 32, Game.f179a[b == 1 ? 1 : 0], ((Game) this).Object_Info[2] + i, ((Game) this).Object_Info[3]);
        }
    }

    /* renamed from: bz */
    private void m286bz() {
        int i = ((Game) this).Object_Info[5] / 4;
        if (((Game) this).Object_Info[4] != 16 || i <= 0) {
            return;
        }
        int i2 = i < 6 ? i % 2 : (i % 2) + 2;
        int width = Game.GFX_GameArray[14].getWidth();
        int i3 = 0;
        while (i3 < (((Game) this).Object_Info[9] - ((Game) this).Object_Info[3]) / 32) {
            Game.m114c(14, 0, (width / 2) * (i3 % 2), width, width / 2, Game.f179a[0], ((((Game) this).Object_Info[2] - 20) + 24) - 32, (((Game) this).Object_Info[3] - 48) + (i3 * 32) + 16);
            i3++;
        }
        int i4 = (((Game) this).Object_Info[9] - ((Game) this).Object_Info[3]) % (width / 2);
        if (i4 > 0) {
            Game.m114c(14, 0, (width / 2) * (i3 % 2), width, i4, Game.f179a[0], ((((Game) this).Object_Info[2] - 20) + 24) - 32, (((Game) this).Object_Info[3] - 48) + (i3 * 32) + 16);
        }
        int width2 = Game.GFX_GameArray[77].getWidth();
        Game.m114c(77, 0, Game.f205v[i2], width2, Game.f205v[i2 + 1] - Game.f205v[i2], Game.f179a[0], (((Game) this).Object_Info[8] - 20) - 32, ((Game) this).Object_Info[9] - 48);
        Game.m114c(77, 0, Game.f205v[i2 + 2], width2, Game.f205v[(i2 + 1) + 2] - Game.f205v[i2 + 2], Game.f179a[0], (((Game) this).Object_Info[2] - 20) - 32, ((Game) this).Object_Info[3] - 48);
    }

    /* renamed from: bA */
    private void m332bA() {
        int Math_CalcSine;
        int Math_CalcSine2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        if (((Game) this).Object_Info[4] != 1) {
            if (((Game) this).Object_Info[4] == 2) {
                Math_CalcSine = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * (-16)) / 100) - 16;
                Math_CalcSine2 = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * 9) / 100) - 9;
            }
            if (((Game) this).Object_Info[4] != 20 || ((Game) this).Object_Info[4] == 4) {
                int Math_CalcSine3 = ((Game.Math_CalcSine(((Game) this).f227k) * 28) / 100) - 28;
                Game.m133b(79, 0, 0, 32, 56, Game.f179a[0], ((Game) this).Object_Info[2] - 16, (((Game) this).Object_Info[3] - 28) + 16);
                Game.m133b(79, 0, 0, 32, 56, Game.f179a[4], ((Game) this).Object_Info[2] + 16, (((Game) this).Object_Info[3] - 28) + 16);
                Game.m133b(79, 0, 0, 32, 56, Game.f179a[6], ((Game) this).Object_Info[2] - 16, ((Game) this).Object_Info[3] + 28 + 16);
                Game.m133b(79, 0, 0, 32, 56, Game.f179a[2], ((Game) this).Object_Info[2] + 16, ((Game) this).Object_Info[3] + 28 + 16);
                i = 79;
                i2 = 0;
                i3 = 72;
                i4 = 32;
                i5 = 32;
                i6 = Game.f179a[2];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((Game) this).Object_Info[3] + Math_CalcSine3 + 28 + 1;
            } else {
                Game.m133b(79, 0, 0, 32, 72, Game.f179a[0], ((Game) this).Object_Info[2] - 16, (((Game) this).Object_Info[3] + i9) - 36);
                Game.m133b(79, 0, 0, 32, 72, Game.f179a[4], ((Game) this).Object_Info[2] + 16, (((Game) this).Object_Info[3] + i9) - 36);
                Game.m133b(79, 0, 0, 32, 72, Game.f179a[6], ((Game) this).Object_Info[2] - 16, ((Game) this).Object_Info[3] + i9 + 36);
                Game.m133b(79, 0, 0, 32, 72, Game.f179a[2], ((Game) this).Object_Info[2] + 16, ((Game) this).Object_Info[3] + i9 + 36);
                i = 79;
                i2 = 0;
                i3 = 72;
                i4 = 32;
                i5 = 32;
                i6 = Game.f179a[2];
                i7 = ((Game) this).Object_Info[2];
                i8 = ((((Game) this).Object_Info[3] + i10) - 8) - 6;
            }
            Game.m133b(i, i2, i3, i4, i5, i6, i7, i8 + 8);
        }
        Math_CalcSine = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * 16) / 100) - 16;
        Math_CalcSine2 = ((Game.Math_CalcSine(((Game) this).Object_Info[5]) * (-9)) / 100) - 9;
        i9 = (Math_CalcSine * 2) + 2;
        i10 = (Math_CalcSine2 * 2) + 2;
        if (((Game) this).Object_Info[4] != 20) {
        }
        int Math_CalcSine32 = ((Game.Math_CalcSine(((Game) this).f227k) * 28) / 100) - 28;
        Game.m133b(79, 0, 0, 32, 56, Game.f179a[0], ((Game) this).Object_Info[2] - 16, (((Game) this).Object_Info[3] - 28) + 16);
        Game.m133b(79, 0, 0, 32, 56, Game.f179a[4], ((Game) this).Object_Info[2] + 16, (((Game) this).Object_Info[3] - 28) + 16);
        Game.m133b(79, 0, 0, 32, 56, Game.f179a[6], ((Game) this).Object_Info[2] - 16, ((Game) this).Object_Info[3] + 28 + 16);
        Game.m133b(79, 0, 0, 32, 56, Game.f179a[2], ((Game) this).Object_Info[2] + 16, ((Game) this).Object_Info[3] + 28 + 16);
        i = 79;
        i2 = 0;
        i3 = 72;
        i4 = 32;
        i5 = 32;
        i6 = Game.f179a[2];
        i7 = ((Game) this).Object_Info[2];
        i8 = ((Game) this).Object_Info[3] + Math_CalcSine32 + 28 + 1;
        Game.m133b(i, i2, i3, i4, i5, i6, i7, i8 + 8);
    }

    /* renamed from: bB */
    private void m331bB() {
        m305bg();
    }

    /* renamed from: bC */
    private void m330bC() {
        int[] iArr;
        char c;
        int i;
        int i2 = 16;
        int i3 = 8;
        if (((Game) this).Object_Info[4] == 16 || ((Game) this).Object_Info[4] == 18) {
            i2 = 8;
            i3 = 16;
        }
        if (((Game) this).Object_Info[5] > 0) {
            int[] iArr2 = ((Game) this).Object_Info;
            iArr2[5] = iArr2[5] + 1;
            if (((Game) this).Object_Info[5] > 12) {
                ((Game) this).Object_Info[5] = 0;
            }
        }
        int m115c = Game.m115c(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], i2, i3);
        if (m115c >= 0) {
            int i4 = 4096;
            int i5 = ((Game) this).Object_Info[4] / 16;
            if (((Game) this).Object_Info[4] % 16 == 2) {
                i4 = 2560;
            }
            if (i5 == 1) {
                i2 = 7;
            } else {
                i3 = 7;
            }
            if (m115c == 0 || m115c == 4) {
                Game.Player_Info[1] = (((Game) this).Object_Info[3] - i3) << 8;
                if (i5 == 0) {
                    if (((Game) this).Object_Info[5] == 4) {
                        Game.Player_Info[1] = (((Game) this).Object_Info[3] - 8) << 8;
                        Game.f72g = true;
                        Game.f68d = false;
                        Game.f67c = true;
                        Game.f74i = false;
                        this.f314aw = 0;
                        Game.Player_Info[5] = (Game.Math_CalcCosine(0) * i4) / 100;
                    }
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                    i = iArr[5] + 1;
                    iArr[c] = i;
                } else {
                    m230a(((Game) this).Object_Info[22]);
                }
            } else if (m115c == 1) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] - i2) - 12) - 1) << 8;
                Game.Player_Info[10] = 0;
                Game.Player_Info[13] = 0;
                Game.Player_Info[14] = 0;
                if (i5 == 1 && ((Game) this).Object_Info[19] == 1) {
                    this.f312av = 15;
                    Game.Player_Info[10] = -i4;
                    Game.Player_Info[12] = 1;
                    Game.Player_Info[13] = 1;
                    Game.Player_Info[14] = 1;
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                    i = iArr[5] + 1;
                    iArr[c] = i;
                }
            } else if (m115c == 2) {
                Game.Player_Info[0] = (((((Game) this).Object_Info[2] + i2) + 12) + 1) << 8;
                Game.Player_Info[10] = 0;
                Game.Player_Info[13] = 0;
                Game.Player_Info[14] = 0;
                if (i5 == 1 && ((Game) this).Object_Info[19] == 0) {
                    this.f312av = 15;
                    Game.Player_Info[10] = i4;
                    Game.Player_Info[12] = 0;
                    Game.Player_Info[13] = 2;
                    Game.Player_Info[14] = 2;
                    iArr = ((Game) this).Object_Info;
                    c = 5;
                    i = iArr[5] + 1;
                    iArr[c] = i;
                }
            } else if (m115c == 3) {
                if (i5 == 2) {
                    if (((Game) this).Object_Info[19] == 2) {
                        Game.Player_Info[5] = i4;
                        Game.f72g = true;
                        this.f312av = 30;
                    }
                    int[] iArr3 = ((Game) this).Object_Info;
                    iArr3[5] = iArr3[5] + 1;
                }
                iArr = Game.Player_Info;
                c = 1;
                i = ((((((Game) this).Object_Info[3] + i3) + 12) + 12) + 1) << 8;
                iArr[c] = i;
            }
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && m115c != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: bD */
    private void m329bD() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int[] iArr3 = ((Game) this).Object_Info;
        int i3 = iArr3[19];
        int i4 = i3 == 0 ? -2 : 2;
        if (Game.m127b(iArr3)) {
            return;
        }
        switch (iArr3[14]) {
            case 1:
                if (Math.abs(Game.Player_RoughXPos() - iArr3[2]) < 50) {
                    iArr3[5] = 30;
                    iArr3[15] = 0;
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 2:
                if (Game.Player_RoughXPos() > iArr3[2]) {
                    iArr2 = iArr3;
                    c2 = 19;
                    i2 = 1;
                } else {
                    iArr2 = iArr3;
                    c2 = 19;
                    i2 = 0;
                }
                iArr2[c2] = i2;
                if (iArr3[5] <= 0) {
                    iArr3[5] = 48;
                    iArr3[15] = 1;
                    if (iArr3[4] == 1) {
                        iArr = iArr3;
                        c = 14;
                        i = 6;
                    } else {
                        iArr = iArr3;
                        c = 14;
                        i = iArr[14] + 1;
                    }
                    iArr[c] = i;
                    break;
                }
                break;
            case 3:
                m189a(iArr3);
                if (iArr3[5] <= 0) {
                    iArr3[5] = 8;
                    iArr3[15] = 2;
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 4:
                m189a(iArr3);
                if (iArr3[5] <= 0) {
                    iArr3[5] = 8;
                    iArr3[15] = 3;
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 5:
                iArr3[2] = iArr3[2] + i4;
                m189a(iArr3);
                iArr = iArr3;
                c = 15;
                i = 4 + (((Game) this).f226j & 1);
                iArr[c] = i;
                break;
            case 6:
                if (iArr3[5] <= 0) {
                    m134b(7, iArr3[2], iArr3[3], i3 == 0 ? 270 : 90, 150, 0);
                    iArr3[5] = 60;
                    iArr3[14] = iArr3[14] + 1;
                }
                break;
            case 7:
                if (iArr3[5] <= 0) {
                    iArr3[15] = 0;
                    iArr3[5] = 10;
                    iArr3[14] = iArr3[14] + 1;
                }
                break;
            case 8:
                if (iArr3[5] <= 0) {
                    iArr3[14] = iArr3[14] + 1;
                }
                break;
            case 9:
                iArr = iArr3;
                c = 15;
                i = -1;
                iArr[c] = i;
                break;
            default:
                iArr3[15] = -1;
                iArr = iArr3;
                c = 14;
                i = 1;
                iArr[c] = i;
                break;
        }
        if (iArr3[14] < 3 || iArr3[14] > 7) {
            return;
        }
        m99d(iArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* renamed from: bE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m328bE() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int[] iArr3;
        char c3;
        int i3;
        int[] iArr4 = ((Game) this).Object_Info;
        int i4 = iArr4[19];
        int i5 = i4 == 0 ? -2 : 2;
        if (Game.m127b(iArr4)) {
            return;
        }
        switch (iArr4[14]) {
            case 1:
                iArr4[18] = 0;
                iArr4[14] = iArr4[14] + 1;
            case 2:
                iArr4[18] = 0;
                if (iArr4[6] > 440) {
                    if (iArr4[19] == 0) {
                        iArr3 = iArr4;
                        c3 = 19;
                        i3 = 1;
                    } else {
                        iArr3 = iArr4;
                        c3 = 19;
                        i3 = 0;
                    }
                    iArr3[c3] = i3;
                    iArr4[6] = 0;
                }
                if (Game.m185a(iArr4, 160, 100)) {
                    iArr4[5] = 20;
                    iArr4[14] = 3;
                }
                iArr4[2] = iArr4[2] + i5;
                iArr = iArr4;
                c = 15;
                i = ((Game) this).f226j & 1;
                iArr[c] = i;
                break;
            case 3:
                iArr4[6] = iArr4[6] - 1;
                iArr4[15] = 2 + (((Game) this).f226j & 1);
                if (iArr4[5] <= 0) {
                    iArr4[5] = 90;
                    iArr4[14] = iArr4[14] + 1;
                }
                break;
            case 4:
                iArr4[6] = iArr4[6] - 1;
                iArr4[15] = 4 + (((Game) this).f226j & 1);
                if (iArr4[5] == 16) {
                    iArr2 = iArr4;
                    c2 = 18;
                    i2 = 1;
                } else {
                    if (iArr4[5] == 8) {
                        iArr2 = iArr4;
                        c2 = 18;
                        i2 = 2;
                    }
                    if (iArr4[5] <= 0) {
                        iArr4[18] = 0;
                        m134b(7, iArr4[2] + (i4 == 0 ? -18 : 18), iArr4[3] + 24, i4 == 0 ? 210 : 150, 150, 0);
                        iArr4[5] = 30;
                        iArr4[14] = iArr4[14] + 1;
                    }
                }
                iArr2[c2] = i2;
                if (iArr4[5] <= 0) {
                }
                break;
            case 5:
                iArr4[6] = iArr4[6] - 1;
                if (iArr4[5] <= 0) {
                    iArr4[14] = iArr4[14] + 1;
                }
                break;
            case 6:
                iArr4[2] = iArr4[2] + i5;
                iArr4[15] = ((Game) this).f226j & 1;
                if (iArr4[6] > 480) {
                    iArr = iArr4;
                    c = 14;
                    i = 2;
                    iArr[c] = i;
                    break;
                }
                break;
            default:
                iArr = iArr4;
                c = 14;
                i = 1;
                iArr[c] = i;
                break;
        }
        m99d(iArr4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* renamed from: bF */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m327bF() {
        int[] iArr = ((Game) this).Object_Info;
        int i = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - Game.Player_RoughXPos()) <= 240 || Math.abs(iArr[3] - Game.Player_RoughYPos()) <= 168) && !Game.m127b(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (((Game) this).f226j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    m189a(iArr);
                    if (m111c(iArr)) {
                        iArr[5] = 60;
                        iArr[14] = iArr[14] + 1;
                    }
                    if ((((Game) this).f226j & 7) == 0) {
                        m216a(15, iArr[2] - (i * 20), iArr[3] - 2, 0, 0, 0, 0);
                        break;
                    }
                    break;
                case 2:
                    iArr[15] = (((Game) this).f226j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    m189a(iArr);
                    if (m111c(iArr)) {
                    }
                    if ((((Game) this).f226j & 7) == 0) {
                    }
                    break;
                case 3:
                    if (iArr[5] <= 0) {
                        Game.m128b(iArr);
                        iArr[6] = 0;
                        iArr[14] = iArr[14] - 1;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (((Game) this).f226j >> 1) % 3;
                    iArr[2] = iArr[2] + i;
                    m189a(iArr);
                    if (m111c(iArr)) {
                    }
                    if ((((Game) this).f226j & 7) == 0) {
                    }
                    break;
            }
            m99d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d3  */
    /* renamed from: bG */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m326bG() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2 = ((Game) this).Object_Info;
        int i2 = iArr2[19] == 0 ? -1 : 1;
        if (Math.abs(iArr2[2] - Game.Player_RoughXPos()) <= 240 || Math.abs(iArr2[3] - Game.Player_RoughYPos()) <= 168) {
            iArr2[5] = iArr2[5] + 1;
            if (Game.m119c(iArr2[2], iArr2[3])) {
                iArr2[18] = 0;
                return;
            }
            if (iArr2[18] == 3 || iArr2[18] == 4) {
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = 6 + (i3 * 3);
                    if (m219a(iArr2[i4] >> 8, iArr2[i4 + 1] >> 8, 8, 8, iArr2[i4 + 2] == -1 ? 0 : 1)) {
                        iArr2[i4 + 2] = iArr2[i4 + 2] == 1 ? -1 : 1;
                    }
                }
            }
            switch (iArr2[18]) {
                case 1:
                    iArr2[5] = 0;
                    iArr2[6] = iArr2[2] << 8;
                    iArr2[7] = iArr2[3] << 8;
                    iArr2[8] = i2;
                    iArr2[9] = iArr2[6] + (((-i2) * 12) << 8);
                    iArr2[10] = iArr2[7];
                    iArr2[11] = i2;
                    iArr2[12] = iArr2[9] + (((-i2) * 12) << 8);
                    iArr2[13] = iArr2[10];
                    iArr2[14] = i2;
                    iArr2[15] = iArr2[12] + (((-i2) * 12) << 8);
                    iArr2[16] = iArr2[13];
                    iArr2[17] = i2;
                    iArr2[18] = iArr2[18] + 1;
                    iArr2[7] = m224a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m224a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m224a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m224a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                        iArr2[5] = 0;
                        iArr = iArr2;
                        c = 18;
                        i = iArr[18] + 1;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 2:
                    iArr2[7] = m224a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m224a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m224a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m224a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                    }
                    break;
                case 3:
                    iArr2[6] = iArr2[6] + (0 * iArr2[8]);
                    iArr2[9] = iArr2[9] + (32 * iArr2[11]);
                    iArr2[12] = iArr2[12] + (64 * iArr2[14]);
                    iArr2[15] = iArr2[15] + (96 * iArr2[17]);
                    if (iArr2[5] >= 32) {
                        iArr = iArr2;
                        c = 18;
                        i = iArr[18] + 1;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 4:
                    iArr2[6] = iArr2[6] + (96 * iArr2[8]);
                    iArr2[9] = iArr2[9] + (64 * iArr2[11]);
                    iArr2[12] = iArr2[12] + (32 * iArr2[14]);
                    iArr2[15] = iArr2[15] + (0 * iArr2[17]);
                    if (iArr2[5] >= 64) {
                        iArr = iArr2;
                        c = 18;
                        i = iArr[18] + 1;
                        iArr[c] = i;
                        break;
                    }
                    break;
                case 5:
                    if (iArr2[8] == iArr2[11] && iArr2[11] == iArr2[14] && iArr2[14] == iArr2[17]) {
                        iArr2[9] = iArr2[6] + (((-iArr2[8]) * 12) << 8);
                        iArr2[12] = iArr2[9] + (((-iArr2[8]) * 12) << 8);
                        iArr2[15] = iArr2[12] + (((-iArr2[8]) * 12) << 8);
                    }
                    iArr2[5] = 0;
                    iArr = iArr2;
                    c = 18;
                    i = 3;
                    iArr[c] = i;
                    break;
                default:
                    iArr2[18] = 1;
                    iArr2[5] = 0;
                    iArr2[6] = iArr2[2] << 8;
                    iArr2[7] = iArr2[3] << 8;
                    iArr2[8] = i2;
                    iArr2[9] = iArr2[6] + (((-i2) * 12) << 8);
                    iArr2[10] = iArr2[7];
                    iArr2[11] = i2;
                    iArr2[12] = iArr2[9] + (((-i2) * 12) << 8);
                    iArr2[13] = iArr2[10];
                    iArr2[14] = i2;
                    iArr2[15] = iArr2[12] + (((-i2) * 12) << 8);
                    iArr2[16] = iArr2[13];
                    iArr2[17] = i2;
                    iArr2[18] = iArr2[18] + 1;
                    iArr2[7] = m224a(iArr2[6] >> 8, iArr2[7] >> 8, 8) << 8;
                    iArr2[10] = m224a(iArr2[9] >> 8, iArr2[10] >> 8, 8) << 8;
                    iArr2[13] = m224a(iArr2[12] >> 8, iArr2[13] >> 8, 8) << 8;
                    iArr2[16] = m224a(iArr2[15] >> 8, iArr2[16] >> 8, 8) << 8;
                    if (iArr2[5] >= 8) {
                    }
                    break;
            }
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = 7 + (i5 * 3);
                iArr2[i6] = m224a(iArr2[i6 - 1] >> 8, iArr2[i6] >> 8, 8) << 8;
            }
            for (int i7 = 0; i7 < 3; i7++) {
                int i8 = 7 + (i7 * 3);
                if (iArr2[7] + 4096 < iArr2[i8 + 3]) {
                    iArr2[i8 + 3] = iArr2[7];
                }
                if (Math.abs(iArr2[8] - iArr2[i8 + 4]) > 3072) {
                    int i9 = i8 + 4;
                    iArr2[i9] = iArr2[i9] + (iArr2[8] << 8);
                }
            }
            iArr2[2] = iArr2[6] >> 8;
            iArr2[3] = iArr2[7] >> 8;
            if (m99d(iArr2) || m212a(iArr2[12] >> 8, iArr2[13] >> 8, 22, 10, false) == 0) {
                return;
            }
            m134b(14, iArr2[2], iArr2[3], (30 * i2) + 360, 300, 0);
            m134b(14, iArr2[9] >> 8, iArr2[10] >> 8, (15 * i2) + 360, 300, 1);
            m134b(14, iArr2[12] >> 8, iArr2[13] >> 8, ((-15) * i2) + 360, 300, 1);
            m134b(14, iArr2[15] >> 8, iArr2[16] >> 8, ((-30) * i2) + 360, 300, 1);
            iArr2[0] = 0;
            Player_Hurt();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* renamed from: bH */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m325bH() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2 = ((Game) this).Object_Info;
        int i2 = iArr2[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr2[2] - Game.Player_RoughXPos()) <= 240 || Math.abs(iArr2[3] - Game.Player_RoughYPos()) <= 168) && !Game.m127b(iArr2)) {
            switch (iArr2[14]) {
                case 1:
                    iArr2[10] = 0;
                    iArr2[11] = 0;
                    iArr2[5] = 360;
                    iArr2[14] = iArr2[14] + 1;
                    iArr2[15] = (((Game) this).f226j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m186a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    if (!m111c(iArr2) || iArr2[6] > 180) {
                        Game.m128b(iArr2);
                        iArr2[6] = 0;
                    }
                    if (iArr2[5] <= 0) {
                        iArr2[15] = 1;
                        iArr2[5] = 60;
                        iArr2[14] = iArr2[14] + 1;
                        m186a(iArr2, 16);
                        if (iArr2[5] < 12) {
                            iArr2[15] = 3;
                        }
                        if (iArr2[5] <= 0) {
                            m134b(9, iArr2[2] + 16, iArr2[3] - 16, 15, 240, 0);
                            m134b(9, iArr2[2] - 16, iArr2[3] - 16, 345, 240, 0);
                            iArr2[5] = 50;
                            iArr = iArr2;
                            c = 14;
                            i = iArr[14] + 1;
                            iArr[c] = i;
                            break;
                        }
                    }
                    break;
                case 2:
                    iArr2[15] = (((Game) this).f226j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m186a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    if (!m111c(iArr2)) {
                        break;
                    }
                    Game.m128b(iArr2);
                    iArr2[6] = 0;
                    if (iArr2[5] <= 0) {
                    }
                    break;
                case 3:
                    m186a(iArr2, 16);
                    if (iArr2[5] < 12) {
                    }
                    if (iArr2[5] <= 0) {
                    }
                    break;
                case 4:
                    m186a(iArr2, 16);
                    if (iArr2[5] <= 0) {
                        iArr = iArr2;
                        c = 14;
                        i = 1;
                        iArr[c] = i;
                        break;
                    }
                    break;
                default:
                    iArr2[14] = 1;
                    iArr2[10] = 0;
                    iArr2[11] = 0;
                    iArr2[5] = 360;
                    iArr2[14] = iArr2[14] + 1;
                    iArr2[15] = (((Game) this).f226j >> 2) % 3;
                    iArr2[10] = i2 * 20;
                    iArr2[12] = iArr2[12] + iArr2[10];
                    iArr2[13] = iArr2[13] + iArr2[11];
                    m186a(iArr2, 16);
                    iArr2[2] = iArr2[12] / 100;
                    iArr2[3] = iArr2[13] / 100;
                    if (!m111c(iArr2)) {
                    }
                    Game.m128b(iArr2);
                    iArr2[6] = 0;
                    if (iArr2[5] <= 0) {
                    }
                    break;
            }
            m99d(iArr2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
    /* renamed from: bI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m324bI() {
        int[] iArr = ((Game) this).Object_Info;
        if (Game.m127b(iArr)) {
            return;
        }
        switch (iArr[14]) {
            case 1:
                iArr[15] = -1;
                iArr[8] = 0;
                iArr[9] = 0;
                iArr[10] = 0;
                iArr[11] = 400;
                iArr[14] = iArr[14] + 1;
                if (Game.Player_RoughXPos() - 160 >= iArr[2]) {
                    iArr[14] = iArr[14] + 1;
                    iArr[10] = 500;
                    iArr[11] = 400;
                    iArr[15] = 0;
                    iArr[5] = 94;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = ((Game) this).f226j & 1;
                    iArr[10] = 400;
                    if (iArr[9] == 0 && m219a(iArr[2], iArr[3], 20, 20, 1)) {
                        iArr[9] = 1;
                        iArr[11] = -800;
                        iArr[5] = 94;
                    }
                    if (iArr[5] <= 0) {
                        iArr[5] = 94;
                        iArr[14] = iArr[14] + 1;
                        iArr[10] = 0;
                        iArr[11] = 0;
                        iArr[15] = 1;
                        iArr[5] = 20;
                        iArr[14] = iArr[14] + 1;
                        if (iArr[5] <= 0) {
                            iArr[15] = 2;
                            iArr[5] = 20;
                            iArr[14] = iArr[14] + 1;
                            if (iArr[5] <= 0) {
                                iArr[15] = 3;
                                iArr[5] = 60;
                                iArr[14] = iArr[14] + 1;
                                if (iArr[5] <= 0) {
                                    iArr[15] = 2;
                                    iArr[5] = 20;
                                    iArr[14] = iArr[14] + 1;
                                    if (iArr[5] <= 0) {
                                        iArr[15] = 1;
                                        iArr[5] = 20;
                                        iArr[14] = iArr[14] + 1;
                                        if (iArr[5] <= 0) {
                                            iArr[5] = 94;
                                            iArr[14] = 3;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (Game.Player_RoughXPos() - 160 >= iArr[2]) {
                }
                break;
            case 3:
                iArr[10] = 500;
                iArr[11] = 400;
                iArr[15] = 0;
                iArr[5] = 94;
                iArr[14] = iArr[14] + 1;
                iArr[15] = ((Game) this).f226j & 1;
                iArr[10] = 400;
                if (iArr[9] == 0) {
                    iArr[9] = 1;
                    iArr[11] = -800;
                    iArr[5] = 94;
                    break;
                }
                if (iArr[5] <= 0) {
                }
                break;
            case 4:
                iArr[15] = ((Game) this).f226j & 1;
                iArr[10] = 400;
                if (iArr[9] == 0) {
                }
                if (iArr[5] <= 0) {
                }
                break;
            case 5:
                iArr[10] = 0;
                iArr[11] = 0;
                iArr[15] = 1;
                iArr[5] = 20;
                iArr[14] = iArr[14] + 1;
                if (iArr[5] <= 0) {
                }
                break;
            case 6:
                if (iArr[5] <= 0) {
                }
                break;
            case 7:
                if (iArr[5] <= 0) {
                }
                break;
            case 8:
                if (iArr[5] <= 0) {
                }
                break;
            case 9:
                if (iArr[5] <= 0) {
                }
                break;
            case 10:
                if (iArr[5] <= 0) {
                }
                break;
            default:
                iArr[14] = 1;
                iArr[15] = -1;
                iArr[8] = 0;
                iArr[9] = 0;
                iArr[10] = 0;
                iArr[11] = 400;
                iArr[14] = iArr[14] + 1;
                if (Game.Player_RoughXPos() - 160 >= iArr[2]) {
                }
                break;
        }
        iArr[11] = iArr[11] + 20;
        if (iArr[11] > 400) {
            iArr[11] = 400;
        }
        iArr[12] = iArr[12] + iArr[10];
        iArr[13] = iArr[13] + iArr[11];
        if (iArr[11] > 0 && m139b(iArr[12] / 100, (iArr[13] / 100) + 12)) {
            iArr[9] = 0;
            for (int i = 0; i < 4; i++) {
                m139b(iArr[12] / 100, (iArr[13] / 100) + 12);
                iArr[13] = iArr[13] - 100;
            }
            if (iArr[13] < 0) {
                iArr[13] = 0;
            }
        }
        iArr[2] = iArr[12] / 100;
        iArr[3] = iArr[13] / 100;
        if (iArr[15] >= 0) {
            m99d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: bJ */
    private void m323bJ() {
        int[] iArr = ((Game) this).Object_Info;
        int i = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - Game.Player_RoughXPos()) <= 240 || Math.abs(iArr[3] - Game.Player_RoughYPos()) <= 168) && !Game.m127b(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 120;
                    iArr[14] = iArr[14] + 1;
                    break;
                case 2:
                    break;
                default:
                    iArr[14] = 1;
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 120;
                    iArr[14] = iArr[14] + 1;
                    break;
            }
            iArr[15] = (((Game) this).f226j >> 2) % 3;
            iArr[10] = i * 25;
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            m187a(iArr, 24);
            if (m111c(iArr) || iArr[6] > 240) {
                Game.m128b(iArr);
                iArr[6] = 0;
            }
            if (iArr[5] <= 0) {
                iArr[15] = 1;
                iArr[5] = 40;
            }
            m99d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* renamed from: bK */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m322bK() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int[] iArr3 = ((Game) this).Object_Info;
        int i3 = iArr3[19] == 0 ? -1 : 1;
        if (Game.m127b(iArr3)) {
            return;
        }
        int i4 = ((Game) this).f226j >> 2;
        switch (iArr3[14]) {
            case 1:
                iArr3[15] = 0;
                if (Game.Player_RoughXPos() <= iArr3[2]) {
                    iArr2 = iArr3;
                    c2 = 19;
                    i2 = 1;
                } else {
                    iArr2 = iArr3;
                    c2 = 19;
                    i2 = 0;
                }
                iArr2[c2] = i2;
                if (iArr3[3] + 40 <= Game.Player_RoughYPos() && iArr3[3] + 100 >= Game.Player_RoughYPos() && Math.abs(iArr3[2] - Game.Player_RoughXPos()) < 100) {
                    iArr3[9] = Game.Player_RoughYPos() - 16;
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 2:
                iArr3[15] = 1;
                iArr3[3] = iArr3[3] + 2;
                if (iArr3[3] >= iArr3[9]) {
                    iArr3[3] = iArr3[9];
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 3:
                iArr3[15] = Game.f187a[i4 & 3];
                iArr3[2] = iArr3[2] + i3;
                if (Math.abs(iArr3[2] - Game.Player_RoughXPos()) > 80) {
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
            case 4:
                iArr3[15] = Game.f187a[i4 & 3];
                iArr3[2] = iArr3[2] + i3;
                iArr3[3] = iArr3[3] - 2;
                if (m139b(iArr3[2], iArr3[3] - 16)) {
                    iArr = iArr3;
                    c = 14;
                    i = 1;
                    iArr[c] = i;
                    break;
                }
                break;
            default:
                iArr3[14] = 1;
                iArr3[15] = 0;
                if (Game.Player_RoughXPos() <= iArr3[2]) {
                }
                iArr2[c2] = i2;
                if (iArr3[3] + 40 <= Game.Player_RoughYPos()) {
                    iArr3[9] = Game.Player_RoughYPos() - 16;
                    iArr = iArr3;
                    c = 14;
                    i = iArr[14] + 1;
                    iArr[c] = i;
                    break;
                }
                break;
        }
        m99d(iArr3);
    }

    /* renamed from: bL */
    private void m321bL() {
        int[] iArr = ((Game) this).Object_Info;
        if (Game.m127b(iArr)) {
            return;
        }
        iArr[15] = (((Game) this).f226j >> 2) & 1;
        iArr[3] = iArr[17] - ((Math.abs(Game.Math_CalcCosine(iArr[6] % 180)) * 268) / 100);
        m99d(iArr);
    }

    /* renamed from: bM */
    private void m320bM() {
        if (((Game) this).f226j % 60 < 30) {
            if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20]) {
                ((Game) this).f115s = false;
                return;
            }
            return;
        }
        int m115c = Game.m115c(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3], 8, 32);
        if (((Game) this).Object_Info[5] == 1) {
            m115c = -1;
        }
        if (m115c >= 0 && m115c == 1) {
            Game.Player_Info[0] = ((((Game) this).Object_Info[2] - 8) - 12) << 8;
        }
        if (((Game) this).f115s && this.f116ag == ((Game) this).Object_Info[20] && m115c != 0) {
            ((Game) this).f115s = false;
        }
    }

    /* renamed from: bN */
    private void m319bN() {
        m320bM();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* renamed from: bO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m318bO() {
        int i;
        int[] iArr;
        char c;
        int i2;
        int i3 = 2;
        int i4 = ((Game) this).Object_Info[4] / 16;
        if (((Game) this).Object_Info[4] % 16 == 2) {
            i3 = 153;
        }
        int i5 = 0;
        if (((Game) this).Object_Info[5] <= 4) {
            i2 = ((Game) this).Object_Info[5] > 0 ? 1 : 1;
            int i6 = Game.f179a[0];
            switch (i4) {
                case 1:
                    if (((Game) this).Object_Info[19] == 0) {
                        iArr = Game.f179a;
                        c = 1;
                    } else {
                        iArr = Game.f179a;
                        c = 7;
                    }
                    i6 = iArr[c];
                    break;
                case 2:
                    i6 = Game.f179a[6];
                    break;
            }
            int i7 = 0;
            int i8 = 0;
            if (i5 == 2) {
                switch (i4) {
                    case 0:
                        i = -8;
                        i8 = i;
                        break;
                    case 1:
                        if (((Game) this).Object_Info[19] != 0) {
                            i7 = -8;
                            break;
                        } else {
                            i7 = 8;
                            break;
                        }
                    case 2:
                        i = 8;
                        i8 = i;
                        break;
                }
            }
            Game.m136b(((Game) this).Object_Info[2] + i7, ((Game) this).Object_Info[3] + i8, i3, i5, i6);
        }
        i2 = 2;
        i5 = i2;
        int i62 = Game.f179a[0];
        switch (i4) {
            case 1:
                break;
            case 2:
                break;
        }
        int i72 = 0;
        int i82 = 0;
        if (i5 == 2) {
        }
        Game.m136b(((Game) this).Object_Info[2] + i72, ((Game) this).Object_Info[3] + i82, i3, i5, i62);
    }

    /* renamed from: bP */
    private void m317bP() {
        if (this.Game_ZoneID == 0 && Game.GFX_GameArray[5] != null) {
            int height = Game.GFX_GameArray[5].getHeight();
            int width = (Game.GFX_GameArray[5].getWidth() / 3) * 2;
            int i = Game.f179a[0];
            if (((Game) this).Object_Info[19] == 0) {
                i = Game.f179a[4];
            }
            Game.m133b(5, 0, 0, width, height, i, ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
        }
    }

    /* renamed from: bQ */
    private void m316bQ() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Actor actor;
        int i7 = ((Game) this).Object_Info[19] == 0 ? -1 : 1;
        m280f(40);
        if (((Game) this).Object_Info[18] == 1) {
            i = 40;
            i2 = 0;
            i3 = 184;
            i4 = 16;
            i5 = 16;
            i6 = ((Game) this).Object_Info[19] == 0 ? 0 : Game.f179a[4];
            actor = this;
        } else if (((Game) this).Object_Info[18] != 2) {
            return;
        } else {
            i = 40;
            i2 = 16;
            i3 = 184;
            i4 = 16;
            i5 = 16;
            i6 = ((Game) this).Object_Info[19] == 0 ? 0 : Game.f179a[4];
            actor = this;
        }
        Game.m133b(i, i2, i3, i4, i5, i6, ((Game) actor).Object_Info[2] + (i7 * 18), ((Game) this).Object_Info[3] + 28);
    }

    /* renamed from: bR */
    private void m315bR() {
        Game.m133b(61, 0, 16 * ((((Game) this).f226j >> 1) % 6), 32, 16, Game.f179a[0], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3]);
    }

    /* renamed from: bS */
    private void m314bS() {
        int[] iArr;
        char c;
        int[] iArr2;
        char c2;
        if (((Game) this).Object_Info[18] < 1) {
            return;
        }
        int i = ((Game) this).Object_Info[18] == 3 ? ((Game) this).Object_Info[5] >> 2 : 8 - ((((Game) this).Object_Info[5] - 30) >> 2);
        int i2 = 0;
        while (i2 < 3) {
            int i3 = 15 - (i2 * 3);
            int i4 = ((Game) this).Object_Info[i3] >> 8;
            int i5 = (((Game) this).Object_Info[i3 + 1] >> 8) - (i2 == 1 ? i : 0);
            if (((Game) this).Object_Info[i3 + 2] == 1) {
                iArr2 = Game.f179a;
                c2 = 4;
            } else {
                iArr2 = Game.f179a;
                c2 = 0;
            }
            Game.m136b(i4, i5, 49, 2, iArr2[c2]);
            i2++;
        }
        int i6 = ((Game) this).Object_Info[6] >> 8;
        int i7 = (((Game) this).Object_Info[7] >> 8) - i;
        int i8 = ((Game) this).Object_Info[18] > 3 ? 1 : 0;
        if (((Game) this).Object_Info[8] == 1) {
            iArr = Game.f179a;
            c = 4;
        } else {
            iArr = Game.f179a;
            c = 0;
        }
        Game.m136b(i6, i7, 49, i8, iArr[c]);
    }

    /* renamed from: f */
    private void m280f(int i) {
        int[] iArr;
        char c;
        if (((Game) this).Object_Info[15] < 0) {
            return;
        }
        int i2 = Game.f179a[0];
        switch (((Game) this).Object_Info[19]) {
            case 1:
                iArr = Game.f179a;
                c = 4;
                i2 = iArr[c];
                Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], i, ((Game) this).Object_Info[15], i2);
                return;
            case 2:
                iArr = Game.f179a;
                c = 6;
                i2 = iArr[c];
                Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], i, ((Game) this).Object_Info[15], i2);
                return;
            case 3:
                iArr = Game.f179a;
                c = 2;
                i2 = iArr[c];
                Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], i, ((Game) this).Object_Info[15], i2);
                return;
            default:
                Game.m136b(((Game) this).Object_Info[2], ((Game) this).Object_Info[3], i, ((Game) this).Object_Info[15], i2);
                return;
        }
    }

    /* renamed from: bT */
    private void m313bT() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (((Game) this).f226j % 60 < 30) {
            Game.m133b(92, 0, 0, 32, 16, Game.f179a[0], ((Game) this).Object_Info[2] + 8, ((Game) this).Object_Info[3] - 32);
            i = 92;
            i2 = 0;
            i3 = 0;
            i4 = 32;
            i5 = 16;
            i6 = Game.f179a[6];
            i7 = ((Game) this).Object_Info[2] + 8;
            i8 = ((Game) this).Object_Info[3];
            i9 = 32;
        } else {
            Game.m133b(92, 0, 0, 32, 16, Game.f179a[1], ((Game) this).Object_Info[2], ((Game) this).Object_Info[3] - 16);
            i = 92;
            i2 = 0;
            i3 = 0;
            i4 = 32;
            i5 = 16;
            i6 = Game.f179a[5];
            i7 = ((Game) this).Object_Info[2];
            i8 = ((Game) this).Object_Info[3];
            i9 = 16;
        }
        Game.m133b(i, i2, i3, i4, i5, i6, i7, i8 + i9);
    }

    /* renamed from: bU */
    private void m312bU() {
        m313bT();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        short[] sArr = {new short[]{0, 0, 16, 24, -4}, new short[]{0, 24, 16, 24, -4}, new short[]{0, 48, 16, 16, 0}};
    }
}
