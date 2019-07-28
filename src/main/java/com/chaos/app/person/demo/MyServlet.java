package com.chaos.app.person.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	/**
   * 
   */
  private static final long serialVersionUID = -2398212252208171044L;

  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get获取");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		// 当前时间
		Calendar cal = Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		String dayPart = "";

		if (23 <= hour) {
			dayPart = "夜深了，该睡觉了~";
		} else if (0 <= hour && hour < 5) {
			dayPart = "凌晨了，还不睡觉在干嘛！";
		} else if (5 <= hour && hour < 9) {
			dayPart = "清晨，新的一天开始啦~";
		} else if (9 <= hour && hour < 11) {
			dayPart = "上午，元气满满的一天~";
		} else if (11 <= hour && hour < 14) {
			dayPart = "中午，午休时分，别吃了~";
		} else if (14 <= hour && hour < 17) {
			dayPart = "下午，加油干活~";
		} else if (17 <= hour && hour < 19) {
			dayPart = "傍晚，别吃了~";
		} else if (19 <= hour && hour < 23) {
			dayPart = "晚上，欢乐时光，别忘了学习、健身~";
		}

		out.print("<h1>超超呀，现在是北京时间：" + cal.getTime() + "，" + dayPart + "</h1><img src=\"/images/c.jpg\">");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post发送");
	}

}
