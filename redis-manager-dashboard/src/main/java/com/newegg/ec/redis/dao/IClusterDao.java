package com.newegg.ec.redis.dao;

import com.newegg.ec.redis.entity.Cluster;

import java.util.List;

/**
 * Manage cluster in redis-manager
 *
 * @author Jay.H.Zou
 * @date 2019/7/18
 */
public interface IClusterDao {

    List<Cluster> selectAllCluster();

    List<Cluster> selectClusterByGroupId(String groupId);

    List<Cluster> selectClusterByUserId(String userId);

    int insertCluster(Cluster cluster);

    int updateCluster(Cluster cluster);

    int deleteClusterById(String clusterId);

}
