package com.task.util;

import com.task.dto.TaskDto;
import com.task.entity.Tasks;

public class TaskUtil {
	
	public static TaskDto entitytoDto(Tasks t)
	{
		return new TaskDto(t.getT_id(),t.getT_name(),t.getU_id());
		
	}
	public static Tasks dtotoEntity(TaskDto d)
	{
		return new Tasks(d.getT_id(),d.getT_name(),d.getU_id());
		
	}

}
