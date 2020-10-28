import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.log4j.Logger;
import java.io.IOException;

public class GRPCServer {
    private static final Logger logger = Logger.getLogger(GRPCServer.class);

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080).addService(new LinkTimeoutService(
                new LinkTimeoutObserver())).build();
        logger.info("Server created");
        try {
            server.start();
        } catch (IOException e) {
            logger.info("Server has broken down");
        }

        logger.info("Server is on the run");

        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            logger.info("Thread has been interrupted");
        }
    }
}
