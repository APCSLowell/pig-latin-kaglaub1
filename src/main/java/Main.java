public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
		String translate = new String("");
        	String consonants = new String("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");
		String vowels = new String("aeiouAEIOU");
		if (vowels.contains(args.substring(0, 1)) == true){
			translate = translate + args + "way";
		}
		if (args.substring(0, 2).equals("qu") == true){
			translate = translate + args.substring(2) + "ay";
		}
		boolean e = true;
		for (int i = 0; i < args.length(); i++){
			if (consonants.contains(args.substring(i, i+1)) == false){
				e = false;
			}
		}
		if (e == true){
			translate = translate + args + "ay";
		}
	}
	


}

