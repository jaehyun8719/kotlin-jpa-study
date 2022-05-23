package entity

import javax.persistence.*

@Entity
class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    var name: String? = null

    var city: String? = null

    var street: String? = null

    var zipcode: String? = null
}