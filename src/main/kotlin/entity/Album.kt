package entity

import javax.persistence.Entity

@Entity
class Album (
    var artist: String? = null,
) : Item() {
}