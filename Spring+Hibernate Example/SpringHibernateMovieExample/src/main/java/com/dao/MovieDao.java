package com.dao;

import com.bean.Movie;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MovieDao {
    private HibernateTemplate ht;

    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public int insertMovie(Movie m) {
        return (int) ht.save(m);
    }

    public int UpdateCollection(String n,float col){
        return ht.bulkUpdate("Update Movie SET collection="+col+" where name='"+n+"'");

    }
    public int deleteMovie(String n){
        return ht.bulkUpdate("delete from Movie where name='"+n+"'");

    }
    public List<Movie> fetchAllMovies(){
        return ht.loadAll(Movie.class);
    }
}
