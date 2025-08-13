package lab_06_String;

public class lab_63 {

    public static void main(String[] args) {
        String url = "https://google.com";
        String[] output = url.split(":|//|\\.");
        String http = output[0];
        String domain = output[output.length-1];

        System.out.println("http: "+ http);
        System.out.println("domain: " + domain);
    }
}
