package springaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springaz.entity.BlogEntity;

public interface BlogRepository extends JpaRepository<BlogEntity,Long >{

}
