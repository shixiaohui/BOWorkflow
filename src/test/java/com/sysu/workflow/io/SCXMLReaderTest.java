
package com.sysu.workflow.io;

import com.sysu.workflow.Evaluator;
import com.sysu.workflow.SCXMLExecutor;
import com.sysu.workflow.SCXMLTestHelper;
import com.sysu.workflow.TriggerEvent;
import com.sysu.workflow.env.MulitStateMachineDispatcher;
import com.sysu.workflow.env.SimpleErrorReporter;
import com.sysu.workflow.env.jexl.JexlEvaluator;
import com.sysu.workflow.model.SCXML;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;


/**
 * Unit tests
 */
public class SCXMLReaderTest {



    @Test
    public void testSCXMLReader() throws Exception {
        URL url = SCXMLTestHelper.getResource("subStateMachine.xml");
        SCXML scxml = new SCXMLReader().read(url);

        Assert.assertNotNull(scxml);
    }


    @Test
    public void testExecutor() throws Exception {
      /*  URL url = SCXMLTestHelper.getResource("crowdsourcingTest.xml");
        SCXML scxml = new SCXMLReader().read(url);
        //实例化数据模型解析器
        Evaluator evaluator = new JexlEvaluator();


        //实例化引擎
        SCXMLExecutor executor = new SCXMLExecutor(evaluator, new MulitStateMachineDispatcher(), new SimpleErrorReporter());

        executor.setStateMachine(scxml);

        executor.go();
        Map<String,Object> initData = new HashMap<String, Object>();
        initData.put("taskName","写一篇关于众包的文章");
        initData.put("taskDescription","不少于3000字");
        initData.put("judgeCount",3);
        initData.put("decomposeCount",2);
        initData.put("decomposeVoteCount",3);
        initData.put("solveCount",2);
        initData.put("solveVoteCount",3);

        executor.triggerEvent(new TriggerEvent("init", TriggerEvent.SIGNAL_EVENT, initData));


        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("simple", 0);*/




/*
        executor.triggerEvent(new TriggerEvent("judgeComplete", TriggerEvent.SIGNAL_EVENT,map));
        executor.triggerEvent(new TriggerEvent("judgeComplete", TriggerEvent.SIGNAL_EVENT,map));
        executor.triggerEvent(new TriggerEvent("judgeComplete", TriggerEvent.SIGNAL_EVENT,map));*/


    }


}

