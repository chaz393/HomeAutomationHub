package com.chazlakinger.homeautomationhub;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity enableRecording() {
        try {
            return ResponseEntity.ok(HomeAutomationHub.enableRecording());
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping(path = "/disableRecording", produces = "text/plain")
    public ResponseEntity disableRecording() {
        try {
            return ResponseEntity.ok(HomeAutomationHub.disableRecording());
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    //lighting and unifi video
    @PostMapping(path = "/leftHome", produces = "text/plain")
    public ResponseEntity leftHome() {
        try {
            return ResponseEntity.ok(HomeAutomationHub.leftHome());
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping(path = "/arrivedHome", produces = "text/plain")
    public ResponseEntity arrivedHome() {
        try {
            return ResponseEntity.ok(HomeAutomationHub.arrivedHome());
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
