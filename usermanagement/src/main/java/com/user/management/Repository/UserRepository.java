package com.user.management.Repository;

import com.user.management.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails ,Integer> {
    public boolean existsByEmail(String email);
}
