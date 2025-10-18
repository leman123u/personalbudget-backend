package springaz.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import springaz.entity.ProjectEntity;
import springaz.repository.ProjectRepository;

@Service
public class ProjectService implements ProjectServiceImple {
	  @Autowired
	  private  ProjectRepository projectRepository ;

	
	@Override
	public List<ProjectEntity> getAllProjects() {
	  return projectRepository.findAll();
	}

	@Override
	public ProjectEntity getProjectById(Long id) {
		 return projectRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Project not found wth id:"+ id));

	}

	@Override
	public ProjectEntity createProject(ProjectEntity projectEntity) {
		  return projectRepository.save(projectEntity);
		
	}

	@Override

	public ProjectEntity updateProject(Long id, ProjectEntity project) {
		  var existingProject=  getProjectById(id);
	        existingProject.setDescription(project.getDescription());
	        existingProject.setThumbnailUrl(project.getThumbnailUrl());
	        existingProject.setImageUrl(project.getImageUrl());
	        existingProject.setCreatedAt(project.getCreatedAt());

	        existingProject.setTitle(project.getTitle());
	        return projectRepository.save(existingProject);
		
		
	}

	@Override
	public void deleteProject(Long id) {
		
		  if (!projectRepository.existsById(id)){
	            throw new RuntimeException("Project not found with id :"+ id);

	        }
	            projectRepository.deleteById(id);
	    }
	}
	
	
	
	
	


