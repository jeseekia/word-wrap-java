import java.util.ArrayList;
import java.util.Arrays;

public class Wrapper {
	
	//This method wraps text based on the 
	public static String wrap(String text, int columnNumber) {
		
		if(text.trim().length()<1 || columnNumber<1 || text.length()<columnNumber) { //Consider strings that should just be returned back or a column size too small
			return text;
		}

		
		String[] tempArray = text.split("\\s+"); //Convert text to an array of strings splitting by any amount of whitespace
		
		//Convert tempArray to a StringBuiler arraylist and fill with all values from the array
		ArrayList<StringBuilder> words = new ArrayList<StringBuilder>();
		for (int i=0; i<tempArray.length; i++) {
			words.add(new StringBuilder(tempArray[i]));
		}
		
		
		int totalChars = 0, wordCount = 0; //totalChars to keep track of character count and wordCount to keep track of the number of words
		int wordLength;
		StringBuilder newWord = new StringBuilder();
		
		//Keep processing words as long as the totalChars counted so far and possible number of spaces is less than the max columnNumber
		while(totalChars + wordCount < columnNumber){
			wordLength = 0;
			
			//Iterate through words and keep count of the totalChars and wordCount until the columnNumber is reached
			for(int i=0; i<words.size(); i++){
				wordLength = words.get(i).length();
				
				if(totalChars + wordCount + wordLength <= columnNumber){
					totalChars += wordLength;
					wordCount++;
				} else if(wordLength > columnNumber && totalChars==0){ //handle words that are too long for the line
						totalChars += wordLength;
						wordCount++;
						break;
				} else {
					break;
				}
			}
			
			//Use wordCount determined to decide which words to append to newWord and whether to follow with a space or a line break
			for(int i=0; i<wordCount; i++){
				if(i== wordCount-1){
					newWord.append(words.get(i) + "\n");
				} else {
					newWord.append(words.get(i) + " ");
				}
			}
			
			//Remove the current words already appended to the string from words
			words.subList(0,wordCount).clear();
			
			//Stop processing the words once the list is empty
			if(words.isEmpty()){
				break;
			}
			
			//Clear counters
			totalChars = 0;
			wordCount = 0;
			wordLength = 0;
			//System.out.println(newWord.toString());
		}
		
		//System.out.println(newWord.toString());
		return newWord.toString();
	}
	
}
