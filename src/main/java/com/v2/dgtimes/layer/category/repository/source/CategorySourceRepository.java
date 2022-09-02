package com.v2.dgtimes.layer.category.repository.source;

import com.v2.dgtimes.layer.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
설명 : 카테고리 Main Repositoiry입니다

작성일 : 2022.09.02

마지막 수정한 사람 : 안상록

*/
@Repository
public interface CategorySourceRepository extends JpaRepository<Category, Long> {
}
