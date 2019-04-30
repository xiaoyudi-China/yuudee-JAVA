package com.dkd.service;import com.dkd.XiaoyudiApplication;import com.dkd.model.XydAnswerRecord;import com.dkd.model.XydParents;import com.dkd.service.XydAnswerRecordService;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.transaction.annotation.Transactional;import java.util.ArrayList;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class XydAnswerRecordServiceTest {    @Autowired    private XydAnswerRecordService xydAnswerRecordService ;    @Test    public void insertSelective(){        XydAnswerRecord xydAnswerRecord = new XydAnswerRecord();        xydAnswerRecord.setUserId(1);        xydAnswerRecord.setParentsId(1);        xydAnswerRecordService.insertSelective(xydAnswerRecord);    }     @Test    public void insertAbcResult(){         try {             XydParents xydParents = new XydParents();             xydParents.setChildId(135);             xydParents.setId(83);             xydAnswerRecordService.insertAbcResult(xydParents,Double.parseDouble("100"),new ArrayList());         } catch (Exception e) {             e.printStackTrace();         }     }    @Test    public void insertAbcResult1(){        try {            XydParents xydParents = new XydParents();            xydParents.setChildId(135);            xydAnswerRecordService.insertAbcResult(xydParents,Double.parseDouble("100"),new ArrayList());        } catch (Exception e) {            e.printStackTrace();        }    }@Test    public void insertAbcResult2(){        try {            XydParents xydParents = new XydParents();            xydParents.setId(83);            xydAnswerRecordService.insertAbcResult(xydParents,Double.parseDouble("100"),new ArrayList());        } catch (Exception e) {            e.printStackTrace();        }    }     @Test    public void selectByThreeCountList(){         try {             xydAnswerRecordService.selectByThreeCountList(83,135,null,"1",new String[]{});         } catch (Exception e) {         }     }}