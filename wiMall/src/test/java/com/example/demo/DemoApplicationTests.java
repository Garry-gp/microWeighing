package com.example.demo;

import com.example.app.util.MyDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		MyDate myDate = new MyDate();
		System.out.println(myDate.getTime());
	}

}
