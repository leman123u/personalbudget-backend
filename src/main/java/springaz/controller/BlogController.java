package springaz.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import springaz.entity.BlogEntity;
import springaz.service.BlogService;

@RestController

@RequestMapping("/api/v1/blog")
@CrossOrigin("http://localhost:3000")
public class BlogController {
	
	
	@Autowired
	 private  BlogService blogService;



	    @GetMapping
	    public List<BlogEntity> getAllBlogs() {
	        return blogService.getAllBlogs();
	    }

	    @GetMapping("/{id}")
	    public BlogEntity getBlogById(@PathVariable Long id) {
	        return blogService.getBlogById(id);
	    }

	    @PostMapping
	    public BlogEntity createBlog(@RequestBody BlogEntity blog) {
	        return blogService.createBlog(blog);
	    }

	    @PutMapping("/{id}")
	    public BlogEntity updateBlog(@PathVariable Long id, @RequestBody BlogEntity blog) {
	        return blogService.updateBlog(id, blog);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
	        blogService.deleteBlog(id);
	        return ResponseEntity.noContent().build();
	    }
	
	
	
	

}
