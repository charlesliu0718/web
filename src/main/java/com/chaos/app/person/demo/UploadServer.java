package com.chaos.app.person.demo;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("服务器端运行...");

		try (ServerSocket server = new ServerSocket(8080);
				Socket socket = server.accept();
				BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
				FileOutputStream out = new FileOutputStream("D:\\Gits\\webresources\\images\\up7.jpg")) {
			
			byte[] buffer = new byte[1024];
			int len = in.read(buffer);
			while (len != -1) {
				out.write(buffer, 0, len);
				len = in.read(buffer);
			}
			System.out.println("接收完成！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		//要么上面try(){}catch(){}的try-with-catch写法，要么是下面这种在finally关闭socket和fileio，否则会报connection reset错，传输的图片底部没了
//		//java7以前的写法
//		System.out.println("服务器端运行...");
//
//		ServerSocket server = null;
//		Socket socket = null;
//		BufferedInputStream in = null;
//		FileOutputStream out = null;
//
//		try {
//			server = new ServerSocket(8080);
//			socket = server.accept();
//
//			in = new BufferedInputStream(socket.getInputStream());
//
//			out = new FileOutputStream("D:\\Gits\\webresources\\images\\up3.jpg");
//
//			byte[] buffer = new byte[1024];
//			int len = in.read(buffer);
//			while (len != -1) {
//				out.write(buffer, 0, len);
//				len = in.read(buffer);
//			}
//			System.out.println("接收完成！");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			out.close();
//			in.close();
//			socket.close();
//			server.close();
//		}
	}
}
