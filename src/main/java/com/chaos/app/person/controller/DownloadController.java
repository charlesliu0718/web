package com.chaos.app.person.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 2019-02-15 liuchao
 * 前端在94服务器上，ajax跨域调用的是本地localhost的接口。该接口内又写死下载了94服务器上的资源（apache上）到本地D盘
 * 所以，这个controller只能在本地启tomcat的时候，本地调用
 * 若想服务器使用，必须要改46行的文件输出路径，改成服务器的某个路径
 */
@Controller
@CrossOrigin
public class DownloadController {
	private static String urlBase = "http://111.231.138.94/app/resources/image/";

	@RequestMapping(value = "download", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	@ResponseBody
	public Object download(HttpServletRequest request, HttpServletResponse response) {
		String itemName = request.getParameter("itemName");
//		String url = request.getRequestURL().toString() + "/" + request.getParameter("itemName");
		// 去下载94服务器上的资源
		String url2 = urlBase + request.getParameter("itemName");
		HttpURLConnection conn = null;
		try {
			URL reqURL = new URL(url2);
			// 打开连接。此处方法返回的是URLConnection对象，我们要用http的，转之
			conn = (HttpURLConnection) reqURL.openConnection();
			
			try (InputStream in = conn.getInputStream();
					BufferedInputStream bin = new BufferedInputStream(in);
					OutputStream os = new FileOutputStream("D:\\Gits\\webresources\\images\\download\\" + itemName);
					BufferedOutputStream out = new BufferedOutputStream(os)) {
				byte[] buffer = new byte[1024];
				int bytesRead = bin.read(buffer);
				while (bytesRead != -1) {
					out.write(buffer, 0, bytesRead);
					bytesRead = bin.read(buffer);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("下载完成！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}

		return "下载成功！";
	}
}
