import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MusicThread extends Thread {
    private static String wildwildwest = "D:\\1 1MyFiles\\FNAM\\wildwildwest\\";

    @Override
    public void run() {
            try {
                AudioInputStream bakgrnd
                        = AudioSystem.getAudioInputStream(
                        new File(wildwildwest + "background.wav")
                        .getAbsoluteFile());
                AudioInputStream yeet
                        = AudioSystem.getAudioInputStream(
                        new File(wildwildwest + "screm.wav")
                                .getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                Clip clip2 = AudioSystem.getClip();
                clip.open(bakgrnd);
                clip2.open(yeet);
                clip.start();
                while(true) {
                    System.out.println(Main.music);
                    if(Main.music == 1) {
                        clip.stop();
                        clip2.start();
                        Main.music = 0;
                    }
                    if(Main.music == 2) {
                        clip2.stop();
                        clip.start();
                        Main.music = 0;
                    }
                }
            } catch(Exception ex) {
                System.out.println("Error with playing sound");
                ex.printStackTrace();
            }
    }
}
