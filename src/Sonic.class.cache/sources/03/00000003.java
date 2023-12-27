package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/* renamed from: c */
/* loaded from: c.class */
public class Game extends Canvas implements Runnable, PlayerListener {

    /* renamed from: f */
    public static int f12f;

    /* renamed from: i */
    public static int f13i;

    /* renamed from: aH */
    private static int f14aH;

    /* renamed from: aI */
    private static int f15aI;

    /* renamed from: a */
    public static Graphics GFX_Painter;

    /* renamed from: a */
    public static Image GFX_ZoneTiles;

    /* renamed from: a */
    public Audio_Player Music_MainPlayer;

    /* renamed from: aJ */
    private int f19aJ;

    /* renamed from: aK */
    private int f20aK;

    /* renamed from: aL */
    private int f21aL;

    /* renamed from: aM */
    private int f22aM;

    /* renamed from: aP */
    private int f23aP;

    /* renamed from: aR */
    private int f24aR;

    /* renamed from: aS */
    private int f25aS;

    /* renamed from: aU */
    private int f26aU;

    /* renamed from: aV */
    private int f27aV;

    /* renamed from: aW */
    private int f28aW;

    /* renamed from: aX */
    private int f29aX;

    /* renamed from: aY */
    private int Continue_Timer;

    /* renamed from: bb */
    private int f31bb;

    /* renamed from: a */
    private String f32a;

    /* renamed from: a */
    public byte Menu_ID;

    /* renamed from: d */
    private byte f34d;

    /* renamed from: b */
    public byte f35b;

    /* renamed from: e */
    private byte Menu_CurrentSelection;

    /* renamed from: L */
    private boolean f37L;

    /* renamed from: a */
    private Vector f38a;

    /* renamed from: f */
    private byte f39f;

    /* renamed from: N */
    private boolean f40N;

    /* renamed from: b */
    public static Font f41b;

    /* renamed from: b */
    public boolean f42b;

    /* renamed from: m */
    public int f43m;

    /* renamed from: bd */
    private int f44bd;

    /* renamed from: O */
    private boolean f45O;

    /* renamed from: P */
    private boolean f46P;

    /* renamed from: bm */
    private int f47bm;

    /* renamed from: bn */
    private int f48bn;

    /* renamed from: bo */
    private int f49bo;

    /* renamed from: bp */
    private int f50bp;

    /* renamed from: p */
    public static int f51p;

    /* renamed from: q */
    public int Player_InvincTime;

    /* renamed from: r */
    public int Player_InvulnTime;

    /* renamed from: s */
    public int Player_SpeedShoeTime;

    /* renamed from: t */
    public int Player_ShieldFlag;

    /* renamed from: u */
    public int Player_PrevRings;

    /* renamed from: v */
    public int Player_Rings;

    /* renamed from: w */
    public int Player_Score;

    /* renamed from: x */
    public int f59x;

    /* renamed from: y */
    public int f60y;

    /* renamed from: z */
    public int f61z;

    /* renamed from: A */
    public int Player_Lives;

    /* renamed from: B */
    public int f63B;

    /* renamed from: C */
    public int f64C;

    /* renamed from: D */
    public int f65D;

    /* renamed from: E */
    public int f66E;

    /* renamed from: c */
    public static boolean f67c;

    /* renamed from: d */
    public static boolean f68d;

    /* renamed from: Q */
    private static boolean f69Q;

    /* renamed from: e */
    public static boolean f70e;

    /* renamed from: f */
    public static boolean f71f;

    /* renamed from: g */
    public static boolean f72g;

    /* renamed from: h */
    public static boolean f73h;

    /* renamed from: i */
    public static boolean f74i;

    /* renamed from: j */
    public static boolean f75j;

    /* renamed from: k */
    public static boolean f76k;

    /* renamed from: R */
    private static boolean f77R;

    /* renamed from: l */
    public static boolean f78l;

    /* renamed from: m */
    public static boolean f79m;

    /* renamed from: n */
    public static boolean f80n;

    /* renamed from: o */
    public static boolean f81o;

    /* renamed from: S */
    private static boolean f82S;

    /* renamed from: H */
    public int f83H;

    /* renamed from: i */
    private int[][] f84i;

    /* renamed from: I */
    public int f85I;

    /* renamed from: K */
    public int f86K;

    /* renamed from: L */
    public int f87L;

    /* renamed from: M */
    public int f88M;

    /* renamed from: N */
    public int f89N;

    /* renamed from: O */
    public int f90O;

    /* renamed from: P */
    public int f91P;

    /* renamed from: Q */
    public int f92Q;

    /* renamed from: R */
    public int f93R;

    /* renamed from: S */
    public int f94S;

    /* renamed from: T */
    public int f95T;

    /* renamed from: U */
    public int f96U;

    /* renamed from: V */
    public int f97V;

    /* renamed from: W */
    public int Boss_XPos;

    /* renamed from: X */
    public int Boss_YPos;

    /* renamed from: Y */
    public int f100Y;

    /* renamed from: Z */
    public int f101Z;

    /* renamed from: aa */
    public int f102aa;

    /* renamed from: ab */
    public int f103ab;

    /* renamed from: ac */
    public int f104ac;

    /* renamed from: ad */
    public int f105ad;

    /* renamed from: ae */
    public int f106ae;

    /* renamed from: d */
    private byte[] f107d;

    /* renamed from: e */
    private byte[] f108e;

    /* renamed from: f */
    private byte[] f109f;

    /* renamed from: g */
    private byte[] f110g;

    /* renamed from: j */
    private int[][] f111j;

    /* renamed from: af */
    public int f112af;

    /* renamed from: c */
    public boolean[] f113c;

    /* renamed from: d */
    public boolean[] f114d;

    /* renamed from: s */
    public boolean f115s;

    /* renamed from: ag */
    public int f116ag;

    /* renamed from: a */
    public static int[][][] f117a;

    /* renamed from: b */
    private int[][][] f118b;

    /* renamed from: bu */
    private int f119bu;

    /* renamed from: bv */
    private int f120bv;

    /* renamed from: ai */
    public int f121ai;

    /* renamed from: h */
    private byte[] Level_Chunks;

    /* renamed from: i */
    private byte[] Level_BlockPriorities;

    /* renamed from: b */
    public byte[] Level_Collisions;

    /* renamed from: J */
    private int[] f125J;

    /* renamed from: d */
    private byte[][] f126d;

    /* renamed from: g */
    private byte f127g;

    /* renamed from: i */
    private byte f128i;

    /* renamed from: bx */
    private int f129bx;

    /* renamed from: j */
    private byte f130j;

    /* renamed from: v */
    public boolean f131v;

    /* renamed from: ao */
    public int f132ao;

    /* renamed from: ap */
    public int f133ap;

    /* renamed from: w */
    public boolean f134w;

    /* renamed from: x */
    public boolean f135x;

    /* renamed from: bC */
    private int f136bC;

    /* renamed from: bD */
    private int f137bD;

    /* renamed from: bE */
    private int f138bE;

    /* renamed from: bH */
    private int f139bH;

    /* renamed from: aq */
    public int f140aq;

    /* renamed from: D */
    public boolean f141D;

    /* renamed from: c */
    public byte f142c;

    /* renamed from: V */
    private boolean f143V;

    /* renamed from: W */
    private static boolean f144W;

    /* renamed from: X */
    private static boolean f145X;

    /* renamed from: Y */
    private boolean f146Y;

    /* renamed from: F */
    public boolean f147F;

    /* renamed from: ar */
    public int f148ar;

    /* renamed from: bM */
    private int f149bM;

    /* renamed from: bN */
    private int f150bN;

    /* renamed from: bO */
    private int f151bO;

    /* renamed from: bP */
    private int f152bP;

    /* renamed from: a */
    public MIDlet f153a;

    /* renamed from: az */
    public int f154az;

    /* renamed from: b */
    public long f155b;

    /* renamed from: c */
    public long f156c;

    /* renamed from: d */
    public long f157d;

    /* renamed from: e */
    public long f158e;

    /* renamed from: I */
    public boolean f159I;

    /* renamed from: aE */
    public static int f160aE;

    /* renamed from: aF */
    public static int f161aF;

    /* renamed from: a */
    public static InputStream CurrentResource;

    /* renamed from: bQ */
    private int f163bQ;

    /* renamed from: d */
    private static String[] HighScore_DefaultNames = {"SON", "SON", "SON", "SON", "SON"};

    /* renamed from: C */
    private static int[] HighScore_DefaultScores = {10000, 8000, 6000, 4000, 2000};

    /* renamed from: D */
    private static int[] HighScore_DefaultDifficulties = {0, 1, 2, 1, 0};

    /* renamed from: c */
    private static Image[] GFX_MenuArray = new Image[5];

    /* renamed from: a */
    public static final Font f168a = Font.getFont(0, 0, 16);

    /* renamed from: a */
    public static final int f169a = f168a.getHeight();

    /* renamed from: b */
    public static int GFX_MenuHeight = 0;

    /* renamed from: c */
    public static int f171c = 0;

    /* renamed from: d */
    public static int GFX_MenuWidth = f171c;

    /* renamed from: e */
    public static int f173e = GFX_MenuHeight;

    /* renamed from: g */
    public static int f174g = f171c;

    /* renamed from: h */
    public static int f175h = GFX_MenuHeight;

    /* renamed from: a */
    public static Image[] GFX_HUDArray = new Image[20];

    /* renamed from: b */
    public static Image[] GFX_GameArray = new Image[160];

    /* renamed from: a */
    private static final Random Math_Random = new Random();

    /* renamed from: a */
    public static final int[] f179a = {0, 5, 3, 6, 2, 7, 1, 4};

    /* renamed from: e */
    private static final String[] Music_Paths = {"/greenhill_loop", "/labyrinth_loop", "/marble_loop", "/starlight_loop", "/springyard_loop", "/scrapbrain", "/invincible", "/1up", "/specialstage", "/maintitle", "/ending", "/bossstage", "/bossstagefinal_loop", "/stageclear", "/gameover", "/continue", "/credits", "/hurry", "/chaosemerald", "/score", "/sega", "/greenhill_intro", "/marble_intro", "/springyard_intro"};

    /* renamed from: b */
    private static final short[][] f181b = {new short[]{0, 120, 0}, new short[]{48, 120, 0}, new short[]{96, 120, 0}, new short[]{96, 120, 1}, new short[]{48, 120, 1}};

    /* renamed from: c */
    private static final short[][] f182c = {new short[]{48, 0}, new short[]{0, 32}, new short[]{48, 32}, new short[]{0, 32}};

    /* renamed from: a */
    public static final int[][] f183a = {new int[]{0, 0, 112, 16}, new int[]{112, 0, 56, 16}, new int[]{0, 16, 80, 16}, new int[]{80, 16, 48, 16}, new int[]{128, 16, 8, 16}, new int[]{136, 16, 16, 16}, new int[]{152, 16, 16, 16}, new int[]{0, 32, 128, 16}, new int[]{128, 32, 24, 8}, new int[]{0, 48, 128, 16}, new int[]{128, 40, 40, 40}, new int[]{0, 64, 120, 16}, new int[]{0, 80, 104, 16}, new int[]{104, 80, 40, 40}, new int[]{0, 96, 104, 16}, new int[]{0, 112, 72, 16}, new int[]{0, 128, 152, 16}, new int[]{0, 144, 176, 16}};

    /* renamed from: b */
    public static int[] f184b = new int[2];

    /* renamed from: c */
    public static int[] Player_Info = new int[16];

    /* renamed from: b */
    public static final int[][] f186b = {new int[]{80, 944, 80, 252, 80, 944, 128, 168}, new int[]{96, 108, 80, 236, 80, 748, 2944, 0}, new int[]{48, 614, 48, 614, 48, 358, 128, 168}, new int[]{64, 716, 64, 332, 64, 332, 128, 168}, new int[]{48, 957, 48, 445, 48, 236, 128, 168}, new int[]{48, 1164, 48, 1868, 8512, 1452, 128, 168, 304, 168}, new int[]{1568, 363, 3808, 364, 128, 168, 128, 168}};

    /* renamed from: a */
    public static final byte[] f187a = {1, 2, 3, 2};

    /* renamed from: d */
    public static final int[] f188d = {912, 224, 656, 672, 1360, -16};

    /* renamed from: e */
    public static final int[] f189e = {32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};

    /* renamed from: g */
    public static final int[] f190g = {1296, 3632, 752, 4880};

    /* renamed from: h */
    public static final int[] f191h = {1168, 1104, 1680, 1360};

    /* renamed from: i */
    public static final int[] f192i = {1263, 3598, 785, 4845};

    /* renamed from: j */
    public static final int[] f193j = {1216, 1136, 1728, 1392};

    /* renamed from: k */
    public static final int[] f194k = {-1, -1, 1, -1};

    /* renamed from: l */
    public static final int[] f195l = {4, 7, 5, 6, 0, 3, 2, 1};

    /* renamed from: m */
    public static final int[] f196m = {0, 5, 8, 17, 20, 28, 32, 34};

    /* renamed from: n */
    public static final int[] Score_HiddenBonuses = {0, 10000, 1000, 100};

    /* renamed from: o */
    public static final int[] f198o = {-8, -16, -12, 12, 16, 8};

    /* renamed from: p */
    public static final int[] f199p = {22, 25, 13, 22, 25, 13};

    /* renamed from: q */
    public static final int[] f200q = {2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};

    /* renamed from: r */
    public static final int[] f201r = {8, 0, 4, 3, 2, 1, 0};

    /* renamed from: s */
    public static final int[] f202s = {f179a[0], f179a[1], f179a[7], f179a[4]};

    /* renamed from: t */
    public static final int[] f203t = {8, 0, 40, 24, 10, 40, 30, 24, 41, 6};

    /* renamed from: u */
    public static final int[] f204u = {8, 16, 8, 30, 23, 24, 18, 16, 18, 8};

    /* renamed from: v */
    public static final int[] f205v = {0, 32, 64, 96, 128, 168, 208};

    /* renamed from: d */
    public static final int[][] f206d = {new int[]{44, 44, 44, 44, 44, 44, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 44, 44, 44, 44, 44, 44, 44}, new int[]{52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, new int[]{37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53}};

    /* renamed from: d */
    private static final short[][] f207d = {new short[]{0, 0}, new short[]{16, 0}, new short[]{0, 16}, new short[]{16, 16}};

    /* renamed from: e */
    private static final short[][] f208e = {new short[]{-250, -360}, new short[]{-80, -100}, new short[]{-160, -250}, new short[]{-200, -300}, new short[]{-120, -225}, new short[]{-150, -250}, new short[]{-100, -165}};

    /* renamed from: b */
    private static final byte[][] f209b = {new byte[]{28, 31}, new byte[]{32, 29}, new byte[]{33, 29}, new byte[]{28, 34}, new byte[]{34, 30}, new byte[]{31, 30}, new byte[]{33, 33}, new byte[]{31, 31}};

    /* renamed from: f */
    private static final short[][] f210f = {new short[]{9312, 7776}, new short[]{6736, 4176, 8208}, new short[]{6224, 6224}, new short[]{8288, 8032}, new short[]{8800, 10336}, new short[]{8544, 7648}};

    /* renamed from: x */
    public static final int[] f211x = {0, 2, 7, 12, 11, 9, 1};

    /* renamed from: f */
    public static final int[][] f212f = {new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{1, 1, 1}, new int[]{3, 3, 3}, new int[]{5, 5, 1}, new int[]{5, 0}};

    /* renamed from: g */
    public static final int[][] f213g = {new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 3}, new int[]{3, 3}};

    /* renamed from: y */
    public static int[] f214y = new int[2];

    /* renamed from: z */
    public static int[] Camera_Pos = new int[2];

    /* renamed from: c */
    private static final int[][][] f216c = {new int[]{new int[]{4, 0, 9407, 0, 768, 96}, new int[]{4, 0, 7871, 0, 768, 96}, new int[]{4, 0, 10592, 0, 768, 96}, new int[]{4, 0, 10943, 0, 768, 96}}, new int[0], new int[]{new int[]{4, 0, 6079, 0, 464, 96}, new int[]{4, 0, 6079, 0, 1312, 96}, new int[]{4, 0, 6144, 0, 1824, 96}, new int[]{4, 0, 5823, 0, 1824, 96}}, new int[0], new int[]{new int[]{4, 0, 8896, 0, 1056, 96}, new int[]{4, 0, 10432, 0, 1312, 96}, new int[]{4, 0, 11264, 0, 1568, 96}, new int[]{4, 0, 11968, 0, 1568, 96}}, new int[0]};

    /* renamed from: z */
    public static boolean f217z = true;

    /* renamed from: A */
    public static boolean f218A = true;

    /* renamed from: B */
    public static boolean f219B = true;

    /* renamed from: A */
    public static final int[] Sine_ResultTable = {0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};

    /* renamed from: l */
    private static final int[][] f221l = {new int[]{0, 0, 190, 109}, new int[]{0, 159, 49, 57}, new int[]{0, 109, 56, 50}, new int[]{107, 188, 53, 36}, new int[]{62, 109, 60, 55}, new int[]{50, 164, 55, 57}, new int[]{127, 110, 35, 57}, new int[]{163, 109, 27, 58}, new int[]{127, 110, 35, 57}, new int[]{135, 167, 26, 21}, new int[]{163, 167, 27, 57}, new int[]{163, 109, 27, 58}, new int[]{0, 224, 190, 56}};

    /* renamed from: a */
    private static final char[] HighScore_ValidChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '@', '?', '!', ',', '.', ' '};

    /* renamed from: g */
    private boolean[] f223g = new boolean[10];

    /* renamed from: a */
    public boolean[] Input_Array = new boolean[10];

    /* renamed from: a */
    public String[] f225a = new String[2];

    /* renamed from: j */
    public int f226j = 1;

    /* renamed from: k */
    public int f227k = 1;

    /* renamed from: a */
    public boolean f228a = false;

    /* renamed from: a */
    private byte[][] f229a = {new byte[]{31, 32, 33}, new byte[]{35, 34}, new byte[]{39, 40, 41, 42, 43}};

    /* renamed from: l */
    public int Player_Emeralds = 0;

    /* renamed from: E */
    private final int[] f231E = {5898300, (((getWidth() - 90) - 16) << 16) | 60, 4587610, (((getWidth() - 70) - 16) << 16) | 90, 5898366, (((getWidth() - 90) - 16) << 16) | 126};

    /* renamed from: aN */
    private int f232aN = 0;

    /* renamed from: aO */
    private int f233aO = 0;

    /* renamed from: aQ */
    private int f234aQ = 0;

    /* renamed from: aT */
    private int f235aT = 0;

    /* renamed from: aZ */
    private int f236aZ = GFX_MenuWidth >> 1;

    /* renamed from: ba */
    private int f237ba = (f175h * 3) >> 2;

    /* renamed from: b */
    public String[] Text_Main = new String[93];

    /* renamed from: f */
    private String[] Text_Manual = new String[357];

    /* renamed from: M */
    private boolean f240M = false;

    /* renamed from: bc */
    private int f241bc = 10;

    /* renamed from: h */
    private int[][] f242h = new int[this.f241bc][15];

    /* renamed from: be */
    private int f243be = 0;

    /* renamed from: bf */
    private int f244bf = 2100;

    /* renamed from: bg */
    private int f245bg = 0;

    /* renamed from: bh */
    private int f246bh = 0;

    /* renamed from: n */
    public int Player_TopSpeed = 1536;

    /* renamed from: o */
    public int Player_Acceleration = 12;

    /* renamed from: bi */
    private int Player_Deceleration = 128;

    /* renamed from: bj */
    private int f250bj = 56;

    /* renamed from: bk */
    private int Player_JumpForce = 1664;

    /* renamed from: bl */
    private int Player_WaterJumpForce = 896;

    /* renamed from: F */
    private int[] f253F = new int[2];

    /* renamed from: h */
    private boolean[] f254h = new boolean[4];

    /* renamed from: F */
    public int f255F = 0;

    /* renamed from: G */
    public int f256G = 0;

    /* renamed from: c */
    public int[][] f257c = new int[30][25];

    /* renamed from: a */
    public short[][] f258a = new short[10][4];

    /* renamed from: J */
    public int f259J = 0;

    /* renamed from: f */
    public int[] f260f = {64, 32, 64};

    /* renamed from: b */
    public boolean[] f261b = new boolean[256];

    /* renamed from: p */
    public boolean f262p = false;

    /* renamed from: c */
    private byte[] f263c = new byte[8192];

    /* renamed from: e */
    public int[][] f264e = new int[256][25];

    /* renamed from: w */
    public int[] Object_Info = new int[25];

    /* renamed from: k */
    private int[][] f266k = new int[30][10];

    /* renamed from: q */
    public boolean f267q = false;

    /* renamed from: r */
    public boolean f268r = false;

    /* renamed from: e */
    public boolean[] f269e = new boolean[256];

    /* renamed from: ah */
    public int f270ah = 0;

    /* renamed from: bq */
    private int f271bq = 0;

    /* renamed from: br */
    private int f272br = 0;

    /* renamed from: bs */
    private int f273bs = 0;

    /* renamed from: bt */
    private int f274bt = 0;

    /* renamed from: aj */
    public int Game_ZoneID = -1;

    /* renamed from: ak */
    public int Game_ActID = 0;

    /* renamed from: al */
    public int f277al = 0;

    /* renamed from: am */
    public int f278am = 0;

    /* renamed from: G */
    private int[] f279G = new int[2];

    /* renamed from: H */
    private int[] f280H = new int[2];

    /* renamed from: I */
    private int[] f281I = new int[2];

    /* renamed from: j */
    private byte[] f282j = new byte[8192];

    /* renamed from: c */
    private byte[][] Level_ActorLayout = new byte[4];

    /* renamed from: k */
    private byte[] f284k = new byte[512];

    /* renamed from: bw */
    private int f285bw = 0;

    /* renamed from: t */
    public boolean f286t = false;

    /* renamed from: u */
    public boolean f287u = false;

    /* renamed from: h */
    private byte f288h = 9;

    /* renamed from: an */
    public int f289an = 0;

    /* renamed from: l */
    private byte[] f290l = new byte[4];

    /* renamed from: y */
    public boolean f291y = false;

    /* renamed from: by */
    private int f292by = 0;

    /* renamed from: bz */
    private int f293bz = 0;

    /* renamed from: bA */
    private int f294bA = 0;

    /* renamed from: bB */
    private int f295bB = 0;

    /* renamed from: T */
    private boolean f296T = false;

    /* renamed from: U */
    private boolean f297U = false;

    /* renamed from: C */
    public boolean f298C = false;

    /* renamed from: bF */
    private int f299bF = 0;

    /* renamed from: bG */
    private int f300bG = 0;

    /* renamed from: bI */
    private int f301bI = 10;

    /* renamed from: K */
    private int[] f302K = new int[4];

    /* renamed from: bJ */
    private int f303bJ = 0;

    /* renamed from: E */
    public boolean f304E = false;

    /* renamed from: as */
    public int f305as = 0;

    /* renamed from: at */
    public int f306at = 0;

    /* renamed from: au */
    public int f307au = 0;

    /* renamed from: bK */
    private int f308bK = 0;

    /* renamed from: bL */
    private int f309bL = 0;

    /* renamed from: Z */
    private boolean f310Z = false;

    /* renamed from: aa */
    private boolean f311aa = false;

    /* renamed from: av */
    public int f312av = 0;

    /* renamed from: m */
    private byte[] Game_Settings = new byte[4];

    /* renamed from: aw */
    public int f314aw = 0;

    /* renamed from: f */
    public boolean[] Cheats_Active = {false, false, false, false, false};

    /* renamed from: G */
    public boolean f316G = false;

    /* renamed from: ax */
    public int f317ax = 0;

    /* renamed from: ay */
    public int f318ay = 0;

    /* renamed from: H */
    public boolean f319H = false;

    /* renamed from: aA */
    public int f320aA = 0;

    /* renamed from: aB */
    public int f321aB = 0;

    /* renamed from: aC */
    public int Math_Minimum = Integer.MIN_VALUE;

    /* renamed from: B */
    public int[] f323B = new int[6];

    /* renamed from: aD */
    public int f324aD = 0;

    /* renamed from: c */
    public String[] f325c = {"", ""};

    /* renamed from: aG */
    public int f326aG = 3;

    /* renamed from: J */
    public boolean f327J = false;

    /* renamed from: ab */
    private boolean f328ab = false;

    /* renamed from: bR */
    private int f329bR = 0;

    /* renamed from: L */
    private int[] f330L = new int[3];

    /* renamed from: M */
    private int[] f331M = new int[8];

    /* renamed from: bS */
    private int f332bS = 0;

    /* renamed from: b */
    private String Text_ProgressElements = "";

    /* renamed from: K */
    public boolean f334K = false;

    /* renamed from: a */
    public static int Math_CalcSine(int input) {
        int output = input % 360;
        if (output < 0 || output > 90) {
            if (output <= 90 || output > 180) {
                if (output <= 180 || output > 270) {
                    if (output <= 270 || output > 359) {
                        return 0;
                    }
                    return (-1) * (Sine_ResultTable[90 - (output - 270)] / 100);
                }
                return (-1) * (Sine_ResultTable[output - 180] / 100);
            }
            return Sine_ResultTable[90 - (output - 90)] / 100;
        }
        return Sine_ResultTable[output] / 100;
    }

    /* renamed from: b */
    public static int Math_CalcCosine(int input) {
        int output = input % 360;
        if (output < 0 || output >= 90) {
            if (output < 90 || output >= 180) {
                if (output < 180 || output >= 270) {
                    if (output < 270 || output > 359) {
                        return 0;
                    }
                    return (-1) * (Sine_ResultTable[output - 270] / 100);
                }
                return Sine_ResultTable[89 - (output - 180)] / 100;
            }
            return Sine_ResultTable[output - 90] / 100;
        }
        return ((-1) * Sine_ResultTable[89 - output]) / 100;
    }

    /* renamed from: a */
    public final void m233a() {
        this.Boss_XPos = 11424;
        this.Boss_YPos = 1232;
        for (int i = 0; i < 10; i++) {
            this.f258a[i][0] = (short) ((-160) + (32 * i) + 16);
            this.f258a[i][1] = 176;
            this.f258a[i][2] = 0;
            this.f258a[i][3] = 0;
        }
    }

    /* renamed from: b */
    public final void m145b() {
        for (int i = 0; i < 10; i++) {
            if (this.f258a[i][3] != 0) {
                m134b(23, (int) this.f258a[i][0], (int) this.f258a[i][1], 330, 300, 0);
                m134b(23, (int) this.f258a[i][0], (int) this.f258a[i][1], 30, 300, 1);
                m134b(23, (int) this.f258a[i][0], (int) this.f258a[i][1], 300, 300, 2);
                m134b(23, (int) this.f258a[i][0], (int) this.f258a[i][1], 60, 300, 3);
                this.f258a[i][2] = 1;
            }
        }
    }

    /* renamed from: c */
    public final void m125c() {
        int i;
        int i2;
        short s;
        if (this.Object_Info[14] == 0) {
            m233a();
            int[] iArr = this.Object_Info;
            iArr[14] = iArr[14] + 1;
        }
        for (int i3 = 0; i3 < 10; i3++) {
            if (this.f258a[i3][2] == 0) {
                if (this.f258a[i3][3] == 0) {
                    i = this.Boss_XPos + this.f258a[i3][0];
                    i2 = this.Boss_YPos;
                    s = this.f258a[i3][1];
                } else {
                    i = this.Boss_XPos + ((this.f94S + this.f96U) / 100);
                    i2 = this.Boss_YPos + ((this.f95T + this.f97V) / 100);
                    s = 24;
                }
                m117c(i, i2 + s, 16, 16);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0410  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109d() {
        Game game;
        int i;
        Game game2;
        int i2;
        int[] iArr = this.Object_Info;
        boolean z = false;
        m88e(iArr);
        if (this.f87L > 99) {
            if (m144b()) {
                iArr[0] = 0;
                return;
            }
            return;
        }
        this.f91P += 200;
        this.f96U = 0;
        this.f97V = Math_CalcSine(this.f91P / 100) * 12;
        int Player_RoughXPos = (Player_RoughXPos() - (this.Boss_XPos - 160)) / 32;
        int i3 = (this.f94S + 16000) / 3200;
        int abs = Math.abs(((this.f94S / 100) + 160) - ((i3 * 32) + 16));
        if (Player_RoughXPos == i3 && abs < 3 && this.f259J == 0) {
            z = true;
        }
        if (this.f259J > 0) {
            this.f259J--;
        }
        if (this.f92Q > 16 && m212a(iArr[2], ((iArr[3] + 8) - 32) + this.f92Q, 14, 32, false) != 0) {
            Player_Hurt();
        }
        if (m124c() && this.f87L > 3 && this.f102aa == 0) {
            m105d(iArr[2], iArr[3]);
            if (this.f102aa == 0 && this.f87L < 100) {
                int i4 = this.f106ae - 1;
                this.f106ae = i4;
                if (i4 <= 0) {
                    m145b();
                    this.f87L = 100;
                    return;
                }
                this.f104ac = 3;
                this.f105ad = 60;
                this.f102aa = 60;
            }
        }
        switch (this.f87L) {
            case 1:
                this.f104ac = 0;
                this.f88M = 2;
                this.f94S = 19200;
                this.f95T = 10000;
                this.f90O = 0;
                this.f91P = 0;
                this.f100Y = 50;
                this.f259J = 90;
                z = false;
                this.f87L++;
                if (this.f100Y <= 0) {
                    this.f87L++;
                    this.f88M = 2;
                    this.f95T -= 20;
                    this.f94S -= 100;
                    if (this.f94S <= 6400) {
                        this.f94S = 6400;
                        this.f88M = 0;
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 60;
                        this.f87L++;
                        if (!z) {
                            game = this;
                            i = 10;
                            game.f87L = i;
                            break;
                        } else {
                            this.f88M = 2;
                            this.f89N = 0;
                            this.f94S -= 70;
                            if (this.f94S <= -12000) {
                                this.f94S = -12000;
                                this.f87L++;
                                if (z) {
                                    this.f88M = 2;
                                    this.f89N = 1;
                                    this.f94S += 70;
                                    if (this.f94S >= 12000) {
                                        this.f94S = 12000;
                                        this.f87L++;
                                        game = this;
                                        i = 4;
                                        game.f87L = i;
                                    }
                                } else {
                                    game = this;
                                    i = 10;
                                    game.f87L = i;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (this.f100Y <= 0) {
                }
                break;
            case 3:
                this.f88M = 2;
                this.f95T -= 20;
                this.f94S -= 100;
                if (this.f94S <= 6400) {
                }
                break;
            case 4:
                if (!z) {
                }
                break;
            case 5:
                if (z) {
                }
                break;
            case 6:
                game = this;
                i = 4;
                game.f87L = i;
                break;
            case 7:
            case 8:
            case 9:
            default:
                this.f87L = 1;
                this.f104ac = 0;
                this.f88M = 2;
                this.f94S = 19200;
                this.f95T = 10000;
                this.f90O = 0;
                this.f91P = 0;
                this.f100Y = 50;
                this.f259J = 90;
                z = false;
                this.f87L++;
                if (this.f100Y <= 0) {
                }
                break;
            case 10:
                this.f88M = 0;
                this.f104ac = 1;
                this.f87L++;
                this.f95T += 120;
                if (this.f92Q < 32) {
                    this.f92Q++;
                }
                if (this.f95T >= 15400) {
                    this.f95T = 15400;
                    this.f100Y = 48;
                    this.f258a[i3][3] = 1;
                    this.f87L++;
                    this.f96U = 0;
                    this.f97V = m123c(400) - 200;
                    if (this.f100Y <= 0) {
                        this.f96U = 0;
                        this.f97V = 0;
                        this.f87L++;
                        this.f95T -= 300;
                        if (this.f95T <= 2400) {
                            this.f95T = 2400;
                            this.f100Y = 50;
                            this.f87L++;
                            this.f96U = 0;
                            this.f97V = m123c(400) - 200;
                            if (this.f92Q > 0) {
                                this.f92Q--;
                            }
                            if (this.f100Y <= 0) {
                                if (this.f258a[i3][2] == 0) {
                                    this.f96U = 0;
                                    this.f97V = 0;
                                    m134b(23, iArr[2], iArr[3] + 24, 330, 300, 0);
                                    m134b(23, iArr[2], iArr[3] + 24, 30, 300, 1);
                                    m134b(23, iArr[2], iArr[3] + 24, 300, 300, 2);
                                    m134b(23, iArr[2], iArr[3] + 24, 60, 300, 3);
                                    this.f258a[i3][2] = 1;
                                }
                                this.f100Y = 30;
                                this.f87L++;
                                if (this.f100Y <= 0) {
                                    this.f259J = 120;
                                    game = this;
                                    i = this.f89N == 0 ? 4 : 5;
                                    game.f87L = i;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                this.f95T += 120;
                if (this.f92Q < 32) {
                }
                if (this.f95T >= 15400) {
                }
                break;
            case 12:
                this.f96U = 0;
                this.f97V = m123c(400) - 200;
                if (this.f100Y <= 0) {
                }
                break;
            case 13:
                this.f95T -= 300;
                if (this.f95T <= 2400) {
                }
                break;
            case 14:
                this.f96U = 0;
                this.f97V = m123c(400) - 200;
                if (this.f92Q > 0) {
                }
                if (this.f100Y <= 0) {
                }
                break;
            case 15:
                if (this.f100Y <= 0) {
                }
                break;
        }
        m112c(iArr);
        if (this.f87L == 4 || this.f87L == 5) {
            if (Math.abs(iArr[2] - Player_RoughXPos()) < 64) {
                if (this.f95T <= 1000) {
                    return;
                }
                game2 = this;
                i2 = game2.f95T - 160;
            } else if (this.f95T >= 8000) {
                return;
            } else {
                game2 = this;
                i2 = game2.f95T + 140;
            }
            game2.f95T = i2;
        }
    }

    public void hideNotify() {
        Game_Pause();
    }

    public void showNotify() {
        m79g();
        this.f152bP = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v91, types: [byte[], byte[][]] */
    public Game(MIDlet mIDlet, int i) {
        short[] sArr = {new short[]{0, 0, 64, 96}, new short[]{64, 0, 64, 96}, new short[]{128, 0, 64, 96}};
        this.f154az = 0;
        this.f153a = mIDlet;
        this.f154az = i;
        setFullScreenMode(true);
        sizeChanged(getWidth(), getHeight());
    }

    public void keyPressed(int i) {
        boolean[] zArr;
        char c;
        Game game;
        boolean[] zArr2;
        char c2;
        Game game2;
        int i2;
        if (!this.f316G && this.f121ai == 1) {
            if (i == "230691".charAt(this.f317ax)) {
                game2 = this;
                i2 = game2.f317ax + 1;
            } else {
                game2 = this;
                i2 = 0;
            }
            game2.f317ax = i2;
            if (this.f317ax == 6) {
                this.f316G = true;
            }
        }
        if (f79m && this.f121ai == 2) {
            return;
        }
        switch (m95e(i)) {
            case 1:
                this.Input_Array[3] = true;
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 2:
            case 14:
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 3:
                this.Input_Array[4] = true;
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 4:
            case 16:
                zArr2 = this.Input_Array;
                c2 = 3;
                break;
            case 5:
            case 18:
                zArr2 = this.Input_Array;
                c2 = 0;
                break;
            case 6:
            case 17:
                zArr2 = this.Input_Array;
                c2 = 4;
                break;
            case 7:
                zArr = this.Input_Array;
                c = 3;
                zArr[c] = true;
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 8:
            case 15:
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 9:
                zArr = this.Input_Array;
                c = 4;
                zArr[c] = true;
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 10:
                this.Input_Array[9] = true;
                if (this.f316G && this.Cheats_Active[4]) {
                    this.f319H = !this.f319H;
                    return;
                }
                return;
            case 11:
            default:
                return;
            case 12:
                zArr2 = this.Input_Array;
                c2 = 5;
                break;
            case 13:
                zArr2 = this.Input_Array;
                c2 = 6;
                break;
        }
        zArr2[c2] = true;
    }

    public void keyReleased(int i) {
        boolean[] zArr;
        char c;
        Game game;
        boolean[] zArr2;
        char c2;
        switch (m95e(i)) {
            case 1:
                this.Input_Array[3] = false;
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 2:
            case 14:
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 3:
                this.Input_Array[4] = false;
                zArr2 = this.Input_Array;
                c2 = 2;
                break;
            case 4:
            case 16:
                zArr2 = this.Input_Array;
                c2 = 3;
                break;
            case 5:
            case 18:
                zArr2 = this.Input_Array;
                c2 = 0;
                break;
            case 6:
            case 17:
                zArr2 = this.Input_Array;
                c2 = 4;
                break;
            case 7:
                zArr = this.Input_Array;
                c = 3;
                zArr[c] = false;
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 8:
            case 15:
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 9:
                zArr = this.Input_Array;
                c = 4;
                zArr[c] = false;
                game = this;
                zArr2 = game.Input_Array;
                c2 = 1;
                break;
            case 10:
                zArr2 = this.Input_Array;
                c2 = '\t';
                break;
            case 11:
            default:
                return;
            case 12:
                zArr2 = this.Input_Array;
                c2 = 5;
                break;
            case 13:
                zArr2 = this.Input_Array;
                c2 = 6;
                break;
        }
        zArr2[c2] = false;
    }

    public void playerUpdate(Player player, String str, Object obj) {
        if (str == "endOfMedia") {
            switch (this.Music_MainPlayer.Music_CurTrack) {
                case 7:
                case 21:
                case 22:
                case 23:
                    m90e(false);
                    return;
                case 14:
                    m175aI();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: e */
    public final void m97e() {
        for (int i = 0; i < this.Input_Array.length; i++) {
            this.Input_Array[i] = false;
        }
    }

    /* renamed from: f */
    public final void m86f() throws Exception {
        Record_Load_Settings();
        Text_LoadLang();
        m169ad();
        m167af();
        this.Music_MainPlayer = new Audio_Player(this);
        this.Music_MainPlayer.Music_PlayerPaths = Music_Paths;
        this.Music_MainPlayer.m5a((int) this.Game_Settings[1]);
        this.f267q = true;
        m101d(true);
        this.f121ai = 1;
        this.f131v = true;
        this.f132ao = 10;
        this.f112af = 0;
    }

    public void paint(Graphics graphics) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    /* renamed from: g */
    public final void m79g() {
        this.Math_Minimum = Integer.MIN_VALUE;
        this.f320aA = (int) ((System.currentTimeMillis() - this.f155b) / 18);
    }

    /* renamed from: h */
    public final void Record_Save_Settings() {
        Record_Save(this.Game_Settings, "config");
    }

    /* renamed from: ab */
    private void Record_Load_Settings() {
        this.Game_Settings = Record_Load("config");
        if (this.Game_Settings == null) {
            this.f240M = true;
            this.Game_Settings = new byte[4];
            this.Game_Settings[0] = 1;
            this.Game_Settings[1] = 1;
            this.Game_Settings[2] = 0;
            Record_Save_Settings();
        }
    }

    /* renamed from: ac */
    private void Record_Save_Game() {
        byte[] savedata = new byte[10];
        savedata[0] = this.f127g;
        savedata[1] = this.f288h;
        savedata[2] = this.f128i;
        for (int i = 0; i < 4; i++) {
            savedata[3 + i] = (byte) (this.f129bx >> ((i << 3) & 255));
        }
        savedata[7] = (byte) this.Player_Emeralds;
        Record_Save(savedata, "savedGame");
    }

    /* renamed from: a */
    private String m234a() {
        long j = 0 | (this.f128i << 30) | (this.f129bx << 3) | this.Player_Emeralds;
        char[] cArr = new char[8];
        for (int length = cArr.length - 1; length >= 0; length--) {
            int i = (int) (j % 36);
            cArr[length] = (char) (i < 10 ? i + 48 : (65 + i) - 10);
            j /= 36;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private boolean m203a(String str) {
        int i;
        long j = 0;
        long j2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt >= '0' && charAt <= '9') {
                i = charAt - '0';
            } else if (charAt < 'A' || charAt > 'Z') {
                return false;
            } else {
                i = (charAt - 'A') + 10;
            }
            j += i * j2;
            j2 *= 36;
        }
        byte b = (byte) ((j >> 30) & 127);
        int i2 = (int) ((j >> 3) & 134217727);
        int i3 = (int) (j & 7);
        if (b < 1 || b > 99 || i2 < 0 || i2 > 99999999 || i3 < 0 || i3 > 6) {
            return false;
        }
        if (this.f127g == 0) {
            this.f288h = (byte) 10;
        }
        this.f128i = b;
        this.f129bx = i2;
        this.Player_Emeralds = i3;
        Record_Save_Game();
        return true;
    }

    /* renamed from: ad */
    private void m169ad() {
        try {
            byte[] Record_Load = Record_Load("savedGame");
            this.f127g = Record_Load[0];
            this.f288h = Record_Load[1];
            this.f128i = Record_Load[2];
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (Record_Load[3 + i2] & 255) << (i2 << 3);
            }
            this.f129bx = i;
            this.Player_Emeralds = Record_Load[7];
            this.f318ay = this.Player_Emeralds;
        } catch (Exception unused) {
            Record_Save_Game();
        }
    }

    /* renamed from: ae */
    private void HighScore_ResetValues() {
        byte[] entriesarray = new byte[55];
        for (int i = 0; i < 5; i++) {
            entriesarray[0 + (i * 11)] = (byte) HighScore_DefaultDifficulties[i];
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 2; i3++) {
                    entriesarray[1 + (i2 * 2) + i3 + (i * 11)] = (byte) (HighScore_DefaultNames[i].charAt(i2) >> ((i3 * 8) % 256));
                }
            }
            for (int i4 = 0; i4 < 4; i4++) {
                entriesarray[7 + i4 + (i * 11)] = (byte) (HighScore_DefaultScores[i] >> ((i4 * 8) % 256));
            }
        }
        Record_Save(entriesarray, "highscore");
    }

    /* renamed from: af */
    private void m167af() {
        try {
            byte[] Record_Load = Record_Load("highscore");
            for (int i = 0; i < 5; i++) {
                HighScore_DefaultDifficulties[i] = Record_Load[0 + (i * 11)];
                char[] cArr = new char[3];
                for (int i2 = 0; i2 < 3; i2++) {
                    char c = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        c = (char) (c | (Record_Load[((1 + (i2 * 2)) + i3) + (i * 11)] << (i3 * 8)));
                    }
                    cArr[i2] = c;
                }
                HighScore_DefaultNames[i] = new String(cArr);
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 |= (Record_Load[(7 + i5) + (i * 11)] & 255) << (i5 * 8);
                }
                HighScore_DefaultScores[i] = i4;
            }
        } catch (Exception unused) {
            HighScore_ResetValues();
        }
    }

    /* renamed from: ag */
    private void m166ag() {
        String[] strArr;
        char c;
        String str;
        String[] strArr2;
        char c2;
        String str2;
        String[] strArr3;
        char c3;
        String[] strArr4;
        char c4;
        String[] strArr5;
        char c5;
        if (this.f121ai != 1) {
            if (this.f121ai == 6 || this.f121ai == 4 || this.f121ai == 2 || this.f121ai == 3 || this.f121ai == 9 || this.f121ai == 7) {
                strArr = this.f225a;
                c = 0;
                str = "";
            } else {
                if (this.Game_Settings[1] != 0) {
                    strArr = this.f225a;
                    c = 0;
                    strArr3 = this.Text_Main;
                    c3 = 'E';
                } else {
                    strArr = this.f225a;
                    c = 0;
                    strArr3 = this.Text_Main;
                    c3 = 'D';
                }
                str = strArr3[c3];
            }
            strArr[c] = str;
            if (this.f121ai == 2) {
                if ((this.Player_Lives > 0 || !f75j) && !this.f262p) {
                    strArr2 = this.f225a;
                    c2 = 1;
                    str2 = this.Text_Main[60];
                } else {
                    strArr2 = this.f225a;
                    c2 = 1;
                    str2 = "";
                }
            } else if (this.f121ai == 10) {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = this.Text_Main[61];
            } else if (this.f121ai == 6) {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = this.Text_Main[66];
            } else if (this.f121ai == 3) {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = this.Text_Main[59];
            } else if (this.f121ai == 4) {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = "";
            } else if (this.f121ai != 9) {
                return;
            } else {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = "OK";
            }
        } else if (this.Menu_ID == 3 || this.Menu_ID == 4) {
            if (this.Game_Settings[1] != 0) {
                strArr4 = this.f225a;
                c4 = 0;
                strArr5 = this.Text_Main;
                c5 = 'E';
            } else {
                strArr4 = this.f225a;
                c4 = 0;
                strArr5 = this.Text_Main;
                c5 = 'D';
            }
            strArr4[c4] = strArr5[c5];
            if (this.Menu_ID == 4) {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = this.Text_Main[59];
            } else {
                strArr2 = this.f225a;
                c2 = 1;
                str2 = this.Text_Main[57];
            }
        } else if (this.Menu_ID != 14) {
            return;
        } else {
            this.f225a[1] = this.Text_Main[59];
            strArr2 = this.f225a;
            c2 = 0;
            str2 = "";
        }
        strArr2[c2] = str2;
    }

    /* renamed from: a */
    public final boolean m232a() {
        try {
            if (this.f42b && this.f225a[1].equals(this.Text_Main[60])) {
                Game_Pause();
                return true;
            }
            this.f42b = false;
            char c = 65535;
            if (this.Input_Array[5]) {
                if (this.Menu_ID == 17) {
                    return false;
                }
                this.Input_Array[5] = false;
                c = 0;
            } else if (this.Input_Array[6]) {
                if (this.f121ai == 1) {
                    return false;
                }
                this.Input_Array[6] = false;
                c = 1;
            }
            if (c != 65535) {
                if (this.f225a[c].equals(this.Text_Main[59])) {
                    if (this.f121ai != 3) {
                        m106d(3);
                        return true;
                    }
                    m106d(4);
                    this.Menu_CurrentSelection = (byte) 1;
                    m41n(11 + this.Menu_CurrentSelection);
                    m37o(2);
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[60])) {
                    this.f121ai = 10;
                    this.f131v = true;
                    this.f132ao = 10;
                    this.f289an = 0;
                    this.Music_MainPlayer.Music_DestroyPlayer();
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[61])) {
                    Record_Save_Settings();
                    this.f121ai = 2;
                    this.f267q = true;
                    this.f131v = true;
                    this.f132ao = 10;
                    this.f291y = true;
                    f219B = true;
                    m90e(false);
                    m79g();
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[66])) {
                    m106d(3);
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[68])) {
                    this.Game_Settings[1] = this.f290l[1];
                    if (this.Game_Settings[1] == 0) {
                        this.Game_Settings[1] = 1;
                    }
                    Record_Save_Settings();
                    this.Music_MainPlayer.m5a(1);
                    this.f131v = true;
                    this.f132ao = 10;
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[69])) {
                    this.f290l[1] = this.Game_Settings[1];
                    this.Game_Settings[1] = 0;
                    Record_Save_Settings();
                    this.Music_MainPlayer.m5a(0);
                    this.f131v = true;
                    this.f132ao = 10;
                    return true;
                } else if (this.f225a[c].equals(this.Text_Main[57])) {
                    this.Menu_ID = (byte) 14;
                    this.Menu_CurrentSelection = (byte) 1;
                    m37o(3);
                    return true;
                } else if (this.f225a[c].equals("OK")) {
                    m173aK();
                }
            }
            return false;
        } catch (Exception unused) {
            this.f42b = false;
            return false;
        }
    }

    /* renamed from: i */
    public final void Game_Pause() {
        if (this.f121ai != 2) {
            this.f267q = true;
            return;
        }
        this.f121ai = 10;
        this.f131v = true;
        this.f132ao = 10;
        this.f289an = 0;
        this.f42b = false;
        this.Music_MainPlayer.Music_DestroyPlayer();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[LOOP:0: B:3:0x0002->B:25:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m192a(boolean z) {
        Game game;
        int i;
        for (int i2 = 0; i2 < 6; i2++) {
            if (!z || this.f277al >= f212f.length) {
                if (this.f277al >= 0) {
                    this.f277al--;
                    if (this.f277al < 0) {
                        this.f277al = 6;
                        game = this;
                        i = 2;
                        game.f278am = i;
                    }
                }
                if (!m229a(f212f[this.f277al][0])) {
                    return;
                }
            } else {
                this.f277al++;
                if ((this.f277al == 6 && this.f278am == 3) || this.f277al > 6) {
                    this.f277al = 0;
                    game = this;
                    i = 0;
                    game.f278am = i;
                }
                if (!m229a(f212f[this.f277al][0])) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m229a(int i) {
        return i == 0 || i == 2 || i == 4;
    }

    /* renamed from: j */
    public final void m61j() {
        if (this.f131v) {
            m166ag();
            if (this.f132ao > 0) {
                this.f132ao--;
                return;
            }
            this.f132ao = 0;
            this.f131v = false;
        }
    }

    public void sizeChanged(int i, int i2) {
        f171c = i;
        GFX_MenuHeight = i2;
        GFX_MenuWidth = f171c;
        f174g = f171c;
        f175h = (f174g * 3) >> 2;
        f174g = Math.min(f174g, 480);
        f175h = Math.min(f175h, 336);
        f160aE = (f174g / 16) + 2;
        f161aF = (f175h / 16) + 2;
        this.f149bM = (((-f174g) * 2) * 4) / 4;
        this.f150bN = ((f174g * 2) * 4) / 4;
        this.f151bO = ((f175h * 4) * 4) / 4;
        f13i = (GFX_MenuHeight - f175h) >> 1;
        f173e = f175h + 72;
        f12f = (GFX_MenuHeight - f173e) >> 1;
        f15aI = f13i + (f175h >> 1);
        f14aH = f174g >> 1;
        this.f237ba = (f175h * 3) >> 2;
        this.f236aZ = GFX_MenuWidth >> 1;
        this.f118b = new int[f160aE][f161aF][3];
    }

    /* renamed from: k */
    public final void m56k() {
        m129b(false);
    }

    /* renamed from: b */
    public final void m129b(boolean z) {
        int height = GFX_Painter.getFont().getHeight();
        if (this.f225a[0] != null && (this.f225a[0] != this.f325c[0] || this.f121ai != 2 || z)) {
            m198a(this.f225a[0], GFX_MenuWidth >> 2, GFX_MenuHeight - height, 17, true);
            this.f325c[0] = this.f225a[0];
        }
        if (this.f225a[1] != null) {
            if (this.f225a[1] == this.f325c[1] && this.f121ai == 2 && !z) {
                return;
            }
            m198a(this.f225a[1], (GFX_MenuWidth * 3) >> 2, GFX_MenuHeight - height, 17, true);
            this.f325c[1] = this.f225a[1];
        }
    }

    /* renamed from: l */
    public final void m51l() {
        Graphics graphics;
        Image[] imageArr;
        char c;
        if ((this.Player_Lives > 0 || !f75j) && !(f145X && this.f59x == 59 && this.f60y == 9)) {
            return;
        }
        int i = 112 - (((GFX_MenuWidth >> 1) - 64) - 9);
        int i2 = (GFX_MenuWidth >> 1) + 9 + 112;
        int i3 = (660 - this.f61z) * 6;
        if (120 - i3 < 8) {
            i3 = 112;
        }
        if (this.f59x == 59 && this.f60y == 9) {
            m195a(GFX_Painter, GFX_HUDArray[15], 0, 0, 64, 16, f179a[0], i3 - i, f175h >> 1, 20, true);
            graphics = GFX_Painter;
            imageArr = GFX_HUDArray;
            c = 15;
        } else {
            m195a(GFX_Painter, GFX_HUDArray[14], 0, 0, 64, 16, f179a[0], i3 - i, f175h >> 1, 20, true);
            graphics = GFX_Painter;
            imageArr = GFX_HUDArray;
            c = 14;
        }
        m195a(graphics, imageArr[c], 0, 16, 64, 16, f179a[0], i2 - i3, f175h >> 1, 20, true);
    }

    /* renamed from: ah */
    private void m165ah() {
        byte[] bArr;
        int i;
        byte b;
        this.f107d = new byte[this.Level_Chunks.length >> 1];
        this.f108e = new byte[this.Level_Chunks.length >> 1];
        this.f109f = new byte[this.Level_Chunks.length >> 1];
        this.f110g = new byte[this.Level_Chunks.length >> 1];
        for (int i2 = 0; i2 < (this.Level_Chunks.length >> 1); i2++) {
            int i3 = this.Level_Chunks[i2 << 1] & 255;
            this.f109f[i2] = 0;
            this.f110g[i2] = 0;
            Math.abs(((byte) (i3 << 6)) >> 6);
            if ((i3 >> 5) <= 1) {
                this.f110g[i2] = 1;
            }
            if ((i3 >> 5) % 2 == 0) {
                this.f109f[i2] = 1;
            }
            this.f108e[i2] = (byte) ((i3 >> 3) & 3);
            this.f107d[i2] = 0;
            if ((i3 & 1) == 1) {
                bArr = this.f107d;
                i = i2;
                b = 1;
            } else if ((i3 & 3) == 2) {
                bArr = this.f107d;
                i = i2;
                b = 2;
            }
            bArr[i] = b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final void m47m() {
        int[] iArr = {new int[]{0, 0, 64, 64}, new int[]{0, 65, 64, 64}, new int[]{0, 129, 64, 64}, new int[]{0, 192, 36, 48}};
        if (this.Player_Rings < 50 || this.Object_Info[5] != 0) {
            return;
        }
        int i = f179a[0];
        int i2 = (this.f226j >> 1) & 3;
        int i3 = i2;
        if (i2 == 3) {
            i = f179a[4];
            i3 = 1;
        }
        m133b(47, iArr[i3][0], iArr[i3][1], iArr[i3][2], iArr[i3][3], i, this.Object_Info[2], this.Object_Info[3]);
    }

    /* renamed from: n */
    public final void m43n() {
        if (this.Player_Rings >= 50) {
            this.Object_Info[6] = this.Object_Info[2];
            this.Object_Info[7] = this.Object_Info[3];
            if (this.Object_Info[5] != 0) {
                this.Object_Info[10] = this.f226j - this.Object_Info[11];
                if (this.Object_Info[10] > 5) {
                    this.Object_Info[10] = 5;
                }
            } else if (Actor_CheckCollision(Player_RoughXPos(), Player_RoughYPos() - 12, f184b[0], f184b[1] - 12, 12, 12, this.Object_Info[2], this.Object_Info[3], this.Object_Info[6], this.Object_Info[7], 32, 32) >= 0) {
                this.Object_Info[5] = 1;
                this.Object_Info[0] = -1;
                this.Object_Info[11] = this.f226j;
                this.Player_Emeralds++;
                this.f334K = true;
            }
        }
    }

    /* renamed from: a */
    public final void m221a(int i, int i2, int i3, int i4) {
        char c;
        int i5;
        int i6;
        for (int i7 = i; i7 < i + i3; i7++) {
            if ((this.f119bu << 4) > (Camera_Pos[0] >> 4) + i7) {
                for (int i8 = i2; i8 < i2 + i4; i8++) {
                    try {
                        int i9 = (this.f126d[(((Camera_Pos[1] >> 4) + i8) >> 4) % this.f120bv][((Camera_Pos[0] >> 4) + i7) >> 4] << 9) + (((((Camera_Pos[0] >> 4) + i7) & 15) + ((((Camera_Pos[1] >> 4) + i8) & 15) << 4)) << 1) + 1;
                        int i10 = (this.Level_Chunks[i9] & 255) + (this.f107d[i9 >> 1] << 8);
                        int i11 = i10;
                        if (i10 != 0) {
                            if (this.Game_ZoneID == 2) {
                                if (i11 == 367 || i11 == 366) {
                                    i5 = (i11 + (this.f226j / 5)) & 1;
                                    i6 = 366;
                                } else if (i11 == 365 || i11 == 364) {
                                    i5 = (i11 + (this.f226j / 5)) & 1;
                                    i6 = 364;
                                } else if (i11 == 363 || i11 == 362) {
                                    i5 = (i11 + (this.f226j / 5)) & 1;
                                    i6 = 362;
                                }
                                i11 = i5 + i6;
                            }
                            char c2 = 0;
                            if (this.f108e[i9 >> 1] != 0) {
                                if (this.f108e[i9 >> 1] == 1) {
                                    c = 4;
                                } else if (this.f108e[i9 >> 1] == 2) {
                                    c = 6;
                                } else if (this.f108e[i9 >> 1] == 3) {
                                    c = 2;
                                }
                                c2 = c;
                            }
                            m195a(GFX_Painter, GFX_ZoneTiles, (i11 % 16) * 16, (i11 / 16) * 16, 16, 16, f179a[c2], (i7 * 16) - (Camera_Pos[0] & 15), (i8 * 16) - (Camera_Pos[1] & 15), 20, true);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m194a(Graphics graphics, boolean z) {
        int m71h = m71h(Camera_Pos[0] & 15);
        int m71h2 = m71h(Camera_Pos[1] & 15);
        for (int i = 0; i < f160aE; i++) {
            if ((this.f119bu << 4) > (Camera_Pos[0] >> 4) + i) {
                for (int i2 = 0; i2 < f161aF; i2++) {
                    int i3 = this.f118b[i][i2][1];
                    int i4 = this.f118b[i][i2][0];
                    if (this.f118b[i][i2][2] == 1 && i4 != 0 && !z) {
                        try {
                            graphics.drawRegion(GFX_ZoneTiles, (i4 & 15) * 16, (i4 >> 4) * 16, 16, 16, f179a[i3], (i * 16) - m71h, ((i2 * 16) - m71h2) + f13i, 20);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Level_UpdateTiles(Graphics tiledrawer, boolean dontdrawtiles) {
        int curtileID;
        int i;
        int curchunkID = 0;
        int coarsecamX = Camera_Pos[0] >> 4;
        int coarsecamY = Camera_Pos[1] >> 4;
        int i2 = coarsecamX;
        int m71h = m71h(Camera_Pos[0] & 15);
        int m71h2 = m71h(Camera_Pos[1] & 15);
        int i3 = (-16) - m71h;
        for (int i4 = 0; i4 < f160aE; i4++) {
            i3 += 16;
            int i5 = coarsecamY;
            int i6 = ((-16) - m71h2) + f13i;
            for (int i7 = 0; i7 < f161aF; i7++) {
                i6 += 16;
                try {
                    curchunkID = (this.f126d[i5 >> 4][i2 >> 4] << 9) + (((i2 & 15) + ((i5 & 15) << 4)) << 1) + 1;
                    curtileID = (this.Level_Chunks[curchunkID] & 255) + (this.f107d[curchunkID >> 1] << 8);
                } catch (Exception unused) {
                    curtileID = 0;
                }
                i5++;
                int i8 = 0;
                switch (this.f108e[curchunkID >> 1]) {
                    case 1:
                        i = 4;
                        i8 = i;
                        this.f118b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                            this.f118b[i4][i7][1] = i8;
                            this.f118b[i4][i7][2] = 0;
                            if (this.Level_BlockPriorities[curtileID] != 0) { // Check if current tile we're drawing has high priority
                                this.f118b[i4][i7][2] = 1;
                            } else if (!dontdrawtiles) {
                                if (this.Game_ZoneID == 2) { // Check if the level is Marble Zone
                                    if (curtileID >= 362 && curtileID <= 365) { // Check if the tile we're drawing is a lava tiles
                                        curtileID = (((curtileID - 362) + (this.f226j >> 3)) % 4) + 362; // Change the tile every 4 frames for animated purposes.
                                    } else if (curtileID >= 366) {
                                        curtileID = (((curtileID - 366) + (this.f226j >> 3)) % 2) + 366; // And revert our changes afterwards.
                                    }
                                }
                                try {
                                    tiledrawer.drawRegion(GFX_ZoneTiles, (curtileID & 15) << 4, (curtileID >> 4) << 4, 16, 16, f179a[i8], i3, i6, 20);
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        break;
                    case 2:
                        i = 6;
                        i8 = i;
                        this.f118b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                        }
                        break;
                    case 3:
                        i = 2;
                        i8 = i;
                        this.f118b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                        }
                        break;
                    default:
                        this.f118b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                        }
                        break;
                }
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void Score_Add(int scorevalue, boolean play1upmusic) {
        if (99950000 > this.Player_Score && this.Player_Score % 50000 > (this.Player_Score + scorevalue) % 50000) {
            this.Player_Lives++;
            if (play1upmusic) {
                this.Music_MainPlayer.Music_Play(7, 1, false);
            }
        }
        this.Player_Score += scorevalue;
        if (this.Player_Score > 99999999) {
            this.Player_Score = 99999999;
        }
    }

    /* renamed from: a */
    private void m198a(String str, int i, int i2, int i3, boolean z) {
        int height = GFX_Painter.getFont().getHeight();
        if (str.length() == 0) {
            return;
        }
        int stringWidth = GFX_Painter.getFont().stringWidth(str) + 5;
        UI_DrawBorderLines((i3 & 1) == 1 ? i - (stringWidth / 2) : i, i2, stringWidth, height);
        if (z) {
            UI_DrawOutlinedString(str, i + 1, i2, 16777215, 255, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m113c(boolean z) {
        int i;
        int i2;
        int lifecount;
        int i3;
        boolean z2;
        if (z) {
            f217z = true;
            f219B = true;
            f218A = true;
        } else {
            if (this.f292by == this.Player_Rings && this.f293bz == this.Player_Score) {
                z2 = (this.Player_Rings == 0 && (this.f226j & 1) == 0) ? true : true;
                if (this.f59x != 0 || this.f294bA != (this.f60y * 100) + this.f59x) {
                    f218A = true;
                }
                if (this.f295bB != this.Player_Lives) {
                    f219B = true;
                }
            }
            f217z = z2;
            if (this.f59x != 0) {
            }
            f218A = true;
            if (this.f295bB != this.Player_Lives) {
            }
        }
        if (this.Player_Lives > 99) {
            this.Player_Lives = 99; // Cap player lives.
        }
        this.f295bB = this.Player_Lives;
        this.f292by = this.Player_Rings;
        this.f293bz = this.Player_Score;
        if (f217z) {
            UI_DrawBorderLines(0, 0, 100, f13i);
            m195a(GFX_Painter, GFX_HUDArray[1], 0, 0, GFX_HUDArray[1].getWidth(), GFX_HUDArray[1].getHeight(), f179a[0], 4, -10, 36, true);
            if (this.Player_Rings != 0 || ((this.f226j >> 1) & 1) == 0) {
                m102d(31, -35, this.Player_Rings, 3);
            }
            m102d(31, -18, this.Player_Score, 8);
            f217z = false;
        }
        this.f294bA = (this.f60y * 100) + this.f59x;
        if (f218A) {
            UI_DrawBorderLines(GFX_MenuWidth - 48, 0, 48, f13i);
            m195a(GFX_Painter, GFX_HUDArray[11], 0, 0, GFX_HUDArray[11].getWidth(), GFX_HUDArray[11].getHeight(), f179a[0], GFX_MenuWidth - 4, -8, 40, true);
            m102d(GFX_MenuWidth - 40, -22, this.f60y, 1);
            m102d(GFX_MenuWidth - 24, -22, this.f59x, 2);
            f218A = false;
        }
        if (f219B) {
            UI_DrawBorderLines(0, f13i + f175h, 50, f13i);
            m195a(GFX_Painter, GFX_HUDArray[2], 0, 0, 22, 20, f179a[0], 5, 7 + f175h, 20, true);
            if (this.Player_Lives > 9) {
                i = 31;
                i2 = f175h + 14;
                lifecount = this.Player_Lives;
                i3 = 2;
            } else {
                i = 31;
                i2 = f175h + 14;
                lifecount = this.Player_Lives;
                i3 = 1;
            }
            m102d(i, i2, lifecount, i3);
            f219B = false;
        }
    }

    /* renamed from: d */
    private static void m102d(int i, int i2, int i3, int i4) {
        int i5 = (i + (i4 * 8)) - 7;
        m195a(GFX_Painter, GFX_HUDArray[12], 7 * (i3 % 10), 0, 7, 13, f179a[0], i5, i2, 20, true);
        for (int i6 = 1; i6 < i4; i6++) {
            int i7 = 1;
            for (int i8 = 0; i8 < i6; i8++) {
                i7 *= 10;
            }
            m195a(GFX_Painter, GFX_HUDArray[12], 7 * ((i3 / i7) % 10), 0, 7, 13, f179a[0], i5 - (i6 * 8), i2, 20, true);
        }
    }

    /* renamed from: e */
    private static boolean m96e() {
        return false;
    }

    /* renamed from: o */
    public final void m39o() {
        this.f242h = new int[this.f241bc][15];
        this.Music_MainPlayer.Music_Play(13, 1, false);
        this.f225a[0] = "";
        this.f225a[1] = "";
        this.f44bd = 0;
        this.f136bC = 30;
        this.f296T = true;
        this.f242h[0][0] = 1;
        this.f242h[0][1] = 10;
        this.f242h[0][2] = 240;
        this.f242h[0][3] = 28;
        this.f242h[0][8] = 1 - f183a[this.f242h[0][1]][2];
        this.f242h[0][9] = 0;
        this.f242h[1][0] = 1;
        this.f242h[1][1] = 4 + this.f278am;
        this.f242h[1][2] = 240;
        this.f242h[1][3] = 60;
        this.f242h[1][8] = 25 - f183a[this.f242h[0][1]][2];
        this.f242h[1][9] = 3;
        this.f242h[2][0] = 1;
        this.f242h[2][1] = 8;
        this.f242h[2][2] = 240;
        this.f242h[2][3] = 70;
        this.f242h[2][8] = (-1) - f183a[this.f242h[0][1]][2];
        this.f242h[2][9] = 2;
        this.f242h[3][0] = 1;
        this.f242h[3][1] = 14;
        this.f242h[3][2] = 0 - f183a[this.f242h[3][1]][2];
        this.f242h[3][3] = 30;
        this.f242h[3][8] = -f183a[this.f242h[3][1]][2];
        this.f242h[3][9] = 0;
        this.f43m = (GFX_MenuWidth + f183a[this.f242h[3][1]][2]) >> 1;
        this.f242h[4][0] = 1;
        this.f242h[4][1] = 15;
        this.f242h[4][2] = 0 - f183a[this.f242h[4][1]][2];
        this.f242h[4][3] = 50;
        this.f242h[4][8] = ((-f183a[this.f242h[3][1]][2]) / 2) - (f183a[this.f242h[4][1]][2] / 2);
        this.f242h[4][9] = 1;
        for (int i = 0; i < this.f242h.length; i++) {
            if (this.f242h[i][0] == 1) {
                this.f242h[i][4] = f183a[this.f242h[i][1]][0];
                this.f242h[i][5] = f183a[this.f242h[i][1]][1];
                this.f242h[i][6] = f183a[this.f242h[i][1]][2];
                this.f242h[i][7] = f183a[this.f242h[i][1]][3];
            }
        }
    }

    /* renamed from: p */
    public final void m35p() {
        int[] iArr;
        char c;
        int i;
        try {
            this.f121ai = 4;
            this.f286t = false;
            this.f287u = false;
            this.f262p = false;
            this.f310Z = true;
            this.f311aa = true;
            this.f285bw = 0;
            this.f244bf = 2100;
            this.f334K = false;
            this.f242h = new int[this.f241bc][15];
            this.f227k = 0;
            this.f226j = 0;
            this.Player_InvincTime = 0;
            this.Player_InvulnTime = 0;
            this.f309bL = 0;
            this.f308bK = 0;
            this.f131v = true;
            this.f132ao = 10;
            this.f142c = (byte) 0;
            this.f298C = false;
            if (this.f327J) {
                GFX_LoadGame();
            }
            this.f44bd = 0;
            this.f242h[0][0] = 1;
            this.f242h[0][1] = 10;
            this.f242h[0][2] = 240;
            this.f242h[0][3] = 42;
            this.f242h[0][8] = 1 - f183a[this.f242h[0][1]][2];
            this.f242h[0][9] = 0;
            this.f242h[1][0] = 1;
            this.f242h[1][1] = 4 + this.f278am;
            this.f242h[1][2] = 240;
            this.f242h[1][3] = 68;
            this.f242h[1][8] = 25 - f183a[this.f242h[0][1]][2];
            this.f242h[1][9] = 3;
            this.f242h[2][0] = 1;
            this.f242h[2][1] = 8;
            this.f242h[2][2] = 240;
            this.f242h[2][3] = 76;
            this.f242h[2][8] = (-1) - f183a[this.f242h[0][1]][2];
            this.f242h[2][9] = 2;
            this.f242h[3][0] = 1;
            this.f242h[3][1] = f211x[this.f277al];
            this.f242h[3][2] = 0 - f183a[this.f242h[3][1]][2];
            this.f242h[3][3] = 44;
            this.f242h[3][8] = -f183a[this.f242h[3][1]][2];
            this.f242h[3][9] = 0;
            this.f43m = (GFX_MenuWidth >> 1) + (f183a[this.f242h[3][1]][2] / 2);
            if (this.f277al == 6) {
                this.f242h[4][0] = 1;
                this.f242h[4][1] = 3;
                this.f242h[4][2] = 0 - f183a[this.f242h[4][1]][2];
                this.f242h[4][3] = 60;
                iArr = this.f242h[4];
                c = '\b';
                i = -48;
            } else {
                this.f242h[4][0] = 1;
                this.f242h[4][1] = 3;
                this.f242h[4][2] = 0 - f183a[this.f242h[4][1]][2];
                this.f242h[4][3] = 60;
                iArr = this.f242h[4];
                c = '\b';
                i = -65;
            }
            iArr[c] = i;
            this.f242h[4][9] = 1;
            for (int i2 = 0; i2 < this.f242h.length; i2++) {
                if (this.f242h[i2][0] == 1) {
                    this.f242h[i2][4] = f183a[this.f242h[i2][1]][0];
                    this.f242h[i2][5] = f183a[this.f242h[i2][1]][1];
                    this.f242h[i2][6] = f183a[this.f242h[i2][1]][2];
                    this.f242h[i2][7] = f183a[this.f242h[i2][1]][3];
                }
            }
            m90e(true);
        } catch (Exception unused) {
        }
        m79g();
    }

    /* renamed from: i */
    private static void m63i(int i, int i2, int i3) {
        int i4 = i3 % 10;
        int i5 = 1;
        while (true) {
            int i6 = 1;
            for (int i7 = 0; i7 < i5; i7++) {
                i6 *= 10;
            }
            if (i3 / i6 == 0) {
                break;
            }
            i5++;
        }
        int i8 = i5;
        m195a(GFX_Painter, GFX_HUDArray[13], 8 * i4, 48, 8, 16, f179a[0], i - 8, i2, 20, true);
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = 1;
            for (int i11 = 0; i11 < i9; i11++) {
                i10 *= 10;
            }
            m195a(GFX_Painter, GFX_HUDArray[13], 8 * ((i3 / i10) % 10), 48, 8, 16, f179a[0], i - ((i9 + 1) * 8), i2, 20, true);
        }
    }

    /* renamed from: ai */
    private void m164ai() {
        m161al();
        m151av();
    }

    /* renamed from: aj */
    private void m163aj() {
        this.Player_Rings = 0;
        this.f59x = 0;
        this.f60y = 0;
        this.f61z = 0;
        this.Player_ShieldFlag = 0;
        this.Player_SpeedShoeTime = 0;
        this.Player_InvincTime = 0;
        this.Player_InvulnTime = 0;
        this.f246bh = 0;
        this.f245bg = 0;
        for (int i = 0; i < this.f266k.length; i++) {
            this.f266k[i][0] = 0;
        }
        f67c = false;
        f68d = false;
        f82S = false;
        f69Q = false;
        f70e = false;
        f71f = false;
        f72g = false;
        f74i = false;
        f75j = false;
        f144W = false;
        f145X = false;
        f76k = false;
        f77R = false;
        f78l = false;
        f79m = false;
        f81o = false;
        f80n = false;
        this.f314aw = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f269e[i2] = false;
            this.f261b[i2] = false;
        }
        this.f112af = 0;
        this.f255F = 0;
        for (int i3 = 0; i3 < this.f264e.length; i3++) {
            this.f264e[i3][24] = 0;
        }
    }

    /* renamed from: ak */
    private void m162ak() {
        m97e();
        m163aj();
        if (this.Game_ZoneID == 4 && this.Game_ActID == 2) {
            m116c(150, 11424, 1394, 0, 0);
        }
        for (int i = 0; i < Player_Info.length; i++) {
            Player_Info[i] = 0;
        }
        f51p = 0;
        this.f253F[0] = 0;
        this.f253F[1] = 0;
        f214y[0] = 0;
        f214y[1] = 0;
        if (this.Game_ZoneID != 5 || this.Game_ActID != 3) {
            Player_Info[0] = f186b[this.Game_ZoneID][(this.Game_ActID * 2) + 0] << 8;
            Player_Info[1] = (f186b[this.Game_ZoneID][(this.Game_ActID * 2) + 1] << 8) + 5120;
        }
        if (this.f63B != 0 || this.f64C != 0) {
            Player_Info[0] = this.f63B << 8;
            Player_Info[1] = this.f64C << 8;
            this.f59x = this.f65D;
            this.f60y = this.f66E;
        }
        m23t();
        m259G();
        Player_Info[8] = -1;
        this.f121ai = 2;
        this.f267q = true;
        m9z();
        this.f131v = true;
        this.f132ao = 10;
    }

    /* renamed from: al */
    private void m161al() {
        GFX_ZoneTiles = null;
        Background_Renderer.BG_Clear();
        GFX_UnloadArray(GFX_GameArray);
        this.f286t = false;
        this.f310Z = true;
        this.f311aa = true;
        if (this.Game_ZoneID != 1) {
            this.f270ah = 16777215;
        }
        f214y[0] = 0;
        f214y[1] = 0;
        Level_LoadData();
        m165ah();
        m251K();
        Background_Renderer.BG_Initialize(this.Game_ZoneID, this.Game_ActID);
        GFX_LoadGame();
        m79g();
    }

    /* renamed from: a */
    public static DataInputStream Level_DataReader(String str) {
        return new DataInputStream(SetCurrentResource(str));
    }

    /* renamed from: a */
    public static InputStream SetCurrentResource(String path) {
        if (CurrentResource != null) {
            try {
                CurrentResource.close();
            } catch (Exception unused) {
            }
            CurrentResource = null;
        }
        InputStream resourceAsStream = new Object().getClass().getResourceAsStream(path);
        CurrentResource = resourceAsStream;
        return resourceAsStream;
    }

    /* renamed from: a */
    public static byte[] m202a(String str) {
        try {
            byte[] bArr = new byte[512];
            InputStream SetCurrentResource = SetCurrentResource(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = SetCurrentResource.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.close();
                    SetCurrentResource.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void CloseCurrentResource() {
        try {
            CurrentResource.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int[][][] m208a(DataInputStream dataInputStream) {
        int[][] iArr = new int[0];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = m209a(dataInputStream);
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int[][] m209a(DataInputStream dataInputStream) {
        int[] iArr = new int[0];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = m210a(dataInputStream);
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    /* renamed from: a */
    public static int[] m210a(DataInputStream dataInputStream) {
        int[] iArr = new int[0];
        try {
            int readInt = dataInputStream.readInt();
            iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = dataInputStream.readInt();
            }
        } catch (Exception unused) {
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da A[Catch: Exception -> 0x0257, TryCatch #0 {Exception -> 0x0257, blocks: (B:2:0x0000, B:3:0x0032, B:7:0x0063, B:8:0x006a, B:9:0x0098, B:12:0x00a4, B:14:0x00ad, B:15:0x00ca, B:16:0x00d0, B:18:0x01da, B:19:0x01ea, B:21:0x01f0, B:22:0x01ff), top: B:26:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f0 A[Catch: Exception -> 0x0257, TryCatch #0 {Exception -> 0x0257, blocks: (B:2:0x0000, B:3:0x0032, B:7:0x0063, B:8:0x006a, B:9:0x0098, B:12:0x00a4, B:14:0x00ad, B:15:0x00ca, B:16:0x00d0, B:18:0x01da, B:19:0x01ea, B:21:0x01f0, B:22:0x01ff), top: B:26:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v45, types: [byte[], byte[][]] */
    /* renamed from: am */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Level_LoadData() {
        int i;
        String str;
        try {
            this.Level_Collisions = null;
            this.Level_BlockPriorities = null;
            this.Level_Chunks = null;
            this.Level_ActorLayout = null;
            this.f284k = null;
            this.f263c = null;
            this.f282j = null;
            System.gc();
            int[][][] iArr = null;
            switch (this.Game_ZoneID) {
                case 0:
                    str = "/mc_gh_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    CloseCurrentResource();
                    this.f119bu = iArr[this.Game_ActID][0].length;
                    this.f120bv = iArr[this.Game_ActID].length;
                    this.f126d = new byte[this.f120bv][this.f119bu];
                    for (i = 0; i < this.f120bv; i++) {
                        for (int i2 = 0; i2 < this.f119bu; i2++) {
                            this.f126d[i][i2] = (byte) iArr[this.Game_ActID][i][i2];
                        }
                    }
                    System.gc();
                    this.Level_Collisions = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_BlockPriorities = m202a(new StringBuffer().append("/MapLzone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_Chunks = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".bmd").toString());
                    DataInputStream Level_DataReader = Level_DataReader(new StringBuffer().append("/ZONE").append(this.Game_ZoneID + 1).append("ACT.act").toString());
                    this.Level_ActorLayout = new byte[4];
                    this.Level_ActorLayout[0] = new byte[Level_DataReader.readShort()];
                    this.Level_ActorLayout[1] = new byte[Level_DataReader.readShort()];
                    this.Level_ActorLayout[2] = new byte[Level_DataReader.readShort()];
                    this.Level_ActorLayout[3] = new byte[Level_DataReader.readShort()];
                    Level_DataReader.read(this.Level_ActorLayout[0]);
                    Level_DataReader.read(this.Level_ActorLayout[1]);
                    Level_DataReader.read(this.Level_ActorLayout[2]);
                    Level_DataReader.read(this.Level_ActorLayout[3]);
                    Level_DataReader.close();
                    CloseCurrentResource();
                    if (this.f111j == null) {
                        this.f111j = m209a(Level_DataReader("/mc_obj_size_table.bin"));
                        CloseCurrentResource();
                    }
                    if (f117a == null) {
                        f117a = m208a(Level_DataReader("/framedata.bin"));
                        CloseCurrentResource();
                    }
                    this.f284k = new byte[512];
                    SetCurrentResource("/scddirtbl.blt").read(this.f284k);
                    CloseCurrentResource();
                    this.f263c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f263c);
                    CloseCurrentResource();
                    this.f282j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f282j);
                    CloseCurrentResource();
                    System.gc();
                    return;
                case 1:
                case 3:
                default:
                    CloseCurrentResource();
                    this.f119bu = iArr[this.Game_ActID][0].length;
                    this.f120bv = iArr[this.Game_ActID].length;
                    this.f126d = new byte[this.f120bv][this.f119bu];
                    while (i < this.f120bv) {
                    }
                    System.gc();
                    this.Level_Collisions = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_BlockPriorities = m202a(new StringBuffer().append("/MapLzone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_Chunks = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".bmd").toString());
                    DataInputStream Level_DataReader2 = Level_DataReader(new StringBuffer().append("/ZONE").append(this.Game_ZoneID + 1).append("ACT.act").toString());
                    this.Level_ActorLayout = new byte[4];
                    this.Level_ActorLayout[0] = new byte[Level_DataReader2.readShort()];
                    this.Level_ActorLayout[1] = new byte[Level_DataReader2.readShort()];
                    this.Level_ActorLayout[2] = new byte[Level_DataReader2.readShort()];
                    this.Level_ActorLayout[3] = new byte[Level_DataReader2.readShort()];
                    Level_DataReader2.read(this.Level_ActorLayout[0]);
                    Level_DataReader2.read(this.Level_ActorLayout[1]);
                    Level_DataReader2.read(this.Level_ActorLayout[2]);
                    Level_DataReader2.read(this.Level_ActorLayout[3]);
                    Level_DataReader2.close();
                    CloseCurrentResource();
                    if (this.f111j == null) {
                    }
                    if (f117a == null) {
                    }
                    this.f284k = new byte[512];
                    SetCurrentResource("/scddirtbl.blt").read(this.f284k);
                    CloseCurrentResource();
                    this.f263c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f263c);
                    CloseCurrentResource();
                    this.f282j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f282j);
                    CloseCurrentResource();
                    System.gc();
                    return;
                case 2:
                    str = "/mc_ma_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    CloseCurrentResource();
                    this.f119bu = iArr[this.Game_ActID][0].length;
                    this.f120bv = iArr[this.Game_ActID].length;
                    this.f126d = new byte[this.f120bv][this.f119bu];
                    while (i < this.f120bv) {
                    }
                    System.gc();
                    this.Level_Collisions = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_BlockPriorities = m202a(new StringBuffer().append("/MapLzone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_Chunks = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".bmd").toString());
                    DataInputStream Level_DataReader22 = Level_DataReader(new StringBuffer().append("/ZONE").append(this.Game_ZoneID + 1).append("ACT.act").toString());
                    this.Level_ActorLayout = new byte[4];
                    this.Level_ActorLayout[0] = new byte[Level_DataReader22.readShort()];
                    this.Level_ActorLayout[1] = new byte[Level_DataReader22.readShort()];
                    this.Level_ActorLayout[2] = new byte[Level_DataReader22.readShort()];
                    this.Level_ActorLayout[3] = new byte[Level_DataReader22.readShort()];
                    Level_DataReader22.read(this.Level_ActorLayout[0]);
                    Level_DataReader22.read(this.Level_ActorLayout[1]);
                    Level_DataReader22.read(this.Level_ActorLayout[2]);
                    Level_DataReader22.read(this.Level_ActorLayout[3]);
                    Level_DataReader22.close();
                    CloseCurrentResource();
                    if (this.f111j == null) {
                    }
                    if (f117a == null) {
                    }
                    this.f284k = new byte[512];
                    SetCurrentResource("/scddirtbl.blt").read(this.f284k);
                    CloseCurrentResource();
                    this.f263c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f263c);
                    CloseCurrentResource();
                    this.f282j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f282j);
                    CloseCurrentResource();
                    System.gc();
                    return;
                case 4:
                    str = "/mc_sy_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    CloseCurrentResource();
                    this.f119bu = iArr[this.Game_ActID][0].length;
                    this.f120bv = iArr[this.Game_ActID].length;
                    this.f126d = new byte[this.f120bv][this.f119bu];
                    while (i < this.f120bv) {
                    }
                    System.gc();
                    this.Level_Collisions = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_BlockPriorities = m202a(new StringBuffer().append("/MapLzone").append(this.Game_ZoneID + 1).append(".blt").toString());
                    this.Level_Chunks = m202a(new StringBuffer().append("/zone").append(this.Game_ZoneID + 1).append(".bmd").toString());
                    DataInputStream Level_DataReader222 = Level_DataReader(new StringBuffer().append("/ZONE").append(this.Game_ZoneID + 1).append("ACT.act").toString());
                    this.Level_ActorLayout = new byte[4];
                    this.Level_ActorLayout[0] = new byte[Level_DataReader222.readShort()];
                    this.Level_ActorLayout[1] = new byte[Level_DataReader222.readShort()];
                    this.Level_ActorLayout[2] = new byte[Level_DataReader222.readShort()];
                    this.Level_ActorLayout[3] = new byte[Level_DataReader222.readShort()];
                    Level_DataReader222.read(this.Level_ActorLayout[0]);
                    Level_DataReader222.read(this.Level_ActorLayout[1]);
                    Level_DataReader222.read(this.Level_ActorLayout[2]);
                    Level_DataReader222.read(this.Level_ActorLayout[3]);
                    Level_DataReader222.close();
                    CloseCurrentResource();
                    if (this.f111j == null) {
                    }
                    if (f117a == null) {
                    }
                    this.f284k = new byte[512];
                    SetCurrentResource("/scddirtbl.blt").read(this.f284k);
                    CloseCurrentResource();
                    this.f263c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f263c);
                    CloseCurrentResource();
                    this.f282j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f282j);
                    CloseCurrentResource();
                    System.gc();
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void GFX_LoadZoneTiles(int zoneID, int actID) {
        GFX_ZoneTiles = null;
        GFX_ZoneTiles = GFX_Load((zoneID == 1 && actID == 3) ? "/z_zone_marble.png" : new StringBuffer().append("/zone").append(zoneID + 1).append(".png").toString());
    }

    /* renamed from: r */
    public final void m29r() {
        if (this.f121ai != 2 || this.f296T || this.f44bd >= 30) {
            if (this.f316G && this.Cheats_Active[4] && this.f319H) {
                if (this.Input_Array[2]) {
                    int[] iArr = Player_Info;
                    iArr[1] = iArr[1] - 2048;
                } else if (this.Input_Array[1]) {
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] + 2048;
                } else if (this.Input_Array[3]) {
                    int[] iArr3 = Player_Info;
                    iArr3[0] = iArr3[0] - 2048;
                } else if (this.Input_Array[4]) {
                    int[] iArr4 = Player_Info;
                    iArr4[0] = iArr4[0] + 2048;
                }
            } else if (f78l || f79m) {
                int[] iArr5 = Player_Info;
                iArr5[11] = iArr5[11] + this.Player_TopSpeed;
            } else if (f75j) {
                int[] iArr6 = Player_Info;
                iArr6[1] = iArr6[1] + Player_Info[5];
                int[] iArr7 = Player_Info;
                iArr7[5] = iArr7[5] + this.f250bj;
            } else if (this.f334K) {
            } else {
                if (m42n()) {
                    if (m22t()) {
                        m157ap();
                    }
                } else if (m25s()) {
                    m158ao();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m123c(int i) {
        return Math.abs(Math_Random.nextInt()) % i;
    }

    /* renamed from: d */
    private boolean m104d(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            this.f139bH++;
            int i3 = (this.f126d[((i2 >> 4) >> 4) % this.f120bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f109f[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f108e[i3 >> 1] == 1) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 2) {
                if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 3) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            Player_Info[8] = (this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m226a(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            int i3 = (this.f126d[((i2 >> 4) >> 4) % this.f120bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f110g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f108e[i3 >> 1] == 1) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 2) {
                if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 3) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            Player_Info[8] = (this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return true;
        }
    }

    /* renamed from: e */
    private boolean m93e(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return this.f109f[(((this.f126d[((i2 >> 4) >> 4) % this.f120bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1)) + 1) >> 1] != 1;
    }

    /* renamed from: b */
    public final boolean m139b(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            int i3 = (this.f126d[((i2 >> 4) >> 4) % this.f120bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f109f[i3 >> 1] == 1 && this.f110g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f108e[i3 >> 1] == 1) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 2) {
                if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f108e[i3 >> 1] == 3) {
                if (0 == ((this.f282j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f282j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            this.f140aq = (this.Level_Chunks[i3] & 255) + (this.f107d[i3 >> 1] << 8);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    private int m84f(int i) {
        return this.f284k[this.Level_Collisions[i] & 255] & 255;
    }

    /* renamed from: f */
    private boolean m85f() {
        if (m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] - 256;
                if (!m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m78g() {
        if (m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] + 256;
                if (!m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m72h() {
        if (m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] - 256;
                if (!m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m66i() {
        if (m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] + 256;
                if (!m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m60j() {
        int Player_RoughXPos;
        int Player_RoughYPos;
        if (f51p <= 22 || f51p >= 338) {
            Player_RoughXPos = Player_RoughXPos() + 12;
            Player_RoughYPos = Player_RoughYPos() - 12;
        } else if (this.Game_ZoneID != 1 || f51p != 316) {
            return false;
        } else {
            Player_RoughXPos = Player_RoughXPos() + 12;
            Player_RoughYPos = Player_RoughYPos() - 36;
        }
        if (((this.Game_ZoneID == 4 || this.Game_ZoneID == 3) && f51p != 0) || !m226a(Player_RoughXPos, Player_RoughYPos)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = Player_Info;
            iArr[0] = iArr[0] - 256;
            Player_RoughXPos--;
            if (!m104d(Player_RoughXPos, Player_RoughYPos)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m55k() {
        if (f51p <= 22 || f51p >= 338) {
            if ((this.Game_ZoneID == 4 || this.Game_ZoneID == 3) && f51p != 0) {
                return false;
            }
            if (this.Game_ZoneID == 2 && f51p == 22) {
                return false;
            }
            int Player_RoughXPos = Player_RoughXPos() - 12;
            int Player_RoughYPos = Player_RoughYPos() - 12;
            if (m226a(Player_RoughXPos, Player_RoughYPos)) {
                for (int i = 0; i < 14; i++) {
                    int[] iArr = Player_Info;
                    iArr[0] = iArr[0] + 256;
                    Player_RoughXPos++;
                    if (!m104d(Player_RoughXPos, Player_RoughYPos)) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m50l() {
        if (m226a(Player_RoughXPos(), Player_RoughYPos() - 32)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[1] = iArr[1] + 256;
                if (!m226a(Player_RoughXPos(), Player_RoughYPos() - 32)) {
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - 256;
                    return true;
                }
            }
            return true;
        } else if (m226a(Player_RoughXPos(), Player_RoughYPos() - 16)) {
            for (int i2 = 0; i2 < 14; i2++) {
                int[] iArr3 = Player_Info;
                iArr3[1] = iArr3[1] + 256;
                if (!m226a(Player_RoughXPos(), Player_RoughYPos() - 16)) {
                    int[] iArr4 = Player_Info;
                    iArr4[1] = iArr4[1] - 256;
                    return true;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m141b(int i) {
        if (m104d(Player_RoughXPos(), Player_RoughYPos())) {
            int i2 = f51p;
            if (i == -1) {
                return false;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            for (int i3 = 0; i3 < 16; i3++) {
                if (!f72g) {
                    int[] iArr = Player_Info;
                    iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                }
                int[] iArr2 = Player_Info;
                iArr2[1] = iArr2[1] - ((Math_CalcCosine(i2 + 180) * 256) / 100);
                if (!m104d(Player_RoughXPos(), Player_RoughYPos())) {
                    if (!f72g) {
                        int[] iArr3 = Player_Info;
                        iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr4 = Player_Info;
                    iArr4[1] = iArr4[1] + ((Math_CalcCosine(i2 + 180) << 8) / 100);
                    f51p = m228a(Player_RoughXPos(), Player_RoughYPos());
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m26s() {
        if (!f72g && f74i) {
            f74i = false;
        }
        this.f243be = 2;
    }

    /* renamed from: an */
    private void m159an() {
        if (this.Game_ZoneID != 1 || this.f270ah >= Player_RoughYPos() - 12) {
            this.f244bf = 2100;
        }
    }

    /* renamed from: m */
    private static boolean m46m() {
        return 37 == Player_Info[8] || 38 == Player_Info[8] || 39 == Player_Info[8] || 41 == Player_Info[8] || 42 == Player_Info[8] || 47 == Player_Info[8] || 48 == Player_Info[8] || 49 == Player_Info[8] || 52 == Player_Info[8] || 59 == Player_Info[8] || 62 == Player_Info[8] || 69 == Player_Info[8] || 71 == Player_Info[8] || 72 == Player_Info[8] || 78 == Player_Info[8] || 79 == Player_Info[8] || 87 == Player_Info[8] || 88 == Player_Info[8] || 89 == Player_Info[8];
    }

    /* renamed from: c */
    private boolean m121c(int i) {
        int[] iArr;
        char c;
        int Math_CalcSine;
        if (0 == i) {
            if (f72g) {
                return true;
            }
            if (this.f298C) {
                return false;
            }
            if (this.Game_ZoneID == 0 && (this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8] == 31 || this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8] == 32)) {
                this.Input_Array[2] = false;
                return false;
            } else if (this.Input_Array[2]) {
                if (this.Game_ZoneID == 5 && this.Game_ActID != 2 && m46m()) {
                    return false;
                }
                if (this.f115s) {
                    f72g = true;
                    f68d = false;
                    f73h = false;
                    this.f115s = false;
                    f74i = true;
                    Player_Info[3] = ((Math_CalcSine(0) * this.Player_JumpForce) / 100) + Player_Info[10];
                    Player_Info[5] = (Math_CalcCosine(0) * this.Player_JumpForce) / 100;
                    return true;
                }
                f72g = true;
                f68d = false;
                f73h = false;
                this.f115s = false;
                f74i = true;
                int i2 = f51p;
                int Player_RoughXPos = (this.f126d[((Player_RoughYPos() / 16) / 16) % this.f120bv][(Player_RoughXPos() / 16) / 16] * 512) + ((((Player_RoughXPos() / 16) % 16) + (((Player_RoughYPos() / 16) % 16) * 16)) * 2) + 1;
                int i3 = 0;
                byte abs = (byte) Math.abs(((byte) ((this.Level_Chunks[Player_RoughXPos - 1] & 255) << 6)) >> 6);
                if (abs % 4 != 0) {
                    i3 = 256 * (abs % 4);
                }
                byte m84f = (byte) m84f((this.Level_Chunks[Player_RoughXPos] & 255) + i3);
                if (f51p == 270) {
                    this.f48bn = 5;
                    Player_Info[3] = -this.Player_JumpForce;
                    iArr = Player_Info;
                    c = 5;
                    Math_CalcSine = -Math.abs(this.Player_JumpForce);
                } else if (f51p == 90) {
                    this.f48bn = 5;
                    Player_Info[3] = this.Player_JumpForce;
                    iArr = Player_Info;
                    c = 5;
                    Math_CalcSine = -Math.abs(this.Player_JumpForce);
                } else if (m84f == 0 || f51p > 290 || f51p < 70) {
                    Player_Info[3] = ((Math_CalcSine(i2) * this.Player_JumpForce) / 100) + Player_Info[10];
                    Player_Info[5] = (Math_CalcCosine(i2) * this.Player_JumpForce) / 100;
                    if (Player_Info[5] > 0) {
                        this.f303bJ = 1;
                    }
                    if (Math.abs(Player_Info[10]) <= 2560 || this.Game_ZoneID != 4 || this.Game_ActID != 1 || Player_Info[0] <= 9216) {
                        return true;
                    }
                    int[] iArr2 = Player_Info;
                    iArr2[5] = iArr2[5] - 768;
                    iArr = Player_Info;
                    c = 3;
                    Math_CalcSine = ((Math_CalcSine(i2) * this.Player_JumpForce) / 100) + 2560;
                } else {
                    Player_Info[3] = (Math_CalcSine(i2) * this.Player_JumpForce) / 100;
                    iArr = Player_Info;
                    c = 5;
                    Math_CalcSine = (Math_CalcCosine(i2) * this.Player_JumpForce) / 100;
                }
                iArr[c] = Math_CalcSine;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m42n() {
        if (this.f245bg > -1) {
            this.f245bg--;
        }
        if (this.f246bh > -1) {
            this.f246bh--;
        }
        if (f74i) {
            return true;
        }
        if (f72g || this.f298C) {
            return false;
        }
        if (!this.Input_Array[1]) {
            if (!this.Input_Array[0] || Math.abs(Player_Info[10]) > this.Player_Deceleration || this.Input_Array[3] || this.Input_Array[4]) {
                return false;
            }
            f77R = true;
            this.f246bh += 2;
            if (this.f246bh > 24) {
                this.f246bh = 24;
                return false;
            }
            return false;
        } else if (Math.abs(Player_Info[10]) > this.Player_Deceleration) {
            f74i = true;
            return true;
        } else if (this.Input_Array[3] || this.Input_Array[4]) {
            return false;
        } else {
            f76k = true;
            this.f245bg += 2;
            if (this.f245bg > 32) {
                this.f245bg = 32;
                return false;
            }
            return false;
        }
    }

    /* renamed from: o */
    private boolean m38o() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        this.f45O = false;
        this.f46P = false;
        int i3 = f51p;
        int i4 = 32;
        int i5 = 256;
        if (f51p != 22 && f51p != 338) {
            i4 = 256;
        }
        if (f51p >= 270 && f51p < 300) {
            i5 = 32;
        }
        if (f51p >= 60 && f51p < 90) {
            i5 = 32;
        }
        byte b = this.f126d[Player_RoughYPos() >> 8][Player_RoughXPos() >> 8];
        if (this.Game_ZoneID == 0 && (b == 31 || b == 32)) {
            i5 = 256;
        }
        int i6 = f51p;
        if (m34p()) {
            this.f115s = false;
            if (this.Game_ZoneID == 4) {
                if ((i6 == 79 && f51p == 90) || (i6 == 281 && f51p == 270)) {
                    if (f51p == 90) {
                        iArr2 = Player_Info;
                        c2 = '\n';
                        i2 = 640;
                    } else {
                        iArr2 = Player_Info;
                        c2 = '\n';
                        i2 = -640;
                    }
                    iArr2[c2] = i2;
                    f51p = i6;
                    this.f312av = 0;
                    this.f303bJ = 3;
                    return false;
                }
                return true;
            }
            return true;
        }
        for (int i7 = 0; i7 < 14; i7++) {
            int[] iArr3 = Player_Info;
            iArr3[0] = iArr3[0] + ((Math_CalcSine(i3 + 180) * i4) / 100);
            int[] iArr4 = Player_Info;
            iArr4[1] = iArr4[1] + ((Math_CalcCosine(i3 + 180) * i5) / 100);
            if (m34p()) {
                this.f115s = false;
                if (this.Game_ZoneID == 4) {
                    if ((i6 == 79 && f51p == 90) || (i6 == 281 && f51p == 270)) {
                        if (f51p == 90) {
                            iArr = Player_Info;
                            c = '\n';
                            i = 640;
                        } else {
                            iArr = Player_Info;
                            c = '\n';
                            i = -640;
                        }
                        iArr[c] = i;
                        f51p = i6;
                        this.f312av = 0;
                        this.f303bJ = 3;
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private boolean m34p() {
        if (Player_RoughYPos() < 0) {
            return false;
        }
        byte b = this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8];
        if (this.Game_ZoneID != 5 || this.Game_ActID == 2) {
            if (this.Game_ZoneID != 0) {
                if (this.Game_ZoneID == 3) {
                    return false;
                }
                if (this.f253F[0] >= 0) {
                    this.f45O = m31q();
                    if (!this.f45O) {
                        this.f46P = m28r();
                    }
                }
                if (this.f253F[0] < 0) {
                    this.f46P = m28r();
                    if (!this.f46P) {
                        this.f45O = m31q();
                    }
                }
                return this.f45O || this.f46P;
            } else if (b == 31 || b == 32) {
                return m141b(0);
            } else {
                if (this.f253F[0] >= 0) {
                    this.f45O = m31q();
                    if (!this.f45O) {
                        this.f46P = m28r();
                    }
                }
                if (this.f253F[0] < 0) {
                    this.f46P = m28r();
                    if (!this.f46P) {
                        this.f45O = m31q();
                    }
                }
                return this.f45O || this.f46P;
            }
        }
        return false;
    }

    /* renamed from: q */
    private boolean m31q() {
        try {
            int i = f51p;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f301bI;
            int Player_RoughXPos = Player_RoughXPos() + ((Math_CalcSine(i2 + 90) * i3) / 100);
            int Player_RoughYPos = Player_RoughYPos() + ((Math_CalcCosine(i2 + 90) * i3) / 100);
            if (m104d(Player_RoughXPos, Player_RoughYPos)) {
                m228a(Player_RoughXPos, Player_RoughYPos);
                for (int i4 = 0; i4 < 16; i4++) {
                    int m228a = m228a(Player_RoughXPos, Player_RoughYPos);
                    if (!f72g) {
                        int[] iArr = Player_Info;
                        iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - ((Math_CalcCosine(i2 + 180) << 8) / 100);
                    Player_RoughXPos = Player_RoughXPos() + ((Math_CalcSine(i2 + 90) * i3) / 100);
                    Player_RoughYPos = Player_RoughYPos() + ((Math_CalcCosine(i2 + 90) * i3) / 100);
                    if (!m104d(Player_RoughXPos, Player_RoughYPos)) {
                        if (!f72g) {
                            int[] iArr3 = Player_Info;
                            iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = Player_Info;
                        iArr4[1] = iArr4[1] + ((Math_CalcCosine(i2 + 180) << 8) / 100);
                        if (this.Game_ZoneID == 3 && m228a == 350) {
                            m228a = 0;
                        }
                        f51p = m228a;
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m28r() {
        try {
            int i = f51p;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f301bI;
            int Player_RoughXPos = Player_RoughXPos() + ((Math_CalcSine(i2 + 270) * i3) / 100);
            int Player_RoughYPos = Player_RoughYPos() + ((Math_CalcCosine(i2 + 270) * i3) / 100);
            if (m104d(Player_RoughXPos, Player_RoughYPos)) {
                m228a(Player_RoughXPos, Player_RoughYPos);
                for (int i4 = 0; i4 < 16; i4++) {
                    int m228a = m228a(Player_RoughXPos, Player_RoughYPos);
                    if (!f72g) {
                        int[] iArr = Player_Info;
                        iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - ((Math_CalcCosine(i2 + 180) << 8) / 100);
                    Player_RoughXPos = Player_RoughXPos() + ((Math_CalcSine(i2 + 270) * i3) / 100);
                    Player_RoughYPos = Player_RoughYPos() + ((Math_CalcCosine(i2 + 270) * i3) / 100);
                    if (!m104d(Player_RoughXPos, Player_RoughYPos)) {
                        if (!f72g) {
                            int[] iArr3 = Player_Info;
                            iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = Player_Info;
                        iArr4[1] = iArr4[1] + ((Math_CalcCosine(i2 + 180) << 8) / 100);
                        f51p = m228a;
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x029b, code lost:
        if (r6.Input_Array[3] != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ec, code lost:
        if (r6.Input_Array[3] != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ef, code lost:
        m26s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (p000.Game.Player_Info[10] > 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (p000.Game.Player_Info[10] < 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
        p000.Game.Player_Info[10] = 0;
        p000.Game.Player_Info[13] = 0;
        p000.Game.Player_Info[14] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
        if (r6.Input_Array[3] != false) goto L72;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m25s() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        this.f253F[0] = 0;
        this.f253F[1] = 0;
        if (m121c(0)) {
            return true;
        }
        int abs = Math.abs(Player_Info[10]);
        m70h(0);
        m155ar();
        if (abs <= this.Player_TopSpeed && Math.abs(Player_Info[10]) > this.Player_TopSpeed && abs <= this.Player_TopSpeed) {
            if (Player_Info[10] < 0) {
                iArr2 = Player_Info;
                c2 = '\n';
                i2 = -this.Player_TopSpeed;
            } else {
                iArr2 = Player_Info;
                c2 = '\n';
                i2 = this.Player_TopSpeed;
            }
            iArr2[c2] = i2;
        }
        if ((f51p <= 22 || f51p >= 338) && ((abs > this.Player_TopSpeed || (!this.Input_Array[3] && !this.Input_Array[4] && Player_Info[10] != 0)) && Player_Info[10] != 0)) {
            if (Player_Info[10] < 0) {
                int[] iArr3 = Player_Info;
                iArr3[10] = iArr3[10] + this.Player_Acceleration;
            } else {
                int[] iArr4 = Player_Info;
                iArr4[10] = iArr4[10] - this.Player_Acceleration;
            }
        }
        if (Math.abs(Player_Info[10]) > 4096) {
            if (Player_Info[10] < 0) {
                iArr = Player_Info;
                c = '\n';
                i = -4096;
            } else {
                iArr = Player_Info;
                c = '\n';
                i = 4096;
            }
            iArr[c] = i;
        }
        if (m42n()) {
            return false;
        }
        m54k(0);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        if (f78l) {
            return false;
        }
        boolean z = false;
        byte b = 0;
        try {
            b = this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8];
        } catch (Exception unused) {
        }
        if (this.Game_ZoneID == 0 && (b == 31 || b == 32)) {
            z = true;
            f74i = true;
            int[] iArr5 = Player_Info;
            iArr5[10] = iArr5[10] + 256;
            if (Player_Info[10] > 4096) {
                Player_Info[10] = 4096;
            }
        }
        if (this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
            z = true;
        }
        if (!z) {
            if (!this.f115s) {
                if (m60j()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m55k()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            } else if (m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 24) && m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 24)) {
                if (m85f()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m78g()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            } else {
                if (m72h() || m85f()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m66i() || m78g()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            }
        }
        int i3 = Player_Info[0];
        int i4 = Player_Info[1];
        boolean z2 = true;
        if (m38o()) {
            this.f254h[0] = true;
            z2 = false;
        }
        if (this.f312av > 0) {
            if (z2) {
                Player_Info[0] = i3;
                Player_Info[1] = i4;
                return false;
            }
            return false;
        } else if (this.f115s || !z2) {
            boolean z3 = false;
            if (this.Game_ZoneID == 0 && (b == 31 || b == 32)) {
                z3 = true;
            }
            if (this.Game_ZoneID == 2 && (Player_Info[8] == 365 || Player_Info[8] == 364 || Player_Info[8] == 363 || Player_Info[8] == 362)) {
                Player_Hurt();
            }
            if (z3) {
                return false;
            }
            m19u();
            return false;
        } else {
            Player_Info[0] = i3;
            Player_Info[1] = i4;
            if (f51p != 22 || this.Game_ZoneID != 1 || this.Game_ActID != 1) {
                Player_Info[3] = (Math_CalcSine(f51p + 90) * Player_Info[10]) / 100;
                Player_Info[5] = (Math_CalcCosine(f51p + 90) * Player_Info[10]) / 100;
            }
            if ((f51p - 90) % 180 == 0) {
                if (f51p == 90) {
                    int[] iArr6 = Player_Info;
                    iArr6[0] = iArr6[0] + 256;
                    if (this.Game_ZoneID == 4 && this.Game_ActID != 0) {
                        Player_Info[5] = 0;
                    }
                } else {
                    int[] iArr7 = Player_Info;
                    iArr7[0] = iArr7[0] - 256;
                    if (Player_Info[10] > 2816) {
                        this.f312av = 15;
                    }
                }
            }
            Player_Info[10] = 0;
            Player_Info[13] = 0;
            Player_Info[14] = 0;
            f73h = true;
            f72g = true;
            f68d = false;
            this.f115s = false;
            if (m50l()) {
                Player_Info[5] = 0;
                return false;
            }
            return false;
        }
    }

    /* renamed from: ao */
    private void m158ao() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        char c2;
        int i4;
        int[] iArr3;
        char c3;
        int i5;
        if (this.f312av > 0) {
            this.f312av--;
        } else if (this.Input_Array[3]) {
            Player_Info[12] = 1;
            if (Player_Info[3] == 0) {
                iArr = Player_Info;
                c = 3;
                i3 = iArr[3] - (this.Player_Deceleration << 1);
            } else {
                int[] iArr4 = Player_Info;
                iArr4[3] = iArr4[3] - this.Player_Acceleration;
                if (Player_Info[3] > 0) {
                    iArr = Player_Info;
                    c = 3;
                    i3 = iArr[3] - this.Player_Acceleration;
                }
            }
            iArr[c] = i3;
        } else if (this.Input_Array[4]) {
            Player_Info[12] = 0;
            if (Player_Info[3] == 0) {
                iArr = Player_Info;
                c = 3;
                i = iArr[3];
                i2 = this.Player_Deceleration << 1;
            } else {
                int[] iArr5 = Player_Info;
                iArr5[3] = iArr5[3] + this.Player_Acceleration;
                if (Player_Info[3] < 0) {
                    iArr = Player_Info;
                    c = 3;
                    i = iArr[3];
                    i2 = this.Player_Acceleration;
                }
            }
            i3 = i + i2;
            iArr[c] = i3;
        }
        if (Math.abs(Player_Info[3]) > this.Player_TopSpeed) {
            if (Player_Info[3] < 0) {
                iArr3 = Player_Info;
                c3 = 3;
                i5 = -this.Player_TopSpeed;
            } else {
                iArr3 = Player_Info;
                c3 = 3;
                i5 = this.Player_TopSpeed;
            }
            iArr3[c3] = i5;
        }
        int[] iArr6 = this.f253F;
        iArr6[0] = iArr6[0] + Player_Info[3];
        int[] iArr7 = this.f253F;
        iArr7[1] = iArr7[1] + Player_Info[5];
        if (Player_Info[5] > 0 && this.f303bJ <= 0) {
            if (f51p == 270) {
                iArr2 = Player_Info;
                c2 = 0;
                i4 = iArr2[0] - 3072;
            } else {
                if (f51p == 90) {
                    iArr2 = Player_Info;
                    c2 = 0;
                    i4 = iArr2[0] + 3072;
                }
                f51p = 0;
            }
            iArr2[c2] = i4;
            f51p = 0;
        }
        m54k(1);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        if (f72g && this.f48bn <= 0) {
            if (m85f()) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                Player_Info[3] = 0;
            }
            if (m78g()) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                Player_Info[3] = 0;
            }
        }
        m156aq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
        if (r6.Input_Array[3] != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01db, code lost:
        if (r6.Input_Array[3] != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022c, code lost:
        if (r6.Input_Array[3] != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022f, code lost:
        m26s();
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m22t() {
        boolean z;
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        this.f253F[0] = 0;
        this.f253F[1] = 0;
        if (m121c(0)) {
            return true;
        }
        m70h(1);
        m154as();
        m54k(0);
        if (Math.abs(Player_Info[10]) > 4096) {
            if (Player_Info[10] < 0) {
                iArr2 = Player_Info;
                c2 = '\n';
                i2 = -4096;
            } else {
                iArr2 = Player_Info;
                c2 = '\n';
                i2 = 4096;
            }
            iArr2[c2] = i2;
        }
        Math.abs(Player_Info[10]);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        if (f78l) {
            return false;
        }
        boolean z2 = false;
        byte b = this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8];
        if (this.Game_ZoneID == 0) {
            if (b == 31 || b == 32) {
                z2 = true;
                int[] iArr3 = Player_Info;
                iArr3[10] = iArr3[10] + 12;
                if (Player_Info[10] > 4096) {
                    Player_Info[10] = 4096;
                }
            }
        } else if (this.Game_ZoneID == 0) {
            if (b == 53 || b == 54) {
                z = true;
                z2 = z;
            }
        } else if (this.Game_ZoneID == 3 && (b == 42 || b == 43 || b == 52 || b == 53)) {
            z = true;
            z2 = z;
        }
        if (!z2) {
            if (!this.f115s) {
                if (m60j()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m55k()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            } else if (m226a(Player_RoughXPos() - 12, Player_RoughYPos() - 24) && m226a(Player_RoughXPos() + 12, Player_RoughYPos() - 24)) {
                if (m85f()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m78g()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            } else {
                if (m72h() || m85f()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    if (this.Input_Array[4]) {
                        m26s();
                    }
                }
                if (m66i() || m78g()) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            }
        }
        int i3 = Player_Info[0];
        int i4 = Player_Info[1];
        boolean z3 = true;
        if (m38o()) {
            this.f254h[0] = true;
            z3 = false;
        }
        if (this.f312av > 0) {
            if (z3) {
                Player_Info[0] = i3;
                Player_Info[1] = i4;
                return false;
            }
            return false;
        } else if (this.f115s || !z3 || z2) {
            boolean z4 = false;
            if (this.Game_ZoneID == 0 && (this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8] == 31 || this.f126d[(Player_RoughYPos() >> 8) % this.f120bv][Player_RoughXPos() >> 8] == 32)) {
                z4 = true;
            }
            if (this.Game_ZoneID == 2 && (Player_Info[8] == 365 || Player_Info[8] == 364 || Player_Info[8] == 363 || Player_Info[8] == 362)) {
                Player_Hurt();
            }
            if (z4) {
                return false;
            }
            m19u();
            return false;
        } else {
            Player_Info[0] = i3;
            Player_Info[1] = i4;
            if (this.Game_ZoneID == 0 && Math.abs(Player_Info[10]) > 2560) {
                if (Player_Info[10] < 0) {
                    iArr = Player_Info;
                    c = '\n';
                    i = -4224;
                } else {
                    iArr = Player_Info;
                    c = '\n';
                    i = 4224;
                }
                iArr[c] = i;
            }
            Player_Info[3] = (Math_CalcSine(f51p + 90) * Player_Info[10]) / 100;
            Player_Info[5] = (Math_CalcCosine(f51p + 90) * Player_Info[10]) / 100;
            if ((f51p - 90) % 180 == 0) {
                if (f51p == 90) {
                    int[] iArr4 = Player_Info;
                    iArr4[0] = iArr4[0] + 256;
                    if (this.Game_ZoneID == 4 && this.Game_ActID != 0) {
                        Player_Info[5] = 0;
                    }
                } else {
                    int[] iArr5 = Player_Info;
                    iArr5[0] = iArr5[0] - 256;
                    if (Player_Info[10] > 3072 && this.Game_ZoneID == 4) {
                        this.f312av = 15;
                    }
                }
            }
            Player_Info[10] = 0;
            Player_Info[13] = 0;
            Player_Info[14] = 0;
            f73h = true;
            f72g = true;
            f68d = false;
            this.f115s = false;
            if (m50l()) {
                Player_Info[5] = 0;
                return false;
            }
            return false;
        }
    }

    /* renamed from: ap */
    private void m157ap() {
        int[] iArr;
        char c;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        char c2;
        int i4;
        int[] iArr3;
        char c3;
        int i5;
        if (this.f312av > 0) {
            this.f312av--;
        } else if (!this.f298C) {
            if (this.Input_Array[3]) {
                Player_Info[12] = 1;
                if (Player_Info[3] == 0) {
                    iArr = Player_Info;
                    c = 3;
                    i3 = iArr[3] - (this.Player_Deceleration << 1);
                } else {
                    int[] iArr4 = Player_Info;
                    iArr4[3] = iArr4[3] - this.Player_Acceleration;
                    if (Player_Info[3] > 0) {
                        iArr = Player_Info;
                        c = 3;
                        i3 = iArr[3] - this.Player_Acceleration;
                    }
                }
                iArr[c] = i3;
            } else if (this.Input_Array[4]) {
                Player_Info[12] = 0;
                if (Player_Info[3] == 0) {
                    iArr = Player_Info;
                    c = 3;
                    i = iArr[3];
                    i2 = this.Player_Deceleration << 1;
                } else {
                    int[] iArr5 = Player_Info;
                    iArr5[3] = iArr5[3] + this.Player_Acceleration;
                    if (Player_Info[3] < 0) {
                        iArr = Player_Info;
                        c = 3;
                        i = iArr[3];
                        i2 = this.Player_Acceleration;
                    }
                }
                i3 = i + i2;
                iArr[c] = i3;
            }
        }
        if (Math.abs(Player_Info[3]) > 4096) {
            if (Player_Info[3] < 0) {
                iArr3 = Player_Info;
                c3 = 3;
                i5 = -4096;
            } else {
                iArr3 = Player_Info;
                c3 = 3;
                i5 = 4096;
            }
            iArr3[c3] = i5;
        }
        int[] iArr6 = this.f253F;
        iArr6[0] = iArr6[0] + Player_Info[3];
        int[] iArr7 = this.f253F;
        iArr7[1] = iArr7[1] + Player_Info[5];
        if (Player_Info[5] > 0 && this.f303bJ <= 0) {
            if (f51p == 270) {
                iArr2 = Player_Info;
                c2 = 0;
                i4 = iArr2[0] - 3072;
            } else {
                if (f51p == 90) {
                    iArr2 = Player_Info;
                    c2 = 0;
                    i4 = iArr2[0] + 3072;
                }
                f51p = 0;
            }
            iArr2[c2] = i4;
            f51p = 0;
        }
        m54k(1);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        this.f48bn--;
        if (f72g && this.f48bn <= 0) {
            if (m85f()) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                Player_Info[3] = 0;
            }
            if (m78g()) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                Player_Info[3] = 0;
            }
        }
        m156aq();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m94e(int i) {
        int[] iArr;
        char c;
        int i2;
        int[] iArr2;
        char c2;
        int Math_CalcCosine;
        if (i == 0) {
            f74i = false;
            this.f314aw = 0;
            f72g = false;
            f67c = false;
            f68d = false;
        }
        if (i == 0) {
            Player_Info[10] = Player_Info[3];
            int m228a = m228a(Player_RoughXPos(), Player_RoughYPos());
            int i3 = m228a;
            if (m228a < 0) {
                for (int i4 = 1; i4 < this.f301bI + 1; i4++) {
                    int m228a2 = m228a(Player_RoughXPos() - i4, Player_RoughYPos());
                    i3 = m228a2;
                    if (m228a2 >= 0) {
                        break;
                    }
                    int m228a3 = m228a(Player_RoughXPos() + i4, Player_RoughYPos());
                    i3 = m228a3;
                    if (m228a3 >= 0) {
                        break;
                    }
                }
            }
            f51p = i3;
            if ((i3 > 67 || i3 < 44) && (i3 < 293 || i3 > 316)) {
                if (i3 < 338 && i3 > 22) {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    Math_CalcCosine = iArr2[10] + ((Math_CalcCosine(i3 + 90) * Player_Info[5]) / 100);
                }
                Player_Info[5] = 0;
                Player_Info[3] = 0;
                if (this.Game_ZoneID == 2 && (Player_Info[8] == 365 || Player_Info[8] == 364 || Player_Info[8] == 363 || Player_Info[8] == 362)) {
                    this.f141D = true;
                }
                if (Player_Info[10] < 0) {
                    Player_Info[13] = 1;
                }
                if (Player_Info[10] > 0) {
                    Player_Info[13] = 2;
                }
                iArr = Player_Info;
                c = 14;
            } else {
                if (Player_Info[5] > 3072) {
                    Player_Info[5] = 4096;
                }
                if (Math_CalcCosine(i3 + 90) > 0) {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    Math_CalcCosine = Player_Info[5];
                } else {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    Math_CalcCosine = -Player_Info[5];
                }
            }
            iArr2[c2] = Math_CalcCosine;
            Player_Info[5] = 0;
            Player_Info[3] = 0;
            if (this.Game_ZoneID == 2) {
                this.f141D = true;
            }
            if (Player_Info[10] < 0) {
            }
            if (Player_Info[10] > 0) {
            }
            iArr = Player_Info;
            c = 14;
        } else {
            if (f67c) {
                int m228a4 = m228a(Player_RoughXPos(), Player_RoughYPos() - 32);
                int i5 = m228a4;
                if (m228a4 < 0) {
                    i5 = f51p;
                }
                if (i5 % 90 != 0) {
                    iArr = Player_Info;
                    c = 3;
                    i2 = iArr[3] + ((-(Math_CalcCosine(i5 + 90) * Player_Info[5])) / 100);
                    iArr[c] = i2;
                }
            }
            iArr = Player_Info;
            c = 5;
        }
        i2 = 0;
        iArr[c] = i2;
    }

    /* renamed from: aq */
    private void m156aq() {
        Game game;
        int i;
        if (this.f303bJ > 0) {
            this.f303bJ--;
            return;
        }
        if ((-this.Player_WaterJumpForce) <= Player_Info[5]) {
            this.Input_Array[2] = false;
        } else if (!this.Input_Array[2] && !f67c && !f73h) {
            Player_Info[5] = -this.Player_WaterJumpForce;
        }
        if (Player_Info[5] > 0) {
            f67c = false;
            if (!m34p()) {
                return;
            }
            if (f51p < 270 && f51p > 90) {
                f51p = 0;
                return;
            } else {
                game = this;
                i = 0;
            }
        } else if (!m50l()) {
            return;
        } else {
            game = this;
            i = 1;
        }
        game.m94e(i);
    }

    /* renamed from: ar */
    private void m155ar() {
        Game game;
        int i;
        if (!this.f298C) {
            if (!f69Q) {
                if (this.Game_ZoneID == 5 && this.Game_ActID != 2 && (37 == Player_Info[8] || 38 == Player_Info[8] || 39 == Player_Info[8] || 41 == Player_Info[8] || 42 == Player_Info[8] || 47 == Player_Info[8] || 48 == Player_Info[8] || 49 == Player_Info[8] || 52 == Player_Info[8] || 59 == Player_Info[8] || 62 == Player_Info[8] || 69 == Player_Info[8] || 71 == Player_Info[8] || 72 == Player_Info[8] || 78 == Player_Info[8] || 79 == Player_Info[8] || 87 == Player_Info[8] || 88 == Player_Info[8] || 89 == Player_Info[8])) {
                    int[] iArr = Player_Info;
                    iArr[10] = iArr[10] + 256;
                    if (1024 < Player_Info[10]) {
                        Player_Info[10] = 1024;
                    }
                    Player_Info[12] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                } else if (this.f312av > 0) {
                    this.f312av--;
                } else if (this.Input_Array[3]) {
                    Player_Info[12] = 1;
                    if (Player_Info[13] == 0) {
                        Player_Info[13] = 1;
                    }
                    if (Player_Info[14] == 0) {
                        Player_Info[14] = 1;
                    }
                    game = this;
                    i = 0;
                    game.m83f(i);
                } else if (this.Input_Array[4]) {
                    Player_Info[12] = 0;
                    if (Player_Info[13] == 0) {
                        Player_Info[13] = 2;
                    }
                    if (Player_Info[14] == 0) {
                        Player_Info[14] = 2;
                    }
                    game = this;
                }
            }
            int[] iArr2 = this.f253F;
            iArr2[0] = iArr2[0] + ((Math_CalcSine(f51p + 90) * Player_Info[10]) / 100);
            int[] iArr3 = this.f253F;
            iArr3[1] = iArr3[1] + ((Math_CalcCosine(f51p + 90) * Player_Info[10]) / 100);
        }
        Player_Info[12] = 0;
        if (Player_Info[13] == 0) {
            Player_Info[13] = 2;
            Player_Info[14] = 2;
        }
        game = this;
        i = 1;
        game.m83f(i);
        int[] iArr22 = this.f253F;
        iArr22[0] = iArr22[0] + ((Math_CalcSine(f51p + 90) * Player_Info[10]) / 100);
        int[] iArr32 = this.f253F;
        iArr32[1] = iArr32[1] + ((Math_CalcCosine(f51p + 90) * Player_Info[10]) / 100);
    }

    /* renamed from: f */
    private void m83f(int i) {
        if (i == 1) {
            if (Player_Info[10] < 0 && Player_Info[13] == 1) {
                int[] iArr = Player_Info;
                iArr[10] = iArr[10] + this.Player_Deceleration;
                if (Player_Info[10] > 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            }
            if (Player_Info[10] == 0) {
                int[] iArr2 = Player_Info;
                iArr2[10] = iArr2[10] + this.Player_Acceleration;
            }
            int[] iArr3 = Player_Info;
            iArr3[10] = iArr3[10] + this.Player_Acceleration;
            if (Player_Info[10] <= 0 || Player_Info[13] != 1) {
                return;
            }
        } else {
            if (Player_Info[10] > 0 && Player_Info[13] == 2) {
                int[] iArr4 = Player_Info;
                iArr4[10] = iArr4[10] - this.Player_Deceleration;
                if (Player_Info[10] < 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
            }
            if (Player_Info[10] == 0) {
                int[] iArr5 = Player_Info;
                iArr5[10] = iArr5[10] - this.Player_Acceleration;
            }
            int[] iArr6 = Player_Info;
            iArr6[10] = iArr6[10] - this.Player_Acceleration;
            if (Player_Info[10] >= 0 || Player_Info[13] != 2) {
                return;
            }
        }
        Player_Info[13] = 0;
        Player_Info[14] = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0219, code lost:
        if (p000.Game.Player_Info[10] >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0232, code lost:
        if (p000.Game.Player_Info[10] <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0235, code lost:
        p000.Game.Player_Info[10] = 0;
        p000.Game.Player_Info[13] = 0;
        p000.Game.Player_Info[14] = 0;
        p000.Game.f74i = false;
     */
    /* renamed from: as */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m154as() {
        Game game;
        int i;
        if (this.f298C) {
            Player_Info[12] = 0;
            if (Player_Info[13] == 0) {
                Player_Info[13] = 2;
                Player_Info[14] = 2;
            }
            m83f(1);
        } else if (this.Game_ZoneID == 5 && this.Game_ActID != 2 && (37 == Player_Info[8] || 38 == Player_Info[8] || 39 == Player_Info[8] || 41 == Player_Info[8] || 42 == Player_Info[8] || 47 == Player_Info[8] || 48 == Player_Info[8] || 49 == Player_Info[8] || 52 == Player_Info[8] || 59 == Player_Info[8] || 62 == Player_Info[8] || 69 == Player_Info[8] || 71 == Player_Info[8] || 72 == Player_Info[8] || 78 == Player_Info[8] || 79 == Player_Info[8] || 87 == Player_Info[8] || 88 == Player_Info[8] || 89 == Player_Info[8])) {
            int[] iArr = Player_Info;
            iArr[10] = iArr[10] + 256;
            if (2560 < Player_Info[10]) {
                Player_Info[10] = 2560;
            }
        } else if (this.f312av > 0) {
            this.f312av--;
        } else {
            if (this.Input_Array[3]) {
                if (Player_Info[13] == 0) {
                    Player_Info[13] = 1;
                }
                if (Player_Info[14] == 0) {
                    Player_Info[14] = 1;
                }
                Player_Info[12] = 1;
                game = this;
                i = 0;
            } else if (this.Input_Array[4]) {
                if (Player_Info[13] == 0) {
                    Player_Info[13] = 2;
                }
                if (Player_Info[14] == 0) {
                    Player_Info[14] = 2;
                }
                Player_Info[12] = 0;
                game = this;
                i = 1;
            }
            game.m76g(i);
        }
        int[] iArr2 = this.f253F;
        iArr2[0] = iArr2[0] + ((Math_CalcSine(f51p + 90) * Player_Info[10]) / 100);
        int[] iArr3 = this.f253F;
        iArr3[1] = iArr3[1] + ((Math_CalcCosine(f51p + 90) * Player_Info[10]) / 100);
        if (Player_Info[10] != 0 && Player_Info[10] != 0) {
            if (Player_Info[10] < 0) {
                int[] iArr4 = Player_Info;
                iArr4[10] = iArr4[10] + this.Player_Acceleration;
            } else {
                int[] iArr5 = Player_Info;
                iArr5[10] = iArr5[10] - this.Player_Acceleration;
            }
        }
        if (Player_Info[10] == 0) {
            f74i = false;
            this.f314aw = 0;
        }
    }

    /* renamed from: g */
    private void m76g(int i) {
        int[] iArr;
        char c;
        int i2;
        if (i == 1) {
            int[] iArr2 = Player_Info;
            iArr2[10] = iArr2[10] + (this.Player_Acceleration >> 1);
            if (Math.abs(Player_Info[10]) <= 4096) {
                return;
            }
            if (Player_Info[10] < 0) {
                iArr = Player_Info;
                c = '\n';
                i2 = -4096;
            } else {
                iArr = Player_Info;
                c = '\n';
                i2 = 4096;
            }
        } else {
            int[] iArr3 = Player_Info;
            iArr3[10] = iArr3[10] - (this.Player_Acceleration >> 1);
            if (Math.abs(Player_Info[10]) <= 4096) {
                return;
            }
            if (Player_Info[10] < 0) {
                iArr = Player_Info;
                c = '\n';
                i2 = -4096;
            } else {
                iArr = Player_Info;
                c = '\n';
                i2 = 4096;
            }
        }
        iArr[c] = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0126, code lost:
        if (p000.Game.Player_Info[10] > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
        if (p000.Game.Player_Info[10] > 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m70h(int i) {
        if (this.f115s) {
            return;
        }
        if (0 == i) {
            int i2 = f51p;
            int i3 = i2;
            if (i2 < 0) {
                i3 = 0;
                if (f51p != 0 && !this.f115s && (f51p <= 22 || f51p >= 338)) {
                    i3 = Player_Info[10] > 0 ? 90 : Player_Info[10] < 0 ? 270 : f51p;
                }
            }
            if (f51p <= 22 || f51p >= 338) {
                return;
            }
            int[] iArr = Player_Info;
            iArr[10] = iArr[10] + ((Math_CalcCosine(i3 + 90) * 32) / 100);
            return;
        }
        int i4 = Player_Info[10];
        int i5 = f51p;
        int i6 = i5;
        if (i5 < 0) {
            i6 = 0;
            if (f51p != 0 && !this.f115s && (f51p <= 22 || f51p >= 338)) {
                i6 = Player_Info[10] > 0 ? 90 : Player_Info[10] < 0 ? 270 : f51p;
            }
        }
        if (i6 >= 338 || i6 <= 22) {
            if (f51p == 338 || f51p == 22) {
                if ((Math_CalcCosine(i6 + 90) << 5) / 100 < 0 && Player_Info[10] < 0) {
                    int[] iArr2 = Player_Info;
                    iArr2[10] = iArr2[10] + ((Math_CalcCosine(i6 + 90) * 80) / 100);
                }
                if ((Math_CalcCosine(i6 + 90) << 5) / 100 > 0) {
                }
                if (Player_Info[10] >= 0 && i4 <= 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    f74i = false;
                }
                if (Player_Info[10] > 0 || i4 < 0) {
                    return;
                }
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                f74i = false;
                return;
            }
            int[] iArr3 = Player_Info;
            iArr3[10] = iArr3[10] + ((Math_CalcCosine(i6 + 90) * 80) / 100);
            if (Player_Info[10] >= 0) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                f74i = false;
            }
            if (Player_Info[10] > 0) {
                return;
            }
            return;
        }
        if ((Math_CalcCosine(i6 + 90) * 80) / 100 < 0 && Player_Info[10] < 0) {
            int[] iArr4 = Player_Info;
            iArr4[10] = iArr4[10] + ((Math_CalcCosine(i6 + 90) * 80) / 100);
        }
        if ((Math_CalcCosine(i6 + 90) * 80) / 100 > 0) {
        }
        if (Player_Info[10] >= 0) {
        }
        if (Player_Info[10] > 0) {
        }
    }

    /* renamed from: t */
    public final void m23t() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        int i3 = 112;
        if (this.f246bh > 0) {
            i3 = 112 + (this.f246bh << 1);
        }
        if (this.f245bg > 0) {
            i3 -= this.f245bg << 1;
        }
        if (this.Game_ZoneID == 0 && this.Game_ActID == 3) {
            this.f302K[0] = 0;
            this.f302K[2] = 0;
            this.f302K[1] = 3840;
            this.f302K[3] = 128;
            if (this.f287u) {
                iArr = this.f302K;
                c = 1;
                i = iArr[1] + 768;
                iArr[c] = i;
            }
        } else if (this.Game_ZoneID != 5 || this.Game_ActID != 3) {
            this.f302K[0] = 0;
            this.f302K[2] = 0;
            this.f302K[1] = f216c[this.Game_ZoneID][this.Game_ActID][2] + 320;
            this.f302K[3] = m126c() + (240 - (184 - i3));
            if (this.f142c == 2) {
                this.f298C = true;
            }
            if (this.Game_ActID != 2 || this.Game_ZoneID != 1) {
                if (this.Game_ActID < 2) {
                    if (Player_RoughXPos() >= f210f[this.Game_ZoneID][this.Game_ActID] || this.f142c == 1) {
                        this.f302K[0] = f210f[this.Game_ZoneID][this.Game_ActID] - 144;
                        this.f142c = (byte) 1;
                    }
                } else if (this.f142c == 2 && this.Game_ZoneID != 1) {
                    this.f302K[0] = (short) (f216c[this.Game_ZoneID][this.Game_ActID][2] + 320);
                }
            }
            if (this.Game_ActID == 2 && this.Game_ZoneID != 1 && this.f287u) {
                int[] iArr3 = this.f302K;
                iArr3[1] = iArr3[1] + 256;
            }
            if (this.f286t) {
                if (this.Game_ZoneID == 0) {
                    this.f302K[0] = (10752 - (f174g >> 1)) - 16;
                    this.f302K[1] = (10752 - (f174g >> 1)) + f174g + 16;
                    this.f302K[2] = 0;
                    iArr2 = this.f302K;
                    c2 = 3;
                    i2 = 800;
                } else if (this.Game_ZoneID == 2) {
                    this.f302K[0] = (6304 - (f174g >> 1)) - 16;
                    this.f302K[1] = (6304 - (f174g >> 1)) + f174g + 16;
                    this.f302K[2] = 560;
                    iArr2 = this.f302K;
                    c2 = 3;
                    i2 = 568;
                } else if (this.Game_ZoneID == 4) {
                    this.f302K[0] = (11424 - (f174g >> 1)) - 40;
                    this.f302K[1] = (11424 - (f174g >> 1)) + f174g + 40;
                    this.f302K[2] = 1232;
                    iArr2 = this.f302K;
                    c2 = 3;
                    i2 = 1248;
                } else if (this.Game_ZoneID == 3) {
                    this.f302K[0] = 8400 - (f174g >> 1);
                    this.f302K[1] = (8400 - (f174g >> 1)) + f174g;
                    this.f302K[2] = 528;
                    iArr2 = this.f302K;
                    c2 = 3;
                    i2 = 576;
                }
                iArr2[c2] = i2 + i3;
            }
            if (this.f287u) {
                if (this.Game_ZoneID == 0) {
                    this.f302K[0] = 10752 - (f174g >> 1);
                    iArr = this.f302K;
                    c = 1;
                    i = iArr[1] + 16;
                } else if (this.Game_ZoneID == 2) {
                    this.f302K[0] = 6304 - (f174g >> 1);
                    iArr = this.f302K;
                    c = 1;
                    i = iArr[1] + 16;
                } else if (this.Game_ZoneID == 4) {
                    this.f302K[0] = 11424 - (f174g >> 1);
                    iArr = this.f302K;
                    c = 1;
                    i = iArr[1] - 16;
                } else if (this.Game_ZoneID == 3) {
                    iArr = this.f302K;
                    c = 0;
                    i = 8400 - (f174g >> 1);
                }
                iArr[c] = i;
            }
        }
        if (f75j) {
            m152au();
        } else {
            m64i(i3);
        }
    }

    /* renamed from: i */
    private void m64i(int i) {
        m153at();
        m59j(i);
        for (int i2 = 0; i2 < 2; i2++) {
            if (f214y[i2] < 0) {
                f214y[i2] = 0;
            }
        }
    }

    /* renamed from: at */
    private void m153at() {
        int i = f174g >> 1;
        int Player_RoughXPos = Player_RoughXPos();
        if (f214y[0] >= this.f302K[1] - f174g && !this.f286t && this.f285bw == 0 && this.Game_ActID == 2) {
            m176aH();
        }
        if (Player_RoughXPos - f214y[0] < i) {
            if (!this.f262p) {
                this.f311aa = true;
                int[] iArr = f214y;
                iArr[0] = iArr[0] - (i - (Player_RoughXPos - f214y[0]));
                if (f214y[0] < this.f302K[0]) {
                    f214y[0] = this.f302K[0];
                }
                if (((f214y[0] + 16) << 8) > Player_Info[0]) {
                    Player_Info[0] = (f214y[0] + 16) << 8;
                    if (Player_Info[10] < 0) {
                        Player_Info[10] = 0;
                        Player_Info[13] = 0;
                        Player_Info[14] = 0;
                    }
                    if (!f72g && f74i) {
                        f74i = false;
                    }
                    if (!f72g || Player_Info[3] >= 0) {
                        return;
                    }
                    Player_Info[3] = 0;
                    return;
                }
                return;
            } else if (((f214y[0] + 16) << 8) <= Player_Info[0]) {
                return;
            } else {
                Player_Info[0] = (f214y[0] + 16) << 8;
                if (Player_Info[10] < 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
                if (f72g || !f74i) {
                    return;
                }
            }
        } else if (Player_RoughXPos - f214y[0] <= i) {
            return;
        } else {
            this.f310Z = true;
            int[] iArr2 = f214y;
            iArr2[0] = iArr2[0] - (i - (Player_RoughXPos - f214y[0]));
            if (f214y[0] + (i << 1) > this.f302K[1]) {
                f214y[0] = this.f302K[1] - (i << 1);
            }
            if (this.f298C) {
                if ((((f214y[0] + 96) + 240) << 8) >= Player_Info[0]) {
                    return;
                }
                Player_Info[0] = ((f214y[0] + 96) + 240) << 8;
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                if (f72g || !f74i) {
                    return;
                }
            } else if ((((f214y[0] - 16) + 240) << 8) >= Player_Info[0]) {
                return;
            } else {
                Player_Info[0] = ((f214y[0] - 16) + 240) << 8;
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                if (f72g || !f74i) {
                    return;
                }
            }
        }
        f74i = false;
    }

    /* renamed from: j */
    private void m59j(int i) {
        int Player_RoughYPos = Player_RoughYPos();
        if (this.f286t && ((this.Game_ZoneID != 1 || this.Game_ActID != 2) && f214y[1] + i > this.f302K[3])) {
            f214y[1] = this.f302K[3] - i;
        }
        if (Player_RoughYPos - f214y[1] < i) {
            this.f310Z = true;
            int[] iArr = f214y;
            iArr[1] = iArr[1] - (i - (Player_RoughYPos - f214y[1]));
            if ((!((this.Game_ZoneID == 1 && this.Game_ActID == 2 && f214y[0] < 7936) || (this.Game_ZoneID == 5 && this.Game_ActID == 1)) || this.f246bh > 0 || this.f245bg > 0) && f214y[1] < this.f302K[2]) {
                f214y[1] = this.f302K[2];
            }
        } else if (Player_RoughYPos - f214y[1] > i) {
            this.f310Z = true;
            int[] iArr2 = f214y;
            iArr2[1] = iArr2[1] - (i - (Player_RoughYPos - f214y[1]));
            if (f214y[1] + i > this.f302K[3]) {
                f214y[1] = this.f302K[3] - i;
            }
            if (this.Game_ZoneID == 1 && this.Game_ActID == 2) {
                return;
            }
            if (this.Game_ZoneID == 5 && this.Game_ActID == 1) {
                return;
            }
            if (((this.Game_ZoneID != 3 || ((f214y[1] + 168) << 8) >= Player_Info[1]) && (((f214y[1] - 16) + 240) << 8) >= Player_Info[1]) || f75j) {
                return;
            }
            Player_Info[1] = ((f214y[1] - 16) + 240) << 8;
            Player_Kill();
        }
    }

    /* renamed from: c */
    private int m126c() {
        int m87f;
        int i = (this.f120bv * 256) - 232;
        switch (this.Game_ZoneID) {
            case 0:
                m87f = m110d();
                break;
            case 1:
            case 3:
            default:
                return i;
            case 2:
                m87f = m98e();
                break;
            case 4:
                m87f = m87f();
                break;
        }
        i = m87f;
        return i;
    }

    /* renamed from: d */
    private int m110d() {
        int i;
        int i2 = 1024;
        switch (this.Game_ActID) {
            case 0:
                if (6016 > f214y[0]) {
                    i = 768;
                    i2 = i;
                    break;
                }
                break;
            case 1:
                i = 3792 > f214y[0] ? 768 : 5632 > f214y[0] ? 512 : 7632 > f214y[0] ? 1024 : 768;
                i2 = i;
                break;
            case 2:
                if (896 > f214y[0]) {
                    i = 768;
                } else if (2400 > f214y[0]) {
                    i = 784;
                } else if (640 > f214y[1]) {
                    i = 768;
                } else if (4992 <= f214y[0]) {
                    i2 = 1024;
                    if (5888 <= f214y[0]) {
                        if (f214y[1] <= 880) {
                            i = 768;
                        } else if (6144 <= f214y[0]) {
                            this.f302K[1] = 6144 + f174g;
                            this.f285bw = 1;
                            break;
                        }
                    }
                } else {
                    i = 1216;
                }
                i2 = i;
                break;
        }
        return i2;
    }

    /* renamed from: e */
    private int m98e() {
        int i;
        int i2;
        switch (this.Game_ActID) {
            case 0:
                if (!(this.f63B == 0 && this.f64C == 0) && f214y[0] == 0 && f214y[1] == 0) {
                    i2 = 1280;
                } else if (Player_RoughXPos() > 3584 && Player_RoughXPos() < 4096 && Player_RoughYPos() > 1024 && Player_RoughYPos() < 1248) {
                    i2 = 1280;
                } else if (3696 <= f214y[0]) {
                    i = 528;
                    if (5168 > f214y[0]) {
                        i2 = 1280;
                    }
                } else if (1792 > f214y[0]) {
                    i2 = 464;
                } else if (2400 > f214y[0] || 2752 <= f214y[0]) {
                    i = 1280;
                    if (728 > f214y[1]) {
                        if (3328 > f214y[0]) {
                            i2 = 544;
                        }
                    } else if (1176 <= f214y[1] || 3792 > f214y[0]) {
                    }
                } else {
                    i = 1280;
                    if (728 > f214y[1]) {
                        i2 = 544;
                    }
                }
                i = i2;
                break;
            case 1:
                i2 = 1312;
                i = i2;
                break;
            default:
                i = 1824;
                if (5472 < f214y[0] && Player_RoughYPos() < 1280) {
                    i2 = 528;
                    i = i2;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: f */
    private int m87f() {
        int i;
        int i2;
        switch (this.Game_ActID) {
            case 1:
                i = 1312;
                if (9632 <= f214y[0] && 1248 > Player_RoughYPos()) {
                    i2 = 1056;
                    i = i2;
                    break;
                }
                break;
            default:
                i = 1228;
                if (11264 > f214y[0]) {
                    i2 = 1824;
                    i = i2;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: k */
    private void m54k(int i) {
        int[] iArr;
        char c;
        int i2;
        int i3;
        int[] iArr2;
        char c2;
        int i4;
        int abs;
        m159an();
        if (this.Game_ZoneID != 1 || this.f270ah >= Player_RoughYPos() - 12) {
            if (this.f253F[0] > 4096) {
                this.f253F[0] = 4096;
            }
            if (this.f253F[0] < -4096) {
                this.f253F[0] = -4096;
            }
            if (this.f253F[1] > 4096) {
                this.f253F[1] = 4096;
            }
            if (this.f253F[1] < -4096) {
                this.f253F[1] = -4096;
            }
            int[] iArr3 = Player_Info;
            iArr3[0] = iArr3[0] + this.f253F[0];
            iArr = Player_Info;
            c = 1;
            i2 = iArr[1];
            i3 = this.f253F[1];
        } else {
            int[] iArr4 = Player_Info;
            iArr4[0] = iArr4[0] + (this.f253F[0] >> 1);
            iArr = Player_Info;
            c = 1;
            i2 = iArr[1];
            i3 = this.f253F[1] >> 1;
        }
        iArr[c] = i2 + i3;
        if (i == 1) {
            if (this.f47bm > 0) {
                this.f47bm--;
            } else if (this.Game_ZoneID != 1 || this.f270ah >= Player_RoughYPos() - 12) {
                int[] iArr5 = Player_Info;
                iArr5[5] = iArr5[5] + this.f250bj;
            } else {
                int[] iArr6 = Player_Info;
                iArr6[5] = iArr6[5] + (this.f250bj / 2);
            }
        }
        if (i == 1 && f74i) {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = this.Player_TopSpeed;
        } else if (Math.abs(this.f253F[0]) + Math.abs(this.f253F[1]) > this.Player_TopSpeed) {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = this.Player_TopSpeed;
        } else {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = Math.abs(this.f253F[0]) + Math.abs(this.f253F[1]);
        }
        iArr2[c2] = i4 + abs;
    }

    /* renamed from: u */
    private boolean m19u() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        if (f51p > 290 || f51p < 70) {
            return false;
        }
        if (f51p < 90 || f51p > 270) {
            if (Math.abs(Player_Info[10]) < 640) {
                if (Player_Info[10] < 0) {
                    iArr = Player_Info;
                    c = '\f';
                    i = 1;
                } else {
                    iArr = Player_Info;
                    c = '\f';
                    i = 0;
                }
                iArr[c] = i;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                int abs = Math.abs(Player_Info[10]);
                Player_Info[5] = 280;
                Player_Info[3] = (-(Math_CalcSine(f51p + 90) * abs)) / 100;
                f72g = true;
                f68d = false;
                this.f115s = false;
                this.f312av = 30;
                m50l();
                return false;
            }
            return false;
        } else if (Math.abs(Player_Info[10]) < 640) {
            if (Player_Info[10] < 0) {
                iArr2 = Player_Info;
                c2 = '\f';
                i2 = 1;
            } else {
                iArr2 = Player_Info;
                c2 = '\f';
                i2 = 0;
            }
            iArr2[c2] = i2;
            Player_Info[13] = 0;
            Player_Info[14] = 0;
            int i3 = Player_Info[10];
            Player_Info[5] = (Math_CalcCosine(f51p + 90) * i3) / 100;
            if (f51p > 90 && f51p < 270) {
                Player_Info[5] = 0;
            }
            Player_Info[3] = (Math_CalcSine(f51p + 90) * i3) / 100;
            f72g = true;
            f68d = false;
            this.f115s = false;
            this.f303bJ = 15;
            if (f51p == 90 || f51p == 270) {
                this.f303bJ = 0;
            }
            m50l();
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static int Player_RoughXPos() {
        return Player_Info[0] >> 8;
    }

    /* renamed from: b */
    public static int Player_RoughYPos() {
        return Player_Info[1] >> 8;
    }

    /* renamed from: u */
    public final void Player_Hurt() {
        int[] iArr;
        char c;
        int i;
        int[] iArr2;
        char c2;
        int i2;
        if (!this.f304E && this.Player_InvincTime <= 0) {
            if (this.f316G && this.Cheats_Active[0]) {
                return; // Do nothing if you're invincible or have the invincibility cheat.
            }
            if (this.Player_ShieldFlag > 0) { // Does the player have a shield?
                this.Player_ShieldFlag = 0; // Remove the shield
                this.Player_InvulnTime = 60; // Set invulnerability time
                f68d = true;
                f72g = true;
                if (Player_Info[12] == 1) { // Is Player facing left?
                    iArr2 = Player_Info; // Attempt to apply X velocity, but fails because it never moves this array back into player's info
                    c2 = 3;
                    i2 = 512;
                } else {
                    iArr2 = Player_Info;
                    c2 = 3;
                    i2 = -512;
                }
                iArr2[c2] = i2;
                Player_Info[5] = -1024; // Bounce player in the air
                Player_Info[12] = (Player_Info[12] + 1) % 2; // Flip the player around
                Player_Info[13] = 0;
                Player_Info[14] = 0;
            } else if (this.Player_InvulnTime > 0) {
                return;
            } else {
                if (this.Player_Rings <= 0) {
                    Player_Kill();
                    return;
                }
                this.Player_InvulnTime = 60; // Set invulnerability time
                f68d = true;
                f72g = true;
                if (!m96e() && Player_Info[12] == 1) {
                    iArr = Player_Info;
                    c = 3;
                    i = 512;
                } else {
                    iArr = Player_Info;
                    c = 3;
                    i = -512;
                }
                iArr[c] = i;
                Player_Info[5] = -1024; // Bounce player in the air
                Player_Info[12] = (Player_Info[12] + 1) % 2; // Flip the plauer around
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                if (!this.f316G || !this.Cheats_Active[0]) {
                    m53k(Player_RoughXPos(), Player_RoughYPos() - 12, this.Player_Rings);
                    this.Player_Rings = 0;
                }
            }
            this.f304E = true;
        }
    }

    /* renamed from: v */
    public final void Player_Kill() {
        if (f75j) {
            this.f131v = true;
            this.f132ao = 10;
            return;
        }
        f81o = true;
        this.f244bf = 2100;
        f72g = true;
        f68d = false;
        f74i = false;
        f75j = true;
        this.f143V = true;
        this.f115s = false;
        Player_Info[10] = 0;
        Player_Info[13] = 0;
        Player_Info[14] = 0;
        this.f47bm = 5;
        Player_Info[3] = 0;
        Player_Info[5] = (Math_CalcCosine(0) * this.Player_JumpForce) / 100;
        this.f61z = 120;
    }

    /* renamed from: au */
    private void m152au() {
        if (f75j) {
            Player_Info[3] = 0;
            this.f61z--;
            if ((((f214y[1] - 16) + 240) << 8) < Player_Info[1] && this.f143V) {
                this.f143V = false;
                if (!this.f316G || !this.Cheats_Active[0]) {
                    this.Player_Lives--;
                }
                if (this.Player_Lives <= 0) {
                    this.Music_MainPlayer.Music_Play(14, 1, false);
                    this.f61z = 240;
                    this.f131v = true;
                    this.f132ao = 10;
                } else if (this.f59x == 59 && this.f60y == 9) {
                    this.f61z = 240;
                    f145X = true;
                    this.f131v = true;
                    this.f132ao = 10;
                    this.f65D = 0;
                    this.f66E = 0;
                    this.f146Y = true;
                }
            }
            if (this.f61z < 0) {
                if (this.Player_Lives > 0) {
                    m35p();
                    return;
                }
                if (!Audio_Player.m6a()) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused) {
                    }
                    m175aI();
                }
                this.f131v = true;
                this.f132ao = 10;
            }
        }
    }

    /* renamed from: a */
    public final void m230a(int i) {
        this.f254h[0] = true;
        if (this.f304E || Player_Info[5] < 0) {
            return;
        }
        if (f72g && f74i && !f73h) {
            f74i = false;
        }
        int i2 = this.f305as - 8;
        if (i2 >= 0 && Math.abs(Player_RoughXPos() - this.f306at) > i2) {
            this.f147F = true;
            this.f148ar = 0;
            if (Player_RoughXPos() - this.f306at > 0) {
                this.f148ar = 1;
            }
        }
        this.f141D = false;
        Player_Info[8] = 0;
        Player_Info[5] = 0;
        if (f72g) {
            Player_Info[10] = Player_Info[3];
            if (Player_Info[10] < 0) {
                Player_Info[13] = 1;
            }
            if (Player_Info[10] > 0) {
                Player_Info[13] = 2;
            }
            Player_Info[14] = 0;
        }
        Player_Info[3] = 0;
        this.f115s = true;
        this.f116ag = i;
        f51p = 0;
        f72g = false;
        f67c = false;
        f69Q = false;
        this.f314aw = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m228a(int i, int i2) {
        int i3;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = (this.f126d[((i2 >> 4) >> 4) % this.f120bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
        if (this.f109f[i4 >> 1] == 1) {
            return -1;
        }
        int m84f = (m84f((this.Level_Chunks[i4] & 255) + (this.f107d[i4 >> 1] << 8)) * 360) / 255;
        if (this.f108e[i4 >> 1] != 1) {
            if (this.f108e[i4 >> 1] != 2) {
                if (this.f108e[i4 >> 1] == 3) {
                    m84f = (540 - m84f) % 360;
                }
                if (m84f % 90 == 0) {
                }
                return m84f % 360;
            }
            i3 = 540;
            m84f = i3 - m84f;
            if (m84f % 90 == 0) {
                if (f51p == 62) {
                    return 90;
                }
                m84f = Math.abs(((f51p - 22) + 45) / 90) * 90;
                if (f51p == 44) {
                    m84f = 0;
                }
            }
            return m84f % 360;
        }
        i3 = 360;
        m84f = i3 - m84f;
        if (m84f % 90 == 0) {
        }
        return m84f % 360;
    }

    /* renamed from: w */
    public final void m15w() {
        int i;
        int[] iArr;
        char c;
        int[] iArr2;
        char c2;
        int i2;
        int[] iArr3;
        char c3;
        int i3;
        int i4;
        int i5;
        Game game;
        int i6;
        int Player_RoughXPos;
        int Player_RoughYPos;
        int i7;
        if (this.f334K) {
            return;
        }
        if (this.Player_InvulnTime > 0) {
            this.Player_InvulnTime--;
        }
        if ((this.Player_InvulnTime & 1) == 1) {
            return;
        }
        int i8 = f179a[0];
        int i9 = (540 - f51p) % 360;
        if (Player_Info[12] == 1) {
            i8 = f179a[4];
        }
        Player_Info[11] = Player_Info[11] % 92160;
        int i10 = 0;
        int i11 = 0;
        int Player_RoughXPos2 = Player_RoughXPos();
        int Player_RoughYPos2 = Player_RoughYPos();
        int i12 = 33;
        int i13 = 1;
        if (f67c) {
            i = 28;
        } else if (f68d && f72g) {
            if (Player_Info[12] == 1) {
                iArr3 = f179a;
                c3 = 0;
            } else {
                iArr3 = f179a;
                c3 = 4;
            }
            i8 = iArr3[c3];
            Player_RoughYPos2 -= 5;
            i = 26;
        } else if (this.f49bo > 0) {
            i = 11;
            this.f49bo--;
        } else if (f71f) {
            i8 = f179a[4];
            i = 35 + ((this.f226j >> 1) % 2);
            f71f = false;
        } else if (f70e) {
            if ((this.f226j >> 1) % 5 < 3) {
                i8 = f179a[0];
                i2 = 32 + ((this.f226j >> 1) % 4);
            } else {
                i8 = f179a[4];
                i2 = 36 - ((this.f226j >> 1) % 4);
            }
            i = i2;
            f70e = false;
        } else if (f74i && f72g) {
            i10 = 0;
            if (f72g && f51p == 270) {
                i10 = 0 - 16;
            }
            Player_RoughXPos2 += i10;
            i = 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 5);
        } else if (f69Q) {
            Player_RoughYPos2 -= 5;
            i = 25 + ((this.f226j / 2) % 2);
        } else if (f75j) {
            i = f144W ? 29 : 27;
        } else if (f74i && !f72g) {
            i10 = (-16) + ((Math_CalcSine(i9) * 16) / 100);
            i11 = (-15) - ((Math_CalcCosine(i9) * 15) / 100);
            Player_RoughXPos2 += i10;
            Player_RoughYPos2 += i11;
            i12 = 20;
            i = 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4);
        } else if (f76k) {
            i = 22;
            f76k = false;
        } else if (f77R) {
            i = 5;
            f77R = false;
        } else if (this.f243be > 0) {
            i = 37 + ((this.f226j / 4) % 4);
        } else if (Player_Info[10] != 0 || f72g) {
            if (f72g || !((Player_Info[14] == 2 && Player_Info[10] > 0 && Player_Info[12] == 1) || (Player_Info[14] == 1 && Player_Info[10] < 0 && Player_Info[12] == 0))) {
                int i14 = 0;
                while (i14 < 7 && ((i14 * 45) + 23 >= i9 || ((i14 + 1) * 45) + 23 < i9)) {
                    i14++;
                }
                i8 = m77g(i14);
                i13 = i14 % 2;
                i12 = 20;
                i = (Math.abs(Player_Info[10]) >= this.Player_TopSpeed || f82S) ? i13 == 1 ? 18 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4) : 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4) : i13 == 1 ? 12 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 6) : ((Player_Info[11] / this.Player_TopSpeed) / 4) % 6;
                int i15 = f117a[i13 == 1 ? (char) 151 : (char) 152][i][2] >> 1;
                int i16 = f117a[i13 == 1 ? (char) 151 : (char) 152][i][3] >> 1;
                i10 = (-i15) + ((Math_CalcSine(i9) * i15) / 100);
                i11 = (-i16) - ((Math_CalcCosine(i9) * i16) / 100);
                Player_RoughXPos2 += i10;
                Player_RoughYPos2 += i11;
            } else {
                i8 = f179a[0];
                if (Player_Info[12] == 0) {
                    i8 = f179a[4];
                }
                i = 30 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 2);
            }
        } else if (this.f147F) {
            if (this.f148ar == 1) {
                iArr2 = f179a;
                c2 = 0;
            } else {
                iArr2 = f179a;
                c2 = 4;
            }
            i8 = iArr2[c2];
            i = 23 + ((this.f307au / 8) % 2);
        } else if (this.f115s || ((f51p > 22 && f51p < 338) || ((m93e(Player_RoughXPos() + 12, Player_RoughYPos()) || m93e(Player_RoughXPos() + 12, Player_RoughYPos() + 16)) && (m93e(Player_RoughXPos() - 12, Player_RoughYPos()) || m93e(Player_RoughXPos() - 12, Player_RoughYPos() + 16))))) {
            i = this.f307au < 75 ? 0 : this.f307au < 90 ? 1 : this.f307au < 105 ? 2 : 3 + ((this.f307au / 8) % 2);
        } else {
            if (m93e(Player_RoughXPos() + 12, Player_RoughYPos()) || m93e(Player_RoughXPos() + 12, Player_RoughYPos() + 16)) {
                iArr = f179a;
                c = 4;
            } else {
                iArr = f179a;
                c = 0;
            }
            i8 = iArr[c];
            i = 23 + ((this.f307au / 8) % 2);
        }
        if (i13 == 1) {
            i3 = Player_RoughXPos2;
            i4 = Player_RoughYPos2;
            i5 = 151;
        } else {
            i3 = Player_RoughXPos2;
            i4 = Player_RoughYPos2;
            i5 = 152;
        }
        m217a(i3, i4, i5, i, i8, i12);
        f82S = false;
        if (this.f243be > 0) {
            this.f243be--;
        }
        if (Player_Info[10] != 0 || f72g) {
            game = this;
            i6 = 0;
        } else {
            game = this;
            i6 = game.f307au + 1;
        }
        game.f307au = i6;
        int Math_CalcSine = (-16) + ((Math_CalcSine(i9) * 16) / 100);
        int Math_CalcCosine = (-16) - ((Math_CalcCosine(i9) * 16) / 100);
        if (this.Player_InvincTime > 0) {
            if (this.f226j % 2 == 0) {
                if (i10 == 0 && i11 == 0) {
                    m58j(Player_RoughXPos(), Player_RoughYPos() - 18, 0);
                } else {
                    m58j(Player_RoughXPos() + Math_CalcSine + 16, Player_RoughYPos() + Math_CalcCosine + 16, 0);
                }
            }
        } else if (this.Player_ShieldFlag > 0) {
            if (Math_CalcSine == 0 && Math_CalcCosine == 0) {
                Player_RoughXPos = Player_RoughXPos() + i10;
                Player_RoughYPos = Player_RoughYPos() - 18;
                i7 = i11;
            } else {
                Player_RoughXPos = Player_RoughXPos() + Math_CalcSine + 16;
                Player_RoughYPos = Player_RoughYPos() + Math_CalcCosine;
                i7 = 16;
            }
            int i17 = Player_RoughYPos + i7;
            if (f74i && f72g && i9 == 254) {
                Player_RoughXPos += 16;
                i17 -= 8;
            }
            m133b(109, 48, 48 * (this.f226j % 2), 48, 48, f179a[0], Player_RoughXPos, i17 - 4);
        }
    }

    /* renamed from: g */
    private static int m77g(int i) {
        int[] iArr;
        int[] iArr2;
        char c;
        int[] iArr3;
        char c2;
        if (Player_Info[12] == 1) {
            iArr = new int[]{f179a[5], f179a[5], f179a[4], f179a[4], f179a[7], f179a[7], f179a[6]};
            iArr2 = iArr;
            c = 7;
            iArr3 = f179a;
            c2 = 6;
        } else {
            iArr = new int[]{f179a[2], f179a[1], f179a[1], f179a[0], f179a[0], f179a[3], f179a[3]};
            iArr2 = iArr;
            c = 7;
            iArr3 = f179a;
            c2 = 2;
        }
        iArr2[c] = iArr3[c2];
        return iArr[i];
    }

    /* renamed from: j */
    private void m58j(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.f266k.length; i4++) {
            if (this.f266k[i4][0] == 0) {
                this.f266k[i4][0] = 1;
                this.f266k[i4][1] = i3;
                this.f266k[i4][2] = i;
                this.f266k[i4][3] = i2;
                this.f266k[i4][5] = 0;
                return;
            }
        }
    }

    /* renamed from: x */
    public final void m13x() {
        for (int i = 0; i < this.f266k.length; i++) {
            if (this.f266k[i][0] == 1 && this.f266k[i][1] == 0) {
                int[] iArr = this.f266k[i];
                iArr[5] = iArr[5] + 1;
                if (this.f266k[i][5] > 60) {
                    this.f266k[i][5] = 0;
                    this.f266k[i][0] = 0;
                }
            }
        }
    }

    /* renamed from: y */
    public final void m11y() {
        for (int i = 0; i < this.f266k.length; i++) {
            if (this.f266k[i][0] == 1 && this.f266k[i][1] == 0) {
                m133b(109, 0, 48 * ((this.f266k[i][5] / 4) % 2), 48, 48, f179a[0], this.f266k[i][2], this.f266k[i][3]);
            }
        }
    }

    /* renamed from: av */
    private void m151av() {
        int i = 0;
        if (this.Game_ActID > 3) {
            this.Game_ActID = 3;
        }
        for (int i2 = 0; i2 < this.Level_ActorLayout[this.Game_ActID].length / 7; i2++) {
            byte b = this.Level_ActorLayout[this.Game_ActID][(i2 * 7) + 5];
            i = (0 == b || 1 == b || 63 == b || 64 == b || 65 == b || 66 == b || 67 == b || 68 == b || 69 == b) ? i + 1 + this.Level_ActorLayout[this.Game_ActID][(i2 * 7) + 6] : i + 1;
        }
        this.f125J = new int[i];
        this.f113c = new boolean[i + 20];
        this.f114d = new boolean[i + 20];
        int i3 = 0;
        for (int i4 = 0; i4 < this.Level_ActorLayout[this.Game_ActID].length / 7; i4++) {
            this.f125J[i4] = i3;
            byte b2 = this.Level_ActorLayout[this.Game_ActID][(i4 * 7) + 5];
            if (0 == b2 || 1 == b2 || 63 == b2 || 64 == b2 || 65 == b2 || 66 == b2 || 67 == b2 || 68 == b2 || 69 == b2) {
                for (int i5 = 0; i5 < this.Level_ActorLayout[this.Game_ActID][(i4 * 7) + 6] + 1; i5++) {
                    i3++;
                }
            } else {
                i3++;
            }
        }
    }

    /* renamed from: a */
    public final boolean m188a(int[] iArr) {
        return iArr[2] - f214y[0] < this.f149bM || iArr[2] - f214y[0] > this.f150bN || Math.abs(iArr[3] - f214y[1]) > this.f151bO;
    }

    /* renamed from: z */
    public final void m9z() {
        int length = this.Level_ActorLayout[this.Game_ActID].length / 7;
        try {
            if (this.f310Z) {
                if (this.f308bK < this.f309bL) {
                    this.f309bL = this.f308bK;
                } else {
                    this.f308bK = this.f309bL;
                }
                int i = this.f309bL * 7;
                int i2 = this.f308bK * 7;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i + 1] & 255)) - f214y[0] > this.f150bN) {
                        break;
                    }
                    if (Math.abs((((this.Level_ActorLayout[this.Game_ActID][i + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i + 3] & 255)) - f214y[1]) < this.f151bO && !this.f113c[this.f125J[this.f309bL]]) {
                        m49l(this.f309bL);
                    }
                    this.f309bL++;
                    i += 7;
                    if (this.f309bL >= length) {
                        this.f309bL = length - 1;
                        break;
                    }
                }
                this.f310Z = false;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i2 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i2 + 1] & 255)) - f214y[0] >= this.f149bM) {
                        break;
                    }
                    this.f308bK++;
                    i2 += 7;
                    if (this.f308bK >= length) {
                        this.f308bK = length - 1;
                        break;
                    }
                }
            }
            if (this.f311aa) {
                if (this.f308bK > this.f309bL) {
                    this.f309bL = this.f308bK;
                } else {
                    this.f308bK = this.f309bL;
                }
                int i3 = this.f309bL * 7;
                int i4 = this.f308bK * 7;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i3 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i3 + 1] & 255)) - f214y[0] < this.f149bM) {
                        break;
                    }
                    if (Math.abs((((this.Level_ActorLayout[this.Game_ActID][i3 + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i3 + 3] & 255)) - f214y[1]) < this.f151bO && !this.f113c[this.f125J[this.f309bL]]) {
                        m49l(this.f309bL);
                    }
                    this.f309bL--;
                    i3 -= 7;
                    if (this.f309bL < 0) {
                        this.f309bL = 0;
                        break;
                    }
                }
                this.f311aa = false;
                while ((((this.Level_ActorLayout[this.Game_ActID][i4 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i4 + 1] & 255)) - f214y[0] > this.f150bN) {
                    this.f308bK--;
                    i4 -= 7;
                    if (this.f308bK < 0) {
                        this.f308bK = 0;
                        return;
                    }
                }
            }
        } catch (Exception unused) {
            this.f310Z = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m49l(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        char c;
        int i6;
        int i7;
        int i8;
        int i9 = 1;
        int i10 = i * 7;
        int i11 = this.Level_ActorLayout[this.Game_ActID][(i * 7) + 5] & 255;
        if (0 == i11 || 1 == i11 || 63 == i11 || 64 == i11 || 65 == i11 || 66 == i11 || 67 == i11 || 68 == i11 || 69 == i11) {
            i9 = 1 + this.Level_ActorLayout[this.Game_ActID][i10 + 6];
            int i12 = ((this.Level_ActorLayout[this.Game_ActID][i10 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 1] & 255);
            if (i9 != 1) {
                switch (this.Level_ActorLayout[this.Game_ActID][i10 + 5]) {
                    case 0:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 24;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM || i12 - f214y[0] > this.f150bN) {
                            return;
                        }
                        break;
                    case 1:
                    case 68:
                    case 69:
                    default:
                        if (i12 - f214y[0] < this.f149bM) {
                            return;
                        }
                        return;
                    case 63:
                        i5 = i12 - ((i9 - 1) * 16);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM) {
                        }
                        break;
                    case 64:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 16;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM) {
                        }
                        break;
                    case 65:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 32;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM) {
                        }
                        break;
                    case 66:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 16;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM) {
                        }
                        break;
                    case 67:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 32;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f214y[0] < this.f149bM) {
                        }
                        break;
                }
            }
        } else if (i11 == 41 || i11 == 86 || i11 == 57 || i11 == 78 || i11 == 40 || i11 == 70 || i11 == 39 || i11 == 49 || i11 == 71 || i11 == 10 || i11 == 35) {
            int i13 = ((this.Level_ActorLayout[this.Game_ActID][i10 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 1] & 255);
            if (i13 - f214y[0] > -48 && i13 - f214y[0] < 288) {
                return;
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            int[] iArr2 = new int[25];
            if (!this.f114d[this.f125J[i] + i14] && !this.f113c[this.f125J[i] + i14]) {
                iArr2[0] = 1;
                iArr2[1] = this.Level_ActorLayout[this.Game_ActID][i10 + 5] & 255;
                iArr2[2] = ((this.Level_ActorLayout[this.Game_ActID][i10 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 1] & 255);
                iArr2[3] = ((this.Level_ActorLayout[this.Game_ActID][i10 + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 3] & 255);
                iArr2[8] = ((this.Level_ActorLayout[this.Game_ActID][i10 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 1] & 255);
                iArr2[9] = ((this.Level_ActorLayout[this.Game_ActID][i10 + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 3] & 255);
                if (i9 != 1) {
                    switch (this.Level_ActorLayout[this.Game_ActID][i10 + 5]) {
                        case 0:
                            iArr2[2] = iArr2[2] + (i14 * 24);
                            iArr = iArr2;
                            c = '\b';
                            i6 = iArr[8];
                            i7 = i14;
                            i8 = 24;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 1:
                            iArr2[3] = iArr2[3] + (i14 * 24);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[9];
                            i7 = i14;
                            i8 = 24;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 63:
                            iArr2[2] = iArr2[2] - (i14 * 16);
                            iArr2[8] = iArr2[8] - (i14 * 16);
                            iArr2[3] = iArr2[3] + (i14 * 16);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[9];
                            i7 = i14;
                            i8 = 16;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 64:
                            iArr2[2] = iArr2[2] + (i14 * 16);
                            iArr2[8] = iArr2[8] + (i14 * 16);
                            iArr2[3] = iArr2[3] + (i14 * 16);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[9];
                            i7 = i14;
                            i8 = 16;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 65:
                            iArr2[2] = iArr2[2] + (i14 * 32);
                            iArr2[8] = iArr2[8] + (i14 * 32);
                            iArr2[3] = iArr2[3] + (i14 * 32);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[c];
                            i7 = i14;
                            i8 = 32;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 66:
                            iArr2[2] = iArr2[2] + (i14 * 16);
                            iArr = iArr2;
                            c = '\b';
                            i6 = iArr[8];
                            i7 = i14;
                            i8 = 16;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 67:
                            iArr2[2] = iArr2[2] + (i14 * 32);
                            iArr = iArr2;
                            c = '\b';
                            i6 = iArr[c];
                            i7 = i14;
                            i8 = 32;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 68:
                            iArr2[3] = iArr2[3] + (i14 * 16);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[9];
                            i7 = i14;
                            i8 = 16;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                        case 69:
                            iArr2[3] = iArr2[3] + (i14 * 32);
                            iArr = iArr2;
                            c = '\t';
                            i6 = iArr[c];
                            i7 = i14;
                            i8 = 32;
                            iArr[c] = i6 + (i7 * i8);
                            break;
                    }
                }
                iArr2[4] = this.Level_ActorLayout[this.Game_ActID][i10 + 6] & 255;
                iArr2[19] = this.Level_ActorLayout[this.Game_ActID][i10 + 4] & 255;
                iArr2[20] = this.f125J[i] + i14;
                iArr2[22] = this.f125J[i];
                if (this.Game_Settings[0] == 0) {
                    if (iArr2[1] == 41 || iArr2[1] == 86 || iArr2[1] == 57 || iArr2[1] == 78 || iArr2[1] == 40 || iArr2[1] == 70 || iArr2[1] == 39 || iArr2[1] == 49 || iArr2[1] == 71) {
                        return;
                    }
                } else if (this.Game_Settings[0] == 1 && (iArr2[1] == 40 || iArr2[1] == 70 || iArr2[1] == 39 || iArr2[1] == 49 || iArr2[1] == 71)) {
                    return;
                }
                this.f113c[this.f125J[i] + i14] = true;
                m100d(iArr2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (m226a(Player_RoughXPos() + 8, Player_RoughYPos() - 24) != false) goto L11;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m271A() {
        Game game;
        if (this.f316G && this.Cheats_Active[0]) {
            return;
        }
        if ((!this.f254h[0] || !this.f254h[3]) && ((f72g && !this.f115s) || !this.f254h[3])) {
            if (this.Game_ZoneID == 2 || this.Game_ZoneID == 4) {
                if (this.f115s) {
                    if (m226a(Player_RoughXPos() - 8, Player_RoughYPos() - 24)) {
                    }
                }
            } else if (this.f115s && (m226a(Player_RoughXPos() - 8, Player_RoughYPos() - 24) || m226a(Player_RoughXPos() + 8, Player_RoughYPos() - 24))) {
                game = this;
                game.Player_Kill();
            }
            this.f254h[0] = false;
            this.f254h[3] = false;
        }
        game = this;
        game.Player_Kill();
        this.f254h[0] = false;
        this.f254h[3] = false;
    }

    /* renamed from: d */
    private void m100d(int[] iArr) {
        if (iArr[1] == 9 || iArr[1] == 15 || iArr[1] == 48 || iArr[1] == 11 || iArr[1] == 2 || iArr[1] == 79 || 0 == iArr[1] || 1 == iArr[1] || 63 == iArr[1] || 64 == iArr[1] || 65 == iArr[1] || 66 == iArr[1] || 67 == iArr[1] || 68 == iArr[1] || 69 == iArr[1]) {
            for (int length = this.f264e.length - 1; length > 0; length--) {
                if (this.f264e[length][24] == 0) {
                    this.f264e[length] = iArr;
                    this.f264e[length][24] = 1;
                    if (this.f255F != length) {
                        this.f112af++;
                        return;
                    }
                    this.f112af++;
                    for (int i = 0; i < this.f264e.length; i++) {
                        if (this.f264e[length][24] == 0) {
                            this.f255F = length;
                            return;
                        }
                    }
                    return;
                }
            }
        } else if (this.f264e[this.f255F][24] == 0) {
            this.f264e[this.f255F] = iArr;
            this.f264e[this.f255F][24] = 1;
            this.f112af++;
            for (int i2 = 0; i2 < this.f264e.length; i2++) {
                if (this.f264e[i2][24] == 0) {
                    this.f255F = i2;
                    return;
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f264e.length) {
                    break;
                } else if (this.f264e[i3][24] == 0) {
                    this.f255F = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.f264e[this.f255F] = iArr;
            this.f264e[this.f255F][24] = 1;
            this.f112af++;
            for (int i4 = 0; i4 < this.f264e.length; i4++) {
                if (this.f264e[i4][24] == 0) {
                    this.f255F = i4;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m142b(int i) {
        this.f255F = i;
        this.f264e[i][24] = 0;
        this.f256G--;
    }

    /* renamed from: a */
    public final int[][] m225a(int i, int i2) {
        this.f83H = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f264e.length && i3 < this.f112af; i4++) {
            if (this.f264e[i4][24] == 1) {
                i3++;
                if (this.f264e[i4][1] == i && (i2 < 0 || i2 == this.f264e[i4][4])) {
                    this.f257c[this.f83H] = this.f264e[i4];
                    this.f257c[this.f83H][23] = i4;
                    this.f83H++;
                }
            }
        }
        int[][] iArr = new int[this.f83H][25];
        System.arraycopy(this.f257c, 0, iArr, 0, iArr.length);
        return iArr;
    }

    /* renamed from: aw */
    private void m150aw() {
        byte[] bArr;
        int i;
        int i2;
        int i3 = this.f50bp;
        this.f50bp = i3 - 1;
        if (i3 <= 0 && Player_RoughYPos() >= 0) {
            boolean z = false;
            int Player_RoughXPos = Player_RoughXPos() >> 8;
            int Player_RoughYPos = Player_RoughYPos() >> 8;
            byte b = this.f126d[Player_RoughYPos % this.f120bv][Player_RoughXPos];
            if ((f184b[0] >> 8) < Player_RoughXPos && this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                this.f126d[Player_RoughYPos % this.f120bv][Player_RoughXPos] = 53;
            }
            if ((f184b[0] >> 8) > Player_RoughXPos && this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                this.f126d[Player_RoughYPos % this.f120bv][Player_RoughXPos] = 54;
            }
            int i4 = this.f126d[Player_RoughYPos % this.f120bv][Player_RoughXPos] & 1;
            if (this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                z = true;
            }
            if (z && m104d(Player_RoughXPos(), Player_RoughYPos())) {
                if (i4 % 2 == 1 && (Player_RoughXPos() >> 4) % 16 < 9 && (Player_RoughYPos() >> 4) % 16 < 3) {
                    bArr = this.f126d[Player_RoughYPos % this.f120bv];
                    i = Player_RoughXPos;
                    i2 = bArr[i] + 1;
                } else if (i4 % 2 != 0 || (Player_RoughXPos() >> 4) % 16 < 7 || (Player_RoughYPos() >> 4) % 16 >= 3) {
                    return;
                } else {
                    bArr = this.f126d[Player_RoughYPos % this.f120bv];
                    i = Player_RoughXPos;
                    i2 = bArr[i] - 1;
                }
                bArr[i] = (byte) i2;
                this.f50bp = 60;
            }
        }
    }

    /* renamed from: a */
    public static void m215a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m195a(GFX_Painter, GFX_GameArray[i], i2, i3, i4, i5, i6, i7, i8, 3, true);
    }

    /* renamed from: h */
    private static int m71h(int i) {
        return i;
    }

    /* renamed from: d */
    public static int m107d(int i) {
        return i;
    }

    /* renamed from: b */
    public static void m133b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m195a(GFX_Painter, GFX_GameArray[i], i2, i3, i4, i5, i6, m107d(i7 - Camera_Pos[0]), m107d(i8 - Camera_Pos[1]), 3, true);
    }

    /* renamed from: a */
    public static void m214a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m195a(GFX_Painter, GFX_GameArray[i], i2, i3, i4, i5, i6, m107d(i7 - Camera_Pos[0]), m107d(i8 - Camera_Pos[1]), i9, true);
    }

    /* renamed from: a */
    public static void m220a(int gfxID, int i, int worldposX, int worldposY, int i2) {
        if (GFX_GameArray[gfxID] == null) {
            return;
        }
        m195a(GFX_Painter, GFX_GameArray[gfxID], 0, 0, GFX_GameArray[gfxID].getWidth(), GFX_GameArray[gfxID].getHeight(), i, m107d(worldposX - Camera_Pos[0]), m107d(worldposY - Camera_Pos[1]), i2, true);
    }

    /* renamed from: c */
    public static void m114c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m195a(GFX_Painter, GFX_GameArray[i], i2, i3, i4, i5, i6, m107d(i7 - Camera_Pos[0]), m107d(i8 - Camera_Pos[1]), 20, true);
    }

    /* renamed from: b */
    public static void m136b(int i, int i2, int i3, int i4, int i5) {
        m217a(i, i2, i3, i4, i5, 3);
    }

    /* renamed from: a */
    public static void m217a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i4 >= 0 && f117a[i3].length != 0) {
            int length = i4 % f117a[i3].length;
            int i7 = f117a[i3][length][0];
            int i8 = f117a[i3][length][1];
            int i9 = f117a[i3][length][2];
            int i10 = f117a[i3][length][3];
            int i11 = 0;
            if (f117a[i3][length].length > 4) {
                i11 = f117a[i3][length][4];
            }
            m195a(GFX_Painter, GFX_GameArray[i3], i7, i8, i9, i10, i5, m107d(i - Camera_Pos[0]), m107d(i2 - Camera_Pos[1]) + i11, i6, true);
        }
    }

    /* renamed from: a */
    public static void m195a(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9;
        int i10;
        if (image == null) {
            return;
        }
        Graphics graphics2 = z ? 1 : 0;
        try {
            if (graphics2 != null) {
                i9 = i7;
                i10 = f13i;
            } else {
                i9 = i7;
                i10 = f12f;
            }
            int i11 = i9 + i10;
            graphics2 = graphics;
            graphics2.drawRegion(image, i, i2, i3, i4, i5, i6, i11, i8);
        } catch (Exception e) {
            graphics2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void GFX_UnloadArray(Image[] imageArr) {
        synchronized (imageArr) {
            for (int i = 0; i < imageArr.length; i++) {
                imageArr[i] = null;
            }
        }
        System.gc();
    }

    /* renamed from: a */
    private static Image GFX_Load(String path) {
        try {
            return Image.createImage(path); // Try and create an Image class via the provided path
        } catch (Exception unused) {
            return null; // If the path is invalid, just return a null image to prevent errors.
        }
    }

    /* renamed from: c */
    public final void PowerUp_Apply(int type) {
        switch (type) {
            case 2:
                this.Player_Lives++;
                this.Music_MainPlayer.Music_Play(7, 1, false);
                return;
            case 3:
                this.Player_SpeedShoeTime = 1200;
                this.Player_TopSpeed = 3072;
                this.Player_Acceleration = 24;
                return;
            case 4:
                this.Player_ShieldFlag = 1;
                return;
            case 5:
                this.Player_InvincTime = 1200;
                this.Music_MainPlayer.Music_Play(6, -1, false);
                return;
            case 6:
                this.Player_Rings += 10;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static int Actor_CheckPlayerCollide(int i, int i2, int i3, int i4, int i5, int i6) {
        return Actor_CheckCollision(Player_RoughXPos(), Player_RoughYPos() - 12, f184b[0], f184b[1] - 12, 12, 12, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: a */
    public static int Actor_CheckCollision(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (f75j || f78l) {
            return -1;
        }
        if (i4 + i6 <= i10 - i12 && i2 + i6 >= i8 - i12 && i + i5 >= i7 - i11 && i - i5 <= i7 + i11) {
            return (i + i5 <= i7 - i11 || i - i5 >= i7 + i11) ? -1 : 0;
        } else if (i3 + i5 > i9 - i11 || i + i5 < i7 - i11 || i2 + i6 < i8 - i12 || i2 - i6 > i8 + i12) {
            if (i3 - i5 < i9 + i11 || i - i5 > i7 + i11 || i2 + i6 < i8 - i12 || i2 - i6 > i8 + i12) {
                if (i4 - i6 < i10 + i12 || i2 - i6 > i8 + i12 || i + i5 < i7 - i11 || i - i5 > i7 + i11) {
                    return (i + i5 < i7 - i11 || i - i5 > i7 + i11 || i2 + i6 < i8 - i12 || i2 - i6 > i8 + i12) ? -1 : 4;
                }
                return 3;
            }
            return 2;
        } else {
            return 1;
        }
    }

    /* renamed from: b */
    public final void m140b(int i, int i2) {
        this.f305as = i2;
        this.f306at = i;
    }

    /* renamed from: B */
    public final void m269B() {
        this.f254h[3] = true;
        if (Player_Info[5] < 0) {
            Player_Info[5] = 0;
        }
    }

    /* renamed from: b */
    public static int m135b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f75j || f78l) {
            return -1;
        }
        int i7 = (540 - f51p) % 360;
        if (0 > i7) {
            i7 = 0;
        }
        int i8 = 12;
        if (!f74i && !f76k) {
            i8 = 18;
        }
        int Math_CalcSine = (Math_CalcSine(i7) * i8) / 100;
        int i9 = ((-Math_CalcCosine(i7)) * i8) / 100;
        int Player_RoughXPos = Player_RoughXPos() + Math_CalcSine;
        int Player_RoughYPos = Player_RoughYPos() + i9;
        int i10 = f184b[0] + Math_CalcSine;
        int i11 = f184b[1] + i9;
        int i12 = i8;
        if (i11 + i12 > i4 - i6 || Player_RoughYPos + i12 < i2 - i6 || Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5) {
            if (i10 + 12 > i3 - i5 || Player_RoughXPos + 12 < i - i5 || Player_RoughYPos + i12 < i2 - i6 || Player_RoughYPos - i12 > i2 + i6) {
                if (i10 - 12 < i3 + i5 || Player_RoughXPos - 12 > i + i5 || Player_RoughYPos + i12 < i2 - i6 || Player_RoughYPos - i12 > i2 + i6) {
                    if (i11 - i12 < i4 + i6 || Player_RoughYPos - i12 > i2 + i6 || Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5) {
                        return (Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5 || Player_RoughYPos + i12 < i2 - i6 || Player_RoughYPos - i12 > i2 + i6) ? -1 : 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m115c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f75j || f78l) {
            return -1;
        }
        int i7 = 12;
        if (!f74i) {
            i7 = 16;
        }
        int i8 = -i7;
        int Player_RoughXPos = Player_RoughXPos() + 0;
        int Player_RoughYPos = Player_RoughYPos() + i8;
        int i9 = f184b[0] + 0;
        int i10 = f184b[1] + i8;
        int i11 = i7;
        if (i10 + i11 > i4 - i6 || Player_RoughYPos + i11 < i2 - i6 || Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5) {
            if (i9 + 12 > i3 - i5 || Player_RoughXPos + 12 < i - i5 || Player_RoughYPos + i11 < i2 - i6 || Player_RoughYPos - i11 > i2 + i6) {
                if (i9 - 12 < i3 + i5 || Player_RoughXPos - 12 > i + i5 || Player_RoughYPos + i11 < i2 - i6 || Player_RoughYPos - i11 > i2 + i6) {
                    if (i10 - i11 < i4 + i6 || Player_RoughYPos - i11 > i2 + i6 || Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5) {
                        return (Player_RoughXPos + 12 < i - i5 || Player_RoughXPos - 12 > i + i5 || Player_RoughYPos + i11 < i2 - i6 || Player_RoughYPos - i11 > i2 + i6) ? -1 : 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: f */
    private void m81f(boolean z) {
        if (!z) {
            for (int i = 0; i < HighScore_DefaultScores.length; i++) {
                if (HighScore_DefaultScores[i] < this.Player_Score) {
                    this.f121ai = 9;
                    this.f131v = true;
                    return;
                }
            }
            m106d(3);
            return;
        }
        this.Player_Lives = 3;
        this.Player_Score = 0;
        this.f61z = 0;
        m35p();
        this.f63B = 0;
        this.f64C = 0;
        this.f65D = 0;
        this.f66E = 0;
        this.f146Y = false;
    }

    /* renamed from: a */
    public static Vector m205a(String str) {
        int i = 0;
        Vector vector = new Vector();
        while (i < str.length()) {
            String substring = str.substring(i);
            int i2 = 0;
            int i3 = 0;
            while (m131b(substring, i2) < f174g - 32) {
                i3 = i2;
                int m201a = m201a(substring, i2 + 1);
                i2 = m201a;
                if (m201a == -1) {
                    i2 = substring.length();
                    if (i3 == 0) {
                        break;
                    } else if (m131b(substring, i2) < f174g - 32) {
                        i3 = 0;
                        break;
                    }
                } else if (substring.charAt(i2) == '~') {
                    i3 = 0;
                    break;
                }
            }
            if (i3 == 0) {
                vector.addElement(substring.substring(0, i2));
                i += i2 + 1;
            } else {
                vector.addElement(substring.substring(0, i3));
                i += i3 + 1;
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static int m201a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == ' ' || charAt == '~') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private static int m131b(String str, int i) {
        return f41b.substringWidth(str, 0, i);
    }

    /* renamed from: d */
    public final void m106d(int i) {
        this.f131v = true;
        this.f132ao = 10;
        m101d(false);
        this.Menu_ID = (byte) i;
        this.f121ai = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x07d8  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m267C() {
        int[] iArr;
        int i;
        int length;
        Game game;
        int i2;
        Game game2;
        int i3;
        Audio_Player audio_Player;
        int i4;
        Game game3;
        Game game4;
        int i5;
        Game game5;
        byte b;
        boolean[] zArr;
        int i6;
        boolean z;
        this.f131v = true;
        for (int i7 = 0; i7 < 10; i7++) {
            if (!this.f223g[i7]) {
                zArr = this.f223g;
                i6 = i7;
                z = this.Input_Array[i7];
            } else if (this.Input_Array[i7]) {
                zArr = this.Input_Array;
                i6 = i7;
                z = false;
            } else {
                zArr = this.f223g;
                i6 = i7;
                z = false;
            }
            zArr[i6] = z;
        }
        if (this.f37L) {
            this.f37L = false;
        }
        this.f35b = (byte) ((this.f35b + 1) % 24);
        switch (this.Menu_ID) {
            case 0:
                this.f152bP++;
                if (this.f152bP > 150) {
                    this.f152bP = 0;
                    this.Menu_ID = (byte) 11;
                    this.f267q = true;
                    break;
                }
                break;
            case 1:
                this.f152bP++;
                if (this.f152bP > 150) {
                    this.f152bP = 0;
                    m101d(false);
                    break;
                }
                break;
            case 2:
                if (this.Input_Array[4]) {
                    byte[] bArr = this.Game_Settings;
                    bArr[2] = (byte) (bArr[2] + 1);
                    if (this.Game_Settings[2] >= 5) {
                        this.Game_Settings[2] = 0;
                    }
                    Text_LoadLang();
                    break;
                } else if (this.Input_Array[3]) {
                    byte[] bArr2 = this.Game_Settings;
                    bArr2[2] = (byte) (bArr2[2] - 1);
                    if (this.Game_Settings[2] < 0) {
                        this.Game_Settings[2] = 4;
                    }
                    Text_LoadLang();
                    break;
                } else if (this.Input_Array[0]) {
                    Record_Save_Settings();
                    m101d(false);
                    m37o(0);
                    break;
                }
                break;
            case 3:
                if (this.f159I) {
                    if (this.f34d < 12) {
                        this.f152bP++;
                        if (this.f152bP > 10) {
                            this.f34d = (byte) (this.f34d + 1);
                        }
                    } else {
                        this.f152bP = (byte) ((this.f152bP + 1) % 10);
                    }
                }
                if (this.f34d >= 12) {
                    for (int i8 = 0; i8 < this.Input_Array.length; i8++) {
                        if (this.Input_Array[i8]) {
                            this.Menu_ID = (byte) 4;
                            m79g();
                            this.Menu_CurrentSelection = (byte) 0;
                            m41n(11 + this.Menu_CurrentSelection);
                            m37o(2);
                        }
                    }
                }
                if (this.Input_Array[6]) {
                    this.Menu_ID = (byte) 14;
                    this.Menu_CurrentSelection = (byte) 1;
                    break;
                }
                break;
            case 4:
                if (this.f159I) {
                    this.f152bP = (byte) ((this.f152bP + 1) % 5);
                }
                if (this.Input_Array[4]) {
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection + 1);
                    if ((this.f316G && this.Menu_CurrentSelection == 9) || (!this.f316G && this.Menu_CurrentSelection == 8)) {
                        this.Menu_CurrentSelection = (byte) 0;
                    }
                    m41n(11 + this.Menu_CurrentSelection);
                }
                if (this.Input_Array[3]) {
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection - 1);
                    if (this.Menu_CurrentSelection < 0) {
                        if (this.f316G) {
                            game5 = this;
                            b = 8;
                        } else {
                            game5 = this;
                            b = 7;
                        }
                        game5.Menu_CurrentSelection = b;
                    }
                    m41n(11 + this.Menu_CurrentSelection);
                }
                if (this.Input_Array[0]) {
                    if (this.Menu_CurrentSelection == 0) {
                        m169ad();
                        if (this.f127g != 0 || this.f288h != 9) {
                            m37o(1);
                            this.Menu_CurrentSelection = (byte) 1;
                            m41n(50 + this.Menu_CurrentSelection);
                            this.Menu_ID = (byte) 9;
                            return;
                        }
                        m97e();
                        this.f267q = true;
                        this.Player_Lives = 3;
                        if (this.f316G) {
                            game4 = this;
                            i5 = this.f318ay;
                        } else {
                            game4 = this;
                            i5 = 0;
                        }
                        game4.Player_Emeralds = i5;
                        this.Player_Score = 0;
                        if (this.f154az <= 0) {
                            this.f127g = (byte) 0;
                            this.f278am = 0;
                        }
                        this.f277al = 0;
                        this.Game_ZoneID = f212f[this.f277al][this.f278am];
                        this.Game_ActID = f213g[this.f277al][this.f278am];
                        this.f268r = true;
                        m35p();
                        return;
                    } else if (this.Menu_CurrentSelection == 1) {
                        this.Menu_CurrentSelection = (byte) 1;
                        m97e();
                        this.f277al = 0;
                        this.f278am = 0;
                        this.Game_ZoneID = f212f[this.f277al][this.f278am];
                        this.Game_ActID = f213g[this.f277al][this.f278am];
                        this.f267q = true;
                        this.f121ai = 3;
                        this.f131v = true;
                        this.f132ao = 10;
                        GFX_UnloadArray(GFX_MenuArray);
                        return;
                    } else {
                        if (this.Menu_CurrentSelection == 2) {
                            this.Menu_CurrentSelection = (byte) 0;
                            this.f39f = (byte) 0;
                            this.Menu_ID = (byte) 10;
                            GFX_GameArray[36] = GFX_Load("/save.png");
                            GFX_GameArray[42] = GFX_Load("/item.png");
                            this.f38a = new Vector();
                            this.f37L = true;
                            this.f40N = false;
                            f41b = Font.getFont(64, 0, 0);
                        } else if (this.Menu_CurrentSelection == 3) {
                            this.Menu_ID = (byte) 5;
                            m37o(1);
                            this.f39f = (byte) 0;
                        } else if (this.Menu_CurrentSelection == 4) {
                            this.Menu_CurrentSelection = (byte) 0;
                            this.Menu_ID = (byte) 8;
                            m41n(52 + this.Menu_CurrentSelection);
                            m37o(1);
                            this.f37L = true;
                        } else {
                            if (this.Menu_CurrentSelection == 5) {
                                this.Menu_CurrentSelection = (byte) 0;
                                this.f39f = (byte) 0;
                                this.f40N = false;
                                this.Menu_ID = (byte) 12;
                            } else if (this.Menu_CurrentSelection == 6) {
                                this.Menu_CurrentSelection = (byte) 0;
                                this.Menu_ID = (byte) 16;
                                m41n(52 + this.Menu_CurrentSelection);
                                m37o(1);
                                this.f37L = true;
                            } else if (this.Menu_CurrentSelection == 7) {
                                this.Menu_CurrentSelection = (byte) 0;
                                this.Menu_ID = (byte) 17;
                                this.Text_ProgressElements = "";
                                m41n(52 + this.Menu_CurrentSelection);
                                m37o(4);
                                this.f37L = true;
                            } else if (this.Menu_CurrentSelection == 8) {
                                this.Menu_CurrentSelection = (byte) 0;
                                this.Menu_ID = (byte) 13;
                                this.f318ay = this.Player_Emeralds;
                            }
                            this.f37L = true;
                        }
                        m37o(1);
                    }
                }
                if (this.Input_Array[6]) {
                    m37o(0);
                    this.Menu_ID = (byte) 3;
                    this.Music_MainPlayer.Music_Play(9, 1, false);
                    return;
                }
                m148ay();
                break;
            case 5:
                if (this.Input_Array[6]) {
                    this.Menu_CurrentSelection = (byte) 3;
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    m41n(11 + this.Menu_CurrentSelection);
                } else if (this.Input_Array[9]) {
                    this.Menu_CurrentSelection = (byte) 1;
                    this.Menu_ID = (byte) 6;
                }
                if (this.Input_Array[2] && this.f39f > 0) {
                    this.f39f = (byte) (this.f39f - 1);
                    this.f37L = true;
                }
                if (this.Input_Array[1] && this.f40N) {
                    this.f39f = (byte) (this.f39f + 1);
                    this.f37L = true;
                    break;
                }
                break;
            case 6:
                if (this.Input_Array[6]) {
                    this.Menu_ID = (byte) 5;
                    break;
                } else if (!this.Input_Array[2] && !this.Input_Array[1]) {
                    if (this.Input_Array[0]) {
                        this.Menu_ID = (byte) 5;
                        if (this.Menu_CurrentSelection == 0) {
                            HighScore_DefaultScores = new int[5];
                            HighScore_DefaultDifficulties = new int[5];
                            HighScore_DefaultNames = new String[]{"   ", "   ", "   ", "   ", "   "};
                            HighScore_ResetValues();
                            this.Menu_ID = (byte) 7;
                            break;
                        }
                    }
                } else {
                    this.Menu_CurrentSelection = (byte) ((this.Menu_CurrentSelection + 1) % 2);
                    break;
                }
                break;
            case 7:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 5;
                    break;
                }
                break;
            case 8:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.Menu_CurrentSelection = (byte) 4;
                    m41n(11 + this.Menu_CurrentSelection);
                    Record_Save_Settings();
                } else {
                    if (this.Input_Array[2]) {
                        this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection - 1);
                        if (this.Menu_CurrentSelection < 0) {
                            this.Menu_CurrentSelection = (byte) 2;
                        }
                        m41n(52 + this.Menu_CurrentSelection);
                    } else if (this.Input_Array[1]) {
                        this.Menu_CurrentSelection = (byte) ((this.Menu_CurrentSelection + 1) % 3);
                        m41n(52 + this.Menu_CurrentSelection);
                    } else if (this.Input_Array[4]) {
                        if (this.Menu_CurrentSelection == 0) {
                            this.Game_Settings[0] = (byte) ((this.Game_Settings[0] + 1) % 3);
                        } else if (this.Menu_CurrentSelection == 1) {
                            this.Game_Settings[1] = (byte) ((this.Game_Settings[1] + 1) % 2);
                            this.Music_MainPlayer.m5a((int) this.Game_Settings[1]);
                        }
                        if (this.Menu_CurrentSelection == 2) {
                            this.Game_Settings[2] = (byte) ((this.Game_Settings[2] + 1) % 5);
                            Text_LoadLang();
                            m41n(52 + this.Menu_CurrentSelection);
                            this.f225a[1] = this.Text_Main[59];
                        }
                        game3 = this;
                        game3.f37L = true;
                    } else if (this.Input_Array[3]) {
                        byte[] bArr3 = this.Game_Settings;
                        byte b2 = this.Menu_CurrentSelection;
                        bArr3[b2] = (byte) (bArr3[b2] - 1);
                        if (this.Game_Settings[this.Menu_CurrentSelection] < 0) {
                            if (this.Menu_CurrentSelection == 0) {
                                this.Game_Settings[0] = 2;
                            } else if (this.Menu_CurrentSelection == 1) {
                                this.Game_Settings[1] = 1;
                                audio_Player = this.Music_MainPlayer;
                                i4 = 1;
                                audio_Player.m5a(i4);
                            } else {
                                this.Game_Settings[2] = 4;
                            }
                            if (this.Menu_CurrentSelection == 2) {
                                Text_LoadLang();
                                m41n(52 + this.Menu_CurrentSelection);
                                this.f225a[1] = this.Text_Main[59];
                            }
                        } else {
                            if (this.Menu_CurrentSelection == 1) {
                                audio_Player = this.Music_MainPlayer;
                                i4 = 0;
                                audio_Player.m5a(i4);
                            }
                            if (this.Menu_CurrentSelection == 2) {
                            }
                        }
                    }
                    game3 = this;
                    game3.f37L = true;
                }
                m148ay();
                break;
            case 9:
                if (this.Input_Array[6]) {
                    this.Menu_ID = (byte) 4;
                    this.Menu_CurrentSelection = (byte) 0;
                    m41n(11 + this.Menu_CurrentSelection);
                    m37o(2);
                } else if (this.Input_Array[2] || this.Input_Array[1]) {
                    this.Menu_CurrentSelection = (byte) ((this.Menu_CurrentSelection + 1) % 2);
                    m41n(50 + this.Menu_CurrentSelection);
                } else if (this.Input_Array[0]) {
                    if (this.Menu_CurrentSelection == 0) {
                        m97e();
                        this.f267q = true;
                        GFX_UnloadArray(GFX_MenuArray);
                        this.Player_Lives = 3;
                        if (this.f316G) {
                            game2 = this;
                            i3 = this.f318ay;
                        } else {
                            game2 = this;
                            i3 = 0;
                        }
                        game2.Player_Emeralds = i3;
                        this.Player_Score = 0;
                        this.f127g = (byte) 0;
                        this.f277al = 0;
                        game = this;
                        i2 = 0;
                    } else if (this.Menu_CurrentSelection == 1) {
                        m97e();
                        this.f267q = true;
                        GFX_UnloadArray(GFX_MenuArray);
                        this.Player_Lives = this.f128i;
                        this.Player_Score = this.f129bx;
                        this.f277al = this.f127g / 3;
                        game = this;
                        i2 = this.f127g % 3;
                    }
                    game.f278am = i2;
                    this.Game_ZoneID = f212f[this.f277al][this.f278am];
                    this.Game_ActID = f213g[this.f277al][this.f278am];
                    this.f268r = true;
                    m35p();
                }
                m148ay();
                break;
            case 10:
                if (this.Input_Array[4] && this.Menu_CurrentSelection < 25) {
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection + 1);
                    if (this.Menu_CurrentSelection == 23 || this.Menu_CurrentSelection == 24) {
                        this.Menu_CurrentSelection = (byte) 25;
                    }
                    this.f39f = (byte) 0;
                    this.f37L = true;
                }
                if (this.Input_Array[3] && this.Menu_CurrentSelection > 0) {
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection - 1);
                    if (this.Menu_CurrentSelection == 23 || this.Menu_CurrentSelection == 24) {
                        this.Menu_CurrentSelection = (byte) 22;
                    }
                    this.f39f = (byte) 0;
                    this.f37L = true;
                }
                if (this.Input_Array[2] && this.f39f > 0) {
                    this.f39f = (byte) (this.f39f - 1);
                    this.f37L = true;
                }
                if (this.Input_Array[1] && this.f40N) {
                    this.f39f = (byte) (this.f39f + 1);
                    this.f37L = true;
                }
                if (this.Input_Array[6]) {
                    this.Menu_CurrentSelection = (byte) 2;
                    this.Menu_ID = (byte) 4;
                    GFX_GameArray[36] = null;
                    GFX_GameArray[42] = null;
                    m37o(2);
                }
                this.f38a = m205a(this.Text_Manual[1 + (this.Menu_CurrentSelection * 2)]);
                break;
            case 11:
                this.f152bP++;
                if (this.f152bP > 150) {
                    this.f152bP = 0;
                    this.Menu_ID = (byte) 1;
                    this.f267q = true;
                    break;
                }
                break;
            case 12:
                if (this.Input_Array[4] && this.Menu_CurrentSelection < 5) {
                    this.f39f = (byte) 0;
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection + 1);
                    this.f37L = true;
                }
                if (this.Input_Array[3] && this.Menu_CurrentSelection > 0) {
                    this.f39f = (byte) 0;
                    this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection - 1);
                    this.f37L = true;
                }
                if (this.Input_Array[2] && this.f39f > 0) {
                    this.f39f = (byte) (this.f39f - 1);
                    this.f37L = true;
                }
                if (this.Input_Array[1] && this.f40N) {
                    this.f39f = (byte) (this.f39f + 1);
                    this.f37L = true;
                }
                if (this.Input_Array[6]) {
                    this.Menu_CurrentSelection = (byte) 5;
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    break;
                }
                break;
            case 13:
                if (!this.Input_Array[6] && !this.Input_Array[0]) {
                    if (this.Input_Array[2]) {
                        this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection - 1);
                        if (this.Menu_CurrentSelection < 0) {
                            this.Menu_CurrentSelection = (byte) 6;
                        }
                        this.f37L = true;
                        break;
                    } else if (this.Input_Array[1]) {
                        this.Menu_CurrentSelection = (byte) ((this.Menu_CurrentSelection + 1) % 7);
                        this.f37L = true;
                        break;
                    } else if (this.Input_Array[4]) {
                        if (this.Menu_CurrentSelection == 0) {
                            this.Cheats_Active[0] = !this.Cheats_Active[0];
                        } else if (this.Menu_CurrentSelection == 1) {
                            this.Cheats_Active[2] = !this.Cheats_Active[2];
                        } else if (this.Menu_CurrentSelection == 2) {
                            this.f318ay++;
                            if (this.f318ay > 6) {
                                this.f318ay = 0;
                            }
                            this.Player_Emeralds = this.f318ay;
                        } else if (this.Menu_CurrentSelection == 3) {
                            this.Cheats_Active[1] = !this.Cheats_Active[1];
                        } else if (this.Menu_CurrentSelection == 4) {
                            this.Cheats_Active[3] = !this.Cheats_Active[3];
                        } else if (this.Menu_CurrentSelection == 5) {
                            this.Cheats_Active[4] = !this.Cheats_Active[4];
                        } else if (this.Menu_CurrentSelection == 6) {
                            this.f121ai = 8;
                            this.f21aL = 0;
                            m79g();
                        }
                        this.f37L = true;
                        break;
                    } else if (this.Input_Array[3]) {
                        if (this.Menu_CurrentSelection == 0) {
                            this.Cheats_Active[0] = !this.Cheats_Active[0];
                        } else if (this.Menu_CurrentSelection == 1) {
                            this.Cheats_Active[2] = !this.Cheats_Active[2];
                        } else if (this.Menu_CurrentSelection == 2) {
                            this.f318ay--;
                            if (this.f318ay < 0) {
                                this.f318ay = 6;
                            }
                            this.Player_Emeralds = this.f318ay;
                        } else if (this.Menu_CurrentSelection == 3) {
                            this.Cheats_Active[1] = !this.Cheats_Active[1];
                        } else if (this.Menu_CurrentSelection == 4) {
                            this.Cheats_Active[3] = !this.Cheats_Active[3];
                        } else if (this.Menu_CurrentSelection == 5) {
                            this.Cheats_Active[4] = !this.Cheats_Active[4];
                        } else if (this.Menu_CurrentSelection == 6) {
                            this.f121ai = 8;
                            this.f21aL = 0;
                            m79g();
                        }
                        this.f37L = true;
                        break;
                    }
                } else {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.Menu_CurrentSelection = (byte) 8;
                    m41n(11 + this.Menu_CurrentSelection);
                    break;
                }
                break;
            case 14:
                this.f131v = true;
                this.Menu_CurrentSelection = (byte) (this.Menu_CurrentSelection % 2);
                if (!this.Input_Array[2] && !this.Input_Array[1]) {
                    if (this.Input_Array[0]) {
                        if (this.Menu_CurrentSelection == 0) {
                            this.f153a.notifyDestroyed();
                            break;
                        } else {
                            this.Menu_ID = (byte) 3;
                            this.Music_MainPlayer.Music_Play(9, 1, false);
                            break;
                        }
                    } else if (this.Input_Array[6]) {
                        this.Menu_ID = (byte) 3;
                        this.Music_MainPlayer.Music_Play(9, 1, false);
                        break;
                    }
                } else {
                    this.Menu_CurrentSelection = (byte) ((this.Menu_CurrentSelection + 1) % 2);
                    break;
                }
                break;
            case 16:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.Menu_CurrentSelection = (byte) 6;
                    m41n(11 + this.Menu_CurrentSelection);
                    break;
                }
                break;
            case 17:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.Menu_CurrentSelection = (byte) 7;
                    m41n(11 + this.Menu_CurrentSelection);
                    break;
                } else if (this.Input_Array[5]) {
                    StringBuffer stringBuffer = new StringBuffer(8);
                    for (int i9 = 0; i9 < 8; i9++) {
                        stringBuffer.append(HighScore_ValidChars[this.f331M[i9]]);
                    }
                    if (m203a(stringBuffer.toString())) {
                        this.Text_ProgressElements = this.Text_Main[89];
                        break;
                    } else {
                        this.Text_ProgressElements = this.Text_Main[88];
                        break;
                    }
                } else if (this.Input_Array[3]) {
                    this.f332bS--;
                    if (this.f332bS < 0) {
                        this.f332bS = 7;
                        break;
                    }
                } else if (this.Input_Array[4]) {
                    this.f332bS++;
                    if (this.f332bS > 7) {
                        this.f332bS = 0;
                        break;
                    }
                } else if (this.Input_Array[2]) {
                    int[] iArr2 = this.f331M;
                    int i10 = this.f332bS;
                    iArr2[i10] = iArr2[i10] + 1;
                    if (this.f331M[this.f332bS] > HighScore_ValidChars.length - 7) {
                        iArr = this.f331M;
                        i = this.f332bS;
                        length = 0;
                        iArr[i] = length;
                        break;
                    }
                } else if (this.Input_Array[1]) {
                    int[] iArr3 = this.f331M;
                    int i11 = this.f332bS;
                    iArr3[i11] = iArr3[i11] - 1;
                    if (this.f331M[this.f332bS] < 0) {
                        iArr = this.f331M;
                        i = this.f332bS;
                        length = HighScore_ValidChars.length - 7;
                        iArr[i] = length;
                    }
                }
                break;
            case 18:
                if (this.f159I) {
                    m101d(false);
                    this.Menu_ID = (byte) this.f326aG;
                    break;
                }
                break;
        }
        this.Input_Array[5] = false;
        this.Input_Array[6] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x083a  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Menu_Draw() {
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
        int i9;
        int i10;
        int i11;
        int i12;
        String[] strArr;
        char c;
        String str;
        switch (this.Menu_ID) {
            case 0:
                GFX_Painter.setColor(16777215);
                GFX_Painter.fillRect(0, 0, GFX_MenuWidth, GFX_MenuHeight); // Fill the screen with white
                GFX_Painter.drawImage(GFX_MenuArray[0], GFX_MenuWidth >> 1, f12f + (f173e >> 1), 3);
                if (this.f152bP < 30) {
                    int i13 = (GFX_MenuWidth * this.f152bP) / 30;
                    GFX_Painter.fillRect((i13 - GFX_MenuWidth) - 10, f13i, GFX_MenuWidth, f175h);
                    GFX_Painter.fillRect(i13 + 10, f13i, GFX_MenuWidth, f175h);
                    int i14 = i13 - 11;
                    GFX_Painter.drawLine(i14 + 2, 0, i14 + 2, GFX_MenuHeight);
                    GFX_Painter.drawLine(i14 + 3, 0, i14 + 3, GFX_MenuHeight);
                    GFX_Painter.drawLine(i14 + 5, 0, i14 + 5, GFX_MenuHeight);
                    GFX_Painter.drawLine(i14 + 8, 0, i14 + 8, GFX_MenuHeight);
                    int i15 = i13 + 10;
                    GFX_Painter.drawLine(i15 - 2, 0, i15 - 2, GFX_MenuHeight);
                    GFX_Painter.drawLine(i15 - 3, 0, i15 - 3, GFX_MenuHeight);
                    GFX_Painter.drawLine(i15 - 5, 0, i15 - 5, GFX_MenuHeight);
                    GFX_Painter.drawLine(i15 - 8, 0, i15 - 8, GFX_MenuHeight);
                    return;
                }
                return;
            case 1:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, 0, GFX_MenuWidth, GFX_MenuHeight);
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth >> 1, f12f + (f173e >> 1), 3);
                return;
            case 2:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f12f, GFX_MenuWidth, f173e);
                m261F();
                GFX_Painter.setColor(16777215);
                String str2 = this.Text_Main[this.f229a[2][this.Game_Settings[2]]];
                int stringWidth = f168a.stringWidth(str2);
                int i16 = f12f + (f173e >> 1);
                GFX_Painter.drawString(str2, GFX_MenuWidth >> 1, i16, 65);
                GFX_Painter.drawImage(GFX_MenuArray[1], (GFX_MenuWidth >> 1) + (stringWidth >> 1) + 5, i16, 36);
                GFX_Painter.drawImage(GFX_MenuArray[2], ((GFX_MenuWidth >> 1) - (stringWidth >> 1)) - 5, i16, 40);
                return;
            case 3:
                m191a(true, false);
                m149ax();
                m261F();
                int i17 = f13i + f175h;
                if (this.f34d >= 12) {
                    m200a(this.Text_Main[0], GFX_MenuWidth >> 1, i17, 16777215, 0);
                    return;
                }
                return;
            case 4:
                m191a(true, false);
                m149ax();
                m261F();
                int i18 = f13i + f175h;
                if (this.f154az > 0) {
                    this.Text_Main[2] = this.Text_Main[70];
                }
                m200a(this.Text_Main[2 + this.Menu_CurrentSelection], GFX_MenuWidth >> 1, i18, 16777215, 16386570);
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth - 5, i18 + (f169a >> 1), 6);
                GFX_Painter.drawImage(GFX_MenuArray[2], 2, i18 + (f169a >> 1), 6);
                m196a(this.f32a, true);
                return;
            case 5:
                int height = GFX_Painter.getFont().getHeight();
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                this.f40N = false;
                for (int i19 = this.f39f; i19 < 5; i19++) {
                    if (f12f + 42 + (height * (i19 - this.f39f)) + f169a < f13i + f175h) {
                        GFX_Painter.drawString(new StringBuffer().append("").append(i19 + 1).append(" ").append(HighScore_DefaultNames[i19]).append(" ").append(HighScore_DefaultScores[i19]).toString(), 6, f12f + 42 + (height * (i19 - this.f39f)), 20);
                        GFX_Painter.drawString(this.Text_Main[31 + HighScore_DefaultDifficulties[i19]], GFX_MenuWidth - 6, f12f + 42 + (height * (i19 - this.f39f)), 24);
                    } else {
                        this.f40N = true;
                    }
                }
                if (this.f39f > 0) {
                    m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[3], GFX_MenuWidth >> 1, 0, 17, true);
                }
                if (this.f40N) {
                    m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[1], GFX_MenuWidth >> 1, f175h - GFX_MenuArray[1].getHeight(), 17, true);
                }
                int i20 = f13i + f175h;
                m196a(this.Text_Main[5], false);
                m200a(this.Text_Main[20], GFX_MenuWidth >> 1, i20, 16777215, 0);
                return;
            case 6:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                m196a(this.Text_Main[21], false);
                m197a(this.Text_Main[24], 2, 0, this.Menu_CurrentSelection == 0);
                m197a(this.Text_Main[25], 2, 1, this.Menu_CurrentSelection == 1);
                return;
            case 7:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                GFX_Painter.drawString(this.Text_Main[26], GFX_MenuWidth >> 1, (f12f + (f173e >> 1)) - 25, 17);
                GFX_Painter.drawString(this.Text_Main[27], GFX_MenuWidth >> 1, f12f + (f173e >> 1) + 2, 17);
                return;
            case 8:
                m191a(true, true);
                GFX_Painter.setColor(16777215);
                int[] iArr = new int[3];
                int width = GFX_MenuArray[1].getWidth();
                GFX_MenuArray[2].getWidth();
                int i21 = f171c - width;
                if (this.Game_Settings[1] > 1) {
                    this.Game_Settings[1] = 1;
                }
                for (int i22 = 0; i22 < this.f229a.length; i22++) {
                    iArr[i22] = GFX_Painter.getFont().stringWidth(this.Text_Main[this.f229a[i22][this.Game_Settings[i22]]]);
                    GFX_Painter.drawString(this.Text_Main[28 + i22], 11, f13i + 4 + (i22 * 22), 20);
                    GFX_Painter.drawString(this.Text_Main[this.f229a[i22][this.Game_Settings[i22]]], i21, f13i + 4 + (i22 * 22), 24);
                }
                GFX_Painter.drawImage(GFX_MenuArray[1], i21 + width, f13i + (this.Menu_CurrentSelection * 22) + (f169a >> 1), 10);
                GFX_Painter.getFont().stringWidth(this.Text_Main[this.f229a[this.Menu_CurrentSelection][this.Game_Settings[this.Menu_CurrentSelection]]]);
                GFX_Painter.drawImage(GFX_MenuArray[2], i21 - iArr[this.Menu_CurrentSelection], f13i + (this.Menu_CurrentSelection * 22) + (f169a >> 1), 10);
                m261F();
                m147az();
                m196a(this.Text_Main[6], false);
                return;
            case 9:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                m197a(this.Text_Main[47], 2, 0, this.Menu_CurrentSelection == 0);
                m197a(this.Text_Main[48], 2, 1, this.Menu_CurrentSelection == 1);
                f168a.stringWidth(this.Text_Main[47 + this.Menu_CurrentSelection]);
                m147az();
                return;
            case 10:
                GFX_Painter.setFont(f41b);
                int height2 = GFX_Painter.getFont().getHeight();
                m191a(true, true);
                m261F();
                int[] iArr2 = {5, 0, 3, 2, 1, 4};
                if (this.Menu_CurrentSelection != 25) {
                    if (this.Menu_CurrentSelection > 10 && this.Menu_CurrentSelection < 17) {
                        graphics = GFX_Painter;
                        image = GFX_GameArray[42];
                        i = 0;
                        i2 = iArr2[this.Menu_CurrentSelection - 11] * 16 * 2;
                        i3 = 32;
                        i4 = 32;
                        i5 = f179a[0];
                        i6 = GFX_MenuWidth;
                        i7 = 4;
                    }
                    i8 = f12f + 42;
                    i9 = (f175h + f13i) - height2;
                    i10 = this.f39f;
                    GFX_Painter.setColor(16777215);
                    while (i8 < i9 && i10 < this.f38a.size()) {
                        GFX_Painter.drawString((String) this.f38a.elementAt(i10), GFX_MenuWidth >> 1, i8, 17);
                        i8 += height2;
                        i10++;
                    }
                    if (i10 >= this.f38a.size()) {
                        this.f40N = true;
                        m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[1], GFX_MenuWidth >> 1, f175h, 33, true);
                    } else {
                        this.f40N = false;
                    }
                    if (this.f39f > 0) {
                        m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[3], GFX_MenuWidth >> 1, 0, 17, true);
                    }
                    m196a(this.Text_Manual[this.Menu_CurrentSelection * 2], false);
                    m45m(24);
                    return;
                }
                graphics = GFX_Painter;
                image = GFX_GameArray[36];
                i = 0;
                i2 = 16;
                i3 = 16;
                i4 = 64;
                i5 = f179a[0];
                i6 = GFX_MenuWidth;
                i7 = 1;
                m195a(graphics, image, i, i2, i3, i4, i5, i6 - i7, f175h - 2, 40, true);
                i8 = f12f + 42;
                i9 = (f175h + f13i) - height2;
                i10 = this.f39f;
                GFX_Painter.setColor(16777215);
                while (i8 < i9) {
                    GFX_Painter.drawString((String) this.f38a.elementAt(i10), GFX_MenuWidth >> 1, i8, 17);
                    i8 += height2;
                    i10++;
                }
                if (i10 >= this.f38a.size()) {
                }
                if (this.f39f > 0) {
                }
                m196a(this.Text_Manual[this.Menu_CurrentSelection * 2], false);
                m45m(24);
                return;
            case 11:
                GFX_Painter.setColor(16777215);
                GFX_Painter.fillRect(0, 0, f171c, GFX_MenuHeight);
                GFX_Painter.drawImage(GFX_MenuArray[2], 0, 0, 20);
                if (this.f152bP >= 120) {
                    GFX_Painter.setColor(0);
                    int i23 = ((this.f152bP - 120) * (GFX_MenuWidth >> 1)) / 30;
                    for (int i24 = 0; i24 < (i23 << 1); i24 += 2) {
                        GFX_Painter.drawLine(i24, 0, i24, GFX_MenuHeight);
                        GFX_Painter.drawLine((GFX_MenuWidth - 1) - i24, 0, (GFX_MenuWidth - 1) - i24, GFX_MenuHeight);
                    }
                    return;
                }
                return;
            case 12:
                int i25 = f169a + 2;
                m191a(true, true);
                m261F();
                switch (this.Game_Settings[2]) {
                    case 0:
                    case 1:
                    case 2:
                        strArr = this.Text_Manual;
                        c = '7';
                        str = "Version 1.0.46";
                        strArr[c] = str;
                        int i26 = f13i + 5;
                        int i27 = (f175h + f13i) - i25;
                        i11 = this.f39f;
                        i12 = (this.Menu_CurrentSelection * 7) + 52;
                        if (i12 + 6 >= this.Text_Manual.length) {
                            this.Menu_CurrentSelection = (byte) 1;
                        }
                        if (this.Menu_CurrentSelection >= 0) {
                            GFX_Painter.setColor(16777215);
                            while (i26 < i27 && i11 < 5) {
                                if (this.Text_Manual[1 + i12 + i11] != null) {
                                    GFX_Painter.drawString(this.Text_Manual[1 + i12 + i11], GFX_MenuWidth >> 1, i26, 17);
                                }
                                i26 += i25;
                                i11++;
                            }
                        }
                        if (i11 >= 5) {
                            this.f40N = true;
                            m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[1], GFX_MenuWidth >> 1, f175h, 33, true);
                        } else {
                            this.f40N = false;
                        }
                        if (this.f39f > 0) {
                            m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f179a[3], GFX_MenuWidth >> 1, 0, 17, true);
                        }
                        m196a(this.Text_Manual[i12], false);
                        m45m(6);
                        return;
                    case 3:
                        strArr = this.Text_Manual;
                        c = '7';
                        str = "Versión 1.0.46";
                        strArr[c] = str;
                        int i262 = f13i + 5;
                        int i272 = (f175h + f13i) - i25;
                        i11 = this.f39f;
                        i12 = (this.Menu_CurrentSelection * 7) + 52;
                        if (i12 + 6 >= this.Text_Manual.length) {
                        }
                        if (this.Menu_CurrentSelection >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f39f > 0) {
                        }
                        m196a(this.Text_Manual[i12], false);
                        m45m(6);
                        return;
                    case 4:
                        strArr = this.Text_Manual;
                        c = '7';
                        str = "Versione 1.0.46";
                        strArr[c] = str;
                        int i2622 = f13i + 5;
                        int i2722 = (f175h + f13i) - i25;
                        i11 = this.f39f;
                        i12 = (this.Menu_CurrentSelection * 7) + 52;
                        if (i12 + 6 >= this.Text_Manual.length) {
                        }
                        if (this.Menu_CurrentSelection >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f39f > 0) {
                        }
                        m196a(this.Text_Manual[i12], false);
                        m45m(6);
                        return;
                    default:
                        int i26222 = f13i + 5;
                        int i27222 = (f175h + f13i) - i25;
                        i11 = this.f39f;
                        i12 = (this.Menu_CurrentSelection * 7) + 52;
                        if (i12 + 6 >= this.Text_Manual.length) {
                        }
                        if (this.Menu_CurrentSelection >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f39f > 0) {
                        }
                        m196a(this.Text_Manual[i12], false);
                        m45m(6);
                        return;
                }
            case 13:
                m191a(true, true);
                GFX_Painter.setColor(16777215);
                int i28 = (f175h - 4) / 22;
                byte b = 0;
                if (i28 < 7 && this.Menu_CurrentSelection + 2 > i28) {
                    b = (this.Menu_CurrentSelection - i28) + 1;
                }
                int i29 = f13i + 4 + ((0 - b) * 22);
                GFX_Painter.drawString(this.Text_Main[81], 11, i29, 20);
                GFX_Painter.drawString(this.Text_Main[this.Cheats_Active[0] ? '\"' : '#'], GFX_MenuWidth - 10, i29, 24);
                int i30 = i29 + 22;
                GFX_Painter.drawString(this.Text_Main[83], 11, i30, 20);
                GFX_Painter.drawString(this.Text_Main[this.Cheats_Active[2] ? '\"' : '#'], GFX_MenuWidth - 10, i30, 24);
                int i31 = i30 + 22;
                GFX_Painter.drawString(this.Text_Main[84], 11, i31, 20);
                GFX_Painter.drawString(String.valueOf(this.f318ay), GFX_MenuWidth - 10, i31, 24);
                int i32 = i31 + 22;
                GFX_Painter.drawString(this.Text_Main[82], 11, i32, 20);
                GFX_Painter.drawString(this.Text_Main[this.Cheats_Active[1] ? '\"' : '#'], GFX_MenuWidth - 10, i32, 24);
                int i33 = i32 + 22;
                GFX_Painter.drawString("COORDS", 11, i33, 20);
                GFX_Painter.drawString(this.Text_Main[this.Cheats_Active[3] ? '\"' : '#'], GFX_MenuWidth - 10, i33, 24);
                int i34 = i33 + 22;
                GFX_Painter.drawString("CAMERA", 11, i34, 20);
                GFX_Painter.drawString(this.Text_Main[this.Cheats_Active[4] ? '\"' : '#'], GFX_MenuWidth - 10, i34, 24);
                GFX_Painter.drawString("PLAY ENDING", 11, i34 + 22, 20);
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth - 8, f13i + ((this.Menu_CurrentSelection - b) * 22) + 8, 20);
                GFX_Painter.drawImage(GFX_MenuArray[2], (GFX_MenuWidth - f168a.stringWidth(this.Text_Main[35])) - 12, f13i + ((this.Menu_CurrentSelection - b) * 22) + 8, 24);
                m261F();
                m196a("CHEATS", false);
                return;
            case 14:
                m191a(true, true);
                m261F();
                m196a(this.Text_Main[85], false);
                m197a(this.Text_Main[24], 2, 0, this.Menu_CurrentSelection == 0);
                m197a(this.Text_Main[25], 2, 1, this.Menu_CurrentSelection == 1);
                return;
            case 15:
            default:
                return;
            case 16:
                m236Z();
                return;
            case 17:
                m172aa();
                return;
            case 18:
                return;
        }
    }

    /* renamed from: a */
    public final void m197a(String str, int i, int i2, boolean z) {
        Font font = GFX_Painter.getFont();
        int stringWidth = font.stringWidth(str);
        int height = font.getHeight();
        int i3 = height + 2;
        int i4 = (i2 * i3) + ((GFX_MenuHeight - (i * i3)) >> 1);
        m200a(str, f171c >> 1, i4, 16777215, 0);
        Image image = null;
        if (GFX_MenuArray != null) {
            image = GFX_MenuArray[4];
        }
        if (image == null) {
            image = GFX_GameArray[0];
        }
        if (z) {
            int width = image.getWidth() >> 1;
            int height2 = image.getHeight() >> 2;
            int i5 = (this.f35b >> 3) * height2;
            m195a(GFX_Painter, image, 0, i5, width, height2, f179a[0], ((f171c >> 1) - (stringWidth >> 1)) - 15, (i4 - f12f) + (height >> 1), 3, false);
            m195a(GFX_Painter, image, 0, i5, width, height2, f179a[0], (f171c >> 1) + (stringWidth >> 1) + 15, (i4 - f12f) + (height >> 1), 3, false);
        }
    }

    /* renamed from: m */
    private void m45m(int i) {
        Graphics graphics;
        int i2;
        int i3;
        int i4 = f13i + f175h;
        int i5 = i4 + 1;
        int i6 = GFX_MenuWidth - 30;
        int i7 = i6 / i;
        GFX_Painter.setColor(2257915);
        GFX_Painter.fillRect(15, i4, i6, 7);
        GFX_Painter.setColor(410260);
        GFX_Painter.drawRect(14, i4, i6 + 1, 7);
        GFX_Painter.setColor(8506866);
        if (this.Menu_CurrentSelection > 22) {
            int i8 = this.Menu_CurrentSelection - 2;
            graphics = GFX_Painter;
            i2 = 15;
            i3 = i8;
        } else {
            graphics = GFX_Painter;
            i2 = 15;
            i3 = this.Menu_CurrentSelection;
        }
        graphics.fillRect(i2 + ((i3 * i6) / i), i5, i7, 5);
        GFX_Painter.drawImage(GFX_MenuArray[1], 15 + i6 + 5, i4, 20);
        GFX_Painter.drawImage(GFX_MenuArray[2], 7, i4, 20);
    }

    /* renamed from: ax */
    private void m149ax() {
        Graphics graphics;
        Image image;
        int i;
        int i2;
        int i3;
        int[][] iArr;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        m195a(GFX_Painter, GFX_MenuArray[0], f221l[0][0], f221l[0][1], f221l[0][2], f221l[0][3], f179a[0], GFX_MenuWidth >> 1, (f173e >> 1) - 0, 3, false);
        int i9 = (10 - this.f152bP) * 3;
        switch (this.f34d >> 1) {
            case 0:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f221l[1][0];
                i2 = f221l[1][1];
                i3 = f221l[1][2];
                i4 = f221l[1][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = ((f173e >> 1) + i9) - 0;
                i8 = 33;
                break;
            case 1:
                m195a(GFX_Painter, GFX_MenuArray[0], f221l[2][0], f221l[2][1], f221l[2][2], f221l[2][3], f179a[0], (GFX_MenuWidth >> 1) + 5, (f173e >> 1) - 0, 33, false);
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f221l[3][0];
                i2 = f221l[3][1];
                i3 = f221l[3][2];
                i4 = f221l[3][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f173e >> 1) - 0;
                i8 = 33;
                break;
            case 2:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f221l[4][0];
                i2 = f221l[4][1];
                i3 = f221l[4][2];
                i4 = f221l[4][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f173e >> 1) - 0;
                i8 = 33;
                break;
            case 3:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f221l[5][0];
                i2 = f221l[5][1];
                i3 = f221l[5][2];
                i4 = f221l[5][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f173e >> 1) - 0;
                i8 = 33;
                break;
            case 4:
                m195a(GFX_Painter, GFX_MenuArray[0], f221l[6][0], f221l[6][1], f221l[6][2], f221l[6][3], f179a[0], (GFX_MenuWidth >> 1) + 5, (f173e >> 1) - 0, 40, false);
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f221l[7][0];
                i2 = f221l[7][1];
                i3 = f221l[7][2];
                iArr = f221l;
                c = 7;
                i4 = iArr[c][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f173e >> 1) - 0;
                i8 = 36;
                break;
            default:
                m195a(GFX_Painter, GFX_MenuArray[0], f221l[8][0], f221l[8][1], f221l[8][2], f221l[8][3], f179a[0], (GFX_MenuWidth >> 1) + 5, (f173e >> 1) - 0, 40, false);
                m195a(GFX_Painter, GFX_MenuArray[0], f221l[9][0], f221l[9][1], f221l[9][2], f221l[9][3], f179a[0], ((GFX_MenuWidth >> 1) + 5) - 30, ((f173e >> 1) - 0) - 22, 36, false);
                if (((this.f152bP >> 1) & 1) == 0) {
                    graphics = GFX_Painter;
                    image = GFX_MenuArray[0];
                    i = f221l[10][0];
                    i2 = f221l[10][1];
                    i3 = f221l[10][2];
                    iArr = f221l;
                    c = '\n';
                } else {
                    graphics = GFX_Painter;
                    image = GFX_MenuArray[0];
                    i = f221l[11][0];
                    i2 = f221l[11][1];
                    i3 = f221l[11][2];
                    iArr = f221l;
                    c = 11;
                }
                i4 = iArr[c][3];
                i5 = f179a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f173e >> 1) - 0;
                i8 = 36;
                break;
        }
        m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
        m195a(GFX_Painter, GFX_MenuArray[0], f221l[12][0], f221l[12][1], f221l[12][2], f221l[12][3], f179a[0], GFX_MenuWidth >> 1, ((f173e >> 1) - 1) - 0, 17, false);
    }

    /* renamed from: b */
    public static void UI_DrawBorderLines(int startxpos, int i, int width, int height) {
        if ((GFX_MenuHeight & 1) == 1 && i != 0) {
            height++;
        }
        GFX_Painter.setClip(startxpos, i, width, height);
        int color = GFX_Painter.getColor();
        for (int i2 = 0; i2 < height; i2++) {
            int lineypos = i2 + i;
            GFX_Painter.setColor(lineypos == 0 ? 8506866 : lineypos % 3 == 0 ? 1858252 : 2257915);
            GFX_Painter.drawLine(startxpos, lineypos, startxpos + width, lineypos);
        }
        if (startxpos == 0) {
            GFX_Painter.setColor(2257915);
            GFX_Painter.drawRect(startxpos, i, 1, height);
        }
        GFX_Painter.setColor(color);
        GFX_Painter.setClip(0, 0, f171c, GFX_MenuHeight);
    }

    /* renamed from: E */
    public static void m263E() {
        if (GFX_HUDArray[8] != null) {
            GFX_Painter.drawImage(GFX_HUDArray[8], GFX_MenuWidth - 2, (f12f + f173e) - 5, 40);
        }
    }

    /* renamed from: a */
    public static void UI_DrawOutlinedString(String str, int xpos, int ypos, int innercolor, int outercolor, int anchor) {
        GFX_Painter.setColor(outercolor);
        GFX_Painter.drawString(str, xpos - 1, ypos, anchor); // Draw outline on left side
        GFX_Painter.drawString(str, xpos + 1, ypos, anchor); // Right side
        GFX_Painter.drawString(str, xpos, ypos + 1, anchor); // Top
        GFX_Painter.drawString(str, xpos, ypos - 1, anchor); // Bottom
        GFX_Painter.setColor(innercolor);
        GFX_Painter.drawString(str, xpos, ypos, anchor); // Now draw the text itself
    }

    /* renamed from: a */
    public final void m200a(String str, int xpos, int ypos, int innercolor, int outercolor) {
        UI_DrawOutlinedString(str, xpos, ypos, innercolor, outercolor, 17);
    }

    /* renamed from: F */
    public final void m261F() {
        UI_DrawBorderLines(0, 0, GFX_MenuWidth, f13i);
        UI_DrawBorderLines(0, f13i + f175h, GFX_MenuWidth, f13i);
    }

    /* renamed from: n */
    private void m41n(int i) {
        this.f32a = this.Text_Main[i];
        this.f31bb = 0;
    }

    /* renamed from: ay */
    private void m148ay() {
        this.f31bb = (this.f31bb + 1) % (f168a.stringWidth(this.f32a) + 218);
    }

    /* renamed from: a */
    public final void m196a(String instr, boolean z) {
        String outstr;
        int xpos;
        int ypos;
        int innercolor;
        int outercolor;
        int anchor;
        int i = (f13i >> 1) - (f169a >> 1);
        int i2 = i;
        if (i < 2) {
            i2 = 2;
        }
        if (z) {
            outstr = instr;
            xpos = GFX_MenuWidth - this.f31bb;
            ypos = i2;
            innercolor = 16777215;
            outercolor = 0;
            anchor = 20;
        } else {
            outstr = instr;
            xpos = GFX_MenuWidth >> 1;
            ypos = i2;
            innercolor = 16777215;
            outercolor = 0;
            anchor = 17;
        }
        UI_DrawOutlinedString(outstr, xpos, ypos, innercolor, outercolor, anchor);
    }

    /* renamed from: az */
    private void m147az() {
        UI_DrawOutlinedString(this.f32a, GFX_MenuWidth - this.f31bb, f13i + f175h + 2, 16777215, 0, 20);
    }

    /* renamed from: a */
    private void m191a(boolean z, boolean z2) {
        Background_Renderer.m388a(GFX_Painter, this.f226j * 5, 120, z);
        if (z2) {
            GFX_Painter.setColor(0);
            for (int i = 0; i < f175h; i += 2) {
                GFX_Painter.drawLine(0, f13i + i, GFX_MenuWidth, f13i + i);
            }
        }
        this.f226j++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[LOOP:0: B:14:0x00ae->B:16:0x00b4, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m101d(boolean z) {
        Audio_Player musicplayer;
        int musicid;
        int i;
        GFX_UnloadArray(GFX_GameArray);
        m37o(3);
        if (!z) {
            GFX_UnloadArray(GFX_MenuArray);
            Background_Renderer.BG_Initialize(0, 0);
            GFX_MenuArray[0] = GFX_Load("/t_title.png");
            GFX_MenuArray[1] = GFX_Load("/t_cur1.png");
            GFX_MenuArray[2] = GFX_Load("/t_cur2.png");
            GFX_MenuArray[4] = GFX_Load("/ring.png");
            if (this.f240M) {
                this.f240M = false;
                this.Menu_ID = (byte) 2;
                return;
            }
            GFX_LoadHUD();
            this.Menu_ID = (byte) 3;
            m37o(0);
            if (this.f121ai != 3) {
                musicplayer = this.Music_MainPlayer;
                musicid = 9;
            }
            this.f152bP = 0;
            for (i = 0; i < 10; i++) {
                this.f223g[i] = false;
            }
            this.f35b = (byte) 0;
            m79g();
        }
        GFX_MenuArray[0] = GFX_Load("/t_license1.png");
        GFX_MenuArray[1] = GFX_Load("/t_license2.png");
        GFX_MenuArray[2] = GFX_Load("/ifone.png");
        this.Menu_ID = (byte) 0;
        musicplayer = this.Music_MainPlayer;
        musicid = 20;
        musicplayer.Music_Play(musicid, 1, false);
        this.f152bP = 0;
        while (i < 10) {
        }
        this.f35b = (byte) 0;
        m79g();
    }

    /* renamed from: aA */
    private void Text_LoadLang() {
        int line = 0;
        try { // Load language file.
            InputStream langpath = SetCurrentResource(new StringBuffer().append("/lang_").append((int) this.Game_Settings[2]).append(".txt").toString()); // Load language file.
            ByteArrayOutputStream langout = new ByteArrayOutputStream(300);
            byte[] textindex = new byte[1]; // Not exactly sure why this exists?
            while (langpath.read(textindex) > 0) {
                if (textindex[0] == 13) {
                    langpath.read(textindex);
                    this.Text_Main[line] = new String(langout.toByteArray(), "UTF-8"); // Copy language text to main text array.
                    langout.reset();
                    line++;
                } else {
                    langout.write(textindex);
                }
            }
            CloseCurrentResource();
            langout.close(); // Clean up our mess.
            InputStream manualpath = SetCurrentResource(new StringBuffer().append("/manual_").append((int) this.Game_Settings[2]).append(".txt").toString()); // Load manual file
            ByteArrayOutputStream manualout = new ByteArrayOutputStream(300);
            line = 0;
            while (manualpath.read(textindex) > 0) {
                if (textindex[0] == 13) {
                    manualpath.read(textindex);
                    this.Text_Manual[line] = new String(manualout.toByteArray(), "UTF-8"); // Copy manual file text to manual text array.
                    manualout.reset();
                    line++;
                } else {
                    manualout.write(textindex);
                }
            }
            CloseCurrentResource();
            manualout.close(); // Clean up our mess.
        } catch (Exception unused) {
            System.err.println(new StringBuffer().append((int) this.Game_Settings[2]).append(": error on line: ").append(line + 1).toString()); // If the text file can't be found, print an error.
        }
    }

    /* renamed from: aB */
    private static void GFX_LoadHUD() {
        GFX_HUDArray[10] = GFX_Load("/Systxt.png");
        GFX_HUDArray[13] = GFX_Load("/Systxt2.png");
        GFX_HUDArray[11] = GFX_Load("/windou_time.png");
        GFX_HUDArray[12] = GFX_Load("/windou_suuji.png");
        GFX_HUDArray[14] = GFX_Load("/gameover.png");
        GFX_HUDArray[15] = GFX_Load("/timeover.png");
        GFX_HUDArray[1] = GFX_Load("/windou_ring.png");
        GFX_HUDArray[2] = GFX_Load("/windou_zanki.png");
        GFX_HUDArray[3] = GFX_Load("/score.png");
        GFX_HUDArray[4] = GFX_Load("/t_cur1.png");
        GFX_HUDArray[5] = GFX_Load("/t_cur2.png");
    }

    /* renamed from: o */
    private void m37o(int i) {
        String[] strArr;
        char c;
        String str;
        String[] strArr2;
        char c2;
        String str2;
        String[] strArr3;
        char c3;
        String[] strArr4;
        char c4;
        Game game;
        String[] strArr5;
        char c5;
        String[] strArr6;
        char c6;
        String[] strArr7;
        char c7;
        switch (i) {
            case 0:
                if (this.Game_Settings[1] == 0) {
                    strArr6 = this.f225a;
                    c6 = 0;
                    strArr7 = this.Text_Main;
                    c7 = 29;
                } else {
                    strArr6 = this.f225a;
                    c6 = 0;
                    strArr7 = this.Text_Main;
                    c7 = '.';
                }
                strArr6[c6] = strArr7[c7];
                strArr2 = this.f225a;
                c2 = 1;
                strArr5 = this.Text_Main;
                c5 = '-';
                str2 = strArr5[c5];
                break;
            case 1:
                strArr = this.f225a;
                c = 0;
                str = "";
                strArr[c] = str;
                game = this;
                strArr2 = game.f225a;
                c2 = 1;
                strArr5 = this.Text_Main;
                c5 = ',';
                str2 = strArr5[c5];
                break;
            case 2:
                if (this.Game_Settings[1] == 0) {
                    strArr3 = this.f225a;
                    c3 = 0;
                    strArr4 = this.Text_Main;
                    c4 = 29;
                } else {
                    strArr3 = this.f225a;
                    c3 = 0;
                    strArr4 = this.Text_Main;
                    c4 = '.';
                }
                strArr3[c3] = strArr4[c4];
                game = this;
                strArr2 = game.f225a;
                c2 = 1;
                strArr5 = this.Text_Main;
                c5 = ',';
                str2 = strArr5[c5];
                break;
            case 3:
                this.f225a[0] = "";
                strArr2 = this.f225a;
                c2 = 1;
                str2 = "";
                break;
            case 4:
                strArr = this.f225a;
                c = 0;
                str = this.Text_Main[90];
                strArr[c] = str;
                game = this;
                strArr2 = game.f225a;
                c2 = 1;
                strArr5 = this.Text_Main;
                c5 = ',';
                str2 = strArr5[c5];
                break;
            default:
                return;
        }
        strArr2[c2] = str2;
    }

    /* renamed from: G */
    public final void m259G() {
        this.f271bq = 0;
        this.f272br = -1;
        this.f273bs = 0;
        this.f274bt = 0;
        for (int i = 0; i < 2; i++) {
            int i2 = f214y[i];
            Camera_Pos[i] = i2;
            this.f279G[i] = i2;
            this.f280H[i] = 0;
            this.f281I[i] = 0;
        }
    }

    /* renamed from: a */
    public final void m223a(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 21) && this.f274bt <= 1 && this.f273bs <= 1 && Math.abs(Player_RoughXPos() - i) < 300 && Math.abs((Player_RoughYPos() + 40) - i2) < 120) {
            this.f273bs = 20;
            this.f272br = 10;
            this.f274bt = 1;
        }
    }

    /* renamed from: c */
    public final void m120c(int i, int i2) {
        if (this.f274bt > 2) {
            return;
        }
        if (this.f274bt != 2 || this.f273bs <= 1) {
            if (Math.abs(Player_RoughXPos() - i) >= (this.Object_Info[4] == 35 ? 48 : 136) || Player_RoughYPos() + 40 <= i2 || Player_RoughYPos() - 320 >= i2) {
                return;
            }
            this.f273bs = 20;
            this.f272br = 8;
            this.f274bt = 2;
        }
    }

    /* renamed from: b */
    public final void m138b(int i, int i2, int i3) {
        if ((i3 == 2 || i3 == 10) && this.f274bt <= 3) {
            if ((this.f274bt != 3 || this.f273bs <= 1) && this.f273bs < 2 && Math.abs(Player_RoughXPos() - i) < 128 && Math.abs(Player_RoughYPos() - i2) < 96) {
                this.f273bs = 20;
                this.f272br = 7;
                this.f274bt = 3;
            }
        }
    }

    /* renamed from: c */
    public final void m118c(int i, int i2, int i3) {
        if (i3 == 2 && this.f274bt <= 4) {
            if ((this.f274bt != 4 || this.f273bs <= 1) && Math.abs(Player_RoughXPos() - i) < 96 && Math.abs(Player_RoughYPos() - i2) < 96) {
                this.f273bs = 20;
                this.f272br = 5;
                this.f274bt = 4;
            }
        }
    }

    /* renamed from: d */
    public final void m103d(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f274bt <= 4) {
            if ((this.f274bt != 4 || this.f273bs <= 1) && Math.abs(Player_RoughXPos() - i) < 96 && Math.abs(Player_RoughYPos() - i2) < 96) {
                this.f273bs = 20;
                this.f272br = 5;
                this.f274bt = 4;
            }
        }
    }

    /* renamed from: e */
    public final void m92e(int i, int i2, int i3) {
        if (i3 == 2 && this.f274bt <= 5) {
            if ((this.f274bt != 5 || this.f273bs <= 1) && Math.abs(Player_RoughXPos() - i) < 96 && Math.abs(Player_RoughYPos() - i2) < 96) {
                this.f273bs = 20;
                this.f272br = 2;
                this.f274bt = 5;
            }
        }
    }

    /* renamed from: f */
    public final void m82f(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f274bt <= 5) {
            if ((this.f274bt != 5 || this.f273bs <= 1) && Math.abs(Player_RoughXPos() - i) < 96 && Math.abs(Player_RoughYPos() - i2) < 96) {
                this.f273bs = 20;
                this.f272br = 2;
                this.f274bt = 5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m257H() {
        Game game;
        int i;
        int[] iArr;
        char c;
        int i2;
        int[] iArr2;
        char c2;
        int i3;
        int[] iArr3;
        char c3;
        int i4;
        int[] iArr4;
        char c4;
        int i5;
        int i6;
        int[] iArr5;
        char c5;
        int i7;
        int Player_RoughXPos = Player_RoughXPos();
        int Player_RoughYPos = Player_RoughYPos();
        if (this.f273bs > 0) {
            this.f273bs--;
            if (this.f273bs == 0) {
                this.f272br = -1;
                this.f274bt = 0;
            }
        }
        if (this.f272br >= 0) {
            game = this;
            i = this.f272br;
        } else {
            this.f274bt = 0;
            if (!this.f286t && !this.f287u) {
                switch (this.Game_ZoneID) {
                    case 0:
                        game = this;
                        i = 1;
                        break;
                    case 2:
                        this.f271bq = 1;
                    case 4:
                        this.f271bq = 1;
                        if (this.Game_ActID == 1 && Math.abs(Player_RoughXPos - 8464) < 240 && Math.abs(Player_RoughYPos - 640) < 80) {
                            game = this;
                            i = 2;
                            break;
                        }
                        break;
                }
                switch (this.f271bq) {
                    case 1:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 0;
                        break;
                    case 2:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 32;
                        break;
                    case 3:
                        iArr = this.f281I;
                        c = 0;
                        i2 = 0;
                        iArr[c] = i2;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 40;
                        break;
                    case 4:
                        if (Player_Info[5] <= 0) {
                            this.f281I[0] = 0;
                            iArr2 = this.f281I;
                            c2 = 1;
                            i3 = 0;
                            break;
                        } else {
                            this.f281I[0] = 0;
                            iArr2 = this.f281I;
                            c2 = 1;
                            i3 = 48;
                            break;
                        }
                    case 5:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = -16;
                        break;
                    case 6:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 0;
                        break;
                    case 7:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 16;
                        break;
                    case 8:
                        this.f281I[0] = 0;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = -32;
                        break;
                    case 9:
                        this.f281I[0] = 36;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 16;
                        break;
                    case 10:
                        iArr = this.f281I;
                        c = 0;
                        i2 = 32;
                        iArr[c] = i2;
                        iArr2 = this.f281I;
                        c2 = 1;
                        i3 = 40;
                        break;
                    default:
                        Camera_Pos[0] = f214y[0];
                        iArr2 = Camera_Pos;
                        c2 = 1;
                        i3 = f214y[1];
                        break;
                }
                iArr2[c2] = i3;
                int abs = Math.abs(f214y[0] - this.f279G[0]);
                int abs2 = Math.abs(f214y[1] - this.f279G[1]);
                if (this.f271bq != 6) {
                    if (abs < 4 || abs > 256) {
                        iArr5 = this.f279G;
                        c5 = 0;
                        i7 = f214y[0];
                    } else {
                        iArr5 = this.f279G;
                        c5 = 0;
                        i7 = iArr5[0] + (f214y[0] > this.f279G[0] ? 4 : -4);
                    }
                    iArr5[c5] = i7;
                    if (abs2 < 4 || abs2 > 256) {
                        iArr4 = this.f279G;
                        c4 = 1;
                        i5 = f214y[1];
                    } else {
                        iArr4 = this.f279G;
                        c4 = 1;
                        i5 = iArr4[1] + (f214y[1] > this.f279G[1] ? 4 : -4);
                    }
                } else {
                    if (abs < 32 || abs > 256) {
                        iArr3 = this.f279G;
                        c3 = 0;
                        i4 = f214y[0];
                    } else {
                        iArr3 = this.f279G;
                        c3 = 0;
                        i4 = iArr3[0] + (f214y[0] > this.f279G[0] ? 32 : -32);
                    }
                    iArr3[c3] = i4;
                    if (abs2 < 16 || abs2 > 256) {
                        iArr4 = this.f279G;
                        c4 = 1;
                        i5 = f214y[1];
                    } else if (abs2 > 32) {
                        this.f279G[1] = f214y[1] > this.f279G[1] ? this.f279G[1] + 32 : this.f279G[1] - 32;
                        if (this.f280H[0] != this.f281I[0]) {
                            int[] iArr6 = this.f280H;
                            iArr6[0] = iArr6[0] + (this.f280H[0] < this.f281I[0] ? 1 : -1);
                        }
                        Camera_Pos[0] = this.f279G[0] + this.f280H[0];
                        if (this.f280H[1] != this.f281I[1]) {
                            int[] iArr7 = this.f280H;
                            iArr7[1] = iArr7[1] + (this.f280H[1] < this.f281I[1] ? 1 : -1);
                        }
                        Camera_Pos[1] = this.f279G[1] + this.f280H[1];
                        int i8 = 0;
                        if (this.f246bh > 0) {
                            i8 = 0 + (this.f246bh << 1);
                        }
                        if (this.f245bg > 0) {
                            i8 -= this.f245bg << 1;
                        }
                        i6 = this.f302K[3] - i8;
                        if (Camera_Pos[1] > i6) {
                            Camera_Pos[1] = i6;
                        }
                        if (Camera_Pos[0] < 0) {
                            Camera_Pos[0] = 0;
                            return;
                        }
                        return;
                    } else {
                        iArr4 = this.f279G;
                        c4 = 1;
                        i5 = iArr4[1] + (f214y[1] > this.f279G[1] ? 16 : -16);
                    }
                }
                iArr4[c4] = i5;
                if (this.f280H[0] != this.f281I[0]) {
                }
                Camera_Pos[0] = this.f279G[0] + this.f280H[0];
                if (this.f280H[1] != this.f281I[1]) {
                }
                Camera_Pos[1] = this.f279G[1] + this.f280H[1];
                int i82 = 0;
                if (this.f246bh > 0) {
                }
                if (this.f245bg > 0) {
                }
                i6 = this.f302K[3] - i82;
                if (Camera_Pos[1] > i6) {
                }
                if (Camera_Pos[0] < 0) {
                }
            } else if (this.Game_ZoneID != 5 || f214y[0] >= 1024) {
                game = this;
                i = 6;
            } else {
                game = this;
                i = 1;
            }
        }
        game.f271bq = i;
        switch (this.f271bq) {
        }
        iArr2[c2] = i3;
        int abs3 = Math.abs(f214y[0] - this.f279G[0]);
        int abs22 = Math.abs(f214y[1] - this.f279G[1]);
        if (this.f271bq != 6) {
        }
        iArr4[c4] = i5;
        if (this.f280H[0] != this.f281I[0]) {
        }
        Camera_Pos[0] = this.f279G[0] + this.f280H[0];
        if (this.f280H[1] != this.f281I[1]) {
        }
        Camera_Pos[1] = this.f279G[1] + this.f280H[1];
        int i822 = 0;
        if (this.f246bh > 0) {
        }
        if (this.f245bg > 0) {
        }
        i6 = this.f302K[3] - i822;
        if (Camera_Pos[1] > i6) {
        }
        if (Camera_Pos[0] < 0) {
        }
    }

    /* renamed from: I */
    public final void m255I() {
        Game game;
        int i;
        Game game2;
        int i2;
        if (this.f296T && this.f136bC > 0) {
            this.f136bC--;
            return;
        }
        if (this.f297U) {
            if (this.f137bD < 0) {
                this.f298C = false;
                this.f297U = false;
                this.f296T = false;
                this.f63B = 0;
                this.f64C = 0;
                this.f65D = 0;
                this.f66E = 0;
                this.f146Y = false;
                this.f278am++;
                this.f278am %= 3;
                if (this.f278am == 0) {
                    m192a(true);
                }
                this.f127g = (byte) (this.f278am + (this.f277al * 3));
                this.f128i = (byte) this.Player_Lives;
                this.f129bx = this.Player_Score;
                if (this.f130j < this.f127g) {
                    this.f130j = this.f127g;
                }
                Record_Save_Game();
                this.Game_ZoneID = f212f[this.f277al][this.f278am];
                this.Game_ActID = f213g[this.f277al][this.f278am];
                m181aC();
                if (this.Game_ZoneID == 0 && this.Game_ActID == 0) {
                    this.f121ai = 8;
                    this.f21aL = 0;
                    m79g();
                } else {
                    this.f268r = true;
                    m163aj();
                    if (this.f334K) {
                        this.f121ai = 7;
                        this.f19aJ = 0;
                    } else {
                        m35p();
                    }
                }
            } else {
                this.f137bD--;
                if (this.f137bD == 10) {
                    this.Music_MainPlayer.Music_Play(19, 1, false);
                }
                if (this.f138bE - this.f137bD > 0) {
                    for (int i3 = 0; i3 < 20; i3++) {
                        if (this.f300bG > 0) {
                            this.f300bG -= 10;
                            Score_Add(10, false);
                        }
                        if (this.f299bF > 0) {
                            this.f299bF -= 10;
                            Score_Add(10, false);
                        }
                    }
                }
            }
        }
        if (this.f296T) {
            this.f298C = true;
            Player_Info[12] = 0;
            int[] iArr = Player_Info;
            iArr[10] = iArr[10] + 128;
        } else {
            this.f228a = true;
        }
        for (int i4 = 0; i4 < this.f242h.length; i4++) {
            if (this.f242h[i4][0] == 1 && this.f44bd >= this.f242h[i4][9]) {
                int i5 = 0;
                while (true) {
                    if (i5 >= 6) {
                        break;
                    }
                    if (this.f43m + this.f242h[i4][8] > this.f242h[i4][2]) {
                        int[] iArr2 = this.f242h[i4];
                        iArr2[2] = iArr2[2] + 1;
                    } else if (this.f43m + this.f242h[i4][8] < this.f242h[i4][2]) {
                        int[] iArr3 = this.f242h[i4];
                        iArr3[2] = iArr3[2] - 1;
                    } else {
                        this.f44bd++;
                        this.f242h[i4][0] = 2;
                        if (this.f44bd >= 5) {
                            if (this.f296T) {
                                m61j();
                                this.f297U = true;
                                this.Player_InvincTime = -1;
                                this.f299bF = this.Player_Rings * 100;
                                this.f300bG = 0;
                                if (this.f59x < 30 && this.f60y == 0 && !this.f146Y) {
                                    game = this;
                                    i = 50000;
                                } else if (this.f59x < 45 && this.f60y == 0) {
                                    game = this;
                                    i = 10000;
                                } else if (this.f60y < 1) {
                                    game = this;
                                    i = 5000;
                                } else if (this.f59x < 30 && this.f60y == 1) {
                                    game = this;
                                    i = 4000;
                                } else if (this.f60y < 2) {
                                    game = this;
                                    i = 3000;
                                } else if (this.f59x >= 30 || this.f60y != 2) {
                                    game = this;
                                    i = 1000;
                                } else {
                                    game = this;
                                    i = 2000;
                                }
                                game.f300bG = i;
                                if (this.f300bG > this.f299bF) {
                                    game2 = this;
                                    i2 = this.f300bG;
                                } else {
                                    game2 = this;
                                    i2 = this.f299bF;
                                }
                                game2.f138bE = i2 / 120;
                                this.f137bD = 330;
                            } else {
                                m61j();
                                if (this.f268r) {
                                    m164ai();
                                    this.f268r = false;
                                    this.f63B = 0;
                                    this.f64C = 0;
                                    this.f65D = 0;
                                    this.f66E = 0;
                                    this.f146Y = false;
                                    m162ak();
                                } else {
                                    m151av();
                                    m162ak();
                                }
                            }
                        }
                    }
                    i5++;
                }
            }
            if (this.f121ai == 2 && !this.f296T) {
                this.f44bd++;
                this.f228a = false;
                if (this.f44bd < 20) {
                    m79g();
                } else if (this.f44bd < 30) {
                    int[] iArr4 = this.f242h[0];
                    iArr4[2] = iArr4[2] + (GFX_MenuWidth / 20);
                    int[] iArr5 = this.f242h[1];
                    iArr5[2] = iArr5[2] + (GFX_MenuWidth / 20);
                    int[] iArr6 = this.f242h[2];
                    iArr6[2] = iArr6[2] + (GFX_MenuWidth / 20);
                    int[] iArr7 = this.f242h[3];
                    iArr7[2] = iArr7[2] - (GFX_MenuWidth / 20);
                    int[] iArr8 = this.f242h[4];
                    iArr8[2] = iArr8[2] - (GFX_MenuWidth / 20);
                    m79g();
                } else if (this.f44bd == 30) {
                    this.f242h[0][0] = 0;
                    this.f242h[1][0] = 0;
                    this.f242h[2][0] = 0;
                    this.f242h[3][0] = 0;
                    this.f242h[4][0] = 0;
                }
            }
        }
    }

    /* renamed from: J */
    public final void m253J() {
        int i = 0;
        for (int i2 = 0; i2 < this.f242h.length; i2++) {
            if (this.f242h[i2][0] >= 1) {
                if (GFX_HUDArray[10] != null) {
                    m195a(GFX_Painter, GFX_HUDArray[10], this.f242h[i2][4], this.f242h[i2][5], this.f242h[i2][6], this.f242h[i2][7], f179a[0], this.f242h[i2][2], this.f242h[i2][3], 20, true);
                }
                if (i < this.f242h[i2][3]) {
                    i = this.f242h[i2][3];
                }
            }
        }
        if (this.f297U) {
            int[] iArr = {this.Player_Score, this.f300bG, this.f299bF};
            int i3 = ((f171c * 30) / 100) - 24;
            int i4 = ((f171c * 90) / 100) - 24;
            int i5 = i + 10;
            for (int i6 = 0; i6 < 3; i6++) {
                m195a(GFX_Painter, GFX_HUDArray[13], 0, i6 * 16, 84, 16, f179a[0], i3, i5 + (16 * i6), 20, true);
                m63i(i4, ((i5 + (16 * i6)) - 36) + 40, iArr[i6]);
            }
            if (this.f300bG == 0 && this.f299bF == 0) {
                m200a(this.Text_Main[0], GFX_MenuWidth >> 1, ((f13i + f175h) - f169a) - 2, 16777215, 0);
            }
        }
    }

    /* renamed from: aC */
    private void m181aC() {
        while (true) {
            for (int i = 0; i < this.Input_Array.length; i++) {
                if (this.Input_Array[i]) {
                    return;
                }
            }
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private int m193a(boolean z) {
        if (this.f244bf < 600) {
            return 17;
        }
        if (this.Player_InvincTime > 0) {
            return 6;
        }
        if (this.f286t) {
            return this.Game_ZoneID == 5 ? 12 : 11;
        } else if (z) {
            switch (this.Game_ZoneID) {
                case 0:
                    return 21;
                case 1:
                    return this.Game_ActID == 3 ? 5 : 1;
                case 2:
                    return 22;
                case 3:
                    return 3;
                case 4:
                    return 23;
                case 5:
                    return this.Game_ActID == 3 ? 12 : 5;
                case 6:
                    return 8;
                default:
                    return 21;
            }
        } else {
            switch (this.Game_ZoneID) {
                case 0:
                    return 0;
                case 1:
                    return this.Game_ActID == 3 ? 5 : 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return this.Game_ActID == 3 ? 12 : 5;
                case 6:
                    return 8;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: e */
    public final void m90e(boolean z) {
        Audio_Player audio_Player;
        int m193a;
        int i = -1;
        if (z) {
            i = 1;
        }
        if (!this.f286t || this.Game_ZoneID >= 5) {
            audio_Player = this.Music_MainPlayer;
            m193a = m193a(z);
        } else {
            audio_Player = this.Music_MainPlayer;
            m193a = 11;
        }
        audio_Player.Music_Play(m193a, i, true);
    }

    /* renamed from: aD */
    private void GFX_LoadGame() {
        Image[] imageArr;
        char c;
        String str;
        GFX_GameArray[151] = GFX_Load("/sonic.png");
        GFX_GameArray[152] = GFX_Load("/sonic_s.png");
        GFX_GameArray[2] = GFX_Load("/sjump.png");
        GFX_GameArray[96] = GFX_Load("/tama.png");
        GFX_GameArray[47] = GFX_Load("/ring_large.png");
        GFX_GameArray[0] = GFX_Load("/ring.png");
        GFX_GameArray[36] = GFX_Load("/save.png");
        GFX_GameArray[42] = GFX_Load("/item.png");
        GFX_GameArray[109] = GFX_Load("/effect.png");
        GFX_GameArray[9] = GFX_Load("/toge.png");
        GFX_GameArray[153] = GFX_Load("/sjump2.png");
        GFX_GameArray[15] = GFX_Load("/switch.png");
        GFX_GameArray[97] = GFX_Load("/bakuhatu.png");
        GFX_GameArray[44] = GFX_Load("/gole.png");
        GFX_GameArray[45] = GFX_Load("/bten.png");
        GFX_GameArray[100] = GFX_Load("/animal.png");
        switch (this.Game_ZoneID) {
            case 0:
                GFX_GameArray[41] = GFX_Load("/musi.png");
                GFX_GameArray[40] = GFX_Load("/hachi.png");
                GFX_GameArray[86] = GFX_Load("/fish.png");
                GFX_GameArray[39] = GFX_Load("/kamere.png");
                GFX_GameArray[57] = GFX_Load("/kani.png");
                GFX_GameArray[3] = GFX_Load("/buranko.png");
                GFX_GameArray[4] = GFX_Load("/thashi.png");
                GFX_GameArray[18] = GFX_Load("/brkabe_g.png");
                GFX_GameArray[5] = GFX_Load("/hashi.png");
                GFX_GameArray[58] = GFX_Load("/jyama.png");
                GFX_GameArray[6] = GFX_Load("/break.png");
                GFX_GameArray[37] = GFX_Load("/kageb.png");
                imageArr = GFX_GameArray;
                c = 16;
                str = "/shima.png";
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            default:
                this.f327J = false;
            case 2:
                GFX_GameArray[40] = GFX_Load("/hachi.png");
                GFX_GameArray[49] = GFX_Load("/imo.png");
                GFX_GameArray[78] = GFX_Load("/bat.png");
                GFX_GameArray[101] = GFX_Load("/fire.png");
                GFX_GameArray[79] = GFX_Load("/ochi.png");
                GFX_GameArray[54] = GFX_Load("/dai.png");
                GFX_GameArray[8] = GFX_Load("/turi.png");
                GFX_GameArray[94] = GFX_Load("/turi2.png");
                GFX_GameArray[95] = GFX_Load("/turi3.png");
                GFX_GameArray[13] = GFX_Load("/yogan2.png");
                GFX_GameArray[99] = GFX_Load("/yogan22.png");
                GFX_GameArray[11] = GFX_Load("/fblock.png");
                GFX_GameArray[77] = GFX_Load("/yoganc.png");
                GFX_GameArray[14] = GFX_Load("/myogan.png");
                GFX_GameArray[98] = GFX_Load("/myogan2.png");
                GFX_GameArray[7] = GFX_Load("/yuka.png");
                GFX_GameArray[27] = GFX_Load("/bryuka.png");
                imageArr = GFX_GameArray;
                c = 3;
                str = "/buranko_m.png";
                break;
            case 4:
                GFX_GameArray[101] = GFX_Load("/fire.png");
                GFX_GameArray[40] = GFX_Load("/hachi.png");
                GFX_GameArray[57] = GFX_Load("/kani.png");
                GFX_GameArray[71] = GFX_Load("/yado.png");
                GFX_GameArray[70] = GFX_Load("/aruma.png");
                GFX_GameArray[60] = GFX_Load("/tekyu.png");
                GFX_GameArray[102] = GFX_Load("/block.png");
                GFX_GameArray[107] = GFX_Load("/dai2_3.png");
                GFX_GameArray[83] = GFX_Load("/dai4_.png");
                GFX_GameArray[17] = GFX_Load("/dai2.png");
                GFX_GameArray[61] = GFX_Load("/signal.png");
                GFX_GameArray[56] = GFX_Load("/bobin.png");
                imageArr = GFX_GameArray;
                c = 16;
                str = "/shima5.png";
                break;
        }
        imageArr[c] = GFX_Load(str);
        this.f327J = false;
    }

    /* renamed from: aE */
    private void GFX_UnloadGame() {
        Image[] imageArr;
        char c;
        GFX_GameArray[2] = null;
        GFX_GameArray[96] = null;
        GFX_GameArray[36] = null;
        GFX_GameArray[42] = null;
        GFX_GameArray[9] = null;
        GFX_GameArray[153] = null;
        GFX_GameArray[15] = null;
        GFX_GameArray[44] = null;
        GFX_GameArray[45] = null;
        switch (this.Game_ZoneID) {
            case 0:
                GFX_GameArray[41] = null;
                GFX_GameArray[40] = null;
                GFX_GameArray[86] = null;
                GFX_GameArray[39] = null;
                GFX_GameArray[57] = null;
                GFX_GameArray[3] = null;
                GFX_GameArray[4] = null;
                GFX_GameArray[18] = null;
                GFX_GameArray[5] = null;
                GFX_GameArray[58] = null;
                GFX_GameArray[6] = null;
                imageArr = GFX_GameArray;
                c = '%';
                break;
            case 1:
            case 3:
            default:
                System.gc();
                this.f327J = true;
            case 2:
                GFX_GameArray[40] = null;
                GFX_GameArray[49] = null;
                GFX_GameArray[78] = null;
                GFX_GameArray[79] = null;
                GFX_GameArray[54] = null;
                GFX_GameArray[8] = null;
                GFX_GameArray[94] = null;
                GFX_GameArray[95] = null;
                GFX_GameArray[13] = null;
                GFX_GameArray[99] = null;
                GFX_GameArray[11] = null;
                GFX_GameArray[77] = null;
                GFX_GameArray[14] = null;
                GFX_GameArray[98] = null;
                GFX_GameArray[7] = null;
                GFX_GameArray[27] = null;
                imageArr = GFX_GameArray;
                c = 3;
                break;
            case 4:
                GFX_GameArray[101] = null;
                GFX_GameArray[40] = null;
                GFX_GameArray[57] = null;
                GFX_GameArray[71] = null;
                GFX_GameArray[70] = null;
                GFX_GameArray[60] = null;
                GFX_GameArray[107] = null;
                GFX_GameArray[83] = null;
                GFX_GameArray[17] = null;
                GFX_GameArray[61] = null;
                GFX_GameArray[56] = null;
                imageArr = GFX_GameArray;
                c = 16;
                break;
        }
        imageArr[c] = null;
        System.gc();
        this.f327J = true;
    }

    /* renamed from: a */
    private static void Record_Save(byte[] savedata, String saveentry) {
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append(saveentry).append("6390").toString(), true);
            openRecordStore.setRecord(1, savedata, 0, savedata.length);
            openRecordStore.closeRecordStore();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static byte[] Record_Load(String saveentry) {
        RecordStore recordStore = null;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append(saveentry).append("6390").toString(), false);
            recordStore = openRecordStore;
            byte[] bArr = new byte[openRecordStore.getRecordSize(1)];
            recordStore.getRecord(1, bArr, 0);
            recordStore.closeRecordStore();
            return bArr;
        } catch (Throwable unused) {
            try {
                recordStore.closeRecordStore();
                return null;
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    /* renamed from: i */
    private static int m65i(int i) {
        switch (i) {
            case 1:
                return f179a[1];
            case 2:
                return f179a[2];
            case 3:
                return f179a[3];
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static boolean m127b(int[] iArr) {
        if (iArr[14] == 0) {
            iArr[5] = 0;
            iArr[6] = 0;
            iArr[7] = 0;
            iArr[10] = 0;
            iArr[11] = 0;
            iArr[12] = iArr[2] * 100;
            iArr[13] = iArr[3] * 100;
            iArr[15] = -1;
            iArr[16] = iArr[2];
            iArr[17] = iArr[3];
            iArr[14] = iArr[14] + 1;
        }
        if (iArr[5] > 0) {
            iArr[5] = iArr[5] - 1;
        }
        iArr[6] = iArr[6] + 1;
        if (iArr[7] > 0) {
            iArr[7] = iArr[7] - 1;
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final void m189a(int[] iArr) {
        m187a(iArr, (this.f111j[iArr[1]][1] >> 1) - 2);
    }

    /* renamed from: a */
    public final void m187a(int[] iArr, int i) {
        int i2 = iArr[3];
        int i3 = i2;
        int i4 = i2 + i;
        if (i3 < 99999) {
            i3++;
        }
        if (m139b(iArr[2], i4)) {
            i3 -= 2;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        iArr[3] = i3;
    }

    /* renamed from: b */
    public static void m128b(int[] iArr) {
        int[] iArr2;
        char c;
        int i;
        if (iArr[19] == 0) {
            iArr2 = iArr;
            c = 19;
            i = 1;
        } else {
            iArr2 = iArr;
            c = 19;
            i = 0;
        }
        iArr2[c] = i;
    }

    /* renamed from: a */
    public final int m224a(int i, int i2, int i3) {
        int i4 = i2 + i3;
        if (m139b(i, i4)) {
            for (int i5 = 0; i5 < 8; i5++) {
                i4--;
                if (!m139b(i, i4)) {
                    break;
                }
            }
        } else {
            for (int i6 = 0; i6 < 8 && !m139b(i, i4 + 1); i6++) {
                i4++;
            }
        }
        int i7 = i4 - i3;
        int i8 = i7;
        if (i7 < 0) {
            i8 = 0;
        }
        return i8;
    }

    /* renamed from: a */
    public final boolean m219a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? (i - i3) - 1 < 0 || m139b((i - i3) - 1, i2 - 12) || !m139b((i - i3) - 1, (i2 + i4) + 10) : m139b((i + i3) + 1, i2 - 12) || !m139b((i + i3) + 1, (i2 + i4) + 10);
    }

    /* renamed from: c */
    public final boolean m111c(int[] iArr) {
        return m219a(iArr[2], iArr[3], this.f111j[iArr[1]][0] >> 1, this.f111j[iArr[1]][1] >> 1, iArr[19] & 1);
    }

    /* renamed from: a */
    public static boolean m185a(int[] iArr, int i, int i2) {
        int Player_RoughXPos = Player_RoughXPos();
        int Player_RoughYPos = Player_RoughYPos() - (f74i ? 16 : 20);
        if (iArr[3] - i2 > Player_RoughYPos || Player_RoughYPos > iArr[3] + i2) {
            return false;
        }
        switch (iArr[19]) {
            case 0:
                return iArr[2] - i < Player_RoughXPos && Player_RoughXPos < iArr[2];
            case 1:
                return iArr[2] < Player_RoughXPos && Player_RoughXPos < iArr[2] + i;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static boolean m119c(int i, int i2) {
        return Math.abs(i - Player_RoughXPos()) > 240 || Math.abs(i2 - Player_RoughYPos()) > 240;
    }

    /* renamed from: a */
    public static boolean m222a(int i, int i2, int i3) {
        int Player_RoughXPos = i - Player_RoughXPos();
        int Player_RoughYPos = i2 - (Player_RoughYPos() - (f74i ? 16 : 20));
        return (Player_RoughXPos * Player_RoughXPos) + (Player_RoughYPos * Player_RoughYPos) < i3 * i3;
    }

    /* renamed from: a */
    public final int m212a(int i, int i2, int i3, int i4, boolean z) {
        if (f72g && f68d) {
            return 0;
        }
        int i5 = (f74i || f76k) ? 12 : 16;
        int Player_RoughXPos = Player_RoughXPos();
        int Player_RoughYPos = Player_RoughYPos() - i5;
        int i6 = (i3 >> 1) + 12;
        int i7 = (i4 >> 1) + i5;
        if (f74i) {
            if (Player_RoughXPos - i6 >= i || i >= Player_RoughXPos + i6 || Player_RoughYPos - i7 >= i2 || i2 >= Player_RoughYPos + i7) {
                return 0;
            }
            if (this.Player_InvincTime <= 0) {
                return ((this.f316G && this.Cheats_Active[0]) || z) ? 1 : 2;
            }
            return 1;
        } else if (Player_RoughXPos - i6 >= i || i >= Player_RoughXPos + i6 || Player_RoughYPos - i7 >= i2 || i2 >= Player_RoughYPos + i7) {
            return 0;
        } else {
            if (this.Player_InvincTime <= 0) {
                return (this.f316G && this.Cheats_Active[0]) ? 1 : 2;
            }
            return 1;
        }
    }

    /* renamed from: d */
    public final boolean m99d(int[] iArr) {
        Game game;
        int i;
        int m212a = m212a(iArr[2], iArr[3], this.f111j[iArr[1]][0], this.f111j[iArr[1]][1], true);
        if (iArr[1] == 71 && m212a == 1 && iArr[3] - 4 > Player_RoughYPos() - 16) {
            m212a = 2;
        }
        if (m212a != 1) {
            if (m212a == 2) {
                Player_Hurt();
                return false;
            }
            return false;
        }
        if (Player_Info[5] > 0) {
            Player_Info[5] = Player_Info[5] > 2560 ? -2560 : -Player_Info[5];
        }
        if (this.f314aw == 0) {
            game = this;
            i = 100;
        } else if (this.f314aw == 100) {
            game = this;
            i = 200;
        } else if (this.f314aw != 200) {
            if (this.f314aw == 500) {
                game = this;
                i = 1000;
            }
            Score_Add(this.f314aw, true);
            m69h(iArr[2], iArr[3], this.f314aw);
            m216a(2, iArr[2], iArr[3], 0, 0, 0, 0);
            m216a(f209b[this.Game_ZoneID][m123c(2)], iArr[2], iArr[3], 0, -300, 0, 0);
            iArr[0] = 0;
            return true;
        } else {
            game = this;
            i = 500;
        }
        game.f314aw = i;
        Score_Add(this.f314aw, true);
        m69h(iArr[2], iArr[3], this.f314aw);
        m216a(2, iArr[2], iArr[3], 0, 0, 0, 0);
        m216a(f209b[this.Game_ZoneID][m123c(2)], iArr[2], iArr[3], 0, -300, 0, 0);
        iArr[0] = 0;
        return true;
    }

    /* renamed from: a */
    public final boolean m186a(int[] iArr, int i) {
        int i2 = iArr[13];
        int i3 = i2;
        int i4 = (i2 / 100) + i;
        boolean z = false;
        if (i3 < 9999900) {
            i3 += 100;
        }
        if (m139b(iArr[12] / 100, i4)) {
            i3 -= 200;
            iArr[11] = 50;
            z = true;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        iArr[13] = i3;
        return z;
    }

    /* renamed from: c */
    private void m116c(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[25];
        if (i < 1) {
            return;
        }
        iArr[0] = 1;
        iArr[1] = i;
        iArr[2] = i2;
        iArr[3] = i3;
        iArr[4] = i4;
        iArr[19] = i5;
        iArr[21] = 1;
        m100d(iArr);
    }

    /* renamed from: K */
    public final void m251K() {
        this.f84i = new int[50][20];
    }

    /* renamed from: a */
    public final void m216a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i < 1) {
            return;
        }
        for (int i8 = 0; i8 < 50; i8++) {
            int[] iArr = this.f84i[i8];
            if (iArr[0] <= 0) {
                for (int i9 = 4; i9 < 20; i9++) {
                    iArr[i9] = 0;
                }
                iArr[0] = 1;
                iArr[1] = i;
                iArr[2] = i2 * 100;
                iArr[3] = i3 * 100;
                iArr[8] = i7;
                iArr[10] = i4;
                iArr[11] = i5;
                iArr[19] = i6;
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m134b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 1) {
            return;
        }
        for (int i7 = 0; i7 < 50; i7++) {
            int[] iArr = this.f84i[i7];
            if (iArr[0] <= 0) {
                for (int i8 = 4; i8 < 20; i8++) {
                    iArr[i8] = 0;
                }
                iArr[0] = 1;
                iArr[1] = i;
                iArr[2] = i2 * 100;
                iArr[3] = i3 * 100;
                iArr[8] = i6;
                iArr[10] = (Math_CalcSine(i4) * i5) / 100;
                iArr[11] = (Math_CalcCosine(i4) * i5) / 100;
                return;
            }
        }
    }

    /* renamed from: k */
    private void m53k(int i, int i2, int i3) {
        if (i3 <= 0) {
            return;
        }
        if (i3 > 32) {
            i3 = 32;
        }
        m91e(i, i2, i3, 256);
        if (i3 > 16) {
            m91e(i, i2, i3 - 16, 128);
        }
    }

    /* renamed from: e */
    private void m91e(int i, int i2, int i3, int i4) {
        int i5 = i3 > 16 ? 16 : i3;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = ((i6 >> 1) * 2250) + 1125;
            if ((i6 & 1) == 1) {
                i7 = (-i7) + 36000;
            }
            m134b(4, i, i2, i7 / 100, i4, 0);
        }
    }

    /* renamed from: g */
    public final void m75g(int i, int i2, int i3) {
        int[] iArr = new int[24];
        i3 = (i3 < 0 || i3 > 5) ? 0 : 0;
        int i4 = 60;
        for (int i5 = 0; i5 < 24; i5++) {
            i4 += 2 + m123c(18);
            iArr[i5] = i4;
        }
        for (int i6 = 0; i6 < 24; i6++) {
            m216a(f209b[i3][m123c(2)], i + (((i6 % 8) * 8) - 32), i2, 0, (-350) + m123c(60), m123c(2), i4 - iArr[i6]);
        }
    }

    /* renamed from: h */
    public final void m69h(int i, int i2, int i3) {
        Game game;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (i3 < 10) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        } else if (i3 < 50) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 1;
        } else if (i3 < 100) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 2;
        } else if (i3 < 200) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 3;
        } else if (i3 < 500) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 4;
        } else if (i3 < 1000) {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 5;
        } else {
            game = this;
            i4 = 6;
            i5 = i;
            i6 = i2;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 6;
        }
        game.m216a(i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: L */
    public final void m250L() {
        int[] iArr;
        char c;
        int i;
        for (int i2 = 0; i2 < 50; i2++) {
            int[] iArr2 = this.f84i[i2];
            if (iArr2[0] > 0) {
                if (iArr2[6] > 600) {
                    iArr = iArr2;
                    c = 0;
                    i = 0;
                } else {
                    m89e(iArr2);
                    if (iArr2[5] > 0) {
                        iArr2[5] = iArr2[5] - 1;
                    }
                    iArr = iArr2;
                    c = 6;
                    i = iArr[6] + 1;
                }
                iArr[c] = i;
            }
        }
    }

    /* renamed from: e */
    private void m89e(int[] iArr) {
        switch (iArr[1]) {
            case 1:
                m80f(iArr);
                return;
            case 2:
                m80f(iArr);
                return;
            case 3:
            case 11:
            case 27:
            default:
                return;
            case 4:
                m74g(iArr);
                return;
            case 5:
                m68h(iArr);
                return;
            case 6:
                m62i(iArr);
                return;
            case 7:
                m57j(iArr);
                return;
            case 8:
                m52k(iArr);
                return;
            case 9:
                m48l(iArr);
                return;
            case 10:
                m44m(iArr);
                return;
            case 12:
                m36o(iArr);
                return;
            case 13:
                m40n(iArr);
                return;
            case 14:
                m33p(iArr);
                return;
            case 15:
                m30q(iArr);
                return;
            case 16:
                m27r(iArr);
                return;
            case 17:
                m24s(iArr);
                return;
            case 18:
                m21t(iArr);
                return;
            case 19:
                m18u(iArr);
                return;
            case 20:
                m16v(iArr);
                return;
            case 21:
                m14w(iArr);
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                m12x(iArr);
                return;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                m254I(iArr);
                return;
        }
    }

    /* renamed from: M */
    public final void m249M() {
        for (int i = 0; i < 50; i++) {
            int[] iArr = this.f84i[i];
            if (iArr[0] > 0) {
                switch (iArr[1]) {
                    case 1:
                    case 2:
                    case 3:
                        m10y(iArr);
                        continue;
                    case 4:
                        m8z(iArr);
                        continue;
                    case 5:
                        m270A(iArr);
                        continue;
                    case 6:
                        m268B(iArr);
                        continue;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        m266C(iArr);
                        continue;
                    case 14:
                        m264D(iArr);
                        continue;
                    case 15:
                        m262E(iArr);
                        continue;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        m260F(iArr);
                        continue;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        m258G(iArr);
                        continue;
                    case 26:
                        m256H(iArr);
                        continue;
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        m252J(iArr);
                        continue;
                }
            }
        }
    }

    /* renamed from: f */
    private static void m80f(int[] iArr) {
        if (iArr[6] > 24) {
            iArr[0] = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
        if (r11 > 500) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
        if (r11 > 500) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
        r0 = 500;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74g(int[] iArr) {
        int i;
        int i2;
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = this.f226j >> 1;
        int i3 = iArr[11];
        int i4 = iArr[2] / 100;
        int i5 = iArr[3] / 100;
        if (m212a(i4, i5, 12, 12, false) != 0) {
            m216a(5, i4, i5, 0, 0, 0, 0);
            this.Player_Rings++;
            iArr[0] = 0;
            return;
        }
        if (i3 > 0) {
            if (m139b(i4, i5 + 4)) {
                i5 = (i5 & (-16)) + (16 - Math.abs((int) this.f263c[((this.Level_Collisions[this.f140aq] & 255) << 4) + (i4 & 15)]));
                i2 = -(i3 >> 1);
            } else {
                i = i3 + 6;
            }
        } else if (m139b(i4, i5 - 4)) {
            for (int i6 = 0; i6 < 3; i6++) {
                i5++;
                if (!m139b(i4, i5 - 4)) {
                    break;
                }
            }
            i2 = -(i3 >> 1);
        } else {
            i = i3 + 6;
        }
        i = i2;
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 > 99999) {
            iArr[0] = 0;
        }
        iArr[3] = i5 * 100;
        iArr[11] = i;
        if (iArr[6] > 300) {
            iArr[0] = 0;
        }
    }

    /* renamed from: h */
    private static void m68h(int[] iArr) {
        iArr[15] = iArr[6] / 8;
        if (iArr[15] > 3) {
            iArr[0] = 0;
        }
    }

    /* renamed from: i */
    private static void m62i(int[] iArr) {
        iArr[3] = iArr[3] - 100;
        if (iArr[6] > 50) {
            iArr[0] = 0;
        }
    }

    /* renamed from: j */
    private void m57j(int[] iArr) {
        if (m212a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = 2 + (this.f226j & 1);
    }

    /* renamed from: k */
    private void m52k(int[] iArr) {
        if (iArr[6] > 10) {
            if (m212a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                Player_Hurt();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
        }
        iArr[15] = 2 + (this.f226j & 1);
    }

    /* renamed from: l */
    private void m48l(int[] iArr) {
        if (iArr[6] > 5) {
            if (m212a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                Player_Hurt();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
            iArr[11] = iArr[11] + 10;
            if (iArr[11] > 600) {
                iArr[11] = 600;
            }
        }
        iArr[15] = 4 + (this.f226j & 1);
    }

    /* renamed from: m */
    private void m44m(int[] iArr) {
        int m228a;
        int abs;
        if (m212a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            Player_Hurt();
        }
        int i = iArr[2];
        int i2 = iArr[3];
        int i3 = iArr[10];
        int i4 = iArr[11] + 10;
        if (i4 > 300) {
            i4 = 300;
        }
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (i4 > 0 && m139b(i5 / 100, (i6 / 100) + 5)) {
            do {
                m228a = m228a(i5 / 100, (i6 / 100) + 5);
                i6 -= 100;
            } while (m139b(i5 / 100, (i6 / 100) + 5));
            if (m228a > 270) {
                abs = -Math.abs(i3);
            } else {
                if (m228a > 15) {
                    abs = Math.abs(i3);
                }
                i4 = -i4;
            }
            i3 = abs;
            i4 = -i4;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 999900) {
            iArr[0] = 0;
        }
        iArr[15] = 8 + (this.f226j & 1);
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[10] = i3;
        iArr[11] = i4;
        if (iArr[6] > 300) {
            m216a(1, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
            iArr[0] = 0;
        }
    }

    /* renamed from: n */
    private void m40n(int[] iArr) {
        if (m212a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 10;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
        iArr[15] = 12 + (this.f226j & 1);
    }

    /* renamed from: o */
    private void m36o(int[] iArr) {
        if (m212a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = 7;
    }

    /* renamed from: p */
    private void m33p(int[] iArr) {
        if (m212a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            Player_Hurt();
        }
        iArr[15] = 11;
        int i = iArr[2];
        int i2 = iArr[3];
        int i3 = iArr[10];
        int i4 = iArr[11] + 10;
        if (i4 > 400) {
            i4 = 400;
        }
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (i4 > 0 && m139b(i5 / 100, (i6 / 100) + 4)) {
            do {
                i6 -= 100;
            } while (m139b(i5 / 100, (i6 / 100) + 4));
            i4 = -i4;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 999900) {
            iArr[0] = 0;
        }
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[10] = i3;
        iArr[11] = i4;
        if (iArr[6] > 180) {
            iArr[0] = 0;
        }
    }

    /* renamed from: q */
    private static void m30q(int[] iArr) {
        if (iArr[6] > 30) {
            iArr[0] = 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: r */
    private void m27r(int[] iArr) {
        int[] iArr2;
        char c;
        switch (iArr[14]) {
            case 2:
                iArr[15] = 4;
                iArr[5] = 8;
                iArr[14] = iArr[14] + 1;
                break;
            case 3:
                break;
            default:
                if (iArr[6] > 4) {
                    if (m212a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
                        Player_Hurt();
                    }
                    iArr[2] = iArr[2] + iArr[10];
                    iArr[3] = iArr[3] + iArr[11];
                    if (iArr[8] == 1) {
                        iArr[11] = iArr[11] + 6;
                        if (iArr[11] > 1000) {
                            iArr[11] = 1000;
                        }
                    }
                }
                if (iArr[10] > 0) {
                    iArr[18] = 3;
                    if (!m139b((iArr[2] / 100) + 15, iArr[3] / 100)) {
                        return;
                    }
                } else if (iArr[10] < 0) {
                    iArr[18] = 1;
                    if (!m139b((iArr[2] / 100) - 15, iArr[3] / 100)) {
                        return;
                    }
                } else if (iArr[11] < 0) {
                    iArr2 = iArr;
                    c = 18;
                    iArr2[c] = 2;
                    return;
                } else if (iArr[11] <= 0) {
                    return;
                } else {
                    iArr[18] = 0;
                    if (!m139b(iArr[2] / 100, (iArr[3] / 100) + 16)) {
                        return;
                    }
                }
                iArr2 = iArr;
                c = 14;
                iArr2[c] = 2;
                return;
        }
        if (iArr[5] > 0) {
            return;
        }
        iArr[0] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m24s(int[] iArr) {
        if (m212a(iArr[2] / 100, (iArr[3] / 100) + 6, 10, 10, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                iArr[11] = iArr[11] + 4;
                if (iArr[11] > 300) {
                    iArr[11] = 300;
                }
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    return;
                }
                m216a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
                m216a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 1, 0);
                iArr[11] = 0;
                iArr[5] = 13;
                iArr[14] = iArr[14] + 1;
                iArr[15] = 4;
                if (iArr[5] <= 0) {
                    return;
                }
                iArr[0] = 0;
                return;
            case 2:
                iArr[15] = 4;
                if (iArr[5] <= 0) {
                }
                break;
            default:
                iArr[10] = 0;
                iArr[11] = 20;
                iArr[18] = 0;
                iArr[19] = 0;
                iArr[14] = 1;
                iArr[11] = iArr[11] + 4;
                if (iArr[11] > 300) {
                }
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m21t(int[] iArr) {
        Game game;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr2;
        char c;
        int i8;
        if (m212a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    iArr[3] = iArr[3] - 200;
                }
                if (iArr[6] % 24 == 0 && iArr[9] > 0) {
                    iArr[9] = iArr[9] - 1;
                    if (iArr[8] != 0) {
                        game = this;
                        i = 19;
                        i2 = iArr[2] / 100;
                        i3 = iArr[3] / 100;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                    } else if (iArr[8] == 1) {
                        game = this;
                        i = 19;
                        i2 = iArr[2] / 100;
                        i3 = iArr[3] / 100;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 999;
                    }
                    game.m216a(i, i2, i3, i4, i5, i6, i7);
                }
                if (iArr[5] <= 0) {
                    return;
                }
                iArr[5] = 12;
                iArr[14] = iArr[14] + 1;
                iArr[15] = 4;
                if (iArr[5] <= 0) {
                    return;
                }
                iArr[0] = 0;
                return;
            case 2:
                iArr[15] = 4;
                if (iArr[5] <= 0) {
                }
                break;
            default:
                iArr[10] = iArr[19] == 1 ? 64 : -64;
                iArr[11] = 100;
                iArr[5] = 100;
                switch (iArr[8]) {
                    case 1:
                        iArr[5] = 140;
                        iArr2 = iArr;
                        c = '\t';
                        i8 = 8;
                        break;
                    default:
                        iArr[5] = 100;
                        iArr2 = iArr;
                        c = '\t';
                        i8 = 5;
                        break;
                }
                iArr2[c] = i8;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                if (iArr[6] % 24 == 0) {
                    iArr[9] = iArr[9] - 1;
                    if (iArr[8] != 0) {
                    }
                    game.m216a(i, i2, i3, i4, i5, i6, i7);
                    break;
                }
                if (iArr[5] <= 0) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18u(int[] iArr) {
        if (m212a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            Player_Hurt();
        }
        switch (iArr[14]) {
            case 1:
                if (iArr[8] == 0) {
                    iArr[8] = 100;
                }
                iArr[5] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (iArr[8] > 998 && iArr[6] >= iArr[8]) {
                    iArr[15] = 4;
                    iArr[5] = 8;
                    iArr[14] = iArr[14] + 1;
                    if (iArr[5] > 0) {
                        return;
                    }
                    iArr[0] = 0;
                    return;
                }
                return;
            case 2:
                if (iArr[8] > 998) {
                    iArr[15] = 4;
                    iArr[5] = 8;
                    iArr[14] = iArr[14] + 1;
                    if (iArr[5] > 0) {
                    }
                    break;
                } else {
                    return;
                }
            case 3:
                if (iArr[5] > 0) {
                }
                break;
            default:
                iArr[14] = 1;
                if (iArr[8] == 0) {
                }
                iArr[5] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (iArr[8] > 998) {
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m16v(int[] iArr) {
        int[] iArr2;
        char c;
        int i;
        if (m212a(iArr[2] / 100, (iArr[3] / 100) + (iArr[18] == 0 ? 6 : -6), 10, 12, false) != 0) {
            Player_Hurt();
        }
        switch (iArr[14]) {
            case 1:
                if (iArr[8] == 0) {
                    iArr[8] = 64;
                }
                iArr[5] = 0;
                iArr[9] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[17] = iArr[3];
                iArr[14] = iArr[14] + 1;
                break;
            case 2:
                break;
            default:
                iArr[14] = 1;
                if (iArr[8] == 0) {
                }
                iArr[5] = 0;
                iArr[9] = 0;
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[17] = iArr[3];
                iArr[14] = iArr[14] + 1;
                break;
        }
        iArr[9] = iArr[9] + 140;
        iArr[15] = this.f226j & 1;
        int i2 = (iArr[9] / 100) % 180;
        iArr[3] = iArr[17] - (Math.abs(Math_CalcSine(i2)) * iArr[8]);
        if (i2 < 90) {
            iArr2 = iArr;
            c = 18;
            i = 2;
        } else {
            iArr2 = iArr;
            c = 18;
            i = 0;
        }
        iArr2[c] = i;
        if (iArr[9] >= 18000) {
            iArr[0] = 0;
        }
    }

    /* renamed from: w */
    private void m14w(int[] iArr) {
        if (m212a(iArr[2] / 100, (iArr[3] / 100) + 2, 10, 10, false) != 0) {
            Player_Hurt();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        if (m139b(iArr[2] / 100, iArr[3] / 100)) {
            iArr[0] = 0;
        }
    }

    /* renamed from: x */
    private static void m12x(int[] iArr) {
        iArr[15] = iArr[8];
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 20;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
    }

    /* renamed from: y */
    private static void m10y(int[] iArr) {
        int i = (iArr[6] / 4) % 5;
        if (iArr[1] != 2) {
            i += 5;
        }
        m136b(iArr[2] / 100, iArr[3] / 100, 97, i, f179a[0]);
    }

    /* renamed from: z */
    private void m8z(int[] iArr) {
        m133b(0, 0, new int[]{0, 16, 32, 16}[this.f226j & 3], 16, 16, new int[]{f179a[0], f179a[0], f179a[0], f179a[4]}[this.f226j & 3], iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: A */
    private static void m270A(int[] iArr) {
        if (iArr[15] < 0 || iArr[15] > 3) {
            return;
        }
        m133b(0, 16, iArr[15] * 16, 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: B */
    private static void m268B(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (iArr[2] / 100) - Camera_Pos[0];
        int i7 = (iArr[3] / 100) - Camera_Pos[1];
        int i8 = iArr[8];
        int i9 = i8;
        if (i8 < 0) {
            return;
        }
        if (i9 > 6) {
            i9 = 6;
        }
        switch (i9) {
            case 1:
                i = 10;
                i2 = i;
                i5 = 3;
                i3 = i5;
                i4 = 0;
                break;
            case 2:
                i2 = 10;
                i3 = 3;
                i4 = 16;
                break;
            case 3:
                i = 15;
                i2 = i;
                i5 = 3;
                i3 = i5;
                i4 = 0;
                break;
            case 4:
                i2 = 15;
                i3 = 3;
                i4 = 8;
                break;
            case 5:
                i2 = 15;
                i3 = 3;
                i4 = 16;
                break;
            case 6:
                i = 20;
                i2 = i;
                i5 = 3;
                i3 = i5;
                i4 = 0;
                break;
            default:
                i2 = 5;
                i5 = 8;
                i3 = i5;
                i4 = 0;
                break;
        }
        m195a(GFX_Painter, GFX_HUDArray[3], i3, i4, i2, 8, 0, i6, i7, 3, true);
    }

    /* renamed from: C */
    private static void m266C(int[] iArr) {
        m136b(iArr[2] / 100, iArr[3] / 100, 96, iArr[15], f179a[0]);
    }

    /* renamed from: D */
    private static void m264D(int[] iArr) {
        int[] iArr2;
        char c;
        int i = iArr[2] / 100;
        int i2 = iArr[3] / 100;
        int i3 = iArr[8] == 0 ? 0 : 2;
        if (iArr[19] == 0) {
            iArr2 = f179a;
            c = 0;
        } else {
            iArr2 = f179a;
            c = 4;
        }
        m136b(i, i2, 49, i3, iArr2[c]);
    }

    /* renamed from: E */
    private void m262E(int[] iArr) {
        int i;
        if (iArr[6] < 5) {
            i = 3;
        } else if (iArr[6] < 10) {
            i = 4;
        } else if (iArr[6] >= 15) {
            return;
        } else {
            i = 5;
        }
        if ((this.f226j & 1) == 0) {
            m136b(iArr[2] / 100, iArr[3] / 100, 41, i, f179a[0]);
        }
    }

    /* renamed from: F */
    private void m260F(int[] iArr) {
        int i = iArr[15] % 5;
        int i2 = i;
        if (i == 0) {
            i2 += this.f226j & 3;
        }
        m133b(101, 0, i2 * 32, 24, 32, m65i(iArr[18]), iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: G */
    private static void m258G(int[] iArr) {
        int i = iArr[15] & 3;
        m133b(iArr[1] == 23 ? 102 : iArr[1] == 24 ? 18 : 27, f207d[i][0], f207d[i][1], 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: H */
    private static void m256H(int[] iArr) {
        int i;
        switch (iArr[8]) {
            case 1:
                i = 16;
                break;
            case 2:
                i = 32;
                break;
            default:
                i = 0;
                break;
        }
        m133b(18, i, 0, 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m254I(int[] iArr) {
        int[] iArr2;
        char c;
        int i = (iArr[1] - 28) % 7;
        if (iArr[14] > 2) {
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
            iArr[11] = iArr[11] + 10;
            if (iArr[11] > 800) {
                iArr[11] = 800;
            }
        }
        switch (iArr[14]) {
            case 1:
                iArr[10] = 0;
                iArr[15] = 0;
                iArr[5] = iArr[8];
                iArr[14] = iArr[14] + 1;
                if (iArr[5] <= 0) {
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 0;
                    if (m139b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                        iArr[10] = f208e[i][0];
                        iArr[11] = f208e[i][1];
                        if (iArr[19] == 1) {
                            iArr[10] = -iArr[10];
                        }
                        iArr[6] = 0;
                        iArr[14] = iArr[14] + 1;
                        iArr[15] = 1;
                        if (m139b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                            for (int i2 = 0; i2 < 3; i2++) {
                                iArr[3] = iArr[3] - 200;
                                if (!m139b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                                    iArr[11] = f208e[i][1];
                                    break;
                                }
                            }
                            iArr[11] = f208e[i][1];
                        }
                    }
                }
                break;
            case 2:
                if (iArr[5] <= 0) {
                }
                break;
            case 3:
                iArr[15] = 0;
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                }
                break;
            case 4:
                iArr[15] = 1;
                if (m139b(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                }
                break;
            default:
                iArr[14] = 1;
                iArr[10] = 0;
                iArr[15] = 0;
                iArr[5] = iArr[8];
                iArr[14] = iArr[14] + 1;
                if (iArr[5] <= 0) {
                }
                break;
        }
        if (iArr[3] < 0) {
            iArr2 = iArr;
            c = 3;
        } else if (iArr[3] <= 999900) {
            return;
        } else {
            iArr2 = iArr;
            c = 0;
        }
        iArr2[c] = 0;
    }

    /* renamed from: J */
    private static void m252J(int[] iArr) {
        int[] iArr2;
        char c;
        int i;
        int i2 = iArr[15] % 3;
        if (i2 < 0) {
            return;
        }
        switch (iArr[19]) {
            case 1:
                iArr2 = f179a;
                c = 4;
                i = iArr2[c];
                break;
            case 2:
                iArr2 = f179a;
                c = 6;
                i = iArr2[c];
                break;
            case 3:
                iArr2 = f179a;
                c = 2;
                i = iArr2[c];
                break;
            default:
                i = 0;
                break;
        }
        m136b(iArr[2] / 100, iArr[3] / 100, 100, i2, i);
    }

    /* renamed from: aF */
    private void m178aF() {
        Game game;
        int i;
        this.f86K = this.Game_ZoneID;
        this.f87L = 0;
        this.f88M = 0;
        this.f89N = 0;
        this.f90O = 0;
        this.f91P = 0;
        this.f92Q = 0;
        this.f93R = 0;
        this.f95T = 0;
        this.f94S = 0;
        this.f97V = 0;
        this.f96U = 0;
        this.f100Y = 0;
        this.f101Z = 0;
        this.f102aa = 0;
        this.f103ab = 0;
        this.f104ac = 0;
        this.f105ad = 0;
        if (this.Game_ZoneID != 3 && this.Game_ZoneID != 4) {
            switch (this.Game_Settings[0]) {
                case 1:
                    game = this;
                    i = 6;
                    break;
                case 2:
                    game = this;
                    i = 8;
                    break;
                default:
                    game = this;
                    i = 4;
                    break;
            }
        } else {
            switch (this.Game_Settings[0]) {
                case 1:
                    game = this;
                    i = 5;
                    break;
                case 2:
                    game = this;
                    i = 6;
                    break;
                default:
                    game = this;
                    i = 4;
                    break;
            }
        }
        game.f106ae = i;
        if (this.Game_ZoneID < 5) {
            this.Music_MainPlayer.Music_Play(11, -1, false);
        }
    }

    /* renamed from: aG */
    private void Boss_Load() {
        Game game;
        int i;
        try {
            int[] iArr = new int[25];
            m178aF();
            GFX_UnloadGame();
            switch (this.Game_ZoneID) {
                case 0:
                    GFX_GameArray[120] = GFX_Load("/boss.png");
                    GFX_GameArray[121] = GFX_Load("/bossball.png");
                    iArr[1] = 120;
                    this.Boss_XPos = 10752;
                    this.Boss_YPos = 808;
                    break;
                case 2:
                    GFX_GameArray[120] = GFX_Load("/boss.png");
                    GFX_GameArray[131] = GFX_Load("/fire.png");
                    iArr[1] = 130;
                    this.Boss_XPos = 6304;
                    this.Boss_YPos = 608;
                    this.f94S = (6640 - this.Boss_XPos) * 100;
                    game = this;
                    i = (544 - this.Boss_YPos) * 100;
                    game.f95T = i;
                    break;
                case 4:
                    m233a();
                    GFX_GameArray[120] = GFX_Load("/boss.png");
                    iArr[1] = 140;
                    this.f94S = 0;
                    game = this;
                    i = 0;
                    game.f95T = i;
                    break;
            }
            GFX_GameArray[55] = GFX_Load("/masin.png");
            iArr[0] = 1;
            int i2 = Camera_Pos[0] + 256 + 46;
            iArr[16] = i2;
            iArr[2] = i2;
            int i3 = Camera_Pos[1] + 46;
            iArr[17] = i3;
            iArr[3] = i3;
            iArr[4] = 0;
            iArr[14] = 0;
            iArr[20] = this.f113c.length - 1;
            this.f113c[iArr[20]] = true;
            this.f114d[iArr[20]] = false;
            m100d(iArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    public final void Boss_Unload() {
        Image[] imageArr;
        char c;
        GFX_GameArray[120] = null;
        switch (this.Game_ZoneID) {
            case 0:
                imageArr = GFX_GameArray;
                c = 'y';
                break;
            case 2:
                imageArr = GFX_GameArray;
                c = 131;
                break;
            default:
                return;
        }
        imageArr[c] = null;
    }

    /* renamed from: aH */
    private void m176aH() {
        this.f286t = true;
        Boss_Load();
    }

    /* renamed from: O */
    public final void m247O() {
        this.f287u = true;
        this.f286t = false;
        this.f285bw = 1;
        if (this.Game_ZoneID != 5) {
            m90e(false);
        }
    }

    /* renamed from: e */
    public final boolean m88e(int[] iArr) {
        iArr[2] = ((this.f94S + this.f96U) / 100) + this.Boss_XPos;
        iArr[3] = ((this.f95T + this.f97V) / 100) + this.Boss_YPos;
        if (this.f102aa > 0) {
            this.f102aa--;
        }
        if (this.f105ad > 0) {
            int i = this.f105ad - 1;
            this.f105ad = i;
            if (i == 0) {
                this.f104ac = 0;
            }
        }
        if (this.f103ab > 0) {
            this.f103ab--;
            return true;
        }
        if (this.f100Y > 0) {
            this.f100Y--;
        }
        this.f101Z++;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m144b() {
        int i = this.Boss_YPos + ((this.f95T + this.f97V) / 100);
        switch (this.f87L) {
            case 100:
                this.f88M = 3;
                this.f100Y = 120;
                this.f87L++;
                if (this.f92Q > 0) {
                    this.f92Q--;
                }
                if (this.f100Y <= 0) {
                    return false;
                }
                this.f88M = 4;
                this.f100Y = 80;
                this.f87L++;
                this.f88M = 4;
                this.f95T += 200;
                if (i >= f188d[this.Game_ZoneID]) {
                    return false;
                }
                this.f100Y = 40;
                this.f87L++;
                if (this.f100Y <= 0) {
                    return false;
                }
                m247O();
                this.f100Y = 24;
                this.f87L++;
                this.f95T -= 80;
                if (this.f100Y <= 0) {
                    return false;
                }
                this.f100Y = 40;
                this.f87L++;
                if (this.f100Y <= 0) {
                    return false;
                }
                this.f87L++;
                this.f88M = 5;
                this.f89N = 1;
                this.f94S += 100;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                    return false;
                }
                this.f100Y = 120;
                this.f87L++;
                this.f88M = 6;
                this.f89N = 1;
                this.f94S += 500;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                    return false;
                }
                this.f87L++;
                this.f88M = -1;
                return true;
            case 101:
                if (this.f92Q > 0) {
                }
                if (this.f100Y <= 0) {
                }
                break;
            case 102:
                this.f88M = 4;
                this.f95T += 200;
                if (i >= f188d[this.Game_ZoneID]) {
                }
                break;
            case 103:
                if (this.f100Y <= 0) {
                }
                break;
            case 104:
                this.f95T -= 80;
                if (this.f100Y <= 0) {
                }
                break;
            case 105:
                if (this.f100Y <= 0) {
                }
                break;
            case 106:
                this.f88M = 5;
                this.f89N = 1;
                this.f94S += 100;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                }
                break;
            case 107:
                this.f88M = 6;
                this.f89N = 1;
                this.f94S += 500;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                }
                break;
            case 108:
                this.f88M = -1;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public final void m112c(int[] iArr) {
        iArr[2] = this.Boss_XPos + ((this.f94S + this.f96U) / 100);
        iArr[3] = this.Boss_YPos + ((this.f95T + this.f97V) / 100);
    }

    /* renamed from: c */
    public final void m117c(int i, int i2, int i3, int i4) {
        int[] iArr;
        char c;
        int i5;
        int Actor_CheckPlayerCollide = Actor_CheckPlayerCollide(i, i2, i, i2, i3, i4);
        if (Actor_CheckPlayerCollide >= 0) {
            if (Actor_CheckPlayerCollide == 0) {
                Player_Info[1] = (i2 - i4) << 8;
                m230a(-1);
            } else {
                if (Actor_CheckPlayerCollide == 1) {
                    Player_Info[0] = ((i - i3) - 12) << 8;
                    iArr = Player_Info;
                    c = '\n';
                    i5 = 0;
                } else if (Actor_CheckPlayerCollide == 2) {
                    Player_Info[0] = (((i + i3) + 12) + 1) << 8;
                    iArr = Player_Info;
                    c = '\n';
                    i5 = 0;
                } else if (Actor_CheckPlayerCollide == 3) {
                    iArr = Player_Info;
                    c = 1;
                    i5 = ((((i2 + i4) + 12) + 12) + 1) << 8;
                }
                iArr[c] = i5;
            }
        }
        if (!this.f115s || Actor_CheckPlayerCollide == 0) {
            return;
        }
        this.f115s = false;
    }

    /* renamed from: c */
    public final boolean m124c() {
        if (this.f87L >= 50) {
            return false;
        }
        if (!(f72g && f68d) && this.f314aw <= 0) {
            int i = ((this.f94S + this.f96U) / 100) + this.Boss_XPos;
            int i2 = (((this.f95T + this.f97V) / 100) + this.Boss_YPos) - 16;
            int Player_RoughXPos = i - Player_RoughXPos();
            int Player_RoughYPos = i2 - (Player_RoughYPos() - 16);
            if ((Player_RoughXPos * Player_RoughXPos) + (Player_RoughYPos * Player_RoughYPos) < 1024) {
                if (f74i) {
                    this.f314aw = 1;
                    return true;
                }
                if (this.Player_InvincTime == 0) {
                    Player_Hurt();
                }
                this.f314aw = 1;
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static void m105d(int i, int i2) {
        int Player_RoughXPos = Player_RoughXPos();
        int i3 = i2 >= Player_RoughYPos() - 16 ? i <= Player_RoughXPos ? 45 : 315 : i <= Player_RoughXPos ? 135 : 225;
        Player_Info[3] = Math_CalcSine(i3) * 8;
        Player_Info[5] = Math_CalcCosine(i3) * 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x051f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x042c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0456 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0490 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e6  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m246P() {
        int i;
        int i2;
        int[] iArr = this.Object_Info;
        this.f96U = 0;
        this.f97V = Math_CalcSine(this.f91P / 100) * 8;
        m88e(iArr);
        if (m124c()) {
            m105d(iArr[2], iArr[3]);
            if (this.f102aa == 0 && this.f87L < 100) {
                int i3 = this.f106ae - 1;
                this.f106ae = i3;
                if (i3 <= 0) {
                    this.f87L = 100;
                    return;
                }
                this.f104ac = 3;
                this.f105ad = 60;
                this.f102aa = 60;
            }
        }
        if (this.f87L < 100) {
            int i4 = this.f90O / 100;
            while (true) {
                i2 = i4;
                if (i4 >= 0) {
                    break;
                }
                i4 = i2 + 360;
            }
            int Math_CalcSine = 180 + ((Math_CalcSine(i2) * 90) / 100);
            if (m222a(this.Boss_XPos + ((this.f94S + this.f96U) / 100) + ((Math_CalcSine(Math_CalcSine) * this.f92Q) / 100) + f117a[120][15][4], this.Boss_YPos + ((this.f95T + this.f97V) / 100) + ((Math_CalcCosine(Math_CalcSine) * this.f92Q) / 100) + f117a[120][15][5], 36)) {
                Player_Hurt();
                this.f104ac = 1;
                this.f105ad = 60;
            }
        }
        switch (this.f87L) {
            case 1:
                this.f94S = 10000;
                this.f95T = -12000;
                this.f92Q = -32;
                this.f93R = -100;
                this.f90O = 0;
                this.f91P = 0;
                this.f100Y = 80;
                this.f87L++;
                this.f88M = 0;
                this.f95T += 80;
                if (this.f95T < 0) {
                    return;
                }
                this.f95T = 0;
                this.f100Y = 100;
                this.f87L++;
                this.f88M = 2;
                this.f94S -= 100;
                if (this.f100Y <= 0) {
                    return;
                }
                this.f87L++;
                this.f88M = 1;
                i = this.f92Q + 1;
                this.f92Q = i;
                if (i >= 96) {
                    return;
                }
                this.f100Y = 32;
                this.f87L++;
                this.f88M = 2;
                this.f94S -= 50;
                this.f90O += this.f93R;
                this.f91P += 100;
                if (this.f94S <= -3200) {
                    return;
                }
                this.f94S = -3200;
                this.f87L = 6;
                return;
            case 2:
                this.f88M = 0;
                this.f95T += 80;
                if (this.f95T < 0) {
                }
                break;
            case 3:
                this.f88M = 2;
                this.f94S -= 100;
                if (this.f100Y <= 0) {
                }
                break;
            case 4:
                this.f88M = 1;
                i = this.f92Q + 1;
                this.f92Q = i;
                if (i >= 96) {
                }
                break;
            case 5:
                this.f88M = 2;
                this.f94S -= 50;
                this.f90O += this.f93R;
                this.f91P += 100;
                if (this.f94S <= -3200) {
                }
                break;
            case 6:
                this.f88M = 2;
                this.f94S -= 100;
                this.f90O += this.f93R;
                this.f91P += 100;
                if (this.f94S > -3200) {
                    return;
                }
                this.f94S = -3200;
                this.f87L++;
                this.f88M = 0;
                this.f89N = 1;
                this.f91P += 100;
                if (this.f93R >= 0) {
                    this.f90O += this.f93R;
                    if (this.f90O < -9000) {
                        this.f93R = -this.f93R;
                        this.f90O = -9000;
                        return;
                    }
                    return;
                }
                this.f90O += this.f93R;
                if (this.f90O < 9000) {
                    return;
                }
                this.f90O = 9000;
                this.f93R = -this.f93R;
                this.f100Y = 64;
                this.f87L++;
                this.f88M = 2;
                this.f94S += 100;
                this.f90O += this.f93R;
                this.f91P += 100;
                if (this.f94S >= 3200 && this.f100Y <= 0) {
                    this.f94S = 3200;
                    this.f87L++;
                    this.f88M = 0;
                    this.f89N = 0;
                    this.f91P += 100;
                    if (this.f93R > 0) {
                        this.f90O += this.f93R;
                        if (this.f90O > 9000) {
                            this.f93R = -this.f93R;
                            this.f90O = 9000;
                            return;
                        }
                        return;
                    }
                    this.f90O += this.f93R;
                    if (this.f90O > -9000) {
                        return;
                    }
                    this.f90O = -9000;
                    this.f93R = -this.f93R;
                    this.f100Y = 64;
                    this.f87L = 6;
                    return;
                }
                return;
            case 7:
                this.f88M = 0;
                this.f89N = 1;
                this.f91P += 100;
                if (this.f93R >= 0) {
                }
                break;
            case 8:
                this.f88M = 2;
                this.f94S += 100;
                this.f90O += this.f93R;
                this.f91P += 100;
                if (this.f94S >= 3200) {
                    this.f94S = 3200;
                    this.f87L++;
                    this.f88M = 0;
                    this.f89N = 0;
                    this.f91P += 100;
                    if (this.f93R > 0) {
                    }
                    break;
                } else {
                    return;
                }
                break;
            case 9:
                this.f88M = 0;
                this.f89N = 0;
                this.f91P += 100;
                if (this.f93R > 0) {
                }
                break;
            case 100:
                this.f88M = 3;
                this.f100Y = 40;
                this.f87L++;
                if (this.f100Y <= 0) {
                    return;
                }
                this.f100Y = 180;
                this.f87L++;
                if (this.f92Q > 0) {
                    this.f92Q--;
                }
                if (this.f100Y <= 0) {
                    return;
                }
                this.f88M = 4;
                this.f100Y = 80;
                this.f87L++;
                this.f88M = 4;
                this.f95T += 200;
                m112c(iArr);
                if (iArr[3] >= f188d[this.Game_ZoneID]) {
                    return;
                }
                this.f100Y = 40;
                this.f87L++;
                if (this.f100Y <= 0) {
                    return;
                }
                m247O();
                this.f100Y = 16;
                this.f87L++;
                this.f88M = 5;
                this.f89N = 1;
                this.f94S += 200;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                    return;
                }
                this.f100Y = 120;
                this.f87L++;
                this.f88M = 6;
                this.f89N = 1;
                this.f94S += 600;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                    return;
                }
                this.f87L++;
                this.f88M = -1;
                this.Object_Info[0] = 0;
                Boss_Unload();
                return;
            case 101:
                if (this.f100Y <= 0) {
                }
                break;
            case 102:
                if (this.f92Q > 0) {
                }
                if (this.f100Y <= 0) {
                }
                break;
            case 103:
                this.f88M = 4;
                this.f95T += 200;
                m112c(iArr);
                if (iArr[3] >= f188d[this.Game_ZoneID]) {
                }
                break;
            case 104:
                if (this.f100Y <= 0) {
                }
                break;
            case 105:
                this.f88M = 5;
                this.f89N = 1;
                this.f94S += 200;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                }
                break;
            case 106:
                this.f88M = 6;
                this.f89N = 1;
                this.f94S += 600;
                this.f95T -= 50;
                if (this.f100Y <= 0) {
                }
                break;
            case 107:
                this.f88M = -1;
                this.Object_Info[0] = 0;
                Boss_Unload();
                return;
            default:
                this.f87L = 1;
                this.f94S = 10000;
                this.f95T = -12000;
                this.f92Q = -32;
                this.f93R = -100;
                this.f90O = 0;
                this.f91P = 0;
                this.f100Y = 80;
                this.f87L++;
                this.f88M = 0;
                this.f95T += 80;
                if (this.f95T < 0) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0352 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0374 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0375  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m245Q() {
        Game game;
        int i;
        int[] iArr = this.Object_Info;
        if (!m88e(this.Object_Info)) {
            this.f91P += 100;
            this.f96U = 0;
            this.f97V = Math_CalcSine(this.f91P / 100) * 10;
            if (this.f87L <= 99) {
                if (m124c() && this.f87L > 3) {
                    m105d(iArr[2], iArr[3]);
                    if (this.f102aa == 0 && this.f87L < 100) {
                        int i2 = this.f106ae - 1;
                        this.f106ae = i2;
                        if (i2 <= 0) {
                            this.f85I = 0;
                            this.f87L = 100;
                            return;
                        }
                        this.f104ac = 3;
                        this.f105ad = 60;
                        this.f102aa = 60;
                        this.f103ab = 20;
                    }
                }
                if (this.f85I > 0) {
                    int i3 = this.f85I - 1;
                    this.f85I = i3;
                    if (i3 == 0) {
                        this.f85I = 150 + m123c(150);
                        m216a(16, (this.Boss_XPos + m123c(40)) - 20, this.Boss_YPos + 130, 0, -300, 0, 1);
                    }
                }
                switch (this.f87L) {
                    case 1:
                        this.f104ac = 0;
                        this.f88M = 2;
                        this.f94S = 31200;
                        this.f95T = 4800;
                        this.f90O = 0;
                        this.f91P = 0;
                        this.f85I = 0;
                        this.f100Y = 30;
                        this.f87L++;
                        if (this.f100Y > 0) {
                            return;
                        }
                        this.f87L++;
                        this.f88M = 2;
                        this.f94S -= 150;
                        this.f95T -= 20;
                        if (this.f94S > 10400 && this.f100Y <= 0) {
                            this.f94S = 10400;
                            this.f88M = 0;
                            this.f104ac = 1;
                            this.f105ad = 60;
                            this.f100Y = 60;
                            this.f85I = 120;
                            game = this;
                            i = game.f87L + 1;
                            game.f87L = i;
                            return;
                        }
                        return;
                    case 2:
                        if (this.f100Y > 0) {
                        }
                        break;
                    case 3:
                        this.f88M = 2;
                        this.f94S -= 150;
                        this.f95T -= 20;
                        if (this.f94S > 10400) {
                            return;
                        }
                        this.f94S = 10400;
                        this.f88M = 0;
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 60;
                        this.f85I = 120;
                        game = this;
                        i = game.f87L + 1;
                        game.f87L = i;
                        return;
                    case 4:
                        this.f88M = 2;
                        this.f89N = 0;
                        this.f87L++;
                        this.f88M = 2;
                        this.f89N = 0;
                        this.f94S -= 150;
                        this.f95T -= 12;
                        if (this.f94S <= -10400) {
                            return;
                        }
                        this.f94S = -10400;
                        this.f87L++;
                        this.f95T += 50;
                        if (this.f95T > 1200) {
                            return;
                        }
                        this.f95T = 1200;
                        this.f87L++;
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 48;
                        this.f87L++;
                        if (this.f100Y == 8) {
                            m216a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f100Y > 0) {
                            return;
                        }
                        m112c(iArr);
                        game = this;
                        i = game.f87L + 1;
                        game.f87L = i;
                        return;
                    case 5:
                        this.f88M = 2;
                        this.f89N = 0;
                        this.f94S -= 150;
                        this.f95T -= 12;
                        if (this.f94S <= -10400) {
                        }
                        break;
                    case 6:
                        this.f95T += 50;
                        if (this.f95T > 1200) {
                        }
                        break;
                    case 7:
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 48;
                        this.f87L++;
                        if (this.f100Y == 8) {
                        }
                        if (this.f100Y > 0) {
                        }
                        break;
                    case 8:
                        if (this.f100Y == 8) {
                        }
                        if (this.f100Y > 0) {
                        }
                        break;
                    case 9:
                        this.f88M = 2;
                        this.f89N = 1;
                        this.f87L++;
                        this.f88M = 2;
                        this.f89N = 1;
                        this.f94S += 150;
                        this.f95T -= 12;
                        if (this.f94S >= 10400) {
                            return;
                        }
                        this.f94S = 10400;
                        this.f87L++;
                        this.f95T += 50;
                        if (this.f95T > 1200) {
                            return;
                        }
                        this.f95T = 1200;
                        this.f87L++;
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 48;
                        this.f87L++;
                        if (this.f100Y == 8) {
                            m216a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f100Y > 0) {
                            return;
                        }
                        m112c(iArr);
                        this.f87L++;
                        this.f95T -= 100;
                        if (this.f95T <= 0) {
                            return;
                        }
                        this.f95T = 0;
                        game = this;
                        i = 4;
                        game.f87L = i;
                        return;
                    case 10:
                        this.f88M = 2;
                        this.f89N = 1;
                        this.f94S += 150;
                        this.f95T -= 12;
                        if (this.f94S >= 10400) {
                        }
                        break;
                    case 11:
                        this.f95T += 50;
                        if (this.f95T > 1200) {
                        }
                        break;
                    case 12:
                        this.f104ac = 1;
                        this.f105ad = 60;
                        this.f100Y = 48;
                        this.f87L++;
                        if (this.f100Y == 8) {
                        }
                        if (this.f100Y > 0) {
                        }
                        break;
                    case 13:
                        if (this.f100Y == 8) {
                        }
                        if (this.f100Y > 0) {
                        }
                        break;
                    case 14:
                        this.f95T -= 100;
                        if (this.f95T <= 0) {
                        }
                        break;
                    default:
                        this.f87L = 1;
                        this.f104ac = 0;
                        this.f88M = 2;
                        this.f94S = 31200;
                        this.f95T = 4800;
                        this.f90O = 0;
                        this.f91P = 0;
                        this.f85I = 0;
                        this.f100Y = 30;
                        this.f87L++;
                        if (this.f100Y > 0) {
                        }
                        break;
                }
            } else if (m144b()) {
                iArr[0] = 0;
            }
        }
    }

    /* renamed from: aI */
    private void m175aI() {
        this.f235aT = 0;
        this.f121ai = 6;
        this.f267q = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: R */
    public final void m244R() {
        Game game;
        boolean z;
        Game game2;
        int i;
        if (this.f328ab) {
            if (this.Continue_Timer > 0 && this.f235aT < 4) {
                this.Continue_Timer--;
            }
            switch (this.f235aT) {
                case 1:
                    this.f26aU = this.f236aZ;
                    this.f27aV = 0;
                    this.Continue_Timer = 604;
                    this.f28aW = -1;
                    this.f29aX = -1;
                    GFX_GameArray[121] = GFX_Load("/continue.png");
                    this.Music_MainPlayer.Music_Play(15, -1, false);
                    game2 = this;
                    i = 2;
                    game2.f235aT = i;
                    break;
                case 2:
                    this.f28aW = 0;
                    this.f27aV += 4;
                    if (this.f27aV >= this.f237ba) {
                        this.f27aV = this.f237ba;
                        this.f28aW = 1;
                        game2 = this;
                        i = 3;
                        game2.f235aT = i;
                        break;
                    }
                    break;
                case 3:
                    if (this.Continue_Timer == 0) {
                        game = this;
                        z = false;
                        game.m81f(z);
                        game2 = this;
                        i = 999;
                        game2.f235aT = i;
                        break;
                    } else if (this.Input_Array[0]) {
                        this.f28aW = 2;
                        this.f29aX = 0;
                        m97e();
                        game2 = this;
                        i = 4;
                        game2.f235aT = i;
                    }
                    break;
                case 4:
                    this.f29aX++;
                    if (this.f29aX > 8) {
                        this.f26aU++;
                    }
                    if (this.f29aX > 12) {
                        this.f26aU += 20;
                    }
                    if (this.f29aX >= 45) {
                        game2 = this;
                        i = 5;
                        game2.f235aT = i;
                        break;
                    }
                    break;
                case 5:
                    this.Music_MainPlayer.m0b();
                    game = this;
                    z = true;
                    game.m81f(z);
                    game2 = this;
                    i = 999;
                    game2.f235aT = i;
                    break;
                case 999:
                    break;
                default:
                    this.f235aT = 1;
                    this.f26aU = this.f236aZ;
                    this.f27aV = 0;
                    this.Continue_Timer = 604;
                    this.f28aW = -1;
                    this.f29aX = -1;
                    GFX_GameArray[121] = GFX_Load("/continue.png");
                    this.Music_MainPlayer.Music_Play(15, -1, false);
                    game2 = this;
                    i = 2;
                    game2.f235aT = i;
                    break;
            }
            this.f328ab = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x016d  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m243S() {
        short s;
        short s2;
        int i;
        int i2;
        int i3;
        short s3;
        short s4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.f328ab = true;
        int i9 = f175h >> 1;
        int i10 = i9 + 8;
        int i11 = f175h >> 2;
        int i12 = GFX_MenuWidth >> 1;
        GFX_Painter.setColor(0);
        GFX_Painter.setClip(0, f13i, GFX_MenuWidth, f175h);
        GFX_Painter.fillRect(0, f13i, GFX_MenuWidth, f175h);
        if (GFX_GameArray[121] == null || this.f235aT == 1) {
            return;
        }
        if (this.f28aW == 0) {
            m215a(121, 0, 0, 48, 32, 0, i12, this.f237ba);
            int i13 = this.f226j % 5;
            short s5 = f181b[i13][0];
            short s6 = f181b[i13][1];
            i3 = 151;
            s3 = s5;
            s4 = s6;
            i4 = 48;
            i5 = 24;
            i6 = 0;
            i7 = i12;
            i8 = this.f27aV;
        } else {
            if (this.f28aW != 1) {
                if (this.f28aW == 2) {
                    if (this.f29aX < 1) {
                        s = 48;
                        s2 = 120;
                        i = 48;
                        i2 = 24;
                    } else {
                        s = (this.f29aX < 12 ? (this.f29aX >> 1) % 6 : 6 + ((this.f29aX - 12) % 4)) * 40;
                        s2 = 40;
                        i = 40;
                        i2 = 40;
                    }
                    int i14 = i2;
                    m215a(121, 0, 0, 48, 32, 0, i12, this.f237ba);
                    i3 = 151;
                    s3 = s;
                    s4 = s2;
                    i4 = i;
                    i5 = i14;
                    i6 = 0;
                    i7 = this.f26aU;
                }
                if (this.f28aW < 2) {
                    m215a(121, 96, 0, 16, 16, 0, i12 - 16, i10);
                    m215a(121, 96, 0, 16, 16, 0, i12 + 16, i10);
                    m102d(i12 - 10, i9, this.Continue_Timer / 55, 2);
                }
                m215a(121, 0, 64, 120, 16, 0, i12, i11);
            }
            int i15 = (this.f226j >> 2) & 3;
            short s7 = f182c[i15][0];
            short s8 = f182c[i15][1];
            i3 = 121;
            s3 = s7;
            s4 = s8;
            i4 = 48;
            i5 = 32;
            i6 = 0;
            i7 = i12;
            i8 = this.f237ba;
        }
        m215a(i3, s3, s4, i4, i5, i6, i7, i8);
        if (this.f28aW < 2) {
        }
        m215a(121, 0, 64, 120, 16, 0, i12, i11);
    }

    /* renamed from: T */
    public final void m242T() {
        switch (this.f19aJ) {
            case 0:
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f20aK = 0;
                this.f19aJ = 2;
                return;
            case 2:
                this.f20aK++;
                if (this.f20aK > 720) {
                    m35p();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: U */
    public final void m241U() {
        int width = GFX_GameArray[154].getWidth() / 6;
        int width2 = GFX_HUDArray[10].getWidth();
        m261F();
        GFX_Painter.setColor(16777215);
        GFX_Painter.fillRect(0, f13i, GFX_MenuWidth, f175h);
        m195a(GFX_Painter, GFX_HUDArray[10], 0, 144, width2, width, f179a[0], f14aH, 10, 17, true);
        for (int i = 0; i < this.Player_Emeralds - 1; i++) {
            m195a(GFX_Painter, GFX_GameArray[154], i * width, 0, width, width, f179a[0], this.f231E[i] >> 16, this.f231E[i] & 65535, 0, true);
        }
        switch (this.f19aJ) {
            case 2:
                if (((this.f226j >> 1) & 1) == 0) {
                    m195a(GFX_Painter, GFX_GameArray[154], (this.Player_Emeralds - 1) * width, 0, width, width, f179a[0], this.f231E[this.Player_Emeralds - 1] >> 16, this.f231E[this.Player_Emeralds - 1] & 65535, 0, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: aJ */
    private static void m174aJ() {
        GFX_GameArray[158] = null;
        GFX_GameArray[157] = null;
        GFX_GameArray[154] = null;
        GFX_GameArray[155] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m240V() throws Exception {
        Game game;
        Game game2;
        int i;
        switch (this.f21aL) {
            case 0:
                GFX_ZoneTiles = null;
                GFX_UnloadArray(GFX_GameArray);
                Background_Renderer.BG_Initialize(0, 0);
                GFX_GameArray[158] = GFX_Load("/landscape.png");
                if (this.Player_Emeralds != 6) {
                    GFX_GameArray[157] = GFX_Load("/endegg_b.png");
                    this.f21aL = 1;
                    this.f22aM = 0;
                    this.f23aP = 0;
                } else {
                    GFX_GameArray[157] = GFX_Load("/endegg_a.png");
                    this.f23aP = 0;
                    this.f21aL = 2;
                }
                GFX_GameArray[155] = GFX_Load("/ED3.png");
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f232aN = 0;
                this.f233aO = 0;
                this.f234aQ = 0;
                return;
            case 1:
                this.f232aN++;
                if (this.f232aN > 480) {
                    this.f21aL = 2;
                    return;
                } else if (this.f232aN > 360) {
                    this.f22aM = 2;
                    return;
                } else if (this.f232aN > 240) {
                    this.f22aM = 1;
                    return;
                } else {
                    return;
                }
            case 2:
                this.f233aO++;
                if (this.f233aO > 240) {
                    if (this.Player_Emeralds == 6) {
                        this.f21aL = 3;
                        return;
                    }
                    this.f21aL = 4;
                    this.f25aS = 3;
                    this.f24aR = 0;
                    return;
                } else if (this.f233aO > 32) {
                    this.f23aP = 2;
                    return;
                } else if (this.f233aO > 16) {
                    this.f23aP = 1;
                    return;
                } else {
                    return;
                }
            case 3:
                this.f234aQ++;
                if (this.f234aQ > 240) {
                    m174aJ();
                    if (m108d()) {
                        this.f121ai = 9;
                        this.f131v = true;
                        return;
                    }
                    game = this;
                    game.m106d(3);
                    return;
                }
                return;
            case 4:
                this.f234aQ++;
                switch (this.f25aS) {
                    case 0:
                        if (this.f163bQ + ((6 - this.Player_Emeralds) * 16) > 0) {
                            game2 = this;
                            i = game2.f163bQ - 2;
                            game2.f163bQ = i;
                            break;
                        } else {
                            this.f163bQ = 0;
                            this.f234aQ = 0;
                            this.f24aR++;
                            this.f25aS = 3;
                            break;
                        }
                    case 1:
                        if (this.f234aQ > 24) {
                            this.f25aS = 0;
                            game2 = this;
                            i = 145;
                            game2.f163bQ = i;
                            break;
                        }
                        break;
                    case 2:
                        if (this.f163bQ - ((6 - this.Player_Emeralds) * 16) < 180) {
                            game2 = this;
                            i = game2.f163bQ + 2;
                            game2.f163bQ = i;
                            break;
                        } else {
                            this.f163bQ = 180;
                            this.f234aQ = 0;
                            this.f24aR++;
                            this.f25aS = 1;
                            break;
                        }
                    case 3:
                        if (this.f234aQ > 24) {
                            this.f25aS = 2;
                            game2 = this;
                            i = 35;
                            game2.f163bQ = i;
                            break;
                        }
                        break;
                }
                if (this.f24aR > 4) {
                    if (m108d()) {
                        this.f121ai = 9;
                        this.f131v = true;
                        return;
                    }
                    game = this;
                    game.m106d(3);
                    return;
                }
                return;
            default:
                this.f21aL = 0;
                GFX_ZoneTiles = null;
                GFX_UnloadArray(GFX_GameArray);
                Background_Renderer.BG_Initialize(0, 0);
                GFX_GameArray[158] = GFX_Load("/landscape.png");
                if (this.Player_Emeralds != 6) {
                }
                GFX_GameArray[155] = GFX_Load("/ED3.png");
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f232aN = 0;
                this.f233aO = 0;
                this.f234aQ = 0;
                return;
        }
    }

    /* renamed from: d */
    public final boolean m108d() {
        for (int i = 0; i < HighScore_DefaultScores.length; i++) {
            if (HighScore_DefaultScores[i] < this.Player_Score) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final void m239W() {
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
        int i9;
        Graphics graphics2;
        Image image2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        m37o(3);
        GFX_Painter.setClip(0, 0, f171c, GFX_MenuHeight);
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, 0, f171c, GFX_MenuHeight);
        if (this.f21aL == 2 || this.f21aL == 1) {
            m191a(false, false);
        }
        m261F();
        if (f174g < f171c) {
            GFX_Painter.translate((f171c - f174g) >> 1, 0);
        }
        switch (this.f21aL) {
            case 1:
                GFX_Painter.setClip(0, f13i, f171c, f175h);
                GFX_Painter.drawImage(GFX_GameArray[158], 0, f13i, 20);
                switch (this.f22aM) {
                    case 0:
                        m195a(GFX_Painter, GFX_GameArray[157], ((this.f232aN >> 1) & 1) * 32, 96, 32, 40, f179a[0], f14aH, (f13i + f175h) - 10, 33, false);
                        break;
                    case 1:
                        m195a(GFX_Painter, GFX_GameArray[157], 64, 96, 32, 40, f179a[0], f14aH, (f13i + f175h) - 10, 33, false);
                        if (((this.f232aN >> 1) & 1) == 0) {
                            for (int i18 = 0; i18 < 6; i18++) {
                                int min = Math.min(60, this.f232aN - 240);
                                m195a(GFX_Painter, GFX_GameArray[154], i18 * 16, 0, 16, 16, f179a[0], f14aH + ((min * Math_CalcCosine(i18 * 36)) / 100), (((f13i + f175h) - 22) - (min >> 1)) - ((min * Math_CalcSine(i18 * 36)) / 100), 3, false);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m195a(GFX_Painter, GFX_GameArray[157], (3 + ((this.f232aN >> 5) & 1)) * 32, 96, 32, 40, f179a[0], f14aH, (f13i + f175h) - 10, 33, false);
                        for (int i19 = 0; i19 < 6; i19++) {
                            m195a(GFX_Painter, GFX_GameArray[154], i19 * 16, 0, 16, 16, f179a[0], f14aH + ((60 * Math_CalcCosine(i19 * 36)) / 100), (((f13i + f175h) - 22) - 30) - ((60 * Math_CalcSine(i19 * 36)) / 100), 3, false);
                        }
                        break;
                }
            case 2:
                GFX_Painter.setClip(0, f13i, f171c, f175h);
                GFX_Painter.drawImage(GFX_GameArray[158], 0, f13i, 20);
                switch (this.f23aP) {
                    case 0:
                        graphics2 = GFX_Painter;
                        image2 = GFX_GameArray[155];
                        i10 = 0;
                        i11 = 0;
                        i12 = 32;
                        i13 = 40;
                        i14 = f179a[0];
                        i15 = f14aH;
                        i16 = f13i + f175h;
                        i17 = 10;
                        m195a(graphics2, image2, i10, i11, i12, i13, i14, i15, i16 - i17, 33, false);
                        break;
                    case 1:
                        graphics2 = GFX_Painter;
                        image2 = GFX_GameArray[155];
                        i10 = 0;
                        i11 = 40;
                        i12 = 46;
                        i13 = 71;
                        i14 = f179a[0];
                        i15 = f14aH;
                        i16 = f13i + f175h;
                        i17 = 20;
                        m195a(graphics2, image2, i10, i11, i12, i13, i14, i15, i16 - i17, 33, false);
                        break;
                    case 2:
                        graphics2 = GFX_Painter;
                        image2 = GFX_GameArray[155];
                        i10 = 48;
                        i11 = 0;
                        i12 = 176;
                        i13 = 136;
                        i14 = f179a[0];
                        i15 = f14aH;
                        i16 = f13i + f175h;
                        i17 = 20;
                        m195a(graphics2, image2, i10, i11, i12, i13, i14, i15, i16 - i17, 33, false);
                        break;
                }
            case 3:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f13i, f171c, f175h);
                int i20 = (this.f234aQ / 15) % 3;
                graphics = GFX_Painter;
                image = GFX_GameArray[157];
                i = i20 * 60;
                i2 = 0;
                i3 = 60;
                i4 = 96;
                i5 = f179a[0];
                i6 = f14aH;
                i7 = f15aI;
                i8 = 3;
                m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                break;
            case 4:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f13i, f171c, f175h);
                switch (this.f25aS) {
                    case 0:
                        m195a(GFX_Painter, GFX_GameArray[157], 128, 0, 128, 112, f179a[0], f14aH, f15aI, 3, false);
                        for (int i21 = 0; i21 < 6 - this.Player_Emeralds; i21++) {
                            int max = Math.max(Math.min(145, this.f163bQ + (i21 * 16)), 0);
                            m195a(GFX_Painter, GFX_GameArray[154], (5 - i21) * 16, 0, 16, 16, f179a[0], f14aH + ((55 * Math_CalcCosine(max)) / 100), (f15aI - 10) - ((55 * Math_CalcSine(max)) / 100), 3, false);
                        }
                        break;
                    case 1:
                        i9 = f14aH + 55;
                        int i22 = i9;
                        int i23 = f15aI - 20;
                        m195a(GFX_Painter, GFX_GameArray[157], 0, 0, 128, 112, f179a[0], f14aH, f15aI, 3, false);
                        m195a(GFX_Painter, GFX_GameArray[154], 0, 0, 16, 16, f179a[0], i22, i23, 3, false);
                        break;
                    case 2:
                        m195a(GFX_Painter, GFX_GameArray[157], 128, 0, 128, 112, f179a[4], f14aH, f15aI, 3, false);
                        for (int i24 = 0; i24 < 6 - this.Player_Emeralds; i24++) {
                            int min2 = Math.min(Math.max(35, this.f163bQ - (i24 * 16)), 180);
                            m195a(GFX_Painter, GFX_GameArray[154], (5 - i24) * 16, 0, 16, 16, f179a[0], f14aH + ((55 * Math_CalcCosine(min2)) / 100), (f15aI - 10) - ((55 * Math_CalcSine(min2)) / 100), 3, false);
                        }
                        break;
                    case 3:
                        i9 = f14aH - 55;
                        int i222 = i9;
                        int i232 = f15aI - 20;
                        m195a(GFX_Painter, GFX_GameArray[157], 0, 0, 128, 112, f179a[0], f14aH, f15aI, 3, false);
                        m195a(GFX_Painter, GFX_GameArray[154], 0, 0, 16, 16, f179a[0], i222, i232, 3, false);
                        break;
                }
                graphics = GFX_Painter;
                image = GFX_GameArray[157];
                i = 0;
                i2 = 116;
                i3 = 240;
                i4 = 36;
                i5 = f179a[0];
                i6 = f14aH;
                i7 = f13i + f175h;
                i8 = 33;
                m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                break;
        }
        if (f174g < f171c) {
            GFX_Painter.translate(-((f171c - f174g) >> 1), 0);
        }
    }

    /* renamed from: X */
    public final void m238X() {
        if (this.Input_Array[4]) {
            this.f329bR++;
            if (this.f329bR > 2) {
                this.f329bR = 0;
            }
        } else if (this.Input_Array[3]) {
            this.f329bR--;
            if (this.f329bR < 0) {
                this.f329bR = 2;
            }
        } else if (this.Input_Array[2]) {
            int[] iArr = this.f330L;
            int i = this.f329bR;
            iArr[i] = iArr[i] - 1;
            if (this.f330L[this.f329bR] < 0) {
                this.f330L[this.f329bR] = HighScore_ValidChars.length - 1;
            }
        } else if (!this.Input_Array[1]) {
            if (this.Input_Array[0]) {
                m173aK();
            }
        } else {
            int[] iArr2 = this.f330L;
            int i2 = this.f329bR;
            iArr2[i2] = iArr2[i2] + 1;
            if (this.f330L[this.f329bR] >= HighScore_ValidChars.length) {
                this.f330L[this.f329bR] = 0;
            }
        }
    }

    /* renamed from: aK */
    private void m173aK() {
        int i = 0;
        while (true) {
            if (i >= HighScore_DefaultScores.length) {
                break;
            } else if (HighScore_DefaultScores[i] < this.Player_Score) {
                for (int length = HighScore_DefaultScores.length - 1; length > i; length--) {
                    HighScore_DefaultScores[length] = HighScore_DefaultScores[length - 1];
                    HighScore_DefaultDifficulties[length] = HighScore_DefaultDifficulties[length - 1];
                }
            } else {
                i++;
            }
        }
        if (i < HighScore_DefaultScores.length) {
            HighScore_DefaultScores[i] = this.Player_Score;
            HighScore_DefaultDifficulties[i] = this.Game_Settings[0];
            HighScore_DefaultNames[i] = new String(new char[]{HighScore_ValidChars[this.f330L[0]], HighScore_ValidChars[this.f330L[1]], HighScore_ValidChars[this.f330L[2]]});
            HighScore_ResetValues();
        }
        this.f121ai = 1;
        m106d(5);
        m37o(1);
        this.Player_Score = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[LOOP:0: B:11:0x007f->B:13:0x0088, LOOP_END] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m237Y() {
        int i;
        Game game;
        String enternametext;
        m261F();
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, f13i, GFX_MenuWidth, f175h);
        switch (this.Game_Settings[2]) {
            case 0:
                game = this;
                enternametext = "ENTER NAME";
                break;
            case 1:
                game = this;
                enternametext = "NAMEN EINGEBEN";
                break;
            case 2:
                game = this;
                enternametext = "ENTREZ VOTRE NOM";
                break;
            case 3:
                game = this;
                enternametext = "INTRODUCE TU NOMBRE";
                break;
            case 4:
                game = this;
                enternametext = "INSERISCI NOME";
                break;
            default:
                GFX_Painter.setColor(16777215);
                int length = f171c / (this.f330L.length + 1);
                for (i = 0; i < this.f330L.length; i++) {
                    GFX_Painter.drawString(String.valueOf(HighScore_ValidChars[this.f330L[i]]), (i + 1) * length, f15aI + (GFX_Painter.getFont().getHeight() >> 1), 65);
                }
                GFX_Painter.setColor(16386570);
                int height = (GFX_Painter.getFont().getHeight() * 3) >> 1;
                GFX_Painter.drawRect(((this.f329bR + 1) * length) - (height >> 1), f15aI - (height >> 1), height, height);
        }
        game.m196a(enternametext, false);
        GFX_Painter.setColor(16777215);
        int length2 = f171c / (this.f330L.length + 1);
        while (i < this.f330L.length) {
        }
        GFX_Painter.setColor(16386570);
        int height2 = (GFX_Painter.getFont().getHeight() * 3) >> 1;
        GFX_Painter.drawRect(((this.f329bR + 1) * length2) - (height2 >> 1), f15aI - (height2 >> 1), height2, height2);
    }

    /* renamed from: Z */
    public final void m236Z() {
        m261F();
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, f13i, GFX_MenuWidth, f175h);
        m196a(this.Text_Main[87], false);
        GFX_Painter.setColor(16777215);
        GFX_Painter.drawString(m234a(), f171c >> 1, f13i + (f175h >> 1), 65);
    }

    /* renamed from: aa */
    public final void m172aa() {
        m261F();
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, f13i, GFX_MenuWidth, f175h);
        m196a(this.Text_Main[86], false);
        GFX_Painter.setColor(16777215);
        int charWidth = f168a.charWidth('X') + 2;
        for (int i = 0; i < 8; i++) {
            GFX_Painter.drawChar(HighScore_ValidChars[this.f331M[i]], (f171c >> 1) + ((i - 4) * charWidth) + 2, f13i + (f175h >> 1), 36);
        }
        GFX_Painter.setColor(16386570);
        GFX_Painter.drawRect((f171c >> 1) + ((this.f332bS - 4) * charWidth), (f13i + (f175h >> 1)) - f169a, charWidth, f169a);
        GFX_Painter.setColor(16777215);
        GFX_Painter.drawString(this.Text_ProgressElements, f171c >> 1, f13i, 17);
    }

    /* renamed from: e */
    public final int m95e(int i) {
        try {
            switch (i) {
                case -7:
                    return 13;
                case -6:
                    return 12;
                case 35:
                    return 10;
                case 42:
                    return 11;
                case 48:
                    return 0;
                case 49:
                    return 1;
                case 50:
                    return 2;
                case 51:
                    return 3;
                case 52:
                    return 4;
                case 53:
                    return 5;
                case 54:
                    return 6;
                case 55:
                    return 7;
                case 56:
                    return 8;
                case 57:
                    return 9;
                default:
                    switch (getGameAction(i)) {
                        case 1:
                            return 14;
                        case 2:
                            return 16;
                        case 3:
                        case 4:
                        case 7:
                        default:
                            return 19;
                        case 5:
                            return 17;
                        case 6:
                            return 15;
                        case 8:
                            return 18;
                    }
            }
        } catch (Exception unused) {
            return 19;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v102, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v106, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v108, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v114, types: [int[][], int[][][]] */
    /* JADX WARN: Type inference failed for: r0v125, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v28, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v30, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v92, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v94, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v98, types: [short[], short[][]] */
    static {
        int[] iArr = {16, 16, 8, 8, 8};
        int[] iArr2 = {32, 32, 24, 24, 16};
        int[] iArr3 = {32, 32, 16, 24, 16};
        int[] iArr4 = {new int[]{-1, 1}, new int[]{1, -1}};
        int[] iArr5 = {40, 40, 16, 16, 0};
        int[] iArr6 = {new int[]{0, 4}, new int[]{4, 0}, new int[]{2, 6}, new int[]{0, 0}};
        int[] iArr7 = {new int[]{2, 6}, new int[]{2, 6}, new int[]{4, 0}, new int[]{2, 6}};
        short[] sArr = {new short[]{88, 56, 16, 16}, new short[]{64, 56, 24, 24}, new short[]{88, 72, 16, 16}, new short[]{88, 88, 16, 16}, new short[]{64, 80, 24, 24}};
        int[] iArr8 = {0, 0, 0, 2};
        int[] iArr9 = {0, 16, 32, 16};
    }
}