package temp;

import java.io.*;

public class Example9_5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader input = new BufferedReader(fr);
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter output = new BufferedWriter(fw);
            String s = null;
            int i = 0;
            while ((s = input.readLine()) != null) {
                i++;
                output.write(i + ":" + s);
                output.newLine();
            }
            output.flush();
            output.close();
            input.close();
            fw.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
