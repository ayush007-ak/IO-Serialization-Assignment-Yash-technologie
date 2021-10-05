import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreatingZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (InputStream is=new FileInputStream("D:\\file System\\student.txt");
				OutputStream os=new FileOutputStream("D:\\file System\\sample.zip");
				ZipOutputStream zos=new ZipOutputStream(os);
				){
			
			ZipEntry zipEntry = new ZipEntry("student.txt");
			zos.putNextEntry(zipEntry);
			byte[] buffer = new byte[1024];
			int k;
			while((k=is.read(buffer))>0) {
				zos.write(buffer,0,k);
			}
			zos.closeEntry();
			
			
		
		}catch(IOException e) {
			System.out.println("--Error--");	
		}

	}

}
