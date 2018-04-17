import java.util.Arrays;

public class GeneratePseudorandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 5;
		int n = 100;
		int seed = 92;
		int num = 5;
		int[] resultList = new int[num];
		for (int i = 0; i < num; i++) {
			resultList[i] = (a*seed+b)%n;
			seed = resultList[i];
		}
		System.out.println(Arrays.toString(resultList)); //输出字符串内容的格式（最上面要import Arrays的package)
														//直接打印resultList返回的是地址。
	}

}
