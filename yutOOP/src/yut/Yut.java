package yut;

public class Yut {
	
	public int yuthrow() {
		
		int num;
		
		String str[] = { "��", "��", "��", "��", "��"};
		num=(int)(Math.random()*5)+1;
		System.out.printf("%s",str[num-1]);
		System.out.printf("%d",num);
		
		return num;
	}
	
}
