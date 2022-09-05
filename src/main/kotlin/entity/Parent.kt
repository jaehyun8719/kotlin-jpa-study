package entity

import javax.persistence.*

@Entity
class Parent(
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null,

    var name: String? = null,
) {
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    var childList: MutableList<Child>? = mutableListOf()

    fun addChild(child: Child) {
        childList?.add(child)
        child.parent = this
    }
}