import java.io.*;

import javax.sound.sampled.SourceDataLine;

class Demo  {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\nvkaj\\OneDrive\\Pictures\\Temp\\temp\\temp.txt");
        try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                int wordcount = 0;

                while(line!= null) {
                    String[] word = line.split(" ");

                    wordcount = wordcount + word.length;
                    System.out.println(line);
                    line = br.readLine();
                }
                System.out.println("No of words "+ wordcount);
            }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
