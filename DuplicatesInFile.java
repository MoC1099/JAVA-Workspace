package projects;

public class DuplicatesInFile {

	public static void main(String[] args) {
		String s = "My name is saad";
		// to get the characters from the string
		//System.out.println(s.charAt(0));
		
		String characters = "";
		String duplicates = "";
		for (int i= 0; i<s.length(); i++) {
			
			String current = Character.toString(s.charAt(i));
			if(characters.contains(current)) {
				if(!duplicates.contains(current)) {
					duplicates += current + "" ;
				}
			}
			characters += current;
			
			
		}
		System.out.print(duplicates);
	}

}
