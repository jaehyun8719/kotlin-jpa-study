package entity

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    val createdAt: LocalDateTime = LocalDateTime.now()

    var updatedAt: LocalDateTime? = null

    var deletedAt: LocalDateTime? = null
}