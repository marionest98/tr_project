package day0223.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx3 {
	public static void main(String args[]) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://docs.oracle.com/en/java/javase/11/docs/api/index.html";
		String line = "";

		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}