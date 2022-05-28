import entity.Member
import entity.Team
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        // 저장
        var team = Team()
        team.name = "TeamA"
        em.persist(team)

        var member = Member()
        member.username = "member1"
        member.changeTeam(team)
        em.persist(member)

        em.flush()
        em.clear()

        val findMember = em.find(Member::class.java, member.id)
        val members = findMember.team?.members

        members?.forEach {
            println("member = " + it.toString())
        }

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}