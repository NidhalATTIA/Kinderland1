package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Friendship;


public interface FriendshipRepository extends CrudRepository<Friendship, Long>{

}
