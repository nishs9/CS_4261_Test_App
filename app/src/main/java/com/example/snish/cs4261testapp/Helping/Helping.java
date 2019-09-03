package com.example.snish.cs4261testapp.Helping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Helping {
    static String stream = null;

    public Helping() {

    }

    public String getHTTPData(String webURL) {
        try {
            URL url = new URL(webURL);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            if(connection.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()
                ));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                stream = sb.toString();
                connection.disconnect();
            }
        } catch (MalformedURLException exc) {
            exc.printStackTrace();
        } catch (IOException exc){
            exc.printStackTrace();
        }
        return stream;
    }
}
