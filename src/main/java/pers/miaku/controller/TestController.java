package pers.miaku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用控制器
 * 
 * @RestController = @Controller + @ResponseBody
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/hello")
	public String test() {
		// TODO 封装一下返回数据
		return "hello springboot!";
	}

}
