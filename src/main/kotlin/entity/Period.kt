package entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Period(
    @Column
    var startDate: LocalDateTime? = null,

    @Column
    var endDate: LocalDateTime? = null,
) {
}