///*
// * Copyright (c) 2021. Aegean Next OpenSource FrameWork
// *
// * Licensed under the Apache License, Version 2.0 (the "License"): you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *         http://www.apache.org/licenses/LICENSE-2.0.
// *
// * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and limitations under the License.
// *
// * ----- ----- ----- ----- -----
// *
// * Visit the project homepage for more information at https://next.aegean.tech,
// * Or see the code warehouse at https://github.com/aegean-next, https://gitee.com/aegean-next.
// */
//
//package tech.aegean.next.origin.base.service.redisson;
//
//import org.redisson.api.RMap;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import tech.aegean.next.origin.base.factory.RedissonFactory;
//
//import java.util.concurrent.TimeUnit;
//
//@Service
//public class RedisServiceImpl implements RedisService{
//
//    @Autowired
//    public RedissonFactory redissonFactory;
//
//    @Override
//    public String calculateKey(String prefix, String keyword){
//        StringBuilder str = new StringBuilder();
//        str.append(prefix);
//        str.append(":");
//        str.append(keyword);
//        return str.toString();
//    }
//
//
//    @Override
//    public void setObject(String key, Object value) {
//        redissonFactory.getInstance().getBucket(key).set(value);
//    }
//
//    @Override
//    public void setObject(String key, Object value, Integer time) {
//        redissonFactory.getInstance().getBucket(key).set(value, time, TimeUnit.SECONDS);
//    }
//
//    @Override
//    public void setMap(String key, RMap<String, Object> value) {
//        redissonFactory.getInstance().getMap(key).put(key, value);
//    }
//
//
//}
