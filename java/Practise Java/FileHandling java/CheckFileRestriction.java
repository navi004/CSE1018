//Each file /resource in the computer/device has its access control privilages (for better control)


import java.io.*;

class CheckFileRestriction {
	public static void main(String[] args) {
	File file = new File("/home/student/22mia1049/Java1049/naveen.txt");
	
	//Checking if the file can read or not
	System.out.println(file.canRead());
	//Checking if the file can Write or not
	System.out.println(file.canWrite());
	//Checking if the file can Execute or not
	System.out.println(file.canExecute());
	}
}
