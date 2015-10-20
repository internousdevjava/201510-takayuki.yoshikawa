import java.io.BufferedReader;
import java.io.InputStreamReader;
//文字化け修正しました。
public class Kisokadai2 {

	public static void main(String[] args) {
		int x=0;
		System.out.println("HIGH＆LOW!!1~100までの数字を入れてください。");
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i = (int)(Math.random() * 100);
        
       while( i!= x ){ 
        try{
        	System.out.print("あなたの数字は");
            String suuji = br.readLine();
            x = Integer.parseInt(suuji);
        }catch(Exception e){
            x = 0;
        }
        if(x<1|x>100){
        	System.out.println("1~100の数字にしてください。");
        }else if( i < x){
        System.out.println("High!!答えはもっと低いよ!!");
        
        }else if( i > x){
        	
        System.out.println("Low!!答えはもっと高いよ!!");
        }
	}
       System.out.println("当たりです!!");
	}
}