package com.myproject.repositories;

import com.myproject.models.HelloWorldModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Samarth on 9/14/16.
 */

@Qualifier("helloWorldRepository")
public interface HelloWorldRepository extends JpaRepository<HelloWorldModel,Long> {
    List<HelloWorldModel> findById(Long id);
}
