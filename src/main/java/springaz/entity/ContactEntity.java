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
	    name = "contacts",
	    indexes = {
	        @Index(name = "idx_contacts_email", columnList = "email"),
	        @Index(name = "idx_contacts_createdAt", columnList = "createdAt")
	    }
	)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class ContactEntity {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Long id ;
	@Column(length = 150)
	    private String name ;
	@Column(length = 200)
	    private String email;
    @Column(columnDefinition = "text")
	    private String message ;
    
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
	    private LocalDateTime createdAt;
	    
	    

}
