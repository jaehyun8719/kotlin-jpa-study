import entity.Child
import entity.Parent
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        var child1 = Child()
        var child2 = Child()

        var parent = Parent()
        parent.addChild(child1)
        parent.addChild(child2)

        em.persist(parent)

        em.flush()
        em.clear()

        val findParent = em.find(Parent::class.java, parent.id)
        findParent.childList?.removeFirst()

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}