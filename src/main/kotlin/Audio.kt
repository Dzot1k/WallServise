open class AudioAttachment : Attachments {
    override val type: String
        get() = "Audio"

}

class Audio(val id: Int) : AudioAttachment() {

}