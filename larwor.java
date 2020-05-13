import java.util.Scanner;
class larwor{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sent = s.nextLine();
        
        String word = "";
        String max = "";
        char letter;

		for(int i = 0; i < sent.length(); i++){
			letter = sent.charAt(i);
			if(letter != ' ')
				word += letter;
		    else{
		    	if(max.length() <= word.length())
		    		max = word;
		    	word = "";
		    }
		}
		System.out.println(max + " is the largest word");
	}
}