package com.example.shopacc.repository;

import com.example.shopacc.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoAccount extends JpaRepository<Account,Integer> {
}
