package com.chaos.app.person.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class CalculateController {
	// 为了解决ajax返回结果中中文乱码问题，使用第二种的方式。
	// 但是第二种方法直接返回string会导致alert不弹出。所以，目前的解决方案是第二种+返回responseEntity
	// calculate可加/，也可以不加/
	// 真正导致不能弹出的是produces = "application/json"，目前使用text/html可以解决返回String时不弹窗的问题

	// @RequestMapping("/calculate")
	@RequestMapping(value = "calculate",produces = "text/html; charset=utf-8")
	@ResponseBody
	public Object login1(HttpServletRequest request, HttpServletResponse response) {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		System.out.println(num1);
		System.out.println(num2);

		// 下面三行搭配RequestMapping中加入application/json; charset=utf-8，可以解决乱码弹出问题
//		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.setContentType(new MediaType("text", "html", Charset.forName("UTF-8")));
//		return new ResponseEntity<String>("和为：" + (num1 + num2), responseHeaders, HttpStatus.OK);
		return "和为：" + (num1 + num2);
	}
}
