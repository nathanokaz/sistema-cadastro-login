package com.projects.devlink.domain.User.repository;

import com.projects.devlink.domain.User.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByEmail(String username);

    User findByNickname(@NotBlank String nickname);

}
