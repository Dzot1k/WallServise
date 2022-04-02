open class PhotoAttachment : Attachments {
    override val type: String
        get() {
            return "Photo"
        }


}

class Photo(val id: Int) : PhotoAttachment() {

}