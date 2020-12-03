import java.util.Scanner;
import java.io.File;

public class StringSearch {
    private String s;
    private String filename;

    public StringSearch(String s, String filename){
        this.s = s;
        this.filename = filename;
    }

    /** searching if a line in input file contains input string
     *  catches FileNotFound exception
     */
    public void search(){
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
        StringSearch ss = new StringSearch(args[0], args[1]);
        ss.search();
    }

}