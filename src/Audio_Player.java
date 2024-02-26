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
    public String[] Music_PlayerPaths;

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
                return this.Music_PlayerPaths != null;
            case 2:
                return this.f337b != null;
            case 3:
                return (this.f337b == null || this.Music_PlayerPaths == null) ? false : true;
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
                this.Music_Player = Music_CreatePlayer(this.Music_PlayerPaths[trackID], "audio/midi");
                VolumeControl control = (VolumeControl) this.Music_Player.getControl("VolumeControl");
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
    public final void Music_DestroyPlayer() {
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
    private Player Music_CreatePlayer(String path, String extension) {
        String fullpath;
        Player player = null;
        if (path == this.Music_PlayerPaths[20]) {
            fullpath = new StringBuffer().append(path).append(".amr").toString();
            extension = "audio/amr";
        } else {
            fullpath = new StringBuffer().append(path).append(".mid").toString();
        }
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(fullpath);
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
