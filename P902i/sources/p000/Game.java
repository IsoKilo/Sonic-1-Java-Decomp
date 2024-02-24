package p000;

import com.nttdocomo.device.StorageDevice;
import com.nttdocomo.fs.DoJaAccessToken;
import com.nttdocomo.fs.DoJaStorageService;
import com.nttdocomo.fs.File;
import com.nttdocomo.fs.Folder;
import com.nttdocomo.fs.MediaNotFoundException;
import com.nttdocomo.io.FileEntity;
import com.nttdocomo.io.HttpConnection;
import com.nttdocomo.opt.ui.j3d.Graphics3D;
import com.nttdocomo.opt.ui.j3d.Math;
import com.nttdocomo.ui.Audio3D;
import com.nttdocomo.ui.AudioPresenter;
import com.nttdocomo.ui.Canvas;
import com.nttdocomo.ui.Font;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.IApplication;
import com.nttdocomo.ui.Image;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaManager;
import com.nttdocomo.ui.MediaSound;
import com.nttdocomo.ui.PhoneSystem;
import com.nttdocomo.util.JarInflater;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import javax.microedition.io.Connector;

/* renamed from: a */
/* loaded from: a.class */
public final class Game extends Canvas implements Runnable {

    /* renamed from: a */
    private static Audio3D f1a;

    /* renamed from: a */
    public static InputStream MainInputStream;

    /* renamed from: a */
    private static Graphics3D f3a;

    /* renamed from: a */
    private static MediaImage f4a;

    /* renamed from: c */
    private static byte[] f5c;

    /* renamed from: N */
    private static int[] f6N;

    /* renamed from: a */
    private static DataOutputStream f7a;

    /* renamed from: a */
    private static DataInputStream f8a;

    /* renamed from: a */
    public static Graphics f9a;

    /* renamed from: Y */
    private static int f10Y;

    /* renamed from: a */
    private static boolean[] f11a;

    /* renamed from: b */
    private static boolean[] f12b;

    /* renamed from: ab */
    private static int f13ab;

    /* renamed from: ac */
    private static int f14ac;

    /* renamed from: ad */
    private static int f15ad;

    /* renamed from: ae */
    private static int f16ae;

    /* renamed from: af */
    private static int f17af;

    /* renamed from: ag */
    private static int f18ag;

    /* renamed from: ah */
    private static int f19ah;

    /* renamed from: ai */
    private static int f20ai;

    /* renamed from: aj */
    private static int f21aj;

    /* renamed from: ak */
    private static int f22ak;

    /* renamed from: al */
    private static int f23al;

    /* renamed from: am */
    private static int f24am;

    /* renamed from: an */
    private static int f25an;

    /* renamed from: ao */
    private static int f26ao;

    /* renamed from: ap */
    private static int f27ap;

    /* renamed from: aq */
    private static int f28aq;

    /* renamed from: ar */
    private static int f29ar;

    /* renamed from: as */
    private static int f30as;

    /* renamed from: at */
    private static int f31at;

    /* renamed from: au */
    private static int f32au;

    /* renamed from: D */
    private static boolean f33D;

    /* renamed from: E */
    private static boolean f34E;

    /* renamed from: av */
    private static int f35av;

    /* renamed from: aw */
    private static int f36aw;

    /* renamed from: ax */
    private static int f37ax;

    /* renamed from: ay */
    private static int f38ay;

    /* renamed from: X */
    private static int[] f39X;

    /* renamed from: b */
    private static byte[][] f40b;

    /* renamed from: a */
    private static byte[][][] f41a;

    /* renamed from: b */
    private static int[][][] f42b;

    /* renamed from: az */
    private static int f43az;

    /* renamed from: b */
    private static short[][] f44b;

    /* renamed from: a */
    public boolean f45a;

    /* renamed from: b */
    private byte f46b;

    /* renamed from: c */
    private byte f47c;

    /* renamed from: aB */
    private int f48aB;

    /* renamed from: d */
    private byte f49d;

    /* renamed from: aC */
    private static int f50aC;

    /* renamed from: aD */
    private static int f51aD;

    /* renamed from: aE */
    private static int f52aE;

    /* renamed from: aF */
    private static int f53aF;

    /* renamed from: c */
    public boolean f54c;

    /* renamed from: l */
    public int f55l;

    /* renamed from: m */
    public int f56m;

    /* renamed from: d */
    public boolean f57d;

    /* renamed from: e */
    public boolean f58e;

    /* renamed from: f */
    public boolean f59f;

    /* renamed from: g */
    public boolean f60g;

    /* renamed from: h */
    public boolean f61h;

    /* renamed from: i */
    public boolean f62i;

    /* renamed from: aG */
    private int f63aG;

    /* renamed from: aH */
    private int f64aH;

    /* renamed from: aI */
    private int f65aI;

    /* renamed from: aK */
    private int f66aK;

    /* renamed from: aL */
    private int f67aL;

    /* renamed from: j */
    public boolean f68j;

    /* renamed from: u */
    public int f69u;

    /* renamed from: v */
    public int f70v;

    /* renamed from: m */
    public boolean f71m;

    /* renamed from: n */
    public boolean f72n;

    /* renamed from: o */
    public boolean f73o;

    /* renamed from: a */
    public byte f74a;

    /* renamed from: q */
    public boolean f75q;

    /* renamed from: r */
    public boolean f76r;

    /* renamed from: s */
    public boolean f77s;

    /* renamed from: t */
    public boolean f78t;

    /* renamed from: Y */
    private static boolean f79Y;

    /* renamed from: ba */
    private static int f80ba;

    /* renamed from: K */
    public int f81K;

    /* renamed from: s */
    private static byte f82s;

    /* renamed from: t */
    private static byte f83t;

    /* renamed from: u */
    private static byte f84u;

    /* renamed from: v */
    private static byte f85v;

    /* renamed from: w */
    private static byte f86w;

    /* renamed from: y */
    private static byte f87y;

    /* renamed from: bg */
    private static int f88bg;

    /* renamed from: a */
    private static String f89a;

    /* renamed from: r */
    private static int[][] f90r;

    /* renamed from: bm */
    private int f91bm;

    /* renamed from: bn */
    private int f92bn;

    /* renamed from: bo */
    private int f93bo;

    /* renamed from: bp */
    private int f94bp;

    /* renamed from: bq */
    private int f95bq;

    /* renamed from: br */
    private int f96br;

    /* renamed from: bs */
    private int f97bs;

    /* renamed from: bt */
    private int f98bt;

    /* renamed from: bu */
    private int f99bu;

    /* renamed from: bv */
    private int f100bv;

    /* renamed from: bw */
    private int f101bw;

    /* renamed from: bx */
    private int f102bx;

    /* renamed from: by */
    private int f103by;

    /* renamed from: bz */
    private int f104bz;

    /* renamed from: bA */
    private int f105bA;

    /* renamed from: bB */
    private int f106bB;

    /* renamed from: bC */
    private int f107bC;

    /* renamed from: bD */
    private int f108bD;

    /* renamed from: bE */
    private int f109bE;

    /* renamed from: bF */
    private int f110bF;

    /* renamed from: bG */
    private int f111bG;

    /* renamed from: bH */
    private static int f112bH;

    /* renamed from: bJ */
    private static int f113bJ;

    /* renamed from: bK */
    private static int f114bK;

    /* renamed from: bL */
    private static int f115bL;

    /* renamed from: bM */
    private static int f116bM;

    /* renamed from: bN */
    private static int f117bN;

    /* renamed from: bO */
    private static int f118bO;

    /* renamed from: bP */
    private static int f119bP;

    /* renamed from: bY */
    private static int f120bY;

    /* renamed from: bZ */
    private static int f121bZ;

    /* renamed from: ca */
    private static int f122ca;

    /* renamed from: cb */
    private static int f123cb;

    /* renamed from: cc */
    private static int f124cc;

    /* renamed from: ac */
    private static boolean f125ac;

    /* renamed from: ce */
    private static int f126ce;

    /* renamed from: cf */
    private static int f127cf;

    /* renamed from: cg */
    private static int f128cg;

    /* renamed from: ch */
    private static int f129ch;

    /* renamed from: ci */
    private static int f130ci;

    /* renamed from: q */
    public int[] f131q;

    /* renamed from: r */
    public int[] f132r;

    /* renamed from: s */
    public int[] f133s;

    /* renamed from: f */
    public int[][] f134f;

    /* renamed from: v */
    public int[] f135v;

    /* renamed from: A */
    private static int[][] f136A;

    /* renamed from: a */
    public Font f137a;

    /* renamed from: a */
    public Folder f138a;

    /* renamed from: a */
    public File f139a;

    /* renamed from: a */
    public FileEntity f140a;

    /* renamed from: a */
    public OutputStream f141a;

    /* renamed from: b */
    public InputStream f142b;

    /* renamed from: a */
    public JarInflater f143a;

    /* renamed from: t */
    private static byte[] f144t;

    /* renamed from: u */
    private static byte[] f145u;

    /* renamed from: v */
    private static byte[] f146v;

    /* renamed from: O */
    public int f147O;

    /* renamed from: cq */
    private static int f148cq;

    /* renamed from: Q */
    public static int f149Q;

    /* renamed from: R */
    public static int f150R;

    /* renamed from: S */
    public static int f151S;

    /* renamed from: T */
    public static int f152T;

    /* renamed from: ct */
    private static int f153ct;

    /* renamed from: cu */
    private static int f154cu;

    /* renamed from: cv */
    private static int f155cv;

    /* renamed from: cw */
    private static int f156cw;

    /* renamed from: cx */
    private static int f157cx;

    /* renamed from: U */
    public static int f158U;

    /* renamed from: W */
    public static int f159W;

    /* renamed from: X */
    public static int f160X;

    /* renamed from: M */
    public static int[] f161M;

    /* renamed from: c */
    private static String[] f162c = new String[2];

    /* renamed from: b */
    private static Font f163b = Font.getDefaultFont();

    /* renamed from: m */
    private static int[][] f164m = new int[256][25];

    /* renamed from: a */
    public static Image[] f165a = new Image[4];

    /* renamed from: c */
    private static boolean[] f166c = new boolean[10];

    /* renamed from: Z */
    private static int f167Z = 1536;

    /* renamed from: aa */
    private static int f168aa = 12;

    /* renamed from: O */
    private static int[] f169O = new int[2];

    /* renamed from: P */
    private static int[] f170P = new int[2];

    /* renamed from: Q */
    private static int[] f171Q = new int[25];

    /* renamed from: n */
    private static int[][] f172n = new int[30][20];

    /* renamed from: o */
    private static int[][] f173o = new int[30][10];

    /* renamed from: B */
    private static boolean f174B = false;

    /* renamed from: C */
    private static boolean f175C = false;

    /* renamed from: d */
    private static boolean[] f176d = new boolean[256];

    /* renamed from: R */
    private static int[] f177R = new int[2];

    /* renamed from: S */
    private static int[] f178S = new int[2];

    /* renamed from: T */
    private static int[] f179T = new int[2];

    /* renamed from: U */
    private static int[] f180U = new int[2];

    /* renamed from: V */
    private static int[] f181V = new int[2];

    /* renamed from: W */
    private static int[] f182W = new int[2];

    /* renamed from: d */
    private static byte[] f183d = new byte[42496];

    /* renamed from: e */
    private static byte[] f184e = new byte[600];

    /* renamed from: f */
    private static byte[] f185f = new byte[600];

    /* renamed from: g */
    private static byte[] f186g = new byte[8192];

    /* renamed from: a */
    private static byte[][] f187a = new byte[4];

    /* renamed from: h */
    private static byte[] f188h = new byte[512];

    /* renamed from: F */
    private static boolean f189F = false;

    /* renamed from: Y */
    private static int[] f190Y = new int[26];

    /* renamed from: G */
    private static boolean f191G = false;

    /* renamed from: H */
    private static boolean f192H = false;

    /* renamed from: I */
    private static boolean f193I = false;

    /* renamed from: J */
    private static boolean f194J = false;

    /* renamed from: K */
    private static boolean f195K = false;

    /* renamed from: L */
    private static boolean f196L = false;

    /* renamed from: M */
    private static boolean f197M = false;

    /* renamed from: N */
    private static boolean f198N = false;

    /* renamed from: O */
    private static boolean f199O = false;

    /* renamed from: P */
    private static boolean f200P = false;

    /* renamed from: Q */
    private static boolean f201Q = false;

    /* renamed from: R */
    private static boolean f202R = false;

    /* renamed from: S */
    private static boolean f203S = false;

    /* renamed from: T */
    private static boolean f204T = false;

    /* renamed from: U */
    private static boolean f205U = false;

    /* renamed from: i */
    private static byte[] f206i = new byte[8192];

    /* renamed from: aA */
    private static int f207aA = 0;

    /* renamed from: V */
    private static boolean f208V = false;

    /* renamed from: W */
    private static boolean f209W = false;

    /* renamed from: a */
    public static final int[] f210a = {0, 6, 4, 2, 7, 1, 3, 5};

    /* renamed from: b */
    public static final int[] f211b = {0, 5, 3, 4, 1, 6, 2, 7};

    /* renamed from: a */
    public static final int[][] f212a = {new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{1, 1, 1}, new int[]{3, 3, 3}, new int[]{5, 5, 1}, new int[]{5, 0}};

    /* renamed from: b */
    public static final int[][] f213b = {new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 2}, new int[]{0, 1, 3}, new int[]{3, 3}};

    /* renamed from: a */
    public static String[] f214a = new String[93];

    /* renamed from: bb */
    private static int f215bb = 0;

    /* renamed from: bc */
    private static int f216bc = 0;

    /* renamed from: f */
    private static byte f217f = 5;

    /* renamed from: g */
    private static byte f218g = 0;

    /* renamed from: h */
    private static byte f219h = 1;

    /* renamed from: i */
    private static byte f220i = 2;

    /* renamed from: j */
    private static byte f221j = 3;

    /* renamed from: k */
    private static byte f222k = 4;

    /* renamed from: l */
    private static byte f223l = 5;

    /* renamed from: m */
    private static byte f224m = 6;

    /* renamed from: n */
    private static byte f225n = 7;

    /* renamed from: o */
    private static byte f226o = 8;

    /* renamed from: p */
    private static byte f227p = 9;

    /* renamed from: q */
    private static byte f228q = 10;

    /* renamed from: r */
    private static byte f229r = 11;

    /* renamed from: x */
    private static byte f230x = 0;

    /* renamed from: n */
    private static byte[] f231n = new byte[4];

    /* renamed from: c */
    private static byte[][] f232c = {new byte[]{25, 26, 27}, new byte[]{29, 30, 31, 32}, new byte[]{29, 28}, new byte[]{33, 34, 35, 36, 37}};

    /* renamed from: q */
    private static int[][] f233q = {new int[]{0}, new int[]{0}, new int[]{1, -1, 200, 151}, new int[]{2, 3, 24, 98, 7, 24, 137}, new int[]{3, 4, 24, 46, 5, 24, 85, 6, 24, 124}, new int[]{1, 8, 176, 151}, new int[]{1, 9, 176, 151}, new int[]{1, 9, 176, 151}, new int[]{1, 10, 176, 151}, new int[]{1, 12, 200, 127}, new int[]{0}};

    /* renamed from: aa */
    private static int[] f234aa = {10000, 8000, 6000, 4000, 2000};

    /* renamed from: ab */
    private static int[] f235ab = {0, 1, 2, 1, 0};

    /* renamed from: f */
    private static boolean[] f236f = new boolean[10];

    /* renamed from: d */
    private static Image[] f237d = new Image[10];

    /* renamed from: c */
    private static Font f238c = Font.getFont(1896875008);

    /* renamed from: c */
    private static short[][] f239c = {new short[]{0, 0, 32, 32}, new short[]{32, 0, 32, 40}, new short[]{64, 0, 32, 32}, new short[]{96, 0, 32, 32}, new short[]{128, 0, 32, 32}, new short[]{160, 0, 32, 32}, new short[]{192, 0, 32, 32}, new short[]{224, 0, 32, 32}, new short[]{0, 40, 40, 32}, new short[]{40, 40, 40, 48}, new short[]{80, 40, 40, 48}, new short[]{120, 32, 32, 48}, new short[]{160, 32, 16, 64}, new short[]{176, 32, 40, 20}, new short[]{196, 32, 20, 20}, new short[]{176, 52, 20, 20}, new short[]{196, 52, 20, 20}};

    /* renamed from: d */
    private static String[] f240d = new String[51];

    /* renamed from: e */
    private static String[] f241e = new String[182];

    /* renamed from: f */
    private static String[] f242f = new String[120];

    /* renamed from: bh */
    private static int f243bh = 0;

    /* renamed from: d */
    private static final byte[][] f244d = {new byte[]{28, 31}, new byte[]{32, 29}, new byte[]{33, 29}, new byte[]{28, 34}, new byte[]{34, 30}, new byte[]{31, 30}, new byte[]{33, 33}, new byte[]{31, 31}};

    /* renamed from: o */
    private static final byte[] f245o = {36, 36, 38, 40, 42, 44, 42, 40, 38, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 2, 2, 2};

    /* renamed from: p */
    private static final byte[] f246p = {1, 2, 3, 2};

    /* renamed from: s */
    private static final int[][] f247s = {new int[]{0, 0, 48, 32, 0}, new int[]{0, 32, 48, 24, 3}, new int[]{0, 56, 48, 32, 0}, new int[]{0, 88, 48, 24, 3}, new int[]{0, 112, 48, 40, 4}, new int[]{0, 152, 48, 32, 7}};

    /* renamed from: d */
    private static final short[][] f248d = {new short[]{0, 0, 24, 40, 0}, new short[]{0, 40, 24, 40, 0}, new short[]{0, 80, 24, 40, 0}, new short[]{0, 120, 24, 40, 0}, new short[]{0, 160, 24, 40, 0}};

    /* renamed from: t */
    private static final int[][] f249t = {new int[]{0, 0, 24, 40, 0}, new int[]{0, 40, 24, 40, 0}, new int[]{0, 80, 24, 40, 0}, new int[]{0, 120, 24, 40, 0}};

    /* renamed from: u */
    private static final int[][] f250u = {new int[]{0, 0, 32, 32, 0}, new int[]{0, 32, 32, 32, 0}, new int[]{0, 64, 32, 40, -5}, new int[]{0, 104, 32, 48, -8}};

    /* renamed from: v */
    private static final int[][] f251v = {new int[]{0, 0, 40, 40, 0}, new int[]{0, 40, 40, 40, 0}, new int[]{0, 80, 40, 40, 0}};

    /* renamed from: w */
    private static final int[][] f252w = {new int[]{0, 0, 40, 24, 0}, new int[]{0, 24, 40, 32, 0}, new int[]{0, 56, 40, 32, 0}, new int[]{0, 88, 40, 32, 0}};

    /* renamed from: q */
    private static final byte[] f253q = {1, -1, -1};

    /* renamed from: r */
    private static final byte[] f254r = {1, -1, 0, -1, 2, -1, 3, -1, 4, -1, 1, -1, 0, -1, 2, -1, 3, -1, 4, -1};

    /* renamed from: s */
    private static final byte[] f255s = {0, 4, 1, 4};

    /* renamed from: e */
    private static final short[][] f256e = {new short[]{8, 0, 24, 16}, new short[]{0, 16, 40, 32}, new short[]{0, 48, 40, 32}, new short[]{0, 80, 40, 40}, new short[]{0, 120, 40, 40}};

    /* renamed from: f */
    private static final short[][] f257f = {new short[]{8, 0, 24, 16}, new short[]{0, 160, 40, 32}, new short[]{0, 192, 40, 32}, new short[]{0, 80, 40, 40}, new short[]{0, 120, 40, 40}};

    /* renamed from: g */
    private static final short[][] f258g = {new short[]{0, 0, 16, 16}, new short[]{0, 16, 16, 16}, new short[]{0, 32, 16, 16}, new short[]{0, 48, 16, 16}, new short[]{0, 64, 16, 16}, new short[]{0, 80, 16, 16}, new short[]{0, 96, 16, 16}, new short[]{0, 112, 16, 16}, new short[]{0, 128, 16, 16}, new short[]{0, 144, 16, 16}, new short[]{8, 160, 8, 8}, new short[]{8, 168, 8, 8}, new short[]{0, 160, 8, 8}, new short[]{0, 168, 8, 8}};

    /* renamed from: h */
    private static final short[][] f259h = {new short[]{0, 0}, new short[]{16, 0}, new short[]{0, 16}, new short[]{16, 16}};

    /* renamed from: i */
    private static final short[][] f260i = {new short[]{88, 56, 16, 16}, new short[]{64, 56, 24, 24}, new short[]{88, 72, 16, 16}, new short[]{88, 88, 16, 16}, new short[]{64, 80, 24, 24}};

    /* renamed from: ac */
    private static final int[] f261ac = {912, 224, 656, 672, 1360, -16};

    /* renamed from: x */
    private static final int[][] f262x = {new int[]{769600, 147200}, new int[]{775200, 128000}, new int[]{779200, 121600}, new int[]{779200, 25600}, new int[]{801200, 19200}};

    /* renamed from: l */
    private static short[][] f263l = new short[3][4];

    /* renamed from: m */
    private static short[][] f264m = new short[10][4];

    /* renamed from: bI */
    private static int f265bI = 0;

    /* renamed from: ad */
    private static int[] f266ad = new int[4];

    /* renamed from: y */
    private static int[][] f267y = new int[4][4];

    /* renamed from: ae */
    private static int[] f268ae = new int[4];

    /* renamed from: n */
    private static final short[][] f269n = {new short[]{-104, -159}, new short[]{24, -159}, new short[]{-40, 144}, new short[]{88, 144}};

    /* renamed from: bQ */
    private static int f270bQ = 0;

    /* renamed from: bR */
    private static int f271bR = 0;

    /* renamed from: bS */
    private static int f272bS = 0;

    /* renamed from: bT */
    private static int f273bT = 0;

    /* renamed from: bU */
    private static int f274bU = 0;

    /* renamed from: bV */
    private static int f275bV = 0;

    /* renamed from: bW */
    private static int f276bW = 0;

    /* renamed from: z */
    private static int[][] f277z = new int[6][4];

    /* renamed from: o */
    private static final short[][] f278o = {new short[]{0, 0, 64, 56}, new short[]{64, 0, 64, 56}, new short[]{0, 56, 128, 24}, new short[]{16, 80, 16, 16}, new short[]{0, 80, 16, 16}, new short[]{80, 80, 16, 16}, new short[]{64, 80, 16, 16}, new short[]{48, 80, 16, 16}, new short[]{32, 80, 16, 16}};

    /* renamed from: p */
    private static final short[][] f279p = {new short[]{0, 0, 64, 96}, new short[]{64, 0, 64, 96}, new short[]{128, 0, 64, 96}};

    /* renamed from: bX */
    private static int f280bX = 0;

    /* renamed from: ab */
    private static boolean f281ab = false;

    /* renamed from: q */
    private static final short[][] f282q = {new short[]{0, 112}, new short[]{0, 96}, new short[]{16, 128}, new short[]{16, 112}, new short[]{16, 96}, new short[]{0, 128}};

    /* renamed from: cd */
    private static int f283cd = 0;

    /* renamed from: u */
    private static final short[][] f284u = {new short[]{0, 120, 0}, new short[]{48, 120, 0}, new short[]{96, 120, 0}, new short[]{96, 120, 1}, new short[]{48, 120, 1}};

    /* renamed from: v */
    private static final short[][] f285v = {new short[]{48, 0}, new short[]{0, 32}, new short[]{48, 32}, new short[]{0, 32}};

    /* renamed from: g */
    private static boolean[] f286g = new boolean[256];

    /* renamed from: B */
    private static int[][] f287B = new int[6];

    /* renamed from: C */
    private static int[][] f288C = new int[6];

    /* renamed from: cj */
    private static int f289cj = -1;

    /* renamed from: a */
    private static AudioPresenter[] f290a = new AudioPresenter[4];

    /* renamed from: a */
    private static MediaSound[] f291a = new MediaSound[100];

    /* renamed from: J */
    public static final int[] f292J = {1, 3, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 0, 3};

    /* renamed from: K */
    public static int[] f293K = new int[4];

    /* renamed from: b */
    public static String[] f294b = new String[4];

    /* renamed from: a */
    public static short[] f295a = new short[256];

    /* renamed from: b */
    public static short[] f296b = new short[256];

    /* renamed from: e */
    private static Image[] f297e = new Image[10];

    /* renamed from: ck */
    private static int f298ck = 0;

    /* renamed from: cl */
    private static int f299cl = 24;

    /* renamed from: cm */
    private static int f300cm = 0;

    /* renamed from: cn */
    private static int f301cn = 0;

    /* renamed from: co */
    private static int f302co = 0;

    /* renamed from: ad */
    private static boolean f303ad = false;

    /* renamed from: h */
    private static boolean[] f304h = new boolean[6];

    /* renamed from: cp */
    private static int f305cp = 0;

    /* renamed from: cr */
    private static int f306cr = 128;

    /* renamed from: cs */
    private static int f307cs = 0;

    /* renamed from: L */
    public static int[] f308L = new int[20];

    /* renamed from: V */
    public static int f309V = -1;

    /* renamed from: a */
    public int f310a = 0;

    /* renamed from: a */
    public Random f311a = new Random();

    /* renamed from: b */
    private Image[] f312b = new Image[20];

    /* renamed from: c */
    private Image[] GFX_GameArray = new Image[150];

    /* renamed from: b */
    public int f314b = 0;

    /* renamed from: c */
    public int f315c = 0;

    /* renamed from: d */
    public int f316d = 0;

    /* renamed from: e */
    public int f317e = 0;

    /* renamed from: f */
    public int f318f = 1;

    /* renamed from: g */
    public int f319g = 1;

    /* renamed from: e */
    private boolean[] f320e = new boolean[4];

    /* renamed from: h */
    public int f321h = 0;

    /* renamed from: i */
    public int f322i = 0;

    /* renamed from: j */
    public int f323j = 0;

    /* renamed from: k */
    public int f324k = 0;

    /* renamed from: b */
    public boolean f325b = false;

    /* renamed from: c */
    public final int[] f326c = {f211b[0], f211b[0], f211b[0], f211b[4]};

    /* renamed from: d */
    public final int[] f327d = {0, 16, 32, 16};

    /* renamed from: j */
    private byte[] f328j = new byte[21248];

    /* renamed from: k */
    private byte[] f329k = new byte[21248];

    /* renamed from: l */
    private byte[] f330l = new byte[21248];

    /* renamed from: m */
    private byte[] f331m = new byte[21248];

    /* renamed from: c */
    private int[][][] f332c = new int[20][20][4];

    /* renamed from: Z */
    private int[] f333Z = {0, 4, 6, 2};

    /* renamed from: n */
    public int f334n = 0;

    /* renamed from: o */
    public int f335o = 0;

    /* renamed from: p */
    public int f336p = 0;

    /* renamed from: q */
    public int f337q = 0;

    /* renamed from: X */
    private boolean f338X = false;

    /* renamed from: aJ */
    private int f339aJ = 10;

    /* renamed from: p */
    private int[][] f340p = new int[this.f339aJ][15];

    /* renamed from: aM */
    private int f341aM = 0;

    /* renamed from: aN */
    private int f342aN = 1;

    /* renamed from: aO */
    private int f343aO = 2;

    /* renamed from: aP */
    private int f344aP = 3;

    /* renamed from: aQ */
    private int f345aQ = 4;

    /* renamed from: aR */
    private int f346aR = 7;

    /* renamed from: aS */
    private int f347aS = 8;

    /* renamed from: aT */
    private int f348aT = 9;

    /* renamed from: aU */
    private int f349aU = 10;

    /* renamed from: aV */
    private int f350aV = 11;

    /* renamed from: aW */
    private int f351aW = 12;

    /* renamed from: aX */
    private int f352aX = 14;

    /* renamed from: aY */
    private int f353aY = 15;

    /* renamed from: aZ */
    private int f354aZ = 16;

    /* renamed from: c */
    public final int[][] f355c = {new int[]{0, 0, 112, 16}, new int[]{112, 0, 56, 16}, new int[]{0, 16, 80, 16}, new int[]{80, 16, 48, 16}, new int[]{128, 16, 8, 16}, new int[]{136, 16, 16, 16}, new int[]{152, 16, 16, 16}, new int[]{0, 32, 128, 16}, new int[]{128, 32, 24, 8}, new int[]{0, 48, 128, 16}, new int[]{128, 40, 40, 40}, new int[]{0, 64, 120, 16}, new int[]{0, 80, 104, 16}, new int[]{104, 80, 40, 40}, new int[]{0, 96, 104, 16}, new int[]{0, 112, 72, 16}, new int[]{0, 128, 152, 16}, new int[]{0, 144, 176, 16}, new int[]{0, 160, 208, 16}};

    /* renamed from: e */
    public final int[] f356e = {this.f341aM, this.f343aO, this.f346aR, this.f351aW, this.f350aV, this.f348aT, this.f342aN};

    /* renamed from: r */
    public int f357r = 0;

    /* renamed from: k */
    public boolean f358k = false;

    /* renamed from: l */
    public boolean f359l = false;

    /* renamed from: s */
    public int f360s = 0;

    /* renamed from: t */
    public int f361t = 0;

    /* renamed from: w */
    public int f362w = 0;

    /* renamed from: x */
    public int f363x = 2100;

    /* renamed from: y */
    public int f364y = 0;

    /* renamed from: z */
    public int f365z = 0;

    /* renamed from: A */
    public int f366A = 10;

    /* renamed from: a */
    public short[][] f367a = {new short[]{9312, 7776}, new short[]{6736, 4176, 8208}, new short[]{6224, 6224}, new short[]{8288, 8032}, new short[]{8800, 10336}, new short[]{8544, 7648}};

    /* renamed from: f */
    public int[] f368f = new int[4];

    /* renamed from: B */
    public int f369B = 0;

    /* renamed from: p */
    public boolean f370p = false;

    /* renamed from: C */
    public int f371C = 0;

    /* renamed from: D */
    public int f372D = 0;

    /* renamed from: Z */
    private boolean f373Z = false;

    /* renamed from: E */
    public int f374E = 0;

    /* renamed from: F */
    public int f375F = 0;

    /* renamed from: u */
    public boolean f376u = false;

    /* renamed from: v */
    public boolean f377v = false;

    /* renamed from: G */
    public int f378G = -240;

    /* renamed from: H */
    public int f379H = 640;

    /* renamed from: I */
    public int f380I = 0;

    /* renamed from: J */
    public int f381J = 0;

    /* renamed from: d */
    public int[][] f382d = new int[30][25];

    /* renamed from: bd */
    private int f383bd = 0;

    /* renamed from: be */
    private int f384be = 0;

    /* renamed from: bf */
    private int f385bf = 0;

    /* renamed from: e */
    private byte f386e = 0;

    /* renamed from: L */
    public int f387L = 0;

    /* renamed from: g */
    public final int[] f388g = {8, 8, 16, 16, 24, 32, 32, 32};

    /* renamed from: h */
    public final int[] f389h = {0, 8, 16, 32, 48, 72, 104, 136};

    /* renamed from: w */
    public boolean f390w = false;

    /* renamed from: aa */
    private boolean f391aa = false;

    /* renamed from: bi */
    private int f392bi = 0;

    /* renamed from: bj */
    private int f393bj = 0;

    /* renamed from: bk */
    private int f394bk = 0;

    /* renamed from: bl */
    private int f395bl = 0;

    /* renamed from: M */
    public int f396M = 5;

    /* renamed from: j */
    private final short[][] f397j = {new short[]{-250, -360}, new short[]{-80, -100}, new short[]{-160, -250}, new short[]{-200, -300}, new short[]{-120, -225}, new short[]{-150, -250}, new short[]{-100, -165}};

    /* renamed from: k */
    private final short[][] f398k = {new short[]{0, 0, 16, 24, 0}, new short[]{16, 0, 16, 16, 8}, new short[]{32, 0, 16, 16, 8}, new short[]{0, 24, 16, 24, 0}, new short[]{16, 16, 16, 16, 8}, new short[]{32, 16, 16, 16, 8}, new short[]{0, 48, 16, 24, 0}, new short[]{16, 32, 16, 16, 8}, new short[]{32, 32, 16, 16, 8}, new short[]{0, 72, 16, 24, 0}, new short[]{16, 48, 16, 24, 0}, new short[]{32, 48, 16, 24, 0}, new short[]{0, 96, 16, 24, 0}, new short[]{16, 72, 16, 24, 0}, new short[]{32, 72, 16, 24, 0}, new short[]{16, 96, 16, 24, 0}, new short[]{0, 120, 24, 16, 8}, new short[]{0, 136, 24, 16, 8}, new short[]{32, 96, 16, 24, 0}, new short[]{24, 120, 24, 16, 8}, new short[]{24, 136, 24, 16, 8}};

    /* renamed from: r */
    private final short[][] f399r = {new short[]{0, 0, 48, 56}, new short[]{0, 56, 48, 56}, new short[]{0, 112, 48, 56}, new short[]{0, 168, 48, 56}, new short[]{48, 0, 64, 56}, new short[]{48, 56, 64, 56}, new short[]{48, 112, 64, 56}, new short[]{48, 168, 64, 56}};

    /* renamed from: s */
    private final short[][] f400s = {new short[]{0, 0, 56, 24, 0, -36}, new short[]{0, 24, 56, 24, 0, -36}, new short[]{0, 48, 56, 24, 0, -36}, new short[]{0, 72, 56, 24, 0, -36}, new short[]{0, 96, 56, 24, 0, -36}, new short[]{0, 120, 56, 24, 0, -36}, new short[]{0, 144, 56, 24, 0, -36}, new short[]{0, 168, 56, 24, 0, -36}, new short[]{56, 48, 64, 32, 4, -8}, new short[]{56, 80, 64, 32, 4, -8}, new short[]{56, 64, 64, 48, 4, -8}, new short[]{56, 112, 16, 16, 42, -10}, new short[]{56, 128, 16, 16, 42, -10}, new short[]{56, 144, 24, 16, 46, -10}, new short[]{56, 160, 32, 32, 52, -10}, new short[]{88, 112, 16, 16, 0, 16}, new short[]{88, 128, 16, 16, 0, 16}, new short[]{88, 144, 16, 16, 0, 0}, new short[]{104, 112, 16, 8, 18, -42}, new short[]{104, 128, 16, 16, 0, 10}, new short[]{104, 144, 16, 40, 0, 10}, new short[]{56, 0, 56, 24, 0, -36}, new short[]{56, 24, 56, 24, 0, -36}};

    /* renamed from: t */
    private final short[][] f401t = {new short[]{0, 0, 64, 48, 4, 0}, new short[]{0, 48, 64, 40, 4, -4}, new short[]{0, 88, 64, 32, 4, -8}, new short[]{0, 120, 64, 32, 4, -8}};

    /* renamed from: c */
    private final short[] f402c = {0, 0, 48, 48, 0, 0};

    /* renamed from: i */
    public final int[] f403i = {64, 32, 64};

    /* renamed from: j */
    public final int[] f404j = {1296, 3632, 752, 4880};

    /* renamed from: k */
    public final int[] f405k = {1168, 1104, 1680, 1360};

    /* renamed from: l */
    public final int[] f406l = {1263, 3598, 785, 4845};

    /* renamed from: m */
    public final int[] f407m = {1216, 1136, 1728, 1392};

    /* renamed from: n */
    public final int[] f408n = {-1, -1, 1, -1};

    /* renamed from: o */
    public final int[] f409o = {4, 7, 5, 6, 0, 3, 2, 1};

    /* renamed from: p */
    public final int[] f410p = {0, 5, 8, 17, 20, 28, 32, 34};

    /* renamed from: t */
    public int[] f411t = {-24, -47, -47, -46, -23, 1, 9, 1};

    /* renamed from: u */
    public int[] f412u = {-47, -46, -24, 1, 8, 1, -23, -46};

    /* renamed from: e */
    public final int[][] f413e = {new int[]{1, 0}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}};

    /* renamed from: g */
    public int[][] f414g = new int[20][2];

    /* renamed from: h */
    public int[][] f415h = new int[20][2];

    /* renamed from: x */
    public boolean f416x = false;

    /* renamed from: w */
    public final int[] Score_HiddenBonuses = {0, 10000, 1000, 100};

    /* renamed from: y */
    public boolean f418y = false;

    /* renamed from: x */
    public final int[] f419x = {-8, -16, -12, 12, 16, 8};

    /* renamed from: y */
    public final int[] f420y = {22, 25, 13, 22, 25, 13};

    /* renamed from: z */
    public final int[] f421z = {48, 32, 16, 32};

    /* renamed from: A */
    public final int[] f422A = {2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};

    /* renamed from: i */
    public final int[][] f423i = {new int[]{-1, 1}, new int[]{1, -1}};

    /* renamed from: B */
    public final int[] f424B = {40, 40, 16, 16, 0};

    /* renamed from: j */
    public final int[][] f425j = {new int[]{0, 4}, new int[]{4, 0}, new int[]{2, 6}, new int[]{0, 0}};

    /* renamed from: k */
    public final int[][] f426k = {new int[]{2, 6}, new int[]{2, 6}, new int[]{4, 0}, new int[]{2, 6}};

    /* renamed from: C */
    public final int[] f427C = {8, 0, 4, 3, 2, 1, 0};

    /* renamed from: D */
    public final int[] f428D = {f211b[0], f211b[1], f211b[7], f211b[4]};

    /* renamed from: E */
    public final int[] f429E = {8, 0, 40, 24, 10, 40, 30, 24, 41, 6};

    /* renamed from: F */
    public final int[] f430F = {8, 16, 8, 30, 23, 24, 18, 16, 18, 8};

    /* renamed from: G */
    public final int[] f431G = {0, 32, 64, 96, 128, 168, 208};

    /* renamed from: H */
    public final int[] f432H = {0, 6, 6, 4, 10, 2, 6, 4};

    /* renamed from: a */
    public long[] f433a = new long[4];

    /* renamed from: I */
    public int[] f434I = new int[4];

    /* renamed from: N */
    public int f435N = 0;

    /* renamed from: a */
    public StorageDevice f436a = null;

    /* renamed from: a */
    public DoJaAccessToken f437a = null;

    /* renamed from: a */
    public final byte[] f438a = {3, 45, -91, -22, 13, 80, 48, 85, -71, -39, -20, -88, 44, -90, 33, -34, 81, -37, 53, -7, -119, 65, 32, 92, -83, 31, 65, -51, -64, 79, 61, 72};

    /* renamed from: b */
    public byte[] f439b = new byte[294150];

    /* renamed from: z */
    public boolean f440z = false;

    /* renamed from: A */
    public boolean f441A = false;

    /* renamed from: P */
    public int f442P = 0;

    /* renamed from: l */
    public final int[][] f443l = {new int[]{0, 1, 2, 1, 1, 0, 0, 0, 4, 0}, new int[]{0, 0, 2, 0, 4, 0, 0, 0, 4, 0}, new int[]{1, 0, 4, 0, 0, 1, 2, 1, 4, 0}, new int[]{0, 48}, new int[]{48, 40}, new int[]{88, 32}, new int[]{120, 24}};

    /* renamed from: a */
    public final int[][][] f444a = {new int[]{new int[]{40, 24, 16}, new int[]{40, 24, 16}, new int[]{48, 24, 8, 16}}, new int[]{new int[]{8, 2, 4, -1, 2, 3}, new int[]{8, -1, 4, 2, 2, 3}, new int[]{8, -3, 4, 2, 2, 3, 2, -1}}, new int[]{new int[]{0, 32}, new int[]{32, 16}, new int[]{48, 8}}};

    /* renamed from: ai */
    private void m316ai() {
        if (this.f320e[0] && this.f320e[3]) {
            m482H();
        } else if ((!f196L || f33D) && this.f320e[3]) {
            m482H();
        } else if (this.f314b == 2 || this.f314b == 4) {
            if (!f34E && f33D && m272b(m280b() - 8, m204c() - 24) && m272b(m280b() + 8, m204c() - 24)) {
                m482H();
            }
        } else if (!f34E && f33D && (m272b(m280b() - 8, m204c() - 24) || m272b(m280b() + 8, m204c() - 24))) {
            m482H();
        }
        this.f320e[0] = false;
        this.f320e[3] = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f318f = 0;
        while (true) {
            if (f38ay != -1 && f38ay != -4) {
                this.f318f = 0;
                return;
            }
            m54n();
            try {
                Thread.sleep(50L);
            } catch (Throwable unused) {
            }
            this.f318f += 6;
        }
    }

    /* renamed from: a */
    public final void m433a() {
        new Thread(this).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v108, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r1v110, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r1v114, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r1v116, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r1v118, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r1v145, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v163, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v167, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v169, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v197, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v199, types: [int[][], int[][][]] */
    /* JADX WARN: Type inference failed for: r1v59, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v73, types: [short[], short[][]] */
    public Game(Main main) {
        short[] sArr = {new short[]{0, 0, 48, 56}, new short[]{0, 56, 48, 56}};
        int[] iArr = {40, 48, 48};
    }

    /* renamed from: b */
    public final void m279b() {
        PhoneSystem.setAttribute(0, 1);
        f166c[0] = false;
        f166c[1] = false;
        f166c[2] = false;
        f166c[3] = false;
        f166c[4] = false;
        f166c[5] = false;
        f166c[6] = false;
        f166c[9] = false;
        if (this.f338X) {
            m493D(20);
        } else if (this.f390w) {
            if (f120bY < 18) {
                m493D(16);
            }
        } else if (this.f418y) {
        } else {
            if (f38ay == 1) {
                if (f82s == f221j || f82s == f222k) {
                    m493D(15);
                }
            } else if (f38ay == 10 || f38ay == 11) {
                this.f45a = true;
            } else if (f38ay == 2) {
                if (!m406a(1, f214a[5])) {
                    m438Y();
                    return;
                }
                f38ay = 10;
                this.f54c = true;
                this.f55l = 10;
                this.f321h = 0;
                this.f322i = 0;
                this.f45a = true;
            } else if (f38ay != 7) {
                if (f38ay != 6) {
                    if (f38ay == 4) {
                        m438Y();
                    }
                } else if (f283cd < 1 || f283cd > 4) {
                } else {
                    m493D(22);
                }
            } else if (!m406a(1, f214a[5])) {
                if (this.f441A) {
                    return;
                }
                Music_Play("89", -1, 14, 0);
            } else {
                f38ay = 11;
                this.f54c = true;
                this.f55l = 10;
                this.f321h = 0;
                this.f322i = 0;
                this.f45a = true;
            }
        }
    }

    /* renamed from: c */
    public final void m203c() {
        f166c[0] = false;
        f166c[1] = false;
        f166c[2] = false;
        if (f38ay != 2 && f38ay != 7 && f38ay != 10 && f38ay != 11) {
            f166c[3] = false;
            f166c[4] = false;
        }
        f166c[5] = false;
        f166c[6] = false;
        f166c[9] = false;
    }

    public final void processEvent(int i, int i2) {
        if (i == 1) {
            if (i2 == 20 || i2 == 5) {
                f166c[0] = false;
            } else if (i2 == 19 || i2 == 8) {
                f166c[1] = false;
            } else if (i2 == 16 || i2 == 4) {
                f166c[3] = false;
            } else if (i2 == 18 || i2 == 6) {
                f166c[4] = false;
            } else if (i2 == 17 || i2 == 2) {
                f166c[2] = false;
            } else if (i2 == 11) {
                f166c[9] = false;
            }
        }
        if (i == 0) {
            if ((f203S && f38ay == 2) || this.f390w) {
                return;
            }
            if (i2 == 20 || i2 == 5) {
                f166c[0] = true;
            } else if (i2 == 19 || i2 == 8) {
                f166c[1] = true;
            } else if (i2 == 16 || i2 == 4) {
                f166c[3] = true;
            } else if (i2 == 18 || i2 == 6) {
                f166c[4] = true;
            } else if (i2 == 17 || i2 == 2) {
                f166c[2] = true;
            } else if (i2 == 11) {
                f166c[9] = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v201, types: [int[][], int[][][]] */
    /* renamed from: d */
    public final void m134d() {
        boolean z = false;
        try {
            f9a = getGraphics();
            f43az = (20 - f163b.getHeight()) / 2;
            m402a(f163b);
        } catch (Throwable unused) {
        }
        try {
            f8a = Connector.openDataInputStream("scratchpad:///0;pos=0,length=4");
            int readInt = f8a.readInt();
            f8a.close();
            if (readInt != 102) {
                f38ay = -4;
                m433a();
                m448T();
                z = true;
            }
            f8a = Connector.openDataInputStream("scratchpad:///0;pos=4");
            int readInt2 = f8a.readInt();
            int readInt3 = f8a.readInt();
            f6N = new int[readInt3 + 1];
            for (int i = 0; i < readInt3; i++) {
                f6N[i] = f8a.readInt();
            }
            f8a.close();
            f6N[readInt3] = readInt2 + 8;
            System.gc();
            System.gc();
            System.gc();
        } catch (Throwable unused2) {
        }
        try {
            f38ay = -1;
            if (!z) {
                m433a();
            }
            f290a[0] = AudioPresenter.getAudioPresenter(0);
            f290a[1] = AudioPresenter.getAudioPresenter(1);
            f290a[2] = AudioPresenter.getAudioPresenter(2);
            f290a[3] = AudioPresenter.getAudioPresenter(3);
            f1a = f290a[0].getAudio3D();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[35]).append(",length=").append(f6N[36] - f6N[35]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[3] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[36]).append(",length=").append(f6N[37] - f6N[36]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[4] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[48]).append(",length=").append(f6N[49] - f6N[48]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[5] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[47]).append(",length=").append(f6N[48] - f6N[47]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[11] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[61]).append(",length=").append(f6N[62] - f6N[61]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[6] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[63]).append(",length=").append(f6N[64] - f6N[63]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[7] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[64]).append(",length=").append(f6N[65] - f6N[64]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[8] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[62]).append(",length=").append(f6N[63] - f6N[62]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[9] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[41]).append(",length=").append(f6N[42] - f6N[41]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[10] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[31]).append(",length=").append(f6N[32] - f6N[31]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[14] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[57]).append(",length=").append(f6N[58] - f6N[57]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[15] = f4a.getImage();
            m96g();
            m83i();
            m71k();
            try {
                f290a[0].setAttribute(4, 0);
                f290a[1].setAttribute(4, 0);
                f290a[2].setAttribute(4, 0);
                f290a[3].setAttribute(4, 0);
            } catch (Throwable unused3) {
            }
            for (int i2 = 0; i2 < 30; i2++) {
                m493D(i2);
                f293K = new int[4];
                f294b = new String[4];
            }
            for (int i3 = 0; i3 < 4; i3++) {
                try {
                    f290a[i3].stop();
                } catch (Throwable unused4) {
                }
            }
            f293K = new int[4];
            f294b = new String[4];
            m440X();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[49]).append(",length=").append(f6N[50] - f6N[49]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[12] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[50]).append(",length=").append(f6N[51] - f6N[50]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.f312b[13] = f4a.getImage();
            f174B = true;
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=288404,length=76076");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            for (int i4 = 0; i4 < 60; i4++) {
                try {
                    if (f291a[40 + i4] == null) {
                        byte[] bArr = new byte[(int) this.f143a.getSize(new StringBuffer().append(Integer.toHexString(160 + i4)).append(".mld").toString())];
                        MainInputStream = this.f143a.getInputStream(new StringBuffer().append(Integer.toHexString(160 + i4)).append(".mld").toString());
                        MainInputStream.read(bArr);
                        MainInputStream.close();
                        f291a[40 + i4] = MediaManager.getSound(bArr);
                        f291a[40 + i4].use();
                    }
                } catch (Throwable unused5) {
                }
            }
            this.f143a.close();
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("objsize.bin");
            int read = (short) ((MainInputStream.read() << 8) | MainInputStream.read());
            f44b = new short[read][2];
            for (int i5 = 0; i5 < read; i5++) {
                f44b[i5][0] = (short) ((MainInputStream.read() << 8) | MainInputStream.read());
                f44b[i5][1] = (short) ((MainInputStream.read() << 8) | MainInputStream.read());
            }
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("sincosTbl.bin");
            for (int i6 = 0; i6 < 256; i6++) {
                f296b[i6] = (short) ((MainInputStream.read() << 8) | MainInputStream.read());
            }
            for (int i7 = 0; i7 < 256; i7++) {
                f295a[i7] = (short) ((MainInputStream.read() << 8) | MainInputStream.read());
            }
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("etcdata.bin");
            byte[] bArr2 = new byte[(int) this.f143a.getSize("etcdata.bin")];
            MainInputStream.read(bArr2);
            MainInputStream.close();
            this.f143a.close();
            f8a = new DataInputStream(new ByteArrayInputStream(bArr2));
            f42b = new int[f8a.readUnsignedByte()];
            for (int i8 = 0; i8 < f42b.length; i8++) {
                f42b[i8] = new int[f8a.readUnsignedByte()];
                for (int i9 = 0; i9 < f42b[i8].length; i9++) {
                    f42b[i8][i9] = new int[f8a.readUnsignedByte()];
                    for (int i10 = 0; i10 < f42b[i8][i9].length; i10++) {
                        f42b[i8][i9][i10] = f8a.readInt();
                    }
                }
            }
            f8a.close();
            this.f131q = f42b[39][0];
            this.f132r = f42b[39][1];
            this.f133s = f42b[39][2];
            this.f134f = f42b[33];
            f136A = f42b[31];
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("scddirtbl.blt");
            MainInputStream.read(f188h);
            MainInputStream.close();
            this.f143a.close();
            f38ay = 1;
            this.f54c = true;
            this.f55l = 10;
            m288aw();
            f3a = f9a;
            m125d(true);
            f10Y = 0;
        } catch (Throwable unused6) {
        }
    }

    /* renamed from: e */
    public final void m115e() {
        int i = 0;
        int i2 = 0;
        long j = 0;
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (j > currentTimeMillis2) {
                j = currentTimeMillis2;
                currentTimeMillis = 0;
            } else {
                j = currentTimeMillis2;
            }
            if (currentTimeMillis > j) {
                try {
                    Thread.sleep(currentTimeMillis - j);
                } catch (Exception unused) {
                }
                j = System.currentTimeMillis();
                i = 0;
            } else {
                i++;
                if (i > 1) {
                    i = 0;
                } else if (i2 != 0) {
                    i = 0;
                }
            }
            if (this.f310a > 0) {
                int i3 = this.f310a - 1;
                this.f310a = i3;
                if (i3 <= 0) {
                    PhoneSystem.setAttribute(1, 0);
                }
            }
            m59m();
            if (i <= 0) {
                m54n();
                currentTimeMillis = j + 56;
            } else if (f38ay != 2 || this.f390w) {
                m54n();
                currentTimeMillis = j + 56;
            } else {
                if (f19ah > 0) {
                    f19ah--;
                    if (f19ah % 2 == 0) {
                        this.f59f = true;
                    } else {
                        this.f59f = false;
                    }
                } else {
                    this.f59f = false;
                }
                this.f318f++;
            }
            i2++;
            if (i2 > 7) {
                i2 = 0;
            }
        }
    }

    /* renamed from: f */
    public final void m103f() {
        try {
            try {
                f7a.close();
            } catch (Throwable unused) {
            }
            f7a = Connector.openDataOutputStream("scratchpad:///0;pos=409595,length=4");
            for (int i = 0; i < f231n.length; i++) {
                f7a.writeByte(f231n[i]);
            }
            f7a.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: g */
    public final void m96g() {
        try {
            try {
                f8a.close();
            } catch (Throwable unused) {
            }
            f8a = Connector.openDataInputStream("scratchpad:///0;pos=409595,length=4");
            for (int i = 0; i < f231n.length; i++) {
                f231n[i] = (byte) (f8a.readByte() & 255);
            }
            f8a.close();
        } catch (Throwable unused2) {
            f230x = (byte) 1;
            f231n = new byte[4];
            f231n[0] = 1;
            f231n[1] = 3;
            f231n[2] = 1;
            m103f();
        }
    }

    /* renamed from: h */
    public final void m89h() {
        try {
            try {
                f7a.close();
            } catch (Throwable unused) {
            }
            f7a = Connector.openDataOutputStream("scratchpad:///0;pos=409579,length=16");
            f7a.writeByte(this.f46b);
            f7a.writeByte(this.f47c);
            f7a.writeInt(this.f48aB);
            for (int i = 0; i < 6; i++) {
                f7a.writeBoolean(f304h[i]);
            }
            f7a.writeInt(f298ck);
            f7a.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: i */
    public final void m83i() {
        try {
            try {
                f8a.close();
            } catch (Throwable unused) {
            }
            f8a = Connector.openDataInputStream("scratchpad:///0;pos=409579,length=16");
            this.f46b = (byte) (f8a.readByte() & 255);
            this.f47c = (byte) (f8a.readByte() & 255);
            this.f48aB = f8a.readInt();
            for (int i = 0; i < 6; i++) {
                f304h[i] = f8a.readBoolean();
            }
            f298ck = f8a.readInt();
            f8a.close();
        } catch (Throwable unused2) {
            m89h();
        }
    }

    /* renamed from: j */
    public final void m77j() {
        try {
            try {
                f7a.close();
            } catch (Throwable unused) {
            }
            f7a = Connector.openDataOutputStream("scratchpad:///0;pos=409554,length=25");
            for (int i = 0; i < 5; i++) {
                f7a.writeByte((byte) f235ab[i]);
                f7a.writeInt(f234aa[i]);
            }
            f7a.close();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: k */
    public final void m71k() {
        try {
            try {
                f8a.close();
            } catch (Throwable unused) {
            }
            f8a = Connector.openDataInputStream("scratchpad:///0;pos=409554,length=25");
            for (int i = 0; i < 5; i++) {
                f235ab[i] = (byte) (f8a.readByte() & 255);
                f234aa[i] = f8a.readInt();
            }
            f8a.close();
        } catch (Throwable unused2) {
            m77j();
        }
    }

    /* renamed from: l */
    public final void m65l() {
        if (this.f391aa) {
            m407a(0, (String) null);
            m407a(1, (String) null);
        } else if (f38ay == 1) {
            if (f82s == f221j || f82s == f222k) {
                m407a(0, f214a[f231n[1] + 21]);
            }
        } else {
            if (f38ay >= 12 || f38ay == -4 || f38ay == 3 || f38ay == 8 || f38ay == 6 || f38ay == 4 || f38ay == 2 || f38ay == 7) {
                m407a(0, (String) null);
            } else {
                m407a(0, f214a[f231n[1] + 21]);
            }
            if (f38ay == 8) {
                if (this.f323j == 0) {
                    m407a(1, f214a[11]);
                } else if (this.f323j == 1) {
                    m407a(1, (String) null);
                } else if (this.f323j == 2) {
                    m407a(1, f214a[11]);
                } else if (this.f323j == 3) {
                    m407a(1, f214a[2]);
                } else if (this.f323j == 4) {
                    m407a(1, f214a[2]);
                }
            } else if (f38ay == 2) {
                if ((f28aq <= 0 && f199O) || this.f416x || this.f390w) {
                    m407a(1, (String) null);
                } else {
                    m407a(1, f214a[5]);
                }
            } else if (f38ay == 7) {
                m407a(1, f214a[5]);
            } else if (f38ay == 10) {
                m407a(1, f214a[6]);
            } else if (f38ay == 11) {
                m407a(1, f214a[6]);
            } else if (f38ay == 6) {
                m407a(1, f214a[11]);
            } else if (f38ay == 3) {
                m407a(1, f214a[4]);
            } else if (f38ay == 4) {
                m407a(1, (String) null);
            }
        }
    }

    /* renamed from: a */
    public final boolean m432a() {
        try {
            int i = -1;
            f52aE = f51aD;
            f51aD = f50aC | getKeypadState();
            f53aF = f51aD & (f52aE ^ (-1));
            if ((f53aF & 2097152) != 0) {
                f166c[5] = true;
            } else {
                f166c[5] = false;
            }
            if ((f53aF & 4194304) != 0) {
                f166c[6] = true;
            } else {
                f166c[6] = false;
            }
            if (f166c[5]) {
                f166c[5] = false;
                i = 0;
            } else if (f166c[6]) {
                if (f38ay == 1) {
                    return false;
                }
                f166c[6] = false;
                i = 1;
            }
            if (i != -1) {
                if (m406a(i, f214a[4])) {
                    if (f38ay != 3) {
                        f38ay = 1;
                        this.f54c = true;
                        this.f55l = 10;
                        m39q();
                        m125d(false);
                        return true;
                    }
                    f38ay = 1;
                    this.f54c = true;
                    this.f55l = 10;
                    m39q();
                    this.f325b = true;
                    m125d(false);
                    f82s = f222k;
                    f85v = (byte) 1;
                    m487F(7 + f85v);
                    m496C(2);
                    return true;
                } else if (m406a(i, f214a[5])) {
                    if (f38ay == 2) {
                        f38ay = 10;
                    } else {
                        f38ay = 11;
                    }
                    this.f54c = true;
                    this.f55l = 10;
                    this.f321h = 0;
                    this.f322i = 0;
                    m444V();
                    this.f45a = false;
                    return true;
                } else if (m406a(i, f214a[6])) {
                    m103f();
                    if (f38ay == 10) {
                        f38ay = 2;
                    } else {
                        f38ay = 7;
                    }
                    this.f54c = true;
                    this.f55l = 10;
                    if (!this.f45a) {
                        m442W();
                        return true;
                    }
                    if (f38ay == 2) {
                        m438Y();
                    } else {
                        Music_Play("89", -1, 14, 0);
                    }
                    this.f45a = false;
                    return true;
                } else if (m406a(i, f214a[11])) {
                    f38ay = 1;
                    this.f54c = true;
                    this.f55l = 10;
                    m39q();
                    m446U();
                    m125d(true);
                    return true;
                } else if (m406a(i, f214a[2])) {
                    if (f38ay == 8) {
                        IApplication.getCurrentApp().terminate();
                        return true;
                    }
                    f82s = f229r;
                    return true;
                } else if (m406a(i, f214a[21]) || m406a(i, f214a[22]) || m406a(i, f214a[23]) || m406a(i, f214a[24])) {
                    f231n[1] = (byte) ((f231n[1] + 3) % 4);
                    m103f();
                    m440X();
                    this.f54c = true;
                    this.f55l = 10;
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public final void m59m() {
        try {
            if (m432a()) {
                m203c();
                return;
            }
            if (f38ay == 1) {
                m308am();
            } else if (f38ay == 8) {
                if (this.f323j == 0) {
                    if (f166c[0]) {
                        m203c();
                        this.f68j = false;
                        m25t();
                    }
                } else if (this.f323j == 1) {
                    if (f166c[0]) {
                        m203c();
                        if (this.f324k == 0) {
                            int m135d = m135d();
                            if (m135d == 0) {
                                f38ay = -4;
                                m433a();
                                m384a(m431a());
                                f175C = true;
                                m25t();
                                this.f54c = true;
                                this.f55l = 10;
                            } else if (m135d == 1) {
                                this.f323j = 0;
                                this.f68j = false;
                                this.f54c = true;
                                this.f55l = 10;
                            } else {
                                this.f323j = 3;
                                this.f54c = true;
                                this.f55l = 10;
                            }
                        } else {
                            this.f323j = 2;
                            this.f54c = true;
                            this.f55l = 10;
                        }
                    } else if (f166c[1]) {
                        m203c();
                        this.f324k = (this.f324k + 1) & 1;
                    } else if (f166c[2]) {
                        m203c();
                        this.f324k = (this.f324k + 1) & 1;
                    }
                } else if (this.f323j != 2 && this.f323j != 3) {
                }
            } else if (f38ay == 7) {
                m328ac();
            } else if (f38ay == 10 || f38ay == 11) {
                this.f372D = 0;
                if (f166c[0]) {
                    m103f();
                    if (this.f322i == 0) {
                        m203c();
                        if (f38ay == 10) {
                            f38ay = 2;
                        } else {
                            f38ay = 7;
                        }
                        this.f54c = true;
                        this.f55l = 10;
                        if (this.f45a) {
                            if (f38ay == 2) {
                                m438Y();
                            } else {
                                Music_Play("89", -1, 14, 0);
                            }
                            this.f45a = false;
                        } else {
                            m442W();
                        }
                    } else {
                        f38ay = 1;
                        this.f54c = true;
                        this.f55l = 10;
                        m39q();
                        m125d(true);
                    }
                    m203c();
                } else if (f166c[1]) {
                    m203c();
                    this.f322i = (this.f322i + 1) & 1;
                } else if (f166c[2]) {
                    m203c();
                    this.f322i = (this.f322i + 1) & 1;
                }
            } else if (f38ay == 3) {
                if (f166c[0]) {
                    this.f314b = f212a[this.f316d][this.f317e];
                    this.f315c = f213b[this.f316d][this.f317e];
                    f28aq = 3;
                    f24am = 0;
                    f175C = true;
                    m25t();
                } else if (f166c[4]) {
                    m203c();
                    this.f317e = (this.f317e + 1) % 3;
                    if (this.f317e == 0) {
                        this.f316d++;
                    }
                    if (this.f316d == 6) {
                        if (this.f317e > 0) {
                            this.f316d = 0;
                            this.f317e = 0;
                        }
                    } else if (this.f316d > 6) {
                        this.f316d = 0;
                        this.f317e = 0;
                    }
                } else if (f166c[3]) {
                    m203c();
                    this.f317e = (this.f317e + 2) % 3;
                    if (this.f317e == 2) {
                        this.f316d--;
                        if (this.f316d < 0) {
                            this.f316d = 6;
                            this.f317e = 0;
                        }
                    }
                }
                if (this.f316d == 6) {
                    this.f317e = 0;
                }
            } else if (f38ay == 2) {
                f178S[0] = f177R[0];
                f178S[1] = f177R[1];
                for (int i = 0; i < 4; i++) {
                    f34E = false;
                    f22ak = f23al;
                    if (this.f390w) {
                        this.f54c = true;
                        this.f55l = 10;
                        m203c();
                        m363aH();
                    }
                    if (this.f416x) {
                        this.f54c = true;
                        this.f55l = 10;
                        f205U = true;
                    }
                    f170P[0] = m280b();
                    f170P[1] = m204c() - 1;
                    f215bb = 0;
                    f216bc = 0;
                    f79Y = false;
                    this.f370p = false;
                    this.f73o = false;
                    try {
                        m9x();
                        if (!f199O) {
                            m476J();
                            m473K();
                        }
                        if (this.f314b == 1) {
                            m458P();
                        }
                        if (!f199O) {
                            m286ax();
                        }
                        if (this.f73o) {
                            m488F();
                        }
                    } catch (Throwable unused) {
                    }
                    m314aj();
                    m316ai();
                    f18ag--;
                    f20ai--;
                    if (f18ag == 0 && !f208V && !this.f338X) {
                        m436Z();
                    }
                    if (this.f435N > 0) {
                        int i2 = this.f435N - 1;
                        this.f435N = i2;
                        if (i2 == 0 && !this.f416x && !f199O) {
                            if (f18ag > 0) {
                                m493D(12);
                            } else {
                                m438Y();
                            }
                        }
                    }
                    if (f20ai <= 0) {
                        f167Z = 1536;
                        f168aa = 12;
                        try {
                            if (f20ai >= -1) {
                                f290a[0].setAttribute(5, 100);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    m387a(true);
                    m294at();
                    this.f319g++;
                    if (this.f319g % 60 == 0 && !f205U) {
                        f25an = (f25an + 1) % 60;
                        if (f25an == 0) {
                            if (f26ao == 9) {
                                f25an = 59;
                                m482H();
                            } else {
                                f26ao++;
                            }
                        }
                    }
                    if (f204T) {
                        f25an = 0;
                        f26ao = 0;
                    }
                    if (!f192H && f23al >= 100 && f22ak < 100) {
                        m493D(13);
                        f28aq++;
                    }
                    if (!f192H && f23al >= 200 && f22ak < 200) {
                        m493D(13);
                        f28aq++;
                    }
                    if (!f192H && f23al >= 300 && f22ak < 300) {
                        m493D(13);
                        f28aq++;
                    }
                    if (m204c() < 32 && f191G && this.f315c == 3 && this.f314b == 1 && !f199O) {
                        this.f359l = false;
                        this.f358k = false;
                        this.f338X = false;
                        this.f416x = false;
                        f29ar = 0;
                        f30as = 0;
                        f31at = 0;
                        f32au = 0;
                        this.f78t = false;
                        this.f317e = (this.f317e + 1) % 3;
                        if (this.f317e == 0) {
                            this.f316d++;
                        }
                        this.f46b = (byte) (this.f317e + (this.f316d * 3));
                        this.f47c = (byte) f28aq;
                        this.f48aB = f24am;
                        if (this.f49d < this.f46b) {
                            this.f49d = this.f46b;
                        }
                        m89h();
                        this.f314b = f212a[this.f316d][this.f317e];
                        this.f315c = f213b[this.f316d][this.f317e];
                        m17v();
                        f175C = true;
                        m25t();
                    }
                    if (f38ay != 2) {
                        break;
                    }
                }
            } else if (f38ay == 6) {
                this.f319g++;
                m355aL();
            }
            m292au();
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: n */
    public final void m54n() {
        m351aN();
        try {
            m49o();
            if (this.f54c) {
                m65l();
                if (this.f55l > 0) {
                    this.f55l--;
                } else {
                    this.f54c = false;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void paint(Graphics graphics) {
    }

    /* renamed from: o */
    public final void m49o() {
        int i;
        f9a.lock();
        try {
            if (f38ay == -1 || f38ay == -4) {
                m191c(f9a, 0);
                f9a.fillRect(0, 0, 240, 320);
                m389a("SONIC THE HEDGEHOG", 62, 2, 16777215, 658170);
                if (f38ay == -4) {
                    m389a("DownLoading...", 190, 214, 16777215, 658170);
                } else {
                    m389a("Now Loading...", 190, 214, 16777215, 658170);
                }
                m191c(f9a, 658170);
                f9a.fillRect(125, 232, 1, 1);
                f9a.fillRect(126, 231, 108, 1);
                f9a.fillRect(234, 232, 1, 1);
                f9a.fillRect(126, 233, 108, 1);
                int[] iArr = {255, 255, 255};
                int[] iArr2 = {10, 10, 250};
                int[] iArr3 = {0, 0, 0};
                for (int i2 = 0; i2 < 108; i2++) {
                    iArr3[0] = (iArr[0] + iArr2[0]) >> 1;
                    if (i2 % 108 > 54) {
                        m399a(f9a, ((iArr[0] * (108 - (i2 % 108))) + (iArr2[0] * (i2 % 108))) / 108, ((iArr[1] * (108 - (i2 % 108))) + (iArr2[1] * (i2 % 108))) / 108, ((iArr[2] * (108 - (i2 % 108))) + (iArr2[2] * (i2 % 108))) / 108);
                    } else {
                        m399a(f9a, ((iArr[0] * (i2 % 108)) + (iArr2[0] * (108 - (i2 % 108)))) / 108, ((iArr[1] * (i2 % 108)) + (iArr2[1] * (108 - (i2 % 108)))) / 108, ((iArr[2] * (i2 % 108)) + (iArr2[2] * (108 - (i2 % 108)))) / 108);
                    }
                    f9a.fillRect(126 + ((i2 + this.f318f) % 108), 232, 1, 1);
                }
            } else if (f38ay >= 12) {
                f9a.setClip(0, 0, 240, 240);
                m191c(f9a, 0);
                f9a.fillRect(0, 0, 240, 240);
                try {
                    m385a(true, false);
                } catch (Throwable unused) {
                }
                m191c(f9a, 16777215);
                if (f38ay == 12) {
                    String[] strArr = {"ネットワーク接続に失敗しました。", "電波のよいところでもう一度お試し", "ください。\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000", "決定キーで再接続します。\u3000\u3000\u3000\u3000"};
                    i = 0;
                    while (i < 4) {
                        m394a(f9a, strArr[i], 120, 59 + (21 * i), 1);
                        i++;
                    }
                } else {
                    String[] strArr2 = {"ネットワーク接続に失敗しました。", "アプリの通信を許可したうえで再度", "起動し、もう一度お試しください。"};
                    i = 0;
                    while (i < 3) {
                        m394a(f9a, strArr2[i], 120, 59 + (21 * i), 1);
                        i++;
                    }
                }
                m389a("ネットワーク接続失敗", 120, 13, 16777215, 0);
                f87y = (byte) (f87y + 1);
                if ((f87y / 2) % 2 == 0) {
                    m389a("PRESS CENTER KEY", 120, 59 + (21 * (i + 1)), 16777215, 0);
                }
            } else if (f38ay == 8) {
                f9a.setClip(0, 0, 240, 240);
                m191c(f9a, 0);
                f9a.fillRect(0, 0, 240, 240);
                m385a(true, false);
                m389a(f214a[27 + (this.f323j * 9)], 120, 13, 16777215, 0);
                m191c(f9a, 16777215);
                for (int i3 = 0; i3 < 8; i3++) {
                    m394a(f9a, f214a[28 + (this.f323j * 9) + i3], 120, 52 + (14 * i3), 1);
                }
                if (this.f323j != 0 && this.f323j == 1) {
                    if (this.GFX_GameArray[0] == null) {
                        f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[39]).append(",length=").append(f6N[40] - f6N[39]).toString());
                        System.gc();
                        f4a.use();
                        System.gc();
                        this.GFX_GameArray[0] = f4a.getImage();
                    }
                    for (int i4 = 0; i4 < 2; i4++) {
                        m394a(f9a, f214a[9 + i4], 120, 164 + (21 * i4), 1);
                    }
                    m262b(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f321h % 4], 16, 16, this.f326c[this.f321h % 4], ((120 - (f238c.stringWidth(f214a[9 + this.f324k]) / 2)) - 16) - 14, 164 + (21 * this.f324k), 20);
                    m262b(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f321h % 4], 16, 16, this.f326c[this.f321h % 4], 120 + (f238c.stringWidth(f214a[9 + this.f324k]) / 2) + 14, 164 + (21 * this.f324k), 20);
                    this.f321h++;
                }
            } else if (f38ay == 7) {
                if (f174B) {
                    f9a.setClip(0, 0, 240, 240);
                    m263b(f9a, this.f312b[4], 0, 0, 20);
                    m263b(f9a, this.f312b[4], 0, 204, 20);
                    m263b(f9a, this.f312b[3], 153, 209, 20);
                    f174B = false;
                } else {
                    f9a.setClip(0, 0, 240, 240);
                    m263b(f9a, this.f312b[4], 0, 0, 20);
                    m263b(f9a, this.f312b[4], 0, 204, 20);
                    m263b(f9a, this.f312b[3], 153, 209, 20);
                }
                m324ae();
                this.f318f++;
            } else if (f38ay == 10 || f38ay == 11) {
                f9a.setClip(0, 0, 240, 240);
                m402a(f238c);
                m385a(true, false);
                m389a(f214a[5], 120, 13, 16777215, 0);
                if (f38ay == 10) {
                    m44p();
                } else {
                    m324ae();
                }
                f9a.setColor(Graphics.getColorOfRGB(0, 0, 0, 128));
                f9a.fillRect(0, 0, 240, 240);
                m262b(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f321h % 4], 16, 16, this.f326c[this.f321h % 4], ((120 - (f238c.stringWidth(f214a[15 + this.f322i]) / 2)) - 16) - 14, 94 + (30 * this.f322i), 20);
                m262b(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f321h % 4], 16, 16, this.f326c[this.f321h % 4], 120 + (f238c.stringWidth(f214a[15 + this.f322i]) / 2) + 14, 94 + (30 * this.f322i), 20);
                m191c(f9a, 16777215);
                m394a(f9a, f214a[15], 120 - (f238c.stringWidth(f214a[15]) / 2), 93, 20);
                m394a(f9a, f214a[16], 120 - (f238c.stringWidth(f214a[16]) / 2), 123, 20);
                this.f321h++;
                f174B = true;
            } else if (f38ay == 1) {
                m306an();
            } else if (f38ay == 3) {
                if (f174B) {
                    f9a.setClip(0, 0, 240, 240);
                    m263b(f9a, this.f312b[4], 0, 0, 20);
                    m263b(f9a, this.f312b[4], 0, 204, 20);
                    m263b(f9a, this.f312b[3], 153, 209, 20);
                    f174B = false;
                }
                m191c(f9a, 0);
                f9a.fillRect(0, 36, 240, 168);
                this.f66aK = 120 + (this.f355c[this.f356e[this.f316d]][2] / 2);
                m262b(f9a, this.f312b[5], this.f355c[this.f349aU][0], this.f355c[this.f349aU][1], this.f355c[this.f349aU][2], this.f355c[this.f349aU][3], f211b[0], (this.f66aK - this.f355c[this.f349aU][2]) - 1, 82, 20);
                if (this.f316d == 6) {
                    m262b(f9a, this.f312b[5], this.f355c[this.f344aP][0], this.f355c[this.f344aP][1], this.f355c[this.f344aP][2], this.f355c[this.f344aP][3], f211b[0], this.f66aK - 48, 100, 20);
                } else {
                    m262b(f9a, this.f312b[5], this.f355c[this.f345aQ + this.f317e][0], this.f355c[this.f345aQ + this.f317e][1], this.f355c[this.f345aQ + this.f317e][2], this.f355c[this.f345aQ + this.f317e][3], f211b[0], (this.f66aK - this.f355c[this.f349aU][2]) + 25, 108, 20);
                    m262b(f9a, this.f312b[5], this.f355c[this.f347aS][0], this.f355c[this.f347aS][1], this.f355c[this.f347aS][2], this.f355c[this.f347aS][3], f211b[0], (this.f66aK - this.f355c[this.f349aU][2]) + 1, 116, 20);
                    m262b(f9a, this.f312b[5], this.f355c[this.f344aP][0], this.f355c[this.f344aP][1], this.f355c[this.f344aP][2], this.f355c[this.f344aP][3], f211b[0], this.f66aK - 65, 100, 20);
                }
                m262b(f9a, this.f312b[5], this.f355c[this.f356e[this.f316d]][0], this.f355c[this.f356e[this.f316d]][1], this.f355c[this.f356e[this.f316d]][2], this.f355c[this.f356e[this.f316d]][3], f211b[0], 120 - (this.f355c[this.f356e[this.f316d]][2] / 2), 84, 20);
                m263b(f9a, this.f312b[12], 213, 96, 20);
                m263b(f9a, this.f312b[13], 22, 96, 20);
            } else if (f38ay == 6) {
                f9a.setClip(0, 0, 240, 240);
                this.f318f++;
                m353aM();
            } else if (f38ay == 4) {
                f9a.setClip(0, 0, 240, 240);
                m263b(f9a, this.f312b[4], 0, 0, 20);
                m263b(f9a, this.f312b[4], 0, 204, 20);
                m263b(f9a, this.f312b[3], 153, 209, 20);
                f174B = false;
                m191c(f9a, 0);
                f9a.fillRect(0, 36, 240, 168);
            } else if (f38ay == 2) {
                if (f174B) {
                    f9a.setClip(0, 0, 240, 240);
                    m263b(f9a, this.f312b[4], 0, 0, 20);
                    m263b(f9a, this.f312b[4], 0, 204, 20);
                    m263b(f9a, this.f312b[3], 153, 209, 20);
                    this.f60g = true;
                    this.f62i = true;
                    this.f62i = true;
                    m29s();
                    f174B = false;
                } else {
                    m29s();
                }
                if (f19ah > 0) {
                    f19ah--;
                    if (f19ah % 2 == 0) {
                        this.f59f = true;
                    } else {
                        this.f59f = false;
                    }
                } else {
                    this.f59f = false;
                }
                m44p();
                this.f318f++;
            }
        } catch (Throwable unused2) {
        }
        if (f38ay == 4 || f38ay == 2 || f38ay == 7) {
            if (this.f57d) {
                m191c(f9a, 0);
                for (int i5 = 0; i5 < 10; i5++) {
                    int i6 = 24 - ((this.f56m - i5) * 4);
                    int i7 = i6;
                    if (i6 > 0) {
                        if (i7 > 24) {
                            i7 = 24;
                        }
                        f9a.fillRect((i5 * 24) + (24 - i7), 0, i7, 240);
                    }
                }
                if (22 < this.f56m) {
                    this.f56m = 0;
                    this.f57d = false;
                }
                this.f56m++;
            }
            m290av();
            if (f38ay == 2 && this.f441A) {
                f9a.setClip(0, 0, 240, 240);
                m263b(f9a, this.f312b[4], 0, 0, 20);
                m263b(f9a, this.f312b[4], 0, 204, 20);
                m263b(f9a, this.f312b[3], 153, 209, 20);
                if (this.f147O > 31) {
                    m399a(f9a, 255, 255, 255);
                    f9a.fillRect(0, 36, 240, 168);
                } else {
                    m117df(((this.f147O * 8) << 16) | ((this.f147O * 8) << 8) | (this.f147O * 8));
                }
            }
            if (this.f58e) {
                m191c(f9a, 0);
                for (int i8 = 0; i8 < 10; i8++) {
                    if (this.f56m - i8 > 0) {
                        int i9 = (this.f56m - i8) << 2;
                        int i10 = i9;
                        if (i9 > 24) {
                            i10 = 24;
                        }
                        f9a.fillRect(i8 * 24, 0, i10, 240);
                    }
                }
                if (22 < this.f56m) {
                    this.f56m = 0;
                    this.f58e = false;
                }
                this.f56m++;
            }
            if (this.f391aa) {
                m389a("Now Loading...", 120, 180, 16777215, 658170);
            }
        }
        if (this.f62i || this.f61h || this.f60g || f38ay != 2) {
            this.f60g = false;
            this.f61h = false;
            this.f62i = false;
        }
        f9a.unlock(true);
    }

    /* renamed from: p */
    public final void m44p() {
        f9a.setClip(0, 36, 240, 168);
        if (f189F) {
            return;
        }
        m424a(f179T[0], f179T[1]);
        if (this.f314b == 1 || this.f314b == 5) {
            m400a(f9a, 0);
        } else {
            m264b(f9a, 0);
        }
        m470L();
        if (f38ay == 2) {
            m284ay();
        }
        if (!f199O) {
            m401a(f9a);
        }
        m312ak();
        if (this.f314b == 1 || this.f314b == 5) {
            m400a(f9a, 1);
        } else {
            m264b(f9a, 1);
        }
        m467M();
        if (this.f314b == 1) {
            m455Q();
        }
        if (f199O) {
            m401a(f9a);
        }
        if (this.f314b == 1) {
            for (int i = 0; i < 8; i++) {
                m396a(f9a, this.GFX_GameArray[111], 0, (this.f318f % 3) * 16, 32, 16, f211b[0], i * 32, (this.f384be - f179T[1]) - 8, 20);
            }
            int i2 = (this.f384be - f179T[1]) + 36;
            if (i2 < 36) {
                i2 = 36;
            }
            if (i2 < 204) {
                if (this.f315c == 3) {
                    f9a.setColor(Graphics.getColorOfRGB(64, 0, 64, 128));
                } else {
                    f9a.setColor(Graphics.getColorOfRGB(0, 64, 0, 128));
                }
                f9a.fillRect(0, i2, 240, 204);
            }
            if (this.f363x < 840 && (this.f363x / 70) % 2 == 1) {
                m269b(116, 80, this.f363x / 140, 1);
            }
            if (this.f363x < 900 && (this.f363x / 60) % 3 == 1 && this.f373Z) {
                m493D(24);
                this.f373Z = false;
            }
            if (this.f363x >= 900) {
                if (!this.f373Z) {
                    m436Z();
                }
                this.f373Z = true;
            }
        }
        if (this.f314b == 4 && this.f315c == 0 && (f190Y[1] >> 8) == 720 && (f190Y[0] >> 8) >= 8283 && (f190Y[0] >> 8) <= 8320) {
            f286g[0] = true;
        }
        if (this.f390w) {
            m361aI();
        }
        if ((f28aq > 0 || !f199O) && !(this.f77s && f25an == 59 && f26ao == 9)) {
            return;
        }
        int i3 = (660 - f27ap) * 6;
        if (120 - i3 < 8) {
            i3 = 112;
        }
        if (f28aq <= 0 && f199O) {
            m262b(f9a, this.f312b[14], 0, 0, 64, 16, f211b[0], i3 - 64, 108, 20);
            m262b(f9a, this.f312b[14], 0, 16, 64, 16, f211b[0], 240 - i3, 108, 20);
        } else if (f25an == 59 && f26ao == 9) {
            m262b(f9a, this.f312b[15], 0, 0, 64, 16, f211b[0], i3 - 64, 108, 20);
            m262b(f9a, this.f312b[15], 0, 16, 64, 16, f211b[0], 240 - i3, 108, 20);
        }
    }

    /* renamed from: q */
    public final void m39q() {
        for (int i = 0; i < this.GFX_GameArray.length; i++) {
            try {
                try {
                    this.GFX_GameArray[i].dispose();
                } catch (Exception unused) {
                }
                this.GFX_GameArray[i] = null;
            } catch (Exception unused2) {
                return;
            }
        }
        for (int i2 = 0; i2 < f297e.length; i2++) {
            try {
                f297e[i2].dispose();
            } catch (Exception unused3) {
            }
            f297e[i2] = null;
        }
        System.gc();
        System.gc();
        System.gc();
    }

    /* renamed from: a */
    public final boolean m406a(int i, String str) {
        return f162c[i] == null ? str == null : f162c[i].equals(str);
    }

    /* renamed from: a */
    public final void m407a(int i, String str) {
        try {
            f162c[i] = str;
            if (i == 0) {
                setSoftLabel(0, str);
            } else {
                setSoftLabel(1, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean m417a(int i, int i2, int i3, int i4) {
        if (this.f314b == 1) {
            if (i > 60 && i < 100) {
                int i5 = i - 60;
                m396a(f9a, this.GFX_GameArray[84], (i5 % 10) << 4, ((i5 / 10) << 4) + (((this.f318f % 4) << 4) << 2), 16, 16, f211b[i2], i3, i4, 20);
                return false;
            } else if (i >= 186) {
                int i6 = i - 186;
                m396a(f9a, this.GFX_GameArray[84], (i6 % 10) << 4, ((i6 / 10) << 4) + ((this.f318f % 4) << 4) + 256, 16, 16, f211b[i2], i3, i4, 20);
                return false;
            } else {
                return true;
            }
        } else if (this.f314b != 5 || this.f318f % 3 == 0) {
            return true;
        } else {
            if (i >= 250 && i < 290) {
                int i7 = i - 250;
                m396a(f9a, this.GFX_GameArray[84], (i7 % 10) << 4, ((i7 / 10) << 4) + ((((this.f318f % 3) - 1) << 4) << 2), 16, 16, f211b[i2], i3, i4, 20);
                return false;
            } else if (i >= 560 && i < 570) {
                int i8 = i - 560;
                m396a(f9a, this.GFX_GameArray[84], (i8 % 10) << 4, ((i8 / 10) << 4) + (((this.f318f % 3) - 1) << 4) + 128, 16, 16, f211b[i2], i3, i4, 20);
                return false;
            } else if (i < 35 || i >= 90) {
                return true;
            } else {
                int i9 = i - 30;
                m396a(f9a, this.GFX_GameArray[7], (i9 % 10) << 4, ((i9 / 10) << 4) + (((this.f318f % 3) - 1) * 96), 16, 16, f211b[i2], i3, i4, 20);
                return false;
            }
        }
    }

    /* renamed from: r */
    public final void m34r() {
        for (int i = 0; i < (f183d.length >> 1); i++) {
            int i2 = f183d[i << 1] & 255;
            this.f330l[i] = 0;
            this.f331m[i] = 0;
            Math.abs(((byte) (i2 << 6)) >> 6);
            if ((i2 >> 5) <= 1) {
                this.f331m[i] = 1;
            }
            if ((i2 >> 5) % 2 == 0) {
                this.f330l[i] = 1;
            }
            this.f329k[i] = (byte) ((i2 >> 3) & 3);
            this.f328j[i] = 0;
            if ((i2 & 1) == 1) {
                this.f328j[i] = 1;
            } else if ((i2 & 3) == 2) {
                this.f328j[i] = 2;
            }
        }
    }

    /* renamed from: a */
    public final void m418a(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            if ((f36aw << 4) > (f179T[0] >> 4) + i5) {
                for (int i6 = i2; i6 < i2 + i4; i6++) {
                    try {
                        int i7 = (f40b[(((f179T[1] >> 4) + i6) >> 4) % f37ax][((f179T[0] >> 4) + i5) >> 4] << 9) + (((((f179T[0] >> 4) + i5) & 15) + ((((f179T[1] >> 4) + i6) & 15) << 4)) << 1) + 1;
                        int i8 = (f183d[i7] & 255) + (this.f328j[i7 >> 1] << 8);
                        int i9 = i8;
                        if (i8 != 0) {
                            if (this.f314b == 2) {
                                if (i9 == 367 || i9 == 366) {
                                    i9 = ((i9 + (this.f318f / 5)) & 1) + 366;
                                }
                                if (i9 == 365 || i9 == 364) {
                                    i9 = ((i9 + (this.f318f / 5)) & 1) + 364;
                                }
                                if (i9 == 363 || i9 == 362) {
                                    i9 = ((i9 + (this.f318f / 5)) & 1) + 362;
                                }
                            }
                            char c = 0;
                            if (this.f329k[i7 >> 1] != 0) {
                                if (this.f329k[i7 >> 1] == 1) {
                                    c = 4;
                                } else if (this.f329k[i7 >> 1] == 2) {
                                    c = 6;
                                } else if (this.f329k[i7 >> 1] == 3) {
                                    c = 2;
                                }
                            }
                            m396a(f9a, f165a[((i9 / 10) << 4) / 256], (i9 % 10) << 4, ((i9 / 10) << 4) % 256, 16, 16, f211b[c], (i5 << 4) - (f179T[0] & 15), (i6 << 4) - (f179T[1] & 15), 20);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m400a(Graphics graphics, int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((f179T[0] >> 4) + i4) >> 4;
            for (int i6 = 0; i6 < 12; i6++) {
                try {
                    i2 = (f40b[(((f179T[1] >> 4) + i6) >> 4) % f37ax][i5] << 9) + (((((f179T[0] >> 4) + i4) & 15) + ((((f179T[1] >> 4) + i6) & 15) << 4)) << 1) + 1;
                    i3 = (f183d[i2] & 255) + (this.f328j[i2 >> 1] << 8);
                } catch (Throwable unused) {
                }
                if (i3 != 0) {
                    if (this.f314b == 5 && this.f315c == 3 && ((i3 == 515 || i3 == 516) && i == 0)) {
                        this.f332c[i4][i6][2] = 1;
                        m191c(graphics, 2180418);
                        graphics.fillRect((i4 << 4) - (f179T[0] & 15), ((i6 << 4) - (f179T[1] & 15)) + 36, 16, 16);
                    } else {
                        if (this.f314b == 5 && this.f315c == 1 && i3 == 165 && i == 0) {
                            m191c(graphics, 8738);
                            graphics.fillRect((i4 << 4) - (f179T[0] & 15), ((i6 << 4) - (f179T[1] & 15)) + 36, 8, 16);
                        }
                        if (f184e[i3] == i) {
                            int i7 = this.f333Z[this.f329k[i2 >> 1]];
                            if (m417a(i3, i7, (i4 << 4) - (f179T[0] & 15), (i6 << 4) - (f179T[1] & 15))) {
                                m396a(graphics, f165a[((i3 / 10) << 4) / 256], (i3 % 10) << 4, ((i3 / 10) << 4) % 256, 16, 16, f211b[i7], (i4 << 4) - (f179T[0] & 15), (i6 << 4) - (f179T[1] & 15), 20);
                            }
                        } else if (f184e[i3] == 2 && i == 0 && i3 != 165) {
                            m191c(graphics, 8738);
                            graphics.fillRect((i4 << 4) - (f179T[0] & 15), ((i6 << 4) - (f179T[1] & 15)) + 36, 16, 16);
                        } else if (f184e[i3] == 2 && i == 1) {
                            int i8 = this.f333Z[this.f329k[i2 >> 1]];
                            if (m417a(i3, i8, (i4 << 4) - (f179T[0] & 15), (i6 << 4) - (f179T[1] & 15))) {
                                m396a(graphics, f165a[((i3 / 10) << 4) / 256], (i3 % 10) << 4, ((i3 / 10) << 4) % 256, 16, 16, f211b[i8], (i4 << 4) - (f179T[0] & 15), (i6 << 4) - (f179T[1] & 15), 20);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m264b(Graphics graphics, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = ((f179T[0] >> 4) + i2) >> 4;
            for (int i4 = 0; i4 < 12; i4++) {
                int i5 = (f40b[(((f179T[1] >> 4) + i4) >> 4) % f37ax][i3] << 9) + (((((f179T[0] >> 4) + i2) & 15) + ((((f179T[1] >> 4) + i4) & 15) << 4)) << 1) + 1;
                int i6 = (f183d[i5] & 255) + (this.f328j[i5 >> 1] << 8);
                int i7 = i6;
                if (i6 != 0) {
                    if (this.f314b == 2) {
                        if (i7 == 367 || i7 == 366) {
                            i7 = ((i7 + (this.f318f / 5)) & 1) + 366;
                        }
                        if (i7 == 365 || i7 == 364) {
                            i7 = ((i7 + (this.f318f / 5)) & 1) + 364;
                        }
                        if (i7 == 363 || i7 == 362) {
                            i7 = ((i7 + (this.f318f / 5)) & 1) + 362;
                        }
                    }
                    if (f184e[i7] == i) {
                        m396a(graphics, f165a[((i7 / 10) << 4) / 256], (i7 % 10) << 4, ((i7 / 10) << 4) % 256, 16, 16, f211b[this.f333Z[this.f329k[i5 >> 1]]], (i2 << 4) - (f179T[0] & 15), (i4 << 4) - (f179T[1] & 15), 20);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m395a(Graphics graphics, String str, int i, int i2) {
        int i3 = i2 + f43az;
        m394a(graphics, str, i - 1, i3, 20);
        m394a(graphics, str, i + 1, i3, 20);
        m394a(graphics, str, i, i3 + 1, 20);
        m394a(graphics, str, i, i3 - 1, 20);
        graphics.setColor(16777215);
        m394a(graphics, str, i, i3, 20);
    }

    /* renamed from: a */
    public final int m429a(int i) {
        return (Math.sin((i * 4096) / 360) * 100) / 4096;
    }

    /* renamed from: b */
    public final int m276b(int i) {
        return ((-Math.cos((i * 4096) / 360)) * 100) / 4096;
    }

    /* renamed from: E */
    private void m490E(int i) {
        if (99950000 > f24am && f24am % 50000 > (f24am + i) % 50000) {
            f28aq++;
            m493D(13);
        }
        f24am += i;
        if (f24am > 99999999) {
            f24am = 99999999;
        }
    }

    /* renamed from: c */
    private void m197c(int i, int i2) {
        if (99950000 > f24am && f24am % 50000 > (f24am + i) % 50000) {
            f28aq++;
            m493D(30);
        }
        f24am += i;
        if (f24am > 99999999) {
            f24am = 99999999;
        }
    }

    /* renamed from: s */
    public final void m29s() {
        f9a.setClip(0, 0, 240, 240);
        if (this.f334n != f23al || this.f335o != f24am) {
            this.f60g = true;
        } else if (f23al == 0 && (this.f318f & 1) == 0) {
            this.f60g = true;
        }
        this.f334n = f23al;
        this.f335o = f24am;
        if (this.f60g) {
            m262b(f9a, this.f312b[4], 0, 0, 100, 32, f211b[0], 0, 0, 20);
            m262b(f9a, this.f312b[6], 0, 0, 55, 26, f211b[0], 4, 5, 20);
            if (f23al != 0 || ((this.f318f >> 1) & 1) == 0) {
                m269b(31, 3, f23al, 3);
            }
            m269b(31, 18, f24am, 8);
        }
        if (f25an == 0 || this.f336p != (f26ao * 100) + f25an) {
            this.f61h = true;
        }
        this.f336p = (f26ao * 100) + f25an;
        if (this.f61h) {
            m262b(f9a, this.f312b[4], 192, 0, 48, 32, f211b[0], 192, 0, 20);
            m262b(f9a, this.f312b[7], 0, 0, 44, 13, f211b[0], 192, 18, 20);
            m269b(200, 16, f26ao, 1);
            m269b(216, 16, f25an, 2);
        }
        if (f28aq > 99) {
            f28aq = 99;
        }
        if (this.f337q != f28aq) {
            this.f62i = true;
        }
        this.f337q = f28aq;
        if (this.f62i) {
            m262b(f9a, this.f312b[4], 0, 0, 50, 32, f211b[0], 0, 204, 20);
            m262b(f9a, this.f312b[8], 0, 0, 22, 20, f211b[0], 5, 213, 20);
            if (f28aq > 9) {
                m269b(31, 219, f28aq, 2);
            } else {
                m269b(31, 219, f28aq, 1);
            }
        }
    }

    /* renamed from: b */
    public final void m269b(int i, int i2, int i3, int i4) {
        m262b(f9a, this.f312b[9], 7 * (i3 % 10), 0, 7, 13, f211b[0], (i + (i4 << 3)) - 8, i2, 20);
        for (int i5 = 1; i5 < i4; i5++) {
            int i6 = 1;
            for (int i7 = 0; i7 < i5; i7++) {
                i6 *= 10;
            }
            m262b(f9a, this.f312b[9], 7 * ((i3 / i6) % 10), 0, 7, 13, f211b[0], ((i + (i4 << 3)) - (i5 << 3)) - 8, i2, 20);
        }
    }

    /* renamed from: o */
    private boolean m48o() {
        int[][] iArr = f42b[36];
        if (this.f314b == 1) {
            if (this.f315c == 0) {
                try {
                    int[][] m422a = m422a(62, 227);
                    if (m422a.length > 0 && m422a[0][5] != 0 && iArr[0][0] <= m280b() && iArr[0][2] > m280b() && iArr[0][1] <= m204c() - 16) {
                        if (iArr[0][3] > m204c() - 16) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
                return iArr[1][0] <= m280b() && iArr[1][2] > m280b() && iArr[1][1] <= m204c() && iArr[1][3] > m204c();
            } else if (this.f315c == 1) {
                try {
                    if (this.f318f % 60 >= 30 || iArr[2][0] > m280b() || iArr[2][2] <= m280b() || iArr[2][1] > m204c() || iArr[2][3] <= m204c()) {
                        int[][] m422a2 = m422a(93, -1);
                        if (m422a2.length > 0) {
                            return m422a2[0][2] < m280b() && iArr[2][0] <= m280b() && iArr[2][2] > m280b() && iArr[2][1] <= m204c() && iArr[2][3] > m204c();
                        }
                        int[][] m422a3 = m422a(92, -1);
                        return m422a3.length > 0 ? m422a3[0][2] < m280b() && iArr[2][0] <= m280b() && iArr[2][2] > m280b() && iArr[2][1] <= m204c() && iArr[2][3] > m204c() : iArr[2][0] <= m280b() && iArr[2][2] > m280b() && iArr[2][1] <= m204c() && iArr[2][3] > m204c();
                    }
                    return true;
                } catch (Throwable unused2) {
                    return false;
                }
            } else if (this.f315c == 2) {
                try {
                    if (this.f318f % 60 >= 30 || iArr[3][0] > m280b() || iArr[3][2] <= m280b() || iArr[3][1] > m204c() || iArr[3][3] <= m204c()) {
                        int[][] m422a4 = m422a(93, -1);
                        if (m422a4.length > 0) {
                            return m422a4[0][2] < m280b() && iArr[3][0] <= m280b() && iArr[3][2] > m280b() && iArr[3][1] <= m204c() && iArr[3][3] > m204c();
                        }
                        int[][] m422a5 = m422a(92, -1);
                        return m422a5.length > 0 ? m422a5[0][2] < m280b() && iArr[3][0] <= m280b() && iArr[3][2] > m280b() && iArr[3][1] <= m204c() && iArr[3][3] > m204c() : iArr[3][0] <= m280b() && iArr[3][2] > m280b() && iArr[3][1] <= m204c() && iArr[3][3] > m204c();
                    }
                    return true;
                } catch (Throwable unused3) {
                    return false;
                }
            } else if (this.f315c == 3) {
                try {
                    if (this.f318f % 60 >= 30 || iArr[4][0] > m280b() || iArr[4][2] <= m280b() || iArr[4][1] > m204c() || iArr[4][3] <= m204c()) {
                        int[][] m422a6 = m422a(93, -1);
                        if (m422a6.length > 0) {
                            return m422a6[0][2] < m280b() && iArr[4][0] <= m280b() && iArr[4][2] > m280b() && iArr[4][1] <= m204c() && iArr[4][3] > m204c();
                        }
                        int[][] m422a7 = m422a(92, -1);
                        return m422a7.length > 0 ? m422a7[0][2] < m280b() && iArr[4][0] <= m280b() && iArr[4][2] > m280b() && iArr[4][1] <= m204c() && iArr[4][3] > m204c() : iArr[4][0] <= m280b() && iArr[4][2] > m280b() && iArr[4][1] <= m204c() && iArr[4][3] > m204c();
                    }
                    return true;
                } catch (Throwable unused4) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m428a(int i) {
        this.f340p = new int[this.f339aJ][15];
        m493D(20);
        this.f67aL = 0;
        this.f63aG = 30;
        this.f338X = true;
        if (i == 0) {
            this.f340p[0][0] = 1;
            this.f340p[0][1] = this.f349aU;
            this.f340p[0][2] = 240;
            this.f340p[0][3] = 82;
            this.f340p[0][8] = 1 - this.f355c[this.f340p[0][1]][2];
            this.f340p[0][9] = 0;
            this.f340p[1][0] = 1;
            this.f340p[1][1] = this.f345aQ + this.f317e;
            this.f340p[1][2] = 240;
            this.f340p[1][3] = 108;
            this.f340p[1][8] = 25 - this.f355c[this.f340p[0][1]][2];
            this.f340p[1][9] = 3;
            this.f340p[2][0] = 1;
            this.f340p[2][1] = this.f347aS;
            this.f340p[2][2] = 240;
            this.f340p[2][3] = 116;
            this.f340p[2][8] = (-1) - this.f355c[this.f340p[0][1]][2];
            this.f340p[2][9] = 2;
            this.f340p[3][0] = 1;
            this.f340p[3][1] = this.f352aX;
            this.f340p[3][2] = 0 - this.f355c[this.f340p[3][1]][2];
            this.f340p[3][3] = 84;
            this.f340p[3][8] = -this.f355c[this.f340p[3][1]][2];
            this.f340p[3][9] = 0;
            this.f66aK = 120 + (this.f355c[this.f340p[3][1]][2] / 2);
            this.f340p[4][0] = 1;
            this.f340p[4][1] = this.f353aY;
            this.f340p[4][2] = 0 - this.f355c[this.f340p[4][1]][2];
            this.f340p[4][3] = 100;
            this.f340p[4][8] = ((-this.f355c[this.f340p[3][1]][2]) / 2) - (this.f355c[this.f340p[4][1]][2] / 2);
            this.f340p[4][9] = 1;
        } else if (i >= 1) {
            this.f396M = 5;
            this.f340p[0][0] = 1;
            this.f340p[0][1] = this.f349aU;
            this.f340p[0][2] = 240;
            this.f340p[0][3] = 72;
            this.f340p[0][8] = 0;
            this.f340p[0][9] = 0;
            this.f340p[1][0] = 1;
            this.f340p[1][1] = this.f354aZ + (i - 1);
            this.f340p[1][2] = 0 - this.f355c[this.f340p[1][1]][2];
            this.f340p[1][3] = 84;
            this.f340p[1][8] = -this.f355c[this.f340p[1][1]][2];
            this.f340p[1][9] = 0;
            this.f66aK = 120 + (this.f355c[this.f340p[1][1]][2] / 2);
            this.f340p[0][8] = ((-this.f355c[this.f340p[1][1]][2]) / 2) - (this.f355c[this.f340p[0][1]][2] / 2);
            this.f340p[2][0] = 1;
            this.f340p[2][1] = this.f354aZ + (i - 1);
            this.f340p[2][2] = 0 - this.f355c[this.f340p[2][1]][2];
            this.f340p[2][3] = 84;
            this.f340p[2][8] = -this.f355c[this.f340p[2][1]][2];
            this.f340p[2][9] = 0;
            this.f340p[3][0] = 1;
            this.f340p[3][1] = this.f354aZ + (i - 1);
            this.f340p[3][2] = 0 - this.f355c[this.f340p[3][1]][2];
            this.f340p[3][3] = 84;
            this.f340p[3][8] = -this.f355c[this.f340p[3][1]][2];
            this.f340p[3][9] = 0;
            this.f340p[4][0] = 1;
            this.f340p[4][1] = this.f354aZ + (i - 1);
            this.f340p[4][2] = 0 - this.f355c[this.f340p[4][1]][2];
            this.f340p[4][3] = 84;
            this.f340p[4][8] = -this.f355c[this.f340p[4][1]][2];
            this.f340p[4][9] = 0;
        }
        for (int i2 = 0; i2 < this.f340p.length; i2++) {
            if (this.f340p[i2][0] == 1) {
                this.f340p[i2][4] = this.f355c[this.f340p[i2][1]][0];
                this.f340p[i2][5] = this.f355c[this.f340p[i2][1]][1];
                this.f340p[i2][6] = this.f355c[this.f340p[i2][1]][2];
                this.f340p[i2][7] = this.f355c[this.f340p[i2][1]][3];
            }
        }
    }

    /* renamed from: b */
    public final boolean m278b() {
        if (!this.f440z) {
            this.f68j = false;
        }
        try {
            if (this.f314b % 2 == 1 && !this.f68j) {
                this.f436a = StorageDevice.getInstance("/ext0");
                this.f437a = DoJaStorageService.getAccessToken(2, 8);
                this.f138a = this.f436a.getFolder(this.f437a);
                m261b("Second.jar");
                this.f68j = true;
            }
        } catch (MediaNotFoundException unused) {
            this.f68j = false;
        } catch (Throwable unused2) {
            f38ay = 8;
            m446U();
            this.f323j = 3;
            this.f324k = 0;
            this.f54c = true;
            this.f55l = 10;
            m203c();
            return true;
        }
        if (this.f314b % 2 == 1) {
            if (!this.f68j) {
                this.f68j = false;
                f38ay = 8;
                m446U();
                this.f323j = 0;
                this.f324k = 0;
                this.f54c = true;
                this.f55l = 10;
                m203c();
                return true;
            } else if (this.f440z) {
                return false;
            } else {
                try {
                    if (this.f357r != 102) {
                        f38ay = 8;
                        m446U();
                        this.f324k = 0;
                        this.f323j = 1;
                        this.f54c = true;
                        this.f55l = 10;
                        m203c();
                        this.f139a.delete();
                        m261b("Second.jar");
                        return true;
                    }
                    byte[] m426a = m426a(294912);
                    if (!this.f68j) {
                        this.f68j = false;
                        f38ay = 8;
                        m446U();
                        this.f323j = 0;
                        this.f324k = 0;
                        this.f54c = true;
                        this.f55l = 10;
                        m203c();
                        return true;
                    }
                    try {
                        System.arraycopy(m426a, 0, this.f439b, 0, this.f439b.length);
                        this.f143a = new JarInflater(this.f439b);
                        this.f440z = true;
                        return false;
                    } catch (Throwable unused3) {
                        f38ay = 8;
                        m446U();
                        this.f324k = 0;
                        this.f323j = 1;
                        this.f54c = true;
                        this.f55l = 10;
                        m203c();
                        try {
                            this.f139a.delete();
                            m261b("Second.jar");
                            return true;
                        } catch (Throwable unused4) {
                            this.f68j = false;
                            this.f323j = 0;
                            return true;
                        }
                    }
                } catch (Throwable unused5) {
                    this.f68j = false;
                    f38ay = 8;
                    m446U();
                    this.f324k = 0;
                    this.f323j = 0;
                    this.f54c = true;
                    this.f55l = 10;
                    m203c();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public final void m25t() {
        if (m278b()) {
            return;
        }
        for (int i = 1; i < 4; i++) {
            try {
                f293K[i] = -1;
            } catch (Throwable unused) {
            }
        }
        f13ab = 0;
        this.f386e = (byte) 0;
        f208V = false;
        f209W = false;
        this.f416x = false;
        this.f376u = true;
        this.f377v = true;
        f207aA = 0;
        this.f363x = 2100;
        this.f373Z = true;
        f15ad = 0;
        f36aw = f41a[this.f315c][0].length;
        f37ax = f41a[this.f315c].length;
        f40b = new byte[f37ax][f36aw];
        for (int i2 = 0; i2 < f37ax; i2++) {
            for (int i3 = 0; i3 < f36aw; i3++) {
                f40b[i2][i3] = f41a[this.f315c][i2][i3];
            }
        }
        m288aw();
        this.f340p = new int[this.f339aJ][15];
        this.f319g = 0;
        this.f318f = 0;
        f18ag = 0;
        f19ah = 0;
        f20ai = 0;
        this.f375F = 0;
        this.f374E = 0;
        f38ay = 4;
        this.f54c = true;
        this.f55l = 10;
        this.f74a = (byte) 0;
        this.f359l = false;
        m438Y();
        this.f67aL = 0;
        this.f340p[0][0] = 1;
        this.f340p[0][1] = this.f349aU;
        this.f340p[0][2] = 240;
        this.f340p[0][3] = 82;
        this.f340p[0][8] = 1 - this.f355c[this.f340p[0][1]][2];
        this.f340p[0][9] = 0;
        this.f340p[1][0] = 1;
        this.f340p[1][1] = this.f345aQ + this.f317e;
        this.f340p[1][2] = 240;
        this.f340p[1][3] = 108;
        this.f340p[1][8] = 25 - this.f355c[this.f340p[0][1]][2];
        this.f340p[1][9] = 3;
        this.f340p[2][0] = 1;
        this.f340p[2][1] = this.f347aS;
        this.f340p[2][2] = 240;
        this.f340p[2][3] = 116;
        this.f340p[2][8] = (-1) - this.f355c[this.f340p[0][1]][2];
        this.f340p[2][9] = 2;
        this.f340p[3][0] = 1;
        this.f340p[3][1] = this.f356e[this.f316d];
        this.f340p[3][2] = 0 - this.f355c[this.f340p[3][1]][2];
        this.f340p[3][3] = 84;
        this.f340p[3][8] = -this.f355c[this.f340p[3][1]][2];
        this.f340p[3][9] = 0;
        this.f66aK = 120 + (this.f355c[this.f340p[3][1]][2] / 2);
        if (this.f316d == 6) {
            this.f340p[4][0] = 1;
            this.f340p[4][1] = this.f344aP;
            this.f340p[4][2] = 0 - this.f355c[this.f340p[4][1]][2];
            this.f340p[4][3] = 100;
            this.f340p[4][8] = -48;
            this.f340p[4][9] = 1;
        } else {
            this.f340p[4][0] = 1;
            this.f340p[4][1] = this.f344aP;
            this.f340p[4][2] = 0 - this.f355c[this.f340p[4][1]][2];
            this.f340p[4][3] = 100;
            this.f340p[4][8] = -65;
            this.f340p[4][9] = 1;
        }
        for (int i4 = 0; i4 < this.f340p.length; i4++) {
            if (this.f340p[i4][0] == 1) {
                this.f340p[i4][4] = this.f355c[this.f340p[i4][1]][0];
                this.f340p[i4][5] = this.f355c[this.f340p[i4][1]][1];
                this.f340p[i4][6] = this.f355c[this.f340p[i4][1]][2];
                this.f340p[i4][7] = this.f355c[this.f340p[i4][1]][3];
            }
        }
    }

    /* renamed from: a */
    public final void m420a(int i, int i2, int i3) {
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
        m396a(f9a, this.f312b[11], 8 * i4, 48, 8, 16, f211b[0], i - 8, i2, 20);
        for (int i9 = 1; i9 < i8; i9++) {
            int i10 = 1;
            for (int i11 = 0; i11 < i9; i11++) {
                i10 *= 10;
            }
            m396a(f9a, this.f312b[11], 8 * ((i3 / i10) % 10), 48, 8, 16, f211b[0], (i - (i9 * 8)) - 8, i2, 20);
        }
    }

    /* renamed from: u */
    public final void m21u() {
        try {
            m39q();
            m275b(this.f314b + 1);
            m75j(this.f315c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: v */
    public final void m17v() {
        f23al = 0;
        f25an = 0;
        f26ao = 0;
        f27ap = 0;
        f21aj = 0;
        f20ai = 0;
        try {
            f290a[0].setAttribute(5, 100);
        } catch (Throwable unused) {
        }
        f18ag = 0;
        f19ah = 0;
        this.f371C = 0;
        this.f365z = 0;
        this.f364y = 0;
        for (int i = 0; i < f173o.length; i++) {
            f173o[i][0] = 0;
        }
        f191G = false;
        f192H = false;
        f193I = false;
        f194J = false;
        f195K = false;
        f196L = false;
        f198N = false;
        f199O = false;
        this.f76r = false;
        this.f77s = false;
        f200P = false;
        f201Q = false;
        f202R = false;
        f203S = false;
        f205U = false;
        f204T = false;
        f243bh = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            f176d[i2] = false;
            f286g[i2] = false;
        }
        f10Y = 0;
        this.f380I = 0;
        for (int i3 = 0; i3 < f164m.length; i3++) {
            f164m[i3][24] = 0;
        }
    }

    /* renamed from: w */
    public final void m13w() {
        m203c();
        this.f60g = true;
        this.f62i = true;
        this.f62i = true;
        m17v();
        if (this.f315c == 2 && this.f314b == 4) {
            m416a(150, 11424, 1394, 0, 0);
        }
        for (int i = 0; i < f190Y.length; i++) {
            f190Y[i] = 0;
        }
        f17af = 0;
        f169O[0] = 0;
        f169O[1] = 0;
        f177R[0] = 0;
        f177R[1] = 0;
        if (this.f314b != 5) {
            f190Y[0] = f42b[14][this.f314b][(this.f315c * 2) + 0] << 8;
            f190Y[1] = (f42b[14][this.f314b][(this.f315c * 2) + 1] << 8) + 5120;
        } else if (this.f315c == 2) {
            f190Y[0] = f42b[14][1][6] << 8;
            f190Y[1] = (f42b[14][1][7] << 8) + 5120;
        } else if (this.f315c == 3) {
            f190Y[0] = f42b[14][this.f314b][8] << 8;
            f190Y[1] = (f42b[14][this.f314b][9] << 8) + 5120;
        } else {
            f190Y[0] = f42b[14][this.f314b][(this.f315c * 2) + 0] << 8;
            f190Y[1] = (f42b[14][this.f314b][(this.f315c * 2) + 1] << 8) + 5120;
        }
        if (f29ar != 0 || f30as != 0) {
            f190Y[0] = f29ar << 8;
            f190Y[1] = f30as << 8;
            f25an = f31at;
            f26ao = f32au;
            this.f386e = (byte) 0;
            if (this.f314b == 1 && this.f315c == 2) {
                this.f386e = (byte) 1;
                if (f29ar > 4864) {
                    this.f386e = (byte) 2;
                }
            }
        }
        m387a(false);
        m296as();
        m461O();
        this.f385bf = this.f383bd;
        m461O();
        if (this.f314b == 1 && this.f384be < m204c() - 12 && this.f363x == 2100) {
            this.f363x--;
        }
        f190Y[8] = -1;
        f190Y[9] = 1;
        if (f38ay != 1) {
            f38ay = 2;
        }
        m476J();
        this.f54c = true;
        this.f55l = 10;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [byte[][], byte[][][]] */
    /* renamed from: b */
    public final void m275b(int i) {
        try {
            this.f386e = (byte) 0;
            f208V = false;
            this.f376u = true;
            this.f377v = true;
            if (this.f314b != 1) {
                this.f385bf = 16777215;
                this.f384be = 16777215;
                this.f383bd = 16777215;
            } else {
                int i2 = new int[]{184, 808, 2304, 552}[this.f315c];
                this.f385bf = i2;
                this.f384be = i2;
                this.f383bd = i2;
            }
            int[] iArr = f178S;
            f177R[0] = 0;
            iArr[0] = 0;
            int[] iArr2 = f178S;
            f177R[1] = 0;
            iArr2[1] = 0;
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("zone").append(this.f314b + 1).append("wld.bin").toString());
            int read = MainInputStream.read();
            f41a = new byte[read];
            for (int i3 = 0; i3 < read; i3++) {
                int read2 = MainInputStream.read();
                int read3 = MainInputStream.read();
                f41a[i3] = new byte[read2][read3];
                for (int i4 = 0; i4 < read2 * read3; i4++) {
                    f41a[i3][i4 / read3][i4 % read3] = (byte) MainInputStream.read();
                }
            }
            MainInputStream.read(f183d);
            MainInputStream.close();
            this.f143a.close();
            f36aw = f41a[this.f315c][0].length;
            f37ax = f41a[this.f315c].length;
            f40b = new byte[f37ax][f36aw];
            for (int i5 = 0; i5 < f37ax; i5++) {
                for (int i6 = 0; i6 < f36aw; i6++) {
                    f40b[i5][i6] = f41a[this.f315c][i5][i6];
                }
            }
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("zone").append(this.f314b + 1).append(".bmd").toString());
            MainInputStream.read(f183d);
            MainInputStream.close();
            m34r();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("zone").append(i).append(".blt").toString());
            MainInputStream.read(f185f);
            MainInputStream.close();
            this.f143a.close();
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("MapLzone").append(i).append(".blt").toString());
            MainInputStream.read(f184e);
            MainInputStream.close();
            this.f143a.close();
            if (this.f314b == 5 && this.f315c == 3) {
                f184e[523] = 0;
            }
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("ZONE").append(i).append("ACT.act").toString());
            f187a[0] = new byte[((MainInputStream.read() & 255) << 8) | (MainInputStream.read() & 255)];
            f187a[1] = new byte[((MainInputStream.read() & 255) << 8) | (MainInputStream.read() & 255)];
            f187a[2] = new byte[((MainInputStream.read() & 255) << 8) | (MainInputStream.read() & 255)];
            f187a[3] = new byte[((MainInputStream.read() & 255) << 8) | (MainInputStream.read() & 255)];
            MainInputStream.read(f187a[0]);
            MainInputStream.read(f187a[1]);
            MainInputStream.read(f187a[2]);
            MainInputStream.read(f187a[3]);
            MainInputStream.close();
            this.f143a.close();
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("scdtblwk.scd");
            MainInputStream.read(f206i);
            MainInputStream.close();
            this.f143a.close();
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("blkcol.bct");
            MainInputStream.read(f186g);
            MainInputStream.close();
            this.f143a.close();
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            byte[] bArr = new byte[(int) this.f143a.getSize("bigr.GIF")];
            MainInputStream = this.f143a.getInputStream("bigr.GIF");
            MainInputStream.read(bArr);
            MainInputStream.close();
            f4a = MediaManager.getImage(bArr);
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[47] = f4a.getImage();
            this.f143a.close();
            if (this.f314b % 2 == 1 && this.f68j) {
                m332aa();
                for (int i7 = 0; i7 < 60; i7++) {
                    try {
                        if (f291a[40 + i7] == null) {
                            byte[] bArr2 = new byte[(int) this.f143a.getSize(new StringBuffer().append(Integer.toHexString(160 + i7)).append(".mld").toString())];
                            MainInputStream = this.f143a.getInputStream(new StringBuffer().append(Integer.toHexString(160 + i7)).append(".mld").toString());
                            MainInputStream.read(bArr2);
                            MainInputStream.close();
                            f291a[40 + i7] = MediaManager.getSound(bArr2);
                            f291a[40 + i7].use();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            m199c(i);
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[39]).append(",length=").append(f6N[40] - f6N[39]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[0] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[40]).append(",length=").append(f6N[41] - f6N[40]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[36] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[34]).append(",length=").append(f6N[35] - f6N[34]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[42] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[26]).append(",length=").append(f6N[27] - f6N[26]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[109] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[59]).append(",length=").append(f6N[60] - f6N[59]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[9] = f4a.getImage();
            if (this.f314b == 0) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[73]).append(",length=").append(f6N[74] - f6N[73]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[3] = f4a.getImage();
            }
            if (this.f314b != 5) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[37]).append(",length=").append(f6N[38] - f6N[37]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[55] = f4a.getImage();
            }
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[43]).append(",length=").append(f6N[44] - f6N[43]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[2] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[42]).append(",length=").append(f6N[43] - f6N[42]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[1] = f4a.getImage();
            if (this.f314b == 4) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[90]).append(",length=").append(f6N[91] - f6N[90]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[16] = f4a.getImage();
            } else if (this.f314b == 0) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[91]).append(",length=").append(f6N[92] - f6N[91]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[16] = f4a.getImage();
            }
            if (this.f314b == 0) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[81]).append(",length=").append(f6N[82] - f6N[81]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[5] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[82]).append(",length=").append(f6N[83] - f6N[82]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[58] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[70]).append(",length=").append(f6N[71] - f6N[70]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[6] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[83]).append(",length=").append(f6N[84] - f6N[83]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[37] = f4a.getImage();
            }
            if (this.f314b == 1) {
                if (this.f315c < 3) {
                    this.GFX_GameArray[83] = GFX_Load(f242f[0]);
                    this.GFX_GameArray[105] = GFX_Load(f242f[1]);
                    this.GFX_GameArray[106] = GFX_Load(f242f[2]);
                    this.GFX_GameArray[107] = GFX_Load(f242f[3]);
                    this.GFX_GameArray[108] = GFX_Load(f242f[4]);
                    this.GFX_GameArray[82] = GFX_Load(f242f[5]);
                    this.GFX_GameArray[88] = GFX_Load(f242f[6]);
                    this.GFX_GameArray[84] = GFX_Load(f242f[7]);
                    this.GFX_GameArray[110] = GFX_Load(f242f[8]);
                    this.GFX_GameArray[80] = GFX_Load(f242f[9]);
                    this.GFX_GameArray[85] = GFX_Load(f242f[10]);
                    this.GFX_GameArray[104] = GFX_Load(f242f[11]);
                    this.GFX_GameArray[91] = GFX_Load(f242f[12]);
                    this.GFX_GameArray[92] = GFX_Load(f242f[13]);
                    this.GFX_GameArray[5] = GFX_Load(f242f[14]);
                    this.GFX_GameArray[111] = GFX_Load(f242f[15]);
                } else {
                    this.GFX_GameArray[83] = GFX_Load(f242f[16]);
                    this.GFX_GameArray[107] = GFX_Load(f242f[17]);
                    this.GFX_GameArray[108] = GFX_Load(f242f[18]);
                    this.GFX_GameArray[82] = GFX_Load(f242f[19]);
                    this.GFX_GameArray[88] = GFX_Load(f242f[20]);
                    this.GFX_GameArray[84] = GFX_Load(f242f[21]);
                    this.GFX_GameArray[110] = GFX_Load(f242f[22]);
                    this.GFX_GameArray[80] = GFX_Load(f242f[23]);
                    this.GFX_GameArray[85] = GFX_Load(f242f[24]);
                    this.GFX_GameArray[104] = GFX_Load(f242f[25]);
                    this.GFX_GameArray[105] = GFX_Load(f242f[26]);
                    this.GFX_GameArray[106] = GFX_Load(f242f[27]);
                    this.GFX_GameArray[91] = GFX_Load(f242f[28]);
                    this.GFX_GameArray[92] = GFX_Load(f242f[29]);
                    this.GFX_GameArray[5] = GFX_Load(f242f[30]);
                    this.GFX_GameArray[111] = GFX_Load(f242f[31]);
                }
            }
            if (this.f314b == 2) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[89]).append(",length=").append(f6N[90] - f6N[89]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[79] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[77]).append(",length=").append(f6N[78] - f6N[77]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[54] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[97]).append(",length=").append(f6N[98] - f6N[97]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[8] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[95]).append(",length=").append(f6N[96] - f6N[95]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[94] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[96]).append(",length=").append(f6N[97] - f6N[96]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[95] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[99]).append(",length=").append(f6N[100] - f6N[99]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[13] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[100]).append(",length=").append(f6N[101] - f6N[100]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[99] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[78]).append(",length=").append(f6N[79] - f6N[78]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[11] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[101]).append(",length=").append(f6N[102] - f6N[101]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[77] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[88]).append(",length=").append(f6N[89] - f6N[88]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[14] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[87]).append(",length=").append(f6N[88] - f6N[87]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[98] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[102]).append(",length=").append(f6N[103] - f6N[102]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[7] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[72]).append(",length=").append(f6N[73] - f6N[72]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[27] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[93]).append(",length=").append(f6N[94] - f6N[93]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[15] = f4a.getImage();
            }
            if (this.f314b == 3) {
                this.GFX_GameArray[22] = GFX_Load(f242f[32]);
                this.GFX_GameArray[18] = GFX_Load(f242f[33]);
                this.GFX_GameArray[19] = GFX_Load(f242f[34]);
                this.GFX_GameArray[21] = GFX_Load(f242f[35]);
                this.GFX_GameArray[73] = GFX_Load(f242f[36]);
                this.GFX_GameArray[23] = GFX_Load(f242f[37]);
            }
            if (this.f314b == 4) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[75]).append(",length=").append(f6N[76] - f6N[75]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[17] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[92]).append(",length=").append(f6N[93] - f6N[92]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[61] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[68]).append(",length=").append(f6N[69] - f6N[68]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[56] = f4a.getImage();
            }
            if (this.f314b == 5 && this.f315c != 3) {
                this.GFX_GameArray[25] = GFX_Load(f242f[38]);
                this.GFX_GameArray[33] = GFX_Load(f242f[39]);
                this.GFX_GameArray[28] = GFX_Load(f242f[40]);
                this.GFX_GameArray[29] = GFX_Load(f242f[41]);
                this.GFX_GameArray[32] = GFX_Load(f242f[42]);
                this.GFX_GameArray[12] = GFX_Load(f242f[43]);
                this.GFX_GameArray[26] = GFX_Load(f242f[44]);
            }
            if (this.f314b == 4) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[83]).append(",length=").append(f6N[84] - f6N[83]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[83] = f4a.getImage();
            }
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[55]).append(",length=").append(f6N[56] - f6N[55]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[96] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[18]).append(",length=").append(f6N[19] - f6N[18]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[97] = f4a.getImage();
            m374aB(i);
            m484G(i);
            try {
                this.f143a.close();
            } catch (Throwable unused2) {
            }
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            if (this.f314b == 5 && this.f315c > 0) {
                i++;
            }
            byte[] bArr3 = new byte[(int) this.f143a.getSize(new StringBuffer().append("DBG").append(i - 1).append(".bin").toString())];
            f161M = new int[1284];
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("DBG").append(i - 1).append(".bin").toString());
            MainInputStream.read(bArr3);
            MainInputStream.close();
            this.f143a.close();
            for (int i8 = 0; i8 < bArr3.length / 4; i8++) {
                int i9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    i9 |= (bArr3[i10 + (i8 * 4)] & 255) << ((3 - i10) * 8);
                }
                f161M[i8] = i9;
            }
            System.gc();
            System.gc();
            System.gc();
            m408a(this.f314b, this.f315c, f161M);
        } catch (Throwable unused3) {
            m275b(i);
        }
    }

    /* renamed from: c */
    public final void m199c(int i) {
        try {
            if (f165a[0] != null) {
                f165a[0].dispose();
                System.gc();
                f165a[0] = null;
                System.gc();
            }
            if (f165a[1] != null) {
                f165a[1].dispose();
                System.gc();
                f165a[1] = null;
                System.gc();
            }
            if (f165a[2] != null) {
                f165a[2].dispose();
                System.gc();
                f165a[2] = null;
                System.gc();
            }
            if (f165a[3] != null) {
                f165a[3].dispose();
                System.gc();
                f165a[3] = null;
                System.gc();
            }
            System.gc();
            if (i == 2) {
                if (this.f315c == 3) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        f165a[i2] = GFX_Load(new StringBuffer().append("z_zone").append(i).append("_").append(i2).append(".gif").toString());
                    }
                } else {
                    for (int i3 = 0; i3 < 2; i3++) {
                        f165a[i3] = GFX_Load(new StringBuffer().append("zone").append(i).append("_").append(i3).append(".gif").toString());
                    }
                }
            } else if (i % 2 == 1) {
                for (int i4 = 0; i4 < 3; i4++) {
                    if (i == 5 && i4 == 2) {
                        f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[103 + ((i / 2) * 3) + i4 + 2]).append(",length=").append(5301).toString());
                        System.gc();
                        f4a.use();
                        System.gc();
                        f165a[i4] = f4a.getImage();
                    }
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[103 + ((i / 2) * 3) + i4 + 2]).append(",length=").append(f6N[((104 + ((i / 2) * 3)) + i4) + 2] - f6N[((103 + ((i / 2) * 3)) + i4) + 2]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    f165a[i4] = f4a.getImage();
                }
            } else {
                int i5 = 0;
                while (i5 < 3) {
                    f165a[i5] = GFX_Load(new StringBuffer().append("zone").append(i).append("_").append(i5).append(".gif").toString());
                    i5++;
                }
                if (i == 6) {
                    f165a[i5] = GFX_Load(new StringBuffer().append("zone").append(i).append("_").append(i5).append(".gif").toString());
                }
            }
            if (this.f312b[1] == null) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[44]).append(",length=").append(f6N[45] - f6N[44]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.f312b[1] = f4a.getImage();
            }
            if (this.f312b[2] == null) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[45]).append(",length=").append(f6N[46] - f6N[45]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.f312b[2] = f4a.getImage();
            }
            if (this.f312b[16] == null) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[103]).append(",length=").append(f6N[104] - f6N[103]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.f312b[16] = f4a.getImage();
            }
            if (this.f312b[17] == null) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[104]).append(",length=").append(f6N[105] - f6N[104]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.f312b[17] = f4a.getImage();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: x */
    public final void m9x() {
        m461O();
        if (f202R || f203S) {
            int[] iArr = f190Y;
            iArr[11] = iArr[11] + f167Z;
        } else if (f199O) {
            int[] iArr2 = f190Y;
            iArr2[1] = iArr2[1] + f190Y[5];
            int[] iArr3 = f190Y;
            iArr3[5] = iArr3[5] + 56;
        } else if (m48o()) {
            if (this.f371C > 0) {
                this.f371C--;
                int[] iArr4 = f190Y;
                iArr4[1] = iArr4[1] - (f190Y[3] * 2);
                int[] iArr5 = f190Y;
                iArr5[0] = iArr5[0] + f190Y[5];
                int[] iArr6 = f190Y;
                iArr6[5] = iArr6[5] + 56;
            } else {
                for (int i = 0; i < 4; i++) {
                    f190Y[3] = 512;
                    if ((m204c() - 24) % 128 < 64) {
                        if (m423a(m280b() + 24, m204c() - 24)) {
                            int[] iArr7 = f190Y;
                            iArr7[1] = iArr7[1] + 256;
                            int i2 = 0;
                            while (m423a(m280b() + 24, m204c() - 24) && i2 <= 24) {
                                i2++;
                                int[] iArr8 = f190Y;
                                iArr8[0] = iArr8[0] - 256;
                            }
                        } else if (m423a(m280b() + 24, m204c())) {
                            int[] iArr9 = f190Y;
                            iArr9[1] = iArr9[1] - 256;
                            int i3 = 0;
                            while (m423a(m280b() + 24, m204c()) && i3 <= 24) {
                                i3++;
                                int[] iArr10 = f190Y;
                                iArr10[0] = iArr10[0] - 256;
                            }
                        } else {
                            int[] iArr11 = f190Y;
                            iArr11[0] = iArr11[0] + f190Y[3];
                        }
                    } else if (m423a(m280b() + 24, m204c())) {
                        int[] iArr12 = f190Y;
                        iArr12[1] = iArr12[1] - 256;
                        int i4 = 0;
                        while (m423a(m280b() + 24, m204c()) && i4 <= 24) {
                            i4++;
                            int[] iArr13 = f190Y;
                            iArr13[0] = iArr13[0] - 256;
                        }
                    } else if (m423a(m280b() + 24, m204c() - 24)) {
                        int[] iArr14 = f190Y;
                        iArr14[1] = iArr14[1] + 256;
                        int i5 = 0;
                        while (m423a(m280b() + 24, m204c() - 24) && i5 <= 24) {
                            i5++;
                            int[] iArr15 = f190Y;
                            iArr15[0] = iArr15[0] - 256;
                        }
                    } else {
                        int[] iArr16 = f190Y;
                        iArr16[0] = iArr16[0] + f190Y[3];
                    }
                    if (f166c[2] && i == 0) {
                        int[] iArr17 = f190Y;
                        iArr17[1] = iArr17[1] - 256;
                        if (m128d(m280b() + 24, m204c() - 24)) {
                            int[] iArr18 = f190Y;
                            iArr18[1] = iArr18[1] + 256;
                        }
                    }
                    if (f166c[1] && i == 0) {
                        int[] iArr19 = f190Y;
                        iArr19[1] = iArr19[1] + 256;
                    }
                }
                f196L = true;
                f192H = false;
                f194J = true;
                f190Y[3] = 2048;
            }
            m2z();
        } else if (m76j()) {
            if (m58m()) {
                m500B();
            }
        } else if (m64l()) {
            m503A();
        }
    }

    /* renamed from: c */
    public final int m200c(int i) {
        return Math.abs(this.f311a.nextInt()) % i;
    }

    /* renamed from: a */
    public final boolean m423a(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            this.f69u++;
            int i3 = (f40b[((i2 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f330l[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (f185f[(f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8)] & 255) << 5;
            if (this.f329k[i3 >> 1] == 1) {
                if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f329k[i3 >> 1] == 2) {
                if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f329k[i3 >> 1] == 3) {
                if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            int i5 = (f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8);
            f190Y[8] = i5;
            if (this.f314b == 1) {
                if (i5 <= 70 || i5 >= 84) {
                    int i6 = i2 - 16;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    int i7 = (f40b[((i6 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i6 >> 4) & 15) << 4)) << 1) + 1;
                    int i8 = (f183d[i7] & 255) + (this.f328j[i7 >> 1] << 8);
                    if (i8 == 83 || i8 == 186) {
                        f193I = true;
                        f190Y[12] = 0;
                        f190Y[13] = 0;
                        f190Y[14] = 0;
                        f190Y[10] = 4096;
                        if (this.f329k[i7 >> 1] == 0) {
                            f190Y[12] = 1;
                            f190Y[13] = 0;
                            f190Y[14] = 0;
                            f190Y[10] = -4096;
                        }
                    } else {
                        int i9 = i - 16;
                        int i10 = i6 + 16;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        int i11 = (f40b[((i10 >> 4) >> 4) % f37ax][(i9 >> 4) >> 4] << 9) + ((((i9 >> 4) & 15) + (((i10 >> 4) & 15) << 4)) << 1) + 1;
                        int i12 = (f183d[i11] & 255) + (this.f328j[i11 >> 1] << 8);
                        if (i12 == 71 || i12 == 72) {
                            f193I = true;
                        } else {
                            f193I = false;
                        }
                    }
                } else {
                    f193I = true;
                    f190Y[12] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    f190Y[10] = 4096;
                    if (this.f329k[i3 >> 1] == 0) {
                        f190Y[12] = 1;
                        f190Y[13] = 0;
                        f190Y[14] = 0;
                        f190Y[10] = -4096;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final boolean m272b(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (f40b[((i2 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
        if (this.f331m[i3 >> 1] == 1) {
            return false;
        }
        int i4 = (f185f[(f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8)] & 255) << 5;
        if (this.f329k[i3 >> 1] == 1) {
            if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
        } else if (this.f329k[i3 >> 1] == 2) {
            if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                return false;
            }
        } else if (this.f329k[i3 >> 1] == 3) {
            if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                return false;
            }
        } else if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
            return false;
        }
        f190Y[8] = (f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8);
        return true;
    }

    /* renamed from: c */
    public final boolean m196c(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return this.f330l[(((f40b[((i2 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1)) + 1) >> 1] != 1;
    }

    /* renamed from: d */
    public final boolean m128d(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        try {
            int i3 = (f40b[((i2 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
            if (this.f330l[i3 >> 1] == 1 && this.f331m[i3 >> 1] == 1) {
                return false;
            }
            int i4 = (f185f[(f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8)] & 255) << 5;
            if (this.f329k[i3 >> 1] == 1) {
                if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                    return false;
                }
            } else if (this.f329k[i3 >> 1] == 2) {
                if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (this.f329k[i3 >> 1] == 3) {
                if (0 == ((f186g[(i4 + ((15 - (i & 15)) << 1)) + ((15 - (i2 & 15)) >> 3)] >> (i2 & 7)) & 1)) {
                    return false;
                }
            } else if (0 == ((f186g[(i4 + ((i & 15) << 1)) + ((i2 & 15) >> 3)] >> (7 - (i2 & 7))) & 1)) {
                return false;
            }
            this.f70v = (f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: d */
    public final int m131d(int i) {
        return f188h[f185f[i] & 255] & 255;
    }

    /* renamed from: c */
    public final boolean m202c() {
        if (m272b(m280b() + 12, m204c() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = f190Y;
                iArr[0] = iArr[0] - 256;
                if (!m272b(m280b() + 12, m204c() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m133d() {
        if (m272b(m280b() - 12, m204c() - 12)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = f190Y;
                iArr[0] = iArr[0] + 256;
                if (!m272b(m280b() - 12, m204c() - 12)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m114e() {
        if (m272b(m280b() + 12, m204c() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = f190Y;
                iArr[0] = iArr[0] - 256;
                if (!m272b(m280b() + 12, m204c() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m102f() {
        if (m272b(m280b() - 12, m204c() - 24)) {
            for (int i = 0; i < 14; i++) {
                int[] iArr = f190Y;
                iArr[0] = iArr[0] + 256;
                if (!m272b(m280b() - 12, m204c() - 24)) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m95g() {
        int m280b;
        int m204c;
        if (f17af <= 22 || f17af >= 338) {
            m280b = m280b() + 12;
            m204c = m204c() - 12;
        } else if (this.f314b != 1 || f17af != 316) {
            return false;
        } else {
            m280b = m280b() + 12;
            m204c = m204c() - 36;
        }
        if (((this.f314b == 4 || this.f314b == 3) && f17af != 0) || !m272b(m280b, m204c)) {
            return false;
        }
        for (int i = 0; i < 14; i++) {
            int[] iArr = f190Y;
            iArr[0] = iArr[0] - 256;
            m280b--;
            if (!m423a(m280b, m204c)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m88h() {
        if (f17af <= 22 || f17af >= 338) {
            if ((this.f314b == 4 || this.f314b == 3) && f17af != 0) {
                return false;
            }
            if (this.f314b == 2 && f17af == 22) {
                return false;
            }
            int m280b = m280b() - 12;
            int m204c = m204c() - 12;
            if (m272b(m280b, m204c)) {
                for (int i = 0; i < 14; i++) {
                    int[] iArr = f190Y;
                    iArr[0] = iArr[0] + 256;
                    m280b++;
                    if (!m423a(m280b, m204c)) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m82i() {
        try {
            if (m272b(m280b(), m204c() - 32)) {
                for (int i = 0; i < 14; i++) {
                    int[] iArr = f190Y;
                    iArr[1] = iArr[1] + 256;
                    if (!m272b(m280b(), m204c() - 32)) {
                        int[] iArr2 = f190Y;
                        iArr2[1] = iArr2[1] - 256;
                        return true;
                    }
                }
                return true;
            } else if (m272b(m280b(), m204c() - 16)) {
                for (int i2 = 0; i2 < 14; i2++) {
                    int[] iArr3 = f190Y;
                    iArr3[1] = iArr3[1] + 256;
                    if (!m272b(m280b(), m204c() - 16)) {
                        int[] iArr4 = f190Y;
                        iArr4[1] = iArr4[1] - 256;
                        return true;
                    }
                }
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m427a(int i) {
        try {
            if (m423a(m280b(), m204c())) {
                int i2 = f17af;
                if (this.f314b == 3 && f17af == 90 && (f190Y[8] == 370 || f190Y[8] == 371)) {
                    return true;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                for (int i3 = 0; i3 < 16; i3++) {
                    if (!f196L) {
                        int[] iArr = f190Y;
                        iArr[0] = iArr[0] - ((m429a(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = f190Y;
                    iArr2[1] = iArr2[1] - ((m276b(i2 + 180) * 256) / 100);
                    if (!m423a(m280b(), m204c())) {
                        if (!f196L) {
                            int[] iArr3 = f190Y;
                            iArr3[0] = iArr3[0] + ((m429a(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = f190Y;
                        iArr4[1] = iArr4[1] + ((m276b(i2 + 180) << 8) / 100);
                        f17af = m425a(m280b(), m204c());
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: y */
    public final void m5y() {
        if (!f196L && f198N) {
            f198N = false;
        }
        this.f362w = 2;
    }

    /* renamed from: z */
    public final void m2z() {
        if (this.f314b != 1 || this.f384be >= m204c() - 12) {
            if (this.f363x < 2100) {
                m391a("aa");
            }
            this.f363x = 2100;
            return;
        }
        if (this.f363x == 2100) {
            m391a("aa");
        }
        if (this.f363x < 2100 && this.f363x % 300 == 0) {
            m391a("c2");
        }
        this.f363x--;
        if (this.f363x < 0) {
            this.f76r = true;
            m482H();
            m493D(29);
            f190Y[5] = 256;
        }
    }

    /* renamed from: b */
    public final boolean m274b(int i) {
        if (0 == i) {
            if (f196L) {
                return true;
            }
            if (this.f359l) {
                return false;
            }
            if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 31 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 32)) {
                f166c[2] = false;
                return false;
            } else if (!this.f418y && f166c[2]) {
                m391a("a0");
                f15ad = 0;
                if (this.f314b == 5 && this.f315c != 2 && (37 == f190Y[8] || 38 == f190Y[8] || 39 == f190Y[8] || 41 == f190Y[8] || 42 == f190Y[8] || 47 == f190Y[8] || 48 == f190Y[8] || 49 == f190Y[8] || 52 == f190Y[8] || 59 == f190Y[8] || 62 == f190Y[8] || 69 == f190Y[8] || 71 == f190Y[8] || 72 == f190Y[8] || 78 == f190Y[8] || 79 == f190Y[8] || 87 == f190Y[8] || 88 == f190Y[8] || 89 == f190Y[8])) {
                    f196L = true;
                    f192H = false;
                    f197M = false;
                    f33D = false;
                    f198N = true;
                    int m425a = m425a(m280b(), m204c());
                    int i2 = m425a;
                    if (m425a < 0) {
                        i2 = 0;
                    }
                    f190Y[3] = ((m429a(i2) * (1664 + f190Y[10])) / 100) + f190Y[10];
                    f190Y[5] = (m276b(i2) * (1664 + f190Y[10])) / 100;
                    return true;
                } else if (f33D) {
                    f196L = true;
                    f192H = false;
                    f197M = false;
                    f33D = false;
                    f198N = true;
                    f190Y[3] = ((m429a(0) * 1664) / 100) + f190Y[10];
                    f190Y[5] = (m276b(0) * 1664) / 100;
                    return true;
                } else {
                    f196L = true;
                    f192H = false;
                    f197M = false;
                    f33D = false;
                    f198N = true;
                    int i3 = f17af;
                    int m280b = (f40b[((m204c() / 16) / 16) % f37ax][(m280b() / 16) / 16] * 512) + ((((m280b() / 16) % 16) + (((m204c() / 16) % 16) * 16)) * 2) + 1;
                    int i4 = 0;
                    byte abs = (byte) Math.abs(((byte) ((f183d[m280b - 1] & 255) << 6)) >> 6);
                    if (abs % 4 != 0) {
                        i4 = 256 * (abs % 4);
                    }
                    byte m131d = (byte) m131d((f183d[m280b] & 255) + i4);
                    if (f17af == 270) {
                        f14ac = 5;
                        f190Y[3] = -1664;
                        f190Y[5] = -Math.abs(1664);
                        return true;
                    } else if (f17af == 90) {
                        f14ac = 5;
                        f190Y[3] = 1664;
                        f190Y[5] = -Math.abs(1664);
                        return true;
                    } else if (m131d != 0 && f17af <= 290 && f17af >= 70) {
                        f190Y[3] = (m429a(i3) * 1664) / 100;
                        f190Y[5] = (m276b(i3) * 1664) / 100;
                        if (f190Y[5] > 0) {
                            this.f369B = 1;
                            return true;
                        }
                        return true;
                    } else {
                        f190Y[3] = ((m429a(i3) * 1664) / 100) + f190Y[10];
                        f190Y[5] = (m276b(i3) * 1664) / 100;
                        if (f190Y[5] > 0) {
                            this.f369B = 1;
                        }
                        if (Math.abs(f190Y[10]) <= 2560 || this.f314b != 4 || this.f315c != 1 || f190Y[0] <= 9216) {
                            return true;
                        }
                        int[] iArr = f190Y;
                        iArr[5] = iArr[5] - 768;
                        f190Y[3] = ((m429a(i3) * 1664) / 100) + 2560;
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m76j() {
        if (this.f364y > -1) {
            this.f364y--;
        }
        if (this.f365z > -1) {
            this.f365z--;
        }
        if (f198N) {
            return true;
        }
        if (this.f418y || f196L || this.f359l || f193I) {
            return false;
        }
        if (!f166c[1]) {
            if (!f166c[0] || Math.abs(f190Y[10]) > 128 || f166c[3] || f166c[4]) {
                return false;
            }
            f201Q = true;
            this.f365z += 2;
            if (this.f365z > 24) {
                this.f365z = 24;
                return false;
            }
            return false;
        } else if (Math.abs(f190Y[10]) > 128) {
            f198N = true;
            m391a("be");
            return true;
        } else if (f166c[3] || f166c[4]) {
            return false;
        } else {
            f200P = true;
            this.f364y += 2;
            if (this.f364y > 32) {
                this.f364y = 32;
                return false;
            }
            return false;
        }
    }

    /* renamed from: k */
    public final boolean m70k() {
        this.f71m = false;
        this.f72n = false;
        int i = f17af;
        int i2 = 32;
        int i3 = 256;
        if (f17af != 22 && f17af != 338) {
            i2 = 256;
        }
        if (f17af >= 270 && f17af < 300) {
            i3 = 32;
        }
        if (f17af >= 60 && f17af < 90) {
            i3 = 32;
        }
        if (this.f314b == 0 && (f40b[m204c() >> 8][m280b() >> 8] == 31 || f40b[m204c() >> 8][m280b() >> 8] == 32)) {
            i3 = 256;
        }
        int i4 = f17af;
        if (m43p()) {
            f33D = false;
            if (this.f314b == 4 && ((i4 == 79 && f17af == 90) || (i4 == 281 && f17af == 270))) {
                if (f17af == 90) {
                    f190Y[10] = 640;
                } else {
                    f190Y[10] = -640;
                }
                f17af = i4;
                this.f387L = 0;
                this.f369B = 3;
                return false;
            } else if (this.f314b == 3 && this.f315c == 1) {
                if ((f190Y[0] >> 8) == 2421 || (f190Y[0] >> 8) == 2422) {
                    int[] iArr = f190Y;
                    iArr[0] = iArr[0] + 256;
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
        for (int i5 = 0; i5 < 14; i5++) {
            if (i < 350 && i > 10) {
                int[] iArr2 = f190Y;
                iArr2[0] = iArr2[0] + ((m429a(i + 180) * i2) / 100);
            }
            int[] iArr3 = f190Y;
            iArr3[1] = iArr3[1] + ((m276b(i + 180) * i3) / 100);
            if (m43p()) {
                f33D = false;
                if (this.f314b == 4 && ((i4 == 79 && f17af == 90) || (i4 == 281 && f17af == 270))) {
                    if (f17af == 90) {
                        f190Y[10] = 640;
                    } else {
                        f190Y[10] = -640;
                    }
                    f17af = i4;
                    this.f387L = 0;
                    this.f369B = 3;
                    return false;
                } else if (this.f314b == 3 && this.f315c == 1) {
                    if ((f190Y[0] >> 8) == 2421 || (f190Y[0] >> 8) == 2422) {
                        int[] iArr4 = f190Y;
                        iArr4[0] = iArr4[0] + 256;
                        return true;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    private boolean m43p() {
        if (this.f314b == 5 && this.f315c != 2) {
            if (37 == f190Y[8] || 38 == f190Y[8] || 39 == f190Y[8] || 41 == f190Y[8] || 42 == f190Y[8] || 47 == f190Y[8] || 48 == f190Y[8] || 49 == f190Y[8] || 52 == f190Y[8] || 59 == f190Y[8] || 62 == f190Y[8] || 69 == f190Y[8] || 71 == f190Y[8] || 72 == f190Y[8] || 78 == f190Y[8] || 79 == f190Y[8] || 87 == f190Y[8] || 88 == f190Y[8] || 89 == f190Y[8]) {
                return m427a(0);
            }
            if (f169O[0] >= 0) {
                this.f71m = m38q();
                if (!this.f71m) {
                    this.f72n = m33r();
                }
            }
            if (f169O[0] < 0) {
                this.f72n = m33r();
                if (!this.f72n) {
                    this.f71m = m38q();
                }
            }
            return this.f71m || this.f72n;
        } else if (this.f314b == 0) {
            if (f40b[m204c() >> 8][m280b() >> 8] == 31 || f40b[m204c() >> 8][m280b() >> 8] == 32) {
                return m427a(0);
            }
            if (f169O[0] >= 0) {
                this.f71m = m38q();
                if (!this.f71m) {
                    this.f72n = m33r();
                }
            }
            if (f169O[0] < 0) {
                this.f72n = m33r();
                if (!this.f72n) {
                    this.f71m = m38q();
                }
            }
            return this.f71m || this.f72n;
        } else if (this.f314b != 3) {
            if (f169O[0] >= 0) {
                this.f71m = m38q();
                if (!this.f71m) {
                    this.f72n = m33r();
                }
            }
            if (f169O[0] < 0) {
                this.f72n = m33r();
                if (!this.f72n) {
                    this.f71m = m38q();
                }
            }
            return this.f71m || this.f72n;
        } else if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53) {
            return m427a(0);
        } else {
            if (f169O[0] >= 0) {
                this.f71m = m38q();
                if (!this.f71m) {
                    this.f72n = m33r();
                }
            }
            if (f169O[0] < 0) {
                this.f72n = m33r();
                if (!this.f72n) {
                    this.f71m = m38q();
                }
            }
            return this.f71m || this.f72n;
        }
    }

    /* renamed from: q */
    private boolean m38q() {
        try {
            int i = f17af;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f366A;
            int m280b = m280b() + ((m429a(i2 + 90) * i3) / 100);
            int m204c = m204c() + ((m276b(i2 + 90) * i3) / 100);
            if (m423a(m280b, m204c)) {
                m425a(m280b, m204c);
                if (this.f314b == 3 && ((f190Y[8] == 1 || f190Y[8] == 17 || f190Y[8] == 319) && ((f17af >= 270 && f17af < 300) || (f17af > 60 && f17af <= 90)))) {
                    if (f17af < 270 || f17af >= 300) {
                        f17af = 90;
                        return true;
                    }
                    f17af = 270;
                    return true;
                }
                for (int i4 = 0; i4 < 16; i4++) {
                    int m425a = m425a(m280b, m204c);
                    if (!f196L) {
                        int[] iArr = f190Y;
                        iArr[0] = iArr[0] - ((m429a(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = f190Y;
                    iArr2[1] = iArr2[1] - ((m276b(i2 + 180) << 8) / 100);
                    m280b = m280b() + ((m429a(i2 + 90) * i3) / 100);
                    m204c = m204c() + ((m276b(i2 + 90) * i3) / 100);
                    if (this.f314b == 3 && m425a == 350) {
                        m425a = 0;
                    }
                    f17af = m425a;
                    if (!m423a(m280b, m204c)) {
                        if (!f196L) {
                            int[] iArr3 = f190Y;
                            iArr3[0] = iArr3[0] + ((m429a(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = f190Y;
                        iArr4[1] = iArr4[1] + ((m276b(i2 + 180) << 8) / 100);
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m33r() {
        try {
            int i = f17af;
            int i2 = i;
            if (i < 0) {
                i2 = 0;
            }
            int i3 = this.f366A;
            int m280b = m280b() + ((m429a(i2 + 270) * i3) / 100);
            int m204c = m204c() + ((m276b(i2 + 270) * i3) / 100);
            if (m423a(m280b, m204c)) {
                m425a(m280b, m204c);
                if (this.f314b == 3 && ((f190Y[8] == 1 || f190Y[8] == 17 || f190Y[8] == 319) && ((f17af >= 270 && f17af < 300) || (f17af > 60 && f17af <= 90)))) {
                    if (f17af < 270 || f17af >= 300) {
                        f17af = 90;
                        return true;
                    }
                    f17af = 270;
                    return true;
                }
                for (int i4 = 0; i4 < 16; i4++) {
                    int m425a = m425a(m280b, m204c);
                    if (!f196L) {
                        int[] iArr = f190Y;
                        iArr[0] = iArr[0] - ((m429a(i2 + 180) << 8) / 100);
                    }
                    int[] iArr2 = f190Y;
                    iArr2[1] = iArr2[1] - ((m276b(i2 + 180) << 8) / 100);
                    m280b = m280b() + ((m429a(i2 + 270) * i3) / 100);
                    m204c = m204c() + ((m276b(i2 + 270) * i3) / 100);
                    if (this.f314b == 3 && m425a == 350) {
                        m425a = 0;
                    }
                    f17af = m425a;
                    if (!m423a(m280b, m204c)) {
                        if (!f196L) {
                            int[] iArr3 = f190Y;
                            iArr3[0] = iArr3[0] + ((m429a(i2 + 180) << 8) / 100);
                        }
                        int[] iArr4 = f190Y;
                        iArr4[1] = iArr4[1] + ((m276b(i2 + 180) << 8) / 100);
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m64l() {
        f169O[0] = 0;
        f169O[1] = 0;
        if (m274b(0)) {
            return true;
        }
        int abs = Math.abs(f190Y[10]);
        m94g(0);
        m494D();
        if (abs <= f167Z && Math.abs(f190Y[10]) > f167Z && abs <= f167Z) {
            if (f190Y[10] < 0) {
                f190Y[10] = -f167Z;
            } else {
                f190Y[10] = f167Z;
            }
        }
        if ((f17af <= 22 || f17af >= 338) && ((abs > f167Z || (!f166c[3] && !f166c[4] && f190Y[10] != 0)) && f190Y[10] != 0)) {
            if (f190Y[10] < 0) {
                int[] iArr = f190Y;
                iArr[10] = iArr[10] + f168aa;
                if (f190Y[10] > 0) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                }
            } else {
                int[] iArr2 = f190Y;
                iArr2[10] = iArr2[10] - f168aa;
                if (f190Y[10] < 0) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                }
            }
        }
        if (Math.abs(f190Y[10]) > 4096) {
            if (f190Y[10] < 0) {
                f190Y[10] = -4096;
            } else {
                f190Y[10] = 4096;
            }
        }
        if (m76j()) {
            return false;
        }
        m87h(0);
        if (this.f314b == 0 || this.f314b == 3) {
            m464N();
        }
        if (f202R) {
            return false;
        }
        boolean z = false;
        if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 31 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 32)) {
            z = true;
            if (!f198N) {
                m391a("be");
            }
            f198N = true;
            int[] iArr3 = f190Y;
            iArr3[10] = iArr3[10] + 256;
            if (f190Y[10] > 4096) {
                f190Y[10] = 4096;
            }
        }
        if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 54)) {
            z = true;
        }
        if (this.f314b == 3 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53)) {
            z = true;
        }
        if (!z) {
            if (!f33D) {
                if (m95g()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m88h()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            } else if (m272b(m280b() - 12, m204c() - 24) && m272b(m280b() + 12, m204c() - 24)) {
                if (m202c()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m133d()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            } else {
                if (m114e() || m202c()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m102f() || m133d()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            }
        }
        int i = f190Y[0];
        int i2 = f190Y[1];
        boolean z2 = true;
        if (m70k()) {
            this.f320e[0] = true;
            z2 = false;
        }
        if (this.f387L > 0) {
            if (z2) {
                f190Y[0] = i;
                f190Y[1] = i2;
                return false;
            }
            return false;
        } else if (f33D || !z2) {
            boolean z3 = false;
            if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 31 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 32)) {
                z3 = true;
            }
            if (this.f314b == 2 && (f190Y[8] == 365 || f190Y[8] == 364 || f190Y[8] == 363 || f190Y[8] == 362)) {
                m488F();
            }
            if (z3) {
                return false;
            }
            m53n();
            return false;
        } else {
            f190Y[0] = i;
            f190Y[1] = i2;
            if (f17af == 22 && this.f314b == 1 && this.f315c == 1) {
                f190Y[3] = (m429a(90) * f190Y[10]) / 100;
                f190Y[5] = (m276b(90) * f190Y[10]) / 100;
            } else {
                f190Y[3] = (m429a(f17af + 90) * f190Y[10]) / 100;
                f190Y[5] = (m276b(f17af + 90) * f190Y[10]) / 100;
            }
            if ((f17af - 90) % 180 == 0) {
                if (f17af == 90) {
                    int[] iArr4 = f190Y;
                    iArr4[0] = iArr4[0] + 256;
                    if (this.f314b == 4 && this.f315c != 0) {
                        f190Y[5] = 0;
                    }
                } else {
                    int[] iArr5 = f190Y;
                    iArr5[0] = iArr5[0] - 256;
                    if (f190Y[10] > 2816) {
                        this.f387L = 15;
                    }
                }
            }
            f190Y[10] = 0;
            f190Y[13] = 0;
            f190Y[14] = 0;
            f197M = true;
            f196L = true;
            f192H = false;
            f33D = false;
            if (m82i()) {
                f190Y[5] = 0;
                return false;
            }
            return false;
        }
    }

    /* renamed from: A */
    public final void m503A() {
        if (this.f387L > 0) {
            this.f387L--;
        } else if (f166c[3]) {
            f190Y[12] = 1;
            if (f190Y[3] == 0) {
                int[] iArr = f190Y;
                iArr[3] = iArr[3] - 256;
            } else {
                int[] iArr2 = f190Y;
                iArr2[3] = iArr2[3] - f168aa;
                if (f190Y[3] > 0) {
                    int[] iArr3 = f190Y;
                    iArr3[3] = iArr3[3] - f168aa;
                }
            }
        } else if (f166c[4]) {
            f190Y[12] = 0;
            if (f190Y[3] == 0) {
                int[] iArr4 = f190Y;
                iArr4[3] = iArr4[3] + 256;
            } else {
                int[] iArr5 = f190Y;
                iArr5[3] = iArr5[3] + f168aa;
                if (f190Y[3] < 0) {
                    int[] iArr6 = f190Y;
                    iArr6[3] = iArr6[3] + f168aa;
                }
            }
        }
        if (Math.abs(f190Y[3]) > f167Z) {
            if (f190Y[3] < 0) {
                f190Y[3] = -f167Z;
            } else {
                f190Y[3] = f167Z;
            }
        }
        int[] iArr7 = f169O;
        iArr7[0] = iArr7[0] + f190Y[3];
        int[] iArr8 = f169O;
        iArr8[1] = iArr8[1] + f190Y[5];
        if (f190Y[5] > 0 && this.f369B <= 0) {
            if (f17af == 270) {
                int[] iArr9 = f190Y;
                iArr9[0] = iArr9[0] - 3072;
            } else if (f17af == 90) {
                int[] iArr10 = f190Y;
                iArr10[0] = iArr10[0] + 3072;
            }
            f17af = 0;
        }
        m87h(1);
        if (this.f314b == 0 || this.f314b == 3) {
            m464N();
        }
        if (f196L && f14ac <= 0) {
            if (m202c()) {
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                f190Y[3] = 0;
            }
            if (m133d()) {
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                f190Y[3] = 0;
            }
        }
        m497C();
    }

    /* renamed from: m */
    public final boolean m58m() {
        f169O[0] = 0;
        f169O[1] = 0;
        if (m274b(0)) {
            return true;
        }
        Math.abs(f190Y[10]);
        m94g(1);
        m491E();
        m87h(0);
        if (Math.abs(f190Y[10]) > 4096) {
            if (f190Y[10] < 0) {
                f190Y[10] = -4096;
            } else {
                f190Y[10] = 4096;
            }
        }
        Math.abs(f190Y[10]);
        if (this.f314b == 0 || this.f314b == 3) {
            m464N();
        }
        if (f202R) {
            return false;
        }
        boolean z = false;
        if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 31 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 32)) {
            z = true;
            int[] iArr = f190Y;
            iArr[10] = iArr[10] + 12;
            if (f190Y[10] > 4096) {
                f190Y[10] = 4096;
            }
        }
        if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 54)) {
            z = true;
        }
        if (this.f314b == 3 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53)) {
            z = true;
        }
        if (!z) {
            if (!f33D) {
                if (m95g()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m88h()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            } else if (m272b(m280b() - 12, m204c() - 24) && m272b(m280b() + 12, m204c() - 24)) {
                if (m202c()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m133d()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            } else {
                if (m114e() || m202c()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                }
                if (m102f() || m133d()) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            }
        }
        int i = f190Y[0];
        int i2 = f190Y[1];
        boolean z2 = true;
        if (m70k()) {
            this.f320e[0] = true;
            z2 = false;
        }
        if (this.f387L > 0) {
            if (z2) {
                f190Y[0] = i;
                f190Y[1] = i2;
                return false;
            }
            return false;
        } else if (f33D || !z2 || z) {
            boolean z3 = false;
            if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 31 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 32)) {
                z3 = true;
            }
            if (this.f314b == 2 && (f190Y[8] == 365 || f190Y[8] == 364 || f190Y[8] == 363 || f190Y[8] == 362)) {
                m488F();
            }
            if (z3) {
                return false;
            }
            m53n();
            return false;
        } else {
            f190Y[0] = i;
            f190Y[1] = i2;
            if (this.f314b == 0 && Math.abs(f190Y[10]) > 2560) {
                if (f190Y[10] < 0) {
                    f190Y[10] = -4224;
                } else {
                    f190Y[10] = 4224;
                }
            }
            f190Y[3] = (m429a(f17af + 90) * f190Y[10]) / 100;
            f190Y[5] = (m276b(f17af + 90) * f190Y[10]) / 100;
            if ((f17af - 90) % 180 == 0) {
                if (f17af == 90) {
                    int[] iArr2 = f190Y;
                    iArr2[0] = iArr2[0] + 256;
                    if (this.f314b == 4 && this.f315c != 0) {
                        f190Y[5] = 0;
                    }
                } else {
                    int[] iArr3 = f190Y;
                    iArr3[0] = iArr3[0] - 256;
                    if (f190Y[10] > 3072 && this.f314b == 4) {
                        this.f387L = 15;
                    }
                }
            }
            f190Y[10] = 0;
            f190Y[13] = 0;
            f190Y[14] = 0;
            f197M = true;
            f196L = true;
            f192H = false;
            f33D = false;
            if (m82i()) {
                f190Y[5] = 0;
                return false;
            }
            return false;
        }
    }

    /* renamed from: B */
    public final void m500B() {
        int abs = Math.abs(f190Y[3]);
        if (this.f387L > 0) {
            this.f387L--;
        } else if (!this.f359l) {
            if (f166c[3]) {
                f190Y[12] = 1;
                if (f190Y[3] == 0) {
                    int[] iArr = f190Y;
                    iArr[3] = iArr[3] - 256;
                } else {
                    int[] iArr2 = f190Y;
                    iArr2[3] = iArr2[3] - f168aa;
                    if (f190Y[3] > 0) {
                        int[] iArr3 = f190Y;
                        iArr3[3] = iArr3[3] - f168aa;
                    }
                }
            } else if (f166c[4]) {
                f190Y[12] = 0;
                if (f190Y[3] == 0) {
                    int[] iArr4 = f190Y;
                    iArr4[3] = iArr4[3] + 256;
                } else {
                    int[] iArr5 = f190Y;
                    iArr5[3] = iArr5[3] + f168aa;
                    if (f190Y[3] < 0) {
                        int[] iArr6 = f190Y;
                        iArr6[3] = iArr6[3] + f168aa;
                    }
                }
            }
        }
        if (Math.abs(f190Y[3]) > 4096) {
            if (f190Y[3] < 0) {
                f190Y[3] = -4096;
            } else {
                f190Y[3] = 4096;
            }
        }
        if (this.f314b == 3 && Math.abs(f190Y[3]) > f167Z && abs <= f167Z) {
            if (f190Y[3] < 0) {
                f190Y[3] = -f167Z;
            } else {
                f190Y[3] = f167Z;
            }
        }
        int[] iArr7 = f169O;
        iArr7[0] = iArr7[0] + f190Y[3];
        int[] iArr8 = f169O;
        iArr8[1] = iArr8[1] + f190Y[5];
        if (f190Y[5] > 0 && this.f369B <= 0) {
            if (f17af == 270) {
                int[] iArr9 = f190Y;
                iArr9[0] = iArr9[0] - 3072;
            } else if (f17af == 90) {
                int[] iArr10 = f190Y;
                iArr10[0] = iArr10[0] + 3072;
            }
            f17af = 0;
        }
        m87h(1);
        if (this.f314b == 0 || this.f314b == 3) {
            m464N();
        }
        f14ac--;
        if (f196L && f14ac <= 0) {
            if (m202c()) {
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                f190Y[3] = 0;
            }
            if (m133d()) {
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                f190Y[3] = 0;
            }
        }
        m497C();
    }

    /* renamed from: d */
    public final void m130d(int i) {
        if (i == 0) {
            f198N = false;
            f243bh = 0;
            f196L = false;
            f191G = false;
            f192H = false;
        }
        if (i != 0) {
            if (!f191G) {
                f190Y[5] = 0;
                return;
            }
            int m425a = m425a(m280b(), m204c() - 32);
            int i2 = m425a;
            if (m425a < 0) {
                i2 = f17af;
            }
            if (i2 % 90 == 0) {
                f190Y[5] = 0;
                return;
            }
            int[] iArr = f190Y;
            iArr[3] = iArr[3] + ((-(m276b(i2 + 90) * f190Y[5])) / 100);
            return;
        }
        f190Y[10] = f190Y[3];
        int m425a2 = m425a(m280b(), m204c());
        int i3 = m425a2;
        if (m425a2 < 0) {
            for (int i4 = 1; i4 < this.f366A + 1; i4++) {
                int m425a3 = m425a(m280b() - i4, m204c());
                i3 = m425a3;
                if (m425a3 >= 0) {
                    break;
                }
                int m425a4 = m425a(m280b() + i4, m204c());
                i3 = m425a4;
                if (m425a4 >= 0) {
                    break;
                }
            }
        }
        f17af = i3;
        if ((i3 <= 67 && i3 >= 44) || (i3 >= 293 && i3 <= 316)) {
            if (f190Y[5] > 3072) {
                f190Y[5] = 4096;
            }
            if (m276b(i3 + 90) > 0) {
                f190Y[10] = f190Y[5];
            } else {
                f190Y[10] = -f190Y[5];
            }
        } else if (i3 < 338 && i3 > 22) {
            int[] iArr2 = f190Y;
            iArr2[10] = iArr2[10] + ((m276b(i3 + 90) * f190Y[5]) / 100);
        }
        f190Y[5] = 0;
        f190Y[3] = 0;
        if (this.f314b == 2 && (f190Y[8] == 365 || f190Y[8] == 364 || f190Y[8] == 363 || f190Y[8] == 362)) {
            this.f73o = true;
        }
        if (f190Y[10] < 0) {
            f190Y[13] = 1;
        }
        if (f190Y[10] > 0) {
            f190Y[13] = 2;
        }
        f190Y[14] = 0;
    }

    /* renamed from: C */
    public final void m497C() {
        if (this.f369B > 0) {
            this.f369B--;
            return;
        }
        if (-896 <= f190Y[5]) {
            f166c[2] = false;
        } else if (!f166c[2] && !f191G && !f197M) {
            f190Y[5] = -896;
        }
        if (f190Y[5] <= 0) {
            if (m82i()) {
                m130d(1);
                return;
            }
            return;
        }
        f191G = false;
        if (m43p()) {
            if (f17af >= 270 || f17af <= 90) {
                m130d(0);
            } else {
                f17af = 0;
            }
        }
    }

    /* renamed from: D */
    public final void m494D() {
        if (this.f359l) {
            f190Y[12] = 0;
            if (f190Y[13] == 0) {
                f190Y[13] = 2;
                f190Y[14] = 2;
            }
            int[] iArr = f190Y;
            iArr[10] = iArr[10] + 128;
            m111e(1);
        } else if (!this.f418y && !f193I) {
            if (this.f314b == 5 && this.f315c != 2 && (37 == f190Y[8] || 38 == f190Y[8] || 39 == f190Y[8] || 41 == f190Y[8] || 42 == f190Y[8] || 47 == f190Y[8] || 48 == f190Y[8] || 49 == f190Y[8] || 52 == f190Y[8] || 59 == f190Y[8] || 62 == f190Y[8] || 69 == f190Y[8] || 71 == f190Y[8] || 72 == f190Y[8] || 78 == f190Y[8] || 79 == f190Y[8] || 87 == f190Y[8] || 88 == f190Y[8] || 89 == f190Y[8])) {
                int[] iArr2 = f190Y;
                iArr2[10] = iArr2[10] + 256;
                if (1024 < f190Y[10]) {
                    f190Y[10] = 1024;
                }
                f190Y[12] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
            } else if (this.f387L > 0) {
                this.f387L--;
            } else if (f166c[3]) {
                if (f190Y[12] == 0 && Math.abs(f190Y[10]) > 512) {
                    m391a("a4");
                }
                f190Y[12] = 1;
                if (f190Y[13] == 0) {
                    f190Y[13] = 1;
                }
                if (f190Y[14] == 0) {
                    f190Y[14] = 1;
                }
                m111e(0);
            } else if (f166c[4]) {
                if (f190Y[12] == 1 && Math.abs(f190Y[10]) > 512) {
                    m391a("a4");
                }
                f190Y[12] = 0;
                if (f190Y[13] == 0) {
                    f190Y[13] = 2;
                }
                if (f190Y[14] == 0) {
                    f190Y[14] = 2;
                }
                m111e(1);
            }
        }
        int[] iArr3 = f169O;
        iArr3[0] = iArr3[0] + ((m429a(f17af + 90) * f190Y[10]) / 100);
        int[] iArr4 = f169O;
        iArr4[1] = iArr4[1] + ((m276b(f17af + 90) * f190Y[10]) / 100);
    }

    /* renamed from: e */
    public final void m111e(int i) {
        Math.abs(f190Y[10]);
        if (i == 1) {
            if (f190Y[10] < 0 && f190Y[13] == 1) {
                int[] iArr = f190Y;
                iArr[10] = iArr[10] + 128;
                if (f190Y[10] > 0) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                }
            }
            if (f190Y[10] == 0) {
                int[] iArr2 = f190Y;
                iArr2[10] = iArr2[10] + f168aa;
            }
            int[] iArr3 = f190Y;
            iArr3[10] = iArr3[10] + f168aa;
            if (f190Y[10] <= 0 || f190Y[13] != 1) {
                return;
            }
            f190Y[13] = 0;
            f190Y[14] = 0;
            return;
        }
        if (f190Y[10] > 0 && f190Y[13] == 2) {
            int[] iArr4 = f190Y;
            iArr4[10] = iArr4[10] - 128;
            if (f190Y[10] < 0) {
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
            }
        }
        if (f190Y[10] == 0) {
            int[] iArr5 = f190Y;
            iArr5[10] = iArr5[10] - f168aa;
        }
        int[] iArr6 = f190Y;
        iArr6[10] = iArr6[10] - f168aa;
        if (f190Y[10] >= 0 || f190Y[13] != 2) {
            return;
        }
        f190Y[13] = 0;
        f190Y[14] = 0;
    }

    /* renamed from: E */
    public final void m491E() {
        if (this.f359l) {
            f190Y[12] = 0;
            if (f190Y[13] == 0) {
                f190Y[13] = 2;
                f190Y[14] = 2;
            }
            m111e(1);
        } else if (!this.f418y) {
            if (this.f314b == 5 && this.f315c != 2 && (37 == f190Y[8] || 38 == f190Y[8] || 39 == f190Y[8] || 41 == f190Y[8] || 42 == f190Y[8] || 47 == f190Y[8] || 48 == f190Y[8] || 49 == f190Y[8] || 52 == f190Y[8] || 59 == f190Y[8] || 62 == f190Y[8] || 69 == f190Y[8] || 71 == f190Y[8] || 72 == f190Y[8] || 78 == f190Y[8] || 79 == f190Y[8] || 87 == f190Y[8] || 88 == f190Y[8] || 89 == f190Y[8])) {
                int[] iArr = f190Y;
                iArr[10] = iArr[10] + 256;
                if (2560 < f190Y[10]) {
                    f190Y[10] = 2560;
                }
            } else if (this.f387L > 0) {
                this.f387L--;
            } else if (f166c[3]) {
                if (f190Y[13] == 0) {
                    f190Y[13] = 1;
                }
                if (f190Y[14] == 0) {
                    f190Y[14] = 1;
                }
                f190Y[12] = 1;
                m101f(0);
            } else if (f166c[4]) {
                if (f190Y[13] == 0) {
                    f190Y[13] = 2;
                }
                if (f190Y[14] == 0) {
                    f190Y[14] = 2;
                }
                f190Y[12] = 0;
                m101f(1);
            }
        }
        int[] iArr2 = f169O;
        iArr2[0] = iArr2[0] + ((m429a(f17af + 90) * f190Y[10]) / 100);
        int[] iArr3 = f169O;
        iArr3[1] = iArr3[1] + ((m276b(f17af + 90) * f190Y[10]) / 100);
        if (f190Y[10] != 0 && f190Y[10] != 0) {
            if (f190Y[10] < 0) {
                int[] iArr4 = f190Y;
                iArr4[10] = iArr4[10] + f168aa;
                if (f190Y[10] >= 0) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    f198N = false;
                }
            } else {
                int[] iArr5 = f190Y;
                iArr5[10] = iArr5[10] - f168aa;
                if (f190Y[10] <= 0) {
                    f190Y[10] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                    f198N = false;
                }
            }
        }
        if (f190Y[10] == 0) {
            f198N = false;
            f243bh = 0;
        }
    }

    /* renamed from: f */
    public final void m101f(int i) {
        if (i == 1) {
            int[] iArr = f190Y;
            iArr[10] = iArr[10] + (f168aa >> 1);
            if (Math.abs(f190Y[10]) > 4096) {
                if (f190Y[10] < 0) {
                    f190Y[10] = -4096;
                    return;
                } else {
                    f190Y[10] = 4096;
                    return;
                }
            }
            return;
        }
        int[] iArr2 = f190Y;
        iArr2[10] = iArr2[10] - (f168aa >> 1);
        if (Math.abs(f190Y[10]) > 4096) {
            if (f190Y[10] < 0) {
                f190Y[10] = -4096;
            } else {
                f190Y[10] = 4096;
            }
        }
    }

    /* renamed from: g */
    public final void m94g(int i) {
        if (f33D) {
            return;
        }
        if (0 == i) {
            int i2 = f17af;
            int i3 = i2;
            if (i2 < 0) {
                i3 = 0;
                if (f17af != 0 && !f33D && (f17af <= 22 || f17af >= 338)) {
                    i3 = f190Y[10] > 0 ? 90 : f190Y[10] < 0 ? 270 : f17af;
                }
            }
            if (f17af <= 22 || f17af >= 338) {
                return;
            }
            int[] iArr = f190Y;
            iArr[10] = iArr[10] + ((m276b(i3 + 90) * 32) / 100);
            return;
        }
        int i4 = f190Y[10];
        int i5 = f17af;
        int i6 = i5;
        if (i5 < 0) {
            i6 = 0;
            if (f17af != 0 && !f33D && (f17af <= 22 || f17af >= 338)) {
                i6 = f190Y[10] > 0 ? 90 : f190Y[10] < 0 ? 270 : f17af;
            }
        }
        if (i6 < 338 && i6 > 22) {
            if ((m276b(i6 + 90) * 80) / 100 < 0 && f190Y[10] < 0) {
                int[] iArr2 = f190Y;
                iArr2[10] = iArr2[10] + ((m276b(i6 + 90) * 80) / 100);
            }
            if ((m276b(i6 + 90) * 80) / 100 > 0 && f190Y[10] > 0) {
                int[] iArr3 = f190Y;
                iArr3[10] = iArr3[10] + ((m276b(i6 + 90) * 80) / 100);
            }
        } else if (f17af == 338 || f17af == 22) {
            if ((m276b(i6 + 90) << 5) / 100 < 0 && f190Y[10] < 0) {
                int[] iArr4 = f190Y;
                iArr4[10] = iArr4[10] + ((m276b(i6 + 90) * 80) / 100);
            }
            if ((m276b(i6 + 90) << 5) / 100 > 0 && f190Y[10] > 0) {
                int[] iArr5 = f190Y;
                iArr5[10] = iArr5[10] + ((m276b(i6 + 90) * 80) / 100);
            }
        } else {
            int[] iArr6 = f190Y;
            iArr6[10] = iArr6[10] + ((m276b(i6 + 90) * 80) / 100);
        }
        if (f190Y[10] >= 0 && i4 <= 0) {
            f190Y[10] = 0;
            f190Y[13] = 0;
            f190Y[14] = 0;
            f198N = false;
        }
        if (f190Y[10] > 0 || i4 < 0) {
            return;
        }
        f190Y[10] = 0;
        f190Y[13] = 0;
        f190Y[14] = 0;
        f198N = false;
    }

    /* renamed from: a */
    public final void m387a(boolean z) {
        try {
            int i = 112;
            if (this.f365z > 0) {
                i = 112 + (this.f365z << 1);
            }
            if (this.f364y > 0) {
                i -= this.f364y << 1;
            }
            if (this.f314b == 0 && this.f315c == 3) {
                this.f368f[0] = 0;
                this.f368f[2] = 0;
                this.f368f[1] = 3824;
                this.f368f[3] = 256;
            } else if (this.f314b == 5 && this.f315c == 3) {
                this.f368f[0] = 0;
                this.f368f[2] = 0;
                this.f368f[1] = 1440;
                this.f368f[3] = 64 + i;
                if (f209W) {
                    int[] iArr = this.f368f;
                    iArr[1] = iArr[1] + 768;
                }
                if (f177R[0] >= 1200) {
                    if (f208V) {
                        this.f368f[0] = 1200;
                        this.f368f[1] = 1440;
                        this.f368f[2] = 32;
                        this.f368f[3] = 32 + i;
                    }
                    if (f209W) {
                        this.f368f[0] = 1200;
                    }
                    if (f177R[0] >= 1808) {
                        this.f368f[0] = 1808;
                        this.f368f[1] = 2048;
                        this.f368f[2] = 32;
                        this.f368f[3] = 64 + i;
                    }
                }
            } else {
                this.f368f[0] = 0;
                this.f368f[2] = 0;
                this.f368f[1] = f42b[15 + this.f314b][this.f315c][2] + 320;
                this.f368f[3] = m434a() + (240 - (184 - i));
                if (this.f74a == 2) {
                    this.f359l = true;
                }
                if (this.f315c == 2 && this.f314b == 1) {
                    if (m280b() >= this.f367a[this.f314b][this.f315c] || this.f74a == 1) {
                        this.f368f[0] = this.f367a[this.f314b][this.f315c] - 144;
                        this.f74a = (byte) 1;
                    }
                } else if (this.f315c < 2) {
                    if (m280b() >= this.f367a[this.f314b][this.f315c] || this.f74a == 1) {
                        this.f368f[0] = this.f367a[this.f314b][this.f315c] - 144;
                        this.f74a = (byte) 1;
                    }
                } else if (this.f74a == 2 && this.f314b != 1) {
                    this.f368f[0] = (short) (f42b[15 + this.f314b][this.f315c][2] + 320);
                }
                if (this.f314b == 1 && this.f315c == 2) {
                    int[] iArr2 = this.f368f;
                    iArr2[3] = iArr2[3] + 56;
                }
                if (this.f314b == 5 && this.f315c == 1) {
                    int[] iArr3 = this.f368f;
                    iArr3[3] = iArr3[3] - 168;
                }
                if (this.f315c == 2 && this.f314b != 1 && f209W) {
                    int[] iArr4 = this.f368f;
                    iArr4[1] = iArr4[1] + 256;
                }
                if (f208V) {
                    if (this.f314b == 0) {
                        this.f368f[0] = 10632;
                        this.f368f[1] = 10872;
                        this.f368f[2] = 0;
                        this.f368f[3] = 800 + i;
                    } else if (this.f314b == 2) {
                        this.f368f[0] = 6168;
                        this.f368f[1] = 6440;
                        this.f368f[2] = 560;
                        this.f368f[3] = 568 + i;
                    } else if (this.f314b == 4) {
                        this.f368f[0] = 11304;
                        this.f368f[1] = 11544;
                        this.f368f[2] = 1232;
                        this.f368f[3] = 1248 + i;
                    } else if (this.f314b == 3) {
                        this.f368f[0] = 8280;
                        this.f368f[1] = 8520;
                        this.f368f[2] = 528;
                        this.f368f[3] = 576 + i;
                    }
                }
                if (f209W) {
                    if (this.f314b == 0) {
                        this.f368f[0] = 10632;
                    } else if (this.f314b == 2) {
                        this.f368f[0] = 6168;
                    } else if (this.f314b == 4) {
                        this.f368f[0] = 11304;
                    } else if (this.f314b == 3) {
                        this.f368f[0] = 8280;
                    }
                }
            }
            if (f199O) {
                m479I();
                return;
            }
            int i2 = 0;
            while (i2 < 2) {
                int i3 = i2 == 0 ? 120 : i;
                int m280b = i2 == 0 ? m280b() : m204c();
                if (i2 == 0) {
                    if (!f208V && f207aA == 0 && this.f314b == 5 && this.f315c == 3) {
                        m377aA();
                    } else if (!f208V && f207aA == 0 && this.f314b == 1 && this.f315c == 2 && m280b() >= 7488 && m204c() <= 1536) {
                        m377aA();
                    }
                    if (f177R[i2] >= this.f368f[1] - 240 && !f208V && f207aA == 0 && this.f315c == 2) {
                        m377aA();
                    }
                }
                if (i2 != 0) {
                    if (f208V && ((this.f314b != 1 || this.f315c != 2) && f177R[i2] + i > this.f368f[(i2 * 2) + 1])) {
                        f177R[i2] = this.f368f[(i2 * 2) + 1] - i;
                    }
                    if (m280b - f177R[i2] != i3) {
                        if (m280b - f177R[i2] < i3 - 0) {
                            int[] iArr5 = f177R;
                            int i4 = i2;
                            iArr5[i4] = iArr5[i4] - ((i3 - 0) - (m280b - f177R[i2]));
                            if (!((this.f314b == 1 && this.f315c == 2 && f177R[0] < 7936) || (this.f314b == 5 && this.f315c == 1)) || this.f365z > 0 || this.f364y > 0) {
                                if (f177R[i2] < this.f368f[i2 * 2]) {
                                    f177R[i2] = this.f368f[i2 * 2];
                                }
                            } else if (f177R[i2] < this.f368f[i2 * 2]) {
                                f190Y[1] = ((this.f368f[(i2 * 2) + 1] + f177R[i2]) + i3) << 8;
                                f177R[i2] = this.f368f[(i2 * 2) + 1] + f177R[i2];
                            }
                            if (this.f314b == 1 && this.f315c == 0 && f190Y[1] < 8192) {
                                f190Y[1] = 8192;
                                if (f190Y[5] < 0) {
                                    f190Y[5] = 0;
                                }
                            }
                            if (this.f314b == 4 && f190Y[1] < 8192) {
                                f190Y[1] = 8192;
                                if (f190Y[5] < 0) {
                                    f190Y[5] = 0;
                                }
                            }
                        } else if (m280b - f177R[i2] > i3) {
                            int[] iArr6 = f177R;
                            int i5 = i2;
                            iArr6[i5] = iArr6[i5] - (i3 - (m280b - f177R[i2]));
                            if (!((this.f314b == 1 && this.f315c == 2 && f177R[0] < 7936) || (this.f314b == 5 && this.f315c == 1)) || this.f365z > 0 || this.f364y > 0) {
                                if ((this.f314b == 1 && this.f315c == 2 && f177R[0] < 7936) || (this.f314b == 5 && this.f315c == 1)) {
                                    if (this.f364y <= 0 && f177R[i2] > this.f368f[(i2 * 2) + 1]) {
                                        f177R[i2] = this.f368f[(i2 * 2) + 1];
                                    }
                                } else if (f177R[i2] + i > this.f368f[(i2 * 2) + 1]) {
                                    f177R[i2] = this.f368f[(i2 * 2) + 1] - i;
                                }
                            } else if (f177R[i2] > this.f368f[(i2 * 2) + 1]) {
                                f177R[i2] = f177R[i2] % this.f368f[(i2 * 2) + 1];
                                f190Y[1] = f190Y[1] % (this.f368f[(i2 * 2) + 1] << 8);
                            }
                            if ((this.f314b != 1 || this.f315c != 2) && (this.f314b != 5 || this.f315c != 1)) {
                                if (this.f314b != 3 || ((f177R[i2] + 168) << 8) >= f190Y[i2]) {
                                    if ((((f177R[i2] - 16) + 240) << 8) < f190Y[i2] && !f199O) {
                                        f190Y[i2] = ((f177R[i2] - 16) + 240) << 8;
                                        m482H();
                                    }
                                } else if (!f199O) {
                                    f190Y[i2] = ((f177R[i2] - 16) + 240) << 8;
                                    m482H();
                                }
                            }
                        }
                    }
                } else if (m280b - f177R[i2] != i3) {
                    if (m280b - f177R[i2] < i3) {
                        if (!this.f416x) {
                            this.f377v = true;
                            int[] iArr7 = f177R;
                            int i6 = i2;
                            iArr7[i6] = iArr7[i6] - (i3 - (m280b - f177R[i2]));
                            if (f177R[i2] < this.f368f[i2 << 1]) {
                                f177R[i2] = this.f368f[i2 << 1];
                            }
                            if (((f177R[i2] + 16) << 8) > f190Y[0]) {
                                f190Y[0] = (f177R[i2] + 16) << 8;
                                if (f190Y[10] < 0) {
                                    f190Y[10] = 0;
                                    f190Y[13] = 0;
                                    f190Y[14] = 0;
                                }
                                if (!f196L && f198N) {
                                    f198N = false;
                                }
                                if (f196L && f190Y[3] < 0) {
                                    f190Y[3] = 0;
                                }
                            }
                        } else if (((f177R[i2] + 16) << 8) > f190Y[0]) {
                            f190Y[0] = (f177R[i2] + 16) << 8;
                            if (f190Y[10] < 0) {
                                f190Y[10] = 0;
                                f190Y[13] = 0;
                                f190Y[14] = 0;
                            }
                            if (!f196L && f198N) {
                                f198N = false;
                            }
                        }
                    } else if (m280b - f177R[i2] > i3) {
                        this.f376u = true;
                        int[] iArr8 = f177R;
                        int i7 = i2;
                        iArr8[i7] = iArr8[i7] - (i3 - (m280b - f177R[i2]));
                        if (f177R[i2] + (i3 * 2) > this.f368f[(i2 << 1) + 1]) {
                            f177R[i2] = this.f368f[(i2 << 1) + 1] - (i3 << 1);
                        }
                        if (this.f359l) {
                            if ((((f177R[i2] + 96) + 240) << 8) < f190Y[0]) {
                                f190Y[0] = ((f177R[i2] + 96) + 240) << 8;
                                f190Y[10] = 0;
                                f190Y[13] = 0;
                                f190Y[14] = 0;
                                if (!f196L && f198N) {
                                    f198N = false;
                                }
                            }
                        } else if ((((f177R[i2] - 16) + 240) << 8) < f190Y[0]) {
                            f190Y[0] = ((f177R[i2] - 16) + 240) << 8;
                            f190Y[10] = 0;
                            f190Y[13] = 0;
                            f190Y[14] = 0;
                            if (!f196L && f198N) {
                                f198N = false;
                            }
                        }
                    }
                }
                if (f177R[i2] < 0) {
                    f177R[i2] = 0;
                }
                i2++;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final int m434a() {
        int i = (f37ax * 256) - 232;
        switch (this.f314b) {
            case 0:
                i = m430a((byte) this.f315c);
                break;
            case 1:
                i = 1824;
                break;
            case 2:
                i = m277b((byte) this.f315c);
                break;
            case 3:
                i = m201c((byte) this.f315c);
                break;
            case 4:
                i = m132d((byte) this.f315c);
                break;
            case 5:
                i = m113e((byte) this.f315c);
                break;
        }
        return i;
    }

    /* renamed from: a */
    public final int m430a(byte b) {
        int i;
        switch (b) {
            case 0:
                i = 1024;
                if (6016 > f177R[0]) {
                    i = 768;
                    break;
                }
                break;
            case 1:
                i = 768;
                if (3792 <= f177R[0]) {
                    if (5632 <= f177R[0]) {
                        if (7520 > f177R[0]) {
                            i = 1024;
                            break;
                        }
                    } else {
                        i = 512;
                        break;
                    }
                } else {
                    i = 768;
                    break;
                }
                break;
            default:
                i = 1216;
                if (896 <= f177R[0]) {
                    if (2400 <= f177R[0]) {
                        if (640 <= f177R[1]) {
                            if (4992 <= f177R[0]) {
                                i = 1024;
                                if (5888 <= f177R[0]) {
                                    if (f177R[1] <= 880) {
                                        i = 768;
                                        break;
                                    } else if (6144 <= f177R[0]) {
                                        this.f368f[1] = 6384;
                                        f207aA = 1;
                                        break;
                                    }
                                }
                            }
                        } else {
                            i = 768;
                            break;
                        }
                    } else {
                        i = 784;
                        break;
                    }
                } else {
                    i = 768;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: b */
    public final int m277b(byte b) {
        int i;
        switch (b) {
            case 0:
                if ((f29ar == 0 && f30as == 0) || f177R[0] != 0 || f177R[1] != 0) {
                    if (m280b() > 3584 && m280b() < 4096 && m204c() > 1024 && m204c() < 1248) {
                        i = 1280;
                        break;
                    } else if (3696 > f177R[0]) {
                        if (1792 <= f177R[0]) {
                            if (2400 <= f177R[0] && 2752 > f177R[0]) {
                                i = 1280;
                                if (728 > f177R[1]) {
                                    i = 544;
                                    break;
                                }
                            } else {
                                i = 1280;
                                if (728 <= f177R[1]) {
                                    if (1176 > f177R[1] && 3792 > f177R[0]) {
                                        i = 832;
                                        break;
                                    }
                                } else {
                                    i = 832;
                                    if (3328 > f177R[0]) {
                                        i = 544;
                                        break;
                                    }
                                }
                            }
                        } else {
                            i = 464;
                            break;
                        }
                    } else {
                        i = 528;
                        if (5168 > f177R[0]) {
                            i = 1280;
                            break;
                        }
                    }
                } else {
                    i = 1280;
                    break;
                }
                break;
            case 1:
                i = 512;
                if (5888 > f177R[0]) {
                    i = 1312;
                    break;
                }
                break;
            default:
                i = 1824;
                if (5472 < f177R[0] && m204c() < 1280) {
                    i = 528;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: c */
    public final int m201c(byte b) {
        int i;
        switch (b) {
            case 0:
                i = 1824;
                break;
            case 1:
                i = ((f37ax << 8) - 72) - 168;
                break;
            default:
                i = 528;
                if (7936 > f177R[0]) {
                    i = 1792;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: d */
    public final int m132d(byte b) {
        int i = 1824;
        switch (b) {
            case 0:
                break;
            case 1:
                i = 1312;
                if (9632 <= f177R[0] && 1248 > m204c()) {
                    i = 1056;
                    break;
                }
                break;
            default:
                i = 1228;
                if (11264 > f177R[0]) {
                    i = 1824;
                    break;
                }
                break;
        }
        return i;
    }

    /* renamed from: e */
    public final int m113e(byte b) {
        int i;
        switch (b) {
            case 0:
                i = 672;
                if (6272 <= f177R[0]) {
                    if (8192 > f177R[0]) {
                        i = 1568;
                        break;
                    }
                } else {
                    i = 1824;
                    break;
                }
                break;
            case 1:
                i = 8032;
                if (6144 <= f177R[0]) {
                    if (7680 > f177R[0]) {
                        i = 1464;
                        break;
                    }
                } else {
                    i = 2048;
                    break;
                }
                break;
            default:
                i = 1824;
                break;
        }
        return i;
    }

    /* renamed from: h */
    public final void m87h(int i) {
        m2z();
        if (this.f314b != 1 || this.f384be >= m204c() - 12) {
            if (f169O[0] > 4096) {
                f169O[0] = 4096;
            }
            if (f169O[0] < -4096) {
                f169O[0] = -4096;
            }
            if (f169O[1] > 4096) {
                f169O[1] = 4096;
            }
            if (f169O[1] < -4096) {
                f169O[1] = -4096;
            }
            int[] iArr = f190Y;
            iArr[0] = iArr[0] + f169O[0];
            int[] iArr2 = f190Y;
            iArr2[1] = iArr2[1] + f169O[1];
        } else {
            int[] iArr3 = f190Y;
            iArr3[0] = iArr3[0] + (f169O[0] >> 1);
            int[] iArr4 = f190Y;
            iArr4[1] = iArr4[1] + (f169O[1] >> 1);
        }
        if (i == 1) {
            if (f13ab > 0) {
                f13ab--;
            } else if (this.f314b != 1 || this.f384be >= m204c() - 12) {
                int[] iArr5 = f190Y;
                iArr5[5] = iArr5[5] + 56;
            } else {
                int[] iArr6 = f190Y;
                iArr6[5] = iArr6[5] + 28;
            }
        }
        if (i == 1 && f198N) {
            int[] iArr7 = f190Y;
            iArr7[11] = iArr7[11] + f167Z;
        } else if (Math.abs(f169O[0]) + Math.abs(f169O[1]) > f167Z) {
            int[] iArr8 = f190Y;
            iArr8[11] = iArr8[11] + f167Z;
        } else {
            int[] iArr9 = f190Y;
            iArr9[11] = iArr9[11] + Math.abs(f169O[0]) + Math.abs(f169O[1]);
        }
    }

    /* renamed from: n */
    public final boolean m53n() {
        if (f17af > 290 || f17af < 70) {
            return false;
        }
        if (f17af < 90 || f17af > 270) {
            if (Math.abs(f190Y[10]) < 640) {
                if (f190Y[10] < 0) {
                    f190Y[12] = 1;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                } else {
                    f190Y[12] = 0;
                    f190Y[13] = 0;
                    f190Y[14] = 0;
                }
                int abs = Math.abs(f190Y[10]);
                f190Y[5] = 280;
                f190Y[3] = (-(m429a(f17af + 90) * abs)) / 100;
                f196L = true;
                f192H = false;
                f33D = false;
                this.f387L = 30;
                m82i();
                return false;
            }
            return false;
        } else if (Math.abs(f190Y[10]) < 640) {
            if (f190Y[10] < 0) {
                f190Y[12] = 1;
                f190Y[13] = 0;
                f190Y[14] = 0;
            } else {
                f190Y[12] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
            }
            int i = f190Y[10];
            f190Y[5] = (m276b(f17af + 90) * i) / 100;
            if (f17af > 90 && f17af < 270) {
                f190Y[5] = 0;
            }
            f190Y[3] = (m429a(f17af + 90) * i) / 100;
            f196L = true;
            f192H = false;
            f33D = false;
            this.f369B = 15;
            if (f17af == 90 || f17af == 270) {
                this.f369B = 0;
            }
            m82i();
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int m280b() {
        return f190Y[0] >> 8;
    }

    /* renamed from: c */
    public final int m204c() {
        return f190Y[1] >> 8;
    }

    /* renamed from: F */
    public final void m488F() {
        if (!this.f370p && f18ag <= 0) {
            if (f21aj > 0) {
                f21aj = 0;
                f19ah = 60;
                f192H = true;
                f196L = true;
                if (f190Y[12] == 1) {
                    f190Y[3] = 512;
                } else {
                    f190Y[3] = -512;
                }
                m391a("a3");
                f190Y[5] = -1024;
                f190Y[12] = (f190Y[12] + 1) % 2;
                f190Y[13] = 0;
                f190Y[14] = 0;
                this.f310a = 9;
                m318ah();
                this.f370p = true;
            } else if (f19ah <= 0) {
                if (f23al <= 0) {
                    m482H();
                    m391a("a3");
                    return;
                }
                this.f310a = 9;
                m318ah();
                f19ah = 60;
                f192H = true;
                f196L = true;
                if (m48o()) {
                    this.f371C = 10;
                    f190Y[3] = -512;
                    f190Y[5] = -1024;
                } else {
                    if (f190Y[12] == 1) {
                        f190Y[3] = 512;
                    } else {
                        f190Y[3] = -512;
                    }
                    f190Y[5] = -1024;
                }
                f190Y[12] = (f190Y[12] + 1) % 2;
                f190Y[13] = 0;
                f190Y[14] = 0;
                m391a("c6");
                m62l(m280b(), m204c() - 12, f23al);
                f23al = 0;
                this.f370p = true;
            }
        }
    }

    /* renamed from: G */
    public final void m485G() {
        if (!this.f370p && f18ag <= 0) {
            if (f21aj > 0) {
                f21aj = 0;
                f19ah = 60;
                f192H = true;
                f196L = true;
                if (f190Y[12] == 1) {
                    f190Y[3] = 512;
                } else {
                    f190Y[3] = -512;
                }
                m391a("a3");
                f190Y[5] = -1024;
                f190Y[12] = (f190Y[12] + 1) % 2;
                f190Y[13] = 0;
                f190Y[14] = 0;
                this.f310a = 9;
                m318ah();
                this.f370p = true;
            } else if (f19ah <= 0) {
                if (f23al <= 0) {
                    m482H();
                    m391a("a3");
                    return;
                }
                this.f310a = 9;
                m318ah();
                f19ah = 60;
                f192H = true;
                f196L = true;
                if (m48o()) {
                    this.f371C = 10;
                    f190Y[3] = 512;
                    f190Y[5] = 0;
                } else {
                    if (f190Y[12] == 1) {
                        f190Y[3] = 512;
                    } else {
                        f190Y[3] = -512;
                    }
                    f190Y[5] = -1024;
                }
                f190Y[12] = (f190Y[12] + 1) % 2;
                f190Y[13] = 0;
                f190Y[14] = 0;
                m391a("c6");
                m62l(m280b(), m204c() - 12, f23al);
                f23al = 0;
                this.f370p = true;
            }
        }
    }

    /* renamed from: H */
    public final void m482H() {
        if (f199O) {
            this.f54c = true;
            this.f55l = 10;
            return;
        }
        m391a("a3");
        this.f310a = 9;
        m318ah();
        f205U = true;
        this.f363x = 2100;
        this.f373Z = true;
        f196L = true;
        f192H = false;
        f198N = false;
        f199O = true;
        this.f75q = true;
        f33D = false;
        f190Y[10] = 0;
        f190Y[13] = 0;
        f190Y[14] = 0;
        f13ab = 5;
        f190Y[3] = 0;
        f190Y[5] = (m276b(0) * 1664) / 100;
        f27ap = 120;
    }

    /* renamed from: I */
    public final void m479I() {
        if (f199O) {
            f190Y[3] = 0;
            f27ap--;
            if ((((f177R[1] - 16) + 240) << 8) < f190Y[1] && this.f75q) {
                this.f75q = false;
                f28aq--;
                if (f28aq <= 0) {
                    m493D(21);
                    f27ap = 660;
                    this.f54c = true;
                    this.f55l = 10;
                    int i = 0;
                    while (true) {
                        if (i >= f234aa.length) {
                            break;
                        } else if (f234aa[i] < f24am) {
                            for (int length = f234aa.length - 1; length > i; length--) {
                                f234aa[length] = f234aa[length - 1];
                                f235ab[length] = f235ab[length - 1];
                            }
                            f234aa[i] = f24am;
                            f235ab[i] = f231n[0];
                            m77j();
                        } else {
                            i++;
                        }
                    }
                } else if (f25an == 59 && f26ao == 9) {
                    f27ap = 240;
                    this.f77s = true;
                    this.f54c = true;
                    this.f55l = 10;
                    f31at = 0;
                    f32au = 0;
                    this.f78t = true;
                }
            }
            if (f27ap < 0) {
                if (f28aq > 0) {
                    m25t();
                    return;
                }
                m357aK();
                this.f54c = true;
                this.f55l = 10;
            }
        }
    }

    /* renamed from: i */
    public final void m81i(int i) {
        this.f320e[0] = true;
        if (this.f370p || f190Y[5] < 0) {
            return;
        }
        if (f196L && f198N && !f197M) {
            f198N = false;
        }
        int i2 = f215bb - 8;
        if (i2 >= 0 && Math.abs(m280b() - f216bc) > i2) {
            f79Y = true;
            f80ba = 0;
            if (m280b() - f216bc > 0) {
                f80ba = 1;
            }
        }
        this.f73o = false;
        f190Y[8] = 0;
        f190Y[5] = 0;
        if (f196L) {
            f190Y[10] = f190Y[3];
            if (f190Y[10] < 0) {
                f190Y[13] = 1;
            }
            if (f190Y[10] > 0) {
                f190Y[13] = 2;
            }
            f190Y[14] = 0;
        }
        f190Y[3] = 0;
        f33D = true;
        f35av = i;
        f17af = 0;
        f196L = false;
        f191G = false;
        f193I = false;
        f243bh = 0;
    }

    /* renamed from: a */
    public final int m425a(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (f40b[((i2 >> 4) >> 4) % f37ax][(i >> 4) >> 4] << 9) + ((((i >> 4) & 15) + (((i2 >> 4) & 15) << 4)) << 1) + 1;
        if (this.f330l[i3 >> 1] == 1) {
            return -1;
        }
        int m131d = (m131d((f183d[i3] & 255) + (this.f328j[i3 >> 1] << 8)) * 360) / 255;
        if (this.f329k[i3 >> 1] == 1) {
            m131d = 360 - m131d;
        } else if (this.f329k[i3 >> 1] == 2) {
            m131d = 540 - m131d;
        } else if (this.f329k[i3 >> 1] == 3) {
            m131d = 360 - ((540 - m131d) % 360);
        }
        if (m131d % 90 == 0) {
            if (f17af == 62) {
                return 90;
            }
            m131d = Math.abs(((f17af - 22) + 45) / 90) * 90;
            if (f17af == 44) {
                m131d = 0;
            }
        }
        return m131d % 360;
    }

    /* renamed from: a */
    public final void m401a(Graphics graphics) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f59f || this.f418y) {
            return;
        }
        int i5 = f211b[0];
        int i6 = (540 - f17af) % 360;
        if (f190Y[12] == 1) {
            i5 = f211b[4];
        }
        f190Y[11] = f190Y[11] % 92160;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        if (f199O) {
            if (this.f76r) {
                m398a(graphics, 1, 280, 80, 40, 44, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
            } else {
                m398a(graphics, 1, 200, 80, 40, 44, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
            }
        } else if (f191G) {
            m398a(graphics, 1, 240, 80, 40, 45, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        } else if (f192H && f196L) {
            m398a(graphics, 1, 160, 80, 40, 40, f190Y[12] == 1 ? f211b[0] : f211b[4], m280b() - f179T[0], (m204c() - f179T[1]) - 5, 3);
        } else if (f15ad > 0) {
            m398a(graphics, 1, 352, 0, 40, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
            f15ad--;
        } else if (f195K) {
            m398a(graphics, 1, 144 + (48 * ((this.f318f >> 1) % 2)), 128, 49, 32, f211b[4], m280b() - f179T[0], m204c() - f179T[1], 3);
            f195K = false;
        } else if (f194J) {
            if ((this.f318f >> 1) % 5 < 3) {
                m398a(graphics, 1, 48 * ((this.f318f >> 1) % 5), 120, 45, 24, f211b[0], m280b() - f179T[0], m204c() - f179T[1], 3);
            } else {
                m398a(graphics, 1, 240 - (48 * ((this.f318f >> 1) % 5)), 120, 45, 24, f211b[4], m280b() - f179T[0], m204c() - f179T[1], 3);
            }
            f194J = false;
        } else if (f198N && f196L) {
            i7 = 0;
            i9 = -21;
            i10 = -21;
            if (f196L && f17af == 270) {
                i7 = 0 - 16;
                i9 = (-21) - 16;
                i10 = (-21) - 16;
            }
            m398a(graphics, 1, 192 + ((((f190Y[11] / f167Z) / 4) % 5) * 32), 0, 32, 40, i5, (m280b() - f179T[0]) + i7, m204c() - f179T[1], 3);
        } else if (f193I) {
            m398a(graphics, 1, 120 + (40 * ((this.f318f / 2) % 2)), 80, 40, 40, i5, m280b() - f179T[0], (m204c() - f179T[1]) - 5, 3);
        } else if (f198N && !f196L) {
            i7 = (-16) + ((m429a(i6) * 16) / 100);
            i8 = (-15) - ((m276b(i6) * 15) / 100);
            i9 = (-21) + ((m429a(i6) * 21) / 100);
            i10 = (-21) - ((m276b(i6) * 21) / 100);
            m398a(graphics, 1, 192 + ((((f190Y[11] / f167Z) / 4) % 5) * 32), 10, 32, 30, i5, (m280b() - f179T[0]) + i7, (m204c() - f179T[1]) + i8, 20);
        } else if (f200P) {
            m398a(graphics, 1, 0, 80, 40, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
            f200P = false;
        } else if (f201Q) {
            m398a(graphics, 1, 160, 0, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
            f201Q = false;
        } else if (this.f362w > 0) {
            m398a(graphics, 1, 288 + (((this.f318f / 4) % 4) * 32), 120, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        } else if (f190Y[10] != 0 || f196L) {
            if (!f196L && ((f190Y[14] == 2 && f190Y[10] > 0 && f190Y[12] == 1) || (f190Y[14] == 1 && f190Y[10] < 0 && f190Y[12] == 0))) {
                int i11 = f211b[0];
                if (f190Y[12] == 0) {
                    i11 = f211b[4];
                }
                m398a(graphics, 1, 360 + ((((f190Y[11] / f167Z) / 4) % 2) * 40), 80, 40, 40, i11, m280b() - f179T[0], m204c() - f179T[1], 3);
            } else if (Math.abs(f190Y[10]) >= f167Z) {
                i7 = (-20) + ((m429a(i6) * 20) / 100);
                i8 = (-20) - ((m276b(i6) * 20) / 100);
                i9 = (-21) + ((m429a(i6) * 21) / 100);
                i10 = (-21) - ((m276b(i6) * 21) / 100);
                if (f196L && f17af != 0) {
                    i7 += (m276b(f17af) * 20) / 100;
                }
                if (f190Y[12] == 1) {
                    int[] iArr = {f211b[5], f211b[5], f211b[4], f211b[4], f211b[7], f211b[7], f211b[6], f211b[6]};
                    int i12 = 0;
                    while (i12 < 7 && ((i12 * 45) + 23 >= i6 || ((i12 + 1) * 45) + 23 < i6)) {
                        i12++;
                    }
                    i3 = iArr[i12];
                    i4 = i12 % 2;
                } else {
                    int[] iArr2 = {f211b[2], f211b[1], f211b[1], f211b[0], f211b[0], f211b[3], f211b[3], f211b[2]};
                    int i13 = 0;
                    while (i13 < 7 && ((i13 * 45) + 23 >= i6 || ((i13 + 1) * 45) + 23 < i6)) {
                        i13++;
                    }
                    i3 = iArr2[i13];
                    i4 = i13 % 2;
                }
                if (i4 == 1) {
                    m398a(graphics, 1, 240 + ((((f190Y[11] / f167Z) / 4) % 4) * 40), 40, 40, 40, i3, (m280b() - f179T[0]) + i7, (m204c() - f179T[1]) + i8, 20);
                } else {
                    m398a(graphics, 2, 240 + ((((f190Y[11] / f167Z) / 4) % 4) * 40), 0, 40, 42, i3, (m280b() - f179T[0]) + i7, (m204c() - f179T[1]) + i8, 20);
                }
            } else {
                i7 = (-20) + ((m429a(i6) * 20) / 100);
                i8 = (-20) - ((m276b(i6) * 20) / 100);
                i9 = (-21) + ((m429a(i6) * 21) / 100);
                i10 = (-21) - ((m276b(i6) * 21) / 100);
                if (f196L && f17af != 0) {
                    i7 += (m276b(f17af) * 20) / 100;
                }
                if (f190Y[12] == 1) {
                    int[] iArr3 = {f211b[5], f211b[5], f211b[4], f211b[4], f211b[7], f211b[7], f211b[6], f211b[6]};
                    int i14 = 0;
                    while (i14 < 7 && ((i14 * 45) + 23 >= i6 || ((i14 + 1) * 45) + 23 < i6)) {
                        i14++;
                    }
                    i = iArr3[i14];
                    i2 = i14 % 2;
                } else {
                    int[] iArr4 = {f211b[2], f211b[1], f211b[1], f211b[0], f211b[0], f211b[3], f211b[3], f211b[2]};
                    int i15 = 0;
                    while (i15 < 7 && ((i15 * 45) + 23 >= i6 || ((i15 + 1) * 45) + 23 < i6)) {
                        i15++;
                    }
                    i = iArr4[i15];
                    i2 = i15 % 2;
                }
                if (i2 == 1) {
                    m398a(graphics, 1, (((f190Y[11] / f167Z) / 4) % 6) * 40, 40, 40, 40, i, (m280b() - f179T[0]) + i7, (m204c() - f179T[1]) + i8, 20);
                } else {
                    m398a(graphics, 2, (((f190Y[11] / f167Z) / 4) % 6) * 40, 0, 40, 42, i, (m280b() - f179T[0]) + i7, (m204c() - f179T[1]) + i8, 20);
                }
            }
        } else if (f79Y) {
            if (f80ba == 1) {
                m398a(graphics, 1, 40 + (((this.f372D / 8) % 2) * 40), 80, 40, 40, f211b[0], m280b() - f179T[0], m204c() - f179T[1], 3);
            } else {
                m398a(graphics, 1, 40 + (((this.f372D / 8) % 2) * 40), 80, 40, 40, f211b[4], m280b() - f179T[0], m204c() - f179T[1], 3);
            }
        } else if (!f33D && ((f17af <= 22 || f17af >= 338) && ((!m196c(m280b() + 12, m204c()) && !m196c(m280b() + 12, m204c() + 16)) || (!m196c(m280b() - 12, m204c()) && !m196c(m280b() - 12, m204c() + 16))))) {
            m398a(graphics, 1, 40 + (((this.f372D / 8) % 2) * 40), 80, 40, 40, (m196c(m280b() + 12, m204c()) || m196c(m280b() + 12, m204c() + 16)) ? f211b[4] : f211b[0], m280b() - f179T[0], m204c() - f179T[1], 3);
        } else if (this.f372D < 75) {
            m398a(graphics, 1, 0, 0, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        } else if (this.f372D < 90) {
            m398a(graphics, 1, 32, 0, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        } else if (this.f372D < 105) {
            m398a(graphics, 1, 64, 0, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        } else {
            m398a(graphics, 1, 96 + (((this.f372D / 8) % 2) * 32), 0, 32, 40, i5, m280b() - f179T[0], m204c() - f179T[1], 3);
        }
        if (this.f362w > 0) {
            this.f362w--;
        }
        if (f190Y[10] != 0 || f196L) {
            this.f372D = 0;
        } else {
            this.f372D++;
        }
        if (f18ag > 0) {
            if (this.f318f % 2 == 0) {
                if (i7 == 0 && i8 == 0) {
                    m195c(m280b(), m204c() - 18, 0);
                } else {
                    m195c(m280b() + i9 + 24, m204c() + i10 + 24, 0);
                }
            }
        } else if (f21aj > 0) {
            if (i7 == 0 && i8 == 0) {
                if (this.f318f % 3 == 2) {
                    m396a(f9a, this.GFX_GameArray[109], 48, 48, 48, 48, f211b[4], m280b() - f179T[0], (m204c() - 18) - f179T[1], 2);
                } else {
                    m396a(f9a, this.GFX_GameArray[109], 48, 48 * (this.f318f % 3), 48, 48, f211b[0], m280b() - f179T[0], (m204c() - 18) - f179T[1], 2);
                }
            } else if (this.f318f % 3 == 2) {
                m396a(f9a, this.GFX_GameArray[109], 48, 48, 48, 48, f211b[4], (m280b() - f179T[0]) + i9, (m204c() - f179T[1]) + i10, 20);
            } else {
                m396a(f9a, this.GFX_GameArray[109], 48, 48 * (this.f318f % 3), 48, 48, f211b[0], (m280b() - f179T[0]) + i9, (m204c() - f179T[1]) + i10, 20);
            }
        }
    }

    /* renamed from: c */
    private void m195c(int i, int i2, int i3) {
        for (int i4 = 0; i4 < f173o.length; i4++) {
            if (f173o[i4][0] == 0) {
                f173o[i4][0] = 1;
                f173o[i4][1] = i3;
                f173o[i4][2] = i;
                f173o[i4][3] = i2;
                f173o[i4][5] = 0;
                return;
            }
        }
    }

    /* renamed from: aj */
    private void m314aj() {
        for (int i = 0; i < f173o.length; i++) {
            if (f173o[i][0] == 1 && f173o[i][1] == 0) {
                int[] iArr = f173o[i];
                iArr[5] = iArr[5] + 1;
                if (f173o[i][5] > 60) {
                    f173o[i][5] = 0;
                    f173o[i][0] = 0;
                }
            }
        }
    }

    /* renamed from: ak */
    private void m312ak() {
        for (int i = 0; i < f173o.length; i++) {
            if (f173o[i][0] == 1 && f173o[i][1] == 0) {
                m396a(f9a, this.GFX_GameArray[109], 0, 48 * ((f173o[i][5] / 4) % 2), 48, 48, f211b[0], f173o[i][2] - f179T[0], f173o[i][3] - f179T[1], 2);
            }
        }
    }

    /* renamed from: j */
    public final void m75j(int i) {
        int i2 = 0;
        if (i > 3) {
            i = 3;
        }
        for (int i3 = 0; i3 < f187a[i].length / 7; i3++) {
            try {
                i2 = (0 == f187a[i][(i3 * 7) + 5] || 1 == f187a[i][(i3 * 7) + 5] || 63 == f187a[i][(i3 * 7) + 5] || 64 == f187a[i][(i3 * 7) + 5] || 65 == f187a[i][(i3 * 7) + 5] || 66 == f187a[i][(i3 * 7) + 5] || 67 == f187a[i][(i3 * 7) + 5] || 68 == f187a[i][(i3 * 7) + 5] || 69 == f187a[i][(i3 * 7) + 5]) ? i2 + 1 + f187a[i][(i3 * 7) + 6] : i2 + 1;
            } catch (Throwable unused) {
                return;
            }
        }
        f39X = new int[i2];
        f11a = new boolean[i2 + 20];
        f12b = new boolean[i2 + 20];
        int i4 = 0;
        for (int i5 = 0; i5 < f187a[i].length / 7; i5++) {
            f39X[i5] = i4;
            if (0 == f187a[i][(i5 * 7) + 5] || 1 == f187a[i][(i5 * 7) + 5] || 63 == f187a[i][(i5 * 7) + 5] || 64 == f187a[i][(i5 * 7) + 5] || 65 == f187a[i][(i5 * 7) + 5] || 66 == f187a[i][(i5 * 7) + 5] || 67 == f187a[i][(i5 * 7) + 5] || 68 == f187a[i][(i5 * 7) + 5] || 69 == f187a[i][(i5 * 7) + 5]) {
                for (int i6 = 0; i6 < f187a[i][(i5 * 7) + 6] + 1; i6++) {
                    i4++;
                }
            } else {
                i4++;
            }
        }
    }

    /* renamed from: J */
    public final void m476J() {
        if (this.f390w) {
            return;
        }
        if (this.f314b == 5 && this.f315c == 3) {
            return;
        }
        try {
            if (this.f376u) {
                if (this.f374E < this.f375F) {
                    this.f375F = this.f374E;
                } else {
                    this.f374E = this.f375F;
                }
                while (true) {
                    if ((((f187a[this.f315c][(this.f375F * 7) + 0] & 255) << 8) | (f187a[this.f315c][(this.f375F * 7) + 1] & 255)) - f177R[0] <= this.f379H) {
                        if (!f11a[f39X[this.f375F]]) {
                            m69k(this.f375F);
                        }
                        this.f375F++;
                        if (this.f375F >= f187a[this.f315c].length / 7) {
                            this.f375F = (f187a[this.f315c].length / 7) - 1;
                            this.f376u = false;
                            break;
                        }
                    } else {
                        this.f376u = false;
                        break;
                    }
                }
                while ((((f187a[this.f315c][(this.f374E * 7) + 0] & 255) << 8) | (f187a[this.f315c][(this.f374E * 7) + 1] & 255)) - f177R[0] < this.f378G) {
                    this.f374E++;
                    if (this.f374E >= f187a[this.f315c].length / 7) {
                        this.f374E = (f187a[this.f315c].length / 7) - 1;
                        return;
                    }
                }
            } else if (this.f377v) {
                if (this.f374E > this.f375F) {
                    this.f375F = this.f374E;
                } else {
                    this.f374E = this.f375F;
                }
                while (true) {
                    if ((((f187a[this.f315c][(this.f375F * 7) + 0] & 255) << 8) | (f187a[this.f315c][(this.f375F * 7) + 1] & 255)) - f177R[0] >= this.f378G) {
                        if (!f11a[f39X[this.f375F]]) {
                            m69k(this.f375F);
                        }
                        this.f375F--;
                        if (this.f375F < 0) {
                            this.f375F = 0;
                            this.f377v = false;
                            break;
                        }
                    } else {
                        this.f377v = false;
                        break;
                    }
                }
                while ((((f187a[this.f315c][(this.f374E * 7) + 0] & 255) << 8) | (f187a[this.f315c][(this.f374E * 7) + 1] & 255)) - f177R[0] > this.f379H) {
                    this.f374E--;
                    if (this.f374E < 0) {
                        this.f374E = 0;
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
            this.f376u = false;
        }
    }

    /* renamed from: k */
    public final void m69k(int i) {
        int i2 = 1;
        int i3 = i * 7;
        int i4 = f187a[this.f315c][(i * 7) + 5] & 255;
        if (0 == i4 || 1 == i4 || 63 == i4 || 64 == i4 || 65 == i4 || 66 == i4 || 67 == i4 || 68 == i4 || 69 == i4) {
            i2 = 1 + f187a[this.f315c][i3 + 6];
            int i5 = ((f187a[this.f315c][i3 + 0] & 255) << 8) | (f187a[this.f315c][i3 + 1] & 255);
            if (i2 != 1) {
                switch (f187a[this.f315c][i3 + 5]) {
                    case 0:
                        i5 += (i2 - 1) * 24;
                        break;
                    case 63:
                        i5 -= (i2 - 1) * 16;
                        break;
                    case 64:
                        i5 += (i2 - 1) * 16;
                        break;
                    case 65:
                        i5 += (i2 - 1) * 32;
                        break;
                    case 66:
                        i5 += (i2 - 1) * 16;
                        break;
                    case 67:
                        i5 += (i2 - 1) * 32;
                        break;
                }
                if (i5 - f177R[0] < this.f378G || i5 - f177R[0] > this.f379H) {
                    return;
                }
            }
        } else if (i4 == 41 || i4 == 86 || i4 == 87 || i4 == 81 || i4 == 57 || i4 == 78 || i4 == 40 || i4 == 70 || i4 == 39 || i4 == 74 || i4 == 49 || i4 == 50 || i4 == 71 || i4 == 51 || i4 == 10 || i4 == 35) {
            int i6 = ((f187a[this.f315c][i3 + 0] & 255) << 8) | (f187a[this.f315c][i3 + 1] & 255);
            if (i6 - f177R[0] > -48 && i6 - f177R[0] < 288) {
                return;
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            int[] iArr = new int[25];
            if (!f12b[f39X[i] + i7] && !f11a[f39X[i] + i7]) {
                iArr[0] = 1;
                iArr[1] = f187a[this.f315c][i3 + 5] & 255;
                iArr[2] = ((f187a[this.f315c][i3 + 0] & 255) << 8) | (f187a[this.f315c][i3 + 1] & 255);
                iArr[3] = ((f187a[this.f315c][i3 + 2] & 255) << 8) | (f187a[this.f315c][i3 + 3] & 255);
                iArr[8] = ((f187a[this.f315c][i3 + 0] & 255) << 8) | (f187a[this.f315c][i3 + 1] & 255);
                iArr[9] = ((f187a[this.f315c][i3 + 2] & 255) << 8) | (f187a[this.f315c][i3 + 3] & 255);
                if (i2 != 1) {
                    switch (f187a[this.f315c][i3 + 5]) {
                        case 0:
                            iArr[2] = iArr[2] + (i7 * 24);
                            iArr[8] = iArr[8] + (i7 * 24);
                            break;
                        case 1:
                            iArr[3] = iArr[3] + (i7 * 24);
                            iArr[9] = iArr[9] + (i7 * 24);
                            break;
                        case 63:
                            iArr[2] = iArr[2] - (i7 * 16);
                            iArr[8] = iArr[8] - (i7 * 16);
                            iArr[3] = iArr[3] + (i7 * 16);
                            iArr[9] = iArr[9] + (i7 * 16);
                            break;
                        case 64:
                            iArr[2] = iArr[2] + (i7 * 16);
                            iArr[8] = iArr[8] + (i7 * 16);
                            iArr[3] = iArr[3] + (i7 * 16);
                            iArr[9] = iArr[9] + (i7 * 16);
                            break;
                        case 65:
                            iArr[2] = iArr[2] + (i7 * 32);
                            iArr[8] = iArr[8] + (i7 * 32);
                            iArr[3] = iArr[3] + (i7 * 32);
                            iArr[9] = iArr[9] + (i7 * 32);
                            break;
                        case 66:
                            iArr[2] = iArr[2] + (i7 * 16);
                            iArr[8] = iArr[8] + (i7 * 16);
                            break;
                        case 67:
                            iArr[2] = iArr[2] + (i7 * 32);
                            iArr[8] = iArr[8] + (i7 * 32);
                            break;
                        case 68:
                            iArr[3] = iArr[3] + (i7 * 16);
                            iArr[9] = iArr[9] + (i7 * 16);
                            break;
                        case 69:
                            iArr[3] = iArr[3] + (i7 * 32);
                            iArr[9] = iArr[9] + (i7 * 32);
                            break;
                    }
                }
                iArr[4] = f187a[this.f315c][i3 + 6] & 255;
                iArr[19] = f187a[this.f315c][i3 + 4] & 255;
                iArr[20] = f39X[i] + i7;
                iArr[22] = f39X[i];
                if (f231n[0] == 0) {
                    if (iArr[1] == 41 || iArr[1] == 86 || iArr[1] == 87 || iArr[1] == 81 || iArr[1] == 57 || iArr[1] == 78 || iArr[1] == 40 || iArr[1] == 70 || iArr[1] == 39 || iArr[1] == 74 || iArr[1] == 49 || iArr[1] == 50 || iArr[1] == 71 || iArr[1] == 51) {
                        return;
                    }
                } else if (f231n[0] == 1) {
                    if (iArr[1] == 40 || iArr[1] == 70 || iArr[1] == 39) {
                        return;
                    }
                    if ((iArr[1] == 74 && iArr[4] == 0) || iArr[1] == 49 || iArr[1] == 50 || iArr[1] == 71) {
                        return;
                    }
                }
                f11a[f39X[i] + i7] = true;
                if (iArr[1] == 0 && this.f314b == 5 && this.f315c == 1 && 6144 > iArr[2] && iArr[3] < 256) {
                    iArr[11] = 1;
                    iArr[12] = iArr[3] + 2048;
                }
                m382a(iArr);
            }
        }
    }

    /* renamed from: a */
    public final void m382a(int[] iArr) {
        try {
            if (iArr[1] == 9 || iArr[1] == 15 || iArr[1] == 48 || iArr[1] == 11 || iArr[1] == 2 || iArr[1] == 79 || iArr[1] == 74 || 0 == iArr[1] || 1 == iArr[1] || 63 == iArr[1] || 64 == iArr[1] || 65 == iArr[1] || 66 == iArr[1] || 67 == iArr[1] || 68 == iArr[1] || 69 == iArr[1]) {
                for (int length = f164m.length - 1; length > 0; length--) {
                    if (f164m[length][24] == 0) {
                        f164m[length] = iArr;
                        f164m[length][24] = 1;
                        if (this.f380I != length) {
                            f10Y++;
                            return;
                        }
                        f10Y++;
                        for (int i = 0; i < f164m.length; i++) {
                            if (f164m[i][24] == 0) {
                                this.f380I = i;
                                return;
                            }
                        }
                        return;
                    }
                }
            } else if (f164m[this.f380I][24] == 0) {
                f164m[this.f380I] = iArr;
                f164m[this.f380I][24] = 1;
                f10Y++;
                for (int i2 = 0; i2 < f164m.length; i2++) {
                    if (f164m[i2][24] == 0) {
                        this.f380I = i2;
                        return;
                    }
                }
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= f164m.length) {
                        break;
                    } else if (f164m[i3][24] == 0) {
                        this.f380I = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                f164m[this.f380I] = iArr;
                f164m[this.f380I][24] = 1;
                f10Y++;
                for (int i4 = 0; i4 < f164m.length; i4++) {
                    if (f164m[i4][24] == 0) {
                        this.f380I = i4;
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean m381a(int[] iArr) {
        return iArr[2] - f177R[0] < this.f378G || iArr[2] - f177R[0] > this.f379H;
    }

    /* renamed from: l */
    public final void m63l(int i) {
        this.f380I = i;
        f164m[i][24] = 0;
        this.f381J--;
    }

    /* renamed from: a */
    public final void m380a(int[] iArr, int i) {
        f164m[i] = iArr;
    }

    /* renamed from: a */
    public final int[][] m422a(int i, int i2) {
        this.f81K = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < f164m.length && i3 < f10Y; i4++) {
            if (f164m[i4][24] == 1) {
                i3++;
                if (f164m[i4][1] == i && (i2 < 0 || i2 == f164m[i4][4])) {
                    this.f382d[this.f81K] = f164m[i4];
                    this.f382d[this.f81K][23] = i4;
                    this.f81K++;
                }
            }
        }
        int[][] iArr = new int[this.f81K][25];
        System.arraycopy(this.f382d, 0, iArr, 0, iArr.length);
        return iArr;
    }

    /* renamed from: K */
    public final void m473K() {
        this.f381J = 0;
        int i = 0;
        for (int i2 = 0; i2 < f164m.length && i < f10Y; i2++) {
            if (f164m[i2][24] == 1) {
                i++;
                f171Q = f164m[i2];
                if (f171Q[1] != 83) {
                    m47o(0);
                    f164m[i2] = f171Q;
                    if (f171Q[1] != 17 || f171Q[4] != 55) {
                        if (f171Q[0] <= 0 && f171Q[21] == 0) {
                            f12b[f171Q[20]] = true;
                            f11a[f171Q[20]] = false;
                            m63l(i2);
                        } else if (!f11a[f171Q[20]] && f171Q[1] < 120 && f171Q[1] != 42 && f171Q[1] != 43) {
                            m63l(i2);
                        } else if (m381a(f171Q) && f171Q[21] == 0 && f171Q[1] < 120 && f171Q[1] != 42 && f171Q[1] != 43) {
                            f11a[f171Q[20]] = false;
                            f11a[f171Q[22]] = false;
                            m63l(i2);
                        }
                    }
                }
            }
        }
        if (this.f314b == 1) {
            int i3 = 0;
            for (int i4 = 0; i4 < f164m.length && i3 < f10Y; i4++) {
                if (f164m[i4][24] == 1) {
                    i3++;
                    f171Q = f164m[i4];
                    if (f171Q[1] == 83) {
                        m47o(0);
                        f164m[i4] = f171Q;
                        if (f171Q[1] != 17 || f171Q[4] != 55) {
                            if (f171Q[0] <= 0 && f171Q[21] == 0) {
                                f12b[f171Q[20]] = true;
                                f11a[f171Q[20]] = false;
                                m63l(i4);
                            } else if (!f11a[f171Q[20]] && f171Q[1] < 120 && f171Q[1] != 42 && f171Q[1] != 43) {
                                m63l(i4);
                            } else if (m381a(f171Q) && f171Q[21] == 0 && f171Q[1] < 120 && f171Q[1] != 42 && f171Q[1] != 43) {
                                f11a[f171Q[20]] = false;
                                f11a[f171Q[22]] = false;
                                m63l(i4);
                            }
                        }
                    }
                }
            }
        }
        f10Y += this.f381J;
    }

    /* renamed from: L */
    public final void m470L() {
        try {
            int i = 0;
            for (int length = f164m.length - 1; length >= 0 && i < f10Y; length--) {
                if (f164m[length][24] == 1) {
                    i++;
                    if (f164m[length][1] != 45 && f164m[length][1] != 45 && f164m[length][1] != 26 && f164m[length][1] != 53 && f164m[length][1] != 10 && f164m[length][1] != 14 && (f164m[length][1] != 88 || f164m[length][4] != 127)) {
                        f171Q = f164m[length];
                        m42p(0);
                    }
                }
            }
            int i2 = 0;
            for (int length2 = f164m.length - 1; length2 >= 0; length2--) {
                if (i2 >= f10Y) {
                    return;
                }
                if (f164m[length2][24] == 1) {
                    i2++;
                    if (f164m[length2][1] == 14) {
                        f171Q = f164m[length2];
                        m42p(0);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: M */
    public final void m467M() {
        try {
            int i = 0;
            for (int length = f164m.length - 1; length >= 0; length--) {
                if (i >= f10Y) {
                    return;
                }
                if (f164m[length][24] == 1) {
                    i++;
                    if (f164m[length][1] == 45 || f164m[length][1] == 45 || f164m[length][1] == 26 || f164m[length][1] == 53 || f164m[length][1] == 10 || (f164m[length][1] == 88 && f164m[length][4] == 127)) {
                        f171Q = f164m[length];
                        m42p(0);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: N */
    public final void m464N() {
        int i = f16ae;
        f16ae = i - 1;
        if (i > 0) {
            return;
        }
        boolean z = false;
        if ((f170P[0] >> 8) < (m280b() >> 8)) {
            if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 54)) {
                f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 53;
            }
            if (this.f314b == 3) {
                if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43) {
                    f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 42;
                }
                if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53) {
                    f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 52;
                }
            }
        }
        if ((f170P[0] >> 8) > (m280b() >> 8)) {
            if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 54)) {
                f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 54;
            }
            if (this.f314b == 3) {
                if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43) {
                    f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 43;
                }
                if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53) {
                    f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 53;
                }
            }
        }
        if (this.f314b == 3 && ((f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53) && f196L)) {
            f40b[(m204c() >> 8) % f37ax][m280b() >> 8] = 52;
        }
        int i2 = f40b[(m204c() >> 8) % f37ax][m280b() >> 8] & 1;
        if (this.f314b == 0 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 54)) {
            z = true;
        }
        if (this.f314b == 3) {
            if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43) {
                z = true;
                i2++;
            }
            if (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53) {
                z = true;
                i2++;
            }
        }
        if (z && m423a(m280b(), m204c())) {
            if (i2 % 2 == 1 && (m280b() / 16) % 16 < 9 && (m204c() / 16) % 16 < 4) {
                byte[] bArr = f40b[(m204c() >> 8) % f37ax];
                int m280b = m280b() >> 8;
                bArr[m280b] = (byte) (bArr[m280b] + 1);
                f16ae = 60;
            } else if (i2 % 2 != 0 || (m280b() / 16) % 16 < 7 || (m204c() / 16) % 16 >= 4) {
            } else {
                byte[] bArr2 = f40b[(m204c() >> 8) % f37ax];
                int m280b2 = m280b() >> 8;
                bArr2[m280b2] = (byte) (bArr2[m280b2] - 1);
                f16ae = 60;
            }
        }
    }

    /* renamed from: O */
    public final void m461O() {
        if (this.f385bf == 0) {
            this.f385bf = this.f383bd;
        }
        if (this.f385bf < this.f383bd) {
            this.f385bf++;
            if (this.f385bf > this.f383bd) {
                this.f385bf = this.f383bd;
            }
        } else if (this.f385bf > this.f383bd) {
            this.f385bf--;
            if (this.f385bf < this.f383bd) {
                this.f385bf = this.f383bd;
            }
        }
        this.f384be = this.f385bf + ((m429a(this.f319g) * 8) / 100) + 8;
        if (this.f314b != 1) {
            this.f383bd = 16777215;
            return;
        }
        switch (this.f315c) {
            case 0:
                if (this.f386e != 0) {
                    if (this.f386e - 1 == 0 && 736 > m204c()) {
                        this.f383bd = 936;
                        if (4864 > f177R[0]) {
                            return;
                        }
                        this.f383bd = 264;
                        this.f386e = (byte) 2;
                        this.f383bd = 264;
                        return;
                    }
                    return;
                }
                this.f383bd = 184;
                if (1536 > f177R[0]) {
                    return;
                }
                this.f383bd = 264;
                if (512 > m204c()) {
                    if (3200 > f177R[0]) {
                        return;
                    }
                    this.f383bd = 232;
                    if (5376 > f177R[0]) {
                        return;
                    }
                    this.f383bd = 264;
                    return;
                } else if (3072 > f177R[0]) {
                    return;
                } else {
                    this.f383bd = 792;
                    if (4224 > f177R[0]) {
                        return;
                    }
                    this.f383bd = 1480;
                    if (4992 > f177R[0]) {
                        return;
                    }
                    this.f383bd = 936;
                    if (this.f383bd != this.f385bf) {
                        return;
                    }
                    this.f386e = (byte) 1;
                    return;
                }
            case 1:
                this.f383bd = 808;
                if (1280 > f177R[0]) {
                    return;
                }
                this.f383bd = 968;
                if (2816 > f177R[0]) {
                    return;
                }
                this.f383bd = 1064;
                return;
            case 2:
                int i = f177R[0];
                byte b = this.f386e;
                if (this.f386e == 0) {
                    if (1696 > i) {
                        this.f383bd = 2304;
                        this.f385bf = 2304;
                        return;
                    } else if (992 > m204c()) {
                        this.f383bd = 2304;
                        this.f385bf = 2304;
                        return;
                    } else if (1536 <= m204c()) {
                        this.f383bd = 2304;
                        this.f385bf = 2304;
                        return;
                    } else {
                        this.f386e = (byte) 1;
                        this.f383bd = 1224;
                        this.f385bf = 1224;
                        return;
                    }
                }
                int i2 = b - 1;
                if (i2 == 0) {
                    if (1936 > i) {
                        this.f383bd = 1224;
                        return;
                    } else if (5120 > i) {
                        this.f383bd = 776;
                        return;
                    } else if (this.f383bd == 1288) {
                        this.f385bf = 1288;
                        if (6000 > i) {
                            this.f383bd = 1288;
                            return;
                        }
                        this.f386e = (byte) 2;
                        this.f383bd = 1288;
                        return;
                    } else if (1536 <= m204c()) {
                        this.f385bf = 1288;
                        if (6000 > i) {
                            this.f383bd = 1288;
                            return;
                        }
                        this.f386e = (byte) 2;
                        this.f383bd = 1288;
                        return;
                    } else if (640 <= m204c()) {
                        this.f383bd = 776;
                        return;
                    } else {
                        this.f385bf = 1288;
                        if (6000 > i) {
                            this.f383bd = 1288;
                            return;
                        }
                        this.f386e = (byte) 2;
                        this.f383bd = 1288;
                        return;
                    }
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    if (6240 > i) {
                        this.f383bd = 1288;
                        return;
                    } else if (6896 <= i) {
                        this.f386e = (byte) 3;
                        this.f383bd = 392;
                        return;
                    } else if (this.f385bf != 392) {
                        this.f383bd = 392;
                        return;
                    } else {
                        this.f386e = (byte) 3;
                        this.f383bd = 392;
                        return;
                    }
                } else if (i3 - 1 != 0) {
                    if (7680 > i) {
                        return;
                    }
                    this.f383bd = 296;
                    return;
                } else {
                    int i4 = 392;
                    if ((6896 > i && f177R[1] < 2001) || 6260 > i) {
                        if (6868 <= i && f177R[1] > 1280) {
                            i4 = 2304;
                        }
                        this.f383bd = i4;
                        this.f385bf = i4;
                        return;
                    } else if (7147 > i) {
                        this.f383bd = 2304;
                        this.f385bf = 2304;
                        return;
                    } else {
                        this.f386e = (byte) 4;
                        this.f383bd = 1544;
                        this.f385bf = 1920;
                        return;
                    }
                }
            case 3:
                if (3840 > f177R[0]) {
                    this.f383bd = 552;
                    return;
                } else {
                    this.f383bd = 1224;
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: m */
    public final void m57m(int i) {
        if (f171Q[4] == 1 || f171Q[4] == 2) {
            if (((this.f319g / 30) / 4) % 2 == 0) {
                m397a(f9a, this.GFX_GameArray[25], (f171Q[2] - f179T[0]) - this.GFX_GameArray[25].getWidth(), (f171Q[3] - f179T[1]) - (this.GFX_GameArray[25].getHeight() / 2), 20);
                m397a(f9a, this.GFX_GameArray[25], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - (this.GFX_GameArray[25].getHeight() / 2), 20);
                return;
            }
            m396a(f9a, this.GFX_GameArray[25], 0, 0, 64, 24, f211b[1], ((f171Q[2] - f179T[0]) - this.GFX_GameArray[25].getWidth()) - 12, f171Q[3] - f179T[1], 20);
            m396a(f9a, this.GFX_GameArray[25], 0, 0, 64, 24, f211b[1], ((f171Q[2] - f179T[0]) + this.GFX_GameArray[25].getWidth()) - 12, f171Q[3] - f179T[1], 20);
        }
    }

    /* renamed from: a */
    public static final void m396a(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            m262b(graphics, image, i, i2, i3, i4, i5, i6, i7 + 36, i8);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m397a(Graphics graphics, Image image, int i, int i2, int i3) {
        try {
            m263b(graphics, image, i, i2 + 36, i3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final Image GFX_Load(String path) {
        Image image = null;
        try {
            try {
                MainInputStream.close();
            } catch (Throwable unused) {
                try {
                    m332aa();
                    if (f38ay == 1) {
                        return null;
                    }
                    if (this.f143a.getSize(path) > -1) {
                        image = GFX_Load(path);
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
        byte[] bArr = new byte[(int) this.f143a.getSize(path)];
        MainInputStream = this.f143a.getInputStream(path);
        MainInputStream.read(bArr);
        MainInputStream.close();
        f4a = MediaManager.getImage(bArr);
        System.gc();
        f4a.use();
        System.gc();
        image = f4a.getImage();
        return image;
    }

    /* renamed from: n */
    public final void m52n(int i) {
        m391a("c1");
        if (i == 2) {
            f28aq++;
            m493D(13);
        } else if (i == 3) {
            f20ai = 1200;
            f167Z = 3072;
            f168aa = 24;
            try {
                if (f289cj < 13) {
                    f290a[0].setAttribute(5, 150);
                }
            } catch (Throwable unused) {
            }
        } else if (i == 4) {
            m391a("af");
            f21aj = 1;
        } else if (i == 5) {
            f18ag = 1200;
            m493D(12);
        } else if (i == 6) {
            f23al += 10;
        }
    }

    /* renamed from: o */
    public final void m47o(int i) {
        try {
            switch (f171Q[1]) {
                case 0:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m372aC(i);
                        return;
                    }
                    return;
                case 1:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m370aD(i);
                        return;
                    }
                    return;
                case 2:
                    if (m192c(f171Q[2], f171Q[3], 16, 16)) {
                        m37q(i);
                        return;
                    }
                    return;
                case 3:
                    m368aE(i);
                    return;
                case 4:
                    m364aG(i);
                    return;
                case 5:
                    m366aF(i);
                    return;
                case 6:
                    m362aH(i);
                    return;
                case 7:
                    m360aI(i);
                    return;
                case 8:
                    m358aJ(i);
                    return;
                case 9:
                    m356aK(i);
                    return;
                case 10:
                    m354aL(i);
                    return;
                case 11:
                    m352aM(i);
                    return;
                case 12:
                    return;
                case 13:
                    m348aO(i);
                    return;
                case 14:
                    if (m192c(f171Q[2], f171Q[3], 32, -1)) {
                        m346aP(i);
                        return;
                    }
                    return;
                case 15:
                    m344aQ(i);
                    return;
                case 16:
                    m342aR(i);
                    return;
                case 17:
                    m340aS(i);
                    return;
                case 18:
                    if (m192c(f171Q[2], f171Q[3], 16, 32)) {
                        m339aT(i);
                        return;
                    }
                    return;
                case 19:
                    m338aU(i);
                    return;
                case 20:
                    if (m192c(f171Q[2], f171Q[3], 16, -1)) {
                        m337aV(i);
                        return;
                    }
                    return;
                case 21:
                    m336aW(i);
                    return;
                case 22:
                    if (m192c(f171Q[2], f171Q[3], 96, 64)) {
                        m335aX(i);
                        return;
                    }
                    return;
                case 23:
                    m481H(i);
                    return;
                case 24:
                    if (m192c(f171Q[2], f171Q[3], 128, 16)) {
                        m334aY(i);
                        return;
                    }
                    return;
                case 25:
                    m333aZ(i);
                    return;
                case 26:
                    if (m192c(f171Q[2], f171Q[3], 32, 100)) {
                        m230ba(i);
                        return;
                    }
                    return;
                case 27:
                    m229bb(i);
                    return;
                case 28:
                    m228bc(i);
                    return;
                case 29:
                    m227bd(i);
                    return;
                case 30:
                    if (m192c(f171Q[2], f171Q[3], 32, 64)) {
                        m226be(i);
                        return;
                    }
                    return;
                case 31:
                    if (m192c(f171Q[2], f171Q[3], 32, 32)) {
                        m225bf(i);
                        return;
                    }
                    return;
                case 32:
                    m224bg(i);
                    return;
                case 33:
                    if (m192c(f171Q[2], f171Q[3], 32, 16)) {
                        m223bh(i);
                        return;
                    }
                    return;
                case 34:
                    m222bi(i);
                    return;
                case 35:
                    m221bj(i);
                    return;
                case 36:
                    m220bk(i);
                    return;
                case 37:
                    if (m192c(f171Q[2], f171Q[3], 8, 32)) {
                        m219bl(i);
                        return;
                    }
                    return;
                case 38:
                    return;
                case 39:
                    m478I(i);
                    return;
                case 40:
                    m475J(i);
                    return;
                case 41:
                    m472K(i);
                    return;
                case 42:
                    if (m192c(f171Q[2], f171Q[3], 16, 16)) {
                        m218bm(i);
                        return;
                    }
                    return;
                case 43:
                    if (m192c(f171Q[2], f171Q[3], 16, 16)) {
                        m217bn(i);
                        return;
                    }
                    return;
                case 44:
                    m216bo(i);
                    return;
                case 45:
                    if (m192c(f171Q[2], f171Q[3], 32, 32)) {
                        m215bp(i);
                        return;
                    }
                    return;
                case 46:
                    if (m192c(f171Q[2], f171Q[3], 32, 32)) {
                        m214bq(i);
                        return;
                    }
                    return;
                case 47:
                    m213br(i);
                    return;
                case 48:
                    m212bs(i);
                    return;
                case 49:
                    m469L(i);
                    return;
                case 50:
                    m466M(i);
                    return;
                case 51:
                    m463N(i);
                    return;
                case 52:
                    return;
                case 53:
                    m211bt(i);
                    return;
                case 54:
                    m350aN(i);
                    return;
                case 55:
                    m210bu(i);
                    return;
                case 56:
                    if (m192c(f171Q[2], f171Q[3], 32, 32)) {
                        m209bv(i);
                        return;
                    }
                    return;
                case 57:
                    m460O(i);
                    return;
                case 58:
                    if (m192c(f171Q[2], f171Q[3], 24, 24)) {
                        m208bw(i);
                        return;
                    }
                    return;
                case 59:
                    m207bx(i);
                    return;
                case 60:
                    m206by(i);
                    return;
                case 61:
                    return;
                case 62:
                    m205bz(i);
                    return;
                case 63:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m256bA(i);
                        return;
                    }
                    return;
                case 64:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m255bB(i);
                        return;
                    }
                    return;
                case 65:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m254bC(i);
                        return;
                    }
                    return;
                case 66:
                    m253bD(i);
                    return;
                case 67:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m252bE(i);
                        return;
                    }
                    return;
                case 68:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m251bF(i);
                        return;
                    }
                    return;
                case 69:
                    if (m192c(f171Q[2], f171Q[3], 8, -1) || f171Q[5] != 0) {
                        m250bG(i);
                        return;
                    }
                    return;
                case 70:
                    m457P(i);
                    return;
                case 71:
                    m454Q(i);
                    return;
                case 72:
                    m249bH(i);
                    return;
                case 73:
                    m248bI(i);
                    return;
                case 74:
                    m451R(i);
                    return;
                case 75:
                    m247bJ(i);
                    return;
                case 76:
                    return;
                case 77:
                    m246bK(i);
                    return;
                case 78:
                    m449S(i);
                    return;
                case 79:
                    m245bL(i);
                    return;
                case 80:
                    if (m192c(f171Q[2], f171Q[3], 24, 24)) {
                        m244bM(i);
                        return;
                    }
                    return;
                case 81:
                    m447T(i);
                    return;
                case 82:
                    m243bN(i);
                    return;
                case 83:
                    m242bO(i);
                    return;
                case 84:
                    m32r(i);
                    return;
                case 85:
                    m27s(i);
                    return;
                case 86:
                    m445U(i);
                    return;
                case 87:
                    m443V(i);
                    return;
                case 88:
                    m241bP(i);
                    return;
                case 89:
                    return;
                case 90:
                    m240bQ(i);
                    return;
                case 91:
                    if (m192c(f171Q[2], f171Q[3], 32, 42)) {
                        m239bR(i);
                        return;
                    }
                    return;
                case 92:
                    m23t(i);
                    return;
                case 93:
                    m19u(i);
                    return;
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
                case 146:
                case 147:
                case 148:
                case 149:
                default:
                    return;
                case 120:
                    m307am(i);
                    return;
                case 125:
                    m305an(i);
                    return;
                case 130:
                    m303ao(i);
                    return;
                case 135:
                    m299aq(i);
                    return;
                case 140:
                    m295as(i);
                    return;
                case 145:
                    m293at(i);
                    return;
                case 150:
                    m297ar(i);
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    public final void m42p(int i) {
        try {
            switch (f171Q[1]) {
                case 0:
                    m238bS(i);
                    return;
                case 1:
                    m237bT(i);
                    return;
                case 2:
                    m15v(i);
                    return;
                case 3:
                    m236bU(i);
                    return;
                case 4:
                    m234bW(i);
                    return;
                case 5:
                    m235bV(i);
                    return;
                case 6:
                    m233bX(i);
                    return;
                case 7:
                    m232bY(i);
                    return;
                case 8:
                    m231bZ(i);
                    return;
                case 9:
                    m161ca(i);
                    return;
                case 10:
                    m160cb(i);
                    return;
                case 11:
                    m159cc(i);
                    return;
                case 12:
                    return;
                case 13:
                    m157ce(i);
                    return;
                case 14:
                    m156cf(i);
                    return;
                case 15:
                    m155cg(i);
                    return;
                case 16:
                    m154ch(i);
                    return;
                case 17:
                    m153ci(i);
                    return;
                case 18:
                    m152cj(i);
                    return;
                case 19:
                    m151ck(i);
                    return;
                case 20:
                    m150cl(i);
                    return;
                case 21:
                    m149cm(i);
                    return;
                case 22:
                    m148cn(i);
                    return;
                case 23:
                    m441W(i);
                    return;
                case 24:
                    return;
                case 25:
                    m147co(i);
                    return;
                case 26:
                    m146cp(i);
                    return;
                case 27:
                    m145cq(i);
                    return;
                case 28:
                    m144cr(i);
                    return;
                case 29:
                    m143cs(i);
                    return;
                case 30:
                    m142ct(i);
                    return;
                case 31:
                    m141cu(i);
                    return;
                case 32:
                    m140cv(i);
                    return;
                case 33:
                    if (m192c(f171Q[2], f171Q[3], 32, 16)) {
                        m139cw(i);
                        return;
                    }
                    return;
                case 34:
                    m138cx(i);
                    return;
                case 35:
                    m137cy(i);
                    return;
                case 36:
                    m136cz(i);
                    return;
                case 37:
                    m187cA(i);
                    return;
                case 38:
                    m11w(i);
                    return;
                case 39:
                    m439X(i);
                    return;
                case 40:
                    m437Y(i);
                    return;
                case 41:
                    m435Z(i);
                    return;
                case 42:
                    m186cB(i);
                    return;
                case 43:
                    m185cC(i);
                    return;
                case 44:
                    m184cD(i);
                    return;
                case 45:
                    m183cE(i);
                    return;
                case 46:
                    m182cF(i);
                    return;
                case 47:
                    m181cG(i);
                    return;
                case 48:
                    return;
                case 49:
                    m331aa(i);
                    return;
                case 50:
                    m329ab(i);
                    return;
                case 51:
                    m327ac(i);
                    return;
                case 52:
                    return;
                case 53:
                    return;
                case 54:
                    m158cd(i);
                    return;
                case 55:
                    m180cH(i);
                    return;
                case 56:
                    m179cI(i);
                    return;
                case 57:
                    m325ad(i);
                    return;
                case 58:
                    m178cJ(i);
                    return;
                case 59:
                    m177cK(i);
                    return;
                case 60:
                    m176cL(i);
                    return;
                case 61:
                    m7x(i);
                    return;
                case 62:
                    m175cM(i);
                    return;
                case 63:
                    m174cN(i);
                    return;
                case 64:
                    m173cO(i);
                    return;
                case 65:
                    m172cP(i);
                    return;
                case 66:
                    m171cQ(i);
                    return;
                case 67:
                    m170cR(i);
                    return;
                case 68:
                    m169cS(i);
                    return;
                case 69:
                    m168cT(i);
                    return;
                case 70:
                    m323ae(i);
                    return;
                case 71:
                    m321af(i);
                    return;
                case 72:
                    m167cU(i);
                    return;
                case 73:
                    m166cV(i);
                    return;
                case 74:
                    m319ag(i);
                    return;
                case 75:
                    m165cW(i);
                    return;
                case 76:
                    return;
                case 77:
                    m164cX(i);
                    return;
                case 78:
                    m317ah(i);
                    return;
                case 79:
                    m163cY(i);
                    return;
                case 80:
                    m162cZ(i);
                    return;
                case 81:
                    m315ai(i);
                    return;
                case 82:
                    m122da(i);
                    return;
                case 83:
                    m121db(i);
                    return;
                case 84:
                    m4y(i);
                    return;
                case 85:
                    m1z(i);
                    return;
                case 86:
                    m313aj(i);
                    return;
                case 87:
                    m311ak(i);
                    return;
                case 88:
                    m120dc(i);
                    return;
                case 89:
                    return;
                case 90:
                    m119dd(i);
                    return;
                case 91:
                    m118de(i);
                    return;
                case 92:
                    m502A(i);
                    return;
                case 93:
                    m499B(i);
                    return;
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
                case 146:
                case 147:
                case 148:
                case 149:
                default:
                    return;
                case 120:
                    m291au(i);
                    return;
                case 125:
                    m289av(i);
                    return;
                case 130:
                    m287aw(i);
                    return;
                case 135:
                    m285ax(i);
                    return;
                case 140:
                    m283ay(i);
                    return;
                case 145:
                    m376aA(i);
                    return;
                case 150:
                    m106e(false);
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final int m411a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (f199O || f202R || this.f418y) {
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

    /* renamed from: d */
    private void m129d(int i, int i2) {
        f215bb = i2;
        f216bc = i;
    }

    /* renamed from: al */
    private void m310al() {
        this.f320e[3] = true;
        if (f190Y[5] < 0) {
            f190Y[5] = 0;
        }
    }

    /* renamed from: a */
    public final int m414a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f199O || f202R) {
            return -1;
        }
        int i7 = (540 - f17af) % 360;
        if (0 > i7) {
            i7 = 0;
        }
        int i8 = 12;
        if (!f198N && !f200P) {
            i8 = 18;
        }
        int m429a = (m429a(i7) * i8) / 100;
        int i9 = ((-m276b(i7)) * i8) / 100;
        int m280b = m280b() + m429a;
        int m204c = m204c() + i9;
        int i10 = f170P[0] + m429a;
        int i11 = f170P[1] + i9;
        int i12 = i8;
        if (i11 + i12 > i4 - i6 || m204c + i12 < i2 - i6 || m280b + 12 < i - i5 || m280b - 12 > i + i5) {
            if (i10 + 12 > i3 - i5 || m280b + 12 < i - i5 || m204c + i12 < i2 - i6 || m204c - i12 > i2 + i6) {
                if (i10 - 12 < i3 + i5 || m280b - 12 > i + i5 || m204c + i12 < i2 - i6 || m204c - i12 > i2 + i6) {
                    if (i11 - i12 < i4 + i6 || m204c - i12 > i2 + i6 || m280b + 12 < i - i5 || m280b - 12 > i + i5) {
                        return (m280b + 12 < i - i5 || m280b - 12 > i + i5 || m204c + i12 < i2 - i6 || m204c - i12 > i2 + i6) ? -1 : 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final int m265b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f199O || f202R) {
            return -1;
        }
        int i7 = 12;
        if (!f198N) {
            i7 = 16;
        }
        int i8 = -i7;
        int m280b = m280b() + 0;
        int m204c = m204c() + i8;
        int i9 = f170P[0] + 0;
        int i10 = f170P[1] + i8;
        int i11 = i7;
        if (i10 + i11 > i4 - i6 || m204c + i11 < i2 - i6 || m280b + 12 < i - i5 || m280b - 12 > i + i5) {
            if (i9 + 12 > i3 - i5 || m280b + 12 < i - i5 || m204c + i11 < i2 - i6 || m204c - i11 > i2 + i6) {
                if (i9 - 12 < i3 + i5 || m280b - 12 > i + i5 || m204c + i11 < i2 - i6 || m204c - i11 > i2 + i6) {
                    if (i10 - i11 < i4 + i6 || m204c - i11 > i2 + i6 || m280b + 12 < i - i5 || m280b - 12 > i + i5) {
                        return (m280b + 12 < i - i5 || m280b - 12 > i + i5 || m204c + i11 < i2 - i6 || m204c - i11 > i2 + i6) ? -1 : 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: q */
    public final void m37q(int i) {
        int i2 = 16;
        int i3 = 8;
        if (f171Q[4] == 16 || f171Q[4] == 18) {
            i2 = 8;
            i3 = 16;
        }
        if (f171Q[5] > 0) {
            int[] iArr = f171Q;
            iArr[5] = iArr[5] + 1;
            if (f171Q[5] > 12) {
                f171Q[5] = 0;
            }
        }
        int m265b = m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], i2, i3);
        if (m265b >= 0) {
            int i4 = 4096;
            int i5 = f171Q[4] / 16;
            if (f171Q[4] % 16 == 2) {
                i4 = 2560;
            }
            if (i5 == 1) {
                i2 = 7;
            } else {
                i3 = 7;
            }
            if (m265b == 0 || m265b == 4) {
                f190Y[1] = (f171Q[3] - i3) << 8;
                if (i5 == 0) {
                    if (f171Q[5] == 4) {
                        if (this.f314b == 1) {
                            i4 = 4864;
                        }
                        f190Y[1] = (f171Q[3] - 8) << 8;
                        f196L = true;
                        f192H = false;
                        f191G = true;
                        f198N = false;
                        f243bh = 0;
                        f190Y[5] = (m276b(0) * i4) / 100;
                        m391a("cc");
                    }
                    int[] iArr2 = f171Q;
                    iArr2[5] = iArr2[5] + 1;
                } else {
                    m81i(f171Q[22]);
                }
            } else if (m265b == 1) {
                f190Y[0] = (((f171Q[2] - i2) - 12) - 1) << 8;
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                if (i5 == 1 && f171Q[19] == 1) {
                    this.f387L = 15;
                    f190Y[10] = -i4;
                    f190Y[12] = 1;
                    f190Y[13] = 1;
                    f190Y[14] = 1;
                    m391a("cc");
                    int[] iArr3 = f171Q;
                    iArr3[5] = iArr3[5] + 1;
                }
            } else if (m265b == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
                if (i5 == 1 && f171Q[19] == 0) {
                    this.f387L = 15;
                    f190Y[10] = i4;
                    f190Y[12] = 0;
                    f190Y[13] = 2;
                    f190Y[14] = 2;
                    m391a("cc");
                    int[] iArr4 = f171Q;
                    iArr4[5] = iArr4[5] + 1;
                }
            } else if (m265b == 3) {
                if (i5 == 2) {
                    if (f171Q[19] == 2) {
                        f190Y[5] = i4;
                        f196L = true;
                        this.f387L = 30;
                        m391a("cc");
                    }
                    int[] iArr5 = f171Q;
                    iArr5[5] = iArr5[5] + 1;
                }
                f190Y[1] = ((((f171Q[3] + i3) + 12) + 12) + 1) << 8;
            }
        }
        if (f33D && f35av == f171Q[20] && m265b != 0) {
            f33D = false;
        }
    }

    /* renamed from: r */
    public final void m32r(int i) {
        if (f171Q[4] == 8 && m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 24, 8) >= 0) {
            f193I = true;
            f190Y[12] = 0;
            f190Y[10] = 4096;
            if (f171Q[19] == 0) {
                f190Y[12] = 1;
                f190Y[10] = -4096;
            }
        }
        if (f171Q[4] > 6 || f171Q[4] == 0 || m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 8, 8) < 0) {
            return;
        }
        f193I = true;
    }

    /* renamed from: s */
    public final void m27s(int i) {
        if (f171Q[5] % 256 == 0) {
            f171Q[10] = m200c(4) + m200c(2) + m200c(2);
            f171Q[11] = 1;
            int[] iArr = f171Q;
            iArr[5] = iArr[5] + 1;
        }
        if (f171Q[10] == 0) {
            int[] iArr2 = f171Q;
            iArr2[5] = iArr2[5] + 1;
        } else if (this.f319g % 16 != 0 || m200c(3) == 0) {
        } else {
            int[] iArr3 = f171Q;
            iArr3[10] = iArr3[10] - 1;
            if (f171Q[10] > 0) {
                int m200c = f171Q[11] != 0 ? m200c(3) : m200c(2);
                m271b(m200c, f171Q[8], f171Q[9]);
                if (m200c == 2) {
                    int[] iArr4 = f171Q;
                    iArr4[11] = iArr4[11] - 1;
                }
            } else if (f171Q[11] == 0) {
                m271b(m200c(2), f171Q[8], f171Q[9]);
            } else {
                int[] iArr5 = f171Q;
                iArr5[11] = iArr5[11] - 1;
                m271b(2, f171Q[8], f171Q[9]);
            }
        }
    }

    /* renamed from: b */
    public final void m271b(int i, int i2, int i3) {
        for (int i4 = 0; i4 < f172n.length; i4++) {
            if (f172n[i4][0] == 0) {
                for (int i5 = 0; i5 < f172n[i4].length; i5++) {
                    f172n[i4][i5] = 0;
                }
                f172n[i4][0] = 1;
                f172n[i4][1] = i;
                int[] iArr = f172n[i4];
                int[] iArr2 = f172n[i4];
                int m200c = (i2 + m200c(16)) - 8;
                iArr2[8] = m200c;
                iArr[2] = m200c;
                int[] iArr3 = f172n[i4];
                f172n[i4][9] = i3;
                iArr3[3] = i3;
                f172n[i4][6] = m200c(2) * 16 * 4;
                return;
            }
        }
    }

    /* renamed from: P */
    public final void m458P() {
        for (int i = 0; i < f172n.length; i++) {
            if (f172n[i][0] > 0) {
                if (f172n[i][3] - f179T[1] <= -48 || f172n[i][3] - f179T[1] >= 288 || this.f384be >= f172n[i][3]) {
                    f172n[i][0] = 0;
                } else {
                    int i2 = f42b[35][0][f171Q[6] % f42b[35][0].length];
                    int i3 = i2;
                    if (i2 > 128) {
                        i3 -= 255;
                    }
                    f172n[i][10] = f172n[i][2];
                    f172n[i][11] = f172n[i][3];
                    f172n[i][2] = f172n[i][8] + i3;
                    f172n[i][3] = f172n[i][9] - (f172n[i][5] / 2);
                    int[] iArr = f172n[i];
                    iArr[5] = iArr[5] + 1;
                    int[] iArr2 = f172n[i];
                    iArr2[6] = iArr2[6] + 1;
                    int[] iArr3 = f172n[i];
                    iArr3[7] = iArr3[7] + 1;
                    if ((f172n[i][1] * 32) + 16 < f172n[i][7]) {
                        f172n[i][7] = (f172n[i][1] * 32) + 16;
                        if (f172n[i][1] == 2) {
                            char c = 65535;
                            if (this.f384be < m204c() - 12 && Math.abs(m280b() - f172n[i][2]) < 28 && Math.abs((m204c() - 12) - f172n[i][3]) < 28) {
                                c = 0;
                            }
                            if (c >= 0 && !f199O) {
                                f172n[i][1] = 3;
                                f15ad = 8;
                                this.f363x = 2100;
                                this.f373Z = true;
                                f198N = false;
                                m436Z();
                                m493D(27);
                                if (f196L && -448 > f190Y[5]) {
                                    f190Y[5] = -448;
                                }
                            }
                        } else if (f172n[i][1] == 3) {
                            f172n[i][0] = 0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public final void m455Q() {
        for (int i = 0; i < f172n.length; i++) {
            if (f172n[i][0] > 0) {
                int i2 = f172n[i][7] / 16;
                m396a(f9a, this.GFX_GameArray[104], 0, this.f389h[i2], 32, this.f388g[i2], f211b[0], f172n[i][2] - f179T[0], f172n[i][3] - f179T[1], 2);
            }
        }
    }

    /* renamed from: t */
    public final void m23t(int i) {
        if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168 && this.f318f % 30 == 0) {
            m391a("b9");
        }
        if (this.f318f % 60 < 30) {
            if (f33D && f35av == f171Q[20]) {
                f33D = false;
                return;
            }
            return;
        }
        int m265b = m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 8, 32);
        if (f171Q[5] == 1) {
            m265b = -1;
        }
        if (m265b >= 0 && m265b == 1) {
            f190Y[0] = ((f171Q[2] - 8) - 12) << 8;
        }
        if (f33D && f35av == f171Q[20] && m265b != 0) {
            f33D = false;
        }
    }

    /* renamed from: u */
    public final void m19u(int i) {
        m23t(i);
    }

    /* renamed from: v */
    public final void m15v(int i) {
        char c = 2;
        int i2 = f171Q[4] / 16;
        if (f171Q[4] % 16 == 2) {
            c = 1;
        }
        int[] iArr = {0, 0, 32, 16, 0, 0, 32, 8, 0, 24, 32, 32};
        int i3 = 0;
        if (f171Q[5] > 4) {
            i3 = 8;
        } else if (f171Q[5] > 0) {
            i3 = 4;
        }
        if (i2 == 0) {
            if (i3 == 8) {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 8, 2);
            } else {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        } else if (i2 != 1) {
            if (i3 == 8) {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[6], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 8, 2);
            } else {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[6], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[19] == 0) {
            if (i3 == 8) {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[1], (f171Q[2] - f179T[0]) + 8, f171Q[3] - f179T[1], 2);
            } else {
                m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[1], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        } else if (i3 == 8) {
            m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[7], (f171Q[2] - f179T[0]) - 8, f171Q[3] - f179T[1], 2);
        } else {
            m396a(f9a, this.GFX_GameArray[c], iArr[i3 + 0], iArr[i3 + 1], iArr[i3 + 2], iArr[i3 + 3], f211b[7], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: w */
    public final void m11w(int i) {
        if (this.f314b != 0) {
            return;
        }
        int i2 = f211b[0];
        if (f171Q[19] == 0) {
            i2 = f211b[4];
        }
        m396a(f9a, this.GFX_GameArray[5], 0, 0, 32, 16, i2, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: x */
    public final void m7x(int i) {
        m396a(f9a, this.GFX_GameArray[61], 0, 16 * ((this.f318f >> 1) % 6), 32, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: y */
    public final void m4y(int i) {
        if (f171Q[4] == 0) {
            m417a(71, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 16);
            m417a(72, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) - 8, f171Q[3] - f179T[1]);
        } else if (f171Q[4] == 7) {
            m417a(95, 0, (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 16);
            m417a(73, 0, (f171Q[2] - f179T[0]) - 8, f171Q[3] - f179T[1]);
        } else if (f171Q[4] == 8) {
            m417a(74, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) + 8, (f171Q[3] - f179T[1]) - 8);
            m417a(75, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 8);
            m417a(76, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) - 24, (f171Q[3] - f179T[1]) - 8);
        } else if (f171Q[4] == 73) {
            m396a(f9a, this.GFX_GameArray[110], 0, (this.f318f % 5) * 32, 40, 32, f211b[0], f171Q[2] - f179T[0], (this.f384be - 20) - f179T[1], 2);
        } else if (f171Q[4] == 9 || f171Q[4] == 169) {
            m396a(f9a, this.GFX_GameArray[110], 0, (this.f318f % 5) * 32, 40, 32, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] <= 6) {
            m417a(187, 0 + (f171Q[19] * 4), (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 8);
        }
    }

    /* renamed from: z */
    public final void m1z(int i) {
        if (this.f385bf < f171Q[3]) {
            m396a(f9a, this.GFX_GameArray[85], 0, 16 * ((this.f319g / 16) % 3), 16, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: A */
    public final void m502A(int i) {
        if (this.f318f % 60 < 30) {
            m396a(f9a, this.GFX_GameArray[92], 0, 0, 32, 16, f211b[0], (f171Q[2] - f179T[0]) + 8, (f171Q[3] - f179T[1]) - 32, 2);
            m396a(f9a, this.GFX_GameArray[92], 0, 0, 32, 16, f211b[6], (f171Q[2] - f179T[0]) + 8, (f171Q[3] - f179T[1]) + 32, 2);
            return;
        }
        m396a(f9a, this.GFX_GameArray[92], 0, 0, 32, 16, f211b[1], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
        m396a(f9a, this.GFX_GameArray[92], 0, 0, 32, 16, f211b[5], (f171Q[2] - f179T[0]) - 8, f171Q[3] - f179T[1], 2);
    }

    /* renamed from: B */
    public final void m499B(int i) {
        m502A(i);
    }

    /* renamed from: b */
    public final void m260b(boolean z) {
        if (!z) {
            f24am = 0;
            f38ay = 1;
            this.f54c = true;
            this.f55l = 10;
            m39q();
            m125d(true);
            return;
        }
        f28aq = 3;
        f24am = 0;
        f27ap = 0;
        m25t();
        f29ar = 0;
        f30as = 0;
        f31at = 0;
        f32au = 0;
        this.f78t = false;
    }

    /* renamed from: R */
    public final void m452R() {
        this.f316d = 6;
        this.f317e = 1;
        f190Y[0] = 978688;
        f190Y[1] = 32768;
        this.f314b = f212a[this.f316d][this.f317e];
        this.f315c = f213b[this.f316d][this.f317e];
        try {
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("zone").append(this.f314b + 1).append(".bmd").toString());
            MainInputStream.read(f183d);
            MainInputStream.close();
            this.f143a.close();
            m34r();
        } catch (Throwable unused) {
        }
        int i = 0;
        while (true) {
            if (i >= f234aa.length) {
                break;
            } else if (f234aa[i] < f24am) {
                for (int length = f234aa.length - 1; length > i; length--) {
                    f234aa[length] = f234aa[length - 1];
                    f235ab[length] = f235ab[length - 1];
                }
                f234aa[i] = f24am;
                f235ab[i] = f231n[0];
                m77j();
            } else {
                i++;
            }
        }
        m21u();
        m75j(this.f315c);
        f10Y = 0;
        this.f380I = 0;
        for (int i2 = 0; i2 < f164m.length; i2++) {
            f164m[i2][24] = 0;
        }
        f120bY = 0;
        this.f390w = true;
        f293K = new int[4];
        f294b = new String[4];
    }

    /* renamed from: am */
    private void m308am() {
        for (int i = 0; i < 10; i++) {
            if (!f236f[i]) {
                f236f[i] = f166c[i];
            } else if (f166c[i]) {
                f166c[i] = false;
            } else {
                f236f[i] = false;
            }
        }
        if (f86w > 0) {
            f86w = (byte) (f86w - 1);
        }
        f84u = (byte) ((f84u + 1) % 6);
        if (f82s == f218g) {
            if (f87y == 17) {
                m493D(26);
            }
            f87y = (byte) (f87y + 1);
            if (f87y > 75) {
                f87y = (byte) 0;
                f82s = f219h;
            }
        } else if (f82s == f219h) {
            f87y = (byte) (f87y + 1);
            if (f87y > 40) {
                f87y = (byte) 0;
                m125d(false);
            }
        } else if (f82s == f220i) {
            if (f166c[4]) {
                f231n[3] = (byte) ((f231n[3] + 1) % f217f);
                m298ar();
            } else if (f166c[3]) {
                byte[] bArr = f231n;
                bArr[3] = (byte) (bArr[3] - 1);
                if (f231n[3] < 0) {
                    f231n[3] = (byte) (f217f - 1);
                }
                m298ar();
            } else if (f166c[0]) {
                m103f();
                m125d(false);
                m496C(0);
            }
        } else if (f82s == f221j) {
            if (f83t < 6) {
                f87y = (byte) (f87y + 1);
                if (f87y > 5) {
                    f83t = (byte) (f83t + 1);
                }
            } else {
                f87y = (byte) ((f87y + 1) % 5);
            }
            if (f166c[0]) {
                f82s = f222k;
                f85v = (byte) 0;
                m487F(7 + f85v);
                m496C(2);
            } else if (f166c[6]) {
                f82s = f229r;
                m407a(0, (String) null);
                m407a(1, (String) null);
                f85v = (byte) 1;
            }
        } else if (f82s == f222k) {
            f87y = (byte) ((f87y + 1) % 5);
            if (f166c[4]) {
                f85v = (byte) ((f85v + 1) % 5);
                m487F(7 + f85v);
            } else if (f166c[3]) {
                f85v = (byte) (f85v - 1);
                if (f85v < 0) {
                    f85v = (byte) 4;
                }
                m487F(7 + f85v);
            } else if (f166c[0]) {
                if (f85v == 0) {
                    f85v = (byte) 0;
                    m83i();
                    if (this.f46b != 0) {
                        m496C(1);
                        f85v = (byte) 1;
                        m487F(45 + f85v);
                        f82s = f227p;
                        return;
                    }
                    m203c();
                    f174B = true;
                    for (int i2 = 0; i2 < f237d.length; i2++) {
                        try {
                            f237d[i2].dispose();
                        } catch (Exception unused) {
                        }
                        f237d[i2] = null;
                    }
                    f28aq = 3;
                    f24am = 0;
                    this.f46b = (byte) 0;
                    this.f314b = 0;
                    this.f316d = 0;
                    this.f315c = 0;
                    this.f317e = 0;
                    f175C = true;
                    m25t();
                    return;
                } else if (f85v == 1) {
                    f85v = (byte) 1;
                    m203c();
                    this.f314b = 0;
                    this.f316d = 0;
                    this.f315c = 0;
                    this.f317e = 0;
                    f174B = true;
                    f38ay = 3;
                    this.f54c = true;
                    this.f55l = 10;
                    for (int i3 = 0; i3 < 6; i3++) {
                        f304h[i3] = false;
                    }
                    f298ck = 0;
                    for (int i4 = 0; i4 < f237d.length; i4++) {
                        try {
                            f237d[i4].dispose();
                        } catch (Exception unused2) {
                        }
                        f237d[i4] = null;
                    }
                    return;
                } else if (f85v == 2) {
                    f85v = (byte) 0;
                    f82s = f228q;
                    f86w = (byte) 1;
                    m496C(1);
                } else if (f85v == 3) {
                    f82s = f223l;
                    m496C(1);
                } else {
                    f85v = (byte) 0;
                    f82s = f226o;
                    m487F(47 + f85v);
                    m496C(1);
                    f86w = (byte) 1;
                }
            }
            if (f166c[6]) {
                m496C(0);
                f82s = f221j;
                return;
            }
            m304ao();
        } else if (f82s == f223l) {
            if (f166c[6]) {
                f85v = (byte) 3;
                f82s = f222k;
                m496C(2);
                m487F(7 + f85v);
            } else if (f166c[9]) {
                f85v = (byte) 1;
                f82s = f224m;
            }
        } else if (f82s == f224m) {
            if (f166c[6]) {
                f82s = f223l;
            } else if (f166c[2] || f166c[1]) {
                f85v = (byte) ((f85v + 1) % 2);
            } else if (f166c[0]) {
                f82s = f223l;
                if (f85v == 0) {
                    for (int i5 = 0; i5 < 5; i5++) {
                        f234aa[i5] = 10000 - (2000 * i5);
                        f235ab[i5] = i5;
                        if (i5 >= 3) {
                            f235ab[i5] = 1 - (i5 - 3);
                        }
                    }
                    m77j();
                    f82s = f225n;
                }
            }
        } else if (f82s == f229r) {
            if (f166c[2] || f166c[1]) {
                f85v = (byte) ((f85v + 1) % 2);
            } else if (f166c[0]) {
                if (f85v == 0) {
                    IApplication.getCurrentApp().terminate();
                }
                f82s = f221j;
                m407a(0, f214a[f231n[1] + 21]);
                f162c[1] = f240d[39];
                m407a(1, f162c[1]);
            }
        } else if (f82s == f225n) {
            if (f166c[6] || f166c[0]) {
                f82s = f223l;
            }
        } else if (f82s == f226o) {
            if (f166c[6] || f166c[0]) {
                f82s = f222k;
                m496C(2);
                f85v = (byte) 4;
                m487F(7 + f85v);
                m103f();
            } else if (f166c[2]) {
                f85v = (byte) (f85v - 1);
                if (f85v < 0) {
                    f85v = (byte) 2;
                }
                m487F(47 + f85v);
                f86w = (byte) 1;
            } else if (f166c[1]) {
                f85v = (byte) ((f85v + 1) % 3);
                m487F(47 + f85v);
                f86w = (byte) 1;
            } else if (f166c[4]) {
                if (f85v == 0) {
                    f231n[0] = (byte) ((f231n[0] + 1) % 3);
                } else if (f85v == 1) {
                    f231n[1] = (byte) ((f231n[1] + 1) % 4);
                } else if (f85v == 2) {
                    f231n[2] = (byte) ((f231n[2] + 1) % 2);
                }
                if (f85v == 1) {
                    m440X();
                }
                f86w = (byte) 1;
            } else if (f166c[3]) {
                byte[] bArr2 = f231n;
                byte b = f85v;
                bArr2[b] = (byte) (bArr2[b] - 1);
                if (f231n[f85v] < 0) {
                    if (f85v == 0) {
                        f231n[0] = 2;
                    } else if (f85v == 1) {
                        f231n[1] = 3;
                    } else if (f85v == 2) {
                        f231n[2] = 1;
                    }
                }
                if (f85v == 1) {
                    m440X();
                }
                f86w = (byte) 1;
            }
            m304ao();
        } else if (f82s == f227p) {
            if (f166c[6]) {
                f82s = f222k;
                f85v = (byte) 0;
                m487F(7 + f85v);
                m496C(2);
            } else if (f166c[2] || f166c[1]) {
                f85v = (byte) ((f85v + 1) % 2);
                m487F(45 + f85v);
            } else if (f166c[0]) {
                if (f85v == 0) {
                    m203c();
                    f174B = true;
                    for (int i6 = 0; i6 < f237d.length; i6++) {
                        try {
                            f237d[i6].dispose();
                        } catch (Exception unused3) {
                        }
                        f237d[i6] = null;
                    }
                    f28aq = 3;
                    f24am = 0;
                    this.f46b = (byte) 0;
                    this.f314b = 0;
                    this.f316d = 0;
                    this.f315c = 0;
                    this.f317e = 0;
                    for (int i7 = 0; i7 < 6; i7++) {
                        f304h[i7] = false;
                    }
                    f298ck = 0;
                    f175C = true;
                    m25t();
                } else if (f85v == 1) {
                    m203c();
                    f174B = true;
                    for (int i8 = 0; i8 < f237d.length; i8++) {
                        try {
                            f237d[i8].dispose();
                        } catch (Exception unused4) {
                        }
                        f237d[i8] = null;
                    }
                    f28aq = this.f47c;
                    f24am = this.f48aB;
                    int i9 = this.f46b / 3;
                    this.f314b = i9;
                    this.f316d = i9;
                    int i10 = this.f46b % 3;
                    this.f315c = i10;
                    this.f317e = i10;
                    this.f314b = f212a[this.f316d][this.f317e];
                    this.f315c = f213b[this.f316d][this.f317e];
                    f175C = true;
                    m25t();
                }
            }
            m304ao();
        } else if (f82s == f228q) {
            if (f166c[4] && f85v < 10) {
                f85v = (byte) (f85v + 1);
                f86w = (byte) 1;
            }
            if (f166c[3] && f85v > 0) {
                f85v = (byte) (f85v - 1);
                f86w = (byte) 1;
            }
            if (f166c[6]) {
                f85v = (byte) 2;
                f82s = f222k;
                m496C(2);
            }
        }
        f166c[5] = false;
        f166c[6] = false;
    }

    /* renamed from: an */
    private void m306an() {
        m402a(f238c);
        f9a.setClip(0, 0, 240, 240);
        if (f82s == f218g) {
            m191c(f9a, 16777215);
            f9a.fillRect(0, 0, 240, 240);
            m263b(f9a, f237d[0], 120, 120, 2);
            if (f87y < 15) {
                int i = (240 * f87y) / 15;
                f9a.fillRect((i - 240) - 10, 0, 240, 240);
                f9a.fillRect(i + 10, 0, 240, 240);
                int i2 = i - 11;
                f9a.drawLine(i2 + 2, 0, i2 + 2, 240);
                f9a.drawLine(i2 + 3, 0, i2 + 3, 240);
                f9a.drawLine(i2 + 5, 0, i2 + 5, 240);
                f9a.drawLine(i2 + 8, 0, i2 + 8, 240);
                int i3 = i + 10;
                f9a.drawLine(i3 - 2, 0, i3 - 2, 240);
                f9a.drawLine(i3 - 3, 0, i3 - 3, 240);
                f9a.drawLine(i3 - 5, 0, i3 - 5, 240);
                f9a.drawLine(i3 - 8, 0, i3 - 8, 240);
            }
            if (f87y >= 60) {
                m191c(f9a, 0);
                int i4 = ((f87y - 60) * 120) / 15;
                for (int i5 = 0; i5 < i4; i5++) {
                    f9a.drawLine(2 * i5, 0, 2 * i5, 240);
                    f9a.drawLine(239 - (2 * i5), 0, 239 - (2 * i5), 240);
                }
            }
        } else if (f82s == f219h) {
            m191c(f9a, 0);
            f9a.fillRect(0, 0, 240, 240);
            m263b(f9a, f237d[1], 120, 120, 2);
        } else if (f82s == f220i) {
            m191c(f9a, 0);
            f9a.fillRect(0, 0, 240, 240);
            m385a(true, true);
            m191c(f9a, 16777215);
            m394a(f9a, f240d[24], 11, 138, 20);
            m394a(f9a, f240d[f232c[3][f231n[3]]], 212, 138, 0);
            m263b(f9a, f237d[1], 217, 146, 20);
            m263b(f9a, f237d[2], (212 - f238c.stringWidth(f240d[f232c[3][f231n[3]]])) - 10, 146, 20);
            m389a(f240d[24], 120, 13, 16777215, 0);
        } else if (f82s == f221j) {
            m190c(false);
            m262b(f9a, f237d[0], 0, 0, 190, 109, f211b[0], 25, 56, 20);
            if (f83t == 0) {
                m262b(f9a, f237d[0], 0, 159, 49, 57, f211b[0], 97, 56 + ((5 - f87y) * 3), 20);
            } else if (f83t == 1) {
                m262b(f9a, f237d[0], 0, 109, 56, 50, f211b[0], 93, 61, 20);
            } else if (f83t == 2) {
                m262b(f9a, f237d[0], 0, 109, 56, 50, f211b[0], 93, 61, 20);
                m262b(f9a, f237d[0], 107, 188, 53, 36, f211b[0], 94, 75, 20);
            } else if (f83t == 3) {
                m262b(f9a, f237d[0], 62, 109, 60, 55, f211b[0], 97, 56, 20);
            } else if (f83t == 4) {
                m262b(f9a, f237d[0], 50, 164, 55, 57, f211b[0], 97, 55, 20);
            } else if (f83t == 5) {
                m262b(f9a, f237d[0], 127, 110, 35, 57, f211b[0], 94, 54, 20);
                m262b(f9a, f237d[0], 163, 109, 27, 58, f211b[0], 129, 53, 20);
            } else {
                m262b(f9a, f237d[0], 127, 110, 35, 57, f211b[0], 94, 54, 20);
                m262b(f9a, f237d[0], 135, 167, 26, 21, f211b[0], 98, 67, 20);
                if ((f87y / 2) % 2 == 0) {
                    m262b(f9a, f237d[0], 163, 167, 27, 58, f211b[0], 129, 53, 20);
                } else {
                    m262b(f9a, f237d[0], 163, 109, 27, 58, f211b[0], 129, 53, 20);
                }
            }
            m262b(f9a, f237d[0], 0, 224, 190, 56, f211b[0], 25, 109, 20);
            if ((f87y / 2) % 2 == 0) {
                m389a(f240d[0], 120, 178, 16777215, 0);
                m389a(f240d[1], 120, 204, 16777215, 0);
            }
        } else if (f82s == f229r) {
            m190c(true);
            f9a.setColor(Graphics.getColorOfRGB(0, 0, 0, 128));
            f9a.fillRect(0, 0, 240, 240);
            m385a(true, true);
            m191c(f9a, 16777215);
            m394a(f9a, "アプリを終了しますか？", 120, 69, 1);
            m394a(f9a, "ＹＥＳ", 120, 147, 1);
            m394a(f9a, "ＮＯ", 120, 173, 1);
            int stringWidth = f238c.stringWidth("ＹＥＳ");
            m110e((120 - (stringWidth / 2)) - 18, 147 + (f85v * 26));
            m110e(120 + (stringWidth / 2) + 2, 147 + (f85v * 26));
        } else if (f82s == f222k) {
            m191c(f9a, 16777215);
            f9a.fillRect(0, 0, 240, 240);
            m190c(false);
            m262b(f9a, f237d[0], 0, 0, 190, 109, f211b[0], 25, 56, 20);
            m262b(f9a, f237d[0], 127, 110, 35, 57, f211b[0], 94, 54, 20);
            m262b(f9a, f237d[0], 135, 167, 26, 21, f211b[0], 98, 67, 20);
            if ((f87y / 2) % 2 == 0) {
                m262b(f9a, f237d[0], 163, 167, 27, 58, f211b[0], 129, 53, 20);
            } else {
                m262b(f9a, f237d[0], 163, 109, 27, 58, f211b[0], 129, 53, 20);
            }
            m262b(f9a, f237d[0], 0, 224, 190, 56, f211b[0], 25, 109, 20);
            m385a(true, true);
            m263b(f9a, f237d[1], 233, 218, 20);
            m263b(f9a, f237d[2], 2, 218, 20);
            m389a(f240d[2 + f85v], 120, 217, 16777215, 16386570);
            m302ap();
        } else if (f82s == f223l) {
            m190c(true);
            m385a(true, true);
            m191c(f9a, 16777215);
            for (int i6 = 0; i6 < 5; i6++) {
                m394a(f9a, new StringBuffer().append("").append(i6 + 1).toString(), 32, 48 + (30 * i6), 0);
                m394a(f9a, new StringBuffer().append("").append(f234aa[i6]).toString(), 130, 48 + (30 * i6), 0);
                m394a(f9a, f240d[25 + f235ab[i6]], 200, 48 + (30 * i6), 1);
            }
            m389a(f240d[5], 120, 13, 16777215, 0);
            m389a(f240d[12], 120, 217, 16777215, 0);
        } else if (f82s == f224m) {
            m190c(true);
            m385a(true, true);
            m191c(f9a, 16777215);
            m394a(f9a, f240d[13], 120, 43, 1);
            m394a(f9a, f240d[14], 120, 69, 1);
            m394a(f9a, f240d[15], 120, 95, 1);
            m394a(f9a, f240d[16], 120, 121, 1);
            m394a(f9a, f240d[17], 120, 147, 1);
            m394a(f9a, f240d[18], 120, 173, 1);
            int stringWidth2 = f238c.stringWidth(f240d[17 + f85v]);
            m110e((120 - (stringWidth2 / 2)) - 18, 147 + (f85v * 26));
            m110e(120 + (stringWidth2 / 2) + 2, 147 + (f85v * 26));
        } else if (f82s == f225n) {
            m190c(true);
            m385a(true, true);
            m191c(f9a, 16777215);
            m394a(f9a, f240d[19], 120, 95, 1);
            m394a(f9a, f240d[20], 120, 122, 1);
        } else if (f82s == f226o) {
            if (f86w != 0) {
                m190c(true);
                m191c(f9a, 16777215);
                for (int i7 = 0; i7 < 3; i7++) {
                    m394a(f9a, f240d[21 + i7], 11, 78 + (i7 * 30), 20);
                    m394a(f9a, f240d[f232c[i7][f231n[i7]]], 212, 78 + (i7 * 30), 0);
                }
                m263b(f9a, f237d[1], 217, 78 + (f85v * 30) + 4, 20);
                m263b(f9a, f237d[2], (212 - f238c.stringWidth(f240d[f232c[f85v][f231n[f85v]]])) - 10, 78 + (f85v * 30) + 4, 20);
                m263b(f9a, this.f312b[4], 0, 0, 20);
                m399a(f9a, 34, 115, 251);
                f9a.fillRect(11, 5, 218, 26);
                m399a(f9a, 6, 66, 148);
                f9a.drawLine(10, 30, 10, 4);
                f9a.drawLine(10, 4, 229, 4);
                m399a(f9a, 129, 205, 242);
                f9a.drawLine(10, 31, 229, 31);
                f9a.drawLine(229, 31, 229, 5);
                m389a(f240d[6], 120, 13, 16777215, 0);
            }
            m263b(f9a, this.f312b[4], 0, 204, 20);
            m399a(f9a, 34, 115, 251);
            f9a.fillRect(9, 207, 222, 30);
            m399a(f9a, 6, 66, 148);
            f9a.drawLine(8, 236, 8, 206);
            f9a.drawLine(8, 206, 231, 206);
            m399a(f9a, 129, 205, 242);
            f9a.drawLine(8, 237, 231, 237);
            f9a.drawLine(231, 237, 231, 207);
            m300aq();
        } else if (f82s == f227p) {
            m190c(true);
            m385a(true, true);
            m191c(f9a, 16777215);
            m394a(f9a, f240d[42], 120, 95, 1);
            m394a(f9a, f240d[43], 120, 121, 1);
            int stringWidth3 = f238c.stringWidth(f240d[42 + f85v]);
            m110e((120 - (stringWidth3 / 2)) - 18, 95 + (f85v * 26));
            m110e(120 + (stringWidth3 / 2) + 2, 95 + (f85v * 26));
            m300aq();
        } else if (f82s == f228q && f86w != 0) {
            m190c(true);
            m385a(true, false);
            f9a.setFont(Font.getFont(1896875008));
            for (int i8 = 0; i8 < f233q[f85v][0]; i8++) {
                if (f233q[f85v][1 + (i8 * 3) + 0] == -1) {
                    m262b(f9a, this.GFX_GameArray[0], 0, 0, 16, 16, f211b[0], f233q[f85v][1 + (i8 * 3) + 1], f233q[f85v][1 + (i8 * 3) + 2], 20);
                } else if (f233q[f85v][1 + (i8 * 3) + 0] == 10) {
                    m398a(f9a, 1, 352, 0, 40, 40, f211b[0], f233q[f85v][1 + (i8 * 3) + 1], f233q[f85v][(1 + (i8 * 3)) + 2] - 36, 20);
                } else {
                    m262b(f9a, f237d[6], f239c[f233q[f85v][1 + (i8 * 3) + 0]][0], f239c[f233q[f85v][1 + (i8 * 3) + 0]][1], f239c[f233q[f85v][1 + (i8 * 3) + 0]][2], f239c[f233q[f85v][1 + (i8 * 3) + 0]][3], f211b[0], f233q[f85v][1 + (i8 * 3) + 1], f233q[f85v][1 + (i8 * 3) + 2], 20);
                }
            }
            if (f85v == 0) {
                m262b(f9a, f237d[6], f239c[13][0], f239c[13][1], f239c[13][2], f239c[13][3], f211b[0], 15, 43, 20);
                m262b(f9a, f237d[6], f239c[16][0], f239c[16][1], f239c[16][2], f239c[16][3], f211b[0], 25, 60, 20);
                m262b(f9a, f237d[6], f239c[15][0], f239c[15][1], f239c[15][2], f239c[15][3], f211b[0], 25, 80, 20);
            }
            for (int i9 = 0; i9 < 11; i9++) {
                m191c(f9a, 0);
                m395a(f9a, f241e[1 + (f85v * 12) + i9], 24, 43 + (13 * i9));
            }
            f9a.setFont(Font.getFont(1896875008));
            m389a(f241e[f85v * 12], 120, 13, 16777215, 0);
            m399a(f9a, 34, 115, 251);
            f9a.fillRect(15, 230, 210, 7);
            m399a(f9a, 6, 66, 148);
            f9a.drawLine(14, 235, 14, 229);
            f9a.drawLine(14, 229, 224, 229);
            m399a(f9a, 129, 205, 242);
            f9a.drawLine(14, 236, 224, 236);
            f9a.drawLine(224, 236, 224, 229);
            f9a.fillRect(15 + ((208 * f85v) / 11), 230, 18, 5);
            m263b(f9a, f237d[1], 227, 229, 20);
            m263b(f9a, f237d[2], 7, 229, 20);
        }
    }

    /* renamed from: a */
    private void m389a(String str, int i, int i2, int i3, int i4) {
        m191c(f9a, i4);
        m394a(f9a, str, i - 1, i2, 1);
        m394a(f9a, str, i + 1, i2, 1);
        m394a(f9a, str, i, i2 + 1, 1);
        m394a(f9a, str, i, i2 - 1, 1);
        m191c(f9a, i3);
        m394a(f9a, str, i, i2, 1);
    }

    /* renamed from: a */
    private void m385a(boolean z, boolean z2) {
        m263b(f9a, this.f312b[4], 0, 0, 20);
        m263b(f9a, this.f312b[4], 0, 204, 20);
        if (z) {
            m399a(f9a, 34, 115, 251);
            f9a.fillRect(11, 5, 218, 26);
            m399a(f9a, 6, 66, 148);
            f9a.drawLine(10, 30, 10, 4);
            f9a.drawLine(10, 4, 229, 4);
            m399a(f9a, 129, 205, 242);
            f9a.drawLine(10, 31, 229, 31);
            f9a.drawLine(229, 31, 229, 5);
        }
        if (z2) {
            m399a(f9a, 34, 115, 251);
            f9a.fillRect(9, 207, 222, 30);
            m399a(f9a, 6, 66, 148);
            f9a.drawLine(8, 236, 8, 206);
            f9a.drawLine(8, 206, 231, 206);
            m399a(f9a, 129, 205, 242);
            f9a.drawLine(8, 237, 231, 237);
            f9a.drawLine(231, 237, 231, 207);
        }
    }

    /* renamed from: e */
    private void m110e(int i, int i2) {
        m262b(f9a, f237d[4], 0, (f84u / 2) * 16, 16, 16, f211b[0], i, i2, 20);
    }

    /* renamed from: F */
    private void m487F(int i) {
        f89a = f240d[i];
        f88bg = 0;
    }

    /* renamed from: ao */
    private void m304ao() {
        f88bg = (f88bg + 1) % ((f238c.stringWidth(f89a) + 218) / 6);
    }

    /* renamed from: ap */
    private void m302ap() {
        f9a.setClip(12, 6, 216, 24);
        m399a(f9a, 255, 200, 200);
        m394a(f9a, f89a, 216 - (f88bg * 6), 13, 20);
        f9a.setClip(0, 0, 240, 240);
    }

    /* renamed from: aq */
    private void m300aq() {
        f9a.setClip(10, 208, 220, 28);
        m399a(f9a, 255, 200, 200);
        m394a(f9a, f89a, 216 - (f88bg * 6), 217, 20);
        f9a.setClip(0, 0, 240, 240);
    }

    /* renamed from: c */
    private void m190c(boolean z) {
        m263b(f9a, f237d[5], 0, 0, 20);
        if (z) {
            f9a.setColor(Graphics.getColorOfRGB(0, 0, 0, 128));
            f9a.fillRect(0, 0, 240, 240);
        }
    }

    /* renamed from: d */
    private void m125d(boolean z) {
        m39q();
        m496C(-1);
        m298ar();
        this.f54c = true;
        this.f55l = 10;
        try {
            f290a[0].setAttribute(5, 100);
        } catch (Throwable unused) {
        }
        try {
            if (z) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[51]).append(",length=").append(f6N[52] - f6N[51]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[0] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[52]).append(",length=").append(f6N[53] - f6N[52]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[1] = f4a.getImage();
                f82s = f218g;
            } else {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[39]).append(",length=").append(f6N[40] - f6N[39]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[0] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[54]).append(",length=").append(f6N[55] - f6N[54]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[0] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[49]).append(",length=").append(f6N[50] - f6N[49]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[1] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[50]).append(",length=").append(f6N[51] - f6N[50]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[2] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[39]).append(",length=").append(f6N[40] - f6N[39]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[4] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[58]).append(",length=").append(f6N[59] - f6N[58]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[5] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[53]).append(",length=").append(f6N[54] - f6N[53]).toString());
                System.gc();
                f4a.use();
                System.gc();
                f237d[6] = f4a.getImage();
                if (this.f312b[1] == null) {
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[44]).append(",length=").append(f6N[45] - f6N[44]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.f312b[1] = f4a.getImage();
                }
                if (this.f312b[2] == null) {
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[45]).append(",length=").append(f6N[46] - f6N[45]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.f312b[2] = f4a.getImage();
                }
                if (this.f312b[16] == null) {
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[103]).append(",length=").append(f6N[104] - f6N[103]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.f312b[16] = f4a.getImage();
                }
                if (this.f312b[17] == null) {
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[104]).append(",length=").append(f6N[105] - f6N[104]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.f312b[17] = f4a.getImage();
                }
                if (f230x != 0) {
                    f230x = (byte) 0;
                    f82s = f220i;
                } else {
                    f82s = f221j;
                    m496C(0);
                    if (!this.f325b) {
                        m493D(15);
                    }
                    this.f325b = false;
                }
            }
        } catch (Throwable unused2) {
        }
        f87y = (byte) 0;
        for (int i = 0; i < 10; i++) {
            f236f[i] = false;
        }
        f84u = (byte) 0;
    }

    /* renamed from: ar */
    private void m298ar() {
        try {
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=217000,length=71404");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            MainInputStream = this.f143a.getInputStream("lang_0.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(300);
            byte[] bArr = new byte[1];
            int i = 0;
            while (true) {
                int read = MainInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else if (bArr[0] == 13) {
                    MainInputStream.read(bArr);
                    if (i < 51) {
                        f240d[i] = new String(byteArrayOutputStream.toByteArray());
                    } else {
                        f214a[i - 51] = new String(byteArrayOutputStream.toByteArray());
                    }
                    byteArrayOutputStream.reset();
                    i++;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            MainInputStream.close();
            byteArrayOutputStream.close();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(300);
            MainInputStream = this.f143a.getInputStream("manual_0.txt");
            int i2 = 0;
            while (true) {
                int read2 = MainInputStream.read(bArr);
                if (read2 <= 0) {
                    break;
                } else if (bArr[0] == 13) {
                    MainInputStream.read(bArr);
                    f241e[i2] = new String(byteArrayOutputStream2.toByteArray());
                    byteArrayOutputStream2.reset();
                    i2++;
                } else {
                    byteArrayOutputStream2.write(bArr, 0, read2);
                }
            }
            MainInputStream.close();
            byteArrayOutputStream2.close();
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(300);
            MainInputStream = this.f143a.getInputStream("filelist.txt");
            int filelistindex = 0;
            while (true) {
                int read3 = MainInputStream.read(bArr);
                if (read3 <= 0) {
                    MainInputStream.close();
                    byteArrayOutputStream3.close();
                    this.f143a.close();
                    return;
                } else if (bArr[0] == 13) {
                    MainInputStream.read(bArr);
                    f242f[filelistindex] = new String(byteArrayOutputStream3.toByteArray());
                    byteArrayOutputStream3.reset();
                    filelistindex++;
                } else {
                    byteArrayOutputStream3.write(bArr, 0, read3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: C */
    public final void m496C(int i) {
        if (i == -1) {
            m407a(0, (String) null);
            m407a(1, (String) null);
        }
        if (i == 0) {
            m407a(0, f214a[f231n[1] + 21]);
            f162c[1] = f240d[39];
            m407a(0, f162c[0]);
            m407a(1, f162c[1]);
        }
        if (i == 1) {
            f162c[0] = "";
            f162c[1] = f240d[38];
            m407a(0, (String) null);
            m407a(1, f162c[1]);
        }
        if (i == 2) {
            m407a(0, f214a[f231n[1] + 21]);
            f162c[1] = f240d[38];
            m407a(0, f162c[0]);
            m407a(1, f162c[1]);
        }
    }

    /* renamed from: as */
    private void m296as() {
        this.f392bi = 0;
        this.f393bj = -1;
        this.f394bk = 0;
        this.f395bl = 0;
        for (int i = 0; i < 2; i++) {
            int i2 = f177R[i];
            f179T[i] = i2;
            f180U[i] = i2;
            f181V[i] = 0;
            f182W[i] = 0;
        }
    }

    /* renamed from: d */
    private void m127d(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 21) && this.f395bl <= 1 && this.f394bk <= 1 && Math.abs(m280b() - i) < 300 && Math.abs((m204c() + 40) - i2) < 120) {
            this.f394bk = 20;
            this.f393bj = 10;
            this.f395bl = 1;
        }
    }

    /* renamed from: e */
    private void m108e(int i, int i2, int i3) {
        if (this.f395bl > 2) {
            return;
        }
        if (this.f395bl != 2 || this.f394bk <= 1) {
            if (Math.abs(m280b() - i) >= (f171Q[4] == 35 ? 48 : 136) || m204c() + 40 <= i2 || m204c() - 320 >= i2) {
                return;
            }
            this.f394bk = 20;
            this.f393bj = 8;
            this.f395bl = 2;
        }
    }

    /* renamed from: f */
    private void m99f(int i, int i2, int i3) {
        if ((i3 == 2 || i3 == 10) && this.f395bl <= 3) {
            if ((this.f395bl != 3 || this.f394bk <= 1) && this.f394bk < 2 && Math.abs(m280b() - i) < 128 && Math.abs(m204c() - i2) < 96) {
                this.f394bk = 20;
                this.f393bj = 7;
                this.f395bl = 3;
            }
        }
    }

    /* renamed from: g */
    private void m92g(int i, int i2, int i3) {
        if (i3 == 2 && this.f395bl <= 4) {
            if ((this.f395bl != 4 || this.f394bk <= 1) && Math.abs(m280b() - i) < 96 && Math.abs(m204c() - i2) < 96) {
                this.f394bk = 20;
                this.f393bj = 5;
                this.f395bl = 4;
            }
        }
    }

    /* renamed from: h */
    private void m86h(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f395bl <= 4) {
            if ((this.f395bl != 4 || this.f394bk <= 1) && Math.abs(m280b() - i) < 96 && Math.abs(m204c() - i2) < 96) {
                this.f394bk = 20;
                this.f393bj = 5;
                this.f395bl = 4;
            }
        }
    }

    /* renamed from: i */
    private void m80i(int i, int i2, int i3) {
        if (i3 == 2 && this.f395bl <= 5) {
            if ((this.f395bl != 5 || this.f394bk <= 1) && Math.abs(m280b() - i) < 96 && Math.abs(m204c() - i2) < 96) {
                this.f394bk = 20;
                this.f393bj = 2;
                this.f395bl = 5;
            }
        }
    }

    /* renamed from: j */
    private void m74j(int i, int i2, int i3) {
        if ((i3 == 1 || i3 == 2) && this.f395bl <= 5) {
            if ((this.f395bl != 5 || this.f394bk <= 1) && Math.abs(m280b() - i) < 96 && Math.abs(m204c() - i2) < 96) {
                this.f394bk = 20;
                this.f393bj = 2;
                this.f395bl = 5;
            }
        }
    }

    /* renamed from: at */
    private void m294at() {
        int m280b = m280b();
        int m204c = m204c();
        if (this.f394bk > 0) {
            this.f394bk--;
            if (this.f394bk == 0) {
                this.f393bj = -1;
                this.f395bl = 0;
            }
        }
        if (this.f393bj < 0) {
            this.f395bl = 0;
            if (!f208V && !f209W) {
                switch (this.f314b) {
                    case 0:
                        this.f392bi = 1;
                        break;
                    case 1:
                        this.f392bi = 0;
                        break;
                    case 2:
                        this.f392bi = 1;
                        switch (this.f315c) {
                            case 0:
                                if (Math.abs(4272 - m280b) < 120 && Math.abs(1024 - m204c) < 320) {
                                    this.f392bi = 8;
                                    break;
                                } else if (Math.abs(4672 - m280b) < 80 && Math.abs(688 - m204c) < 96) {
                                    this.f392bi = 9;
                                    break;
                                }
                                break;
                            case 1:
                                if (Math.abs(2944 - m280b) < 640 && Math.abs(384 - (m204c + 40)) < 384) {
                                    this.f392bi = 9;
                                    break;
                                }
                                break;
                            case 2:
                                if (Math.abs(1552 - m280b) < 160 && Math.abs(1120 - (m204c + 40)) < 96) {
                                    this.f392bi = 3;
                                    break;
                                } else if (Math.abs(5632 - m280b) < 512 && Math.abs(688 - (m204c + 40)) < 96) {
                                    this.f392bi = 9;
                                    break;
                                }
                                break;
                        }
                    case 3:
                        this.f392bi = 1;
                        break;
                    case 4:
                        this.f392bi = 1;
                        if (this.f315c == 1) {
                            if (Math.abs(m280b - 7296) < 240 && Math.abs(m204c - 640) < 80) {
                                this.f392bi = 2;
                                break;
                            } else if (Math.abs(m280b - 8464) < 240 && Math.abs(m204c - 640) < 80) {
                                this.f392bi = 2;
                                break;
                            }
                        }
                        break;
                    case 5:
                        this.f392bi = 0;
                        break;
                }
            } else if (this.f314b == 5 && f177R[0] < 1024) {
                this.f392bi = 1;
            } else if (this.f314b == 1) {
                this.f392bi = 0;
            } else {
                this.f392bi = 6;
            }
        } else {
            this.f392bi = this.f393bj;
        }
        switch (this.f392bi) {
            case 1:
                f182W[0] = 0;
                f182W[1] = 0;
                break;
            case 2:
                f182W[0] = 0;
                f182W[1] = 32;
                break;
            case 3:
                f182W[0] = 0;
                f182W[1] = 40;
                break;
            case 4:
                if (f190Y[5] <= 0) {
                    f182W[0] = 0;
                    f182W[1] = 0;
                    break;
                } else {
                    f182W[0] = 0;
                    f182W[1] = 48;
                    break;
                }
            case 5:
                f182W[0] = 0;
                f182W[1] = -16;
                break;
            case 6:
                f182W[0] = 0;
                f182W[1] = 0;
                break;
            case 7:
                f182W[0] = 0;
                f182W[1] = 16;
                break;
            case 8:
                f182W[0] = 0;
                f182W[1] = -32;
                break;
            case 9:
                f182W[0] = 36;
                f182W[1] = 16;
                break;
            case 10:
                f182W[0] = 32;
                f182W[1] = 40;
                break;
            default:
                f179T[0] = f177R[0];
                f179T[1] = f177R[1];
                return;
        }
        int abs = Math.abs(f177R[0] - f180U[0]);
        int abs2 = Math.abs(f177R[1] - f180U[1]);
        if (this.f392bi == 6) {
            if (abs < 4 || abs > 256) {
                f180U[0] = f177R[0];
            } else {
                int[] iArr = f180U;
                iArr[0] = iArr[0] + (f177R[0] > f180U[0] ? 4 : -4);
            }
            if (abs2 < 4 || abs2 > 256) {
                f180U[1] = f177R[1];
            } else {
                int[] iArr2 = f180U;
                iArr2[1] = iArr2[1] + (f177R[1] > f180U[1] ? 4 : -4);
            }
        } else {
            if (abs < 32 || abs > 256) {
                f180U[0] = f177R[0];
            } else {
                int[] iArr3 = f180U;
                iArr3[0] = iArr3[0] + (f177R[0] > f180U[0] ? 32 : -32);
            }
            if (abs2 < 16 || abs2 > 256) {
                f180U[1] = f177R[1];
            } else if (abs2 > 32) {
                f180U[1] = f177R[1] > f180U[1] ? f180U[1] + 32 : f180U[1] - 32;
            } else {
                int[] iArr4 = f180U;
                iArr4[1] = iArr4[1] + (f177R[1] > f180U[1] ? 16 : -16);
            }
        }
        if (f181V[0] != f182W[0]) {
            int[] iArr5 = f181V;
            iArr5[0] = iArr5[0] + (f181V[0] < f182W[0] ? 1 : -1);
        }
        f179T[0] = f180U[0] + f181V[0];
        if (f181V[1] != f182W[1]) {
            int[] iArr6 = f181V;
            iArr6[1] = iArr6[1] + (f181V[1] < f182W[1] ? 1 : -1);
        }
        f179T[1] = f180U[1] + f181V[1];
        int i = 112;
        if (this.f365z > 0) {
            i = 112 + (this.f365z << 1);
        }
        if (this.f364y > 0) {
            i -= this.f364y << 1;
        }
        int i2 = this.f368f[3] - i;
        if (f179T[1] > i2) {
            f179T[1] = i2;
        }
    }

    /* renamed from: au */
    private void m292au() {
        if (this.f338X && this.f63aG > 0) {
            this.f63aG--;
            return;
        }
        if (this.f358k) {
            if (this.f64aH < 0) {
                this.f359l = false;
                this.f358k = false;
                this.f338X = false;
                f29ar = 0;
                f30as = 0;
                f31at = 0;
                f32au = 0;
                this.f78t = false;
                int i = this.f314b;
                if (f38ay == 7) {
                    m391a("ca");
                    Music_Play(f294b[0], 0, (f293K[0] - 160) + 40, 0);
                    this.f48aB = f24am;
                    try {
                        Thread.sleep(1000L);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f317e = (this.f317e + 1) % 3;
                    if (this.f317e == 0) {
                        this.f316d++;
                    }
                    this.f46b = (byte) (this.f317e + (this.f316d * 3));
                    this.f47c = (byte) f28aq;
                    this.f48aB = f24am;
                    if (this.f49d < this.f46b) {
                        this.f49d = this.f46b;
                    }
                    this.f314b = f212a[this.f316d][this.f317e];
                    this.f315c = f213b[this.f316d][this.f317e];
                }
                m89h();
                if (this.f418y) {
                    this.f418y = true;
                    this.f441A = true;
                    this.f442P = 0;
                    this.f318f = 0;
                    this.f147O = 0;
                    f190Y[12] = 0;
                    m407a(1, (String) null);
                    m391a("ca");
                    Music_Play(f294b[0], 0, (f293K[0] - 160) + 40, 0);
                    f300cm = 0;
                    f301cn = 0;
                    f302co = 0;
                    f303ad = false;
                    f305cp = 0;
                    for (int i2 = 0; i2 < 32; i2++) {
                        this.f147O++;
                        m54n();
                        try {
                            Thread.sleep(50L);
                        } catch (Throwable unused2) {
                        }
                    }
                    m408a(this.f314b, this.f315c, f161M);
                    f175C = false;
                    m17v();
                    m75j(this.f315c);
                    if (i != this.f314b) {
                        m39q();
                        m275b(this.f314b + 1);
                    }
                    if (this.f314b == 5 && this.f315c > 0) {
                        try {
                            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
                            this.f143a = new JarInflater(MainInputStream);
                            MainInputStream.close();
                            int i3 = this.f314b + 1;
                            if (this.f314b == 5 && this.f315c > 0) {
                                i3++;
                            }
                            byte[] bArr = new byte[(int) this.f143a.getSize(new StringBuffer().append("DBG").append(i3 - 1).append(".bin").toString())];
                            f161M = new int[1284];
                            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("DBG").append(i3 - 1).append(".bin").toString());
                            MainInputStream.read(bArr);
                            MainInputStream.close();
                            for (int i4 = 0; i4 < bArr.length / 4; i4++) {
                                int i5 = 0;
                                for (int i6 = 0; i6 < 4; i6++) {
                                    i5 |= (bArr[i6 + (i4 * 4)] & 255) << ((3 - i6) * 8);
                                }
                                f161M[i4] = i5;
                            }
                            System.gc();
                            System.gc();
                            System.gc();
                            m408a(this.f314b, this.f315c, f161M);
                        } catch (Throwable unused3) {
                        }
                    }
                    f36aw = f41a[this.f315c][0].length;
                    f37ax = f41a[this.f315c].length;
                    f40b = new byte[f37ax][f36aw];
                    for (int i7 = 0; i7 < f37ax; i7++) {
                        for (int i8 = 0; i8 < f36aw; i8++) {
                            f40b[i7][i8] = f41a[this.f315c][i7][i8];
                        }
                    }
                    m330ab();
                } else {
                    if (this.f314b == 5 && this.f315c > 0) {
                        try {
                            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
                            this.f143a = new JarInflater(MainInputStream);
                            MainInputStream.close();
                            int i9 = this.f314b + 1;
                            if (this.f314b == 5 && this.f315c > 0) {
                                i9++;
                            }
                            byte[] bArr2 = new byte[(int) this.f143a.getSize(new StringBuffer().append("DBG").append(i9 - 1).append(".bin").toString())];
                            f161M = new int[1284];
                            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("DBG").append(i9 - 1).append(".bin").toString());
                            MainInputStream.read(bArr2);
                            MainInputStream.close();
                            for (int i10 = 0; i10 < bArr2.length / 4; i10++) {
                                int i11 = 0;
                                for (int i12 = 0; i12 < 4; i12++) {
                                    i11 |= (bArr2[i12 + (i10 * 4)] & 255) << ((3 - i12) * 8);
                                }
                                f161M[i10] = i11;
                            }
                            System.gc();
                            System.gc();
                            System.gc();
                            m408a(this.f314b, this.f315c, f161M);
                        } catch (Throwable unused4) {
                        }
                    }
                    f36aw = f41a[this.f315c][0].length;
                    f37ax = f41a[this.f315c].length;
                    f40b = new byte[f37ax][f36aw];
                    for (int i13 = 0; i13 < f37ax; i13++) {
                        for (int i14 = 0; i14 < f36aw; i14++) {
                            f40b[i13][i14] = f41a[this.f315c][i13][i14];
                        }
                    }
                    m408a(this.f314b, this.f315c, f161M);
                    f175C = false;
                    m17v();
                    m75j(this.f315c);
                    this.f441A = false;
                    m25t();
                    if (i != this.f314b) {
                        f175C = true;
                    }
                }
            } else {
                this.f64aH--;
                if (this.f64aH == 10) {
                    m493D(28);
                }
                if (this.f65aI - this.f64aH > 15) {
                    boolean z = false;
                    for (int i15 = 0; i15 < 40; i15++) {
                        if (this.f361t > 0) {
                            this.f361t -= 10;
                            m197c(10, 0);
                            z = true;
                        }
                        if (this.f360s > 0) {
                            this.f360s -= 10;
                            m197c(10, 0);
                            z = true;
                        }
                    }
                    if (z) {
                        m391a("cd");
                    }
                }
            }
        }
        if (this.f338X) {
            this.f359l = true;
            f190Y[12] = 0;
            int[] iArr = f190Y;
            iArr[10] = iArr[10] + 128;
        }
        for (int i16 = 0; i16 < this.f340p.length; i16++) {
            if (this.f340p[i16][0] == 1 && this.f67aL >= this.f340p[i16][9]) {
                int i17 = 0;
                while (true) {
                    if (i17 >= 24) {
                        break;
                    }
                    if (this.f66aK + this.f340p[i16][8] > this.f340p[i16][2]) {
                        int[] iArr2 = this.f340p[i16];
                        iArr2[2] = iArr2[2] + 1;
                    } else if (this.f66aK + this.f340p[i16][8] < this.f340p[i16][2]) {
                        int[] iArr3 = this.f340p[i16];
                        iArr3[2] = iArr3[2] - 1;
                    } else {
                        this.f67aL++;
                        this.f340p[i16][0] = 2;
                        if (this.f338X) {
                            if (this.f67aL >= this.f396M) {
                                this.f396M = 5;
                                m54n();
                                this.f358k = true;
                                f18ag = -1;
                                this.f360s = f23al * 100;
                                this.f361t = 0;
                                if (f25an < 30 && f26ao == 0 && !this.f78t) {
                                    this.f361t = 50000;
                                } else if (f25an < 45 && f26ao == 0) {
                                    this.f361t = 10000;
                                } else if (f26ao < 1) {
                                    this.f361t = 5000;
                                } else if (f25an < 30 && f26ao == 1) {
                                    this.f361t = 4000;
                                } else if (f26ao < 2) {
                                    this.f361t = 3000;
                                } else if (f25an >= 30 || f26ao != 2) {
                                    this.f361t = 1000;
                                } else {
                                    this.f361t = 2000;
                                }
                                if (f38ay == 7) {
                                    this.f361t = 0;
                                    f175C = true;
                                }
                                if (this.f361t > this.f360s) {
                                    int i18 = (this.f361t / 400) + 30;
                                    this.f64aH = i18;
                                    this.f65aI = i18;
                                } else {
                                    int i19 = (this.f360s / 400) + 30;
                                    this.f64aH = i19;
                                    this.f65aI = i19;
                                }
                                if (f38ay == 7) {
                                    int i20 = (this.f360s / 400) + 90;
                                    this.f64aH = i20;
                                    this.f65aI = i20;
                                }
                            }
                        } else if (this.f67aL >= this.f396M) {
                            this.f396M = 5;
                            this.f391aa = true;
                            this.f54c = true;
                            this.f55l = 10;
                            m54n();
                            if (f175C) {
                                m21u();
                                f175C = false;
                                f29ar = 0;
                                f30as = 0;
                                f31at = 0;
                                f32au = 0;
                                this.f78t = false;
                                m13w();
                            } else {
                                m75j(this.f315c);
                                m13w();
                            }
                            this.f391aa = false;
                            this.f54c = true;
                            this.f55l = 10;
                        }
                    }
                    i17++;
                }
            }
        }
        if (f38ay != 2 || this.f338X) {
            return;
        }
        this.f67aL++;
        if (this.f67aL < 20) {
            return;
        }
        if (this.f67aL >= 30) {
            this.f340p[0][0] = 0;
            this.f340p[1][0] = 0;
            this.f340p[2][0] = 0;
            this.f340p[3][0] = 0;
            this.f340p[4][0] = 0;
            return;
        }
        int[] iArr4 = this.f340p[0];
        iArr4[2] = iArr4[2] + 48;
        int[] iArr5 = this.f340p[1];
        iArr5[2] = iArr5[2] + 48;
        int[] iArr6 = this.f340p[2];
        iArr6[2] = iArr6[2] + 48;
        int[] iArr7 = this.f340p[3];
        iArr7[2] = iArr7[2] - 48;
        int[] iArr8 = this.f340p[4];
        iArr8[2] = iArr8[2] - 48;
    }

    /* renamed from: av */
    private void m290av() {
        for (int i = 0; i < this.f340p.length; i++) {
            if (this.f340p[i][0] >= 1 && (this.f314b != 5 || this.f315c != 3 || (this.f340p[i][1] != this.f347aS && this.f340p[i][1] != this.f345aQ))) {
                m262b(f9a, this.f312b[5], this.f340p[i][4], this.f340p[i][5], this.f340p[i][6], this.f340p[i][7], f211b[0], this.f340p[i][2], this.f340p[i][3], 20);
            }
        }
        if (this.f358k) {
            if (f38ay != 7) {
                int[] iArr = {f24am, this.f361t, this.f360s};
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = (240 - ((this.f65aI - this.f64aH) * 24)) + (i2 * 12);
                    int i4 = i3;
                    if (i3 < 44) {
                        i4 = 44;
                    }
                    m262b(f9a, this.f312b[11], 0, i2 * 16, 84, 16, f211b[0], i4, 124 + (16 * i2), 20);
                    m420a(i4 + 152, (124 + (16 * i2)) - 36, iArr[i2]);
                }
                return;
            }
            int[] iArr2 = {f24am, this.f360s};
            for (int i5 = 0; i5 < 2; i5++) {
                int i6 = (240 - ((this.f65aI - this.f64aH) * 24)) + (i5 * 12);
                int i7 = i6;
                if (i6 < 44) {
                    i7 = 44;
                }
                m262b(f9a, this.f312b[11], 0, i5 * 32, 84, 16, f211b[0], i7, 140 + (16 * i5), 20);
                m420a(i7 + 152, (140 + (16 * i5)) - 36, iArr2[i5]);
            }
            if (this.f318f % 2 == 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < 6; i9++) {
                    if (f304h[i9]) {
                        i8++;
                    }
                }
                int i10 = 0;
                int[] iArr3 = {4, 2, 0, 1, 3, 5};
                for (int i11 = 0; i11 < 6; i11++) {
                    if (f304h[iArr3[i11]]) {
                        m262b(f9a, f297e[2], 16 * iArr3[i11], 0, 16, 16, f211b[0], (120 - ((i8 * 24) / 2)) + (i10 * 24), 124, 20);
                        i10++;
                    }
                }
            }
        }
    }

    /* renamed from: G */
    private void m484G(int i) {
        try {
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[17]).append(",length=").append(f6N[18] - f6N[17]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[100] = f4a.getImage();
            switch (i) {
                case 2:
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[101] = f4a.getImage();
                    this.GFX_GameArray[81] = GFX_Load(f242f[45]);
                    this.GFX_GameArray[87] = GFX_Load(f242f[46]);
                    this.GFX_GameArray[74] = GFX_Load(f242f[47]);
                    return;
                case 3:
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[101] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[80]).append(",length=").append(f6N[81] - f6N[80]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[40] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[33]).append(",length=").append(f6N[34] - f6N[33]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[49] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[66]).append(",length=").append(f6N[67] - f6N[66]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[78] = f4a.getImage();
                    return;
                case 4:
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[101] = f4a.getImage();
                    this.GFX_GameArray[50] = GFX_Load(f242f[48]);
                    this.GFX_GameArray[74] = GFX_Load(f242f[49]);
                    return;
                case 5:
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[101] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[80]).append(",length=").append(f6N[81] - f6N[80]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[40] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[85]).append(",length=").append(f6N[86] - f6N[85]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[57] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[98]).append(",length=").append(f6N[99] - f6N[98]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[71] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[65]).append(",length=").append(f6N[66] - f6N[65]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[70] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[67]).append(",length=").append(f6N[68] - f6N[67]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[102] = f4a.getImage();
                    return;
                case 6:
                    if (this.f315c != 3) {
                        f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                        System.gc();
                        f4a.use();
                        System.gc();
                        this.GFX_GameArray[101] = f4a.getImage();
                        f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[33]).append(",length=").append(f6N[34] - f6N[33]).toString());
                        System.gc();
                        f4a.use();
                        System.gc();
                        this.GFX_GameArray[49] = f4a.getImage();
                        this.GFX_GameArray[50] = GFX_Load(f242f[50]);
                        this.GFX_GameArray[51] = GFX_Load(f242f[51]);
                        return;
                    }
                    return;
                case 7:
                    return;
                default:
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[86]).append(",length=").append(f6N[87] - f6N[86]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[41] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[80]).append(",length=").append(f6N[81] - f6N[80]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[40] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[79]).append(",length=").append(f6N[80] - f6N[79]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[86] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[84]).append(",length=").append(f6N[85] - f6N[84]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[39] = f4a.getImage();
                    f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[85]).append(",length=").append(f6N[86] - f6N[85]).toString());
                    System.gc();
                    f4a.use();
                    System.gc();
                    this.GFX_GameArray[57] = f4a.getImage();
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private int m112e(int i) {
        switch (i) {
            case 1:
                return f211b[1];
            case 2:
                return f211b[2];
            case 3:
                return f211b[3];
            default:
                return 0;
        }
    }

    /* renamed from: c */
    private boolean m188c(int[] iArr) {
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

    /* renamed from: b */
    private void m259b(int[] iArr) {
        m257b(iArr, (f44b[iArr[1]][1] >> 1) - 2);
    }

    /* renamed from: b */
    private void m257b(int[] iArr, int i) {
        int i2 = iArr[3];
        int i3 = i2;
        int i4 = i2 + i;
        if (i3 < 99999) {
            i3++;
        }
        if (m128d(iArr[2], i4)) {
            i3 -= 2;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        iArr[3] = i3;
    }

    /* renamed from: c */
    private void m189c(int[] iArr) {
        if (iArr[19] == 0) {
            iArr[19] = 1;
        } else {
            iArr[19] = 0;
        }
    }

    /* renamed from: a */
    private int m421a(int i, int i2, int i3) {
        int i4 = i2 + i3;
        if (m128d(i, i4)) {
            for (int i5 = 0; i5 < 8; i5++) {
                i4--;
                if (!m128d(i, i4)) {
                    break;
                }
            }
        } else {
            for (int i6 = 0; i6 < 8 && !m128d(i, i4 + 1); i6++) {
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
    private boolean m415a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? (i - i3) - 1 < 0 || m128d((i - i3) - 1, i2 - 12) || !m128d((i - i3) - 1, (i2 + i4) + 10) : m128d((i + i3) + 1, i2 - 12) || !m128d((i + i3) + 1, (i2 + i4) + 10);
    }

    /* renamed from: b */
    private boolean m266b(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? (i - i3) - 1 < 0 || m128d((i - i3) - 1, i2 - 8) || !m128d((i - i3) - 1, (i2 - i4) - 12) : m128d((i + i3) + 1, i2 - 8) || !m128d((i + i3) + 1, (i2 - i4) - 12);
    }

    /* renamed from: b */
    public final boolean m258b(int[] iArr) {
        return m415a(iArr[2], iArr[3], f44b[iArr[1]][0] >> 1, f44b[iArr[1]][1] >> 1, iArr[19] & 1);
    }

    /* renamed from: a */
    public final boolean m378a(int[] iArr, int i, int i2) {
        int m280b = m280b();
        int m204c = m204c() - (f198N ? 16 : 20);
        if (iArr[3] - i2 > m204c || m204c > iArr[3] + i2) {
            return false;
        }
        switch (iArr[19]) {
            case 0:
                return iArr[2] - i < m280b && m280b < iArr[2];
            case 1:
                return iArr[2] < m280b && m280b < iArr[2] + i;
            default:
                return false;
        }
    }

    /* renamed from: e */
    private boolean m109e(int i, int i2) {
        return Math.abs(i - m280b()) > 240 || Math.abs(i2 - m204c()) > 240;
    }

    /* renamed from: a */
    private boolean m419a(int i, int i2, int i3) {
        int m280b = i - m280b();
        int m204c = i2 - (m204c() - (f198N ? 16 : 20));
        return (m280b * m280b) + (m204c * m204c) < i3 * i3;
    }

    /* renamed from: a */
    private int m409a(int i, int i2, int i3, int i4, boolean z) {
        if (f196L && f192H) {
            return 0;
        }
        int i5 = (f198N || f200P) ? 12 : 16;
        int m280b = m280b();
        int m204c = m204c() - i5;
        int i6 = (i3 >> 1) + 12;
        int i7 = (i4 >> 1) + i5;
        if (f198N) {
            if (m280b - i6 >= i || i >= m280b + i6 || m204c - i7 >= i2 || i2 >= m204c + i7) {
                return 0;
            }
            return (f18ag <= 0 && !z) ? 2 : 1;
        } else if (m280b - i6 >= i || i >= m280b + i6 || m204c - i7 >= i2 || i2 >= m204c + i7) {
            return 0;
        } else {
            return f18ag > 0 ? 1 : 2;
        }
    }

    /* renamed from: d */
    private boolean m123d(int[] iArr) {
        int m409a = m409a(iArr[2], iArr[3], (int) f44b[iArr[1]][0], (int) f44b[iArr[1]][1], true);
        if (iArr[1] == 71 && m409a == 1) {
            if (iArr[3] - 4 > m204c() - 16) {
                m409a = 2;
            }
        } else if (iArr[1] == 50 && m409a == 1) {
            m409a = 2;
        }
        if (m409a != 1) {
            if (m409a == 2) {
                m488F();
                return false;
            }
            return false;
        }
        if (f190Y[5] > 0) {
            f190Y[5] = f190Y[5] > 2560 ? -2560 : -f190Y[5];
        }
        if (f243bh == 0) {
            f243bh = 100;
        } else if (f243bh == 100) {
            f243bh = 200;
        } else if (f243bh == 200) {
            f243bh = 500;
        } else if (f243bh == 500) {
            f243bh = 1000;
        }
        m490E(f243bh);
        m51n(iArr[2], iArr[3], f243bh);
        m412a(2, iArr[2], iArr[3], 0, 0, 0, 0);
        m412a(f244d[this.f314b][m200c(2)], iArr[2], iArr[3], 0, -300, 0, 0);
        iArr[0] = 0;
        m391a("c1");
        return true;
    }

    /* renamed from: f */
    private void m100f(int i, int i2) {
        if (f171Q[12] == 1) {
            if (i2 == 0) {
                if ((f171Q[6] >> 8) - f171Q[2] >= 0) {
                    f171Q[10] = -276;
                } else {
                    f171Q[10] = 276;
                }
                f171Q[11] = -2072;
            } else if (i2 == 1) {
                if ((f171Q[6] >> 8) - f171Q[2] >= 0) {
                    f171Q[10] = -204;
                } else {
                    f171Q[10] = 204;
                }
                f171Q[11] = -2800;
            } else if (i2 == 2) {
                if ((f171Q[6] >> 8) - f171Q[2] >= 0) {
                    f171Q[10] = -160;
                } else {
                    f171Q[10] = 160;
                }
                f171Q[11] = -3584;
            }
            f171Q[12] = 0;
            int[] iArr = f171Q;
            iArr[7] = iArr[7] - 9216;
            f171Q[18] = 1;
        }
    }

    /* renamed from: H */
    private void m481H(int i) {
        if (f171Q[6] == 0 && f171Q[7] == 0) {
            f171Q[6] = (f171Q[8] + 32) << 8;
            f171Q[7] = (((f171Q[3] - 21) - 4) + 20) << 8;
            if (f171Q[4] != 255) {
                f171Q[12] = 1;
            }
        }
        int[] iArr = {f171Q[6] >> 8, f171Q[7] >> 8};
        if (f171Q[4] == 255 && f171Q[13] == 1) {
            if (f171Q[14] > 0) {
                int[] iArr2 = f171Q;
                iArr2[14] = iArr2[14] - 1;
            } else if (f171Q[12] != 0) {
                if (f171Q[18] == 0) {
                    m93g(f171Q[6] >> 8, f171Q[7] >> 8);
                    m391a("c4");
                } else {
                    m412a(3, f171Q[6] >> 8, f171Q[7] >> 8, 0, 0, 0, 0);
                    m391a("c4");
                }
                f171Q[13] = 0;
                f171Q[12] = 0;
                f171Q[18] = 0;
            }
        }
        int abs = 47 - (Math.abs(m280b() - f171Q[2]) >> 1);
        int i2 = abs;
        if (abs < 0) {
            i2 = 0;
        }
        if (f171Q[5] == 1) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 0, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 52, 21);
            if (m411a >= 0) {
                if (Math.abs(m280b() - f171Q[2]) < 8) {
                    f190Y[1] = (f171Q[3] - 21) << 8;
                    m100f(i, 0);
                    m81i(f171Q[20]);
                } else if (m280b() > f171Q[2]) {
                    f190Y[1] = ((f171Q[3] + f245o[i2]) - 16) << 8;
                    f171Q[5] = 0;
                    m100f(i, 0);
                    m81i(f171Q[20]);
                } else {
                    f190Y[1] = ((f171Q[3] + f245o[i2]) - 16) << 8;
                    f171Q[5] = 2;
                    m100f(i, 0);
                    m81i(f171Q[20]);
                }
            }
            if (f33D && f35av == f171Q[20] && m411a != 0) {
                f33D = false;
            }
        } else if (f33D && f35av == f171Q[20]) {
            if ((f171Q[2] - 40) - 10 >= m280b() || f171Q[2] + 40 + 10 <= m280b()) {
                f33D = false;
            } else if (Math.abs(m280b() - f171Q[2]) < 8) {
                f190Y[1] = (f171Q[3] - 21) << 8;
                if (f171Q[5] != 1) {
                    m100f(i, 0);
                }
                f171Q[5] = 1;
                m81i(f171Q[20]);
            } else if (f171Q[2] < m280b()) {
                f190Y[1] = ((f171Q[3] - 16) + f245o[i2]) << 8;
                if (f171Q[5] != 0) {
                    if (f190Y[5] >= 2560) {
                        m100f(i, 2);
                    } else {
                        m100f(i, 1);
                    }
                }
                f171Q[5] = 0;
                m81i(f171Q[20]);
            } else {
                f190Y[1] = ((f171Q[3] - 16) + f245o[i2]) << 8;
                if (f171Q[5] != 2) {
                    if (f190Y[5] >= 2560) {
                        m100f(i, 2);
                    } else {
                        m100f(i, 1);
                    }
                }
                f171Q[5] = 2;
                m81i(f171Q[20]);
            }
        } else if ((f171Q[2] - 40) - 10 < m280b() && f171Q[2] + 40 + 10 > m280b()) {
            if (Math.abs(m280b() - f171Q[2]) < 8) {
                int i3 = f171Q[3] - 21;
                if (i3 > f170P[1] && i3 <= m204c()) {
                    f190Y[1] = (i3 << 8) - 1;
                    m100f(i, 0);
                    f171Q[5] = 1;
                    m81i(f171Q[20]);
                }
            } else if (f171Q[2] < m280b()) {
                int i4 = f171Q[5] == 0 ? (f171Q[3] - 16) + f245o[i2] : f171Q[5] == 2 ? (f171Q[3] - 16) - f245o[i2] : f171Q[3] - 21;
                if (i4 >= f170P[1] && i4 <= m204c()) {
                    f190Y[1] = ((f171Q[3] - 16) + f245o[i2]) << 8;
                    if (f171Q[5] != 0) {
                        if (f190Y[5] >= 2560) {
                            m100f(i, 2);
                        } else {
                            m100f(i, 1);
                        }
                    }
                    f171Q[5] = 0;
                    m81i(f171Q[20]);
                }
            } else {
                int i5 = f171Q[5] == 0 ? (f171Q[3] - 16) - f245o[i2] : f171Q[5] == 2 ? (f171Q[3] - 16) + f245o[i2] : f171Q[3] - 21;
                if (i5 > f170P[1] && i5 <= m204c()) {
                    f190Y[1] = ((f171Q[3] - 16) + f245o[i2]) << 8;
                    if (f171Q[5] != 2) {
                        if (f190Y[5] >= 2560) {
                            m100f(i, 2);
                        } else {
                            m100f(i, 1);
                        }
                        f171Q[5] = 2;
                    }
                    m81i(f171Q[20]);
                }
            }
        }
        if (f171Q[4] == 255 && f171Q[13] == 0) {
            return;
        }
        int[] iArr3 = new int[2];
        if (f171Q[12] == 0) {
            int[] iArr4 = f171Q;
            iArr4[11] = iArr4[11] + 56;
            if (((f171Q[2] - 40) << 8) >= f171Q[6]) {
                f171Q[6] = ((f171Q[2] - 40) + 1) << 8;
                f171Q[10] = 0;
            } else if (((f171Q[2] + 40) << 8) <= f171Q[6]) {
                f171Q[6] = ((f171Q[2] + 40) - 1) << 8;
                f171Q[10] = 0;
            }
            int[] iArr5 = f171Q;
            iArr5[6] = iArr5[6] + f171Q[10];
            int[] iArr6 = f171Q;
            iArr6[7] = iArr6[7] + f171Q[11];
        }
        iArr3[0] = f171Q[6] >> 8;
        iArr3[1] = f171Q[7] >> 8;
        int abs2 = 47 - (Math.abs(iArr3[0] - f171Q[2]) >> 1);
        int i6 = abs2;
        if (abs2 < 0) {
            i6 = 0;
        }
        if (f171Q[12] == 0 && f171Q[11] > 0) {
            if (f171Q[5] == 1) {
                if (f171Q[2] - 40 < iArr3[0] && f171Q[2] + 40 > iArr3[0] && f171Q[3] - 16 <= iArr3[1]) {
                    if (iArr3[0] >= f171Q[2]) {
                        f171Q[5] = 0;
                    } else {
                        f171Q[5] = 2;
                    }
                    f171Q[7] = (((f171Q[3] - 21) - 4) + 20) << 8;
                    f171Q[12] = 1;
                    if (f33D && f35av == f171Q[20]) {
                        f190Y[3] = 0;
                        f190Y[5] = -f171Q[11];
                        f196L = true;
                        f197M = true;
                        f192H = false;
                        if (f171Q[4] == 255) {
                            f198N = true;
                            f191G = false;
                        } else {
                            f198N = false;
                            f191G = true;
                            m391a("cc");
                        }
                        f33D = false;
                    }
                    f171Q[10] = 0;
                    f171Q[11] = 0;
                }
            } else if (f171Q[2] - 40 >= iArr3[0] || f171Q[2] + 40 <= iArr3[0]) {
                f171Q[12] = 0;
            } else if (f171Q[2] < iArr3[0]) {
                if ((f171Q[5] == 2 ? (f171Q[3] - 16) - f245o[i6] : (f171Q[3] - 16) + f245o[i6]) <= iArr3[1]) {
                    f171Q[7] = (((f171Q[3] - 21) - 4) + 20) << 8;
                    f171Q[12] = 1;
                    if (f171Q[5] != 0 && f33D && f35av == f171Q[20]) {
                        f190Y[3] = 0;
                        f190Y[5] = -f171Q[11];
                        f196L = true;
                        if (f171Q[4] == 255) {
                            f198N = true;
                            f191G = false;
                        } else {
                            f198N = false;
                            f191G = true;
                            m391a("cc");
                        }
                        f192H = false;
                        f197M = true;
                        f33D = false;
                    }
                    f171Q[5] = 0;
                    f171Q[10] = 0;
                    f171Q[11] = 0;
                }
            } else {
                if ((f171Q[5] == 0 ? (f171Q[3] - 16) - f245o[i6] : (f171Q[3] - 16) + f245o[i6]) <= iArr3[1]) {
                    f171Q[7] = (((f171Q[3] - 21) - 4) + 20) << 8;
                    f171Q[12] = 1;
                    if (f171Q[5] != 2 && f33D && f35av == f171Q[20]) {
                        f190Y[5] = -f171Q[11];
                        f190Y[3] = 0;
                        f196L = true;
                        if (f171Q[4] == 255) {
                            f198N = true;
                            f191G = false;
                        } else {
                            f198N = false;
                            f191G = true;
                            m391a("cc");
                        }
                        f192H = false;
                        f197M = true;
                        f33D = false;
                    }
                    f171Q[5] = 2;
                    f171Q[10] = 0;
                    f171Q[11] = 0;
                }
            }
        }
        if (m409a(f171Q[6] >> 8, f171Q[7] >> 8, 12, 12, false) != 0) {
            if (f33D && f35av == f171Q[20]) {
                f33D = false;
            }
            m488F();
        }
    }

    /* renamed from: I */
    private void m478I(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19];
        int i3 = i2 == 0 ? -2 : 2;
        if (m188c(iArr)) {
            return;
        }
        switch (iArr[14]) {
            case 1:
                if (Math.abs(m280b() - iArr[2]) < 50) {
                    iArr[5] = 30;
                    iArr[15] = 0;
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 2:
                if (m280b() > iArr[2]) {
                    iArr[19] = 1;
                } else {
                    iArr[19] = 0;
                }
                if (iArr[5] <= 0) {
                    iArr[5] = 48;
                    iArr[15] = 1;
                    if (iArr[4] != 1) {
                        iArr[14] = iArr[14] + 1;
                        break;
                    } else {
                        iArr[14] = 6;
                        break;
                    }
                }
                break;
            case 3:
                m259b(iArr);
                if (iArr[5] <= 0) {
                    iArr[5] = 8;
                    iArr[15] = 2;
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 4:
                m259b(iArr);
                if (iArr[5] <= 0) {
                    iArr[5] = 8;
                    iArr[15] = 3;
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 5:
                iArr[2] = iArr[2] + i3;
                m259b(iArr);
                iArr[15] = 4 + (this.f318f & 1);
                break;
            case 6:
                if (iArr[5] <= 0) {
                    m413a(7, iArr[2], iArr[3], i2 == 0 ? 270 : 90, 150, 0);
                    iArr[5] = 60;
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 7:
                if (iArr[5] <= 0) {
                    iArr[15] = 0;
                    iArr[5] = 10;
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 8:
                if (iArr[5] <= 0) {
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 9:
                iArr[15] = -1;
                break;
            default:
                iArr[15] = -1;
                iArr[14] = 1;
                break;
        }
        if (iArr[14] < 3 || iArr[14] > 7) {
            return;
        }
        m123d(iArr);
    }

    /* renamed from: J */
    private void m475J(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19];
        int i3 = i2 == 0 ? -2 : 2;
        if (m188c(iArr)) {
            return;
        }
        switch (iArr[14]) {
            case 1:
                iArr[18] = 0;
                iArr[14] = iArr[14] + 1;
            case 2:
                iArr[18] = 0;
                if (iArr[6] > 440) {
                    if (iArr[19] == 0) {
                        iArr[19] = 1;
                    } else {
                        iArr[19] = 0;
                    }
                    iArr[6] = 0;
                }
                if (m378a(iArr, 160, 100)) {
                    iArr[5] = 20;
                    iArr[14] = 3;
                }
                iArr[2] = iArr[2] + i3;
                iArr[15] = this.f318f & 1;
                break;
            case 3:
                iArr[6] = iArr[6] - 1;
                iArr[15] = 2 + (this.f318f & 1);
                if (iArr[5] <= 0) {
                    iArr[5] = 90;
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 4:
                iArr[6] = iArr[6] - 1;
                iArr[15] = 4 + (this.f318f & 1);
                if (iArr[5] == 16) {
                    iArr[18] = 1;
                } else if (iArr[5] == 8) {
                    iArr[18] = 2;
                }
                if (iArr[5] <= 0) {
                    iArr[18] = 0;
                    m413a(7, iArr[2] + (i2 == 0 ? -18 : 18), iArr[3] + 24, i2 == 0 ? 210 : 150, 150, 0);
                    iArr[5] = 30;
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 5:
                iArr[6] = iArr[6] - 1;
                if (iArr[5] <= 0) {
                    iArr[14] = iArr[14] + 1;
                }
                break;
            case 6:
                iArr[2] = iArr[2] + i3;
                iArr[15] = this.f318f & 1;
                if (iArr[6] > 480) {
                    iArr[14] = 2;
                    break;
                }
                break;
            default:
                iArr[14] = 1;
                break;
        }
        m123d(iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m472K(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 168) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (this.f318f >> 1) % 3;
                    iArr[2] = iArr[2] + i2;
                    m259b(iArr);
                    if (m258b(iArr)) {
                        iArr[5] = 60;
                        iArr[14] = iArr[14] + 1;
                    }
                    if ((this.f318f & 7) == 0) {
                        m412a(15, iArr[2] - (i2 * 20), iArr[3] - 2, 0, 0, 0, 0);
                        break;
                    }
                    break;
                case 2:
                    iArr[15] = (this.f318f >> 1) % 3;
                    iArr[2] = iArr[2] + i2;
                    m259b(iArr);
                    if (m258b(iArr)) {
                    }
                    if ((this.f318f & 7) == 0) {
                    }
                    break;
                case 3:
                    if (iArr[5] <= 0) {
                        m189c(iArr);
                        iArr[6] = 0;
                        iArr[14] = iArr[14] - 1;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (this.f318f >> 1) % 3;
                    iArr[2] = iArr[2] + i2;
                    m259b(iArr);
                    if (m258b(iArr)) {
                    }
                    if ((this.f318f & 7) == 0) {
                    }
                    break;
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025b  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m469L(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if (Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 168) {
            iArr[5] = iArr[5] + 1;
            if (m109e(iArr[2], iArr[3])) {
                iArr[18] = 0;
                return;
            }
            if (iArr[18] == 3 || iArr[18] == 4) {
                if (m415a(iArr[6] >> 8, iArr[7] >> 8, 8, 8, iArr[8] == -1 ? 0 : 1)) {
                    iArr[8] = iArr[8] == 1 ? -1 : 1;
                }
                if (m415a(iArr[9] >> 8, iArr[10] >> 8, 8, 8, iArr[11] == -1 ? 0 : 1)) {
                    iArr[11] = iArr[11] == 1 ? -1 : 1;
                }
                if (m415a(iArr[12] >> 8, iArr[13] >> 8, 8, 8, iArr[14] == -1 ? 0 : 1)) {
                    iArr[14] = iArr[14] == 1 ? -1 : 1;
                }
                if (m415a(iArr[15] >> 8, iArr[16] >> 8, 8, 8, iArr[17] == -1 ? 0 : 1)) {
                    iArr[17] = iArr[17] == 1 ? -1 : 1;
                }
            }
            switch (iArr[18]) {
                case 1:
                    iArr[5] = 0;
                    iArr[6] = iArr[2] << 8;
                    iArr[7] = iArr[3] << 8;
                    iArr[8] = i2;
                    iArr[9] = iArr[6] + (((-i2) * 12) << 8);
                    iArr[10] = iArr[7];
                    iArr[11] = i2;
                    iArr[12] = iArr[9] + (((-i2) * 12) << 8);
                    iArr[13] = iArr[10];
                    iArr[14] = i2;
                    iArr[15] = iArr[12] + (((-i2) * 12) << 8);
                    iArr[16] = iArr[13];
                    iArr[17] = i2;
                    iArr[18] = iArr[18] + 1;
                    iArr[7] = m421a(iArr[6] >> 8, iArr[7] >> 8, 8) << 8;
                    iArr[10] = m421a(iArr[9] >> 8, iArr[10] >> 8, 8) << 8;
                    iArr[13] = m421a(iArr[12] >> 8, iArr[13] >> 8, 8) << 8;
                    iArr[16] = m421a(iArr[15] >> 8, iArr[16] >> 8, 8) << 8;
                    if (iArr[5] >= 8) {
                        iArr[5] = 0;
                        iArr[18] = iArr[18] + 1;
                        break;
                    }
                    break;
                case 2:
                    iArr[7] = m421a(iArr[6] >> 8, iArr[7] >> 8, 8) << 8;
                    iArr[10] = m421a(iArr[9] >> 8, iArr[10] >> 8, 8) << 8;
                    iArr[13] = m421a(iArr[12] >> 8, iArr[13] >> 8, 8) << 8;
                    iArr[16] = m421a(iArr[15] >> 8, iArr[16] >> 8, 8) << 8;
                    if (iArr[5] >= 8) {
                    }
                    break;
                case 3:
                    iArr[6] = iArr[6] + (0 * iArr[8]);
                    iArr[9] = iArr[9] + (32 * iArr[11]);
                    iArr[12] = iArr[12] + (64 * iArr[14]);
                    iArr[15] = iArr[15] + (96 * iArr[17]);
                    if (iArr[5] >= 32) {
                        iArr[18] = iArr[18] + 1;
                        break;
                    }
                    break;
                case 4:
                    iArr[6] = iArr[6] + (96 * iArr[8]);
                    iArr[9] = iArr[9] + (64 * iArr[11]);
                    iArr[12] = iArr[12] + (32 * iArr[14]);
                    iArr[15] = iArr[15] + (0 * iArr[17]);
                    if (iArr[5] >= 64) {
                        iArr[18] = iArr[18] + 1;
                        break;
                    }
                    break;
                case 5:
                    if (iArr[8] == iArr[11] && iArr[11] == iArr[14] && iArr[14] == iArr[17]) {
                        iArr[9] = iArr[6] + (((-iArr[8]) * 12) << 8);
                        iArr[12] = iArr[9] + (((-iArr[8]) * 12) << 8);
                        iArr[15] = iArr[12] + (((-iArr[8]) * 12) << 8);
                    }
                    iArr[5] = 0;
                    iArr[18] = 3;
                    break;
                default:
                    iArr[18] = 1;
                    iArr[5] = 0;
                    iArr[6] = iArr[2] << 8;
                    iArr[7] = iArr[3] << 8;
                    iArr[8] = i2;
                    iArr[9] = iArr[6] + (((-i2) * 12) << 8);
                    iArr[10] = iArr[7];
                    iArr[11] = i2;
                    iArr[12] = iArr[9] + (((-i2) * 12) << 8);
                    iArr[13] = iArr[10];
                    iArr[14] = i2;
                    iArr[15] = iArr[12] + (((-i2) * 12) << 8);
                    iArr[16] = iArr[13];
                    iArr[17] = i2;
                    iArr[18] = iArr[18] + 1;
                    iArr[7] = m421a(iArr[6] >> 8, iArr[7] >> 8, 8) << 8;
                    iArr[10] = m421a(iArr[9] >> 8, iArr[10] >> 8, 8) << 8;
                    iArr[13] = m421a(iArr[12] >> 8, iArr[13] >> 8, 8) << 8;
                    iArr[16] = m421a(iArr[15] >> 8, iArr[16] >> 8, 8) << 8;
                    if (iArr[5] >= 8) {
                    }
                    break;
            }
            iArr[7] = m421a(iArr[6] >> 8, iArr[7] >> 8, 8) << 8;
            iArr[10] = m421a(iArr[9] >> 8, iArr[10] >> 8, 8) << 8;
            iArr[13] = m421a(iArr[12] >> 8, iArr[13] >> 8, 8) << 8;
            iArr[16] = m421a(iArr[15] >> 8, iArr[16] >> 8, 8) << 8;
            if (iArr[7] + 4096 < iArr[10]) {
                iArr[10] = iArr[7];
            }
            if (Math.abs(iArr[8] - iArr[11]) > 3072) {
                iArr[11] = iArr[11] + (iArr[8] << 8);
            }
            if (iArr[7] + 4096 < iArr[13]) {
                iArr[13] = iArr[7];
            }
            if (Math.abs(iArr[8] - iArr[14]) > 3072) {
                iArr[14] = iArr[14] + (iArr[8] << 8);
            }
            if (iArr[7] + 4096 < iArr[16]) {
                iArr[16] = iArr[7];
            }
            if (Math.abs(iArr[8] - iArr[17]) > 3072) {
                iArr[17] = iArr[17] + (iArr[8] << 8);
            }
            iArr[2] = iArr[6] >> 8;
            iArr[3] = iArr[7] >> 8;
            if (m123d(iArr)) {
                return;
            }
            if (m409a(iArr[12] >> 8, iArr[13] >> 8, 22, 10, false) != 0) {
                m413a(14, iArr[2], iArr[3], (30 * i2) + 360, 300, 0);
                m413a(14, iArr[9] >> 8, iArr[10] >> 8, (15 * i2) + 360, 300, 1);
                m413a(14, iArr[12] >> 8, iArr[13] >> 8, ((-15) * i2) + 360, 300, 1);
                m413a(14, iArr[15] >> 8, iArr[16] >> 8, ((-30) * i2) + 360, 300, 1);
                iArr[0] = 0;
                m488F();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m466M(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - m280b()) <= 360 || Math.abs(iArr[3] - m204c()) <= 360) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[5] = 121;
                    iArr[6] = 0;
                    iArr[18] = iArr[19] != 2 ? 1 : 0;
                    iArr[14] = iArr[14] + 1;
                    iArr[5] = 121;
                    iArr[15] = this.f318f >> 3;
                    if (iArr[18] == 0) {
                        m257b(iArr, 18);
                        if ((this.f319g & 15) == 0) {
                            iArr[2] = iArr[2] + i2;
                        }
                        if (m258b(iArr) || iArr[6] > 600) {
                            m189c(iArr);
                            iArr[6] = 0;
                        }
                    } else {
                        if (m128d(iArr[2], iArr[3] - 18)) {
                            iArr[3] = iArr[3] + 1;
                        }
                        if (m266b(iArr[2], iArr[3], 12, 18, iArr[19]) || iArr[6] > 600) {
                            if (iArr[19] == 0) {
                                iArr[19] = 1;
                            } else {
                                iArr[19] = 0;
                            }
                            iArr[6] = 0;
                        }
                        if ((this.f319g & 15) == 0) {
                            iArr[2] = iArr[2] + i2;
                        }
                    }
                    if (Math.abs(iArr[2] - m280b()) < 100 && Math.abs(iArr[3] - (m204c() - 12)) < 100) {
                        iArr[14] = iArr[14] + 1;
                        break;
                    }
                    break;
                case 2:
                    iArr[5] = 121;
                    iArr[15] = this.f318f >> 3;
                    if (iArr[18] == 0) {
                    }
                    if (Math.abs(iArr[2] - m280b()) < 100) {
                        iArr[14] = iArr[14] + 1;
                        break;
                    }
                    break;
                case 3:
                    if (iArr[5] <= 0) {
                        m413a(13, iArr[2], iArr[3], 30, 300, 0);
                        m413a(13, iArr[2], iArr[3], 30, 200, 0);
                        m413a(13, iArr[2], iArr[3], 330, 300, 0);
                        m413a(13, iArr[2], iArr[3], 330, 200, 0);
                        m412a(1, iArr[2], iArr[3], 0, 0, 0, 0);
                        m391a("c4");
                        iArr[0] = 0;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[5] = 121;
                    iArr[6] = 0;
                    iArr[18] = iArr[19] != 2 ? 1 : 0;
                    iArr[14] = iArr[14] + 1;
                    iArr[5] = 121;
                    iArr[15] = this.f318f >> 3;
                    if (iArr[18] == 0) {
                    }
                    if (Math.abs(iArr[2] - m280b()) < 100) {
                    }
                    break;
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m463N(int i) {
        int[] iArr = f171Q;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 168) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[8] = 0;
                    iArr[5] = 30;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 0;
                    if (iArr[5] <= 0) {
                        iArr[5] = 30;
                        iArr[14] = iArr[14] + 1;
                        iArr[15] = 1;
                        iArr[3] = iArr[17] - 8;
                        if (iArr[5] <= 0) {
                            iArr[5] = 30;
                            iArr[14] = iArr[14] + 1;
                            iArr[15] = 0;
                            iArr[3] = iArr[17];
                            if (iArr[5] <= 0) {
                                iArr[5] = 30;
                                iArr[14] = iArr[14] + 1;
                                iArr[15] = 2;
                                if (iArr[5] <= 0) {
                                    iArr[5] = 30;
                                    int i2 = iArr[8] + 1;
                                    iArr[8] = i2;
                                    if (i2 <= 3) {
                                        iArr[14] = 2;
                                        break;
                                    } else {
                                        iArr[14] = iArr[14] + 1;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    iArr[15] = 0;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 3:
                    iArr[15] = 1;
                    iArr[3] = iArr[17] - 8;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 4:
                    iArr[15] = 0;
                    iArr[3] = iArr[17];
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 5:
                    iArr[15] = 2;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 6:
                    iArr[15] = 3;
                    if (iArr[5] == 10) {
                        m391a("c4");
                        if (iArr[19] == 0) {
                            m413a(10, iArr[2], iArr[3], 345, 300, 0);
                        } else {
                            m413a(10, iArr[2], iArr[3], 15, 300, 0);
                        }
                    }
                    if (iArr[5] <= 0) {
                        iArr[8] = 0;
                        iArr[14] = 1;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[8] = 0;
                    iArr[5] = 30;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = 0;
                    if (iArr[5] <= 0) {
                    }
                    break;
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m460O(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 168) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 360;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (this.f318f >> 2) % 3;
                    iArr[10] = i2 * 20;
                    iArr[12] = iArr[12] + iArr[10];
                    iArr[13] = iArr[13] + iArr[11];
                    m379a(iArr, 16);
                    iArr[2] = iArr[12] / 100;
                    iArr[3] = iArr[13] / 100;
                    if (!m258b(iArr) || iArr[6] > 180) {
                        m189c(iArr);
                        iArr[6] = 0;
                    }
                    if (iArr[5] <= 0) {
                        iArr[15] = 1;
                        iArr[5] = 60;
                        iArr[14] = iArr[14] + 1;
                        m379a(iArr, 16);
                        if (iArr[5] < 12) {
                            iArr[15] = 3;
                        }
                        if (iArr[5] <= 0) {
                            m413a(9, iArr[2] + 16, iArr[3] - 16, 15, 240, 0);
                            m413a(9, iArr[2] - 16, iArr[3] - 16, 345, 240, 0);
                            iArr[5] = 50;
                            iArr[14] = iArr[14] + 1;
                            break;
                        }
                    }
                    break;
                case 2:
                    iArr[15] = (this.f318f >> 2) % 3;
                    iArr[10] = i2 * 20;
                    iArr[12] = iArr[12] + iArr[10];
                    iArr[13] = iArr[13] + iArr[11];
                    m379a(iArr, 16);
                    iArr[2] = iArr[12] / 100;
                    iArr[3] = iArr[13] / 100;
                    if (!m258b(iArr)) {
                        break;
                    }
                    m189c(iArr);
                    iArr[6] = 0;
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 3:
                    m379a(iArr, 16);
                    if (iArr[5] < 12) {
                    }
                    if (iArr[5] <= 0) {
                    }
                    break;
                case 4:
                    m379a(iArr, 16);
                    if (iArr[5] <= 0) {
                        iArr[14] = 1;
                        break;
                    }
                    break;
                default:
                    iArr[14] = 1;
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[5] = 360;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = (this.f318f >> 2) % 3;
                    iArr[10] = i2 * 20;
                    iArr[12] = iArr[12] + iArr[10];
                    iArr[13] = iArr[13] + iArr[11];
                    m379a(iArr, 16);
                    iArr[2] = iArr[12] / 100;
                    iArr[3] = iArr[13] / 100;
                    if (!m258b(iArr)) {
                    }
                    m189c(iArr);
                    iArr[6] = 0;
                    if (iArr[5] <= 0) {
                    }
                    break;
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m457P(int i) {
        int[] iArr = f171Q;
        if (m188c(iArr)) {
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
                if (m280b() - 160 >= iArr[2]) {
                    iArr[14] = iArr[14] + 1;
                    iArr[10] = 500;
                    iArr[11] = 400;
                    iArr[15] = 0;
                    iArr[5] = 94;
                    iArr[14] = iArr[14] + 1;
                    iArr[15] = this.f318f & 1;
                    iArr[10] = 400;
                    if (iArr[9] == 0 && m415a(iArr[2], iArr[3], 20, 20, 1)) {
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
                if (m280b() - 160 >= iArr[2]) {
                }
                break;
            case 3:
                iArr[10] = 500;
                iArr[11] = 400;
                iArr[15] = 0;
                iArr[5] = 94;
                iArr[14] = iArr[14] + 1;
                iArr[15] = this.f318f & 1;
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
                iArr[15] = this.f318f & 1;
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
                if (m280b() - 160 >= iArr[2]) {
                }
                break;
        }
        iArr[11] = iArr[11] + 20;
        if (iArr[11] > 400) {
            iArr[11] = 400;
        }
        iArr[12] = iArr[12] + iArr[10];
        iArr[13] = iArr[13] + iArr[11];
        if (iArr[11] > 0 && m128d(iArr[12] / 100, (iArr[13] / 100) + 12)) {
            iArr[9] = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                m128d(iArr[12] / 100, (iArr[13] / 100) + 12);
                iArr[13] = iArr[13] - 100;
            }
            if (iArr[13] < 0) {
                iArr[13] = 0;
            }
        }
        iArr[2] = iArr[12] / 100;
        iArr[3] = iArr[13] / 100;
        if (iArr[15] >= 0) {
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: Q */
    private void m454Q(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 168) && !m188c(iArr)) {
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
            iArr[15] = (this.f318f >> 2) % 3;
            iArr[10] = i2 * 25;
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            m257b(iArr, 24);
            if (m258b(iArr) || iArr[6] > 240) {
                m189c(iArr);
                iArr[6] = 0;
            }
            if (iArr[5] <= 0) {
                iArr[15] = 1;
                iArr[5] = 40;
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m451R(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        boolean z = iArr[4] != 2;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 240) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    iArr[5] = 1800;
                    iArr[9] = 0;
                    iArr[10] = z ? i2 * 20 : 0;
                    iArr[18] = 359;
                    iArr[11] = 0;
                    iArr[15] = z ? 0 : 1;
                    iArr[14] = iArr[14] + 1;
                    break;
                case 2:
                    break;
                default:
                    iArr[14] = 1;
                    iArr[5] = 1800;
                    iArr[9] = 0;
                    iArr[10] = z ? i2 * 20 : 0;
                    iArr[18] = 359;
                    iArr[11] = 0;
                    iArr[15] = z ? 0 : 1;
                    iArr[14] = iArr[14] + 1;
                    break;
            }
            if (z) {
                if ((iArr[9] & 15) == 15) {
                    iArr[10] = i2 * 25;
                } else {
                    iArr[10] = 0;
                }
            }
            if (iArr[5] <= 0) {
                iArr[5] = 1800;
            }
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            if (iArr[19] == 0) {
                int i3 = iArr[18] + 1;
                iArr[18] = i3;
                if (i3 > 359) {
                    iArr[18] = iArr[18] - 360;
                }
            } else {
                int i4 = iArr[18] - 1;
                iArr[18] = i4;
                if (i4 < 0) {
                    iArr[18] = iArr[18] + 360;
                }
            }
            if (m378a(iArr, 100, 50) && z) {
                iArr[15] = 3;
            }
            if ((iArr[9] & 1) == 0) {
                int i5 = iArr[18] % 360;
                int m429a = iArr[2] + ((m429a(i5) * 16) / 100);
                int m276b = iArr[3] + ((m276b(i5) * 16) / 100);
                if (m409a(m429a, m276b, 16, 16, false) != 0) {
                    m488F();
                }
                if (z && Math.abs(180 - i5) < 4 && m378a(iArr, 100, 50)) {
                    iArr[9] = iArr[9] | 1;
                    m413a(12, m429a, m276b, iArr[19] == 0 ? 270 : 90, 80, 0);
                }
            }
            if ((iArr[9] & 2) == 0) {
                int i6 = (iArr[18] + 90) % 360;
                int m429a2 = iArr[2] + ((m429a(i6) * 16) / 100);
                int m276b2 = iArr[3] + ((m276b(i6) * 16) / 100);
                if (m409a(m429a2, m276b2, 16, 16, false) != 0) {
                    m488F();
                }
                if (z && Math.abs(180 - i6) < 4 && m378a(iArr, 100, 50)) {
                    iArr[9] = iArr[9] | 2;
                    m413a(12, m429a2, m276b2, iArr[19] == 0 ? 270 : 90, 80, 0);
                }
            }
            if ((iArr[9] & 4) == 0) {
                int i7 = (iArr[18] + 180) % 360;
                int m429a3 = iArr[2] + ((m429a(i7) * 16) / 100);
                int m276b3 = iArr[3] + ((m276b(i7) * 16) / 100);
                if (m409a(m429a3, m276b3, 16, 16, false) != 0) {
                    m488F();
                }
                if (z && Math.abs(180 - i7) < 4 && m378a(iArr, 100, 50)) {
                    iArr[9] = iArr[9] | 4;
                    m413a(12, m429a3, m276b3, iArr[19] == 0 ? 270 : 90, 80, 0);
                }
            }
            if ((iArr[9] & 8) == 0) {
                int i8 = (iArr[18] + 270) % 360;
                int m429a4 = iArr[2] + ((m429a(i8) * 16) / 100);
                int m276b4 = iArr[3] + ((m276b(i8) * 16) / 100);
                if (m409a(m429a4, m276b4, 16, 16, false) != 0) {
                    m488F();
                }
                if (z && Math.abs(180 - i8) < 4 && m378a(iArr, 100, 50)) {
                    iArr[9] = iArr[9] | 8;
                    m413a(12, m429a4, m276b4, iArr[19] == 0 ? 270 : 90, 80, 0);
                }
            }
            m123d(iArr);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m449S(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if (m188c(iArr)) {
            return;
        }
        switch (iArr[14]) {
            case 1:
                iArr[15] = 0;
                if (m280b() <= iArr[2]) {
                    iArr[19] = 1;
                } else {
                    iArr[19] = 0;
                }
                if (iArr[3] + 40 <= m204c() && iArr[3] + 100 >= m204c() && Math.abs(iArr[2] - m280b()) < 100) {
                    iArr[9] = m204c() - 16;
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 2:
                iArr[15] = 1;
                iArr[3] = iArr[3] + 2;
                if (iArr[3] >= iArr[9]) {
                    iArr[3] = iArr[9];
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 3:
                iArr[15] = f246p[this.f318f & 3];
                iArr[2] = iArr[2] + i2;
                if (Math.abs(iArr[2] - m280b()) <= 80) {
                    if (iArr[2] - f179T[0] >= 0 && iArr[2] - f179T[0] <= 240 && iArr[3] - f179T[1] >= 0 && iArr[3] - f179T[1] <= 168) {
                        m391a("ab");
                        break;
                    }
                } else {
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
            case 4:
                iArr[15] = f246p[this.f318f & 3];
                iArr[2] = iArr[2] + i2;
                iArr[3] = iArr[3] - 2;
                if (m128d(iArr[2], iArr[3] - 16)) {
                    iArr[14] = 1;
                    break;
                }
                break;
            default:
                iArr[14] = 1;
                iArr[15] = 0;
                if (m280b() <= iArr[2]) {
                }
                if (iArr[3] + 40 <= m204c()) {
                    iArr[9] = m204c() - 16;
                    iArr[14] = iArr[14] + 1;
                    break;
                }
                break;
        }
        m123d(iArr);
    }

    /* renamed from: a */
    private boolean m379a(int[] iArr, int i) {
        int i2 = iArr[13];
        int i3 = i2;
        int i4 = (i2 / 100) + i;
        boolean z = false;
        if (i3 < 9999900) {
            i3 += 100;
        }
        if (m128d(iArr[12] / 100, i4)) {
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

    /* renamed from: T */
    private void m447T(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -8 : 8;
        if ((Math.abs(iArr[2] - m280b()) <= 240 || Math.abs(iArr[3] - m204c()) <= 240) && !m188c(iArr)) {
            switch (iArr[14]) {
                case 1:
                    if (m280b() > iArr[2]) {
                        iArr[19] = 1;
                    } else {
                        iArr[19] = 0;
                    }
                    iArr[15] = 0;
                    if (Math.abs(m280b() - iArr[2]) < 100 && Math.abs(m204c() - iArr[3]) < 80) {
                        iArr[10] = iArr[19] == 0 ? -50 : 50;
                        iArr[11] = -300;
                        iArr[14] = iArr[14] + 1;
                        break;
                    }
                    break;
                case 2:
                    iArr[11] = iArr[11] + 5;
                    if (iArr[11] > 0) {
                        iArr[5] = 10;
                        iArr[14] = iArr[14] + 1;
                        break;
                    }
                    break;
                case 3:
                    if (iArr[5] > 16) {
                        iArr[15] = 1;
                    } else if (iArr[5] > 8 || m128d(iArr[2] + i2, iArr[3])) {
                        iArr[15] = 2;
                    } else {
                        iArr[15] = 3 + ((this.f318f >> 1) & 1);
                    }
                    if (iArr[6] > 360) {
                        if (m280b() > iArr[2]) {
                            iArr[19] = 1;
                        } else {
                            iArr[19] = 0;
                        }
                    }
                    m379a(iArr, 16);
                    iArr[11] = iArr[11] + 5;
                    break;
                default:
                    iArr[10] = 0;
                    iArr[11] = 0;
                    iArr[15] = 0;
                    iArr[14] = 1;
                    break;
            }
            iArr[12] = iArr[12] + iArr[10];
            iArr[13] = iArr[13] + iArr[11];
            iArr[2] = iArr[12] / 100;
            iArr[3] = iArr[13] / 100;
            m123d(iArr);
        }
    }

    /* renamed from: U */
    private void m445U(int i) {
        int[] iArr = f171Q;
        if (m188c(iArr)) {
            return;
        }
        iArr[15] = this.f318f & 1;
        iArr[3] = iArr[17] - ((Math.abs(m276b(iArr[6] % 180)) * 268) / 100);
        m123d(iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: V */
    private void m443V(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        if (m188c(iArr)) {
            return;
        }
        switch (iArr[14]) {
            case 1:
                iArr[5] = 480;
                iArr[10] = i2 * 26;
                iArr[11] = 0;
                iArr[14] = iArr[14] + 1;
                break;
            case 2:
                break;
            default:
                iArr[14] = 1;
                iArr[5] = 480;
                iArr[10] = i2 * 26;
                iArr[11] = 0;
                iArr[14] = iArr[14] + 1;
                break;
        }
        iArr[10] = i2 * 26;
        iArr[15] = (this.f318f >> 1) & 3;
        if (iArr[5] <= 0) {
            iArr[19] = iArr[19] == 0 ? 1 : 0;
            iArr[5] = 480;
        }
        iArr[12] = iArr[12] + iArr[10];
        iArr[13] = iArr[13] + iArr[11];
        iArr[2] = iArr[12] / 100;
        iArr[3] = iArr[13] / 100;
        m123d(iArr);
    }

    /* renamed from: a */
    private void m403a(int i, int[][] iArr, int i2) {
        int i3;
        if (i2 < 0) {
            return;
        }
        int i4 = iArr[i2][0];
        int i5 = iArr[i2][1];
        int i6 = iArr[i2][2];
        int i7 = iArr[i2][3];
        int i8 = iArr[i2][4];
        switch (f171Q[19]) {
            case 1:
                i3 = f211b[4];
                break;
            case 2:
                i3 = f211b[6];
                break;
            case 3:
                i3 = f211b[2];
                break;
            default:
                i3 = 0;
                break;
        }
        m396a(f9a, this.GFX_GameArray[f171Q[1]], i4, i5, i6, i7, i3, f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + i8, 2);
    }

    /* renamed from: W */
    private void m441W(int i) {
        int i2 = 0;
        if (f171Q[4] == 255) {
            if (f171Q[14] < 60) {
                if ((this.f318f & 1) == 0) {
                    i2 = 24;
                }
            } else if (f171Q[14] < 200 && ((this.f318f >> 1) & 1) == 0) {
                i2 = 24;
            }
        }
        if (f171Q[4] != 255 || f171Q[13] == 1) {
            m396a(f9a, this.GFX_GameArray[23], i2, 80, 24, 24, 0, (f171Q[6] >> 8) - f179T[0], (f171Q[7] >> 8) - f179T[1], 2);
        }
        if (f171Q[5] == 1) {
            m396a(f9a, this.GFX_GameArray[23], 0, 56, 96, 24, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
        } else {
            m396a(f9a, this.GFX_GameArray[23], 0, 0, 96, 56, f211b[0 + ((f171Q[5] >> 1) * 4)], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
        }
    }

    /* renamed from: X */
    private void m439X(int i) {
        m403a(i, f42b[6], f171Q[15] % 6);
    }

    /* renamed from: Y */
    private void m437Y(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[19] == 0 ? -1 : 1;
        m403a(i, f247s, iArr[15] % 6);
        if (iArr[18] == 1) {
            m396a(f9a, this.GFX_GameArray[40], 0, 184, 16, 16, iArr[19] == 0 ? 0 : f211b[4], (iArr[2] - f179T[0]) + (i2 * 18), (iArr[3] - f179T[1]) + 28, 2);
        } else if (iArr[18] == 2) {
            m396a(f9a, this.GFX_GameArray[40], 16, 184, 16, 16, iArr[19] == 0 ? 0 : f211b[4], (iArr[2] - f179T[0]) + (i2 * 18), (iArr[3] - f179T[1]) + 28, 2);
        }
    }

    /* renamed from: Z */
    private void m435Z(int i) {
        m403a(i, f42b[8], f171Q[15] % 3);
    }

    /* renamed from: aa */
    private void m331aa(int i) {
        int[] iArr = f171Q;
        if (iArr[18] < 1) {
            return;
        }
        int i2 = f42b[29][2][0];
        int i3 = f42b[29][2][1];
        int i4 = f42b[29][2][2];
        int i5 = f42b[29][2][3];
        int i6 = iArr[18] == 3 ? iArr[5] >> 2 : 8 - ((iArr[5] - 30) >> 2);
        m396a(f9a, this.GFX_GameArray[49], i2, i3, i4, i5, iArr[17] == 1 ? f211b[4] : 0, (iArr[15] >> 8) - f179T[0], (iArr[16] >> 8) - f179T[1], 2);
        m396a(f9a, this.GFX_GameArray[49], i2, i3, i4, i5, iArr[14] == 1 ? f211b[4] : 0, (iArr[12] >> 8) - f179T[0], ((iArr[13] >> 8) - f179T[1]) - i6, 2);
        m396a(f9a, this.GFX_GameArray[49], i2, i3, i4, i5, iArr[11] == 1 ? f211b[4] : 0, (iArr[9] >> 8) - f179T[0], (iArr[10] >> 8) - f179T[1], 2);
        char c = iArr[18] > 3 ? (char) 1 : (char) 0;
        m396a(f9a, this.GFX_GameArray[49], f42b[29][c][0], f42b[29][c][1], f42b[29][c][2], f42b[29][c][3], iArr[8] == 1 ? f211b[4] : 0, (iArr[6] >> 8) - f179T[0], (((iArr[7] >> 8) - f179T[1]) + f42b[29][c][4]) - i6, 2);
    }

    /* renamed from: ab */
    private void m329ab(int i) {
        int i2;
        int[] iArr = f171Q;
        int i3 = iArr[15] % 5;
        short s = f248d[i3][0];
        short s2 = f248d[i3][1];
        short s3 = f248d[i3][2];
        short s4 = f248d[i3][3];
        if (iArr[18] == 0) {
            i2 = iArr[19] == 0 ? 0 : f211b[4];
        } else {
            i2 = iArr[19] == 0 ? f211b[6] : f211b[2];
        }
        m396a(f9a, this.GFX_GameArray[iArr[1]], s, s2, s3, s4, i2, iArr[2] - f179T[0], iArr[3] - f179T[1], 2);
        if (iArr[5] < 119) {
            int i4 = this.f318f & 1;
            m396a(f9a, this.GFX_GameArray[96], f258g[10 + i4][0], f258g[10 + i4][1], f258g[10 + i4][2], f258g[10 + i4][3], iArr[18] == 0 ? 0 : f211b[2], iArr[2] - f179T[0], (iArr[3] - f179T[1]) + (iArr[18] == 0 ? (-6) - (iArr[5] / 10) : 6 + (iArr[5] / 10)), 2);
        }
    }

    /* renamed from: ac */
    private void m327ac(int i) {
        m403a(i, f249t, f171Q[15] % 4);
    }

    /* renamed from: ad */
    private void m325ad(int i) {
        m403a(i, f42b[9], f171Q[15] % 4);
    }

    /* renamed from: ae */
    private void m323ae(int i) {
        m403a(i, f250u, f171Q[15] % 4);
    }

    /* renamed from: af */
    private void m321af(int i) {
        m403a(i, f251v, f171Q[15] % 3);
    }

    /* renamed from: k */
    private void m68k(int i, int i2, int i3) {
        char c = i3 == 0 ? (char) 6 : (char) 7;
        m396a(f9a, this.GFX_GameArray[96], f258g[c][0], f258g[c][1], f258g[c][2], f258g[c][3], 0, i - f179T[0], i2 - f179T[1], 2);
    }

    /* renamed from: ag */
    private void m319ag(int i) {
        int[] iArr = f171Q;
        int i2 = iArr[4] == 2 ? 0 : 1;
        if ((iArr[9] & 1) == 0) {
            int i3 = iArr[18] % 360;
            m68k(iArr[2] + ((m429a(i3) * 16) / 100), iArr[3] + ((m276b(i3) * 16) / 100), i2);
        }
        if ((iArr[9] & 2) == 0) {
            int i4 = iArr[18] + 90;
            m68k(iArr[2] + ((m429a(i4) * 16) / 100), iArr[3] + ((m276b(i4) * 16) / 100), i2);
        }
        if ((iArr[9] & 4) == 0) {
            int i5 = iArr[18] + 180;
            m68k(iArr[2] + ((m429a(i5) * 16) / 100), iArr[3] + ((m276b(i5) * 16) / 100), i2);
        }
        if ((iArr[9] & 8) == 0) {
            int i6 = iArr[18] + 270;
            m68k(iArr[2] + ((m429a(i6) * 16) / 100), iArr[3] + ((m276b(i6) * 16) / 100), i2);
        }
        m403a(i, f42b[37], iArr[15] % 4);
    }

    /* renamed from: ah */
    private void m317ah(int i) {
        m403a(i, f252w, f171Q[15] % 4);
    }

    /* renamed from: ai */
    private void m315ai(int i) {
        m403a(i, f42b[38], f171Q[15] % 5);
    }

    /* renamed from: aj */
    private void m313aj(int i) {
        m403a(i, f42b[10], f171Q[15] % 2);
    }

    /* renamed from: ak */
    private void m311ak(int i) {
        m403a(i, f42b[43], f171Q[15] % 4);
    }

    /* renamed from: a */
    private void m416a(int i, int i2, int i3, int i4, int i5) {
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
        m382a(iArr);
    }

    /* renamed from: aw */
    private void m288aw() {
        f90r = new int[50][20];
        for (int i = 0; i < 50; i++) {
            f90r[i][0] = 0;
        }
    }

    /* renamed from: a */
    private void m412a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i < 1) {
            return;
        }
        if (i >= 7 && i <= 13 && i2 - f179T[0] >= 0 && i2 - f179T[0] <= 240 && i3 - f179T[1] >= 0 && i3 - f179T[1] <= 168) {
            m391a("a2");
        }
        for (int i8 = 0; i8 < 50; i8++) {
            int[] iArr = f90r[i8];
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

    /* renamed from: a */
    private void m413a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 1) {
            return;
        }
        for (int i7 = 0; i7 < 50; i7++) {
            int[] iArr = f90r[i7];
            if (iArr[0] <= 0) {
                for (int i8 = 4; i8 < 20; i8++) {
                    iArr[i8] = 0;
                }
                iArr[0] = 1;
                iArr[1] = i;
                iArr[2] = i2 * 100;
                iArr[3] = i3 * 100;
                iArr[8] = i6;
                iArr[10] = (m429a(i4) * i5) / 100;
                iArr[11] = (m276b(i4) * i5) / 100;
                return;
            }
        }
    }

    /* renamed from: l */
    private void m62l(int i, int i2, int i3) {
        if (i3 <= 0) {
            return;
        }
        if (i3 > 32) {
            i3 = 32;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= (i3 > 16 ? 16 : i3)) {
                break;
            }
            int i5 = ((i4 >> 1) * 2250) + 1125;
            if ((i4 & 1) == 1) {
                i5 = (-i5) + 36000;
            }
            m413a(4, i, i2, i5 / 100, 256, 0);
            i4++;
        }
        if (i3 <= 16) {
            return;
        }
        int i6 = i3 - 16;
        int i7 = 0;
        while (true) {
            if (i7 >= (i6 > 16 ? 16 : i6)) {
                return;
            }
            int i8 = ((i7 >> 1) * 2250) + 1125;
            if ((i7 & 1) == 1) {
                i8 = (-i8) + 36000;
            }
            m413a(4, i, i2, i8 / 100, 128, 0);
            i7++;
        }
    }

    /* renamed from: m */
    private void m56m(int i, int i2, int i3) {
        int[] iArr = new int[24];
        i3 = (i3 < 0 || i3 > 5) ? 0 : 0;
        int i4 = 60;
        for (int i5 = 0; i5 < 24; i5++) {
            i4 += 2 + m200c(18);
            iArr[i5] = i4;
        }
        for (int i6 = 0; i6 < 24; i6++) {
            m412a(f244d[i3][m200c(2)], i + (((i6 % 8) * 8) - 32), i2, 0, (-350) + m200c(60), m200c(2), i4 - iArr[i6]);
        }
    }

    /* renamed from: n */
    private void m51n(int i, int i2, int i3) {
        if (i3 < 10) {
            m412a(6, i, i2, 0, 0, 0, 0);
        } else if (i3 < 50) {
            m412a(6, i, i2, 0, 0, 0, 1);
        } else if (i3 < 100) {
            m412a(6, i, i2, 0, 0, 0, 2);
        } else if (i3 < 200) {
            m412a(6, i, i2, 0, 0, 0, 3);
        } else if (i3 < 500) {
            m412a(6, i, i2, 0, 0, 0, 4);
        } else if (i3 < 1000) {
            m412a(6, i, i2, 0, 0, 0, 5);
        } else {
            m412a(6, i, i2, 0, 0, 0, 6);
        }
    }

    /* renamed from: g */
    private void m93g(int i, int i2) {
        m413a(13, i, i2, 30, 200, 0);
        m413a(13, i, i2, 30, 300, 0);
        m413a(13, i, i2, 330, 200, 0);
        m413a(13, i, i2, 330, 300, 0);
        m412a(1, i, i2, 0, 0, 0, 0);
    }

    /* renamed from: ax */
    private void m286ax() {
        for (int i = 0; i < 50; i++) {
            int[] iArr = f90r[i];
            if (iArr[0] > 0) {
                if (Math.abs((iArr[2] / 100) - m280b()) > 320 || ((!(this.f315c == 1 && iArr[1] == 4) && Math.abs((iArr[3] / 100) - m204c()) > 260) || iArr[6] > 600)) {
                    iArr[0] = 0;
                } else {
                    m124d(iArr);
                    if (iArr[5] > 0) {
                        iArr[5] = iArr[5] - 1;
                    }
                    iArr[6] = iArr[6] + 1;
                }
            }
        }
    }

    /* renamed from: d */
    private void m124d(int[] iArr) {
        switch (iArr[1]) {
            case 1:
                m97f(iArr);
                return;
            case 2:
                m97f(iArr);
                return;
            case 3:
                m105e(iArr);
                return;
            case 4:
                m90g(iArr);
                return;
            case 5:
                m84h(iArr);
                return;
            case 6:
                m78i(iArr);
                return;
            case 7:
                m72j(iArr);
                return;
            case 8:
                m66k(iArr);
                return;
            case 9:
                m60l(iArr);
                return;
            case 10:
                m55m(iArr);
                return;
            case 11:
                m45o(iArr);
                return;
            case 12:
                m40p(iArr);
                return;
            case 13:
                m50n(iArr);
                return;
            case 14:
                m35q(iArr);
                return;
            case 15:
                m30r(iArr);
                return;
            case 16:
                m26s(iArr);
                return;
            case 17:
                m22t(iArr);
                return;
            case 18:
                m18u(iArr);
                return;
            case 19:
                m14v(iArr);
                return;
            case 20:
                m10w(iArr);
                return;
            case 21:
                m6x(iArr);
                return;
            case 22:
                m3y(iArr);
                return;
            case 23:
                m3y(iArr);
                return;
            case 24:
                m3y(iArr);
                return;
            case 25:
                m3y(iArr);
                return;
            case 26:
                m3y(iArr);
                return;
            case 27:
                m0z(iArr);
                return;
            case 28:
                m465M(iArr);
                return;
            case 29:
                m465M(iArr);
                return;
            case 30:
                m465M(iArr);
                return;
            case 31:
                m465M(iArr);
                return;
            case 32:
                m465M(iArr);
                return;
            case 33:
                m465M(iArr);
                return;
            case 34:
                m465M(iArr);
                return;
            case 35:
                m459O(iArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: ay */
    private void m284ay() {
        for (int i = 0; i < 50; i++) {
            int[] iArr = f90r[i];
            if (iArr[0] > 0) {
                switch (iArr[1]) {
                    case 1:
                        m501A(iArr);
                        continue;
                    case 2:
                        m501A(iArr);
                        continue;
                    case 3:
                        m501A(iArr);
                        continue;
                    case 4:
                        m498B(iArr);
                        continue;
                    case 5:
                        m495C(iArr);
                        continue;
                    case 6:
                        m492D(iArr);
                        continue;
                    case 7:
                        m489E(iArr);
                        continue;
                    case 8:
                        m489E(iArr);
                        continue;
                    case 9:
                        m489E(iArr);
                        continue;
                    case 10:
                        m489E(iArr);
                        continue;
                    case 11:
                        m489E(iArr);
                        continue;
                    case 12:
                        m489E(iArr);
                        continue;
                    case 13:
                        m489E(iArr);
                        continue;
                    case 14:
                        m486F(iArr);
                        continue;
                    case 15:
                        m483G(iArr);
                        continue;
                    case 16:
                        m480H(iArr);
                        continue;
                    case 17:
                        m480H(iArr);
                        continue;
                    case 18:
                        m480H(iArr);
                        continue;
                    case 19:
                        m480H(iArr);
                        continue;
                    case 20:
                        m480H(iArr);
                        continue;
                    case 21:
                        m477I(iArr);
                        continue;
                    case 22:
                        m474J(iArr);
                        continue;
                    case 23:
                        m474J(iArr);
                        continue;
                    case 24:
                        m474J(iArr);
                        continue;
                    case 25:
                        m474J(iArr);
                        continue;
                    case 26:
                        m471K(iArr);
                        continue;
                    case 27:
                        m468L(iArr);
                        continue;
                    case 28:
                        m462N(iArr);
                        continue;
                    case 29:
                        m462N(iArr);
                        continue;
                    case 30:
                        m462N(iArr);
                        continue;
                    case 31:
                        m462N(iArr);
                        continue;
                    case 32:
                        m462N(iArr);
                        continue;
                    case 33:
                        m462N(iArr);
                        continue;
                    case 34:
                        m462N(iArr);
                        continue;
                }
            }
        }
    }

    /* renamed from: e */
    private void m105e(int[] iArr) {
        if (iArr[6] > 4 && iArr[6] < 20 && m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m488F();
        }
        if (iArr[6] > 24) {
            iArr[0] = 0;
        }
    }

    /* renamed from: f */
    private void m97f(int[] iArr) {
        if (iArr[6] > 24) {
            iArr[0] = 0;
        }
    }

    /* renamed from: g */
    private void m90g(int[] iArr) {
        int i;
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = this.f318f >> 1;
        int i2 = iArr[11];
        int i3 = iArr[2] / 100;
        int i4 = iArr[3] / 100;
        if (m409a(i3, i4, 12, 12, false) != 0) {
            m412a(5, i3, i4, 0, 0, 0, 0);
            f23al++;
            m391a("b5");
            iArr[0] = 0;
            return;
        }
        if (i2 > 0) {
            if (m128d(i3, i4 + 4)) {
                i4 = (i4 & (-16)) + (16 - Math.abs((int) f206i[((f185f[this.f70v] & 255) << 4) + (i3 & 15)]));
                i = -(i2 >> 1);
            } else {
                i = i2 + 6;
                if (i > 500) {
                    i = 500;
                }
            }
        } else if (m128d(i3, i4 - 4)) {
            for (int i5 = 0; i5 < 3; i5++) {
                i4++;
                if (!m128d(i3, i4 - 4)) {
                    break;
                }
            }
            i = -(i2 >> 1);
        } else {
            i = i2 + 6;
            if (i > 500) {
                i = 500;
            }
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 > 99999) {
            iArr[0] = 0;
        }
        iArr[3] = i4 * 100;
        iArr[11] = i;
        if (iArr[6] > 300) {
            iArr[0] = 0;
        }
    }

    /* renamed from: h */
    private void m84h(int[] iArr) {
        iArr[15] = iArr[6] / 8;
        if (iArr[15] > 3) {
            iArr[0] = 0;
        }
    }

    /* renamed from: i */
    private void m78i(int[] iArr) {
        iArr[3] = iArr[3] - 100;
        if (iArr[6] > 50) {
            iArr[0] = 0;
        }
    }

    /* renamed from: j */
    private void m72j(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = 2 + (this.f318f & 1);
    }

    /* renamed from: k */
    private void m66k(int[] iArr) {
        if (iArr[6] > 10) {
            if (m409a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                m488F();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
        }
        iArr[15] = 2 + (this.f318f & 1);
    }

    /* renamed from: l */
    private void m60l(int[] iArr) {
        if (iArr[6] > 5) {
            if (m409a(iArr[2] / 100, iArr[3] / 100, 10, 10, false) != 0) {
                m488F();
            }
            iArr[2] = iArr[2] + iArr[10];
            iArr[3] = iArr[3] + iArr[11];
            iArr[11] = iArr[11] + 10;
            if (iArr[11] > 600) {
                iArr[11] = 600;
            }
        }
        iArr[15] = 4 + (this.f318f & 1);
    }

    /* renamed from: m */
    private void m55m(int[] iArr) {
        int m425a;
        if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m488F();
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
        if (i4 > 0 && m128d(i5 / 100, (i6 / 100) + 5)) {
            do {
                m425a = m425a(i5 / 100, (i6 / 100) + 5);
                i6 -= 100;
            } while (m128d(i5 / 100, (i6 / 100) + 5));
            if (m425a > 270) {
                i3 = -Math.abs(i3);
            } else if (m425a > 15) {
                i3 = Math.abs(i3);
            }
            i4 = -i4;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 999900) {
            iArr[0] = 0;
        }
        iArr[15] = 8 + (this.f318f & 1);
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[10] = i3;
        iArr[11] = i4;
        if (iArr[6] > 300) {
            m412a(1, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
            iArr[0] = 0;
            if (i5 - f179T[0] < 0 || i5 - f179T[0] > 240 || i6 - f179T[1] < 0 || i6 - f179T[1] > 168) {
                return;
            }
            m391a("c4");
        }
    }

    /* renamed from: n */
    private void m50n(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 8, 8, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 10;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
        iArr[15] = 12 + (this.f318f & 1);
    }

    /* renamed from: o */
    private void m45o(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m488F();
        }
        iArr[15] = 6;
    }

    /* renamed from: p */
    private void m40p(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[15] = 7;
    }

    /* renamed from: q */
    private void m35q(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
            m488F();
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
        if (i4 > 0 && m128d(i5 / 100, (i6 / 100) + 4)) {
            do {
                i6 -= 100;
            } while (m128d(i5 / 100, (i6 / 100) + 4));
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

    /* renamed from: r */
    private void m30r(int[] iArr) {
        if (iArr[6] > 30) {
            iArr[0] = 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: s */
    private void m26s(int[] iArr) {
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
                    if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0) {
                        m488F();
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
                    if (m128d((iArr[2] / 100) + 15, iArr[3] / 100)) {
                        iArr[14] = 2;
                        return;
                    }
                    return;
                } else if (iArr[10] < 0) {
                    iArr[18] = 1;
                    if (m128d((iArr[2] / 100) - 15, iArr[3] / 100)) {
                        iArr[14] = 2;
                        return;
                    }
                    return;
                } else if (iArr[11] < 0) {
                    iArr[18] = 2;
                    return;
                } else if (iArr[11] > 0) {
                    iArr[18] = 0;
                    if (m128d(iArr[2] / 100, (iArr[3] / 100) + 16)) {
                        iArr[14] = 2;
                        return;
                    }
                    return;
                } else {
                    return;
                }
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
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m22t(int[] iArr) {
        if (m409a(iArr[2] / 100, (iArr[3] / 100) + 6, 10, 10, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                iArr[11] = iArr[11] + 4;
                if (iArr[11] > 300) {
                    iArr[11] = 300;
                }
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    return;
                }
                m412a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
                m412a(18, iArr[2] / 100, iArr[3] / 100, 0, 0, 1, 0);
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
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18u(int[] iArr) {
        if (m409a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        switch (iArr[14]) {
            case 1:
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                    iArr[3] = iArr[3] - 200;
                }
                if (iArr[6] % 24 == 0 && iArr[9] > 0) {
                    iArr[9] = iArr[9] - 1;
                    if (iArr[8] != 0) {
                        m412a(19, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 0);
                    } else if (iArr[8] == 1) {
                        m412a(19, iArr[2] / 100, iArr[3] / 100, 0, 0, 0, 999);
                    }
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
                        iArr[9] = 8;
                        break;
                    default:
                        iArr[5] = 100;
                        iArr[9] = 5;
                        break;
                }
                iArr[18] = 0;
                iArr[15] = 0;
                iArr[14] = 1;
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 14)) {
                }
                if (iArr[6] % 24 == 0) {
                    iArr[9] = iArr[9] - 1;
                    if (iArr[8] != 0) {
                    }
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
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m14v(int[] iArr) {
        if (m409a(iArr[2] / 100, (iArr[3] / 100) + 6, 12, 12, false) != 0) {
            m488F();
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
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10w(int[] iArr) {
        if (m409a(iArr[2] / 100, (iArr[3] / 100) + (iArr[18] == 0 ? 6 : -6), 10, 12, false) != 0) {
            m488F();
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
        iArr[15] = this.f318f & 1;
        int i = (iArr[9] / 100) % 180;
        iArr[3] = iArr[17] - (Math.abs(m429a(i)) * iArr[8]);
        if (i < 90) {
            iArr[18] = 2;
        } else {
            iArr[18] = 0;
        }
        if (iArr[9] >= 18000) {
            iArr[0] = 0;
        }
    }

    /* renamed from: x */
    private void m6x(int[] iArr) {
        if (m409a(iArr[2] / 100, (iArr[3] / 100) + 2, 10, 10, false) != 0) {
            m488F();
        }
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        if (m128d(iArr[2] / 100, iArr[3] / 100)) {
            iArr[0] = 0;
        }
    }

    /* renamed from: y */
    private void m3y(int[] iArr) {
        iArr[15] = iArr[8];
        iArr[2] = iArr[2] + iArr[10];
        iArr[3] = iArr[3] + iArr[11];
        iArr[11] = iArr[11] + 20;
        if (iArr[11] > 800) {
            iArr[11] = 800;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m0z(int[] iArr) {
        if (m409a(iArr[2] / 100, iArr[3] / 100, 12, 12, false) != 0 && iArr[14] == 4) {
            m488F();
        }
        if (iArr[14] <= 2) {
            iArr[15] = f253q[this.f318f & 3];
        } else if (iArr[14] <= 3) {
            iArr[15] = f254r[this.f318f % 20];
        } else {
            iArr[15] = f255s[this.f318f & 3];
        }
        switch (iArr[14]) {
            case 1:
                if (this.f318f % 4 == 0) {
                    m391a("b1");
                }
                iArr[10] = (iArr[8] - iArr[2]) / 20;
                iArr[11] = 0;
                iArr[15] = 1;
                iArr[5] = 30;
                iArr[14] = iArr[14] + 1;
                if (this.f318f % 4 == 0) {
                    m391a("b1");
                }
                if (iArr[2] > iArr[8]) {
                    iArr[2] = iArr[2] + iArr[10];
                    iArr[3] = iArr[3] + iArr[11];
                }
                if (iArr[5] > 0) {
                    return;
                }
                iArr[2] = iArr[8];
                iArr[5] = 90;
                iArr[14] = iArr[14] + 1;
                if (this.f318f % 4 == 0) {
                    m391a("b1");
                }
                if (iArr[5] <= 0) {
                    return;
                }
                iArr[10] = ((m280b() * 100) - iArr[2]) / 256;
                iArr[11] = (39200 - iArr[3]) / 256;
                iArr[5] = 150;
                iArr[14] = iArr[14] + 1;
                if (this.f318f % 4 == 0) {
                    m391a("b1");
                }
                iArr[2] = iArr[2] + iArr[10];
                iArr[3] = iArr[3] + iArr[11];
                if (iArr[5] <= 0) {
                    return;
                }
                iArr[0] = 0;
                return;
            case 2:
                if (this.f318f % 4 == 0) {
                }
                if (iArr[2] > iArr[8]) {
                }
                if (iArr[5] > 0) {
                }
                break;
            case 3:
                if (this.f318f % 4 == 0) {
                }
                if (iArr[5] <= 0) {
                }
                break;
            case 4:
                if (this.f318f % 4 == 0) {
                }
                iArr[2] = iArr[2] + iArr[10];
                iArr[3] = iArr[3] + iArr[11];
                if (iArr[5] <= 0) {
                }
                break;
            default:
                iArr[14] = 1;
                if (this.f318f % 4 == 0) {
                }
                iArr[10] = (iArr[8] - iArr[2]) / 20;
                iArr[11] = 0;
                iArr[15] = 1;
                iArr[5] = 30;
                iArr[14] = iArr[14] + 1;
                if (this.f318f % 4 == 0) {
                }
                if (iArr[2] > iArr[8]) {
                }
                if (iArr[5] > 0) {
                }
                break;
        }
    }

    /* renamed from: A */
    private void m501A(int[] iArr) {
        short s;
        short s2;
        short s3;
        short s4;
        int i = (iArr[6] / 4) % 5;
        if (iArr[1] == 2) {
            s = f257f[i][0];
            s2 = f257f[i][1];
            s3 = f257f[i][2];
            s4 = f257f[i][3];
        } else {
            s = f256e[i][0];
            s2 = f256e[i][1];
            s3 = f256e[i][2];
            s4 = f256e[i][3];
        }
        m396a(f9a, this.GFX_GameArray[97], s, s2, s3, s4, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: B */
    private void m498B(int[] iArr) {
        m396a(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f318f & 3], 16, 16, this.f326c[this.f318f & 3], (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
        if (this.f314b == 5 && this.f315c == 1) {
            m396a(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f318f & 3], 16, 16, this.f326c[this.f318f & 3], (iArr[2] / 100) - f179T[0], ((iArr[3] / 100) - f179T[1]) + 2048, 2);
            m396a(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f318f & 3], 16, 16, this.f326c[this.f318f & 3], (iArr[2] / 100) - f179T[0], ((iArr[3] / 100) - f179T[1]) - 2048, 2);
        }
    }

    /* renamed from: C */
    private void m495C(int[] iArr) {
        if (iArr[15] < 0 || iArr[15] > 3) {
            return;
        }
        m396a(f9a, this.GFX_GameArray[0], 16, iArr[15] * 16, 16, 16, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: D */
    private void m492D(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4 = iArr[8];
        int i5 = i4;
        if (i4 < 0) {
            return;
        }
        if (i5 > 6) {
            i5 = 6;
        }
        switch (i5) {
            case 1:
                i = 3;
                i2 = 0;
                i3 = 10;
                break;
            case 2:
                i = 3;
                i2 = 16;
                i3 = 10;
                break;
            case 3:
                i = 3;
                i2 = 0;
                i3 = 15;
                break;
            case 4:
                i = 3;
                i2 = 8;
                i3 = 15;
                break;
            case 5:
                i = 3;
                i2 = 16;
                i3 = 15;
                break;
            case 6:
                i = 3;
                i2 = 0;
                i3 = 20;
                break;
            default:
                i = 8;
                i2 = 0;
                i3 = 5;
                break;
        }
        m396a(f9a, this.f312b[10], i, i2, i3, 8, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: E */
    private void m489E(int[] iArr) {
        int i = iArr[15] % 14;
        m396a(f9a, this.GFX_GameArray[96], f258g[i][0], f258g[i][1], f258g[i][2], f258g[i][3], 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: F */
    private void m486F(int[] iArr) {
        char c = iArr[8] == 0 ? (char) 0 : (char) 2;
        m396a(f9a, this.GFX_GameArray[49], f42b[29][c][0], f42b[29][c][1], f42b[29][c][2], f42b[29][c][3], iArr[19] == 0 ? 0 : f211b[4], (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: G */
    private void m483G(int[] iArr) {
        int i;
        if (iArr[6] < 5) {
            i = 0;
        } else if (iArr[6] < 10) {
            i = 8;
        } else if (iArr[6] >= 15) {
            return;
        } else {
            i = 16;
        }
        if ((this.f318f & 1) == 0) {
            m396a(f9a, this.GFX_GameArray[41], i, 96, 8, 8, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
        }
    }

    /* renamed from: H */
    private void m480H(int[] iArr) {
        int i = iArr[15] % 5;
        int i2 = i;
        if (i == 0) {
            i2 += this.f318f & 3;
        }
        int i3 = i2 * 32;
        m396a(f9a, this.GFX_GameArray[101], 0, i3, 24, 32, m112e(iArr[18]), (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: I */
    private void m477I(int[] iArr) {
        int i = iArr[15] % 1;
        int i2 = i;
        if (i == 0) {
            i2 += (this.f318f >> 1) & 1;
        }
        m396a(f9a, this.GFX_GameArray[101], 0, i2 == 0 ? 160 : 168, 16, 8, iArr[10] < 0 ? 0 : f211b[4], (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: J */
    private void m474J(int[] iArr) {
        int i = iArr[15] & 3;
        m396a(f9a, this.GFX_GameArray[(iArr[1] == 23 ? (byte) 102 : iArr[1] == 24 ? (byte) 18 : (byte) 27) == 1 ? 1 : 0], f259h[i][0], f259h[i][1], 16, 16, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: K */
    private void m471K(int[] iArr) {
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
        m396a(f9a, this.GFX_GameArray[18], i, 0, 16, 16, 0, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* renamed from: L */
    private void m468L(int[] iArr) {
        int i;
        if (iArr[15] < 0) {
            return;
        }
        int i2 = iArr[15] % 5;
        short s = f260i[i2][0];
        short s2 = f260i[i2][1];
        short s3 = f260i[i2][2];
        short s4 = f260i[i2][3];
        switch (this.f319g & 3) {
            case 1:
                i = f211b[4];
                break;
            case 2:
                i = f211b[6];
                break;
            case 3:
                i = f211b[2];
                break;
            default:
                i = 0;
                break;
        }
        m396a(f9a, this.GFX_GameArray[145], s, s2, s3, s4, i, (iArr[2] / 100) - f179T[0], (iArr[3] / 100) - f179T[1], 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m465M(int[] iArr) {
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
                    if (m128d(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                        iArr[10] = this.f397j[i][0];
                        iArr[11] = this.f397j[i][1];
                        if (iArr[19] == 1) {
                            iArr[10] = -iArr[10];
                        }
                        iArr[6] = 0;
                        iArr[14] = iArr[14] + 1;
                        iArr[15] = 1;
                        if (m128d(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                            for (int i2 = 0; i2 < 3; i2++) {
                                iArr[3] = iArr[3] - 200;
                                if (!m128d(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                                    iArr[11] = this.f397j[i][1];
                                    break;
                                }
                            }
                            iArr[11] = this.f397j[i][1];
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
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 8)) {
                }
                break;
            case 4:
                iArr[15] = 1;
                if (m128d(iArr[2] / 100, (iArr[3] / 100) + 8)) {
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
            iArr[3] = 0;
        } else if (iArr[3] > 999900) {
            iArr[0] = 0;
        }
    }

    /* renamed from: N */
    private void m462N(int[] iArr) {
        int i;
        int i2 = iArr[15] % 3;
        int i3 = i2;
        if (i2 < 0) {
            return;
        }
        if (i3 == 1 && iArr[11] > 0) {
            i3++;
        }
        int i4 = (iArr[1] - 28) % 7;
        int i5 = i4;
        if (i4 < 0) {
            i5 = 0;
        }
        int i6 = i3 + (i5 * 3);
        short s = this.f398k[i6][0];
        short s2 = this.f398k[i6][1];
        short s3 = this.f398k[i6][2];
        short s4 = this.f398k[i6][3];
        short s5 = this.f398k[i6][4];
        switch (iArr[19]) {
            case 1:
                i = f211b[4];
                break;
            case 2:
                i = f211b[6];
                break;
            case 3:
                i = f211b[2];
                break;
            default:
                i = 0;
                break;
        }
        m396a(f9a, this.GFX_GameArray[100], s, s2, s3, s4, i, (iArr[2] / 100) - f179T[0], ((iArr[3] / 100) - f179T[1]) + s5, 2);
    }

    /* renamed from: O */
    private void m459O(int[] iArr) {
        if (iArr[6] > 0) {
            iArr[0] = 0;
        }
    }

    /* renamed from: az */
    private void m282az() {
        this.f91bm = this.f314b;
        this.f92bn = 0;
        this.f93bo = 0;
        this.f94bp = 0;
        this.f95bq = 0;
        this.f96br = 0;
        this.f97bs = 0;
        this.f98bt = 0;
        this.f100bv = 0;
        this.f99bu = 0;
        this.f102bx = 0;
        this.f101bw = 0;
        this.f105bA = 0;
        this.f106bB = 0;
        this.f107bC = 0;
        this.f108bD = 0;
        this.f109bE = 0;
        this.f110bF = 0;
        if (this.f314b != 3 && this.f314b != 4) {
            switch (f231n[0]) {
                case 1:
                    this.f111bG = 6;
                    break;
                case 2:
                    this.f111bG = 8;
                    break;
                default:
                    this.f111bG = 4;
                    break;
            }
        } else {
            switch (f231n[0]) {
                case 1:
                    this.f111bG = 5;
                    break;
                case 2:
                    this.f111bG = 6;
                    break;
                default:
                    this.f111bG = 4;
                    break;
            }
        }
        if (this.f314b < 5) {
            m493D(17);
            if (f38ay == 10) {
                m444V();
            }
        }
    }

    /* renamed from: al */
    private void m309al(int i) {
        try {
            int[] iArr = new int[25];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = 0;
            }
            m282az();
            if (i == 0) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[20]).append(",length=").append(f6N[21] - f6N[20]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[120] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[69]).append(",length=").append(f6N[70] - f6N[69]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[121] = f4a.getImage();
                iArr[1] = 120;
                this.f103by = 10752;
                this.f104bz = 808;
            } else if (i == 1) {
                m332aa();
                this.GFX_GameArray[120] = GFX_Load("boss.gif");
                iArr[1] = 125;
                this.f103by = 0;
                this.f104bz = 0;
                this.f99bu = 769600;
                this.f100bv = 147200;
            } else if (i == 2) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[20]).append(",length=").append(f6N[21] - f6N[20]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[120] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[30]).append(",length=").append(f6N[31] - f6N[30]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[131] = f4a.getImage();
                iArr[1] = 130;
                this.f103by = 6304;
                this.f104bz = 608;
                this.f99bu = (6640 - this.f103by) * 100;
                this.f100bv = (544 - this.f104bz) * 100;
            } else if (i == 3) {
                m332aa();
                this.GFX_GameArray[120] = GFX_Load("boss.gif");
                iArr[1] = 135;
                this.f103by = 8352;
                this.f104bz = 576;
                this.f99bu = 0;
                this.f100bv = 0;
                for (int i3 = 0; i3 < 3; i3++) {
                    f263l[i3][0] = 0;
                }
                int[][] m422a = m422a(23, 255);
                for (int i4 = 0; i4 < m422a.length; i4++) {
                    f11a[m422a[i4][20]] = true;
                    f12b[m422a[i4][20]] = false;
                    char c = m422a[i4][2] == 8352 ? (char) 1 : m422a[i4][2] == 8452 ? (char) 2 : (char) 0;
                    f263l[c][0] = (short) m422a[i4][23];
                    f263l[c][1] = (short) (m422a[i4][2] - this.f103by);
                    f263l[c][2] = (short) (c == 2 ? 20 : -20);
                    f263l[c][3] = 0;
                }
            } else if (i == 4) {
                m373aC();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[20]).append(",length=").append(f6N[21] - f6N[20]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[120] = f4a.getImage();
                iArr[1] = 140;
                this.f99bu = 0;
                this.f100bv = 0;
            } else if (i == 5) {
                for (int i5 = 0; i5 < 150; i5++) {
                    try {
                        this.GFX_GameArray[i5].dispose();
                    } catch (Exception unused) {
                    }
                    this.GFX_GameArray[i5] = null;
                }
                System.gc();
                m332aa();
                this.GFX_GameArray[0] = GFX_Load("ring.gif");
                this.GFX_GameArray[97] = GFX_Load("bakuhatu.gif");
                this.GFX_GameArray[84] = GFX_Load(f242f[60]);
                this.GFX_GameArray[7] = GFX_Load(f242f[61]);
                this.GFX_GameArray[120] = GFX_Load("boss.gif");
                this.GFX_GameArray[145] = GFX_Load("boss6.gif");
                this.GFX_GameArray[146] = GFX_Load("eggman.gif");
                this.GFX_GameArray[147] = GFX_Load("boss2.gif");
                iArr[1] = 145;
                this.f103by = 1272;
                this.f104bz = 120;
                this.f99bu = 0;
                this.f100bv = 0;
            }
            iArr[0] = 1;
            int i6 = f179T[0] + 256 + 46;
            iArr[16] = i6;
            iArr[2] = i6;
            int i7 = f179T[1] + 46;
            iArr[17] = i7;
            iArr[3] = i7;
            iArr[4] = 0;
            iArr[14] = 0;
            iArr[20] = f11a.length - 1;
            f11a[iArr[20]] = true;
            f12b[iArr[20]] = false;
            m382a(iArr);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: aA */
    private void m377aA() {
        f208V = true;
        m309al(this.f314b);
    }

    /* renamed from: aB */
    private void m375aB() {
        f209W = true;
        f208V = false;
        f207aA = 1;
        if (this.f314b != 5) {
            m438Y();
        }
    }

    /* renamed from: e */
    private boolean m104e(int[] iArr) {
        iArr[2] = ((this.f99bu + this.f101bw) / 100) + this.f103by;
        iArr[3] = ((this.f100bv + this.f102bx) / 100) + this.f104bz;
        if (this.f107bC > 0) {
            this.f107bC--;
        }
        if (this.f110bF > 0) {
            int i = this.f110bF - 1;
            this.f110bF = i;
            if (i == 0) {
                this.f109bE = 0;
            }
        }
        if (this.f108bD > 0) {
            this.f108bD--;
            return true;
        }
        if (this.f105bA > 0) {
            this.f105bA--;
        }
        this.f106bB++;
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
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m28s() {
        int i = this.f104bz + ((this.f100bv + this.f102bx) / 100);
        switch (this.f92bn) {
            case 100:
                this.f93bo = 3;
                this.f105bA = 120;
                this.f92bn++;
                if (this.f97bs > 0) {
                    this.f97bs--;
                }
                if (this.f105bA <= 0) {
                    return false;
                }
                this.f93bo = 4;
                this.f105bA = 80;
                this.f92bn++;
                this.f93bo = 4;
                this.f100bv += 200;
                if (i >= f261ac[this.f314b]) {
                    return false;
                }
                this.f105bA = 40;
                this.f92bn++;
                if (this.f105bA <= 0) {
                    return false;
                }
                m375aB();
                this.f105bA = 24;
                this.f92bn++;
                this.f100bv -= 80;
                if (this.f105bA <= 0) {
                    return false;
                }
                this.f105bA = 40;
                this.f92bn++;
                if (this.f105bA <= 0) {
                    return false;
                }
                this.f92bn++;
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 100;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                    return false;
                }
                this.f105bA = 120;
                this.f92bn++;
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 500;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                    return false;
                }
                this.f92bn++;
                this.f93bo = -1;
                return true;
            case 101:
                if (this.f97bs > 0) {
                }
                if (this.f105bA <= 0) {
                }
                break;
            case 102:
                this.f93bo = 4;
                this.f100bv += 200;
                if (i >= f261ac[this.f314b]) {
                }
                break;
            case 103:
                if (this.f105bA <= 0) {
                }
                break;
            case 104:
                this.f100bv -= 80;
                if (this.f105bA <= 0) {
                }
                break;
            case 105:
                if (this.f105bA <= 0) {
                }
                break;
            case 106:
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 100;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                }
                break;
            case 107:
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 500;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                }
                break;
            case 108:
                this.f93bo = -1;
                return true;
            default:
                return false;
        }
    }

    /* renamed from: P */
    private void m456P(int[] iArr) {
        iArr[2] = this.f103by + ((this.f99bu + this.f101bw) / 100);
        iArr[3] = this.f104bz + ((this.f100bv + this.f102bx) / 100);
    }

    /* renamed from: e */
    private void m107e(int i, int i2, int i3, int i4) {
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, i, i2, i, i2, i3, i4);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (i2 - i4) << 8;
                m81i(-1);
            } else if (m411a == 1) {
                f190Y[0] = ((i - i3) - 12) << 8;
                f190Y[10] = 0;
            } else if (m411a == 2) {
                f190Y[0] = (((i + i3) + 12) + 1) << 8;
                f190Y[10] = 0;
            } else if (m411a == 3) {
                f190Y[1] = ((((i2 + i4) + 12) + 12) + 1) << 8;
            }
        }
        if (!f33D || m411a == 0) {
            return;
        }
        f33D = false;
    }

    /* renamed from: t */
    private boolean m24t() {
        if (this.f92bn >= 50) {
            return false;
        }
        if (!(f196L && f192H) && f243bh <= 0) {
            int i = ((this.f99bu + this.f101bw) / 100) + this.f103by;
            int i2 = (((this.f100bv + this.f102bx) / 100) + this.f104bz) - 16;
            int m280b = i - m280b();
            int m204c = i2 - (m204c() - 16);
            if ((m280b * m280b) + (m204c * m204c) < 1024) {
                if (f198N) {
                    f243bh = 1;
                    this.f310a = 2;
                    m318ah();
                    return true;
                }
                if (f18ag == 0) {
                    m488F();
                }
                f243bh = 1;
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: u */
    private boolean m20u() {
        if (!f198N || this.f107bC > 0 || this.f92bn >= 100) {
            return false;
        }
        int m280b = m280b();
        int m204c = m204c() - 16;
        int i = (this.f99bu / 100) + this.f103by;
        int i2 = (this.f100bv / 100) + this.f104bz;
        if (((i - 32) - 8) - 6 > m280b || m280b > i + 32 + 8 + 6 || (i2 - 32) - (-8) > m204c || m204c > (i2 + 32) - 8) {
            return false;
        }
        this.f310a = 2;
        m318ah();
        return true;
    }

    /* renamed from: o */
    private void m46o(int i, int i2, int i3) {
        int m280b = m280b();
        int i4 = i2 >= m204c() - 16 ? i <= m280b ? 45 : 315 : i <= m280b ? 135 : 225;
        f190Y[3] = m429a(i4) * 8;
        f190Y[5] = m276b(i4) * 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x053f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0259 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0476 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0505 A[RETURN] */
    /* renamed from: am */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m307am(int i) {
        int i2;
        int i3;
        int[] iArr = f171Q;
        this.f101bw = 0;
        this.f102bx = m429a(this.f96br / 100) * 8;
        m104e(iArr);
        if (m24t()) {
            m46o(iArr[2], iArr[3], 12);
            m391a("ac");
            if (this.f107bC == 0 && this.f92bn < 100) {
                this.f310a = 2;
                m318ah();
                int i4 = this.f111bG - 1;
                this.f111bG = i4;
                if (i4 <= 0) {
                    this.f92bn = 100;
                    return;
                }
                this.f109bE = 3;
                this.f110bF = 60;
                this.f107bC = 60;
            }
        }
        if (this.f92bn >= 4 && this.f92bn < 100) {
            int i5 = this.f95bq / 100;
            while (true) {
                i3 = i5;
                if (i3 >= 0) {
                    break;
                }
                i5 = i3 + 360;
            }
            int m429a = 180 + ((m429a(i3) * 90) / 100);
            if (m419a(this.f103by + ((this.f99bu + this.f101bw) / 100) + ((m429a(m429a) * this.f97bs) / 100) + this.f400s[15][4], this.f104bz + ((this.f100bv + this.f102bx) / 100) + ((m276b(m429a) * this.f97bs) / 100) + this.f400s[15][5], 28)) {
                m488F();
                this.f109bE = 1;
                this.f110bF = 60;
            }
        }
        switch (this.f92bn) {
            case 1:
                this.f99bu = 10000;
                this.f100bv = -12000;
                this.f97bs = -32;
                this.f98bt = -100;
                this.f95bq = 0;
                this.f96br = 0;
                this.f105bA = 80;
                this.f92bn++;
                this.f93bo = 0;
                this.f100bv += 80;
                if (this.f100bv < 0) {
                    return;
                }
                this.f100bv = 0;
                this.f105bA = 100;
                this.f92bn++;
                this.f93bo = 2;
                this.f99bu -= 100;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f92bn++;
                this.f93bo = 1;
                i2 = this.f97bs + 1;
                this.f97bs = i2;
                if (i2 >= 96) {
                    return;
                }
                this.f105bA = 32;
                this.f92bn++;
                this.f93bo = 2;
                this.f99bu -= 50;
                this.f95bq += this.f98bt;
                this.f96br += 100;
                if (this.f99bu <= -3200) {
                    return;
                }
                this.f99bu = -3200;
                this.f92bn = 6;
                return;
            case 2:
                this.f93bo = 0;
                this.f100bv += 80;
                if (this.f100bv < 0) {
                }
                break;
            case 3:
                this.f93bo = 2;
                this.f99bu -= 100;
                if (this.f105bA <= 0) {
                }
                break;
            case 4:
                this.f93bo = 1;
                i2 = this.f97bs + 1;
                this.f97bs = i2;
                if (i2 >= 96) {
                }
                break;
            case 5:
                this.f93bo = 2;
                this.f99bu -= 50;
                this.f95bq += this.f98bt;
                this.f96br += 100;
                if (this.f99bu <= -3200) {
                }
                break;
            case 6:
                this.f93bo = 2;
                this.f99bu -= 100;
                this.f95bq += this.f98bt;
                this.f96br += 100;
                if (this.f99bu > -3200) {
                    return;
                }
                this.f99bu = -3200;
                this.f92bn++;
                this.f93bo = 0;
                this.f94bp = 1;
                this.f96br += 100;
                if (this.f98bt >= 0) {
                    this.f95bq += this.f98bt;
                    if (this.f95bq < -9000) {
                        this.f98bt = -this.f98bt;
                        this.f95bq = -9000;
                        return;
                    }
                    return;
                }
                this.f95bq += this.f98bt;
                if (this.f95bq < 9000) {
                    return;
                }
                this.f95bq = 9000;
                this.f98bt = -this.f98bt;
                this.f105bA = 64;
                this.f92bn++;
                this.f93bo = 2;
                this.f99bu += 100;
                this.f95bq += this.f98bt;
                this.f96br += 100;
                if (this.f99bu >= 3200 && this.f105bA <= 0) {
                    this.f99bu = 3200;
                    this.f92bn++;
                    this.f93bo = 0;
                    this.f94bp = 0;
                    this.f96br += 100;
                    if (this.f98bt > 0) {
                        this.f95bq += this.f98bt;
                        if (this.f95bq > 9000) {
                            this.f98bt = -this.f98bt;
                            this.f95bq = 9000;
                            return;
                        }
                        return;
                    }
                    this.f95bq += this.f98bt;
                    if (this.f95bq > -9000) {
                        return;
                    }
                    this.f95bq = -9000;
                    this.f98bt = -this.f98bt;
                    this.f105bA = 64;
                    this.f92bn = 6;
                    return;
                }
                return;
            case 7:
                this.f93bo = 0;
                this.f94bp = 1;
                this.f96br += 100;
                if (this.f98bt >= 0) {
                }
                break;
            case 8:
                this.f93bo = 2;
                this.f99bu += 100;
                this.f95bq += this.f98bt;
                this.f96br += 100;
                if (this.f99bu >= 3200) {
                    this.f99bu = 3200;
                    this.f92bn++;
                    this.f93bo = 0;
                    this.f94bp = 0;
                    this.f96br += 100;
                    if (this.f98bt > 0) {
                    }
                    break;
                } else {
                    return;
                }
                break;
            case 9:
                this.f93bo = 0;
                this.f94bp = 0;
                this.f96br += 100;
                if (this.f98bt > 0) {
                }
                break;
            case 100:
                this.f93bo = 3;
                this.f105bA = 40;
                this.f92bn++;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f105bA = 180;
                this.f92bn++;
                if (this.f97bs > 0) {
                    this.f97bs--;
                }
                if (this.f105bA <= 0) {
                    return;
                }
                this.f93bo = 4;
                this.f105bA = 80;
                this.f92bn++;
                this.f93bo = 4;
                this.f100bv += 200;
                m456P(iArr);
                if (iArr[3] >= f261ac[this.f314b]) {
                    return;
                }
                this.f105bA = 40;
                this.f92bn++;
                if (this.f105bA <= 0) {
                    return;
                }
                m375aB();
                this.f105bA = 16;
                this.f92bn++;
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 200;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f105bA = 120;
                this.f92bn++;
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 600;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f92bn++;
                this.f93bo = -1;
                f171Q[0] = 0;
                return;
            case 101:
                if (this.f105bA <= 0) {
                }
                break;
            case 102:
                if (this.f97bs > 0) {
                }
                if (this.f105bA <= 0) {
                }
                break;
            case 103:
                this.f93bo = 4;
                this.f100bv += 200;
                m456P(iArr);
                if (iArr[3] >= f261ac[this.f314b]) {
                }
                break;
            case 104:
                if (this.f105bA <= 0) {
                }
                break;
            case 105:
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 200;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                }
                break;
            case 106:
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 600;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                }
                break;
            case 107:
                this.f93bo = -1;
                f171Q[0] = 0;
                return;
            default:
                this.f92bn = 1;
                this.f99bu = 10000;
                this.f100bv = -12000;
                this.f97bs = -32;
                this.f98bt = -100;
                this.f95bq = 0;
                this.f96br = 0;
                this.f105bA = 80;
                this.f92bn++;
                this.f93bo = 0;
                this.f100bv += 80;
                if (this.f100bv < 0) {
                }
                break;
        }
    }

    /* renamed from: b */
    private boolean m268b(int i, int i2, int i3, int i4) {
        if (Math.abs(i - this.f99bu) <= i3) {
            this.f99bu = i;
        } else if (i > this.f99bu) {
            this.f99bu += i3;
        } else {
            this.f99bu -= i3;
        }
        if (Math.abs(i2 - this.f100bv) <= i4) {
            this.f100bv = i2;
        } else if (i2 > this.f100bv) {
            this.f100bv += i4;
        } else {
            this.f100bv -= i4;
        }
        return Math.abs(this.f99bu - i) < 200 && Math.abs(this.f100bv - i2) < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0321 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: an */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m305an(int i) {
        int[] iArr = f171Q;
        m104e(iArr);
        this.f96br += 200;
        this.f101bw = 0;
        this.f102bx = m429a(this.f96br / 100) * 8;
        m456P(iArr);
        int m280b = iArr[2] - m280b();
        int m204c = iArr[3] - (m204c() - 16);
        int i2 = (m280b * m280b) + (m204c * m204c);
        if (m24t()) {
            m46o(iArr[2], iArr[3], 8);
            m391a("ac");
            if (this.f107bC == 0 && this.f92bn < 100) {
                this.f310a = 2;
                m318ah();
                this.f109bE = 3;
                this.f110bF = 60;
                this.f107bC = 60;
            }
        }
        switch (this.f92bn) {
            case 1:
                this.f109bE = 0;
                this.f93bo = 2;
                this.f99bu = f262x[0][0];
                this.f100bv = f262x[0][1];
                this.f95bq = 0;
                this.f96br = 0;
                this.f92bn++;
                if (i2 <= 4096) {
                    return;
                }
                this.f92bn++;
                if (m268b(f262x[1][0], f262x[1][1], 50, 100)) {
                    return;
                }
                this.f92bn++;
                return;
            case 3:
                if (m268b(f262x[1][0], f262x[1][1], 50, 100)) {
                }
                break;
            case 4:
                if (i2 <= 4096 || iArr[3] >= m204c() - 16) {
                    this.f92bn++;
                    if (m268b(f262x[2][0], f262x[2][1], 50, 80)) {
                        return;
                    }
                    this.f92bn++;
                    return;
                }
                return;
            case 5:
                if (m268b(f262x[2][0], f262x[2][1], 50, 80)) {
                }
                break;
            case 6:
                if (i2 <= 6400 || iArr[3] >= m204c() - 16) {
                    this.f92bn++;
                    if (m268b(f262x[3][0], f262x[3][1], 50, 80)) {
                        return;
                    }
                    this.f92bn++;
                    return;
                }
                return;
            case 7:
                if (m268b(f262x[3][0], f262x[3][1], 50, 80)) {
                }
                break;
            case 8:
                if (i2 <= 6400 || iArr[3] >= m204c() - 16) {
                    this.f92bn++;
                    if (m268b(f262x[4][0], f262x[4][1], 80, 80)) {
                        return;
                    }
                    this.f92bn++;
                    return;
                }
                return;
            case 9:
                if (m268b(f262x[4][0], f262x[4][1], 80, 80)) {
                }
                break;
            case 10:
                if (i2 <= 6400 || iArr[2] <= m280b()) {
                    this.f105bA = 40;
                    this.f92bn++;
                    if (this.f105bA <= 0) {
                        return;
                    }
                    this.f92bn = 100;
                    return;
                }
                return;
            case 11:
                if (this.f105bA <= 0) {
                }
                break;
            case 100:
                if (this.f105bA > 0) {
                    return;
                }
                f209W = true;
                f208V = false;
                f207aA = 1;
                if (this.f314b != 5) {
                    m438Y();
                }
                m375aB();
                this.f105bA = 16;
                this.f92bn++;
                this.f416x = true;
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 100;
                this.f100bv -= 30;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f105bA = 180;
                this.f92bn++;
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 300;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                    return;
                }
                this.f92bn++;
                this.f93bo = -1;
                f171Q[0] = 0;
                return;
            case 101:
                this.f93bo = 5;
                this.f94bp = 1;
                this.f99bu += 100;
                this.f100bv -= 30;
                if (this.f105bA <= 0) {
                }
                break;
            case 102:
                this.f93bo = 6;
                this.f94bp = 1;
                this.f99bu += 300;
                this.f100bv -= 50;
                if (this.f105bA <= 0) {
                }
                break;
            case 103:
                this.f93bo = -1;
                f171Q[0] = 0;
                return;
            default:
                this.f92bn = 1;
                this.f109bE = 0;
                this.f93bo = 2;
                this.f99bu = f262x[0][0];
                this.f100bv = f262x[0][1];
                this.f95bq = 0;
                this.f96br = 0;
                this.f92bn++;
                if (i2 <= 4096) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0312 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0362 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0384 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0385  */
    /* renamed from: ao */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m303ao(int i) {
        int[] iArr = f171Q;
        if (!m104e(f171Q)) {
            this.f96br += 100;
            this.f101bw = 0;
            this.f102bx = m429a(this.f96br / 100) * 10;
            if (this.f92bn <= 99) {
                if (m24t() && this.f92bn > 3) {
                    m46o(iArr[2], iArr[3], 12);
                    m391a("ac");
                    if (this.f107bC == 0 && this.f92bn < 100) {
                        this.f310a = 2;
                        m318ah();
                        int i2 = this.f111bG - 1;
                        this.f111bG = i2;
                        if (i2 <= 0) {
                            f112bH = 0;
                            this.f92bn = 100;
                            return;
                        }
                        this.f109bE = 3;
                        this.f110bF = 60;
                        this.f107bC = 60;
                        this.f108bD = 20;
                    }
                }
                if (f112bH > 0) {
                    int i3 = f112bH - 1;
                    f112bH = i3;
                    if (i3 == 0) {
                        f112bH = 150 + m200c(150);
                        m412a(16, (this.f103by + m200c(40)) - 20, this.f104bz + 130, 0, -300, 0, 1);
                    }
                }
                switch (this.f92bn) {
                    case 1:
                        this.f109bE = 0;
                        this.f93bo = 2;
                        this.f99bu = 31200;
                        this.f100bv = 4800;
                        this.f95bq = 0;
                        this.f96br = 0;
                        f112bH = 0;
                        this.f105bA = 30;
                        this.f92bn++;
                        if (this.f105bA > 0) {
                            return;
                        }
                        this.f92bn++;
                        this.f93bo = 2;
                        this.f99bu -= 150;
                        this.f100bv -= 20;
                        if (this.f99bu > 10400 && this.f105bA <= 0) {
                            this.f99bu = 10400;
                            this.f93bo = 0;
                            this.f109bE = 1;
                            this.f110bF = 60;
                            this.f105bA = 60;
                            f112bH = 120;
                            this.f92bn++;
                            return;
                        }
                        return;
                    case 2:
                        if (this.f105bA > 0) {
                        }
                        break;
                    case 3:
                        this.f93bo = 2;
                        this.f99bu -= 150;
                        this.f100bv -= 20;
                        if (this.f99bu > 10400) {
                            return;
                        }
                        this.f99bu = 10400;
                        this.f93bo = 0;
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 60;
                        f112bH = 120;
                        this.f92bn++;
                        return;
                    case 4:
                        this.f93bo = 2;
                        this.f94bp = 0;
                        this.f92bn++;
                        this.f93bo = 2;
                        this.f94bp = 0;
                        this.f99bu -= 150;
                        this.f100bv -= 12;
                        if (this.f99bu <= -10400) {
                            return;
                        }
                        this.f99bu = -10400;
                        this.f92bn++;
                        this.f100bv += 50;
                        if (this.f100bv > 1200) {
                            return;
                        }
                        this.f100bv = 1200;
                        this.f92bn++;
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 48;
                        this.f92bn++;
                        if (this.f105bA == 8) {
                            m412a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f105bA > 0) {
                            return;
                        }
                        m456P(iArr);
                        this.f92bn++;
                        return;
                    case 5:
                        this.f93bo = 2;
                        this.f94bp = 0;
                        this.f99bu -= 150;
                        this.f100bv -= 12;
                        if (this.f99bu <= -10400) {
                        }
                        break;
                    case 6:
                        this.f100bv += 50;
                        if (this.f100bv > 1200) {
                        }
                        break;
                    case 7:
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 48;
                        this.f92bn++;
                        if (this.f105bA == 8) {
                        }
                        if (this.f105bA > 0) {
                        }
                        break;
                    case 8:
                        if (this.f105bA == 8) {
                        }
                        if (this.f105bA > 0) {
                        }
                        break;
                    case 9:
                        this.f93bo = 2;
                        this.f94bp = 1;
                        this.f92bn++;
                        this.f93bo = 2;
                        this.f94bp = 1;
                        this.f99bu += 150;
                        this.f100bv -= 12;
                        if (this.f99bu >= 10400) {
                            return;
                        }
                        this.f99bu = 10400;
                        this.f92bn++;
                        this.f100bv += 50;
                        if (this.f100bv > 1200) {
                            return;
                        }
                        this.f100bv = 1200;
                        this.f92bn++;
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 48;
                        this.f92bn++;
                        if (this.f105bA == 8) {
                            m412a(17, iArr[2], iArr[3] + 16, 0, 0, 0, 0);
                        }
                        if (this.f105bA > 0) {
                            return;
                        }
                        m456P(iArr);
                        this.f92bn++;
                        this.f100bv -= 100;
                        if (this.f100bv <= 0) {
                            return;
                        }
                        this.f100bv = 0;
                        this.f92bn = 4;
                        return;
                    case 10:
                        this.f93bo = 2;
                        this.f94bp = 1;
                        this.f99bu += 150;
                        this.f100bv -= 12;
                        if (this.f99bu >= 10400) {
                        }
                        break;
                    case 11:
                        this.f100bv += 50;
                        if (this.f100bv > 1200) {
                        }
                        break;
                    case 12:
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 48;
                        this.f92bn++;
                        if (this.f105bA == 8) {
                        }
                        if (this.f105bA > 0) {
                        }
                        break;
                    case 13:
                        if (this.f105bA == 8) {
                        }
                        if (this.f105bA > 0) {
                        }
                        break;
                    case 14:
                        this.f100bv -= 100;
                        if (this.f100bv <= 0) {
                        }
                        break;
                    default:
                        this.f92bn = 1;
                        this.f109bE = 0;
                        this.f93bo = 2;
                        this.f99bu = 31200;
                        this.f100bv = 4800;
                        this.f95bq = 0;
                        this.f96br = 0;
                        f112bH = 0;
                        this.f105bA = 30;
                        this.f92bn++;
                        if (this.f105bA > 0) {
                        }
                        break;
                }
            } else if (m28s()) {
                iArr[0] = 0;
            }
        }
    }

    /* renamed from: ap */
    private void m301ap(int i) {
        short s = f263l[i % 3][0];
        int[] iArr = new int[25];
        for (int i2 = 0; i2 < 25; i2++) {
            iArr[i2] = f164m[s][i2];
        }
        if (iArr[13] == 0) {
            iArr[6] = (((this.f99bu + this.f101bw) / 100) + this.f103by) << 8;
            iArr[7] = (((((this.f100bv + this.f102bx) / 100) + this.f104bz) - 16) + 32) << 8;
            iArr[10] = 0;
            iArr[11] = 70;
            iArr[12] = 0;
            iArr[13] = 1;
            iArr[14] = 240;
            m380a(iArr, (int) s);
        }
    }

    /* renamed from: c */
    private boolean m198c(int i) {
        if (this.f107bC > 0 || this.f92bn >= 100) {
            return false;
        }
        short s = f263l[i % 3][0];
        int[] iArr = new int[25];
        for (int i2 = 0; i2 < 25; i2++) {
            iArr[i2] = f164m[s][i2];
        }
        if (iArr[13] != 1 || iArr[14] >= 210) {
            return false;
        }
        int i3 = iArr[6] >> 8;
        int i4 = iArr[7] >> 8;
        int i5 = ((this.f99bu + this.f101bw) / 100) + this.f103by;
        int i6 = (((this.f100bv + this.f102bx) / 100) + this.f104bz) - 16;
        if (i5 - 24 > i3 || i3 > i5 + 24 || i6 - 24 > i4 || i4 > i6 + 24) {
            return false;
        }
        iArr[13] = 0;
        iArr[14] = 0;
        m380a(iArr, (int) s);
        m412a(1, i3, i4, 0, 0, 0, 0);
        m391a("c4");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0314 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0341 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0381 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0382  */
    /* renamed from: aq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m299aq(int i) {
        int[] iArr = f171Q;
        m104e(iArr);
        if (this.f92bn <= 99) {
            this.f96br += 400;
            this.f101bw = 0;
            this.f102bx = m429a(this.f96br / 100) * 8;
            int i2 = f263l[1][1] * 100;
            int i3 = f263l[2][1] * 100;
            m456P(iArr);
            if (this.f92bn > 3 && this.f100bv > -400) {
                this.f100bv -= 240;
            }
            boolean z = (m198c(1)) || m198c(2);
            if ((m24t() || z) && this.f92bn > 3) {
                if (!z) {
                    m46o(iArr[2], iArr[3], 12);
                }
                m391a("ac");
                if (this.f107bC == 0 && this.f92bn < 100) {
                    this.f310a = 2;
                    m318ah();
                    int i4 = this.f111bG - 1;
                    this.f111bG = i4;
                    if (i4 <= 0) {
                        this.f92bn = 100;
                        return;
                    }
                    this.f109bE = 3;
                    this.f110bF = 60;
                    this.f107bC = 60;
                }
            }
            switch (this.f92bn) {
                case 1:
                    this.f109bE = 1;
                    this.f93bo = 2;
                    this.f99bu = 21600;
                    this.f100bv = 9000;
                    this.f95bq = 0;
                    this.f96br = 0;
                    this.f105bA = 60;
                    this.f92bn++;
                    if (this.f105bA > 0) {
                        return;
                    }
                    this.f92bn++;
                    this.f99bu -= 80;
                    if (this.f99bu <= (i3 - 3500) + 10) {
                        return;
                    }
                    this.f92bn++;
                    this.f94bp = 0;
                    this.f93bo = 2;
                    this.f99bu -= 80;
                    if (this.f99bu <= i3 - 3500) {
                        return;
                    }
                    this.f99bu = i3 - 3500;
                    this.f93bo = 0;
                    this.f109bE = 1;
                    this.f110bF = 50;
                    this.f105bA = 50;
                    this.f92bn++;
                    if (this.f105bA == 10) {
                        m301ap(2);
                    }
                    if (this.f105bA <= 0) {
                        return;
                    }
                    this.f92bn++;
                    this.f93bo = 2;
                    this.f94bp = 0;
                    this.f99bu -= 80;
                    if (this.f99bu <= i2 - 3500) {
                        return;
                    }
                    this.f99bu = i2 - 3500;
                    this.f93bo = 0;
                    this.f109bE = 1;
                    this.f110bF = 50;
                    this.f105bA = 50;
                    this.f92bn++;
                    return;
                case 2:
                    if (this.f105bA > 0) {
                    }
                    break;
                case 3:
                    this.f99bu -= 80;
                    if (this.f99bu <= (i3 - 3500) + 10) {
                    }
                    break;
                case 4:
                    this.f94bp = 0;
                    this.f93bo = 2;
                    this.f99bu -= 80;
                    if (this.f99bu <= i3 - 3500) {
                    }
                    break;
                case 5:
                    if (this.f105bA == 10) {
                    }
                    if (this.f105bA <= 0) {
                    }
                    break;
                case 6:
                    this.f93bo = 2;
                    this.f94bp = 0;
                    this.f99bu -= 80;
                    if (this.f99bu <= i2 - 3500) {
                    }
                    break;
                case 7:
                    if (this.f105bA == 10) {
                        m301ap(1);
                    }
                    if (this.f105bA > 0) {
                        return;
                    }
                    this.f92bn++;
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f92bn++;
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu < i2 + 3500) {
                        return;
                    }
                    this.f99bu = i2 + 3500;
                    this.f93bo = 0;
                    this.f109bE = 1;
                    this.f110bF = 50;
                    this.f105bA = 50;
                    this.f92bn++;
                    if (this.f105bA == 10) {
                        m301ap(1);
                    }
                    if (this.f105bA <= 0) {
                        return;
                    }
                    this.f92bn++;
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu >= i3 + 3500) {
                        return;
                    }
                    this.f99bu = i3 + 3500;
                    this.f93bo = 0;
                    this.f109bE = 1;
                    this.f110bF = 50;
                    this.f105bA = 50;
                    this.f92bn++;
                    if (this.f105bA == 10) {
                        m301ap(2);
                    }
                    if (this.f105bA <= 0) {
                        return;
                    }
                    this.f92bn++;
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu >= 16000) {
                        return;
                    }
                    this.f99bu = 16000;
                    this.f93bo = 0;
                    this.f109bE = 1;
                    this.f110bF = 50;
                    this.f105bA = 50;
                    this.f92bn++;
                    this.f94bp = 0;
                    this.f92bn = 4;
                    return;
                case 8:
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f92bn++;
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu < i2 + 3500) {
                    }
                    break;
                case 9:
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu < i2 + 3500) {
                    }
                    break;
                case 10:
                    if (this.f105bA == 10) {
                    }
                    if (this.f105bA <= 0) {
                    }
                    break;
                case 11:
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu >= i3 + 3500) {
                    }
                    break;
                case 12:
                    if (this.f105bA == 10) {
                    }
                    if (this.f105bA <= 0) {
                    }
                    break;
                case 13:
                    this.f94bp = 1;
                    this.f93bo = 2;
                    this.f99bu += 80;
                    if (this.f99bu >= 16000) {
                    }
                    break;
                case 14:
                    this.f94bp = 0;
                    this.f92bn = 4;
                    return;
                default:
                    this.f92bn = 1;
                    this.f109bE = 1;
                    this.f93bo = 2;
                    this.f99bu = 21600;
                    this.f100bv = 9000;
                    this.f95bq = 0;
                    this.f96br = 0;
                    this.f105bA = 60;
                    this.f92bn++;
                    if (this.f105bA > 0) {
                    }
                    break;
            }
        } else if (m28s()) {
            iArr[0] = 0;
        }
    }

    /* renamed from: aC */
    private void m373aC() {
        this.f103by = 11424;
        this.f104bz = 1232;
        for (int i = 0; i < 10; i++) {
            f264m[i][0] = (short) ((-160) + (32 * i) + 16);
            f264m[i][1] = 176;
            f264m[i][2] = 0;
            f264m[i][3] = 0;
        }
    }

    /* renamed from: aD */
    private void m371aD() {
        for (int i = 0; i < 10; i++) {
            if (f264m[i][3] != 0) {
                m413a(23, (int) f264m[i][0], (int) f264m[i][1], 330, 300, 0);
                m413a(23, (int) f264m[i][0], (int) f264m[i][1], 30, 300, 1);
                m413a(23, (int) f264m[i][0], (int) f264m[i][1], 300, 300, 2);
                m413a(23, (int) f264m[i][0], (int) f264m[i][1], 60, 300, 3);
                f264m[i][2] = 1;
            }
        }
    }

    /* renamed from: ar */
    private void m297ar(int i) {
        int i2;
        int i3;
        if (f171Q[14] == 0) {
            m373aC();
            int[] iArr = f171Q;
            iArr[14] = iArr[14] + 1;
        }
        for (int i4 = 0; i4 < 10; i4++) {
            if (f264m[i4][2] == 0) {
                if (f264m[i4][3] == 0) {
                    i2 = this.f103by + f264m[i4][0];
                    i3 = this.f104bz + f264m[i4][1];
                } else {
                    i2 = this.f103by + ((this.f99bu + this.f101bw) / 100);
                    i3 = this.f104bz + ((this.f100bv + this.f102bx) / 100) + 24;
                }
                m107e(i2, i3, 16, 16);
            }
        }
    }

    /* renamed from: e */
    private void m106e(boolean z) {
        short s;
        short s2;
        for (int i = 0; i < 10; i++) {
            if (f264m[i][2] == 0) {
                if (f264m[i][3] == 0) {
                    s = f264m[i][0];
                    s2 = f264m[i][1];
                } else {
                    s = (this.f99bu + this.f101bw) / 100;
                    s2 = ((this.f100bv + this.f102bx) / 100) + 24;
                }
                if (!z || Math.abs(f264m[i][0] - ((this.f99bu + this.f101bw) / 100)) <= 32) {
                    m396a(f9a, this.GFX_GameArray[102], 0, 0, 32, 32, 0, (s + this.f103by) - f179T[0], (s2 + this.f104bz) - f179T[1], 2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0431  */
    /* renamed from: as */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m295as(int i) {
        int[] iArr = f171Q;
        boolean z = false;
        m104e(iArr);
        if (this.f92bn > 99) {
            if (m28s()) {
                iArr[0] = 0;
                return;
            }
            return;
        }
        this.f96br += 200;
        this.f101bw = 0;
        this.f102bx = m429a(this.f96br / 100) * 12;
        int m280b = (m280b() - (this.f103by - 160)) / 32;
        int i2 = (this.f99bu + 16000) / 3200;
        int abs = Math.abs(((this.f99bu / 100) + 160) - ((i2 * 32) + 16));
        if (m280b == i2 && abs < 3 && f265bI == 0) {
            z = true;
        }
        if (f265bI > 0) {
            f265bI--;
        }
        if (this.f97bs > 16 && m409a(iArr[2], ((iArr[3] + 8) - 32) + this.f97bs, 14, 32, false) != 0) {
            m488F();
        }
        if (m24t() && this.f92bn > 3 && this.f107bC == 0) {
            m46o(iArr[2], iArr[3], 10);
            m391a("ac");
            if (this.f107bC == 0 && this.f92bn < 100) {
                this.f310a = 2;
                m318ah();
                int i3 = this.f111bG - 1;
                this.f111bG = i3;
                if (i3 <= 0) {
                    m371aD();
                    this.f92bn = 100;
                    return;
                }
                this.f109bE = 3;
                this.f110bF = 60;
                this.f107bC = 60;
            }
        }
        switch (this.f92bn) {
            case 1:
                this.f109bE = 0;
                this.f93bo = 2;
                this.f99bu = 19200;
                this.f100bv = 10000;
                this.f95bq = 0;
                this.f96br = 0;
                this.f105bA = 50;
                f265bI = 90;
                z = false;
                this.f92bn++;
                if (this.f105bA <= 0) {
                    this.f92bn++;
                    this.f93bo = 2;
                    this.f100bv -= 20;
                    this.f99bu -= 100;
                    if (this.f99bu <= 6400) {
                        this.f99bu = 6400;
                        this.f93bo = 0;
                        this.f109bE = 1;
                        this.f110bF = 60;
                        this.f105bA = 60;
                        this.f92bn++;
                        if (!z) {
                            this.f92bn = 10;
                            break;
                        } else {
                            this.f93bo = 2;
                            this.f94bp = 0;
                            this.f99bu -= 70;
                            if (this.f99bu <= -12000) {
                                this.f99bu = -12000;
                                this.f92bn++;
                                if (!z) {
                                    this.f92bn = 10;
                                    break;
                                } else {
                                    this.f93bo = 2;
                                    this.f94bp = 1;
                                    this.f99bu += 70;
                                    if (this.f99bu >= 12000) {
                                        this.f99bu = 12000;
                                        this.f92bn++;
                                        this.f92bn = 4;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (this.f105bA <= 0) {
                }
                break;
            case 3:
                this.f93bo = 2;
                this.f100bv -= 20;
                this.f99bu -= 100;
                if (this.f99bu <= 6400) {
                }
                break;
            case 4:
                if (!z) {
                }
                break;
            case 5:
                if (!z) {
                }
                break;
            case 6:
                this.f92bn = 4;
                break;
            case 7:
            case 8:
            case 9:
            default:
                this.f92bn = 1;
                this.f109bE = 0;
                this.f93bo = 2;
                this.f99bu = 19200;
                this.f100bv = 10000;
                this.f95bq = 0;
                this.f96br = 0;
                this.f105bA = 50;
                f265bI = 90;
                z = false;
                this.f92bn++;
                if (this.f105bA <= 0) {
                }
                break;
            case 10:
                this.f93bo = 0;
                this.f109bE = 1;
                this.f92bn++;
                this.f100bv += 120;
                if (this.f97bs < 32) {
                    this.f97bs++;
                }
                if (this.f100bv >= 15400) {
                    this.f100bv = 15400;
                    this.f105bA = 48;
                    f264m[i2][3] = 1;
                    this.f92bn++;
                    this.f101bw = 0;
                    this.f102bx = m200c(400) - 200;
                    if (this.f105bA <= 0) {
                        this.f101bw = 0;
                        this.f102bx = 0;
                        this.f92bn++;
                        this.f100bv -= 300;
                        if (this.f100bv <= 2400) {
                            this.f100bv = 2400;
                            this.f105bA = 50;
                            this.f92bn++;
                            this.f101bw = 0;
                            this.f102bx = m200c(400) - 200;
                            if (this.f97bs > 0) {
                                this.f97bs--;
                            }
                            if (this.f105bA <= 0) {
                                if (f264m[i2][2] == 0) {
                                    m391a("b9");
                                    this.f101bw = 0;
                                    this.f102bx = 0;
                                    m413a(23, iArr[2], iArr[3] + 24, 330, 300, 0);
                                    m413a(23, iArr[2], iArr[3] + 24, 30, 300, 1);
                                    m413a(23, iArr[2], iArr[3] + 24, 300, 300, 2);
                                    m413a(23, iArr[2], iArr[3] + 24, 60, 300, 3);
                                    f264m[i2][2] = 1;
                                }
                                this.f105bA = 30;
                                this.f92bn++;
                                if (this.f105bA <= 0) {
                                    f265bI = 120;
                                    this.f92bn = this.f94bp == 0 ? 4 : 5;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                this.f100bv += 120;
                if (this.f97bs < 32) {
                }
                if (this.f100bv >= 15400) {
                }
                break;
            case 12:
                this.f101bw = 0;
                this.f102bx = m200c(400) - 200;
                if (this.f105bA <= 0) {
                }
                break;
            case 13:
                this.f100bv -= 300;
                if (this.f100bv <= 2400) {
                }
                break;
            case 14:
                this.f101bw = 0;
                this.f102bx = m200c(400) - 200;
                if (this.f97bs > 0) {
                }
                if (this.f105bA <= 0) {
                }
                break;
            case 15:
                if (this.f105bA <= 0) {
                }
                break;
        }
        m456P(iArr);
        if (this.f92bn == 4 || this.f92bn == 5) {
            if (Math.abs(iArr[2] - m280b()) < 64) {
                if (this.f100bv > 1000) {
                    this.f100bv -= 160;
                }
            } else if (this.f100bv < 8000) {
                this.f100bv += 140;
            }
        }
    }

    /* renamed from: a */
    private void m404a(int i, int[] iArr, int i2, int i3) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2] > -99999 ? iArr[2] : iArr[0];
        int i7 = i2 >> 1;
        int i8 = i3 >> 1;
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, i4, i5, i6, iArr[3] > -99999 ? iArr[3] : iArr[1], i7, i8);
        if (m411a == 0) {
            f190Y[1] = (i5 - i8) << 8;
            m129d(i4, i7);
            m81i(i);
        } else if (m411a == 1) {
            f190Y[0] = ((i4 - i7) - 12) << 8;
            f190Y[10] = 0;
            if (f166c[4]) {
                m5y();
            }
        } else if (m411a == 2) {
            f190Y[0] = (((i4 + i7) + 12) + 1) << 8;
            f190Y[10] = 0;
            if (f166c[3]) {
                m5y();
            }
        } else if (m411a >= 3) {
            f190Y[1] = ((((i5 + i8) + 12) + 12) + 1) << 8;
            m310al();
        }
        if (f33D && f35av == i && m411a != 0) {
            f33D = false;
        }
        iArr[2] = iArr[0];
        iArr[3] = iArr[1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012a A[LOOP:0: B:18:0x0125->B:20:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05eb  */
    /* renamed from: at */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m293at(int i) {
        int i2;
        int i3;
        int[] iArr = f171Q;
        if (this.f92bn > 200) {
            return;
        }
        if ((f190Y[1] >> 8) > 192) {
            f190Y[1] = 49152;
        }
        if ((f190Y[0] >> 8) >= 1952) {
            if (this.f93bo != 11) {
                f201Q = true;
            }
            f190Y[0] = 499968;
        }
        m104e(iArr);
        switch (this.f92bn) {
            case 1:
                this.f109bE = 0;
                this.f93bo = 0;
                this.f99bu = 0;
                this.f100bv = 0;
                this.f101bw = 0;
                this.f102bx = 0;
                for (i3 = 0; i3 < 4; i3++) {
                    f266ad[i3] = 0;
                    f267y[i3][2] = -99999;
                    f267y[i3][3] = -99999;
                    f268ae[i3] = 0;
                }
                f114bK = 2;
                f113bJ = 3;
                f115bL = 1;
                f116bM = 0;
                m405a(0, true, 0);
                this.f92bn++;
                if (m280b() >= 1328) {
                    this.f92bn++;
                    break;
                }
                break;
            case 2:
                if (m280b() >= 1328) {
                }
                break;
            case 3:
                int[] iArr2 = f266ad;
                int i4 = f113bJ;
                iArr2[i4] = iArr2[i4] + 50;
                int[] iArr3 = f266ad;
                int i5 = f114bK;
                iArr3[i5] = iArr3[i5] + 50;
                if (f266ad[f113bJ] >= 2000) {
                    m391a("b9");
                    this.f92bn++;
                    break;
                }
                break;
            case 4:
                int[] iArr4 = f266ad;
                int i6 = f113bJ;
                iArr4[i6] = iArr4[i6] + 180;
                int[] iArr5 = f266ad;
                int i7 = f114bK;
                iArr5[i7] = iArr5[i7] + 180;
                if (f266ad[f113bJ] >= 16000) {
                    f266ad[f113bJ] = 16000;
                    f266ad[f114bK] = 16000;
                    this.f92bn++;
                    break;
                }
                break;
            case 5:
                int[] iArr6 = f266ad;
                int i8 = f113bJ;
                iArr6[i8] = iArr6[i8] - 180;
                int[] iArr7 = f266ad;
                int i9 = f114bK;
                iArr7[i9] = iArr7[i9] - 180;
                if (f266ad[f113bJ] <= 0) {
                    f266ad[f113bJ] = 0;
                    f266ad[f114bK] = 0;
                    this.f110bF = 0;
                    this.f109bE = 0;
                    this.f107bC = 0;
                    this.f92bn++;
                    f115bL = 2;
                    m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by + 64) + 32) - m200c(8)) + 42) * 100);
                    m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by + 32) + m200c(46)) - 23) + 42) * 100);
                    m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by - 32) + m200c(46)) - 23) + 42) * 100);
                    m412a(27, 1415, 60, 0, 0, 0, (((this.f103by - 64) - 32) + m200c(24) + 42) * 100);
                    this.f105bA = 300;
                    this.f92bn++;
                    if (this.f105bA <= 0) {
                        f113bJ = 1 + m200c(3);
                        f114bK = ((f113bJ + 1) + m200c(3)) % 4;
                        f115bL = 1;
                        this.f92bn = 3;
                        this.f93bo = -1;
                        break;
                    }
                }
                break;
            case 6:
                f115bL = 2;
                m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by + 64) + 32) - m200c(8)) + 42) * 100);
                m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by + 32) + m200c(46)) - 23) + 42) * 100);
                m412a(27, 1415, 60, 0, 0, 0, ((((this.f103by - 32) + m200c(46)) - 23) + 42) * 100);
                m412a(27, 1415, 60, 0, 0, 0, (((this.f103by - 64) - 32) + m200c(24) + 42) * 100);
                this.f105bA = 300;
                this.f92bn++;
                if (this.f105bA <= 0) {
                }
                break;
            case 7:
                if (this.f105bA <= 0) {
                }
                break;
            case 50:
                f115bL = 2;
                f116bM = 1;
                this.f109bE = 2;
                this.f110bF = 999;
                this.f107bC = 999;
                f205U = true;
                this.f92bn++;
                int[] iArr8 = f266ad;
                int i10 = f113bJ;
                iArr8[i10] = iArr8[i10] - 50;
                int[] iArr9 = f266ad;
                int i11 = f114bK;
                iArr9[i11] = iArr9[i11] - 50;
                if (f266ad[f113bJ] <= 0) {
                    f266ad[f113bJ] = 0;
                    f266ad[f114bK] = 0;
                    this.f110bF = 0;
                    this.f109bE = 0;
                    this.f107bC = 0;
                    this.f105bA = 60;
                    f116bM = 2;
                    f115bL = 3;
                    this.f92bn++;
                    if (this.f105bA <= 0) {
                        this.f92bn = 100;
                        break;
                    }
                }
                break;
            case 51:
                int[] iArr82 = f266ad;
                int i102 = f113bJ;
                iArr82[i102] = iArr82[i102] - 50;
                int[] iArr92 = f266ad;
                int i112 = f114bK;
                iArr92[i112] = iArr92[i112] - 50;
                if (f266ad[f113bJ] <= 0) {
                }
                break;
            case 52:
                if (this.f105bA <= 0) {
                }
                break;
            case 100:
                f115bL = 0;
                f116bM = 0;
                this.f101bw = 0;
                this.f102bx = 0;
                this.f99bu = (1472 - this.f103by) * 100;
                this.f100bv = (168 - this.f104bz) * 100;
                m456P(iArr);
                this.f93bo = 7;
                f205U = true;
                m375aB();
                this.f92bn++;
                if (iArr[2] - m280b() < 150) {
                    this.f99bu += 50;
                }
                if (iArr[2] - m280b() < 110) {
                    this.f99bu += 400;
                }
                if (iArr[2] - m280b() < 70) {
                    this.f99bu += 500;
                }
                if (iArr[2] >= 1696) {
                    iArr[2] = 1696;
                    iArr[10] = 200;
                    iArr[11] = -300;
                    this.f92bn++;
                    this.f99bu += iArr[10];
                    this.f100bv += iArr[11];
                    i2 = iArr[11] + 12;
                    iArr[11] = i2;
                    if (i2 > 600) {
                        iArr[11] = 600;
                    }
                    if (iArr[2] >= 1760) {
                        this.f99bu = (1760 - this.f103by) * 100;
                        this.f100bv = (168 - this.f104bz) * 100;
                        iArr[10] = 0;
                        iArr[11] = -50;
                        this.f93bo = 8;
                        this.f105bA = 60;
                        this.f92bn++;
                        this.f99bu += iArr[10];
                        this.f100bv += iArr[11];
                        if (this.f105bA <= 0) {
                            iArr[10] = 25;
                            iArr[11] = -100;
                            this.f93bo = 9;
                            this.f105bA = 30;
                            this.f92bn++;
                            this.f99bu += iArr[10];
                            this.f100bv += iArr[11];
                            if (this.f105bA <= 0) {
                                iArr[10] = 200;
                                iArr[11] = 0;
                                this.f93bo = 10;
                                this.f92bn++;
                                this.f99bu += iArr[10];
                                this.f100bv += iArr[11];
                                m456P(iArr);
                                if (iArr[2] <= 2168) {
                                    this.f105bA = 120;
                                    this.f92bn = 107;
                                    break;
                                } else {
                                    int m280b = (((this.f99bu + this.f101bw) / 100) + this.f103by) - m280b();
                                    int m204c = (((this.f100bv + this.f102bx) / 100) + this.f104bz) - (m204c() - 16);
                                    if ((m280b * m280b) + (m204c * m204c) < 1444 && f198N) {
                                        m46o(iArr[2], iArr[3], 6);
                                        m391a("ac");
                                        iArr[10] = 100;
                                        iArr[11] = 40;
                                        this.f93bo = 11;
                                        this.f92bn++;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 101:
                if (iArr[2] - m280b() < 150) {
                }
                if (iArr[2] - m280b() < 110) {
                }
                if (iArr[2] - m280b() < 70) {
                }
                if (iArr[2] >= 1696) {
                }
                break;
            case 102:
                this.f99bu += iArr[10];
                this.f100bv += iArr[11];
                i2 = iArr[11] + 12;
                iArr[11] = i2;
                if (i2 > 600) {
                }
                if (iArr[2] >= 1760) {
                }
                break;
            case 103:
                this.f99bu += iArr[10];
                this.f100bv += iArr[11];
                if (this.f105bA <= 0) {
                }
                break;
            case 104:
                this.f99bu += iArr[10];
                this.f100bv += iArr[11];
                if (this.f105bA <= 0) {
                }
                break;
            case 105:
                this.f99bu += iArr[10];
                this.f100bv += iArr[11];
                m456P(iArr);
                if (iArr[2] <= 2168) {
                }
                break;
            case 106:
                this.f99bu += iArr[10];
                this.f100bv += iArr[11];
                m456P(iArr);
                if (iArr[2] >= 2168) {
                    this.f105bA = 120;
                    this.f92bn++;
                    break;
                }
                break;
            case 107:
                this.f372D = 120;
                m386a(true);
                if (this.f105bA == 10) {
                    this.f391aa = true;
                    this.f54c = true;
                    this.f55l = 10;
                    m446U();
                }
                if (this.f105bA <= 0) {
                    m405a(0, true, 8);
                    this.f92bn = 200;
                    break;
                }
                break;
            case 200:
                this.f372D = 0;
                f203S = false;
                m452R();
                m405a(0, true, 8);
                this.f391aa = true;
                this.f54c = true;
                this.f55l = 10;
                iArr[0] = 0;
                this.f92bn++;
                return;
            case 201:
                this.f391aa = true;
                this.f54c = true;
                this.f55l = 10;
                m405a(0, true, 8);
                break;
            default:
                this.f92bn = 1;
                this.f109bE = 0;
                this.f93bo = 0;
                this.f99bu = 0;
                this.f100bv = 0;
                this.f101bw = 0;
                this.f102bx = 0;
                while (i3 < 4) {
                }
                f114bK = 2;
                f113bJ = 3;
                f115bL = 1;
                f116bM = 0;
                m405a(0, true, 0);
                this.f92bn++;
                if (m280b() >= 1328) {
                }
                break;
        }
        m416a(48, 1216, 16, 0, 0);
        m416a(48, 1248, 16, 0, 0);
        m416a(48, 1344, 16, 0, 0);
        m416a(48, 1376, 16, 0, 0);
        if (this.f92bn < 100) {
            switch (f113bJ) {
                case 0:
                    this.f99bu = f269n[0][0] * 100;
                    this.f100bv = ((f269n[0][1] * 100) + f266ad[0]) - 800;
                    break;
                case 1:
                    this.f99bu = f269n[1][0] * 100;
                    this.f100bv = ((f269n[1][1] * 100) + f266ad[1]) - 800;
                    break;
                case 2:
                    this.f99bu = f269n[2][0] * 100;
                    this.f100bv = ((f269n[2][1] * 100) - f266ad[2]) + 1600;
                    break;
                case 3:
                    this.f99bu = f269n[3][0] * 100;
                    this.f100bv = ((f269n[3][1] * 100) - f266ad[3]) + 1600;
                    break;
                default:
                    this.f100bv = 0;
                    this.f99bu = 0;
                    break;
            }
        }
        f267y[0][0] = f269n[0][0] + this.f103by;
        f267y[0][1] = ((f269n[0][1] + this.f104bz) - 8) + (f266ad[0] / 100);
        m404a(46592, f267y[0], 64, 160);
        f267y[1][0] = f269n[1][0] + this.f103by;
        f267y[1][1] = ((f269n[1][1] + this.f104bz) - 8) + (f266ad[1] / 100);
        m404a(46593, f267y[1], 64, 160);
        f267y[2][0] = f269n[2][0] + this.f103by;
        f267y[2][1] = ((f269n[2][1] + this.f104bz) + 8) - (f266ad[2] / 100);
        m404a(46594, f267y[2], 64, 160);
        f267y[3][0] = f269n[3][0] + this.f103by;
        f267y[3][1] = ((f269n[3][1] + this.f104bz) + 8) - (f266ad[3] / 100);
        m404a(46595, f267y[3], 64, 160);
        if (f116bM == 1) {
            if ((this.f318f & 3) == 0) {
                int i12 = f269n[f113bJ][0] + this.f103by;
                int i13 = f269n[f113bJ][1] + this.f104bz;
                int i14 = f266ad[f113bJ] / 100;
                if ((f113bJ & 2) != 0) {
                    i14 = -i14;
                }
                m412a(1, (i12 + m200c(64)) - 32, ((i13 + m200c(128)) - 64) + i14, 0, 0, 0, 0);
                m391a("c4");
            } else if ((this.f318f & 3) == 2 && f114bK != 0) {
                int i15 = f269n[f114bK][0] + this.f103by;
                int i16 = f269n[f114bK][1] + this.f104bz;
                int i17 = f266ad[f114bK] / 100;
                if ((f114bK & 2) != 0) {
                    i17 = -i17;
                }
                m412a(1, (i15 + m200c(64)) - 32, ((i16 + m200c(128)) - 64) + i17, 0, 0, 0, 0);
                m391a("c4");
            }
        } else if (f116bM == 2 && (this.f318f & 7) == 0) {
            m412a(1, (1415 + m200c(16)) - 8, (60 + m200c(16)) - 8, 0, 0, 0, 0);
            m391a("c4");
        }
        if (!m20u() || this.f92bn >= 50) {
            return;
        }
        m391a("ac");
        f190Y[3] = iArr[2] < m280b() ? 768 : -768;
        f190Y[5] = -1536;
        this.f310a = 2;
        m318ah();
        int i18 = this.f111bG - 1;
        this.f111bG = i18;
        if (i18 <= 0) {
            this.f92bn = 50;
            return;
        }
        this.f109bE = 1;
        this.f110bF = 120;
        this.f107bC = 120;
        this.f108bD = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v */
    private boolean m16v() {
        if (f119bP > 0) {
            f119bP--;
        }
        switch (f117bN) {
            case 1:
                break;
            case 2:
                int i = f118bO + 4;
                f118bO = i;
                if (i < 255) {
                    return false;
                }
                f118bO = 255;
                f119bP = 180;
                f117bN++;
                return false;
            case 3:
                if (f119bP > 0) {
                    return false;
                }
                f117bN++;
                return false;
            case 4:
                int i2 = f118bO - 4;
                f118bO = i2;
                if (i2 > 0) {
                    return false;
                }
                f118bO = 0;
                f117bN++;
                return false;
            case 5:
                return true;
            default:
                f117bN = 1;
                break;
        }
        f118bO = 0;
        f117bN++;
        return false;
    }

    /* renamed from: aE */
    private void m369aE() {
        int i = f118bO;
        Font font = Font.getFont(1896875008);
        int i2 = i & 255;
        m191c(f9a, 0);
        f9a.fillRect(0, 0, 240, 240);
        m402a(font);
        int i3 = (i2 << 16) | (i2 << 8) | i2;
        m396a(f9a, this.GFX_GameArray[124], 0, 0, 54, 15, 0, 206, 152, 2);
        m389a(f214a[25], 120, 96, i3, i2);
        m389a(f214a[26], 120, 121, i3, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[LOOP:0: B:9:0x005a->B:11:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m12w() {
        int i;
        int i2;
        if (f272bS > 0) {
            f272bS--;
        }
        f273bT += 2;
        f271bR = (this.f318f >> 1) % 3;
        switch (f270bQ) {
            case 1:
                f273bT = 0;
                f271bR = 0;
                for (i = 0; i < 6; i++) {
                    f277z[i][0] = -1;
                }
                int i3 = 0;
                for (i2 = 0; i2 < 6; i2++) {
                    if (!f304h[i2]) {
                        int i4 = i3;
                        i3++;
                        f277z[i4][0] = i2;
                    }
                }
                m405a(0, true, 0);
                f272bS = 1200;
                f270bQ++;
                break;
            case 2:
                break;
            case 3:
                f271bR = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    f277z[i5][1] = (m429a(90) * 28) / 100;
                    f277z[i5][2] = (m276b(90) * 28) / 100;
                }
                if (f273bT > 12) {
                    f273bT = 0;
                    f270bQ++;
                    return false;
                } else if (f272bS <= 0) {
                    f270bQ = 6;
                    return false;
                } else {
                    return false;
                }
            case 4:
                f271bR = 2;
                for (int i6 = 0; i6 < 6; i6++) {
                    int i7 = 90 - (f273bT - (i6 * 24));
                    int i8 = i7;
                    if (i7 > 90) {
                        i8 = 90;
                    } else if (i8 < -70) {
                        i8 = -70;
                    }
                    int i9 = i8 - 30;
                    f277z[i6][1] = (m429a(i9) * 28) / 100;
                    f277z[i6][2] = (m276b(i9) * 28) / 100;
                }
                if (f273bT > 480) {
                    f273bT = 0;
                    f270bQ++;
                    return false;
                } else if (f272bS <= 0) {
                    f270bQ = 6;
                    return false;
                } else {
                    return false;
                }
            case 5:
                f271bR = 0;
                for (int i10 = 0; i10 < 6; i10++) {
                    f277z[i10][1] = (m429a(-90) * 28) / 100;
                    f277z[i10][2] = (m276b(-90) * 28) / 100;
                }
                if (f273bT > 12) {
                    f273bT = 0;
                    f270bQ = 2;
                    return false;
                } else if (f272bS <= 0) {
                    f270bQ = 6;
                    return false;
                } else {
                    return false;
                }
            case 6:
                return true;
            default:
                f270bQ = 1;
                f273bT = 0;
                f271bR = 0;
                while (i < 6) {
                }
                int i32 = 0;
                while (i2 < 6) {
                }
                m405a(0, true, 0);
                f272bS = 1200;
                f270bQ++;
                break;
        }
        f271bR = 1;
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = (-90) + (f273bT - (i11 * 24));
            int i13 = i12;
            if (i12 < -90) {
                i13 = -90;
            } else if (i13 > 70) {
                i13 = 70;
            }
            int i14 = i13 + 30;
            f277z[i11][1] = (m429a(i14) * 28) / 100;
            f277z[i11][2] = (m276b(i14) * 28) / 100;
        }
        if (f273bT > 400) {
            f273bT = 0;
            f270bQ++;
            return false;
        }
        return false;
    }

    /* renamed from: aF */
    private void m367aF() {
        int i = f271bR % 3;
        m191c(f9a, 0);
        f9a.fillRect(0, 0, 240, 240);
        m396a(f9a, this.GFX_GameArray[125], 0, 56, 128, 24, 0, 120, 128, 2);
        switch (i) {
            case 0:
                m396a(f9a, this.GFX_GameArray[125], 0, 0, 64, 56, 0, 120, 80, 2);
                break;
            case 1:
                m396a(f9a, this.GFX_GameArray[125], 64, 0, 64, 56, 1, 120, 80, 2);
                break;
            case 2:
                m396a(f9a, this.GFX_GameArray[125], 64, 0, 64, 56, 0, 120, 80, 2);
                break;
        }
        for (int i2 = 5; i2 >= 0; i2--) {
            if (f277z[i2][0] >= 0) {
                int i3 = (f277z[i2][0] % 6) + 3;
                m396a(f9a, this.GFX_GameArray[125], f278o[i3][0], f278o[i3][1], 16, 16, 0, f277z[i2][1] + 120, f277z[i2][2] + 68, 2);
            }
        }
    }

    /* renamed from: aG */
    private void m365aG() {
        int i = f271bR % 3;
        m191c(f9a, 0);
        f9a.fillRect(0, 0, 240, 240);
        m396a(f9a, this.GFX_GameArray[123], f279p[i][0], f279p[i][1], f279p[i][2], f279p[i][3], 0, 120, 90, 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x */
    private boolean m8x() {
        if (f272bS > 0) {
            f272bS--;
        }
        f271bR = (this.f318f >> 1) % 3;
        switch (f270bQ) {
            case 1:
                m405a(0, true, 0);
                f272bS = 300;
                f270bQ++;
                break;
            case 2:
                break;
            case 3:
                return true;
            default:
                f270bQ = 1;
                m405a(0, true, 0);
                f272bS = 300;
                f270bQ++;
                break;
        }
        if (f272bS > 0) {
            return false;
        }
        f270bQ++;
        return false;
    }

    /* renamed from: a */
    public final void m405a(int i, boolean z, int i2) {
        f281ab = z;
        f280bX = i2;
    }

    /* renamed from: a */
    public final boolean m386a(boolean z) {
        if (z) {
            if ((this.f318f & 3) == 0 && f280bX < 8) {
                f280bX++;
            }
            return f280bX >= 8;
        }
        if ((this.f318f & 3) == 0 && f280bX > 0) {
            f280bX--;
        }
        return f280bX == 0;
    }

    /* renamed from: S */
    public final void m450S() {
        if (f280bX > 0) {
            m191c(f9a, 0);
            if (f281ab) {
                for (int i = 0; i < 240; i += 8) {
                    f9a.fillRect(0, i, 240, f280bX);
                }
                return;
            }
            for (int i2 = 0; i2 < 240; i2 += 8) {
                f9a.fillRect(0, (i2 + 7) - f280bX, 240, f280bX);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x069c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x070a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0728 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0777 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0307  */
    /* renamed from: aH */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m363aH() {
        int i;
        int i2;
        f23al = 0;
        f25an = 0;
        f26ao = 0;
        if (f121bZ > 0) {
            f121bZ--;
        }
        if (f120bY >= 4 && m200c(15) == 0) {
            if (m200c(2) == 0) {
                m412a(28 + m200c(7), -20, m204c() - (30 + m200c(120)), 0, 300, 1, 0);
            } else {
                m412a(28 + m200c(7), 260, m204c() - (30 + m200c(120)), 0, 300, 0, 0);
            }
        }
        switch (f120bY) {
            case 1:
                for (i = 0; i < 150; i++) {
                    try {
                        try {
                            this.GFX_GameArray[i].dispose();
                        } catch (Exception unused) {
                        }
                        this.GFX_GameArray[i] = null;
                    } catch (Throwable unused2) {
                    }
                }
                m332aa();
                System.gc();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[17]).append(",length=").append(f6N[18] - f6N[17]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[100] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[25]).append(",length=").append(f6N[26] - f6N[25]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[121] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[24]).append(",length=").append(f6N[25] - f6N[24]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[122] = f4a.getImage();
                this.GFX_GameArray[123] = GFX_Load("endegg_b.gif");
                this.GFX_GameArray[124] = GFX_Load("/t_license3.gif");
                this.GFX_GameArray[125] = GFX_Load("endegg_a.gif");
                m17v();
                f121bZ = 180;
                f124cc = -102;
                f122ca = -1;
                f123cb = 0;
                f166c[0] = false;
                f166c[1] = false;
                f166c[2] = false;
                f166c[3] = false;
                f166c[4] = false;
                f166c[5] = false;
                f166c[6] = false;
                m387a(true);
                m405a(0, true, 8);
                f204T = true;
                f205U = true;
                this.f391aa = false;
                this.f54c = true;
                this.f55l = 10;
                f208V = false;
                f209W = false;
                m493D(16);
                f125ac = true;
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (f304h[i2]) {
                            i2++;
                        } else {
                            f125ac = false;
                        }
                    }
                }
                f274bU = 0;
                f275bV = 0;
                f276bW = 0;
                f120bY++;
                return;
            case 2:
                m386a(false);
                f190Y[10] = -2048;
                f190Y[12] = 1;
                m81i(-1);
                if (m200c(12) == 0) {
                    switch (m200c(3)) {
                        case 1:
                            m412a(31, m280b() - 300, m204c() - (30 + m200c(120)), 0, 300, 0, 0);
                            break;
                        case 2:
                            m412a(33, m280b() - 300, m204c() - (30 + m200c(120)), 0, 300, 0, 0);
                            break;
                        default:
                            m412a(28, m280b() - 300, m204c() - (30 + m200c(120)), 0, 300, 0, 0);
                            break;
                    }
                }
                if (m280b() > 64) {
                    return;
                }
                f120bY++;
                return;
            case 3:
                if (f190Y[10] < 768) {
                    int[] iArr = f190Y;
                    iArr[10] = iArr[10] + 80;
                } else {
                    f190Y[10] = 768;
                }
                f190Y[12] = 0;
                if (m280b() < 160) {
                    return;
                }
                f190Y[0] = 40960;
                f190Y[10] = 0;
                if (f125ac) {
                    f121bZ = 20;
                    f120bY++;
                    return;
                }
                f121bZ = 400;
                f120bY = 11;
                return;
            case 4:
                f19ah = 1;
                f122ca = 4;
                if (f121bZ <= 0) {
                    f121bZ = 48;
                    f120bY++;
                    return;
                }
                return;
            case 5:
                f19ah = 1;
                f122ca = 5;
                if (f121bZ <= 0) {
                    for (int i3 = 0; i3 < 6; i3++) {
                        f277z[i3][0] = i3;
                        f277z[i3][1] = 0;
                        f277z[i3][2] = 0;
                        f277z[i3][3] = 6000 * i3;
                    }
                    f121bZ = 220;
                    f120bY++;
                    return;
                }
                return;
            case 6:
                f19ah = 1;
                f122ca = 6;
                int i4 = f274bU + 80;
                f274bU = i4;
                if (i4 > 7200) {
                    f274bU = 7200;
                }
                int i5 = f276bW + 12;
                f276bW = i5;
                if (i5 > 10000) {
                    f276bW = 10000;
                }
                int i6 = f275bV + 10;
                f275bV = i6;
                if (i6 > 2800) {
                    f275bV = 2800;
                }
                for (int i7 = 0; i7 < 6; i7++) {
                    int[] iArr2 = f277z[i7];
                    int i8 = iArr2[3] + f276bW;
                    iArr2[3] = i8;
                    if (i8 > 36000) {
                        int[] iArr3 = f277z[i7];
                        iArr3[3] = iArr3[3] % 36000;
                    }
                    f277z[i7][1] = (m429a(f277z[i7][3] / 100) * (f275bV / 100)) / 100;
                    f277z[i7][2] = (m276b(f277z[i7][3] / 100) * (f275bV / 100)) / 100;
                }
                if (f121bZ < 31) {
                    this.f441A = true;
                    this.f147O = 32 - f121bZ;
                }
                if (f121bZ <= 0) {
                    f121bZ = 40;
                    f120bY++;
                    return;
                }
                return;
            case 7:
                f19ah = 1;
                f122ca = 6;
                if (f121bZ <= 0) {
                    f121bZ = 8;
                    f120bY++;
                    return;
                }
                return;
            case 8:
                f19ah = 1;
                f122ca = 6;
                if (f121bZ <= 0) {
                    f121bZ = 15;
                    f120bY++;
                    return;
                }
                return;
            case 9:
                this.f441A = true;
                this.f147O = f121bZ * 2 > 31 ? 31 : f121bZ * 2;
                f19ah = 1;
                f122ca = 7;
                if (f121bZ <= 0) {
                    this.f441A = false;
                    this.f147O = 0;
                    f121bZ = 60;
                    f120bY++;
                    return;
                }
                return;
            case 10:
                f19ah = 1;
                f122ca = 7;
                if (f121bZ <= 0) {
                    f121bZ = 20;
                    f120bY++;
                    return;
                }
                return;
            case 11:
                if (f125ac) {
                    f120bY++;
                } else {
                    this.f372D = 120;
                    if (f121bZ > 0) {
                        return;
                    }
                    f120bY++;
                }
                if (f125ac) {
                    f122ca = 0;
                } else {
                    f19ah = 1;
                    f122ca = 1;
                }
                f124cc += 8;
                if (f124cc >= 46) {
                    return;
                }
                f121bZ = 20;
                f120bY++;
                return;
            case 12:
                if (f125ac) {
                }
                f124cc += 8;
                if (f124cc >= 46) {
                }
                break;
            case 13:
                f19ah = 1;
                f122ca = 1;
                if (f121bZ > 0) {
                    return;
                }
                f121bZ = 10;
                f120bY++;
                f19ah = 1;
                f122ca = 2;
                if (f121bZ <= 0) {
                    return;
                }
                f121bZ = 10;
                f120bY++;
                f19ah = 1;
                f122ca = 3;
                if (f121bZ <= 0) {
                    return;
                }
                f121bZ = 300;
                f120bY++;
                f19ah = 1;
                if (f121bZ <= 0) {
                    return;
                }
                f121bZ = 34;
                f120bY++;
                f19ah = 1;
                m386a(true);
                if (f121bZ <= 0) {
                    return;
                }
                f123cb = 1;
                f270bQ = 0;
                f120bY++;
                return;
            case 14:
                f19ah = 1;
                f122ca = 2;
                if (f121bZ <= 0) {
                }
                break;
            case 15:
                f19ah = 1;
                f122ca = 3;
                if (f121bZ <= 0) {
                }
                break;
            case 16:
                f19ah = 1;
                if (f121bZ <= 0) {
                }
                break;
            case 17:
                f19ah = 1;
                m386a(true);
                if (f121bZ <= 0) {
                }
                break;
            case 18:
                m446U();
                f19ah = 1;
                if (f125ac) {
                    if (!m8x()) {
                        return;
                    }
                } else if (!m12w()) {
                    return;
                }
                f123cb = 2;
                f117bN = 0;
                f120bY++;
                m446U();
                f19ah = 1;
                if (m16v()) {
                    return;
                }
                f120bY = 100;
                return;
            case 19:
                m446U();
                f19ah = 1;
                if (m16v()) {
                }
                break;
            case 100:
                m446U();
                f19ah = 1;
                this.f390w = false;
                f38ay = 1;
                m39q();
                m125d(false);
                return;
            default:
                f120bY = 1;
                while (i < 150) {
                }
                m332aa();
                System.gc();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[17]).append(",length=").append(f6N[18] - f6N[17]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[100] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[25]).append(",length=").append(f6N[26] - f6N[25]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[121] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[24]).append(",length=").append(f6N[25] - f6N[24]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[122] = f4a.getImage();
                this.GFX_GameArray[123] = GFX_Load("endegg_b.gif");
                this.GFX_GameArray[124] = GFX_Load("/t_license3.gif");
                this.GFX_GameArray[125] = GFX_Load("endegg_a.gif");
                m17v();
                f121bZ = 180;
                f124cc = -102;
                f122ca = -1;
                f123cb = 0;
                f166c[0] = false;
                f166c[1] = false;
                f166c[2] = false;
                f166c[3] = false;
                f166c[4] = false;
                f166c[5] = false;
                f166c[6] = false;
                m387a(true);
                m405a(0, true, 8);
                f204T = true;
                f205U = true;
                this.f391aa = false;
                this.f54c = true;
                this.f55l = 10;
                f208V = false;
                f209W = false;
                m493D(16);
                f125ac = true;
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                    }
                    i2++;
                }
                f274bU = 0;
                f275bV = 0;
                f276bW = 0;
                f120bY++;
                return;
        }
    }

    /* renamed from: aI */
    private void m361aI() {
        m359aJ();
        m450S();
    }

    /* renamed from: aJ */
    private void m359aJ() {
        if (f120bY < 2) {
            return;
        }
        if (f123cb == 1) {
            if (f125ac) {
                m365aG();
            } else {
                m367aF();
            }
        } else if (f123cb == 2) {
            m369aE();
        } else if (f122ca >= 0) {
            m396a(f9a, this.GFX_GameArray[121], 0, 0, 96, 32, 0, f124cc, 110, 2);
            switch (f122ca) {
                case 1:
                    m396a(f9a, this.GFX_GameArray[122], 0, 0, 32, 40, 0, 120, 96, 2);
                    return;
                case 2:
                    m396a(f9a, this.GFX_GameArray[122], 0, 40, 48, 72, 0, 120, 96, 2);
                    return;
                case 3:
                    m396a(f9a, this.GFX_GameArray[122], 48, 0, 176, 136, 0, 162, 96, 2);
                    return;
                case 4:
                    m396a(f9a, this.GFX_GameArray[123], 32, 96, 32, 40, 0, 120, 96, 2);
                    return;
                case 5:
                    if ((this.f318f & 1) == 0) {
                        m396a(f9a, this.GFX_GameArray[123], 32, 96, 32, 40, 0, 120, 96, 2);
                        return;
                    } else {
                        m396a(f9a, this.GFX_GameArray[123], 64, 96, 32, 40, 0, 120, 96, 2);
                        return;
                    }
                case 6:
                    m396a(f9a, this.GFX_GameArray[123], 96, 96, 32, 40, 0, 120, 96, 2);
                    for (int i = 0; i < 6; i++) {
                        m396a(f9a, this.GFX_GameArray[123], f282q[i][0], f282q[i][1], 16, 16, 0, f277z[i][1] + 120, (f277z[i][2] + 100) - (f274bU / 100), 2);
                    }
                    return;
                case 7:
                    if ((this.f318f & 4) == 0) {
                        m396a(f9a, this.GFX_GameArray[123], 128, 96, 32, 40, 0, 120, 96, 2);
                        return;
                    } else {
                        m396a(f9a, this.GFX_GameArray[123], 160, 96, 32, 40, 0, 120, 96, 2);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: au */
    private void m291au(int i) {
        m453Q(f171Q);
    }

    /* renamed from: av */
    private void m289av(int i) {
        m453Q(f171Q);
    }

    /* renamed from: aw */
    private void m287aw(int i) {
        m453Q(f171Q);
    }

    /* renamed from: ax */
    private void m285ax(int i) {
        m453Q(f171Q);
    }

    /* renamed from: ay */
    private void m283ay(int i) {
        m453Q(f171Q);
        m106e(true);
    }

    /* renamed from: f */
    private void m98f(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = (this.f103by + i) - f179T[0];
        int i11 = (this.f104bz + i2) - f179T[1];
        if (i3 == 0) {
            i5 = i4;
            i6 = -84;
            i7 = -24;
            i8 = 24;
            i9 = f211b[2];
        } else {
            i5 = -i4;
            i6 = 84;
            i7 = 24;
            i8 = -24;
            i9 = 0;
        }
        m396a(f9a, this.GFX_GameArray[145], 0, 0, 64, 144, i9, i10, i11 + i5, 2);
        switch ((this.f318f >> 1) % 3) {
            case 1:
                m396a(f9a, this.GFX_GameArray[145], 64, 0, 16, 16, i9, i10, i11 + i5 + i8, 2);
                break;
            case 2:
                m396a(f9a, this.GFX_GameArray[145], 64, 16, 16, 16, i9, i10, i11 + i5 + i8, 2);
                break;
        }
        if (i4 > 0) {
            m396a(f9a, this.GFX_GameArray[145], 16, 120, 32, 24, i9, i10, i11 + i5 + i6, 2);
            m396a(f9a, this.GFX_GameArray[145], 16, 120, 32, 24, i9, i10, i11 + i5 + i6 + i7, 2);
            m396a(f9a, this.GFX_GameArray[145], 16, 120, 32, 24, i9, i10, i11 + i5 + i6 + i7 + i7, 2);
        }
    }

    /* renamed from: az */
    private void m281az(int i) {
        int i2 = 1415 - f179T[0];
        int i3 = 60 - f179T[1];
        switch (i) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                m396a(f9a, this.GFX_GameArray[145], 80, 0, 16, 16, 0, i2, i3, 2);
                return;
            case 3:
                m396a(f9a, this.GFX_GameArray[145], 80, 16, 16, 16, 0, i2, i3, 2);
                return;
            case 4:
                m396a(f9a, this.GFX_GameArray[145], 80, 32, 16, 16, 0, i2, i3, 2);
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    private void m91g(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        switch (i) {
            case 1:
                i5 = 2 + (this.f318f & 1);
                break;
            case 2:
                i5 = 4;
                break;
            case 3:
                i5 = 5 + ((this.f318f >> 1) % 3);
                break;
            default:
                i5 = 0 + ((this.f318f >> 1) & 1);
                break;
        }
        short s = this.f399r[i5][0];
        short s2 = this.f399r[i5][1];
        short s3 = this.f399r[i5][2];
        short s4 = this.f399r[i5][3];
        switch (i4) {
            case 1:
                i6 = f211b[4];
                break;
            case 2:
                i6 = f211b[6];
                break;
            case 3:
                i6 = f211b[2];
                break;
            default:
                i6 = 0;
                break;
        }
        m396a(f9a, this.GFX_GameArray[146], s, s2, s3, s4, i6, i2 - f179T[0], i3 - f179T[1], 2);
    }

    /* renamed from: aA */
    private void m376aA(int i) {
        int[] iArr = f171Q;
        if (this.f92bn > 200) {
            return;
        }
        m456P(iArr);
        if (this.f92bn < 100) {
            m91g(this.f109bE, iArr[2], iArr[3], 0);
        } else {
            m453Q(iArr);
        }
        m450S();
        m98f(f269n[0][0], f269n[0][1], 0, f266ad[0] / 100);
        m98f(f269n[1][0], f269n[1][1], 0, f266ad[1] / 100);
        m98f(f269n[2][0], f269n[2][1], 1, f266ad[2] / 100);
        m98f(f269n[3][0], f269n[3][1], 1, f266ad[3] / 100);
        switch (f115bL) {
            case 0:
                m281az(1);
                return;
            case 1:
            default:
                m281az(2);
                return;
            case 2:
            case 3:
                m281az(3 + (this.f318f & 1));
                return;
        }
    }

    /* renamed from: a */
    private void m393a(Image image, int i, int i2, int i3, short[] sArr) {
        int i4;
        short s = sArr[0];
        short s2 = sArr[1];
        short s3 = sArr[2];
        short s4 = sArr[3];
        short s5 = sArr[4];
        short s6 = sArr[5];
        switch (i3) {
            case 1:
                i4 = f211b[4];
                s5 = -s5;
                break;
            case 2:
                i4 = f211b[6];
                s6 = -s6;
                break;
            case 3:
                i4 = f211b[2];
                s5 = -s5;
                s6 = -s6;
                break;
            default:
                i4 = 0;
                break;
        }
        m396a(f9a, image, s, s2, s3, s4, i4, (i - f179T[0]) + s5, (i2 - f179T[1]) + s6, 2);
    }

    /* renamed from: b */
    private void m267b(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 0:
                if (i5 == 0) {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[1]);
                    return;
                } else {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[2]);
                    return;
                }
            case 1:
                if (i5 == 0) {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[3]);
                    return;
                } else {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[4]);
                    return;
                }
            case 2:
                if (i5 == 0) {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[1]);
                    return;
                } else {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[6]);
                    return;
                }
            case 3:
                m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[6]);
                return;
            case 4:
                m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[7]);
                return;
            case 5:
                if (i5 == 0) {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[21]);
                    return;
                } else {
                    m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[22]);
                    return;
                }
            case 6:
                m393a(this.GFX_GameArray[120], i2, i3, i4, this.f400s[0]);
                return;
            default:
                return;
        }
    }

    /* renamed from: h */
    private void m85h(int i, int i2, int i3, int i4) {
        short s = this.f400s[15][4];
        short s2 = this.f400s[15][5];
        int i5 = this.f97bs;
        int i6 = this.f95bq / 100;
        if (i3 == 1) {
            s = -s;
        }
        while (i6 < 0) {
            i6 += 360;
        }
        int m429a = 180 + ((m429a(i6) * 90) / 100);
        if (i5 > 16) {
            m393a(this.GFX_GameArray[120], i, i2, i3, this.f400s[15 + ((this.f318f >> 2) & 1)]);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = (i7 + 1) * 16;
            int m429a2 = i + ((m429a(m429a) * i8) / 100) + s;
            int m276b = i2 + ((m276b(m429a) * i8) / 100) + s2;
            if (i5 > 16 + i8) {
                m393a(this.GFX_GameArray[120], m429a2, m276b, 0, this.f400s[17]);
            }
            if (i4 == 2 && Math.abs(i5 - (16 + i8)) < 4) {
                m412a(1, m429a2, m276b, 0, 0, 0, 0);
                m391a("c4");
            }
        }
        int m429a3 = i + s + ((m429a(m429a) * i5) / 100);
        int m276b2 = i2 + s2 + ((m276b(m429a) * i5) / 100);
        if (i4 != 2) {
            m393a(this.GFX_GameArray[121], m429a3, m276b2, 0, this.f402c);
            return;
        }
        int m429a4 = i + s + ((m429a(m429a) * 96) / 100);
        int m276b3 = i2 + s2 + ((m276b(m429a) * 96) / 100);
        m393a(this.GFX_GameArray[121], m429a4, m276b3, 0, this.f402c);
        if ((this.f318f & 7) == 4) {
            m412a(1, (m429a4 + m200c(48)) - 24, (m276b3 + m200c(48)) - 24, 0, 0, 0, 0);
            m391a("c4");
        }
    }

    /* renamed from: i */
    private void m79i(int i, int i2, int i3, int i4) {
        m393a(this.GFX_GameArray[120], i, i2, i3, this.f400s[19]);
    }

    /* renamed from: j */
    private void m73j(int i, int i2, int i3, int i4) {
        m393a(this.GFX_GameArray[120], i, i2, i3, this.f400s[19]);
    }

    /* renamed from: k */
    private void m67k(int i, int i2, int i3, int i4) {
        m393a(this.GFX_GameArray[120], i, ((i2 + 8) - 32) + this.f97bs, i3, this.f400s[20]);
    }

    /* renamed from: p */
    private void m41p(int i, int i2, int i3) {
        switch (this.f91bm) {
            case 0:
                m85h(i, i2, i3, 0);
                return;
            case 1:
                return;
            case 2:
                m79i(i, i2, i3, 0);
                return;
            case 3:
                m73j(i, i2, i3, 0);
                return;
            case 4:
                m67k(i, i2, i3, 0);
                return;
            case 5:
            default:
                return;
        }
    }

    /* renamed from: q */
    private void m36q(int i, int i2, int i3) {
        switch (this.f91bm) {
            case 0:
                m85h(i, i2, i3, 2);
                return;
            case 1:
                return;
            case 2:
                m79i(i, i2, i3, 2);
                return;
            case 3:
                m73j(i, i2, i3, 2);
                return;
            case 4:
                m67k(i, i2, i3, 2);
                return;
            case 5:
            default:
                return;
        }
    }

    /* renamed from: Q */
    private void m453Q(int[] iArr) {
        int i = (this.f318f >> 3) & 1;
        int i2 = (this.f318f >> 2) & 1;
        int i3 = (this.f318f >> 1) & 1;
        int i4 = this.f318f & 1;
        if (this.f92bn < 2) {
            return;
        }
        m456P(iArr);
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = this.f93bo;
        int i8 = this.f94bp;
        int i9 = ((this.f318f & 1) != 0 || this.f107bC <= 0) ? 0 : 1;
        switch (i7) {
            case 0:
                m41p(i5, i6, i8);
                m267b(this.f109bE, i5, i6, i8, i2);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8 + i9]);
                return;
            case 1:
                m41p(i5, i6, i8);
                m267b(1, i5, i6, i8, i2);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8]);
                return;
            case 2:
                m41p(i5, i6, i8);
                m267b(this.f109bE, i5, i6, i8, i2);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[11 + i4]);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8 + i9]);
                return;
            case 3:
                m36q(i5, i6, i8);
                m267b(2, i5, i6, i8, i);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8]);
                if (i2 != 0) {
                    m391a("c4");
                    m412a(1, (i5 + m200c(32)) - 16, ((i6 + m200c(32)) - 16) - 8, 0, 0, 0, 0);
                    return;
                }
                return;
            case 4:
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[7]);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8]);
                return;
            case 5:
                m267b(0, i5, i6, i8, i2);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8]);
                if (i3 == 1) {
                    m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[18]);
                }
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[13 + i2]);
                return;
            case 6:
                m267b(0, i5, i6, i8, i2);
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[8]);
                if (i3 != 0) {
                    m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[18]);
                }
                m393a(this.GFX_GameArray[120], i5, i6, i8, this.f400s[11 + i4]);
                return;
            case 7:
                m267b(6, 1760, 168, 1, 0);
                m393a(this.GFX_GameArray[147], 1760, 168, i8, this.f401t[0]);
                m91g(3, i5, i6, 1);
                return;
            case 8:
                m267b(0, i5, i6, 1, i2);
                m393a(this.GFX_GameArray[147], i5, i6, 1, this.f401t[0]);
                return;
            case 9:
                m267b(0, i5, i6, 1, i2);
                m393a(this.GFX_GameArray[147], i5, i6, 1, this.f401t[1]);
                return;
            case 10:
                m267b(0, i5, i6, 1, i2);
                m393a(this.GFX_GameArray[147], i5, i6, 1, this.f401t[2]);
                return;
            case 11:
                m267b(5, i5, i6, 1, i2);
                m393a(this.GFX_GameArray[147], i5, i6, 1, this.f401t[3]);
                if (i2 != 0) {
                    if (i6 - f179T[1] >= 0 && i6 - f179T[1] <= 168) {
                        m391a("c4");
                    }
                    m412a(1, (i5 + m200c(32)) - 16, ((i6 + m200c(32)) - 16) - 8, 0, 0, 0, 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: aK */
    private void m357aK() {
        f283cd = 0;
        f38ay = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: aL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m355aL() {
        int i;
        if (f130ci > 0 && f283cd < 4) {
            f130ci--;
        }
        switch (f283cd) {
            case 1:
                f126ce = 120;
                f127cf = -20;
                f130ci = 164;
                f128cg = -1;
                f129ch = -1;
                for (i = 120; i < 150; i++) {
                    try {
                        try {
                            this.GFX_GameArray[i].dispose();
                        } catch (Exception unused) {
                        }
                        this.GFX_GameArray[i] = null;
                    } catch (Throwable unused2) {
                    }
                }
                System.gc();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[23]).append(",length=").append(f6N[24] - f6N[23]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[121] = f4a.getImage();
                m493D(22);
                f283cd++;
                f128cg = 0;
                f127cf += 15;
                if (f127cf < 167) {
                    return;
                }
                f127cf = 167;
                f128cg = 1;
                f283cd++;
                if (f130ci != 0) {
                    m260b(false);
                    f283cd = 999;
                    return;
                } else if (f166c[0]) {
                    f128cg = 2;
                    f129ch = 0;
                    m203c();
                    f283cd++;
                    m407a(0, (String) null);
                    m407a(1, (String) null);
                    return;
                } else {
                    return;
                }
            case 2:
                f128cg = 0;
                f127cf += 15;
                if (f127cf < 167) {
                }
                break;
            case 3:
                if (f130ci != 0) {
                }
                break;
            case 4:
                f129ch++;
                if (f129ch > 8) {
                    f126ce++;
                }
                if (f129ch > 12) {
                    f126ce += 20;
                }
                if (f129ch < 45) {
                    return;
                }
                f283cd++;
                return;
            case 5:
                m446U();
                m260b(true);
                f283cd = 999;
                return;
            case 999:
                return;
            default:
                f283cd = 1;
                f126ce = 120;
                f127cf = -20;
                f130ci = 164;
                f128cg = -1;
                f129ch = -1;
                while (i < 150) {
                }
                System.gc();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[23]).append(",length=").append(f6N[24] - f6N[23]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[121] = f4a.getImage();
                m493D(22);
                f283cd++;
                f128cg = 0;
                f127cf += 15;
                if (f127cf < 167) {
                }
                break;
        }
    }

    /* renamed from: aM */
    private void m353aM() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = f126ce;
        int i7 = f127cf;
        m191c(f9a, 0);
        f9a.fillRect(0, 0, 240, 240);
        if (f283cd < 2) {
            return;
        }
        if (f128cg == 0) {
            m262b(f9a, this.GFX_GameArray[121], 0, 0, 48, 32, 0, 120, 167, 2);
            int i8 = this.f318f % 5;
            m262b(f9a, this.f312b[1], f284u[i8][0], f284u[i8][1], 48, 24, f284u[i8][2] == 0 ? 0 : f211b[4], i6, i7, 2);
        } else if (f128cg == 1) {
            int i9 = (this.f318f >> 2) & 3;
            m262b(f9a, this.GFX_GameArray[121], f285v[i9][0], f285v[i9][1], 48, 32, 0, 120, 167, 2);
        } else if (f128cg == 2) {
            if (f129ch < 1) {
                i = 48;
                i2 = 120;
                i3 = 48;
                i4 = 24;
                i5 = -16;
            } else {
                i = (f129ch < 12 ? (f129ch >> 1) % 6 : 6 + ((f129ch - 12) % 4)) * 40;
                i2 = 40;
                i3 = 40;
                i4 = 40;
                i5 = -4;
            }
            m262b(f9a, this.GFX_GameArray[121], 0, 0, 48, 32, 0, 120, 167, 2);
            m398a(f9a, 1, i, i2, i3, i4, 0, i6, (i7 + i5) - 36, 2);
        }
        m262b(f9a, this.GFX_GameArray[121], 96, 0, 16, 16, 0, 104, 128, 2);
        m262b(f9a, this.GFX_GameArray[121], 96, 0, 16, 16, 0, 136, 128, 2);
        int i10 = (f130ci / 15) % 10;
        m262b(f9a, this.f312b[9], (((f130ci / 15) / 10) % 10) * 7, 0, 7, 13, 0, 116, 128, 2);
        m262b(f9a, this.f312b[9], i10 * 7, 0, 7, 13, 0, 124, 128, 2);
        m262b(f9a, this.GFX_GameArray[121], 0, 64, 120, 16, 0, 120, 80, 2);
    }

    /* renamed from: aB */
    private void m374aB(int i) {
        try {
            if (this.f314b == 5) {
                this.GFX_GameArray[3] = GFX_Load(f242f[52]);
                this.GFX_GameArray[35] = GFX_Load(f242f[53]);
                this.GFX_GameArray[30] = GFX_Load(f242f[54]);
                this.GFX_GameArray[34] = GFX_Load(f242f[57]);
                this.GFX_GameArray[31] = GFX_Load(f242f[58]);
                this.GFX_GameArray[29] = GFX_Load(f242f[59]);
                this.GFX_GameArray[84] = GFX_Load(f242f[60]);
                this.GFX_GameArray[7] = GFX_Load(f242f[61]);
                this.GFX_GameArray[27] = GFX_Load("bryuka_sc.gif");
            }
            if (this.f314b == 0) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[94]).append(",length=").append(f6N[95] - f6N[94]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[4] = f4a.getImage();
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[71]).append(",length=").append(f6N[72] - f6N[71]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[18] = f4a.getImage();
            }
            if (this.f314b == 2) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[74]).append(",length=").append(f6N[75] - f6N[74]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[3] = f4a.getImage();
            }
            if (this.f314b == 3) {
                this.GFX_GameArray[75] = GFX_Load("mfire.gif");
                this.GFX_GameArray[3] = GFX_Load("buranko_s.gif");
            }
            if (this.f314b == 1 && this.f315c != 3) {
                this.GFX_GameArray[12] = GFX_Load("dai_la.gif");
            }
            if (this.f314b != 2) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[46]).append(",length=").append(f6N[47] - f6N[46]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[15] = f4a.getImage();
            }
            if (this.f314b == 1 && this.f315c == 3) {
                this.GFX_GameArray[32] = GFX_Load("z_dai4_l.gif");
                this.GFX_GameArray[12] = GFX_Load("dai_la.gif");
            }
            if (this.f314b == 4) {
                f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[76]).append(",length=").append(f6N[77] - f6N[76]).toString());
                System.gc();
                f4a.use();
                System.gc();
                this.GFX_GameArray[107] = f4a.getImage();
            }
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[32]).append(",length=").append(f6N[33] - f6N[32]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[44] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[56]).append(",length=").append(f6N[57] - f6N[56]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[60] = f4a.getImage();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[21]).append(",length=").append(f6N[22] - f6N[21]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[45] = f4a.getImage();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private boolean m192c(int i, int i2, int i3, int i4) {
        if (i3 == -1 || (0 <= (i - f177R[0]) + i3 && 240 >= (i - f177R[0]) - i3)) {
            if (i4 != -1) {
                return 0 <= (i2 - f177R[1]) + i4 && 240 >= (i2 - f177R[1]) - i4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: aC */
    private void m372aC(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (m414a(f171Q[2], f171Q[3], f171Q[6], f171Q[7], 8, 8) >= 0) {
            if (f171Q[5] == 0 && f171Q[0] != -1) {
                f171Q[5] = 1;
                f171Q[10] = this.f319g;
                f23al++;
                m391a("b5");
            }
        } else if (f171Q[12] != 0 && m414a(f171Q[2], f171Q[12], f171Q[6], f171Q[12], 8, 8) >= 0 && f171Q[5] == 0 && f171Q[0] != -1) {
            f171Q[5] = 1;
            f171Q[10] = this.f319g;
            f23al++;
            m391a("b5");
        }
        if (f171Q[5] != 1 || this.f319g - f171Q[10] < 20) {
            return;
        }
        f171Q[0] = -1;
        f171Q[5] = 0;
    }

    /* renamed from: aD */
    private void m370aD(int i) {
        m372aC(i);
    }

    /* renamed from: aE */
    private void m368aE(int i) {
        int i2;
        int m429a = m429a(this.f318f * 3) * 87;
        int m429a2 = m429a(f171Q[6] * 3) * 87;
        f171Q[6] = this.f318f;
        int i3 = f171Q[4] + 1;
        if (f171Q[4] == 5) {
            m429a = -m429a;
            m429a2 = -m429a2;
        } else if (f171Q[19] == 1) {
            m429a = -m429a;
            m429a2 = -m429a2;
        }
        int i4 = 24;
        int i5 = 8;
        if (this.f314b == 3) {
            i4 = 44;
            i5 = 24;
            i2 = (i3 << 4) + 8;
        } else if (this.f314b == 5) {
            i4 = 24;
            i5 = 24;
            i2 = (i3 << 4) - 24;
        } else {
            i2 = (i3 << 4) - 8;
        }
        int i6 = 12;
        if (!f198N && !f200P) {
            i6 = 20;
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100), f171Q[2] + ((m429a(180 + (m429a2 / 100)) * i2) / 100), f171Q[3] + ((m276b(180 + (m429a2 / 100)) * i2) / 100), i4, i5);
        if (this.f314b == 3) {
            if (m411a == 0) {
                f190Y[1] = ((f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - i5) << 8;
                int[] iArr = f190Y;
                iArr[0] = iArr[0] + ((((m429a(180 + (m429a / 100)) * i2) - (m429a(180 + (m429a2 / 100)) * i2)) << 8) / 100);
                m129d(f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), i4);
                m81i(f171Q[22]);
            } else {
                int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), (f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - 4, f171Q[2] + ((m429a(180 + (m429a2 / 100)) * i2) / 100), (f171Q[3] + ((m276b(180 + (m429a2 / 100)) * i2) / 100)) - 4, 32, 20);
                m411a = m411a2;
                if (m411a2 >= 0) {
                    if (m411a == 0) {
                        f190Y[1] = ((f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - i5) << 8;
                        int[] iArr2 = f190Y;
                        iArr2[0] = iArr2[0] + ((((m429a(180 + (m429a / 100)) * i2) - (m429a(180 + (m429a2 / 100)) * i2)) << 8) / 100);
                        m129d(f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), i4);
                        m81i(f171Q[22]);
                    } else if (Math.abs((f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100)) - m280b()) < 44 && Math.abs((((f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - 4) - (m204c() - i6)) + 1) < i6 + 24) {
                        m488F();
                    }
                }
            }
        } else if (this.f314b != 5) {
            if (m411a != 0) {
                m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100) + 5, f171Q[2] + ((m429a(180 + (m429a2 / 100)) * i2) / 100), f171Q[3] + ((m276b(180 + (m429a2 / 100)) * i2) / 100) + 5, i4, i5);
            }
            if (m411a == 0) {
                f190Y[1] = ((f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - i5) << 8;
                int[] iArr3 = f190Y;
                iArr3[0] = iArr3[0] + ((((m429a(180 + (m429a / 100)) * i2) - (m429a(180 + (m429a2 / 100)) * i2)) << 8) / 100);
                m129d(f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100), i4);
                m81i(f171Q[22]);
            }
        } else if (m411a >= 0) {
            m488F();
        } else if (Math.abs((f171Q[2] + ((m429a(180 + (m429a / 100)) * i2) / 100)) - m280b()) < 12 + i4 && Math.abs((f171Q[3] + ((m276b(180 + (m429a / 100)) * i2) / 100)) - (m204c() - i6)) < i6 + i5) {
            m488F();
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aF */
    private void m366aF(int i) {
        int i2 = 0;
        boolean z = false;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int i3 = this.f319g - f171Q[14];
        f171Q[14] = this.f319g;
        int i4 = 99;
        int i5 = 999;
        for (int i6 = 0; i6 < 12; i6++) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 4, 12, (f171Q[2] - 96) + (i6 << 4), f171Q[3] + f171Q[10], (f171Q[6] - 96) + (i6 << 4), f171Q[7] + f171Q[10], 8, 8);
            i2 = m411a;
            if (m411a >= 0 && i2 != 3) {
                z = true;
                f190Y[1] = (f171Q[3] - 8) << 8;
                if (Math.abs(m280b() - (f171Q[2] - 8)) < i5) {
                    i4 = i6;
                    i5 = Math.abs(m280b() - f171Q[2]);
                }
            }
        }
        if (i4 != 99) {
            f190Y[1] = ((f171Q[3] - 8) + f171Q[10]) << 8;
            m129d(f171Q[2], 96);
            m81i(f171Q[22]);
            f171Q[5] = i4;
            int i7 = i4 <= 6 ? i4 : 6 - (i4 % 6);
            int[] iArr = f171Q;
            iArr[10] = iArr[10] + i3;
            if (f171Q[10] >= i7 * 2) {
                f171Q[10] = i7 * 2;
            }
            if (i4 == 0 || i4 == 11) {
                f171Q[10] = 0;
            }
        } else {
            int[] iArr2 = f171Q;
            iArr2[10] = iArr2[10] - i3;
            if (f171Q[10] <= 0) {
                f171Q[10] = 0;
            }
        }
        if (z) {
            i2 = 0;
        }
        if (f33D && f35av == f171Q[20] && i2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: aG */
    private void m364aG(int i) {
        int[] iArr = {-4, 4};
        for (int i2 = 0; i2 < 12; i2++) {
            if (((this.f318f / 10) + (12 - i2)) % 7 == 2 && m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, (f171Q[2] - 96) + (i2 << 4), f171Q[3], (f171Q[2] - 96) + (i2 << 4), f171Q[3], 8, 12) >= 0) {
                m488F();
            }
        }
    }

    /* renamed from: aH */
    private void m362aH(int i) {
        int i2 = 0;
        int i3 = -1;
        int i4 = -99;
        int i5 = 999;
        boolean z = f171Q[4] != 0 ? true : false;
        int[] iArr = f42b[2][0];
        int i6 = f171Q[2];
        if (f171Q[5] == 0) {
            int length = !z ? iArr.length : -iArr.length;
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 2, 12, f171Q[2] - length, (f171Q[3] - iArr[0]) + 8, f171Q[2] - length, (f171Q[3] - iArr[0]) + 8, 8, 8);
            i3 = m411a;
            if (m411a >= 0) {
                f190Y[1] = (((f171Q[3] - iArr[0]) + 8) - 8) << 8;
            }
        }
        if (f171Q[5] != 0) {
            int i7 = 0;
            while (true) {
                if (i7 >= 36) {
                    break;
                } else if (((this.f319g / 2) - f171Q[10]) - ((i7 << 1) + i7) < 0) {
                    i2 = (i7 / 6) << 3;
                    break;
                } else {
                    if (i7 == 29) {
                        f171Q[5] = 2;
                    }
                    i7++;
                }
            }
            if (i2 >= 48) {
                f171Q[5] = 2;
                if (i2 == 48) {
                    m391a("b9");
                }
            }
            i6 = f171Q[4] != 0 ? f171Q[2] - i2 : f171Q[2] + i2;
        }
        if (f171Q[5] != 2) {
            for (int i8 = 0; i8 < iArr.length; i8++) {
                int length2 = !z ? i8 : (iArr.length - i8) - 1;
                if ((!z && i2 <= i8) || (z && iArr.length - i2 >= i8)) {
                    int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 2, 12, (f171Q[2] - iArr.length) + (i8 << 1), f171Q[3] - iArr[length2], (f171Q[2] - iArr.length) + (i8 << 1), f171Q[3] - iArr[length2], 1, 1);
                    if (m411a2 >= 0 && m411a2 == 0 && i5 > Math.abs(m280b() - ((f171Q[2] - iArr.length) + (i8 << 1)))) {
                        i5 = Math.abs(m280b() - ((f171Q[2] - iArr.length) + (i8 << 1)));
                        i4 = length2;
                    }
                    if (i4 != -99 && 8 > Math.abs(m280b() - ((f171Q[2] - iArr.length) + (i8 << 1))) && m204c() - (f171Q[3] - iArr[length2]) > 0 && m204c() - (f171Q[3] - iArr[length2]) <= 64 && i5 > Math.abs(m280b() - ((f171Q[2] - iArr.length) + (i8 << 1)))) {
                        i5 = Math.abs(m280b() - ((f171Q[2] - iArr.length) + (i8 << 1)));
                        i4 = length2;
                    }
                }
            }
            i3 = -1;
            if (i5 != 999) {
                f171Q[17] = i4;
                f190Y[1] = ((f171Q[3] - iArr[i4]) - 1) << 8;
                if (f171Q[5] == 0) {
                    f171Q[10] = this.f319g / 2;
                    m391a("b9");
                }
                f171Q[5] = 1;
                m129d(i6, !z ? i2 : iArr.length - i2);
                m81i(f171Q[22]);
                i3 = 0;
            }
        }
        if (f33D && f35av == f171Q[20] && i3 != 0) {
            f33D = false;
        }
    }

    /* renamed from: aI */
    private void m360aI(int i) {
        int i2 = -1;
        m127d(f171Q[2], f171Q[3], f171Q[4]);
        char c = f171Q[4] == 21 ? (char) 2 : f171Q[4] == 1 ? (char) 0 : (char) 1;
        f171Q[17] = f171Q[2];
        f171Q[18] = f171Q[3];
        if (c != 2 && f171Q[4] != 32) {
            int[] iArr = f171Q;
            iArr[5] = iArr[5] + 1;
            int i3 = 32;
            if (f171Q[4] == 35) {
                i3 = 32;
            } else if (f171Q[4] == 1) {
                i3 = 16;
            } else if (f171Q[4] == 41) {
                i3 = 16;
            } else if (f171Q[4] == 34) {
                i3 = 24;
            } else if (f171Q[4] == 43) {
                i3 = 32;
            } else if (f171Q[4] == 33) {
                i3 = 16;
            } else if (f171Q[4] == 42) {
                i3 = 24;
            }
            if (f171Q[4] == 3) {
                f171Q[3] = f171Q[9] + (f171Q[18] >> 8);
            } else if (f171Q[4] != 7) {
                if (f171Q[4] == 1) {
                    f171Q[3] = f171Q[9] + 8 + (((m429a(f171Q[5]) * i3) / 100) - i3);
                } else {
                    f171Q[3] = f171Q[9] + (((m429a(f171Q[5]) * i3) / 100) - i3);
                }
            }
        }
        if (c == 2) {
            f171Q[3] = f171Q[9];
        }
        if (c == 2 && f171Q[13] != 0) {
            f171Q[3] = f171Q[9] + 15;
            if (f171Q[16] == 0) {
                f171Q[16] = 1;
            }
        }
        f171Q[13] = 0;
        int i4 = 999;
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[17], f171Q[18], this.f403i[c], f42b[25][c][0]);
        if (m411a >= 0) {
            if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - this.f403i[c]) - 12) << 8;
                f190Y[10] = 0;
                i2 = -99;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + this.f403i[c]) + 12) + 1) << 8;
                f190Y[10] = 0;
                i2 = -99;
                if (f166c[3]) {
                    m5y();
                }
            }
        }
        for (int i5 = 0; i5 < f42b[25][c].length; i5++) {
            int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 2, 13, (f171Q[2] - f42b[25][c].length) + (i5 << 1), f171Q[3] - f42b[25][c][i5], (f171Q[17] - f42b[25][c].length) + (i5 << 1), f171Q[18] - f42b[25][c][i5], 1, 1);
            if (m411a2 >= 0 && m411a2 == 0 && i4 > Math.abs(m280b() - ((f171Q[2] - f42b[25][c].length) + (i5 << 1)))) {
                i4 = Math.abs(m280b() - ((f171Q[2] - f42b[25][c].length) + (i5 << 1)));
                i2 = i5;
            }
            if (i2 != -99 && 8 >= Math.abs(m280b() - ((f171Q[2] - f42b[25][c].length) + (i5 << 1))) && m204c() - (f171Q[3] - f42b[25][c][i5]) >= -1 && m204c() - (f171Q[3] - f42b[25][c][i5]) <= 64 && i4 > Math.abs(m280b() - ((f171Q[2] - f42b[25][c].length) + (i5 << 1)))) {
                i4 = Math.abs(m280b() - ((f171Q[2] - f42b[25][c].length) + (i5 << 1)));
                i2 = i5;
            }
        }
        if (f171Q[16] != 0) {
            int[] iArr2 = f171Q;
            iArr2[16] = iArr2[16] + 1;
            if (f171Q[16] == 60) {
                f171Q[15] = this.f318f - 1;
            }
            if (f171Q[16] >= 60) {
                boolean z = false;
                int i6 = 0;
                while (true) {
                    if (i6 >= 8) {
                        break;
                    }
                    int i7 = this.f318f - f171Q[15];
                    int i8 = i7;
                    int i9 = i7 - 1;
                    int i10 = i9;
                    if (i9 < 0) {
                        i10 = 0;
                    }
                    if ((i6 << 3) < i8) {
                        int i11 = i6 << 3;
                        i8 = i11;
                        i10 = i11;
                        z = true;
                    }
                    if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, (f171Q[2] + (i8 << 1)) - 56, f171Q[3] - f42b[25][c][i8], (f171Q[17] + (i10 << 1)) - 56, f171Q[18] - f42b[25][c][i10], 6, 6) >= 0) {
                        m488F();
                        break;
                    }
                    i6++;
                }
                if (z && this.f318f - f171Q[15] < 60 && (this.f318f - f171Q[15]) % 8 == 0 && f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                    m391a("c8");
                }
            }
        }
        boolean z2 = true;
        if (i4 != 999 && (!this.f370p || f190Y[5] >= 0)) {
            f190Y[1] = ((f171Q[3] - f42b[25][c][i2]) + 4) << 8;
            m129d(f171Q[2], f42b[25][c].length);
            m81i(f171Q[22]);
            z2 = false;
            if (c == 2) {
                f171Q[13] = 1;
            }
        }
        if (f33D && f35av == f171Q[20] && z2) {
            f33D = false;
        }
    }

    /* renamed from: aJ */
    private void m358aJ(int i) {
        int i2 = 56;
        boolean z = false;
        boolean z2 = false;
        m108e(f171Q[8], f171Q[9], 0);
        f171Q[7] = f171Q[3];
        if (f171Q[4] == 128) {
            if (f171Q[18] == 0) {
                f171Q[3] = f171Q[9] + 112;
            }
            f171Q[18] = 1;
            if (f176d[128] || f176d[129]) {
                if (f171Q[3] > f171Q[9]) {
                    z = true;
                    int[] iArr = f171Q;
                    iArr[3] = iArr[3] - 1;
                }
            } else if (f171Q[3] < f171Q[9] + 112) {
                int[] iArr2 = f171Q;
                iArr2[3] = iArr2[3] + 2;
                if (f171Q[3] >= f171Q[9] + 112) {
                    f171Q[3] = f171Q[9] + 112;
                    if (f171Q[2] - f179T[0] >= -56 && f171Q[2] - f179T[0] <= 296 && f171Q[3] - f179T[1] >= -12 && f171Q[3] - f179T[1] <= 180 + ((f171Q[3] + 12) - f171Q[9])) {
                        m391a("bd");
                    }
                }
            }
            int[][] m422a = m422a(10, 0);
            for (int i3 = 0; i3 < m422a.length; i3++) {
                if ((f171Q[2] - 56) - (m422a[i3][2] - 16) <= 32 && (f171Q[2] - 56) - (m422a[i3][2] - 16) >= -112 && f176d[128] && f171Q[3] < f171Q[9] + 16) {
                    f171Q[3] = f171Q[9] + 16;
                    z2 = true;
                }
            }
            if (z && !z2 && f171Q[2] - f179T[0] >= -56 && f171Q[2] - f179T[0] <= 296 && f171Q[3] - f179T[1] >= -12 && f171Q[3] - f179T[1] <= 180 + ((f171Q[3] + 12) - f171Q[9])) {
                m391a("c7");
            }
        } else {
            int i4 = 160;
            if (f171Q[4] == 17) {
                i2 = 48;
            } else if (f171Q[4] == 2) {
                i2 = 56;
                i4 = 80;
            } else if (f171Q[4] == 35) {
                i2 = 16;
                i4 = 120;
            } else if (f171Q[4] == 18) {
                i2 = 48;
                i4 = 80;
            }
            if (f171Q[5] == 0) {
                if (f171Q[3] < f171Q[9] + i4) {
                    int[] iArr3 = f171Q;
                    iArr3[3] = iArr3[3] + 4;
                    if (f171Q[3] >= f171Q[9] + i4) {
                        f171Q[3] = f171Q[9] + i4;
                        f171Q[5] = 1;
                        if (f171Q[2] - f179T[0] >= (-i2) && f171Q[2] - f179T[0] <= 240 + i2 && f171Q[3] - f179T[1] >= -12 && f171Q[3] - f179T[1] <= 180 + ((f171Q[3] + 12) - f171Q[9])) {
                            m391a("bd");
                        }
                    }
                }
            } else if (f171Q[5] < 60) {
                int[] iArr4 = f171Q;
                iArr4[5] = iArr4[5] + 1;
            } else if (f171Q[3] > f171Q[9]) {
                if (f171Q[2] - f179T[0] >= (-i2) && f171Q[2] - f179T[0] <= 240 + i2 && f171Q[3] - f179T[1] >= -12 && f171Q[3] - f179T[1] <= 180 + ((f171Q[3] + 12) - f171Q[9])) {
                    m391a("c7");
                }
                int[] iArr5 = f171Q;
                iArr5[3] = iArr5[3] - 1;
                if (f171Q[3] == f171Q[9]) {
                    f171Q[5] = 0;
                }
            }
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[7], i2, 12);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - 12) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                if (f171Q[3] - 24 < f171Q[9]) {
                    m310al();
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                m310al();
                f190Y[1] = ((((f171Q[3] + 12) + 12) + 12) + 1) << 8;
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
        if (f171Q[4] == 35 || m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] + 32, f171Q[2], f171Q[7] + 32, 40, 14) < 0) {
            return;
        }
        m488F();
    }

    /* renamed from: aK */
    private void m356aK(int i) {
        if (this.f314b == 1 && this.f315c == 0 && f171Q[4] == 64 && f171Q[19] != 0) {
            return;
        }
        int i2 = 20;
        int i3 = 14;
        f171Q[7] = f171Q[3];
        f171Q[15] = f171Q[2];
        if (f171Q[4] == 64) {
            i2 = 64;
        } else if (f171Q[4] == 16) {
            i2 = 16;
            i3 = 19;
        }
        if (f171Q[4] == 48) {
            i2 = 30;
        } else if (f171Q[4] == 18) {
            i2 = 14;
            i3 = 20;
            int[] iArr = f171Q;
            iArr[6] = iArr[6] + 1;
            f171Q[5] = f171Q[6];
            if (f171Q[6] < 60) {
                f171Q[5] = 0;
            } else if (f171Q[6] < 68) {
                f171Q[5] = f171Q[6] - 60;
                if (f171Q[5] == 0 && f171Q[2] - f179T[0] >= -14 && f171Q[2] - f179T[0] <= 254 && f171Q[3] - f179T[1] >= -20 && f171Q[3] - f179T[1] <= 188) {
                    m391a("ab");
                }
            } else if (f171Q[6] < 128) {
                f171Q[5] = 8;
            } else if (f171Q[6] < 136) {
                f171Q[5] = 136 - f171Q[6];
            } else {
                f171Q[5] = 0;
                f171Q[6] = 0;
            }
            f171Q[2] = (f171Q[8] - (f171Q[5] << 2)) + 32;
        } else if (f171Q[4] == 32) {
            i2 = 8;
            i3 = 18;
        } else if (f171Q[4] == 82) {
            i2 = 18;
            i3 = 6;
            int[] iArr2 = f171Q;
            iArr2[6] = iArr2[6] + 1;
            f171Q[5] = f171Q[6];
            if (f171Q[6] < 60) {
                f171Q[5] = 0;
            } else if (f171Q[6] < 68) {
                f171Q[5] = f171Q[6] - 60;
                if (f171Q[5] == 0 && f171Q[2] - f179T[0] >= -18 && f171Q[2] - f179T[0] <= 258 && f171Q[3] - f179T[1] >= -6 && f171Q[3] - f179T[1] <= 174) {
                    m391a("ab");
                }
            } else if (f171Q[6] < 128) {
                f171Q[5] = 8;
            } else if (f171Q[6] < 136) {
                f171Q[5] = 136 - f171Q[6];
            } else {
                f171Q[5] = 0;
                f171Q[6] = 0;
            }
            f171Q[2] = (f171Q[8] - (f171Q[5] << 2)) + 32;
        } else if (f171Q[4] == 1) {
            i2 = 18;
            int[] iArr3 = f171Q;
            iArr3[6] = iArr3[6] + 1;
            f171Q[5] = f171Q[6];
            if (f171Q[6] < 60) {
                f171Q[5] = 0;
            } else if (f171Q[6] < 68) {
                f171Q[5] = f171Q[6] - 60;
                if (f171Q[5] == 0 && f171Q[2] - f179T[0] >= -18 && f171Q[2] - f179T[0] <= 258 && f171Q[3] - f179T[1] >= (-i3) && f171Q[3] - f179T[1] <= 168 + i3) {
                    m391a("ab");
                }
            } else if (f171Q[6] < 128) {
                f171Q[5] = 8;
            } else if (f171Q[6] < 136) {
                f171Q[5] = 136 - f171Q[6];
            } else {
                f171Q[5] = 0;
                f171Q[6] = 0;
            }
            f171Q[3] = (f171Q[9] - (f171Q[5] << 2)) + 32;
        }
        boolean z = false;
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[15], f171Q[7], i2, i3);
        if (m411a >= 0) {
            if (f171Q[4] == 82) {
                if (m411a == 1 || m411a == 2) {
                    m488F();
                    z = true;
                }
            } else if (f171Q[4] != 18 && f171Q[4] != 16) {
                if (m411a == 0 && f171Q[19] == 0) {
                    m485G();
                    z = true;
                } else if (m411a == 3 && f171Q[19] != 0) {
                    m488F();
                    z = true;
                }
                if (f171Q[19] != 0 && this.f314b == 1) {
                    if (m411a == 1) {
                        f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                        f190Y[10] = 0;
                        if (f190Y[3] > 0) {
                            f190Y[3] = 0;
                        }
                    } else if (m411a == 2) {
                        f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                        f190Y[10] = 0;
                        if (f190Y[3] < 0) {
                            f190Y[3] = 0;
                        }
                    }
                }
            } else if (m411a == 1 || m411a == 2) {
                m488F();
                z = true;
            }
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - i3) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                if (m272b(m280b(), m204c() - 32)) {
                    if (f190Y[12] == 0) {
                        f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                    } else {
                        f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                    }
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                f190Y[10] = 0;
                if (!z && f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (!z && f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + i3) + 12) + 12) + 1) << 8;
                if (f190Y[5] < 0) {
                    f190Y[5] = 0;
                }
                if (this.f314b == 0) {
                    int[] iArr4 = f190Y;
                    iArr4[1] = iArr4[1] + 4096;
                }
            }
        }
        if (z && !this.f370p && f18ag <= 0 && f21aj <= 0 && f19ah <= 0 && f171Q[2] - f179T[0] >= (-i2) && f171Q[2] - f179T[0] <= 240 + i2 && f171Q[3] - f179T[1] >= (-i3) && f171Q[3] - f179T[1] <= 168 + i3) {
            m391a("a6");
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aL */
    private void m354aL(int i) {
        int i2 = -1;
        boolean z = false;
        f171Q[15] = f171Q[2];
        f171Q[16] = f171Q[3];
        int i3 = f171Q[4] == 129 ? 64 : 16;
        int i4 = f171Q[2];
        if (f171Q[5] != 0 && f171Q[10] == 0) {
            int[] iArr = f171Q;
            iArr[3] = iArr[3] + 2;
            if (m128d((f171Q[2] - i3) + 1, f171Q[3] + 16) || m128d((f171Q[2] + i3) - 1, f171Q[3] + 16)) {
                f171Q[5] = 0;
                if (f171Q[4] == 0) {
                    f171Q[6] = 1;
                }
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            if (f171Q[8] == this.f404j[i5] && f171Q[9] == this.f405k[i5]) {
                i2 = i5;
                break;
            }
            i5++;
        }
        if (f171Q[5] == 0 && i2 != -1 && f171Q[10] == 0 && Math.abs(f171Q[2] - this.f406l[i2]) <= 16 && Math.abs(f171Q[3] - this.f407m[i2]) <= 16) {
            f171Q[10] = 1;
        }
        if (f171Q[17] == 0 && f171Q[10] > 0 && f171Q[3] < this.f407m[i2]) {
            int[] iArr2 = f171Q;
            iArr2[3] = iArr2[3] + 2;
            if (f171Q[3] > this.f407m[i2]) {
                f171Q[3] = this.f407m[i2];
            }
        }
        if (f171Q[17] == 0) {
            if (f171Q[10] >= 1 && f171Q[10] < 15) {
                int[] iArr3 = f171Q;
                iArr3[10] = iArr3[10] + 1;
            } else if (f171Q[10] == 15) {
                int[] iArr4 = f171Q;
                iArr4[2] = iArr4[2] + this.f408n[i2];
            } else if (f171Q[10] >= 16) {
                int[] iArr5 = f171Q;
                iArr5[10] = iArr5[10] + 1;
                if (f171Q[10] >= 46 && f171Q[10] - 48 <= 96 && f171Q[10] % 2 == 0) {
                    int[] iArr6 = f171Q;
                    iArr6[3] = iArr6[3] + 1;
                }
            }
        } else if (this.f408n[i2] < 0) {
            if (f171Q[18] < f171Q[2]) {
                int[] iArr7 = f171Q;
                iArr7[2] = iArr7[2] + this.f408n[i2];
            }
        } else if (f171Q[18] > f171Q[2]) {
            int[] iArr8 = f171Q;
            iArr8[2] = iArr8[2] + this.f408n[i2];
        }
        f171Q[17] = 0;
        if (f171Q[4] != 129 && this.f314b == 2) {
            if (this.f314b == 2 && this.f315c == 0 && f171Q[4] == 0) {
                int[][] m422a = m422a(8, 128);
                for (int i6 = 0; i6 < m422a.length; i6++) {
                    if ((m422a[i6][2] - 56) - (f171Q[2] - 16) <= 32 && (m422a[i6][2] - 56) - (f171Q[2] - 16) >= -112) {
                        f171Q[3] = m422a[i6][3] - 28;
                    }
                }
                int[][] m422a2 = m422a(15, 128);
                f176d[129] = false;
                for (int i7 = 0; i7 < m422a2.length; i7++) {
                    if ((m422a2[i7][2] - 8) - (f171Q[2] - 16) <= 32 && (m422a2[i7][2] - 8) - (f171Q[2] - 16) >= -32 && (m422a2[i7][3] - 8) - (f171Q[3] - 16) <= 32 && (m422a2[i7][3] - 8) - (f171Q[3] - 16) >= -32) {
                        f176d[129] = true;
                        f286g[129] = true;
                    }
                }
            }
            if (f171Q[4] != 0) {
                int[][] m422a3 = m422a(9, 16);
                for (int i8 = 0; i8 < m422a3.length; i8++) {
                    if ((m422a3[i8][2] - 20) - (f171Q[2] - 16) <= 32 && (m422a3[i8][2] - 20) - (f171Q[2] - 16) >= -40 && (m422a3[i8][3] - 20) - (f171Q[3] - 16) <= 32 && (m422a3[i8][3] - 20) - (f171Q[3] - 16) >= -40 && f171Q[10] == 15) {
                        f171Q[10] = 16;
                    }
                }
            }
            if (f171Q[4] == 2) {
                int[][] m422a4 = m422a(77, 16);
                int i9 = 0;
                while (true) {
                    if (i9 >= m422a4.length) {
                        break;
                    }
                    if (((m422a4[i9][2] - 20) - 64) - (f171Q[2] - 16) <= 32 && ((m422a4[i9][2] - 20) - 64) - (f171Q[2] - 16) >= -112 && (((m422a4[i9][3] - 48) + 16) - 16) - (f171Q[3] - 16) <= 32 && (((m422a4[i9][3] - 48) + 16) - 16) - (f171Q[3] - 16) >= -32 && m422a4[i9][5] > 1 && m422a4[i9][5] / 4 < 26) {
                        f171Q[3] = ((m422a4[i9][3] - 48) + 16) - 16;
                        f171Q[18] = (m422a4[i9][2] - 10) + 16;
                        f171Q[17] = 1;
                        break;
                    }
                    i9++;
                }
            }
        }
        int i10 = i4 - f171Q[2];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[15], f171Q[16], i3, 16);
        if (m411a >= 0) {
            if (m411a == 0) {
                int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] - 16, f171Q[15], f171Q[16] - 16, i3, 2);
                if (m411a2 == 1) {
                    if (((f166c[4] && f171Q[5] == 0) || f171Q[4] == 129 || f171Q[4] == 0) && f171Q[10] == 0) {
                        int[] iArr9 = f171Q;
                        iArr9[2] = iArr9[2] + 1;
                        if (m128d(f171Q[2] + i3, f171Q[3] - 16)) {
                            int[] iArr10 = f171Q;
                            iArr10[2] = iArr10[2] - 1;
                        }
                    }
                } else if (m411a2 == 2 && (((f166c[3] && f171Q[5] == 0) || f171Q[4] == 129 || f171Q[4] == 0) && f171Q[10] == 0)) {
                    int[] iArr11 = f171Q;
                    iArr11[2] = iArr11[2] - 1;
                    if (m128d(f171Q[2] - i3, f171Q[3] - 16)) {
                        int[] iArr12 = f171Q;
                        iArr12[2] = iArr12[2] + 1;
                    }
                }
                f190Y[1] = (f171Q[3] - 16) << 8;
                m129d(f171Q[2], i3);
                m81i(f171Q[22]);
                z = true;
                int[] iArr13 = f190Y;
                iArr13[0] = iArr13[0] - (i10 << 8);
            }
            if (m411a == 1) {
                if (f166c[4] && (f171Q[5] == 0 || f171Q[4] == 129 || f171Q[4] == 0)) {
                    if (f171Q[10] == 0) {
                        m391a("a7");
                        int[] iArr14 = f171Q;
                        iArr14[2] = iArr14[2] + 1;
                        f171Q[7] = 1;
                        if (m128d(f171Q[2] + i3, (f171Q[3] + 16) - 1)) {
                            int[] iArr15 = f171Q;
                            iArr15[2] = iArr15[2] - 1;
                        }
                        if (f171Q[4] == 129 && f171Q[2] > f171Q[8] + 64) {
                            f171Q[2] = f171Q[8] + 64;
                        }
                    }
                    m5y();
                }
                f190Y[0] = ((f171Q[2] - i3) - 12) << 8;
                f190Y[10] = 0;
                m102f();
                m133d();
            }
            if (m411a == 2) {
                if (f166c[3] && (f171Q[5] == 0 || f171Q[4] == 129 || f171Q[4] == 0)) {
                    if (f171Q[10] == 0) {
                        m391a("a7");
                        int[] iArr16 = f171Q;
                        iArr16[2] = iArr16[2] - 1;
                        f171Q[7] = -1;
                        if (m128d(f171Q[2] - i3, (f171Q[3] + 16) - 1)) {
                            int[] iArr17 = f171Q;
                            iArr17[2] = iArr17[2] + 1;
                        }
                    }
                    m5y();
                }
                f190Y[0] = (((f171Q[2] + i3) + 12) + 1) << 8;
                f190Y[10] = 0;
                m114e();
                m202c();
            }
            if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
                m310al();
            }
        }
        if (!m128d((f171Q[2] - i3) + 1, f171Q[3] + 16) && !m128d((f171Q[2] + i3) - 1, f171Q[3] + 16)) {
            int[] iArr18 = f171Q;
            iArr18[5] = iArr18[5] + 1;
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
        if (z) {
            m86h(f171Q[2], f171Q[3], f171Q[4]);
        } else {
            m74j(f171Q[2], f171Q[3], f171Q[4]);
        }
    }

    /* renamed from: aM */
    private void m352aM(int i) {
        m99f(f171Q[2], f171Q[3], f171Q[4]);
        if (f171Q[4] == 2 || f171Q[4] == 10) {
            if (f171Q[5] == 2) {
                f171Q[3] = f171Q[11] + ((m429a(this.f319g) * 6) / 100) + 6;
            } else if (f171Q[5] == 1) {
                int[] iArr = f171Q;
                iArr[10] = iArr[10] + 1;
                int[] iArr2 = f171Q;
                iArr2[3] = iArr2[3] + f171Q[10];
                if (m128d((f171Q[2] - 16) + 1, f171Q[3] + 16) || m128d((f171Q[2] + 16) - 1, f171Q[3] + 16)) {
                    if ((f171Q[8] == 4016 && f171Q[9] == 1296) || (f171Q[8] == 3920 && f171Q[9] == 1328)) {
                        f171Q[5] = 0;
                    } else {
                        f171Q[5] = 2;
                    }
                    int[] iArr3 = f171Q;
                    iArr3[3] = iArr3[3] - ((f171Q[3] + 16) % 16);
                    f171Q[11] = f171Q[3];
                }
            } else if (f171Q[3] < m204c() && f171Q[2] - 100 < m280b()) {
                f171Q[10] = 1;
                f171Q[5] = 1;
            }
        } else if (f171Q[4] == 1) {
            f171Q[3] = (f171Q[9] + ((m429a(f171Q[5]) << 3) / 100)) - 8;
            int[] iArr4 = f171Q;
            iArr4[5] = iArr4[5] + 6;
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 16, 16);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - 16) << 8;
                m129d(f171Q[2], 16);
                m81i(f171Q[22]);
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 16) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
                m310al();
            } else if (m411a == 4 && f35av != f171Q[20]) {
                if (m280b() < f171Q[2]) {
                    f190Y[0] = ((f171Q[2] - 16) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else {
                    f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aN */
    private void m350aN(int i) {
        if (this.f315c == 3) {
            return;
        }
        int i2 = 48;
        int i3 = 16;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        if (f171Q[4] == 57) {
            i2 = 63;
            i3 = 8;
        } else if (f171Q[4] == 40) {
            i2 = 32;
            i3 = 8;
        }
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[4] == 7 || f171Q[4] == 4) {
            i2 = 16;
            i3 = 8;
            if (this.f314b == 1 && this.f315c == 0 && f176d[2]) {
                f171Q[5] = 1;
            }
            if (this.f314b == 1 && this.f315c == 3) {
                f171Q[5] = 1;
            }
            if (f171Q[10] == 1) {
                int i6 = f171Q[2];
                int[] iArr = f171Q;
                iArr[2] = iArr[2] + 1;
                if (f171Q[4] == 7) {
                    if (m128d(f171Q[2] + 16, ((f171Q[3] + 8) - 1) - 16)) {
                        int[] iArr2 = f171Q;
                        iArr2[2] = iArr2[2] - 1;
                        f171Q[10] = 2;
                    }
                } else if (Math.abs(f171Q[2] - f171Q[8]) >= 96) {
                    f171Q[2] = f171Q[8] + 96;
                    f171Q[10] = 2;
                }
                i5 = i6 - f171Q[2];
            } else if (f171Q[10] == 2) {
                int[] iArr3 = f171Q;
                iArr3[3] = iArr3[3] + 5;
                if (m128d((f171Q[2] - 16) + 1, f171Q[3] + 8) || m128d((f171Q[2] + 16) - 1, f171Q[3] + 8)) {
                    f171Q[5] = 0;
                    int[] iArr4 = f171Q;
                    iArr4[3] = iArr4[3] - ((f171Q[3] + 8) % 16);
                    f171Q[10] = 3;
                }
            }
        }
        if (f171Q[4] == 1) {
            i2 = 16;
            i3 = 16;
            int i7 = f171Q[2];
            if (this.f319g % 384 <= 144) {
                f171Q[2] = f171Q[8] - ((this.f319g % 384) / 3);
            } else if (this.f319g % 384 > 240) {
                f171Q[2] = f171Q[8] - (48 - (((this.f319g % 384) / 3) - 80));
            }
            i5 = i7 - f171Q[2];
        } else if (f171Q[4] == 2) {
            i2 = 16;
            i3 = 16;
            f171Q[3] = f171Q[9] + 9;
            if (f171Q[10] != 0) {
                int i8 = f171Q[2];
                int[] iArr5 = f171Q;
                iArr5[2] = iArr5[2] + 1;
                if (m128d(f171Q[2] + 16, ((f171Q[3] + 16) - 1) - 16)) {
                    int[] iArr6 = f171Q;
                    iArr6[2] = iArr6[2] - 1;
                }
                i5 = i8 - f171Q[2];
            }
        } else if (f171Q[4] == 65) {
            int i9 = f171Q[2];
            f171Q[2] = ((f171Q[8] + ((m429a(this.f319g) * 48) / 100)) - 32) - 48;
            f171Q[3] = f171Q[9] + 8;
            i4 = 32;
            i2 = 47;
            i5 = i9 - f171Q[2];
        } else if (f171Q[4] == 57) {
            if (f171Q[10] != 0) {
                int[] iArr7 = f171Q;
                iArr7[10] = iArr7[10] + 1;
            }
            if (f171Q[10] > 5) {
                int i10 = f171Q[2];
                if (f171Q[19] == 0) {
                    if (this.f319g - f171Q[11] <= 32) {
                        f171Q[2] = f171Q[8] + ((this.f319g - f171Q[11]) << 2);
                    } else if (this.f319g - f171Q[11] >= 500 && this.f319g - f171Q[11] < 532) {
                        f171Q[2] = f171Q[8] + (128 - (((this.f319g - f171Q[11]) - 500) << 2));
                    }
                } else if (this.f319g - f171Q[11] <= 32) {
                    f171Q[2] = f171Q[8] - ((this.f319g - f171Q[11]) << 2);
                } else if (this.f319g - f171Q[11] >= 500 && this.f319g - f171Q[11] < 532) {
                    f171Q[2] = f171Q[8] - (128 - (((this.f319g - f171Q[11]) - 500) << 2));
                }
                if (this.f319g - f171Q[11] >= 532) {
                    f171Q[10] = 0;
                    f171Q[11] = 0;
                    f171Q[2] = f171Q[8];
                }
                i5 = i10 - f171Q[2];
            } else {
                f171Q[2] = f171Q[8];
            }
        } else if (f171Q[4] == 40) {
            if ((this.f319g >> 1) % 256 < 128) {
                f171Q[3] = f171Q[9] - ((this.f319g >> 1) % 256);
            } else {
                f171Q[3] = f171Q[9] - (128 - (((this.f319g >>> 1) % 256) - 128));
            }
        }
        int i11 = -1;
        if ((f171Q[4] != 7 && f171Q[4] != 4) || f171Q[5] != 0) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + i4, f171Q[3] + 0, f171Q[6] + i4, f171Q[7] + 0, i2, i3);
            i11 = m411a;
            if (m411a >= 0 && i11 == 0) {
                f190Y[1] = ((f171Q[3] - i3) + 0) << 8;
                if (f171Q[4] == 2 || f171Q[4] == 1 || f171Q[4] == 65) {
                    if (f171Q[10] == 0) {
                        f171Q[10] = 1;
                        f171Q[11] = this.f319g;
                    }
                    int[] iArr8 = f190Y;
                    iArr8[0] = iArr8[0] - (i5 << 8);
                }
                if (f171Q[4] == 57) {
                    if ((f171Q[2] + i4) - i2 <= m280b() && m280b() <= f171Q[2] + i4 + i2 && f171Q[10] == 0) {
                        f171Q[10] = 1;
                        f171Q[11] = this.f319g;
                    }
                    int[] iArr9 = f190Y;
                    iArr9[0] = iArr9[0] - (i5 << 8);
                }
                if (f171Q[4] == 7 || f171Q[4] == 4) {
                    if (f171Q[5] == 1 && f171Q[10] == 0) {
                        f171Q[10] = 1;
                    }
                    int[] iArr10 = f190Y;
                    iArr10[0] = iArr10[0] - (i5 << 8);
                }
                m129d(f171Q[2] + i4, i2);
                m81i(f171Q[22]);
                if (f171Q[4] == 57) {
                    m114e();
                    m202c();
                    m102f();
                    m133d();
                    f34E = true;
                    this.f320e[0] = false;
                }
                z = true;
            }
        }
        if (f33D && f35av == f171Q[20] && i11 != 0) {
            f33D = false;
        }
        if (z) {
            m92g(f171Q[2], f171Q[3], f171Q[4]);
        } else {
            m80i(f171Q[2], f171Q[3], f171Q[4]);
        }
    }

    /* renamed from: aO */
    private void m348aO(int i) {
        int i2 = f171Q[2];
        if (f171Q[5] != 0) {
            int[] iArr = f171Q;
            iArr[5] = iArr[5] + 2;
            if (f171Q[5] > 1152) {
                f171Q[5] = 1152;
            }
            f171Q[2] = f171Q[5] + f171Q[8];
        } else if (f171Q[2] + 160 < m280b() && Math.abs((f171Q[3] - m204c()) + 12) < 43) {
            int[] iArr2 = f171Q;
            iArr2[5] = iArr2[5] + 1;
        }
        if (f171Q[2] + 96 > m280b() && Math.abs((f171Q[3] - m204c()) + 12) < 43) {
            m488F();
            if (f171Q[5] > 0 && m280b() + 300 < f171Q[2]) {
                f171Q[2] = m280b() + 300;
            }
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] - 96, f171Q[3], i2 - 96, f171Q[3], 120, 32);
        if (m411a < 0 || m411a == 0 || m411a == 1) {
            return;
        }
        if (m411a == 2) {
            f190Y[0] = ((((f171Q[2] + 120) - 96) + 12) + 1) << 8;
            f190Y[10] = 0;
        } else if (m411a == 3) {
            f190Y[1] = ((((f171Q[3] + 32) + 12) + 12) + 1) << 8;
            f190Y[5] = 0;
            m310al();
        }
    }

    /* renamed from: aP */
    private void m346aP(int i) {
        f171Q[5] = (this.f319g / 2) % 180;
        if (f171Q[5] == 0) {
            f171Q[10] = 0;
            if (f171Q[2] - f179T[0] >= -32 && f171Q[2] - f179T[0] <= 272 && f171Q[3] - f179T[1] >= -368 && f171Q[3] - f179T[1] <= 200) {
                m391a("c8");
            }
        }
        f171Q[2] = f171Q[8];
        f171Q[3] = (f171Q[9] - 356) + (f171Q[5] << 3);
        if (Math.abs(m280b() - f171Q[2]) < 44 && f171Q[3] - (Math.min(f171Q[5] / 4, 6) * 32) < m204c() && Math.min(f171Q[3], f171Q[9]) > m204c() - 12) {
            m488F();
        }
        if (f171Q[10] != 0) {
            int[] iArr = f171Q;
            iArr[10] = iArr[10] + 1;
        } else if (f171Q[3] > f171Q[9]) {
            f171Q[10] = 1;
        }
    }

    /* renamed from: aQ */
    private void m344aQ(int i) {
        int i2 = 7;
        if (f176d[f171Q[4]]) {
            i2 = 0;
        }
        f176d[f171Q[4]] = false;
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 14, i2);
        if (m411a >= 0) {
            if (m411a == 0) {
                if (i2 == 7) {
                    m391a("cd");
                }
                f190Y[1] = (f171Q[3] - i2) << 8;
                f176d[f171Q[4]] = true;
                f286g[f171Q[4]] = true;
                m129d(f171Q[2], 14);
                m81i(f171Q[22]);
                if (this.f314b == 1 && this.f315c == 2) {
                    if (f171Q[4] == 15) {
                        f40b[2][6] = 7;
                    } else {
                        f40b[2][6] = 75;
                    }
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 14) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 14) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aR */
    private void m342aR(int i) {
        int i2 = 8;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = f171Q[2];
        boolean z = false;
        f171Q[11] = f171Q[2];
        f171Q[7] = f171Q[3] + f171Q[14];
        if (this.f314b == 4) {
            i2 = 16;
        }
        if (f171Q[4] == 5) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i4 = 64;
            z = true;
        } else if (f171Q[4] == 1) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i4 = -64;
            z = true;
        }
        if (f171Q[4] == 12) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i5 = 48;
        } else if (f171Q[4] == 11) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i5 = -48;
        } else if (f171Q[4] == 6) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i5 = 64;
        } else if (f171Q[4] == 2) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i5 = -64;
        } else if (f171Q[4] == 16) {
            f171Q[5] = ((this.f319g * 15) / 10) % 360;
            i3 = f171Q[5];
            i5 = -32;
        }
        if (f171Q[4] == 7) {
            if (f176d[128] && f171Q[5] <= 0) {
                int[] iArr = f171Q;
                iArr[5] = iArr[5] + 1;
            }
            if (f171Q[5] > 0) {
                int[] iArr2 = f171Q;
                iArr2[5] = iArr2[5] + 1;
                if (f171Q[5] > 90) {
                    int[] iArr3 = f171Q;
                    iArr3[3] = iArr3[3] - 2;
                    if (f171Q[3] < 368) {
                        f171Q[3] = 368;
                    }
                }
            }
            i3 = f171Q[5];
        } else if (f171Q[4] == 3 && f171Q[5] != 0) {
            int[] iArr4 = f171Q;
            iArr4[5] = iArr4[5] + 1;
            if (f171Q[5] > 40) {
                if (f171Q[5] > 300) {
                    f171Q[5] = 300;
                } else {
                    int[] iArr5 = f171Q;
                    iArr5[6] = iArr5[6] + 80;
                    int[] iArr6 = f171Q;
                    iArr6[18] = iArr6[18] + f171Q[6];
                }
            }
            i3 = f171Q[5];
        }
        m429a(i3);
        if (f171Q[4] == 3) {
            f171Q[3] = f171Q[9] + (f171Q[18] >> 8);
        } else if (f171Q[4] != 7) {
            f171Q[3] = f171Q[9] + ((m429a(i3) * i5) / 100);
            f171Q[2] = f171Q[8] + ((m429a(i3) * i4) / 100);
        }
        f171Q[14] = 0;
        if (f171Q[13] != 0) {
            f171Q[14] = 4;
        }
        f171Q[13] = 0;
        int i7 = i6 - f171Q[2];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] + f171Q[14] + 32, f171Q[11], f171Q[7] + 32, 32, 8);
        if (m411a >= 0 && m411a == 0) {
            if (z) {
                f190Y[0] = (m280b() - i7) << 8;
            }
            f190Y[1] = ((f171Q[3] - i2) + f171Q[14]) << 8;
            if (f171Q[4] == 3 && i3 == 0) {
                f171Q[5] = 1;
            }
            m129d(f171Q[2], 32);
            m81i(f171Q[22]);
            f171Q[13] = 1;
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
        int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], (f171Q[3] + f171Q[14]) - 4, f171Q[11], f171Q[7] - 4, 32, 4);
        if (m411a2 >= 0 && m411a2 != 3) {
            if (z) {
                f190Y[0] = (m280b() - i7) << 8;
            }
            f190Y[1] = ((f171Q[3] - i2) + f171Q[14]) << 8;
            if (f171Q[4] == 3 && i3 == 0) {
                f171Q[5] = 1;
            }
            m129d(f171Q[2], 32);
            m81i(f171Q[22]);
            f171Q[13] = 1;
        }
        if (f33D && f35av == f171Q[20] && m411a2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: aS */
    private void m340aS(int i) {
        m205bz(i);
    }

    /* renamed from: aT */
    private void m339aT(int i) {
        int i2 = -1;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        for (int i3 = 0; i3 < 2; i3++) {
            if (f171Q[10 + i3] != 1) {
                int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, (f171Q[2] - 8) + (i3 << 4), f171Q[3], (f171Q[6] - 8) + (i3 << 4), f171Q[7], 8, 32);
                i2 = m411a;
                if (m411a >= 0) {
                    if (i2 == 1) {
                        if (f196L || !f198N) {
                            f190Y[10] = 0;
                        } else if (f190Y[10] >= 300) {
                            m391a("c4");
                            int[] iArr = f190Y;
                            iArr[10] = iArr[10] - 10;
                            f171Q[10 + i3] = 1;
                            if (this.f314b == 0) {
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 330, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 300, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 320, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 310, 400, f171Q[4]);
                            } else {
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 330, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 300, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 320, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 310, 400, 0);
                            }
                        } else if (f190Y[10] <= -300) {
                            m391a("c4");
                            int[] iArr2 = f190Y;
                            iArr2[10] = iArr2[10] + 10;
                            f171Q[10 + i3] = 1;
                            if (this.f314b == 0) {
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 390, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 420, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 400, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 410, 400, f171Q[4]);
                            } else {
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 390, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 420, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 400, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 410, 400, 0);
                            }
                        } else {
                            f190Y[10] = 0;
                        }
                        if (f190Y[10] == 0) {
                            f190Y[0] = ((((f171Q[2] - 8) - 12) - 8) + (i3 << 4)) << 8;
                            if (f166c[4]) {
                                m5y();
                            }
                        }
                    } else if (i2 == 2) {
                        if (f196L || !f198N) {
                            f190Y[10] = 0;
                        } else if (f190Y[10] >= 300) {
                            m391a("c4");
                            int[] iArr3 = f190Y;
                            iArr3[10] = iArr3[10] - 10;
                            f171Q[10 + i3] = 1;
                            if (this.f314b == 0) {
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 330, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 300, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 320, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 310, 400, f171Q[4]);
                            } else {
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 330, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 300, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 320, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 310, 400, 0);
                            }
                        } else if (f190Y[10] <= -300) {
                            m391a("c4");
                            int[] iArr4 = f190Y;
                            iArr4[10] = iArr4[10] + 10;
                            f171Q[10 + i3] = 1;
                            if (this.f314b == 0) {
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 390, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 420, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 400, 400, f171Q[4]);
                                m413a(26, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 410, 400, f171Q[4]);
                            } else {
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), (f171Q[3] - 16) - 16, 390, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 16, 420, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 32, 400, 400, 0);
                                m413a(24, (f171Q[2] - 8) + (i3 << 4), ((f171Q[3] - 16) - 16) + 48, 410, 400, 0);
                            }
                        } else {
                            f190Y[10] = 0;
                        }
                        if (f190Y[10] == 0) {
                            f190Y[0] = (((((f171Q[2] + 8) + 12) + 1) - 8) + (i3 << 4)) << 8;
                            if (f166c[3]) {
                                m5y();
                            }
                        }
                    } else if (i2 == 3) {
                        f190Y[1] = ((((f171Q[3] + 32) + 12) + 12) + 1) << 8;
                        m310al();
                    }
                }
            }
        }
        if (f171Q[10] == 1 && f171Q[11] == 1) {
            f171Q[0] = 0;
        }
        if (f33D && f35av == f171Q[20] && i2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: aU */
    private void m338aU(int i) {
        int m429a = (m429a(((this.f318f % 360) * 3) + (f171Q[4] * 90)) * 80) / 100;
        int m276b = (m276b(((this.f318f % 360) * 3) + (f171Q[4] * 90)) * 80) / 100;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[4] <= 3) {
            f171Q[2] = f171Q[8] + m429a;
            f171Q[3] = f171Q[9] - m276b;
        } else {
            f171Q[2] = f171Q[8] + m429a;
            f171Q[3] = f171Q[9] + m276b;
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 24, 8);
        if (m411a >= 0 && m411a == 0) {
            f190Y[1] = (f171Q[3] - 8) << 8;
            int[] iArr = f190Y;
            iArr[0] = iArr[0] + ((f171Q[2] - f171Q[6]) << 8);
            m129d(f171Q[2], 24);
            m81i(f171Q[22]);
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aV */
    private void m337aV(int i) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        f171Q[10] = this.f319g;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int i4 = this.f314b == 3 ? 7 : 8;
        for (int i5 = 0; i5 < 8; i5++) {
            if (f171Q[15] != 0) {
                int i6 = (this.f319g - f171Q[16]) - this.f410p[i5];
                i2 = i6;
                if (i6 < 0) {
                    i2 = 0;
                }
            }
            i3 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + ((((this.f409o[i5] % 4) << 4) - 16) - 8), f171Q[3] + ((this.f409o[i5] >> 2) << 4) + (i2 * (i2 / 5)), f171Q[6] + ((((this.f409o[i5] % 4) << 4) - 16) - 8), f171Q[7] + ((this.f409o[i5] >> 2) << 4) + (i2 * (i2 / 5)), 8, i4);
            if (i2 != 0) {
                i3 = -1;
            }
            if (i3 >= 0) {
                if (this.f314b == 3 && ((i3 == 1 || i3 == 2) && m204c() < f171Q[3] + (i4 >> 1))) {
                    i3 = 0;
                }
                if (i3 == 0) {
                    z = true;
                    f190Y[1] = ((f171Q[3] + (((this.f409o[i5] >> 2) << 4) + (i2 * 5))) - i4) << 8;
                    m129d(f171Q[2] + ((((this.f409o[i5] % 4) << 4) - 16) - 8), 8);
                    m81i(f171Q[22]);
                    if (f171Q[15] == 0) {
                        f171Q[16] = this.f319g;
                    }
                    f171Q[15] = 1;
                } else if (i3 == 1) {
                    f190Y[0] = (((f171Q[2] + ((((this.f409o[i5] % 4) << 4) - 16) - 8)) - 8) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else if (i3 == 2) {
                    f190Y[0] = ((((f171Q[2] + ((((this.f409o[i5] % 4) << 4) - 16) - 8)) + 8) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                }
            }
        }
        if (z) {
            i3 = 0;
        }
        if (f33D && f35av == f171Q[20] && i3 != 0) {
            f33D = false;
        }
    }

    /* renamed from: aW */
    private void m336aW(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        if (Math.abs(m280b() - f171Q[2]) > 320) {
            f171Q[5] = 0;
            f171Q[18] = 0;
        }
        if (f171Q[18] > 0) {
            int[] iArr = f171Q;
            iArr[18] = iArr[18] + 1;
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (f171Q[10 + i5] == 0) {
                f171Q[10 + i5] = f171Q[3];
            }
            if (f171Q[19] == 1) {
                if (f171Q[5] > 0 && i5 == 0 && (f171Q[18] > 30 || f171Q[18] < 0)) {
                    f171Q[18] = -1;
                    int[] iArr2 = f171Q;
                    iArr2[5] = iArr2[5] + 1;
                    if (f171Q[5] > 188) {
                        f171Q[5] = 188;
                    }
                }
                if (f171Q[5] > 60) {
                    i3 = i5 << 5;
                    i2 = ((f171Q[5] - 60) >> 2) * (i5 + 1);
                    i4 = f171Q[10 + i5];
                } else {
                    i3 = i5 << 5;
                    i2 = 0;
                    i4 = f171Q[10 + i5];
                }
            } else if (f171Q[19] == 0) {
                if (f171Q[5] > 0 && i5 == 0 && (f171Q[18] > 30 || f171Q[18] < 0)) {
                    f171Q[18] = -1;
                    int[] iArr3 = f171Q;
                    iArr3[5] = iArr3[5] + 1;
                    if (f171Q[5] > 188) {
                        f171Q[5] = 188;
                    }
                }
                if (f171Q[5] > 60) {
                    i3 = i5 << 5;
                    i2 = ((f171Q[5] - 60) >> 2) * (4 - i5);
                    i4 = f171Q[10 + i5];
                } else {
                    i3 = i5 << 5;
                    i2 = 0;
                    i4 = f171Q[10 + i5];
                }
            }
            f171Q[10 + i5] = f171Q[3] + i2;
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + i3, f171Q[3] + i2, f171Q[2] + i3, i4, 16, 16);
            if (m411a >= 0) {
                if (m411a == 0) {
                    f190Y[1] = ((f171Q[3] - 16) + i2) << 8;
                    if (f171Q[4] == 0 && f171Q[5] == 0) {
                        int[] iArr4 = f171Q;
                        iArr4[5] = iArr4[5] + 1;
                        f171Q[18] = -1;
                    }
                    m129d(f171Q[2] + i3, 16);
                    m81i(f171Q[22]);
                    z = true;
                } else if (m411a == 1) {
                    f190Y[0] = (((f171Q[2] - 16) + i3) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else if (m411a == 2) {
                    f190Y[0] = ((((f171Q[2] + 16) + i3) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                } else if (m411a == 3) {
                    f190Y[1] = (((((f171Q[3] + 16) + i2) + 12) + 12) + 1) << 8;
                    m310al();
                    if (f171Q[4] == 2 && f171Q[5] == 0) {
                        f171Q[5] = 60;
                        if (f171Q[18] == 0) {
                            f171Q[18] = 1;
                        }
                    }
                }
            }
        }
        boolean z2 = z ? false : true;
        if (f33D && f35av == f171Q[20] && z2) {
            f33D = false;
        }
    }

    /* renamed from: aX */
    private void m335aX(int i) {
        if (this.f314b == 3 && (f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53)) {
            return;
        }
        int i2 = 0;
        int m280b = f171Q[2] - m280b();
        int abs = Math.abs(((f171Q[3] - 64) + 16) - (m204c() - 24));
        if (f171Q[4] == 2) {
            f171Q[5] = this.f318f;
        } else if ((this.f318f / 30) % 2 == 0) {
            f171Q[5] = this.f318f;
        }
        if (f171Q[4] == 0) {
            if ((this.f318f / 30) % 2 == 0) {
                if (f171Q[19] != 0) {
                    if (abs <= 64) {
                        if (m280b >= -64 && m280b <= 64) {
                            while (i2 < 16 && m280b >= -64 && m280b <= 64) {
                                int[] iArr = f190Y;
                                iArr[0] = iArr[0] + 256;
                                m280b = f171Q[2] - m280b();
                                i2++;
                            }
                        }
                        if (m280b <= -64 && m280b >= -128) {
                            int i3 = 4;
                            if (f190Y[10] / 2 > 1024) {
                                i3 = (f190Y[10] / 2) >> 8;
                            }
                            while (i2 < i3 && m280b <= -64 && m280b >= -128) {
                                int[] iArr2 = f190Y;
                                iArr2[0] = iArr2[0] + 256;
                                m280b = f171Q[2] - m280b();
                                i2++;
                            }
                        }
                    }
                } else if (abs <= 64) {
                    if (m280b <= 64 && m280b >= -64) {
                        while (i2 < 16 && m280b <= 64 && m280b >= -64) {
                            int[] iArr3 = f190Y;
                            iArr3[0] = iArr3[0] - 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                    if (m280b >= 64 && m280b <= 128) {
                        int i4 = 4;
                        if (f190Y[10] / 2 > 1024) {
                            i4 = (f190Y[10] / 2) >> 8;
                        }
                        while (i2 < i4 && m280b >= 64 && m280b <= 128) {
                            int[] iArr4 = f190Y;
                            iArr4[0] = iArr4[0] - 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                }
            }
        } else if (f171Q[4] == 1) {
            if ((this.f318f / 30) % 2 == 0) {
                if (f171Q[19] == 0) {
                    if (abs <= 64) {
                        if (m280b >= -64 && m280b <= 64) {
                            while (i2 < 16 && m280b >= -64 && m280b <= 64) {
                                int[] iArr5 = f190Y;
                                iArr5[0] = iArr5[0] + 256;
                                m280b = f171Q[2] - m280b();
                                i2++;
                            }
                        }
                        if (m280b <= -64 && m280b >= -128) {
                            int i5 = 4;
                            if (f190Y[10] / 2 > 1024) {
                                i5 = (f190Y[10] / 2) >> 8;
                            }
                            while (i2 < i5 && m280b <= -64 && m280b >= -128) {
                                int[] iArr6 = f190Y;
                                iArr6[0] = iArr6[0] + 256;
                                m280b = f171Q[2] - m280b();
                                i2++;
                            }
                        }
                    }
                } else if (abs <= 64) {
                    if (m280b <= 64 && m280b >= -128) {
                        while (i2 < 16 && m280b <= 64 && m280b >= -128) {
                            int[] iArr7 = f190Y;
                            iArr7[0] = iArr7[0] - 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                    if (m280b >= 64 && m280b <= 128) {
                        int i6 = 4;
                        if (f190Y[10] / 2 > 1024) {
                            i6 = (f190Y[10] / 2) >> 8;
                        }
                        while (i2 < i6 && m280b >= 64 && m280b <= 128) {
                            int[] iArr8 = f190Y;
                            iArr8[0] = iArr8[0] - 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                }
            }
        } else if (f171Q[4] == 2) {
            if (f171Q[19] != 0) {
                if (abs <= 64) {
                    if (m280b >= -64 && m280b <= 64) {
                        while (i2 < 16 && m280b >= -64 && m280b <= 64) {
                            int[] iArr9 = f190Y;
                            iArr9[0] = iArr9[0] + 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                    if (m280b <= -64 && m280b >= -128) {
                        int i7 = 4;
                        if (f190Y[10] / 2 > 1024) {
                            i7 = (f190Y[10] / 2) >> 8;
                        }
                        while (i2 < i7 && m280b <= -64 && m280b >= -128) {
                            int[] iArr10 = f190Y;
                            iArr10[0] = iArr10[0] + 256;
                            m280b = f171Q[2] - m280b();
                            i2++;
                        }
                    }
                }
            } else if (f171Q[19] == 0 && abs <= 64) {
                if (m280b <= 64 && m280b >= -64) {
                    while (i2 < 16 && m280b <= 64 && m280b >= -64) {
                        int[] iArr11 = f190Y;
                        iArr11[0] = iArr11[0] - 256;
                        m280b = f171Q[2] - m280b();
                        i2++;
                    }
                }
                if (m280b >= 64 && m280b <= 128) {
                    int i8 = 4;
                    if (f190Y[10] / 2 > 1024) {
                        i8 = (f190Y[10] / 2) >> 8;
                    }
                    while (i2 < i8 && m280b >= 64 && m280b <= 128) {
                        int[] iArr12 = f190Y;
                        iArr12[0] = iArr12[0] - 256;
                        m280b = f171Q[2] - m280b();
                        i2++;
                    }
                }
            }
        }
        m114e();
        m202c();
        m102f();
        m133d();
    }

    /* renamed from: aY */
    private void m334aY(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int i2 = (f171Q[4] == 33 || f171Q[4] == 225) ? 56 : 128;
        int i3 = (f171Q[4] == 32 || f171Q[4] == 33) ? 2 : (f171Q[4] == 224 || f171Q[4] == 225) ? -2 : 3;
        int i4 = 0;
        if (f196L && f17af != 0) {
            i4 = 0 + ((m429a(f17af) * 20) / 100);
        }
        int m411a = m411a(m280b() + i4, m204c() - 12, f170P[0] + i4, f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], i2, 16);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - 16) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                if (Math.abs(f171Q[2] - m280b()) < i2 - 12) {
                    int[] iArr = f190Y;
                    iArr[0] = iArr[0] + (i3 << 8);
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
                m310al();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: aZ */
    private void m333aZ(int i) {
        if (f171Q[4] == 1 || f171Q[4] == 2) {
            if (f171Q[4] == 1 || f171Q[4] == 2) {
                if (((this.f319g / 30) / 4) % 2 == 0) {
                    int m265b = m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 64, 12);
                    if (0 == m265b) {
                        f190Y[1] = (f171Q[3] - 12) << 8;
                        m81i(f171Q[22]);
                    } else if (3 == m265b) {
                        f190Y[1] = ((((f171Q[3] + 12) + 12) + 12) + 1) << 8;
                        m310al();
                    }
                    if (f33D && f35av == f171Q[20] && 0 != m265b) {
                        f33D = false;
                    }
                } else if (f33D && f35av == f171Q[20]) {
                    f33D = false;
                }
                if (this.f319g % 120 == 0) {
                    m391a("bb");
                    return;
                }
                return;
            }
            return;
        }
        int i2 = -1;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[4] >= 144) {
            if (f171Q[4] == 152) {
                f171Q[14] = f171Q[4];
            } else if (f171Q[4] > 152) {
                f171Q[14] = 152 - (f171Q[4] - 152);
            } else {
                f171Q[14] = 152 - ((f171Q[4] + 16) - 152);
            }
            f171Q[13] = (this.f319g / 4) + f171Q[14];
            f171Q[13] = f171Q[13] % 32;
        } else {
            if (f171Q[4] == 128) {
                f171Q[14] = f171Q[4];
            } else if (f171Q[4] > 128) {
                f171Q[14] = 128 - (f171Q[4] - 128);
            }
            f171Q[13] = (this.f319g / 4) + f171Q[14];
            f171Q[13] = f171Q[13] % 20;
        }
        if (f171Q[13] == 0 || f171Q[13] > 7) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 16, 7);
            i2 = m411a;
            if (m411a >= 0) {
                if (i2 == 0) {
                    f190Y[1] = (f171Q[3] - 7) << 8;
                    m129d(f171Q[2], 16);
                    m81i(f171Q[22]);
                } else if (i2 == 1) {
                    f190Y[0] = ((f171Q[2] - 16) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else if (i2 == 2) {
                    f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                } else if (i2 == 3) {
                    f190Y[1] = ((((f171Q[3] + 7) + 12) + 12) + 1) << 8;
                    m310al();
                }
            }
        }
        if (f33D && f35av == f171Q[20] && i2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: ba */
    private void m230ba(int i) {
        int i2;
        int i3 = 0;
        int[] iArr = f171Q;
        iArr[5] = iArr[5] + 1;
        int i4 = f171Q[5] / 4;
        if (i4 % 30 < 6) {
            int i5 = i4 % 30;
            i2 = i5;
            if (i5 == 5 && f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                m391a("b3");
            }
        } else {
            i2 = (i4 % 30 <= 20 || i4 % 30 > 25) ? i4 % 30 >= 25 ? 0 : 5 : 5 - ((i4 - 20) % 30);
        }
        int i6 = f171Q[19] != 2 ? 49 : -42;
        for (int i7 = 0; i7 < i2; i7++) {
            i3 += this.f133s[4 - i7] - this.f131q[4 - i7];
            if ((f171Q[19] != 2 ? m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + 0, (f171Q[3] + i6) - i3, f171Q[2] + 0, (f171Q[3] + i6) - i3, (this.f132r[4 - i7] / 2) - 4, (this.f132r[4 - i7] / 2) - 4) : m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] + 0, f171Q[3] + i6 + i3, f171Q[2] + 0, f171Q[3] + i6 + i3, (this.f132r[4 - i7] / 2) - 4, (this.f132r[4 - i7] / 2) - 4)) >= 0) {
                m488F();
            }
        }
    }

    /* renamed from: bb */
    private void m229bb(int i) {
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 14, 14);
        if (m411a >= 0) {
            if (m411a == 0) {
                if (f198N) {
                    m391a("b9");
                    f171Q[0] = 0;
                    f196L = true;
                    f192H = false;
                    f198N = true;
                    f190Y[5] = -1280;
                    if (f243bh == 0) {
                        f243bh = 100;
                    } else if (f243bh == 100) {
                        f243bh = 200;
                    } else if (f243bh == 200) {
                        f243bh = 500;
                    } else if (f243bh == 500) {
                        f243bh = 1000;
                    }
                    m490E(f243bh);
                    m51n(f171Q[2], f171Q[3], f243bh);
                    m413a(22, f171Q[2] - 8, f171Q[3] - 16, 330, 400, 0);
                    m413a(22, f171Q[2] - 8, f171Q[3] - 16, 300, 400, 1);
                    m413a(22, f171Q[2] - 8, f171Q[3] - 16, 390, 400, 2);
                    m413a(22, f171Q[2] - 8, f171Q[3] - 16, 420, 400, 3);
                    f190Y[1] = (f171Q[3] - 14) << 8;
                } else {
                    f190Y[1] = (f171Q[3] - 14) << 8;
                    if (f17af != 0) {
                        f190Y[0] = (m280b() + ((m429a(f17af + 90) * 24) / 100)) << 8;
                        f17af = 0;
                    }
                    m129d(f171Q[2], 14);
                    m81i(f171Q[22]);
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 14) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 14) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + 14) + 12) + 12) + 1) << 8;
                m310al();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bc */
    private void m228bc(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int abs = Math.abs(f171Q[5] - this.f319g);
        if (!f176d[f171Q[4]]) {
            f171Q[16] = 0;
        } else if (f171Q[16] != 1) {
            f171Q[16] = 1;
            if (f171Q[17] == 1) {
                f171Q[17] = 0;
            } else {
                f171Q[17] = 1;
            }
        }
        if (abs != 1) {
            if (f171Q[17] == 1) {
                int[] iArr = f171Q;
                iArr[13] = iArr[13] - abs;
            } else {
                int[] iArr2 = f171Q;
                iArr2[13] = iArr2[13] + abs;
            }
        } else if (f171Q[17] == 1) {
            int[] iArr3 = f171Q;
            iArr3[13] = iArr3[13] - 1;
        } else {
            int[] iArr4 = f171Q;
            iArr4[13] = iArr4[13] + 1;
        }
        if (f171Q[13] < 0) {
            f171Q[13] = 80 + (f171Q[13] % 80);
        }
        if (f171Q[13] > 79) {
            f171Q[13] = f171Q[13] % 80;
        }
        f171Q[15] = f171Q[13] / 10;
        f171Q[5] = this.f319g;
        f171Q[10] = this.f411t[f171Q[15]];
        f171Q[11] = this.f412u[f171Q[15]];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2] - 1, f171Q[3] - 1, f171Q[6] - 1, f171Q[7] - 1, 45, 45);
        if (m411a >= 0) {
            if (f171Q[14] == 0) {
                if (m411a == 0) {
                    f190Y[1] = ((f171Q[3] - 45) - 1) << 8;
                    m129d(f171Q[2] - 1, 45);
                    m81i(f171Q[22]);
                } else if (m411a == 1) {
                    f190Y[0] = (((f171Q[2] - 45) - 12) - 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                    if (f171Q[14] == 0 && f171Q[15] == 1) {
                        f171Q[14] = 1;
                        f171Q[18] = 1;
                    }
                } else if (m411a == 2) {
                    f190Y[0] = ((((f171Q[2] + 45) + 12) + 1) - 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                    if (f171Q[14] == 0 && f171Q[15] == 5) {
                        f171Q[14] = 1;
                        f171Q[18] = 5;
                    }
                } else if (m411a == 3) {
                    f190Y[1] = (((((f171Q[3] + 45) + 12) + 12) + 1) - 1) << 8;
                }
            }
        } else if (f171Q[14] == 2) {
            f171Q[14] = 0;
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
        if (f171Q[14] == 1) {
            f196L = true;
            f192H = false;
            f198N = true;
            int i2 = (new int[]{0, -80, -100, -80}[f171Q[15] % 4] * 30) / 100;
            int i3 = (new int[]{-100, -80, 0, 80}[f171Q[15] % 4] * 30) / 100;
            if (f171Q[15] >= 4) {
                i2 *= -1;
                i3 *= -1;
            }
            f190Y[0] = (f171Q[2] + i2) << 8;
            f190Y[1] = ((f171Q[3] + i3) + 12) << 8;
            if (f171Q[15] == 4 && f171Q[18] != 4) {
                f171Q[14] = 2;
                f190Y[5] = 4096;
            }
            if (f171Q[15] != 5 || f171Q[18] == 5) {
                return;
            }
            f171Q[14] = 2;
            f190Y[10] = 2048;
            f196L = false;
            f198N = false;
        }
    }

    /* renamed from: bd */
    private void m227bd(int i) {
        int i2 = this.f319g % 288;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int i3 = f171Q[2];
        if (i2 < 96) {
            f171Q[2] = f171Q[8] + i2;
        } else if (i2 < 144) {
            f171Q[2] = f171Q[8] + 96;
            f171Q[3] = f171Q[9] + (i2 - 96);
        } else if (i2 < 240) {
            f171Q[2] = (f171Q[8] + 96) - ((i2 - 96) - 48);
            f171Q[3] = (f171Q[9] + 48) - ((24 * ((i2 - 96) - 48)) / 96);
        } else if (i2 < 264) {
            f171Q[2] = f171Q[8];
            f171Q[3] = ((f171Q[9] + 48) - 24) - (((i2 - 96) - 48) - 96);
        }
        int i4 = i3 - f171Q[2];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 96, 24);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - 24) << 8;
                f190Y[0] = (m280b() - i4) << 8;
                m129d(f171Q[2], 96);
                m81i(f171Q[22]);
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 96) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 96) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + 24) + 12) + 12) + 1) << 8;
                m310al();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: be */
    private void m226be(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 4, 32);
        f171Q[15] = this.f318f / 5;
        f171Q[5] = this.f318f / 10;
        if (m411a >= 0 && f171Q[10] == 0) {
            if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 4) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 4) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            }
        }
        if (f171Q[19] == 0) {
            if (m280b() - 12 > f171Q[2]) {
                if (f171Q[10] == 1) {
                    m391a("bd");
                }
                int[] iArr = f171Q;
                iArr[10] = iArr[10] - 1;
                if (f171Q[10] < 0) {
                    f171Q[10] = 0;
                }
            } else if (m280b() <= f171Q[2] - 24 || m204c() - 12 >= f171Q[3] + 32 || m204c() - 12 <= f171Q[3] - 32) {
                if (f171Q[10] == 1) {
                    m391a("bd");
                }
                int[] iArr2 = f171Q;
                iArr2[10] = iArr2[10] - 1;
                if (f171Q[10] < 0) {
                    f171Q[10] = 0;
                }
            } else {
                if (f171Q[10] == 3) {
                    m391a("b9");
                }
                int[] iArr3 = f171Q;
                iArr3[10] = iArr3[10] + 1;
                if (f171Q[10] > 4) {
                    f171Q[10] = 4;
                }
            }
        } else if (m280b() + 12 < f171Q[2]) {
            if (f171Q[10] == 1) {
                m391a("bd");
            }
            int[] iArr4 = f171Q;
            iArr4[10] = iArr4[10] - 1;
            if (f171Q[10] < 0) {
                f171Q[10] = 0;
            }
        } else if (m280b() >= f171Q[2] + 24 || m204c() - 12 > f171Q[3] + 32 || m204c() - 12 < f171Q[3] - 32) {
            if (f171Q[10] == 1) {
                m391a("bd");
            }
            int[] iArr5 = f171Q;
            iArr5[10] = iArr5[10] - 1;
            if (f171Q[10] < 0) {
                f171Q[10] = 0;
            }
        } else {
            if (f171Q[10] == 3) {
                m391a("b9");
            }
            int[] iArr6 = f171Q;
            iArr6[10] = iArr6[10] + 1;
            if (f171Q[10] > 4) {
                f171Q[10] = 4;
            }
        }
    }

    /* renamed from: bf */
    private void m225bf(int i) {
        int i2 = 16;
        int i3 = -1;
        f171Q[5] = (this.f319g / 2) % 128;
        int i4 = ((f171Q[5] - (f171Q[4] / 2)) + 256) % 128;
        if (i4 < 128) {
            if (i4 < 16) {
                i2 = i4;
            } else if (i4 > 64 && i4 < 80) {
                i2 = 80 - i4;
            } else if (i4 >= 80) {
                i2 = -1;
            }
        }
        if (i2 > 0) {
            int i5 = 16;
            if (i2 <= 8 && i2 > 4) {
                i5 = 8;
            } else if (i2 <= 4) {
                i5 = 0;
            }
            if (i5 > 0) {
                int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] + 8, f171Q[2], f171Q[3] + 8, i5, 16);
                i3 = m411a;
                if (m411a >= 0) {
                    if (i3 == 0) {
                        f190Y[1] = ((f171Q[3] + 8) - 16) << 8;
                        m129d(f171Q[2], i5);
                        m81i(f171Q[22]);
                    } else if (i3 == 1) {
                        f190Y[0] = ((f171Q[2] - i5) - 12) << 8;
                        f190Y[10] = 0;
                        if (f166c[4]) {
                            m5y();
                        }
                    } else if (i3 == 2) {
                        f190Y[0] = (((f171Q[2] + i5) + 12) + 1) << 8;
                        f190Y[10] = 0;
                        if (f166c[3]) {
                            m5y();
                        }
                    }
                }
            } else {
                i3 = -1;
            }
        }
        if (f33D && f35av == f171Q[20] && i3 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bg */
    private void m224bg(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int i2 = 62;
        int i3 = 11;
        int i4 = 0;
        if (f171Q[4] < 128) {
            i2 = 28;
            i3 = 32;
        }
        if (f171Q[4] == 203) {
            i2 = 128;
            i3 = 64;
            int i5 = f171Q[2];
            if (f286g[11] && f171Q[18] == 0) {
                f171Q[18] = 1;
                f171Q[5] = 256;
                f171Q[2] = 2432;
                f171Q[3] = 320;
            }
            f171Q[18] = 1;
            if (f171Q[5] != 0) {
                if (this.f319g % 2 == 0) {
                    int[] iArr = f171Q;
                    iArr[5] = iArr[5] + 1;
                }
                if (f171Q[5] > 256) {
                    f171Q[5] = 256;
                }
                f171Q[2] = f171Q[8] - f171Q[5];
                f171Q[3] = f171Q[9] + (f171Q[5] / 2);
            } else if (f286g[11]) {
                f171Q[5] = 1;
            } else {
                f171Q[2] = f171Q[8];
                f171Q[3] = f171Q[9];
            }
            i4 = i5 - f171Q[2];
        } else if (f171Q[4] == 52) {
            int i6 = this.f318f % 42;
            if (i6 < 15) {
                f171Q[3] = f171Q[9];
            } else if (i6 < 21) {
                f171Q[3] = f171Q[9] + ((i6 - 15) * 16);
            } else if (i6 < 36) {
                f171Q[3] = f171Q[9] + 96;
            } else if (i6 < 42) {
                f171Q[3] = (f171Q[9] + 96) - ((i6 - 36) * 16);
            }
        } else if (f171Q[4] == 36) {
            int i7 = this.f318f % 38;
            if (i7 < 15) {
                f171Q[3] = f171Q[9];
            } else if (i7 < 19) {
                f171Q[3] = f171Q[9] + ((i7 - 15) * 16);
            } else if (i7 < 34) {
                f171Q[3] = f171Q[9] + 64;
            } else if (i7 < 38) {
                f171Q[3] = (f171Q[9] + 64) - ((i7 - 34) * 16);
            }
        } else if (f171Q[4] == 19) {
            int i8 = this.f318f % 38;
            if (i8 < 15) {
                f171Q[3] = f171Q[9] + 8;
                int[] iArr2 = f171Q;
                iArr2[3] = iArr2[3] - 16;
            } else if (i8 < 19) {
                f171Q[3] = f171Q[9] + ((i8 - 15) * 16) + 8;
                int[] iArr3 = f171Q;
                iArr3[3] = iArr3[3] - 16;
            } else if (i8 < 34) {
                f171Q[3] = f171Q[9] + 64 + 8;
                int[] iArr4 = f171Q;
                iArr4[3] = iArr4[3] - 16;
            } else if (i8 < 38) {
                f171Q[3] = ((f171Q[9] + 64) - ((i8 - 34) * 16)) + 8;
                int[] iArr5 = f171Q;
                iArr5[3] = iArr5[3] - 16;
            }
        } else if (f171Q[4] >= 128) {
            int i9 = f171Q[2];
            if (f176d[f171Q[4] - 128]) {
                if (f171Q[5] == 0) {
                    f171Q[10] = 0;
                    f171Q[11] = this.f319g;
                }
                f171Q[5] = 1;
            }
            if (f171Q[5] != 0) {
                f171Q[10] = this.f319g - f171Q[11];
                if (f171Q[19] == 0) {
                    if (f171Q[10] < 128) {
                        f171Q[2] = f171Q[8] - f171Q[10];
                    } else if (f171Q[10] > 178) {
                        f171Q[2] = f171Q[8] - (128 - ((f171Q[10] - 128) - 50));
                    }
                } else if (f171Q[10] < 128) {
                    f171Q[2] = (f171Q[8] + f171Q[10]) - 128;
                } else if (f171Q[10] > 178) {
                    f171Q[2] = (f171Q[8] + (128 - ((f171Q[10] - 128) - 50))) - 128;
                }
                if (f171Q[10] > 306) {
                    f171Q[5] = 0;
                }
            }
            if (f171Q[5] == 0) {
                if (f171Q[19] == 0) {
                    f171Q[2] = f171Q[8];
                } else {
                    f171Q[2] = f171Q[8] - 128;
                }
            }
            i4 = i9 - f171Q[2];
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], i2, i3);
        if ((this.f315c != 3 || f171Q[4] != 64) && m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - i3) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                int[] iArr6 = f190Y;
                iArr6[0] = iArr6[0] - (i4 << 8);
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                f190Y[10] = Math.min(0, f190Y[10]);
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + i3) + 12) + 12) + 1) << 8;
                m310al();
            } else if (m411a == 4) {
                m482H();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bh */
    private void m223bh(int i) {
        int i2 = f198N ? 12 : 24;
        int i3 = f171Q[4] * 2;
        if (this.f318f % (i3 + 5) < i3) {
            f171Q[5] = 0;
        } else {
            f171Q[5] = (((this.f318f % (i3 + 5)) - i3) / 1) + 1;
        }
        int i4 = f171Q[19] == 2 ? -1 : 1;
        if (f171Q[5] >= 2) {
            for (int i5 = 0; i5 <= 1; i5++) {
                if (this.f413e[f171Q[5] - 2][i5] != 0) {
                    if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, ((f171Q[2] + 24) + (i5 * 32)) - 4, f171Q[3] - (4 * i4), ((f171Q[2] + 24) + (i5 * 32)) - 4, f171Q[3] - (4 * i4), 16, 8) >= 0) {
                        m488F();
                    } else if (24 >= Math.abs(m280b() - ((f171Q[2] + 24) + (i5 * 32))) && 8 + i2 >= Math.abs((m204c() - i2) - (f171Q[3] - (4 * i4)))) {
                        m488F();
                    }
                    if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, ((f171Q[2] - 24) - (i5 * 32)) + 4, f171Q[3] - (4 * i4), ((f171Q[2] - 24) - (i5 * 32)) + 4, f171Q[3] - (4 * i4), 16, 8) >= 0) {
                        m488F();
                    } else if (24 >= Math.abs(m280b() - ((f171Q[2] - 24) - (i5 * 32))) && 8 + i2 >= Math.abs((m204c() - i2) - (f171Q[3] - (4 * i4)))) {
                        m488F();
                    }
                }
            }
        }
    }

    /* renamed from: bi */
    private void m222bi(int i) {
        int i2 = 0;
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        int length = this.f134f[f171Q[4] - 128].length >> 1;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < f42b[32][0].length; i5++) {
            if (f42b[34][1][i5] == f171Q[9] && f42b[34][0][i5] == f171Q[8]) {
                i2 = i5;
            }
        }
        f171Q[12] = i2;
        for (int i6 = 0; i6 < length; i6++) {
            this.f414g[i6][0] = this.f134f[f171Q[4] - 128][(i6 * 2) + 0];
            this.f414g[i6][1] = this.f134f[f171Q[4] - 128][(i6 * 2) + 1];
            this.f415h[i6][0] = this.f134f[f171Q[4] - 128][(((i6 + 1) % length) * 2) + 0];
            this.f415h[i6][1] = this.f134f[f171Q[4] - 128][(((i6 + 1) % length) * 2) + 1];
            iArr[i6] = Math.max(Math.abs(this.f414g[i6][1] - this.f415h[i6][1]), Math.abs(this.f414g[i6][0] - this.f415h[i6][0]));
            i4 += iArr[i6];
        }
        int i7 = i4 / 69;
        int i8 = 0;
        if (f171Q[18] == 0) {
            f287B[i2] = new int[i7];
            f288C[i2] = new int[i7];
            this.f135v = new int[i7];
        }
        f171Q[18] = 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = ((i11 * 69) + this.f319g) % i4;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                } else if (i12 < iArr[i13]) {
                    if (Math.abs(this.f414g[i13][0] - this.f415h[i13][0]) < Math.abs(this.f414g[i13][1] - this.f415h[i13][1])) {
                        i9 = this.f414g[i13][0] + (((this.f415h[i13][0] - this.f414g[i13][0]) * i12) / iArr[i13]);
                        i10 = this.f414g[i13][1] + (i12 * ((this.f415h[i13][1] - this.f414g[i13][1]) / iArr[i13]));
                    } else {
                        i9 = this.f414g[i13][0] + (i12 * ((this.f415h[i13][0] - this.f414g[i13][0]) / iArr[i13]));
                        i10 = this.f414g[i13][1] + (((this.f415h[i13][1] - this.f414g[i13][1]) * i12) / iArr[i13]);
                    }
                    i8 = i13;
                    this.f135v[i11] = i8;
                } else {
                    i12 -= iArr[i13];
                    i13++;
                }
            }
            if (f287B[i2][i11] == 0 && f288C[i2][i11] == 0) {
                f287B[i2][i11] = i9;
                f288C[i2][i11] = i10;
            }
            int i14 = f287B[i2][i11];
            int i15 = f288C[i2][i11];
            f287B[i2][i11] = i9;
            f288C[i2][i11] = i10;
            if (!z) {
                int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, i9, i10, i14, i15, 16, 7);
                i3 = m411a;
                if (m411a >= 0 && i8 != 1 && i8 != 2 && i3 == 0) {
                    f190Y[1] = (i10 - 7) << 8;
                    int[] iArr2 = f190Y;
                    iArr2[0] = iArr2[0] - ((i14 - i9) << 8);
                    m129d(i9, 20);
                    m81i(f171Q[22]);
                    z = true;
                }
            }
        }
        if (z) {
            i3 = 0;
        }
        if (f33D && f35av == f171Q[20] && i3 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bj */
    private void m221bj(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        f171Q[15] = this.f318f & 1;
        if (f171Q[4] == 1) {
            f171Q[10] = 1;
            if ((this.f319g / 2) % 192 < 96) {
                f171Q[2] = f171Q[8] - ((this.f319g / 2) % 192);
            } else {
                f171Q[2] = f171Q[8] - (96 - (((this.f319g / 2) % 192) - 96));
            }
        } else if (f171Q[4] == 2) {
            f171Q[10] = 1;
            if ((this.f319g / 2) % 112 < 56) {
                f171Q[3] = f171Q[9] - ((this.f319g / 2) % 112);
            } else {
                f171Q[3] = f171Q[9] - (56 - (((this.f319g / 2) % 112) - 56));
            }
        } else if (f171Q[4] == 3) {
            if (f171Q[10] == 0) {
                if (f171Q[2] > m280b() - 180 && f171Q[2] < m280b() - 150) {
                    f171Q[5] = this.f319g;
                    f171Q[10] = 1;
                }
            } else if (f171Q[10] == 1) {
                f171Q[2] = f171Q[8] + ((this.f319g - f171Q[5]) * 3);
                if (f171Q[2] - m280b() > 200) {
                    f171Q[5] = 0;
                    f171Q[10] = 0;
                    f171Q[2] = f171Q[8];
                }
            }
        }
        if (f171Q[2] - f179T[0] >= -30 && f171Q[2] - f179T[0] <= 270 && f171Q[3] - f179T[1] >= -30 && f171Q[3] - f179T[1] <= 198 && this.f318f % 24 == 0) {
            m391a("b0");
        }
        int i2 = 12;
        if (!f198N && !f200P) {
            i2 = 20;
        }
        if (f171Q[10] != 0) {
            if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 30, 30) >= 0) {
                m488F();
            } else if (Math.abs(f171Q[2] - m280b()) >= 42 || Math.abs(f171Q[3] - (m204c() - i2)) >= i2 + 30) {
            } else {
                m488F();
            }
        }
    }

    /* renamed from: bk */
    private void m220bk(int i) {
        if (f171Q[5] == 0 && f29ar == f171Q[2] && f30as == f171Q[3]) {
            f171Q[5] = 32;
        }
        if (f171Q[5] > 0) {
            int[] iArr = f171Q;
            iArr[5] = iArr[5] + 1;
            if (f171Q[5] > 32) {
                f171Q[5] = 32;
            }
        }
        if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] - 12, f171Q[2], f171Q[3] - 12, 8, 32) < 0 || f171Q[5] != 0) {
            return;
        }
        m391a("a1");
        f171Q[5] = 1;
        f29ar = f171Q[2];
        f30as = f171Q[3];
        f31at = f25an;
        f32au = f26ao;
    }

    /* renamed from: bl */
    private void m219bl(int i) {
        if (f171Q[4] < 16) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 8, 32);
            if (m411a >= 0) {
                if (m411a == 1) {
                    f190Y[0] = ((f171Q[2] - 8) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else if (m411a == 2) {
                    f190Y[0] = (((f171Q[2] + 8) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                } else if (m411a == 3) {
                    f190Y[1] = ((((f171Q[3] + 32) + 12) + 12) + 1) << 8;
                    m310al();
                }
            }
            if (f33D && f35av == f171Q[20] && m411a != 0) {
                f33D = false;
            }
        }
    }

    /* renamed from: bm */
    private void m218bm(int i) {
        if (f171Q[4] >= 10) {
            return;
        }
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[12] == 1) {
            int i2 = (this.f318f - f171Q[14]) * 4;
            f171Q[14] = this.f318f;
            if (i2 > 0) {
                int i3 = i2;
                while (true) {
                    if (i3 >= 0) {
                        if (f171Q[3] < f171Q[7] + 1000) {
                            int[] iArr = f171Q;
                            iArr[3] = iArr[3] + 2;
                        }
                        if (m128d(f171Q[2], f171Q[3] + 16) && f171Q[3] > f171Q[7] - 1000) {
                            int[] iArr2 = f171Q;
                            iArr2[3] = iArr2[3] - 2;
                            f171Q[12] = 0;
                            break;
                        }
                        if (f171Q[3] < 0) {
                            f171Q[3] = 0;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
            }
        }
        int m414a = m414a(f171Q[2], f171Q[3], f171Q[6], f171Q[7], 16, 16);
        if (f171Q[4] == 0) {
            m414a = -1;
        }
        if (f171Q[5] != 0) {
            f171Q[7] = (this.f318f - f171Q[13]) * 6;
            if (f171Q[7] > 60) {
                f171Q[7] = 60;
                if (f171Q[5] == 6) {
                    m391a("b5");
                }
                f171Q[5] = 0;
            }
        }
        if (f40b[((m204c() - 1) >> 8) % f37ax][m280b() >> 8] == 53 || f40b[((m204c() - 1) >> 8) % f37ax][m280b() >> 8] == 54) {
            m414a = -1;
        }
        if (m414a >= 0) {
            if ((f198N && m414a != 3) || (!f196L && f198N && m414a == 3)) {
                f190Y[5] = -768;
                m412a(1, f171Q[2], f171Q[3], 0, 0, 0, 0);
                f171Q[5] = f171Q[4];
                f171Q[13] = this.f318f;
                m52n(f171Q[4]);
                f171Q[4] = 0;
            } else if (m414a == 0) {
                f190Y[1] = (f171Q[3] - 16) << 8;
                m129d(f171Q[2], 16);
                m81i(f171Q[22]);
            } else if (m414a == 1) {
                f190Y[0] = (((f171Q[2] - 16) - 12) - 1) << 8;
                if (f190Y[10] > 0) {
                    f190Y[10] = 0;
                } else if (f190Y[10] < 0) {
                    int[] iArr3 = f190Y;
                    iArr3[0] = iArr3[0] - 256;
                }
                if (f166c[4]) {
                    m5y();
                }
            } else if (m414a == 2) {
                f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                if (f190Y[10] < 0) {
                    f190Y[10] = 0;
                } else if (f190Y[10] > 0) {
                    int[] iArr4 = f190Y;
                    iArr4[0] = iArr4[0] + 256;
                }
                if (f166c[3]) {
                    m5y();
                }
            } else if (m414a == 3) {
                f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
                if (f190Y[5] < 0) {
                    int[] iArr5 = f190Y;
                    iArr5[5] = iArr5[5] * (-1);
                }
                if (f171Q[12] == 0) {
                    int[] iArr6 = f171Q;
                    iArr6[3] = iArr6[3] - 5;
                    f171Q[14] = this.f318f;
                }
                f171Q[12] = 1;
                if (!f196L) {
                    if (m280b() < f171Q[2]) {
                        f190Y[0] = (m280b() - 5) << 8;
                    } else {
                        f190Y[0] = (m280b() + 5) << 8;
                    }
                }
            }
        }
        if (f33D && f35av == f171Q[20] && m414a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bn */
    private void m217bn(int i) {
        m218bm(i);
    }

    /* renamed from: bo */
    private void m216bo(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[5] == 1) {
            int[] iArr = f171Q;
            iArr[10] = iArr[10] + 1;
            if (f171Q[10] > 129) {
                f171Q[10] = 129;
                f171Q[5] = 2;
                m428a(0);
            }
        } else if (f171Q[5] != 0 || m280b() <= f171Q[2] - 3 || f171Q[3] + 48 <= m204c()) {
        } else {
            f171Q[5] = 1;
            f171Q[10] = 0;
            this.f416x = true;
            m391a("cf");
        }
    }

    /* renamed from: bp */
    private void m215bp(int i) {
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[5] == 0) {
            if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 12, 12) >= 0) {
                f171Q[5] = 1;
                f171Q[11] = 0;
                m490E(this.Score_HiddenBonuses[f171Q[4]]);
                m391a("c9");
            }
        } else if (f171Q[5] == 1) {
            int[] iArr = f171Q;
            iArr[11] = iArr[11] + 1;
            if (f171Q[11] > 120) {
                f171Q[5] = 2;
            }
        }
    }

    /* renamed from: bq */
    private void m214bq(int i) {
        m215bp(i);
    }

    /* renamed from: br */
    private void m213br(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            if (f304h[i3]) {
                i2++;
            }
        }
        if (f23al < 50 || i2 == 6) {
            return;
        }
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[5] != 0) {
            f171Q[10] = (this.f318f - f171Q[11]) / 1;
            if (f171Q[10] > 5) {
                f171Q[10] = 5;
            }
        } else if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 32, 32) >= 0) {
            m391a("c3");
            f171Q[5] = 1;
            f171Q[11] = this.f318f;
            this.f418y = true;
        }
    }

    /* renamed from: bs */
    private void m212bs(int i) {
        if (this.f314b != 3 || ((f196L && !f33D) || !(f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 42 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 43 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 52 || f40b[(m204c() >> 8) % f37ax][m280b() >> 8] == 53))) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 16, 16);
            if (m411a >= 0 && m411a != 0) {
                if (m411a == 1) {
                    f190Y[0] = ((f171Q[2] - 16) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                    }
                } else if (m411a == 2) {
                    f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                    }
                } else if (m411a == 3) {
                    f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
                    m310al();
                }
            }
            if (f33D && f35av == f171Q[20] && m411a != 0) {
                f33D = false;
            }
        }
    }

    /* renamed from: bt */
    private void m211bt(int i) {
        int[][] iArr = f42b[40];
        int[] iArr2 = f42b[41][0];
        int i2 = -1;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[5] == 0) {
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 5, 44);
            i2 = m411a;
            if (m411a >= 0) {
                if (i2 == 0) {
                    f190Y[1] = (f171Q[3] - 44) << 8;
                    m129d(f171Q[2], 5);
                    m81i(f171Q[22]);
                } else if (i2 == 1) {
                    f190Y[0] = ((f171Q[2] - 5) - 12) << 8;
                    f190Y[10] = 0;
                    if (f171Q[19] == 0) {
                        f171Q[5] = 1;
                        f171Q[10] = 0;
                        m391a("be");
                    } else if (f166c[4]) {
                        m5y();
                    }
                } else if (i2 == 2) {
                    f190Y[0] = (((f171Q[2] + 5) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f171Q[19] != 0) {
                        f171Q[5] = 1;
                        f171Q[10] = 0;
                        m391a("be");
                    } else if (f166c[3]) {
                        m5y();
                    }
                } else if (i2 == 3) {
                    f190Y[1] = ((((f171Q[3] + 44) + 12) + 12) + 1) << 8;
                    m310al();
                }
            }
        }
        if (f171Q[5] == 1) {
            f196L = true;
            f192H = false;
            f198N = true;
            f202R = true;
            f203S = true;
            int[] iArr3 = f190Y;
            iArr3[11] = iArr3[11] + f167Z;
            int[] iArr4 = f171Q;
            iArr4[10] = iArr4[10] + 1;
            f190Y[0] = f171Q[2] << 8;
            f190Y[1] = ((f171Q[3] + 12) - iArr2[(f171Q[10] / 5) % 12]) << 8;
            if ((f171Q[10] / 5) % 12 == 11) {
                f171Q[5] = 2;
                if (f171Q[4] == 0 || f171Q[4] == 6) {
                    f171Q[5] = 4;
                }
                f171Q[10] = 0;
                f171Q[11] = 0;
                f171Q[12] = 0;
                f190Y[3] = 0;
                f190Y[5] = 0;
                f190Y[10] = 0;
            }
        }
        if (f171Q[5] == 4) {
            if (f171Q[4] == 0) {
                f190Y[1] = (m204c() + 10) << 8;
                if (f171Q[3] > m204c()) {
                    f171Q[5] = 2;
                }
            } else {
                f190Y[1] = (m204c() - 10) << 8;
                if (158 < m204c()) {
                    f171Q[5] = 2;
                }
            }
        }
        if (f171Q[5] == 2) {
            f196L = true;
            f192H = false;
            f198N = true;
            f202R = true;
            f203S = true;
            int[] iArr5 = f190Y;
            iArr5[11] = iArr5[11] + f167Z;
            f171Q[11] = 0;
            f171Q[12] = 0;
            if ((f171Q[10] * 2) + 1 < iArr[f171Q[4]].length) {
                if (m280b() > iArr[f171Q[4]][f171Q[10] * 2]) {
                    f171Q[11] = -1;
                } else if (m280b() < iArr[f171Q[4]][f171Q[10] * 2]) {
                    f171Q[11] = 1;
                }
                if (m204c() > iArr[f171Q[4]][(f171Q[10] * 2) + 1]) {
                    f171Q[12] = -1;
                } else if (m204c() < iArr[f171Q[4]][(f171Q[10] * 2) + 1]) {
                    f171Q[12] = 1;
                }
                int[] iArr6 = f171Q;
                iArr6[10] = iArr6[10] + 1;
                f171Q[5] = 3;
            } else {
                f171Q[5] = 0;
                f202R = false;
                f203S = false;
                m391a("bc");
                if ((getKeypadState() & 65536) != 0 || (getKeypadState() & 16) != 0) {
                    f166c[3] = true;
                }
                if ((getKeypadState() & 262144) != 0 || (getKeypadState() & 64) != 0) {
                    f166c[4] = true;
                }
            }
        }
        if (f171Q[5] == 3) {
            int[] iArr7 = f190Y;
            iArr7[11] = iArr7[11] + f167Z;
            f196L = true;
            f192H = false;
            f198N = true;
            f202R = true;
            f203S = true;
            if (f171Q[11] != 0) {
                f190Y[0] = (m280b() + (f171Q[11] * 10)) << 8;
                if (f171Q[11] == -1 && m280b() < iArr[f171Q[4]][(f171Q[10] - 1) * 2]) {
                    f190Y[0] = iArr[f171Q[4]][(f171Q[10] - 1) * 2] << 8;
                    f171Q[11] = 0;
                }
                if (f171Q[11] == 1 && m280b() > iArr[f171Q[4]][(f171Q[10] - 1) * 2]) {
                    f190Y[0] = iArr[f171Q[4]][(f171Q[10] - 1) * 2] << 8;
                    f171Q[11] = 0;
                }
            }
            if (f171Q[12] != 0) {
                f190Y[1] = (m204c() + (f171Q[12] * 10)) << 8;
                if (f171Q[12] == -1 && m204c() < iArr[f171Q[4]][((f171Q[10] - 1) * 2) + 1]) {
                    f190Y[1] = iArr[f171Q[4]][((f171Q[10] - 1) * 2) + 1] << 8;
                    f171Q[12] = 0;
                }
                if (f171Q[12] == 1 && m204c() > iArr[f171Q[4]][((f171Q[10] - 1) * 2) + 1]) {
                    f190Y[1] = iArr[f171Q[4]][((f171Q[10] - 1) * 2) + 1] << 8;
                    f171Q[12] = 0;
                }
            }
            if (f171Q[11] == 0 && f171Q[12] == 0) {
                f190Y[0] = iArr[f171Q[4]][(f171Q[10] - 1) * 2] << 8;
                f190Y[1] = iArr[f171Q[4]][((f171Q[10] - 1) * 2) + 1] << 8;
                f171Q[5] = 2;
            }
        }
        if (f33D && f35av == f171Q[20] && i2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bu */
    private void m210bu(int i) {
        int i2 = 32;
        int i3 = 28;
        int i4 = 4;
        if (f171Q[4] == 1) {
            i2 = 12;
            i3 = 8;
            i4 = 0;
        }
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] + i4, f171Q[6], f171Q[7] + i4, i2, i3);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = ((f171Q[3] - i3) + i4) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                if (f171Q[4] == 1 && f171Q[5] == 0) {
                    this.f416x = true;
                    f171Q[5] = 1;
                    int[] iArr = f171Q;
                    iArr[3] = iArr[3] + 8;
                    f171Q[10] = this.f319g;
                    this.f74a = (byte) 2;
                }
            } else if (!this.f359l) {
                if (m411a == 1) {
                    f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                    f190Y[10] = 0;
                    if (f166c[4]) {
                        m5y();
                    }
                } else if (m411a == 2) {
                    f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                } else if (m411a == 3) {
                    f190Y[1] = (((((f171Q[3] + i3) + 12) + 12) + 1) + i4) << 8;
                }
            }
        }
        if (f171Q[5] == 1) {
            if ((this.f319g - f171Q[10]) % 20 == 0 && this.f419x.length > (this.f319g - f171Q[10]) / 20) {
                m391a("c4");
                m412a(1, f171Q[8] + this.f419x[(this.f319g - f171Q[10]) / 20], f171Q[9] + this.f420y[(this.f319g - f171Q[10]) / 20], 0, 0, 0, 0);
            }
            if (this.f319g - f171Q[10] > 100) {
                f171Q[5] = 2;
                f171Q[10] = this.f319g;
                m56m(f171Q[8] + 4, f171Q[9] + 27 + 16, this.f314b);
            }
        } else if (f171Q[5] == 2 && this.f319g - f171Q[10] > 180) {
            m428a(0);
            int[] iArr2 = f171Q;
            iArr2[5] = iArr2[5] + 1;
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bv */
    private void m209bv(int i) {
        if (m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 8, 8) >= 0) {
            m391a("b4");
            int abs = Math.abs(m280b() - f171Q[2]);
            int abs2 = Math.abs((m204c() - 12) - f171Q[3]);
            if (f171Q[10] < 10) {
                m51n(f171Q[2], f171Q[3], 10);
                m490E(10);
                int[] iArr = f171Q;
                iArr[10] = iArr[10] + 1;
            }
            if (m280b() - f171Q[2] > 0) {
                f190Y[3] = (1792 * abs) / (abs + abs2);
            } else {
                f190Y[3] = ((-1792) * abs) / (abs + abs2);
            }
            if ((m204c() - 12) - f171Q[3] > 0) {
                f190Y[5] = (2048 * abs2) / (abs + abs2);
            } else {
                f190Y[5] = ((-2048) * abs2) / (abs + abs2);
            }
            if (!f196L) {
                f190Y[3] = (f190Y[3] * 80) / 100;
                int[] iArr2 = f190Y;
                iArr2[5] = iArr2[5] - 1024;
            }
            f190Y[10] = 0;
            f190Y[13] = 0;
            f190Y[14] = 0;
            f196L = true;
            f192H = false;
            f197M = true;
            f33D = false;
        }
    }

    /* renamed from: bw */
    private void m208bw(int i) {
        int m265b = m265b(f171Q[2], f171Q[3], f171Q[2], f171Q[3], 16, 16);
        if (m265b >= 0) {
            if (m265b == 0) {
                f190Y[1] = (f171Q[3] - 16) << 8;
                m129d(f171Q[2], 16);
                m81i(f171Q[22]);
            } else if (m265b == 1) {
                f190Y[0] = ((f171Q[2] - 16) - 12) << 8;
                if (f166c[4]) {
                    m5y();
                }
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
            } else if (m265b == 2) {
                f190Y[0] = (((f171Q[2] + 16) + 12) + 1) << 8;
                if (f166c[3]) {
                    m5y();
                }
                f190Y[10] = 0;
                f190Y[13] = 0;
                f190Y[14] = 0;
            } else if (m265b == 3) {
                f190Y[1] = ((((f171Q[3] + 16) + 12) + 12) + 1) << 8;
            }
        }
        if (f33D && f35av == f171Q[20] && m265b != 0) {
            f33D = false;
        }
    }

    /* renamed from: bx */
    private void m207bx(int i) {
        int i2 = this.f318f;
        int i3 = 4;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[19] == 1) {
            i2 += 45;
        } else if (f171Q[19] == 2) {
            i2 += 135;
        } else if (f171Q[19] == 3) {
            i2 += 180;
        }
        if (f171Q[4] == 195 || f171Q[4] == 179) {
            i3 = 8;
        }
        if (f171Q[4] == 243 || f171Q[4] == 195 || f171Q[4] == 227 || f171Q[4] == 179) {
            m31r(((360 / i3) - (i2 % (360 / i3))) * i3, 16, 17);
            f171Q[2] = f171Q[8] + ((f171Q[16] * 80) / 10000);
            f171Q[3] = f171Q[9] + ((f171Q[17] * 80) / 10000);
        } else {
            int i4 = this.f318f;
            if (f171Q[4] == 2) {
                if (f171Q[19] != 0) {
                    if ((i4 % 96) * 2 < 96) {
                        f171Q[3] = (f171Q[9] - (96 - (((i4 % 96) * 2) - 96))) + 64;
                    } else {
                        f171Q[3] = (f171Q[9] - ((i4 % 96) * 2)) + 64;
                    }
                } else if ((i4 % 96) * 2 < 96) {
                    f171Q[3] = f171Q[9] - ((i4 % 96) * 2);
                } else {
                    f171Q[3] = f171Q[9] - (96 - (((i4 % 96) * 2) - 96));
                }
            } else if (f171Q[4] == 1) {
                if ((i4 % 96) * 2 < 96) {
                    f171Q[2] = f171Q[8] - ((i4 % 96) * 2);
                } else {
                    f171Q[2] = f171Q[8] - (96 - (((i4 % 96) * 2) - 96));
                }
            }
        }
        int i5 = 12;
        if (!f198N && !f200P) {
            i5 = 20;
        }
        if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[6], f171Q[7], 16, 16) >= 0) {
            m488F();
        } else if (Math.abs(f171Q[2] - m280b()) >= 28 || Math.abs(f171Q[3] - (m204c() - i5)) >= i5 + 16) {
        } else {
            m488F();
        }
    }

    /* renamed from: by */
    private void m206by(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 12;
        if (!f198N && !f200P) {
            i4 = 20;
        }
        if (f171Q[18] == 0) {
            f171Q[5] = this.f318f;
            f171Q[18] = 1;
        }
        int i5 = this.f318f - f171Q[5];
        int i6 = i5 - 1;
        if (f171Q[4] == 213 || f171Q[4] == 181 || f171Q[4] == 197 || f171Q[4] == 101 || f171Q[4] == 69 || f171Q[4] == 53) {
            i2 = 5;
        } else if (f171Q[4] == 212 || f171Q[4] == 196 || f171Q[4] == 84 || f171Q[4] == 68 || f171Q[4] == 52) {
            i2 = 4;
        } else if (f171Q[4] == 38) {
            i2 = 6;
        } else if (f171Q[4] == 195) {
            i2 = 3;
        }
        if (f171Q[4] == 181 || f171Q[4] == 101) {
            i3 = 12;
        } else if (f171Q[4] == 196 || f171Q[4] == 197 || f171Q[4] == 84 || f171Q[4] == 195) {
            i3 = 10;
        } else if (f171Q[4] == 213 || f171Q[4] == 212 || f171Q[4] == 69 || f171Q[4] == 68) {
            i3 = 8;
        } else if (f171Q[4] == 52 || f171Q[4] == 53) {
            i3 = 6;
        } else if (f171Q[4] == 38) {
            i3 = 4;
        }
        if (f171Q[4] == 69 || f171Q[4] == 84 || f171Q[4] == 101 || f171Q[4] == 38 || f171Q[4] == 68 || f171Q[4] == 52 || f171Q[4] == 53) {
            m31r(360 - ((((360 / i3) - (i5 % (360 / i3))) * i3) % 360), 16, 17);
            m31r(360 - ((((360 / i3) - (i6 % (360 / i3))) * i3) % 360), 14, 15);
        } else {
            m31r(((360 / i3) - (i5 % (360 / i3))) * i3, 16, 17);
            m31r(((360 / i3) - (i6 % (360 / i3))) * i3, 14, 15);
        }
        if (f171Q[4] == 84) {
            m31r((i5 % (360 / i3)) * i3, 16, 17);
            m31r((i6 % (360 / i3)) * i3, 14, 15);
        } else if (f171Q[19] == 1) {
            m31r((i5 % (360 / i3)) * i3, 16, 17);
            m31r((i6 % (360 / i3)) * i3, 14, 15);
        }
        int i7 = 16;
        int i8 = 16;
        if (this.f314b == 4) {
            i7 = 8;
            i8 = 8;
        }
        int i9 = 1;
        while (i9 < i2) {
            if (this.f314b == 4) {
                i7 = 8;
                i8 = 8;
                if (m411a(m280b(), m204c() - i4, f170P[0], f170P[1] - i4, 12, i4, f171Q[2] + ((i9 * (f171Q[16] * 16)) / 10000), f171Q[3] + ((i9 * (f171Q[17] * 16)) / 10000), f171Q[2] + ((i9 * (f171Q[14] * 16)) / 10000), f171Q[3] + ((i9 * (f171Q[15] * 16)) / 10000), 6, 6) >= 0) {
                    m488F();
                }
            }
            i9++;
        }
        if ((this.f314b == 4 ? m411a(m280b(), m204c() - i4, f170P[0], f170P[1] - i4, 12, i4, f171Q[2] + ((i9 * (f171Q[16] * (i7 * 2))) / 10000), f171Q[3] + ((i9 * (f171Q[17] * (i7 * 2))) / 10000), f171Q[2] + ((i9 * (f171Q[14] * (i7 * 2))) / 10000), f171Q[3] + ((i9 * (f171Q[15] * (i7 * 2))) / 10000), i7 - 2, i8 - 2) : m411a(m280b(), m204c() - i4, f170P[0], f170P[1] - i4, 12, i4, f171Q[2] + ((i9 * (f171Q[16] * i7)) / 10000), f171Q[3] + ((i9 * (f171Q[17] * i7)) / 10000), f171Q[2] + ((i9 * (f171Q[14] * i7)) / 10000), f171Q[3] + ((i9 * (f171Q[15] * i7)) / 10000), 6, 6)) >= 0) {
            m488F();
        }
    }

    /* renamed from: bz */
    private void m205bz(int i) {
        int i2 = 16;
        int i3 = 16;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        f171Q[6] = f171Q[2];
        f171Q[7] = f171Q[3];
        if (f171Q[4] == 248 && this.f315c == 2) {
            i3 = 16;
            if (Math.abs(m280b() - f171Q[8]) <= 64 && Math.abs((m204c() + 12) - ((f171Q[9] - 32) + 8)) <= 32) {
                f286g[f171Q[4] - 240] = true;
            }
            if (Math.abs(m280b() - f171Q[8]) <= 64 && Math.abs((m204c() + 12) - (f171Q[9] + 48)) <= 32) {
                f286g[f171Q[4] - 240] = false;
            }
            if (!f286g[f171Q[4] - 240] || f171Q[3] <= this.f384be) {
                f171Q[18] = 1;
                f171Q[5] = 0;
                f171Q[2] = (f171Q[8] + 128) - f171Q[5];
            } else {
                f171Q[18] = 1;
                f171Q[5] = 128;
                f171Q[2] = (f171Q[8] + 128) - f171Q[5];
            }
            i2 = 64 - 1;
        } else if (f171Q[4] == 241 && f286g[128] && this.f314b == 1 && this.f315c == 3) {
            i3 = 16;
            if (f171Q[19] == 0) {
                if (f286g[128] && f171Q[18] == 0) {
                    f171Q[18] = 1;
                    f171Q[5] = 128;
                    f171Q[2] = (f171Q[8] + 128) - f171Q[5];
                }
                f171Q[18] = 1;
                if (f171Q[5] != 0) {
                    int[] iArr = f171Q;
                    iArr[5] = iArr[5] + 1;
                    if (f171Q[5] > 128) {
                        f171Q[5] = 128;
                    }
                    f171Q[2] = (f171Q[8] + 128) - f171Q[5];
                } else if (f286g[128]) {
                    f171Q[5] = 1;
                } else {
                    f171Q[2] = f171Q[8] + 128;
                }
            } else {
                if (f286g[128] && f171Q[18] == 0) {
                    f171Q[18] = 1;
                    f171Q[5] = 128;
                    f171Q[2] = f171Q[8] + f171Q[5];
                }
                f171Q[18] = 1;
                if (f171Q[5] != 0) {
                    int[] iArr2 = f171Q;
                    iArr2[5] = iArr2[5] + 1;
                    if (f171Q[5] > 128) {
                        f171Q[5] = 128;
                    }
                    f171Q[2] = f171Q[8] + f171Q[5];
                } else if (f286g[128]) {
                    f171Q[5] = 1;
                } else {
                    f171Q[2] = f171Q[8];
                }
            }
            i2 = 64 - 1;
        } else if (f171Q[4] >= 240) {
            i3 = 16;
            if (f171Q[19] == 0) {
                if (f286g[f171Q[4] - 240] && f171Q[18] == 0) {
                    f171Q[18] = 1;
                    f171Q[5] = 128;
                    f171Q[2] = (f171Q[8] + 128) - f171Q[5];
                }
                f171Q[18] = 1;
                if (f171Q[5] != 0) {
                    int[] iArr3 = f171Q;
                    iArr3[5] = iArr3[5] + 1;
                    if (f171Q[5] > 128) {
                        f171Q[5] = 128;
                    }
                    f171Q[2] = (f171Q[8] + 128) - f171Q[5];
                } else if (f286g[f171Q[4] - 240]) {
                    f171Q[5] = 1;
                } else {
                    f171Q[2] = f171Q[8] + 128;
                }
            } else {
                if (f286g[f171Q[4] - 240] && f171Q[18] == 0) {
                    f171Q[18] = 1;
                    f171Q[5] = 128;
                    f171Q[2] = f171Q[8] + f171Q[5];
                }
                f171Q[18] = 1;
                if (f171Q[5] != 0) {
                    int[] iArr4 = f171Q;
                    iArr4[5] = iArr4[5] + 1;
                    if (f171Q[5] > 128) {
                        f171Q[5] = 128;
                    }
                    f171Q[2] = f171Q[8] + f171Q[5];
                } else if (f286g[f171Q[4] - 240]) {
                    f171Q[5] = 1;
                } else {
                    f171Q[2] = f171Q[8];
                }
            }
            i2 = 64 - 1;
        } else if (f171Q[4] == 229 && this.f314b == 1 && this.f315c == 0) {
            i3 = 32;
            if (f171Q[5] != 0) {
                if (f171Q[18] != 0 && f171Q[2] < m280b() - 12) {
                    f171Q[18] = 0;
                }
                if (f171Q[18] == 0) {
                    int[] iArr5 = f171Q;
                    iArr5[5] = iArr5[5] - 1;
                    if (f171Q[5] < 0) {
                        f171Q[5] = 0;
                    }
                    f171Q[3] = (f171Q[9] + 64) - f171Q[5];
                } else {
                    int[] iArr6 = f171Q;
                    iArr6[5] = iArr6[5] + 1;
                    if (f171Q[5] > 64) {
                        f171Q[5] = 64;
                    }
                    f171Q[3] = (f171Q[9] + 64) - f171Q[5];
                }
            } else if (f176d[f171Q[4] - 96]) {
                f171Q[5] = 1;
                f171Q[18] = 1;
            } else {
                f171Q[3] = f171Q[9] + 64;
            }
            i2 = 8 - 1;
        } else if (f171Q[4] >= 224) {
            i3 = 32;
            if (f286g[f171Q[4] - 224] && f171Q[18] == 0) {
                f171Q[18] = 1;
                f171Q[5] = 64;
                f171Q[3] = (f171Q[9] + 64) - f171Q[5];
            }
            f171Q[18] = 1;
            if (f171Q[5] != 0) {
                int[] iArr7 = f171Q;
                iArr7[5] = iArr7[5] + 1;
                if (f171Q[5] > 64) {
                    f171Q[5] = 64;
                }
                f171Q[3] = (f171Q[9] + 64) - f171Q[5];
            } else if (f286g[f171Q[4] - 224]) {
                f171Q[5] = 1;
            } else {
                f171Q[3] = f171Q[9] + 64;
            }
            i2 = 8 - 1;
        } else if (f171Q[4] == 19) {
            i2 = 32;
            i3 = 32;
            int[] iArr8 = f171Q;
            iArr8[5] = iArr8[5] + 1;
            int i5 = (this.f319g % 360 <= 90 || this.f319g % 360 >= 270) ? 32 : 33;
            if (f171Q[19] == 0) {
                f171Q[3] = (f171Q[9] + ((m429a(this.f319g) * i5) / 100)) - i5;
            } else {
                f171Q[3] = (f171Q[9] - ((m429a(this.f319g) * i5) / 100)) - i5;
            }
            z2 = true;
        } else if (f171Q[4] >= 0 && f171Q[4] <= 2) {
            i2 = 16;
            i3 = 16;
            int i6 = f171Q[2];
            if (f171Q[4] != 0) {
                int[] iArr9 = f171Q;
                iArr9[5] = iArr9[5] + 1;
                int i7 = 32 * f171Q[4];
                if (f171Q[19] == 0) {
                    f171Q[2] = (f171Q[8] + ((m429a(this.f319g) * i7) / 100)) - i7;
                } else {
                    f171Q[2] = (f171Q[8] - ((m429a(this.f319g) * i7) / 100)) - i7;
                }
            }
            i4 = i6 - f171Q[2];
            z = true;
        } else if (f171Q[4] <= 91 && f171Q[4] >= 88) {
            i2 = 16;
            i3 = 16;
            int i8 = f171Q[2];
            int i9 = (32 * ((f171Q[4] - 88) + 1)) - 16;
            if (this.f319g % 720 < 180) {
                if (f171Q[19] == 0) {
                    f171Q[3] = f171Q[9] - ((m429a(90 + (this.f319g % 720)) * i9) / 100);
                    f171Q[2] = (f171Q[8] - 16) + (32 * ((f171Q[4] - 88) + 1));
                } else {
                    f171Q[3] = f171Q[9] + ((m429a(90 + (this.f319g % 720)) * i9) / 100);
                    f171Q[2] = (f171Q[8] + 16) - (32 * ((f171Q[4] - 88) + 1));
                }
            } else if (this.f319g % 720 < 360) {
                if (f171Q[19] == 0) {
                    f171Q[2] = f171Q[8] - ((m429a(270 - ((this.f319g % 720) - 180)) * i9) / 100);
                    f171Q[3] = (f171Q[9] - 16) + (32 * ((f171Q[4] - 88) + 1));
                } else {
                    f171Q[2] = f171Q[8] + ((m429a(270 - ((this.f319g % 720) - 180)) * i9) / 100);
                    f171Q[3] = (f171Q[9] + 16) - (32 * ((f171Q[4] - 88) + 1));
                }
                z = true;
            } else if (this.f319g % 720 < 540) {
                if (f171Q[19] == 0) {
                    f171Q[3] = f171Q[9] + ((m429a(90 + ((this.f319g % 720) - 360)) * i9) / 100);
                    f171Q[2] = (f171Q[8] + 16) - (32 * ((f171Q[4] - 88) + 1));
                } else {
                    f171Q[3] = f171Q[9] - ((m429a(90 + ((this.f319g % 720) - 360)) * i9) / 100);
                    f171Q[2] = (f171Q[8] - 16) + (32 * ((f171Q[4] - 88) + 1));
                }
            } else if (this.f319g % 720 < 720) {
                if (f171Q[19] == 0) {
                    f171Q[2] = f171Q[8] + ((m429a(270 - ((this.f319g % 720) - 540)) * i9) / 100);
                    f171Q[3] = (f171Q[9] + 16) - (32 * ((f171Q[4] - 88) + 1));
                } else {
                    f171Q[2] = f171Q[8] - ((m429a(270 - ((this.f319g % 720) - 540)) * i9) / 100);
                    f171Q[3] = (f171Q[9] - 16) + (32 * ((f171Q[4] - 88) + 1));
                }
                z = true;
            }
            i4 = i8 - f171Q[2];
        } else if (f171Q[4] == 160) {
            i2 = 16;
            i3 = 32;
            if (f286g[0] && f171Q[18] == 0) {
                f171Q[18] = 1;
                f171Q[3] = f171Q[9];
            }
            f171Q[18] = 1;
            if (f286g[0]) {
                int[] iArr10 = f171Q;
                iArr10[3] = iArr10[3] - 1;
                if (f171Q[3] < f171Q[9]) {
                    f171Q[3] = f171Q[9];
                }
            } else if (this.f315c == 0) {
                f171Q[3] = 688;
            } else {
                f171Q[3] = f171Q[9] + 64;
            }
        } else if (f171Q[4] == 55) {
            i2 = 32;
            i3 = 25;
            if (f286g[f171Q[4] - 40] && f171Q[18] == 0) {
                f171Q[18] = 1;
                f171Q[2] = 7992;
            }
            f171Q[18] = 1;
            if ((f171Q[8] != 7992 || f171Q[9] != 1353) && f286g[f171Q[4] - 40]) {
                int[] iArr11 = f171Q;
                iArr11[2] = iArr11[2] + 1;
                if (f171Q[2] > 7992) {
                    f171Q[2] = 7992;
                }
            }
        }
        int i10 = 12;
        if (!f198N && !f200P) {
            i10 = 16;
        }
        int i11 = -1;
        if (f171Q[4] != 55 || f171Q[8] != 7992 || f171Q[9] != 1353) {
            int m411a = m411a(m280b(), m204c() - i10, f170P[0], f170P[1] - i10, 12, i10, f171Q[2], f171Q[3], f171Q[6], f171Q[7], i2, i3);
            i11 = m411a;
            if (m411a >= 0) {
                if (i11 == 0) {
                    f190Y[1] = (f171Q[3] - i3) << 8;
                    m129d(f171Q[2], i2);
                    m81i(f171Q[22]);
                    int[] iArr12 = f190Y;
                    iArr12[0] = iArr12[0] - (i4 << 8);
                } else if (i11 == 1) {
                    if (!f194J || f171Q[4] != 227) {
                        f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                        f190Y[10] = 0;
                        if (f166c[4]) {
                            m5y();
                        }
                    }
                } else if (i11 == 2) {
                    f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                    f190Y[10] = 0;
                    if (f166c[3]) {
                        m5y();
                    }
                } else if (i11 == 3) {
                    f190Y[1] = ((((f171Q[3] + i3) + i10) + i10) + 1) << 8;
                    m310al();
                } else if (i11 == 4) {
                    if (z) {
                        if (f171Q[2] <= m280b()) {
                            f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                            f190Y[10] = 0;
                            if (f166c[3]) {
                                m5y();
                            }
                        } else if (!f194J || f171Q[4] != 227) {
                            f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                            f190Y[10] = 0;
                            if (f166c[4]) {
                                m5y();
                            }
                        }
                    }
                    if (z2) {
                        if (f171Q[3] > m204c() - i10) {
                            f190Y[1] = (f171Q[3] - i3) << 8;
                            m129d(f171Q[2], i2);
                            m81i(f171Q[22]);
                            int[] iArr13 = f190Y;
                            iArr13[0] = iArr13[0] - (i4 << 8);
                            i11 = 0;
                        } else {
                            f190Y[1] = (((((f171Q[3] + i3) + i10) + i10) + 1) + 8) << 8;
                            m310al();
                        }
                    }
                }
            }
        }
        if (f33D && f35av == f171Q[20] && i11 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bA */
    private void m256bA(int i) {
        m372aC(i);
    }

    /* renamed from: bB */
    private void m255bB(int i) {
        m372aC(i);
    }

    /* renamed from: bC */
    private void m254bC(int i) {
        m372aC(i);
    }

    /* renamed from: bD */
    private void m253bD(int i) {
        m372aC(i);
    }

    /* renamed from: bE */
    private void m252bE(int i) {
        m372aC(i);
    }

    /* renamed from: bF */
    private void m251bF(int i) {
        m372aC(i);
    }

    /* renamed from: bG */
    private void m250bG(int i) {
        m372aC(i);
    }

    /* renamed from: bH */
    private void m249bH(int i) {
        m248bI(i);
    }

    /* renamed from: bI */
    private void m248bI(int i) {
        int i2 = 0;
        int i3 = -1;
        f171Q[7] = f171Q[3];
        f171Q[11] = f171Q[2];
        if (f171Q[4] == 1 || f171Q[4] == 0) {
            if (Math.abs(m280b() - f171Q[2]) > 320) {
                f171Q[2] = f171Q[8];
                f171Q[3] = f171Q[9];
                f171Q[5] = 0;
            }
        } else if (f171Q[4] == 12 && Math.abs(m280b() - f171Q[2]) > 320) {
            f171Q[2] = f171Q[8];
            f171Q[3] = f171Q[9];
            f171Q[5] = 0;
        }
        if (f171Q[4] != 16) {
            if (f171Q[5] == 0) {
                f171Q[3] = f171Q[9] + ((m429a(f171Q[5]) * 0) / 100);
                f171Q[2] = f171Q[8] + ((m429a(f171Q[5]) * 0) / 100);
            } else if (f171Q[4] == 1) {
                int[] iArr = f171Q;
                iArr[5] = iArr[5] + 1;
                if (f171Q[5] > 128) {
                    f171Q[5] = 128;
                }
                f171Q[3] = f171Q[9] - (f171Q[5] * 2);
            } else if (f171Q[4] == 0) {
                int[] iArr2 = f171Q;
                iArr2[5] = iArr2[5] + 1;
                if (f171Q[5] > 64) {
                    f171Q[5] = 64;
                }
                f171Q[3] = f171Q[9] - (f171Q[5] * 2);
            } else if (f171Q[4] == 3) {
                int[] iArr3 = f171Q;
                iArr3[5] = iArr3[5] + 1;
                if (f171Q[5] > 64) {
                    f171Q[5] = 64;
                }
                f171Q[3] = f171Q[9] + (f171Q[5] * 2);
            } else if (f171Q[4] == 12) {
                int[] iArr4 = f171Q;
                iArr4[5] = iArr4[5] + 1;
                if (f171Q[5] > 128) {
                    f171Q[5] = 128;
                }
                int i4 = f171Q[2];
                f171Q[2] = f171Q[8] + (f171Q[5] * 2);
                f171Q[3] = f171Q[9] - f171Q[5];
                i2 = i4 - f171Q[2];
            }
            int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[11], f171Q[7], 40, 8);
            i3 = m411a;
            if (m411a >= 0 && i3 == 0) {
                f190Y[1] = (f171Q[3] - 8) << 8;
                int[] iArr5 = f190Y;
                iArr5[0] = iArr5[0] - (i2 << 8);
                if (f171Q[5] == 0 && Math.abs(m280b() - f171Q[2]) <= 48) {
                    f171Q[5] = 1;
                }
                m129d(f171Q[2], 40);
                m81i(f171Q[22]);
            }
        } else {
            int[] iArr6 = f171Q;
            iArr6[5] = iArr6[5] + 1;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = f171Q[3] - (((f171Q[5] + 1) + (i5 * 128)) % 384);
                int m411a2 = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], i6, f171Q[11], f171Q[3] - ((f171Q[5] + (i5 * 128)) % 384), 40, 8);
                i3 = m411a2;
                if (m411a2 >= 0 && i3 == 0) {
                    f190Y[1] = (i6 - 8) << 8;
                    m129d(f171Q[2], 40);
                    m81i(f171Q[22]);
                }
            }
        }
        if (f33D && f35av == f171Q[20] && i3 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bJ */
    private void m247bJ(int i) {
        int i2 = 0;
        int i3 = f171Q[4] / 16;
        if (f171Q[18] == 0) {
            f171Q[10] = this.f319g;
            f171Q[18] = 1;
        }
        if ((this.f319g - f171Q[10]) % (i3 * 50) != 0 || f171Q[2] - f177R[0] < -16 || f171Q[2] - f177R[0] > 256 || f171Q[3] - f177R[1] < -16 || f171Q[3] - f177R[1] > 184) {
            return;
        }
        if (f171Q[4] == 48 || f171Q[4] == 66 || f171Q[4] == 65 || f171Q[4] == 49 || f171Q[4] == 80 || f171Q[4] == 64 || f171Q[4] == 81) {
            if (f171Q[4] == 48) {
                i2 = 96;
            }
            if (f171Q[4] == 49) {
                i2 = 128;
            }
            if (f171Q[4] == 64) {
                i2 = 96;
            }
            if (f171Q[4] == 65) {
                i2 = 128;
            }
            if (f171Q[4] == 66) {
                i2 = 196;
            }
            if (f171Q[4] == 80) {
                i2 = 72;
            }
            if (f171Q[4] == 81) {
                i2 = 136;
            }
            if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                m391a("ae");
            }
            m412a(20, f171Q[2], f171Q[3], 0, 0, 0, i2);
        } else if (f171Q[4] == 53 || f171Q[4] == 37 || f171Q[4] == 69) {
            if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                m391a("ae");
            }
            m412a(16, f171Q[2], f171Q[3], 0, 200, 0, 0);
        } else if (f171Q[4] == 55 || f171Q[4] == 71 || f171Q[4] == 23) {
            if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                m391a("ae");
            }
            m412a(16, f171Q[2], f171Q[3], 200, 0, 0, 0);
        } else if (f171Q[4] == 54) {
            if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                m391a("ae");
            }
            m412a(16, f171Q[2], f171Q[3], -200, 0, 0, 0);
        }
    }

    /* renamed from: bK */
    private void m246bK(int i) {
        int i2 = 0;
        if (this.f315c == 2) {
            i2 = 1;
        }
        if (f171Q[4] == 16) {
            int[][] m422a = m422a(10, 2);
            int i3 = 0;
            while (true) {
                if (i3 >= m422a.length) {
                    break;
                } else if (Math.abs(((f171Q[2] + 32) - (64 * i2)) - m422a[i3][2]) < 2) {
                    if (f171Q[5] == 0) {
                        f171Q[5] = 1;
                        f171Q[10] = this.f319g;
                        if (f171Q[2] - f179T[0] >= -32 && f171Q[2] - f179T[0] <= 272 && f171Q[3] - f179T[1] >= -32 && f171Q[3] - f179T[1] <= 200) {
                            m391a("c8");
                        }
                    }
                    f171Q[7] = m422a[i3][20];
                } else {
                    i3++;
                }
            }
            if (f171Q[7] > 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= m422a.length) {
                        break;
                    } else if (m422a[i4][20] == f171Q[7]) {
                        f171Q[6] = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (f171Q[10] != 0) {
                f171Q[5] = this.f319g - f171Q[10];
            }
            if (f171Q[5] > 0 && f171Q[7] > 0) {
                if (f171Q[5] / 4 > 44) {
                    f171Q[5] = 0;
                    f171Q[6] = 0;
                    f171Q[7] = 0;
                    f171Q[10] = 0;
                } else if (f171Q[5] / 4 > 26) {
                    f171Q[3] = f171Q[9] - (160 - ((f171Q[5] - 104) * 2));
                } else if (f171Q[5] / 4 > 6) {
                    f171Q[3] = f171Q[9] - ((f171Q[5] - 24) * 2);
                }
                int[] iArr = f171Q;
                iArr[5] = iArr[5] + 1;
            }
            if (f171Q[4] != 16 || f171Q[5] / 4 <= 0 || (f171Q[2] - 20) - 32 > m280b() || ((f171Q[2] - 20) - 32) + 112 < m280b() || f171Q[3] > m204c() || f171Q[9] < m204c()) {
                return;
            }
            m488F();
        }
    }

    /* renamed from: bL */
    private void m245bL(int i) {
        int i2 = 72;
        int i3 = 0;
        if (f171Q[6] == 0 && f171Q[7] == 0) {
            f171Q[6] = f171Q[2];
            f171Q[7] = f171Q[3];
        }
        if (f171Q[4] == 1) {
            f171Q[5] = this.f319g;
            i3 = ((((m429a(f171Q[5]) * 16) / 100) - 16) * 2) + 2;
        } else if (f171Q[4] == 2) {
            f171Q[5] = this.f319g;
            i3 = ((((m429a(f171Q[5]) * (-16)) / 100) - 16) * 2) + 2;
        } else if (f171Q[4] == 20) {
            i2 = 56;
            if (f171Q[5] != 0) {
                f171Q[5] = this.f319g - (f171Q[10] - 1);
                if (f171Q[5] > 72) {
                    f171Q[5] = 72;
                }
                f171Q[3] = (f171Q[9] - 160) + (f171Q[5] * 2);
            } else if (f176d[1]) {
                f171Q[5] = 1;
                f171Q[10] = this.f319g;
            } else {
                f171Q[3] = f171Q[9] - 160;
            }
            i3 = 16;
        } else if (f171Q[4] == 4) {
            i2 = 56;
            if (f176d[0] || f171Q[5] != 0) {
                if (f176d[0] && f171Q[5] == 0) {
                    f171Q[10] = this.f319g;
                }
                f171Q[5] = this.f319g - (f171Q[10] - 1);
                if (f171Q[5] > 72) {
                    f171Q[5] = 72;
                }
                f171Q[3] = (f171Q[9] - 160) + (f171Q[5] * 2);
            } else {
                f171Q[3] = f171Q[9] - 160;
            }
            i3 = 16;
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3] + i3, f171Q[6], f171Q[7], 32, i2);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = ((f171Q[3] + i3) - i2) << 8;
                m129d(f171Q[2], 32);
                m81i(f171Q[22]);
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - 32) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + 32) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = (((((f171Q[3] + i3) + i2) + 12) + 12) + 1) << 8;
                if (f171Q[4] == 1 && (f171Q[5] % 360 < 90 || f171Q[5] % 360 > 270)) {
                    m310al();
                } else if (f171Q[4] == 2 && f171Q[5] % 360 < 270 && f171Q[5] % 360 > 90) {
                    m310al();
                } else if (f171Q[4] != 1 && f171Q[4] != 2) {
                    m310al();
                }
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
        f171Q[7] = f171Q[3] + i3;
        f171Q[6] = f171Q[2];
    }

    /* renamed from: bM */
    private void m244bM(int i) {
        int i2;
        int i3 = this.f319g % 132;
        int i4 = 4;
        if (f171Q[13] == 0 && f171Q[12] == 0) {
            f171Q[13] = f171Q[3];
            f171Q[12] = f171Q[2];
        }
        f171Q[6] = f171Q[12];
        f171Q[7] = f171Q[13];
        if (i3 < 60) {
            f171Q[5] = 0;
            i2 = 20;
        } else if (i3 < 64) {
            f171Q[5] = 1;
            i2 = 12;
        } else if (i3 < 124) {
            f171Q[5] = 2;
            i2 = 4;
        } else {
            f171Q[5] = 3;
            i2 = 12;
        }
        if (f171Q[4] == 0) {
            if (f171Q[19] == 0) {
                f171Q[12] = (f171Q[2] + (this.f421z[f171Q[5]] >> 1)) - 8;
            } else {
                f171Q[12] = (f171Q[2] - (this.f421z[f171Q[5]] >> 1)) + 8;
            }
        } else if (f171Q[19] == 0) {
            f171Q[13] = (f171Q[3] - (this.f421z[f171Q[5]] >> 1)) + 8;
        } else {
            f171Q[13] = (f171Q[3] + (this.f421z[f171Q[5]] >> 1)) - 8;
        }
        if (f171Q[4] == 0) {
            int i5 = i2;
            i2 = 4;
            i4 = i5;
        }
        int i6 = 12;
        if (!f198N && !f200P) {
            i6 = 20;
        }
        if (m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[12], f171Q[13], f171Q[6], f171Q[7], i4, i2) >= 0) {
            m488F();
        } else if (Math.abs(f171Q[12] - m280b()) >= 12 + i4 || Math.abs(f171Q[13] - (m204c() - i6)) >= i6 + i2) {
        } else {
            m488F();
        }
    }

    /* renamed from: bN */
    private void m243bN(int i) {
        if (this.f319g % 120 == 0) {
            if (f171Q[19] == 1) {
                if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                    m391a("ae");
                }
                m412a(21, f171Q[2] + 16, f171Q[3] + 10, 260, 0, 0, 0);
            } else if (f171Q[19] == 0) {
                if (f171Q[2] - f179T[0] >= 0 && f171Q[2] - f179T[0] <= 240 && f171Q[3] - f179T[1] >= 0 && f171Q[3] - f179T[1] <= 168) {
                    m391a("ae");
                }
                m412a(21, f171Q[2] - 16, f171Q[3] + 10, -260, 0, 0, 0);
            }
        }
    }

    /* renamed from: bO */
    private void m242bO(int i) {
        int i2 = 16;
        int i3 = 16;
        f171Q[7] = f171Q[3];
        if (f171Q[4] == 39) {
            if (f171Q[3] < this.f384be) {
                int[] iArr = f171Q;
                iArr[3] = iArr[3] + 8;
                if (m128d(f171Q[2], f171Q[3] + 16)) {
                    int[] iArr2 = f171Q;
                    iArr2[3] = iArr2[3] - ((f171Q[3] + 16) % 16);
                } else if (f171Q[3] > this.f384be) {
                    f171Q[3] = this.f384be;
                }
            } else if (f171Q[3] > this.f384be) {
                int[] iArr3 = f171Q;
                iArr3[3] = iArr3[3] - 8;
                if (m128d(f171Q[2], f171Q[3] - 16)) {
                    int[] iArr4 = f171Q;
                    iArr4[3] = iArr4[3] + ((f171Q[3] - 16) % 16);
                } else if (f171Q[3] < this.f384be) {
                    f171Q[3] = this.f384be;
                }
            }
        } else if (f171Q[4] == 19) {
            i2 = 32;
            i3 = 12;
            f171Q[6] = this.f319g;
            if (f171Q[10] == 1) {
                if (f171Q[11] % 4 == 0 && f171Q[11] <= 16) {
                    int[] iArr5 = f171Q;
                    iArr5[3] = iArr5[3] + 1;
                }
                int[] iArr6 = f171Q;
                iArr6[11] = iArr6[11] + 1;
                if (f171Q[11] > 76) {
                    f171Q[11] = 0;
                    f171Q[10] = 2;
                }
            } else if (f171Q[10] == 2) {
                int[] iArr7 = f171Q;
                iArr7[3] = iArr7[3] - 2;
                int[][] m422a = m422a(9, -1);
                int i4 = 0;
                while (true) {
                    if (i4 >= m422a.length) {
                        break;
                    }
                    if ((m422a[i4][2] - 20) - (f171Q[2] - 16) <= 32 && (m422a[i4][2] - 20) - (f171Q[2] - 16) >= -40 && (m422a[i4][3] - 60) - (f171Q[3] - 16) <= 16 && (m422a[i4][3] - 60) - (f171Q[3] - 16) >= -40) {
                        f171Q[10] = 3;
                        break;
                    }
                    i4++;
                }
            }
        } else if (f171Q[4] == 1) {
            i2 = 16;
            i3 = 16;
            if (f171Q[10] != 0) {
                int[] iArr8 = f171Q;
                iArr8[10] = iArr8[10] + 1;
                if (f171Q[10] <= 20) {
                    f171Q[3] = f171Q[9] + 2;
                } else if (f171Q[5] == 0) {
                    int[] iArr9 = f171Q;
                    iArr9[3] = iArr9[3] + 2;
                    if (m128d((f171Q[2] - 16) + 1, f171Q[3] + 16) || m128d((f171Q[2] + 16) - 1, f171Q[3] + 16)) {
                        f171Q[5] = 1;
                    }
                }
            }
            if (this.f314b == 1 && this.f315c == 3) {
                int[][] m422a2 = m422a(15, 1);
                f176d[128] = false;
                for (int i5 = 0; i5 < m422a2.length; i5++) {
                    if ((m422a2[i5][2] - 8) - (f171Q[2] - 16) <= 32 && (m422a2[i5][2] - 8) - (f171Q[2] - 16) >= -32 && (m422a2[i5][3] - 8) - (f171Q[3] - 16) <= 32 && (m422a2[i5][3] - 8) - (f171Q[3] - 16) >= -32) {
                        f176d[128] = true;
                        f286g[128] = true;
                    }
                }
            }
        }
        int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[7], i2, i3);
        if (m411a >= 0) {
            if (m411a == 0) {
                f190Y[1] = (f171Q[3] - i3) << 8;
                m129d(f171Q[2], i2);
                m81i(f171Q[22]);
                if ((f171Q[4] == 19 || f171Q[4] == 1) && f171Q[10] == 0) {
                    f171Q[10] = 1;
                }
            } else if (m411a == 1) {
                f190Y[0] = ((f171Q[2] - i2) - 12) << 8;
                f190Y[10] = 0;
                if (f166c[4]) {
                    m5y();
                }
            } else if (m411a == 2) {
                f190Y[0] = (((f171Q[2] + i2) + 12) + 1) << 8;
                f190Y[10] = 0;
                if (f166c[3]) {
                    m5y();
                }
            } else if (m411a == 3) {
                f190Y[1] = ((((f171Q[3] + i3) + 12) + 12) + 1) << 8;
                m310al();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bP */
    private void m241bP(int i) {
        int i2 = -1;
        boolean z = false;
        if (f171Q[4] != 127) {
            int i3 = 0;
            int i4 = 0;
            int length = f136A[f171Q[4] - 128].length >> 1;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < 2; i5++) {
                if (f42b[32][1][(this.f315c * 2) + i5] == f171Q[9] && f42b[32][0][(this.f315c * 2) + i5] == f171Q[8]) {
                    i4 = i5;
                }
            }
            f171Q[12] = i4;
            for (int i6 = 0; i6 < length; i6++) {
                this.f414g[i6][0] = f136A[f171Q[4] - 128][i6 << 1];
                this.f414g[i6][1] = f136A[f171Q[4] - 128][(i6 << 1) + 1];
                this.f415h[i6][0] = f136A[f171Q[4] - 128][((i6 + 1) % length) << 1];
                this.f415h[i6][1] = f136A[f171Q[4] - 128][(((i6 + 1) % length) << 1) + 1];
                iArr[i6] = Math.max(Math.abs(this.f414g[i6][1] - this.f415h[i6][1]), Math.abs(this.f414g[i6][0] - this.f415h[i6][0]));
                i3 += iArr[i6];
            }
            int i7 = i3 / 132;
            int i8 = 0;
            int i9 = 0;
            if (f171Q[18] == 0) {
                f287B[i4] = new int[i7];
                f288C[i4] = new int[i7];
            }
            f171Q[18] = 1;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = ((i10 * 132) + this.f319g) % i3;
                if (f286g[14] && this.f314b == 1 && this.f315c == 2) {
                    i11 = (i3 - 1) - i11;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    } else if (i11 >= iArr[i12]) {
                        i11 -= iArr[i12];
                        i12++;
                    } else if (Math.abs(this.f414g[i12][0] - this.f415h[i12][0]) < Math.abs(this.f414g[i12][1] - this.f415h[i12][1])) {
                        i8 = this.f414g[i12][0] + (((this.f415h[i12][0] - this.f414g[i12][0]) * i11) / iArr[i12]);
                        i9 = this.f414g[i12][1] + (i11 * ((this.f415h[i12][1] - this.f414g[i12][1]) / iArr[i12]));
                    } else {
                        i8 = this.f414g[i12][0] + (i11 * ((this.f415h[i12][0] - this.f414g[i12][0]) / iArr[i12]));
                        i9 = this.f414g[i12][1] + (((this.f415h[i12][1] - this.f414g[i12][1]) * i11) / iArr[i12]);
                    }
                }
                if (f287B[i4][i10] == 0 && f288C[i4][i10] == 0) {
                    f287B[i4][i10] = i8;
                    f288C[i4][i10] = i9;
                }
                int i13 = f287B[i4][i10];
                int i14 = f288C[i4][i10];
                f287B[i4][i10] = i8;
                f288C[i4][i10] = i9;
                if (!z) {
                    int m411a = m411a(m280b(), m204c() - 12, f170P[0], f170P[1] - 12, 12, 12, i8, i9, i13, i14, 16, 8);
                    i2 = m411a;
                    if (m411a == 0) {
                        f190Y[1] = (i9 - 8) << 8;
                        int[] iArr2 = f190Y;
                        iArr2[0] = iArr2[0] - ((i13 - i8) << 8);
                        m129d(i8, 16);
                        m81i(f171Q[22]);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            i2 = 0;
        }
        if (f33D && f35av == f171Q[20] && i2 != 0) {
            f33D = false;
        }
    }

    /* renamed from: bQ */
    private void m240bQ(int i) {
        m342aR(i);
    }

    /* renamed from: bR */
    private void m239bR(int i) {
        int m411a = m411a(m280b() - 35, m204c() - 12, f170P[0] - 35, f170P[1] - 12, 12, 12, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 4, 32);
        if (f171Q[10] >= 300) {
            m411a = -1;
        }
        if (m411a >= 0) {
            if (m411a == 1) {
                f190Y[0] = (((f171Q[2] - 4) - 12) + 35) << 8;
                f195K = true;
                int[] iArr = f171Q;
                iArr[10] = iArr[10] + 1;
            }
            if (f171Q[3] - m204c() > 4) {
                f190Y[1] = (f171Q[3] - 4) << 8;
            } else if (f171Q[3] - m204c() < -32) {
                f190Y[1] = (f171Q[3] + 32) << 8;
            }
            if (f166c[0]) {
                int[] iArr2 = f190Y;
                iArr2[0] = iArr2[0] + 256;
                f170P[0] = m280b();
            }
        }
        if (f33D && f35av == f171Q[20] && m411a != 0) {
            f33D = false;
        }
    }

    /* renamed from: bS */
    private void m238bS(int i) {
        char c = 0;
        int i2 = (this.f318f % 4) * 16;
        if (this.f318f % 4 == 3) {
            c = 4;
            i2 = 16;
        }
        if (f171Q[5] == 0) {
            m396a(f9a, this.GFX_GameArray[0], 0, i2, 16, 16, f211b[c], (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 8, 20);
        } else {
            m396a(f9a, this.GFX_GameArray[0], 16, (((this.f319g - f171Q[10]) / 5) % 4) * 16, 16, 16, f211b[0], (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 8, 20);
        }
        if (f171Q[11] == 1) {
            if (f171Q[5] == 0) {
                m396a(f9a, this.GFX_GameArray[0], 0, i2, 16, 16, f211b[c], (f171Q[2] - f179T[0]) - 8, (f171Q[12] - f179T[1]) - 8, 20);
            } else {
                m396a(f9a, this.GFX_GameArray[0], 16, (((this.f319g - f171Q[10]) / 5) % 4) * 16, 16, 16, f211b[0], (f171Q[2] - f179T[0]) - 8, (f171Q[12] - f179T[1]) - 8, 20);
            }
        }
    }

    /* renamed from: bT */
    private void m237bT(int i) {
        m238bS(i);
    }

    /* renamed from: bU */
    private void m236bU(int i) {
        int m429a = m429a(this.f318f * 3) * 87;
        int i2 = f171Q[4] + 1;
        if (f171Q[4] == 5) {
            m429a = -m429a;
        } else if (f171Q[19] == 1) {
            m429a = -m429a;
        }
        int i3 = 1;
        while (i3 < i2) {
            if (this.f314b == 3) {
                m396a(f9a, this.GFX_GameArray[3], 36, 48, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i3 * (m429a(180 + (m429a / 100)) * 16)) / 100), (f171Q[3] - f179T[1]) + ((i3 * (m276b(180 + (m429a / 100)) * 16)) / 100), 2);
            } else if (this.f314b != 5) {
                m396a(f9a, this.GFX_GameArray[3], 16, 32, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i3 * (m429a(180 + (m429a / 100)) * 16)) / 100), (f171Q[3] - f179T[1]) + ((i3 * (m276b(180 + (m429a / 100)) * 16)) / 100), 2);
            } else {
                m396a(f9a, this.GFX_GameArray[3], 0, 96, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i3 * (m429a(180 + (m429a / 100)) * 16)) / 100), (f171Q[3] - f179T[1]) + ((i3 * (m276b(180 + (m429a / 100)) * 16)) / 100), 2);
            }
            i3++;
        }
        if (this.f314b == 3) {
            m396a(f9a, this.GFX_GameArray[3], 36, 64, 16, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (this.f314b != 5) {
            m396a(f9a, this.GFX_GameArray[3], 16, 16, 16, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else {
            m396a(f9a, this.GFX_GameArray[3], 0, ((this.f319g / 3) % 3) * 32, 32, 32, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
        if (this.f314b == 3) {
            int i4 = (i3 * 16) + 8;
            m396a(f9a, this.GFX_GameArray[3], 0, 0, 88, 48, f211b[0], (f171Q[2] - f179T[0]) + ((m429a(180 + (m429a / 100)) * i4) / 100), (f171Q[3] - f179T[1]) + ((m276b(180 + (m429a / 100)) * i4) / 100), 2);
        } else if (this.f314b != 5) {
            int i5 = (i3 * 16) - 8;
            m396a(f9a, this.GFX_GameArray[3], 0, 0, 48, 16, f211b[0], (f171Q[2] - f179T[0]) + ((m429a(180 + (m429a / 100)) * i5) / 100), (f171Q[3] - f179T[1]) + ((m276b(180 + (m429a / 100)) * i5) / 100), 2);
        } else {
            int i6 = (i3 * 16) - 24;
            m396a(f9a, this.GFX_GameArray[60], 0, 0, 48, 48, f211b[0], (f171Q[2] - f179T[0]) + ((m429a(180 + (m429a / 100)) * i6) / 100), (f171Q[3] - f179T[1]) + ((m276b(180 + (m429a / 100)) * i6) / 100), 2);
        }
    }

    /* renamed from: bV */
    private void m235bV(int i) {
        for (int i2 = 0; i2 < 12; i2++) {
            int abs = f171Q[10] - Math.abs(f171Q[5] - i2);
            int i3 = abs;
            if (abs < 0) {
                i3 = 0;
            }
            if (i2 == 0 || i2 == 11) {
                i3 = 0;
            }
            m396a(f9a, this.GFX_GameArray[5], 32, 0, 16, 16, f211b[0], ((f171Q[2] - f179T[0]) - 96) + (i2 * 16), (f171Q[3] - f179T[1]) + i3, 2);
        }
    }

    /* renamed from: bW */
    private void m234bW(int i) {
        int[] iArr = {-4, 4};
        for (int i2 = 0; i2 < 12; i2++) {
            int i3 = ((this.f318f / 10) + (12 - i2)) % 7;
            m396a(f9a, this.GFX_GameArray[4], 0, i3 * 24, 16, 24, f211b[0], ((f171Q[2] - f179T[0]) - 96) + (i2 * 16), (f171Q[3] - f179T[1]) + iArr[i3 / 4], 2);
        }
    }

    /* renamed from: bX */
    private void m233bX(int i) {
        int i2 = f211b[0];
        if (f171Q[4] != 0) {
            i2 = f211b[4];
        }
        int i3 = f171Q[5] != 0 ? (this.f319g / 2) - f171Q[10] : 0;
        for (int i4 = 0; i4 < 36; i4++) {
            int i5 = i3 - (i4 * 3);
            m396a(f9a, this.GFX_GameArray[6], (i4 / 6) * 16, 96 - (((i4 % 6) + 1) * 16), 16, 16, i2, ((f171Q[2] - f179T[0]) + (f171Q[4] != 0 ? (96 - ((i4 / 6) * 16)) - 16 : (i4 / 6) * 16)) - 40, ((((f171Q[3] - f179T[1]) + 96) - (((i4 % 6) + 1) * 16)) - 48) + (i5 < 0 ? 0 : i5 * (i3 / 6)), 2);
        }
    }

    /* renamed from: bY */
    private void m232bY(int i) {
        byte b = f171Q[4] == 21 ? (byte) 2 : f171Q[4] == 1 ? (byte) 0 : (byte) 1;
        if (f171Q[4] != 21) {
            if (f171Q[4] == 1) {
                m396a(f9a, this.GFX_GameArray[7], 0, 96, 128, 80, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
                return;
            }
            for (int i2 = 0; i2 < 4; i2++) {
                m396a(f9a, this.GFX_GameArray[7], 0, 0, 16, 96, f211b[0], ((f171Q[2] - f179T[0]) - 32) + (i2 << 4), (f171Q[3] - f179T[1]) - 48, 20);
            }
            return;
        }
        m396a(f9a, this.GFX_GameArray[7], 16, 0, 128, 96, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
        if (f171Q[16] >= 60) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = this.f318f - f171Q[15];
                if ((i3 << 3) < i4) {
                    i4 = i3 << 3;
                }
                m396a(f9a, this.GFX_GameArray[101], 0, ((this.f318f + (i3 << 1)) % 4) << 5, 24, 32, f211b[0], ((f171Q[2] - f179T[0]) + (i4 << 1)) - 56, (f171Q[3] - f179T[1]) - f42b[25][b == 1 ? 1 : 0][i4], 2);
            }
        }
    }

    /* renamed from: bZ */
    private void m231bZ(int i) {
        for (int i2 = 0; i2 <= (f171Q[3] - f171Q[9]) / 16; i2++) {
            m396a(f9a, this.GFX_GameArray[94], 0, 8, 32, 16, f211b[0], f171Q[8] - f179T[0], ((f171Q[9] - f179T[1]) - 24) + (i2 * 16) + ((f171Q[3] - f171Q[9]) % 16), 2);
        }
        m396a(f9a, this.GFX_GameArray[94], 0, 0, 32, 8, f211b[0], f171Q[8] - f179T[0], (f171Q[9] - f179T[1]) - 24, 2);
        if (f171Q[4] == 128 || f171Q[4] == 2) {
            m396a(f9a, this.GFX_GameArray[8], 0, 24, 112, 32, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 28, 2);
            m396a(f9a, this.GFX_GameArray[8], 0, 0, 112, 24, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 35) {
            m396a(f9a, this.GFX_GameArray[95], 0, 0, 32, 24, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 17 || f171Q[4] == 18) {
            m396a(f9a, this.GFX_GameArray[8], 0, 24, 112, 32, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 28, 2);
            m396a(f9a, this.GFX_GameArray[8], 0, 0, 48, 24, f211b[0], (f171Q[2] - f179T[0]) - 48, (f171Q[3] - f179T[1]) - 12, 20);
            m396a(f9a, this.GFX_GameArray[8], 64, 0, 48, 24, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 12, 20);
        }
        m396a(f9a, this.GFX_GameArray[94], 0, 24, 32, 8, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
    }

    /* renamed from: ca */
    private void m161ca(int i) {
        byte b = f171Q[19] == 2 ? (byte) 2 : (byte) 0;
        if (f171Q[4] == 48) {
            for (int i2 = 0; i2 < 3; i2++) {
                m396a(f9a, this.GFX_GameArray[9], 0, 0, 8, 32, f211b[b], ((f171Q[2] - f179T[0]) - 24) + (i2 * 24), f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[4] == 64) {
            if (this.f314b == 1 && this.f315c == 0 && f171Q[4] == 64 && f171Q[19] != 0) {
                return;
            }
            for (int i3 = 0; i3 < 6; i3++) {
                m396a(f9a, this.GFX_GameArray[9], 16, 0, 8, 32, f211b[b], ((f171Q[2] - f179T[0]) - 60) + (i3 * 24), f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[4] == 18 || f171Q[4] == 16) {
            m396a(f9a, this.GFX_GameArray[9], 0, 0, 40, 32, f211b[(f171Q[19] == 0 ? (byte) 3 : (byte) 1) == 1 ? 1 : 0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 82) {
            if (f171Q[19] == 0) {
                m396a(f9a, this.GFX_GameArray[9], 16, 0, 8, 32, f211b[7], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            } else {
                m396a(f9a, this.GFX_GameArray[9], 16, 0, 8, 32, f211b[1], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[4] == 32) {
            m396a(f9a, this.GFX_GameArray[9], 16, 0, 8, 32, f211b[b], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else {
            m396a(f9a, this.GFX_GameArray[9], 0, 0, 40, 32, f211b[b], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: cb */
    private void m160cb(int i) {
        if (f171Q[4] != 129) {
            m397a(f9a, this.GFX_GameArray[54], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            m418a(((f171Q[2] - f179T[0]) >> 4) - 1, ((f171Q[3] - f179T[1]) >> 4) - 1, 4, 4);
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m397a(f9a, this.GFX_GameArray[54], ((f171Q[2] - f179T[0]) - 62) + (31 * i2), (f171Q[3] - f179T[1]) - 16, 20);
        }
    }

    /* renamed from: cc */
    private void m159cc(int i) {
        m397a(f9a, this.GFX_GameArray[11], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        if (f171Q[4] == 2 || f171Q[4] == 10) {
            m418a(((f171Q[2] - f179T[0]) >> 4) - 1, ((f171Q[3] - f179T[1]) >> 4) - 1, 4, 4);
        }
    }

    /* renamed from: cd */
    private void m158cd(int i) {
        if (this.f315c == 3) {
            return;
        }
        if (f171Q[4] == 2 || f171Q[4] == 1) {
            m396a(f9a, this.GFX_GameArray[54], 0, 0, 31, 32, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            if (f171Q[4] == 2) {
                m418a(((f171Q[2] - f179T[0]) >> 4) - 1, ((f171Q[3] - f179T[1]) >> 4) - 1, 4, 4);
            }
        } else if (f171Q[4] == 65) {
            for (int i2 = 0; i2 < 3; i2++) {
                m397a(f9a, this.GFX_GameArray[54], (f171Q[2] - f179T[0]) + (i2 << 5), f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[4] == 57) {
            for (int i3 = 1; i3 < 15; i3++) {
                m396a(f9a, this.GFX_GameArray[12], 0, 24, 8, 24, f211b[0], ((f171Q[2] - f179T[0]) - 64) + (i3 << 3), (f171Q[3] - f179T[1]) - 8, 20);
            }
            m396a(f9a, this.GFX_GameArray[12], 0, 0, 8, 24, f211b[0], (f171Q[2] - f179T[0]) - 64, (f171Q[3] - f179T[1]) - 8, 20);
            m396a(f9a, this.GFX_GameArray[12], 0, 0, 8, 24, f211b[4], (f171Q[2] - f179T[0]) + 56, (f171Q[3] - f179T[1]) - 8, 20);
        } else if (f171Q[4] == 40) {
            for (int i4 = 0; i4 < 8; i4++) {
                m396a(f9a, this.GFX_GameArray[12], 8, (i4 % 2) * 24, 8, 24, f211b[0], ((f171Q[2] - f179T[0]) - 32) + (i4 << 3), (f171Q[3] - f179T[1]) - 8, 20);
            }
        } else if ((f171Q[4] == 7 || f171Q[4] == 4) && f171Q[5] != 0) {
            m396a(f9a, this.GFX_GameArray[12], 0, 0, 32, 16, f211b[4], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: ce */
    private void m157ce(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            m396a(f9a, this.GFX_GameArray[13], 0, ((this.f318f + i2) % 3) << 5, 32, 32, f211b[0], (f171Q[2] - f179T[0]) + (i2 << 5) + 48, ((f171Q[3] - f179T[1]) + (i2 << 5)) - 16, 2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = (f171Q[2] - f179T[0]) + ((i3 >> 1) << 5) + 16;
            for (int i5 = 0; i5 < (i4 / 32) + 2; i5++) {
                m396a(f9a, this.GFX_GameArray[99], 0, ((this.f318f + i3) % 3) * 16, 32, 16, f211b[0], (((f171Q[2] - f179T[0]) + ((i3 >> 1) << 5)) + 16) - (i5 << 5), ((f171Q[3] - f179T[1]) + (i3 << 4)) - 24, 2);
            }
        }
    }

    /* renamed from: cf */
    private void m156cf(int i) {
        if (f171Q[5] / 4 != 0 && f171Q[3] - 32 < f171Q[9]) {
            m396a(f9a, this.GFX_GameArray[98], 0, 32 * (this.f318f % 2), 64, 32, f211b[0], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 32, 20);
        }
        int i2 = f171Q[5] / 4;
        int i3 = i2;
        if (i2 > 6) {
            i3 = 6;
        }
        int i4 = 1;
        while (i4 < i3) {
            if (((f171Q[3] - (i4 * 32)) - 32) + 32 < f171Q[9]) {
                m396a(f9a, this.GFX_GameArray[14], 0, 32 * (i4 % 2), 64, 32, f211b[0], (f171Q[2] - f179T[0]) - 32, ((f171Q[3] - f179T[1]) - (i4 * 32)) - 32, 20);
            } else if ((f171Q[3] - (i4 * 32)) - 32 < f171Q[9]) {
                m396a(f9a, this.GFX_GameArray[14], 0, 32 * (i4 % 2), 64, 24, f211b[0], (f171Q[2] - f179T[0]) - 32, ((f171Q[3] - f179T[1]) - (i4 * 32)) - 32, 20);
            }
            i4++;
        }
        if (f171Q[5] / 4 != 0 && (f171Q[3] - (i4 * 32)) - 32 < f171Q[9]) {
            m396a(f9a, this.GFX_GameArray[98], 0, 64 + (32 * (this.f318f % 2)), 64, 32, f211b[0], (f171Q[2] - f179T[0]) - 32, ((f171Q[3] - f179T[1]) - (i4 * 32)) - 32, 20);
        }
        if (f171Q[10] <= 0 || this.f422A.length <= f171Q[10] / 3) {
            return;
        }
        m396a(f9a, this.GFX_GameArray[77], 0, 32 * this.f422A[f171Q[10] / 3], 112, 32, f211b[0], f171Q[8] - f179T[0], f171Q[9] - f179T[1], 2);
    }

    /* renamed from: cg */
    private void m155cg(int i) {
        if (f176d[f171Q[4]]) {
            m396a(f9a, this.GFX_GameArray[15], 0, 16, 32, 8, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else {
            m396a(f9a, this.GFX_GameArray[15], 0, 0, 32, 11, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 3, 2);
        }
        m396a(f9a, this.GFX_GameArray[15], 0, 11, 32, 5, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 5, 2);
    }

    /* renamed from: ch */
    private void m154ch(int i) {
        if (this.f314b != 3) {
            if (f171Q[4] != 16) {
                m396a(f9a, this.GFX_GameArray[16], 0, 0, 64, 32, 0, f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + f171Q[14], 2);
                return;
            }
            m396a(f9a, this.GFX_GameArray[16], 0, 32, 64, 48, 0, f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 8 + f171Q[14], 2);
            for (int i2 = 5; i2 >= 0; i2--) {
                m396a(f9a, this.GFX_GameArray[16], 0, 64, 64, 16, 0, f171Q[2] - f179T[0], ((((f171Q[3] - f179T[1]) + 8) + 48) - 16) + (16 * i2) + f171Q[14], 2);
            }
            return;
        }
        int i3 = (this.f318f / 4) % 6;
        int i4 = i3;
        if (i3 > 3) {
            i4 = 6 - i4;
        }
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = 0;
            while (i6 < 3) {
                m396a(f9a, this.GFX_GameArray[73], 0, i6 * 8, 16, 8, f211b[0 + (4 * (i5 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i5 * 16) + 8, ((f171Q[3] - f179T[1]) - 8) + (i6 * 8) + f171Q[14], 20);
                i6++;
            }
            m396a(f9a, this.GFX_GameArray[73], 0, (i6 * 8) + (i4 * 8), 16, 8, f211b[0 + (4 * (i5 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i5 * 16) + 8, ((f171Q[3] - f179T[1]) - 8) + (i6 * 8) + f171Q[14], 20);
        }
    }

    /* renamed from: ci */
    private void m153ci(int i) {
        m175cM(i);
    }

    /* renamed from: cj */
    private void m152cj(int i) {
        int i2 = f171Q[4] == 0 ? 0 : 1;
        if (f171Q[10] != 1) {
            for (int i3 = 0; i3 < 4; i3++) {
                m396a(f9a, this.GFX_GameArray[18], i2 * 16, 0, 16, 16, 0, ((f171Q[2] - f179T[0]) - 8) - 8, (((f171Q[3] - f179T[1]) - 16) - 16) + (i3 * 16), 20);
            }
        }
        int i4 = f171Q[4] == 2 ? 2 : 1;
        if (f171Q[11] != 1) {
            for (int i5 = 0; i5 < 4; i5++) {
                m396a(f9a, this.GFX_GameArray[18], i4 * 16, 0, 16, 16, 0, (((f171Q[2] - f179T[0]) - 8) - 8) + 16, (((f171Q[3] - f179T[1]) - 16) - 16) + (i5 * 16), 20);
            }
        }
    }

    /* renamed from: ck */
    private void m151ck(int i) {
        m397a(f9a, this.GFX_GameArray[19], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: cl */
    private void m150cl(int i) {
        int i2 = 0;
        if (f171Q[5] < 129) {
            byte b = this.f314b == 3 ? (byte) 21 : (byte) 27;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = this.f409o[i3];
                if (this.f409o[i3] % 4 >= 2) {
                    i4 -= 2;
                }
                if (f171Q[15] != 0) {
                    int i5 = (this.f319g - f171Q[16]) - this.f410p[i3];
                    i2 = i5;
                    if (i5 < 0) {
                        i2 = 0;
                    }
                }
                m396a(f9a, this.GFX_GameArray[b == 1 ? 1 : 0], (i4 % 4) * 16, (i4 / 4) * 16, 16, 16, 0, (((f171Q[2] - f179T[0]) + ((this.f409o[i3] % 4) * 16)) - 16) - 8, (f171Q[3] - f179T[1]) + ((this.f409o[i3] / 4) * 16) + (i2 * (i2 / 5)), 2);
            }
        }
    }

    /* renamed from: cm */
    private void m149cm(int i) {
        int i2 = f171Q[18] > 0 ? 1 : 0;
        int i3 = (this.f318f / 4) % 6;
        int i4 = i3;
        if (i3 > 3) {
            i4 = 6 - i4;
        }
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = f171Q[5];
            int i7 = i6 > 60 ? i6 - 60 : 0;
            int i8 = (i7 / 4) * ((i5 + 2) / 2);
            if (f171Q[19] == 0) {
                i8 = (i7 / 4) * (4 - (i5 / 2));
            }
            int i9 = 0;
            while (i9 < 3) {
                m396a(f9a, this.GFX_GameArray[73], 0, i9 * 8, 16, 8, f211b[0 + (4 * (i5 % 2))], ((f171Q[2] - f179T[0]) - 16) + (i5 * 16), ((f171Q[3] - f179T[1]) - 16) + (i9 * 8) + i8 + (i2 * this.f423i[this.f318f % 2][(i5 / 2) % 2]), 20);
                i9++;
            }
            m396a(f9a, this.GFX_GameArray[73], 0, (i9 * 8) + (i4 * 8), 16, 8, f211b[0 + (4 * (i5 % 2))], ((f171Q[2] - f179T[0]) - 16) + (i5 * 16), ((f171Q[3] - f179T[1]) - 16) + (i9 * 8) + i8 + (i2 * this.f423i[this.f318f % 2][(i5 / 2) % 2]), 20);
        }
    }

    /* renamed from: cn */
    private void m148cn(int i) {
        byte b = 0;
        if (f171Q[19] != 0) {
            b = 4;
        }
        m396a(f9a, this.GFX_GameArray[22], 0, (f171Q[5] % 3) * 32, 32, 32, f211b[b == 1 ? 1 : 0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: co */
    private void m147co(int i) {
        int i2;
        if (!(f171Q[4] != 1) || !(f171Q[4] != 2)) {
            m57m(i);
        } else if (f171Q[13] >= 8) {
            m396a(f9a, this.GFX_GameArray[34], 0, 1, 32, 14, 0, (f171Q[2] - f179T[0]) - 16, (f171Q[3] - f179T[1]) - 7, 20);
        } else {
            switch (f171Q[13] / 2) {
                case 1:
                    i2 = f211b[1];
                    break;
                case 2:
                    i2 = f211b[2];
                    break;
                case 3:
                    i2 = f211b[3];
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (f171Q[13] % 2 == 0) {
                m396a(f9a, this.GFX_GameArray[34], 0, 1, 32, 14, i2, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            } else {
                m396a(f9a, this.GFX_GameArray[34], 0, 17, 32, 30, i2, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        }
    }

    /* renamed from: cp */
    private void m146cp(int i) {
        char c = 0;
        int i2 = 1;
        if (this.f314b == 5 && this.f315c == 1 && 6144 > f171Q[2] && f171Q[3] < 256) {
            i2 = 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            int i5 = f171Q[3];
            if (i3 == 1) {
                i5 += 2048;
            }
            if (f171Q[19] == 1) {
                c = 4;
            } else if (f171Q[19] == 2) {
                c = 2;
            }
            if (f171Q[19] == 0) {
                m396a(f9a, this.GFX_GameArray[26], 24, 0, 8, 16, f211b[c], ((((f171Q[2] - f179T[0]) + 1) - 3) + 3) - 2, (((((i5 - f179T[1]) - 8) + 52) + 8) + 4) - 8, 2);
            } else if (f171Q[19] == 1) {
                m396a(f9a, this.GFX_GameArray[26], 24, 0, 8, 16, f211b[c], (((((f171Q[2] - f179T[0]) + 1) - 3) + 3) - 2) + 2, (((((i5 - f179T[1]) - 8) + 52) + 8) + 4) - 8, 2);
            }
            int i6 = f171Q[5] / 4;
            int i7 = i6 % 30 < 6 ? i6 % 30 : (i6 % 30 <= 20 || i6 % 30 > 25) ? i6 % 30 >= 25 ? 0 : 5 : 5 - ((i6 - 20) % 30);
            for (int i8 = 0; i8 < i7; i8++) {
                i4 += this.f133s[4 - i8] - this.f131q[4 - i8];
                if (f171Q[19] != 2) {
                    m396a(f9a, this.GFX_GameArray[26], 0, this.f424B[4 - i8], 24, this.f132r[4 - i8], f211b[this.f425j[f171Q[19]][(this.f318f / 2) % 2]], ((f171Q[2] - f179T[0]) - 10) + 3 + 7, ((((i5 - f179T[1]) - 8) + 52) - i4) + 5, 2);
                } else {
                    m396a(f9a, this.GFX_GameArray[26], 0, this.f424B[4 - i8], 24, this.f132r[4 - i8], f211b[this.f425j[f171Q[19]][(this.f318f / 2) % 2]], (((f171Q[2] - f179T[0]) - 10) - 2) + 3 + 12, (((i5 - f179T[1]) - 8) - 52) + i4 + 18, 2);
                }
            }
            if (f171Q[19] == 2) {
                m396a(f9a, this.GFX_GameArray[26], 24, 32, 8, 16, f211b[c], (f171Q[2] - f179T[0]) + 4 + 3, ((((i5 - f179T[1]) - 54) + 8) - 8) + 5, 2);
                m396a(f9a, this.GFX_GameArray[26], 24, 48, 8, 16, f211b[c], ((f171Q[2] - f179T[0]) - 8) + 4 + 3, ((((i5 - f179T[1]) - 54) + 8) - 8) + 5, 2);
            }
        }
    }

    /* renamed from: cq */
    private void m145cq(int i) {
        m396a(f9a, this.GFX_GameArray[27], 0, 0, 32, 32, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: cr */
    private void m144cr(int i) {
        int i2;
        m396a(f9a, this.GFX_GameArray[28], 0, 0, 94, 94, f211b[0], (f171Q[2] - f179T[0]) - 1, (f171Q[3] - f179T[1]) - 1, 2);
        switch (f171Q[15] / 2) {
            case 1:
                i2 = f211b[3];
                break;
            case 2:
                i2 = f211b[2];
                break;
            case 3:
                i2 = f211b[1];
                break;
            default:
                i2 = 0;
                break;
        }
        if (f171Q[15] % 2 == 0) {
            m396a(f9a, this.GFX_GameArray[28], 25, 95, 48, 40, i2, ((f171Q[2] - f179T[0]) + f171Q[10]) - 1, ((f171Q[3] - f179T[1]) + f171Q[11]) - 1, 20);
        } else {
            m396a(f9a, this.GFX_GameArray[28], 24, 135, 47, 47, i2, ((f171Q[2] - f179T[0]) + f171Q[10]) - 1, ((f171Q[3] - f179T[1]) + f171Q[11]) - 1, 20);
        }
    }

    /* renamed from: cs */
    private void m143cs(int i) {
        for (int i2 = 1; i2 < 11; i2++) {
            m396a(f9a, this.GFX_GameArray[29], 0, 48, 16, 48, f211b[0], ((f171Q[2] - f179T[0]) - 96) + (16 * i2), (f171Q[3] - f179T[1]) - 24, 20);
        }
        m396a(f9a, this.GFX_GameArray[29], 0, 0, 16, 48, f211b[0], (f171Q[2] - f179T[0]) - 96, (f171Q[3] - f179T[1]) - 24, 20);
        m396a(f9a, this.GFX_GameArray[29], 0, 0, 16, 48, f211b[4], ((f171Q[2] - f179T[0]) - 96) + 176, (f171Q[3] - f179T[1]) - 24, 20);
    }

    /* renamed from: ct */
    private void m142ct(int i) {
        char c = 0;
        int i2 = 0;
        if (f171Q[19] != 0) {
            c = 4;
            i2 = 8;
        }
        m396a(f9a, this.GFX_GameArray[30], 0, (f171Q[15] % 4) * 64, 8, 32, f211b[c], ((f171Q[2] - f179T[0]) - 8) + i2, ((f171Q[3] - f179T[1]) - 32) - (f171Q[10] * 8), 20);
        m396a(f9a, this.GFX_GameArray[30], 0, 32 + ((f171Q[15] % 4) * 64), 8, 32, f211b[c], ((f171Q[2] - f179T[0]) - 8) + i2, (f171Q[3] - f179T[1]) + (f171Q[10] * 8), 20);
        m396a(f9a, this.GFX_GameArray[30], 8, (f171Q[5] % 4) * 64, 8, 32, f211b[c], (f171Q[2] - f179T[0]) - i2, ((f171Q[3] - f179T[1]) - 32) - (f171Q[10] * 8), 20);
        m396a(f9a, this.GFX_GameArray[30], 8, 32 + ((f171Q[5] % 4) * 64), 8, 32, f211b[c], (f171Q[2] - f179T[0]) - i2, (f171Q[3] - f179T[1]) + (f171Q[10] * 8), 20);
    }

    /* renamed from: cu */
    private void m141cu(int i) {
        int i2 = 16;
        int i3 = ((f171Q[5] - (f171Q[4] / 2)) + 256) % 128;
        if (i3 < 128) {
            if (i3 < 16) {
                i2 = i3;
            } else if (i3 > 64 && i3 < 80) {
                i2 = 80 - i3;
            } else if (i3 >= 80) {
                i2 = -1;
            }
            if (i2 > 0) {
                int i4 = 0;
                if (i2 <= 8 && i2 > 4) {
                    i4 = 1;
                } else if (i2 <= 4) {
                    i4 = 2;
                }
                m396a(f9a, this.GFX_GameArray[31], 0, i4 * 32, 32, 32, f211b[0], (f171Q[2] - f179T[0]) - 16, ((f171Q[3] + 8) - f179T[1]) - 16, 20);
            }
        }
    }

    /* renamed from: cv */
    private void m140cv(int i) {
        if (f171Q[4] != 203) {
            if (f171Q[4] == 64) {
                return;
            }
            if (f171Q[4] < 128) {
                m396a(f9a, this.GFX_GameArray[32], 0, 0, 56, 64, f211b[6], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
                return;
            }
            m396a(f9a, this.GFX_GameArray[32], 0, 64, 64, 24, f211b[0], (f171Q[2] - f179T[0]) - 64, (f171Q[3] - f179T[1]) - 12, 20);
            m396a(f9a, this.GFX_GameArray[32], 0, 64, 64, 24, f211b[4], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 12, 20);
            return;
        }
        m396a(f9a, this.GFX_GameArray[32], 0, 0, 256, 32, f211b[0], f171Q[2] - f179T[0], ((f171Q[3] - f179T[1]) - 64) + 16, 2);
        for (int i2 = 0; i2 < 3; i2++) {
            for (int i3 = 2 - i2; i3 >= 0; i3--) {
                if (i3 != 2 - i2) {
                    m396a(f9a, this.GFX_GameArray[32], 256, 0, 32, 32, f211b[0], (((f171Q[2] - f179T[0]) + (64 * i2)) - 128) + 16, ((f171Q[3] - f179T[1]) - 64) + 16 + 32 + (i3 * 32), 2);
                } else {
                    m396a(f9a, this.GFX_GameArray[32], 288, 0, 32, 32, f211b[0], (((f171Q[2] - f179T[0]) + (64 * i2)) - 128) + 16, ((f171Q[3] - f179T[1]) - 64) + 16 + 32 + (i3 * 32), 2);
                }
            }
        }
    }

    /* renamed from: cw */
    private void m139cw(int i) {
        char c = 0;
        int i2 = 1;
        if (f171Q[19] == 2) {
            c = 2;
            i2 = -1;
        }
        m396a(f9a, this.GFX_GameArray[33], 0, 88 + ((this.f318f % 3) * 8), 16, 8, f211b[c], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + (20 * i2), 2);
        m396a(f9a, this.GFX_GameArray[33], 0, 0, 16, 16, f211b[c], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + (8 * i2), 2);
        if (f171Q[5] == 1 || f171Q[5] == 2) {
            m396a(f9a, this.GFX_GameArray[33], 0, 40, 16, 16, f211b[c], f171Q[2] - f179T[0], ((f171Q[3] - f179T[1]) - (4 * i2)) + (4 * i2), 2);
        } else {
            m396a(f9a, this.GFX_GameArray[33], 0, 16 + ((this.f318f % 3) * 8), 16, 8, f211b[c], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - (4 * i2), 2);
        }
        if (f171Q[5] >= 2) {
            for (int i3 = 0; i3 <= 1; i3++) {
                if (this.f413e[f171Q[5] - 2][i3] != 0) {
                    m396a(f9a, this.GFX_GameArray[33], 0, 72, 16, 16, f211b[this.f426k[f171Q[5] - 2][0]], (f171Q[2] - f179T[0]) + 16 + (i3 * 32), (f171Q[3] - f179T[1]) - (4 * i2), 2);
                    m396a(f9a, this.GFX_GameArray[33], 0, 56, 16, 16, f211b[this.f426k[f171Q[5] - 2][0]], (f171Q[2] - f179T[0]) + 32 + (i3 * 32), (f171Q[3] - f179T[1]) - (4 * i2), 2);
                    m396a(f9a, this.GFX_GameArray[33], 0, 72, 16, 16, f211b[this.f426k[f171Q[5] - 2][1]], ((f171Q[2] - f179T[0]) - 16) - (i3 * 32), (f171Q[3] - f179T[1]) - (4 * i2), 2);
                    m396a(f9a, this.GFX_GameArray[33], 0, 56, 16, 16, f211b[this.f426k[f171Q[5] - 2][1]], ((f171Q[2] - f179T[0]) - 32) - (i3 * 32), (f171Q[3] - f179T[1]) - (4 * i2), 2);
                }
            }
        }
    }

    /* renamed from: cx */
    private void m138cx(int i) {
        int i2 = f171Q[12];
        if (f171Q[18] == 1) {
            for (int i3 = 0; i3 < f287B[i2].length; i3++) {
                int i4 = this.f135v[i3];
                int i5 = f287B[i2][i3];
                int i6 = f288C[i2][i3];
                if (i4 == 0 || i4 == 3) {
                    m396a(f9a, this.GFX_GameArray[34], 0, 1, 32, 14, 0, i5 - f179T[0], i6 - f179T[1], 2);
                } else {
                    int abs = (((i4 == 1 ? Math.abs(this.f134f[f171Q[4] - 128][3] - i6) : Math.abs(this.f134f[f171Q[4] - 128][3] - this.f134f[f171Q[4] - 128][5]) + Math.abs(this.f134f[f171Q[4] - 128][2] - i5)) / 4) + 1) % 8;
                    int i7 = abs / 2;
                    if (abs % 2 == 0) {
                        m396a(f9a, this.GFX_GameArray[34], 0, 1, 32, 14, f211b[i7], i5 - f179T[0], i6 - f179T[1], 2);
                    } else {
                        m396a(f9a, this.GFX_GameArray[34], 0, 17, 32, 30, f211b[i7], i5 - f179T[0], i6 - f179T[1], 2);
                    }
                }
            }
        }
    }

    /* renamed from: cy */
    private void m137cy(int i) {
        if (f171Q[10] != 0) {
            m396a(f9a, this.GFX_GameArray[35], 0, f171Q[15] * 32, 32, 32, f211b[0], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 32, 20);
            m396a(f9a, this.GFX_GameArray[35], 0, f171Q[15] * 32, 32, 32, f211b[1], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 32, 20);
            m396a(f9a, this.GFX_GameArray[35], 0, f171Q[15] * 32, 32, 32, f211b[3], (f171Q[2] - f179T[0]) - 32, f171Q[3] - f179T[1], 20);
            m396a(f9a, this.GFX_GameArray[35], 0, f171Q[15] * 32, 32, 32, f211b[2], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 20);
            if (f171Q[4] != 3) {
                m396a(f9a, this.GFX_GameArray[35], 32, 0, 8, 64, f211b[0], (f171Q[2] - f179T[0]) - 4, (f171Q[3] - f179T[1]) - 62, 20);
            }
        }
    }

    /* renamed from: cz */
    private void m136cz(int i) {
        if (f171Q[5] == 0) {
            m396a(f9a, this.GFX_GameArray[36], 0, 16, 16, 16, f211b[4], f171Q[2] - f179T[0], ((f171Q[3] - f179T[1]) - 32) - 4, 2);
        } else {
            m396a(f9a, this.GFX_GameArray[36], 0, 0, 16, 16, f211b[4], (f171Q[2] - f179T[0]) - ((m429a((90 * f171Q[5]) / 4) * 8) / 100), (((f171Q[3] - f179T[1]) - 24) + ((m276b((90 * f171Q[5]) / 4) * 8) / 100)) - 4, 2);
        }
        m396a(f9a, this.GFX_GameArray[36], 0, 32, 16, 48, f211b[4], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 4, 2);
    }

    /* renamed from: cA */
    private void m187cA(int i) {
        int i2 = 0;
        if (f171Q[4] == 1) {
            i2 = 1;
        } else if (f171Q[4] == 2) {
            i2 = 2;
        } else if (f171Q[4] == 16) {
            i2 = 3;
        } else if (f171Q[4] == 17) {
            i2 = 4;
        } else if (f171Q[4] == 18) {
            i2 = 5;
        }
        m396a(f9a, this.GFX_GameArray[37], i2 * 16, 0, 16, 64, 0, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: cB */
    private void m186cB(int i) {
        int i2 = 32;
        int i3 = 0;
        if (f171Q[4] >= 7) {
            return;
        }
        if (this.f427C[f171Q[4]] == 8) {
            i2 = 16;
            i3 = 8;
        }
        if (f171Q[5] != 0 && f171Q[7] < 60) {
            if (f171Q[5] >= 7) {
                return;
            }
            int i4 = f171Q[7];
            int i5 = i4;
            if (i4 >= 48) {
                i5 = 48;
            }
            m396a(f9a, this.GFX_GameArray[42], 8, (this.f427C[f171Q[5]] * 32) + 6, 16, 16, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - i5, 2);
        }
        m396a(f9a, this.GFX_GameArray[42], 0, this.f427C[f171Q[4]] != 8 ? this.f318f % 2 == 0 ? this.f427C[f171Q[4]] * 32 : (5 + ((this.f318f % 6) / 2)) * 32 : this.f427C[f171Q[4]] * 32, 32, i2, f211b[0], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + i3, 2);
    }

    /* renamed from: cC */
    private void m185cC(int i) {
        m186cB(i);
    }

    /* renamed from: cD */
    private void m184cD(int i) {
        int i2 = 0;
        if (f171Q[10] / 3 > 22) {
            i2 = 48;
        }
        if (f171Q[5] != 2) {
            m396a(f9a, this.GFX_GameArray[44], 0, i2 + (((f171Q[10] / 3) % 4) * 48), 48, 48, 0, f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 10, 2);
        } else {
            m396a(f9a, this.GFX_GameArray[44], 0, 192, 48, 48, 0, f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 10, 2);
        }
        if (f171Q[5] == 1) {
            m396a(f9a, this.GFX_GameArray[0], 16, ((f171Q[10] / 4) % 4) * 16, 16, 16, this.f428D[(f171Q[10] / 2) % 4], (((f171Q[2] - f179T[0]) + this.f429E[(f171Q[10] / 4) % 10]) - 24) - 8, ((((f171Q[3] - f179T[1]) + 10) + this.f430F[(f171Q[10] / 4) % 10]) - 24) - 8, 20);
        }
    }

    /* renamed from: cE */
    private void m183cE(int i) {
        int i2 = (f171Q[4] == 0 || f171Q[4] == 3) ? 0 : f171Q[4] == 1 ? 48 : 24;
        if (f171Q[5] == 1) {
            m396a(f9a, this.GFX_GameArray[45], 0, i2, 32, 24, 0, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: cF */
    private void m182cF(int i) {
        m183cE(i);
    }

    /* renamed from: cG */
    private void m181cG(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            if (f304h[i3]) {
                i2++;
            }
        }
        if (f23al < 50 || i2 == 6) {
            return;
        }
        byte b = 0;
        int i4 = ((this.f318f / 2) % 4) * 64;
        if ((this.f318f / 2) % 4 == 3) {
            b = 4;
            i4 = 64;
        }
        if (f171Q[5] == 0) {
            m396a(f9a, this.GFX_GameArray[47], 0, i4, 64, 64, f211b[b == 1 ? 1 : 0], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 32, 20);
            return;
        }
        m396a(f9a, this.GFX_GameArray[47], 64, f171Q[10] * 32, 64, 32, f211b[0], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 32, 20);
        m396a(f9a, this.GFX_GameArray[47], 64, f171Q[10] * 32, 64, 32, f211b[6], (f171Q[2] - f179T[0]) - 32, f171Q[3] - f179T[1], 20);
    }

    /* renamed from: cH */
    private void m180cH(int i) {
        if (f171Q[4] == 1) {
            if (f171Q[5] >= 2) {
                m396a(f9a, this.GFX_GameArray[55], 0, 64, 64, 32, f211b[0], f171Q[8] - f179T[0], (f171Q[9] - f179T[1]) + 16 + 37, 2);
                return;
            }
            m396a(f9a, this.GFX_GameArray[55], (this.f318f % 2) * 24, 96, 24, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            m396a(f9a, this.GFX_GameArray[55], 0, 0, 64, 64, f211b[0], f171Q[8] - f179T[0], (f171Q[9] - f179T[1]) + 37, 2);
        }
    }

    /* renamed from: cI */
    private void m179cI(int i) {
        m396a(f9a, this.GFX_GameArray[56], 0, 32, 32, 32, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: cJ */
    private void m178cJ(int i) {
        m397a(f9a, this.GFX_GameArray[58], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: cK */
    private void m177cK(int i) {
        m396a(f9a, this.GFX_GameArray[60], 0, 0, 48, 48, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: r */
    private void m31r(int i, int i2, int i3) {
        if (i < 0) {
            i += 360;
        }
        if (360 >= i) {
            i -= (i / 360) * 360;
        }
        if (i <= 90) {
            f171Q[i2] = m429a(90 - i) * 100;
            f171Q[i3] = m429a(i) * 100;
        }
        if (i > 90 && i <= 180) {
            f171Q[i2] = (-m429a(90 - (180 - i))) * 100;
            f171Q[i3] = m429a(180 - i) * 100;
        }
        if (i > 180 && i <= 270) {
            f171Q[i2] = (-m429a(90 - (i - 180))) * 100;
            f171Q[i3] = (-m429a(i - 180)) * 100;
        }
        if (i <= 270 || i >= 360) {
            return;
        }
        f171Q[i2] = m429a(90 - (360 - i)) * 100;
        f171Q[i3] = (-m429a(360 - i)) * 100;
    }

    /* renamed from: cL */
    private void m176cL(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = this.f318f - f171Q[5];
        if (f171Q[4] == 213 || f171Q[4] == 181 || f171Q[4] == 197 || f171Q[4] == 101 || f171Q[4] == 69 || f171Q[4] == 53) {
            i2 = 5;
        } else if (f171Q[4] == 212 || f171Q[4] == 196 || f171Q[4] == 84 || f171Q[4] == 68 || f171Q[4] == 52) {
            i2 = 4;
        } else if (f171Q[4] == 38) {
            i2 = 6;
        } else if (f171Q[4] == 195) {
            i2 = 3;
        }
        if (f171Q[4] == 181 || f171Q[4] == 101) {
            i3 = 12;
        } else if (f171Q[4] == 196 || f171Q[4] == 197 || f171Q[4] == 84 || f171Q[4] == 195) {
            i3 = 10;
        } else if (f171Q[4] == 213 || f171Q[4] == 212 || f171Q[4] == 69 || f171Q[4] == 68) {
            i3 = 8;
        } else if (f171Q[4] == 52 || f171Q[4] == 53) {
            i3 = 6;
        } else if (f171Q[4] == 38) {
            i3 = 4;
        }
        if (f171Q[4] == 69 || f171Q[4] == 84 || f171Q[4] == 101 || f171Q[4] == 38 || f171Q[4] == 68 || f171Q[4] == 52 || f171Q[4] == 53) {
            m31r(360 - ((((360 / i3) - (i4 % (360 / i3))) * i3) % 360), 16, 17);
        } else {
            m31r(((360 / i3) - (i4 % (360 / i3))) * i3, 16, 17);
        }
        if (f171Q[4] == 84) {
            m31r((i4 % (360 / i3)) * i3, 16, 17);
        } else if (f171Q[19] == 1) {
            m31r((i4 % (360 / i3)) * i3, 16, 17);
        }
        if (this.f314b != 4) {
            int i5 = 1;
            while (i5 < i2) {
                m396a(f9a, this.GFX_GameArray[60], 0, 64, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i5 * (f171Q[16] * 16)) / 10000), (f171Q[3] - f179T[1]) + ((i5 * (f171Q[17] * 16)) / 10000), 2);
                i5++;
            }
            m396a(f9a, this.GFX_GameArray[60], 0, 80, 16, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            m396a(f9a, this.GFX_GameArray[60], 16, 48, 32, 32, f211b[0], (f171Q[2] - f179T[0]) + ((i5 * (f171Q[16] * 16)) / 10000), (f171Q[3] - f179T[1]) + ((i5 * (f171Q[17] * 16)) / 10000), 2);
            return;
        }
        int i6 = 1;
        while (i6 < i2) {
            m396a(f9a, this.GFX_GameArray[60], 0, 48, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i6 * (f171Q[16] * 16)) / 10000), (f171Q[3] - f179T[1]) + ((i6 * (f171Q[17] * 16)) / 10000), 2);
            i6++;
        }
        m396a(f9a, this.GFX_GameArray[60], 0, 48, 16, 16, f211b[0], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        m396a(f9a, this.GFX_GameArray[60], 0, 48, 16, 16, f211b[0], (f171Q[2] - f179T[0]) + ((i6 * (f171Q[16] * 16)) / 10000), (f171Q[3] - f179T[1]) + ((i6 * (f171Q[17] * 16)) / 10000), 2);
    }

    /* renamed from: cM */
    private void m175cM(int i) {
        if (f171Q[4] >= 240) {
            for (int i2 = 0; i2 < 4; i2++) {
                m397a(f9a, this.GFX_GameArray[108], ((f171Q[2] - f179T[0]) - 48) + (i2 * 32), f171Q[3] - f179T[1], 2);
            }
        } else if (f171Q[4] >= 224) {
            m397a(f9a, this.GFX_GameArray[107], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] <= 2) {
            m397a(f9a, this.GFX_GameArray[17], (f171Q[2] - f179T[0]) - 16, (f171Q[3] - f179T[1]) - 16, 20);
        } else if (f171Q[4] == 19) {
            m397a(f9a, this.GFX_GameArray[17], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 32, 20);
            m397a(f9a, this.GFX_GameArray[17], (f171Q[2] - f179T[0]) - 0, (f171Q[3] - f179T[1]) - 32, 20);
            m397a(f9a, this.GFX_GameArray[17], (f171Q[2] - f179T[0]) - 32, (f171Q[3] - f179T[1]) - 0, 20);
            m397a(f9a, this.GFX_GameArray[17], (f171Q[2] - f179T[0]) - 0, (f171Q[3] - f179T[1]) - 0, 20);
        } else if (f171Q[4] <= 91 && f171Q[4] >= 88) {
            m397a(f9a, this.GFX_GameArray[21], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 160) {
            m397a(f9a, this.GFX_GameArray[17], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) - 16, 2);
            m397a(f9a, this.GFX_GameArray[17], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + 16, 2);
        } else if (f171Q[4] == 55) {
            if (f171Q[8] == 7992 && f171Q[9] == 1353) {
                return;
            }
            m397a(f9a, this.GFX_GameArray[107], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: cN */
    private void m174cN(int i) {
        m238bS(i);
    }

    /* renamed from: cO */
    private void m173cO(int i) {
        m238bS(i);
    }

    /* renamed from: cP */
    private void m172cP(int i) {
        m238bS(i);
    }

    /* renamed from: cQ */
    private void m171cQ(int i) {
        m238bS(i);
    }

    /* renamed from: cR */
    private void m170cR(int i) {
        m238bS(i);
    }

    /* renamed from: cS */
    private void m169cS(int i) {
        m238bS(i);
    }

    /* renamed from: cT */
    private void m168cT(int i) {
        m238bS(i);
    }

    /* renamed from: cU */
    private void m167cU(int i) {
        m166cV(i);
    }

    /* renamed from: cV */
    private void m166cV(int i) {
        int i2 = (this.f318f / 4) % 6;
        int i3 = i2;
        if (i2 > 3) {
            i3 = 6 - i3;
        }
        if (f171Q[4] != 16) {
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = 0;
                while (i5 < 3) {
                    m396a(f9a, this.GFX_GameArray[73], 16, i5 * 8, 16, 8, f211b[0 + (4 * (i4 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i4 * 16), ((f171Q[3] - f179T[1]) - 8) + (i5 * 8), 20);
                    i5++;
                }
                m396a(f9a, this.GFX_GameArray[73], 16, (i5 * 8) + (i3 * 8), 16, 8, f211b[0 + (4 * (i4 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i4 * 16), ((f171Q[3] - f179T[1]) - 8) + (i5 * 8), 20);
            }
            return;
        }
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = f171Q[3] - (((f171Q[5] + 1) + (i6 * 128)) % 384);
            for (int i8 = 0; i8 < 5; i8++) {
                int i9 = 0;
                while (i9 < 3) {
                    m396a(f9a, this.GFX_GameArray[73], 16, i9 * 8, 16, 8, f211b[0 + (4 * (i8 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i8 * 16), ((i7 - f179T[1]) - 8) + (i9 * 8), 20);
                    i9++;
                }
                m396a(f9a, this.GFX_GameArray[73], 16, (i9 * 8) + (i3 * 8), 16, 8, f211b[0 + (4 * (i8 % 2))], ((f171Q[2] - f179T[0]) - 40) + (i8 * 16), ((i7 - f179T[1]) - 8) + (i9 * 8), 20);
            }
        }
    }

    /* renamed from: cW */
    private void m165cW(int i) {
        byte b = 0;
        int i2 = -25;
        if (this.f314b == 3) {
            if (f171Q[4] == 54) {
                b = 4;
                i2 = 25;
            }
            m396a(f9a, this.GFX_GameArray[75], 0, 0, 16, 32, f211b[b == 1 ? 1 : 0], (f171Q[2] - f179T[0]) + i2, f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: cX */
    private void m164cX(int i) {
        int i2 = f171Q[5] / 4;
        if (f171Q[4] != 16 || i2 <= 0) {
            return;
        }
        int i3 = i2 < 6 ? i2 % 2 : (i2 % 2) + 2;
        int i4 = 0;
        while (i4 < (f171Q[9] - f171Q[3]) / 32) {
            m396a(f9a, this.GFX_GameArray[14], 0, 32 * (i4 % 2), 64, 32, f211b[0], (((f171Q[2] - f179T[0]) - 20) + 24) - 32, ((f171Q[3] - f179T[1]) - 48) + (i4 * 32) + 16, 20);
            i4++;
        }
        int i5 = (f171Q[9] - f171Q[3]) % 32;
        if (i5 > 0) {
            m396a(f9a, this.GFX_GameArray[14], 0, 32 * (i4 % 2), 64, i5, f211b[0], (((f171Q[2] - f179T[0]) - 20) + 24) - 32, ((f171Q[3] - f179T[1]) - 48) + (i4 * 32) + 16, 20);
        }
        m396a(f9a, this.GFX_GameArray[77], 0, this.f431G[i3], 112, this.f431G[i3 + 1] - this.f431G[i3], f211b[0], ((f171Q[8] - f179T[0]) - 20) - 32, (f171Q[9] - f179T[1]) - 48, 20);
        m396a(f9a, this.GFX_GameArray[77], 0, this.f431G[i3 + 2], 112, this.f431G[(i3 + 1) + 2] - this.f431G[i3 + 2], f211b[0], ((f171Q[2] - f179T[0]) - 20) - 32, (f171Q[3] - f179T[1]) - 48, 20);
    }

    /* renamed from: cY */
    private void m163cY(int i) {
        int i2 = 0;
        int i3 = 0;
        if (f171Q[4] == 1) {
            i2 = ((((m429a(f171Q[5]) * 16) / 100) - 16) * 2) + 2;
            i3 = ((((m429a(f171Q[5]) * (-9)) / 100) - 9) * 2) + 2;
        } else if (f171Q[4] == 2) {
            i2 = ((((m429a(f171Q[5]) * (-16)) / 100) - 16) * 2) + 2;
            i3 = ((((m429a(f171Q[5]) * 9) / 100) - 9) * 2) + 2;
        }
        if (f171Q[4] != 20 && f171Q[4] != 4) {
            m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 72, f211b[0], (f171Q[2] - f179T[0]) - 16, ((f171Q[3] - f179T[1]) + i2) - 36, 2);
            m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 72, f211b[4], (f171Q[2] - f179T[0]) + 16, ((f171Q[3] - f179T[1]) + i2) - 36, 2);
            m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 72, f211b[6], (f171Q[2] - f179T[0]) - 16, (f171Q[3] - f179T[1]) + i2 + 36, 2);
            m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 72, f211b[2], (f171Q[2] - f179T[0]) + 16, (f171Q[3] - f179T[1]) + i2 + 36, 2);
            m396a(f9a, this.GFX_GameArray[79], 0, 72, 32, 32, f211b[2], f171Q[2] - f179T[0], (((f171Q[3] - f179T[1]) + i3) - 8) - 6, 2);
            return;
        }
        int m429a = ((m429a(this.f319g) * 28) / 100) - 28;
        m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 56, f211b[0], (f171Q[2] - f179T[0]) - 16, ((f171Q[3] - f179T[1]) - 28) + 16, 2);
        m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 56, f211b[4], (f171Q[2] - f179T[0]) + 16, ((f171Q[3] - f179T[1]) - 28) + 16, 2);
        m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 56, f211b[6], (f171Q[2] - f179T[0]) - 16, (f171Q[3] - f179T[1]) + 28 + 16, 2);
        m396a(f9a, this.GFX_GameArray[79], 0, 0, 32, 56, f211b[2], (f171Q[2] - f179T[0]) + 16, (f171Q[3] - f179T[1]) + 28 + 16, 2);
        m396a(f9a, this.GFX_GameArray[79], 0, 72, 32, 32, f211b[2], f171Q[2] - f179T[0], (f171Q[3] - f179T[1]) + m429a + 28 + 16, 2);
    }

    /* renamed from: cZ */
    private void m162cZ(int i) {
        if (f171Q[4] == 2) {
            if (f171Q[19] == 0) {
                m396a(f9a, this.GFX_GameArray[80], 0, this.f432H[(f171Q[5] * 2) + 0] * 8, 8, this.f432H[(f171Q[5] * 2) + 1] * 8, f211b[0], (f171Q[2] - f179T[0]) - 4, ((f171Q[3] - f179T[1]) - (this.f432H[(f171Q[5] * 2) + 1] * 8)) + 8, 20);
            } else {
                m396a(f9a, this.GFX_GameArray[80], 0, this.f432H[(f171Q[5] * 2) + 0] * 8, 8, this.f432H[(f171Q[5] * 2) + 1] * 8, f211b[6], (f171Q[2] - f179T[0]) - 4, (f171Q[3] - f179T[1]) - 8, 20);
            }
        } else if (f171Q[4] == 0) {
            if (f171Q[19] == 0) {
                m396a(f9a, this.GFX_GameArray[80], 0, this.f432H[(f171Q[5] * 2) + 0] * 8, 8, this.f432H[(f171Q[5] * 2) + 1] * 8, f211b[1], (f171Q[2] - f179T[0]) - 8, (f171Q[3] - f179T[1]) - 4, 20);
            } else {
                m396a(f9a, this.GFX_GameArray[80], 0, this.f432H[(f171Q[5] * 2) + 0] * 8, 8, this.f432H[(f171Q[5] * 2) + 1] * 8, f211b[3], ((f171Q[2] - f179T[0]) + 8) - (this.f432H[(f171Q[5] * 2) + 1] * 8), (f171Q[3] - f179T[1]) - 4, 20);
            }
        }
    }

    /* renamed from: da */
    private void m122da(int i) {
        m396a(f9a, this.GFX_GameArray[82], 0, 0, 32, 32, f211b[4 - (f171Q[19] * 4)], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
    }

    /* renamed from: db */
    private void m121db(int i) {
        if (f171Q[4] == 1) {
            m397a(f9a, this.GFX_GameArray[108], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 39) {
            m397a(f9a, this.GFX_GameArray[105], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else if (f171Q[4] == 19) {
            m397a(f9a, this.GFX_GameArray[106], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        } else {
            m397a(f9a, this.GFX_GameArray[83], f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
        }
    }

    /* renamed from: dc */
    private void m120dc(int i) {
        if (f171Q[4] != 127 && f171Q[18] == 1) {
            int i2 = f171Q[12];
            for (int i3 = 0; i3 < f287B[i2].length; i3++) {
                m396a(f9a, this.GFX_GameArray[88], 0, 128, 32, 16, 0, (f287B[i2][i3] - 16) - f179T[0], (f288C[i2][i3] - 8) - f179T[1], 20);
            }
        }
        if (f171Q[4] == 127) {
            if (f286g[14] && this.f314b == 1 && this.f315c == 2) {
                m396a(f9a, this.GFX_GameArray[88], 0, 96 - (32 * (this.f318f % 4)), 32, 32, 0, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            } else {
                m396a(f9a, this.GFX_GameArray[88], 0, 32 * (this.f318f % 4), 32, 32, 0, f171Q[2] - f179T[0], f171Q[3] - f179T[1], 2);
            }
        }
    }

    /* renamed from: dd */
    private void m119dd(int i) {
        m154ch(i);
    }

    /* renamed from: de */
    private void m118de(int i) {
        int i2 = 0;
        if (f171Q[10] >= 300) {
            i2 = 1;
        }
        m396a(f9a, this.GFX_GameArray[91], 0, i2 * 64, 8 + (i2 * 8), 64, f211b[0], (f171Q[2] - f179T[0]) - (i2 * 4), f171Q[3] - f179T[1], 2);
    }

    /* renamed from: T */
    public final void m448T() {
        int i = 0;
        int i2 = 0;
        while (i2 < 11) {
            try {
                HttpConnection open = Connector.open(new StringBuffer().append(IApplication.getCurrentApp().getSourceURL()).append("sonic.0").append(i2 / 10).append("").append(i2 % 10).toString(), 1, true);
                open.setRequestMethod("GET");
                open.connect();
                f8a = open.openDataInputStream();
                f5c = new byte[(int) open.getLength()];
                f8a.read(f5c);
                f8a.close();
                open.close();
                int i3 = 0;
                while (i3 < 16 && f5c[(f5c.length - i3) - 1] == 0) {
                    i3++;
                }
                if (i3 == 16) {
                    i2 = 1 / 0;
                }
                f7a = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(i + 4).append(",length=").append(f5c.length).toString());
                f7a.write(f5c, 0, f5c.length);
                f7a.close();
                System.gc();
                System.gc();
                System.gc();
                i += f5c.length;
                i2++;
            } catch (SecurityException unused) {
                f38ay = 13;
            } catch (Throwable unused2) {
                f38ay = 12;
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < 4) {
            HttpConnection open2 = Connector.open(new StringBuffer().append(IApplication.getCurrentApp().getSourceURL()).append("Data.00").append(i5).toString(), 1, true);
            open2.setRequestMethod("GET");
            open2.connect();
            f8a = open2.openDataInputStream();
            f5c = new byte[(int) open2.getLength()];
            f8a.read(f5c);
            f8a.close();
            open2.close();
            int i6 = 0;
            while (i6 < 16 && f5c[(f5c.length - i6) - 1] == 0) {
                i6++;
            }
            if (i6 == 16) {
                i5 = 1 / 0;
            }
            f7a = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(i4 + 217000).append(",length=").append(f5c.length).toString());
            f7a.write(f5c, 0, f5c.length);
            f7a.close();
            System.gc();
            System.gc();
            System.gc();
            i4 += f5c.length;
            i5++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i8 < 2) {
            HttpConnection open3 = Connector.open(new StringBuffer().append(IApplication.getCurrentApp().getSourceURL()).append("SpData.00").append(i8).toString(), 1, true);
            open3.setRequestMethod("GET");
            open3.connect();
            f8a = open3.openDataInputStream();
            f5c = new byte[(int) open3.getLength()];
            f8a.read(f5c);
            f8a.close();
            open3.close();
            int i9 = 0;
            while (i9 < 16 && f5c[(f5c.length - i9) - 1] == 0) {
                i9++;
            }
            if (i9 == 16) {
                i8 = 1 / 0;
            }
            f7a = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(364480 + i7).append(",length=").append(f5c.length).toString());
            f7a.write(f5c, 0, f5c.length);
            f7a.close();
            System.gc();
            System.gc();
            System.gc();
            i7 += f5c.length;
            i8++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i11 < 4) {
            HttpConnection open4 = Connector.open(new StringBuffer().append(IApplication.getCurrentApp().getSourceURL()).append("Sound00.00").append(i11).toString(), 1, true);
            open4.setRequestMethod("GET");
            open4.connect();
            f8a = open4.openDataInputStream();
            f5c = new byte[(int) open4.getLength()];
            f8a.read(f5c);
            f8a.close();
            open4.close();
            int i12 = 0;
            while (i12 < 16 && f5c[(f5c.length - i12) - 1] == 0) {
                i12++;
            }
            if (i12 == 16) {
                i11 = 1 / 0;
            }
            f7a = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(i10 + 288404).append(",length=").append(f5c.length).toString());
            f7a.write(f5c, 0, f5c.length);
            f7a.close();
            System.gc();
            System.gc();
            System.gc();
            i10 += f5c.length;
            i11++;
        }
        f7a = Connector.openDataOutputStream("scratchpad:///0");
        f7a.writeInt(102);
        f7a.close();
        f231n = new byte[4];
        f231n[0] = 1;
        f231n[1] = 3;
        f231n[2] = 1;
        m103f();
        m77j();
        if (f38ay >= 12) {
            f166c[0] = false;
            m407a(1, "終了");
            while (!f166c[0]) {
                m54n();
                f52aE = f51aD;
                f51aD = f50aC | getKeypadState();
                f53aF = f51aD & (f52aE ^ (-1));
                if ((f53aF & 4194304) != 0) {
                    IApplication.getCurrentApp().terminate();
                }
                try {
                    Thread.sleep(50L);
                } catch (Throwable unused3) {
                }
            }
            if (f38ay == 13) {
                IApplication.getCurrentApp().terminate();
                return;
            }
            f38ay = -4;
            m407a(1, (String) null);
            m433a();
            m448T();
        }
    }

    /* renamed from: a */
    public final byte[] m431a() {
        byte[] bArr = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (i < 15) {
                HttpConnection open = Connector.open(new StringBuffer().append(IApplication.getCurrentApp().getSourceURL()).append("Second.0").append(i / 10).append("").append(i % 10).toString(), 1, true);
                open.setRequestMethod("GET");
                open.connect();
                f8a = open.openDataInputStream();
                byte[] bArr2 = new byte[(int) open.getLength()];
                f8a.read(bArr2);
                f8a.close();
                open.close();
                int i2 = 0;
                while (i2 < 16 && bArr2[(bArr2.length - i2) - 1] == 0) {
                    i2++;
                }
                if (i2 == 16) {
                    i = 1 / 0;
                }
                byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                i++;
            }
            if (byteArrayOutputStream.size() % 16384 != 0) {
                byte[] bArr3 = new byte[(16384 - (byteArrayOutputStream.size() % 16384)) - 1];
                byteArrayOutputStream.write(bArr3, 0, bArr3.length);
            }
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (SecurityException unused) {
            f38ay = 13;
        } catch (Throwable unused2) {
            f38ay = 12;
        }
        if (f38ay >= 12) {
            f166c[0] = false;
            m407a(1, "終了");
            m54n();
            while (!f166c[0]) {
                m54n();
                f52aE = f51aD;
                f51aD = f50aC | getKeypadState();
                f53aF = f51aD & (f52aE ^ (-1));
                if ((f53aF & 4194304) != 0) {
                    IApplication.getCurrentApp().terminate();
                }
                try {
                    Thread.sleep(50L);
                } catch (Throwable unused3) {
                }
            }
            if (f38ay == 13) {
                IApplication.getCurrentApp().terminate();
                return null;
            }
            return null;
        }
        return bArr;
    }

    /* renamed from: a */
    public final void m394a(Graphics graphics, String str, int i, int i2, int i3) {
        switch (i3) {
            case 0:
                graphics.drawString(str, i - this.f137a.stringWidth(str), i2 + this.f137a.getHeight());
                return;
            case 1:
                graphics.drawString(str, i - (this.f137a.stringWidth(str) >> 1), i2 + this.f137a.getHeight());
                return;
            case 20:
                graphics.drawString(str, i, i2 + this.f137a.getHeight());
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void m263b(Graphics graphics, Image image, int i, int i2, int i3) {
        try {
            switch (i3) {
                case 1:
                    graphics.drawImage(image, i - (image.getWidth() >> 1), i2);
                    return;
                case 2:
                    graphics.drawImage(image, i - (image.getWidth() >> 1), i2 - (image.getHeight() >> 1));
                    return;
                case 3:
                    graphics.drawImage(image, i - (image.getWidth() >> 1), i2 - image.getHeight());
                    return;
                case 20:
                    graphics.drawImage(image, i, i2);
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static final void m262b(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (i5 != 6) {
                if (i5 != 7) {
                    graphics.setFlipMode(i5);
                    int i9 = i3;
                    int i10 = i4;
                    if (5 == i5) {
                        i9 = i4;
                        i10 = i3;
                    }
                    if (4 == i5) {
                        i9 = i4;
                        i10 = i3;
                    }
                    switch (i8) {
                        case 1:
                            graphics.drawImage(image, i6 - (i9 >> 1), i7, i, i2, i3, i4);
                            break;
                        case 2:
                            graphics.drawImage(image, i6 - (i9 >> 1), i7 - (i10 >> 1), i, i2, i3, i4);
                            break;
                        case 3:
                            graphics.drawImage(image, i6 - (i9 >> 1), i7 - i10, i, i2, i3, i4);
                            break;
                        case 20:
                            graphics.drawImage(image, i6, i7, i, i2, i3, i4);
                            break;
                    }
                } else if (i8 == 2) {
                    graphics.drawImage(image, new int[]{0, 4096, (i6 - (i4 / 2)) * 4096, 4096, 0, (i7 - (i3 / 2)) * 4096}, i, i2, i3, i4);
                } else {
                    graphics.drawImage(image, new int[]{0, 4096, i6 * 4096, 4096, 0, i7 * 4096}, i, i2, i3, i4);
                }
            } else {
                graphics.drawImage(image, new int[]{0, -4096, (i6 + i4) * 4096, -4096, 0, (i7 + i3) * 4096}, i, i2, i3, i4);
            }
        } catch (Throwable unused) {
        }
        graphics.setFlipMode(0);
    }

    /* renamed from: a */
    public final void m398a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            int i10 = i8 + 36;
            if (i2 >= 320) {
                m262b(graphics, this.f312b[i + 15], i2 % 320, i3, i4, i5, i6, i7, i10, i9);
            } else if (i2 + i4 <= 320) {
                m262b(graphics, this.f312b[i], i2, i3, i4, i5, i6, i7, i10, i9);
            }
        } catch (Throwable unused) {
        }
        graphics.setFlipMode(0);
    }

    /* renamed from: a */
    public final void m399a(Graphics graphics, int i, int i2, int i3) {
        graphics.setColor(Graphics.getColorOfRGB(i, i2, i3));
    }

    /* renamed from: c */
    public static final void m191c(Graphics graphics, int i) {
        graphics.setColor(Graphics.getColorOfRGB(i >> 16, (i >> 8) % 256, i % 256));
    }

    /* renamed from: a */
    public final void m402a(Font font) {
        this.f137a = font;
        f9a.setFont(font);
    }

    /* renamed from: a */
    private int m388a(boolean z) {
        if (f28aq <= 0) {
            return 21;
        }
        if (this.f363x < 720) {
            return 24;
        }
        if (f208V) {
            return (this.f314b == 5 && this.f315c == 3) ? 18 : 17;
        } else if (f18ag > 0) {
            return 12;
        } else {
            if (z) {
                switch (this.f314b) {
                    case 0:
                        return 2;
                    case 1:
                        return this.f315c == 3 ? 11 : 4;
                    case 2:
                        return 6;
                    case 3:
                        return 8;
                    case 4:
                        return 10;
                    case 5:
                        return this.f315c == 3 ? 18 : 11;
                    case 6:
                        return 17;
                    default:
                        return 2;
                }
            }
            switch (this.f314b) {
                case 0:
                    return 1;
                case 1:
                    return this.f315c == 3 ? 11 : 3;
                case 2:
                    return 5;
                case 3:
                    return 7;
                case 4:
                    return 9;
                case 5:
                    return this.f315c == 3 ? 18 : 11;
                case 6:
                    return 17;
                default:
                    return 2;
            }
        }
    }

    /* renamed from: U */
    public final void m446U() {
        for (int i = 0; i < 4; i++) {
            try {
                f290a[i].stop();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: V */
    public final void m444V() {
        for (int i = 0; i < 4; i++) {
            try {
                f290a[i].pause();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: W */
    public final void m442W() {
        for (int i = 0; i < 4; i++) {
            try {
                f290a[i].restart();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: X */
    public final void m440X() {
        int i = 0;
        try {
            switch (f231n[1]) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 33;
                    break;
                case 2:
                    i = 66;
                    break;
                case 3:
                    i = 100;
                    break;
            }
            f290a[0].setAttribute(4, i);
            f290a[1].setAttribute(4, i);
            f290a[2].setAttribute(4, i);
            f290a[3].setAttribute(4, i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Y */
    public final void m438Y() {
        m493D(m388a(false));
    }

    /* renamed from: Z */
    public final void m436Z() {
        m493D(m388a(false));
    }

    /* renamed from: D */
    public final void m493D(int i) {
        boolean z = false;
        try {
            if ((i % 2 != 1 || i >= 13) && i != 12) {
                f290a[0].setAttribute(5, 100);
            } else if (f20ai > 0) {
                f290a[0].setAttribute(5, 150);
            } else {
                f290a[0].setAttribute(5, 100);
            }
        } catch (Throwable unused) {
        }
        switch (i) {
            case 1:
                z = Music_Play("81", 1, i, 0);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 19:
            case 23:
            default:
                m446U();
                return;
            case 3:
                z = Music_Play("82", 1, i, 0);
                break;
            case 5:
                z = Music_Play("83", 1, i, 0);
                break;
            case 7:
                z = Music_Play("84", 1, i, 0);
                break;
            case 9:
                z = Music_Play("85", 1, i, 0);
                break;
            case 11:
                z = Music_Play("86", -1, i, 0);
                break;
            case 12:
                z = Music_Play("87", -1, i, 0);
                break;
            case 13:
                z = Music_Play("88", 1, i, 0);
                this.f435N = 363;
                break;
            case 14:
                z = Music_Play("89", -1, i, 0);
                break;
            case 15:
                z = Music_Play("8a", 1, i, 0);
                break;
            case 16:
                z = Music_Play("8b", 1, i, 0);
                break;
            case 17:
                z = Music_Play("8c", -1, i, 0);
                break;
            case 18:
                z = Music_Play("8d", 1, i, 0);
                break;
            case 20:
                z = Music_Play("8e", 1, i, 0);
                break;
            case 21:
                z = Music_Play("8f", 1, i, 0);
                break;
            case 22:
                z = Music_Play("90", 1, i, 0);
                break;
            case 24:
                z = Music_Play("92", -1, i, 0);
                break;
            case 25:
                z = Music_Play("93", 1, i, 0);
                break;
            case 26:
                z = Music_Play("SEGA", 1, i, 0);
                break;
            case 27:
                m391a("ad");
                break;
            case 28:
                z = Music_Play("c5", 1, i, 1);
                break;
            case 29:
                m391a("b2");
                break;
            case 30:
                z = Music_Play("88", 1, i, 0);
                break;
        }
        if (z) {
            f289cj = i;
        }
    }

    /* renamed from: a */
    private boolean Music_Play(String soundID, int i, int i2, int i3) {
        long currentTimeMillis;
        boolean z = true;
        try {
            currentTimeMillis = System.currentTimeMillis();
            try {
                if (this.f433a[i3] >= currentTimeMillis || i3 == 0 || currentTimeMillis - this.f433a[i3] >= 100) {
                    f290a[i3].stop();
                }
            } catch (Throwable unused) {
            }
            if (f291a[i2] == null) {
                MainInputStream = Connector.openInputStream("scratchpad:///0;pos=288404,length=76076");
                this.f143a = new JarInflater(MainInputStream);
                MainInputStream.close();
                byte[] bArr = new byte[(int) this.f143a.getSize(new StringBuffer().append(soundID).append(".mld").toString())];
                MainInputStream = this.f143a.getInputStream(new StringBuffer().append(soundID).append(".mld").toString());
                MainInputStream.read(bArr);
                MainInputStream.close();
                this.f143a.close();
                f291a[i2] = MediaManager.getSound(bArr);
                f291a[i2].use();
            }
            if (i3 <= 0) {
                f290a[i3].setSound(f291a[i2]);
            } else if (this.f434I[i3] != i2) {
                f290a[i3].setSound(f291a[i2]);
                this.f434I[i3] = i2;
            }
            if (i3 == 0) {
                try {
                    f1a.disable();
                    f1a.enable(1, Integer.parseInt(f291a[i2].getProperty("3d.resources")));
                } catch (Throwable unused2) {
                }
                this.f435N = 0;
            }
        } catch (Throwable unused3) {
            z = false;
        }
        if (this.f433a[i3] >= currentTimeMillis || i3 == 0 || currentTimeMillis - this.f433a[i3] >= 100) {
            this.f433a[i3] = currentTimeMillis;
            f290a[i3].play();
            return z;
        }
        return false;
    }

    /* renamed from: a */
    private static void m391a(String str) {
        int parseInt = Integer.parseInt(str, 16);
        try {
            if (str.equals("aa")) {
                if (f294b[f292J[parseInt - 160]].equals("ad")) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        f293K[f292J[parseInt - 160]] = parseInt;
        f294b[f292J[parseInt - 160]] = str;
    }

    /* renamed from: aN */
    private void m351aN() {
        for (int i = 1; i < 4; i++) {
            if (f293K[i] > 0 && f38ay != 10 && f38ay != 11) {
                Music_Play(f294b[i], 0, (f293K[i] - 160) + 40, i);
            }
            f294b[i] = null;
            f293K[i] = -1;
        }
    }

    /* renamed from: a */
    public final byte[] m383a(byte[] bArr) {
        int length = 293869 > bArr.length ? bArr.length : 293869;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ this.f438a[i % this.f438a.length]);
        }
        return bArr;
    }

    /* renamed from: b */
    private void m261b(String str) {
        try {
            this.f139a = this.f138a.createFile(str);
            this.f140a = this.f139a.open(2);
            this.f141a = this.f140a.openOutputStream();
            this.f141a.write(1);
            this.f141a.close();
            this.f140a.close();
            this.f357r = 1;
        } catch (Throwable unused) {
            try {
                this.f139a = this.f138a.getFile(str);
                this.f140a = this.f139a.open(2);
                this.f142b = this.f140a.openInputStream();
                this.f357r = this.f142b.read() & 255;
                this.f142b.close();
                this.f140a.close();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private void m384a(byte[] bArr) {
        if (bArr == null) {
            this.f68j = false;
            return;
        }
        try {
            this.f140a = this.f139a.open(2);
            this.f141a = this.f140a.openOutputStream();
            this.f141a.write(102);
            this.f141a.write(m383a(bArr));
            this.f141a.close();
            this.f140a.close();
            this.f357r = 102;
        } catch (Throwable unused) {
            this.f68j = false;
        }
    }

    /* renamed from: a */
    private byte[] m426a(int i) {
        byte[] bArr = new byte[i];
        try {
            this.f140a.close();
        } catch (Throwable unused) {
        }
        try {
            this.f142b.close();
        } catch (Throwable unused2) {
        }
        try {
            this.f140a = this.f139a.open(2);
            this.f142b = this.f140a.openInputStream();
            this.f142b.read();
            this.f142b.read(bArr);
            this.f142b.close();
            this.f140a.close();
        } catch (Throwable unused3) {
            this.f68j = false;
        }
        return m383a(bArr);
    }

    /* renamed from: d */
    private int m135d() {
        try {
            return this.f138a.getFreeSize() >= 294912 ? 0 : 2;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: aa */
    public final void m332aa() {
        try {
            this.f143a.close();
        } catch (Throwable unused) {
        }
        if (this.f440z) {
            try {
                this.f143a = new JarInflater(this.f439b);
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: ab */
    public final void m330ab() {
        f38ay = 7;
        this.f340p = new int[this.f339aJ][15];
        for (int i = 0; i < 6 && f304h[f298ck]; i++) {
            f298ck = (f298ck + 1) % 6;
        }
        try {
            this.f147O = 0;
            f306cr = 128;
            f307cs = -1;
            MainInputStream = Connector.openInputStream("scratchpad:///0;pos=364480,length=38850");
            this.f143a = new JarInflater(MainInputStream);
            MainInputStream.close();
            for (int i2 = 0; i2 < 6; i2++) {
                byte[] bArr = new byte[(int) this.f143a.getSize(new StringBuffer().append(i2).append(".GIF").toString())];
                MainInputStream = this.f143a.getInputStream(new StringBuffer().append(i2).append(".GIF").toString());
                MainInputStream.read(bArr);
                MainInputStream.close();
                f4a = MediaManager.getImage(bArr);
                System.gc();
                f4a.use();
                System.gc();
                f297e[i2] = f4a.getImage();
            }
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[39]).append(",length=").append(f6N[40] - f6N[39]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[0] = f4a.getImage();
            int[] iArr = {1, 2, 3, 4, 6, 5};
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append(iArr[f298ck]).append(".bmd").toString());
            f36aw = MainInputStream.read() & 255;
            f37ax = MainInputStream.read() & 255;
            f144t = new byte[f36aw * f37ax * 2];
            MainInputStream.read(f144t);
            MainInputStream.close();
            f145u = new byte[f36aw * f37ax];
            f146v = new byte[f36aw * f37ax];
            MainInputStream = this.f143a.getInputStream(new StringBuffer().append("_").append(iArr[f298ck]).append(".bmd").toString());
            MainInputStream.read();
            MainInputStream.read();
            MainInputStream.read(f145u);
            MainInputStream.close();
            this.f143a.close();
            f4a = MediaManager.getImage(new StringBuffer().append("scratchpad:///0;pos=").append(4 + f6N[68]).append(",length=").append(f6N[69] - f6N[68]).toString());
            System.gc();
            f4a.use();
            System.gc();
            this.GFX_GameArray[56] = f4a.getImage();
            int[] iArr2 = {10, 1, 2, 29, 18, 1, 6, 1, 2, 42, 17, 4};
            f154cu = 0;
            f155cv = 0;
            f156cw = (iArr2[0 + (f298ck << 1)] * 24) << 8;
            f157cx = ((iArr2[1 + (f298ck << 1)] * 24) + 32) << 8;
            f298ck = (f298ck + 1) % 6;
            Music_Play("89", -1, 14, 0);
            this.f54c = true;
            this.f55l = 10;
            this.f418y = false;
            this.f441A = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ac */
    public final void m328ac() {
        f306cr += f307cs;
        f306cr &= 255;
        for (int i = 0; i < 4 && !this.f338X; i++) {
            f170P[0] = f156cw >> 8;
            f170P[1] = f157cx >> 8;
            f149Q = f148cq;
            f149Q &= 2;
            if (f149Q == 0) {
                m116e();
                m349aO();
                m343aR();
                f177R[0] = (f156cw >> 8) - 120;
                f177R[1] = (f157cx >> 8) - 84;
            } else {
                m349aO();
                m343aR();
                f177R[0] = (f156cw >> 8) - 120;
                f177R[1] = (f157cx >> 8) - 84;
            }
            f150R = 0;
            f190Y[0] = f156cw;
            f190Y[1] = f157cx;
            f177R[0] = (f156cw >> 8) - 120;
            f177R[1] = (f157cx >> 8) - 84;
            if (!this.f441A && !this.f338X) {
                m326ad();
            }
            if (this.f338X) {
                break;
            }
        }
        f177R[0] = (f156cw >> 8) - 120;
        f177R[1] = (f157cx >> 8) - 84;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m410a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean[] zArr) {
        if (f199O || f202R || this.f418y) {
            return -1;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (!zArr[i13]) {
                switch (i13) {
                    case 0:
                        if (i4 + i6 > i10 - i12) {
                            continue;
                        } else if (i2 + i6 >= i8 - i12 && i + i5 >= i7 - i11 && i - i5 <= i7 + i11) {
                            return (i + i5 <= i7 - i11 || i - i5 >= i7 + i11) ? -1 : 0;
                        }
                        break;
                    case 1:
                        if (i3 + i5 > i9 - i11) {
                            continue;
                        } else if (i + i5 >= i7 - i11 && i2 + i6 >= i8 - i12 && i2 - i6 <= i8 + i12) {
                            return 1;
                        }
                        break;
                    case 2:
                        if (i3 - i5 < i9 + i11) {
                            continue;
                        } else if (i - i5 <= i7 + i11 && i2 + i6 >= i8 - i12 && i2 - i6 <= i8 + i12) {
                            return 2;
                        }
                        break;
                    case 3:
                        if (i4 - i6 < i10 + i12) {
                            continue;
                        } else if (i2 - i6 <= i8 + i12 && i + i5 >= i7 - i11 && i - i5 <= i7 + i11) {
                            return 3;
                        }
                        break;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v290 */
    /* JADX WARN: Type inference failed for: r0v354 */
    /* JADX WARN: Type inference failed for: r0v359 */
    /* JADX WARN: Type inference failed for: r0v365 */
    /* JADX WARN: Type inference failed for: r0v369 */
    /* JADX WARN: Type inference failed for: r0v373 */
    /* JADX WARN: Type inference failed for: r0v377 */
    /* JADX WARN: Type inference failed for: r0v381 */
    /* JADX WARN: Type inference failed for: r0v385 */
    /* JADX WARN: Type inference failed for: r0v386 */
    /* JADX WARN: Type inference failed for: r0v387 */
    /* JADX WARN: Type inference failed for: r0v388 */
    /* JADX WARN: Type inference failed for: r0v389 */
    /* JADX WARN: Type inference failed for: r0v408 */
    /* JADX WARN: Type inference failed for: r0v419 */
    /* JADX WARN: Type inference failed for: r0v428 */
    /* JADX WARN: Type inference failed for: r0v429 */
    /* JADX WARN: Type inference failed for: r0v430 */
    /* JADX WARN: Type inference failed for: r0v434 */
    /* JADX WARN: Type inference failed for: r0v435 */
    /* JADX WARN: Type inference failed for: r0v436 */
    /* JADX WARN: Type inference failed for: r0v440 */
    /* JADX WARN: Type inference failed for: r0v450 */
    /* JADX WARN: Type inference failed for: r0v460 */
    /* JADX WARN: Type inference failed for: r0v461 */
    /* JADX WARN: Type inference failed for: r0v462 */
    /* JADX WARN: Type inference failed for: r0v466 */
    /* JADX WARN: Type inference failed for: r0v467 */
    /* JADX WARN: Type inference failed for: r0v468 */
    /* JADX WARN: Type inference failed for: r0v472 */
    /* JADX WARN: Type inference failed for: r0v473 */
    /* JADX WARN: Type inference failed for: r0v476 */
    /* JADX WARN: Type inference failed for: r0v477 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* renamed from: ad */
    public final void m326ad() {
        int i;
        f148cq = 1;
        int i2 = 0;
        while (i2 < (240 / f299cl) + 2) {
            if (0 <= (f177R[0] / f299cl) + i2 && f36aw > (f177R[0] / f299cl) + i2) {
                for (int i3 = 0; i3 < (168 / f299cl) + 2; i3++) {
                    if (0 <= (f177R[1] / f299cl) + i3 && f37ax > (f177R[1] / f299cl) + i3) {
                        int i4 = (((f177R[0] / f299cl) + i2) % f36aw) + (((f177R[1] / f299cl) + i3) * f36aw);
                        ?? r21 = i4 >= 0 ? (f144t[i4] & 255) == true ? 1 : 0 : (char) 0;
                        if ((r21 > 0 && r21 < 5) || r21 > 5) {
                            f171Q[2] = (((f177R[0] / f299cl) + i2) * f299cl) + (f299cl / 2);
                            f171Q[3] = ((f177R[1] / f299cl) + i3) * f299cl;
                            boolean[] zArr = new boolean[4];
                            if (r21 != 24 && r21 != 0) {
                                if (i2 > 0) {
                                    int i5 = ((((f177R[0] / f299cl) + i2) - 1) % f36aw) + (((f177R[1] / f299cl) + i3) * f36aw);
                                    ?? r26 = i5 >= 0 ? f144t[i5] & 255 : 0;
                                    if (r26 != 24 && r26 != 0 && r26 != 5) {
                                        zArr[1] = true;
                                    }
                                    int i6 = ((((f177R[0] / f299cl) + i2) + 1) % f36aw) + (((f177R[1] / f299cl) + i3) * f36aw);
                                    ?? r262 = i6 >= 0 ? f144t[i6] & 255 : 0;
                                    if (r262 != 24 && r262 != 0 && r262 != 5) {
                                        zArr[2] = true;
                                    }
                                }
                                if (i3 > 0) {
                                    int i7 = (((f177R[0] / f299cl) + i2) % f36aw) + ((((f177R[1] / f299cl) + i3) - 1) * f36aw);
                                    ?? r263 = i7 >= 0 ? f144t[i7] & 255 : 0;
                                    if (r263 != 24 && r263 != 0 && r263 != 5) {
                                        zArr[0] = true;
                                    }
                                    int i8 = (((f177R[0] / f299cl) + i2) % f36aw) + (((f177R[1] / f299cl) + i3 + 1) * f36aw);
                                    ?? r264 = i8 >= 0 ? f144t[i8] & 255 : 0;
                                    if (r264 != 24 && r264 != 0 && r264 != 5) {
                                        zArr[3] = true;
                                    }
                                }
                            }
                            int m410a = m410a(m280b(), m204c() - 16, f170P[0], f170P[1] - 16, 16, 16, f171Q[2], f171Q[3], f171Q[2], f171Q[3], 12, 12, zArr);
                            if (m410a >= 0) {
                                if (!f303ad && f145u[i4] == 1) {
                                    f303ad = true;
                                    for (int i9 = 0; i9 < f145u.length; i9++) {
                                        if (f144t[i9] == 5) {
                                            f144t[i9] = 9;
                                        }
                                    }
                                }
                                if (r21 == 24) {
                                    f144t[i4] = 0;
                                    f23al++;
                                    m391a("b5");
                                    if (f23al % 100 == 0) {
                                        f28aq++;
                                        if (f28aq > 99) {
                                            f28aq = 99;
                                        }
                                    }
                                } else if (r21 > 17 || r21 == '\n') {
                                    m407a(1, (String) null);
                                    if (r21 != '\n') {
                                        f304h[(f298ck + 5) % 6] = true;
                                        m493D(25);
                                    } else {
                                        m391a("a8");
                                    }
                                    f307cs = -1;
                                    if (r21 == '\n') {
                                        this.f63aG = -1;
                                        this.f441A = true;
                                        this.f147O = 0;
                                        i2 = 0;
                                        while (i2 < 32) {
                                            if (f307cs < 0) {
                                                f307cs -= 2;
                                            } else {
                                                f307cs += 2;
                                            }
                                            this.f147O++;
                                            f306cr += f307cs;
                                            f306cr &= 255;
                                            m54n();
                                            try {
                                                Thread.sleep(50L);
                                            } catch (Throwable unused) {
                                            }
                                            i2++;
                                        }
                                    } else if (f305cp <= 0) {
                                        f305cp = 1;
                                    }
                                    if (r21 != '\n') {
                                        f144t[i4] = 0;
                                    } else {
                                        m428a(1);
                                    }
                                } else if (r21 == 11) {
                                    int i10 = ((f306cr >> 2) << 2) & 255;
                                    int i11 = 120 - (((f299cl * i2) - (f177R[0] % f299cl)) + 12);
                                    int i12 = 84 - (((f299cl * i3) - (f177R[1] % f299cl)) + 12);
                                    int i13 = ((f296b[i10] * i11) >> 8) + ((f295a[i10] * i12) >> 8);
                                    int i14 = (-((f295a[i10] * i11) >> 8)) + ((f296b[i10] * i12) >> 8);
                                    int i15 = i13 + 120;
                                    int i16 = i14 + 84;
                                    m391a("b4");
                                    int abs = Math.abs(120 - i15);
                                    int abs2 = Math.abs(84 - i16);
                                    if (120 - i15 > 0) {
                                        f154cu = ((-1792) * abs) / (abs + abs2);
                                    } else {
                                        f154cu = (1792 * abs) / (abs + abs2);
                                    }
                                    if (84 - i16 > 0) {
                                        f155cv = (2048 * abs2) / (abs + abs2);
                                    } else {
                                        f155cv = ((-2048) * abs2) / (abs + abs2);
                                    }
                                    f148cq = 1;
                                } else {
                                    if (m410a == 0) {
                                        f157cx = ((f171Q[3] - 12) - 1) << 8;
                                    } else if (m410a == 1) {
                                        f156cw = (((f171Q[2] - 12) - 16) - 1) << 8;
                                    } else if (m410a == 2) {
                                        f156cw = (((f171Q[2] + 12) + 16) + 1) << 8;
                                    } else if (m410a == 3) {
                                        f157cx = ((((f171Q[3] + 12) + 16) + 16) + 1) << 8;
                                    }
                                    if (f148cq == 1) {
                                        if (f300cm > 30 && r21 > 5) {
                                            m391a("a9");
                                        }
                                        int i17 = ((f306cr >> 2) << 2) & 255;
                                        if (m410a == 0 || m410a == 3) {
                                            int i18 = 120 - (((f299cl * i2) - (f177R[0] % f299cl)) + 12);
                                            int i19 = 84 - (((f299cl * i3) - (f177R[1] % f299cl)) + 12);
                                            int i20 = ((f296b[i17] * i18) >> 8) + ((f295a[i17] * i19) >> 8);
                                            int i21 = (-((f295a[i17] * i18) >> 8)) + ((f296b[i17] * i19) >> 8);
                                            int i22 = i20 + 120;
                                            int i23 = i21 + 84;
                                            int i24 = 120 - (((f299cl * i2) - (f177R[0] % f299cl)) + 12);
                                            int i25 = 84 - (((f299cl * i3) - (f177R[1] % f299cl)) - 12);
                                            int i26 = ((f296b[i17] * i24) >> 8) + ((f295a[i17] * i25) >> 8);
                                            int i27 = (-((f295a[i17] * i24) >> 8)) + ((f296b[i17] * i25) >> 8);
                                            int i28 = i26 + 120;
                                            int i29 = i27 + 84;
                                            i = i22 < i28 ? 0 + (i23 - i29) : 0 - (i23 - i29);
                                        } else {
                                            int i30 = 120 - (((f299cl * i2) - (f177R[0] % f299cl)) + 12);
                                            int i31 = 84 - (((f299cl * i3) - (f177R[1] % f299cl)) + 12);
                                            int i32 = ((f296b[i17] * i30) >> 8) + ((f295a[i17] * i31) >> 8);
                                            int i33 = (-((f295a[i17] * i30) >> 8)) + ((f296b[i17] * i31) >> 8);
                                            int i34 = i32 + 120;
                                            int i35 = i33 + 84;
                                            int i36 = 120 - (((f299cl * i2) - (f177R[0] % f299cl)) - 12);
                                            int i37 = 84 - (((f299cl * i3) - (f177R[1] % f299cl)) + 12);
                                            int i38 = ((f296b[i17] * i36) >> 8) + ((f295a[i17] * i37) >> 8);
                                            int i39 = (-((f295a[i17] * i36) >> 8)) + ((f296b[i17] * i37) >> 8);
                                            int i40 = i38 + 120;
                                            i = i35 < i39 + 84 ? 0 + (i34 - i40) : 0 - (i34 - i40);
                                        }
                                        int[] iArr = {3, 1, 1, 0, 0, 2, 2, 3};
                                        if (iArr[((i17 / 64) * 2) + 0] == m410a || iArr[((i17 / 64) * 2) + 1] == m410a) {
                                            f148cq = 0;
                                            f153ct += i << 1;
                                            if (f155cv > 600) {
                                                f155cv = 600;
                                            }
                                            f153ct -= f154cu;
                                            f154cu = 0;
                                        } else {
                                            f154cu += i << 1;
                                        }
                                    }
                                }
                                if ((r21 == 14 || r21 == 15 || r21 == 16 || r21 == 17) && f146v[i4] == 0) {
                                    f146v[i4] = 1;
                                    m391a("a9");
                                }
                                if (r21 == '\b' || r21 == '\r') {
                                    if (f301cn > 30) {
                                        f307cs = -f307cs;
                                        m391a("ba");
                                    }
                                    f301cn = 0;
                                }
                                if (r21 == 6 || r21 == 7) {
                                    if (f302co > 30) {
                                        switch (f307cs) {
                                            case -2:
                                                if (r21 == 7) {
                                                    f307cs++;
                                                    f144t[i4] = 6;
                                                    break;
                                                }
                                                break;
                                            case -1:
                                                if (r21 == 6) {
                                                    f307cs--;
                                                    f144t[i4] = 7;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (r21 == 6) {
                                                    f307cs++;
                                                    f144t[i4] = 7;
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                if (r21 == 7) {
                                                    f307cs--;
                                                    f144t[i4] = 6;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    f302co = 0;
                                }
                            }
                        }
                        if ((r21 == 14 || r21 == 15 || r21 == 16 || r21 == 17) && f146v[i4] != 0) {
                            byte[] bArr = f146v;
                            bArr[i4] = (byte) (bArr[i4] + 1);
                            if (f146v[i4] > 16) {
                                if (r21 == 14) {
                                    f144t[i4] = 16;
                                } else if (r21 == 15) {
                                    f144t[i4] = 14;
                                } else if (r21 == 16) {
                                    f144t[i4] = 17;
                                } else if (r21 == 17) {
                                    f144t[i4] = 0;
                                }
                                f146v[i4] = 0;
                            }
                        }
                    }
                }
            }
            i2++;
        }
        if (f148cq == 1) {
            f300cm++;
        } else {
            f300cm = 0;
        }
        f301cn++;
        f302co++;
        if (f305cp > 0) {
            f305cp++;
            if (f305cp > 80) {
                this.f441A = true;
                this.f147O = 0;
                m407a(1, (String) null);
                m391a("a8");
                for (int i41 = 0; i41 < 32; i41++) {
                    if (f307cs < 0) {
                        f307cs -= 2;
                    } else {
                        f307cs += 2;
                    }
                    this.f147O++;
                    f306cr += f307cs;
                    f306cr &= 255;
                    m54n();
                    try {
                        Thread.sleep(50L);
                    } catch (Throwable unused2) {
                    }
                }
                int i42 = 0;
                for (int i43 = 0; i43 < 6; i43++) {
                    if (f304h[i43]) {
                        i42++;
                    }
                }
                if (i42 == 6) {
                    m428a(3);
                } else {
                    m428a(2);
                }
                m89h();
                this.f63aG = -1;
            }
        }
    }

    /* renamed from: ae */
    public final void m324ae() {
        f9a.setClip(0, 36, 240, 168);
        m322af();
        m193c(-2, -2, (240 / f299cl) + 5, (168 / f299cl) + 5);
        m284ay();
        m320ag();
        if (this.f441A) {
            if (this.f147O <= 31) {
                m117df(((this.f147O * 8) << 16) | ((this.f147O * 8) << 8) | (this.f147O * 8));
                return;
            }
            m399a(f9a, 255, 255, 255);
            f9a.fillRect(0, 36, 240, 168);
        }
    }

    /* renamed from: af */
    public final void m322af() {
        switch (this.f442P) {
            case 0:
                int i = -((this.f318f * 4) % 128);
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        int i4 = 0;
                        char c = 0;
                        for (int i5 = 0; i5 < this.f444a[0][i3].length; i5++) {
                            i4 += this.f444a[0][i3][i5];
                            if (this.f444a[1][i3][i5 * 2] == 8) {
                                c = 0;
                            }
                            if (this.f444a[1][i3][i5 * 2] == 4) {
                                c = 1;
                            }
                            if (this.f444a[1][i3][i5 * 2] == 2) {
                                c = 2;
                            }
                            if (((i2 * 64) + i4) - this.f318f < -32) {
                                m396a(f9a, f297e[5], 0, this.f444a[2][c][0], 32, this.f444a[2][c][1], f211b[0], 32 + (i3 * 128) + ((i2 % 2) * 64) + (((m429a((this.f318f * 12) % 360) * this.f444a[1][i3][i5 * 2]) * this.f444a[1][i3][(i5 * 2) + 1]) / 100), (((i2 * 64) + i4) - this.f318f) + 240 + 32, 2);
                            } else {
                                m396a(f9a, f297e[5], 0, this.f444a[2][c][0], 32, this.f444a[2][c][1], f211b[0], 32 + (i3 * 128) + ((i2 % 2) * 64) + (((m429a((this.f318f * 12) % 360) * this.f444a[1][i3][i5 * 2]) * this.f444a[1][i3][(i5 * 2) + 1]) / 100), (((i2 * 64) + i4) - this.f318f) + 32, 2);
                            }
                        }
                    }
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    for (int i7 = 0; i7 < 3; i7++) {
                        m396a(f9a, f297e[3], 128, 192, 64, 64, f211b[0], (i7 * 128) + i + ((i6 % 2) * 64), i6 * 64, 20);
                    }
                }
                if (this.f318f * 4 == 512) {
                    this.f442P = 1;
                    return;
                }
                return;
            case 1:
                int i8 = this.f318f % 16;
                if (i8 >= 8) {
                    m399a(f9a, 13 * (i8 - 8), 27 * (i8 - 8), 74);
                    f9a.fillRect(0, 36, 240, 168);
                    for (int i9 = 0; i9 < 3; i9++) {
                        for (int i10 = 0; i10 < 3; i10++) {
                            m396a(f9a, f297e[3], 128, 0, 64, 64, f211b[0], (i10 * 128) + ((i9 % 2) * 64), i9 * 64, 20);
                        }
                    }
                    if (i8 == 15) {
                        this.f442P = 2;
                        return;
                    }
                    return;
                }
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i11 = 0; i11 < 3; i11++) {
                    for (int i12 = 0; i12 < 3; i12++) {
                        int i13 = 0;
                        char c2 = 0;
                        for (int i14 = 0; i14 < this.f444a[0][i12].length; i14++) {
                            i13 += this.f444a[0][i12][i14];
                            if (this.f444a[1][i12][i14 * 2] == 8) {
                                c2 = 0;
                            }
                            if (this.f444a[1][i12][i14 * 2] == 4) {
                                c2 = 1;
                            }
                            if (this.f444a[1][i12][i14 * 2] == 2) {
                                c2 = 2;
                            }
                            if (((i11 * 64) + i13) - this.f318f < -32) {
                                m396a(f9a, f297e[5], 0, this.f444a[2][c2][0], 32, this.f444a[2][c2][1], f211b[0], 32 + (i12 * 128) + ((i11 % 2) * 64) + (((m429a((this.f318f * 12) % 360) * this.f444a[1][i12][i14 * 2]) * this.f444a[1][i12][(i14 * 2) + 1]) / 100), (((i11 * 64) + i13) - this.f318f) + 240 + 32, 2);
                            } else {
                                m396a(f9a, f297e[5], 0, this.f444a[2][c2][0], 32, this.f444a[2][c2][1], f211b[0], 32 + (i12 * 128) + ((i11 % 2) * 64) + (((m429a((this.f318f * 12) % 360) * this.f444a[1][i12][i14 * 2]) * this.f444a[1][i12][(i14 * 2) + 1]) / 100), (((i11 * 64) + i13) - this.f318f) + 32, 2);
                            }
                        }
                    }
                }
                for (int i15 = 0; i15 < 3; i15++) {
                    for (int i16 = 0; i16 < 3; i16++) {
                        m396a(f9a, f297e[3], 128, 192 - ((i8 >> 1) * 64), 64, 64, f211b[0], (i16 * 128) + ((i15 % 2) * 64), i15 * 64, 20);
                    }
                }
                return;
            case 2:
                int i17 = this.f318f % 16;
                if (i17 < 8) {
                    m399a(f9a, 0, 22 * (7 - i17), 74 + (13 * (7 - i17)));
                    f9a.fillRect(0, 36, 240, 168);
                    for (int i18 = 0; i18 < 3; i18++) {
                        for (int i19 = 0; i19 < 3; i19++) {
                            m396a(f9a, f297e[3], 0, 192, 64, 64, f211b[0], (-128) + (i19 * 128) + (((i18 + 1) % 2) * 64), i18 * 64, 20);
                        }
                    }
                    return;
                }
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i20 = 0; i20 < 3; i20++) {
                    for (int i21 = 0; i21 < 3; i21++) {
                        m396a(f9a, f297e[3], 0, 192 - (((i17 - 8) >> 1) * 64), 64, 64, f211b[0], (-128) + (i21 * 128) + (((i20 + 1) % 2) * 64), i20 * 64, 20);
                    }
                }
                if (i17 == 15) {
                    this.f318f = 0;
                    this.f442P = 3;
                    return;
                }
                return;
            case 3:
                int i22 = (this.f318f * 4) % 128;
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i23 = 0; i23 < 3; i23++) {
                    for (int i24 = 0; i24 < 5; i24++) {
                        if (this.f443l[i23][((4 - i24) * 2) + 0] != 4) {
                            m396a(f9a, f297e[4], 0, this.f443l[this.f443l[i23][((4 - i24) * 2) + 0] + 3][0], 120, this.f443l[this.f443l[i23][((4 - i24) * 2) + 0] + 3][1], f211b[0], 240 - (((this.f318f * (7 - i23)) + (i24 * 64)) % 320), i23 * 64, 20);
                        }
                    }
                }
                for (int i25 = 0; i25 < 3; i25++) {
                    for (int i26 = 0; i26 < 3; i26++) {
                        m396a(f9a, f297e[3], 0, 0, 64, 64, f211b[0], (-128) + (i26 * 128) + i22 + (((i25 + 1) % 2) * 64), i25 * 64, 20);
                    }
                }
                if (this.f318f * 4 == 1024) {
                    this.f442P = 4;
                    return;
                }
                return;
            case 4:
                int i27 = this.f318f % 16;
                if (i27 >= 8) {
                    m399a(f9a, 0, 22 * (i27 - 8), 74 + (13 * (i27 - 8)));
                    f9a.fillRect(0, 36, 240, 168);
                    for (int i28 = 0; i28 < 3; i28++) {
                        for (int i29 = 0; i29 < 3; i29++) {
                            m396a(f9a, f297e[3], 0, 192, 64, 64, f211b[0], (-128) + (i29 * 128) + (((i28 + 1) % 2) * 64), i28 * 64, 20);
                        }
                    }
                    if (i27 == 15) {
                        this.f442P = 5;
                        return;
                    }
                    return;
                }
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i30 = 0; i30 < 3; i30++) {
                    for (int i31 = 0; i31 < 5; i31++) {
                        if (this.f443l[i30][((4 - i31) * 2) + 0] != 4) {
                            m396a(f9a, f297e[4], 0, this.f443l[this.f443l[i30][((4 - i31) * 2) + 0] + 3][0], 120, this.f443l[this.f443l[i30][((4 - i31) * 2) + 0] + 3][1], f211b[0], 240 - (((this.f318f * (7 - i30)) + (i31 * 64)) % 320), i30 * 64, 20);
                        }
                    }
                }
                for (int i32 = 0; i32 < 3; i32++) {
                    for (int i33 = 0; i33 < 3; i33++) {
                        m396a(f9a, f297e[3], 0, 0 + ((i27 >> 1) * 64), 64, 64, f211b[0], (-128) + (i33 * 128) + (((i32 + 1) % 2) * 64), i32 * 64, 20);
                    }
                }
                return;
            case 5:
                int i34 = this.f318f % 16;
                if (i34 < 8) {
                    m399a(f9a, 13 * (8 - i34), 27 * (8 - i34), 74);
                    f9a.fillRect(0, 36, 240, 168);
                    for (int i35 = 0; i35 < 3; i35++) {
                        for (int i36 = 0; i36 < 3; i36++) {
                            m396a(f9a, f297e[3], 128, 0, 64, 64, f211b[0], (i36 * 128) + ((i35 % 2) * 64), i35 * 64, 20);
                        }
                    }
                    return;
                }
                m399a(f9a, 0, 0, 74);
                f9a.fillRect(0, 36, 240, 168);
                for (int i37 = 0; i37 < 3; i37++) {
                    for (int i38 = 0; i38 < 3; i38++) {
                        m396a(f9a, f297e[3], 128, 0 + (((i34 - 8) >> 1) * 64), 64, 64, f211b[0], (i38 * 128) + ((i37 % 2) * 64), i37 * 64, 20);
                    }
                }
                if (i34 == 15) {
                    this.f318f = 0;
                    this.f442P = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: ag */
    public final void m320ag() {
        int i = f211b[0];
        if (f190Y[12] == 1) {
            i = f211b[4];
        }
        if (f38ay == 7) {
            int[] iArr = f190Y;
            iArr[11] = iArr[11] + 3072;
        }
        f198N = true;
        try {
            m398a(f9a, 1, 192 + ((((f190Y[11] / f167Z) / 4) % 5) * 32), 0, 32, 40, i, 120, 80, 2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void m193c(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            if (0 <= (f177R[0] / f299cl) + i5 && f36aw > (f177R[0] / f299cl) + i5) {
                for (int i6 = i2; i6 < i2 + i4; i6++) {
                    if (0 <= (f177R[1] / f299cl) + i6 && f37ax > (f177R[1] / f299cl) + i6) {
                        int i7 = (((f177R[0] / f299cl) + i5) % f36aw) + (((f177R[1] / f299cl) + i6) * f36aw);
                        int i8 = i7 >= 0 ? f144t[i7] & 255 : 0;
                        if (i8 >= 14 && i8 <= 17 && f146v[i7] > 0) {
                            i8 = ((i8 + (f146v[i7] / 4)) % 4) + 14;
                        }
                        m126d(i8, ((f306cr >> 2) << 2) & 255, ((f299cl * i5) - (f177R[0] % f299cl)) + 12, ((f299cl * i6) - (f177R[1] % f299cl)) + 12);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void m126d(int i, int i2, int i3, int i4) {
        int i5 = 120 - i3;
        int i6 = 84 - i4;
        int i7 = ((f296b[i2] * i5) >> 8) + ((f295a[i2] * i6) >> 8);
        int i8 = (-((f295a[i2] * i5) >> 8)) + ((f296b[i2] * i6) >> 8);
        int i9 = i7 + 120;
        int i10 = i8 + 84;
        int i11 = (f306cr / 4) % 16;
        switch (i) {
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                int i12 = 15 - i11;
                m396a(f9a, f297e[0], ((i - 1) * 64) + ((((i12 + 7) / 8) % 2) * 32), ((i12 + 7) % 8) * 32, 32, 32, f211b[0], i9, i10, 2);
                return;
            case 5:
                m396a(f9a, f297e[1], 0, 0, 24, 24, f211b[0], i9, i10, 2);
                return;
            case 6:
                m396a(f9a, f297e[1], 24, (this.f318f % 2) * 24, 24, 24, f211b[0], i9, i10, 2);
                return;
            case 7:
                m396a(f9a, f297e[1], 24, (this.f318f % 2) * 48, 24, 24, f211b[0], i9, i10, 2);
                return;
            case 8:
                m396a(f9a, f297e[1], 0, 72, 24, 24, f211b[0], i9, i10, 2);
                return;
            case 9:
                m396a(f9a, f297e[1], 0, 24, 24, 24, f211b[0 + ((this.f318f % 2) * 4)], i9, i10, 2);
                return;
            case 10:
                m396a(f9a, f297e[1], 24, 96 - ((this.f318f % 2) * 24), 24, 24, f211b[0], i9, i10, 2);
                return;
            case 11:
                m396a(f9a, this.GFX_GameArray[56], 0, 32, 32, 32, f211b[0], i9, i10, 2);
                return;
            case 12:
            default:
                return;
            case 13:
                m396a(f9a, f297e[1], 0, 96, 24, 24, f211b[0], i9, i10, 2);
                return;
            case 14:
            case 15:
            case 16:
            case 17:
                m396a(f9a, f297e[1], ((i - 14) % 2) * 24, 120 + (((i - 14) / 2) * 24), 24, 24, f211b[0 + (this.f318f % 4)], i9, i10, 2);
                return;
            case 18:
                m396a(f9a, f297e[2], 16, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 19:
                m396a(f9a, f297e[2], 0, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 20:
                m396a(f9a, f297e[2], 80, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 21:
                m396a(f9a, f297e[2], 64, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 22:
                m396a(f9a, f297e[2], 48, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 23:
                m396a(f9a, f297e[2], 32, 0, 16, 16, f211b[0], i9, i10, 2);
                return;
            case 24:
                m396a(f9a, this.GFX_GameArray[0], 0, this.f327d[this.f318f & 3], 16, 16, this.f326c[this.f318f & 3], i9, i10, 2);
                return;
        }
    }

    /* renamed from: aO */
    private static void m349aO() {
        if (f148cq == 0) {
            if (f166c[3]) {
                m347aP();
                f190Y[12] = 1;
            }
            if (f166c[4]) {
                m345aQ();
                f190Y[12] = 0;
            }
            if (!f166c[3] && !f166c[4]) {
                f149Q = f153ct;
                if (f149Q != 0) {
                    if (f149Q < 0) {
                        f149Q += f168aa;
                        if (f149Q > 0) {
                            f149Q = 0;
                        }
                        f153ct = f149Q;
                    } else if (f149Q > 0) {
                        f149Q -= f168aa;
                        if (f149Q < 0) {
                            f149Q = 0;
                        }
                        f153ct = f149Q;
                    }
                }
            }
        } else {
            if (f166c[3]) {
                m347aP();
                m347aP();
                f190Y[12] = 1;
            }
            if (f166c[4]) {
                m345aQ();
                m345aQ();
                f190Y[12] = 0;
            }
        }
        int i = (((256 - f306cr) >> 2) << 2) & 255;
        f149Q = (f296b[i] * (-f153ct)) >> 8;
        f156cw += f149Q;
        f149Q = -((f295a[i] * (-f153ct)) >> 8);
        f157cx += f149Q;
        f151S = f157cx;
        f152T = f156cw;
    }

    /* renamed from: aP */
    private static void m347aP() {
        f149Q = f153ct;
        if (f149Q <= 0) {
            f149Q -= f168aa;
            if ((-f167Z) < f149Q) {
                f153ct = f149Q;
                return;
            }
            f149Q = -f167Z;
        } else {
            f149Q -= 128;
        }
        f153ct = f149Q;
    }

    /* renamed from: aQ */
    private static void m345aQ() {
        f149Q = f153ct;
        if (f149Q >= 0) {
            f149Q += f168aa;
            if (f167Z > f149Q) {
                f153ct = f149Q;
                return;
            }
            f149Q = f167Z;
        } else {
            f149Q += 128;
        }
        f153ct = f149Q;
    }

    /* renamed from: e */
    private static int m116e() {
        if (!f166c[2] || f148cq == 1) {
            return 0;
        }
        f149Q = f306cr;
        f149Q &= 252;
        f149Q = -f149Q;
        f149Q -= 64;
        m341aS();
        f150R = 0;
        f150R >>= 8;
        f154cu = f150R;
        f149Q = -425984;
        f149Q >>= 8;
        f155cv = f149Q;
        f148cq = 1;
        f149Q = 160;
        f166c[2] = false;
        m391a("a0");
        return -1;
    }

    /* renamed from: aR */
    private static void m343aR() {
        f151S = f156cw;
        f152T = f157cx;
        int i = (((256 - f306cr) >> 2) << 2) & 255;
        f149Q = ((f296b[i] * f154cu) >> 8) + (((-f295a[i]) * f155cv) >> 8);
        f149Q = f149Q;
        f151S += f149Q;
        f149Q = (-((f295a[i] * f154cu) >> 8)) + (((-f296b[i]) * f155cv) >> 8);
        f149Q = f149Q;
        f152T += f149Q;
        if (f148cq != 0) {
            f155cv += 56;
            if (f155cv > 2560) {
                f155cv = 2560;
            }
        }
        f156cw = f151S;
        f157cx = f152T;
    }

    /* renamed from: aS */
    private static void m341aS() {
        f150R = f296b[f149Q & 255];
        f149Q = -f295a[f149Q & 255];
    }

    /* renamed from: df */
    private static void m117df(int i) {
        f3a.enableSemiTransparent(true);
        f308L[0] = -33554431;
        f308L[1] = 67176512;
        f308L[2] = 0;
        f308L[3] = 36;
        f308L[4] = 0;
        f308L[5] = 240;
        f308L[6] = 36;
        f308L[7] = 0;
        f308L[8] = 240;
        f308L[9] = 204;
        f308L[10] = 0;
        f308L[11] = 0;
        f308L[12] = 204;
        f308L[13] = 0;
        f308L[14] = i;
        f308L[15] = -2113929216;
        f308L[16] = Integer.MIN_VALUE;
        f3a.executeCommandList(f308L);
    }

    /* renamed from: a */
    public static final void m408a(int i, int i2, int[] iArr) {
        f309V = i;
        f158U = i2;
        f161M = iArr;
    }

    /* renamed from: a */
    public static final void m424a(int i, int i2) {
        if (f161M != null && f309V >= 0) {
            f9a.setClip(0, 36, 240, 168);
            int i3 = ((i2 * f161M[0]) / f161M[1]) + f161M[2];
            int i4 = f161M[3];
            if (i4 < 0) {
                if (i3 < i4) {
                    i3 = i4;
                }
            } else if (i3 > i4) {
                i3 = i4;
            }
            if (f309V == 2) {
                int i5 = 0;
                switch (f158U) {
                    case 0:
                        if (!m194c(i, i2, 36) && !m194c(i, i2, 40) && !m194c(i, i2, 44)) {
                            if (!m194c(i, i2, 48)) {
                                i5 = 1;
                                break;
                            } else {
                                i5 = -49;
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (!m194c(i, i2, 56) && !m194c(i, i2, 72)) {
                            if (!m194c(i, i2, 52)) {
                                if (!m194c(i, i2, 60)) {
                                    if (!m194c(i, i2, 64)) {
                                        if (!m194c(i, i2, 68)) {
                                            if (!m194c(i, i2, 76)) {
                                                i5 = 1;
                                                break;
                                            } else {
                                                i5 = -77;
                                                break;
                                            }
                                        } else {
                                            i5 = -69;
                                            break;
                                        }
                                    } else {
                                        i5 = -65;
                                        break;
                                    }
                                } else {
                                    i5 = -61;
                                    break;
                                }
                            } else {
                                i5 = -53;
                                break;
                            }
                        }
                        break;
                    default:
                        if (!m194c(i, i2, 84) && !m194c(i, i2, 88) && !m194c(i, i2, 92)) {
                            if (!m194c(i, i2, 80)) {
                                if (!m194c(i, i2, 96)) {
                                    i5 = 1;
                                    break;
                                } else {
                                    i5 = -97;
                                    break;
                                }
                            } else {
                                i5 = -81;
                                break;
                            }
                        }
                        break;
                }
                if (i5 == 0) {
                    m61l(20, i, i3, i2);
                } else {
                    m61l(4, i, i3, i2);
                    if (i5 < 0 && m270b(i, i2, (-i5) - 1)) {
                        m61l(20, i, i3, i2);
                    }
                }
            } else {
                m61l(4, i, i3, i2);
            }
            f9a.setClip(0, 36, 240, 168);
        }
    }

    /* renamed from: b */
    private static final boolean m270b(int i, int i2, int i3) {
        int i4 = f161M[i3] - i;
        int i5 = f161M[i3 + 2] - i2;
        int i6 = f161M[i3 + 1] - i;
        int i7 = f161M[i3 + 3] - i2;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 36) {
            i5 = 36;
        }
        if (i6 - i4 > 240) {
            i6 = i4 + 240;
        }
        if (i7 - i5 > 168) {
            i7 = i5 + 168;
        }
        if (i4 < i6 && i5 < i7 && i5 < 204 && i7 > 36) {
            f9a.clipRect(i4, i5, i6 - i4, i7 - i5);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m194c(int i, int i2, int i3) {
        return i + 240 >= f161M[i3] && i < f161M[i3 + 1] && (i2 + 168) + 36 >= f161M[i3 + 2] && i2 < f161M[i3 + 3];
    }

    /* renamed from: l */
    private static final void m61l(int i, int i2, int i3, int i4) {
        while (f161M[i] != 0) {
            f159W = i2 / f161M[i + 1];
            f160X = f161M[i + 2] == 0 ? i3 : 256 - ((i4 / f161M[i + 2]) & 255);
            f160X += f161M[i + 3];
            m273b(f161M[i], 0);
            m273b(f161M[i], 256);
            i += 4;
        }
    }

    /* renamed from: b */
    public static final void m273b(int i, int i2) {
        int i3;
        int i4 = f160X;
        if (i2 == 0 && (i3 = f161M[i]) > 0) {
            m191c(f9a, f161M[i + 2]);
            f9a.fillRect(0, f161M[i + 1] + i4, 240, i3);
        }
        int i5 = f211b[0];
        int i6 = i2 - f159W;
        int i7 = f161M[i + 3];
        int i8 = i + 4;
        if (i4 < 20) {
            while (true) {
                if (i7 <= 0) {
                    break;
                }
                i6 = (i6 + f161M[i8]) & 511;
                if (f161M[i8 + 2] == -2) {
                    i4 += f161M[i8 + 1];
                    i5 = f211b[f210a[f161M[i8 + 3]]];
                    if (i4 >= 20) {
                        i8 += 4;
                        i7--;
                        break;
                    }
                }
                i8 += 4;
                i7--;
            }
        }
        while (i7 > 0) {
            i6 = (i6 + f161M[i8]) & 511;
            int i9 = f161M[i8 + 1];
            int i10 = f161M[i8 + 2];
            if (i10 == -2 || (i6 < 496 && (i6 >= 256 || i6 + i9 >= 256))) {
                if (i10 >= 0) {
                    m262b(f9a, f165a[f161M[i8 + 3] / 256], i10, f161M[i8 + 3] % 256, i9, 16, i5, i6 - 256, i4, 20);
                } else {
                    switch (i10) {
                        case -2:
                            int i11 = i4 + f161M[i8 + 1];
                            i4 = i11;
                            if (i11 >= 204) {
                                return;
                            }
                            i5 = f211b[f210a[f161M[i8 + 3]]];
                            continue;
                        case -1:
                            m191c(f9a, f161M[i8 + 3]);
                            f9a.fillRect(i6 - 256, i4, i9, 16);
                            continue;
                        default:
                            int i12 = -(i10 + 16);
                            int i13 = i6 - 256;
                            while (i9 > 0) {
                                m262b(f9a, f165a[f161M[i8 + 3] / 256], i12 % 256, f161M[i8 + 3] % 256, 16, 16, i5, i13, i4, 20);
                                i9 -= 16;
                                i13 += 16;
                            }
                            continue;
                    }
                }
            }
            i8 += 4;
            i7--;
        }
    }

    /* renamed from: ah */
    public final void m318ah() {
        if (f231n[2] == 1) {
            PhoneSystem.setAttribute(1, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v103, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v115, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v126, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v132, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v134, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v136, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v138, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v140, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v142, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v150, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v152, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v154, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v156, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v158, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v162, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v175, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v186, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v188, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v194, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v197, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v199, types: [short[], short[][]] */
    /* JADX WARN: Type inference failed for: r0v203, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v205, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v46, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v77, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v79, types: [int[], int[][]] */
    static {
        String[] strArr = {"MUSIC COMPOSED", "BY MASATO", "NAKAMURA"};
        short[] sArr = {new short[]{0, 0, 32, 40}, new short[]{0, 40, 48, 72}, new short[]{48, 0, 176, 136}};
    }
}
