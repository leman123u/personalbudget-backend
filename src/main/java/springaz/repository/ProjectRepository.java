package springaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springaz.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository <ProjectEntity ,Long>{ 
	
	
	

}
