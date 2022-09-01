import entity.Movie
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()
    val tx = em.transaction

    tx.begin()

    try {
        val movie = Movie("a", "bbb")
        movie.name = "바람과함꼐 사라지다"
        movie.price = 10000

        em.persist(movie)

        em.flush()
        em.clear()

        val findMovie = em.find(Movie::class.java, movie.id)
        println("findMove = $findMovie")

        tx.commit()
    } catch (e: Exception) {
        tx.rollback()
    } finally {
        em.close();
        emf.close();
    }
}