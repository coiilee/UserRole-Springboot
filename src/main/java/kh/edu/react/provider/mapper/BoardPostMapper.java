package kh.edu.react.provider.mapper;

import kh.edu.react.provider.dto.BoardPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardPostMapper {
    List<BoardPost> getAllPosts();
    BoardPost getPostById(int postId);
    List<BoardPost> searchPosts(String keyword);
    void insertPost(BoardPost boardPost);
    void updatePost(BoardPost boardPost);
    void deletePost(int postId);
}
