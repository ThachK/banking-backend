package com.project2.daos;

import com.project2.models.Account;
import com.project2.models.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ChargeDAO extends JpaRepository<Charge, Integer> {
    //get all charges ??

    //get all charges by account id
    public Optional<List<Charge>> findByAccount(Integer accountId);
}