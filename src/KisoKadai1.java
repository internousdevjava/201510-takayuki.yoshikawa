import java.io.BufferedReader;
import java.io.InputStreamReader;
//文字化け修正しました。
public class KisoKadai1 {
	public static void main(String[] args) {
		int x=0;
		int y=0;
        System.out.println("xとyを入力して下さい。: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
        	System.out.println("0以上100以下の値を入力してください。");
        	System.out.print("x=");
            String aaa = br.readLine();
            x = Integer.parseInt(aaa);
        	System.out.print("y=");
            String bbb = br.readLine();
            y = Integer.parseInt(bbb);
            }catch(Exception e){
            x = 0;
            }
        if((0 < (x | y)) & ((x | y) <= 100)){
        	//九九
        	for(int j=y;j>=1;j--){
        		for(int k=1;k<=x;k++){
    			//System.out.print((j*k)+ " ");
        			yohaku(j*k);
        		}
        		System.out.println("");
        	}
        }else{
        	System.out.println("xとｙは100以下にしてください。");
    	}
	}
	
	//見た目を整えるための空白を作っている}
	static void yohaku(int k){
		int leng = String.valueOf(k).length();
		switch(leng){
		case 1:System.out.print("    " + k + " "); break; //1桁のとき
		case 2:System.out.print("   " + k + " "); break;  //2桁のとき
		case 3:System.out.print("  " + k + " "); break;   //3桁のとき
		case 4:System.out.print(" "+k + " ");break;         //4桁のとき
	    case 5:System.out.print(k + " ");break;}
	}
}
