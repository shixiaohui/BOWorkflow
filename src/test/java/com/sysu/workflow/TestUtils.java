package com.sysu.workflow;

import com.sysu.workflow.entity.UserWorkItemEntity;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/1/20
 * Time: 15:45
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://blog.csdn.net/c601097836</a>
 * Email: 601097836@qq.com
 */
public class TestUtils {
    @Test
    public void testEntityNotNullProperty() {

        UserWorkItemEntity workItemEntity = new UserWorkItemEntity();
        workItemEntity.setItemName("java");
        System.out.println(workItemEntity.getNotNullPropertyMap().toString());

    }
}