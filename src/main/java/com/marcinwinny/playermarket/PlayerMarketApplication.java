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

//			playerService.deleteAll();
//			teamService.deleteAll();
			teamService.insert(new TeamDto("FC Barcelona","SPAIN"));
			teamService.insert(new TeamDto("Real Madrid","SPAIN"));
			teamService.insert(new TeamDto("Atletico Madrid","SPAIN"));
			teamService.insert(new TeamDto("Sevilla FC","SPAIN"));
			teamService.insert(new TeamDto("Valencia CF","SPAIN"));

			teamService.insert(new TeamDto("Manchester City","ENGLAND"));
			teamService.insert(new TeamDto("Manchester United","ENGLAND"));
			teamService.insert(new TeamDto("Leicester City","ENGLAND"));
			teamService.insert(new TeamDto("Liverpool FC","ENGLAND"));
			teamService.insert(new TeamDto("Chelsea FC","ENGLAND"));
			teamService.insert(new TeamDto("West Ham United","ENGLAND"));
			teamService.insert(new TeamDto("Everton FC","ENGLAND"));
			teamService.insert(new TeamDto("Arsenal FC","ENGLAND"));

			teamService.insert(new TeamDto("Bayern Munich","GERMANY"));
			teamService.insert(new TeamDto("Borussia Dortmund","GERMANY"));

			teamService.insert(new TeamDto("Inter Milan","ITALY"));
			teamService.insert(new TeamDto("AC Milan","ITALY"));
			teamService.insert(new TeamDto("Juventus FC","ITALY"));

//			playerService.insert(new PlayerDto("Jordi Alba",
//					"1989-03-21", "L'Hospitalet de Llobregat",170,
//					"SPAIN","DEFENDER","LEFT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Sergio Busquets",
//					"1988-07-16", "Sabadell",189,
//					"SPAIN","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Frenkie de Jong",
//					"1997-05-12", "Arkel",180,
//					"NETHERLANDS","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Philippe Coutinho",
//					"1992-07-12", "Rio de Janeiro",172,
//					"Italy","MIDFIELDER","RIGHT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Antoine Griezmann",
//					"1991-03-21", "Macon",176,
//					"England","FORWARD","LEFT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Ansu Fati",
//					"2002-10-21", "Bissau",178,
//					"Spain","FORWARD","RIGHT","FC Barcelona"));
//			playerService.insert(new PlayerDto("Lionel Messi",
//					"1987-07-12", "Macon",170,
//					"Spain","FORWARD","LEFT","FC Barcelona"));

			playerService.insert(new PlayerDto("Gerard Pique", "1996-08-16", "Barrie", 194, "Germany", "DEFENDER", "RIGHT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Lionel Messi", "1999-04-05", "Pinheiro", 189, "England", "GOALKEEPER", "RIGHT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Jordi Alba", "1993-03-19", "Lubomierz", 166, "Spain", "DEFENDER", "RIGHT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Marc-Andre ter Stegen", "1996-05-18", "Açucena", 193, "Italy", "GOALKEEPER", "BOTH", "FC Barcelona"));
			playerService.insert(new PlayerDto("Victor Valdes", "1990-04-22", "Mende", 170, "England", "GOALKEEPER", "RIGHT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Neto", "1985-08-28", "Praia de Mira", 168, "England", "GOALKEEPER", "BOTH", "FC Barcelona"));
			playerService.insert(new PlayerDto("Ansu Fati", "2001-08-13", "Białaczów", 194, "Spain", "FORWARD", "LEFT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Luis Suarez", "1992-03-30", "Toulouse", 185, "England", "FORWARD", "LEFT", "FC Barcelona"));

			playerService.insert(new PlayerDto("Phoebe Falconer", "2003-06-15", "Huanchillas", 168, "Spain", "DEFENDER", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Diana Cullum", "1985-11-30", "Mrągowo", 173, "Spain", "FORWARD", "LEFT", "Valencia CF"));
			playerService.insert(new PlayerDto("Arvie Lobe", "1996-06-22", "Port-Cartier", 179, "Germany", "DEFENDER", "LEFT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Garik Bilverstone", "2002-05-06", "Reconquista", 184, "Spain", "FORWARD", "BOTH", "Liverpool FC"));
			playerService.insert(new PlayerDto("Sisely Tirrey", "1988-07-06", "Subkowy", 167, "Spain", "MIDFIELDER", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Cosme Rowlinson", "1998-11-15", "Campo Maior", 172, "England", "FORWARD", "BOTH", "AC Milan"));
			playerService.insert(new PlayerDto("Clio Littlecote", "2000-10-01", "Mangaratiba", 193, "Italy", "MIDFIELDER", "BOTH", "Manchester United"));
			playerService.insert(new PlayerDto("North OKinedy", "1986-07-15", "Montijo", 181, "England", "GOALKEEPER", "BOTH", "West Ham United"));
			playerService.insert(new PlayerDto("Gav Petriello", "1992-05-28", "Martingança", 182, "England", "DEFENDER", "RIGHT", "Inter Milan"));
			playerService.insert(new PlayerDto("Jacki Penvarden", "1999-09-23", "Claresholm", 176, "Germany", "DEFENDER", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Douglas Leney", "1990-05-05", "Gramaços", 184, "England", "MIDFIELDER", "RIGHT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Jesse Teck", "2001-08-25", "Troyes", 184, "England", "DEFENDER", "LEFT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Orion Southby", "2000-03-30", "São Sebastião", 191, "England", "GOALKEEPER", "RIGHT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Cassandry Beushaw", "1990-03-06", "Cacoal", 194, "Italy", "MIDFIELDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Yank Vedekhov", "1995-02-04", "Buena Esperanza", 169, "Spain", "DEFENDER", "BOTH", "Liverpool FC"));
			playerService.insert(new PlayerDto("Dorie Hutchinson", "1997-10-11", "Carromeu", 167, "England", "DEFENDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Danell Caves", "1989-01-30", "Belo Horizonte", 181, "Italy", "MIDFIELDER", "BOTH", "Bayern Munich"));
			playerService.insert(new PlayerDto("Wanids de Banke", "1992-01-21", "Carvalhais", 175, "England", "DEFENDER", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Alexander Lacazette", "1997-02-17", "Tours", 178, "England", "DEFENDER", "BOTH", "Arsenal FC"));
			playerService.insert(new PlayerDto("Thelma MacFadden", "2002-07-16", "Grybów", 178, "Spain", "FORWARD", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Lonnie Schimek", "1997-10-11", "Smyków", 165, "Spain", "GOALKEEPER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Franklyn Mafham", "1997-07-29", "Famaillá", 180, "Spain", "MIDFIELDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Olivia Syde", "1997-09-24", "Chrzanów", 176, "Spain", "GOALKEEPER", "RIGHT", "West Ham United"));
			playerService.insert(new PlayerDto("Liana Grasser", "2001-09-16", "Levandeira", 180, "England", "MIDFIELDER", "BOTH", "Valencia CF"));
			playerService.insert(new PlayerDto("Mead Souza", "1987-10-21", "Zapala", 165, "Spain", "FORWARD", "LEFT", "Inter Milan"));
			playerService.insert(new PlayerDto("Lynnelle Muddicliffe", "1987-02-18", "Araripina", 177, "Italy", "GOALKEEPER", "BOTH", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Georgeanna Chasney", "2002-01-19", "Villa Mercedes", 190, "Spain", "DEFENDER", "RIGHT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Selia Bee", "2000-12-20", "Viçosa", 194, "Italy", "GOALKEEPER", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Cordy Orbon", "1997-09-18", "Gijon", 175, "Spain", "DEFENDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Freeland Brewer", "1999-06-26", "Rungis", 175, "England", "MIDFIELDER", "BOTH", "West Ham United"));
			playerService.insert(new PlayerDto("Lizbeth Rennebach", "1995-03-18", "Kasina Wielka", 183, "Spain", "FORWARD", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Thurston De Cleen", "2001-10-06", "Dębno", 174, "Spain", "DEFENDER", "RIGHT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Alexandros Oulet", "1985-04-24", "Ancasti", 188, "Spain", "GOALKEEPER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Kimbra Di Claudio", "2003-01-21", "Palhoça", 194, "Italy", "GOALKEEPER", "LEFT", "Chelsea FC"));
			playerService.insert(new PlayerDto("Ruperto Hodgets", "2001-05-26", "Jasienica Rosielna", 175, "Spain", "GOALKEEPER", "BOTH", "Bayern Munich"));
			playerService.insert(new PlayerDto("Olly Iffland", "2001-09-03", "Riolândia", 172, "Italy", "GOALKEEPER", "RIGHT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Louie Kernocke", "1987-10-27", "Camacha", 187, "England", "MIDFIELDER", "BOTH", "Inter Milan"));
			playerService.insert(new PlayerDto("Beilul Bertouloume", "1992-10-14", "Linhares", 169, "England", "GOALKEEPER", "LEFT", "Everton FC"));
			playerService.insert(new PlayerDto("Brigid Shillitto", "2003-11-20", "Cianorte", 175, "Italy", "MIDFIELDER", "RIGHT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Miltie Kobes", "1997-04-12", "Iłowa", 169, "Spain", "FORWARD", "LEFT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Maire Alves", "1990-10-18", "Maastricht", 167, "Netherlands", "GOALKEEPER", "LEFT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Maddie Chue", "1986-01-15", "Bastia", 166, "England", "DEFENDER", "LEFT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Sharona Beamont", "1995-10-27", "Cururupu", 184, "Italy", "FORWARD", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Bradford Gianulli", "1988-08-23", "Villa General Belgrano", 194, "Spain", "MIDFIELDER", "BOTH", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Danyelle Casaletto", "1993-08-03", "Łętownia", 174, "Spain", "DEFENDER", "BOTH", "Valencia CF"));
			playerService.insert(new PlayerDto("Rianon Zebedee", "1992-06-28", "Cacequi", 179, "Italy", "DEFENDER", "LEFT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Gardiner Segoe", "1989-05-13", "Vila Maior", 179, "England", "GOALKEEPER", "RIGHT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Ninette Hadlington", "2001-08-23", "Dijon", 177, "England", "MIDFIELDER", "BOTH", "Bayern Munich"));
			playerService.insert(new PlayerDto("Arch Frangione", "1988-01-13", "Piracuruca", 180, "Italy", "DEFENDER", "RIGHT", "Manchester United"));
			playerService.insert(new PlayerDto("Donica Center", "2001-05-09", "Figueira dos Cavaleiros", 188, "England", "MIDFIELDER", "RIGHT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Tildi Erbain", "2000-02-11", "Łubniany", 186, "Spain", "FORWARD", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Lesya Strutton", "1996-11-23", "San Ramón de la Nueva Orán", 174, "Spain", "MIDFIELDER", "LEFT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Tessy Conkey", "1993-03-26", "Carrascal", 169, "England", "DEFENDER", "RIGHT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Cass Brunini", "1996-10-14", "Fonte do Feto", 191, "England", "FORWARD", "RIGHT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Orelle Moline", "1999-08-27", "Jarinu", 173, "Italy", "FORWARD", "RIGHT", "Chelsea FC"));
			playerService.insert(new PlayerDto("Trumann Willcot", "1997-02-22", "Buenos Aires", 192, "Spain", "MIDFIELDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Vinson Bahls", "1997-07-02", "Ipojuca", 187, "Italy", "MIDFIELDER", "BOTH", "Leicester City"));
			playerService.insert(new PlayerDto("Sheeree Marven", "2001-02-13", "Évry", 168, "England", "MIDFIELDER", "RIGHT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Pansy Duffan", "1991-02-27", "Palpalá", 170, "Spain", "MIDFIELDER", "BOTH", "Bayern Munich"));
			playerService.insert(new PlayerDto("Oberon Parmer", "1994-08-31", "Stare Juchy", 165, "Spain", "FORWARD", "RIGHT", "Inter Milan"));
			playerService.insert(new PlayerDto("Chelsea Mundford", "1989-08-27", "Annecy", 192, "England", "MIDFIELDER", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Teddy Gaffer", "1986-05-18", "Mucifal", 193, "England", "GOALKEEPER", "RIGHT", "Juventus FC"));
			playerService.insert(new PlayerDto("Carmencita Anderbrugge", "1992-05-22", "Bebedouro", 186, "Italy", "DEFENDER", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Vale Ahearne", "1994-05-10", "São Manços", 190, "England", "DEFENDER", "BOTH", "Valencia CF"));
			playerService.insert(new PlayerDto("Harlene Letherbury", "1992-05-13", "Totoras", 166, "Spain", "GOALKEEPER", "BOTH", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Saloma Drews", "1995-08-11", "Laranjeiras do Sul", 167, "Italy", "MIDFIELDER", "RIGHT", "Chelsea FC"));
			playerService.insert(new PlayerDto("Ellette Ellingsworth", "1993-01-25", "Formiga", 195, "Italy", "DEFENDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Gustavus Ardley", "1988-07-08", "Rokietnica", 185, "Spain", "MIDFIELDER", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Branden Mallison", "1997-03-21", "Jabłoń", 165, "Spain", "GOALKEEPER", "BOTH", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Eachelle Di Maria", "1991-09-20", "Chambly", 181, "Germany", "DEFENDER", "RIGHT", "West Ham United"));
			playerService.insert(new PlayerDto("Margeaux Klouz", "1986-10-27", "Garça", 172, "Italy", "DEFENDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Marleah Gotthard", "1993-02-18", "Tours", 184, "England", "MIDFIELDER", "LEFT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Jessamyn Gowar", "1993-02-11", "Meaux", 174, "England", "MIDFIELDER", "RIGHT", "Juventus FC"));
			playerService.insert(new PlayerDto("Hamilton Morgue", "1994-07-09", "Cruzeiro", 168, "England", "FORWARD", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Nat MacSwayde", "2002-01-11", "Amsterdam Westpoort", 179, "Netherlands", "GOALKEEPER", "LEFT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Nance Grinnell", "1994-07-01", "Cabeço de Vide", 170, "England", "FORWARD", "RIGHT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Ariel Ingall", "1999-03-07", "General Lavalle", 190, "Spain", "DEFENDER", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Krissy Stait", "1996-01-09", "San Fernando del Valle de Catamarca", 194, "Spain", "DEFENDER", "BOTH", "Liverpool FC"));
			playerService.insert(new PlayerDto("Frazer Filer", "1995-11-20", "Sieniawa Żarska", 167, "Spain", "DEFENDER", "BOTH", "Valencia CF"));
			playerService.insert(new PlayerDto("Eyde Hampton", "1999-12-21", "Indaial", 168, "Italy", "FORWARD", "BOTH", "AC Milan"));
			playerService.insert(new PlayerDto("Murdoch McSkeagan", "1990-09-16", "Jabłonka", 177, "Spain", "DEFENDER", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Joletta Castledine", "1988-12-05", "Arroio Grande", 167, "Italy", "GOALKEEPER", "BOTH", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Tasha Lanigan", "1993-08-29", "Santa Maria Oliveira", 192, "England", "MIDFIELDER", "BOTH", "Leicester City"));
			playerService.insert(new PlayerDto("Sidoney Puller", "1999-06-11", "Arroteia", 165, "England", "DEFENDER", "RIGHT", "Everton FC"));
			playerService.insert(new PlayerDto("Gnni Cressar", "1989-05-08", "Clermont-Ferrand", 191, "England", "DEFENDER", "RIGHT", "Manchester City"));
			playerService.insert(new PlayerDto("Bernard Skaid", "2002-03-19", "Costa Nova do Prado", 191, "England", "FORWARD", "RIGHT", "Manchester United"));
			playerService.insert(new PlayerDto("Ally Fibbens", "1989-10-11", "Poitiers", 182, "England", "FORWARD", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Hendrik Waddam", "2001-12-03", "Dąbrowa", 190, "Spain", "FORWARD", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Jaymee Aldren", "2000-05-11", "Carcavelos", 193, "England", "MIDFIELDER", "BOTH", "Chelsea FC"));
			playerService.insert(new PlayerDto("Willard Trenchard", "1994-11-25", "Fresnes", 187, "England", "GOALKEEPER", "RIGHT", "Leicester City"));
			playerService.insert(new PlayerDto("Georges Trebilcock", "1992-03-05", "Bourg-en-Bresse", 172, "England", "DEFENDER", "RIGHT", "West Ham United"));
			playerService.insert(new PlayerDto("Ernaline Folliss", "2000-03-05", "Cipolletti", 173, "Spain", "GOALKEEPER", "BOTH", "Inter Milan"));
			playerService.insert(new PlayerDto("Sidonnie Zavattieri", "1987-08-11", "Fanzeres", 169, "England", "GOALKEEPER", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Ilyssa Piotrowski", "2001-03-24", "Ji Paraná", 171, "Italy", "DEFENDER", "RIGHT", "Leicester City"));
			playerService.insert(new PlayerDto("Andris Lathy", "1994-08-09", "Ribeirão da Ilha", 190, "Italy", "FORWARD", "RIGHT", "Manchester United"));
			playerService.insert(new PlayerDto("Karry Taffurelli", "1999-02-11", "Metz", 172, "England", "GOALKEEPER", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Nara Alliker", "1995-03-23", "Brant", 185, "Germany", "FORWARD", "BOTH", "Juventus FC"));
			playerService.insert(new PlayerDto("Jasun Curreen", "2000-09-09", "Ponte", 165, "England", "FORWARD", "LEFT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Hermione Aikett", "1995-12-05", "Bairro", 183, "England", "MIDFIELDER", "LEFT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Marcille Antonich", "1988-10-12", "Sunchales", 177, "Spain", "GOALKEEPER", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Woodie Coste", "1999-04-10", "Zaragoza", 176, "Spain", "DEFENDER", "BOTH", "Chelsea FC"));
			playerService.insert(new PlayerDto("Humfrey Harrismith", "1985-12-22", "Vitoria-Gasteiz", 165, "Spain", "MIDFIELDER", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Ian Bozier", "1986-02-24", "Panambi", 187, "Italy", "GOALKEEPER", "BOTH", "West Ham United"));
			playerService.insert(new PlayerDto("Flem Gibberd", "1994-04-14", "Sertãozinho", 180, "Italy", "FORWARD", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Bendicty Runham", "2001-10-06", "Vilarinho da Castanheira", 174, "England", "DEFENDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Garwin Vango", "1988-04-17", "Galveias", 167, "England", "FORWARD", "BOTH", "Manchester City"));
			playerService.insert(new PlayerDto("Jorge Blemen", "1996-06-09", "Almelo", 188, "Netherlands", "FORWARD", "BOTH", "Arsenal FC"));
			playerService.insert(new PlayerDto("Lynnea Neville", "1988-12-02", "Lleida", 186, "Spain", "DEFENDER", "BOTH", "Bayern Munich"));
			playerService.insert(new PlayerDto("Margalo Dibdin", "1998-04-10", "Ipauçu", 181, "Italy", "DEFENDER", "RIGHT", "Manchester City"));
			playerService.insert(new PlayerDto("Matthus Olenin", "1992-10-08", "Conde", 167, "England", "DEFENDER", "LEFT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Lurleen Frascone", "2003-07-11", "Queluz de Baixo", 192, "England", "MIDFIELDER", "LEFT", "Manchester United"));
			playerService.insert(new PlayerDto("Bryn Habershaw", "2002-08-08", "Périgueux", 174, "England", "GOALKEEPER", "LEFT", "Valencia CF"));
			playerService.insert(new PlayerDto("Nessi Rockell", "1992-09-01", "Vila Franca da Beira", 188, "England", "FORWARD", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Carny Blandford", "2001-07-13", "Bardo", 175, "Spain", "FORWARD", "RIGHT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Patsy Wileman", "2003-06-22", "Chełmiec", 194, "Spain", "DEFENDER", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Gus Bawles", "1985-06-15", "Nanaimo", 189, "Germany", "MIDFIELDER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Kennett Mountford", "1989-09-17", "Joaquín V. González", 171, "Spain", "GOALKEEPER", "BOTH", "Arsenal FC"));
			playerService.insert(new PlayerDto("Dorice Avison", "1994-07-16", "Peruíbe", 170, "Italy", "DEFENDER", "LEFT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Eugene Taber", "1999-09-21", "Annecy", 193, "England", "DEFENDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Thomasina Liddy", "1989-04-05", "Końskowola", 191, "Spain", "GOALKEEPER", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Domeniga Trenbey", "2001-05-16", "Piława Górna", 191, "Spain", "DEFENDER", "BOTH", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Nikolaos Darell", "1988-08-07", "Praga Północ", 193, "Spain", "DEFENDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Winfred Skewis", "1999-06-26", "North Cowichan", 166, "Germany", "GOALKEEPER", "RIGHT", "Real Madrid"));
			playerService.insert(new PlayerDto("Neils Luciani", "1985-06-27", "Chamical", 195, "Spain", "FORWARD", "RIGHT", "Inter Milan"));
			playerService.insert(new PlayerDto("Boot Keher", "1997-06-23", "Sevilla", 192, "Spain", "GOALKEEPER", "BOTH", "Real Madrid"));
			playerService.insert(new PlayerDto("Zacharia Feaveer", "1999-02-05", "Vila Ribeiro", 194, "England", "GOALKEEPER", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Daren Reckless", "1997-07-13", "Międzyrzecz", 194, "Spain", "FORWARD", "RIGHT", "Inter Milan"));
			playerService.insert(new PlayerDto("Crosby Gamble", "1986-09-07", "Pederneiras", 195, "Italy", "FORWARD", "LEFT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Abey Blaze", "1994-12-22", "Ferraz de Vasconcelos", 182, "Italy", "GOALKEEPER", "BOTH", "Chelsea FC"));
			playerService.insert(new PlayerDto("Hilly Pagan", "1999-10-14", "Barra Cheia", 170, "England", "GOALKEEPER", "RIGHT", "Real Madrid"));
			playerService.insert(new PlayerDto("Jaclin Romanski", "2001-03-21", "Pinhais", 190, "Italy", "MIDFIELDER", "BOTH", "West Ham United"));
			playerService.insert(new PlayerDto("Jo Bettlestone", "2001-10-18", "Campinas", 187, "Italy", "MIDFIELDER", "RIGHT", "Manchester City"));
			playerService.insert(new PlayerDto("Siana Boldecke", "2002-07-21", "Niort", 188, "England", "GOALKEEPER", "LEFT", "Inter Milan"));
			playerService.insert(new PlayerDto("Nicki Dory", "2002-08-11", "Ostrów Mazowiecka", 185, "Spain", "DEFENDER", "LEFT", "Everton FC"));
			playerService.insert(new PlayerDto("Roseanne Curl", "1997-03-06", "Cassilândia", 171, "Italy", "MIDFIELDER", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Lanie Ramm", "1995-03-13", "Tío Pujio", 181, "Spain", "MIDFIELDER", "RIGHT", "Manchester United"));
			playerService.insert(new PlayerDto("Lacee Barroux", "1996-06-05", "Jaguaribe", 193, "Italy", "GOALKEEPER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Pyotr Mound", "2002-11-13", "Santa Cruz", 177, "England", "GOALKEEPER", "LEFT", "Manchester United"));
			playerService.insert(new PlayerDto("Lacy Smiley", "1988-06-17", "Pereiro", 173, "England", "FORWARD", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Patrizius Frediani", "1986-08-15", "Sylvan Lake", 169, "Germany", "GOALKEEPER", "RIGHT", "Everton FC"));
			playerService.insert(new PlayerDto("Lynn Zettler", "2003-11-07", "Alpedrinha", 183, "England", "FORWARD", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Zebulon Garric", "1991-04-08", "Clermont-Ferrand", 169, "England", "DEFENDER", "LEFT", "Valencia CF"));
			playerService.insert(new PlayerDto("Sheffie Donneely", "1996-02-16", "San Isidro de Lules", 179, "Spain", "DEFENDER", "LEFT", "Valencia CF"));
			playerService.insert(new PlayerDto("Anet Thieme", "1994-02-23", "Kamieniec", 186, "Spain", "MIDFIELDER", "RIGHT", "Real Madrid"));
			playerService.insert(new PlayerDto("Alister Iorns", "1986-05-25", "Valença do Piauí", 169, "Italy", "FORWARD", "BOTH", "Leicester City"));
			playerService.insert(new PlayerDto("Lizette Sorsby", "2000-09-04", "Sophia Antipolis", 186, "England", "GOALKEEPER", "LEFT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Janos Wetherell", "2001-09-05", "Mont-Joli", 172, "Germany", "DEFENDER", "BOTH", "Manchester United"));
			playerService.insert(new PlayerDto("Alonzo Plewes", "1990-03-17", "Quarteira", 175, "England", "MIDFIELDER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Samuel Umtiti", "2002-04-04", "Alegre", 174, "Italy", "DEFENDER", "LEFT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Chrysler Attoc", "1995-10-17", "Maceió", 178, "Italy", "GOALKEEPER", "LEFT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Sully Thorby", "1986-06-07", "Powassan", 184, "Germany", "FORWARD", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Eugene Restill", "1995-10-10", "Resende", 170, "England", "FORWARD", "LEFT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Rodrique Haworth", "1990-09-08", "Banzão", 179, "England", "MIDFIELDER", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Van Buckenhill", "2001-11-21", "Aranhas", 169, "England", "DEFENDER", "BOTH", "Arsenal FC"));
			playerService.insert(new PlayerDto("Delano Tousy", "1988-03-22", "Schroeder", 192, "Italy", "GOALKEEPER", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Frenkie de Jong", "1996-08-08", "Etten-Leur", 190, "Netherlands", "MIDFIELDER", "RIGHT", "FC Barcelona"));
			playerService.insert(new PlayerDto("Zena Bonar", "1993-08-19", "Paris 06", 165, "England", "GOALKEEPER", "RIGHT", "Manchester United"));
			playerService.insert(new PlayerDto("Kelby Rosso", "2000-09-07", "Argentan", 189, "England", "DEFENDER", "RIGHT", "Valencia CF"));
			playerService.insert(new PlayerDto("Agosto Thing", "1996-09-03", "Caeté", 186, "Italy", "GOALKEEPER", "BOTH", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Tildi Mackerel", "1993-02-06", "Huesca", 165, "Spain", "GOALKEEPER", "BOTH", "Sevilla FC"));
			playerService.insert(new PlayerDto("Leslie Lantiffe", "1996-07-11", "Vaudreuil-Dorion", 165, "Germany", "GOALKEEPER", "BOTH", "Sevilla FC"));
			playerService.insert(new PlayerDto("Darb Kiehl", "1990-03-29", "Oro Verde", 180, "Spain", "DEFENDER", "BOTH", "Leicester City"));
			playerService.insert(new PlayerDto("Wenonah Shanahan", "2002-09-05", "Barreiras", 194, "Italy", "DEFENDER", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Carree Pashler", "1989-06-15", "Londres", 167, "Spain", "DEFENDER", "LEFT", "Manchester United"));
			playerService.insert(new PlayerDto("Carita MacNeil", "1996-09-25", "Ortigueira", 191, "Italy", "MIDFIELDER", "LEFT", "Leicester City"));
			playerService.insert(new PlayerDto("Noel Sparks", "1999-05-30", "Goianésia", 180, "Italy", "GOALKEEPER", "BOTH", "Sevilla FC"));
			playerService.insert(new PlayerDto("Jena Hebble", "2001-07-07", "Pontevedra", 193, "Spain", "DEFENDER", "RIGHT", "Arsenal FC"));
			playerService.insert(new PlayerDto("Rowena Le Hucquet", "1990-10-28", "Lipnica", 195, "Spain", "FORWARD", "LEFT", "AC Milan"));
			playerService.insert(new PlayerDto("Cathrin Phalip", "1999-08-19", "Carbonear", 167, "Germany", "DEFENDER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Grissel Adshad", "1998-01-08", "Ipaba", 182, "Italy", "DEFENDER", "LEFT", "Inter Milan"));
			playerService.insert(new PlayerDto("Lizzy Seden", "2002-12-02", "Jaguarão", 173, "Italy", "DEFENDER", "RIGHT", "Leicester City"));
			playerService.insert(new PlayerDto("Rurik Roullier", "1989-10-18", "Wetzlar", 190, "Germany", "GOALKEEPER", "BOTH", "Everton FC"));
			playerService.insert(new PlayerDto("Timmi Acklands", "1989-01-04", "Langres", 166, "England", "DEFENDER", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Irvin Handmore", "2001-07-16", "Eira Nova", 179, "England", "DEFENDER", "BOTH", "AC Milan"));
			playerService.insert(new PlayerDto("Leland Greasty", "2001-07-05", "Penápolis", 180, "Italy", "DEFENDER", "BOTH", "Sevilla FC"));
			playerService.insert(new PlayerDto("Elberta Puddefoot", "1995-10-04", "Siemiatycze", 174, "Spain", "FORWARD", "RIGHT", "Everton FC"));
			playerService.insert(new PlayerDto("Tessi Doolan", "1987-06-17", "Congonhas", 189, "Italy", "FORWARD", "RIGHT", "Manchester City"));
			playerService.insert(new PlayerDto("Lyndel Toy", "1986-04-02", "Diadema", 180, "Italy", "DEFENDER", "RIGHT", "Juventus FC"));
			playerService.insert(new PlayerDto("Hermine Simonetto", "2003-10-22", "Rolante", 187, "Italy", "GOALKEEPER", "LEFT", "Manchester United"));
			playerService.insert(new PlayerDto("Uriah OMoylane", "2003-10-05", "Torre", 170, "England", "GOALKEEPER", "RIGHT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Emylee Mulder", "1988-11-07", "Igarapé Miri", 166, "Italy", "DEFENDER", "RIGHT", "Leicester City"));
			playerService.insert(new PlayerDto("Harlin Mallinar", "1998-01-29", "Miedzichowo", 192, "Spain", "MIDFIELDER", "RIGHT", "Atletico Madrid"));
			playerService.insert(new PlayerDto("Dion Blaske", "1993-09-02", "Toulouse", 191, "England", "FORWARD", "LEFT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Gail Cobbing", "2001-06-09", "Alvito de São Pedro", 180, "England", "GOALKEEPER", "BOTH", "Chelsea FC"));
			playerService.insert(new PlayerDto("Erl Oowne", "1993-07-06", "Kłoczew", 190, "Spain", "FORWARD", "LEFT", "Liverpool FC"));
			playerService.insert(new PlayerDto("Ariela Spear", "1994-07-23", "Nozdrzec", 186, "Spain", "DEFENDER", "RIGHT", "AC Milan"));
			playerService.insert(new PlayerDto("Bette Mitham", "1997-03-13", "Guararapes", 168, "Italy", "MIDFIELDER", "RIGHT", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Sosanna Kitney", "1993-01-19", "Pantano do Sul", 180, "Italy", "FORWARD", "BOTH", "AC Milan"));
			playerService.insert(new PlayerDto("Puff Rimour", "1991-12-12", "General Guido", 193, "Spain", "FORWARD", "RIGHT", "Bayern Munich"));
			playerService.insert(new PlayerDto("Benetta Pumfrett", "1987-08-21", "Rzeszów", 184, "Spain", "GOALKEEPER", "RIGHT", "Sevilla FC"));
			playerService.insert(new PlayerDto("Ara Coaten", "1990-11-21", "Kalej", 183, "Spain", "MIDFIELDER", "LEFT", "Juventus FC"));
			playerService.insert(new PlayerDto("Ebba Sailor", "2000-12-29", "Wasquehal", 189, "England", "DEFENDER", "BOTH", "Borussia Dortmund"));
			playerService.insert(new PlayerDto("Janella Tegeller", "1998-09-16", "Pępowo", 189, "Spain", "DEFENDER", "BOTH", "Borussia Dortmund"));
		};
	}
}
