package com.barryku.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.company.jett.SpringBootTilesApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootTilesApplication.class)
@WebAppConfiguration
public class SpringBootTilesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
