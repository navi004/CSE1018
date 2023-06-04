import java.io.*;

class Demoo {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\nvkaj\\OneDrive\\Pictures\\Temp\\temp1");
        try {
            String[] mylist = file1.list();
            for (int i = 0; i < mylist.length; i++) {
                System.out.println(mylist[i]);
            }

            System.out.println("Files in the directory:");
            File[] fileslist = file1.listFiles();
            for (File f : fileslist) {
                if (f.isFile()) {
                    System.out.println(f);
                }
            }
            File file = new File("C:\\Users\\nvkaj\\OneDrive\\Pictures\\Temp\\temp1\\program.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Naveen.");
            bw.newLine();
            bw.write("My regdno is 22MIA1049.");
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            int linecount = 0;
            int sentencecount = 0;
            int wordcount = 0;
            int chcount = 0;
            while (line != null) {
                linecount++;
                System.out.println(line);

                String[] sentence = line.split("[.]");
                String[] words = line.split(" ");
                sentencecount += sentence.length;
                wordcount += words.length;
                chcount += line.length();
                line = br.readLine();
            }
            System.out.println("Number of lines: " + linecount);
            System.out.println("Number of sentences: " + sentencecount);
            System.out.println("Number of words: " + wordcount);
            System.out.println("Number of characters: " + chcount);
            br.close();

            FileReader fr2 = new FileReader(file);
            BufferedReader br2 = new BufferedReader(fr2);

            int output = br2.read();
 
