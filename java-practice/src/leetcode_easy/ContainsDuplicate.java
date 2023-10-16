package leetcode_easy;

public class ContainsDuplicate {
    
    public boolean ifContainsDuplicate(int[] nums) {
        
        //The "time limit exceeded" message usually occurs when you have very large inputs, and your solution is not efficient, from a time perspective. Your solution most probably passed some smaller tests, and failed when given a very large string as input. You can analyze the time complexity of your algorithm, to get a feel for how fast it is, using the big O notation. You have some nested loop logic here, and even though your solution is correct, they expect a faster method. I've heard, though, that sometimes, in production, sacrificing efficiency for the sake of readability, is the way to go, but this is a competitive programming website.
        //So it "works," but LeetCode won't accept the solution as they want you 
        //to actually use DS&A. Come back & redo

        //iterate through int array nums
        //for each, check if each int that comes after is same
        //if yes, return true; if no, continue
        //don't have to check backwards bc we already checked..
        //..starting w/ earlier int.
        //therefore, this won't be a fast or efficient solution
        //but should work, and might be able to be modified

        //had errors w/ not declaring i/n type, tried .length() w/ parens
        //also was returning true every time because had n=i not i+1

        for (int i = 0; i < nums.length - 1; i++) {

            for (int n = i + 1; n < nums.length; n++) {

                if (nums[i] == nums[n]) {
                    return true;
                }
            }
        }
        return false;
    }
}
