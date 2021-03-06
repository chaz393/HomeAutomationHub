package com.chazlakinger.homeautomationhub;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping(path = "/turnRoomLightsOn", produces = "text/plain")
    public String turnRoomLightsOn() {
        return HomeAutomationHub.turnRoomLightsOn();
    }

    @PostMapping(path = "/turnRoomLightsOff", produces = "text/plain")
    public String turnRoomLightsOff() {
        return HomeAutomationHub.turnRoomLightsOff();
    }

    @PostMapping(path = "/turnRoomLightsOnAndLock", produces = "text/plain")
    public String turnRoomLightsOnAndLock() {
        return HomeAutomationHub.turnRoomLightsOnAndLock();
    }

    @PostMapping(path = "/turnRoomLightsOffAndLock", produces = "text/plain")
    public String turnRoomLightsOffAndLock() {
        return HomeAutomationHub.turnRoomLightsOffAndLock();
    }

    @PostMapping(path = "/lowLightDaytime", produces = "text/plain")
    public String lowLightDaytime() {
        return HomeAutomationHub.lowLightDaytime();
    }

    @PostMapping(path = "/turnHallLampOn", produces = "text/plain")
    public String turnHallLampOn() {
        return HomeAutomationHub.turnHallLampOn();
    }

    @PostMapping(path = "/turnHallLampOff", produces = "text/plain")
    public String turnHallLampOff() {
        return HomeAutomationHub.turnHallLampOff();
    }

    @PostMapping(path = "/nightTask", produces = "text/plain")
    public String nightTask() {
        return HomeAutomationHub.nightTask();
    }

    @PostMapping(path = "/turnChazBthFanOn", produces = "text/plain")
    public String turnChazBthFanOn() {
        return HomeAutomationHub.turnChazBthFanOn();
    }

    @PostMapping(path = "/turnChazBthFanOff", produces = "text/plain")
    public String turnChazBthFanOff() {
        return HomeAutomationHub.turnChazBthFanOff();
    }

    @PostMapping(path = "/turnChazBthFanOn5Min", produces = "text/plain")
    public String turnChazBthFanOn5Min() {
        return HomeAutomationHub.turnChazBthFanOn5Min();
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

    @GetMapping(path = "/getRecordingStatus", produces = "text/plain")
    public ResponseEntity getRecordingStatus() {
        try {
            return ResponseEntity.ok(HomeAutomationHub.getRecordingStatus());
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
