package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: hxy
 * @date: 2017/10/24 16:06
 */
public interface CourseService {
	/**
	 * 新增文章
	 */
	JSONObject addCourse(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listCourse(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateCourse(JSONObject jsonObject);
}
