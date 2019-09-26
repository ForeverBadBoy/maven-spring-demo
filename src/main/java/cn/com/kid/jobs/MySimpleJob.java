package cn.com.kid.jobs;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
/**
 * @author Forever
 * @date 2019/9/24
 */
public class MySimpleJob implements SimpleJob {

  @Resource
  private ZookeeperRegistryCenter regCenter;

  public void execute(ShardingContext shardingContext) {
    int item = shardingContext.getShardingItem();
    String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    System.out.println(String.format("-----ThreadId:%s, Date:%s, 当前分片项：%s",Thread.currentThread().getId(), dateStr, item));
    //System.out.println("我是分片项：" + dateStr + " - " + item);
    //System.out.println("分片总数：" + shardingContext.getShardingTotalCount());

  }
}
