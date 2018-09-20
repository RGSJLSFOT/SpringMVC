package com.tuletech.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test.do")
public class Test {
	
	/**
	 * @函数功能：处理多个请求
	 * @备注：http://xxxx/test.do?method=get，执行后输出“执行get”
	 * @创建人：任齐
	 * @return void
	 * @throws
	 */
	@RequestMapping(params = "method=get")
	public void get(){
		System.out.println("执行get");
	}
	
	@RequestMapping(params = "method=set")
	public void set(){
		System.out.println("执行set");
	}
	
}
