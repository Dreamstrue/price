package com.price;

import com.jfinal.core.Controller;

public class CommonController extends Controller{

	public void index(){
		render("/index.jsp");
	}
}
