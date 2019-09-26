package cn.com.kid.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Forever
 * @date 2019/9/24
 */
public class HelloQuartz implements Job {

  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    JobDetail detail = jobExecutionContext.getJobDetail();
    String name = detail.getJobDataMap().getString("name");
    System.out.println("my job name is [" + name + "] at " + dateStr);

  }
}
