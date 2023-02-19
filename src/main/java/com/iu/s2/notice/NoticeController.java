package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//공지리스트 조회
	@RequestMapping(value = "list")
	public ModelAndView getNoticeList() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<NoticeDTO> ar = noticeService.getNoticeList();
		mv.setViewName("notice/list");
		mv.addObject("list", ar);
		return mv;
	}
	
	//공지상세 조회
	
	@RequestMapping(value = "detail")
	public ModelAndView getNoticeDetail(NoticeDTO noticeDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		mv.setViewName("notice/detail");
		mv.addObject("dto", noticeDTO);
		return mv;
	}

}
