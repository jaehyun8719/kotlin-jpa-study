import entity.Member
import entity.Team
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        val team = Team(
            name = "team1"
        )
        em.persist(team)

        val member = Member(
            username = "member1",
        )
        member.team = team
        em.persist(member)

        em.flush()
        em.clear()

        val findMember = em.find(Member::class.java, member.id)
        println("findMember = ${findMember.team!!.javaClass}")

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}