package com.example.learn.filedownload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class FileDownFromWebController {

	@Autowired ResourceLoader resourceLoader;
	
	@RequestMapping("/test/download")
	@ResponseBody
	public String test(String url) throws IOException{
		// FileSystemResource resource = new FileSystemResource(downloadPath + fileName);
		if(url==null){
			url = "http://121.78.146.87/contents/transcoded/3421___20160318_185425_343_20160309_101212/20160318_185425_343_20160309_1012122.jpg";
		}
		Resource resource = resourceLoader.getResource("url:"+url);
		log.info("Resource :: {} ",resource);
		//log.info("Resource :: {} ",resource.getFile());
		log.info("Resource :: {} ",resource.getInputStream());
		;
		int i=0;
		try(BufferedInputStream bis = new BufferedInputStream(resource.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("20160318_185425_343_20160309_1012122.jpg"))){
			while ((i=bis.read())!=-1) {
				bos.write(i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		log.info("test");
		return "test";
	}
}
