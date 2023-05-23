import java.io.*;

class RenameFile {
	public static void main(String[] args) {
	//Mention the file's name which you want to rename
		File file = new File("/home/student/22mia1049/Java1049/test.txt");
        if(!file.exists()) {
		    try{
                file.createNewFile();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
         }
	
		//Mention the file's new name here
		File newname = new File("/home/student/22mia1049/Java1049/naveen.txt");
		if(file.renameTo(newname)) {
			System.out.println("File Successfully renamed");
		}
	}
}
