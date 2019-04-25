package com.dkd.manage;import com.dkd.XiaoyudiApplication;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.http.HttpMethod;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;import org.springframework.transaction.annotation.Transactional;import java.util.HashMap;import java.util.Map;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class QuestionControllerTest {    private final Logger logger = LoggerFactory.getLogger(QuestionControllerTest.class);    private MockMvc mockMvc;    @Autowired    private QuestionController questionController;    private String reqUrl = "/manage/roll";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(questionController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void toPcdiList() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toPcdiList"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toPcdiList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toPcdiList result:" + result);    }    @Test    public void toPcdiInfo() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toPcdiAddPage")                .param("ids","1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toPcdiInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toPcdiInfo result:" + result);    }    @Test    public void addPcdiMust() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl + "/addPcdi/Must")                .param("nameEnum","1")                .param("topicTitle","topicTitle")                .param("describes","describes")                .param("topicResult","topicResult")                .param("score","1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====addPcdiMust mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====addPcdiMust result:" + result);    }    @Test    public void getIntroduceList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getpcdiMustList.ajax")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getIntroduceList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getIntroduceList result:" + result);    }    @Test    public void toPcdidelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toPcdidelete"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toPcdidelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toPcdidelete result:" + result);    }    @Test    public void toPcdiSelectList() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toPcdiSelectList"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toPcdiSelectList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toPcdiSelectList result:" + result);    }    @Test    public void getpcdiSelectList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getpcdiSelectList.ajax")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getpcdiSelectList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getpcdiSelectList result:" + result);    }    @Test    public void pcdiSelectDelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toPcdiSelectDelete"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====pcdiSelectDelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====pcdiSelectDelete result:" + result);    }    @Test    public void toPcdiSelectAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/PcdiSelectAdd"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toPcdiSelectAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toPcdiSelectAdd result:" + result);    }    @Test    public void toAbcPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toAbcListPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAbcPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAbcPage result:" + result);    }    @Test    public void getAbcList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getAbcList.ajax")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getAbcList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getAbcList result:" + result);    }    @Test    public void toAbcDelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAbcDelete")                .param("id","1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAbcDelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAbcDelete result:" + result);    }    @Test    public void toAbcAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAbcAdd")                .param("name","1")                .param("sort","1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAbcAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAbcAdd result:" + result);    }    @Test    public void toResultPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/topcdiAndabc/resultPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toResultPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toResultPage result:" + result);    }    @Test    public void getresultList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getresultList.ajax")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getresultList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getresultList result:" + result);    }    @Test    public void resultInfoPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/topcdiAndabc/resultInfoPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====resultInfoPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====resultInfoPage result:" + result);    }    @Test    public void toResultPage1() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/topcdiAndabc/resultInfo"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toResultPage1 mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toResultPage1 result:" + result);    }    @Test    public void adviceInfo() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/topcdiAndabc/adviceInfo"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====adviceInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====adviceInfo result:" + result);    }    @Test    public void adviceupdate() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/topcdiAndabc/adviceupdate"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====adviceupdate mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====adviceupdate result:" + result);    }    @Test    public void toWordListPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toWordListPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toWordListPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toWordListPage result:" + result);    }    @Test    public void toWordList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toWordList.ajax")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toWordList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toWordList result:" + result);    }    @Test    public void toWordInfoPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get(reqUrl + "/toWordInfoPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toWordInfoPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toWordInfoPage result:" + result);    }    @Test    public void wordDelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/wordDelete")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====wordDelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====wordDelete result:" + result);    }    @Test    public void wordAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/wordAdd")                .param("type", "1")                .param("isOptional", "1")                .param("state", "1")                .param("end", "1")                .param("content", "content")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====wordAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====wordAdd result:" + result);    }    @Test    public void deleteSession() throws Exception{    }    @Test    public void checkWebUserLogin() throws Exception{    }    @Test    public void getPageNum() throws Exception{    }    @Test    public void getPageSize() throws Exception{    }    @Test    public void getDraw() throws Exception{    }    @Test    public void setHttpServletResponse() throws Exception{    }    @Test    public void setHttpServletResponse1() throws Exception{    }}