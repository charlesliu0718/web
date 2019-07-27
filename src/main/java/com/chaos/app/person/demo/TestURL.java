package com.chaos.app.person.demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) throws MalformedURLException {
		URL req;
		req = new URL("http://www.baidu.com");
		try (InputStream is = req.openStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr)) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append('\n');
				line = br.readLine();
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
