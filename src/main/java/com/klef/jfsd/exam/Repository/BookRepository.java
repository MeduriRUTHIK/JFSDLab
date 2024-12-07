package com.klef.jfsd.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.exam.Entity.Book;

public interface BookRepository extends JpaRepository<Book ,Long>
{

}
