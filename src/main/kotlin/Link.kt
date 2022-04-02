open class LinkAttachment : Attachments {
    override val type: String
        get() {
            return "Link"
        }

}

class Link(val id: Int) : LinkAttachment() {

}