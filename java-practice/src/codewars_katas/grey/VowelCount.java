package codewars_katas.grey;

public class VowelCount {

    public static int getCount(String str) {

//     int vowelsCount = 0;
//     for(int i = 0; i < str.length(); i++){
//       char c = str.charAt(i);
//       if(c == 'a' ||  c == 'e' || c =='i' || c == 'o' || c == 'u')
//         vowelsCount++;
//     }
//     return vowelsCount;

        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
