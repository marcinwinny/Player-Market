package com.marcinwinny.playermarket.repository;

import com.marcinwinny.playermarket.model.Country;
import com.marcinwinny.playermarket.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    Optional<Team> findByTeamName(String teamName);

    List<Team> findByCountry(Country country);
}
