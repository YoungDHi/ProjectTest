package com.iu.s2.notice;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTestCase;

public class NoticeDAOTest extends MyTestCase {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getNoticeAddTest() throws Exception {
		
		for(int i=0;i<30;i++) {
			Random r = new Random();
			long d = r.nextLong();
			int num = (int)(d*1000);
			d= num/10;
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNoticeNum(noticeDAO.getNoticeNum());
			noticeDTO.setNoticeName("공지"+i);
			noticeDTO.setNoticeDetail("리스트확인입니다");
			noticeDTO.setWriter("고영표");
			noticeDTO.setWriteDate((Date) Calendar.getInstance().getTime());
			noticeDTO.setHits(d);
			int result = noticeDAO.setNoticeAdd(noticeDTO);
			
			
		}
	}

}
