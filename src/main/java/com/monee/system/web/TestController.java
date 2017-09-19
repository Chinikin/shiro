package com.monee.system.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monee.system.service.TestService;

/**
 * 测试Controller
 * @author monee
 * 2015-09-29 17:00:04
 *
 */
@Controller
@RequestMapping(value="test")
public class TestController {

	@Autowired
	private TestService testService;
	/**
	 * 测试页面
	 * @param param
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value={"","index"})
	public String testIndex(String param,Model model) throws Exception{
		List<String> names = testService.findNames();
		testService.findInfo();
		
		
		model.addAttribute("names", names);
		return "testIndex";
	}
}
