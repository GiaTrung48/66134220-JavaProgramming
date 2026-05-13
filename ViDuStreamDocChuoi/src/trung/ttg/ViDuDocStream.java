package trung.ttg;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io. InputStreamReader;

public class ViDuDocStream {

		public static void main(String[] args) throws IOException {

		FileInputStream fInput = new FileInputStream("baihat.txt");

		// Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		// Khai báo biến đối tượng Buffee
		BufferedReader bufReader = new BufferedReader(ipReader);

		// ĐỌc 1 dòng dữ liệu từ file, cất vào biến chuỗi
		String line1 = bufReader.readLine();
		// In ra dòng đọc được
		System.out.println(line1);
		String line2 = bufReader.readLine();
		// In ra dòng đọc được
		System.out.println(line2);
		String line3 = bufReader.readLine();
		// In ra dòng đọc được
		System.out.println(line3);
	}
}