package com.niit.collabaration.collabarationBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.BlogDAO;

public class BlogDAOTestCase{
	static BlogDAO blogDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationConfig =new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationConfig.scan("com.collaborate");
		annotationConfigApplicationConfig.refresh();
	}
	@Test
	public void test()
	{
		fail("not yet implemented");
	}

}