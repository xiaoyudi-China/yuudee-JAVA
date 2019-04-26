package com.dkd.manage;import com.dkd.XiaoyudiApplication;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.http.HttpMethod;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;import org.springframework.transaction.annotation.Transactional;import java.util.HashMap;import java.util.Map;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class SentenceControllerTest {    private final Logger logger = LoggerFactory.getLogger(SentenceControllerTest.class);    private MockMvc mockMvc;    @Autowired    private SentenceController sentenceController;    private String reqUrl = "/manage/sentence";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(sentenceController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void toNoumTrainingPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl + "/toSentenceResolveTrainingPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toNoumTrainingPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toNoumTrainingPage result:" + result);    }    @Test    public void toSentencegroupTrainingPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl + "/toSentenceGroupTrainingPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toSentencegroupTrainingPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toSentencegroupTrainingPage result:" + result);    }    @Test    public void toVerbTestPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl + "/toSentenceResolveTestPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toVerbTestPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toVerbTestPage result:" + result);    }    @Test    public void sentenceGroupTrainingPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST,reqUrl + "/toSentenceGroupTestPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====sentenceGroupTrainingPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====sentenceGroupTrainingPage result:" + result);    }    @Test    public void jiaoyan() throws Exception{    }    @Test    public void toAddSentenceGroupTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAddSentenceGroupTraining")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAddSentenceGroupTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAddSentenceGroupTraining result:" + result);    }    @Test    public void toAddSentenceGroupTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAddSentenceGroupTest")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAddSentenceGroupTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAddSentenceGroupTest result:" + result);    }    @Test    public void toCheckSentenceResolveTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toCheckSentenceResolveTest")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toCheckSentenceResolveTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toCheckSentenceResolveTest result:" + result);    }    @Test    public void toCheckSentenceResolveTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toCheckSentenceResolveTraining")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toCheckSentenceResolveTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toCheckSentenceResolveTraining result:" + result);    }    @Test    public void toAddSentenceResolveTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAddSentenceResolveTest")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAddSentenceResolveTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAddSentenceResolveTest result:" + result);    }    @Test    public void toAddSentenceResolveTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/toAddSentenceResolveTraining")                .param("id", "1")        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toAddSentenceResolveTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toAddSentenceResolveTraining result:" + result);    }    @Test    public void getSentenceResolveTrainingList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getSentenceResolveTrainingList")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getSentenceResolveTrainingList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getSentenceResolveTrainingList result:" + result);    }    @Test    public void addSentenceResolveTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/addSentenceResolveTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====addSentenceResolveTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====addSentenceResolveTraining result:" + result);    }    @Test    public void deleteSentenceResolveTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/deleteSentenceResolveTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====deleteSentenceResolveTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====deleteSentenceResolveTraining result:" + result);    }    @Test    public void updateSentenceResolveTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/updateSentenceResolveTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====updateSentenceResolveTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====updateSentenceResolveTraining result:" + result);    }    @Test    public void sentenceResolveTrainingDetail() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/SentenceResolveTrainingDetail"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====SentenceResolveTrainingDetail mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====SentenceResolveTrainingDetail result:" + result);    }    @Test    public void getSentenceResolveTestList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getSentenceResolveTestList")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getSentenceResolveTestList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getSentenceResolveTestList result:" + result);    }    @Test    public void addSentenceResolveTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/addSentenceResolveTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====addSentenceResolveTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====addSentenceResolveTest result:" + result);    }    @Test    public void deleteSentenceResolveTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/deleteSentenceResolveTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====deleteSentenceResolveTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====deleteSentenceResolveTest result:" + result);    }    @Test    public void updateSentenceResolveTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/updateSentenceResolveTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====updateSentenceResolveTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====updateSentenceResolveTest result:" + result);    }    @Test    public void sentenceResolveTestDetail() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/SentenceResolveTestDetail"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====SentenceResolveTestDetail mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====SentenceResolveTestDetail result:" + result);    }    @Test    public void getSentencegroupTrainingList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getSentencegroupTrainingList")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getSentencegroupTrainingList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getSentencegroupTrainingList result:" + result);    }    @Test    public void addSentencegroupTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/addSentenceGroupTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====addSentenceGroupTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====addSentenceGroupTraining result:" + result);    }    @Test    public void deleteSentencegroupTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/deleteSentenceGroupTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====deleteSentenceGroupTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====deleteSentenceGroupTraining result:" + result);    }    @Test    public void updateSentencegroupTraining() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/updateSentenceGroupTraining"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====updateSentenceGroupTraining mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====updateSentenceGroupTraining result:" + result);    }    @Test    public void sentencegroupTrainingDetail() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/sentencegroupTrainingDetail"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====sentencegroupTrainingDetail mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====sentencegroupTrainingDetail result:" + result);    }    @Test    public void getSentenceGroupTestList() throws Exception{        Map<String, String> params = new HashMap<String, String>(){{            put("start", "1");            put("length", "10");        }};        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/getSentencegroupTestList")                .param("params", params.toString())        );        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getSentencegroupTestList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getSentencegroupTestList result:" + result);    }    @Test    public void addSentencegroupTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/addSentenceGroupTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====addSentenceGroupTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====addSentenceGroupTest result:" + result);    }    @Test    public void deleteSentencegroupTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/deleteSentencegroupTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====deleteSentencegroupTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====deleteSentencegroupTest result:" + result);    }    @Test    public void updateSentencegroupTest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/updateSentenceGroupTest"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====updateSentenceGroupTest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====updateSentenceGroupTest result:" + result);    }    @Test    public void sentencegroupTestDetail() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET,reqUrl + "/sentencegroupTestDetail"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====sentencegroupTestDetail mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====sentencegroupTestDetail result:" + result);    }}