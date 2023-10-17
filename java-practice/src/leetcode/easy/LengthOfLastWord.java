package leetcode.easy;

public class LengthOfLastWord {

    public int getLengthOfLastWord(String s) {
            
        int stringLength = s.length();
        int lastWordLength = 0;
    
            //loop over String backwards until you hit a non-space
            //add +1 to lastWordLength counter
            //keep looping until you hit (another) space, +1 to ^ w/ each before
            //break and return int lastWordLength
    
        for (int i = stringLength - 1; i >= 0; i--) {
            if (s.charAt(i)!=' ') {
                lastWordLength++;
            } else if (lastWordLength > 0) {
                return lastWordLength;
            }
        }
        return lastWordLength;
    }
}

