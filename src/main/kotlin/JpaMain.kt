import entity.Member
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        var memberA = Member()
        memberA.id = 1L
        memberA.name = "helloA"

        em.persist(memberA)

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}