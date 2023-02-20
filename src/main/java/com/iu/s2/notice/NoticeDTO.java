package com.iu.s2.notice;

import java.sql.Date;

public class NoticeDTO {
	
	private Long noticeNum;
	private String noticeName;
	private String noticeDetail;
	private String writer;
	private Date writeDate;
	private Long hits;
	private NoticeImgDTO noticeImgDTO;
	
	public NoticeImgDTO getNoticeImgDTO() {
		return noticeImgDTO;
	}
	public void setNoticeImgDTO(NoticeImgDTO noticeImgDTO) {
		this.noticeImgDTO = noticeImgDTO;
	}
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeDetail() {
		return noticeDetail;
	}
	public void setNoticeDetail(String noticeDetail) {
		this.noticeDetail = noticeDetail;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public Long getHits() {
		return hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
	}

}
