package entity

import javax.persistence.*

@Entity
class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    var id: Long? = null

    @Column(name = "ORDER_ID")
    var orderId: Long? = null

    @Column(name = "ITEM_ID")
    var itemId: Long? = null

    var orderPrice: Int? = null

    var count: Int? = null
}