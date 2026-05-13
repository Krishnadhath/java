import java.io.*;
public class EoR {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("num.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter evnw= new FileWriter("even.txt");
            FileWriter oddw= new FileWriter("odd.txt");

            String line;

            while((line=br.readLine())!=null){
                if(Integer.parseInt(line)%2==0){
                evnw.write(line+"\n");
            }
            else{
                oddw.write(line +"\n");
            }
        
        }
        br.close();
        evnw.close();
        oddw.close();
    }
    catch(IOException e){
        System.out.println(e);
    }
    
}
}
