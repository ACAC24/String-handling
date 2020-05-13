import java.util.Scanner;
class revwords{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		line += ' ';

        int slen = line.length();
        char letter;

		String word = "";
		String rev = "";

		for(int i = 0; i < slen; i++){
           letter = line.charAt(i);
           if(letter != ' ')
           	  word += letter;
           else{
           	  rev = word + " " + rev;
           	  word = "";
           }
		}
		System.out.println(rev);
	}
}