package com.memberList;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.memberList.service.MemberService;

@SpringBootApplication
public class BasicMemberApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BasicMemberApplication.class, args);
		
	}

}
