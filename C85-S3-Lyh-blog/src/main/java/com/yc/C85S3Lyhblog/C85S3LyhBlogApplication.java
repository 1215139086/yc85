package com.yc.C85S3Lyhblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.C85S3Lyhblog.dao")
public class C85S3LyhBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(C85S3LyhBlogApplication.class, args);
	}

}
