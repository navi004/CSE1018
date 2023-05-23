import java.io.*;

class ListFiles {
	public static void main(String[] args) {
	//Mention the folder for which you have planned to see its contents
		File file = new File("/home/student/22mia1049/Java1049");
		//list() gives all your files as a string array
		String[] mylist = file.list();
		
		//Printing them one by one
		for(int i=0;i<mylist.length;i++) {
		System.out.println(mylist[i]);
		}
		
	}
}
