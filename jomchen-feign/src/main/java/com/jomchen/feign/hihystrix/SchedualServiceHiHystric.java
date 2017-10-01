package com.jomchen.feign.hihystrix;

import com.jomchen.feign.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
