data class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachments {}

data class Photo(val id: Int, val photoUrl: Int) {}