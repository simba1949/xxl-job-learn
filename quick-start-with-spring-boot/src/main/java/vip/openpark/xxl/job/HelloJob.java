package vip.openpark.xxl.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author anthony
 * @version 2024/11/6
 * @since 2024/11/6 0:01
 */
@Slf4j
@Component
public class HelloJob {

	@XxlJob("helloJob")
	public void execute() {
		// 通过 XxlJobHelper 获取参数
		String jobParam = XxlJobHelper.getJobParam();
		log.info("jobParam:{}", jobParam);
		int shardIndex = XxlJobHelper.getShardIndex();
		log.info("shardIndex:{}", shardIndex);
		int shardTotal = XxlJobHelper.getShardTotal();
		log.info("shardTotal:{}", shardTotal);
		long jobId = XxlJobHelper.getJobId();
		log.info("jobId:{}", jobId);

		log.info(">>>>>>>>>>> xxl-job, Hello Job执行调度");
	}
}