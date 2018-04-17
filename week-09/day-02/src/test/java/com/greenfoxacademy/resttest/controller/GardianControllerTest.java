package com.greenfoxacademy.resttest.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class GardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootTestWithMessage() throws Exception {
    mockMvc
            .perform(get("/groot?message=haliho")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received").value("haliho"))
            .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void grootTestWithoutMessage() throws Exception {
    mockMvc
            .perform(get("/groot")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void yonduTestWithParameters() throws Exception {
    mockMvc
            .perform(get("/yondu?distance=100.0&time=10.0")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance").value(100.0))
            .andExpect(jsonPath("$.time").value(10.0))
            .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void yonduTestWithTime0() throws Exception {
    mockMvc
            .perform(get("/yondu?distance=100.0&time=0.0")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance").value(100.0))
            .andExpect(jsonPath("$.time").value(0.0))
            .andExpect(jsonPath("$.speed").value("Infinity"));
  }

  @Test
  public void yonduTestWithoutParameters() throws Exception {
    mockMvc
            .perform(get("/yondu")
                    .contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.error").value("There is no input parameter"));

  }
}