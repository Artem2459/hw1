//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class hw30 {
//    public static void main(String[] args) {
//        try {
//            String apiUrl = "https://api.example.com/data";
//            URL url = new URL(apiUrl);
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int responseCode = con.getResponseCode();
//            System.out.println("Response Code: " + responseCode);
//
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuilder content = new StringBuilder();
//            while ((inputLine = in.readLine()) != null) {
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//
//            System.out.println("Response Content: " + content.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
