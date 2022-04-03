fun main() {
    WallService.add(
        Post(
            id = 3,
            ownerId = 15,
            fromId = 15,
            createdBy = 15,
            date = 31032022,
            text = "postText",
            replyOwnerId = 16,
            replyPostId = 13,
            friendsOnly = true,
            comments = "CommentsObject",
            copyright = "CopyrightObject",
            likes = "LikesObject",
            reposts = "RepostsObject",
            views = "ViewsObject",
            postType = "Post",
            signerId = 15,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = "DonutObject",
            postponedId = 1
        )
    )

    WallService.createComment(
        Comment(
            id = 1,
            fromId = 16,
            postId = 1,
            date = "03042022",
            text = "CommentText"
        )
    )
}