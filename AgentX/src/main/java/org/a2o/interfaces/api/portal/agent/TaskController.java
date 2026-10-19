package org.a2o.interfaces.api.portal.agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.a2o.application.task.dto.TaskDTO;
import org.a2o.application.task.service.TaskAppService;
import org.a2o.domain.task.model.TaskAggregate;
import org.a2o.infrastructure.auth.UserContext;
import org.a2o.interfaces.api.common.Result;

import java.util.List;

/** agent任务管理 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskAppService taskAppService;

    @Autowired
    public TaskController(TaskAppService taskAppService) {
        this.taskAppService = taskAppService;
    }

    /** 获取当前会话的任务
     * @param sessionId 会话id */
    @GetMapping("/session/{sessionId}/latest")
    public Result<TaskAggregate> getSessionTasks(@PathVariable String sessionId) {
        String userId = UserContext.getCurrentUserId();
        return Result.success(taskAppService.getCurrentSessionTask(sessionId, userId));
    }
}