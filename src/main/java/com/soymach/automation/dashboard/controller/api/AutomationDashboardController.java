package com.soymach.automation.dashboard.controller.api;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.soymach.automation.dashboard.model.AutomationDashboard;
import com.soymach.automation.dashboard.service.AutomationDashboardService;
import com.soymach.automation.dashboard.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class AutomationDashboardController {
	@Autowired
	private AutomationDashboardService automationDashboardService;
	@Autowired
	private PlatformService platformService;

	@GetMapping
	public ResponseEntity getPlatform() {
		System.out.println(platformService.getCurrentPlatform());
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();

	}

	@PostMapping
	public ResponseEntity addRow(@RequestBody AutomationDashboard automationDashboard) {
		automationDashboardService.addRow(automationDashboard);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	public void updateRow() {}
	public void getAllRow() {}
	public void getRowByName() {}
	public void deleteRow() {}

}
