data class DocAttachment(override val type: String = "doc", val doc: Doc) : Attachments {}

data class Doc(val id: Int, val docUrl: Int) {}