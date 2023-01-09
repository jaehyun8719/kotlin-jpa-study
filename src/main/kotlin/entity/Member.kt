package entity

import javax.persistence.*

@Entity
class Member (
    @Id
    @GeneratedValue
    var id: Long? = null,

    @Column
    var username: String? = null,

    // 기간 Period
    @Embedded
    var workPeriod: Period? = null,

    // 주소 address
    @Embedded
    var homeAddress: Address? = null,
) {
}