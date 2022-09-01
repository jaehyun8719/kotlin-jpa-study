package entity

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Item(
    @Id
    @GeneratedValue
    var id: Long? = null,

    var name: String? = null,

    var price: Int? = null,
) {
}