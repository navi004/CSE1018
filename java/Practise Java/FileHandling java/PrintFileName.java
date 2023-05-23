import java.io.*;

class PrintFileName {
	public static void main(String[] args) {
		File file = new File("/home/student/22mia1049/Java1049/naveen.txt");
		System.out.println(file.getName());
		//returns the name of the file which is stored in the file object(the path which we had mentioned above)
	}
}
