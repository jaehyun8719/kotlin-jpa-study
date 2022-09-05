package entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Child(
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null,

    var name: String? = null,
) {
    @ManyToOne
    @JoinColumn(name = "parent_id")
    var parent: Parent? = null
}