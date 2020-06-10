package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.VoteComment;


public interface VoteCommentPostRepository extends CrudRepository<VoteComment, Long>{
	
	@Query("SELECT count(*) FROM VoteComment r join ForumPostComment u on r.forumPostComment=u.IdPostComment WHERE u.IdPostComment=:PostCommentId")
	public  int  getVotePerComment(@Param("PostCommentId")Long PostCommentId);
	
}
