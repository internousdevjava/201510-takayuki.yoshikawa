//java.io.*��File�N���X�Ƃ�FileWriter�Ƃ��S���g����悤�ɂ���
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class Kisokadai3
{
	public static void main(String[] args) {
		int x=0;
		int end=0;
		while(end!=1){
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)); //�ǂ��̃��\�b�h�ł�readLine���g�����߂����Ő錾
			System.out.println("Menu�ł��A�ȉ��̐�����I�����Ă��������A����ȊO��Menu�ɖ߂�܂��B");
			System.out.println("1.�V�K 2.�ǂݍ��� 3.�������� 4.�I��");
			System.out.print("=");
			try{
				x=Integer.parseInt(br.readLine());
			}catch(Exception e){
			}
			if(x==1){
				try{
					System.out.println("�f�B���N�g�����w�肵�Ă�������");
					System.out.println("�ȉ��̂悤�Ƀt�@�C�������L�ڂ��Ă�������");
					System.out.println("�� - C:/Users//internous//test.txt");
					System.out.print("=");
					String sakusei=br.readLine();
					File file = new File(sakusei); //�t�@�C���̑��݃`�F�b�N�A�쐬�p
					File dir = new File(file.getParent()); //�f�B���N�g���̑��݃`�F�b�N�A�쐬�p
					if(dir.exists()){ //�f�B���N�g�������݂��Ă��邩�`�F�b�N
						System.out.println("�f�B���N�g�������݂��܂��AMenu�ɖ߂�܂��B");
					}else{
						System.out.println("�V�����f�B���N�g�����쐬���܂�");
						dir.mkdir(); // �f�B���N�g���쐬
					}
					if(file.exists()){ //�t�@�C�������݂��Ă��邩�`�F�b�N
						System.out.println("�t�@�C�������݂��܂��AMenu�ɖ߂�܂��B");
					}else{
						System.out.println("�V�����t�@�C�����쐬���܂�");
						try{
							file.createNewFile(); //�t�@�C���쐬
						}catch(Exception e){
							System.out.println("Error");
							System.out.println("�t�@�C���̍Ďw����s���Ă�������");
						}
					}
				}catch(Exception e){
				}
			}
			if(x==2){
				try{
					System.out.println("�ȉ��̂悤�Ƀt�@�C�������L�ڂ��Ă�������");
					System.out.println("�� - C:/Users//internous//test.txt");
					System.out.print("=");
					String yomikomi=br.readLine();
					BufferedReader fileread = new BufferedReader(new FileReader(new File(yomikomi))); //�w��t�@�C�����܂Ƃ߂ēǂݍ���
					String readstr = "";
					System.out.println("---" + yomikomi + "-----"); //�ǂݍ��݊J�n
					while((readstr = fileread.readLine()) != null){ //�ォ��1�s���ǂݍ���ŕ\���B���g��null(�Ȃɂ������ĂȂ�)�ɂȂ�����I��
						System.out.println(readstr);
					}
					System.out.println("---------------------------------"); //�ǂݍ��ݏI��
					fileread.close();
				}catch(Exception e){
					System.out.println("Error");

				}
			}
			if(x==3){
				int j = 0; //�I���̕ۑ��p
				System.out.println("�ȉ��̂悤�Ƀt�@�C�������L�ڂ��Ă�������");
				System.out.println("�� - C:/Users//internous//test.txt");
				System.out.print("=");
				String kakikomi="";
				try{
					kakikomi=br.readLine();
				}catch(Exception e){
				}
				while(j != 3){
					try{
						System.out.println("�������ݕ��@���w�肵�Ă�������");
						System.out.println("1.�㏑��    2.�ǋL   3.�I��");
						System.out.print("=");
						j = Integer.parseInt(br.readLine());
						String filestr = ""; //���͕�����̕ۑ�
						if(j == 1){//�㏑��
							FileWriter fileuwagaki = new FileWriter(new File(kakikomi)); //�p�X�Ɏw�肳�ꂽ�t�@�C���ɏ������݂��s���錾
							System.out.print("���͂��Ă�������");
							System.out.print("=");
							filestr = br.readLine();
							fileuwagaki.write(filestr + "\r\n"); //���͂��ꂽ��������㏑��   //���s���@ Windows=\r\n  Linux=\n
							fileuwagaki.close();
						}else if(j == 2){//�ǋL
							FileWriter filetuiki = new FileWriter(new File(kakikomi),true); //true�����邱�ƂŎw��t�@�C���ɒǋL�ł���
							System.out.print("���͂��Ă�������");
							System.out.print("=");
							filestr = br.readLine();
							filetuiki.write(filestr + "\r\n");
							filetuiki.close();
						}else if(j == 3){//�I��
							System.out.println("�������݂��I�����܂�");
						}else{//�w��O�̐��������͂��ꂽ��
							System.out.println("�w����̐�������͂��Ă�������");
						}  			}catch(Exception e){
							System.out.println("�w����̐�������͂��Ă�������");
						}
				}
			}
			{
				if(x==4){
					System.out.println("�I�����܂����H������I�����Ă��������B");
					System.out.println("1�D�͂� 2.������");
					System.out.print("=");
					try{
						end=Integer.parseInt(br.readLine());
					}catch(Exception e){
					}


				}
			}
		}
		System.out.println("�I�����܂����B");
	}
}
