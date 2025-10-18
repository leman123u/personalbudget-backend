package springaz.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

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
	    name = "blogs",
	    indexes = {
	        @Index(name = "idx_blogs_createdAt", columnList = "createdAt"),
	        @Index(name = "idx_blogs_author", columnList = "author")
	    }
	)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class BlogEntity {
	
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	      private Long id ;
	 
	 @Column(length = 200, nullable = false)
	      private String title ;
	 
	      @Column(columnDefinition = "text")
	      private String content;
	      
	      @Column(length = 150)
	      private  String  author ;
	      @Column(length = 500)
	      private String imageUrl;
	      
	      @CreationTimestamp
	      private LocalDateTime createdAt ;
	
	

}
