package az.developia.restsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.restsecurity.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String> {

}
