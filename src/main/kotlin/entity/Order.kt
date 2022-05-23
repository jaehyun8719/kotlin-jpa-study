package entity

import enums.OrderStatus
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "ORDERS")
class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    var id: Long? = null

    @Column(name = "MEMBER_ID")
    var memberId: Long? = null

    var orderDate: LocalDateTime? = LocalDateTime.now()

    @Enumerated(EnumType.STRING)
    var status: OrderStatus? = null
}