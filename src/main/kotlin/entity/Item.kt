package entity

import javax.persistence.*

@Entity
class Item {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    var id: Long? = null

    var name: String? = null

    var price: Int? = null

    var stockQuantity: Int? = null
}