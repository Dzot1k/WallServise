open class VideoAttachment : Attachments {
    override val type: String
        get() {
            return "Video"
        }
}

class Video(val id: Int) : VideoAttachment() {

}