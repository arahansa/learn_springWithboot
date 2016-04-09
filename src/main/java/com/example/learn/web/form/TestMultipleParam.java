package com.example.learn.web.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TestMultipleParam {
	int age;
	List<String> testList = new ArrayList<>();
}
