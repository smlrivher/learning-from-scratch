package com.soymach.automation.dashboard.repository;

import com.soymach.automation.dashboard.model.AutomationDashboard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AutomationDashboardRepository extends MongoRepository<AutomationDashboard, String> {
	

}
