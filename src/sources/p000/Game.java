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
    public static int f23f;

    /* renamed from: i */
    public static int f26i;

    /* renamed from: aH */
    private static int f27aH;

    /* renamed from: aI */
    private static int f28aI;

    /* renamed from: a */
    public static Graphics GFX_Painter;

    /* renamed from: a */
    public static Image GFX_ZoneTiles;

    /* renamed from: a */
    public Audio_Player Music_MainPlayer;

    /* renamed from: aJ */
    private int f44aJ;

    /* renamed from: aK */
    private int f45aK;

    /* renamed from: aL */
    private int f47aL;

    /* renamed from: aM */
    private int f48aM;

    /* renamed from: aP */
    private int f51aP;

    /* renamed from: aR */
    private int f53aR;

    /* renamed from: aS */
    private int f54aS;

    /* renamed from: aU */
    private int f56aU;

    /* renamed from: aV */
    private int f57aV;

    /* renamed from: aW */
    private int f58aW;

    /* renamed from: aX */
    private int f59aX;

    /* renamed from: aY */
    private int Continue_Timer;

    /* renamed from: bb */
    private int f65bb;

    /* renamed from: a */
    private String f68a;

    /* renamed from: a */
    public byte Menu_ID;

    /* renamed from: d */
    private byte f70d;

    /* renamed from: b */
    public byte f71b;

    /* renamed from: e */
    private byte f72e;

    /* renamed from: L */
    private boolean f73L;

    /* renamed from: a */
    private Vector f75a;

    /* renamed from: f */
    private byte f76f;

    /* renamed from: N */
    private boolean f77N;

    /* renamed from: b */
    public static Font f78b;

    /* renamed from: b */
    public boolean f79b;

    /* renamed from: m */
    public int f82m;

    /* renamed from: bd */
    private int f83bd;

    /* renamed from: O */
    private boolean f89O;

    /* renamed from: P */
    private boolean f90P;

    /* renamed from: bm */
    private int f99bm;

    /* renamed from: bn */
    private int f100bn;

    /* renamed from: bo */
    private int f101bo;

    /* renamed from: bp */
    private int f102bp;

    /* renamed from: p */
    public static int f103p;

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
    public int f111x;

    /* renamed from: y */
    public int f112y;

    /* renamed from: z */
    public int f113z;

    /* renamed from: A */
    public int Player_Lives;

    /* renamed from: B */
    public int f115B;

    /* renamed from: C */
    public int f116C;

    /* renamed from: D */
    public int f117D;

    /* renamed from: E */
    public int f118E;

    /* renamed from: c */
    public static boolean f120c;

    /* renamed from: d */
    public static boolean f121d;

    /* renamed from: Q */
    private static boolean f122Q;

    /* renamed from: e */
    public static boolean f123e;

    /* renamed from: f */
    public static boolean f124f;

    /* renamed from: g */
    public static boolean f125g;

    /* renamed from: h */
    public static boolean f126h;

    /* renamed from: i */
    public static boolean f127i;

    /* renamed from: j */
    public static boolean f128j;

    /* renamed from: k */
    public static boolean f129k;

    /* renamed from: R */
    private static boolean f130R;

    /* renamed from: l */
    public static boolean f131l;

    /* renamed from: m */
    public static boolean f132m;

    /* renamed from: n */
    public static boolean f133n;

    /* renamed from: o */
    public static boolean f134o;

    /* renamed from: S */
    private static boolean f135S;

    /* renamed from: H */
    public int f141H;

    /* renamed from: i */
    private int[][] f142i;

    /* renamed from: I */
    public int f145I;

    /* renamed from: K */
    public int f169K;

    /* renamed from: L */
    public int f170L;

    /* renamed from: M */
    public int f171M;

    /* renamed from: N */
    public int f172N;

    /* renamed from: O */
    public int f173O;

    /* renamed from: P */
    public int f174P;

    /* renamed from: Q */
    public int f175Q;

    /* renamed from: R */
    public int f176R;

    /* renamed from: S */
    public int f177S;

    /* renamed from: T */
    public int f178T;

    /* renamed from: U */
    public int f179U;

    /* renamed from: V */
    public int f180V;

    /* renamed from: W */
    public int Boss_XPos;

    /* renamed from: X */
    public int Boss_YPos;

    /* renamed from: Y */
    public int f183Y;

    /* renamed from: Z */
    public int f184Z;

    /* renamed from: aa */
    public int f185aa;

    /* renamed from: ab */
    public int f186ab;

    /* renamed from: ac */
    public int f187ac;

    /* renamed from: ad */
    public int f188ad;

    /* renamed from: ae */
    public int f189ae;

    /* renamed from: d */
    private byte[] f191d;

    /* renamed from: e */
    private byte[] f192e;

    /* renamed from: f */
    private byte[] f193f;

    /* renamed from: g */
    private byte[] f194g;

    /* renamed from: j */
    private int[][] f197j;

    /* renamed from: af */
    public int f199af;

    /* renamed from: c */
    public boolean[] f200c;

    /* renamed from: d */
    public boolean[] f201d;

    /* renamed from: s */
    public boolean f206s;

    /* renamed from: ag */
    public int f208ag;

    /* renamed from: a */
    public static int[][][] f210a;

    /* renamed from: b */
    private int[][][] f217b;

    /* renamed from: bu */
    private int f221bu;

    /* renamed from: bv */
    private int f222bv;

    /* renamed from: ai */
    public int f223ai;

    /* renamed from: h */
    private byte[] Level_Chunks;

    /* renamed from: i */
    private byte[] Level_BlockPriorities;

    /* renamed from: b */
    public byte[] Level_Collisions;

    /* renamed from: J */
    private int[] f238J;

    /* renamed from: d */
    private byte[][] f239d;

    /* renamed from: g */
    private byte f245g;

    /* renamed from: i */
    private byte f247i;

    /* renamed from: bx */
    private int f248bx;

    /* renamed from: j */
    private byte f249j;

    /* renamed from: v */
    public boolean f252v;

    /* renamed from: ao */
    public int f253ao;

    /* renamed from: ap */
    public int f254ap;

    /* renamed from: w */
    public boolean f255w;

    /* renamed from: x */
    public boolean f256x;

    /* renamed from: bC */
    private int f266bC;

    /* renamed from: bD */
    private int f267bD;

    /* renamed from: bE */
    private int f268bE;

    /* renamed from: bH */
    private int f273bH;

    /* renamed from: aq */
    public int f274aq;

    /* renamed from: D */
    public boolean f276D;

    /* renamed from: c */
    public byte f277c;

    /* renamed from: V */
    private boolean f281V;

    /* renamed from: W */
    private static boolean f282W;

    /* renamed from: X */
    private static boolean f283X;

    /* renamed from: Y */
    private boolean f284Y;

    /* renamed from: F */
    public boolean f285F;

    /* renamed from: ar */
    public int f286ar;

    /* renamed from: bM */
    private int f294bM;

    /* renamed from: bN */
    private int f295bN;

    /* renamed from: bO */
    private int f296bO;

    /* renamed from: bP */
    private int f298bP;

    /* renamed from: a */
    public MIDlet f307a;

    /* renamed from: az */
    public int f308az;

    /* renamed from: b */
    public long f311b;

    /* renamed from: c */
    public long f312c;

    /* renamed from: d */
    public long f313d;

    /* renamed from: e */
    public long f314e;

    /* renamed from: I */
    public boolean f316I;

    /* renamed from: aE */
    public static int f319aE;

    /* renamed from: aF */
    public static int f320aF;

    /* renamed from: a */
    public static InputStream f322a;

    /* renamed from: bQ */
    private int f327bQ;

    /* renamed from: d */
    private static String[] HighScore_DefaultNames = {"SON", "SON", "SON", "SON", "SON"};

    /* renamed from: C */
    private static int[] HighScore_DefaultScores = {10000, 8000, 6000, 4000, 2000};

    /* renamed from: D */
    private static int[] HighScore_DefaultDifficulties = {0, 1, 2, 1, 0};

    /* renamed from: c */
    private static Image[] GFX_MenuArray = new Image[5];

    /* renamed from: a */
    public static final Font f17a = Font.getFont(0, 0, 16);

    /* renamed from: a */
    public static final int f18a = f17a.getHeight();

    /* renamed from: b */
    public static int GFX_MenuHeight = 0;

    /* renamed from: c */
    public static int f20c = 0;

    /* renamed from: d */
    public static int GFX_MenuWidth = f20c;

    /* renamed from: e */
    public static int f22e = GFX_MenuHeight;

    /* renamed from: g */
    public static int f24g = f20c;

    /* renamed from: h */
    public static int f25h = GFX_MenuHeight;

    /* renamed from: a */
    public static Image[] GFX_HUDArray = new Image[20];

    /* renamed from: b */
    public static Image[] GFX_GameArray = new Image[160];

    /* renamed from: a */
    private static final Random f37a = new Random();

    /* renamed from: a */
    public static final int[] f38a = {0, 5, 3, 6, 2, 7, 1, 4};

    /* renamed from: e */
    private static final String[] Music_Paths = {"/greenhill_loop", "/labyrinth_loop", "/marble_loop", "/starlight_loop", "/springyard_loop", "/scrapbrain", "/invincible", "/1up", "/specialstage", "/maintitle", "/ending", "/bossstage", "/bossstagefinal_loop", "/stageclear", "/gameover", "/continue", "/credits", "/hurry", "/chaosemerald", "/score", "/sega", "/greenhill_intro", "/marble_intro", "/springyard_intro"};

    /* renamed from: b */
    private static final short[][] f63b = {new short[]{0, 120, 0}, new short[]{48, 120, 0}, new short[]{96, 120, 0}, new short[]{96, 120, 1}, new short[]{48, 120, 1}};

    /* renamed from: c */
    private static final short[][] f64c = {new short[]{48, 0}, new short[]{0, 32}, new short[]{48, 32}, new short[]{0, 32}};

    /* renamed from: a */
    public static final int[][] f84a = {new int[]{0, 0, 112, 16}, new int[]{112, 0, 56, 16}, new int[]{0, 16, 80, 16}, new int[]{80, 16, 48, 16}, new int[]{128, 16, 8, 16}, new int[]{136, 16, 16, 16}, new int[]{152, 16, 16, 16}, new int[]{0, 32, 128, 16}, new int[]{128, 32, 24, 8}, new int[]{0, 48, 128, 16}, new int[]{128, 40, 40, 40}, new int[]{0, 64, 120, 16}, new int[]{0, 80, 104, 16}, new int[]{104, 80, 40, 40}, new int[]{0, 96, 104, 16}, new int[]{0, 112, 72, 16}, new int[]{0, 128, 152, 16}, new int[]{0, 144, 176, 16}};

    /* renamed from: b */
    public static int[] f98b = new int[2];

    /* renamed from: c */
    public static int[] Player_Info = new int[16];

    /* renamed from: b */
    public static final int[][] f137b = {new int[]{80, 944, 80, 252, 80, 944, 128, 168}, new int[]{96, 108, 80, 236, 80, 748, 2944, 0}, new int[]{48, 614, 48, 614, 48, 358, 128, 168}, new int[]{64, 716, 64, 332, 64, 332, 128, 168}, new int[]{48, 957, 48, 445, 48, 236, 128, 168}, new int[]{48, 1164, 48, 1868, 8512, 1452, 128, 168, 304, 168}, new int[]{1568, 363, 3808, 364, 128, 168, 128, 168}};

    /* renamed from: a */
    public static final byte[] f143a = {1, 2, 3, 2};

    /* renamed from: d */
    public static final int[] f144d = {912, 224, 656, 672, 1360, -16};

    /* renamed from: e */
    public static final int[] f148e = {32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};

    /* renamed from: g */
    public static final int[] f150g = {1296, 3632, 752, 4880};

    /* renamed from: h */
    public static final int[] f151h = {1168, 1104, 1680, 1360};

    /* renamed from: i */
    public static final int[] f152i = {1263, 3598, 785, 4845};

    /* renamed from: j */
    public static final int[] f153j = {1216, 1136, 1728, 1392};

    /* renamed from: k */
    public static final int[] f154k = {-1, -1, 1, -1};

    /* renamed from: l */
    public static final int[] f156l = {4, 7, 5, 6, 0, 3, 2, 1};

    /* renamed from: m */
    public static final int[] f157m = {0, 5, 8, 17, 20, 28, 32, 34};

    /* renamed from: n */
    public static final int[] f159n = {0, 10000, 1000, 100};

    /* renamed from: o */
    public static final int[] f160o = {-8, -16, -12, 12, 16, 8};

    /* renamed from: p */
    public static final int[] f161p = {22, 25, 13, 22, 25, 13};

    /* renamed from: q */
    public static final int[] f162q = {2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};

    /* renamed from: r */
    public static final int[] f163r = {8, 0, 4, 3, 2, 1, 0};

    /* renamed from: s */
    public static final int[] f164s = {f38a[0], f38a[1], f38a[7], f38a[4]};

    /* renamed from: t */
    public static final int[] f165t = {8, 0, 40, 24, 10, 40, 30, 24, 41, 6};

    /* renamed from: u */
    public static final int[] f166u = {8, 16, 8, 30, 23, 24, 18, 16, 18, 8};

    /* renamed from: v */
    public static final int[] f167v = {0, 32, 64, 96, 128, 168, 208};

    /* renamed from: d */
    public static final int[][] f168d = {new int[]{44, 44, 44, 44, 44, 44, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 44, 44, 44, 44, 44, 44, 44}, new int[]{52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, new int[]{37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53}};

    /* renamed from: d */
    private static final short[][] f195d = {new short[]{0, 0}, new short[]{16, 0}, new short[]{0, 16}, new short[]{16, 16}};

    /* renamed from: e */
    private static final short[][] f196e = {new short[]{-250, -360}, new short[]{-80, -100}, new short[]{-160, -250}, new short[]{-200, -300}, new short[]{-120, -225}, new short[]{-150, -250}, new short[]{-100, -165}};

    /* renamed from: b */
    private static final byte[][] f209b = {new byte[]{28, 31}, new byte[]{32, 29}, new byte[]{33, 29}, new byte[]{28, 34}, new byte[]{34, 30}, new byte[]{31, 30}, new byte[]{33, 33}, new byte[]{31, 31}};

    /* renamed from: f */
    private static final short[][] f216f = {new short[]{9312, 7776}, new short[]{6736, 4176, 8208}, new short[]{6224, 6224}, new short[]{8288, 8032}, new short[]{8800, 10336}, new short[]{8544, 7648}};

    /* renamed from: x */
    public static final int[] f218x = {0, 2, 7, 12, 11, 9, 1};

    /* renamed from: f */
    public static final int[][] f219f = {new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{1, 1, 1}, new int[]{3, 3, 3}, new int[]{5, 5, 1}, new int[]{5, 0}};

    /* renamed from: g */
    public static final int[][] f220g = {new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 3}, new int[]{3, 3}};

    /* renamed from: y */
    public static int[] f228y = new int[2];

    /* renamed from: z */
    public static int[] Camera_Pos = new int[2];

    /* renamed from: c */
    private static final int[][][] f241c = {new int[]{new int[]{4, 0, 9407, 0, 768, 96}, new int[]{4, 0, 7871, 0, 768, 96}, new int[]{4, 0, 10592, 0, 768, 96}, new int[]{4, 0, 10943, 0, 768, 96}}, new int[0], new int[]{new int[]{4, 0, 6079, 0, 464, 96}, new int[]{4, 0, 6079, 0, 1312, 96}, new int[]{4, 0, 6144, 0, 1824, 96}, new int[]{4, 0, 5823, 0, 1824, 96}}, new int[0], new int[]{new int[]{4, 0, 8896, 0, 1056, 96}, new int[]{4, 0, 10432, 0, 1312, 96}, new int[]{4, 0, 11264, 0, 1568, 96}, new int[]{4, 0, 11968, 0, 1568, 96}}, new int[0]};

    /* renamed from: z */
    public static boolean f258z = true;

    /* renamed from: A */
    public static boolean f259A = true;

    /* renamed from: B */
    public static boolean f260B = true;

    /* renamed from: A */
    public static final int[] f306A = {0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};

    /* renamed from: l */
    private static final int[][] f324l = {new int[]{0, 0, 190, 109}, new int[]{0, 159, 49, 57}, new int[]{0, 109, 56, 50}, new int[]{107, 188, 53, 36}, new int[]{62, 109, 60, 55}, new int[]{50, 164, 55, 57}, new int[]{127, 110, 35, 57}, new int[]{163, 109, 27, 58}, new int[]{127, 110, 35, 57}, new int[]{135, 167, 26, 21}, new int[]{163, 167, 27, 57}, new int[]{163, 109, 27, 58}, new int[]{0, 224, 190, 56}};

    /* renamed from: a */
    private static final char[] HighScore_ValidChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '@', '?', '!', ',', '.', ' '};

    /* renamed from: g */
    private boolean[] f15g = new boolean[10];

    /* renamed from: a */
    public boolean[] Input_Array = new boolean[10];

    /* renamed from: a */
    public String[] f34a = new String[2];

    /* renamed from: j */
    public int f35j = 1;

    /* renamed from: k */
    public int f36k = 1;

    /* renamed from: a */
    public boolean f41a = false;

    /* renamed from: a */
    private byte[][] f42a = {new byte[]{31, 32, 33}, new byte[]{35, 34}, new byte[]{39, 40, 41, 42, 43}};

    /* renamed from: l */
    public int Player_Emeralds = 0;

    /* renamed from: E */
    private final int[] f46E = {5898300, (((getWidth() - 90) - 16) << 16) | 60, 4587610, (((getWidth() - 70) - 16) << 16) | 90, 5898366, (((getWidth() - 90) - 16) << 16) | 126};

    /* renamed from: aN */
    private int f49aN = 0;

    /* renamed from: aO */
    private int f50aO = 0;

    /* renamed from: aQ */
    private int f52aQ = 0;

    /* renamed from: aT */
    private int f55aT = 0;

    /* renamed from: aZ */
    private int f61aZ = GFX_MenuWidth >> 1;

    /* renamed from: ba */
    private int f62ba = (f25h * 3) >> 2;

    /* renamed from: b */
    public String[] f66b = new String[93];

    /* renamed from: f */
    private String[] f67f = new String[357];

    /* renamed from: M */
    private boolean f74M = false;

    /* renamed from: bc */
    private int f80bc = 10;

    /* renamed from: h */
    private int[][] f81h = new int[this.f80bc][15];

    /* renamed from: be */
    private int f85be = 0;

    /* renamed from: bf */
    private int f86bf = 2100;

    /* renamed from: bg */
    private int f87bg = 0;

    /* renamed from: bh */
    private int f88bh = 0;

    /* renamed from: n */
    public int Player_TopSpeed = 1536;

    /* renamed from: o */
    public int Player_Acceleration = 12;

    /* renamed from: bi */
    private int Player_Deceleration = 128;

    /* renamed from: bj */
    private int f94bj = 56;

    /* renamed from: bk */
    private int Player_JumpForce = 1664;

    /* renamed from: bl */
    private int Player_WaterJumpForce = 896;

    /* renamed from: F */
    private int[] f97F = new int[2];

    /* renamed from: h */
    private boolean[] f136h = new boolean[4];

    /* renamed from: F */
    public int f138F = 0;

    /* renamed from: G */
    public int f139G = 0;

    /* renamed from: c */
    public int[][] f140c = new int[30][25];

    /* renamed from: a */
    public short[][] f146a = new short[10][4];

    /* renamed from: J */
    public int f147J = 0;

    /* renamed from: f */
    public int[] f149f = {64, 32, 64};

    /* renamed from: b */
    public boolean[] f155b = new boolean[256];

    /* renamed from: p */
    public boolean f158p = false;

    /* renamed from: c */
    private byte[] f190c = new byte[8192];

    /* renamed from: e */
    public int[][] f198e = new int[256][25];

    /* renamed from: w */
    public int[] Object_Info = new int[25];

    /* renamed from: k */
    private int[][] f203k = new int[30][10];

    /* renamed from: q */
    public boolean f204q = false;

    /* renamed from: r */
    public boolean f205r = false;

    /* renamed from: e */
    public boolean[] f207e = new boolean[256];

    /* renamed from: ah */
    public int f211ah = 0;

    /* renamed from: bq */
    private int f212bq = 0;

    /* renamed from: br */
    private int f213br = 0;

    /* renamed from: bs */
    private int f214bs = 0;

    /* renamed from: bt */
    private int f215bt = 0;

    /* renamed from: aj */
    public int Game_ZoneID = -1;

    /* renamed from: ak */
    public int Game_ActID = 0;

    /* renamed from: al */
    public int f226al = 0;

    /* renamed from: am */
    public int f227am = 0;

    /* renamed from: G */
    private int[] f230G = new int[2];

    /* renamed from: H */
    private int[] f231H = new int[2];

    /* renamed from: I */
    private int[] f232I = new int[2];

    /* renamed from: j */
    private byte[] f236j = new byte[8192];

    /* renamed from: c */
    private byte[][] Level_ActorLayout = new byte[4];

    /* renamed from: k */
    private byte[] f240k = new byte[512];

    /* renamed from: bw */
    private int f242bw = 0;

    /* renamed from: t */
    public boolean f243t = false;

    /* renamed from: u */
    public boolean f244u = false;

    /* renamed from: h */
    private byte f246h = 9;

    /* renamed from: an */
    public int f250an = 0;

    /* renamed from: l */
    private byte[] f251l = new byte[4];

    /* renamed from: y */
    public boolean f257y = false;

    /* renamed from: by */
    private int f261by = 0;

    /* renamed from: bz */
    private int f262bz = 0;

    /* renamed from: bA */
    private int f263bA = 0;

    /* renamed from: bB */
    private int f264bB = 0;

    /* renamed from: T */
    private boolean f265T = false;

    /* renamed from: U */
    private boolean f269U = false;

    /* renamed from: C */
    public boolean f270C = false;

    /* renamed from: bF */
    private int f271bF = 0;

    /* renamed from: bG */
    private int f272bG = 0;

    /* renamed from: bI */
    private int f275bI = 10;

    /* renamed from: K */
    private int[] f278K = new int[4];

    /* renamed from: bJ */
    private int f279bJ = 0;

    /* renamed from: E */
    public boolean f280E = false;

    /* renamed from: as */
    public int f287as = 0;

    /* renamed from: at */
    public int f288at = 0;

    /* renamed from: au */
    public int f289au = 0;

    /* renamed from: bK */
    private int f290bK = 0;

    /* renamed from: bL */
    private int f291bL = 0;

    /* renamed from: Z */
    private boolean f292Z = false;

    /* renamed from: aa */
    private boolean f293aa = false;

    /* renamed from: av */
    public int f297av = 0;

    /* renamed from: m */
    private byte[] Game_Settings = new byte[4];

    /* renamed from: aw */
    public int f300aw = 0;

    /* renamed from: f */
    public boolean[] Cheats_Active = {false, false, false, false, false};

    /* renamed from: G */
    public boolean f302G = false;

    /* renamed from: ax */
    public int f303ax = 0;

    /* renamed from: ay */
    public int f304ay = 0;

    /* renamed from: H */
    public boolean f305H = false;

    /* renamed from: aA */
    public int f309aA = 0;

    /* renamed from: aB */
    public int f310aB = 0;

    /* renamed from: aC */
    public int f315aC = Integer.MIN_VALUE;

    /* renamed from: B */
    public int[] f317B = new int[6];

    /* renamed from: aD */
    public int f318aD = 0;

    /* renamed from: c */
    public String[] f321c = {"", ""};

    /* renamed from: aG */
    public int f323aG = 3;

    /* renamed from: J */
    public boolean f325J = false;

    /* renamed from: ab */
    private boolean f326ab = false;

    /* renamed from: bR */
    private int f329bR = 0;

    /* renamed from: L */
    private int[] f330L = new int[3];

    /* renamed from: M */
    private int[] f331M = new int[8];

    /* renamed from: bS */
    private int f332bS = 0;

    /* renamed from: b */
    private String f333b = "";

    /* renamed from: K */
    public boolean f334K = false;

    /* renamed from: a */
    public static int Math_CalcSine(int i) {
        int i2 = i % 360;
        if (i2 < 0 || i2 > 90) {
            if (i2 <= 90 || i2 > 180) {
                if (i2 <= 180 || i2 > 270) {
                    if (i2 <= 270 || i2 > 359) {
                        return 0;
                    }
                    return (-1) * (f306A[90 - (i2 - 270)] / 100);
                }
                return (-1) * (f306A[i2 - 180] / 100);
            }
            return f306A[90 - (i2 - 90)] / 100;
        }
        return f306A[i2] / 100;
    }

    /* renamed from: b */
    public static int m143b(int i) {
        int i2 = i % 360;
        if (i2 < 0 || i2 >= 90) {
            if (i2 < 90 || i2 >= 180) {
                if (i2 < 180 || i2 >= 270) {
                    if (i2 < 270 || i2 > 359) {
                        return 0;
                    }
                    return (-1) * (f306A[i2 - 270] / 100);
                }
                return f306A[89 - (i2 - 180)] / 100;
            }
            return f306A[i2 - 90] / 100;
        }
        return ((-1) * f306A[89 - i2]) / 100;
    }

    /* renamed from: a */
    public final void m233a() {
        this.Boss_XPos = 11424;
        this.Boss_YPos = 1232;
        for (int i = 0; i < 10; i++) {
            this.f146a[i][0] = (short) ((-160) + (32 * i) + 16);
            this.f146a[i][1] = 176;
            this.f146a[i][2] = 0;
            this.f146a[i][3] = 0;
        }
    }

    /* renamed from: b */
    public final void m145b() {
        for (int i = 0; i < 10; i++) {
            if (this.f146a[i][3] != 0) {
                m134b(23, (int) this.f146a[i][0], (int) this.f146a[i][1], 330, 300, 0);
                m134b(23, (int) this.f146a[i][0], (int) this.f146a[i][1], 30, 300, 1);
                m134b(23, (int) this.f146a[i][0], (int) this.f146a[i][1], 300, 300, 2);
                m134b(23, (int) this.f146a[i][0], (int) this.f146a[i][1], 60, 300, 3);
                this.f146a[i][2] = 1;
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
            if (this.f146a[i3][2] == 0) {
                if (this.f146a[i3][3] == 0) {
                    i = this.Boss_XPos + this.f146a[i3][0];
                    i2 = this.Boss_YPos;
                    s = this.f146a[i3][1];
                } else {
                    i = this.Boss_XPos + ((this.f177S + this.f179U) / 100);
                    i2 = this.Boss_YPos + ((this.f178T + this.f180V) / 100);
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
        if (this.f170L > 99) {
            if (m144b()) {
                iArr[0] = 0;
                return;
            }
            return;
        }
        this.f174P += 200;
        this.f179U = 0;
        this.f180V = Math_CalcSine(this.f174P / 100) * 12;
        int m235a = (m235a() - (this.Boss_XPos - 160)) / 32;
        int i3 = (this.f177S + 16000) / 3200;
        int abs = Math.abs(((this.f177S / 100) + 160) - ((i3 * 32) + 16));
        if (m235a == i3 && abs < 3 && this.f147J == 0) {
            z = true;
        }
        if (this.f147J > 0) {
            this.f147J--;
        }
        if (this.f175Q > 16 && m212a(iArr[2], ((iArr[3] + 8) - 32) + this.f175Q, 14, 32, false) != 0) {
            Player_Hurt();
        }
        if (m124c() && this.f170L > 3 && this.f185aa == 0) {
            m105d(iArr[2], iArr[3]);
            if (this.f185aa == 0 && this.f170L < 100) {
                int i4 = this.f189ae - 1;
                this.f189ae = i4;
                if (i4 <= 0) {
                    m145b();
                    this.f170L = 100;
                    return;
                }
                this.f187ac = 3;
                this.f188ad = 60;
                this.f185aa = 60;
            }
        }
        switch (this.f170L) {
            case 1:
                this.f187ac = 0;
                this.f171M = 2;
                this.f177S = 19200;
                this.f178T = 10000;
                this.f173O = 0;
                this.f174P = 0;
                this.f183Y = 50;
                this.f147J = 90;
                z = false;
                this.f170L++;
                if (this.f183Y <= 0) {
                    this.f170L++;
                    this.f171M = 2;
                    this.f178T -= 20;
                    this.f177S -= 100;
                    if (this.f177S <= 6400) {
                        this.f177S = 6400;
                        this.f171M = 0;
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 60;
                        this.f170L++;
                        if (!z) {
                            game = this;
                            i = 10;
                            game.f170L = i;
                            break;
                        } else {
                            this.f171M = 2;
                            this.f172N = 0;
                            this.f177S -= 70;
                            if (this.f177S <= -12000) {
                                this.f177S = -12000;
                                this.f170L++;
                                if (z) {
                                    this.f171M = 2;
                                    this.f172N = 1;
                                    this.f177S += 70;
                                    if (this.f177S >= 12000) {
                                        this.f177S = 12000;
                                        this.f170L++;
                                        game = this;
                                        i = 4;
                                        game.f170L = i;
                                    }
                                } else {
                                    game = this;
                                    i = 10;
                                    game.f170L = i;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (this.f183Y <= 0) {
                }
                break;
            case 3:
                this.f171M = 2;
                this.f178T -= 20;
                this.f177S -= 100;
                if (this.f177S <= 6400) {
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
                game.f170L = i;
                break;
            case 7:
            case 8:
            case 9:
            default:
                this.f170L = 1;
                this.f187ac = 0;
                this.f171M = 2;
                this.f177S = 19200;
                this.f178T = 10000;
                this.f173O = 0;
                this.f174P = 0;
                this.f183Y = 50;
                this.f147J = 90;
                z = false;
                this.f170L++;
                if (this.f183Y <= 0) {
                }
                break;
            case 10:
                this.f171M = 0;
                this.f187ac = 1;
                this.f170L++;
                this.f178T += 120;
                if (this.f175Q < 32) {
                    this.f175Q++;
                }
                if (this.f178T >= 15400) {
                    this.f178T = 15400;
                    this.f183Y = 48;
                    this.f146a[i3][3] = 1;
                    this.f170L++;
                    this.f179U = 0;
                    this.f180V = m123c(400) - 200;
                    if (this.f183Y <= 0) {
                        this.f179U = 0;
                        this.f180V = 0;
                        this.f170L++;
                        this.f178T -= 300;
                        if (this.f178T <= 2400) {
                            this.f178T = 2400;
                            this.f183Y = 50;
                            this.f170L++;
                            this.f179U = 0;
                            this.f180V = m123c(400) - 200;
                            if (this.f175Q > 0) {
                                this.f175Q--;
                            }
                            if (this.f183Y <= 0) {
                                if (this.f146a[i3][2] == 0) {
                                    this.f179U = 0;
                                    this.f180V = 0;
                                    m134b(23, iArr[2], iArr[3] + 24, 330, 300, 0);
                                    m134b(23, iArr[2], iArr[3] + 24, 30, 300, 1);
                                    m134b(23, iArr[2], iArr[3] + 24, 300, 300, 2);
                                    m134b(23, iArr[2], iArr[3] + 24, 60, 300, 3);
                                    this.f146a[i3][2] = 1;
                                }
                                this.f183Y = 30;
                                this.f170L++;
                                if (this.f183Y <= 0) {
                                    this.f147J = 120;
                                    game = this;
                                    i = this.f172N == 0 ? 4 : 5;
                                    game.f170L = i;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                this.f178T += 120;
                if (this.f175Q < 32) {
                }
                if (this.f178T >= 15400) {
                }
                break;
            case 12:
                this.f179U = 0;
                this.f180V = m123c(400) - 200;
                if (this.f183Y <= 0) {
                }
                break;
            case 13:
                this.f178T -= 300;
                if (this.f178T <= 2400) {
                }
                break;
            case 14:
                this.f179U = 0;
                this.f180V = m123c(400) - 200;
                if (this.f175Q > 0) {
                }
                if (this.f183Y <= 0) {
                }
                break;
            case 15:
                if (this.f183Y <= 0) {
                }
                break;
        }
        m112c(iArr);
        if (this.f170L == 4 || this.f170L == 5) {
            if (Math.abs(iArr[2] - m235a()) < 64) {
                if (this.f178T <= 1000) {
                    return;
                }
                game2 = this;
                i2 = game2.f178T - 160;
            } else if (this.f178T >= 8000) {
                return;
            } else {
                game2 = this;
                i2 = game2.f178T + 140;
            }
            game2.f178T = i2;
        }
    }

    public void hideNotify() {
        Game_Pause();
    }

    public void showNotify() {
        m79g();
        this.f298bP = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v91, types: [byte[], byte[][]] */
    public Game(MIDlet mIDlet, int i) {
        short[] sArr = {new short[]{0, 0, 64, 96}, new short[]{64, 0, 64, 96}, new short[]{128, 0, 64, 96}};
        this.f308az = 0;
        this.f307a = mIDlet;
        this.f308az = i;
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
        if (!this.f302G && this.f223ai == 1) {
            if (i == "230691".charAt(this.f303ax)) {
                game2 = this;
                i2 = game2.f303ax + 1;
            } else {
                game2 = this;
                i2 = 0;
            }
            game2.f303ax = i2;
            if (this.f303ax == 6) {
                this.f302G = true;
            }
        }
        if (f132m && this.f223ai == 2) {
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
                if (this.f302G && this.Cheats_Active[4]) {
                    this.f305H = !this.f305H;
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
        m171ab();
        Text_LoadLang();
        m169ad();
        m167af();
        this.Music_MainPlayer = new Audio_Player(this);
        this.Music_MainPlayer.f336a = Music_Paths;
        this.Music_MainPlayer.m5a((int) this.Game_Settings[1]);
        this.f204q = true;
        m101d(true);
        this.f223ai = 1;
        this.f252v = true;
        this.f253ao = 10;
        this.f199af = 0;
    }

    public void paint(Graphics graphics) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    /* renamed from: g */
    public final void m79g() {
        this.f315aC = Integer.MIN_VALUE;
        this.f309aA = (int) ((System.currentTimeMillis() - this.f311b) / 18);
    }

    /* renamed from: h */
    public final void m73h() {
        Record_Save(this.Game_Settings, "config");
    }

    /* renamed from: ab */
    private void m171ab() {
        this.Game_Settings = Record_Load("config");
        if (this.Game_Settings == null) {
            this.f74M = true;
            this.Game_Settings = new byte[4];
            this.Game_Settings[0] = 1;
            this.Game_Settings[1] = 1;
            this.Game_Settings[2] = 0;
            m73h();
        }
    }

    /* renamed from: ac */
    private void m170ac() {
        byte[] bArr = new byte[10];
        bArr[0] = this.f245g;
        bArr[1] = this.f246h;
        bArr[2] = this.f247i;
        for (int i = 0; i < 4; i++) {
            bArr[3 + i] = (byte) (this.f248bx >> ((i << 3) & 255));
        }
        bArr[7] = (byte) this.Player_Emeralds;
        Record_Save(bArr, "savedGame");
    }

    /* renamed from: a */
    private String m234a() {
        long j = 0 | (this.f247i << 30) | (this.f248bx << 3) | this.Player_Emeralds;
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
        if (this.f245g == 0) {
            this.f246h = (byte) 10;
        }
        this.f247i = b;
        this.f248bx = i2;
        this.Player_Emeralds = i3;
        m170ac();
        return true;
    }

    /* renamed from: ad */
    private void m169ad() {
        try {
            byte[] Record_Load = Record_Load("savedGame");
            this.f245g = Record_Load[0];
            this.f246h = Record_Load[1];
            this.f247i = Record_Load[2];
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (Record_Load[3 + i2] & 255) << (i2 << 3);
            }
            this.f248bx = i;
            this.Player_Emeralds = Record_Load[7];
            this.f304ay = this.Player_Emeralds;
        } catch (Exception unused) {
            m170ac();
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
        if (this.f223ai != 1) {
            if (this.f223ai == 6 || this.f223ai == 4 || this.f223ai == 2 || this.f223ai == 3 || this.f223ai == 9 || this.f223ai == 7) {
                strArr = this.f34a;
                c = 0;
                str = "";
            } else {
                if (this.Game_Settings[1] != 0) {
                    strArr = this.f34a;
                    c = 0;
                    strArr3 = this.f66b;
                    c3 = 'E';
                } else {
                    strArr = this.f34a;
                    c = 0;
                    strArr3 = this.f66b;
                    c3 = 'D';
                }
                str = strArr3[c3];
            }
            strArr[c] = str;
            if (this.f223ai == 2) {
                if ((this.Player_Lives > 0 || !f128j) && !this.f158p) {
                    strArr2 = this.f34a;
                    c2 = 1;
                    str2 = this.f66b[60];
                } else {
                    strArr2 = this.f34a;
                    c2 = 1;
                    str2 = "";
                }
            } else if (this.f223ai == 10) {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = this.f66b[61];
            } else if (this.f223ai == 6) {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = this.f66b[66];
            } else if (this.f223ai == 3) {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = this.f66b[59];
            } else if (this.f223ai == 4) {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = "";
            } else if (this.f223ai != 9) {
                return;
            } else {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = "OK";
            }
        } else if (this.Menu_ID == 3 || this.Menu_ID == 4) {
            if (this.Game_Settings[1] != 0) {
                strArr4 = this.f34a;
                c4 = 0;
                strArr5 = this.f66b;
                c5 = 'E';
            } else {
                strArr4 = this.f34a;
                c4 = 0;
                strArr5 = this.f66b;
                c5 = 'D';
            }
            strArr4[c4] = strArr5[c5];
            if (this.Menu_ID == 4) {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = this.f66b[59];
            } else {
                strArr2 = this.f34a;
                c2 = 1;
                str2 = this.f66b[57];
            }
        } else if (this.Menu_ID != 14) {
            return;
        } else {
            this.f34a[1] = this.f66b[59];
            strArr2 = this.f34a;
            c2 = 0;
            str2 = "";
        }
        strArr2[c2] = str2;
    }

    /* renamed from: a */
    public final boolean m232a() {
        try {
            if (this.f79b && this.f34a[1].equals(this.f66b[60])) {
                Game_Pause();
                return true;
            }
            this.f79b = false;
            char c = 65535;
            if (this.Input_Array[5]) {
                if (this.Menu_ID == 17) {
                    return false;
                }
                this.Input_Array[5] = false;
                c = 0;
            } else if (this.Input_Array[6]) {
                if (this.f223ai == 1) {
                    return false;
                }
                this.Input_Array[6] = false;
                c = 1;
            }
            if (c != 65535) {
                if (this.f34a[c].equals(this.f66b[59])) {
                    if (this.f223ai != 3) {
                        m106d(3);
                        return true;
                    }
                    m106d(4);
                    this.f72e = (byte) 1;
                    m41n(11 + this.f72e);
                    m37o(2);
                    return true;
                } else if (this.f34a[c].equals(this.f66b[60])) {
                    this.f223ai = 10;
                    this.f252v = true;
                    this.f253ao = 10;
                    this.f250an = 0;
                    this.Music_MainPlayer.m7a();
                    return true;
                } else if (this.f34a[c].equals(this.f66b[61])) {
                    m73h();
                    this.f223ai = 2;
                    this.f204q = true;
                    this.f252v = true;
                    this.f253ao = 10;
                    this.f257y = true;
                    f260B = true;
                    m90e(false);
                    m79g();
                    return true;
                } else if (this.f34a[c].equals(this.f66b[66])) {
                    m106d(3);
                    return true;
                } else if (this.f34a[c].equals(this.f66b[68])) {
                    this.Game_Settings[1] = this.f251l[1];
                    if (this.Game_Settings[1] == 0) {
                        this.Game_Settings[1] = 1;
                    }
                    m73h();
                    this.Music_MainPlayer.m5a(1);
                    this.f252v = true;
                    this.f253ao = 10;
                    return true;
                } else if (this.f34a[c].equals(this.f66b[69])) {
                    this.f251l[1] = this.Game_Settings[1];
                    this.Game_Settings[1] = 0;
                    m73h();
                    this.Music_MainPlayer.m5a(0);
                    this.f252v = true;
                    this.f253ao = 10;
                    return true;
                } else if (this.f34a[c].equals(this.f66b[57])) {
                    this.Menu_ID = (byte) 14;
                    this.f72e = (byte) 1;
                    m37o(3);
                    return true;
                } else if (this.f34a[c].equals("OK")) {
                    m173aK();
                }
            }
            return false;
        } catch (Exception unused) {
            this.f79b = false;
            return false;
        }
    }

    /* renamed from: i */
    public final void Game_Pause() {
        if (this.f223ai != 2) {
            this.f204q = true;
            return;
        }
        this.f223ai = 10;
        this.f252v = true;
        this.f253ao = 10;
        this.f250an = 0;
        this.f79b = false;
        this.Music_MainPlayer.m7a();
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
            if (!z || this.f226al >= f219f.length) {
                if (this.f226al >= 0) {
                    this.f226al--;
                    if (this.f226al < 0) {
                        this.f226al = 6;
                        game = this;
                        i = 2;
                        game.f227am = i;
                    }
                }
                if (!m229a(f219f[this.f226al][0])) {
                    return;
                }
            } else {
                this.f226al++;
                if ((this.f226al == 6 && this.f227am == 3) || this.f226al > 6) {
                    this.f226al = 0;
                    game = this;
                    i = 0;
                    game.f227am = i;
                }
                if (!m229a(f219f[this.f226al][0])) {
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
        if (this.f252v) {
            m166ag();
            if (this.f253ao > 0) {
                this.f253ao--;
                return;
            }
            this.f253ao = 0;
            this.f252v = false;
        }
    }

    public void sizeChanged(int i, int i2) {
        f20c = i;
        GFX_MenuHeight = i2;
        GFX_MenuWidth = f20c;
        f24g = f20c;
        f25h = (f24g * 3) >> 2;
        f24g = Math.min(f24g, 480);
        f25h = Math.min(f25h, 336);
        f319aE = (f24g / 16) + 2;
        f320aF = (f25h / 16) + 2;
        this.f294bM = (((-f24g) * 2) * 4) / 4;
        this.f295bN = ((f24g * 2) * 4) / 4;
        this.f296bO = ((f25h * 4) * 4) / 4;
        f26i = (GFX_MenuHeight - f25h) >> 1;
        f22e = f25h + 72;
        f23f = (GFX_MenuHeight - f22e) >> 1;
        f28aI = f26i + (f25h >> 1);
        f27aH = f24g >> 1;
        this.f62ba = (f25h * 3) >> 2;
        this.f61aZ = GFX_MenuWidth >> 1;
        this.f217b = new int[f319aE][f320aF][3];
    }

    /* renamed from: k */
    public final void m56k() {
        m129b(false);
    }

    /* renamed from: b */
    public final void m129b(boolean z) {
        int height = GFX_Painter.getFont().getHeight();
        if (this.f34a[0] != null && (this.f34a[0] != this.f321c[0] || this.f223ai != 2 || z)) {
            m198a(this.f34a[0], GFX_MenuWidth >> 2, GFX_MenuHeight - height, 17, true);
            this.f321c[0] = this.f34a[0];
        }
        if (this.f34a[1] != null) {
            if (this.f34a[1] == this.f321c[1] && this.f223ai == 2 && !z) {
                return;
            }
            m198a(this.f34a[1], (GFX_MenuWidth * 3) >> 2, GFX_MenuHeight - height, 17, true);
            this.f321c[1] = this.f34a[1];
        }
    }

    /* renamed from: l */
    public final void m51l() {
        Graphics graphics;
        Image[] imageArr;
        char c;
        if ((this.Player_Lives > 0 || !f128j) && !(f283X && this.f111x == 59 && this.f112y == 9)) {
            return;
        }
        int i = 112 - (((GFX_MenuWidth >> 1) - 64) - 9);
        int i2 = (GFX_MenuWidth >> 1) + 9 + 112;
        int i3 = (660 - this.f113z) * 6;
        if (120 - i3 < 8) {
            i3 = 112;
        }
        if (this.f111x == 59 && this.f112y == 9) {
            m195a(GFX_Painter, GFX_HUDArray[15], 0, 0, 64, 16, f38a[0], i3 - i, f25h >> 1, 20, true);
            graphics = GFX_Painter;
            imageArr = GFX_HUDArray;
            c = 15;
        } else {
            m195a(GFX_Painter, GFX_HUDArray[14], 0, 0, 64, 16, f38a[0], i3 - i, f25h >> 1, 20, true);
            graphics = GFX_Painter;
            imageArr = GFX_HUDArray;
            c = 14;
        }
        m195a(graphics, imageArr[c], 0, 16, 64, 16, f38a[0], i2 - i3, f25h >> 1, 20, true);
    }

    /* renamed from: ah */
    private void m165ah() {
        byte[] bArr;
        int i;
        byte b;
        this.f191d = new byte[this.Level_Chunks.length >> 1];
        this.f192e = new byte[this.Level_Chunks.length >> 1];
        this.f193f = new byte[this.Level_Chunks.length >> 1];
        this.f194g = new byte[this.Level_Chunks.length >> 1];
        for (int i2 = 0; i2 < (this.Level_Chunks.length >> 1); i2++) {
            int i3 = this.Level_Chunks[i2 << 1] & 255;
            this.f193f[i2] = 0;
            this.f194g[i2] = 0;
            Math.abs(((byte) (i3 << 6)) >> 6);
            if ((i3 >> 5) <= 1) {
                this.f194g[i2] = 1;
            }
            if ((i3 >> 5) % 2 == 0) {
                this.f193f[i2] = 1;
            }
            this.f192e[i2] = (byte) ((i3 >> 3) & 3);
            this.f191d[i2] = 0;
            if ((i3 & 1) == 1) {
                bArr = this.f191d;
                i = i2;
                b = 1;
            } else if ((i3 & 3) == 2) {
                bArr = this.f191d;
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
        int i = f38a[0];
        int i2 = (this.f35j >> 1) & 3;
        int i3 = i2;
        if (i2 == 3) {
            i = f38a[4];
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
                this.Object_Info[10] = this.f35j - this.Object_Info[11];
                if (this.Object_Info[10] > 5) {
                    this.Object_Info[10] = 5;
                }
            } else if (m213a(m235a(), m146b() - 12, f98b[0], f98b[1] - 12, 12, 12, this.Object_Info[2], this.Object_Info[3], this.Object_Info[6], this.Object_Info[7], 32, 32) >= 0) {
                this.Object_Info[5] = 1;
                this.Object_Info[0] = -1;
                this.Object_Info[11] = this.f35j;
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
            if ((this.f221bu << 4) > (Camera_Pos[0] >> 4) + i7) {
                for (int i8 = i2; i8 < i2 + i4; i8++) {
                    try {
                        int i9 = (this.f239d[(((Camera_Pos[1] >> 4) + i8) >> 4) % this.f222bv][((Camera_Pos[0] >> 4) + i7) >> 4] << 9) + (((((Camera_Pos[0] >> 4) + i7) & 15) + ((((Camera_Pos[1] >> 4) + i8) & 15) << 4)) << 1) + 1;
                        int i10 = (this.Level_Chunks[i9] & 255) + (this.f191d[i9 >> 1] << 8);
                        int i11 = i10;
                        if (i10 != 0) {
                            if (this.Game_ZoneID == 2) {
                                if (i11 == 367 || i11 == 366) {
                                    i5 = (i11 + (this.f35j / 5)) & 1;
                                    i6 = 366;
                                } else if (i11 == 365 || i11 == 364) {
                                    i5 = (i11 + (this.f35j / 5)) & 1;
                                    i6 = 364;
                                } else if (i11 == 363 || i11 == 362) {
                                    i5 = (i11 + (this.f35j / 5)) & 1;
                                    i6 = 362;
                                }
                                i11 = i5 + i6;
                            }
                            char c2 = 0;
                            if (this.f192e[i9 >> 1] != 0) {
                                if (this.f192e[i9 >> 1] == 1) {
                                    c = 4;
                                } else if (this.f192e[i9 >> 1] == 2) {
                                    c = 6;
                                } else if (this.f192e[i9 >> 1] == 3) {
                                    c = 2;
                                }
                                c2 = c;
                            }
                            m195a(GFX_Painter, GFX_ZoneTiles, (i11 % 16) * 16, (i11 / 16) * 16, 16, 16, f38a[c2], (i7 * 16) - (Camera_Pos[0] & 15), (i8 * 16) - (Camera_Pos[1] & 15), 20, true);
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
        for (int i = 0; i < f319aE; i++) {
            if ((this.f221bu << 4) > (Camera_Pos[0] >> 4) + i) {
                for (int i2 = 0; i2 < f320aF; i2++) {
                    int i3 = this.f217b[i][i2][1];
                    int i4 = this.f217b[i][i2][0];
                    if (this.f217b[i][i2][2] == 1 && i4 != 0 && !z) {
                        try {
                            graphics.drawRegion(GFX_ZoneTiles, (i4 & 15) * 16, (i4 >> 4) * 16, 16, 16, f38a[i3], (i * 16) - m71h, ((i2 * 16) - m71h2) + f26i, 20);
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
        for (int i4 = 0; i4 < f319aE; i4++) {
            i3 += 16;
            int i5 = coarsecamY;
            int i6 = ((-16) - m71h2) + f26i;
            for (int i7 = 0; i7 < f320aF; i7++) {
                i6 += 16;
                try {
                    curchunkID = (this.f239d[i5 >> 4][i2 >> 4] << 9) + (((i2 & 15) + ((i5 & 15) << 4)) << 1) + 1;
                    curtileID = (this.Level_Chunks[curchunkID] & 255) + (this.f191d[curchunkID >> 1] << 8);
                } catch (Exception unused) {
                    curtileID = 0;
                }
                i5++;
                int i8 = 0;
                switch (this.f192e[curchunkID >> 1]) {
                    case 1:
                        i = 4;
                        i8 = i;
                        this.f217b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                            this.f217b[i4][i7][1] = i8;
                            this.f217b[i4][i7][2] = 0;
                            if (this.Level_BlockPriorities[curtileID] != 0) { // Check if current tile we're drawing has high priority
                                this.f217b[i4][i7][2] = 1;
                            } else if (!dontdrawtiles) {
                                if (this.Game_ZoneID == 2) { // Check if the level is Marble Zone
                                    if (curtileID >= 362 && curtileID <= 365) { // Check if the tile we're drawing is a lava tiles
                                        curtileID = (((curtileID - 362) + (this.f35j >> 3)) % 4) + 362; // Change the tile every 4 frames for animated purposes.
                                    } else if (curtileID >= 366) {
                                        curtileID = (((curtileID - 366) + (this.f35j >> 3)) % 2) + 366; // And revert our changes afterwards.
                                    }
                                }
                                try {
                                    tiledrawer.drawRegion(GFX_ZoneTiles, (curtileID & 15) << 4, (curtileID >> 4) << 4, 16, 16, f38a[i8], i3, i6, 20);
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        break;
                    case 2:
                        i = 6;
                        i8 = i;
                        this.f217b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                        }
                        break;
                    case 3:
                        i = 2;
                        i8 = i;
                        this.f217b[i4][i7][0] = curtileID;
                        if (curtileID == 0) {
                        }
                        break;
                    default:
                        this.f217b[i4][i7][0] = curtileID;
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
        m137b((i3 & 1) == 1 ? i - (stringWidth / 2) : i, i2, stringWidth, height);
        if (z) {
            m199a(str, i + 1, i2, 16777215, 255, i3);
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
            f258z = true;
            f260B = true;
            f259A = true;
        } else {
            if (this.f261by == this.Player_Rings && this.f262bz == this.Player_Score) {
                z2 = (this.Player_Rings == 0 && (this.f35j & 1) == 0) ? true : true;
                if (this.f111x != 0 || this.f263bA != (this.f112y * 100) + this.f111x) {
                    f259A = true;
                }
                if (this.f264bB != this.Player_Lives) {
                    f260B = true;
                }
            }
            f258z = z2;
            if (this.f111x != 0) {
            }
            f259A = true;
            if (this.f264bB != this.Player_Lives) {
            }
        }
        if (this.Player_Lives > 99) {
            this.Player_Lives = 99; // Cap player lives.
        }
        this.f264bB = this.Player_Lives;
        this.f261by = this.Player_Rings;
        this.f262bz = this.Player_Score;
        if (f258z) {
            m137b(0, 0, 100, f26i);
            m195a(GFX_Painter, GFX_HUDArray[1], 0, 0, GFX_HUDArray[1].getWidth(), GFX_HUDArray[1].getHeight(), f38a[0], 4, -10, 36, true);
            if (this.Player_Rings != 0 || ((this.f35j >> 1) & 1) == 0) {
                m102d(31, -35, this.Player_Rings, 3);
            }
            m102d(31, -18, this.Player_Score, 8);
            f258z = false;
        }
        this.f263bA = (this.f112y * 100) + this.f111x;
        if (f259A) {
            m137b(GFX_MenuWidth - 48, 0, 48, f26i);
            m195a(GFX_Painter, GFX_HUDArray[11], 0, 0, GFX_HUDArray[11].getWidth(), GFX_HUDArray[11].getHeight(), f38a[0], GFX_MenuWidth - 4, -8, 40, true);
            m102d(GFX_MenuWidth - 40, -22, this.f112y, 1);
            m102d(GFX_MenuWidth - 24, -22, this.f111x, 2);
            f259A = false;
        }
        if (f260B) {
            m137b(0, f26i + f25h, 50, f26i);
            m195a(GFX_Painter, GFX_HUDArray[2], 0, 0, 22, 20, f38a[0], 5, 7 + f25h, 20, true);
            if (this.Player_Lives > 9) {
                i = 31;
                i2 = f25h + 14;
                lifecount = this.Player_Lives;
                i3 = 2;
            } else {
                i = 31;
                i2 = f25h + 14;
                lifecount = this.Player_Lives;
                i3 = 1;
            }
            m102d(i, i2, lifecount, i3);
            f260B = false;
        }
    }

    /* renamed from: d */
    private static void m102d(int i, int i2, int i3, int i4) {
        int i5 = (i + (i4 * 8)) - 7;
        m195a(GFX_Painter, GFX_HUDArray[12], 7 * (i3 % 10), 0, 7, 13, f38a[0], i5, i2, 20, true);
        for (int i6 = 1; i6 < i4; i6++) {
            int i7 = 1;
            for (int i8 = 0; i8 < i6; i8++) {
                i7 *= 10;
            }
            m195a(GFX_Painter, GFX_HUDArray[12], 7 * ((i3 / i7) % 10), 0, 7, 13, f38a[0], i5 - (i6 * 8), i2, 20, true);
        }
    }

    /* renamed from: e */
    private static boolean m96e() {
        return false;
    }

    /* renamed from: o */
    public final void m39o() {
        this.f81h = new int[this.f80bc][15];
        this.Music_MainPlayer.Music_Play(13, 1, false);
        this.f34a[0] = "";
        this.f34a[1] = "";
        this.f83bd = 0;
        this.f266bC = 30;
        this.f265T = true;
        this.f81h[0][0] = 1;
        this.f81h[0][1] = 10;
        this.f81h[0][2] = 240;
        this.f81h[0][3] = 28;
        this.f81h[0][8] = 1 - f84a[this.f81h[0][1]][2];
        this.f81h[0][9] = 0;
        this.f81h[1][0] = 1;
        this.f81h[1][1] = 4 + this.f227am;
        this.f81h[1][2] = 240;
        this.f81h[1][3] = 60;
        this.f81h[1][8] = 25 - f84a[this.f81h[0][1]][2];
        this.f81h[1][9] = 3;
        this.f81h[2][0] = 1;
        this.f81h[2][1] = 8;
        this.f81h[2][2] = 240;
        this.f81h[2][3] = 70;
        this.f81h[2][8] = (-1) - f84a[this.f81h[0][1]][2];
        this.f81h[2][9] = 2;
        this.f81h[3][0] = 1;
        this.f81h[3][1] = 14;
        this.f81h[3][2] = 0 - f84a[this.f81h[3][1]][2];
        this.f81h[3][3] = 30;
        this.f81h[3][8] = -f84a[this.f81h[3][1]][2];
        this.f81h[3][9] = 0;
        this.f82m = (GFX_MenuWidth + f84a[this.f81h[3][1]][2]) >> 1;
        this.f81h[4][0] = 1;
        this.f81h[4][1] = 15;
        this.f81h[4][2] = 0 - f84a[this.f81h[4][1]][2];
        this.f81h[4][3] = 50;
        this.f81h[4][8] = ((-f84a[this.f81h[3][1]][2]) / 2) - (f84a[this.f81h[4][1]][2] / 2);
        this.f81h[4][9] = 1;
        for (int i = 0; i < this.f81h.length; i++) {
            if (this.f81h[i][0] == 1) {
                this.f81h[i][4] = f84a[this.f81h[i][1]][0];
                this.f81h[i][5] = f84a[this.f81h[i][1]][1];
                this.f81h[i][6] = f84a[this.f81h[i][1]][2];
                this.f81h[i][7] = f84a[this.f81h[i][1]][3];
            }
        }
    }

    /* renamed from: p */
    public final void m35p() {
        int[] iArr;
        char c;
        int i;
        try {
            this.f223ai = 4;
            this.f243t = false;
            this.f244u = false;
            this.f158p = false;
            this.f292Z = true;
            this.f293aa = true;
            this.f242bw = 0;
            this.f86bf = 2100;
            this.f334K = false;
            this.f81h = new int[this.f80bc][15];
            this.f36k = 0;
            this.f35j = 0;
            this.Player_InvincTime = 0;
            this.Player_InvulnTime = 0;
            this.f291bL = 0;
            this.f290bK = 0;
            this.f252v = true;
            this.f253ao = 10;
            this.f277c = (byte) 0;
            this.f270C = false;
            if (this.f325J) {
                GFX_LoadGame();
            }
            this.f83bd = 0;
            this.f81h[0][0] = 1;
            this.f81h[0][1] = 10;
            this.f81h[0][2] = 240;
            this.f81h[0][3] = 42;
            this.f81h[0][8] = 1 - f84a[this.f81h[0][1]][2];
            this.f81h[0][9] = 0;
            this.f81h[1][0] = 1;
            this.f81h[1][1] = 4 + this.f227am;
            this.f81h[1][2] = 240;
            this.f81h[1][3] = 68;
            this.f81h[1][8] = 25 - f84a[this.f81h[0][1]][2];
            this.f81h[1][9] = 3;
            this.f81h[2][0] = 1;
            this.f81h[2][1] = 8;
            this.f81h[2][2] = 240;
            this.f81h[2][3] = 76;
            this.f81h[2][8] = (-1) - f84a[this.f81h[0][1]][2];
            this.f81h[2][9] = 2;
            this.f81h[3][0] = 1;
            this.f81h[3][1] = f218x[this.f226al];
            this.f81h[3][2] = 0 - f84a[this.f81h[3][1]][2];
            this.f81h[3][3] = 44;
            this.f81h[3][8] = -f84a[this.f81h[3][1]][2];
            this.f81h[3][9] = 0;
            this.f82m = (GFX_MenuWidth >> 1) + (f84a[this.f81h[3][1]][2] / 2);
            if (this.f226al == 6) {
                this.f81h[4][0] = 1;
                this.f81h[4][1] = 3;
                this.f81h[4][2] = 0 - f84a[this.f81h[4][1]][2];
                this.f81h[4][3] = 60;
                iArr = this.f81h[4];
                c = '\b';
                i = -48;
            } else {
                this.f81h[4][0] = 1;
                this.f81h[4][1] = 3;
                this.f81h[4][2] = 0 - f84a[this.f81h[4][1]][2];
                this.f81h[4][3] = 60;
                iArr = this.f81h[4];
                c = '\b';
                i = -65;
            }
            iArr[c] = i;
            this.f81h[4][9] = 1;
            for (int i2 = 0; i2 < this.f81h.length; i2++) {
                if (this.f81h[i2][0] == 1) {
                    this.f81h[i2][4] = f84a[this.f81h[i2][1]][0];
                    this.f81h[i2][5] = f84a[this.f81h[i2][1]][1];
                    this.f81h[i2][6] = f84a[this.f81h[i2][1]][2];
                    this.f81h[i2][7] = f84a[this.f81h[i2][1]][3];
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
        m195a(GFX_Painter, GFX_HUDArray[13], 8 * i4, 48, 8, 16, f38a[0], i - 8, i2, 20, true);
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = 1;
            for (int i11 = 0; i11 < i9; i11++) {
                i10 *= 10;
            }
            m195a(GFX_Painter, GFX_HUDArray[13], 8 * ((i3 / i10) % 10), 48, 8, 16, f38a[0], i - ((i9 + 1) * 8), i2, 20, true);
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
        this.f111x = 0;
        this.f112y = 0;
        this.f113z = 0;
        this.Player_ShieldFlag = 0;
        this.Player_SpeedShoeTime = 0;
        this.Player_InvincTime = 0;
        this.Player_InvulnTime = 0;
        this.f88bh = 0;
        this.f87bg = 0;
        for (int i = 0; i < this.f203k.length; i++) {
            this.f203k[i][0] = 0;
        }
        f120c = false;
        f121d = false;
        f135S = false;
        f122Q = false;
        f123e = false;
        f124f = false;
        f125g = false;
        f127i = false;
        f128j = false;
        f282W = false;
        f283X = false;
        f129k = false;
        f130R = false;
        f131l = false;
        f132m = false;
        f134o = false;
        f133n = false;
        this.f300aw = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f207e[i2] = false;
            this.f155b[i2] = false;
        }
        this.f199af = 0;
        this.f138F = 0;
        for (int i3 = 0; i3 < this.f198e.length; i3++) {
            this.f198e[i3][24] = 0;
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
        f103p = 0;
        this.f97F[0] = 0;
        this.f97F[1] = 0;
        f228y[0] = 0;
        f228y[1] = 0;
        if (this.Game_ZoneID != 5 || this.Game_ActID != 3) {
            Player_Info[0] = f137b[this.Game_ZoneID][(this.Game_ActID * 2) + 0] << 8;
            Player_Info[1] = (f137b[this.Game_ZoneID][(this.Game_ActID * 2) + 1] << 8) + 5120;
        }
        if (this.f115B != 0 || this.f116C != 0) {
            Player_Info[0] = this.f115B << 8;
            Player_Info[1] = this.f116C << 8;
            this.f111x = this.f117D;
            this.f112y = this.f118E;
        }
        m23t();
        m259G();
        Player_Info[8] = -1;
        this.f223ai = 2;
        this.f204q = true;
        m9z();
        this.f252v = true;
        this.f253ao = 10;
    }

    /* renamed from: al */
    private void m161al() {
        GFX_ZoneTiles = null;
        Background_Renderer.BG_Clear();
        GFX_UnloadArray(GFX_GameArray);
        this.f243t = false;
        this.f292Z = true;
        this.f293aa = true;
        if (this.Game_ZoneID != 1) {
            this.f211ah = 16777215;
        }
        f228y[0] = 0;
        f228y[1] = 0;
        Level_LoadData();
        m165ah();
        m251K();
        Background_Renderer.BG_Initialize(this.Game_ZoneID, this.Game_ActID);
        GFX_LoadGame();
        m79g();
    }

    /* renamed from: a */
    public static DataInputStream Level_DataReader(String str) {
        return new DataInputStream(m206a(str));
    }

    /* renamed from: a */
    public static InputStream m206a(String str) {
        if (f322a != null) {
            try {
                f322a.close();
            } catch (Exception unused) {
            }
            f322a = null;
        }
        InputStream resourceAsStream = new Object().getClass().getResourceAsStream(str);
        f322a = resourceAsStream;
        return resourceAsStream;
    }

    /* renamed from: a */
    public static byte[] m202a(String str) {
        try {
            byte[] bArr = new byte[512];
            InputStream m206a = m206a(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = m206a.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.close();
                    m206a.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m32q() {
        try {
            f322a.close();
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
            this.f240k = null;
            this.f190c = null;
            this.f236j = null;
            System.gc();
            int[][][] iArr = null;
            switch (this.Game_ZoneID) {
                case 0:
                    str = "/mc_gh_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    m32q();
                    this.f221bu = iArr[this.Game_ActID][0].length;
                    this.f222bv = iArr[this.Game_ActID].length;
                    this.f239d = new byte[this.f222bv][this.f221bu];
                    for (i = 0; i < this.f222bv; i++) {
                        for (int i2 = 0; i2 < this.f221bu; i2++) {
                            this.f239d[i][i2] = (byte) iArr[this.Game_ActID][i][i2];
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
                    m32q();
                    if (this.f197j == null) {
                        this.f197j = m209a(Level_DataReader("/mc_obj_size_table.bin"));
                        m32q();
                    }
                    if (f210a == null) {
                        f210a = m208a(Level_DataReader("/framedata.bin"));
                        m32q();
                    }
                    this.f240k = new byte[512];
                    m206a("/scddirtbl.blt").read(this.f240k);
                    m32q();
                    this.f190c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f190c);
                    m32q();
                    this.f236j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f236j);
                    m32q();
                    System.gc();
                    return;
                case 1:
                case 3:
                default:
                    m32q();
                    this.f221bu = iArr[this.Game_ActID][0].length;
                    this.f222bv = iArr[this.Game_ActID].length;
                    this.f239d = new byte[this.f222bv][this.f221bu];
                    while (i < this.f222bv) {
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
                    m32q();
                    if (this.f197j == null) {
                    }
                    if (f210a == null) {
                    }
                    this.f240k = new byte[512];
                    m206a("/scddirtbl.blt").read(this.f240k);
                    m32q();
                    this.f190c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f190c);
                    m32q();
                    this.f236j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f236j);
                    m32q();
                    System.gc();
                    return;
                case 2:
                    str = "/mc_ma_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    m32q();
                    this.f221bu = iArr[this.Game_ActID][0].length;
                    this.f222bv = iArr[this.Game_ActID].length;
                    this.f239d = new byte[this.f222bv][this.f221bu];
                    while (i < this.f222bv) {
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
                    m32q();
                    if (this.f197j == null) {
                    }
                    if (f210a == null) {
                    }
                    this.f240k = new byte[512];
                    m206a("/scddirtbl.blt").read(this.f240k);
                    m32q();
                    this.f190c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f190c);
                    m32q();
                    this.f236j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f236j);
                    m32q();
                    System.gc();
                    return;
                case 4:
                    str = "/mc_sy_map_data.bin";
                    iArr = m208a(Level_DataReader(str));
                    m32q();
                    this.f221bu = iArr[this.Game_ActID][0].length;
                    this.f222bv = iArr[this.Game_ActID].length;
                    this.f239d = new byte[this.f222bv][this.f221bu];
                    while (i < this.f222bv) {
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
                    m32q();
                    if (this.f197j == null) {
                    }
                    if (f210a == null) {
                    }
                    this.f240k = new byte[512];
                    m206a("/scddirtbl.blt").read(this.f240k);
                    m32q();
                    this.f190c = new byte[8192];
                    Level_DataReader("/scdtblwk.scd").read(this.f190c);
                    m32q();
                    this.f236j = new byte[8192];
                    Level_DataReader("/blkcol.bct").read(this.f236j);
                    m32q();
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
        if (this.f223ai != 2 || this.f265T || this.f83bd >= 30) {
            if (this.f302G && this.Cheats_Active[4] && this.f305H) {
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
            } else if (f131l || f132m) {
                int[] iArr5 = Player_Info;
                iArr5[11] = iArr5[11] + this.Player_TopSpeed;
            } else if (f128j) {
                int[] iArr6 = Player_Info;
                iArr6[1] = iArr6[1] + Player_Info[5];
                int[] iArr7 = Player_Info;
                iArr7[5] = iArr7[5] + this.f94bj;
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
        return Math.abs(f37a.nextInt()) % i;
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
            this.f273bH++;
            int i3 = (this.f239d[((i2 >> 4) >> 4) % this.f222bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f193f[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f192e[i3 >> 1] == 1) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 2) {
                if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 3) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            Player_Info[8] = (this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8);
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
            int i3 = (this.f239d[((i2 >> 4) >> 4) % this.f222bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f194g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f192e[i3 >> 1] == 1) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 2) {
                if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 3) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            Player_Info[8] = (this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8);
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
        return this.f193f[(((this.f239d[((i2 >> 4) >> 4) % this.f222bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1)) + 1) >> 1] != 1;
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
            int i3 = (this.f239d[((i2 >> 4) >> 4) % this.f222bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f193f[i3 >> 1] == 1 && this.f194g[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (this.Level_Collisions[(this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8)] & 255) << 5;
            if (this.f192e[i3 >> 1] == 1) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 2) {
                if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f192e[i3 >> 1] == 3) {
                if (0 == ((this.f236j[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((this.f236j[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            this.f274aq = (this.Level_Chunks[i3] & 255) + (this.f191d[i3 >> 1] << 8);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    private int m84f(int i) {
        return this.f240k[this.Level_Collisions[i] & 255] & 255;
    }

    /* renamed from: f */
    private boolean m85f() {
        if (m226a(m235a() + 12, m146b() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] - 256;
                if (!m226a(m235a() + 12, m146b() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m78g() {
        if (m226a(m235a() - 12, m146b() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] + 256;
                if (!m226a(m235a() - 12, m146b() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m72h() {
        if (m226a(m235a() + 12, m146b() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] - 256;
                if (!m226a(m235a() + 12, m146b() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m66i() {
        if (m226a(m235a() - 12, m146b() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[0] = iArr[0] + 256;
                if (!m226a(m235a() - 12, m146b() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m60j() {
        int m235a;
        int m146b;
        if (f103p <= 22 || f103p >= 338) {
            m235a = m235a() + 12;
            m146b = m146b() - 12;
        } else if (this.Game_ZoneID != 1 || f103p != 316) {
            return false;
        } else {
            m235a = m235a() + 12;
            m146b = m146b() - 36;
        }
        if (((this.Game_ZoneID == 4 || this.Game_ZoneID == 3) && f103p != 0) || !m226a(m235a, m146b)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = Player_Info;
            iArr[0] = iArr[0] - 256;
            m235a--;
            if (!m104d(m235a, m146b)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m55k() {
        if (f103p <= 22 || f103p >= 338) {
            if ((this.Game_ZoneID == 4 || this.Game_ZoneID == 3) && f103p != 0) {
                return false;
            }
            if (this.Game_ZoneID == 2 && f103p == 22) {
                return false;
            }
            int m235a = m235a() - 12;
            int m146b = m146b() - 12;
            if (m226a(m235a, m146b)) {
                for (int i = 0; i < 14; i++) {
                    int[] iArr = Player_Info;
                    iArr[0] = iArr[0] + 256;
                    m235a++;
                    if (!m104d(m235a, m146b)) {
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
        if (m226a(m235a(), m146b() - 32)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = Player_Info;
                iArr[1] = iArr[1] + 256;
                if (!m226a(m235a(), m146b() - 32)) {
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - 256;
                    return true;
                }
            }
            return true;
        } else if (m226a(m235a(), m146b() - 16)) {
            for (int i2 = 0; i2 < 14; i2++) {
                int[] iArr3 = Player_Info;
                iArr3[1] = iArr3[1] + 256;
                if (!m226a(m235a(), m146b() - 16)) {
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
        if (m104d(m235a(), m146b())) {
            int i2 = f103p;
            if (i == -1) {
                return false;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            for (int i3 = 0; i3 < 16; i3++) {
                if (!f125g) {
                    int[] iArr = Player_Info;
                    iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                }
                int[] iArr2 = Player_Info;
                iArr2[1] = iArr2[1] - ((m143b(i2 + 180) * 256) / 100);
                if (!m104d(m235a(), m146b())) {
                    if (!f125g) {
                        int[] iArr3 = Player_Info;
                        iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr4 = Player_Info;
                    iArr4[1] = iArr4[1] + ((m143b(i2 + 180) << 8) / 100);
                    f103p = m228a(m235a(), m146b());
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m26s() {
        if (!f125g && f127i) {
            f127i = false;
        }
        this.f85be = 2;
    }

    /* renamed from: an */
    private void m159an() {
        if (this.Game_ZoneID != 1 || this.f211ah >= m146b() - 12) {
            this.f86bf = 2100;
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
            if (f125g) {
                return true;
            }
            if (this.f270C) {
                return false;
            }
            if (this.Game_ZoneID == 0 && (this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8] == 31 || this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8] == 32)) {
                this.Input_Array[2] = false;
                return false;
            } else if (this.Input_Array[2]) {
                if (this.Game_ZoneID == 5 && this.Game_ActID != 2 && m46m()) {
                    return false;
                }
                if (this.f206s) {
                    f125g = true;
                    f121d = false;
                    f126h = false;
                    this.f206s = false;
                    f127i = true;
                    Player_Info[3] = ((Math_CalcSine(0) * this.Player_JumpForce) / 100) + Player_Info[10];
                    Player_Info[5] = (m143b(0) * this.Player_JumpForce) / 100;
                    return true;
                }
                f125g = true;
                f121d = false;
                f126h = false;
                this.f206s = false;
                f127i = true;
                int i2 = f103p;
                int m235a = (this.f239d[((m146b() / 16) / 16) % this.f222bv][(m235a() / 16) / 16] * 512) + ((((m235a() / 16) % 16) + (((m146b() / 16) % 16) * 16)) * 2) + 1;
                int i3 = 0;
                byte abs = (byte) Math.abs(((byte) ((this.Level_Chunks[m235a - 1] & 255) << 6)) >> 6);
                if (abs % 4 != 0) {
                    i3 = 256 * (abs % 4);
                }
                byte m84f = (byte) m84f((this.Level_Chunks[m235a] & 255) + i3);
                if (f103p == 270) {
                    this.f100bn = 5;
                    Player_Info[3] = -this.Player_JumpForce;
                    iArr = Player_Info;
                    c = 5;
                    Math_CalcSine = -Math.abs(this.Player_JumpForce);
                } else if (f103p == 90) {
                    this.f100bn = 5;
                    Player_Info[3] = this.Player_JumpForce;
                    iArr = Player_Info;
                    c = 5;
                    Math_CalcSine = -Math.abs(this.Player_JumpForce);
                } else if (m84f == 0 || f103p > 290 || f103p < 70) {
                    Player_Info[3] = ((Math_CalcSine(i2) * this.Player_JumpForce) / 100) + Player_Info[10];
                    Player_Info[5] = (m143b(i2) * this.Player_JumpForce) / 100;
                    if (Player_Info[5] > 0) {
                        this.f279bJ = 1;
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
                    Math_CalcSine = (m143b(i2) * this.Player_JumpForce) / 100;
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
        if (this.f87bg > -1) {
            this.f87bg--;
        }
        if (this.f88bh > -1) {
            this.f88bh--;
        }
        if (f127i) {
            return true;
        }
        if (f125g || this.f270C) {
            return false;
        }
        if (!this.Input_Array[1]) {
            if (!this.Input_Array[0] || Math.abs(Player_Info[10]) > this.Player_Deceleration || this.Input_Array[3] || this.Input_Array[4]) {
                return false;
            }
            f130R = true;
            this.f88bh += 2;
            if (this.f88bh > 24) {
                this.f88bh = 24;
                return false;
            }
            return false;
        } else if (Math.abs(Player_Info[10]) > this.Player_Deceleration) {
            f127i = true;
            return true;
        } else if (this.Input_Array[3] || this.Input_Array[4]) {
            return false;
        } else {
            f129k = true;
            this.f87bg += 2;
            if (this.f87bg > 32) {
                this.f87bg = 32;
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
        this.f89O = false;
        this.f90P = false;
        int i3 = f103p;
        int i4 = 32;
        int i5 = 256;
        if (f103p != 22 && f103p != 338) {
            i4 = 256;
        }
        if (f103p >= 270 && f103p < 300) {
            i5 = 32;
        }
        if (f103p >= 60 && f103p < 90) {
            i5 = 32;
        }
        byte b = this.f239d[m146b() >> 8][m235a() >> 8];
        if (this.Game_ZoneID == 0 && (b == 31 || b == 32)) {
            i5 = 256;
        }
        int i6 = f103p;
        if (m34p()) {
            this.f206s = false;
            if (this.Game_ZoneID == 4) {
                if ((i6 == 79 && f103p == 90) || (i6 == 281 && f103p == 270)) {
                    if (f103p == 90) {
                        iArr2 = Player_Info;
                        c2 = '\n';
                        i2 = 640;
                    } else {
                        iArr2 = Player_Info;
                        c2 = '\n';
                        i2 = -640;
                    }
                    iArr2[c2] = i2;
                    f103p = i6;
                    this.f297av = 0;
                    this.f279bJ = 3;
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
            iArr4[1] = iArr4[1] + ((m143b(i3 + 180) * i5) / 100);
            if (m34p()) {
                this.f206s = false;
                if (this.Game_ZoneID == 4) {
                    if ((i6 == 79 && f103p == 90) || (i6 == 281 && f103p == 270)) {
                        if (f103p == 90) {
                            iArr = Player_Info;
                            c = '\n';
                            i = 640;
                        } else {
                            iArr = Player_Info;
                            c = '\n';
                            i = -640;
                        }
                        iArr[c] = i;
                        f103p = i6;
                        this.f297av = 0;
                        this.f279bJ = 3;
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
        if (m146b() < 0) {
            return false;
        }
        byte b = this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8];
        if (this.Game_ZoneID != 5 || this.Game_ActID == 2) {
            if (this.Game_ZoneID != 0) {
                if (this.Game_ZoneID == 3) {
                    return false;
                }
                if (this.f97F[0] >= 0) {
                    this.f89O = m31q();
                    if (!this.f89O) {
                        this.f90P = m28r();
                    }
                }
                if (this.f97F[0] < 0) {
                    this.f90P = m28r();
                    if (!this.f90P) {
                        this.f89O = m31q();
                    }
                }
                return this.f89O || this.f90P;
            } else if (b == 31 || b == 32) {
                return m141b(0);
            } else {
                if (this.f97F[0] >= 0) {
                    this.f89O = m31q();
                    if (!this.f89O) {
                        this.f90P = m28r();
                    }
                }
                if (this.f97F[0] < 0) {
                    this.f90P = m28r();
                    if (!this.f90P) {
                        this.f89O = m31q();
                    }
                }
                return this.f89O || this.f90P;
            }
        }
        return false;
    }

    /* renamed from: q */
    private boolean m31q() {
        try {
            int i = f103p;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f275bI;
            int m235a = m235a() + ((Math_CalcSine(i2 + 90) * i3) / 100);
            int m146b = m146b() + ((m143b(i2 + 90) * i3) / 100);
            if (m104d(m235a, m146b)) {
                m228a(m235a, m146b);
                for (int i4 = 0; i4 < 16; i4++) {
                    int m228a = m228a(m235a, m146b);
                    if (!f125g) {
                        int[] iArr = Player_Info;
                        iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - ((m143b(i2 + 180) << 8) / 100);
                    m235a = m235a() + ((Math_CalcSine(i2 + 90) * i3) / 100);
                    m146b = m146b() + ((m143b(i2 + 90) * i3) / 100);
                    if (!m104d(m235a, m146b)) {
                        if (!f125g) {
                            int[] iArr3 = Player_Info;
                            iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = Player_Info;
                        iArr4[1] = iArr4[1] + ((m143b(i2 + 180) << 8) / 100);
                        if (this.Game_ZoneID == 3 && m228a == 350) {
                            m228a = 0;
                        }
                        f103p = m228a;
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
            int i = f103p;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f275bI;
            int m235a = m235a() + ((Math_CalcSine(i2 + 270) * i3) / 100);
            int m146b = m146b() + ((m143b(i2 + 270) * i3) / 100);
            if (m104d(m235a, m146b)) {
                m228a(m235a, m146b);
                for (int i4 = 0; i4 < 16; i4++) {
                    int m228a = m228a(m235a, m146b);
                    if (!f125g) {
                        int[] iArr = Player_Info;
                        iArr[0] = iArr[0] - ((Math_CalcSine(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = Player_Info;
                    iArr2[1] = iArr2[1] - ((m143b(i2 + 180) << 8) / 100);
                    m235a = m235a() + ((Math_CalcSine(i2 + 270) * i3) / 100);
                    m146b = m146b() + ((m143b(i2 + 270) * i3) / 100);
                    if (!m104d(m235a, m146b)) {
                        if (!f125g) {
                            int[] iArr3 = Player_Info;
                            iArr3[0] = iArr3[0] + ((Math_CalcSine(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = Player_Info;
                        iArr4[1] = iArr4[1] + ((m143b(i2 + 180) << 8) / 100);
                        f103p = m228a;
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
        this.f97F[0] = 0;
        this.f97F[1] = 0;
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
        if ((f103p <= 22 || f103p >= 338) && ((abs > this.Player_TopSpeed || (!this.Input_Array[3] && !this.Input_Array[4] && Player_Info[10] != 0)) && Player_Info[10] != 0)) {
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
        if (f131l) {
            return false;
        }
        boolean z = false;
        byte b = 0;
        try {
            b = this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8];
        } catch (Exception unused) {
        }
        if (this.Game_ZoneID == 0 && (b == 31 || b == 32)) {
            z = true;
            f127i = true;
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
            if (!this.f206s) {
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
            } else if (m226a(m235a() - 12, m146b() - 24) && m226a(m235a() + 12, m146b() - 24)) {
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
            this.f136h[0] = true;
            z2 = false;
        }
        if (this.f297av > 0) {
            if (z2) {
                Player_Info[0] = i3;
                Player_Info[1] = i4;
                return false;
            }
            return false;
        } else if (this.f206s || !z2) {
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
            if (f103p != 22 || this.Game_ZoneID != 1 || this.Game_ActID != 1) {
                Player_Info[3] = (Math_CalcSine(f103p + 90) * Player_Info[10]) / 100;
                Player_Info[5] = (m143b(f103p + 90) * Player_Info[10]) / 100;
            }
            if ((f103p - 90) % 180 == 0) {
                if (f103p == 90) {
                    int[] iArr6 = Player_Info;
                    iArr6[0] = iArr6[0] + 256;
                    if (this.Game_ZoneID == 4 && this.Game_ActID != 0) {
                        Player_Info[5] = 0;
                    }
                } else {
                    int[] iArr7 = Player_Info;
                    iArr7[0] = iArr7[0] - 256;
                    if (Player_Info[10] > 2816) {
                        this.f297av = 15;
                    }
                }
            }
            Player_Info[10] = 0;
            Player_Info[13] = 0;
            Player_Info[14] = 0;
            f126h = true;
            f125g = true;
            f121d = false;
            this.f206s = false;
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
        if (this.f297av > 0) {
            this.f297av--;
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
        int[] iArr6 = this.f97F;
        iArr6[0] = iArr6[0] + Player_Info[3];
        int[] iArr7 = this.f97F;
        iArr7[1] = iArr7[1] + Player_Info[5];
        if (Player_Info[5] > 0 && this.f279bJ <= 0) {
            if (f103p == 270) {
                iArr2 = Player_Info;
                c2 = 0;
                i4 = iArr2[0] - 3072;
            } else {
                if (f103p == 90) {
                    iArr2 = Player_Info;
                    c2 = 0;
                    i4 = iArr2[0] + 3072;
                }
                f103p = 0;
            }
            iArr2[c2] = i4;
            f103p = 0;
        }
        m54k(1);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        if (f125g && this.f100bn <= 0) {
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
        this.f97F[0] = 0;
        this.f97F[1] = 0;
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
        if (f131l) {
            return false;
        }
        boolean z2 = false;
        byte b = this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8];
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
            if (!this.f206s) {
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
            } else if (m226a(m235a() - 12, m146b() - 24) && m226a(m235a() + 12, m146b() - 24)) {
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
            this.f136h[0] = true;
            z3 = false;
        }
        if (this.f297av > 0) {
            if (z3) {
                Player_Info[0] = i3;
                Player_Info[1] = i4;
                return false;
            }
            return false;
        } else if (this.f206s || !z3 || z2) {
            boolean z4 = false;
            if (this.Game_ZoneID == 0 && (this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8] == 31 || this.f239d[(m146b() >> 8) % this.f222bv][m235a() >> 8] == 32)) {
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
            Player_Info[3] = (Math_CalcSine(f103p + 90) * Player_Info[10]) / 100;
            Player_Info[5] = (m143b(f103p + 90) * Player_Info[10]) / 100;
            if ((f103p - 90) % 180 == 0) {
                if (f103p == 90) {
                    int[] iArr4 = Player_Info;
                    iArr4[0] = iArr4[0] + 256;
                    if (this.Game_ZoneID == 4 && this.Game_ActID != 0) {
                        Player_Info[5] = 0;
                    }
                } else {
                    int[] iArr5 = Player_Info;
                    iArr5[0] = iArr5[0] - 256;
                    if (Player_Info[10] > 3072 && this.Game_ZoneID == 4) {
                        this.f297av = 15;
                    }
                }
            }
            Player_Info[10] = 0;
            Player_Info[13] = 0;
            Player_Info[14] = 0;
            f126h = true;
            f125g = true;
            f121d = false;
            this.f206s = false;
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
        if (this.f297av > 0) {
            this.f297av--;
        } else if (!this.f270C) {
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
        int[] iArr6 = this.f97F;
        iArr6[0] = iArr6[0] + Player_Info[3];
        int[] iArr7 = this.f97F;
        iArr7[1] = iArr7[1] + Player_Info[5];
        if (Player_Info[5] > 0 && this.f279bJ <= 0) {
            if (f103p == 270) {
                iArr2 = Player_Info;
                c2 = 0;
                i4 = iArr2[0] - 3072;
            } else {
                if (f103p == 90) {
                    iArr2 = Player_Info;
                    c2 = 0;
                    i4 = iArr2[0] + 3072;
                }
                f103p = 0;
            }
            iArr2[c2] = i4;
            f103p = 0;
        }
        m54k(1);
        if (this.Game_ZoneID == 0 || this.Game_ZoneID == 3) {
            m150aw();
        }
        this.f100bn--;
        if (f125g && this.f100bn <= 0) {
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
        int m143b;
        if (i == 0) {
            f127i = false;
            this.f300aw = 0;
            f125g = false;
            f120c = false;
            f121d = false;
        }
        if (i == 0) {
            Player_Info[10] = Player_Info[3];
            int m228a = m228a(m235a(), m146b());
            int i3 = m228a;
            if (m228a < 0) {
                for (int i4 = 1; i4 < this.f275bI + 1; i4++) {
                    int m228a2 = m228a(m235a() - i4, m146b());
                    i3 = m228a2;
                    if (m228a2 >= 0) {
                        break;
                    }
                    int m228a3 = m228a(m235a() + i4, m146b());
                    i3 = m228a3;
                    if (m228a3 >= 0) {
                        break;
                    }
                }
            }
            f103p = i3;
            if ((i3 > 67 || i3 < 44) && (i3 < 293 || i3 > 316)) {
                if (i3 < 338 && i3 > 22) {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    m143b = iArr2[10] + ((m143b(i3 + 90) * Player_Info[5]) / 100);
                }
                Player_Info[5] = 0;
                Player_Info[3] = 0;
                if (this.Game_ZoneID == 2 && (Player_Info[8] == 365 || Player_Info[8] == 364 || Player_Info[8] == 363 || Player_Info[8] == 362)) {
                    this.f276D = true;
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
                if (m143b(i3 + 90) > 0) {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    m143b = Player_Info[5];
                } else {
                    iArr2 = Player_Info;
                    c2 = '\n';
                    m143b = -Player_Info[5];
                }
            }
            iArr2[c2] = m143b;
            Player_Info[5] = 0;
            Player_Info[3] = 0;
            if (this.Game_ZoneID == 2) {
                this.f276D = true;
            }
            if (Player_Info[10] < 0) {
            }
            if (Player_Info[10] > 0) {
            }
            iArr = Player_Info;
            c = 14;
        } else {
            if (f120c) {
                int m228a4 = m228a(m235a(), m146b() - 32);
                int i5 = m228a4;
                if (m228a4 < 0) {
                    i5 = f103p;
                }
                if (i5 % 90 != 0) {
                    iArr = Player_Info;
                    c = 3;
                    i2 = iArr[3] + ((-(m143b(i5 + 90) * Player_Info[5])) / 100);
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
        if (this.f279bJ > 0) {
            this.f279bJ--;
            return;
        }
        if ((-this.Player_WaterJumpForce) <= Player_Info[5]) {
            this.Input_Array[2] = false;
        } else if (!this.Input_Array[2] && !f120c && !f126h) {
            Player_Info[5] = -this.Player_WaterJumpForce;
        }
        if (Player_Info[5] > 0) {
            f120c = false;
            if (!m34p()) {
                return;
            }
            if (f103p < 270 && f103p > 90) {
                f103p = 0;
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
        if (!this.f270C) {
            if (!f122Q) {
                if (this.Game_ZoneID == 5 && this.Game_ActID != 2 && (37 == Player_Info[8] || 38 == Player_Info[8] || 39 == Player_Info[8] || 41 == Player_Info[8] || 42 == Player_Info[8] || 47 == Player_Info[8] || 48 == Player_Info[8] || 49 == Player_Info[8] || 52 == Player_Info[8] || 59 == Player_Info[8] || 62 == Player_Info[8] || 69 == Player_Info[8] || 71 == Player_Info[8] || 72 == Player_Info[8] || 78 == Player_Info[8] || 79 == Player_Info[8] || 87 == Player_Info[8] || 88 == Player_Info[8] || 89 == Player_Info[8])) {
                    int[] iArr = Player_Info;
                    iArr[10] = iArr[10] + 256;
                    if (1024 < Player_Info[10]) {
                        Player_Info[10] = 1024;
                    }
                    Player_Info[12] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                } else if (this.f297av > 0) {
                    this.f297av--;
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
            int[] iArr2 = this.f97F;
            iArr2[0] = iArr2[0] + ((Math_CalcSine(f103p + 90) * Player_Info[10]) / 100);
            int[] iArr3 = this.f97F;
            iArr3[1] = iArr3[1] + ((m143b(f103p + 90) * Player_Info[10]) / 100);
        }
        Player_Info[12] = 0;
        if (Player_Info[13] == 0) {
            Player_Info[13] = 2;
            Player_Info[14] = 2;
        }
        game = this;
        i = 1;
        game.m83f(i);
        int[] iArr22 = this.f97F;
        iArr22[0] = iArr22[0] + ((Math_CalcSine(f103p + 90) * Player_Info[10]) / 100);
        int[] iArr32 = this.f97F;
        iArr32[1] = iArr32[1] + ((m143b(f103p + 90) * Player_Info[10]) / 100);
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
        p000.Game.f127i = false;
     */
    /* renamed from: as */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m154as() {
        Game game;
        int i;
        if (this.f270C) {
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
        } else if (this.f297av > 0) {
            this.f297av--;
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
        int[] iArr2 = this.f97F;
        iArr2[0] = iArr2[0] + ((Math_CalcSine(f103p + 90) * Player_Info[10]) / 100);
        int[] iArr3 = this.f97F;
        iArr3[1] = iArr3[1] + ((m143b(f103p + 90) * Player_Info[10]) / 100);
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
            f127i = false;
            this.f300aw = 0;
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
        if (this.f206s) {
            return;
        }
        if (0 == i) {
            int i2 = f103p;
            int i3 = i2;
            if (i2 < 0) {
                i3 = 0;
                if (f103p != 0 && !this.f206s && (f103p <= 22 || f103p >= 338)) {
                    i3 = Player_Info[10] > 0 ? 90 : Player_Info[10] < 0 ? 270 : f103p;
                }
            }
            if (f103p <= 22 || f103p >= 338) {
                return;
            }
            int[] iArr = Player_Info;
            iArr[10] = iArr[10] + ((m143b(i3 + 90) * 32) / 100);
            return;
        }
        int i4 = Player_Info[10];
        int i5 = f103p;
        int i6 = i5;
        if (i5 < 0) {
            i6 = 0;
            if (f103p != 0 && !this.f206s && (f103p <= 22 || f103p >= 338)) {
                i6 = Player_Info[10] > 0 ? 90 : Player_Info[10] < 0 ? 270 : f103p;
            }
        }
        if (i6 >= 338 || i6 <= 22) {
            if (f103p == 338 || f103p == 22) {
                if ((m143b(i6 + 90) << 5) / 100 < 0 && Player_Info[10] < 0) {
                    int[] iArr2 = Player_Info;
                    iArr2[10] = iArr2[10] + ((m143b(i6 + 90) * 80) / 100);
                }
                if ((m143b(i6 + 90) << 5) / 100 > 0) {
                }
                if (Player_Info[10] >= 0 && i4 <= 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                    f127i = false;
                }
                if (Player_Info[10] > 0 || i4 < 0) {
                    return;
                }
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                f127i = false;
                return;
            }
            int[] iArr3 = Player_Info;
            iArr3[10] = iArr3[10] + ((m143b(i6 + 90) * 80) / 100);
            if (Player_Info[10] >= 0) {
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                f127i = false;
            }
            if (Player_Info[10] > 0) {
                return;
            }
            return;
        }
        if ((m143b(i6 + 90) * 80) / 100 < 0 && Player_Info[10] < 0) {
            int[] iArr4 = Player_Info;
            iArr4[10] = iArr4[10] + ((m143b(i6 + 90) * 80) / 100);
        }
        if ((m143b(i6 + 90) * 80) / 100 > 0) {
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
        if (this.f88bh > 0) {
            i3 = 112 + (this.f88bh << 1);
        }
        if (this.f87bg > 0) {
            i3 -= this.f87bg << 1;
        }
        if (this.Game_ZoneID == 0 && this.Game_ActID == 3) {
            this.f278K[0] = 0;
            this.f278K[2] = 0;
            this.f278K[1] = 3840;
            this.f278K[3] = 128;
            if (this.f244u) {
                iArr = this.f278K;
                c = 1;
                i = iArr[1] + 768;
                iArr[c] = i;
            }
        } else if (this.Game_ZoneID != 5 || this.Game_ActID != 3) {
            this.f278K[0] = 0;
            this.f278K[2] = 0;
            this.f278K[1] = f241c[this.Game_ZoneID][this.Game_ActID][2] + 320;
            this.f278K[3] = m126c() + (240 - (184 - i3));
            if (this.f277c == 2) {
                this.f270C = true;
            }
            if (this.Game_ActID != 2 || this.Game_ZoneID != 1) {
                if (this.Game_ActID < 2) {
                    if (m235a() >= f216f[this.Game_ZoneID][this.Game_ActID] || this.f277c == 1) {
                        this.f278K[0] = f216f[this.Game_ZoneID][this.Game_ActID] - 144;
                        this.f277c = (byte) 1;
                    }
                } else if (this.f277c == 2 && this.Game_ZoneID != 1) {
                    this.f278K[0] = (short) (f241c[this.Game_ZoneID][this.Game_ActID][2] + 320);
                }
            }
            if (this.Game_ActID == 2 && this.Game_ZoneID != 1 && this.f244u) {
                int[] iArr3 = this.f278K;
                iArr3[1] = iArr3[1] + 256;
            }
            if (this.f243t) {
                if (this.Game_ZoneID == 0) {
                    this.f278K[0] = (10752 - (f24g >> 1)) - 16;
                    this.f278K[1] = (10752 - (f24g >> 1)) + f24g + 16;
                    this.f278K[2] = 0;
                    iArr2 = this.f278K;
                    c2 = 3;
                    i2 = 800;
                } else if (this.Game_ZoneID == 2) {
                    this.f278K[0] = (6304 - (f24g >> 1)) - 16;
                    this.f278K[1] = (6304 - (f24g >> 1)) + f24g + 16;
                    this.f278K[2] = 560;
                    iArr2 = this.f278K;
                    c2 = 3;
                    i2 = 568;
                } else if (this.Game_ZoneID == 4) {
                    this.f278K[0] = (11424 - (f24g >> 1)) - 40;
                    this.f278K[1] = (11424 - (f24g >> 1)) + f24g + 40;
                    this.f278K[2] = 1232;
                    iArr2 = this.f278K;
                    c2 = 3;
                    i2 = 1248;
                } else if (this.Game_ZoneID == 3) {
                    this.f278K[0] = 8400 - (f24g >> 1);
                    this.f278K[1] = (8400 - (f24g >> 1)) + f24g;
                    this.f278K[2] = 528;
                    iArr2 = this.f278K;
                    c2 = 3;
                    i2 = 576;
                }
                iArr2[c2] = i2 + i3;
            }
            if (this.f244u) {
                if (this.Game_ZoneID == 0) {
                    this.f278K[0] = 10752 - (f24g >> 1);
                    iArr = this.f278K;
                    c = 1;
                    i = iArr[1] + 16;
                } else if (this.Game_ZoneID == 2) {
                    this.f278K[0] = 6304 - (f24g >> 1);
                    iArr = this.f278K;
                    c = 1;
                    i = iArr[1] + 16;
                } else if (this.Game_ZoneID == 4) {
                    this.f278K[0] = 11424 - (f24g >> 1);
                    iArr = this.f278K;
                    c = 1;
                    i = iArr[1] - 16;
                } else if (this.Game_ZoneID == 3) {
                    iArr = this.f278K;
                    c = 0;
                    i = 8400 - (f24g >> 1);
                }
                iArr[c] = i;
            }
        }
        if (f128j) {
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
            if (f228y[i2] < 0) {
                f228y[i2] = 0;
            }
        }
    }

    /* renamed from: at */
    private void m153at() {
        int i = f24g >> 1;
        int m235a = m235a();
        if (f228y[0] >= this.f278K[1] - f24g && !this.f243t && this.f242bw == 0 && this.Game_ActID == 2) {
            m176aH();
        }
        if (m235a - f228y[0] < i) {
            if (!this.f158p) {
                this.f293aa = true;
                int[] iArr = f228y;
                iArr[0] = iArr[0] - (i - (m235a - f228y[0]));
                if (f228y[0] < this.f278K[0]) {
                    f228y[0] = this.f278K[0];
                }
                if (((f228y[0] + 16) << 8) > Player_Info[0]) {
                    Player_Info[0] = (f228y[0] + 16) << 8;
                    if (Player_Info[10] < 0) {
                        Player_Info[10] = 0;
                        Player_Info[13] = 0;
                        Player_Info[14] = 0;
                    }
                    if (!f125g && f127i) {
                        f127i = false;
                    }
                    if (!f125g || Player_Info[3] >= 0) {
                        return;
                    }
                    Player_Info[3] = 0;
                    return;
                }
                return;
            } else if (((f228y[0] + 16) << 8) <= Player_Info[0]) {
                return;
            } else {
                Player_Info[0] = (f228y[0] + 16) << 8;
                if (Player_Info[10] < 0) {
                    Player_Info[10] = 0;
                    Player_Info[13] = 0;
                    Player_Info[14] = 0;
                }
                if (f125g || !f127i) {
                    return;
                }
            }
        } else if (m235a - f228y[0] <= i) {
            return;
        } else {
            this.f292Z = true;
            int[] iArr2 = f228y;
            iArr2[0] = iArr2[0] - (i - (m235a - f228y[0]));
            if (f228y[0] + (i << 1) > this.f278K[1]) {
                f228y[0] = this.f278K[1] - (i << 1);
            }
            if (this.f270C) {
                if ((((f228y[0] + 96) + 240) << 8) >= Player_Info[0]) {
                    return;
                }
                Player_Info[0] = ((f228y[0] + 96) + 240) << 8;
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                if (f125g || !f127i) {
                    return;
                }
            } else if ((((f228y[0] - 16) + 240) << 8) >= Player_Info[0]) {
                return;
            } else {
                Player_Info[0] = ((f228y[0] - 16) + 240) << 8;
                Player_Info[10] = 0;
                Player_Info[13] = 0;
                Player_Info[14] = 0;
                if (f125g || !f127i) {
                    return;
                }
            }
        }
        f127i = false;
    }

    /* renamed from: j */
    private void m59j(int i) {
        int m146b = m146b();
        if (this.f243t && ((this.Game_ZoneID != 1 || this.Game_ActID != 2) && f228y[1] + i > this.f278K[3])) {
            f228y[1] = this.f278K[3] - i;
        }
        if (m146b - f228y[1] < i) {
            this.f292Z = true;
            int[] iArr = f228y;
            iArr[1] = iArr[1] - (i - (m146b - f228y[1]));
            if ((!((this.Game_ZoneID == 1 && this.Game_ActID == 2 && f228y[0] < 7936) || (this.Game_ZoneID == 5 && this.Game_ActID == 1)) || this.f88bh > 0 || this.f87bg > 0) && f228y[1] < this.f278K[2]) {
                f228y[1] = this.f278K[2];
            }
        } else if (m146b - f228y[1] > i) {
            this.f292Z = true;
            int[] iArr2 = f228y;
            iArr2[1] = iArr2[1] - (i - (m146b - f228y[1]));
            if (f228y[1] + i > this.f278K[3]) {
                f228y[1] = this.f278K[3] - i;
            }
            if (this.Game_ZoneID == 1 && this.Game_ActID == 2) {
                return;
            }
            if (this.Game_ZoneID == 5 && this.Game_ActID == 1) {
                return;
            }
            if (((this.Game_ZoneID != 3 || ((f228y[1] + 168) << 8) >= Player_Info[1]) && (((f228y[1] - 16) + 240) << 8) >= Player_Info[1]) || f128j) {
                return;
            }
            Player_Info[1] = ((f228y[1] - 16) + 240) << 8;
            Player_Kill();
        }
    }

    /* renamed from: c */
    private int m126c() {
        int m87f;
        int i = (this.f222bv * 256) - 232;
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
                if (6016 > f228y[0]) {
                    i = 768;
                    i2 = i;
                    break;
                }
                break;
            case 1:
                i = 3792 > f228y[0] ? 768 : 5632 > f228y[0] ? 512 : 7632 > f228y[0] ? 1024 : 768;
                i2 = i;
                break;
            case 2:
                if (896 > f228y[0]) {
                    i = 768;
                } else if (2400 > f228y[0]) {
                    i = 784;
                } else if (640 > f228y[1]) {
                    i = 768;
                } else if (4992 <= f228y[0]) {
                    i2 = 1024;
                    if (5888 <= f228y[0]) {
                        if (f228y[1] <= 880) {
                            i = 768;
                        } else if (6144 <= f228y[0]) {
                            this.f278K[1] = 6144 + f24g;
                            this.f242bw = 1;
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
                if (!(this.f115B == 0 && this.f116C == 0) && f228y[0] == 0 && f228y[1] == 0) {
                    i2 = 1280;
                } else if (m235a() > 3584 && m235a() < 4096 && m146b() > 1024 && m146b() < 1248) {
                    i2 = 1280;
                } else if (3696 <= f228y[0]) {
                    i = 528;
                    if (5168 > f228y[0]) {
                        i2 = 1280;
                    }
                } else if (1792 > f228y[0]) {
                    i2 = 464;
                } else if (2400 > f228y[0] || 2752 <= f228y[0]) {
                    i = 1280;
                    if (728 > f228y[1]) {
                        if (3328 > f228y[0]) {
                            i2 = 544;
                        }
                    } else if (1176 <= f228y[1] || 3792 > f228y[0]) {
                    }
                } else {
                    i = 1280;
                    if (728 > f228y[1]) {
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
                if (5472 < f228y[0] && m146b() < 1280) {
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
                if (9632 <= f228y[0] && 1248 > m146b()) {
                    i2 = 1056;
                    i = i2;
                    break;
                }
                break;
            default:
                i = 1228;
                if (11264 > f228y[0]) {
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
        if (this.Game_ZoneID != 1 || this.f211ah >= m146b() - 12) {
            if (this.f97F[0] > 4096) {
                this.f97F[0] = 4096;
            }
            if (this.f97F[0] < -4096) {
                this.f97F[0] = -4096;
            }
            if (this.f97F[1] > 4096) {
                this.f97F[1] = 4096;
            }
            if (this.f97F[1] < -4096) {
                this.f97F[1] = -4096;
            }
            int[] iArr3 = Player_Info;
            iArr3[0] = iArr3[0] + this.f97F[0];
            iArr = Player_Info;
            c = 1;
            i2 = iArr[1];
            i3 = this.f97F[1];
        } else {
            int[] iArr4 = Player_Info;
            iArr4[0] = iArr4[0] + (this.f97F[0] >> 1);
            iArr = Player_Info;
            c = 1;
            i2 = iArr[1];
            i3 = this.f97F[1] >> 1;
        }
        iArr[c] = i2 + i3;
        if (i == 1) {
            if (this.f99bm > 0) {
                this.f99bm--;
            } else if (this.Game_ZoneID != 1 || this.f211ah >= m146b() - 12) {
                int[] iArr5 = Player_Info;
                iArr5[5] = iArr5[5] + this.f94bj;
            } else {
                int[] iArr6 = Player_Info;
                iArr6[5] = iArr6[5] + (this.f94bj / 2);
            }
        }
        if (i == 1 && f127i) {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = this.Player_TopSpeed;
        } else if (Math.abs(this.f97F[0]) + Math.abs(this.f97F[1]) > this.Player_TopSpeed) {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = this.Player_TopSpeed;
        } else {
            iArr2 = Player_Info;
            c2 = 11;
            i4 = iArr2[11];
            abs = Math.abs(this.f97F[0]) + Math.abs(this.f97F[1]);
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
        if (f103p > 290 || f103p < 70) {
            return false;
        }
        if (f103p < 90 || f103p > 270) {
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
                Player_Info[3] = (-(Math_CalcSine(f103p + 90) * abs)) / 100;
                f125g = true;
                f121d = false;
                this.f206s = false;
                this.f297av = 30;
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
            Player_Info[5] = (m143b(f103p + 90) * i3) / 100;
            if (f103p > 90 && f103p < 270) {
                Player_Info[5] = 0;
            }
            Player_Info[3] = (Math_CalcSine(f103p + 90) * i3) / 100;
            f125g = true;
            f121d = false;
            this.f206s = false;
            this.f279bJ = 15;
            if (f103p == 90 || f103p == 270) {
                this.f279bJ = 0;
            }
            m50l();
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static int m235a() {
        return Player_Info[0] >> 8;
    }

    /* renamed from: b */
    public static int m146b() {
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
        if (!this.f280E && this.Player_InvincTime <= 0) {
            if (this.f302G && this.Cheats_Active[0]) {
                return; // Do nothing if you're invincible or have the invincibility cheat.
            }
            if (this.Player_ShieldFlag > 0) { // Does the player have a shield?
                this.Player_ShieldFlag = 0; // Remove the shield
                this.Player_InvulnTime = 60; // Set invulnerability time
                f121d = true;
                f125g = true;
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
                f121d = true;
                f125g = true;
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
                if (!this.f302G || !this.Cheats_Active[0]) {
                    m53k(m235a(), m146b() - 12, this.Player_Rings);
                    this.Player_Rings = 0;
                }
            }
            this.f280E = true;
        }
    }

    /* renamed from: v */
    public final void Player_Kill() {
        if (f128j) {
            this.f252v = true;
            this.f253ao = 10;
            return;
        }
        f134o = true;
        this.f86bf = 2100;
        f125g = true;
        f121d = false;
        f127i = false;
        f128j = true;
        this.f281V = true;
        this.f206s = false;
        Player_Info[10] = 0;
        Player_Info[13] = 0;
        Player_Info[14] = 0;
        this.f99bm = 5;
        Player_Info[3] = 0;
        Player_Info[5] = (m143b(0) * this.Player_JumpForce) / 100;
        this.f113z = 120;
    }

    /* renamed from: au */
    private void m152au() {
        if (f128j) {
            Player_Info[3] = 0;
            this.f113z--;
            if ((((f228y[1] - 16) + 240) << 8) < Player_Info[1] && this.f281V) {
                this.f281V = false;
                if (!this.f302G || !this.Cheats_Active[0]) {
                    this.Player_Lives--;
                }
                if (this.Player_Lives <= 0) {
                    this.Music_MainPlayer.Music_Play(14, 1, false);
                    this.f113z = 240;
                    this.f252v = true;
                    this.f253ao = 10;
                } else if (this.f111x == 59 && this.f112y == 9) {
                    this.f113z = 240;
                    f283X = true;
                    this.f252v = true;
                    this.f253ao = 10;
                    this.f117D = 0;
                    this.f118E = 0;
                    this.f284Y = true;
                }
            }
            if (this.f113z < 0) {
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
                this.f252v = true;
                this.f253ao = 10;
            }
        }
    }

    /* renamed from: a */
    public final void m230a(int i) {
        this.f136h[0] = true;
        if (this.f280E || Player_Info[5] < 0) {
            return;
        }
        if (f125g && f127i && !f126h) {
            f127i = false;
        }
        int i2 = this.f287as - 8;
        if (i2 >= 0 && Math.abs(m235a() - this.f288at) > i2) {
            this.f285F = true;
            this.f286ar = 0;
            if (m235a() - this.f288at > 0) {
                this.f286ar = 1;
            }
        }
        this.f276D = false;
        Player_Info[8] = 0;
        Player_Info[5] = 0;
        if (f125g) {
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
        this.f206s = true;
        this.f208ag = i;
        f103p = 0;
        f125g = false;
        f120c = false;
        f122Q = false;
        this.f300aw = 0;
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
        int i4 = (this.f239d[((i2 >> 4) >> 4) % this.f222bv][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
        if (this.f193f[i4 >> 1] == 1) {
            return -1;
        }
        int m84f = (m84f((this.Level_Chunks[i4] & 255) + (this.f191d[i4 >> 1] << 8)) * 360) / 255;
        if (this.f192e[i4 >> 1] != 1) {
            if (this.f192e[i4 >> 1] != 2) {
                if (this.f192e[i4 >> 1] == 3) {
                    m84f = (540 - m84f) % 360;
                }
                if (m84f % 90 == 0) {
                }
                return m84f % 360;
            }
            i3 = 540;
            m84f = i3 - m84f;
            if (m84f % 90 == 0) {
                if (f103p == 62) {
                    return 90;
                }
                m84f = Math.abs(((f103p - 22) + 45) / 90) * 90;
                if (f103p == 44) {
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
        int m235a;
        int m146b;
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
        int i8 = f38a[0];
        int i9 = (540 - f103p) % 360;
        if (Player_Info[12] == 1) {
            i8 = f38a[4];
        }
        Player_Info[11] = Player_Info[11] % 92160;
        int i10 = 0;
        int i11 = 0;
        int m235a2 = m235a();
        int m146b2 = m146b();
        int i12 = 33;
        int i13 = 1;
        if (f120c) {
            i = 28;
        } else if (f121d && f125g) {
            if (Player_Info[12] == 1) {
                iArr3 = f38a;
                c3 = 0;
            } else {
                iArr3 = f38a;
                c3 = 4;
            }
            i8 = iArr3[c3];
            m146b2 -= 5;
            i = 26;
        } else if (this.f101bo > 0) {
            i = 11;
            this.f101bo--;
        } else if (f124f) {
            i8 = f38a[4];
            i = 35 + ((this.f35j >> 1) % 2);
            f124f = false;
        } else if (f123e) {
            if ((this.f35j >> 1) % 5 < 3) {
                i8 = f38a[0];
                i2 = 32 + ((this.f35j >> 1) % 4);
            } else {
                i8 = f38a[4];
                i2 = 36 - ((this.f35j >> 1) % 4);
            }
            i = i2;
            f123e = false;
        } else if (f127i && f125g) {
            i10 = 0;
            if (f125g && f103p == 270) {
                i10 = 0 - 16;
            }
            m235a2 += i10;
            i = 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 5);
        } else if (f122Q) {
            m146b2 -= 5;
            i = 25 + ((this.f35j / 2) % 2);
        } else if (f128j) {
            i = f282W ? 29 : 27;
        } else if (f127i && !f125g) {
            i10 = (-16) + ((Math_CalcSine(i9) * 16) / 100);
            i11 = (-15) - ((m143b(i9) * 15) / 100);
            m235a2 += i10;
            m146b2 += i11;
            i12 = 20;
            i = 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4);
        } else if (f129k) {
            i = 22;
            f129k = false;
        } else if (f130R) {
            i = 5;
            f130R = false;
        } else if (this.f85be > 0) {
            i = 37 + ((this.f35j / 4) % 4);
        } else if (Player_Info[10] != 0 || f125g) {
            if (f125g || !((Player_Info[14] == 2 && Player_Info[10] > 0 && Player_Info[12] == 1) || (Player_Info[14] == 1 && Player_Info[10] < 0 && Player_Info[12] == 0))) {
                int i14 = 0;
                while (i14 < 7 && ((i14 * 45) + 23 >= i9 || ((i14 + 1) * 45) + 23 < i9)) {
                    i14++;
                }
                i8 = m77g(i14);
                i13 = i14 % 2;
                i12 = 20;
                i = (Math.abs(Player_Info[10]) >= this.Player_TopSpeed || f135S) ? i13 == 1 ? 18 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4) : 6 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 4) : i13 == 1 ? 12 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 6) : ((Player_Info[11] / this.Player_TopSpeed) / 4) % 6;
                int i15 = f210a[i13 == 1 ? (char) 151 : (char) 152][i][2] >> 1;
                int i16 = f210a[i13 == 1 ? (char) 151 : (char) 152][i][3] >> 1;
                i10 = (-i15) + ((Math_CalcSine(i9) * i15) / 100);
                i11 = (-i16) - ((m143b(i9) * i16) / 100);
                m235a2 += i10;
                m146b2 += i11;
            } else {
                i8 = f38a[0];
                if (Player_Info[12] == 0) {
                    i8 = f38a[4];
                }
                i = 30 + (((Player_Info[11] / this.Player_TopSpeed) / 4) % 2);
            }
        } else if (this.f285F) {
            if (this.f286ar == 1) {
                iArr2 = f38a;
                c2 = 0;
            } else {
                iArr2 = f38a;
                c2 = 4;
            }
            i8 = iArr2[c2];
            i = 23 + ((this.f289au / 8) % 2);
        } else if (this.f206s || ((f103p > 22 && f103p < 338) || ((m93e(m235a() + 12, m146b()) || m93e(m235a() + 12, m146b() + 16)) && (m93e(m235a() - 12, m146b()) || m93e(m235a() - 12, m146b() + 16))))) {
            i = this.f289au < 75 ? 0 : this.f289au < 90 ? 1 : this.f289au < 105 ? 2 : 3 + ((this.f289au / 8) % 2);
        } else {
            if (m93e(m235a() + 12, m146b()) || m93e(m235a() + 12, m146b() + 16)) {
                iArr = f38a;
                c = 4;
            } else {
                iArr = f38a;
                c = 0;
            }
            i8 = iArr[c];
            i = 23 + ((this.f289au / 8) % 2);
        }
        if (i13 == 1) {
            i3 = m235a2;
            i4 = m146b2;
            i5 = 151;
        } else {
            i3 = m235a2;
            i4 = m146b2;
            i5 = 152;
        }
        m217a(i3, i4, i5, i, i8, i12);
        f135S = false;
        if (this.f85be > 0) {
            this.f85be--;
        }
        if (Player_Info[10] != 0 || f125g) {
            game = this;
            i6 = 0;
        } else {
            game = this;
            i6 = game.f289au + 1;
        }
        game.f289au = i6;
        int Math_CalcSine = (-16) + ((Math_CalcSine(i9) * 16) / 100);
        int m143b = (-16) - ((m143b(i9) * 16) / 100);
        if (this.Player_InvincTime > 0) {
            if (this.f35j % 2 == 0) {
                if (i10 == 0 && i11 == 0) {
                    m58j(m235a(), m146b() - 18, 0);
                } else {
                    m58j(m235a() + Math_CalcSine + 16, m146b() + m143b + 16, 0);
                }
            }
        } else if (this.Player_ShieldFlag > 0) {
            if (Math_CalcSine == 0 && m143b == 0) {
                m235a = m235a() + i10;
                m146b = m146b() - 18;
                i7 = i11;
            } else {
                m235a = m235a() + Math_CalcSine + 16;
                m146b = m146b() + m143b;
                i7 = 16;
            }
            int i17 = m146b + i7;
            if (f127i && f125g && i9 == 254) {
                m235a += 16;
                i17 -= 8;
            }
            m133b(109, 48, 48 * (this.f35j % 2), 48, 48, f38a[0], m235a, i17 - 4);
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
            iArr = new int[]{f38a[5], f38a[5], f38a[4], f38a[4], f38a[7], f38a[7], f38a[6]};
            iArr2 = iArr;
            c = 7;
            iArr3 = f38a;
            c2 = 6;
        } else {
            iArr = new int[]{f38a[2], f38a[1], f38a[1], f38a[0], f38a[0], f38a[3], f38a[3]};
            iArr2 = iArr;
            c = 7;
            iArr3 = f38a;
            c2 = 2;
        }
        iArr2[c] = iArr3[c2];
        return iArr[i];
    }

    /* renamed from: j */
    private void m58j(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.f203k.length; i4++) {
            if (this.f203k[i4][0] == 0) {
                this.f203k[i4][0] = 1;
                this.f203k[i4][1] = i3;
                this.f203k[i4][2] = i;
                this.f203k[i4][3] = i2;
                this.f203k[i4][5] = 0;
                return;
            }
        }
    }

    /* renamed from: x */
    public final void m13x() {
        for (int i = 0; i < this.f203k.length; i++) {
            if (this.f203k[i][0] == 1 && this.f203k[i][1] == 0) {
                int[] iArr = this.f203k[i];
                iArr[5] = iArr[5] + 1;
                if (this.f203k[i][5] > 60) {
                    this.f203k[i][5] = 0;
                    this.f203k[i][0] = 0;
                }
            }
        }
    }

    /* renamed from: y */
    public final void m11y() {
        for (int i = 0; i < this.f203k.length; i++) {
            if (this.f203k[i][0] == 1 && this.f203k[i][1] == 0) {
                m133b(109, 0, 48 * ((this.f203k[i][5] / 4) % 2), 48, 48, f38a[0], this.f203k[i][2], this.f203k[i][3]);
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
        this.f238J = new int[i];
        this.f200c = new boolean[i + 20];
        this.f201d = new boolean[i + 20];
        int i3 = 0;
        for (int i4 = 0; i4 < this.Level_ActorLayout[this.Game_ActID].length / 7; i4++) {
            this.f238J[i4] = i3;
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
        return iArr[2] - f228y[0] < this.f294bM || iArr[2] - f228y[0] > this.f295bN || Math.abs(iArr[3] - f228y[1]) > this.f296bO;
    }

    /* renamed from: z */
    public final void m9z() {
        int length = this.Level_ActorLayout[this.Game_ActID].length / 7;
        try {
            if (this.f292Z) {
                if (this.f290bK < this.f291bL) {
                    this.f291bL = this.f290bK;
                } else {
                    this.f290bK = this.f291bL;
                }
                int i = this.f291bL * 7;
                int i2 = this.f290bK * 7;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i + 1] & 255)) - f228y[0] > this.f295bN) {
                        break;
                    }
                    if (Math.abs((((this.Level_ActorLayout[this.Game_ActID][i + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i + 3] & 255)) - f228y[1]) < this.f296bO && !this.f200c[this.f238J[this.f291bL]]) {
                        m49l(this.f291bL);
                    }
                    this.f291bL++;
                    i += 7;
                    if (this.f291bL >= length) {
                        this.f291bL = length - 1;
                        break;
                    }
                }
                this.f292Z = false;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i2 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i2 + 1] & 255)) - f228y[0] >= this.f294bM) {
                        break;
                    }
                    this.f290bK++;
                    i2 += 7;
                    if (this.f290bK >= length) {
                        this.f290bK = length - 1;
                        break;
                    }
                }
            }
            if (this.f293aa) {
                if (this.f290bK > this.f291bL) {
                    this.f291bL = this.f290bK;
                } else {
                    this.f290bK = this.f291bL;
                }
                int i3 = this.f291bL * 7;
                int i4 = this.f290bK * 7;
                while (true) {
                    if ((((this.Level_ActorLayout[this.Game_ActID][i3 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i3 + 1] & 255)) - f228y[0] < this.f294bM) {
                        break;
                    }
                    if (Math.abs((((this.Level_ActorLayout[this.Game_ActID][i3 + 2] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i3 + 3] & 255)) - f228y[1]) < this.f296bO && !this.f200c[this.f238J[this.f291bL]]) {
                        m49l(this.f291bL);
                    }
                    this.f291bL--;
                    i3 -= 7;
                    if (this.f291bL < 0) {
                        this.f291bL = 0;
                        break;
                    }
                }
                this.f293aa = false;
                while ((((this.Level_ActorLayout[this.Game_ActID][i4 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i4 + 1] & 255)) - f228y[0] > this.f295bN) {
                    this.f290bK--;
                    i4 -= 7;
                    if (this.f290bK < 0) {
                        this.f290bK = 0;
                        return;
                    }
                }
            }
        } catch (Exception unused) {
            this.f292Z = false;
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
                        if (i12 - f228y[0] < this.f294bM || i12 - f228y[0] > this.f295bN) {
                            return;
                        }
                        break;
                    case 1:
                    case 68:
                    case 69:
                    default:
                        if (i12 - f228y[0] < this.f294bM) {
                            return;
                        }
                        return;
                    case 63:
                        i5 = i12 - ((i9 - 1) * 16);
                        i12 = i5;
                        if (i12 - f228y[0] < this.f294bM) {
                        }
                        break;
                    case 64:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 16;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f228y[0] < this.f294bM) {
                        }
                        break;
                    case 65:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 32;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f228y[0] < this.f294bM) {
                        }
                        break;
                    case 66:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 16;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f228y[0] < this.f294bM) {
                        }
                        break;
                    case 67:
                        i2 = i12;
                        i3 = i9 - 1;
                        i4 = 32;
                        i5 = i2 + (i3 * i4);
                        i12 = i5;
                        if (i12 - f228y[0] < this.f294bM) {
                        }
                        break;
                }
            }
        } else if (i11 == 41 || i11 == 86 || i11 == 57 || i11 == 78 || i11 == 40 || i11 == 70 || i11 == 39 || i11 == 49 || i11 == 71 || i11 == 10 || i11 == 35) {
            int i13 = ((this.Level_ActorLayout[this.Game_ActID][i10 + 0] & 255) << 8) | (this.Level_ActorLayout[this.Game_ActID][i10 + 1] & 255);
            if (i13 - f228y[0] > -48 && i13 - f228y[0] < 288) {
                return;
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            int[] iArr2 = new int[25];
            if (!this.f201d[this.f238J[i] + i14] && !this.f200c[this.f238J[i] + i14]) {
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
                iArr2[20] = this.f238J[i] + i14;
                iArr2[22] = this.f238J[i];
                if (this.Game_Settings[0] == 0) {
                    if (iArr2[1] == 41 || iArr2[1] == 86 || iArr2[1] == 57 || iArr2[1] == 78 || iArr2[1] == 40 || iArr2[1] == 70 || iArr2[1] == 39 || iArr2[1] == 49 || iArr2[1] == 71) {
                        return;
                    }
                } else if (this.Game_Settings[0] == 1 && (iArr2[1] == 40 || iArr2[1] == 70 || iArr2[1] == 39 || iArr2[1] == 49 || iArr2[1] == 71)) {
                    return;
                }
                this.f200c[this.f238J[i] + i14] = true;
                m100d(iArr2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (m226a(m235a() + 8, m146b() - 24) != false) goto L11;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m271A() {
        Game game;
        if (this.f302G && this.Cheats_Active[0]) {
            return;
        }
        if ((!this.f136h[0] || !this.f136h[3]) && ((f125g && !this.f206s) || !this.f136h[3])) {
            if (this.Game_ZoneID == 2 || this.Game_ZoneID == 4) {
                if (this.f206s) {
                    if (m226a(m235a() - 8, m146b() - 24)) {
                    }
                }
            } else if (this.f206s && (m226a(m235a() - 8, m146b() - 24) || m226a(m235a() + 8, m146b() - 24))) {
                game = this;
                game.Player_Kill();
            }
            this.f136h[0] = false;
            this.f136h[3] = false;
        }
        game = this;
        game.Player_Kill();
        this.f136h[0] = false;
        this.f136h[3] = false;
    }

    /* renamed from: d */
    private void m100d(int[] iArr) {
        if (iArr[1] == 9 || iArr[1] == 15 || iArr[1] == 48 || iArr[1] == 11 || iArr[1] == 2 || iArr[1] == 79 || 0 == iArr[1] || 1 == iArr[1] || 63 == iArr[1] || 64 == iArr[1] || 65 == iArr[1] || 66 == iArr[1] || 67 == iArr[1] || 68 == iArr[1] || 69 == iArr[1]) {
            for (int length = this.f198e.length - 1; length > 0; length--) {
                if (this.f198e[length][24] == 0) {
                    this.f198e[length] = iArr;
                    this.f198e[length][24] = 1;
                    if (this.f138F != length) {
                        this.f199af++;
                        return;
                    }
                    this.f199af++;
                    for (int i = 0; i < this.f198e.length; i++) {
                        if (this.f198e[length][24] == 0) {
                            this.f138F = length;
                            return;
                        }
                    }
                    return;
                }
            }
        } else if (this.f198e[this.f138F][24] == 0) {
            this.f198e[this.f138F] = iArr;
            this.f198e[this.f138F][24] = 1;
            this.f199af++;
            for (int i2 = 0; i2 < this.f198e.length; i2++) {
                if (this.f198e[i2][24] == 0) {
                    this.f138F = i2;
                    return;
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f198e.length) {
                    break;
                } else if (this.f198e[i3][24] == 0) {
                    this.f138F = i3;
                    break;
                } else {
                    i3++;
                }
            }
            this.f198e[this.f138F] = iArr;
            this.f198e[this.f138F][24] = 1;
            this.f199af++;
            for (int i4 = 0; i4 < this.f198e.length; i4++) {
                if (this.f198e[i4][24] == 0) {
                    this.f138F = i4;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m142b(int i) {
        this.f138F = i;
        this.f198e[i][24] = 0;
        this.f139G--;
    }

    /* renamed from: a */
    public final int[][] m225a(int i, int i2) {
        this.f141H = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f198e.length && i3 < this.f199af; i4++) {
            if (this.f198e[i4][24] == 1) {
                i3++;
                if (this.f198e[i4][1] == i && (i2 < 0 || i2 == this.f198e[i4][4])) {
                    this.f140c[this.f141H] = this.f198e[i4];
                    this.f140c[this.f141H][23] = i4;
                    this.f141H++;
                }
            }
        }
        int[][] iArr = new int[this.f141H][25];
        System.arraycopy(this.f140c, 0, iArr, 0, iArr.length);
        return iArr;
    }

    /* renamed from: aw */
    private void m150aw() {
        byte[] bArr;
        int i;
        int i2;
        int i3 = this.f102bp;
        this.f102bp = i3 - 1;
        if (i3 <= 0 && m146b() >= 0) {
            boolean z = false;
            int m235a = m235a() >> 8;
            int m146b = m146b() >> 8;
            byte b = this.f239d[m146b % this.f222bv][m235a];
            if ((f98b[0] >> 8) < m235a && this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                this.f239d[m146b % this.f222bv][m235a] = 53;
            }
            if ((f98b[0] >> 8) > m235a && this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                this.f239d[m146b % this.f222bv][m235a] = 54;
            }
            int i4 = this.f239d[m146b % this.f222bv][m235a] & 1;
            if (this.Game_ZoneID == 0 && (b == 53 || b == 54)) {
                z = true;
            }
            if (z && m104d(m235a(), m146b())) {
                if (i4 % 2 == 1 && (m235a() >> 4) % 16 < 9 && (m146b() >> 4) % 16 < 3) {
                    bArr = this.f239d[m146b % this.f222bv];
                    i = m235a;
                    i2 = bArr[i] + 1;
                } else if (i4 % 2 != 0 || (m235a() >> 4) % 16 < 7 || (m146b() >> 4) % 16 >= 3) {
                    return;
                } else {
                    bArr = this.f239d[m146b % this.f222bv];
                    i = m235a;
                    i2 = bArr[i] - 1;
                }
                bArr[i] = (byte) i2;
                this.f102bp = 60;
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
        if (i4 >= 0 && f210a[i3].length != 0) {
            int length = i4 % f210a[i3].length;
            int i7 = f210a[i3][length][0];
            int i8 = f210a[i3][length][1];
            int i9 = f210a[i3][length][2];
            int i10 = f210a[i3][length][3];
            int i11 = 0;
            if (f210a[i3][length].length > 4) {
                i11 = f210a[i3][length][4];
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
                i10 = f26i;
            } else {
                i9 = i7;
                i10 = f23f;
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
    public static int m218a(int i, int i2, int i3, int i4, int i5, int i6) {
        return m213a(m235a(), m146b() - 12, f98b[0], f98b[1] - 12, 12, 12, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: a */
    public static int m213a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (f128j || f131l) {
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
        this.f287as = i2;
        this.f288at = i;
    }

    /* renamed from: B */
    public final void m269B() {
        this.f136h[3] = true;
        if (Player_Info[5] < 0) {
            Player_Info[5] = 0;
        }
    }

    /* renamed from: b */
    public static int m135b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f128j || f131l) {
            return -1;
        }
        int i7 = (540 - f103p) % 360;
        if (0 > i7) {
            i7 = 0;
        }
        int i8 = 12;
        if (!f127i && !f129k) {
            i8 = 18;
        }
        int Math_CalcSine = (Math_CalcSine(i7) * i8) / 100;
        int i9 = ((-m143b(i7)) * i8) / 100;
        int m235a = m235a() + Math_CalcSine;
        int m146b = m146b() + i9;
        int i10 = f98b[0] + Math_CalcSine;
        int i11 = f98b[1] + i9;
        int i12 = i8;
        if (i11 + i12 > i4 - i6 || m146b + i12 < i2 - i6 || m235a + 12 < i - i5 || m235a - 12 > i + i5) {
            if (i10 + 12 > i3 - i5 || m235a + 12 < i - i5 || m146b + i12 < i2 - i6 || m146b - i12 > i2 + i6) {
                if (i10 - 12 < i3 + i5 || m235a - 12 > i + i5 || m146b + i12 < i2 - i6 || m146b - i12 > i2 + i6) {
                    if (i11 - i12 < i4 + i6 || m146b - i12 > i2 + i6 || m235a + 12 < i - i5 || m235a - 12 > i + i5) {
                        return (m235a + 12 < i - i5 || m235a - 12 > i + i5 || m146b + i12 < i2 - i6 || m146b - i12 > i2 + i6) ? -1 : 4;
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
        if (f128j || f131l) {
            return -1;
        }
        int i7 = 12;
        if (!f127i) {
            i7 = 16;
        }
        int i8 = -i7;
        int m235a = m235a() + 0;
        int m146b = m146b() + i8;
        int i9 = f98b[0] + 0;
        int i10 = f98b[1] + i8;
        int i11 = i7;
        if (i10 + i11 > i4 - i6 || m146b + i11 < i2 - i6 || m235a + 12 < i - i5 || m235a - 12 > i + i5) {
            if (i9 + 12 > i3 - i5 || m235a + 12 < i - i5 || m146b + i11 < i2 - i6 || m146b - i11 > i2 + i6) {
                if (i9 - 12 < i3 + i5 || m235a - 12 > i + i5 || m146b + i11 < i2 - i6 || m146b - i11 > i2 + i6) {
                    if (i10 - i11 < i4 + i6 || m146b - i11 > i2 + i6 || m235a + 12 < i - i5 || m235a - 12 > i + i5) {
                        return (m235a + 12 < i - i5 || m235a - 12 > i + i5 || m146b + i11 < i2 - i6 || m146b - i11 > i2 + i6) ? -1 : 4;
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
                    this.f223ai = 9;
                    this.f252v = true;
                    return;
                }
            }
            m106d(3);
            return;
        }
        this.Player_Lives = 3;
        this.Player_Score = 0;
        this.f113z = 0;
        m35p();
        this.f115B = 0;
        this.f116C = 0;
        this.f117D = 0;
        this.f118E = 0;
        this.f284Y = false;
    }

    /* renamed from: a */
    public static Vector m205a(String str) {
        int i = 0;
        Vector vector = new Vector();
        while (i < str.length()) {
            String substring = str.substring(i);
            int i2 = 0;
            int i3 = 0;
            while (m131b(substring, i2) < f24g - 32) {
                i3 = i2;
                int m201a = m201a(substring, i2 + 1);
                i2 = m201a;
                if (m201a == -1) {
                    i2 = substring.length();
                    if (i3 == 0) {
                        break;
                    } else if (m131b(substring, i2) < f24g - 32) {
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
        return f78b.substringWidth(str, 0, i);
    }

    /* renamed from: d */
    public final void m106d(int i) {
        this.f252v = true;
        this.f253ao = 10;
        m101d(false);
        this.Menu_ID = (byte) i;
        this.f223ai = 1;
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
        this.f252v = true;
        for (int i7 = 0; i7 < 10; i7++) {
            if (!this.f15g[i7]) {
                zArr = this.f15g;
                i6 = i7;
                z = this.Input_Array[i7];
            } else if (this.Input_Array[i7]) {
                zArr = this.Input_Array;
                i6 = i7;
                z = false;
            } else {
                zArr = this.f15g;
                i6 = i7;
                z = false;
            }
            zArr[i6] = z;
        }
        if (this.f73L) {
            this.f73L = false;
        }
        this.f71b = (byte) ((this.f71b + 1) % 24);
        switch (this.Menu_ID) {
            case 0:
                this.f298bP++;
                if (this.f298bP > 150) {
                    this.f298bP = 0;
                    this.Menu_ID = (byte) 11;
                    this.f204q = true;
                    break;
                }
                break;
            case 1:
                this.f298bP++;
                if (this.f298bP > 150) {
                    this.f298bP = 0;
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
                    m73h();
                    m101d(false);
                    m37o(0);
                    break;
                }
                break;
            case 3:
                if (this.f316I) {
                    if (this.f70d < 12) {
                        this.f298bP++;
                        if (this.f298bP > 10) {
                            this.f70d = (byte) (this.f70d + 1);
                        }
                    } else {
                        this.f298bP = (byte) ((this.f298bP + 1) % 10);
                    }
                }
                if (this.f70d >= 12) {
                    for (int i8 = 0; i8 < this.Input_Array.length; i8++) {
                        if (this.Input_Array[i8]) {
                            this.Menu_ID = (byte) 4;
                            m79g();
                            this.f72e = (byte) 0;
                            m41n(11 + this.f72e);
                            m37o(2);
                        }
                    }
                }
                if (this.Input_Array[6]) {
                    this.Menu_ID = (byte) 14;
                    this.f72e = (byte) 1;
                    break;
                }
                break;
            case 4:
                if (this.f316I) {
                    this.f298bP = (byte) ((this.f298bP + 1) % 5);
                }
                if (this.Input_Array[4]) {
                    this.f72e = (byte) (this.f72e + 1);
                    if ((this.f302G && this.f72e == 9) || (!this.f302G && this.f72e == 8)) {
                        this.f72e = (byte) 0;
                    }
                    m41n(11 + this.f72e);
                }
                if (this.Input_Array[3]) {
                    this.f72e = (byte) (this.f72e - 1);
                    if (this.f72e < 0) {
                        if (this.f302G) {
                            game5 = this;
                            b = 8;
                        } else {
                            game5 = this;
                            b = 7;
                        }
                        game5.f72e = b;
                    }
                    m41n(11 + this.f72e);
                }
                if (this.Input_Array[0]) {
                    if (this.f72e == 0) {
                        m169ad();
                        if (this.f245g != 0 || this.f246h != 9) {
                            m37o(1);
                            this.f72e = (byte) 1;
                            m41n(50 + this.f72e);
                            this.Menu_ID = (byte) 9;
                            return;
                        }
                        m97e();
                        this.f204q = true;
                        this.Player_Lives = 3;
                        if (this.f302G) {
                            game4 = this;
                            i5 = this.f304ay;
                        } else {
                            game4 = this;
                            i5 = 0;
                        }
                        game4.Player_Emeralds = i5;
                        this.Player_Score = 0;
                        if (this.f308az <= 0) {
                            this.f245g = (byte) 0;
                            this.f227am = 0;
                        }
                        this.f226al = 0;
                        this.Game_ZoneID = f219f[this.f226al][this.f227am];
                        this.Game_ActID = f220g[this.f226al][this.f227am];
                        this.f205r = true;
                        m35p();
                        return;
                    } else if (this.f72e == 1) {
                        this.f72e = (byte) 1;
                        m97e();
                        this.f226al = 0;
                        this.f227am = 0;
                        this.Game_ZoneID = f219f[this.f226al][this.f227am];
                        this.Game_ActID = f220g[this.f226al][this.f227am];
                        this.f204q = true;
                        this.f223ai = 3;
                        this.f252v = true;
                        this.f253ao = 10;
                        GFX_UnloadArray(GFX_MenuArray);
                        return;
                    } else {
                        if (this.f72e == 2) {
                            this.f72e = (byte) 0;
                            this.f76f = (byte) 0;
                            this.Menu_ID = (byte) 10;
                            GFX_GameArray[36] = GFX_Load("/save.png");
                            GFX_GameArray[42] = GFX_Load("/item.png");
                            this.f75a = new Vector();
                            this.f73L = true;
                            this.f77N = false;
                            f78b = Font.getFont(64, 0, 0);
                        } else if (this.f72e == 3) {
                            this.Menu_ID = (byte) 5;
                            m37o(1);
                            this.f76f = (byte) 0;
                        } else if (this.f72e == 4) {
                            this.f72e = (byte) 0;
                            this.Menu_ID = (byte) 8;
                            m41n(52 + this.f72e);
                            m37o(1);
                            this.f73L = true;
                        } else {
                            if (this.f72e == 5) {
                                this.f72e = (byte) 0;
                                this.f76f = (byte) 0;
                                this.f77N = false;
                                this.Menu_ID = (byte) 12;
                            } else if (this.f72e == 6) {
                                this.f72e = (byte) 0;
                                this.Menu_ID = (byte) 16;
                                m41n(52 + this.f72e);
                                m37o(1);
                                this.f73L = true;
                            } else if (this.f72e == 7) {
                                this.f72e = (byte) 0;
                                this.Menu_ID = (byte) 17;
                                this.f333b = "";
                                m41n(52 + this.f72e);
                                m37o(4);
                                this.f73L = true;
                            } else if (this.f72e == 8) {
                                this.f72e = (byte) 0;
                                this.Menu_ID = (byte) 13;
                                this.f304ay = this.Player_Emeralds;
                            }
                            this.f73L = true;
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
                    this.f72e = (byte) 3;
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    m41n(11 + this.f72e);
                } else if (this.Input_Array[9]) {
                    this.f72e = (byte) 1;
                    this.Menu_ID = (byte) 6;
                }
                if (this.Input_Array[2] && this.f76f > 0) {
                    this.f76f = (byte) (this.f76f - 1);
                    this.f73L = true;
                }
                if (this.Input_Array[1] && this.f77N) {
                    this.f76f = (byte) (this.f76f + 1);
                    this.f73L = true;
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
                        if (this.f72e == 0) {
                            HighScore_DefaultScores = new int[5];
                            HighScore_DefaultDifficulties = new int[5];
                            HighScore_DefaultNames = new String[]{"   ", "   ", "   ", "   ", "   "};
                            HighScore_ResetValues();
                            this.Menu_ID = (byte) 7;
                            break;
                        }
                    }
                } else {
                    this.f72e = (byte) ((this.f72e + 1) % 2);
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
                    this.f72e = (byte) 4;
                    m41n(11 + this.f72e);
                    m73h();
                } else {
                    if (this.Input_Array[2]) {
                        this.f72e = (byte) (this.f72e - 1);
                        if (this.f72e < 0) {
                            this.f72e = (byte) 2;
                        }
                        m41n(52 + this.f72e);
                    } else if (this.Input_Array[1]) {
                        this.f72e = (byte) ((this.f72e + 1) % 3);
                        m41n(52 + this.f72e);
                    } else if (this.Input_Array[4]) {
                        if (this.f72e == 0) {
                            this.Game_Settings[0] = (byte) ((this.Game_Settings[0] + 1) % 3);
                        } else if (this.f72e == 1) {
                            this.Game_Settings[1] = (byte) ((this.Game_Settings[1] + 1) % 2);
                            this.Music_MainPlayer.m5a((int) this.Game_Settings[1]);
                        }
                        if (this.f72e == 2) {
                            this.Game_Settings[2] = (byte) ((this.Game_Settings[2] + 1) % 5);
                            Text_LoadLang();
                            m41n(52 + this.f72e);
                            this.f34a[1] = this.f66b[59];
                        }
                        game3 = this;
                        game3.f73L = true;
                    } else if (this.Input_Array[3]) {
                        byte[] bArr3 = this.Game_Settings;
                        byte b2 = this.f72e;
                        bArr3[b2] = (byte) (bArr3[b2] - 1);
                        if (this.Game_Settings[this.f72e] < 0) {
                            if (this.f72e == 0) {
                                this.Game_Settings[0] = 2;
                            } else if (this.f72e == 1) {
                                this.Game_Settings[1] = 1;
                                audio_Player = this.Music_MainPlayer;
                                i4 = 1;
                                audio_Player.m5a(i4);
                            } else {
                                this.Game_Settings[2] = 4;
                            }
                            if (this.f72e == 2) {
                                Text_LoadLang();
                                m41n(52 + this.f72e);
                                this.f34a[1] = this.f66b[59];
                            }
                        } else {
                            if (this.f72e == 1) {
                                audio_Player = this.Music_MainPlayer;
                                i4 = 0;
                                audio_Player.m5a(i4);
                            }
                            if (this.f72e == 2) {
                            }
                        }
                    }
                    game3 = this;
                    game3.f73L = true;
                }
                m148ay();
                break;
            case 9:
                if (this.Input_Array[6]) {
                    this.Menu_ID = (byte) 4;
                    this.f72e = (byte) 0;
                    m41n(11 + this.f72e);
                    m37o(2);
                } else if (this.Input_Array[2] || this.Input_Array[1]) {
                    this.f72e = (byte) ((this.f72e + 1) % 2);
                    m41n(50 + this.f72e);
                } else if (this.Input_Array[0]) {
                    if (this.f72e == 0) {
                        m97e();
                        this.f204q = true;
                        GFX_UnloadArray(GFX_MenuArray);
                        this.Player_Lives = 3;
                        if (this.f302G) {
                            game2 = this;
                            i3 = this.f304ay;
                        } else {
                            game2 = this;
                            i3 = 0;
                        }
                        game2.Player_Emeralds = i3;
                        this.Player_Score = 0;
                        this.f245g = (byte) 0;
                        this.f226al = 0;
                        game = this;
                        i2 = 0;
                    } else if (this.f72e == 1) {
                        m97e();
                        this.f204q = true;
                        GFX_UnloadArray(GFX_MenuArray);
                        this.Player_Lives = this.f247i;
                        this.Player_Score = this.f248bx;
                        this.f226al = this.f245g / 3;
                        game = this;
                        i2 = this.f245g % 3;
                    }
                    game.f227am = i2;
                    this.Game_ZoneID = f219f[this.f226al][this.f227am];
                    this.Game_ActID = f220g[this.f226al][this.f227am];
                    this.f205r = true;
                    m35p();
                }
                m148ay();
                break;
            case 10:
                if (this.Input_Array[4] && this.f72e < 25) {
                    this.f72e = (byte) (this.f72e + 1);
                    if (this.f72e == 23 || this.f72e == 24) {
                        this.f72e = (byte) 25;
                    }
                    this.f76f = (byte) 0;
                    this.f73L = true;
                }
                if (this.Input_Array[3] && this.f72e > 0) {
                    this.f72e = (byte) (this.f72e - 1);
                    if (this.f72e == 23 || this.f72e == 24) {
                        this.f72e = (byte) 22;
                    }
                    this.f76f = (byte) 0;
                    this.f73L = true;
                }
                if (this.Input_Array[2] && this.f76f > 0) {
                    this.f76f = (byte) (this.f76f - 1);
                    this.f73L = true;
                }
                if (this.Input_Array[1] && this.f77N) {
                    this.f76f = (byte) (this.f76f + 1);
                    this.f73L = true;
                }
                if (this.Input_Array[6]) {
                    this.f72e = (byte) 2;
                    this.Menu_ID = (byte) 4;
                    GFX_GameArray[36] = null;
                    GFX_GameArray[42] = null;
                    m37o(2);
                }
                this.f75a = m205a(this.f67f[1 + (this.f72e * 2)]);
                break;
            case 11:
                this.f298bP++;
                if (this.f298bP > 150) {
                    this.f298bP = 0;
                    this.Menu_ID = (byte) 1;
                    this.f204q = true;
                    break;
                }
                break;
            case 12:
                if (this.Input_Array[4] && this.f72e < 5) {
                    this.f76f = (byte) 0;
                    this.f72e = (byte) (this.f72e + 1);
                    this.f73L = true;
                }
                if (this.Input_Array[3] && this.f72e > 0) {
                    this.f76f = (byte) 0;
                    this.f72e = (byte) (this.f72e - 1);
                    this.f73L = true;
                }
                if (this.Input_Array[2] && this.f76f > 0) {
                    this.f76f = (byte) (this.f76f - 1);
                    this.f73L = true;
                }
                if (this.Input_Array[1] && this.f77N) {
                    this.f76f = (byte) (this.f76f + 1);
                    this.f73L = true;
                }
                if (this.Input_Array[6]) {
                    this.f72e = (byte) 5;
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    break;
                }
                break;
            case 13:
                if (!this.Input_Array[6] && !this.Input_Array[0]) {
                    if (this.Input_Array[2]) {
                        this.f72e = (byte) (this.f72e - 1);
                        if (this.f72e < 0) {
                            this.f72e = (byte) 6;
                        }
                        this.f73L = true;
                        break;
                    } else if (this.Input_Array[1]) {
                        this.f72e = (byte) ((this.f72e + 1) % 7);
                        this.f73L = true;
                        break;
                    } else if (this.Input_Array[4]) {
                        if (this.f72e == 0) {
                            this.Cheats_Active[0] = !this.Cheats_Active[0];
                        } else if (this.f72e == 1) {
                            this.Cheats_Active[2] = !this.Cheats_Active[2];
                        } else if (this.f72e == 2) {
                            this.f304ay++;
                            if (this.f304ay > 6) {
                                this.f304ay = 0;
                            }
                            this.Player_Emeralds = this.f304ay;
                        } else if (this.f72e == 3) {
                            this.Cheats_Active[1] = !this.Cheats_Active[1];
                        } else if (this.f72e == 4) {
                            this.Cheats_Active[3] = !this.Cheats_Active[3];
                        } else if (this.f72e == 5) {
                            this.Cheats_Active[4] = !this.Cheats_Active[4];
                        } else if (this.f72e == 6) {
                            this.f223ai = 8;
                            this.f47aL = 0;
                            m79g();
                        }
                        this.f73L = true;
                        break;
                    } else if (this.Input_Array[3]) {
                        if (this.f72e == 0) {
                            this.Cheats_Active[0] = !this.Cheats_Active[0];
                        } else if (this.f72e == 1) {
                            this.Cheats_Active[2] = !this.Cheats_Active[2];
                        } else if (this.f72e == 2) {
                            this.f304ay--;
                            if (this.f304ay < 0) {
                                this.f304ay = 6;
                            }
                            this.Player_Emeralds = this.f304ay;
                        } else if (this.f72e == 3) {
                            this.Cheats_Active[1] = !this.Cheats_Active[1];
                        } else if (this.f72e == 4) {
                            this.Cheats_Active[3] = !this.Cheats_Active[3];
                        } else if (this.f72e == 5) {
                            this.Cheats_Active[4] = !this.Cheats_Active[4];
                        } else if (this.f72e == 6) {
                            this.f223ai = 8;
                            this.f47aL = 0;
                            m79g();
                        }
                        this.f73L = true;
                        break;
                    }
                } else {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.f72e = (byte) 8;
                    m41n(11 + this.f72e);
                    break;
                }
                break;
            case 14:
                this.f252v = true;
                this.f72e = (byte) (this.f72e % 2);
                if (!this.Input_Array[2] && !this.Input_Array[1]) {
                    if (this.Input_Array[0]) {
                        if (this.f72e == 0) {
                            this.f307a.notifyDestroyed();
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
                    this.f72e = (byte) ((this.f72e + 1) % 2);
                    break;
                }
                break;
            case 16:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.f72e = (byte) 6;
                    m41n(11 + this.f72e);
                    break;
                }
                break;
            case 17:
                if (this.Input_Array[6] || this.Input_Array[0]) {
                    this.Menu_ID = (byte) 4;
                    m37o(2);
                    this.f72e = (byte) 7;
                    m41n(11 + this.f72e);
                    break;
                } else if (this.Input_Array[5]) {
                    StringBuffer stringBuffer = new StringBuffer(8);
                    for (int i9 = 0; i9 < 8; i9++) {
                        stringBuffer.append(HighScore_ValidChars[this.f331M[i9]]);
                    }
                    if (m203a(stringBuffer.toString())) {
                        this.f333b = this.f66b[89];
                        break;
                    } else {
                        this.f333b = this.f66b[88];
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
                if (this.f316I) {
                    m101d(false);
                    this.Menu_ID = (byte) this.f323aG;
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
    public final void m265D() {
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
                GFX_Painter.drawImage(GFX_MenuArray[0], GFX_MenuWidth >> 1, f23f + (f22e >> 1), 3);
                if (this.f298bP < 30) {
                    int i13 = (GFX_MenuWidth * this.f298bP) / 30;
                    GFX_Painter.fillRect((i13 - GFX_MenuWidth) - 10, f26i, GFX_MenuWidth, f25h);
                    GFX_Painter.fillRect(i13 + 10, f26i, GFX_MenuWidth, f25h);
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
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth >> 1, f23f + (f22e >> 1), 3);
                return;
            case 2:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f23f, GFX_MenuWidth, f22e);
                m261F();
                GFX_Painter.setColor(16777215);
                String str2 = this.f66b[this.f42a[2][this.Game_Settings[2]]];
                int stringWidth = f17a.stringWidth(str2);
                int i16 = f23f + (f22e >> 1);
                GFX_Painter.drawString(str2, GFX_MenuWidth >> 1, i16, 65);
                GFX_Painter.drawImage(GFX_MenuArray[1], (GFX_MenuWidth >> 1) + (stringWidth >> 1) + 5, i16, 36);
                GFX_Painter.drawImage(GFX_MenuArray[2], ((GFX_MenuWidth >> 1) - (stringWidth >> 1)) - 5, i16, 40);
                return;
            case 3:
                m191a(true, false);
                m149ax();
                m261F();
                int i17 = f26i + f25h;
                if (this.f70d >= 12) {
                    m200a(this.f66b[0], GFX_MenuWidth >> 1, i17, 16777215, 0);
                    return;
                }
                return;
            case 4:
                m191a(true, false);
                m149ax();
                m261F();
                int i18 = f26i + f25h;
                if (this.f308az > 0) {
                    this.f66b[2] = this.f66b[70];
                }
                m200a(this.f66b[2 + this.f72e], GFX_MenuWidth >> 1, i18, 16777215, 16386570);
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth - 5, i18 + (f18a >> 1), 6);
                GFX_Painter.drawImage(GFX_MenuArray[2], 2, i18 + (f18a >> 1), 6);
                m196a(this.f68a, true);
                return;
            case 5:
                int height = GFX_Painter.getFont().getHeight();
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                this.f77N = false;
                for (int i19 = this.f76f; i19 < 5; i19++) {
                    if (f23f + 42 + (height * (i19 - this.f76f)) + f18a < f26i + f25h) {
                        GFX_Painter.drawString(new StringBuffer().append("").append(i19 + 1).append(" ").append(HighScore_DefaultNames[i19]).append(" ").append(HighScore_DefaultScores[i19]).toString(), 6, f23f + 42 + (height * (i19 - this.f76f)), 20);
                        GFX_Painter.drawString(this.f66b[31 + HighScore_DefaultDifficulties[i19]], GFX_MenuWidth - 6, f23f + 42 + (height * (i19 - this.f76f)), 24);
                    } else {
                        this.f77N = true;
                    }
                }
                if (this.f76f > 0) {
                    m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[3], GFX_MenuWidth >> 1, 0, 17, true);
                }
                if (this.f77N) {
                    m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[1], GFX_MenuWidth >> 1, f25h - GFX_MenuArray[1].getHeight(), 17, true);
                }
                int i20 = f26i + f25h;
                m196a(this.f66b[5], false);
                m200a(this.f66b[20], GFX_MenuWidth >> 1, i20, 16777215, 0);
                return;
            case 6:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                m196a(this.f66b[21], false);
                m197a(this.f66b[24], 2, 0, this.f72e == 0);
                m197a(this.f66b[25], 2, 1, this.f72e == 1);
                return;
            case 7:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                GFX_Painter.drawString(this.f66b[26], GFX_MenuWidth >> 1, (f23f + (f22e >> 1)) - 25, 17);
                GFX_Painter.drawString(this.f66b[27], GFX_MenuWidth >> 1, f23f + (f22e >> 1) + 2, 17);
                return;
            case 8:
                m191a(true, true);
                GFX_Painter.setColor(16777215);
                int[] iArr = new int[3];
                int width = GFX_MenuArray[1].getWidth();
                GFX_MenuArray[2].getWidth();
                int i21 = f20c - width;
                if (this.Game_Settings[1] > 1) {
                    this.Game_Settings[1] = 1;
                }
                for (int i22 = 0; i22 < this.f42a.length; i22++) {
                    iArr[i22] = GFX_Painter.getFont().stringWidth(this.f66b[this.f42a[i22][this.Game_Settings[i22]]]);
                    GFX_Painter.drawString(this.f66b[28 + i22], 11, f26i + 4 + (i22 * 22), 20);
                    GFX_Painter.drawString(this.f66b[this.f42a[i22][this.Game_Settings[i22]]], i21, f26i + 4 + (i22 * 22), 24);
                }
                GFX_Painter.drawImage(GFX_MenuArray[1], i21 + width, f26i + (this.f72e * 22) + (f18a >> 1), 10);
                GFX_Painter.getFont().stringWidth(this.f66b[this.f42a[this.f72e][this.Game_Settings[this.f72e]]]);
                GFX_Painter.drawImage(GFX_MenuArray[2], i21 - iArr[this.f72e], f26i + (this.f72e * 22) + (f18a >> 1), 10);
                m261F();
                m147az();
                m196a(this.f66b[6], false);
                return;
            case 9:
                m191a(true, true);
                m261F();
                GFX_Painter.setColor(16777215);
                m197a(this.f66b[47], 2, 0, this.f72e == 0);
                m197a(this.f66b[48], 2, 1, this.f72e == 1);
                f17a.stringWidth(this.f66b[47 + this.f72e]);
                m147az();
                return;
            case 10:
                GFX_Painter.setFont(f78b);
                int height2 = GFX_Painter.getFont().getHeight();
                m191a(true, true);
                m261F();
                int[] iArr2 = {5, 0, 3, 2, 1, 4};
                if (this.f72e != 25) {
                    if (this.f72e > 10 && this.f72e < 17) {
                        graphics = GFX_Painter;
                        image = GFX_GameArray[42];
                        i = 0;
                        i2 = iArr2[this.f72e - 11] * 16 * 2;
                        i3 = 32;
                        i4 = 32;
                        i5 = f38a[0];
                        i6 = GFX_MenuWidth;
                        i7 = 4;
                    }
                    i8 = f23f + 42;
                    i9 = (f25h + f26i) - height2;
                    i10 = this.f76f;
                    GFX_Painter.setColor(16777215);
                    while (i8 < i9 && i10 < this.f75a.size()) {
                        GFX_Painter.drawString((String) this.f75a.elementAt(i10), GFX_MenuWidth >> 1, i8, 17);
                        i8 += height2;
                        i10++;
                    }
                    if (i10 >= this.f75a.size()) {
                        this.f77N = true;
                        m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[1], GFX_MenuWidth >> 1, f25h, 33, true);
                    } else {
                        this.f77N = false;
                    }
                    if (this.f76f > 0) {
                        m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[3], GFX_MenuWidth >> 1, 0, 17, true);
                    }
                    m196a(this.f67f[this.f72e * 2], false);
                    m45m(24);
                    return;
                }
                graphics = GFX_Painter;
                image = GFX_GameArray[36];
                i = 0;
                i2 = 16;
                i3 = 16;
                i4 = 64;
                i5 = f38a[0];
                i6 = GFX_MenuWidth;
                i7 = 1;
                m195a(graphics, image, i, i2, i3, i4, i5, i6 - i7, f25h - 2, 40, true);
                i8 = f23f + 42;
                i9 = (f25h + f26i) - height2;
                i10 = this.f76f;
                GFX_Painter.setColor(16777215);
                while (i8 < i9) {
                    GFX_Painter.drawString((String) this.f75a.elementAt(i10), GFX_MenuWidth >> 1, i8, 17);
                    i8 += height2;
                    i10++;
                }
                if (i10 >= this.f75a.size()) {
                }
                if (this.f76f > 0) {
                }
                m196a(this.f67f[this.f72e * 2], false);
                m45m(24);
                return;
            case 11:
                GFX_Painter.setColor(16777215);
                GFX_Painter.fillRect(0, 0, f20c, GFX_MenuHeight);
                GFX_Painter.drawImage(GFX_MenuArray[2], 0, 0, 20);
                if (this.f298bP >= 120) {
                    GFX_Painter.setColor(0);
                    int i23 = ((this.f298bP - 120) * (GFX_MenuWidth >> 1)) / 30;
                    for (int i24 = 0; i24 < (i23 << 1); i24 += 2) {
                        GFX_Painter.drawLine(i24, 0, i24, GFX_MenuHeight);
                        GFX_Painter.drawLine((GFX_MenuWidth - 1) - i24, 0, (GFX_MenuWidth - 1) - i24, GFX_MenuHeight);
                    }
                    return;
                }
                return;
            case 12:
                int i25 = f18a + 2;
                m191a(true, true);
                m261F();
                switch (this.Game_Settings[2]) {
                    case 0:
                    case 1:
                    case 2:
                        strArr = this.f67f;
                        c = '7';
                        str = "Version 1.0.46";
                        strArr[c] = str;
                        int i26 = f26i + 5;
                        int i27 = (f25h + f26i) - i25;
                        i11 = this.f76f;
                        i12 = (this.f72e * 7) + 52;
                        if (i12 + 6 >= this.f67f.length) {
                            this.f72e = (byte) 1;
                        }
                        if (this.f72e >= 0) {
                            GFX_Painter.setColor(16777215);
                            while (i26 < i27 && i11 < 5) {
                                if (this.f67f[1 + i12 + i11] != null) {
                                    GFX_Painter.drawString(this.f67f[1 + i12 + i11], GFX_MenuWidth >> 1, i26, 17);
                                }
                                i26 += i25;
                                i11++;
                            }
                        }
                        if (i11 >= 5) {
                            this.f77N = true;
                            m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[1], GFX_MenuWidth >> 1, f25h, 33, true);
                        } else {
                            this.f77N = false;
                        }
                        if (this.f76f > 0) {
                            m195a(GFX_Painter, GFX_MenuArray[1], 0, 0, GFX_MenuArray[1].getWidth(), GFX_MenuArray[1].getHeight(), f38a[3], GFX_MenuWidth >> 1, 0, 17, true);
                        }
                        m196a(this.f67f[i12], false);
                        m45m(6);
                        return;
                    case 3:
                        strArr = this.f67f;
                        c = '7';
                        str = "Versión 1.0.46";
                        strArr[c] = str;
                        int i262 = f26i + 5;
                        int i272 = (f25h + f26i) - i25;
                        i11 = this.f76f;
                        i12 = (this.f72e * 7) + 52;
                        if (i12 + 6 >= this.f67f.length) {
                        }
                        if (this.f72e >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f76f > 0) {
                        }
                        m196a(this.f67f[i12], false);
                        m45m(6);
                        return;
                    case 4:
                        strArr = this.f67f;
                        c = '7';
                        str = "Versione 1.0.46";
                        strArr[c] = str;
                        int i2622 = f26i + 5;
                        int i2722 = (f25h + f26i) - i25;
                        i11 = this.f76f;
                        i12 = (this.f72e * 7) + 52;
                        if (i12 + 6 >= this.f67f.length) {
                        }
                        if (this.f72e >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f76f > 0) {
                        }
                        m196a(this.f67f[i12], false);
                        m45m(6);
                        return;
                    default:
                        int i26222 = f26i + 5;
                        int i27222 = (f25h + f26i) - i25;
                        i11 = this.f76f;
                        i12 = (this.f72e * 7) + 52;
                        if (i12 + 6 >= this.f67f.length) {
                        }
                        if (this.f72e >= 0) {
                        }
                        if (i11 >= 5) {
                        }
                        if (this.f76f > 0) {
                        }
                        m196a(this.f67f[i12], false);
                        m45m(6);
                        return;
                }
            case 13:
                m191a(true, true);
                GFX_Painter.setColor(16777215);
                int i28 = (f25h - 4) / 22;
                byte b = 0;
                if (i28 < 7 && this.f72e + 2 > i28) {
                    b = (this.f72e - i28) + 1;
                }
                int i29 = f26i + 4 + ((0 - b) * 22);
                GFX_Painter.drawString(this.f66b[81], 11, i29, 20);
                GFX_Painter.drawString(this.f66b[this.Cheats_Active[0] ? '\"' : '#'], GFX_MenuWidth - 10, i29, 24);
                int i30 = i29 + 22;
                GFX_Painter.drawString(this.f66b[83], 11, i30, 20);
                GFX_Painter.drawString(this.f66b[this.Cheats_Active[2] ? '\"' : '#'], GFX_MenuWidth - 10, i30, 24);
                int i31 = i30 + 22;
                GFX_Painter.drawString(this.f66b[84], 11, i31, 20);
                GFX_Painter.drawString(String.valueOf(this.f304ay), GFX_MenuWidth - 10, i31, 24);
                int i32 = i31 + 22;
                GFX_Painter.drawString(this.f66b[82], 11, i32, 20);
                GFX_Painter.drawString(this.f66b[this.Cheats_Active[1] ? '\"' : '#'], GFX_MenuWidth - 10, i32, 24);
                int i33 = i32 + 22;
                GFX_Painter.drawString("COORDS", 11, i33, 20);
                GFX_Painter.drawString(this.f66b[this.Cheats_Active[3] ? '\"' : '#'], GFX_MenuWidth - 10, i33, 24);
                int i34 = i33 + 22;
                GFX_Painter.drawString("CAMERA", 11, i34, 20);
                GFX_Painter.drawString(this.f66b[this.Cheats_Active[4] ? '\"' : '#'], GFX_MenuWidth - 10, i34, 24);
                GFX_Painter.drawString("PLAY ENDING", 11, i34 + 22, 20);
                GFX_Painter.drawImage(GFX_MenuArray[1], GFX_MenuWidth - 8, f26i + ((this.f72e - b) * 22) + 8, 20);
                GFX_Painter.drawImage(GFX_MenuArray[2], (GFX_MenuWidth - f17a.stringWidth(this.f66b[35])) - 12, f26i + ((this.f72e - b) * 22) + 8, 24);
                m261F();
                m196a("CHEATS", false);
                return;
            case 14:
                m191a(true, true);
                m261F();
                m196a(this.f66b[85], false);
                m197a(this.f66b[24], 2, 0, this.f72e == 0);
                m197a(this.f66b[25], 2, 1, this.f72e == 1);
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
        m200a(str, f20c >> 1, i4, 16777215, 0);
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
            int i5 = (this.f71b >> 3) * height2;
            m195a(GFX_Painter, image, 0, i5, width, height2, f38a[0], ((f20c >> 1) - (stringWidth >> 1)) - 15, (i4 - f23f) + (height >> 1), 3, false);
            m195a(GFX_Painter, image, 0, i5, width, height2, f38a[0], (f20c >> 1) + (stringWidth >> 1) + 15, (i4 - f23f) + (height >> 1), 3, false);
        }
    }

    /* renamed from: m */
    private void m45m(int i) {
        Graphics graphics;
        int i2;
        int i3;
        int i4 = f26i + f25h;
        int i5 = i4 + 1;
        int i6 = GFX_MenuWidth - 30;
        int i7 = i6 / i;
        GFX_Painter.setColor(2257915);
        GFX_Painter.fillRect(15, i4, i6, 7);
        GFX_Painter.setColor(410260);
        GFX_Painter.drawRect(14, i4, i6 + 1, 7);
        GFX_Painter.setColor(8506866);
        if (this.f72e > 22) {
            int i8 = this.f72e - 2;
            graphics = GFX_Painter;
            i2 = 15;
            i3 = i8;
        } else {
            graphics = GFX_Painter;
            i2 = 15;
            i3 = this.f72e;
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
        m195a(GFX_Painter, GFX_MenuArray[0], f324l[0][0], f324l[0][1], f324l[0][2], f324l[0][3], f38a[0], GFX_MenuWidth >> 1, (f22e >> 1) - 0, 3, false);
        int i9 = (10 - this.f298bP) * 3;
        switch (this.f70d >> 1) {
            case 0:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f324l[1][0];
                i2 = f324l[1][1];
                i3 = f324l[1][2];
                i4 = f324l[1][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = ((f22e >> 1) + i9) - 0;
                i8 = 33;
                break;
            case 1:
                m195a(GFX_Painter, GFX_MenuArray[0], f324l[2][0], f324l[2][1], f324l[2][2], f324l[2][3], f38a[0], (GFX_MenuWidth >> 1) + 5, (f22e >> 1) - 0, 33, false);
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f324l[3][0];
                i2 = f324l[3][1];
                i3 = f324l[3][2];
                i4 = f324l[3][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f22e >> 1) - 0;
                i8 = 33;
                break;
            case 2:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f324l[4][0];
                i2 = f324l[4][1];
                i3 = f324l[4][2];
                i4 = f324l[4][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f22e >> 1) - 0;
                i8 = 33;
                break;
            case 3:
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f324l[5][0];
                i2 = f324l[5][1];
                i3 = f324l[5][2];
                i4 = f324l[5][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f22e >> 1) - 0;
                i8 = 33;
                break;
            case 4:
                m195a(GFX_Painter, GFX_MenuArray[0], f324l[6][0], f324l[6][1], f324l[6][2], f324l[6][3], f38a[0], (GFX_MenuWidth >> 1) + 5, (f22e >> 1) - 0, 40, false);
                graphics = GFX_Painter;
                image = GFX_MenuArray[0];
                i = f324l[7][0];
                i2 = f324l[7][1];
                i3 = f324l[7][2];
                iArr = f324l;
                c = 7;
                i4 = iArr[c][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f22e >> 1) - 0;
                i8 = 36;
                break;
            default:
                m195a(GFX_Painter, GFX_MenuArray[0], f324l[8][0], f324l[8][1], f324l[8][2], f324l[8][3], f38a[0], (GFX_MenuWidth >> 1) + 5, (f22e >> 1) - 0, 40, false);
                m195a(GFX_Painter, GFX_MenuArray[0], f324l[9][0], f324l[9][1], f324l[9][2], f324l[9][3], f38a[0], ((GFX_MenuWidth >> 1) + 5) - 30, ((f22e >> 1) - 0) - 22, 36, false);
                if (((this.f298bP >> 1) & 1) == 0) {
                    graphics = GFX_Painter;
                    image = GFX_MenuArray[0];
                    i = f324l[10][0];
                    i2 = f324l[10][1];
                    i3 = f324l[10][2];
                    iArr = f324l;
                    c = '\n';
                } else {
                    graphics = GFX_Painter;
                    image = GFX_MenuArray[0];
                    i = f324l[11][0];
                    i2 = f324l[11][1];
                    i3 = f324l[11][2];
                    iArr = f324l;
                    c = 11;
                }
                i4 = iArr[c][3];
                i5 = f38a[0];
                i6 = (GFX_MenuWidth >> 1) + 5;
                i7 = (f22e >> 1) - 0;
                i8 = 36;
                break;
        }
        m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
        m195a(GFX_Painter, GFX_MenuArray[0], f324l[12][0], f324l[12][1], f324l[12][2], f324l[12][3], f38a[0], GFX_MenuWidth >> 1, ((f22e >> 1) - 1) - 0, 17, false);
    }

    /* renamed from: b */
    public static void m137b(int i, int i2, int i3, int i4) {
        if ((GFX_MenuHeight & 1) == 1 && i2 != 0) {
            i4++;
        }
        GFX_Painter.setClip(i, i2, i3, i4);
        int color = GFX_Painter.getColor();
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 + i2;
            GFX_Painter.setColor(i6 == 0 ? 8506866 : i6 % 3 == 0 ? 1858252 : 2257915);
            GFX_Painter.drawLine(i, i6, i + i3, i6);
        }
        if (i == 0) {
            GFX_Painter.setColor(2257915);
            GFX_Painter.drawRect(i, i2, 1, i4);
        }
        GFX_Painter.setColor(color);
        GFX_Painter.setClip(0, 0, f20c, GFX_MenuHeight);
    }

    /* renamed from: E */
    public static void m263E() {
        if (GFX_HUDArray[8] != null) {
            GFX_Painter.drawImage(GFX_HUDArray[8], GFX_MenuWidth - 2, (f23f + f22e) - 5, 40);
        }
    }

    /* renamed from: a */
    public static void m199a(String str, int i, int i2, int i3, int i4, int i5) {
        GFX_Painter.setColor(i4);
        GFX_Painter.drawString(str, i - 1, i2, i5);
        GFX_Painter.drawString(str, i + 1, i2, i5);
        GFX_Painter.drawString(str, i, i2 + 1, i5);
        GFX_Painter.drawString(str, i, i2 - 1, i5);
        GFX_Painter.setColor(i3);
        GFX_Painter.drawString(str, i, i2, i5);
    }

    /* renamed from: a */
    public final void m200a(String str, int i, int i2, int i3, int i4) {
        m199a(str, i, i2, i3, i4, 17);
    }

    /* renamed from: F */
    public final void m261F() {
        m137b(0, 0, GFX_MenuWidth, f26i);
        m137b(0, f26i + f25h, GFX_MenuWidth, f26i);
    }

    /* renamed from: n */
    private void m41n(int i) {
        this.f68a = this.f66b[i];
        this.f65bb = 0;
    }

    /* renamed from: ay */
    private void m148ay() {
        this.f65bb = (this.f65bb + 1) % (f17a.stringWidth(this.f68a) + 218);
    }

    /* renamed from: a */
    public final void m196a(String str, boolean z) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (f26i >> 1) - (f18a >> 1);
        int i7 = i6;
        if (i6 < 2) {
            i7 = 2;
        }
        if (z) {
            str2 = str;
            i = GFX_MenuWidth - this.f65bb;
            i2 = i7;
            i3 = 16777215;
            i4 = 0;
            i5 = 20;
        } else {
            str2 = str;
            i = GFX_MenuWidth >> 1;
            i2 = i7;
            i3 = 16777215;
            i4 = 0;
            i5 = 17;
        }
        m199a(str2, i, i2, i3, i4, i5);
    }

    /* renamed from: az */
    private void m147az() {
        m199a(this.f68a, GFX_MenuWidth - this.f65bb, f26i + f25h + 2, 16777215, 0, 20);
    }

    /* renamed from: a */
    private void m191a(boolean z, boolean z2) {
        Background_Renderer.m388a(GFX_Painter, this.f35j * 5, 120, z);
        if (z2) {
            GFX_Painter.setColor(0);
            for (int i = 0; i < f25h; i += 2) {
                GFX_Painter.drawLine(0, f26i + i, GFX_MenuWidth, f26i + i);
            }
        }
        this.f35j++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[LOOP:0: B:14:0x00ae->B:16:0x00b4, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m101d(boolean z) {
        Audio_Player audio_Player;
        int i;
        int i2;
        GFX_UnloadArray(GFX_GameArray);
        m37o(3);
        if (!z) {
            GFX_UnloadArray(GFX_MenuArray);
            Background_Renderer.BG_Initialize(0, 0);
            GFX_MenuArray[0] = GFX_Load("/t_title.png");
            GFX_MenuArray[1] = GFX_Load("/t_cur1.png");
            GFX_MenuArray[2] = GFX_Load("/t_cur2.png");
            GFX_MenuArray[4] = GFX_Load("/ring.png");
            if (this.f74M) {
                this.f74M = false;
                this.Menu_ID = (byte) 2;
                return;
            }
            GFX_LoadHUD();
            this.Menu_ID = (byte) 3;
            m37o(0);
            if (this.f223ai != 3) {
                audio_Player = this.Music_MainPlayer;
                i = 9;
            }
            this.f298bP = 0;
            for (i2 = 0; i2 < 10; i2++) {
                this.f15g[i2] = false;
            }
            this.f71b = (byte) 0;
            m79g();
        }
        GFX_MenuArray[0] = GFX_Load("/t_license1.png");
        GFX_MenuArray[1] = GFX_Load("/t_license2.png");
        GFX_MenuArray[2] = GFX_Load("/ifone.png");
        this.Menu_ID = (byte) 0;
        audio_Player = this.Music_MainPlayer;
        i = 20;
        audio_Player.Music_Play(i, 1, false);
        this.f298bP = 0;
        while (i2 < 10) {
        }
        this.f71b = (byte) 0;
        m79g();
    }

    /* renamed from: aA */
    private void Text_LoadLang() {
        int i = 0;
        try {
            InputStream m206a = m206a(new StringBuffer().append("/lang_").append((int) this.Game_Settings[2]).append(".txt").toString());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(300);
            byte[] bArr = new byte[1];
            while (m206a.read(bArr) > 0) {
                if (bArr[0] == 13) {
                    m206a.read(bArr);
                    this.f66b[i] = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    byteArrayOutputStream.reset();
                    i++;
                } else {
                    byteArrayOutputStream.write(bArr);
                }
            }
            m32q();
            byteArrayOutputStream.close();
            InputStream m206a2 = m206a(new StringBuffer().append("/manual_").append((int) this.Game_Settings[2]).append(".txt").toString());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(300);
            i = 0;
            while (m206a2.read(bArr) > 0) {
                if (bArr[0] == 13) {
                    m206a2.read(bArr);
                    this.f67f[i] = new String(byteArrayOutputStream2.toByteArray(), "UTF-8");
                    byteArrayOutputStream2.reset();
                    i++;
                } else {
                    byteArrayOutputStream2.write(bArr);
                }
            }
            m32q();
            byteArrayOutputStream2.close();
        } catch (Exception unused) {
            System.err.println(new StringBuffer().append((int) this.Game_Settings[2]).append(": error on line: ").append(i + 1).toString());
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
                    strArr6 = this.f34a;
                    c6 = 0;
                    strArr7 = this.f66b;
                    c7 = 29;
                } else {
                    strArr6 = this.f34a;
                    c6 = 0;
                    strArr7 = this.f66b;
                    c7 = '.';
                }
                strArr6[c6] = strArr7[c7];
                strArr2 = this.f34a;
                c2 = 1;
                strArr5 = this.f66b;
                c5 = '-';
                str2 = strArr5[c5];
                break;
            case 1:
                strArr = this.f34a;
                c = 0;
                str = "";
                strArr[c] = str;
                game = this;
                strArr2 = game.f34a;
                c2 = 1;
                strArr5 = this.f66b;
                c5 = ',';
                str2 = strArr5[c5];
                break;
            case 2:
                if (this.Game_Settings[1] == 0) {
                    strArr3 = this.f34a;
                    c3 = 0;
                    strArr4 = this.f66b;
                    c4 = 29;
                } else {
                    strArr3 = this.f34a;
                    c3 = 0;
                    strArr4 = this.f66b;
                    c4 = '.';
                }
                strArr3[c3] = strArr4[c4];
                game = this;
                strArr2 = game.f34a;
                c2 = 1;
                strArr5 = this.f66b;
                c5 = ',';
                str2 = strArr5[c5];
                break;
            case 3:
                this.f34a[0] = "";
                strArr2 = this.f34a;
                c2 = 1;
                str2 = "";
                break;
            case 4:
                strArr = this.f34a;
                c = 0;
                str = this.f66b[90];
                strArr[c] = str;
                game = this;
                strArr2 = game.f34a;
                c2 = 1;
                strArr5 = this.f66b;
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
        this.f212bq = 0;
        this.f213br = -1;
        this.f214bs = 0;
        this.f215bt = 0;
        for (int i = 0; i < 2; i++) {
            int i2 = f228y[i];
            Camera_Pos[i] = i2;
            this.f230G[i] = i2;
            this.f231H[i] = 0;
            this.f232I[i] = 0;
        }
    }

    /* renamed from: a */
    public final void m223a(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 21) && this.f215bt <= 1 && this.f214bs <= 1 && Math.abs(m235a() - i) < 300 && Math.abs((m146b() + 40) - i2) < 120) {
            this.f214bs = 20;
            this.f213br = 10;
            this.f215bt = 1;
        }
    }

    /* renamed from: c */
    public final void m120c(int i, int i2) {
        if (this.f215bt > 2) {
            return;
        }
        if (this.f215bt != 2 || this.f214bs <= 1) {
            if (Math.abs(m235a() - i) >= (this.Object_Info[4] == 35 ? 48 : 136) || m146b() + 40 <= i2 || m146b() - 320 >= i2) {
                return;
            }
            this.f214bs = 20;
            this.f213br = 8;
            this.f215bt = 2;
        }
    }

    /* renamed from: b */
    public final void m138b(int i, int i2, int i3) {
        if ((i3 == 2 || i3 == 10) && this.f215bt <= 3) {
            if ((this.f215bt != 3 || this.f214bs <= 1) && this.f214bs < 2 && Math.abs(m235a() - i) < 128 && Math.abs(m146b() - i2) < 96) {
                this.f214bs = 20;
                this.f213br = 7;
                this.f215bt = 3;
            }
        }
    }

    /* renamed from: c */
    public final void m118c(int i, int i2, int i3) {
        if (i3 == 2 && this.f215bt <= 4) {
            if ((this.f215bt != 4 || this.f214bs <= 1) && Math.abs(m235a() - i) < 96 && Math.abs(m146b() - i2) < 96) {
                this.f214bs = 20;
                this.f213br = 5;
                this.f215bt = 4;
            }
        }
    }

    /* renamed from: d */
    public final void m103d(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f215bt <= 4) {
            if ((this.f215bt != 4 || this.f214bs <= 1) && Math.abs(m235a() - i) < 96 && Math.abs(m146b() - i2) < 96) {
                this.f214bs = 20;
                this.f213br = 5;
                this.f215bt = 4;
            }
        }
    }

    /* renamed from: e */
    public final void m92e(int i, int i2, int i3) {
        if (i3 == 2 && this.f215bt <= 5) {
            if ((this.f215bt != 5 || this.f214bs <= 1) && Math.abs(m235a() - i) < 96 && Math.abs(m146b() - i2) < 96) {
                this.f214bs = 20;
                this.f213br = 2;
                this.f215bt = 5;
            }
        }
    }

    /* renamed from: f */
    public final void m82f(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f215bt <= 5) {
            if ((this.f215bt != 5 || this.f214bs <= 1) && Math.abs(m235a() - i) < 96 && Math.abs(m146b() - i2) < 96) {
                this.f214bs = 20;
                this.f213br = 2;
                this.f215bt = 5;
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
        int m235a = m235a();
        int m146b = m146b();
        if (this.f214bs > 0) {
            this.f214bs--;
            if (this.f214bs == 0) {
                this.f213br = -1;
                this.f215bt = 0;
            }
        }
        if (this.f213br >= 0) {
            game = this;
            i = this.f213br;
        } else {
            this.f215bt = 0;
            if (!this.f243t && !this.f244u) {
                switch (this.Game_ZoneID) {
                    case 0:
                        game = this;
                        i = 1;
                        break;
                    case 2:
                        this.f212bq = 1;
                    case 4:
                        this.f212bq = 1;
                        if (this.Game_ActID == 1 && Math.abs(m235a - 8464) < 240 && Math.abs(m146b - 640) < 80) {
                            game = this;
                            i = 2;
                            break;
                        }
                        break;
                }
                switch (this.f212bq) {
                    case 1:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 0;
                        break;
                    case 2:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 32;
                        break;
                    case 3:
                        iArr = this.f232I;
                        c = 0;
                        i2 = 0;
                        iArr[c] = i2;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 40;
                        break;
                    case 4:
                        if (Player_Info[5] <= 0) {
                            this.f232I[0] = 0;
                            iArr2 = this.f232I;
                            c2 = 1;
                            i3 = 0;
                            break;
                        } else {
                            this.f232I[0] = 0;
                            iArr2 = this.f232I;
                            c2 = 1;
                            i3 = 48;
                            break;
                        }
                    case 5:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = -16;
                        break;
                    case 6:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 0;
                        break;
                    case 7:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 16;
                        break;
                    case 8:
                        this.f232I[0] = 0;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = -32;
                        break;
                    case 9:
                        this.f232I[0] = 36;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 16;
                        break;
                    case 10:
                        iArr = this.f232I;
                        c = 0;
                        i2 = 32;
                        iArr[c] = i2;
                        iArr2 = this.f232I;
                        c2 = 1;
                        i3 = 40;
                        break;
                    default:
                        Camera_Pos[0] = f228y[0];
                        iArr2 = Camera_Pos;
                        c2 = 1;
                        i3 = f228y[1];
                        break;
                }
                iArr2[c2] = i3;
                int abs = Math.abs(f228y[0] - this.f230G[0]);
                int abs2 = Math.abs(f228y[1] - this.f230G[1]);
                if (this.f212bq != 6) {
                    if (abs < 4 || abs > 256) {
                        iArr5 = this.f230G;
                        c5 = 0;
                        i7 = f228y[0];
                    } else {
                        iArr5 = this.f230G;
                        c5 = 0;
                        i7 = iArr5[0] + (f228y[0] > this.f230G[0] ? 4 : -4);
                    }
                    iArr5[c5] = i7;
                    if (abs2 < 4 || abs2 > 256) {
                        iArr4 = this.f230G;
                        c4 = 1;
                        i5 = f228y[1];
                    } else {
                        iArr4 = this.f230G;
                        c4 = 1;
                        i5 = iArr4[1] + (f228y[1] > this.f230G[1] ? 4 : -4);
                    }
                } else {
                    if (abs < 32 || abs > 256) {
                        iArr3 = this.f230G;
                        c3 = 0;
                        i4 = f228y[0];
                    } else {
                        iArr3 = this.f230G;
                        c3 = 0;
                        i4 = iArr3[0] + (f228y[0] > this.f230G[0] ? 32 : -32);
                    }
                    iArr3[c3] = i4;
                    if (abs2 < 16 || abs2 > 256) {
                        iArr4 = this.f230G;
                        c4 = 1;
                        i5 = f228y[1];
                    } else if (abs2 > 32) {
                        this.f230G[1] = f228y[1] > this.f230G[1] ? this.f230G[1] + 32 : this.f230G[1] - 32;
                        if (this.f231H[0] != this.f232I[0]) {
                            int[] iArr6 = this.f231H;
                            iArr6[0] = iArr6[0] + (this.f231H[0] < this.f232I[0] ? 1 : -1);
                        }
                        Camera_Pos[0] = this.f230G[0] + this.f231H[0];
                        if (this.f231H[1] != this.f232I[1]) {
                            int[] iArr7 = this.f231H;
                            iArr7[1] = iArr7[1] + (this.f231H[1] < this.f232I[1] ? 1 : -1);
                        }
                        Camera_Pos[1] = this.f230G[1] + this.f231H[1];
                        int i8 = 0;
                        if (this.f88bh > 0) {
                            i8 = 0 + (this.f88bh << 1);
                        }
                        if (this.f87bg > 0) {
                            i8 -= this.f87bg << 1;
                        }
                        i6 = this.f278K[3] - i8;
                        if (Camera_Pos[1] > i6) {
                            Camera_Pos[1] = i6;
                        }
                        if (Camera_Pos[0] < 0) {
                            Camera_Pos[0] = 0;
                            return;
                        }
                        return;
                    } else {
                        iArr4 = this.f230G;
                        c4 = 1;
                        i5 = iArr4[1] + (f228y[1] > this.f230G[1] ? 16 : -16);
                    }
                }
                iArr4[c4] = i5;
                if (this.f231H[0] != this.f232I[0]) {
                }
                Camera_Pos[0] = this.f230G[0] + this.f231H[0];
                if (this.f231H[1] != this.f232I[1]) {
                }
                Camera_Pos[1] = this.f230G[1] + this.f231H[1];
                int i82 = 0;
                if (this.f88bh > 0) {
                }
                if (this.f87bg > 0) {
                }
                i6 = this.f278K[3] - i82;
                if (Camera_Pos[1] > i6) {
                }
                if (Camera_Pos[0] < 0) {
                }
            } else if (this.Game_ZoneID != 5 || f228y[0] >= 1024) {
                game = this;
                i = 6;
            } else {
                game = this;
                i = 1;
            }
        }
        game.f212bq = i;
        switch (this.f212bq) {
        }
        iArr2[c2] = i3;
        int abs3 = Math.abs(f228y[0] - this.f230G[0]);
        int abs22 = Math.abs(f228y[1] - this.f230G[1]);
        if (this.f212bq != 6) {
        }
        iArr4[c4] = i5;
        if (this.f231H[0] != this.f232I[0]) {
        }
        Camera_Pos[0] = this.f230G[0] + this.f231H[0];
        if (this.f231H[1] != this.f232I[1]) {
        }
        Camera_Pos[1] = this.f230G[1] + this.f231H[1];
        int i822 = 0;
        if (this.f88bh > 0) {
        }
        if (this.f87bg > 0) {
        }
        i6 = this.f278K[3] - i822;
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
        if (this.f265T && this.f266bC > 0) {
            this.f266bC--;
            return;
        }
        if (this.f269U) {
            if (this.f267bD < 0) {
                this.f270C = false;
                this.f269U = false;
                this.f265T = false;
                this.f115B = 0;
                this.f116C = 0;
                this.f117D = 0;
                this.f118E = 0;
                this.f284Y = false;
                this.f227am++;
                this.f227am %= 3;
                if (this.f227am == 0) {
                    m192a(true);
                }
                this.f245g = (byte) (this.f227am + (this.f226al * 3));
                this.f247i = (byte) this.Player_Lives;
                this.f248bx = this.Player_Score;
                if (this.f249j < this.f245g) {
                    this.f249j = this.f245g;
                }
                m170ac();
                this.Game_ZoneID = f219f[this.f226al][this.f227am];
                this.Game_ActID = f220g[this.f226al][this.f227am];
                m181aC();
                if (this.Game_ZoneID == 0 && this.Game_ActID == 0) {
                    this.f223ai = 8;
                    this.f47aL = 0;
                    m79g();
                } else {
                    this.f205r = true;
                    m163aj();
                    if (this.f334K) {
                        this.f223ai = 7;
                        this.f44aJ = 0;
                    } else {
                        m35p();
                    }
                }
            } else {
                this.f267bD--;
                if (this.f267bD == 10) {
                    this.Music_MainPlayer.Music_Play(19, 1, false);
                }
                if (this.f268bE - this.f267bD > 0) {
                    for (int i3 = 0; i3 < 20; i3++) {
                        if (this.f272bG > 0) {
                            this.f272bG -= 10;
                            Score_Add(10, false);
                        }
                        if (this.f271bF > 0) {
                            this.f271bF -= 10;
                            Score_Add(10, false);
                        }
                    }
                }
            }
        }
        if (this.f265T) {
            this.f270C = true;
            Player_Info[12] = 0;
            int[] iArr = Player_Info;
            iArr[10] = iArr[10] + 128;
        } else {
            this.f41a = true;
        }
        for (int i4 = 0; i4 < this.f81h.length; i4++) {
            if (this.f81h[i4][0] == 1 && this.f83bd >= this.f81h[i4][9]) {
                int i5 = 0;
                while (true) {
                    if (i5 >= 6) {
                        break;
                    }
                    if (this.f82m + this.f81h[i4][8] > this.f81h[i4][2]) {
                        int[] iArr2 = this.f81h[i4];
                        iArr2[2] = iArr2[2] + 1;
                    } else if (this.f82m + this.f81h[i4][8] < this.f81h[i4][2]) {
                        int[] iArr3 = this.f81h[i4];
                        iArr3[2] = iArr3[2] - 1;
                    } else {
                        this.f83bd++;
                        this.f81h[i4][0] = 2;
                        if (this.f83bd >= 5) {
                            if (this.f265T) {
                                m61j();
                                this.f269U = true;
                                this.Player_InvincTime = -1;
                                this.f271bF = this.Player_Rings * 100;
                                this.f272bG = 0;
                                if (this.f111x < 30 && this.f112y == 0 && !this.f284Y) {
                                    game = this;
                                    i = 50000;
                                } else if (this.f111x < 45 && this.f112y == 0) {
                                    game = this;
                                    i = 10000;
                                } else if (this.f112y < 1) {
                                    game = this;
                                    i = 5000;
                                } else if (this.f111x < 30 && this.f112y == 1) {
                                    game = this;
                                    i = 4000;
                                } else if (this.f112y < 2) {
                                    game = this;
                                    i = 3000;
                                } else if (this.f111x >= 30 || this.f112y != 2) {
                                    game = this;
                                    i = 1000;
                                } else {
                                    game = this;
                                    i = 2000;
                                }
                                game.f272bG = i;
                                if (this.f272bG > this.f271bF) {
                                    game2 = this;
                                    i2 = this.f272bG;
                                } else {
                                    game2 = this;
                                    i2 = this.f271bF;
                                }
                                game2.f268bE = i2 / 120;
                                this.f267bD = 330;
                            } else {
                                m61j();
                                if (this.f205r) {
                                    m164ai();
                                    this.f205r = false;
                                    this.f115B = 0;
                                    this.f116C = 0;
                                    this.f117D = 0;
                                    this.f118E = 0;
                                    this.f284Y = false;
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
            if (this.f223ai == 2 && !this.f265T) {
                this.f83bd++;
                this.f41a = false;
                if (this.f83bd < 20) {
                    m79g();
                } else if (this.f83bd < 30) {
                    int[] iArr4 = this.f81h[0];
                    iArr4[2] = iArr4[2] + (GFX_MenuWidth / 20);
                    int[] iArr5 = this.f81h[1];
                    iArr5[2] = iArr5[2] + (GFX_MenuWidth / 20);
                    int[] iArr6 = this.f81h[2];
                    iArr6[2] = iArr6[2] + (GFX_MenuWidth / 20);
                    int[] iArr7 = this.f81h[3];
                    iArr7[2] = iArr7[2] - (GFX_MenuWidth / 20);
                    int[] iArr8 = this.f81h[4];
                    iArr8[2] = iArr8[2] - (GFX_MenuWidth / 20);
                    m79g();
                } else if (this.f83bd == 30) {
                    this.f81h[0][0] = 0;
                    this.f81h[1][0] = 0;
                    this.f81h[2][0] = 0;
                    this.f81h[3][0] = 0;
                    this.f81h[4][0] = 0;
                }
            }
        }
    }

    /* renamed from: J */
    public final void m253J() {
        int i = 0;
        for (int i2 = 0; i2 < this.f81h.length; i2++) {
            if (this.f81h[i2][0] >= 1) {
                if (GFX_HUDArray[10] != null) {
                    m195a(GFX_Painter, GFX_HUDArray[10], this.f81h[i2][4], this.f81h[i2][5], this.f81h[i2][6], this.f81h[i2][7], f38a[0], this.f81h[i2][2], this.f81h[i2][3], 20, true);
                }
                if (i < this.f81h[i2][3]) {
                    i = this.f81h[i2][3];
                }
            }
        }
        if (this.f269U) {
            int[] iArr = {this.Player_Score, this.f272bG, this.f271bF};
            int i3 = ((f20c * 30) / 100) - 24;
            int i4 = ((f20c * 90) / 100) - 24;
            int i5 = i + 10;
            for (int i6 = 0; i6 < 3; i6++) {
                m195a(GFX_Painter, GFX_HUDArray[13], 0, i6 * 16, 84, 16, f38a[0], i3, i5 + (16 * i6), 20, true);
                m63i(i4, ((i5 + (16 * i6)) - 36) + 40, iArr[i6]);
            }
            if (this.f272bG == 0 && this.f271bF == 0) {
                m200a(this.f66b[0], GFX_MenuWidth >> 1, ((f26i + f25h) - f18a) - 2, 16777215, 0);
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
        if (this.f86bf < 600) {
            return 17;
        }
        if (this.Player_InvincTime > 0) {
            return 6;
        }
        if (this.f243t) {
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
        if (!this.f243t || this.Game_ZoneID >= 5) {
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
                this.f325J = false;
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
        this.f325J = false;
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
                this.f325J = true;
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
        this.f325J = true;
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
                return f38a[1];
            case 2:
                return f38a[2];
            case 3:
                return f38a[3];
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
        m187a(iArr, (this.f197j[iArr[1]][1] >> 1) - 2);
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
        return m219a(iArr[2], iArr[3], this.f197j[iArr[1]][0] >> 1, this.f197j[iArr[1]][1] >> 1, iArr[19] & 1);
    }

    /* renamed from: a */
    public static boolean m185a(int[] iArr, int i, int i2) {
        int m235a = m235a();
        int m146b = m146b() - (f127i ? 16 : 20);
        if (iArr[3] - i2 > m146b || m146b > iArr[3] + i2) {
            return false;
        }
        switch (iArr[19]) {
            case 0:
                return iArr[2] - i < m235a && m235a < iArr[2];
            case 1:
                return iArr[2] < m235a && m235a < iArr[2] + i;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static boolean m119c(int i, int i2) {
        return Math.abs(i - m235a()) > 240 || Math.abs(i2 - m146b()) > 240;
    }

    /* renamed from: a */
    public static boolean m222a(int i, int i2, int i3) {
        int m235a = i - m235a();
        int m146b = i2 - (m146b() - (f127i ? 16 : 20));
        return (m235a * m235a) + (m146b * m146b) < i3 * i3;
    }

    /* renamed from: a */
    public final int m212a(int i, int i2, int i3, int i4, boolean z) {
        if (f125g && f121d) {
            return 0;
        }
        int i5 = (f127i || f129k) ? 12 : 16;
        int m235a = m235a();
        int m146b = m146b() - i5;
        int i6 = (i3 >> 1) + 12;
        int i7 = (i4 >> 1) + i5;
        if (f127i) {
            if (m235a - i6 >= i || i >= m235a + i6 || m146b - i7 >= i2 || i2 >= m146b + i7) {
                return 0;
            }
            if (this.Player_InvincTime <= 0) {
                return ((this.f302G && this.Cheats_Active[0]) || z) ? 1 : 2;
            }
            return 1;
        } else if (m235a - i6 >= i || i >= m235a + i6 || m146b - i7 >= i2 || i2 >= m146b + i7) {
            return 0;
        } else {
            if (this.Player_InvincTime <= 0) {
                return (this.f302G && this.Cheats_Active[0]) ? 1 : 2;
            }
            return 1;
        }
    }

    /* renamed from: d */
    public final boolean m99d(int[] iArr) {
        Game game;
        int i;
        int m212a = m212a(iArr[2], iArr[3], this.f197j[iArr[1]][0], this.f197j[iArr[1]][1], true);
        if (iArr[1] == 71 && m212a == 1 && iArr[3] - 4 > m146b() - 16) {
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
        if (this.f300aw == 0) {
            game = this;
            i = 100;
        } else if (this.f300aw == 100) {
            game = this;
            i = 200;
        } else if (this.f300aw != 200) {
            if (this.f300aw == 500) {
                game = this;
                i = 1000;
            }
            Score_Add(this.f300aw, true);
            m69h(iArr[2], iArr[3], this.f300aw);
            m216a(2, iArr[2], iArr[3], 0, 0, 0, 0);
            m216a(f209b[this.Game_ZoneID][m123c(2)], iArr[2], iArr[3], 0, -300, 0, 0);
            iArr[0] = 0;
            return true;
        } else {
            game = this;
            i = 500;
        }
        game.f300aw = i;
        Score_Add(this.f300aw, true);
        m69h(iArr[2], iArr[3], this.f300aw);
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
        this.f142i = new int[50][20];
    }

    /* renamed from: a */
    public final void m216a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i < 1) {
            return;
        }
        for (int i8 = 0; i8 < 50; i8++) {
            int[] iArr = this.f142i[i8];
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
            int[] iArr = this.f142i[i7];
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
                iArr[11] = (m143b(i4) * i5) / 100;
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
            int[] iArr2 = this.f142i[i2];
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
            int[] iArr = this.f142i[i];
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
        iArr[15] = this.f35j >> 1;
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
                i5 = (i5 & (-16)) + (16 - Math.abs((int) this.f190c[((this.Level_Collisions[this.f274aq] & 255) << 4) + (i4 & 15)]));
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
        iArr[15] = 2 + (this.f35j & 1);
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
        iArr[15] = 2 + (this.f35j & 1);
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
        iArr[15] = 4 + (this.f35j & 1);
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
        iArr[15] = 8 + (this.f35j & 1);
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
        iArr[15] = 12 + (this.f35j & 1);
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
        iArr[15] = this.f35j & 1;
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
        m136b(iArr[2] / 100, iArr[3] / 100, 97, i, f38a[0]);
    }

    /* renamed from: z */
    private void m8z(int[] iArr) {
        m133b(0, 0, new int[]{0, 16, 32, 16}[this.f35j & 3], 16, 16, new int[]{f38a[0], f38a[0], f38a[0], f38a[4]}[this.f35j & 3], iArr[2] / 100, iArr[3] / 100);
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
        m136b(iArr[2] / 100, iArr[3] / 100, 96, iArr[15], f38a[0]);
    }

    /* renamed from: D */
    private static void m264D(int[] iArr) {
        int[] iArr2;
        char c;
        int i = iArr[2] / 100;
        int i2 = iArr[3] / 100;
        int i3 = iArr[8] == 0 ? 0 : 2;
        if (iArr[19] == 0) {
            iArr2 = f38a;
            c = 0;
        } else {
            iArr2 = f38a;
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
        if ((this.f35j & 1) == 0) {
            m136b(iArr[2] / 100, iArr[3] / 100, 41, i, f38a[0]);
        }
    }

    /* renamed from: F */
    private void m260F(int[] iArr) {
        int i = iArr[15] % 5;
        int i2 = i;
        if (i == 0) {
            i2 += this.f35j & 3;
        }
        m133b(101, 0, i2 * 32, 24, 32, m65i(iArr[18]), iArr[2] / 100, iArr[3] / 100);
    }

    /* renamed from: G */
    private static void m258G(int[] iArr) {
        int i = iArr[15] & 3;
        m133b(iArr[1] == 23 ? 102 : iArr[1] == 24 ? 18 : 27, f195d[i][0], f195d[i][1], 16, 16, 0, iArr[2] / 100, iArr[3] / 100);
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
                        iArr[10] = f196e[i][0];
                        iArr[11] = f196e[i][1];
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
                                    iArr[11] = f196e[i][1];
                                    break;
                                }
                            }
                            iArr[11] = f196e[i][1];
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
                iArr2 = f38a;
                c = 4;
                i = iArr2[c];
                break;
            case 2:
                iArr2 = f38a;
                c = 6;
                i = iArr2[c];
                break;
            case 3:
                iArr2 = f38a;
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
        this.f169K = this.Game_ZoneID;
        this.f170L = 0;
        this.f171M = 0;
        this.f172N = 0;
        this.f173O = 0;
        this.f174P = 0;
        this.f175Q = 0;
        this.f176R = 0;
        this.f178T = 0;
        this.f177S = 0;
        this.f180V = 0;
        this.f179U = 0;
        this.f183Y = 0;
        this.f184Z = 0;
        this.f185aa = 0;
        this.f186ab = 0;
        this.f187ac = 0;
        this.f188ad = 0;
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
        game.f189ae = i;
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
                    this.f177S = (6640 - this.Boss_XPos) * 100;
                    game = this;
                    i = (544 - this.Boss_YPos) * 100;
                    game.f178T = i;
                    break;
                case 4:
                    m233a();
                    GFX_GameArray[120] = GFX_Load("/boss.png");
                    iArr[1] = 140;
                    this.f177S = 0;
                    game = this;
                    i = 0;
                    game.f178T = i;
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
            iArr[20] = this.f200c.length - 1;
            this.f200c[iArr[20]] = true;
            this.f201d[iArr[20]] = false;
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
        this.f243t = true;
        Boss_Load();
    }

    /* renamed from: O */
    public final void m247O() {
        this.f244u = true;
        this.f243t = false;
        this.f242bw = 1;
        if (this.Game_ZoneID != 5) {
            m90e(false);
        }
    }

    /* renamed from: e */
    public final boolean m88e(int[] iArr) {
        iArr[2] = ((this.f177S + this.f179U) / 100) + this.Boss_XPos;
        iArr[3] = ((this.f178T + this.f180V) / 100) + this.Boss_YPos;
        if (this.f185aa > 0) {
            this.f185aa--;
        }
        if (this.f188ad > 0) {
            int i = this.f188ad - 1;
            this.f188ad = i;
            if (i == 0) {
                this.f187ac = 0;
            }
        }
        if (this.f186ab > 0) {
            this.f186ab--;
            return true;
        }
        if (this.f183Y > 0) {
            this.f183Y--;
        }
        this.f184Z++;
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
        int i = this.Boss_YPos + ((this.f178T + this.f180V) / 100);
        switch (this.f170L) {
            case 100:
                this.f171M = 3;
                this.f183Y = 120;
                this.f170L++;
                if (this.f175Q > 0) {
                    this.f175Q--;
                }
                if (this.f183Y <= 0) {
                    return false;
                }
                this.f171M = 4;
                this.f183Y = 80;
                this.f170L++;
                this.f171M = 4;
                this.f178T += 200;
                if (i >= f144d[this.Game_ZoneID]) {
                    return false;
                }
                this.f183Y = 40;
                this.f170L++;
                if (this.f183Y <= 0) {
                    return false;
                }
                m247O();
                this.f183Y = 24;
                this.f170L++;
                this.f178T -= 80;
                if (this.f183Y <= 0) {
                    return false;
                }
                this.f183Y = 40;
                this.f170L++;
                if (this.f183Y <= 0) {
                    return false;
                }
                this.f170L++;
                this.f171M = 5;
                this.f172N = 1;
                this.f177S += 100;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                    return false;
                }
                this.f183Y = 120;
                this.f170L++;
                this.f171M = 6;
                this.f172N = 1;
                this.f177S += 500;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                    return false;
                }
                this.f170L++;
                this.f171M = -1;
                return true;
            case 101:
                if (this.f175Q > 0) {
                }
                if (this.f183Y <= 0) {
                }
                break;
            case 102:
                this.f171M = 4;
                this.f178T += 200;
                if (i >= f144d[this.Game_ZoneID]) {
                }
                break;
            case 103:
                if (this.f183Y <= 0) {
                }
                break;
            case 104:
                this.f178T -= 80;
                if (this.f183Y <= 0) {
                }
                break;
            case 105:
                if (this.f183Y <= 0) {
                }
                break;
            case 106:
                this.f171M = 5;
                this.f172N = 1;
                this.f177S += 100;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                }
                break;
            case 107:
                this.f171M = 6;
                this.f172N = 1;
                this.f177S += 500;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                }
                break;
            case 108:
                this.f171M = -1;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public final void m112c(int[] iArr) {
        iArr[2] = this.Boss_XPos + ((this.f177S + this.f179U) / 100);
        iArr[3] = this.Boss_YPos + ((this.f178T + this.f180V) / 100);
    }

    /* renamed from: c */
    public final void m117c(int i, int i2, int i3, int i4) {
        int[] iArr;
        char c;
        int i5;
        int m218a = m218a(i, i2, i, i2, i3, i4);
        if (m218a >= 0) {
            if (m218a == 0) {
                Player_Info[1] = (i2 - i4) << 8;
                m230a(-1);
            } else {
                if (m218a == 1) {
                    Player_Info[0] = ((i - i3) - 12) << 8;
                    iArr = Player_Info;
                    c = '\n';
                    i5 = 0;
                } else if (m218a == 2) {
                    Player_Info[0] = (((i + i3) + 12) + 1) << 8;
                    iArr = Player_Info;
                    c = '\n';
                    i5 = 0;
                } else if (m218a == 3) {
                    iArr = Player_Info;
                    c = 1;
                    i5 = ((((i2 + i4) + 12) + 12) + 1) << 8;
                }
                iArr[c] = i5;
            }
        }
        if (!this.f206s || m218a == 0) {
            return;
        }
        this.f206s = false;
    }

    /* renamed from: c */
    public final boolean m124c() {
        if (this.f170L >= 50) {
            return false;
        }
        if (!(f125g && f121d) && this.f300aw <= 0) {
            int i = ((this.f177S + this.f179U) / 100) + this.Boss_XPos;
            int i2 = (((this.f178T + this.f180V) / 100) + this.Boss_YPos) - 16;
            int m235a = i - m235a();
            int m146b = i2 - (m146b() - 16);
            if ((m235a * m235a) + (m146b * m146b) < 1024) {
                if (f127i) {
                    this.f300aw = 1;
                    return true;
                }
                if (this.Player_InvincTime == 0) {
                    Player_Hurt();
                }
                this.f300aw = 1;
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public static void m105d(int i, int i2) {
        int m235a = m235a();
        int i3 = i2 >= m146b() - 16 ? i <= m235a ? 45 : 315 : i <= m235a ? 135 : 225;
        Player_Info[3] = Math_CalcSine(i3) * 8;
        Player_Info[5] = m143b(i3) * 8;
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
        this.f179U = 0;
        this.f180V = Math_CalcSine(this.f174P / 100) * 8;
        m88e(iArr);
        if (m124c()) {
            m105d(iArr[2], iArr[3]);
            if (this.f185aa == 0 && this.f170L < 100) {
                int i3 = this.f189ae - 1;
                this.f189ae = i3;
                if (i3 <= 0) {
                    this.f170L = 100;
                    return;
                }
                this.f187ac = 3;
                this.f188ad = 60;
                this.f185aa = 60;
            }
        }
        if (this.f170L < 100) {
            int i4 = this.f173O / 100;
            while (true) {
                i2 = i4;
                if (i4 >= 0) {
                    break;
                }
                i4 = i2 + 360;
            }
            int Math_CalcSine = 180 + ((Math_CalcSine(i2) * 90) / 100);
            if (m222a(this.Boss_XPos + ((this.f177S + this.f179U) / 100) + ((Math_CalcSine(Math_CalcSine) * this.f175Q) / 100) + f210a[120][15][4], this.Boss_YPos + ((this.f178T + this.f180V) / 100) + ((m143b(Math_CalcSine) * this.f175Q) / 100) + f210a[120][15][5], 36)) {
                Player_Hurt();
                this.f187ac = 1;
                this.f188ad = 60;
            }
        }
        switch (this.f170L) {
            case 1:
                this.f177S = 10000;
                this.f178T = -12000;
                this.f175Q = -32;
                this.f176R = -100;
                this.f173O = 0;
                this.f174P = 0;
                this.f183Y = 80;
                this.f170L++;
                this.f171M = 0;
                this.f178T += 80;
                if (this.f178T < 0) {
                    return;
                }
                this.f178T = 0;
                this.f183Y = 100;
                this.f170L++;
                this.f171M = 2;
                this.f177S -= 100;
                if (this.f183Y <= 0) {
                    return;
                }
                this.f170L++;
                this.f171M = 1;
                i = this.f175Q + 1;
                this.f175Q = i;
                if (i >= 96) {
                    return;
                }
                this.f183Y = 32;
                this.f170L++;
                this.f171M = 2;
                this.f177S -= 50;
                this.f173O += this.f176R;
                this.f174P += 100;
                if (this.f177S <= -3200) {
                    return;
                }
                this.f177S = -3200;
                this.f170L = 6;
                return;
            case 2:
                this.f171M = 0;
                this.f178T += 80;
                if (this.f178T < 0) {
                }
                break;
            case 3:
                this.f171M = 2;
                this.f177S -= 100;
                if (this.f183Y <= 0) {
                }
                break;
            case 4:
                this.f171M = 1;
                i = this.f175Q + 1;
                this.f175Q = i;
                if (i >= 96) {
                }
                break;
            case 5:
                this.f171M = 2;
                this.f177S -= 50;
                this.f173O += this.f176R;
                this.f174P += 100;
                if (this.f177S <= -3200) {
                }
                break;
            case 6:
                this.f171M = 2;
                this.f177S -= 100;
                this.f173O += this.f176R;
                this.f174P += 100;
                if (this.f177S > -3200) {
                    return;
                }
                this.f177S = -3200;
                this.f170L++;
                this.f171M = 0;
                this.f172N = 1;
                this.f174P += 100;
                if (this.f176R >= 0) {
                    this.f173O += this.f176R;
                    if (this.f173O < -9000) {
                        this.f176R = -this.f176R;
                        this.f173O = -9000;
                        return;
                    }
                    return;
                }
                this.f173O += this.f176R;
                if (this.f173O < 9000) {
                    return;
                }
                this.f173O = 9000;
                this.f176R = -this.f176R;
                this.f183Y = 64;
                this.f170L++;
                this.f171M = 2;
                this.f177S += 100;
                this.f173O += this.f176R;
                this.f174P += 100;
                if (this.f177S >= 3200 && this.f183Y <= 0) {
                    this.f177S = 3200;
                    this.f170L++;
                    this.f171M = 0;
                    this.f172N = 0;
                    this.f174P += 100;
                    if (this.f176R > 0) {
                        this.f173O += this.f176R;
                        if (this.f173O > 9000) {
                            this.f176R = -this.f176R;
                            this.f173O = 9000;
                            return;
                        }
                        return;
                    }
                    this.f173O += this.f176R;
                    if (this.f173O > -9000) {
                        return;
                    }
                    this.f173O = -9000;
                    this.f176R = -this.f176R;
                    this.f183Y = 64;
                    this.f170L = 6;
                    return;
                }
                return;
            case 7:
                this.f171M = 0;
                this.f172N = 1;
                this.f174P += 100;
                if (this.f176R >= 0) {
                }
                break;
            case 8:
                this.f171M = 2;
                this.f177S += 100;
                this.f173O += this.f176R;
                this.f174P += 100;
                if (this.f177S >= 3200) {
                    this.f177S = 3200;
                    this.f170L++;
                    this.f171M = 0;
                    this.f172N = 0;
                    this.f174P += 100;
                    if (this.f176R > 0) {
                    }
                    break;
                } else {
                    return;
                }
                break;
            case 9:
                this.f171M = 0;
                this.f172N = 0;
                this.f174P += 100;
                if (this.f176R > 0) {
                }
                break;
            case 100:
                this.f171M = 3;
                this.f183Y = 40;
                this.f170L++;
                if (this.f183Y <= 0) {
                    return;
                }
                this.f183Y = 180;
                this.f170L++;
                if (this.f175Q > 0) {
                    this.f175Q--;
                }
                if (this.f183Y <= 0) {
                    return;
                }
                this.f171M = 4;
                this.f183Y = 80;
                this.f170L++;
                this.f171M = 4;
                this.f178T += 200;
                m112c(iArr);
                if (iArr[3] >= f144d[this.Game_ZoneID]) {
                    return;
                }
                this.f183Y = 40;
                this.f170L++;
                if (this.f183Y <= 0) {
                    return;
                }
                m247O();
                this.f183Y = 16;
                this.f170L++;
                this.f171M = 5;
                this.f172N = 1;
                this.f177S += 200;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                    return;
                }
                this.f183Y = 120;
                this.f170L++;
                this.f171M = 6;
                this.f172N = 1;
                this.f177S += 600;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                    return;
                }
                this.f170L++;
                this.f171M = -1;
                this.Object_Info[0] = 0;
                Boss_Unload();
                return;
            case 101:
                if (this.f183Y <= 0) {
                }
                break;
            case 102:
                if (this.f175Q > 0) {
                }
                if (this.f183Y <= 0) {
                }
                break;
            case 103:
                this.f171M = 4;
                this.f178T += 200;
                m112c(iArr);
                if (iArr[3] >= f144d[this.Game_ZoneID]) {
                }
                break;
            case 104:
                if (this.f183Y <= 0) {
                }
                break;
            case 105:
                this.f171M = 5;
                this.f172N = 1;
                this.f177S += 200;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                }
                break;
            case 106:
                this.f171M = 6;
                this.f172N = 1;
                this.f177S += 600;
                this.f178T -= 50;
                if (this.f183Y <= 0) {
                }
                break;
            case 107:
                this.f171M = -1;
                this.Object_Info[0] = 0;
                Boss_Unload();
                return;
            default:
                this.f170L = 1;
                this.f177S = 10000;
                this.f178T = -12000;
                this.f175Q = -32;
                this.f176R = -100;
                this.f173O = 0;
                this.f174P = 0;
                this.f183Y = 80;
                this.f170L++;
                this.f171M = 0;
                this.f178T += 80;
                if (this.f178T < 0) {
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
            this.f174P += 100;
            this.f179U = 0;
            this.f180V = Math_CalcSine(this.f174P / 100) * 10;
            if (this.f170L <= 99) {
                if (m124c() && this.f170L > 3) {
                    m105d(iArr[2], iArr[3]);
                    if (this.f185aa == 0 && this.f170L < 100) {
                        int i2 = this.f189ae - 1;
                        this.f189ae = i2;
                        if (i2 <= 0) {
                            this.f145I = 0;
                            this.f170L = 100;
                            return;
                        }
                        this.f187ac = 3;
                        this.f188ad = 60;
                        this.f185aa = 60;
                        this.f186ab = 20;
                    }
                }
                if (this.f145I > 0) {
                    int i3 = this.f145I - 1;
                    this.f145I = i3;
                    if (i3 == 0) {
                        this.f145I = 150 + m123c(150);
                        m216a(16, (this.Boss_XPos + m123c(40)) - 20, this.Boss_YPos + 130, 0, -300, 0, 1);
                    }
                }
                switch (this.f170L) {
                    case 1:
                        this.f187ac = 0;
                        this.f171M = 2;
                        this.f177S = 31200;
                        this.f178T = 4800;
                        this.f173O = 0;
                        this.f174P = 0;
                        this.f145I = 0;
                        this.f183Y = 30;
                        this.f170L++;
                        if (this.f183Y > 0) {
                            return;
                        }
                        this.f170L++;
                        this.f171M = 2;
                        this.f177S -= 150;
                        this.f178T -= 20;
                        if (this.f177S > 10400 && this.f183Y <= 0) {
                            this.f177S = 10400;
                            this.f171M = 0;
                            this.f187ac = 1;
                            this.f188ad = 60;
                            this.f183Y = 60;
                            this.f145I = 120;
                            game = this;
                            i = game.f170L + 1;
                            game.f170L = i;
                            return;
                        }
                        return;
                    case 2:
                        if (this.f183Y > 0) {
                        }
                        break;
                    case 3:
                        this.f171M = 2;
                        this.f177S -= 150;
                        this.f178T -= 20;
                        if (this.f177S > 10400) {
                            return;
                        }
                        this.f177S = 10400;
                        this.f171M = 0;
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 60;
                        this.f145I = 120;
                        game = this;
                        i = game.f170L + 1;
                        game.f170L = i;
                        return;
                    case 4:
                        this.f171M = 2;
                        this.f172N = 0;
                        this.f170L++;
                        this.f171M = 2;
                        this.f172N = 0;
                        this.f177S -= 150;
                        this.f178T -= 12;
                        if (this.f177S <= -10400) {
                            return;
                        }
                        this.f177S = -10400;
                        this.f170L++;
                        this.f178T += 50;
                        if (this.f178T > 1200) {
                            return;
                        }
                        this.f178T = 1200;
                        this.f170L++;
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 48;
                        this.f170L++;
                        if (this.f183Y == 8) {
                            m216a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f183Y > 0) {
                            return;
                        }
                        m112c(iArr);
                        game = this;
                        i = game.f170L + 1;
                        game.f170L = i;
                        return;
                    case 5:
                        this.f171M = 2;
                        this.f172N = 0;
                        this.f177S -= 150;
                        this.f178T -= 12;
                        if (this.f177S <= -10400) {
                        }
                        break;
                    case 6:
                        this.f178T += 50;
                        if (this.f178T > 1200) {
                        }
                        break;
                    case 7:
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 48;
                        this.f170L++;
                        if (this.f183Y == 8) {
                        }
                        if (this.f183Y > 0) {
                        }
                        break;
                    case 8:
                        if (this.f183Y == 8) {
                        }
                        if (this.f183Y > 0) {
                        }
                        break;
                    case 9:
                        this.f171M = 2;
                        this.f172N = 1;
                        this.f170L++;
                        this.f171M = 2;
                        this.f172N = 1;
                        this.f177S += 150;
                        this.f178T -= 12;
                        if (this.f177S >= 10400) {
                            return;
                        }
                        this.f177S = 10400;
                        this.f170L++;
                        this.f178T += 50;
                        if (this.f178T > 1200) {
                            return;
                        }
                        this.f178T = 1200;
                        this.f170L++;
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 48;
                        this.f170L++;
                        if (this.f183Y == 8) {
                            m216a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f183Y > 0) {
                            return;
                        }
                        m112c(iArr);
                        this.f170L++;
                        this.f178T -= 100;
                        if (this.f178T <= 0) {
                            return;
                        }
                        this.f178T = 0;
                        game = this;
                        i = 4;
                        game.f170L = i;
                        return;
                    case 10:
                        this.f171M = 2;
                        this.f172N = 1;
                        this.f177S += 150;
                        this.f178T -= 12;
                        if (this.f177S >= 10400) {
                        }
                        break;
                    case 11:
                        this.f178T += 50;
                        if (this.f178T > 1200) {
                        }
                        break;
                    case 12:
                        this.f187ac = 1;
                        this.f188ad = 60;
                        this.f183Y = 48;
                        this.f170L++;
                        if (this.f183Y == 8) {
                        }
                        if (this.f183Y > 0) {
                        }
                        break;
                    case 13:
                        if (this.f183Y == 8) {
                        }
                        if (this.f183Y > 0) {
                        }
                        break;
                    case 14:
                        this.f178T -= 100;
                        if (this.f178T <= 0) {
                        }
                        break;
                    default:
                        this.f170L = 1;
                        this.f187ac = 0;
                        this.f171M = 2;
                        this.f177S = 31200;
                        this.f178T = 4800;
                        this.f173O = 0;
                        this.f174P = 0;
                        this.f145I = 0;
                        this.f183Y = 30;
                        this.f170L++;
                        if (this.f183Y > 0) {
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
        this.f55aT = 0;
        this.f223ai = 6;
        this.f204q = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: R */
    public final void m244R() {
        Game game;
        boolean z;
        Game game2;
        int i;
        if (this.f326ab) {
            if (this.Continue_Timer > 0 && this.f55aT < 4) {
                this.Continue_Timer--;
            }
            switch (this.f55aT) {
                case 1:
                    this.f56aU = this.f61aZ;
                    this.f57aV = 0;
                    this.Continue_Timer = 604;
                    this.f58aW = -1;
                    this.f59aX = -1;
                    GFX_GameArray[121] = GFX_Load("/continue.png");
                    this.Music_MainPlayer.Music_Play(15, -1, false);
                    game2 = this;
                    i = 2;
                    game2.f55aT = i;
                    break;
                case 2:
                    this.f58aW = 0;
                    this.f57aV += 4;
                    if (this.f57aV >= this.f62ba) {
                        this.f57aV = this.f62ba;
                        this.f58aW = 1;
                        game2 = this;
                        i = 3;
                        game2.f55aT = i;
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
                        game2.f55aT = i;
                        break;
                    } else if (this.Input_Array[0]) {
                        this.f58aW = 2;
                        this.f59aX = 0;
                        m97e();
                        game2 = this;
                        i = 4;
                        game2.f55aT = i;
                    }
                    break;
                case 4:
                    this.f59aX++;
                    if (this.f59aX > 8) {
                        this.f56aU++;
                    }
                    if (this.f59aX > 12) {
                        this.f56aU += 20;
                    }
                    if (this.f59aX >= 45) {
                        game2 = this;
                        i = 5;
                        game2.f55aT = i;
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
                    game2.f55aT = i;
                    break;
                case 999:
                    break;
                default:
                    this.f55aT = 1;
                    this.f56aU = this.f61aZ;
                    this.f57aV = 0;
                    this.Continue_Timer = 604;
                    this.f58aW = -1;
                    this.f59aX = -1;
                    GFX_GameArray[121] = GFX_Load("/continue.png");
                    this.Music_MainPlayer.Music_Play(15, -1, false);
                    game2 = this;
                    i = 2;
                    game2.f55aT = i;
                    break;
            }
            this.f326ab = false;
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
        this.f326ab = true;
        int i9 = f25h >> 1;
        int i10 = i9 + 8;
        int i11 = f25h >> 2;
        int i12 = GFX_MenuWidth >> 1;
        GFX_Painter.setColor(0);
        GFX_Painter.setClip(0, f26i, GFX_MenuWidth, f25h);
        GFX_Painter.fillRect(0, f26i, GFX_MenuWidth, f25h);
        if (GFX_GameArray[121] == null || this.f55aT == 1) {
            return;
        }
        if (this.f58aW == 0) {
            m215a(121, 0, 0, 48, 32, 0, i12, this.f62ba);
            int i13 = this.f35j % 5;
            short s5 = f63b[i13][0];
            short s6 = f63b[i13][1];
            i3 = 151;
            s3 = s5;
            s4 = s6;
            i4 = 48;
            i5 = 24;
            i6 = 0;
            i7 = i12;
            i8 = this.f57aV;
        } else {
            if (this.f58aW != 1) {
                if (this.f58aW == 2) {
                    if (this.f59aX < 1) {
                        s = 48;
                        s2 = 120;
                        i = 48;
                        i2 = 24;
                    } else {
                        s = (this.f59aX < 12 ? (this.f59aX >> 1) % 6 : 6 + ((this.f59aX - 12) % 4)) * 40;
                        s2 = 40;
                        i = 40;
                        i2 = 40;
                    }
                    int i14 = i2;
                    m215a(121, 0, 0, 48, 32, 0, i12, this.f62ba);
                    i3 = 151;
                    s3 = s;
                    s4 = s2;
                    i4 = i;
                    i5 = i14;
                    i6 = 0;
                    i7 = this.f56aU;
                }
                if (this.f58aW < 2) {
                    m215a(121, 96, 0, 16, 16, 0, i12 - 16, i10);
                    m215a(121, 96, 0, 16, 16, 0, i12 + 16, i10);
                    m102d(i12 - 10, i9, this.Continue_Timer / 55, 2);
                }
                m215a(121, 0, 64, 120, 16, 0, i12, i11);
            }
            int i15 = (this.f35j >> 2) & 3;
            short s7 = f64c[i15][0];
            short s8 = f64c[i15][1];
            i3 = 121;
            s3 = s7;
            s4 = s8;
            i4 = 48;
            i5 = 32;
            i6 = 0;
            i7 = i12;
            i8 = this.f62ba;
        }
        m215a(i3, s3, s4, i4, i5, i6, i7, i8);
        if (this.f58aW < 2) {
        }
        m215a(121, 0, 64, 120, 16, 0, i12, i11);
    }

    /* renamed from: T */
    public final void m242T() {
        switch (this.f44aJ) {
            case 0:
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f45aK = 0;
                this.f44aJ = 2;
                return;
            case 2:
                this.f45aK++;
                if (this.f45aK > 720) {
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
        GFX_Painter.fillRect(0, f26i, GFX_MenuWidth, f25h);
        m195a(GFX_Painter, GFX_HUDArray[10], 0, 144, width2, width, f38a[0], f27aH, 10, 17, true);
        for (int i = 0; i < this.Player_Emeralds - 1; i++) {
            m195a(GFX_Painter, GFX_GameArray[154], i * width, 0, width, width, f38a[0], this.f46E[i] >> 16, this.f46E[i] & 65535, 0, true);
        }
        switch (this.f44aJ) {
            case 2:
                if (((this.f35j >> 1) & 1) == 0) {
                    m195a(GFX_Painter, GFX_GameArray[154], (this.Player_Emeralds - 1) * width, 0, width, width, f38a[0], this.f46E[this.Player_Emeralds - 1] >> 16, this.f46E[this.Player_Emeralds - 1] & 65535, 0, true);
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
        switch (this.f47aL) {
            case 0:
                GFX_ZoneTiles = null;
                GFX_UnloadArray(GFX_GameArray);
                Background_Renderer.BG_Initialize(0, 0);
                GFX_GameArray[158] = GFX_Load("/landscape.png");
                if (this.Player_Emeralds != 6) {
                    GFX_GameArray[157] = GFX_Load("/endegg_b.png");
                    this.f47aL = 1;
                    this.f48aM = 0;
                    this.f51aP = 0;
                } else {
                    GFX_GameArray[157] = GFX_Load("/endegg_a.png");
                    this.f51aP = 0;
                    this.f47aL = 2;
                }
                GFX_GameArray[155] = GFX_Load("/ED3.png");
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f49aN = 0;
                this.f50aO = 0;
                this.f52aQ = 0;
                return;
            case 1:
                this.f49aN++;
                if (this.f49aN > 480) {
                    this.f47aL = 2;
                    return;
                } else if (this.f49aN > 360) {
                    this.f48aM = 2;
                    return;
                } else if (this.f49aN > 240) {
                    this.f48aM = 1;
                    return;
                } else {
                    return;
                }
            case 2:
                this.f50aO++;
                if (this.f50aO > 240) {
                    if (this.Player_Emeralds == 6) {
                        this.f47aL = 3;
                        return;
                    }
                    this.f47aL = 4;
                    this.f54aS = 3;
                    this.f53aR = 0;
                    return;
                } else if (this.f50aO > 32) {
                    this.f51aP = 2;
                    return;
                } else if (this.f50aO > 16) {
                    this.f51aP = 1;
                    return;
                } else {
                    return;
                }
            case 3:
                this.f52aQ++;
                if (this.f52aQ > 240) {
                    m174aJ();
                    if (m108d()) {
                        this.f223ai = 9;
                        this.f252v = true;
                        return;
                    }
                    game = this;
                    game.m106d(3);
                    return;
                }
                return;
            case 4:
                this.f52aQ++;
                switch (this.f54aS) {
                    case 0:
                        if (this.f327bQ + ((6 - this.Player_Emeralds) * 16) > 0) {
                            game2 = this;
                            i = game2.f327bQ - 2;
                            game2.f327bQ = i;
                            break;
                        } else {
                            this.f327bQ = 0;
                            this.f52aQ = 0;
                            this.f53aR++;
                            this.f54aS = 3;
                            break;
                        }
                    case 1:
                        if (this.f52aQ > 24) {
                            this.f54aS = 0;
                            game2 = this;
                            i = 145;
                            game2.f327bQ = i;
                            break;
                        }
                        break;
                    case 2:
                        if (this.f327bQ - ((6 - this.Player_Emeralds) * 16) < 180) {
                            game2 = this;
                            i = game2.f327bQ + 2;
                            game2.f327bQ = i;
                            break;
                        } else {
                            this.f327bQ = 180;
                            this.f52aQ = 0;
                            this.f53aR++;
                            this.f54aS = 1;
                            break;
                        }
                    case 3:
                        if (this.f52aQ > 24) {
                            this.f54aS = 2;
                            game2 = this;
                            i = 35;
                            game2.f327bQ = i;
                            break;
                        }
                        break;
                }
                if (this.f53aR > 4) {
                    if (m108d()) {
                        this.f223ai = 9;
                        this.f252v = true;
                        return;
                    }
                    game = this;
                    game.m106d(3);
                    return;
                }
                return;
            default:
                this.f47aL = 0;
                GFX_ZoneTiles = null;
                GFX_UnloadArray(GFX_GameArray);
                Background_Renderer.BG_Initialize(0, 0);
                GFX_GameArray[158] = GFX_Load("/landscape.png");
                if (this.Player_Emeralds != 6) {
                }
                GFX_GameArray[155] = GFX_Load("/ED3.png");
                GFX_GameArray[154] = GFX_Load("/emeralds.png");
                this.f49aN = 0;
                this.f50aO = 0;
                this.f52aQ = 0;
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
        GFX_Painter.setClip(0, 0, f20c, GFX_MenuHeight);
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, 0, f20c, GFX_MenuHeight);
        if (this.f47aL == 2 || this.f47aL == 1) {
            m191a(false, false);
        }
        m261F();
        if (f24g < f20c) {
            GFX_Painter.translate((f20c - f24g) >> 1, 0);
        }
        switch (this.f47aL) {
            case 1:
                GFX_Painter.setClip(0, f26i, f20c, f25h);
                GFX_Painter.drawImage(GFX_GameArray[158], 0, f26i, 20);
                switch (this.f48aM) {
                    case 0:
                        m195a(GFX_Painter, GFX_GameArray[157], ((this.f49aN >> 1) & 1) * 32, 96, 32, 40, f38a[0], f27aH, (f26i + f25h) - 10, 33, false);
                        break;
                    case 1:
                        m195a(GFX_Painter, GFX_GameArray[157], 64, 96, 32, 40, f38a[0], f27aH, (f26i + f25h) - 10, 33, false);
                        if (((this.f49aN >> 1) & 1) == 0) {
                            for (int i18 = 0; i18 < 6; i18++) {
                                int min = Math.min(60, this.f49aN - 240);
                                m195a(GFX_Painter, GFX_GameArray[154], i18 * 16, 0, 16, 16, f38a[0], f27aH + ((min * m143b(i18 * 36)) / 100), (((f26i + f25h) - 22) - (min >> 1)) - ((min * Math_CalcSine(i18 * 36)) / 100), 3, false);
                            }
                            break;
                        }
                        break;
                    case 2:
                        m195a(GFX_Painter, GFX_GameArray[157], (3 + ((this.f49aN >> 5) & 1)) * 32, 96, 32, 40, f38a[0], f27aH, (f26i + f25h) - 10, 33, false);
                        for (int i19 = 0; i19 < 6; i19++) {
                            m195a(GFX_Painter, GFX_GameArray[154], i19 * 16, 0, 16, 16, f38a[0], f27aH + ((60 * m143b(i19 * 36)) / 100), (((f26i + f25h) - 22) - 30) - ((60 * Math_CalcSine(i19 * 36)) / 100), 3, false);
                        }
                        break;
                }
            case 2:
                GFX_Painter.setClip(0, f26i, f20c, f25h);
                GFX_Painter.drawImage(GFX_GameArray[158], 0, f26i, 20);
                switch (this.f51aP) {
                    case 0:
                        graphics2 = GFX_Painter;
                        image2 = GFX_GameArray[155];
                        i10 = 0;
                        i11 = 0;
                        i12 = 32;
                        i13 = 40;
                        i14 = f38a[0];
                        i15 = f27aH;
                        i16 = f26i + f25h;
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
                        i14 = f38a[0];
                        i15 = f27aH;
                        i16 = f26i + f25h;
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
                        i14 = f38a[0];
                        i15 = f27aH;
                        i16 = f26i + f25h;
                        i17 = 20;
                        m195a(graphics2, image2, i10, i11, i12, i13, i14, i15, i16 - i17, 33, false);
                        break;
                }
            case 3:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f26i, f20c, f25h);
                int i20 = (this.f52aQ / 15) % 3;
                graphics = GFX_Painter;
                image = GFX_GameArray[157];
                i = i20 * 60;
                i2 = 0;
                i3 = 60;
                i4 = 96;
                i5 = f38a[0];
                i6 = f27aH;
                i7 = f28aI;
                i8 = 3;
                m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                break;
            case 4:
                GFX_Painter.setColor(0);
                GFX_Painter.fillRect(0, f26i, f20c, f25h);
                switch (this.f54aS) {
                    case 0:
                        m195a(GFX_Painter, GFX_GameArray[157], 128, 0, 128, 112, f38a[0], f27aH, f28aI, 3, false);
                        for (int i21 = 0; i21 < 6 - this.Player_Emeralds; i21++) {
                            int max = Math.max(Math.min(145, this.f327bQ + (i21 * 16)), 0);
                            m195a(GFX_Painter, GFX_GameArray[154], (5 - i21) * 16, 0, 16, 16, f38a[0], f27aH + ((55 * m143b(max)) / 100), (f28aI - 10) - ((55 * Math_CalcSine(max)) / 100), 3, false);
                        }
                        break;
                    case 1:
                        i9 = f27aH + 55;
                        int i22 = i9;
                        int i23 = f28aI - 20;
                        m195a(GFX_Painter, GFX_GameArray[157], 0, 0, 128, 112, f38a[0], f27aH, f28aI, 3, false);
                        m195a(GFX_Painter, GFX_GameArray[154], 0, 0, 16, 16, f38a[0], i22, i23, 3, false);
                        break;
                    case 2:
                        m195a(GFX_Painter, GFX_GameArray[157], 128, 0, 128, 112, f38a[4], f27aH, f28aI, 3, false);
                        for (int i24 = 0; i24 < 6 - this.Player_Emeralds; i24++) {
                            int min2 = Math.min(Math.max(35, this.f327bQ - (i24 * 16)), 180);
                            m195a(GFX_Painter, GFX_GameArray[154], (5 - i24) * 16, 0, 16, 16, f38a[0], f27aH + ((55 * m143b(min2)) / 100), (f28aI - 10) - ((55 * Math_CalcSine(min2)) / 100), 3, false);
                        }
                        break;
                    case 3:
                        i9 = f27aH - 55;
                        int i222 = i9;
                        int i232 = f28aI - 20;
                        m195a(GFX_Painter, GFX_GameArray[157], 0, 0, 128, 112, f38a[0], f27aH, f28aI, 3, false);
                        m195a(GFX_Painter, GFX_GameArray[154], 0, 0, 16, 16, f38a[0], i222, i232, 3, false);
                        break;
                }
                graphics = GFX_Painter;
                image = GFX_GameArray[157];
                i = 0;
                i2 = 116;
                i3 = 240;
                i4 = 36;
                i5 = f38a[0];
                i6 = f27aH;
                i7 = f26i + f25h;
                i8 = 33;
                m195a(graphics, image, i, i2, i3, i4, i5, i6, i7, i8, false);
                break;
        }
        if (f24g < f20c) {
            GFX_Painter.translate(-((f20c - f24g) >> 1), 0);
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
        this.f223ai = 1;
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
        GFX_Painter.fillRect(0, f26i, GFX_MenuWidth, f25h);
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
                int length = f20c / (this.f330L.length + 1);
                for (i = 0; i < this.f330L.length; i++) {
                    GFX_Painter.drawString(String.valueOf(HighScore_ValidChars[this.f330L[i]]), (i + 1) * length, f28aI + (GFX_Painter.getFont().getHeight() >> 1), 65);
                }
                GFX_Painter.setColor(16386570);
                int height = (GFX_Painter.getFont().getHeight() * 3) >> 1;
                GFX_Painter.drawRect(((this.f329bR + 1) * length) - (height >> 1), f28aI - (height >> 1), height, height);
        }
        game.m196a(enternametext, false);
        GFX_Painter.setColor(16777215);
        int length2 = f20c / (this.f330L.length + 1);
        while (i < this.f330L.length) {
        }
        GFX_Painter.setColor(16386570);
        int height2 = (GFX_Painter.getFont().getHeight() * 3) >> 1;
        GFX_Painter.drawRect(((this.f329bR + 1) * length2) - (height2 >> 1), f28aI - (height2 >> 1), height2, height2);
    }

    /* renamed from: Z */
    public final void m236Z() {
        m261F();
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, f26i, GFX_MenuWidth, f25h);
        m196a(this.f66b[87], false);
        GFX_Painter.setColor(16777215);
        GFX_Painter.drawString(m234a(), f20c >> 1, f26i + (f25h >> 1), 65);
    }

    /* renamed from: aa */
    public final void m172aa() {
        m261F();
        GFX_Painter.setColor(0);
        GFX_Painter.fillRect(0, f26i, GFX_MenuWidth, f25h);
        m196a(this.f66b[86], false);
        GFX_Painter.setColor(16777215);
        int charWidth = f17a.charWidth('X') + 2;
        for (int i = 0; i < 8; i++) {
            GFX_Painter.drawChar(HighScore_ValidChars[this.f331M[i]], (f20c >> 1) + ((i - 4) * charWidth) + 2, f26i + (f25h >> 1), 36);
        }
        GFX_Painter.setColor(16386570);
        GFX_Painter.drawRect((f20c >> 1) + ((this.f332bS - 4) * charWidth), (f26i + (f25h >> 1)) - f18a, charWidth, f18a);
        GFX_Painter.setColor(16777215);
        GFX_Painter.drawString(this.f333b, f20c >> 1, f26i, 17);
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
