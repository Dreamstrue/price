package com.price;

import com.jfinal.core.Controller;

public class LoginController extends Controller{

	public void index(){
//		render("/view/login.jsp");
		render("/index.html");
	}
	
	public void main(){
		render("/view/main.jsp");
	}
}
