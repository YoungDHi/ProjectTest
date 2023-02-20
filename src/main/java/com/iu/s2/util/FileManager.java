package com.iu.s2.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	public String fileSave(MultipartFile multipartFile, String path) throws Exception{
		
		File file = new File(path);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		String name = UUID.randomUUID().toString();
		
		name = name+"_"+multipartFile.getOriginalFilename();
		
		file = new File(file, name);
		
		multipartFile.transferTo(file);
		return name;
		
	}
	
}
