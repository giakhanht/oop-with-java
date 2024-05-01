package filehandlingdemo;
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        /*
        String line;
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("src/main/java/filehandlingdemo/myfile.txt"));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        */
        //Optimize using try-with-resources statement, Java automatically close the reader object.
        String line;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/filehandlingdemo/myfile.txt"))) {
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //change the parameter of FileWriter object constructor to "myfile2.txt", true and it would append data instead of overwriting all available data.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myfile2.txt"))) {
            writer.write("Yo Pierre you wanna cuff my hands?");
            writer.newLine();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}