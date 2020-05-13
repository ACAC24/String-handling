import java.util.Scanner;
class abbr{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		line += ' ';

		int slen = line.length();
        String words = "";
		
		String fin = "";
		char letter;

		for(int i = 0; i < slen; i++){
			letter = line.charAt(i);
			if(letter != ' ')
				words += letter;
			else{
				fin += words.charAt(0);
				words = "";
			}
		}
		System.out.println(fin);
	}
}