package tn.esprit.spring.repository;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.ForumPostComment;

public interface ForumPostCommentRepository extends CrudRepository<ForumPostComment, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE ForumPostComment e SET e.TextComment=:TextPostComment1 where e.IdPostComment=:PostCommentId")
    public void UpdateForumPostComment(@Param("TextPostComment1")String TextPostComment1, @Param("PostCommentId")Long PostCommentId);
	
	@Modifying
    @Transactional
    @Query("UPDATE ForumPostComment e SET e.VoteComment=VoteComment+1 where e.IdPostComment=:PostCommentId")
    public void UpdateVoteComment(@Param("PostCommentId")Long PostCommentId);

}
