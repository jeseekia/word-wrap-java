import java.util.ArrayList;
import java.util.Arrays;

public class Wrapper {

	public static String wrap(String text, int columnNumber) {
		
		String[] tempArray = text.split("\\s"); //create an array of strings
		
		ArrayList<StringBuilder> words = new ArrayList<StringBuilder>();//convert tempArray to arraylist
		for (int i=0; i<tempArray.length; i++) {
			words.add(new StringBuilder(tempArray[i]));
		}
		
		
		int totalChars = 0, wordCount = 0; //totalChars to keep track of character count and wordCount to keep track of the number of words
		StringBuilder newWord = new StringBuilder();
		
		while(totalChars + wordCount < columnNumber && totalChars + wordCount > -1){
			int wordLength = 0;
			for(int i=0; i<words.size(); i++){
				wordLength = words.get(i).length();
				
				if(totalChars + wordCount + wordLength <= columnNumber){
					totalChars += wordLength;
					wordCount++;
				} else {
					break;
				}
			}
			
			for(int i=0; i<wordCount; i++){
				if(i== wordCount-1){
					newWord.append(words.get(i) + "\n");
				} else {
					newWord.append(words.get(i) + " ");
				}
			}
			
			words.subList(0,wordCount).clear();
			if(words.isEmpty()){
				break;
			}
			totalChars = 0;
			wordCount = 0;
			wordLength = 0;
			System.out.println(newWord.toString());
		}
		System.out.println(newWord.toString());
		return newWord.toString();
	}
	
}
