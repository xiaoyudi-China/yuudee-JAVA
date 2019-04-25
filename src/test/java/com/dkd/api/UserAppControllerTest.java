package com.dkd.api;import com.xfkj.XiaoyudiApplication;import com.xfkj.api.UserAppController;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.http.HttpMethod;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class,properties = "/application.properties")@AutoConfigureMockMvcpublic class UserAppControllerTest {    private final Logger logger = LoggerFactory.getLogger(UserAppControllerTest.class);    private MockMvc mockMvc;    @Autowired    private UserAppController userAppController;    private String reqUrl = "/app/user";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(userAppController).build();    }    @Test    public void testResd() throws Exception {        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl+"/testRedis")                        .param("mxg","token")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getNounDayInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getNounDayInfo result:" + result);    }    @Test    public void phoneIsRegister() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void registerSendCode() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void registerCodeverify() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void userRegister() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    // token sK5bS68IyDHn3LcmtEoUoA==    @Test    public void generalLogin() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin")                        .param("phone","17795591253")                        .param("password","123456")                        .param("qcellcoreId","1")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void shortcutLoginSendCode() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST, reqUrl + "/shortcutLoginSend")                        .param("phone", "17795591253")                        .param("qcellcoreId", "1")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void image() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.request(HttpMethod.POST, reqUrl + "/verify/imageCode")                        .param("imageCode", "123455")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void shortcutLogin() throws Exception{        ResultActions resultActions = this.mockMvc.                perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin")                        .param("phone", "17795591253")                        .param("password", "123456")                        .param("qcellcoreId", "1")                );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void sendCode() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void resetPassword() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updatePassword() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void addChild() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updateChildInfo() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updatePhone() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updatePhone1() throws Exception{    }    @Test    public void getChilInfo() throws Exception{    }}