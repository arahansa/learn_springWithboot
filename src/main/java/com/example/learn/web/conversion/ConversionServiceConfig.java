package com.example.learn.web.conversion;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

import com.example.learn.web.conversion.converter.LevelToStringConverter;
import com.example.learn.web.conversion.converter.StringToLevel;

@Configuration
public class ConversionServiceConfig {
	
	@Bean
	public ConversionServiceFactoryBean conversionServiceFactoryBean(){
		ConversionServiceFactoryBean csfb = new ConversionServiceFactoryBean();
		Set<Converter> converts = new HashSet<>();
		converts.add(new LevelToStringConverter());
		converts.add(new StringToLevel());
		csfb.setConverters(converts);
		return csfb;
	}

}
