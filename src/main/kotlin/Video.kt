data class VideoAttachment(override val type: String = "video", val video: Video) : Attachments {}

data class Video(val id: Int, val videoUrl: Int) {}