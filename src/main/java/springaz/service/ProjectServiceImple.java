package springaz.service;

import java.util.List;

import springaz.entity.ProjectEntity;

public interface ProjectServiceImple {
	
	List<ProjectEntity> getAllProjects();

    ProjectEntity getProjectById(Long id);

    ProjectEntity createProject(ProjectEntity projectEntity);

    ProjectEntity updateProject(Long id ,ProjectEntity project);
     void deleteProject(Long id);

	
	

}
