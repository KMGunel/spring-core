package az.developia.restsecurity.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.restsecurity.model.AuthorityModel;

public interface AuthorityRepository extends JpaRepository<AuthorityModel, Integer> {

		
	}
