import com.yrrhelp.grpc.Link;
import com.yrrhelp.grpc.linkGrpc;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

@RunWith(JUnit4.class)
public class Test {
    public static final String GOOGLE_URL = "https://www.google.com";
    public static final String GITHUB_URL = "https://github.com";
    public static final String STACK_URL = "https://stackoverflow.com";
    public static final String YOUTUBE_URL = "https://www.youtube.com";
    public static final String BAELDUNG_URL = "https://baeldung.com";
    public static final String ROZETKA_URL = "https://rozetka.com.ua";
    public static final String BIGL_URL = "https://bigl.ua";
    public static final String ALIEXPRESS_URL = "https://best.aliexpress.ru";
    public static final String GMAIL_URL = "https://mail.google.com";
    public static final String RP5_URL = "https://rp5.ua";
    public static final String DJINNI_URL = "https://djinni.co";
    public static final String LOSTFILM_URL = "https://www.lostfilm.tv";
    public static final String SINOPTIK_URL = "https://sinoptik.ua";
    public static final String METEO_URL = "https://meteo.ua";
    public static final String METEOPROG_URL = "https://www.meteoprog.ua";
    public static final String PROM_URL = "https://prom.ua";
    public static final String UNIAN_URL = "https://www.unian.net";
    public static final String UKRPOSHTA_URL = "https://www.ukrposhta.ua";
    public static final String REZKA_URL = "https://rezka.ag";
    public static final String MVN_URL = "https://mvnrepository.com";

    private linkGrpc.linkBlockingStub blockingStub;
    private String serverName;

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    @Before
    public void before() throws IOException {
        serverName = InProcessServerBuilder.generateName();
        blockingStub = linkGrpc.newBlockingStub(
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName)
                .directExecutor()
                .addService(new LinkTimeoutService(new LinkTimeoutObserver()))
                .build().start());
    }

    @org.junit.Test
    public void googleURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(GOOGLE_URL).build());

        System.out.println("googleURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void gitHubURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(GITHUB_URL).build());

        System.out.println("gitHubURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void stackURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(STACK_URL).build());

        System.out.println("stackURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void youtubeURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(YOUTUBE_URL).build());

        System.out.println("youtubeURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void baeldungURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(BAELDUNG_URL).build());

        System.out.println("googleURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void rozetkaURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(ROZETKA_URL).build());

        System.out.println("baeldungURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void biglURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(BIGL_URL).build());

        System.out.println("biglURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void aliExpressURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(ALIEXPRESS_URL).build());

        System.out.println("aliExpressURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void gmailURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(GMAIL_URL).build());

        System.out.println("gmailURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void rp5URLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(RP5_URL).build());

        System.out.println("rp5URLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void djinniURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(DJINNI_URL).build());

        System.out.println("googleURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void lostfilmURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(LOSTFILM_URL).build());

        System.out.println("lostfilmURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void sinoptikURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(SINOPTIK_URL).build());

        System.out.println("sinoptikURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void meteoURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(METEO_URL).build());

        System.out.println("meteoURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void meteoprogURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(METEOPROG_URL).build());

        System.out.println("meteoprogURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void promURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(PROM_URL).build());

        System.out.println("promURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void unianURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(UNIAN_URL).build());

        System.out.println("unianURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void ukrposhtaURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(UKRPOSHTA_URL).build());

        System.out.println("ukrposhtaURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void rezkaURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(REZKA_URL).build());

        System.out.println("rezkaURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }

    @org.junit.Test
    public void mvnURLTest() {
        Link.APIResponse reply =
                blockingStub.timeout(Link.LinkRequest.newBuilder().setURL(MVN_URL).build());

        System.out.println("mvnURLTest results: " + "\n"
                + "code: " + reply.getCode() + "\n"
                + "timeout: " + reply.getTimeout() + "s");
    }
}
