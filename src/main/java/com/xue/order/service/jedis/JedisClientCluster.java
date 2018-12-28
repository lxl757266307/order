package com.xue.order.service.jedis;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.GeoRadiusResponse;
import redis.clients.jedis.GeoUnit;
import redis.clients.jedis.JedisCluster;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisClientCluster implements JedisClient {

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public Boolean exists(String key) {
        return jedisCluster.exists(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        return jedisCluster.expire(key, seconds);
    }

    @Override
    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }

    @Override
    public Long incr(String key) {
        return jedisCluster.incr(key);
    }

    @Override
    public Long hset(String key, String field, String value) {
        return jedisCluster.hset(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        return jedisCluster.hget(key, field);
    }

    @Override
    public Long hdel(String key, String... field) {
        return jedisCluster.hdel(key, field);
    }

    @Override
    public String hmset(String key, Map map) {
        return jedisCluster.hmset(key, map);
    }

    @Override
    public long sadd(String key, String value) {
        return jedisCluster.sadd(key, value);
    }

    @Override
    public Long geoadd(String key, Double longitude, Double latitude, String member) {
//		return jedisCluster.geoadd(key,longitude,latitude,member);
        return 1L;
    }

    @Override
    public Double geodist(String key, String member1, String member2, GeoUnit geoUnit) {
//		return jedisCluster.geodist(key,member1,member2,geoUnit);
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusresponse(String key, String member, Double radius, GeoUnit geoUnit) {
//		return jedisCluster.georadiusByMember(key,member,radius,geoUnit);
        return null;
    }

    @Override
    public Long zrem(String key, String... member) {
        return jedisCluster.zrem(key, member);
    }

    @Override
    public Long srem(String key, String... member) {
        return jedisCluster.srem(key, member);
    }

    @Override
    public Set<String> smember(String key) {
        return jedisCluster.smembers(key);
    }

    @Override
    public Long rpush(String key, String... value) {
        return jedisCluster.rpush(key, value);
    }

    @Override
    public List lrange(String key, long start, long stop) {
        return jedisCluster.lrange(key, start, stop);
    }

    @Override
    public Map<String, String> hgetall(String key) {
        return jedisCluster.hgetAll(key);
    }

    @Override
    public Long scard(String key) {
        return jedisCluster.scard(key);
    }

    @Override
    public Long llen(String key) {
        return jedisCluster.llen(key);
    }

    @Override
    public Long lrem(String key, int count, String value) {
        return jedisCluster.lrem(key, count, value);
    }

}
