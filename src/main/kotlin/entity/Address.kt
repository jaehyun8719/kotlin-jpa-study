package entity

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Address(
    @Column
    var city: String? = null,

    @Column
    var street: String? = null,

    @Column
    var zipcode: String? = null,
) {
}