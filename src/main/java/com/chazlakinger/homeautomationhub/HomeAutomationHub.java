package com.chazlakinger.homeautomationhub;

import org.springframework.web.client.RestTemplate;

class HomeAutomationHub {

	private final String BASE_URI = "http://127.0.0.1:8081";

	String turnLightsOn() {
		final String uri = BASE_URI + "/turnLightsOn";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnLightsOff() {
		final String uri = BASE_URI + "/turnLightsOff";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnToSunset() {
		final String uri = BASE_URI + "/turnToSunset";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String turnToDaytime() {
		final String uri = BASE_URI + "/turnToDaytime";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String updateLightsIfOn() {
		final String uri = BASE_URI + "/updateLightsIfOn";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	String morningTask() {
		final String uri = BASE_URI + "/morningTask";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, null, String.class);
	}

	void lockLights() {
		final String uri = BASE_URI + "/lockLights";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, null, String.class);
	}

	void unLockLights() {
		final String uri = BASE_URI + "/unLockLights";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(uri, null, String.class);
	}

    String turnToSunsetAndLockLights() {
        final String uri = BASE_URI + "/turnToSunsetAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }

    String turnToDaytimeAndLockLights() {
        final String uri = BASE_URI + "/turnToDaytimeAndLockLights";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, null, String.class);
    }
}
