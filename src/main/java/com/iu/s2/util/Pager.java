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
	
	//페이지의 시작번호
	private Long startNum;
	//페이지의 끝번호
	private Long lastNum;
	
	//전체 Page 갯수
	private Long totalPage;
	//한 블럭당 출력할 번호의 갯수
	private Long perBlock;
	
	private boolean before;
	private boolean after;
	
	
	//startRow,lastRow 계산하는 메서드
	public void makeRow() {
		this.startRow = (this.getPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	

	//startNum, lastNum 계산하는 메서드
	public void makeNum(Long totalCount) {
		this.totalPage=totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		if(this.getPage()>totalPage) {
			this.setPage(totalPage);
		}
		Long totalBlock = totalPage/this.getPerBlock();
		if(totalPage % getPerBlock() !=0) {
			totalBlock++;
		}
		Long curBlock = this.getPage()/this.getPerBlock();
		if(this.getPage() % this.getPerBlock()!=0) {
			curBlock++;
		}
		this.startNum = (curBlock-1)*this.getPerBlock()+1;
		this.lastNum = curBlock*this.getPerBlock();
		
		if(curBlock==totalBlock) {
			lastNum=totalPage;
			this.after = true;
		}
		
		if(curBlock==1) {
			this.before=true;
		}
		
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
	
	public Long getStartNum() {
		return startNum;
	}
	
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	
	public Long getLastNum() {
		return lastNum;
	}
	
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	
	public Long getPerBlock() {
		if(this.perBlock==null || this.perBlock<1) {
			this.perBlock=5L;
		}
		return perBlock;
	}
	
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	
	public Long getTotalPage() {
		return totalPage;
	}
	
	public boolean isBefore() {
		return before;
	}
	
	public void setBefore(boolean before) {
		this.before = before;
	}
	
	public boolean isAfter() {
		return after;
	}
	
	public void setAfter(boolean after) {
		this.after = after;
	}

}
