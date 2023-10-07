package com.example.springBoot_html.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springBoot_html.entity.LoginInfo;

@Repository
public interface LoginRepository extends JpaRepository<LoginInfo, Integer>
{

}
