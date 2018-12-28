package com.xue.order.service.jedis;

import redis.clients.jedis.GeoRadiusResponse;
import redis.clients.jedis.GeoUnit;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface JedisClient {

	String set(String key, String value);
	String get(String key);
	Boolean exists(String key);
	Long expire(String key, int seconds);
	Long ttl(String key);
	Long incr(String key);
	Long hset(String key, String field, String value);
	String hget(String key, String field);
	Long hdel(String key, String... field);
	String hmset(String key, Map map);
	long sadd(String key, String value);
	Long geoadd(String key, Double longitude, Double latitude, String member);
	Double geodist(String key, String member1, String member2, GeoUnit geoUnit);
	List<GeoRadiusResponse> georadiusresponse(String key, String member, Double radius, GeoUnit geoUnit);
	Long zrem(String key, String... member);
	Long srem(String key, String... member);
	Set<String> smember(String key);
	Long rpush(String key, String... value);
	List lrange(String key, long start, long stop);
	Map<String,String> hgetall(String key);
	Long scard(String key);
	Long llen(String key);
	Long lrem(String key, int count, String value);
}
