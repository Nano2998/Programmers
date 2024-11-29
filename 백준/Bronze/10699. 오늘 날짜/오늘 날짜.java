import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // 서울 시간대 설정
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");

        // 오늘 날짜 가져오기
        LocalDate today = LocalDate.now(seoulZone);

        // 출력
        System.out.println(today);
    }
}