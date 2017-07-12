package com.chen.zk;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

/**
 * @author liang.chen
 * @date 2016-11-16
 */
public class ZooKeeperTest {

    public static void main(String[] args) throws Exception{
        ZooKeeper zk = new ZooKeeper("192.168.254.133:2181", 3000, null);


//        String zktest="ZooKeeper的Java API测试";
//        zk.create("/root/child3", zktest.getBytes());
//        System.out.println("获取设置的信息："+new String(zk.getData("/root/child3")));

        System.out.println("=========创建节点===========");
        if(zk.exists("/mynode/node2", false) == null)
        {
            zk.create("/mynode/node2", "znode2".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        System.out.println("=============查看节点是否安装成功===============");
        System.out.println(new String(zk.getData("/mynode/node2", false, null)));

        System.out.println("=========修改节点的数据==========");
        zk.setData("/mynode/node2", "zNode2".getBytes(), -1);
        System.out.println("========查看修改的节点是否成功=========");
        System.out.println(new String(zk.getData("/test", false, null)));

        System.out.println("=======删除节点==========");
//        zk.delete("/test", -1);
        System.out.println("==========查看节点是否被删除============");
        System.out.println("节点状态：" + zk.exists("/mynode", false));
        zk.close();
    }

}
