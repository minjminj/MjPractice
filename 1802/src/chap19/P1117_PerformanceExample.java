/*
 * 넌다이렉트와 다이렉트 버퍼 성능 비교
 */
package chap19;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.util.EnumSet;

public class P1117_PerformanceExample {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("#,###");
	
		Path from = Paths.get("src/chap19/merry.jpg");
		Path to1 = Paths.get("src/chap19/merry1.jpg");
		Path to2 = Paths.get("src/chap19/merry2.jpg");
		
		long size = Files.size(from);
		
		// 파일 입출력을 위한 채널 열기
		FileChannel fileChannel_from = FileChannel.open(from);
		FileChannel filechannel_to1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		FileChannel fileChannel_to2 = FileChannel.open(to2, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		
		ByteBuffer nonDirectBuffer = ByteBuffer.allocate((int)size);
		ByteBuffer directBuffuer = ByteBuffer.allocateDirect((int)size);
		
		long start, end;
		
		start = System.nanoTime();
		for (int i=0 ; i<=100 ; i++) {
			fileChannel_from.read(nonDirectBuffer);
			nonDirectBuffer.flip();
			filechannel_to1.write(nonDirectBuffer);
			nonDirectBuffer.clear();
		}
		end = System.nanoTime();
		System.out.println("넌다이렉트:\t" + df.format(end-start) + "ns");
		
		fileChannel_from.position(0);
		
		start = System.nanoTime();
		for (int i=0 ; i<=100 ; i++) {
			fileChannel_from.read(directBuffuer);
			directBuffuer.flip();
			fileChannel_to2.write(directBuffuer);
			directBuffuer.clear();
		}
		end = System.nanoTime();
		System.out.println("다이렉트:\t" + df.format(end-start) + "ns");
		
		fileChannel_from.close();
		filechannel_to1.close();
		fileChannel_to2.close();
	}
}
