package com.niit.collabaration.collabarationBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.BlogDAO;
import com.collaborate.model.Blog;

public class BlogDAOTest {

	static BlogDAO blogDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogDAO=(BlogDAO)annotationConfigAppContext.getBean("blogDAO");
	
	}
	
	@Test
	public void createBlogtest()
	{
		Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("vishnu");
		blog.setBlogContent("vishnuvardhan");
		
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in Blog Creation",blogDAO.createBlog(blog));
	
	}
	
	@Ignore
	@Test
	public void approveBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlogId(1001);
		blog.setBlogName("vishnuvardhan");
		blog.setBlogContent("vishnu");
		
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in approving Blog",blogDAO.approvedBlog(blog));	
	}}
	
	
	
