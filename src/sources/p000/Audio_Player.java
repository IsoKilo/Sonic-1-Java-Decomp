package p000;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/* renamed from: d */
/* loaded from: d.class */
public final class Audio_Player {

    /* renamed from: b */
    private static int f335b = 0;

    /* renamed from: a */
    public String[] f336a;

    /* renamed from: b */
    private String[] f337b;

    /* renamed from: a */
    public int Music_CurTrack = -1;

    /* renamed from: a */
    private boolean f339a = true;

    /* renamed from: a */
    private Player Music_Player;

    /* renamed from: a */
    private PlayerListener Music_Listener;

    public Audio_Player(PlayerListener playerListener) {
        this.Music_Listener = playerListener;
    }

    /* renamed from: a */
    private boolean m4a(int i) {
        switch (i) {
            case 0:
                return true;
            case 1:
                return this.f336a != null;
            case 2:
                return this.f337b != null;
            case 3:
                return (this.f337b == null || this.f336a == null) ? false : true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static boolean m6a() {
        return f335b != 0;
    }

    /* renamed from: a */
    public final void m5a(int i) {
        f335b = i;
        if (!m4a(f335b)) {
            f335b = 0;
        }
        if (f335b == 0) {
            Audio_DestroyPlayer(this.Music_Player);
        }
    }

    /* renamed from: a */
    public final void Music_Play(int trackID, int loopcount, boolean z) {
        try {
            if (trackID == this.Music_CurTrack && !z && (this.Music_Player == null || this.Music_Player.getState() == 400)) {
                return;
            }
            if (this.Music_Player != null) {
                Audio_DestroyPlayer(this.Music_Player);
            }
            if ((f335b & 1) == 1) {
                this.Music_Player = m2a(this.f336a[trackID], "audio/midi");
                VolumeControl control = this.Music_Player.getControl("VolumeControl");
                if (control != null) {
                    control.setLevel(50);
                }
                this.Music_Player.setLoopCount(loopcount);
                if (this.f339a) {
                    this.Music_Player.start();
                }
                this.Music_CurTrack = trackID;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m7a() {
        Audio_DestroyPlayer(this.Music_Player);
    }

    /* renamed from: b */
    public final void m0b() {
        Audio_DestroyPlayer(this.Music_Player);
    }

    /* renamed from: a */
    private void Audio_DestroyPlayer(Player player) {
        try {
            player.stop();
            player.deallocate();
            player.close();
            if (player == this.Music_Player) {
                this.Music_CurTrack = -1;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private Player m2a(String path, String extension) {
        String stringBuffer;
        Player player = null;
        if (path == this.f336a[20]) {
            stringBuffer = new StringBuffer().append(path).append(".amr").toString();
            extension = "audio/amr";
        } else {
            stringBuffer = new StringBuffer().append(path).append(".mid").toString();
        }
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(stringBuffer);
            Player createPlayer = Manager.createPlayer(resourceAsStream, extension);
            player = createPlayer;
            createPlayer.addPlayerListener(this.Music_Listener);
            player.realize();
            player.prefetch();
            resourceAsStream.close();
        } catch (Exception unused) {
        }
        return player;
    }
}
