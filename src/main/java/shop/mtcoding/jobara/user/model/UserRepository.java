package shop.mtcoding.jobara.user.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    public List<User> findAll();

    public User findById(int id);

    public User findByUsername(String username);

    public User findByUsernameAndPassword(User user);

    public int insert(User user);

    public int updateById(User user);

    public int updateResumeById(User user);

    public int deleteById(int id);
}