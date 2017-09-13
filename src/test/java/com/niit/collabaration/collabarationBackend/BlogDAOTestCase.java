package com.niit.collabaration.collabarationBackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.BlogDAO;
import com.collaborate.model.Blog;

public class BlogDAOTestCase {
	static BlogDAO blogDAO;
	static Blog blog;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogDAO=(BlogDAO)annotationConfigAppContext.getBean("blogDAO");
	    blog=(Blog)annotationConfigAppContext.getBean("blog");
	}
	@Test
	public void createBlogtest()
	{
		//Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("Virat");
		blog.setBlogContent("Virat is a Cricket player");
		
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in Blog Creation",blogDAO.createBlog(blog));
	
	}
	
	
	@Test
	public void editBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	blog.setBlogName("Virat");
	blog.setBlogContent("virat plays Cricket ");
	blog.setCreateDate(new java.util.Date());
	blog.setUsername("naveen");
	blog.setStatus("NA");
	blog.setLikes(0);
	assertTrue("Problem in approving Blog",blogDAO.editBlog(blog.getBlogId()));	
	}
	
	
	@Test
	public void deleteBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	assertTrue("Problem in approving Blog",blogDAO.deleteBlog(blog.getBlogId()));	
	}
	
	@Ignore
	@Test
	public void getBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	}

	@Test
	public void approveBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("Virat");
		blog.setBlogContent("Virat is a Cricket player");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in approving Blog",blogDAO.approveBlog(blog));	
	}
}	

	