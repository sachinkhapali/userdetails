package sa.com.details.repository;

import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import sa.com.details.model.UserDetails;

public interface UserdetailRepository extends CrudRepository<UserDetails, Integer> {
	
	List<UserDetails> findByEmail(String email);

    @Query("select c from UserDetails c where c.userName = :userName")
    Stream<UserDetails> findByuserNameReturnStream(@Param("userName") String userName);
}
