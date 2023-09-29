package io.github.darkaster72.mssc_beer_service.web.mapper;

import org.mapstruct.Mapper;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Mapper
public interface DateMapper {
    default OffsetDateTime map(Timestamp ts) {
        if (ts != null) {
            return OffsetDateTime.of(ts.toLocalDateTime().getYear(), ts.toLocalDateTime().getMonthValue(),
                    ts.toLocalDateTime().getDayOfMonth(), ts.toLocalDateTime().getHour(), ts.toLocalDateTime().getMinute(),
                    ts.toLocalDateTime().getSecond(), ts.toLocalDateTime().getNano(), ZoneOffset.UTC);
        } else {
            return null;
        }
    }

    default Timestamp map(OffsetDateTime offsetDateTime) {
        if (offsetDateTime != null) {
            return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        } else {
            return null;
        }
    }
}