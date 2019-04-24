package com.zhang.test;

import java.io.File;

import com.zhang.springmvc.web.utils.Base64Utils;

public class Base64Test {

	public static void main(String[] args) {
		File file = new File("D:\\data\\01.png");
		System.out.println(Base64Utils.encode(file));
	}

}
