package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository, ShipRepository shipRepository, SalvoRepository salvoRepository) {
		return (args) -> {
			Player player1 = new Player("j.bauer@ctu.gov");
			Player player2 = new Player("c.obrian@ctu.gov");
			Player player3 = new Player("t.almeida@ctu.gov");
			Player player4 = new Player("d.palmer@whitehouse.gov");
			playerRepository.save(player1);
			playerRepository.save(player2);
			playerRepository.save(player3);
			playerRepository.save(player4);

			Game game1 = new Game( LocalDateTime.now());
			Game game2 = new Game( LocalDateTime.now().plusHours(1));
			Game game3 = new Game( LocalDateTime.now().plusHours(2));
			Game game4 = new Game( LocalDateTime.now().plusHours(3));
			Game game5 = new Game( LocalDateTime.now().plusHours(4));
			Game game6 = new Game( LocalDateTime.now().plusHours(5));
			gameRepository.save(game1);
			gameRepository.save(game2);
			gameRepository.save(game3);
			gameRepository.save(game4);
			gameRepository.save(game5);
			gameRepository.save(game6);

			GamePlayer gamePlayers1 = new GamePlayer(game1, player1, LocalDateTime.now());
			GamePlayer gamePlayers2 = new GamePlayer(game1, player2, LocalDateTime.now());
			GamePlayer gamePlayers3 = new GamePlayer(game2, player1, LocalDateTime.now().plusHours(1));
			GamePlayer gamePlayers4 = new GamePlayer(game2, player2, LocalDateTime.now().plusHours(1));
			GamePlayer gamePlayers5 = new GamePlayer(game3, player2, LocalDateTime.now().plusHours(2));
			GamePlayer gamePlayers6 = new GamePlayer(game3, player3, LocalDateTime.now().plusHours(2));
			GamePlayer gamePlayers7 = new GamePlayer(game4, player1, LocalDateTime.now().plusHours(3));
			GamePlayer gamePlayers8 = new GamePlayer(game4, player3, LocalDateTime.now().plusHours(3));
			GamePlayer gamePlayers9 = new GamePlayer(game5, player3, LocalDateTime.now().plusHours(4));
			GamePlayer gamePlayers10 = new GamePlayer(game5, player1, LocalDateTime.now().plusHours(4));
			GamePlayer gamePlayers11 = new GamePlayer(game6, player4, LocalDateTime.now().plusHours(5));
			gamePlayerRepository.save(gamePlayers1);
			gamePlayerRepository.save(gamePlayers2);
			gamePlayerRepository.save(gamePlayers3);
			gamePlayerRepository.save(gamePlayers4);
			gamePlayerRepository.save(gamePlayers5);
			gamePlayerRepository.save(gamePlayers6);
			gamePlayerRepository.save(gamePlayers7);
			gamePlayerRepository.save(gamePlayers8);
			gamePlayerRepository.save(gamePlayers9);
			gamePlayerRepository.save(gamePlayers10);
			gamePlayerRepository.save(gamePlayers11);

			Ship ship1 = new Ship("Destroyer", gamePlayers1, Arrays.asList("H1", "H2"));
			Ship ship2 = new Ship("Cruiser", gamePlayers1, Arrays.asList("H5", "H6", "H7"));
			Ship ship3= new Ship("Carrier", gamePlayers1, Arrays.asList("A1" , "A2", "A3", "A4", "A5"));
			Ship ship4= new Ship("Battleship", gamePlayers1, Arrays.asList("B1", "B2", "B3", "B4"));
			Ship ship5= new Ship("Submarine", gamePlayers1, Arrays.asList("D1", "E1", "F1"));
			Ship ship6= new Ship("Destroyer", gamePlayers2, Arrays.asList("A1", "A2"));
			Ship ship7= new Ship("Cruiser", gamePlayers2, Arrays.asList("C1", "C2", "C3"));
			Ship ship8= new Ship("Carrier", gamePlayers2, Arrays.asList("A7" , "B7", "C7", "D7", "E7"));
			Ship ship9= new Ship("Battleship", gamePlayers2, Arrays.asList("F1", "F2", "F3", "F4"));
			Ship ship10= new Ship("Submarine", gamePlayers2, Arrays.asList("D1", "D2", "D3"));
			shipRepository.save(ship1);
			shipRepository.save(ship2);
			shipRepository.save(ship3);
			shipRepository.save(ship4);
			shipRepository.save(ship5);
			shipRepository.save(ship6);
			shipRepository.save(ship7);
			shipRepository.save(ship8);
			shipRepository.save(ship9);
			shipRepository.save(ship10);

			Salvo salvo1 = new Salvo(1, gamePlayers1, Arrays.asList("A1", "H8", "D4", "A8", "H1"));
			Salvo salvo2 = new Salvo(2, gamePlayers1, Arrays.asList("H1", "H2", "H5", "H6", "H7"));
			Salvo salvo3 = new Salvo(1, gamePlayers2, Arrays.asList("G1", "G2", "G3", "G4", "G5"));
			Salvo salvo4 = new Salvo(2, gamePlayers2, Arrays.asList("A1", "A2", "A3", "A4", "A5"));
			salvoRepository.save(salvo1);
			salvoRepository.save(salvo2);
			salvoRepository.save(salvo3);
			salvoRepository.save(salvo4);
		};
	}
}
