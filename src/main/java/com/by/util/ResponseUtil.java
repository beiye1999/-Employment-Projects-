package com.by.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {

	
	/**
	 * 响应js提示 提示后后退地址
	 * @param response
	 * @param content
	 */
	public  static  void  alertBack(HttpServletResponse response ,String content){
		 try {
			response.setCharacterEncoding("GBK");
			 response.getWriter().print("<script>alert('"+content+"');history.go(-1);</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 响应js提示 提示后跳转至指定地址
	 * @param response
	 * @param content
	 * @param url
	 */
	public static void   alertRedirect(HttpServletResponse response ,String content,String url){
		try {
			response.setCharacterEncoding("GBK");
			response.getWriter().print("<script>alert('"+content+"');window.location='"+url+"';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
