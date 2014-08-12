import java.io.*;
import java.util.Random;

public class HitNumber {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//桁数入力するメソッド
	public int inputDigit() throws IOException {
	System.out.println("桁数を入力してください。");
	int digit = Integer.parseInt(br.readLine().trim());
	return digit;
	}
	
	//ランダムに数字を取り出す&配列に格納するメソッド
	public int[] getRandom(int digit) throws IOException {
		Random rd = new Random();
		int randomNum[] = new int[digit];
		
		/*for(int n = 0;n < digit;n++){
		randomNum[n] = rd.nextInt(10);
		}
		
		for(int i = 0;i < digit;i++){
			for(int j = 0;j <= i;j++){
				if(i != j){
					do{
						if(randomNum[i] == randomNum[j]){
						randomNum[i] = rd.nextInt(10);}
					}while(randomNum[i] == randomNum[j]);
				}
			}
		}*/
		
		for(int i = 0;i < digit;i++){
			randomNum[i] = rd.nextInt(4);
			for(int j = 0;j < i;){
				boolean flg = true;
				while(flg){
					if(randomNum[i] == randomNum[j]){
						randomNum[i] = rd.nextInt(4);
						break;
					}
					else{
						flg = false;
					}
				}
			}
		}
		return randomNum;
	}

	public static void main(String[] args) throws IOException {
		HitNumber torase = new HitNumber();
		//torase.getRandom(torase.inputDigit());
		
		int randomNum[] = torase.getRandom(torase.inputDigit());
		//System.out.println(randomNum[0]);
		//System.out.println(randomNum[4]);
	}
}

