package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestDBController {
	@RequestMapping("ExecuteQuery.do")
	public ModelAndView processRequest(@RequestParam("String") String request){
		String out = request;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultsPage.jsp");
		mv.addObject("passedObj", out);
		return mv;
	}
}
