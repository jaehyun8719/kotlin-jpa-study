package entity

import javax.persistence.*

@Entity
class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    @Column(name = "USERNAME")
    var username: String? = null

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    var team: Team? = null

    fun changeTeam(team: Team) {
        this.team = team;
        team.members.add(this)
    }
}