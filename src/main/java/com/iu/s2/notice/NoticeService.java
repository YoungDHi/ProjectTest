package com.iu.s2.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s2.util.FileManager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	
	
	//공지리스트 조회
	public List<NoticeDTO> getNoticeList() throws Exception {
		return noticeDAO.getNoticeList();
	}
	
	//공지 상세 조회
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.getNoticeDetail(noticeDTO);
	}
	
	//공지 작성
	public int setNoticeAdd(NoticeDTO noticeDTO, MultipartFile pic) throws Exception {
		int result = noticeDAO.setNoticeAdd(noticeDTO);
		if(pic.getSize()!=0) {
		String realPath = servletContext.getRealPath("rescources/upload/Notice");
		String filename = fileManager.fileSave(pic, realPath);
		
		NoticeImgDTO noticeImgDTO = new NoticeImgDTO();
		noticeImgDTO.setFileName(filename);
		noticeImgDTO.setOriName(pic.getOriginalFilename());
		noticeImgDTO.setNoticeNum(noticeDTO.getNoticeNum());
		
		result = noticeDAO.setNoticeImgAdd(noticeImgDTO);
		}
		return result;
	}
	
	//공지 수정
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}
	
	//공지 삭제
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setNoticeDelete(noticeDTO);
	}

}
