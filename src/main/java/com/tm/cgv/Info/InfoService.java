package com.tm.cgv.Info;

public interface InfoService {
	//회원가입
		public int infoJoin(InfoDTO infoDTO) throws Exception;
		
		//로그인
		public InfoDTO infoLogin(InfoDTO infoDTO) throws Exception;
}
