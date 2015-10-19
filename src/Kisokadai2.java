import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2 {

	public static void main(String[] args) {
		int x=0;
		System.out.println("HIGH•LOW!!1~100‚Ü‚Å‚Ì”š‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢B");
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i = (int)(Math.random() * 100);
        
       while( i!= x ){ 
        try{
        	System.out.print("‚ ‚È‚½‚Ì”š‚Í");
            String suuji = br.readLine();
            x = Integer.parseInt(suuji);
        }catch(Exception e){
            x = 0;
        }
        if(x<1|x>100){
        	System.out.println("1~100‚Ì”š‚É‚µ‚Ä‚­‚¾‚³‚¢B");
        }else if( i < x){
        System.out.println("High!!“š‚¦‚Í‚à‚Á‚Æ’á‚¢‚æ!!");
        
        }else if( i > x){
        	
        System.out.println("Low!!“š‚¦‚Í‚à‚Á‚Æ‚‚¢‚æ!!");
        }
	}
       System.out.println("“–‚½‚è‚Å‚·!!");
	}
}
