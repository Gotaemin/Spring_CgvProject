package com.tm.cgv.util;

public class Pager {
	
	private long startRow;
	private long lastRow;
	
	private Integer curPage;
	private Long perPage;
	
	private long totalCount;
	private long totalPage;
	
	private long totalBlock;
	private long curBlock;
	
	private long startNum;
	private long lastNum;
	
	private String kind;
	private String search;
	
	public void makeRow() {
		this.startRow = (this.getCurPage()-1) * this.getPerPage() +1;
		this.lastRow = this.getCurPage() * this.getPerPage();
	}
	
	public void makePage(long totalCount) {
		this.totalCount = totalCount;
		this.totalPage = totalCount / this.perPage;
		if(totalCount % this.perPage != 0) {
			this.totalPage++;
		}
		
		long perBlock = 8L;
		
		this.totalBlock = this.totalPage / perBlock;
		if(this.totalPage % perBlock != 0) {
			this.totalBlock++;
		}
		
		this.curBlock = this.curPage / perBlock;
		if(this.curPage % perBlock != 0) {
			this.curBlock++;
		}
		
		this.startNum = (this.curBlock-1) * perBlock +1;
		this.lastNum = this.curBlock * perBlock;
		if(this.curBlock == this.totalBlock) {
			this.lastNum = this.totalPage;
		}
	}

	
	
	
	
	
	public long getLastRow() {
		return lastRow;
	}

	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}

	public Integer getCurPage() {
		if(this.curPage == null) {
			curPage = 1;
		}
		
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}

	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}

	public Long getPerPage() {
		if(this.perPage == null) {
			perPage = 10L;
		}
		
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public long getLastNum() {
		return lastNum;
	}

	public long getStartRow() {
		return startRow;
	}

	public long getTotalBlock() {
		return totalBlock;
	}

	public long getCurBlock() {
		return curBlock;
	}

	public long getStartNum() {
		return startNum;
	}

	public void setLastNum(long lastNum) {
		this.lastNum = lastNum;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if(this.search == null) {
			this.search = "";
		}
		
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	
	

	
	
	

}
