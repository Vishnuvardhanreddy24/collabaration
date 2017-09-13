package com.niit.collabaration.collabarationBackend;

public class ForumDAOTestCase {
static ForumDAO forumDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
	    forumDAO=(ForumDAO)annotationConfigAppContext.getBean("forumDAO");
	
	}
	
	@Test
	public void createForumtest()
	{
		Forum forum=new Forum();
		forum.setForumId(111);
		forum.setForumName("vishnu");
		forum.setForumContent("vishnu likes playing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in Blog Creation",forumDAO.createForum(forum));
	
	}
	
	@Ignore
	@Test
	public void approveForumTest()
	{
		Forum forum=new Forum();
		forum.setForumName("vishnu");
		forum.setForumContent("vishnu likes playing");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		forum.setLikes(0);
		assertTrue("Problem in approving Forum",forumDAO.approveForum(forum));	
	}
	@Ignore
	@Test
	public void editForumTest()
	{
    Forum forum=new Forum();
    forum.setForumId(1001);
    forum.setForumName("vishnu");
    forum.setForumContent("vishnu likes playing ");
    forum.setCreateDate(new java.util.Date());
    forum.setStatus("NA");
    forum.setLikes(0);
	assertTrue("Problem in approving Blog",forumDAO.editForum(forum.getForumId()));	
	}
	
	@Ignore
	@Test
	public void deleteForumTest()
	{
		Forum forum = new Forum();
		forum.setForumId(1001);
	assertTrue("Problem in approving Blog",forumDAO.deleteForum(forum.getForumId()));	
	}
	
	@Test
	public void getForumTest()
	{
		Forum forum = new Forum();
		forum.setForumId(1001);

	}
	
	
	
	
}