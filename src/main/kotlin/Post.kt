data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: String,
    val copyright: String,
    val likes: String?,
    val reposts: String?,
    val views: String,
    val postType: String,
    val postSource: String,
    val attachments: Array<Attachments>,
    val geo: String,
    val signerId: Int,
    val copyHistory: String,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: String,
    val postponedId: Int
) {

}

object WallService {
    private var posts = emptyArray<Post>()
    private var postsId = emptyArray<Int>()

    fun add(post: Post): Post {
        postsId += post.id
        posts += post.copy(id = postsId.size)
        return posts.last()

    }

    fun update(post: Post): Boolean {
        for ((index, postSortOut) in posts.withIndex()) {
            if (postSortOut.id == post.id) {
                posts[index] = postSortOut.copy(
                    id = post.id,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    attachments = post.attachments,
                    postSource = post.postSource,
                    geo = post.geo,
                    signerId = post.signerId,
                    copyHistory = post.copyHistory,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                return true
            }
        }
        return false
    }
}
