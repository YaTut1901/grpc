
import com.yrrhelp.grpc.Link;
import com.yrrhelp.grpc.linkGrpc;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Logger;

import java.util.List;

public class LinkTimeoutService extends linkGrpc.linkImplBase {
    private static final Logger logger = Logger.getLogger(GRPCServer.class);
    private final LinkTimeoutObserver timeoutService;

    public LinkTimeoutService(LinkTimeoutObserver timeoutService) {
        this.timeoutService = timeoutService;
    }

    @Override
    public void timeout(Link.LinkRequest request, StreamObserver<Link.APIResponse> responseObserver) {
        List<String> responseData = timeoutService.getTimeout(request.getURL());
        Link.APIResponse.Builder response = Link.APIResponse.newBuilder();
        logger.info("Response has been built");
        response.setCode(responseData.get(0));
        response.setTimeout(responseData.get(1));
        responseObserver.onNext(response.build());
        logger.info("Observing...");
        responseObserver.onCompleted();
        logger.info("Response has been thrown");
    }
}
