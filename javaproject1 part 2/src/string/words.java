package string;

public class words {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hey welcome to mphasist");
	StringBuffer sa;
	sa=new StringBuffer(sb);
	System.out.println(sa);
	sa.reverse();
	int count=0;
	System.out.println(sa);
	System.out.println(sa.charAt(1));
	
	int f=sa.length();
	for(int i=0;i<f;i++) {
		if(sb.charAt(i)==' ') {
			count++;
					}
		
	}
	count+=1;
	System.out.println(count);

}
}