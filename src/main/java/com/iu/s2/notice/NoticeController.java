package com.iu.s2.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager;

@Controller
@RequestMapping(value = "/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//공지리스트 조회
	@RequestMapping(value = "list")
	public ModelAndView getNoticeList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		List<NoticeDTO> ar = noticeService.getNoticeList(pager);
		mv.setViewName("notice/list");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
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
	
	//공지 작성
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setNoticeAdd() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/add");
		return mv;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setNoticeAdd(NoticeDTO noticeDTO, MultipartFile pic) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeAdd(noticeDTO,pic);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO,ModelAndView mv) throws Exception {
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		mv.setViewName("notice/update");
		mv.addObject("dto", noticeDTO);
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeUpdate(noticeDTO);
		String view = "redirect:./detail?noticeNum="+noticeDTO.getNoticeNum();
		mv.setViewName(view);
		return mv;
	}
	
	@RequestMapping(value = "delete")
	public ModelAndView setNoticekDelete(NoticeDTO noticeDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeDelete(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}

}
