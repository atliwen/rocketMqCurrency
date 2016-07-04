package com.zjs.edi.manage.mq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* <p>Title: PageController </p>
* <p>@Description: 通用页面跳转 控制器   </p>
* <p>Company: test  </p>
* @author 李文
* @date   2016年5月3日 下午2:01:31 
*/
@RequestMapping("page")
@Controller
public class PageController
{

	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName") String pageName)
	{
		return pageName;
	}

}
