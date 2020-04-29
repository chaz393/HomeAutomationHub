package com.chazlakinger.homeautomationhub;

import org.springframework.web.client.RestTemplate;
import java.util.concurrent.TimeUnit;

class HomeAutomationHub {

	private final String BASE_LIGHTING_URI = "http://127.0.0.1:8081";
    private final String BASE_UNIFI_VIDEO_URI = "http://127.0.0.1:5000";

	//lighting only
	String turnLightsOn() {
		final String uri = BASE_LIGHTING_URI + "/turnLightsOn";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnLightsOff() {
		final String uri = BASE_LIGHTING_URI + "/turnLightsOff";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnToSunset() {
		final String uri = BASE_LIGHTING_URI + "/turnToSunset";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnToDaytime() {
		final String uri = BASE_LIGHTING_URI + "/turnToDaytime";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String updateLightsIfOn() {
		final String uri = BASE_LIGHTING_URI + "/updateLightsIfOn";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String morningTask() {
		final String uri = BASE_LIGHTING_URI + "/morningTask";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	void lockLights() {
		final String uri = BASE_LIGHTING_URI + "/lockLights";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, null, String.class);
	}

	void unLockLights() {
		final String uri = BASE_LIGHTING_URI + "/unLockLights";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, null, String.class);
	}

    String turnToSunsetAndLockLights() {
        final String uri = BASE_LIGHTING_URI + "/turnToSunsetAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    String turnToDaytimeAndLockLights() {
        final String uri = BASE_LIGHTING_URI + "/turnToDaytimeAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }


    //unifi video only
    String enableRecording() {
        final String uri = BASE_UNIFI_VIDEO_URI + "/enableRecording";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    String disableRecording() {
        final String uri = BASE_UNIFI_VIDEO_URI + "/disableRecording";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }


    //lighting and unifi video
    String leftHome() {
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

    String arrivedHome() {
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
