import java.io.File;
public class Caring_File {
    public static void main(String[]args){
    File file = new File("art.txt");
    if(file.exists()){
        System.out.println("That file exists :0!");
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }
    else if(file.isFile()){
        System.out.println("that file should have been deleted");
        
    }
    else{
        System.out.println("That file doesn't exists :)");
    }


    }
}
