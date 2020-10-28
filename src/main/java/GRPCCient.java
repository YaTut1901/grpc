import com.yrrhelp.grpc.Link;
import com.yrrhelp.grpc.linkGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCCient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

        linkGrpc.linkBlockingStub userStub = linkGrpc.newBlockingStub(channel);

        Link.LinkRequest loginrequest = Link.LinkRequest.newBuilder().setURL("https://www.google.com").build();

        Link.APIResponse response = userStub.timeout(loginrequest);

    }
}
