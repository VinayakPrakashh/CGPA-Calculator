
     import javazoom.jl.player.Player;
import java.io.FileInputStream;
public class music extends javax.swing.JFrame {
    private boolean isPlaying = true;
 Player playMP3;
    public music() {
        
    }
     public void musics(){
         Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    FileInputStream fis = new FileInputStream("song.mp3");
                     playMP3 = new Player(fis);
                    playMP3.play();
                } catch (Exception e) {
                    System.out.println("Problem playing filesong.mp3");
                    System.out.println(e);
                }
            }
        });
        thread.start();
     }

    public void pause() {
        if (isPlaying) {
            
            isPlaying = false;
            playMP3.close();
        }
    }

    public void resume() {
        if (!isPlaying) {
            isPlaying = true;
            try {
                FileInputStream fis = new FileInputStream("song.mp3");
                playMP3 = new Player(fis);
                playMP3.play();
            } catch (Exception e) {
                System.out.println("Problem playing filesong.mp3");
                System.out.println(e);
            }
        }
    }
}


