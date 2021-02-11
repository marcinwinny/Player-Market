package com.marcinwinny.playermarket;

import com.marcinwinny.playermarket.controller.TeamController;
import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.dto.TeamDto;
import com.marcinwinny.playermarket.model.Team;
import com.marcinwinny.playermarket.repository.TeamRepository;
import com.marcinwinny.playermarket.service.PlayerService;
import com.marcinwinny.playermarket.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@AllArgsConstructor
public class PlayerMarketApplication {

	private final TeamService teamService;
	private final PlayerService playerService;

	public static void main(String[] args) {
		SpringApplication.run(PlayerMarketApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

////			playerService.deleteAll();
////			teamService.deleteAll();
//			teamService.save(new TeamDto("FC Barcelona","SPAIN"));
//			teamService.save(new TeamDto("Real Madrid","SPAIN"));
//			teamService.save(new TeamDto("Atletico Madrid","SPAIN"));
//			teamService.save(new TeamDto("Sevilla FC","SPAIN"));
//			teamService.save(new TeamDto("Valencia CF","SPAIN"));
//			teamService.save(new TeamDto("Manchester City","SPAIN"));
//			teamService.save(new TeamDto("Manchester United","SPAIN"));
//			teamService.save(new TeamDto("Leicester City","ENGLAND"));
//			teamService.save(new TeamDto("Liverpool FC","ENGLAND"));
//			teamService.save(new TeamDto("Chelsea FC","ENGLAND"));
//			teamService.save(new TeamDto("West Ham United","ENGLAND"));
//			teamService.save(new TeamDto("Everton FC","ENGLAND"));
//			teamService.save(new TeamDto("Arsenal FC","ENGLAND"));
//			teamService.save(new TeamDto("Bayern Munich","GERMANY"));
//			teamService.save(new TeamDto("Borussia Dortmund","GERMANY"));
//			teamService.save(new TeamDto("Inter Milan","ITALY"));
//			teamService.save(new TeamDto("AC Milan","ITALY"));
//			teamService.save(new TeamDto("Juventus FC","ITALY"));
//
//			playerService.save(new PlayerDto("Jordi Alba",
//					"1989-03-21", "L'Hospitalet de Llobregat",170,
//					"SPAIN","DEFENDER","LEFT","FC Barcelona"));
//			playerService.save(new PlayerDto("Sergio Busquets",
//					"1988-07-16", "Sabadell",189,
//					"SPAIN","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.save(new PlayerDto("Frenkie de Jong",
//					"1997-05-12", "Arkel",180,
//					"NETHERLANDS","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.save(new PlayerDto("Philippe Coutinho",
//					"1992-07-12", "Rio de Janeiro",172,
//					"BRAZIL","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.save(new PlayerDto("Antoine Griezmann",
//					"1991-03-21", "Macon",176,
//					"FRANCE","FORWARD","LEFT","FC Barcelona"));
//			playerService.save(new PlayerDto("Ansu Fati",
//					"2002-10-21", "Bissau",178,
//					"POLAND","FORWARD","RIGHT","FC Barcelona"));
//			playerService.save(new PlayerDto("Lionel Messi",
//					"1987-07-12", "Macon",170,
//					"ARGENTINA","FORWARD","LEFT","FC Barcelona"));
		};
	}
}
