package vangencloud.vangenservice.service;

import java.util.List;

public interface BaseMapper<T> {
    T queryObject(Integer id);

    List<T> queryList(T t);

    int queryTotal();

    void save(T t);

    void update(T t);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);


}