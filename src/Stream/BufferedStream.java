package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			bis = new BufferedInputStream(fis = new FileInputStream("resources/test.txt"));
			bos = new BufferedOutputStream(fos = new FileOutputStream("resources/test2.txt"));

			while (true) {
				int data = bis.read();
				if (data == -1)
					break;
				bos.write(data);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
