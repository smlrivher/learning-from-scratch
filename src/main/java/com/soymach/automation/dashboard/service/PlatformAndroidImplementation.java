package com.soymach.automation.dashboard.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Android")
public class PlatformAndroidImplementation implements PlatformService{
    @Override
    public String getCurrentPlatform() {
        return "Running Android!";
    }
}
