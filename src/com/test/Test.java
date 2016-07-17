package com.test;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.ProgramTest;

@Controller
@RequestMapping("test")
public class Test {
	
	@RequestMapping("test")
	public void test() throws Exception{
		Long start = System.currentTimeMillis();
		File file = new File("D://input.data");
		File file1 = new File("D://input1.data");
		File file2 = new File("");
		ProgramTest.test(file, file1, file2);
		Long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}
