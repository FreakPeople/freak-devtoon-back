//package yjh.devtoon.common.config;
//
//import com.github.benmanes.caffeine.cache.Caffeine;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.caffeine.CaffeineCacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import java.util.concurrent.TimeUnit;
//
//@EnableCaching
//@Configuration
//public class CacheConfig {
//
//    @Bean
//    public CacheManager cacheManager() {
//        CaffeineCacheManager cacheManager = new CaffeineCacheManager("promotion");
//        cacheManager.setCaffeine(Caffeine.newBuilder()
//                .expireAfterWrite(120, TimeUnit.SECONDS)
//                .maximumSize(100));
//        return cacheManager;
//    }
//
//}
