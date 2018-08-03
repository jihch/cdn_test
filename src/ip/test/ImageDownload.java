package ip.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ImageDownload {

	public static void main(String[] args) {
		String url = "http://58.216.9.163/star/50189.bmp";
		String filepath = "F:/2018/201808/20180803/img_CDN_test/58.216.9.163/50189.bmp";
		ImageDownload.download(url, filepath);
	}

	public static String download(String url, String filepath) {
		HttpGet httpget = new HttpGet(url);
		httpget.setHeader("Host", "iguagua.net");
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpResponse response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			File file = new File(filepath);
			file.getParentFile().mkdirs();
			FileOutputStream fileout = new FileOutputStream(file);
			/**
			 * 根据实际运行效果 设置缓冲区大小
			 */
			byte[] buffer = new byte[1024];
			int ch = 0;
			while ((ch = is.read(buffer)) != -1) {
				fileout.write(buffer, 0, ch);
			}
			is.close();
			fileout.flush();
			fileout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
