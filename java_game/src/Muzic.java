import java.io.File;

    public class Muzic extends Thread {

    Mainmusic mainmusic;
    File Clap = new File("epicSound.wav");

    public void run (){
        mainmusic. PlaySound(Clap);

        try {
            Thread.sleep((int)(Math.random() * 10000));

        } catch (InterruptedException ignored) {

        }


    }



}
