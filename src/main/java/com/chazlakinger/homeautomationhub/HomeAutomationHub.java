package com.chazlakinger.homeautomationhub;

import org.springframework.web.client.RestTemplate;
import java.util.concurrent.TimeUnit;

class HomeAutomationHub {

    private static final String BASE_LIGHTING_URI = "http://127.0.0.1:8081";
    private static final String BASE_UNIFI_VIDEO_URI = "http://127.0.0.1:5000";

    //lighting only
    static String turnLightsOn() {
        final String uri = BASE_LIGHTING_URI + "/turnLightsOn";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String turnLightsOff() {
        final String uri = BASE_LIGHTING_URI + "/turnLightsOff";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String turnToSunset() {
        final String uri = BASE_LIGHTING_URI + "/turnToSunset";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String turnToDaytime() {
        final String uri = BASE_LIGHTING_URI + "/turnToDaytime";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String updateLightsIfOn() {
        final String uri = BASE_LIGHTING_URI + "/updateLightsIfOn";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String morningTask() {
        final String uri = BASE_LIGHTING_URI + "/morningTask";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static void lockLights() {
        final String uri = BASE_LIGHTING_URI + "/lockLights";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(uri, null, String.class);
    }

    static void unLockLights() {
        final String uri = BASE_LIGHTING_URI + "/unLockLights";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(uri, null, String.class);
    }

    static String turnToSunsetAndLockLights() {
        final String uri = BASE_LIGHTING_URI + "/turnToSunsetAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String turnToDaytimeAndLockLights() {
        final String uri = BASE_LIGHTING_URI + "/turnToDaytimeAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }


    //unifi video only
    static String enableRecording() {
        final String uri = BASE_UNIFI_VIDEO_URI + "/enableRecording";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    static String disableRecording() {
        final String uri = BASE_UNIFI_VIDEO_URI + "/disableRecording";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }


    //lighting and unifi video
    static String leftHome() {
        String lightsResult = turnLightsOff();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
            System.out.println("error sleeping");
            return "error";
        }

        String recordingResult = enableRecording();

        if (lightsResult.equals("Congratulations! You've fired the all_off event") && recordingResult.equals("\"Success\"\n")) {
            System.out.println("success leaving home");
            return "success";
        } else {
            System.out.println("error leaving home");
            return "error";
        }
    }

    static String arrivedHome() {
        String recordingResult = disableRecording();
        String lightsResult = turnLightsOn();

        if (lightsResult.equals("Congratulations! You've fired the sunset event") && recordingResult.equals("\"Success\"\n")) {
            System.out.println("success arriving home");
            return "success";
        } else {
            System.out.println("error arriving home");
            return "error";
        }
    }
}
