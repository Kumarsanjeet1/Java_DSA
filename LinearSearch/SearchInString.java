package LinearSearch;

//Question:- Search character in the String, if the character was exist in the String, then return true, else false!

public class SearchInString {
// Method for searching the character in the String!
    static Boolean searchChar(String str, char target){
//  If there was no any character in the string, then it will return false;
        if(str.length() == 0){
            return false;
        }
//   Here Searching the character from 0th index to less than the string of the length!
//    This loop will run till the element will not found!
        for(int index = 0; index < str.length(); index++){
//   If the target element found, then return True!
            if(target == str.charAt(index)){
                return true;
            }
        }
//   If the Target not exist the String, then return false!
        return false;
    }

    public static void main(String[] args) {
        String str = "Kumarsanjeet";
        char target = 'j';  // This element exist in the String, then it will return true!
        char element = 'z'; // This element not exist in the string, then it will return false!
        System.out.println( searchChar(str,target));
        System.out.println(searchChar(str,element));
    }

}
