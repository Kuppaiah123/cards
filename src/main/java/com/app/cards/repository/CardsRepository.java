package com.app.cards.repository;


import java.util.List;

import com.app.cards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {


    List<Cards> findByCustomerId(int customerId);

}