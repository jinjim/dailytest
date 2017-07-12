package com.chen.zk;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.Stat;

import java.util.List;

public class ZooKeeperOperator extends AbstractZooKeeper {

    /**
     * <b>function:</b>创建持久态的znode,比支持多层创建.比如在创建/parent/child的情况下,无/parent.无法通过
     *
     * @param path
     * @param data
     * @throws KeeperException
     * @throws InterruptedException
     * @author cuiran
     * @createDate 2013-01-16 15:08:38
     */
    public void create(String path, byte[] data) throws KeeperException, InterruptedException {
        /**
         * 此处采用的是CreateMode是PERSISTENT  表示The znode will not be automatically deleted upon client's disconnect.
         * EPHEMERAL 表示The znode will be deleted upon the client's disconnect.
         */
//        this.zooKeeper.create(path, data, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zooKeeper.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    /**
     * <b>function:</b>获取节点信息
     *
     * @param path
     * @throws KeeperException
     * @throws InterruptedException
     * @author cuiran
     * @createDate 2013-01-16 15:17:22
     */
    public void getChild(String path) throws KeeperException, InterruptedException {
        try {
            List<String> list = zooKeeper.getChildren(path, false);
            if (list.isEmpty()) {
                System.out.println(path + "中没有节点");
            } else {
                System.out.println(path + "中存在节点");
                for (String child : list) {
                    System.out.println("节点为：" + child);
                }
            }
        } catch (KeeperException.NoNodeException e) {
            // TODO: handle exception
            throw e;

        }
    }

    public boolean exists (String path) throws KeeperException, InterruptedException {
        Stat stat = zooKeeper.exists(path, null);
        return null == stat ? false : true;
    }

    public byte[] getData(String path) throws KeeperException, InterruptedException {
        return zooKeeper.getData(path, false, null);
    }
}
