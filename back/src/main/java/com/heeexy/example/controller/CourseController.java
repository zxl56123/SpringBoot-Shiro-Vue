package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.CourseService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hxy
 * @description: 健身课程相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	/**
	 * 查询文章列表
	 */
	@RequiresPermissions("course:list")
	@GetMapping("/listCourse")
	public JSONObject listCourse(HttpServletRequest request) {
		return courseService.listCourse(CommonUtil.request2Json(request));
	}

	/**
	 * 新增文章
	 */
	@RequiresPermissions("course:add")
	@PostMapping("/addCourse")
	public JSONObject addCourse(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "content");
		return courseService.addCourse(requestJson);
	}

	/**
	 * 修改文章
	 */
	@RequiresPermissions("course:update")
	@PostMapping("/updateCourse")
	public JSONObject updateCourse(@RequestBody JSONObject requestJson) {
		CommonUtil.hasAllRequired(requestJson, "id,content");
		return courseService.updateCourse(requestJson);
	}
}
