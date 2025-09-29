package prekadai.fizzbuzz;

/**
 * プレ課題（FizzBuzzArray）
 * 
 * @author 
 * @version 1.0
 *
 */
public class FizzBuzzArray {
	
	protected static String[] list = new String[100]; 
	/**
	 * (余裕あればメソッド化やクラスのインスタンス化してください)
	 * 1から100までの数を順番に表示し、結果を配列に格納するプログラムを作成してください。<br>
	 * ただし、以下の条件を満たす場合には特定の文字列を配列に格納します。<br>
	 * 3で割り切れる場合： “Fizz”<br>
	 * 5で割り切れる場合： “Buzz”<br>
	 * 3と5の両方で割り切れる場合： “FizzBuzz”<br>
	 * 例）1から15までの数を表示すると以下のようになります：<br>
	 * 1<br>
	 * 2<br>
	 * Fizz<br>
	 * 4<br>
	 * Buzz<br>
	 * Fizz<br>
	 * 7<br>
	 * 8<br>
	 * Fizz<br>
	 * Buzz<br>
	 * 11<br>
	 * Fizz<br>
	 * 13<br>
	 * 14<br>
	 * FizzBuzz<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		setlist();
		call();	
	}
	
	protected static void setlist() {
		for (int i = 0 ; i < 100 ; i++) {
			if((i + 1)%3 == 0 && (i + 1)%5 == 0) 
			{
				list[i] = "FizzBuzz";
			}else if((i + 1)%3 == 0){
				list[i] = "Fizz";
			}else if((i + 1)%5 == 0) {
				list[i] = "Buzz";
			}else {
				Integer num = Integer.valueOf((i+1));
				list[i] = num.toString();
			}
		}
	}
	
	protected static void call() {
		// callメソッドでも良い
		for (int i = 0 ; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
