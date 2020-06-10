package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.ForumPost;

public interface ForumPostRepository extends CrudRepository<ForumPost, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE ForumPost e SET e.TextPost=:TextPost1 where e.IdPost=:PostId")
    public void UpdateForumPost(@Param("TextPost1")String TextPost, @Param("PostId")Long PostId);
	

    /*@Query("Select * FROM ForumPost fp join ForumPostComment u on fp.forumPostComment=u.IdPostComment join VoteComment "
    		+ "vc on u.forumPostComment=vc.IdVoteComment ORDERBY max(count()) WHERE u.IdPostComment=:PostCommentId")
    public void AfficheForumPostParVote(@Param("TextPost1")String TextPost, @Param("PostId")Long PostId);
    */

}
