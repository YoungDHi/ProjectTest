package com.iu.s2.util;

public class Pager {
	//Table에서 조회할 시작 번호
	private Long startRow;
	//Table에서 조회할 끝번호
	private Long lastRow;
	
	//Client가 보고싶은 페이지 번호(parameter)
	private Long page;
	//한페이지에 출력할 Row의 갯수
	private Long perPage;
	
	
	
	//startRow,lastRow 계산하는 메서드
	public void makeRow() {
		this.startRow = (this.getPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getPage() {
		if(this.page==null || this.page<1) {
			this.page = 1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPerPage() {
		if(this.perPage==null || this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	
	

}
