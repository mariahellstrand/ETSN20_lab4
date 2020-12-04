import java.util.Scanner;
import java.io.File;

public class StringSearch {

    /** searching if a line in input file contains input string
     *  catches FileNotFound exception
     */
    public void search(String s, String filename){
        File file = new File(filename);
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                String temp = scan.nextLine();
                if (temp.contains(s)){
                    System.out.println(temp);
                }
            }
            scan.close();
        } catch (Exception FileNotFound) {
           System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        StringSearch ss = new StringSearch();
        ss.search(args[0], args[1]);
    }

}