
import java.util.HashMap;
import java.util.Map;

public class DefaultValues {
    public static final String SCHEDULE_URL = "https://my.sa.ucsb.edu/public/curriculum/coursesearch.aspx";
    public static Map<String, String> HEADERS = new HashMap<>();
    static {
        HEADERS.put("Origin", "https://my.sa.ucsb.edu");
        HEADERS.put("Upgrade-Insecure-Requests", "1");
        HEADERS.put("Content-Type", "application/x-www-form-urlencoded");
        HEADERS.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.87 Safari/537.36");
        HEADERS.put("Sec-Fetch-User", "?1");
        HEADERS.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
        HEADERS.put("Cache-Control", "no-cache");
        HEADERS.put("Host", "my.sa.ucsb.edu");
        HEADERS.put("Accept-Encoding", "gzip, deflate");
        HEADERS.put("Cookie", "ASP.NET_SessionId=ecvvqirmjrn4w5mk2ifhoa5a; ARRAffinity_my.sa.ucsb.edu_public=808a8a15a4d8ae50e1724b76589ebdbad90cf5166124de5fa0c1c500e95f66fe");
        HEADERS.put("Connection", "keep-alive");
    }

    public static Map<String, String> X_FORM_ENCODED = new HashMap<>();
    static {
        X_FORM_ENCODED.put("__EVENTVALIDATION", "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");
        X_FORM_ENCODED.put("__VIEWSTATE", "/wEPDwUKMTE5NDUyMzA1NGQYAQUeX19Db250cm9sc1JlcXVpcmVQb3N0QmFja0tleV9fFgEFHmN0bDAwJHBhZ2VDb250ZW50JHNlYXJjaEJ1dHRvbu7L6w3KcsJCUnrPutucCkLVeI1TnI6GvsLPcjuTte6y");
        X_FORM_ENCODED.put("__VIEWSTATEGENERATOR", "0D1CB3EA");
        X_FORM_ENCODED.put("ctl00$pageContent$courseList", "CMPSC");
        X_FORM_ENCODED.put("ctl00$pageContent$dropDownCourseLevels", "Undergraduate");
        X_FORM_ENCODED.put("ctl00$pageContent$quarterList", "20194");
        X_FORM_ENCODED.put("ctl00$pageContent$searchButton.x", "39");
        X_FORM_ENCODED.put("ctl00$pageContent$searchButton.y", "6");
    }
}
