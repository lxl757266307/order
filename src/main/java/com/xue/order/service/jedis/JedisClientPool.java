package com.xue.order.service.jedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.GeoRadiusResponse;
import redis.clients.jedis.GeoUnit;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class JedisClientPool implements JedisClient {
	
	@Autowired
	private JedisPool jedisPool;

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.set(key, value);
		jedis.close();
		return result;
	}

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.get(key);
		jedis.close();
		return result;
	}

	@Override
	public Boolean exists(String key) {
		Jedis jedis = jedisPool.getResource();
		Boolean result = jedis.exists(key);
		jedis.close();
		return result;
	}

	@Override
	public Long expire(String key, int seconds) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, seconds);
		jedis.close();
		return result;
	}

	@Override
	public Long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}

	@Override
	public Long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();
		return result;
	}

	@Override
	public Long hset(String key, String field, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(key, field, value);
		jedis.close();
		return result;
	}

	@Override
	public String hget(String key, String field) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.hget(key, field);
		jedis.close();
		return result;
	}

	@Override
	public Long hdel(String key, String... field) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(key, field);
		jedis.close();
		return result;
	}

	@Override
	public String hmset(String key, Map map) {
		Jedis jedis = jedisPool.getResource();
		String s = jedis.hmset(key, map);
		jedis.close();
		return s;
	}

	@Override
	public long sadd(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long aLong = jedis.sadd(key, value);
		jedis.close();
		return aLong;
	}

	@Override
	public Long geoadd(String key, Double longitude, Double latitude, String member) {
		Jedis jedis = jedisPool.getResource();
//		Long geoadd = jedis.geoadd(key, longitude, latitude, member);
		jedis.close();
		return 1L;
	}

	@Override
	public Double geodist(String key, String member1, String member2, GeoUnit geoUnit) {
		Jedis jedis = jedisPool.getResource();
//		Double geodist = jedis.geodist(key, member1, member2, geoUnit);
		jedis.close();
		return null;
	}

	@Override
	public List<GeoRadiusResponse> georadiusresponse(String key, String member, Double radius, GeoUnit geoUnit) {
		Jedis jedis = jedisPool.getResource();
//		List<GeoRadiusResponse> geoRadiusResponses = jedis.georadiusByMember(key, member, radius, geoUnit);
		jedis.close();
		return null;
	}

	@Override
	public Long zrem(String key, String... member) {
		Jedis jedis = jedisPool.getResource();
		Long zrem = jedis.zrem(key, member);
		jedis.close();
		return zrem;
	}

	@Override
	public Long srem(String key, String... member) {
		Jedis jedis = jedisPool.getResource();
		Long srem = jedis.srem(key, member);
		jedis.close();
		return srem;
	}

	@Override
	public Set<String> smember(String key) {
		Jedis jedis = jedisPool.getResource();
		Set<String> smembers = jedis.smembers(key);
		jedis.close();
		return smembers;
	}

	@Override
	public Long rpush(String key, String... value) {
		Jedis jedis = jedisPool.getResource();
		Long rpush = jedis.rpush(key, value);
		jedis.close();
		return rpush;
	}

	@Override
	public List lrange(String key, long start, long stop) {
		Jedis jedis = jedisPool.getResource();
		List<String> lrange = jedis.lrange(key, start, stop);
		jedis.close();
		return lrange;
	}

	@Override
	public Map<String, String> hgetall(String key) {
		Jedis jedis = jedisPool.getResource();
		Map<String, String> map = jedis.hgetAll(key);
		jedis.close();
		return map;
	}

	@Override
	public Long scard(String key) {
		Jedis jedis = jedisPool.getResource();
		Long scard = jedis.scard(key);
		jedis.close();
		return scard;
	}

	@Override
	public Long llen(String key) {
		Jedis jedis = jedisPool.getResource();
		Long llen = jedis.llen(key);
		jedis.close();
		return llen;
	}

	@Override
	public Long lrem(String key, int count, String value) {
		Jedis jedis = jedisPool.getResource();
		Long lrem = jedis.lrem(key, count, value);
		jedis.close();
		return lrem;
	}
}
