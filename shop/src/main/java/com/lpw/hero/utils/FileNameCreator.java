package com.lpw.hero.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileNameCreator {
	/**
	 * 
	 * @param url http://localhost:8005/file_server/upload
	 * @param fileName
	 * @return http://localhost:8005/file_server/11111a.jpg
	 */
	public static String creatRandomName(String url,String fileName) {
		DateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmSSS");
		String  format = fmt.format(new Date());
		
		// 要保存的地址ַ
		url = url + format +fileName;
		return url;
	}
}
