import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KisoKadai1 {
	public static void main(String[] args) {
		int x=0;
		int y=0;
        System.out.println("x��y����͂��ĉ������B: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
        	System.out.println("0�ȏ�100�ȉ��̒l����͂��Ă��������B");
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
        	//���
        	for(int j=y;j>=1;j--){
        		for(int k=1;k<=x;k++){
    			//System.out.print((j*k)+ " ");
        			yohaku(j*k);
        		}
        		System.out.println("");
        	}
        }else{
        	System.out.println("x�Ƃ���100�ȉ��ɂ��Ă��������B");
    	}
	}
	
	//�����ڂ𐮂��邽�߂̋󔒂�����Ă���}
	static void yohaku(int k){
		int leng = String.valueOf(k).length();
		switch(leng){
		case 1:System.out.print("    " + k + " "); break; //1���̂Ƃ�
		case 2:System.out.print("   " + k + " "); break;  //2���̂Ƃ�
		case 3:System.out.print("  " + k + " "); break;   //3���̂Ƃ�
		case 4:System.out.print(" "+k + " ");break;         //4���̂Ƃ�
	    case 5:System.out.print(k + " ");break;}
	}
}
