import java.util.*;
import java.io.*;
public class Copy {
    public static void main(String[] args) {
    try{
    Scanner sc= new Scanner(System.in);
    FileReader fr = new FileReader("Sample.txt");
    BufferedReader br = new BufferedReader(fr);

    FileWriter fw = new FileWriter("Desti.txt");

    String line;
    while((line=br.readLine())!=null){
        fw.write(line + "\n");

    }
    br.close();
    fw.close();

    } 
    catch(IOException e){
        System.out.println(e);
    }  
}
}
