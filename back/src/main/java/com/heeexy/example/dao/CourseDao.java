package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author: hxy
 * @description: 健身课程Dao层
 * @date: 2017/10/24 16:06
 */
public interface CourseDao {
	/**
	 * 新增健身课程
	 */
	int addCourse(JSONObject jsonObject);

	/**
	 * 统计健身课程总数
	 */
	int countCourse(JSONObject jsonObject);

	/**
	 * 健身课程列表
	 */
	List<JSONObject> listCourse(JSONObject jsonObject);

	/**
	 * 更新健身课程
	 */
	int updateCourse(JSONObject jsonObject);
}
