package com.iu.s2.notice;

public class NoticeImgDTO {
	private Long fileNum;
	private Long noticeNum;
	private String fileName;
	private String oriName;
	
	public Long getFileNum() {
		return fileNum;
	}
	public void setFileNum(Long fileNum) {
		this.fileNum = fileNum;
	}
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String foleName) {
		this.fileName = foleName;
	}
	public String getOriName() {
		return oriName;
	}
	public void setOriName(String oriName) {
		this.oriName = oriName;
	}

}
