package p000;

import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.IApplication;
import com.nttdocomo.ui.PhoneSystem;

/* renamed from: Main */
/* loaded from: Main.class */
public class Main extends IApplication implements Runnable {

    /* renamed from: a */
    private Game App_Instance;

    public final void start() {
        PhoneSystem.setAttribute(0, 1);
        this.App_Instance = new Game(this);
        Display.setCurrent(this.App_Instance);
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.App_Instance.m134d();
        this.App_Instance.m115e();
    }

    public final void resume() {
        try {
            this.App_Instance.m279b();
        } catch (Throwable unused) {
        }
    }
}