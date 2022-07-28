package com.services;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

	public void imageUpload(MultipartFile file,int userId)
	{
		try {
			
			String mainPath="C:\\Users\\Dell\\eclipse-workspace\\Spring_web\\Spring_web\\src\\main\\webapp\\resources\\images";
			File folder=new File(mainPath,userId+"");
			folder.mkdir();
			File newFile=new File(folder,file.getOriginalFilename());
			byte b[] =file.getBytes();
			FileOutputStream fos=new FileOutputStream(newFile);
			fos.write(b);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
