package com.wuxicloud.dao;

import com.wuxicloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yumg
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
