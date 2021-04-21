package com.qyngchen.strategy.service.impl;

import com.qyngchen.strategy.entity.BaseTestEntity;
import com.qyngchen.strategy.entity.TestTwoEntity;
import com.qyngchen.strategy.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestTwoServiceImpl implements TestService {
    @Override
    public String getMessage(BaseTestEntity entity) {
        TestTwoEntity two = (TestTwoEntity) entity;
        return two.getTwo();
    }
}
