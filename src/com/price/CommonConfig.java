package com.price;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

public class CommonConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		
	}

	@Override
	public void configRoute(Routes r) {
		r.add("/",CommonController.class);
		r.add("/test",TestController.class);
		r.add("/login",LoginController.class);
	}

}
