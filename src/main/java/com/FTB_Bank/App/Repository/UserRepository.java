package com.FTB_Bank.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.FTB_Bank.App.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
