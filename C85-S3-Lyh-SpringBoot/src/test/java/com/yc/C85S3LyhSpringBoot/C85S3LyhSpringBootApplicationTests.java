package com.yc.C85S3LyhSpringBoot;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.yc.C85S3LyhSpringBoot.biz.MailService;
import com.yc.C85S3LyhSpringBoot.dao.ProductMapper;

@SpringBootTest
class C85S3LyhSpringBootApplicationTests {
	
	@Resource
	ProductMapper pm;
	
	@Resource
	MailService ms;

	@Test
	void contextLoads() {
		Assert.isTrue(pm.selectAll().size() > 0, "没有数据");
	}
	
	@Test
	void testMail() {
		ms.sendSimpleMail("997471799@qq.com", "我上课写的邮件发送代码", "噜啦噜啦嘞，嘤嘤嘤");
	}
}
