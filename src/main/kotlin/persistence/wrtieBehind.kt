package persistence

import entity.Member
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    var memberA = Member()
    memberA.id = 1L
    memberA.name = "helloA"
    em.persist(memberA)

    var memberB = Member()
    memberB.id = 2L
    memberB.name = "helloB"
    em.persist(memberB)

    tx.commit()

    em.close();
    emf.close();
}