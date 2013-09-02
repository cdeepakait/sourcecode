package tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tutorial.service.TestService;

/**
 * Controller class
 * 
 * @author deepak
 * 
 */
@Controller
public class HomeController {
	@Autowired
	private TestService ts;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String msg() {
		System.out.println("Inside controller message");
		ts.printMessage();
		return "hello";
	}
}
