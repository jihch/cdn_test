package ip.test;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> ipList = ReadFile.getIpList();  
		
		for (int i = 0; i < ipList.size(); i++) {
			String ip = ipList.get(i);
			System.out.println(ip);
			String url = "http://" + ip + "/star/50189.bmp";
			String filepath = "F:/2018/201808/20180803/img_CDN_test/" + ip + "/50189.bmp";
			ImageDownload.download(url, filepath);
			System.out.println((i+1) + " of " + ipList.size() + " end");
		}
		
	}
	
}
