
public class Begin {

	public static void main(String[] args) {
		/*
		 * is the first known secret code
		 * it is an alphabet shift
		 * start with plain text, and a "key"
		 * lets say key = 2, and
		 * plain text is abc
		 * then a + 2 = --> c
		 * b + 2 --> d
		 * c + 2 --> e
		 * so secret code for abc is cde
		 * deciphering the code is just reversing the key
		 * 
		 * GRADED REQUIREMENTS:
		 * PART ONE - FIRST GRADE
		 * 
		 * 0. use a JOP to ask for plainText
		 * 
		 * 1. Fix the space problem (hint: use an if to test for space)
		 * 2. Fix the z wrap (hint: if index index + key > 26, then subtract 25
		 * so from above 27 - 25 = 2 = b PERFECT!
		 * 
		 * PART 2
		 * add decoding knowing the key -- reverse the process
		 * 
		 * PART 3
		 * crack a code where you do not know the key
		 */
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int key = 2;
		String plainText = "abc";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		plainText = plainText.toLowerCase();
		
		//System.out.println("lowercase: " + plainText);
		
		// plaintext.charAt(0) tells me the char at position 0
		for (int i = 0; i < plainText.length(); i++){
			
		
			indexPlaintext = alpha.indexOf(plainText.charAt(i));
		
			//System.out.println("alpha index for first char of plainText is: " + indexPlaintext);
		
			// use the shift key
			indexShifted = indexPlaintext + key;
			//System.out.println("key: " + key);
			//System.out.println("index of plain text: " + indexPlaintext);
			//System.out.println("index of shifted text: " + indexShifted);
			//System.out.println("shifted character is: " + alpha.charAt(indexShifted));
			codedText = codedText + alpha.charAt(indexShifted);
			
			System.out.println();
			System.out.println("Original: " + plainText);
			System.out.println("key: " + key);
			System.out.println("Secret coded msg: " + codedText);
		}
		

	}

}
