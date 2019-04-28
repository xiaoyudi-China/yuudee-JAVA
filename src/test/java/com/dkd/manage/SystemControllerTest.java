package com.dkd.manage;import com.dkd.XiaoyudiApplication;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.mock.web.MockMultipartFile;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;import org.springframework.transaction.annotation.Transactional;import java.util.Date;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class SystemControllerTest {    private final Logger logger = LoggerFactory.getLogger(SystemControllerTest.class);    private MockMvc mockMvc;    @Autowired    private SystemController systemController;    private String reqUrl = "/manage/system";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(systemController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void fileUpload() throws Exception {        MockMultipartFile firstFile = new MockMultipartFile("data", "filename.txt", "text/plain", "some xml".getBytes());        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.fileUpload(reqUrl + "/oss/fileUpload").file(firstFile));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====fileUpload mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====fileUpload result:" + result);    }    @Test    public void toStartPage() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toStrartPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toStartPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toStartPage result:" + result);    }    @Test    public void toStrartPageInfo() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toStrartPageInfo").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toStrartPageInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toStrartPageInfo result:" + result);    }    @Test    public void getStartPageList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/getStartPageList.ajax").param("start", "0").param("length", "10").param("states", "1").param("type","1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getStartPageList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getStartPageList result:" + result);    }    @Test    public void strartPageDelete() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/strartPageDelete").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====strartPageDelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====strartPageDelete result:" + result);        ResultActions resultActionsError = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/strartPageDelete").param("id", ""));        MvcResult mvcResultError = resultActionsError.andReturn();        logger.info("=====strartPageDeleteError mvcResult:" + mvcResultError.getResponse().getStatus());        String resultError = mvcResultError.getResponse().getContentAsString();        logger.info("=====strartPageDeleteError result:" + resultError);    }    @Test    public void strartPageAdd() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/strartPageAdd").param("id", "1").param("title", "123456").param("image", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====strartPageAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====strartPageAdd result:" + result);        ResultActions resultActionsParamsError = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/strartPageAdd").param("id", "1").param("title", "123456").param("image", ""));        MvcResult mvcResultParamsError = resultActionsParamsError.andReturn();        logger.info("=====strartPageAdd mvcResultParamsError:" + mvcResultParamsError.getResponse().getStatus());        String resultParamsError = mvcResultParamsError.getResponse().getContentAsString();        logger.info("=====strartPageAdd resultParamsError:" + resultParamsError);        ResultActions resultActionsAdd = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/strartPageAdd").param("id", "").param("title", "123456").param("image", "1"));        MvcResult mvcResultAdd = resultActionsAdd.andReturn();        logger.info("=====strartPageAdd mvcResultAdd:" + mvcResultAdd.getResponse().getStatus());        String resultAdd = mvcResultAdd.getResponse().getContentAsString();        logger.info("=====strartPageAdd resultAdd:" + resultAdd);    }    @Test    public void toIntroduceList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceList"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toIntroduceList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toIntroduceList result:" + result);    }    @Test    public void toIntroduceInfo() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceInfo").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toIntroduceInfo mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toIntroduceInfo result:" + result);    }    @Test    public void ckeditorUpload() throws Exception {        MockMultipartFile firstFile = new MockMultipartFile("upload", "filename.txt", "text/plain", "some xml".getBytes());        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.fileUpload(reqUrl + "/ckeditorUpload").file(firstFile));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====ckeditorUpload mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====ckeditorUpload result:" + result);    }    @Test    public void getIntroduceList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/getIntroduceList.ajax").param("start", "0").param("length", "10").param("states", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getIntroduceList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getIntroduceList result:" + result);    }    @Test    public void toIntroduceAdd() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceAdd").param("id", "16").param("type", "2").param("title", "12345").param("content", "abcde").param("versionId", "1"));        MvcResult mvcResult = resultActions.andReturn();        System.out.println("=====toIntroduceAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        System.out.println("=====toIntroduceAdd result:" + result);        ResultActions resultActionsAddParamsError = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceAdd").param("id", "").param("type", "2222").param("title", "12345").param("content", "abcde").param("versionId", "1"));        MvcResult mvcResultAddParamsError = resultActionsAddParamsError.andReturn();        System.out.println("=====toIntroduceAdd mvcResultAddParamsError:" + mvcResultAddParamsError.getResponse().getStatus());        String resultAddParamsError = mvcResultAddParamsError.getResponse().getContentAsString();        System.out.println("=====toIntroduceAdd resultAddParamsError:" + resultAddParamsError);        ResultActions resultActionsAdd = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceAdd").param("id", "").param("type", "33456").param("title", "12345").param("content", "abcde").param("versionId", "1"));        MvcResult mvcResultAdd = resultActionsAdd.andReturn();        System.out.println("=====toIntroduceAdd mvcResultAdd:" + mvcResultAdd.getResponse().getStatus());        String resultAdd = mvcResultAdd.getResponse().getContentAsString();        System.out.println("=====toIntroduceAdd resultAdd:" + resultAdd);        ResultActions resultActionsParamsError = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceAdd"));        MvcResult mvcResultParamsError = resultActionsParamsError.andReturn();        System.out.println("=====toIntroduceAdd mvcResultParamsError:" + mvcResultParamsError.getResponse().getStatus());        String resultParamsError = mvcResultParamsError.getResponse().getContentAsString();        System.out.println("=====toIntroduceAdd resultParamsError:" + resultParamsError);        ResultActions resultActionsFail = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toIntroduceAdd").param("id", "").param("type", String.valueOf(new Date().getTime())).param("title", "12345").param("content", "abcde").param("versionId", "1"));        MvcResult mvcResultFail = resultActionsFail.andReturn();        System.out.println("=====toIntroduceAdd mvcResultFail:" + mvcResultFail.getResponse().getStatus());        String resultFail = mvcResultFail.getResponse().getContentAsString();        System.out.println("=====toIntroduceAdd resultFail:" + resultFail);    }    @Test    public void introducedelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/Introducedelete").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====introducedelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====introducedelete result:" + result);        ResultActions resultActionsDeleteSuccess = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/Introducedelete").param("id", "16"));        MvcResult mvcResultDeleteSuccess = resultActionsDeleteSuccess.andReturn();        logger.info("=====introducedelete mvcResultDeleteSuccess:" + mvcResultDeleteSuccess.getResponse().getStatus());        String resultDeleteSuccess = mvcResultDeleteSuccess.getResponse().getContentAsString();        logger.info("=====introducedelete resultDeleteSuccess:" + resultDeleteSuccess);    }    @Test    public void getCityList() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/getCityList").param("level", "1").param("parentId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getCityList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getCityList result:" + result);    }    @Test    public void toVersionPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toVersionPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toVersionPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toVersionPage result:" + result);    }    @Test    public void getVersionList() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/getVersionList.ajax").param("start", "0").param("length", "10").param("states", "1").param("type","1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getVersionList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getVersionList result:" + result);    }    @Test    public void versionDelete() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionDelete").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====versionDelete mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====versionDelete result:" + result);        ResultActions resultActionsDeleteSuccess = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionDelete").param("id", "10"));        MvcResult mvcResultDeleteSuccess = resultActionsDeleteSuccess.andReturn();        logger.info("=====versionDelete mvcResultDeleteSuccess:" + mvcResultDeleteSuccess.getResponse().getStatus());        String resultDeleteSuccess = mvcResultDeleteSuccess.getResponse().getContentAsString();        logger.info("=====versionDelete resultDeleteSuccess:" + resultDeleteSuccess);    }    @Test    public void versionPageAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toAddVersionPage").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====versionPageAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====versionPageAdd result:" + result);    }    @Test    public void versionAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionAdd").param("id", "11").param("number", "111").param("type", "1").param("title", "1").param("download", "www.download.com"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====versionAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====versionAdd result:" + result);        ResultActions resultActionsVersionExist = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionAdd").param("id", "111").param("number", "1.0").param("type", "2").param("title", "1").param("download", "www.download.com"));        MvcResult mvcResultVersionExist = resultActionsVersionExist.andReturn();        logger.info("=====versionAdd mvcResultVersionExist:" + mvcResultVersionExist.getResponse().getStatus());        String resultVersionExist = mvcResultVersionExist.getResponse().getContentAsString();        logger.info("=====versionAdd resultVersionExist:" + resultVersionExist);        ResultActions resultActionsAddError = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionAdd").param("id", "").param("number", "13.0").param("type", "2").param("title", "1").param("download", "www.download.com"));        MvcResult mvcResultAddError = resultActionsAddError.andReturn();        logger.info("=====versionAdd mvcResultAddError:" + mvcResultAddError.getResponse().getStatus());        String resultAddError = mvcResultAddError.getResponse().getContentAsString();        logger.info("=====versionAdd resultAddError:" + resultAddError);        ResultActions resultActionsAddSuccess = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionAdd").param("id", "").param("number", String.valueOf(new Date().getTime())).param("type", "2").param("title", "12").param("download", "www.download1.com"));        MvcResult mvcResultAddSuccess = resultActionsAddSuccess.andReturn();        logger.info("=====versionAdd mvcResultAddSuccess:" + mvcResultAddSuccess.getResponse().getStatus());        String resultAddSuccess = mvcResultAddSuccess.getResponse().getContentAsString();        logger.info("=====versionAdd resultAddSuccess:" + resultAddSuccess);        ResultActions resultActionsGetFail = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/versionAdd").param("id", "99999").param("number", String.valueOf(new Date().getTime())).param("type", String.valueOf(new Date().getTime())).param("title", "12").param("download", "www.download1.com"));        MvcResult mvcResultGetFail = resultActionsGetFail.andReturn();        System.out.println("=====versionAdd mvcResultGetFail:" + mvcResultGetFail.getResponse().getStatus());        String resultGetFail = mvcResultGetFail.getResponse().getContentAsString();        System.out.println("=====versionAdd resultGetFail:" + resultGetFail);    }    @Test    public void toSuggestPage() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toSuggestPage"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toSuggestPage mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toSuggestPage result:" + result);    }    @Test    public void getSuggestList() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/getSuggestList.ajax").param("start", "0").param("length", "10").param("states", "1").param("type","1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====getVersionList mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====getVersionList result:" + result);    }    @Test    public void toSuggestAdd() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/toSuggestAdd").param("id", "11"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toSuggestAdd mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toSuggestAdd result:" + result);    }    @Test    public void toSuggestAdd1() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/uggestsDelete").param("id", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====toSuggestAdd1 mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====toSuggestAdd1 result:" + result);        ResultActions resultActionsDeleteSuccess = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/uggestsDelete").param("id", "10"));        MvcResult mvcResultDeleteSuccess = resultActionsDeleteSuccess.andReturn();        logger.info("=====toSuggestAdd1 mvcResultDeleteSuccess:" + mvcResultDeleteSuccess.getResponse().getStatus());        String resultDeleteSuccess = mvcResultDeleteSuccess.getResponse().getContentAsString();        logger.info("=====toSuggestAdd1 resultDeleteSuccess:" + resultDeleteSuccess);    }    @Test    public void insertSuggest() throws Exception{        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/insertSuggest").param("id", "10").param("phone", "1").param("qqun", "1").param("network", "1").param("weixin", "1").param("versionsId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====insertSuggest mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====insertSuggest result:" + result);        ResultActions resultActionsFail = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/insertSuggest").param("id", "1999999").param("phone", "1").param("qqun", "1").param("network", "1").param("weixin", "1").param("versionsId", "1"));        MvcResult mvcResultFail = resultActionsFail.andReturn();        System.out.println("=====insertSuggest mvcResultFail:" + mvcResultFail.getResponse().getStatus());        String resultFail = mvcResultFail.getResponse().getContentAsString();        System.out.println("=====insertSuggest resultFail:" + resultFail);        ResultActions resultActionsAdd = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/insertSuggest").param("id", "").param("phone", "1").param("qqun", "1").param("network", "1").param("weixin", "1").param("versionsId", "1"));        MvcResult mvcResultAdd = resultActionsAdd.andReturn();        logger.info("=====insertSuggest mvcResultAdd:" + mvcResultAdd.getResponse().getStatus());        String resultAdd = mvcResultAdd.getResponse().getContentAsString();        logger.info("=====insertSuggest resultAdd:" + resultAdd);    }}