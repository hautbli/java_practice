import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Mainmusic {

    public static void main(String[] args) {

        File Clap = new File("epicsound.wav");
        while(true) {
            PlaySound(Clap);
        }
    }

    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);

            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {

        }
    }


}
