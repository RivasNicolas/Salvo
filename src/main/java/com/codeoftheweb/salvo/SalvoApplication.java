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
	public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository, ShipRepository shipRepository) {
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
			shipRepository.save(ship1);
			shipRepository.save(ship2);
		};
	}
}
