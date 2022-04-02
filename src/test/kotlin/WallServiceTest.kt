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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
            attachment = arrayOf(
                AudioAttachment(Audio(12)), VideoAttachment(Video(21)),
                PhotoAttachment(Photo(56)), DocAttachment(Doc(94)), LinkAttachment(Link(1))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
                attachment = arrayOf(
                    AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                    PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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
            attachment = arrayOf(
                AudioAttachment(Audio(1)), VideoAttachment(Video(2)),
                PhotoAttachment(Photo(5)), DocAttachment(Doc(9)), LinkAttachment(Link(19))
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