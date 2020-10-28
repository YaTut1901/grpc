import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkTimeoutObserver {
    private static final Logger logger = Logger.getLogger(GRPCServer.class);

    public List<String> getTimeout(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            logger.info("Bad url string", e);
        }
        Long start = System.nanoTime();
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            logger.info("Can't open a connection", e);
        }
        try {
            con.setRequestMethod("GET");
        } catch (ProtocolException e) {
            logger.info("Wrong request method", e);
        }
        int status = 0;
        try {
            status = con.getResponseCode();
        } catch (IOException e) {
            logger.info("Can't connect to the server", e);
        }
        Long elapsedTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - start);
        con.disconnect();
        List<String> res = new ArrayList<>();
        res.add(Integer.toString(status));
        res.add(Long.toString(elapsedTime));
        logger.info("Returning value...");
        return res;
    }
}
