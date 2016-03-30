package com.example.learn.config;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@ConfigurationProperties(prefix = "testConfig")
@Data
public class PropertyGetConfig {
	
	@PostConstruct
	public void show(){
		log.info("db : {} , slack  : {} ",db,slack);
	}
	
	private Database db;
	private Slack slack;
	
	@Data
	public static class Slack {
		private boolean enabled;
		private String webHookUrl;
		private String channel;
	}
	
	@Data
	public static class Database {
		private boolean enabled;
	}
}
