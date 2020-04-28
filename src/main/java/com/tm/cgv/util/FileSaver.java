package com.tm.cgv.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileSaver {
	
	public String saveUtils(MultipartFile file, String path) throws Exception {
		File f = new File(path);
		if(!f.exists()) {
			f.mkdirs();
		}
		
		String oriName = file.getOriginalFilename();
		System.out.println("oriName:"+oriName);
		
		String fileName = this.makeFileName(oriName);
		System.out.println("fileName: "+fileName);
		
		f = new File(f, fileName);
		FileCopyUtils.copy(file.getBytes(), f);
		
		return fileName;
	}
	
	public String makeFileName(String oriName) {
		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + oriName;
		
		return fileName;
	}
	
}
