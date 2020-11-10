import org.w3c.dom.ls.LSOutput;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Musicthread extends Thread {


    public static void main(String[] args) throws Exception {
        System.out.println("힝");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("all.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        Thread.sleep(10000); // looping as long as this thread is alive
        try{throw new Exception();
        } catch (Exception e){}

    }
}