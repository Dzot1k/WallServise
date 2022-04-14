import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {


    @Test
    fun add() {
        val resultPost = WallService.add(
            Post(
                id = 0,
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(1, 3)),
                    VideoAttachment(video = Video(3, 4)),
                    DocAttachment(doc = Doc(7, 1)),
                    LinkAttachment(link = Link(15, 6)),
                    PhotoAttachment(photo = Photo(6, 7))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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
        val expectedResult = resultPost.id

        val actualResult = 0

        assertNotEquals(expectedResult, actualResult)
    }

    @Test
    fun updateFalse() {
        WallService.add(
            Post(
                id = 1,
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(1, 3)),
                    VideoAttachment(video = Video(3, 4)),
                    DocAttachment(doc = Doc(7, 1)),
                    LinkAttachment(link = Link(15, 6)),
                    PhotoAttachment(photo = Photo(6, 7))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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

        WallService.add(
            Post(
                id = 2,
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(11, 13)),
                    VideoAttachment(video = Video(13, 14)),
                    DocAttachment(doc = Doc(17, 11)),
                    LinkAttachment(link = Link(115, 16)),
                    PhotoAttachment(photo = Photo(16, 17))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(13, 3)),
                    VideoAttachment(video = Video(31, 4)),
                    DocAttachment(doc = Doc(7, 15)),
                    LinkAttachment(link = Link(1, 6)),
                    PhotoAttachment(photo = Photo(61, 7))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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

        val update = Post(
            id = 6,
            ownerId = 15,
            fromId = 15,
            createdBy = 15,
            date = 31032022,
            text = "postChangingText",
            replyOwnerId = 16,
            replyPostId = 13,
            friendsOnly = true,
            comments = "CommentsObject",
            copyright = "CopyrightObject",
            likes = "LikesObject",
            reposts = "RepostsObject",
            views = "ViewsObject",
            postType = "Post",
            postSource = "PostSourceObject",
            attachments = arrayOf(
                AudioAttachment(audio = Audio(1, 3)),
                VideoAttachment(video = Video(3, 4)),
                DocAttachment(doc = Doc(7, 1)),
                LinkAttachment(link = Link(15, 6)),
                PhotoAttachment(photo = Photo(6, 7))
            ),
            geo = "GeoObject",
            signerId = 15,
            copyHistory = "CopyHistoryObject",
            canPin = false,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = false,
            donut = "DonutObject",
            postponedId = 1
        )

        val result = WallService.update(update)

        assertFalse(result)

    }


    @Test
    fun updateTrue() {

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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(1, 3)),
                    VideoAttachment(video = Video(3, 4)),
                    DocAttachment(doc = Doc(7, 1)),
                    LinkAttachment(link = Link(15, 6)),
                    PhotoAttachment(photo = Photo(6, 7))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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

        WallService.add(
            Post(
                id = 4,
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(11, 13)),
                    VideoAttachment(video = Video(13, 14)),
                    DocAttachment(doc = Doc(17, 11)),
                    LinkAttachment(link = Link(115, 16)),
                    PhotoAttachment(photo = Photo(16, 17))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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

        WallService.add(
            Post(
                id = 5,
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
                postSource = "PostSourceObject",
                attachments = arrayOf(
                    AudioAttachment(audio = Audio(13, 3)),
                    VideoAttachment(video = Video(31, 4)),
                    DocAttachment(doc = Doc(7, 15)),
                    LinkAttachment(link = Link(1, 6)),
                    PhotoAttachment(photo = Photo(61, 7))
                ),
                geo = "GeoObject",
                signerId = 15,
                copyHistory = "CopyHistoryObject",
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

        val update = Post(
            id = 2,
            ownerId = 15,
            fromId = 15,
            createdBy = 15,
            date = 31032022,
            text = "postChangingText",
            replyOwnerId = 16,
            replyPostId = 13,
            friendsOnly = true,
            comments = "CommentsObject",
            copyright = "CopyrightObject",
            likes = "LikesObject",
            reposts = "RepostsObject",
            views = "ViewsObject",
            postType = "Post",
            postSource = "PostSourceObject",
            attachments = arrayOf(
                AudioAttachment(audio = Audio(11, 32)),
                VideoAttachment(video = Video(1, 4)),
                DocAttachment(doc = Doc(8, 19)),
                LinkAttachment(link = Link(5, 6)),
                PhotoAttachment(photo = Photo(6, 71))
            ),
            geo = "GeoObject",
            signerId = 15,
            copyHistory = "CopyHistoryObject",
            canPin = false,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = false,
            donut = "DonutObject",
            postponedId = 1
        )

        val result = WallService.update(update)

        assertTrue(result)
    }

}