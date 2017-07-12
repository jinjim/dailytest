package com.chen.zk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author liang.chen
 * @date 2016-11-16
 */
public class ZkTest {

    private static Log log = LogFactory.getLog(ZooKeeperOperator.class.getName());

    public static void main(String[] args) {

        try {
            ZooKeeperOperator zkoperator = new ZooKeeperOperator();
            zkoperator.connect("192.168.254.133:2181");

            byte[] data = new byte[]{'a','b','c','d'};

//	            zkoperator.create("/root",null);
//	            System.out.println(Arrays.toString(zkoperator.getData("/root")));
//
//	            zkoperator.create("/root/child1",data);
//	            System.out.println(Arrays.toString(zkoperator.getData("/root/child1")));
//
//	            zkoperator.create("/root/child2",data);
//	            System.out.println(Arrays.toString(zkoperator.getData("/root/child2")));

            String zktest="ZooKeeper的Java API测试";

            if (!zkoperator.exists("/root")){
                zkoperator.create("/root", zktest.getBytes());
            }
            log.info("获取设置的信息："+new String(zkoperator.getData("/root")));

            System.out.println("节点孩子信息:");
            zkoperator.getChild("/root");

            zkoperator.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
