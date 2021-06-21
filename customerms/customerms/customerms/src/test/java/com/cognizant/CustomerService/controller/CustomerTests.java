package com.cognizant.CustomerService.controller;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cognizant.customerservice.CustomerServiceApplication;
import com.cognizant.customerservice.controller.CustomerController;
import com.cognizant.customerservice.exception.ConsumerAlreadyExistException;
import com.cognizant.customerservice.model.AppUser;
import com.cognizant.customerservice.model.CustomerEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CustomerServiceApplication.class })
 public class CustomerTests {

	public String token ="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJFbXBsb3llZSIsImV4cCI6MTYxNjY5MzEwNCwiaWF0IjoxNjE2NjkxMzA0fQ._OoNumEfxD790xZXT33LvbGEbEhEmOWMoWO8ADLuzZg";
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wc;
	
	@Autowired
	CustomerController controller;

	List<AppUser> employees = new ArrayList<AppUser>();
	static ObjectMapper mapper = new ObjectMapper();

	@Before
	public void setUp() throws JsonProcessingException, Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
	}

	@Test
	public void saveCustomer() throws JsonProcessingException, Exception {
		System.err.println(token);
		CustomerEntity menu = null;
		String json = mapper.writeValueAsString(menu);
		MvcResult andReturn = mockMvc
				.perform(MockMvcRequestBuilders.post("/createCustomer").header("Authorization", "Bearer " + token)
						.content(json).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is(400)).andReturn();

	}

	
	@Test
	public void customerAlreadyExist() {
		ConsumerAlreadyExistException e1 = new ConsumerAlreadyExistException("hi");
		ConsumerAlreadyExistException e2 = new ConsumerAlreadyExistException("hi");
		assertThat(e1).isNotEqualTo(e2);
	}
	
}