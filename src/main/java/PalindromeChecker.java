import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}public String onlyLetters(String sString){
        String n = new String();
        for(int i=0; i<sString.length(); i++){
            String s = sString.substring(i,i+1);
            int c = (int)sString.charAt(i);
            if((65<=c && c<=90)||(97<=c && c<=122)){
                n+=s;
            }
        }
        return n;
    }
    public boolean palindrome(String sWord){
    sWord = onlyLetters(sWord.toLowerCase());
    return sWord.equals(reverse(sWord));
    }
    public String reverse(String sWord){
        String n = new String();
        for(int i = sWord.length(); i>0; i--){
            n+=sWord.substring(i-1, i);
        }
        return n;
    }
}
