import java.io.*;

class Demo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\nvkaj\\OneDrive\\Pictures\\Temp\\temp1.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File Created");
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Naveen");
            bw.newLine();
            bw.write("22MIA1049");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            int wordCount = 0;
            int characterCount = 0;
            int sentenceCount = 0;

            while (line != null) {
                String[] sentence = line.split("[.]");
                String[] word = line.split(" ");
                characterCount += line.length();
                sentenceCount += sentence.length;
                wordCount += word.length;
                line = br.readLine();
            }
            System.out.println("Number of sentences: " + sentenceCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + characterCount);
            
            br.close();
            fr.close();
            
            if (file.delete()) {
                System.out.println("File successfully deleted");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
