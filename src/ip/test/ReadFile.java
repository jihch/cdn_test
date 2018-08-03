package ip.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		List<String> ipList = new ArrayList<String>();
		try {
			// read file content from file
			FileReader reader = new FileReader("F:/2018/201808/20180803/ip_list.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = null;

			while ((str = br.readLine()) != null) {
				ipList.add(str);
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> getIpList() {
		List<String> ipList = new ArrayList<String>();
		try {
			// read file content from file
			FileReader reader = new FileReader("F:/2018/201808/20180803/ip_list.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = null;

			while ((str = br.readLine()) != null) {
				ipList.add(str);
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ipList;
	}

}
