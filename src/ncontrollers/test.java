package ncontrollers;

import java.sql.Connection;
import dao.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {
	
	@RequestMapping("testtest.htm")
	public ModelAndView testtest(){
		System.out.println("����");
		ModelAndView mo = new ModelAndView("home.test");
		System.out.println("��ü����");
		mo.addObject("aaa", "aaa");
		
		vo.test t = new vo.test();
		t = dao.test.getConnection();
		
		mo.addObject("result", t);
		return mo;
	}
}
