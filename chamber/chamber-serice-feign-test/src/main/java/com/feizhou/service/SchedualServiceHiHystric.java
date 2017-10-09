package com.feizhou.service;

import org.springframework.stereotype.Component;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 2017/10/9
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
