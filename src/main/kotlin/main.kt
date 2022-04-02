sealed class Attachment(val type: String) {}

data class VideoAttachment(val video: Video) : Attachment("video")
data class AudioAttachment(val audio: Audio) : Attachment("audio")
data class PhotoAttachment(val photo: Photo) : Attachment("photo")
data class DocAttachment(val doc: Doc) : Attachment("doc")
data class LinkAttachment(val link: Link) : Attachment("link")


class Video(val id: Int)
class Audio(val id: Int)
class Photo(val id: Int)
class Doc(val id: Int)
class Link(val id: Int)

fun main() {

}