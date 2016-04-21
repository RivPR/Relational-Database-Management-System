package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.RowDBDao;

@Controller
public class RequestDBController {
	@Autowired
	private RowDBDao rowDao;
	
	@RequestMapping("ExecuteQuery.do")
	public ModelAndView processRequest(@RequestParam("String") String request) throws ClassNotFoundException, SQLException{

		ModelAndView mv = new ModelAndView();
		ArrayList<ArrayList<String>> table = new ArrayList<>();
		ArrayList<String> tableHeader = new ArrayList<>();
		
		table =rowDao.executeQuery(request);
		tableHeader = table.get(0);
		System.out.println(table.get(0));
		table.remove(0);
		mv.setViewName("resultsPage.jsp");
		mv.addObject("fields", request);
		mv.addObject("TABLE", table);
		mv.addObject("tableHeader", tableHeader);
		return mv;
	}
}
