package com.example.learn.web.conversion.converter;
import org.springframework.core.convert.converter.Converter;

import com.example.learn.web.conversion.Level;
public class LevelToStringConverter implements Converter<Level, String> {
    @Override
    public String convert(Level source) {
        return String.valueOf(source.intValue());
    }
}
