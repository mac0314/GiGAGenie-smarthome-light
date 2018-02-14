package com.etri.sl.configs;

public class Config {
    // System light 2.0 API
    // TODO modify Gateway Object
    // TEST API URI
    public static final String BASE_URI = "http://13.124.195.1**:9000/gw/v1";

    // IBM watson conversation API
    public static final String ENDPOINT = "https://gateway.watsonplatform.net/conversation/api";
    public static final String USERNAME = "448c149b-849c-4525-901f-efa73421****";
    public static final String PASSWORD = "Ov46ffwJ****";
    public static final String WORKSPACE_ID = "068cc140-51b8-4d0d-9e4b-ac06439a****";
    public static final String CONTEXT = "context";
    // Intent Action name
    public static final String ACTION_LOAD = "load";
    public static final String ACTION_TURN_ON = "turn_on";
    public static final String ACTION_TURN_OFF = "turn_off";
    public static final String ACTION_SET = "set";
    public static final String ACTION_ADJUST = "adjust";


    // AWS DynamoDB
    public static final String TABLE_NAME = "watson";
    public static final String KEY_NAME = "id";
    public static final String PROFILE = "ma*";

}
