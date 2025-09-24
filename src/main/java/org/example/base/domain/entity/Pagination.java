package org.example.base.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {

    private int pageNo;

    private int pageSize;

    private String sortBy;

    private String sortType;

    private long total;

}
