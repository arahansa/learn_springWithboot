package com.example.learn.web.conversion.converter;

import org.springframework.core.convert.converter.Converter;

import com.example.learn.web.conversion.Level;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by arahansa on 2015-12-01.
 */
@Slf4j
public class StringToLevel implements Converter<String, Level> {
    @Override
    public Level convert(String source) {

        log.debug(" trying convert .. :: {}", source);
        return Level.valueOf(Integer.parseInt(source));
    }
}
