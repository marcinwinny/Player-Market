package com.marcinwinny.playermarket.repository;

import com.marcinwinny.playermarket.model.Country;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByTeam(Team team);

    List<Player> findByCountry(Country country);

}
