public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
		String args2 = "";
		for (int i = 0; i < args.length; i++){
			args2 += args[i];
		}
		String translate = new String("");
        	String consonants = new String("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");
		String vowels = new String("aeiouAEIOU");
		//start with vowel
		if (vowels.contains(args2.substring(0, 1)) == true){
			translate = translate + args2 + "way";
		}
		//start with qu
		if (args2.substring(0, 2).equals("qu") == true){
			translate = translate + args2.substring(2) + "ay";
		}
		//no vowels
		boolean e = true;
		for (int i = 0; i < args2.length(); i++){
			if (consonants.contains(args2.substring(i, i+1)) == false){
				e = false;
			}
		}
		if (e == true){
			translate = translate + args2 + "ay";
		}
	}
	


}

