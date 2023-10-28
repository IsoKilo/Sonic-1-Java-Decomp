package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* renamed from: Sonic */
/* loaded from: Sonic.class */
public class Sonic extends MIDlet {

    /* renamed from: a */
    private static Display app_Display;

    /* renamed from: a */
    private Game app_Instance;

    public Sonic() {
        System.out.println("sonic");
        System.out.println("Version 1.0.46");
        System.out.println("Build 6390");
        app_Display = Display.getDisplay(this);
        this.app_Instance = new Actor(this, -1);
        app_Display.setCurrent(this.app_Instance);
        new Thread(this.app_Instance).start();
    }

    public void startApp() {
    }

    public void pauseApp() {
        System.err.println("pauseapp");
        this.app_Instance.Game_Pause();
    }

    public void destroyApp(boolean z) {
    }
}
