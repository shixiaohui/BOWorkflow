package com.sysu.workflow;

import com.sysu.workflow.service.taskservice.TaskService;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/1/20
 * Time: 16:58
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://blog.csdn.net/c601097836</a>
 * Email: 601097836@qq.com
 */
public class TestTaskService {

    TaskService taskService = null;

    @Before
    public void before() {
        taskService = new TaskService();
    }

    @Test
    public void testFindTask() {
      /*  GroupEntity groupEntity = IdentityService.createGroupQuery().groupName("Judger").SingleResult();
        ArrayList<GroupWorkItemEntity> groupWorkItemEntityArrayList = TaskService.createGroupTaskQuery().taskCandidateGroup(groupEntity).list();



        System.out.println(groupWorkItemEntityArrayList.get(0).getItemFormEntity().getFormItemEntityLinkedHashSet().size());
    */
    }

}