class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;
        
        while (leftPointer < rightPointer) {
            char leftCharacter = s.charAt(leftPointer);
            char rightCharacter = s.charAt(rightPointer);
            
            if (!Character.isLetterOrDigit(leftCharacter)) {
                leftPointer++;
            } else if (!Character.isLetterOrDigit(rightCharacter)) {
                rightPointer--;
            } else {
                if (Character.toLowerCase(leftCharacter) == Character.toLowerCase(rightCharacter)) {
                    leftPointer++;
                    rightPointer--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}