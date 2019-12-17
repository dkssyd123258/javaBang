package com.naver.erp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaBangBuyController {
	
	@Autowired
	private RoomListService roomListService;
	@RequestMapping(value="/mapSerach.do")
	public ModelAndView mapSerach()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("mapSerach.jsp");
		return mav;
	};
	@RequestMapping(value="/roomConForm.do")
	public ModelAndView roomConForm(@RequestParam(value="sr_no") int sr_no)
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("roomConForm.jsp");
		try
		{
			System.out.println(sr_no);
			RoomListDTO roomList=this.roomListService.getRoomListDTO(sr_no);
			mav.addObject("roomList",roomList);
		}
		catch(Exception e)
		{System.out.print("roomConForm에러발생");}
		return mav;
	};
	@RequestMapping(value="/roomListForm.do")
	public ModelAndView roomListForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("roomListForm.jsp");
		return mav;
	};
	@RequestMapping(value="/roomSimForm.do")
	public ModelAndView roomSimForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("roomSimForm.jsp");
		return mav;
	};
}
