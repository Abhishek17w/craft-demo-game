//package com.gamingservice.craftdemo.controller;
//
//import java.util.Arrays;
//
//import com.gamingservice.craftdemo.entity.Game;
//import com.gamingservice.craftdemo.service.GameService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = GameController.class)
//public class GameControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private GameService gameService;
//
//    Game mockGame = new Game();
//
//    @Test
//    public void retrieveDetailsForCourse() throws Exception {
//
//        Mockito.when(
//                gameService.play(Mockito.any()).thenReturn(mockGame);
//
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
//                "/students/Student1/courses/Course1").accept(
//                MediaType.APPLICATION_JSON);
//
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//
//        System.out.println(result.getResponse());
//        String expected = "{id:Course1,name:Spring,description:10Steps}";
//
//        // {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}
//
//        JSONAssert.assertEquals(expected, result.getResponse()
//                .getContentAsString(), false);
//    }
//
//}
