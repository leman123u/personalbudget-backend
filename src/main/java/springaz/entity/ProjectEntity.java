package springaz.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(
		  name = "projects",
		  indexes = {
		      @Index(name = "idx_projects_createdAt", columnList = "createdAt"),
		      @Index(name = "idx_projects_title", columnList = "title")
		  }
		)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class ProjectEntity {
	

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	     private Long id ;
	 
	 
	 @Column(nullable = false, length = 200)
	     private String title ;
	  @Column(columnDefinition = "text")
	     private String description ;
	  
	  @Column(name = "image_url")
	     private String imageUrl;
	  @Column(name = "thumbnail_url")
	     private  String thumbnailUrl;
	  
	  
	  @CreationTimestamp
	  @Column(name = "created_at")
	     private LocalDateTime createdAt;
	
	

}
