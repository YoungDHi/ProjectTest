package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//공지리스트 조회
	public List<NoticeDTO> getNoticeList() throws Exception {
		return noticeDAO.getNoticeList();
	}
	
	//공지 상세 조회
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.getNoticeDetail(noticeDTO);
	}
	
	//공지 작성
	public int setNoticeAdd(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setNoticeAdd(noticeDTO);
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
