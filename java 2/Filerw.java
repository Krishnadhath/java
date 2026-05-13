import java.util.*;
import java.io.*;
public class Filerw {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);

        FileWriter wr = new FileWriter("Sample.txt");
        System.out.println("enter lines to write");
        String data= sc.nextLine();
        wr.write(data);
        System.out.println("Write Successsfull");
        wr.close();

        FileReader fr=new FileReader("Sample.txt");

        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
    catch(IOException e){
        System.out.println(e);
    }
}
}
