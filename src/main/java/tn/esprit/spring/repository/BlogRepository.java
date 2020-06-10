package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.Blog;

public interface BlogRepository extends CrudRepository<Blog, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE Blog e SET e.TextBlog=:TextBlog1 where e.IdBlog=:BlogId")
    public void UpdateBlog(@Param("TextBlog1")String TextBlog1, @Param("BlogId")Long BlogId);

}
