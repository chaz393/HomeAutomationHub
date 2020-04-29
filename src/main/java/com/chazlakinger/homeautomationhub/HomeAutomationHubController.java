package com.chazlakinger.homeautomationhub;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAutomationHubController {

	private HomeAutomationHub homeAutomationHub = new HomeAutomationHub();

	//lighting only
	@PostMapping(path = "/turnLightsOn", produces = "text/plain")
	public String turnLightsOn() {
		return homeAutomationHub.turnLightsOn();
	}

	@PostMapping(path = "/turnLightsOff", produces = "text/plain")
	public String turnLightsOff() {
		return homeAutomationHub.turnLightsOff();
	}

	@PostMapping(path = "/turnToSunset", produces = "text/plain")
	public String turnToSunset() {
		return homeAutomationHub.turnToSunset();
	}

	@PostMapping(path = "/turnToDaytime", produces = "text/plain")
	public String turnToDaytime() {
		return homeAutomationHub.turnToDaytime();
	}

	@PostMapping(path = "/updateLightsIfOn", produces = "text/plain")
	public String updateLightsIfOn() {
		return homeAutomationHub.updateLightsIfOn();
	}

	@PostMapping(path = "/morningTask", produces = "text/plain")
	public String morningTask() {
		return homeAutomationHub.morningTask();
	}

	@PostMapping(path = "/lockLights")
	public void  lockLights() {
		homeAutomationHub.lockLights();
	}

	@PostMapping(path = "/unLockLights")
	public void  unLockLights() {
		homeAutomationHub.unLockLights();
	}

	@PostMapping(path = "/turnToSunsetAndLockLights", produces = "text/plain")
	public String turnToSunsetAndLockLights() {
		return homeAutomationHub.turnToSunsetAndLockLights();
	}

	@PostMapping(path = "/turnToDaytimeAndLockLights", produces = "text/plain")
	public String turnToDaytimeAndLockLights() {
		return homeAutomationHub.turnToDaytimeAndLockLights();
	}


	//unifi video only
    @PostMapping(path = "/enableRecording", produces = "text/plain")
    public String enableRecording() {
        return homeAutomationHub.enableRecording();
    }

    @PostMapping(path = "/disableRecording", produces = "text/plain")
    public String disableRecording() {
        return homeAutomationHub.disableRecording();
    }


	//lighting and unifi video
    @PostMapping(path = "/leftHome", produces = "text/plain")
    public String leftHome() {
        return homeAutomationHub.leftHome();
    }

    @PostMapping(path = "/arrivedHome", produces = "text/plain")
    public String arrivedHome() {
        return homeAutomationHub.arrivedHome();
    }
}
