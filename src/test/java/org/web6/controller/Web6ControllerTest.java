package org.web6.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class Web6ControllerTest {

	MockMvc mockMvc;
	
	Web6Controller controller = new Web6Controller();

	@Before
	public void setup() {
		System.out.println("----1-");
		this.mockMvc = standaloneSetup(controller).build();
		System.out.println("----2-");
	}
	@Test
	public void thatTextReturned() throws Exception {
		System.out.println("----3-");
		mockMvc.perform(get("/json"))
		.andDo(print())
		.andExpect(content().string("{\"id\":1,\"content\":\"Hello, World!\"}"));
		System.out.println("----4-");
	}

}
