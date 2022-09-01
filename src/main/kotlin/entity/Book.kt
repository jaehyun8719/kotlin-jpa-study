package entity

import javax.persistence.Entity

@Entity
class Book(
    var author: String? = null,

    var isbn: String? = null,
) : Item() {
}