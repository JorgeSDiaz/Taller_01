package org.myorg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection {
    private static final String USER_AGENT = "Mozilla/5.0";
    private final String url, api_key;

    public HttpConnection(String url, String api_key) {
        this.url = url; this.api_key = api_key;
    }

    public HttpConnection(String url) {
        this(url, "");
    }


    public String getData(String query) throws IOException {
        URL queryUrl = new URL(api_key.equals("") ? url + query : url + query + "&" + api_key);
        HttpURLConnection queryConnection = (HttpURLConnection) queryUrl.openConnection();

        // Set-Up
        queryConnection.setRequestMethod("GET");
        queryConnection.setRequestProperty("User-Agent", USER_AGENT);

        // Response Code - Expected: 200 OK
        int responseCode = queryConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader input = new BufferedReader(new InputStreamReader(queryConnection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = input.readLine()) != null) { response.append(inputLine); }

            input.close();

            return response.toString();
        } else {
            System.out.println("Request not worked");
        }
        
        return null;
    }

    public String getUrl() {
        return this.url;
    }

    public String getApi_key() {
        return this.api_key;
    }
}
