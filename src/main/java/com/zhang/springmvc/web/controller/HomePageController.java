package com.zhang.springmvc.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.zhang.springmvc.web.utils.Base64Utils;

@Controller
public class HomePageController {

	@RequestMapping("/homepage")
	public String index(ModelMap map) {
		System.out.println("in HomePageController");
		map.put("name", "James");
		return "homepage";
	}

	@RequestMapping("/upload")
	public String upload(MultipartFile file, ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		try {
			if (file.isEmpty()) {
				map.put("msg", "ÎÄ¼þÎª¿Õ");
			} else {
				String base64 = Base64Utils.encode(file.getInputStream());
				map.put("uploadFile", base64);
				/*
				 * String suffix =
				 * file.getOriginalFilename().substring(file.getOriginalFilename
				 * ().lastIndexOf("."), file.getOriginalFilename().length());
				 * String uploadPath =
				 * request.getServletContext().getRealPath("upload"); String
				 * fileName = UUID.randomUUID().toString() + suffix; File temp =
				 * new File(uploadPath); File dist = new File(temp, fileName);
				 * file.transferTo(dist);
				 */
			}
			System.out.println("in upload MultipartFile: " + file);
		} catch (IOException e1) {
			map.put("msg", e1.getMessage());
		}
		return "homepage";
	}

}
