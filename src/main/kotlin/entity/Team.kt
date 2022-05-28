package entity

import javax.persistence.*

@Entity
class Team {
    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    var id: Long? = null

    @Column(name = "NAME")
    var name: String? = null

    @OneToMany(mappedBy = "team")
    var members: MutableList<Member> = arrayListOf()
}