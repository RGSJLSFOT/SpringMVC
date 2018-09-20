package com.tuletech.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax.do")
public class Ajax {

	/**
	 * @throws UnsupportedEncodingException 
	 * @函数功能：执行get请求
	 * @备注：http://192.168.1.71:8080/SpringMVC/ajax.do?method=search&username=张三
	 * @创建人：任齐
	 * @return void    
	 */
	@RequestMapping(params = "method=search", method = RequestMethod.GET)
	public void search(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		String name = request.getParameter("username");
		
		System.out.println("执行get,username=" + new String(name.getBytes("iso8859-1"),"utf-8"));
	}
	
	/**
	 * @函数功能：执行post请求
	 * @备注：
	 * @创建人：任齐
	 * @return void    
	 */
	@RequestMapping(params = "method=update", method = RequestMethod.POST)
	public void update(){
		System.out.println("执行post");
	}
	
	/**
	 * @函数功能：返回JSON数据
	 * @备注：http://xxxx/ajax.do?method=json
	 * @参数： 
	 * @创建人：任齐
	 * @return void    
	 * @throws
	 */
	//@RequestMapping(params = "method=json")  
	@RequestMapping(value = "json")
	@ResponseBody
	public Object json(){
		List<String> list=new ArrayList<String>();  
	    list.add("电视");  
	    list.add("洗衣机");  
	    list.add("冰箱");  
	    list.add("电脑");  
	    list.add("汽车");  
	    list.add("空调");  
	    list.add("自行车");  
	    list.add("饮水机");  
	    list.add("热水器");  
	    return list;  
	}
}
