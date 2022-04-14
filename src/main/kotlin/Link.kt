data class LinkAttachment(override val type: String = "link", val link: Link) : Attachments {}

data class Link(val id: Int, val linkUrl: Int) {}