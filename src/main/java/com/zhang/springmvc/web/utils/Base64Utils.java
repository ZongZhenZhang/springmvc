package com.zhang.springmvc.web.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

import net.iharder.Base64;

public final class Base64Utils {
	private static Logger logger = Logger.getLogger(Base64Utils.class);

	private static final String PREFIX = "data:image/jpeg;base64,";

	/**
	 * 将图片文件转为base64字符串
	 * 
	 * @return
	 */
	public static String encode(File file) {
		String result = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] b = new byte[(int) file.length()];
			fileInputStream.read(b);
			fileInputStream.close();
			result = PREFIX + Base64.encodeBytes(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			logger.error("file not found.", e);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("parse file to base64 string failed!", e);
		}
		return result;
	}

	public static String encode(InputStream inputStream) {
		if (inputStream == null) {
			return null;
		}
		String result = null;
		byte[] b = null;
		try {
			b = new byte[inputStream.available()];
			inputStream.read(b);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("parse file to base64 string failed!", e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
			}
		}
		result = PREFIX + Base64.encodeBytes(b);
		return result;
	}

}
