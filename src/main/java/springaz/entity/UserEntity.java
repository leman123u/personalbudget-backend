package springaz.entity;


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
	    name = "users",
	    indexes = {
	        @Index(name = "idx_users_name", columnList = "name"),
	        @Index(name = "idx_users_profession", columnList = "profession")
	    }
	)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class UserEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

 
	
	@Column(length = 150)
    private String name ;

    private String password ;

	
    @Column(length = 150)
      private String profession;


    @Column(name = "social_links", length = 1000)
      private String social_links;
    
    
        @Column(length = 100)
       private String experience ;
	
	
	
	

}
