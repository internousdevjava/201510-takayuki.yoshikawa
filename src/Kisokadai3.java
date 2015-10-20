//java.io.*でFileクラスとかFileWriterとか全部使えるようにする
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
//文字化け修正しました。
public class Kisokadai3
{
	public static void main(String[] args) {
		int x=0;
		int end=0;
		while(end!=1){
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)); //どこのメソッドでもreadLineを使うためここで宣言
			System.out.println("Menuです、以下の数字を選択してください、それ以外はMenuに戻ります。");
			System.out.println("1.新規 2.読み込み 3.書き込み 4.終了");
			System.out.print("=");
			try{
				x=Integer.parseInt(br.readLine());
			}catch(Exception e){
			}
			if(x==1){
				try{
					System.out.println("ディレクトリを指定してください");
					System.out.println("以下のようにファイル名を記載してください");
					System.out.println("例 - C:/Users//internous//test.txt");
					System.out.print("=");
					String sakusei=br.readLine();
					File file = new File(sakusei); //ファイルの存在チェック、作成用
					File dir = new File(file.getParent()); //ディレクトリの存在チェック、作成用
					if(dir.exists()){ //ディレクトリが存在しているかチェック
						System.out.println("ディレクトリが存在します、Menuに戻ります。");
					}else{
						System.out.println("新しくディレクトリを作成します");
						dir.mkdir(); // ディレクトリ作成
					}
					if(file.exists()){ //ファイルが存在しているかチェック
						System.out.println("ファイルが存在します、Menuに戻ります。");
					}else{
						System.out.println("新しくファイルを作成します");
						try{
							file.createNewFile(); //ファイル作成
						}catch(Exception e){
							System.out.println("Error");
							System.out.println("ファイルの再指定を行ってください");
						}
					}
				}catch(Exception e){
				}
			}
			if(x==2){
				try{
					System.out.println("以下のようにファイル名を記載してください");
					System.out.println("例 - C:/Users//internous//test.txt");
					System.out.print("=");
					String yomikomi=br.readLine();
					BufferedReader fileread = new BufferedReader(new FileReader(new File(yomikomi))); //指定ファイルをまとめて読み込み
					String readstr = "";
					System.out.println("---" + yomikomi + "-----"); //読み込み開始
					while((readstr = fileread.readLine()) != null){ //上から1行ずつ読み込んで表示。中身がnull(なにも書いてない)になったら終了
						System.out.println(readstr);
					}
					System.out.println("---------------------------------"); //読み込み終了
					fileread.close();
				}catch(Exception e){
					System.out.println("Error");

				}
			}
			if(x==3){
				int j = 0; //選択の保存用
				System.out.println("以下のようにファイル名を記載してください");
				System.out.println("例 - C:/Users//internous//test.txt");
				System.out.print("=");
				String kakikomi="";
				try{
					kakikomi=br.readLine();
				}catch(Exception e){
				}
				while(j != 3){
					try{
						System.out.println("書き込み方法を指定してください");
						System.out.println("1.上書き    2.追記   3.終了");
						System.out.print("=");
						j = Integer.parseInt(br.readLine());
						String filestr = ""; //入力文字列の保存
						if(j == 1){//上書き
							FileWriter fileuwagaki = new FileWriter(new File(kakikomi)); //パスに指定されたファイルに書き込みを行う宣言
							System.out.print("入力してください");
							System.out.print("=");
							filestr = br.readLine();
							fileuwagaki.write(filestr + "\r\n"); //入力された文字列を上書き   //改行方法 Windows=\r\n  Linux=\n
							fileuwagaki.close();
						}else if(j == 2){//追記
							FileWriter filetuiki = new FileWriter(new File(kakikomi),true); //trueを入れることで指定ファイルに追記できる
							System.out.print("入力してください");
							System.out.print("=");
							filestr = br.readLine();
							filetuiki.write(filestr + "\r\n");
							filetuiki.close();
						}else if(j == 3){//終了
							System.out.println("書き込みを終了します");
						}else{//指定外の数字が入力された時
							System.out.println("指定内の数字を入力してください");
						}  			}catch(Exception e){
							System.out.println("指定内の数字を入力してください");
						}
				}
			}
			{
				if(x==4){
					System.out.println("終了しますか？数字を選択してください。");
					System.out.println("1．はい 2.いいえ");
					System.out.print("=");
					try{
						end=Integer.parseInt(br.readLine());
					}catch(Exception e){
					}


				}
			}
		}
		System.out.println("終了しました。");
	}
}