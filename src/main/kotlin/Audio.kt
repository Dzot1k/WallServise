data class AudioAttachment(override val type: String = "audio", val audio: Audio) : Attachments {}

class Audio(val id: Int, val audioUrl: Int) {}



