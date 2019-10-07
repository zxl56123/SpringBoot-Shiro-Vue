package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.CourseDao;
import com.heeexy.example.service.CourseService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: hxy
 * @date: 2017/10/24 16:07
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	/**
	 * 新增健身课程
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject addCourse(JSONObject jsonObject) {
		courseDao.addCourse(jsonObject);
		return CommonUtil.successJson();
	}

	/**
	 * 健身课程列表
	 */
	@Override
	public JSONObject listCourse(JSONObject jsonObject) {
		CommonUtil.fillPageParam(jsonObject);
		int count = courseDao.countCourse(jsonObject);
		List<JSONObject> list = courseDao.listCourse(jsonObject);
		return CommonUtil.successPage(jsonObject, list, count);
	}

	/**
	 * 更新健身课程
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public JSONObject updateCourse(JSONObject jsonObject) {
		courseDao.updateCourse(jsonObject);
		return CommonUtil.successJson();
	}
}
