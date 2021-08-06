package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository) {
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
			GamePlayer gamePlayer1 = new GamePlayer(game1, player1, LocalDateTime.now());
			GamePlayer gamePlayer2 = new GamePlayer(game1, player2, LocalDateTime.now());
			GamePlayer gamePlayer3 = new GamePlayer(game2, player1, LocalDateTime.now().plusHours(1));
			GamePlayer gamePlayer4 = new GamePlayer(game2, player2, LocalDateTime.now().plusHours(1));
			GamePlayer gamePlayer5 = new GamePlayer(game3, player2, LocalDateTime.now().plusHours(2));
			GamePlayer gamePlayer6 = new GamePlayer(game3, player3, LocalDateTime.now().plusHours(2));
			GamePlayer gamePlayer7 = new GamePlayer(game4, player1, LocalDateTime.now().plusHours(3));
			GamePlayer gamePlayer8 = new GamePlayer(game4, player3, LocalDateTime.now().plusHours(3));
			GamePlayer gamePlayer9 = new GamePlayer(game5, player3, LocalDateTime.now().plusHours(4));
			GamePlayer gamePlayer10 = new GamePlayer(game5, player1, LocalDateTime.now().plusHours(4));
			GamePlayer gamePlayer11 = new GamePlayer(game6, player4, LocalDateTime.now().plusHours(5));
			gamePlayerRepository.save(gamePlayer1);
			gamePlayerRepository.save(gamePlayer2);
			gamePlayerRepository.save(gamePlayer3);
			gamePlayerRepository.save(gamePlayer4);
			gamePlayerRepository.save(gamePlayer5);
			gamePlayerRepository.save(gamePlayer6);
			gamePlayerRepository.save(gamePlayer7);
			gamePlayerRepository.save(gamePlayer8);
			gamePlayerRepository.save(gamePlayer9);
			gamePlayerRepository.save(gamePlayer10);
			gamePlayerRepository.save(gamePlayer11);
		};
	}
}
