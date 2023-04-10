package org.onedatashare.TransferSchedulerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class TransferSchedulerServiceApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

	private Credential credential;

	public TransferSchedulerServiceApplication (Credential credential)
	{
		this.credential = credential;
	}

	public static void main(String[] args) {

		SpringApplication.run(TransferSchedulerServiceApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("__________________________");
		logger.info("creds are"+ credential.getUsername() + credential.getPassword());
		logger.info("__________________________");

	}
}
