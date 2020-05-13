import java.util.Scanner;
class isanagram{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();

        String fina = "", finb = "";
		char x, y;
        int index = 1, j = 1;

		for(int i = 0; i < a.length(); i++){         //Removing extra characters from a
			x = a.charAt(i);
            index = a.indexOf(x);
            if(index < i)
            	continue;
            fina += x;
		}
		for(int i = 0; i < b.length(); i++){         //Removing extra characters from b
			y = b.charAt(i);
            index = b.indexOf(y);
            if(index < i)
            	continue;
            finb += y;
		}
		boolean truth = true;
        for(int i = 0; i < fina.length(); i++){       //Checking if all characters in a are there in b
        	x = fina.charAt(i);
        	j = 0;
        	for(; j < finb.length(); j++){
        		y = fina.charAt(j);
                if(y == x){
                	truth = true;
                	break;
                }
        	}
        	if(j == finb.length()){
        		System.out.println("NOT ANAGRAMS");
        		System.exit(0);
        	}
        }
        if(truth == true)
        	System.out.println("ANAGRAMS");
        else
        	System.out.println("NOT ANAGRAMS");
	}
}