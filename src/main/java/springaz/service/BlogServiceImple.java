package springaz.service;

import java.util.List;

import springaz.entity.BlogEntity;

public interface BlogServiceImple {
	
	

	   List<BlogEntity> getAllBlogs();

	    BlogEntity getBlogById(Long id);

	    BlogEntity createBlog(BlogEntity blog);

	    BlogEntity updateBlog(Long id, BlogEntity blog);

	    void deleteBlog(Long id);


}
