package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* renamed from: Sonic */
/* loaded from: Sonic.class */
public class Sonic extends MIDlet {

    /* renamed from: a */
    private static Display App_Display;

    /* renamed from: a */
    private Game App_Instance;

    public Sonic() {
        System.out.println("sonic");
        System.out.println("Version 1.0.46");
        System.out.println("Build 6390");
        App_Display = Display.getDisplay(this);
        this.App_Instance = new Actor(this, -1);
        App_Display.setCurrent(this.App_Instance);
        new Thread(this.App_Instance).start();
    }

    public void startApp() {
    }

    public void pauseApp() {
        System.err.println("pauseapp");
        this.App_Instance.Game_Pause();
    }

    public void destroyApp(boolean z) {
    }
}
