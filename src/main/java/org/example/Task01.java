package org.example;

public class Task01 {
    private String stringToReverse;

    // setter function
    public void setStringToReverse(String stringToReverse){
        this.stringToReverse = stringToReverse;
    }

    //logic function
    public void reserveString() {
        if (stringToReverse == null || stringToReverse.length() <= 1) {
            return;
        }

        char[] charArray = stringToReverse.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;


            left++;
            right--;
        }

        stringToReverse = new String(charArray);
       // System.out.println(stringToReverse);
    }

    public String getStringToReverse() {
        return stringToReverse;
    }
}
