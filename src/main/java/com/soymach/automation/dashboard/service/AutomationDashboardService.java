package com.soymach.automation.dashboard.service;

import com.soymach.automation.dashboard.model.AutomationDashboard;
import com.soymach.automation.dashboard.repository.AutomationDashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationDashboardService {
	
	@Autowired
	private AutomationDashboardRepository automationDashboardRepository;
	
	public void addRow(AutomationDashboard row) {
		automationDashboardRepository.insert(row);
	}
	public void updateRow() {}
	public void getAllRow() {}
	public void getRowByName() {}
	public void deleteRow() {}
}
