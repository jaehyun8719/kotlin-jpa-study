import entity.Address
import entity.Member
import entity.Period
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        val address = Address("city", "street", "1000")
        val period = Period()

        val member = Member(
            username = "hello",
            homeAddress = address,
            workPeriod = period,
        )

        em.persist(member)

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}