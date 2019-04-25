package com.dkd.api;import com.dkd.XiaoyudiApplication;import net.sf.json.JSONObject;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.http.HttpMethod;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;import org.springframework.transaction.annotation.Transactional;import org.springframework.web.context.WebApplicationContext;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class,properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class AppStatisticsControllerTest {    private final Logger logger = LoggerFactory.getLogger(AppStatisticsControllerTest.class);    @Autowired    private WebApplicationContext webApplicationContext;    private MockMvc mockMvc;    private String reqUrl = "/app/statistics";    private String loginReqUrl = "/app/user";    private  String token;    private  String mobile="18564656666";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.post(loginReqUrl + "/generalLogin")                        .param("phone",mobile)                        .param("password","123456")                        .param("qcellcoreId","1")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result :" + result);        JSONObject jsonObject = JSONObject.fromObject(result);        String  tokenJson =  jsonObject.optString("data");        String parents =  JSONObject.fromObject(tokenJson).optString("parents");        token =  JSONObject.fromObject(parents).optString("token");        logger.info("=====generalLogin result token:" + token);    }    @Test    public void getNounDayInfo() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/dayInfo")                        .param("token",token)                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounDayInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounDayInfo result:" + result);    }    @Test    public void getNounDayInfo1() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/dayInfo")                        .param("token","")                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounDayInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounDayInfo result:" + result);    }    @Test    public void getNounDayInfo2() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/dayInfo")                        .param("token",token)                        .param("scene","")                        .param("module","")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounDayInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounDayInfo result:" + result);    }    @Test    public void getNounWeekInfo() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/weekInfo")                        .param("token",token)                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounWeekInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounWeekInfo result:" + result);    }    @Test    public void getNounWeekInfo1() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/weekInfo")                        .param("token","")                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounWeekInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounWeekInfo result:" + result);    }    @Test    public void getNounWeekInfo2() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/weekInfo")                        .param("token",token)                        .param("scene","")                        .param("module","")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounWeekInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounWeekInfo result:" + result);    }    @Test    public void getNounMonthInfo() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/monthInfo")                        .param("token",token)                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounMonthInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounMonthInfo result:" + result);    }    @Test    public void getNounMonthInfo2() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/monthInfo")                        .param("token","")                        .param("scene","1")                        .param("module","1")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounMonthInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounMonthInfo result:" + result);    }    @Test    public void getNounMonthInfo3() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/totalInfo")                        .param("token",token)                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounMonthInfo1 mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounMonthInfo1 result:" + result);    }    @Test    public void getNounMonthInfo4() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/totalInfo")                        .param("token","")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounMonthInfo1 mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounMonthInfo1 result:" + result);    }    @Test    public void getNounMonthInfo5() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/noun/totalInfo")                        .param("token","12312")                );        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====getNounMonthInfo1 mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====getNounMonthInfo1 result:" + result);    }}