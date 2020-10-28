
import com.yrrhelp.grpc.Link;
import com.yrrhelp.grpc.linkGrpc;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class LinkTimeoutService extends linkGrpc.linkImplBase {
    private final LinkTimeoutObserver timeoutService;

    public LinkTimeoutService(LinkTimeoutObserver timeoutService) {
        this.timeoutService = timeoutService;
    }

    @Override
    public void timeout(Link.LinkRequest request, StreamObserver<Link.APIResponse> responseObserver) {
        List<String> responseData = timeoutService.getTimeout(request.getURL());
        Link.APIResponse.Builder response = Link.APIResponse.newBuilder();
        response.setCode(responseData.get(0));
        response.setTimeout(responseData.get(1));
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
