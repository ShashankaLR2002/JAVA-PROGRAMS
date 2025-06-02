package com.xworkz.ascertain.learn.repository;

import com.xworkz.ascertain.learn.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userentity,Integer> {

}
