import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2 {

	public static void main(String[] args) {
		int x=0;
		System.out.println("HIGH��LOW!!1~100�܂ł̐��������Ă��������B");
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i = (int)(Math.random() * 100);
        
       while( i!= x ){ 
        try{
        	System.out.print("���Ȃ��̐�����");
            String suuji = br.readLine();
            x = Integer.parseInt(suuji);
        }catch(Exception e){
            x = 0;
        }
        if(x<1|x>100){
        	System.out.println("1~100�̐����ɂ��Ă��������B");
        }else if( i < x){
        System.out.println("High!!�����͂����ƒႢ��!!");
        
        }else if( i > x){
        	
        System.out.println("Low!!�����͂����ƍ�����!!");
        }
	}
       System.out.println("������ł�!!");
	}
}
