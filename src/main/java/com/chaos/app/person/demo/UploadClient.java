package com.chaos.app.person.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class UploadClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("客户端运行...");
		try (Socket socket = new Socket("127.0.0.1", 8080);
				BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
				FileInputStream inFile = new FileInputStream("D:\\Gits\\webresources\\images\\b.jpg");
				BufferedInputStream in = new BufferedInputStream(inFile)) {

			byte[] buffer = new byte[1024];

			int len = in.read(buffer);
			while (len != -1) {
				out.write(buffer, 0, len);
				len = in.read(buffer);
			}
			System.out.println("上传成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
