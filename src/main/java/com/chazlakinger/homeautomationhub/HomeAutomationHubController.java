package com.chazlakinger.homeautomationhub;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAutomationHubController {

    //lighting only
    @PostMapping(path = "/turnLightsOn", produces = "text/plain")
    public String turnLightsOn() {
        return HomeAutomationHub.turnLightsOn();
    }

    @PostMapping(path = "/turnLightsOff", produces = "text/plain")
    public String turnLightsOff() {
        return HomeAutomationHub.turnLightsOff();
    }

    @PostMapping(path = "/turnToSunset", produces = "text/plain")
    public String turnToSunset() {
        return HomeAutomationHub.turnToSunset();
    }

    @PostMapping(path = "/turnToDaytime", produces = "text/plain")
    public String turnToDaytime() {
        return HomeAutomationHub.turnToDaytime();
    }

    @PostMapping(path = "/updateLightsIfOn", produces = "text/plain")
    public String updateLightsIfOn() {
        return HomeAutomationHub.updateLightsIfOn();
    }

    @PostMapping(path = "/morningTask", produces = "text/plain")
    public String morningTask() {
        return HomeAutomationHub.morningTask();
    }

    @PostMapping(path = "/lockLights")
    public void  lockLights() {
        HomeAutomationHub.lockLights();
    }

    @PostMapping(path = "/unLockLights")
    public void  unLockLights() {
        HomeAutomationHub.unLockLights();
    }

    @PostMapping(path = "/turnToSunsetAndLockLights", produces = "text/plain")
    public String turnToSunsetAndLockLights() {
        return HomeAutomationHub.turnToSunsetAndLockLights();
    }

    @PostMapping(path = "/turnToDaytimeAndLockLights", produces = "text/plain")
    public String turnToDaytimeAndLockLights() {
        return HomeAutomationHub.turnToDaytimeAndLockLights();
    }


    //unifi video only
    @PostMapping(path = "/enableRecording", produces = "text/plain")
    public String enableRecording() {
        return HomeAutomationHub.enableRecording();
    }

    @PostMapping(path = "/disableRecording", produces = "text/plain")
    public String disableRecording() {
        return HomeAutomationHub.disableRecording();
    }


    //lighting and unifi video
    @PostMapping(path = "/leftHome", produces = "text/plain")
    public String leftHome() {
        return HomeAutomationHub.leftHome();
    }

    @PostMapping(path = "/arrivedHome", produces = "text/plain")
    public String arrivedHome() {
        return HomeAutomationHub.arrivedHome();
    }
}
