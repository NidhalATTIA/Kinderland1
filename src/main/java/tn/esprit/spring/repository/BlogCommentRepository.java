package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.BlogComment;

public interface BlogCommentRepository extends CrudRepository<BlogComment, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE BlogComment e SET e.TextComment=:TextBlogComment1 where e.IdBlogComment=:BlogCommentId")
    public void UpdateBlogComment(@Param("TextBlogComment1")String TextBlogComment1, @Param("BlogCommentId")Long BlogCommentId);

}
