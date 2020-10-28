import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkTimeoutObserver {

    public List<String> getTimeout(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Bad url string", e);
        }
        Long start = System.nanoTime();
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            throw new RuntimeException("Can't open a connection", e);
        }
        try {
            con.setRequestMethod("GET");
        } catch (ProtocolException e) {
            throw new RuntimeException("Wrong request method", e);
        }
        int status = 0;
        try {
            status = con.getResponseCode();
        } catch (IOException e) {
            throw new RuntimeException("Can't connect to the server", e);
        }
        Long elapsedTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - start);
        con.disconnect();
        List<String> res = new ArrayList<>();
        res.add(Integer.toString(status));
        res.add(Long.toString(elapsedTime));
        return res;
    }
}
