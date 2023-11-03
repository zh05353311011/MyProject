package com.qfedu;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZookeeperUtils {
    public static CuratorFramework getCurator(){
        RetryPolicy retryPolicy=new ExponentialBackoffRetry(3000,2);
        CuratorFramework curatorFramework= CuratorFrameworkFactory.builder()
                .connectString("")
                .retryPolicy(retryPolicy)
                .build();
        curatorFramework.start();
        return curatorFramework;
    }
}
