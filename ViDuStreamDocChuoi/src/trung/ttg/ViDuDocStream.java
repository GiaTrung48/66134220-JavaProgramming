package trung.ttg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io. InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {

		// Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(System.in);
		// Khai báo biến đối tượng Buffee
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		// In một câu hướng dẫn để User biết cần làm gì
		System.out.print("Nhập một chuỗi bất kỳ: ");
		// ĐỌc du liệu từ bàn phím, cất vào biến chuỗi
		String lineDocDuoc = bufReader.readLine();
		// In ra dòng đọc được
		System.out.print(lineDocDuoc);
	}
}