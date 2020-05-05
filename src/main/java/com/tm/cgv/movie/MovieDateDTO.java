package com.tm.cgv.movie;

import java.sql.Date;

public class MovieDateDTO {
	private long mNum;
	private String theater;
	private Date r_Date;
	
	
	public long getmNum() {
		return mNum;
	}
	public void setmNum(long mNum) {
		this.mNum = mNum;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public Date getR_Date() {
		return r_Date;
	}
	public void setR_Date(Date r_Date) {
		this.r_Date = r_Date;
	}
	
	
	
}
