/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * xinqing@yiji.com 2017年3月1日 下午5:58:20 创建
 */
    
package com.xinqing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@Controller
@RequestMapping(value = "/webtest/")
public class PropertiesController {
	
	 @Value("${test.msg}")
	 private String msg;

	@RequestMapping("test")
	public String tradePay(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.print(msg);
		return null;
	}
	
}

    