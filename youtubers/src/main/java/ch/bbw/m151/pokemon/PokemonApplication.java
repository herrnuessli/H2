package ch.bbw.m151.pokemon;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		// connectable on: jdbc:h2:tcp://localhost:9090/mem:mydb
		return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8090");
	}


}
