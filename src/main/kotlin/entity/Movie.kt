package entity

import javax.persistence.Entity

@Entity
class Movie(
    var director: String? = null,

    var actor: String? = null,
) : Item() {
}