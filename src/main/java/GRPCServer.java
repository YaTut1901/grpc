import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {
    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080).addService(new LinkTimeoutService(
                new LinkTimeoutObserver())).build();
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Server is on the run");

        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
