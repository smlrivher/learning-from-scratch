package com.soymach.automation.dashboard.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("iOS")
public class PlatformIosImplementation implements PlatformService{
    @Override
    public String getCurrentPlatform() {
        return "Running iOS!";
    }
}
