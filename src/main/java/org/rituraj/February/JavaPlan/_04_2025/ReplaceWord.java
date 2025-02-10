    package org.rituraj.February.JavaPlan._04_2025;

    import java.util.Scanner;

    public class ReplaceWord {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the string: ");
            String str = sc.nextLine();

            System.out.println("Enter the word to replace: ");
            String word = sc.nextLine();

            System.out.println("Enter the new word: ");
            String newWord = sc.nextLine();

            System.out.println(replaceWord(str, word, newWord));
        }

        public static String replaceWord(String str, String word, String newWord){
            if(!str.contains(word)){
                return "Word doesn't exists";
            }

            int startIndex = str.indexOf(word);
            int endIndex = startIndex + word.length() -1;

            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, startIndex));
            sb.append(newWord);
            sb.append(str.substring(endIndex+1));

            return sb.toString();
        }
    }
