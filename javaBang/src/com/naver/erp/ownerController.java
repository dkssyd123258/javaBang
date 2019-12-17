package com.naver.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ownerController {
	
	@RequestMapping( value="/ownerHomeForm.do" )
	public ModelAndView goOwnerHomeForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ownerHomeForm.jsp");
		return mav;
	}
	
	@RequestMapping( value="/checkRoomForm.do" )
	public ModelAndView goCheckRoomForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("checkRoomForm.jsp");
		return mav;
	}
		
	@RequestMapping( value="/emptyListForm.do" )
	public ModelAndView goemptyListForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("emptyListForm.jsp");
		return mav;
	}
	
	@RequestMapping( value="/emptyUpDelForm.do" )
	public ModelAndView goemptyUpDelForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("emptyUpDelForm.jsp");
		return mav;
	}


	
}
