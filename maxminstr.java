class maxminstr{
	public static void main(String[] args) {
		String keep = "This is an umbrella";
		keep += " ";
		
		int length = keep.length();
		char letter;
		String words = "", max = "", min = "pasta";

		for(int i = 0; i < length; i++){
		    letter = keep.charAt(i);
		    if(letter != ' ')
		    	words += letter;
		    else{
		    	if(max.length() <= words.length())
		    		max = words;
		    	if(min.length() >= words.length())
		    		min = words;
		    	words = "";
		    }
		}
		System.out.println("Largest : " + max);
		System.out.println("Smallest : " + min);
	}
}