package com.dkd.service;import com.dkd.XiaoyudiApplication;import com.dkd.model.XydSystemSuggest;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.transaction.annotation.Transactional;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class XydSystemStatisticsServiceTest {    @Autowired    private XydSystemStatisticsService xydSystemStatisticsService;    @Test    public void deleteByPrimaryKey() {        try{            xydSystemStatisticsService.deleteByPrimaryKey(1);        }catch (Exception e){        }    }    @Test    public void selectByPrimaryKey() {        try{            xydSystemStatisticsService.selectByPrimaryKey(1);        }catch (Exception e){        }    }}