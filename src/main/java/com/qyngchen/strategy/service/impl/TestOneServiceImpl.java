package com.qyngchen.strategy.service.impl;

import com.qyngchen.strategy.entity.BaseTestEntity;
import com.qyngchen.strategy.entity.TestOneEntity;
import com.qyngchen.strategy.service.TestService;
import org.springframework.stereotype.Service;


@Service
public class TestOneServiceImpl implements TestService {
    @Override
    public String getMessage(BaseTestEntity entity) {
        TestOneEntity one = (TestOneEntity) entity;
        return one.getOne();
    }
}
