import java.util.*;

class Myexception extends Exception{
    Myexception(String msg){
        super(msg);
    }
}
class user{
    String username;
    String password;
    user(String u,String p){
        username=u;
        password=p;
    }
    void login(String u,String p) throws Myexception{
        if(username.equals(u)&&password.equals(p)){
            System.out.println("Login Successfull");
        }
        else{
            throw new Myexception("Invalid Credentials");
        }

    }
}
public class UseEx {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    try{

    System.out.println("Create Username");
    String uname=sc.nextLine();

    for(int i=0;i<uname.length();i++){
        if(!Character.isLetter(uname.charAt(i))){
            throw new Myexception("should only contain letters");
        }
    }

    System.out.println("Create Password:");
    String pass = sc.nextLine();

    if(pass.length()<8){
        throw new Myexception("should contain more than 8 chars");
    }
    
    boolean hasdigit=false;
    for(int i=0;i<pass.length();i++){
        if(Character.isDigit(pass.charAt(i))){
            hasdigit=true;
        }
    }
        if(!hasdigit){
            throw new Myexception("Password should Contain digits");
        }

        user u1 = new user(uname, pass);

        System.out.println("LOGIN");

        System.out.println("Enter Username");
        String u = sc.nextLine();

        System.out.println("Enter Password:");
        String p = sc.next();

        u1.login(u,p);

    }

    catch (Myexception e){
        System.out.println(e.getMessage());
    }

    
}
}
