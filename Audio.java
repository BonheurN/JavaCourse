import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
public class Audio
 {
    public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
        File file = new File("Dancin' – MBB (No Copyright Music).wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        
        
        String response = "";
        while(!response.equals("Q")){
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response.toUpperCase();

            switch(response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default: System.out.println("Invalid response");
            }
        }
        System.out.println("Byee");



    }

}
