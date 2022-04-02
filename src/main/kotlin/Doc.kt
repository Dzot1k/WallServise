open class DocAttachment : Attachments {
    override val type: String
        get() {
            return "Doc"
        }
}

class Doc(val id: Int) : DocAttachment() {

}