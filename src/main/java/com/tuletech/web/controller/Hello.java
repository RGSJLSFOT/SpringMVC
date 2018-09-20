package com.tuletech.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

	/**
	 * @函数功能：测试1[正常访问]
	 * @备注：用http://xxxxx/hello.do访问，输出"hello.do被执行"
	 * @创建人：任齐
	 * @return void    
	 * @throws
	 */
	@RequestMapping(value="hello.do")
    public void hello(){
        System.out.println("hello.do被执行"); 
    }
	
	/**
	 * @函数功能：测试2[跳转界面]
	 * @备注：用http://xxxxx/index.do访问，输出"index被访问"，并返回/WEB-INF/views/index.jsp
	 * @创建人：任齐
	 * @return void    
	 * @throws
	 */
	@RequestMapping(value="/index")  
    public String index(){
		System.out.println("index被访问");
		return "index";
    }
	
	/**
	 * @函数功能：测试3[获取参数]
	 * @备注：用http://xxxxx/get/admin访问，输出"username:admin"，并返回/WEB-INF/views/index.jsp
	 * @创建人：任齐
	 * @return void    
	 * @throws
	 */
	@RequestMapping(value="/get/{username}")  
    public String get(@PathVariable String username){
		System.out.println("username:" + username);
		return "index";
    }
	
	/**
	 * @函数功能：测试传参
	 * @备注：http://xxxxx/order/add.do?id=12&date1=2013-10-12
	 * @参数： @param request
	 * @参数： @param id
	 * @参数： @param date
	 * @创建人：任齐
	 * @return void    
	 */
	@RequestMapping(value = "/order/add", method = RequestMethod.GET)
	public void juint(
			HttpServletRequest request,
			@RequestParam int id,
			@RequestParam("date1") String date){
		System.out.println("id:" + id);
		System.out.println("date:" + date);
		request.setAttribute("msg", "id="+id+",date="+date);
	}
}
