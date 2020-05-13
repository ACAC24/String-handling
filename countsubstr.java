import java.util.Scanner;
class countsubstr{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		String str = s.nextLine();

		str += ' ';
		int slen = str.length();
		String substr = "";

		String sub = s.nextLine();
		int blen = sub.length();

		for(int i = 0; i < slen; i++){
			if(i > slen - blen - 1)
			   continue;
            substr = str.substring(i, i + blen);
            if(substr.equals(sub))
            	count++;
		}
		System.out.println(sub + " Appears " + count + " times");
	}
}