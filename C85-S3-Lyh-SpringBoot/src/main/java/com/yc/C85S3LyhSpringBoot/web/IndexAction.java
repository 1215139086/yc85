package com.yc.C85S3LyhSpringBoot.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.C85S3LyhSpringBoot.dao.ProductMapper;

import damai.bean.DmProduct;

@Controller
public class IndexAction {
	@Resource
	ProductMapper pm;
	@GetMapping("index.do")
	public String index(Model m) {
		List <DmProduct> hlist=pm.selectByHot();
				
				m.addAttribute("hlist",hlist);
		
		
		return "index";
	}
	@GetMapping("detail.do")
	public String detail(Model m, int id) {
		// 查询指定id商品
		DmProduct dp = pm.selectById(id);
		// 推送给页面
		m.addAttribute("dp", dp);
		return "detail";
	}

}
