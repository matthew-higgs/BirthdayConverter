import java.time.*;

public class converter {

    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2007, 2, 22, 12, 31);
        System.out.println(birthday);
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, zone);

        ZoneId paris = ZoneId.of("Europe/Paris");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(paris);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);

    }

}
